<template>
    <div v-if="showLogIn" class="backdrop-blur-3xl bg-[#1971CA]/15 flex justify-center rounded-3xl">
        <div class="text-white p-6">
            <h1 class="text-3xl font-bold">Login</h1>
            <div class="mt-[0.75rem]">
                <h1 class="text-sm">Email</h1>
                <div class="flex items-center bg-white rounded-md w-[21rem]">
                    <input v-model="userName" class="text-black outline-none w-[21rem] p-1 pl-1.5 rounded-md" type="email" placeholder="username">
    
                </div>
                <h1 v-if="checkEmptyUserName() && countSignIn > 0" class="">Please fill in this section</h1>
            </div>
            <div class="mt-[0.75rem]">
                <h1 class="text-sm">Password</h1>
                <div class="flex items-center bg-white rounded-md w-[21rem]">
                    <input v-model="password" class="text-black outline-none w-[21rem] p-1 pl-1.5 rounded-md" type="password" placeholder="Password">
                </div>
                <h1 v-if="checkEmptyPassword() && countSignIn > 0" class="text-red-500 text-sm">Please fill in this section</h1>
            </div>
            <h1 class="text-sm mt-3 hover:cursor-pointer hover:underline">Forget Password?</h1>
            <button class="mt-7 bg-[#023464] w-[21rem] p-1 rounded-md hover:bg-[#304456]" @click="signIn()">Sign In</button>
            <h1 class="text-center mt-6 text-sm">Or continue with</h1>
            <div class="flex flex-ro justify-around mt-6">
                <img src="../assets/google.png" class="size-7 hover:size-10 hover:cursor-pointer">
                <img src="../assets/github.png" class="size-7 hover:size-10 hover:cursor-pointer">
                <img src="../assets/facebook.png" class="size-7 hover:size-10 hover:cursor-pointer">
            </div>
            <div class="mt-5 flex flex-row text-sm justify-center">
                <h1>Don't have an account yet?</h1>
                <h1 class="font-bold hover:cursor-pointer hover:underline">Register for free</h1>
            </div>
        </div>
        <img @click="clickClose()" class="size-6 hover:cursor-pointer mt-6 mr-5" src="../assets/circle.png">
    </div>
</template>
<script>
    import axios from 'axios'
    import store from '../store.js'
    import { mapState } from 'vuex'
    export default {
        data() {
            return {
                countSignIn: 0,
                userName: '',
                password: ''
            }
        }, 
        computed: {
            ...mapState({
                showLogIn: state => state.showLogIn
            })
        },
        props: {
            
        },
        methods: {
            clickClose() {
                store.commit('changeShowLogIn')
            },
            signIn() {
                this.countSignIn++;
                if(this.checkEmpty()) {
                    console.log("empty")
                } else {
                    axios.post('http://localhost:8088/v1/login', {
                        userName: this.userName,
                        password: this.password
                    }).then((res) => {
                        console.log(res)
                    })
                }
                return true;
            }, 
            checkEmptyUserName() {
                return !this.userName.length
            },
            checkEmptyPassword() {
                return !this.password.length 
            },
            checkEmpty() {
                return (this.checkEmptyUserName() || this.checkEmptyPassword()) 
            }
        }
    }

</script>