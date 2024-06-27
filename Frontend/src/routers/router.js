import { createRouter, createWebHistory} from "vue-router";

import HomePage from "@/pages/HomePage.vue";
import AboutUsPage from "@/pages/AboutUsPage.vue";
import SolutionsPage from "@/pages/SolutionsPage.vue";
import CareerPage from "@/pages/CareerPage.vue";
import ContactUsPage from "@/pages/ContactUsPage.vue";

const routes = [
    {path: '/', component: HomePage},
    {path: '/AboutUs', component: AboutUsPage},
    {path: '/Solutions', component: SolutionsPage},
    {path: '/Career', component: CareerPage},
    {path: '/ContactUs', component: ContactUsPage}
];

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router