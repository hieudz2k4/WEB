import { createApp } from 'vue'
import App from './App.vue'
import './style.css'

/* import the fontawesome core */
import { library } from '@fortawesome/fontawesome-svg-core'

/* import font awesome icon component */
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'

/* import specific icons */
import { fas } from '@fortawesome/free-solid-svg-icons'
import store from './store'
import router from './routers/router.js'

/* add icons to the library */
library.add(fas)

createApp(App)
.component('font-awesome-icon', FontAwesomeIcon)
.use(store)
.use(router)
.mount('#app')
