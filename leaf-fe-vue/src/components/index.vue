<template>
<header class="header shadow" id="header">
            
            <nav class="nav container">

                <a href="/" class="nav__logo">
                    <i class="ri-leaf-line nav__logo-icon"></i> Leaf
                </a>

                <div class="nav__menu" id="nav-menu">

                    <ul class="nav__list"> 

                        <li v-if="!is_auth" class="nav__item homeNav">
                            <a href="#login" class="nav__link">Iniciar sesión</a>
                        </li>
                        <li v-if="is_auth">
                            <button v-on:click="logout" class="btn_logout">Cerrar sesión</button>
                        </li>
                        <li class="nav__item about">
                            <a href="#about" class="nav__link">Acerca</a>
                        </li>
                        <li class="nav__item products">
                            <a href="#products" class="nav__link">Productos</a>
                        </li>

                    </ul>

                    <div class="nav__close" id="nav-close-menu">

                        <i class="ri-close-line"></i>

                    </div>

                </div>

                <div class="nav__btns">

                    <div class="nav__toggle-shop" id="nav-toggle-shop">
                        <i class="ri-shopping-cart-2-line icon__shop"></i>
                    </div>


                    <div class="nav__toggle" id="nav-toggle-menu">
                        <i class="ri-menu-line"></i>
                    </div>

                </div>
                    
            </nav>

        </header> 

        <main class="main">
            <!--==================== HOME ====================-->
            <section class="home" id="homeNav">
                
                <div class="home__container container grid">

                    <img
                      class="home__img"
                      v-bind:src="require('../assets/home.png')"
                      alt="Home Img"
                    />

                    <div class="home__data">

                        <h1 class="home__title">
                            Las Plantas te harán <br> tener una vida mejor.
                        </h1>

                        <p class="home__description">
                            Dale un diseño inverosímil a tus oficinas y <br> departamentos con increibles plantas. <br>
                            Añadele frescura a tu ambiente laboral.
                        </p>

                        <a href="#about" class="btn btn-flex">
                            Conoce más <i class="ri-arrow-right-down-line btn__icon"></i>
                        </a>
                    </div>

                    <div class="home__social">

                        <span class="home__social-follow">Síguenos</span>

                        <div class="home__social-links">

                            <a href="https://www.facebook.com/" target="_blank" class="home__social-link">
                                <i class="ri-facebook-fill"></i>
                            </a>

                            <a href="https://www.instagram.com/" target="_blank" class="home__social-link">
                                <i class="ri-instagram-fill"></i>
                            </a>

                            <a href="https://twitter.com/" target="_blank" class="home__social-link">
                                <i class="ri-twitter-fill"></i>
                            </a>

                            <a href="https://www.linkedin.com/" target="_blank" class="home__social-link">
                                <i class="ri-linkedin-fill"></i>
                            </a>

                        </div>

                    </div>

                </div>

            </section>

            <!--==================== ABOUT ====================-->
            <section class="about section container" id="about">
                
                <div class="about__container grid">

                    <img
                      class="about__img"
                      v-bind:src="require('../assets/about.png')"
                      alt="About Img"
                    />

                    <div class="about__data">

                        <h2 class="about__title section__title">
                            ¿Quiénes somos realmente? & <br> ¿Por qué escogernos?
                        </h2>

                        <p class="about__description">
                            Tenemos más de 4000 opiniones imparciales y nuestros clientes 
                            confían en nuestro sistema de producción y en nuestro servicio de entrega.
                        </p>

                        <div class="about__details">

                            <p class="about__details-description">
                                <i class="ri-checkbox-fill about__details-icon"></i>
                                Siempre entregamos a tiempo.
                            </p>

                            <p class="about__details-description">
                                <i class="ri-checkbox-fill about__details-icon"></i>
                                Te damos guías para proteger y cuidar tus plantas.
                            </p>

                            <p class="about__details-description">
                                <i class="ri-checkbox-fill about__details-icon"></i>
                                Siempre volvemos para una revisión luego de la venta.
                            </p>
                            <p class="about__details-description">
                                <i class="ri-checkbox-fill about__details-icon"></i>
                                Garantizamos 100% de devolución de dinero.
                            </p>

                        </div>

                        <a href="#" class="btn-link btn-flex">
                            Ordena Ahora! <i class="ri-arrow-right-down-line btn__icon"></i>
                        </a>

                    </div>

                </div>

            </section>

            <!--================= PASO A PASO =================-->
