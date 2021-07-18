<template> 
  <div class="wrap">
    <reckey-header></reckey-header>
    <reckey-navbar></reckey-navbar>
    <router-view></router-view>
    <reckey-footer></reckey-footer>
  </div>
</template>

<script>
import ReckeyHeader from './components/ReckeyHeader.vue';
import ReckeyFooter from './components/ReckeyFooter.vue';
import ReckeyNavbar from './components/ReckeyNavbar.vue';

export default {
  name: 'App',
  components: {
    ReckeyHeader,
    ReckeyFooter,
    ReckeyNavbar
  }
}
</script>

<style>
</style>
