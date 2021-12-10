import { createRouter, createWebHashHistory } from 'vue-router'
import App from './App.vue'
import LogIn from './components/login.vue'
import signUp from './components/signup.vue'
import Carrito from './components/carrito.vue'
import Productos from './components/productos.vue'
import Index from './components/index.vue'
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
    path: '/signUp',
    name: 'signUp',
    component: signUp
  },
  {
    path: '/carrito',
    name: 'carrito',
    component: Carrito
  }, 
  {
    path: '/index',
    name: 'index',
    component: Index
  },
  {
    path: '/productos',
    name: 'productos',
    component: Productos
  },

]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
