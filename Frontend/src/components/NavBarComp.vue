<template>
    <nav class="flex flex-row justify-center mt-10 flex-grow">
        <div class="items-center flex mr-10">
            <font-awesome-icon icon="paper-plane" class="text-xl text-[#885DFE]"/>
        </div>
        <div class="bg-[#81838C] flex flex-row p-3 rounded-3xl w-2/3">
            <ul class="flex flex-row text-white text-[0.8rem] justify-around w-full">
                <li>
                    <router-link to="/" class="hover:text-blue-300">HOME</router-link>
                </li>
                <li>
                    <router-link to="/AboutUs" class="hover:text-blue-300">ABOUT US</router-link>
                </li>
                <li>
                    <router-link to="/Solutions" class="hover:text-blue-300">SOLUTIONS</router-link>
                </li>
                <li>
                    <router-link to="/Career" class="hover:text-blue-300">CAREER</router-link>
                </li>
                <li>
                    <router-link to="/ContactUs" href="" class="hover:text-blue-300">CONTACT US</router-link>
                </li>
                
            </ul>
        </div>
        <div class="ml-5 text-[0.8rem] p">
            <button @click="clickLogIn(showLogIn)" class="bg-[#885DFE] h-full text-white pl-5 pr-5 rounded-3xl">LOGIN</button>
        </div>
    </nav>
</template>
<script>
    import store from '@/store';

    
    export default {
        data() {
            return {
            }
        },
        computed: {
            showLogIn() {
                return store.state.showLogIn
            }
        },
        props: {
            
        },
        methods: {
            clickLogIn(check) {
                if (check == false) {
                    store.commit('changeShowLogIn')
                    console.log(check)
                    console.log("click");
                }
            }
        }
    }
</script>