<!--             <section class="steps section container">
                
                <div class="steps__bg">

                    <h2 class="section__title-center steps__title">
                        Pasos para que tus plantas <br> se desarrollen correctamente.
                    </h2>

                    <div class="steps__container grid">

                        <div class="steps__card">

                            <div class="steps__card-number">01</div>
                            <h3 class="steps__card-title">
                                Escoge una Planta
                            </h3>
                            <p class="steps__card-description">
                                Tenemos muchas variedades de plantas que puedes elegir.
                            </p>

                        </div>

                        <div class="steps__card">

                            <div class="steps__card-number">02</div>
                            <h3 class="steps__card-title">
                                Realiza un pedido.
                            </h3>
                            <p class="steps__card-description">
                                Una vez hayas ordenado, pasemos al siguiente paso que es el envío.
                            </p>

                        </div>
              
                        <div class="steps__card">

                            <div class="steps__card-number">03</div>
                            <h3 class="steps__card-title">
                                Recibe las plantas a tu domicilio.
                            </h3>
                            <p class="steps__card-description">
                                Nuestro proceso de entrega es simple, recibes la planta directamente a tu puerta.
                            </p>

                        </div>

                    </div>
                </div>
            </section> -->

            <!--==================== PRODUCTOS ====================-->
            <section class="product section container" id="products">
                
                <h2 class="section__title-center">
                    Chequea nuestros <br> productos
                </h2>

                <p class="product__description">
                    Aquí tienes algunos de nuestras plantas seleccionadas de nuestro repertorio
                    y todas están en un buen estado y tiene una vida larga útil. Compra y disfruta de la mejor calidad.
                </p>

                <div class="product__container grid">

                    <article class="product__card">

                        <div class="product__circle"></div>

                        <img
                          class="product__img"
                          v-bind:src="require('../assets/product1.png')"
                          alt="Producto 1"
                        />

                        <h3 class="product__title">Planta Cactácea</h3>
                        <span class="product__precio">$50,000</span>

                        <button class="btn-product btn-flex">
                            <i class="ri-shopping-bag-line"></i>
                        </button>

                    </article>

                    <article class="product__card">

                        <div class="product__circle"></div>

                        <img
                          class="product__img"
                          v-bind:src="require('../assets/product2.png')"
                          alt="Producto 2"
                        />

                        <h3 class="product__title">Planta Cactus</h3>
                        <span class="product__precio">$60,000</span>

                        <button class="btn-product btn-flex">
                            <i class="ri-shopping-bag-line"></i>
                        </button>

                    </article>

                    <article class="product__card">

                        <div class="product__circle"></div>

                        <img
                          class="product__img"
                          v-bind:src="require('../assets/product3.png')"
                          alt="Producto 3"
                        />

                        <h3 class="product__title">Planta Aloe Vera</h3>
                        <span class="product__precio">$77,000</span>

                        <button class="btn-product btn-flex">
                            <i class="ri-shopping-bag-line"></i>
                        </button>

                    </article>

                    <article class="product__card">

                        <div class="product__circle"></div>

                        <img
                          class="product__img"
                          v-bind:src="require('../assets/product4.png')"
                          alt="Producto 4"
                        />

                        <h3 class="product__title">Planta Suculenta</h3>
                        <span class="product__precio">$90,000</span>

                        <button class="btn-product btn-flex">
                            <i class="ri-shopping-bag-line"></i>
                        </button>

                    </article>

                    <article class="product__card">

                        <div class="product__circle"></div>

                        <img
                          class="product__img"
                          v-bind:src="require('../assets/product5.png')"
                          alt="Producto 5"
                        />

                        <h3 class="product__title">Planta Dracaena</h3>
                        <span class="product__precio">$23,000</span>

                        <button class="btn-product btn-flex">
                            <i class="ri-shopping-bag-line"></i>
                        </button>

                    </article>

                    <article class="product__card">

                        <div class="product__circle"></div>

                        <img
                          class="product__img"
                          v-bind:src="require('../assets/product6.png')"
                          alt="Producto 6"
                        />
                        
                        <h3 class="product__title">Planta de Menta</h3>
                        <span class="product__precio">$30,000</span>

                        <button class="btn-product btn-flex">
                            <i class="ri-shopping-bag-line"></i>
                        </button>

                    </article>

                </div>

            </section>

            <!--==================== FAQS ====================-->
            <!-- <section class="questions section" id="faqs">
                
                <h2 class="section__title-center questions__title container">

                    Estas son algunas de las <br> preguntas mas comunes

                </h2>

                <div class="questions__container container grid">

                    <div class="questions__group">

                        <div class="questions__item">

                            <header class="questions__header">

                                <i class="ri-add-line questions__icon"></i>
                                <h3 class="questions__item-title">

                                    ¿Mis flores se marchitan o se mueren?

                                </h3>

                            </header>

                            <div class="questions__content">

                                <p class="questions__description">

                                    Las plantas proveen una manera para suministrar energía a los colores y transformar su espacio, 
                                    pero ¿Qué planta es adecuada para ti?. Elige la planta adecuada.

                                </p>

                            </div>

                        </div>

                        <div class="questions__item">

                            <header class="questions__header">

                                <i class="ri-add-line questions__icon"></i>
                                <h3 class="questions__item-title">

                                    ¿Qué hace que las hojas se vuelvan pálidas?

                                </h3>

                            </header>

                            <div class="questions__content">

                                <p class="questions__description">

                                    Las plantas proveen una manera para suministrar energía a los colores y transformar su espacio, 
                                    pero ¿Qué planta es adecuada para ti?. Elige la planta adecuada.

                                </p>

                            </div>

                        </div>

                        <div class="questions__item">

                            <header class="questions__header">

                                <i class="ri-add-line questions__icon"></i>
                                <h3 class="questions__item-title">

                                    ¿Por qué las hojas se ponen marrones y quebradizas?
                                
                                </h3>

                            </header>

                            <div class="questions__content">

                                <p class="questions__description">

                                    Las plantas proveen una manera para suministrar energía a los colores y transformar su espacio, 
                                    pero ¿Qué planta es adecuada para ti?. Elige la planta adecuada.

                                </p>

                            </div>

                        </div>

                    </div>

                    <div class="questions__group">

                        <div class="questions__item">

                            <header class="questions__header">

                                <i class="ri-add-line questions__icon"></i>
                                <h3 class="questions__item-title">

                                    ¿Cómo elegir la planta adecuada?

                                </h3>

                            </header>

                            <div class="questions__content">

                                <p class="questions__description">

                                    Las plantas proveen una manera para suministrar energía a los colores y transformar su espacio, 
                                    pero ¿Qué planta es adecuada para ti?. Elige la planta adecuada.

                                </p>

                            </div>

                        </div>

                        <div class="questions__item">

                            <header class="questions__header">

                                <i class="ri-add-line questions__icon"></i>
                                <h3 class="questions__item-title">

                                    ¿Cómo se cambian las macetas de una planta?

                                </h3>

                            </header>

                            <div class="questions__content">

                                <p class="questions__description">

                                    Las plantas proveen una manera para suministrar energía a los colores y transformar su espacio, 
                                    pero ¿Qué planta es adecuada para ti?. Elige la planta adecuada.

                                </p>

                            </div>

                        </div>

                        <div class="questions__item">

                            <header class="questions__header">

                                <i class="ri-add-line questions__icon"></i>
                                <h3 class="questions__item-title">

                                    ¿Por qué los mosquitos vuelan alrededor de mi planta?

                                </h3>

                            </header>

                            <div class="questions__content">

                                <p class="questions__description">

                                    Las plantas proveen una manera para suministrar energía a los colores y transformar su espacio, 
                                    pero ¿Qué planta es adecuada para ti?. Elige la planta adecuada.

                                </p>

                            </div>

                        </div>

                    </div>

                </div>

            </section> -->

            <!--=================== CONTACTOS ===================-->
            <!-- <section class="contact section container" id="contact">                
                
                 <div class="contact__container grid">

                    <div class="contact__box">

                        <h2 class="section__title">

                            Póngase en contacto con nosotros hoy <br> mismo a través de las siguientes formas.

                        </h2>

                        <div class="contact__data">

                            <div class="contact__info">

                                <h3 class="contact__subtitle">

                                    Llámanos para una asistencia inmediata.

                                </h3>

                                <span class= "contact__description">

                                    <i class= "ri-phone-line contact__icon"></i>

                                        +57 312-345-6789

                                    

                                </span>

                            </div>

                            <div class="contact__info">

                                <h3 class="contact__subtitle">

                                    Escríbenos por correo electrónico

                                </h3>

                                <span class="contact__description">

                                    <i class="ri-mail-line contact__icon"></i>

                                        centrodeayuda@leafx.com

                                    

                                </span>

                            </div>

                        </div>

                    </div>

                    <form action="" class="contact__form">

                        <div class="contact__inputs">

                            <div class="contact__content">

                                <input placeholder=" " type="email" name="email" 
                                id="email" class="contact__input">
                                <label for="email" class="contact__label">Email</label>

                            </div>

                            <div class="contact__content">

                                <input placeholder=" " type="text" name="asunto" 
                                id="asunto" class="contact__input">
                                <label for="asunto" class="contact__label">Asunto</label>

                            </div>

                            <div class="contact__content contact__area">

                                <textarea name="mensaje" id="mensaje"
                                placeholder=" " class="contact__input"></textarea>
                                <label for="mensaje" class="contact__label">Mensaje</label>

                            </div>

                        </div>

                        <button class="btn btn-flex">

                            Enviar Mensaje
                            <i class="ri-arrow-right-up-line btn__icon"></i>

                        </button>

                    </form>

                 </div>

            </section> -->

            <!--==================== EXTRA INFORMACIÓN ====================-->
            <section class="extra section" id="extras">

                <div class="extra__container container grid">

                    <div class="extra__content">

                        <a href="#" class="extra__logo">

                            <i class="ri-leaf-line extra__logo-icon"></i> Leaf

                        </a>

                        <h3 class="extra__title">

                            Suscribete a nuestro newsletter <br> para estar al día

                        </h3>

                        <div class="extra__subscribe">

                            <input type="email" name="email" id="email" 
                            placeholder="Ingresa tu Email" class="extra__input">

                            <button class="btn btn-flex btn-extra">

                                Suscribirse
                                <i class="ri-arrow-right-up-line btn__icon"></i>
                            
                            </button>

                        </div>

                    </div>


                    <div class="extra__content">

                        <h3 class="extra__title">Contáctanos</h3>

                        <ul class="extra__data">

                            <li class="extra__info">+57 312-345-6789</li>

                            <div class="extra__social">

                                <a href="https://www.facebook.com/" class="extra__social-link">
                                    <i class="ri-facebook-fill extra__social-icon"></i>
                                </a>
                                <a href="https://www.instagram.com/" class="extra__social-link">
                                    <i class="ri-instagram-fill extra__social-icon"></i>
                                </a>
                                <a href="https://twitter.com/" class="extra__social-link">
                                    <i class="ri-twitter-fill extra__social-icon"></i>
                                </a>
                                <a href="https://www.linkedin.com/feed/" class="extra__social-link">
                                    <i class="ri-linkedin-fill extra__social-icon"></i>
                                </a>

                            </div>

                        </ul>

                    </div>

                </div>

                <!-- <p class="extra__copy">

                    &#169; P52 - G4. Todos los Derechos Reservados.

                </p> -->

            </section>

        </main>

        <!--==================== FOOTER ====================-->
        <footer class="footer section">
 
            <div class="waves">

                <div class="wave" id="wave1"></div>
                <div class="wave" id="wave2"></div>
                <div class="wave" id="wave3"></div>
                <div class="wave" id="wave4"></div>

            </div>

           <ul class="social_icon">
               <li>
                   <a href="https://www.facebook.com/">
                       <ion-icon name="logo-facebook"></ion-icon>
                    </a>
                </li>
                <li>
                   <a href="https://www.instagram.com/">
                       <ion-icon name="logo-instagram"></ion-icon>
                    </a>
                </li>
                <li>
                    <a href="https://twitter.com/">
                        <ion-icon name="logo-twitter"></ion-icon>
                     </a>
                 </li>
                 <li>
                    <a href="https://www.linkedin.com/">
                        <ion-icon name="logo-linkedin"></ion-icon>
                     </a>
                 </li>
           </ul>

           <ul class="menu">

            <li><a href="#index">Inicio</a></li>
            <li><a href="#about">Acerca</a></li>
            <li><a href="#products">Productos</a></li>
            

           </ul>

           <p>&copy; P52 - G4 | Todos los derechos reservados. 2021</p>
            
        </footer> 

        <!--=============== SCROLL UP ===============-->
        
        <a href="#" class="scrollup" id="scroll-up">

            <i class="ri-arrow-up-fill scrollup__icon"></i>

        </a>

        
