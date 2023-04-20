import { createRouter, createWebHistory } from 'vue-router'
import Homepage from "./components/Homepage.vue";

//路由数组
const routes = [
    {   path: '/', redirect: '/homepage'},
    {   path: '/homepage', component: Homepage  },
]

//路由对象
const router = createRouter({
    history: createWebHistory(),
    routes //上面的路由数组
})

//导出路由对象，在main.js中引用
export default router