<template>


<header>
        <div class="container">
            <h1 class="text-center">TIENDA</h1>
            <hr>
        </div>
    </header>
    <!-- START SECTION STORE -->
    <section class="store">
        <div class="container">
            <div class="items">
                <div class="row">

                    <div class="col-12 col-md-6">
                        <div class="item shadow mb-4">
                            <h3 class="item-title">Planta Cactácea</h3>
                            <img class="item-image" src="assets/img/product1.png" alt="Producto 1">

                            <div class="item-details">
                                <h4 class="item-price">$50,000</h4>
                                <button class="item-button btn btn-primary addToCart">AÑADIR AL CARRITO</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                        <div class="item shadow mb-4">
                            <h3 class="item-title">Planta Cactus</h3>

                            <img class="item-image" src="assets/img/product2.png" alt="Producto 2">

                            <div class="item-details">
                                <h4 class="item-price">$60,000</h4>
                                <button class="item-button btn btn-primary addToCart">AÑADIR AL CARRITO</button>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="row">
                    <div class="col-12 col-md-6">
                        <div class="item shadow mb-4">
                            <h3 class="item-title">Planta Aloe Vera</h3>

                            <img class="item-image" src="assets/img/product3.png" alt="Producto 3">

                            <div class="item-details">
                                <h4 class="item-price">$77,000</h4>
                                <button class="item-button btn btn-primary addToCart">AÑADIR AL CARRITO</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                        <div class="item shadow mb-4">
                            <h3 class="item-title">Planta Suculenta</h3>

                            <img class="item-image" src="assets/img/product4.png" alt="Producto 4">

                            <div class="item-details">
                                <h4 class="item-price">$90,000</h4>
                                <button class="item-button btn btn-primary addToCart">AÑADIR AL CARRITO</button>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-12 col-md-6">
                        <div class="item shadow mb-4">
                            <h3 class="item-title">Planta Dracaena</h3>

                            <img class="item-image" src="assets/img/product5.png" alt="Producto 5">
                            <div class="item-details">
                                <h4 class="item-price">$23,000</h4>
                                <button class="item-button btn btn-primary addToCart">AÑADIR AL CARRITO</button>
                            </div>
                        </div>
                    </div>
                    <div class="col-12 col-md-6">
                        <div class="item shadow mb-4">
                            <h3 class="item-title">Planta de Menta</h3>

                            <img class="item-image" src="assets/img/product6.png" alt="Producto 6">
                            <div class="item-details">
                                <h4 class="item-price">$30,000</h4>
                                <button class="item-button btn btn-primary addToCart">AÑADIR AL CARRITO</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- END SECTION STORE -->
    <!-- START SECTION SHOPPING CART -->
    <section class="shopping-cart">
        <div class="container">
            <h1 class="text-center">CARRITO</h1>
            <hr>
            <div class="row">
                <div class="col-6">
                    <div class="shopping-cart-header">
                        <h6>Producto</h6>
                    </div>
                </div>
                <div class="col-2">
                    <div class="shopping-cart-header">
                        <h6 class="text-truncate">Precio</h6>
                    </div>
                </div>
                <div class="col-4">
                    <div class="shopping-cart-header">
                        <h6>Cantidad</h6>
                    </div>
                </div>
            </div>
            <!-- ? START SHOPPING CART ITEMS -->
            <div class="shopping-cart-items shoppingCartItemsContainer">
            </div>
            <!-- ? END SHOPPING CART ITEMS -->

            <!-- START TOTAL -->
            <div class="row">
                <div class="col-12">
                    <div class="shopping-cart-total d-flex align-items-center">
                        <p class="mb-0">Total</p>
                        <p class="ml-4 mb-0 shoppingCartTotal">$ 0</p>
                        <div class="toast ml-auto bg-info" role="alert" aria-live="assertive" aria-atomic="true"
                            data-delay="2000">
                            <div class="toast-header">
                                <span>✅</span>
                                <strong class="mr-auto ml-1 text-secondary">Elemento en el carrito</strong>
                                <button type="button" class="ml-2 mb-1 close" data-dismiss="toast" aria-label="Close">
                                    <span aria-hidden="true">&times;</span>
                                </button>
                            </div>
                            <div class="toast-body text-white">
                                Se aumentó correctamente la cantidad
                            </div>
                        </div>
                        <button class="btn btn-success ml-auto buyBtn" type="button" data-toggle="modal"
                            data-target="#comprarModal">Comprar</button>
                    </div>
                </div>
            </div>
            <!-- END TOTAL -->

            <!-- START MODAL COMPRA -->
            <div class="modal fade" id="comprarModal" tabindex="-1" aria-labelledby="comprarModalLabel"
                aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="comprarModalLabel">Gracias por su compra</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <p>Pronto recibirá su pedido</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cerrar</button>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END MODAL COMPRA -->


        </div>

    </section>
</template>
<style scoped>
*{
    box-sizing: border-box;
    margin: 0;
    padding: 0;
    font-family: 'Poppins';
}
.shopping-cart h1 {

    font-size: 2.25rem;
    color: var(--title-color);
    font-weight: var(--font-semi-bold);
    line-height: 140%;
    margin-bottom: var(--mb-1);

}

.row {
    --bs-gutter-x: 1.5rem;
    --bs-gutter-y: 0;
    display: flex;
    flex-wrap: wrap;
    margin-top: calc(-1 * var(--bs-gutter-y));
    margin-right: calc(-0.5 * var(--bs-gutter-x));
    margin-left: calc(-0.5 * var(--bs-gutter-x));
}

.col-2 {
    flex: 0 0 auto;
    width: 16.66666667%;
}

.col-4 {
    flex: 0 0 auto;
    width: 33.33333333%;
}

