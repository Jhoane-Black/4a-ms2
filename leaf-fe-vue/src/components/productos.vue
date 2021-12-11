<template>


    <header class="h-container">
        <nav class="nav container">

            <a href="/" class="nav__logo">
                <i class="ri-leaf-line nav__logo-icon"></i> Leaf
            </a>
            <div class="nav">
                <h4>Administrador de productos</h4>
            </div>
            <div class="nav__item">
                <a href="#index" class="nav__link">Home</a>
            </div>
        </nav>
    </header>
    <!-- START SECTION PRODUCTS            <div class="nav__item">
                <a href="#index" class="nav__link">Home</a>
            </div> -->
    <section class="store">
        <div class="container">
            <div class="items shadow mb-2">

                <div class="row">
                    <h4>Proveedores Leaf</h4>
                        <div class="col-12 col-md-6">

                            <ol class="list-group">
                                <li class="list-group-item" v-for="proveedor in proveedores" v-bind:key="proveedor.id">
                                    <span class="click" v-on:click="getProductosByProveedor(proveedor.id)">{{proveedor.nombre}}</span>
                                </li>
                            </ol>
                        </div>

                </div>

                <div class="title">
                    <h4>Productos Leaf</h4>
                </div>

                <div>
                    <div class="c_table">
                        <table class="table table-striped">
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
                    </div>

                    <div>
                            <div class="new_product">
                                <button v-if="proveedor_selected"  v-on:click="showCreateProduct" type="button" class="btn btn-success">
                                    Nuevo producto
                                </button>
                            </div>

                        </div>

                        <div v-if="product_selected || product_create" class="form shadow mb-4">

                            <h3 class="item-title">{{product.nombre}}</h3>

                            <form v-on:submit.prevent="processEditProduct">

                                <div>
                                    <p>Nombre del Producto:</p>
                                    <input v-model="product.nombre" type="text" placeholder="Nombre del Producto"> 
                                </div>
                                <div>
                                    <p>Precio:</p>
                                    <input v-model="product.precio" type="text" placeholder="Precio">
                                </div>
                                
                                <div>
                                    <p>Stock:</p>
                                    <input v-model="product.stock" type="text" placeholder="Stock">
                                </div>
                                <div class="item-details">
                                <button v-if="product_selected" v-bind:class="{'disabled': is_loading}" type="button" class="btn btn-primary">
                                    <span v-if="!is_loading">Actualizar producto</span>
                                    <div v-if="is_loading" class="spinner-border text-light" role="status"></div>
                                </button>
                                <button v-if="product_create" v-bind:class="{'disabled': is_loading}" type="button" class="btn btn-primary">
                                    <span v-if="!is_loading">Crear producto</span>
                                    <div v-if="is_loading" class="spinner-border text-light" role="status"></div>
                                </button>
                                <button type="button" class="btn btn-danger">Eliminar producto</button>
                                </div>
                            </form>



                            
                            
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
    background: #3e6553;
    box-shadow: rgb(212, 212, 212);
}
.items{
    background: rgb(255, 255, 255);
    border-radius: 20px;
    padding: 3rem;
}
.items{
    background: rgb(255, 255, 255);
    border-radius: 20px;
    padding: 3rem;
}
.lista_productos{
    background: purple;
}
.store{
    padding: 2rem;
    background: rgb(255, 255, 255);
    height: 100vh;
}

.nav h3{
    color: #fff;
}

.new_product{
    margin-left: 5rem;
}

.container{


    margin-left: 10vw;
    margin-right: 10vw;

}
.app{
    width:100%;
    height:100%;
    background: blue;
}
.list-group{
    font-size: 1rem;
}
.list-group span{
    margin: 1rem;
}
.row{
    margin-bottom: 2rem;
    display: flex;
    justify-content: center;

}
.row h4{
    font-weight: bold;
    margin-left: 5rem;
    margin-bottom: 3rem;
    font-size: 2rem;
    color: #3e6553;
}
.form{
    padding: 1rem;
    margin: 1rem;
}
.form p{
    margin-left: 1.2rem;
    color:#3e6553;
    font-size: 1.3rem;
}
.form input{
    margin: .8rem 2.5rem .8rem 2.5rem;
    padding: .5rem;
    width: 26vw;
    color: rgb(143, 143, 143);
    border: 3px solid;
    border-color: #3e6553;
    border-radius: 15px;

}

.item-title{
    font-weight: bold;
    margin-left: .5rem;
    margin-bottom: 1rem;
    color: #3e6553;
}
.title h4{
    margin-left: 2.5rem;
    font-weight: bold;
    font-size: 2rem;
    color: #3e6553;
}
.click{
    cursor: pointer;
    color:#3e6553;
    font-size: 1.2rem;
    padding: .5rem;
}
.item-details{
    margin-left: 7rem;
    margin-right: 7rem;
    margin-bottom: 3rem;
    margin-top: 3rem;
    display: flex;
    justify-content: space-around;
}