</template>

<script>
import gql from "graphql-tag";

export default {
    name: "Index", // Nombre del componente

    data: function() {
      return {
        is_auth: false
       }
    }, // Todas las variables de este componentes

    methods: { 
      verifyAuth(){
        this.is_auth = localStorage.getItem("is_auth") || false;
      },
      logout(){
        this.is_auth = false;
        localStorage.clear();
        this.verifyAuth()
      },
    }, // Todas las funciones que usa este componente
    
    created: function () {
      this.verifyAuth();
    } // Eventos: lo que pasa cuando el componente se inicia
};
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap');

/*=============== VARIABLES CSS ===============*/
:root {
  --header-height: 3.5rem; /*56px*/

  /*========== Colores ==========*/
  /*Color mode HSL(hue, saturation, lightness)*/
  --hue: 152;
  --first-color: hsl(152, 24%, 32%); /* #3e6553 */
  --first-color-alt: hsl(152, 24%, 28%); /* #365949 */
  --first-color-light: hsl(152, 24%, 66%); /* #93bdaa */
  --first-color-lighten: hsl(var(--hue), 24%, 92%);
  --title-color: hsl(var(--hue), 4%, 15%);
  --text-color: hsl(var(--hue), 4%, 35%);
  --text-color-light: hsl(152, 4%, 55%);
  --body-color: hsl(var(--hue), 0%, 100%);
  --container-color: #FFF;

  /*========== Fuentes y Tipografias ==========*/
  /*.5rem = 8px | 1rem = 16px ...*/
  --body-font: 'Poppins', sans-serif;
  --big-font-size: 2rem;
  --h1-font-size: 1.5rem;
  --h2-font-size: 1.25rem;
  --h3-font-size: 1rem;
  --normal-font-size: .938rem;
  --small-font-size: .813rem;
  --smaller-font-size: .75rem;

  /*========== Font weight ==========*/ 
  --font-medium: 500;
  --font-semi-bold: 600;

  /*========== Margenes Bottom ==========*/
  /*.5rem = 8px | 1rem = 16px ...*/
  --mb-0-5: .5rem;
  --mb-0-75: .75rem;
  --mb-1: 1rem;
  --mb-1-5: 1.5rem;
  --mb-2: 2rem;
  --mb-2-5: 2.5rem;

  /*========== z index ==========*/
  --z-tooltip: 10;
  --z-fixed: 100;
}

