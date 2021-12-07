import { createRouter, createWebHashHistory } from 'vue-router'
import App from './src/App.vue'
/*import Carrito from './src/components/carrito.vue'*/
/*import Index from './src/components/index.vue'*/
const routes = [
  {
    path: '/',
    name: 'root',
    component: App
  },
/*{
    path: '/carrito',
    name: 'carrito',
    component: Carrito
  },*/
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
