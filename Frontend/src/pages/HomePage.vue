<template>
    <div class="bg-slate-400 w-full min-h-screen pt-1">
      <NavBarComp :class="{'blur-xl':store.state.showLogIn}"/>
      <GetStartedComp :class="{'blur-xl':store.state.showLogIn}"/>
      <TailWebComp :class="{'blur-xl':store.state.showLogIn}"/>
      <LogInComp class="absolute top-[18%] left-1/4 justify-center"/>
    </div>
  </template>
  <script>
    import NavBarComp from "../components/NavBarComp.vue";
    import GetStartedComp from "../components/GetStartedComp.vue";
    import TailWebComp from "../components/TailWebComp.vue";
    import LogInComp from "../components/LogInComp.vue";
    import store from "@/store";
    
    export default {
      components: {
        NavBarComp,
        GetStartedComp,
        TailWebComp,
        LogInComp
      }, 
      data() {
        return {
          store: store
        }
      }
    }
  </script>
  <style>
  
  </style>