/* Responsive typography */
@media screen and (min-width: 968px) {
  :root {
    --big-font-size: 3.5rem;
    --h1-font-size: 2.25rem;
    --h2-font-size: 1.5rem;
    --h3-font-size: 1.25rem;
    --normal-font-size: 1rem;
    --small-font-size: .875rem;
    --smaller-font-size: .813rem;
  }
}

/*=============== BASE ===============*/
*{
  box-sizing: border-box; /* Manejar los contenedores de la maquetación */
  padding: 0;
  margin: 0;
}

html{
  scroll-behavior: smooth; /* Agrega animación ligera al realizar un Scroll */
}

body,
button,
input,
textarea{
  font-family: var(--body-font);
  font-size: var(--normal-font-size);
}

body{
  /* display: flex;
  justify-content: flex-end;
  align-items: flex-end; */
  min-height: 100vh;
  /* background: #333; */
  margin: var(--header-height) 0 0 0;
  background-color: var(--body-color);
  color: var(--text-color);
  transition: .4s; /*Animar el Dark Mode*/
  /* https://developer.mozilla.org/en-US/docs/Web/CSS/transition */
}

button{
  cursor: pointer;
  border: none;
  outline: none; /* Outline quita el contorno */
}

h1,h2,h3{
  color: var(--title-color);
  font-weight: var(--font-semi-bold);
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
  --title-color: hsl(var(--hue), 4%, 95%);
  --text-color: hsl(var(--hue), 4%, 75%);
  --body-color: hsl(var(--hue), 8%, 12%);
  --container-color: hsl(152, 8%, 16%);

}