.col-6 {
    flex: 0 0 auto;
    width: 50%;
}

.col-12 {
    flex: 0 0 auto;
    width: 100%;
}

.text-truncate {
    overflow: hidden;
    text-overflow: ellipsis;
    white-space: nowrap;
}

h6 {

    font-size: 1.25rem;
    color: var(--title-color);
    font-weight: var(--font-semi-bold);
    line-height: 140%;
    margin-bottom: var(--mb-1);

}

.d-flex {
    display: flex !important;
}

.shopping-cart-item {

    margin-bottom: 2rem;

}

.align-items-center {
    align-items: center !important;
}

.mb-0 {
    margin-bottom: 0 !important;
}

.mb-1 {

    margin-bottom: 0.25rem;

}

.ml-1 {

    margin-left: .25rem !important;

}

.ml-2 {

    margin-left: .5rem !important;

}

.ml-4 {
    margin-left: 1rem !important;
}

.mr-auto {

    margin-right: auto !important;

}

.ml-auto {

    margin-left: auto !important;

}

.toast {
    width: 350px;
    max-width: 100%;
    font-size: 0.875rem;
    pointer-events: auto;
    background-color: rgba(255, 255, 255, 0.85);
    background-clip: padding-box;
    border: 1px solid rgba(0, 0, 0, 0.1);
    box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15);
    border-radius: 0.25rem;
}

.toast-header {
    display: flex;
    align-items: center;
    padding: 0.5rem 0.75rem;
    color: #6c757d;
    background-color: rgba(255, 255, 255, 0.85);
    background-clip: padding-box;
    border-bottom: 1px solid rgba(0, 0, 0, 0.05);
    border-top-left-radius: calc(0.25rem - 1px);
    border-top-right-radius: calc(0.25rem - 1px);
}

.toast-body {
padding: 0.75rem;
word-wrap: break-word;
}

.text-white {

    color: white;

}

.buttonDelete {

    margin-left: auto;

}

.close {
    box-sizing: content-box;
    width: 1em;
    height: 1em;
    padding: 0.25em 0.25em;
    color: #000;
    border: 0;
    border-radius: 0.25rem;
    background-color: rgb(255 255 255 / 0%);;
    opacity: 0.5;
}

.close span {

    position: relative;
    top: -0.3em;
    right: 0.1em;
    font-size: 2rem;
    font-weight: bold;
    line-height: 1;
    color: #000;

}

.close:hover {
color: #000;
text-decoration: none;
opacity: 0.75;
}

.bg-info {
    background-color: rgba(13, 110, 253, 1) !important;
}

.text-secondary {
    color: rgba(108, 117, 125, 1) !important;
}

.modal {
    position: fixed;
    top: 0;
    left: 0;
    z-index: 1055;
    display: none;
    width: 100%;
    height: 100%;
    overflow-x: hidden;
    overflow-y: auto;
    outline: 0;
}

.fade {
    transition: opacity 0.15s linear;
}
@media (prefers-reduced-motion: reduce) {
.fade {
    transition: none;
}
}
.fade:not(.show) {
opacity: 0;
}

.modal-dialog {
    position: relative;
    width: auto;
    margin: 0.5rem;
    pointer-events: none;
}
.modal.fade .modal-dialog {
    transition: transform 0.3s ease-out;
    transform: translate(0, -50px);
}
@media (prefers-reduced-motion: reduce) {
    .modal.fade .modal-dialog {
        transition: none;
    }
}

.modal-dialog-centered {
    display: flex;
    align-items: center;
    min-height: calc(100% - 1rem);
}

.modal-content {
position: relative;
display: flex;
flex-direction: column;
width: 100%;
pointer-events: auto;
background-color: #fff;
background-clip: padding-box;
border: 1px solid rgba(0, 0, 0, 0.2);
border-radius: 0.3rem;
outline: 0;
}

.modal-header {
    display: flex;
    flex-shrink: 0;
    align-items: center;
    justify-content: space-between;
    padding: 1rem 1rem;
    border-bottom: 1px solid #dee2e6;
    border-top-left-radius: calc(0.3rem - 1px);
    border-top-right-radius: calc(0.3rem - 1px);
}

.modal-title {
    margin-bottom: 0;
    line-height: 1.5;
}

.modal-body {
position: relative;
flex: 1 1 auto;
padding: 1rem;
}

.modal-footer {
display: flex;
flex-wrap: wrap;
flex-shrink: 0;
align-items: center;
justify-content: flex-end;
padding: 0.75rem;
border-top: 1px solid #dee2e6;
border-bottom-right-radius: calc(0.3rem - 1px);
border-bottom-left-radius: calc(0.3rem - 1px);
}
.modal-footer > * {
margin: 0.25rem;
}

.item {
    border: 2px solid #000;
    padding: 10px;
    border-radius: 20px;
}

.item-title {
text-transform: uppercase;
text-align: center;
font-weight: 600;
}

.item-image {
height: 300px;
width: 100%;
}

.item-details {
display: flex;
justify-content: space-between;
align-items: center;
margin: 20px 0px 15px;
}

.item-details > .item-price {
margin: 0;
}

/* ? SHOPPING CART */
.shopping-cart-items {
padding: 20px 0px;
}

.shopping-cart-header {
    border-bottom: 1px solid #ccc;
    margin-top: 1rem;
    margin-left: 0.8rem;
}

.shopping-cart-image {
max-width: 80px;
border-radius: 20px;
}

.shopping-cart-quantity-input {
max-width: 45px;
border: 1px solid #ccc;
border-radius: 5px;
background: #eee;
padding: 5px;
}

.shopping-cart-total {
min-height: 96px;
}  
</style>>


