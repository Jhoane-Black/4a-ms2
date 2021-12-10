<template>


    <header class="h-container">
        <nav>
            <a href="/" class="nav__logo">
                <i class="ri-leaf-line nav__logo-icon"></i> Leaf
            </a>
            <div class="nav__item index">
                <a href="#index" class="nav__link">Home</a>
            </div>
        </nav>
        
    </header>
    <!-- START SECTION PRODUCTS -->
    <section class="store">
        <div class="container">
            <div class="items">

                <div class="row">

                    <div class="col-12 col-md-6">

                        <ol class="lista_productos">
                            <li v-for="proveedor in proveedores" v-bind:key="proveedor.id">
                                <span class="click" v-on:click="getProductosByProveedor(proveedor.id)">{{proveedor.nombre}}</span>
                            </li>
                        </ol>
                        
                    </div>

                </div>

                <div class="title">
                    <h1>PRODUCTOS</h1>
                </div>

                <div>

                        <table class="table">
                            <thead>
                                <tr>
                                    <th scope="col">Producto</th>
                                    <th scope="col">Precio</th>
                                    <th scope="col">Stock</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr v-for="producto in productos" v-bind:key="producto.id">
                                    <td class="click" v-on:click="getOneProduct(producto)">{{producto.nombre}}</td>
                                    <td><span class="money">$ {{formatPrice(producto.precio)}}</span></td>
                                    <td>
                                        <span>{{producto.stock}}</span>
                                    
                                    </td>
                                </tr>
                            </tbody>
                        </table>

                    <div>
                            <button type="button" class="btn btn-success">Success</button>
                        </div>

                        <div v-if="product_selected" class="item shadow mb-4">

                            <h3 class="item-title">{{product.nombre}}</h3>

                            <form v-on:submit.prevent="processEditProduct">

                                <div>
                                    <p>Nombre del Producto</p>
                                    <input v-model="product.nombre" type="text" placeholder="Nombre del Producto"> 
                                </div>
                                <div>
                                    <p>Precio</p>
                                    <input v-model="product.precio" type="text" placeholder="Precio">
                                </div>
                                
                                <div>
                                    <p>Stock</p>
                                    <input v-model="product.stock" type="text" placeholder="Stock">
                                </div>

                                <button v-bind:class="{'disabled': is_loading}" type="button" class="btn btn-primary">
                                    <span v-if="!is_loading">Actualizar</span>
                                    <div v-if="is_loading" class="spinner-border text-light" role="status"></div>
                                </button>

                            </form>

                            <div class="item-details">

                                <button type="button" class="btn btn-danger">Eliminar</button>

                            </div>
                            
                        </div>
                        
                    </div>

                </div>
            
            </div>

    </section>
    <!-- END SECTION PRODUCTS -->

</template>



<style scoped>

*{
    box-sizing: border-box;
    margin: 0;
    padding: 0;
}
.h-container{
    position: relative;
    width:100vw;
    height:100px;
    background: #3e6553;
}
.nav__logo{
    display: inline;
    margin:10px;
}
.nav__item{
    display: inline;
    margin:10px;
}
.lista_productos{
    background: purple;
}
.store{
    background: gray;
    height: 100vh;
}



.container{

    background: #3e6553;
    margin-left: 10vw;
    margin-right: 10vw;

}
.app{
    width:100%;
    height:100%;
    background: blue;
}

.click{
    cursor: pointer;
}



</style>


<script>
import gql from "graphql-tag";

export default {
    name: "Productos", // Nombre del componente

    data: function() {
      return { 
          is_loading: false,
          product_selected: false,
          product_edit: false,
          productos:{},
          proveedores:{},
          product:{
            id: 0,
            nombre: "",
            precio: 0,
            stock: 0,
            proveedor: 0,
          },
          supplier:{
            id: 0,
            nombre: "",
            direccion: "",
            nit: "",
          },
       }
    }, // Todas las variables de este componentes

    methods: { 

        misProveedores: async function (){
            this.is_loading = true;
            await this.$apollo.query({
                query: gql`
                    query MisProveedores {
                        MisProveedores {
                            id
                            nombre
                            direccion
                            nit
                            user
                        }
                    }
                `,
            })
            .then((result) => {
                console.log("FUNCIONÓOOO")
                this.is_loading = false;
                this.proveedores = result.data.MisProveedores;
                console.log(this.proveedores)
            })
            .catch((error)=>{
                this.show_error = true;
                console.log("DIO ERROR :c")
                console.log(error)
                this.is_loading = false;
            })
        },

        
        misProductos: async function (id_proveedor){
            this.is_loading = true;
            await this.$apollo.query({
                query: gql`
                    query ProductosByproveedor($idProveedor: Int!) {
                        productosByproveedor(id_proveedor: $idProveedor) {
                            id
                            nombre
                            precio
                            stock
                            proveedor
                        }
                    }
                `,
                variables: {
                    idProveedor: id_proveedor
                },
            })
            .then((result) => {
                console.log("FUNCIONÓOOO")
                this.productos = result.data.productosByproveedor;
                this.is_loading = false;
            })
            .catch((error)=>{
                this.show_error = true;
                console.log("DIO ERROR :c")
                console.log(error)
                this.is_loading = false;
            })
        },

        getProductos: async function (){
            this.is_loading = true;
            await this.$apollo.query({
                query: gql`
                    query GetProductos {
                        getProductos {
                            id
                            nombre
                            precio
                            stock
                            proveedor
                        }      
                    }
                `,
            })
            .then((result) => {
                console.log("FUNCIONÓOOO")
                this.is_loading = false;
                this.productos = result.data.getProductos;
            })
            .catch((error)=>{
                this.show_error = true;
                console.log("DIO ERROR :c")
                console.log(error)
                this.is_loading = false;
            })
        },

        processEditProduct: async function(){
            this.is_loading = true;
            this.product.id = +this.product.id;
            this.product.precio = +this.product.precio;
            this.product.stock = +this.product.stock;
            this.product.proveedor = +this.product.proveedor;
            await this.$apollo.mutate({
                mutation: gql`
                mutation UpdateProducto($productoData: ProductoUpdate!) {
                    updateProducto(productoData: $productoData) {
                        id
                        nombre
                        precio
                        stock
                        proveedor
                    }
                }`,
                variables: {
                    productoData: this.product
                },
            })
            .then((result)=>{
                console.log("FUNCIONÓOOO Edit")
                console.log(result)
                this.getProductos();
                this.is_loading = false;
            })
            .catch((error)=>{
                console.log("DIO ERROR :c")
                console.log(error)
                this.is_loading = false;
            })
            
        },

        getOneProduct(producto){
            this.product_selected = true;
            this.product.id = producto.id;
            this.product.nombre = producto.nombre;
            this.product.precio = producto.precio;
            this.product.stock = producto.stock;
            this.product.proveedor = producto.proveedor;
            //console.log(this.product);
        },

        getProductosByProveedor(id_proveedor){
            this.misProductos(id_proveedor);
        },

        formatPrice(value) {
            let val = (value / 1).toFixed(0).replace(".", ",");
            return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
        },

        showEditProduct(){
            this.product_edit = true;
        }

    }, // Todas las funciones que usa este componente

    created: function () {
        this.misProveedores();
        //this.getProductos();
    } // Eventos: lo que pasa cuando el componente se inicia
};
</script>