.c_table{
    margin: 2rem 2rem 2rem 2rem;
}
.table th{
    font-size: 1.3rem;
    color: #3e6553;
}
.table td{
    font-size: 1rem;
    color: #3e6553;
}
header, main
button,
input,
textarea{
  font-family: 'Poppins', sans-serif;
  font-size: 1rem;
}

body{
  /* display: flex;
  justify-content: flex-end;
  align-items: flex-end; */
  min-height: 100vh;
  /* background: #333; */
  margin: var(--header-height) 0 0 0;
  background-color: var(--body-color);
  color: hsl(152, 4%, 35%);
  transition: .4s; /*Animar el Dark Mode*/
  /* https://developer.mozilla.org/en-US/docs/Web/CSS/transition */
}

button{
  cursor: pointer;
  border: none;
  outline: none; /* Outline quita el contorno */
}

h1,h2,h3{
  color: hsl(152, 4%, 15%);
  font-weight: 600;
}

ul{
  list-style: none;
}

a{
  text-decoration: none;
}

img{
  max-width: 100%;
  height: auto;
}

/*=============== THEME ===============*/
/*========== Variables Dark Mode ==========*/

body.dark-theme {

  /*========== Colores ==========*/
  --hue: 152;
  --first-color-dark: hsl(152, 8%, 20%);
  --title-color: hsl(152, 4%, 95%);
  --text-color: hsl(152, 4%, 75%);
  --body-color: hsl(152, 8%, 12%);
  --container-color: hsl(152, 8%, 16%);

}

/*========== Los Colores cambian acorde al sitio web, en el Dark Mode ==========*/

.dark-theme .steps__bg,
.dark-theme .questions {

  background-color: var(--first-color-dark);

}

.dark-theme .product__circle,
.dark-theme .extra__subscribe {

  background-color: #fff;

}

.dark-theme .scroll-header {
  
  box-shadow: 0 1px 4px hsla(152, 4%, 4%, 0.3);

}

.dark-theme footer {

  background-color: var(--body-color);

}

.dark-theme footer .wave {

  display: none;

}

.dark-theme footer .menu li a {

  color: hsl(152, 4%, 35%);

}

.dark-theme .extra {

  margin-bottom: -.5rem;

}

.change-theme {

  color: hsl(152, 4%, 35%);
  font-size: 1.15rem;
  cursor: pointer;

}

.nav__btns {

  display: inline-flex;
  align-items: center;
  column-gap: 1rem;

}




/*=============== HEADER ===============*/

.header {

  width: 100%;
  background-color: #3e6553;
  color: white;
  position: fixed;
  top: 0;
  left: 0;
  z-index: 1;
  transition: .4s;

}

/*=============== NAV ===============*/

.nav {

  height: 3.5rem;
  color: #fff;
  display: flex;
  align-items: center;
  justify-content: space-between;

}

.nav__logo,
.nav__toggle,
.nav__close {

  color: #fff;

}

.nav__logo {

  text-transform: uppercase;
  font-weight: 700;
  letter-spacing: -1px;
  display: inline-flex;
  align-items: center;
  column-gap: .5rem;
  transition: .3s;
  margin-left: 10.5rem;

}

.nav__logo:hover {

  color: (152, 24%, 32%);

}

.nav__logo-icon {

  font-size: 1.15rem;
  color: (152, 24%, 32%);

}

.nav__toggle, .nav__toggle-shop {

  display: inline-flex;
  font-size: 1.5rem;
  cursor: pointer;

}

@media screen and (max-width: 810px) {
    
  .nav__menu {

    position: fixed;
    background-color: #fff;
    top: 0;
    right: -100%;
    width: 80%;
    height: 100%;
    box-shadow: -2px 0 4px hsla(152, 24%, 15%, .1);
    padding: 4rem 0 0 3rem;
    border-radius: 1rem 0 0 1rem;
    transition: .3s;

  }
}

.btn_logout {
  background: transparent;
  color: white;
}






.nav__list {

  display: flex;
  flex-direction: column;
  row-gap: 1.5rem;

}

.nav__link {

  color: #fff;
  font-weight: 500;
  margin-right: 10rem;
  transition: .3s;

}

.nav__link:hover {

  color: hsl(157, 9%, 82%);

}

/* Mostrar menú */






/*=============== BOTONES ===============*/

