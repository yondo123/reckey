import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import { store } from './store/store.js';
import { library } from '@fortawesome/fontawesome-svg-core';
import { faBars, faUser } from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeIcon } from '@fortawesome/vue-fontawesome';
import './assets/style.css';
import '@fortawesome/fontawesome-free/js/all.js';

//font-awesome
library.add(faBars, faUser);

//vue app create
const reckeyApp = createApp(App);
reckeyApp.component('font-awesone-icon', FontAwesomeIcon);
reckeyApp.use(router);
reckeyApp.use(store);
reckeyApp.mount('#app');
