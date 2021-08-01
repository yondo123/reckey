import { createWebHistory, createRouter } from 'vue-router';
import Keyboard from '../views/Keyboard.vue';
import Categories from '../views/Categories.vue';
import Company from '../views/Company.vue';
import Keyboards from '../views/Keyboards.vue';

const routes = [
    {
        path: '/',
        redirect: '/keyboards'
    },
    {
        path: '/keyboards',
        component: Keyboards
    },
    {
        path: '/categories',
        component: Categories
    },
    {
        path: '/company/:id',
        component: Company,
        children: [
            {
                path: 'keyboard',
                component: Keyboard
            }
        ]
    }
];

const router = createRouter({
    history: createWebHistory(),
    routes
});

export default router;
