<template>
    <nav>
        <ul class="menu" v-bind:class="{'menu-open': isActive}">
            <li>
                <router-link to="/keyboards">Main</router-link>
            </li>
            <li>
                <router-link to="/categories">Category</router-link>
            </li>
            <li>
                <router-link to="/about">About</router-link>
            </li>
        </ul>
    </nav>
</template>

<script>
import {mapGetters} from 'vuex';
export default {
    computed: {
        ...mapGetters('common', {isActive: 'isMenuActive'})
    }
};
</script>

<style scoped>
ul {
    visibility: hidden;
    margin: 0;
    height: 0vh;
    background-color: var(--accent-color);
    list-style: none;
    padding-left: 1rem;
}

li {
    padding: 0.6rem;
    font-size: 1.2rem;
    font-weight: 600;
}

a {
    color: var(--icon-color);
}
.menu-open {
    animation-name: dropdown;
    animation-duration: 0.3s;
    animation-timing-function: linear;
    height: 100%;
    visibility: visible;
}

@keyframes dropdown {
    from {
        opacity: 0;
        transform: rotateX(-45deg);
    }
    to {
        opacity: 1;
        transform: rotateX(30deg);
    }
}
</style>