/*========== Los Colores cambian acorde al sitio web, en el Dark Mode ==========*/

.dark-theme .steps__bg,
.dark-theme .questions {

  background-color: var(--first-color-dark);

}

.dark-theme .product__circle,
.dark-theme .extra__subscribe {

  background-color: var(--container-color);

}

.dark-theme .scroll-header {
  
  box-shadow: 0 1px 4px hsla(var(--hue), 4%, 4%, 0.3);

}

.dark-theme footer {

  background-color: var(--body-color);

}

.dark-theme footer .wave {

  display: none;

}

.dark-theme footer .menu li a {

  color: var(--text-color);

}

.dark-theme .extra {

  margin-bottom: -.5rem;

}

.change-theme {

  color: var(--text-color);
  font-size: 1.15rem;
  cursor: pointer;

}

.nav__btns {

  display: inline-flex;
  align-items: center;
  column-gap: 1rem;

}

/*=============== CLASES REUSABLES CSS ===============*/
.section{
  padding: 5.5rem 0 1rem;
}

.section__title,
.section__title-center{
  font-size: var(--h2-font-size);
  margin-bottom: var(--mb-2);
  line-height: 140%;
}

.section__title-center{
  text-align: center;
}

.container{
  max-width: 968px;
  margin-left: var(--mb-1-5);
  margin-right: var(--mb-1-5);
}

.grid{
  display: grid;
}

.main{
  overflow: hidden; /*Para animación*/
  /* Si sobresapasa un contenedor se oculta */

  /* display: inline-block; */
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

  height: var(--header-height);
  display: flex;
  align-items: center;
  justify-content: space-between;

}

.nav__logo,
.nav__toggle,
.nav__close {

  color: var(--title-color);

}

.nav__logo {

  text-transform: uppercase;
  font-weight: 700;
  letter-spacing: -1px;
  display: inline-flex;
  align-items: center;
  column-gap: var(--mb-0-5);
  transition: .3s;

}

.nav__logo:hover {

  color: var(--first-color);

}

.nav__logo-icon {

  font-size: 1.15rem;
  color: var(--first-color);

}

.nav__toggle, .nav__toggle-shop {

  display: inline-flex;
  font-size: 1.5rem;
  cursor: pointer;

}

@media screen and (max-width: 810px) {
    
  .nav__menu {

    position: fixed;
    background-color: var(--container-color);
    top: 0;
    right: -100%;
    width: 80%;
    height: 100%;
    box-shadow: -2px 0 4px hsla(var(--hue), 24%, 15%, .1);
    padding: 4rem 0 0 3rem;
    border-radius: 1rem 0 0 1rem;
    transition: .3s;

  }
}

.btn_logout {
  background: transparent;
  color: white;
}

.item {

  position: absolute;
  min-height: 390px; 
  height: 400px;
  min-width: 590px;
  width: 600px;
  background-color: #262c29;
  box-shadow: -2px 0 4px hsla(var(--hue), 24%, 15%, .1);
  top: 70px;
  right: 100px;

}

.resizer {

  position: absolute;
  width: 50px;
  height: 50px;
  border-radius: 5px;
  background-color: #262c29;
  z-index: 2;

}

.resizer.nw {

  top: -1px;
  left: -1px;
  cursor: nw-resize;

}

.resizer.ne {

  top: -1px;
  right: -1px;
  cursor: ne-resize;

}

.resizer.sw {

  bottom: -1px;
  left: -1px;
  cursor: sw-resize;

}

.resizer.se {

  bottom: -1px;
  right: -1px;
  cursor: se-resize;

}

/* .nav__shop {

  position: absolute;
  min-height: 10rem;
  background-color: var(--container-color);
  top: 0; right: 0;
  transition: all .3s ease-in-out;
  background: rgba(255, 255, 255, .5);
  width: 0;
  overflow: hidden;

} */
.nav__shop {

  position: fixed;
  background-color: var(--container-color);
  top: 0;
  right: -120%;
  width: 100%;
  height: 100%;
  box-shadow: -2px 0 4px hsla(var(--hue), 24%, 15%, .1);
  padding: 4rem 0 0 3rem;
  border-radius: 1rem 0 0 1rem;
  z-index: 1;
  transition: .3s;

}

.icon__shop {

  display: inline-flex;
  color: var(--text-color);
  font-size: 1.15rem;

}

.nav__close, .nav__close-shop {

  font-size: 1.5rem;
  position: absolute;
  top: 1rem;
  right: 1.25rem;
  cursor: pointer;

}

.nav__list {

  display: flex;
  flex-direction: column;
  row-gap: 1.5rem;

}

.nav__link {

  color: var(--title-color);
  font-weight: var(--font-medium);
  transition: .3s;

}

.nav__link:hover {

  color: var(--first-color);

}

/* Mostrar menú */

.show-menu {

  right: 0;

}

/* .show-shop {

  width: 18rem;
  padding: 2rem 1.5rem;
  transform: rotateY(-360deg);

} */
.show-shop {

  right: 0;

}

/* Cambiar el background del Header */