.btn {

  display: inline-block;
  background-color: hsl(152, 24%, 32%);
  color: #FFF;
  padding: 1rem 1.75rem;
  border-radius: .5rem;
  font-weight: 500;
  transition: .3s;
  width: 15rem;

}

.btn:hover {
  
    background-color: hsl(152, 24%, 28%);
  
}

.btn__icon {

  transition: .3s;

}

.btn:hover .btn__icon {

  transform: translateX(.25rem);

}

.btn-flex {

  display: inline-flex;
  align-items: center;
  column-gap: 0.5rem;

}

.btn-link {

  color: hsl(152, 24%, 32%);
  font-weight: 500;

}

.btn-link:hover .btn__icon {

  transform: translateX(.25rem);

}

.btn-product {

  position: absolute;
  right: 0;
  bottom: 0;
  background-color: hsl(152, 24%, 32%);
  color: #FFF;
  padding: 0.25rem;
  border-radius: .35rem;
  font-size: 1.15rem;

}

.btn-product:hover {

  background-color: hsl(152, 24%, 28%);

}

.btn-extra {

  padding: 1rem;

}

/*=============== ABOUT ===============*/

.about__container {

  row-gap: 2rem;

}

.about__img {

  width: 280px;
  justify-self: center;

}

.about__description {

  margin-bottom: 2rem;

}

.about__details {
  
    display: grid;
    row-gap: 1rem;
    margin-bottom: 30px;
  
}

.about__details-description {

  display: inline-flex;
  column-gap: .5rem;
  font-size: 1rem;

}

.about__details-icon {

  font-size: 1rem;
  color: hsl(152, 24%, 32%);
  margin-top: 0.1rem;

}



@media screen and (max-width: 320px) {
    
  .container {

    margin-left: var(--mb-1);
    margin-right: var(--mb-1);
    margin-bottom: 2rem;

  }

  .home__img {

    width: 150px;

  }

  .home__social {

    top: .8rem;
  }

  .home__title {
      
      font-size: 1.1rem;
  
  }

  .home__description {

    font-size: .813rem;

  }

  .steps__bg {

    padding: 2rem 1rem;

  }

  .steps__card {

    padding: 1.5rem;;

  }

  .product__container {

    grid-template-columns: .6fr;
    justify-content: center;

  }

}

@media screen and (max-width: 415px) {
    
  .home__img {

    justify-self: left;
  }

  .home__container {

    margin-left: -42px;

  }

}

/* Para dispositivos medianos */

@media (min-width: 576px) {
    
  /* .nav__shop.show-shop {

    top: 60px;
    left: 20px;
    width: 60%;
    height: 30%;
  
  }  */


}

@media screen and (min-width: 576px) {
    
  /* .nav__shop {

    top: 0;
    right: -%;
    width: 80%;
    height: 100%;
  
  } */

  .steps__container {

    grid-template-columns: repeat(2, 1fr);

  }

  .product__description {

    padding: 0 4rem;

  }

  .product__container {

    grid-template-columns: repeat(2, 170px);
    justify-content: center;
    column-gap: 5rem;

  }

  .extra__subscribe {

    width: 400px;

  }

}

@media screen and (min-width: 768px) {
    
  body {
    
    margin: 0;

  }

  .home__container {
    
    align-items: center;
    display: inline-flex;
    margin-left: -2.5rem;

  }

  .home__data {

    margin-right: 2rem;

  }

  .home__container,
  .about__container,
  .questions__container,
  .contact__container,
  .extra__container {

    grid-template-columns: repeat(2,1fr);

  }

  
  .home__img {
    
    width: 280px;
    order: 1;
    
  }
  
  .home__social {
    
    right: -6rem;
    top: 3rem;
    
  }

  .section__title {

    font-size: 1.5rem;

  }

  .questions__container  {
    
    align-items: flex-start;
    
  }
  
  .extra__container {
    
    column-gap: 3rem;
    
  }

  .extra__subscribe {

    width: initial;

  }


    
}


@media screen and (min-width: 810px) {
  
  body {
    
    margin: 0;

  }

  .nav {

    height: 5.5rem;
    column-gap: 3rem;

  }

  .nav__toggle, .nav__close {

    display: none;

  }

  .nav__list {

    flex-direction: row;
    column-gap: 3rem;

  }

  .nav__menu {

    margin-left: auto;

  }

  .home__data {

    margin-right: 2rem;

  }

  .home {
    
    padding: 10rem 0 5rem;
    
  }
  
  .home__container {
    
    align-items: center;
    display: inline-flex;

  }

  .home__container,
  .about__container,
  .questions__container,
  .contact__container,
  .extra__container {

    grid-template-columns: repeat(2,1fr);

  }

  
  .home__img {
    
    width: 280px;
    order: 1;
    
  }
  
  .home__social {
    
    right: -6rem;
    top: 3rem;
    
  }
  
  .questions__container  {
    
    align-items: flex-start;
    
  }
  
  .extra__container {
    
    column-gap: 3rem;
    
  }

  .extra__subscribe {

    width: initial;

  }
  
}

