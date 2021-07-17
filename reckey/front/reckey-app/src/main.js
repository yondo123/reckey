import { createApp } from 'vue'
import App from './App.vue'
import { library } from '@fortawesome/fontawesome-svg-core'
import { faBars, faUser} from '@fortawesome/free-solid-svg-icons'
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome'
import './assets/style.css'
import '@fortawesome/fontawesome-free/js/all.js'

library.add(faBars, faUser);
const reckeyApp = createApp(App);
reckeyApp.component('font-awesone-icon', FontAwesomeIcon);
reckeyApp.mount('#app');