.scroll-header {

  box-shadow: 0 1px 4px hsla(var(--hue), 4%, 15%, .1);

}

/* Active link */

.nav__item.active-link a {

  position: relative;
  color: var(--first-color);
  
}

.nav__item.active-link a::after {

  content: '';
  position: absolute;
  bottom: -.5rem;
  left: 0;
  width: 50%;
  height: 2px;
  background-color: var(--first-color);
  transition: .3s;

}

/*=============== HOME ===============*/

.home {

  padding: 3.5rem 0 2rem;

}

.home__container {

  position: relative;
  row-gap: 2rem;

}

.home__img {
  
  width: 200px;
  justify-self: center;

}

.home__title {

  font-size: var(--h1-font-size);
  line-height: 140%;
  margin-bottom: var(--mb-1);
  
}

.home__description {
  
  margin-bottom: var(--mb-2-5);

}

.home__social {

  position: absolute;
  top: 2rem;
  right: -1rem;
  display: grid;
  justify-content: center;
  row-gap: 3.5rem;

}

.home__social-follow {

  font-weight: var(--font-medium);
  font-size: var(--smaller-font-size);
  color: var(--first-color);
  position: relative;
  transform: rotate(90deg);
  right: 1.2rem;
  top: -1rem;

}

.home__social-follow::after {

  content: '';
  position: absolute;
  width: 1.3rem;
  height: 1.5px;
  background-color: var(--first-color);
  right: -55%;
  top: 47%;

}

.home__social-links {

  display: inline-flex;
  flex-direction: column;
  row-gap: .25rem;
  margin-top: -0.7rem;

}

.home__social-link {

  font-size: 1rem;
  color: var(--first-color);
  transition: .3s;

}

.home__social-link:hover {

  transform: translateX(.25rem);

}

/*=============== BOTONES ===============*/

.btn {

  display: inline-block;
  background-color: var(--first-color);
  color: #FFF;
  padding: 1rem 1.75rem;
  border-radius: .5rem;
  font-weight: var(--font-medium);
  transition: .3s;

}

.btn:hover {
  
    background-color: var(--first-color-alt);
  
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

  color: var(--first-color);
  font-weight: var(--font-medium);

}

.btn-link:hover .btn__icon {

  transform: translateX(.25rem);

}

.btn-product {

  position: absolute;
  right: 0;
  bottom: 0;
  background-color: var(--first-color);
  color: #FFF;
  padding: 0.25rem;
  border-radius: .35rem;
  font-size: 1.15rem;

}

