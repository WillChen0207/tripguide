import { createApp } from 'vue'
import './index.css'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import Homepage from './Homepage.vue'

const homepage = createApp(Homepage)

homepage.use(ElementPlus)

homepage.mount('#homepage')
