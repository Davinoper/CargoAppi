import Vue from 'vue'
import VueRouter from 'vue-router'
import Carga from '/src/views/Carga.vue'

Vue.use(VueRouter)

const router = new VueRouter({
    routes:[
      {
        path: '/carga',
        name: 'carga',
        component: Carga
      },
    ]
  })



export default router