.btn-product:hover {

  background-color: var(--first-color-alt);

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

.about__title {

  margin-bottom: var(--mb-1);

}

.about__description {

  margin-bottom: var(--mb-2);

}

.about__details {
  
    display: grid;
    row-gap: 1rem;
    margin-bottom: var(--mb-2-5);
  
}

.about__details-description {

  display: inline-flex;
  column-gap: .5rem;
  font-size: var(--small-font-size);

}

.about__details-icon {

  font-size: 1rem;
  color: var(--first-color);
  margin-top: 0.1rem;

}

/*=============== PASO A PASO ===============*/

.steps__bg {

  background-color: var(--first-color);
  padding: 3rem 2rem 2rem;
  border-radius: 1rem;

}

.steps__container {

  gap: 2rem;
  padding-top: 1rem;

}

.steps__title {

  color: #FFF;

}

.steps__card {

  background-color: var(--container-color);
  padding: 2.5rem 3rem 2rem 1.5rem;
  border-radius: 1rem;

}

.steps__card-number {

  display: inline-block;
  background-color: var(--first-color-alt);
  color: #FFF;
  padding: 0.5rem 0.75rem;
  border-radius: .25rem;
  font-size: var(--h2-font-size);
  margin-bottom: var(--mb-1-5);
  transition: .3s;

}

.steps__card-title {

  font-size: var(--h3-font-size);
  margin-bottom: var(--mb-0-5);

}

.steps__card-description {

  font-size: var(--small-font-size);

}

.steps__card:hover .steps__card-number {

  transform: translateY(-.25rem);

}

/*=============== PRODUCTOS ===============*/

.product__description {
  
  text-align: center;
  
}

.product__container {

  padding: 3rem 0;
  grid-template-columns: repeat(2, 1fr);
  gap: 2.5rem 3rem;

}

.product__card {

  display: grid;
  position: relative;
  
}

.product__img {
  
  position: relative;
  width: 120px;
  justify-self: center;
  margin-bottom: var(--mb-0-75);
  transition: .3s;

}

.product__title, 
.product__precio {

  font-size: var(--small-font-size);
  font-weight: var(--font-semi-bold);
  color: var(--title-color);

}

.product__title {
  
  margin-bottom: .25rem;
  
}

.product__circle {
  
  width: 90px;
  height: 90px;
  background-color: var(--first-color-lighten);
  border-radius: 50%;
  position: absolute;
  top: 18%;
  left: 5%;
  
}

.product__card:hover .product__img {
  
  transform: translateY(-.5rem);
  
}

/*=============== FAQS ===============*/

.questions {

  background-color: var(--first-color-lighten);

}

.questions__container {

  gap: 1.5rem;
  padding: 1.5rem 0;

}

.questions__group {

  display: grid;
  row-gap: 1.5rem;

}

.questions__item {

  background-color: var(--container-color);
  border-radius: .25rem;

}

.questions__item-title {

  font-size: var(--small-font-size);
  font-weight: var(--font-medium);

}

.questions__header {

  display: flex;
  align-items: center;
  column-gap: .5rem;
  padding: 0.75rem 0.5rem;
  cursor: pointer;

}

.questions__icon {

  font-size: 1.25rem;
  color: var(--title-color-color);

}

.questions__content {

  overflow: hidden;
  height: 0;

}

.questions__description {

  font-size: var(--smaller-font-size);
  padding: 0 1.5rem 1.5rem 2.5rem;

}

.questions__item,
.questions__header,
.questions__item-title,
.questions__icon,
.questions__description,
.questions__content {

  transition: .3s;

}

.questions__item:hover {

  box-shadow: 0 2px 8px hsla(var(--hue), 4%, 15%, .1);

}

/* Rotar iconos, Cambiar el color del titulo*/

.accordion-open .questions__header,
.accordion-open .questions__content {

  background-color: var(--first-color);
}

.accordion-open .questions__icon,
.accordion-open .questions__item-title,
.accordion-open .questions__description {

  color: #FFF;

}

.accordion-open .questions__icon {

  transform: rotate(135deg);

}

/*=============== CONTACTO ===============*/

.contact__container {

  row-gap: 3.5rem;

}

.contact__data {

  display: grid;
  row-gap: 2rem;

}

.contact__subtitle {

  font-size: var(--normal-font-size);
  font-weight: var(--font-medium);
  color: var(--text-color);
  margin-bottom: var(--mb-0-5);

}

.contact__description {

  display: inline-flex;
  align-items: center;
  column-gap: .5rem;
  color: var(--title-color);
  font-size: var(--font-medium);

}

.contact__icon {

  font-size: 1.25rem;

}

.contact__inputs {

  display: grid;
  row-gap: 2rem;
  margin-bottom: var(--mb-2-5);

}

.contact__content {

  position: relative;
  height: 3rem;
  border-bottom: 1px solid var(--text-color-light);

}

.contact__input {

  position: absolute;
  top: 0;
  left: 0;
  width: 100%;
  height: 100%;
  padding: 1rem 1rem 1rem 0;
  background: none;
  color: var(--text-color);
  border: none; outline: none;
  z-index: 1;

}

.contact__label {

  position: absolute;
  top: .75rem;
  width: 100%;
  font-size: var(--small-font-size);
  color: var(--text-color-light);
  transition: .3s;

}

.contact__area {

  height: 7rem;

}

.contact__area textarea {

  resize: none;

}

/* El label se mueve cuando el input está en focus */

.contact__input:focus + .contact__label {

  top: -.75rem;
  left: 0;
  font-size: var(--smaller-font-size);
  z-index: 10;

}

/* Entrada del focus sticky top label */

.contact__input:not(:placeholder-shown).contact__input:not(:focus) + .contact__label {

  top: -.75rem;
  font-size: var(--smaller-font-size);
  z-index: 10;

}

/*=============== EXTRA INFORMACIÓN ===============*/

.extra {

  margin-bottom: 10rem;

}

.extra__container {

  row-gap: 3rem;

}

.extra__logo {

    display: inline-flex;
    align-items: center;
    column-gap: .5rem;
    color: var(--title-color);
    text-transform: uppercase;
    font-weight: 700;
    letter-spacing: -1px;
    margin-bottom: var(--mb-2-5);
    transition: .3s;

}

.extra__logo-icon {
  
    font-size: 1.15rem;
    color: var(--first-color);
  
}

.extra__logo:hover {

    color: var(--first-color);

}

.extra__title {

  font-size: var(--h3-font-size);
  margin-bottom: var(--mb-1-5);

}

.extra__subscribe {

  background-color: var(--first-color-lighten);
  padding: .75rem;
  display: flex;
  justify-content: space-between;
  border-radius: .5rem;

}

.extra__input {

  width: 70%;
  padding: 0 .5rem;
  background: none;
  color: var(--text-color);
  border: none; outline: none;

}

.extra__data {

  display: grid;
  row-gap: .75rem;

}

.extra__info {

  font-size: var(--small-font-size);

}

.extra__social {

  display: inline-flex;
  column-gap: .75rem;

}

.extra__social-link {

  font-size: 1rem;
  color: var(--text-color);
  transition: .3s;

}

.extra__social-link:hover {

  transform: translateY(-.25rem);

}

.extra__cards {

  display: inline-flex;
  align-items: center;
  column-gap: .5rem;

}

.extra__card {

  width: 35px;

}

/*=============== FOOTER ===============*/

footer {

  display: fixed;
  justify-content: center;
  align-items: center;
  position: relative;
  width: 100%;
  background: #3e6553;
  color: white;
  /* background: var(--first-color-light); */
  min-height: 100px;
  padding: 20px 50px;
  flex-direction: column;

}

footer .social_icon, footer .menu {

  position: relative;
  display: flex;
  justify-content: center;
  align-items: center;
  margin: 10px 0;
  flex-wrap: wrap;

}

/* footer .social_icon li a {

  font-size: 2em;
  color: hsl(var(--hue), 24%, 32%);
  margin: 0 10px;
  display: inline-block;
  transition: .5s;
  
} */

/* footer .social_icon li a:hover {
  
  transform: translateY(-10px);

} */

footer .menu li a {

  font-size: 1.2em;
  color: hsl(var(--hue), 24%, 32%);
  margin: 0 10px;
  display: inline-block;
  opacity: .9;

}

footer .menu li a:hover {

  opacity: 1;

}

footer p {

  color: hsl(var(--hue), 24%, 32%);
  text-align: center;
  margin-top: 10px;
  margin-bottom: 10px;
  font-size: 1.1em;

}

footer .wave {
  
    position: absolute;
    top: -100px;
    left: 0;
    width: 100%;
    height: 100px;
    /*background: url(.assets/wave.png);*/
    background-size: 1000px 100px;
    z-index: -10000;

  }
  
/* footer .wave#wave1 {

  z-index: -10000;
  opacity: 1;
  bottom: 0;
  animation: animationWave 4s linear infinite;

} */

/* footer .wave#wave2 {

  z-index: -9999;
  opacity: .5;
  bottom: 10px;
  animation: animationWave2 4s linear infinite;

} */

/* footer .wave#wave3 {

  z-index: -10000;
  opacity: .3;
  bottom: 15px;
  animation: animationWave2 3s linear infinite;

} */

/* footer .wave#wave4 {

  z-index: -10000;
  opacity: .7;
  bottom: 20px;
  animation: animationWave2 3s linear infinite;

} */

/* @keyframes animationWave {

  0% {
    background-position-x: 1000px;
  }
  100% {
    background-position-x: 0px;
  }

}

@keyframes animationWave2 {

  0% {
    background-position-x: 0px;
  }
  100% {
    background-position-x: 1000px;
  }

} */

/*=============== SCROLL UP ===============*/

.scrollup {

  position: fixed;
  background-color: var(--first-color);
  right: 1rem;
  bottom: -30%;
  display: inline-flex;
  padding: 0.5rem;
  border-radius: .25rem;
  z-index: var(--z-tooltip);
  opacity: .8;
  transition: .4s;

}

.scrollup__icon {

  font-size: 1rem;
  color: #FFF;

}

.scrollup:hover {

  background-color: var(--first-color-alt);
  opacity: 1;

}

/* Mostrar Scroll Up*/

.show-scroll {

  bottom: 2rem;

}

/*=============== BARRA DE SCROLL ===============*/

::-webkit-scrollbar {

  width: .6rem;
  background-color: hsl(var(--hue), 4%, 53%);

}

::-webkit-scrollbar-thumb {

  background-color: hsl(var(--hue), 4%, 29%);
  border-radius: .5rem;

}

/*=============== BREAKPOINTS ===============*/

/* Para dispositivos pequeños */

@media screen and (max-width: 320px) {
    
  .container {

    margin-left: var(--mb-1);
    margin-right: var(--mb-1);
    margin-bottom: var(--mb-2);

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

    font-size: var(--small-font-size);

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

    font-size: var(--h3-font-size);
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

  .section__title, .section__title-center {

    font-size: var(--h1-font-size);

  }

  .about__img {

    width: 400px;


  }

  .steps__container {

    grid-template-columns: repeat(3, 1fr);

  }

  .steps__card-title {

    font-size: var(--normal-font-size);

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

    font-size: var(--normal-font-size);

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

    font-size: var(--h3-font-size);

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

@media screen and (min-width: 1280px) {

  body {

    zoom: 110%;

  }

  .home {

    padding: 100px 0px 0px 89px;

  }
    
}

@media screen and (max-width: 1280px) {

  .home {

    padding: 100px 0px 0px 89px;

  }
    
}

/*=============== LOADER ANIMATION ===============*/

.section__loader {

  position: fixed;
  width: 100%; height: 100%;
  top: 0; left: 0;
  display: flex;
  justify-content: center;
  align-items: center;
  min-height: 100vh;
  background: #042104;
  animation: animateBg 1s linear infinite;
  z-index: 9999999999;

}

.section__loader.hidden {

  top: 120%;

}


@keyframes animateBg {

  0% {

    filter: hue-rotate(0deg);

  }

  100% {

    filter: hue-rotate(360deg);

  }

}

.section__loader .loader {

  position: relative;
  width: 120px;
  height: 120px;


}

.section__loader .loader span {

  position: absolute;
  width: 100%; height: 100%;
  top: 0; left: 0;
  transform: rotate(calc(18deg * var(--i)));
  
}

.section__loader .loader span::before {
  
  content: '';
  position: absolute;
  width: 15px; height: 15px;
  top: 0; left: 0;
  background: #00FF0a;
  border-radius: 50%;
  box-shadow: 0 0 10px #00FF0a,
              0 0 20px #00FF0a,
              0 0 40px #00FF0a,
              0 0 60px #00FF0a,
              0 0 80px #00FF0a,
              0 0 100px #00FF0a;
  
  animation: animate 2s linear infinite;
  animation-delay: calc(0.1s * var(--i));

}

@keyframes animate {

  0% {

    transform: scale(1);

  }

  80%, 100% {

    transform: scale(0);

  }

}


.loader__container {

  position: fixed;
  top: 0; left: 0;
  width: 100%;
  height: 100%;
  background: var(--first-color-dark);
  background-size: cover;
  z-index: 999999;
  display: flex;
  justify-content: center;
  align-items: center;

}

.loader__container.loader {

  top: -120%;

}

</style>
