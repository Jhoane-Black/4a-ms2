<template>
  <div id="app">

    <!-- <div>
      <button v-if="is_auth" v-on:click="logout">
          <span>Cerrar sesión</span>
      </button>
    </div> -->

    <router-view v-on:completedLogin="completedLogin"></router-view>

  </div>
</template>

<script>
export default {
    name: "App", // Nombre del componente
    data: function() {
      return {
        is_auth: false
      }
    }, // Todas las variables de este componentes
    methods: {
      verifyAuth(){
        this.is_auth = localStorage.getItem("is_auth") || false;
        console.log(this.is_auth);
        if(this.is_auth){
          this.loadIndex();
        }else{
          this.loadLogIn();
        }
      },  
      loadLogIn(){
        this.$router.push({name: "logIn"});
      },
      loadSignUp(){
        this.$router.push({name: "signUp"});
      },
      loadCarrito(){
        this.$router.push({name: "carrito"});
      },
      loadIndex(){
        this.$router.push({name: "index"});
      },
      completedLogin(data){
        this.is_auth = true;
        localStorage.setItem("is_auth", true);
        localStorage.setItem("token", data.token);
        localStorage.setItem("username", data.username);
        this.verifyAuth()
      },
      logout(){
        this.is_auth = false;
        localStorage.clear();
        this.verifyAuth()
      }
    }, // Todas las funciones que usa este componente
    created: function () {
      this.loadIndex();
    } // Eventos: lo que pasa cuando el componente se inicia
};
</script>

<style>

</style>
