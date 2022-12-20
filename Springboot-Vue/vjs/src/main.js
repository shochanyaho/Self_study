import { createApp } from 'vue'
import App from './App.vue'
import css from './assets/style.css'

const app = createApp(App)
app.use(css)
app.mount('#app')