import {createApp} from 'vue'
import './index.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import App from './App.vue'
import router from './index.js'

createApp(App)
    .use(ElementPlus)
    .use(router)
    .mount('#app')

