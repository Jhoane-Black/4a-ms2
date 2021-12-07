import { createRouter, createWebHashHistory } from 'vue-router'
import App from './App.vue'
import LogIn from './components/login_signup.vue'
import Carrito from './components/carrito.vue'
/*import Index from './components/index.vue'*/
const routes = [
  {
    path: '/',
    name: 'root',
    component: App
  },
  {
    path: '/logIn',
    name: 'logIn',
    component: LogIn
  },
  {
    path: '/carrito',
    name: 'carrito',
    component: Carrito
  }, 
  /*{
    path: '/index',
    name: 'index',
    component: Index
  },*/
  /*{
    path: '/',
    name: 'recuperacion',
    component: Recuperacion
  },*/

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