/* Para dispositivos grandes */

@media screen and (min-width: 992px) {
    
  .container {

    margin-left: auto;
    margin-right: auto;

  }

  .home {

    padding: 13rem 0 5rem 2rem;

  }

  .home__img {

    width: 310px;

  }

  .home__title {

    font-size: 2.5rem;

  }

  .home__social {

    right: -8rem;

  }

  .home__social-follow {

    font-size: 1rem;
    margin-bottom: -12px;
    margin-top: 1rem;

  }

  .home__social-follow::after {

    display: none;

  }

  .home__social-link {

    font-size: 1.2rem;
    margin-top: 0.2rem;
    margin-left: 1rem;

  }

  .section {

    padding: 8rem 2.3rem 1rem;

  }

  .about__img {

    width: 400px;


  }

  .steps__container {

    grid-template-columns: repeat(3, 1fr);

  }

  .steps__card-title {

    font-size: .938rem;

  }

  .product__description {

    padding: 0 16rem;


  }

  .product__container {

    padding: 4rem 0;
    grid-template-columns: repeat(3, 185px);
    gap: 4rem 6rem;

  }

  .product__img {

    width: 160px;

  }

  .product__circle {

    width: 110px;
    height: 110px;

  }

  .product__title,
  .product__precio {

    font-size: .938rem;

  }

  .questions__container {

    padding: 1rem 0 4rem;

  }

  .questions__title {

    text-align: initial;

  }

  .questions__group {

    row-gap: 2rem;

  }

  .questions__header {

    padding: 1rem;

  }

  .questions__description {

    padding: 0 3.5rem 2.5rem 2.75rem;

  }

  .extra__logo {

    font-size: 1rem;

  }

  .extra__container {

    grid-template-columns:  1fr .5fr .5fr .5fr;

  }

}

@media screen and (min-width: 1200px) {

  body {

    zoom: 150%;

  }

  .home {

    padding: 9rem 0px 1rem 25rem;

  }

  .home__data {

    margin: 5rem;

  }

  .home__title {

    font-size: 2.3rem;

  }

  .home__img {

    width: 400px;

  }

  .home__social-links {

    margin-top: 3.3rem;

  }

  .home__social-link {

    font-size: 1.2rem;

  }
  .home__social-follow {

    top: 3rem;

  }

  .scrollup {

    right: 3rem;

  }



}



</style>


<script>
import gql from "graphql-tag";

export default {
    name: "Productos", // Nombre del componente

    data: function() {
      return { 
          is_loading: false,
          proveedor_selected: false,
          product_selected: false,
          product_create: false,
          productos:{},
          proveedores:{},
          product:{
            id: 0,
            nombre: "",
            precio: 0,
            stock: 0,
            proveedor: 0,
          },
          proveedor:{
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
                console.log("FUNCIONÓOOO")
                this.getProductos();
                this.is_loading = false;
            })
            .catch((error)=>{
                console.log("DIO ERROR :c")
                console.log(error)
                this.is_loading = false;
            })
            
        },

        createProduct: async function(){
            
            this.is_loading = true;
            this.product.id = +this.product.id;
            this.product.precio = +this.product.precio;
            this.product.stock = +this.product.stock;
            this.product.proveedor = +this.product.proveedor;
            await this.$apollo.mutate({
                mutation: gql`
                mutation CreateProducto($productoData: ProductoInput!) {
                    createProducto(productoData: $productoData) {
                        id
                        nombre
                        precio
                        stock
                        proveedor
                    }
                }`,
                variables: {
                    productoData: {
                        nombre: this.product.nombre,
                        precio: this.product.precio,
                        stock: this.product.stock,
                        proveedor: this.product.proveedor
                    }
                },
            })
            .then((result)=>{
                console.log("FUNCIONÓOOO")
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
            this.proveedor_selected = true;
            this.misProductos(id_proveedor);
        },

        formatPrice(value) {
            let val = (value / 1).toFixed(0).replace(".", ",");
            return val.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ".");
        },

        showCreateProduct(){
            this.product={
                id: 0,
                nombre: "",
                precio: 0,
                stock: 0,
                proveedor: 0,
            },
            this.product_create = true;
        }

    }, // Todas las funciones que usa este componente

    created: function () {
        this.misProveedores();
        //this.getProductos();
    } // Eventos: lo que pasa cuando el componente se inicia
};
</script>