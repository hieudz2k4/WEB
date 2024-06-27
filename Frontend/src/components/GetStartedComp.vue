<template>
    <div class="w-full text-center mt-40 justify-center">
        <h1 class="text-white text-[4rem]">{{ text }}</h1>
        <h1></h1>
        <div class="bg-[#03071C] text-white p-3 w-48 flex flex-row items-center justify-around rounded-full mt-5 relative sm:left-1/3 md:left-[38%] lg:left-[41.5%] xl:left-[43%] 2xl:left-[45%]">
            <button @click="clickGetStartedBtn()">GET STARTED</button>
            <font-awesome-icon icon="arrow-right" />
        </div>
        <font-awesome-icon v-for="i in 3" :key="i" class="text-[0.75rem] mt-5 px-1 pt-4 text-blue-50" :class="{'text-blue-500': i == numberOrder}" icon="circle" />
    </div>
</template>
<script>
    export default {
        data() {
            return {
                text: "Welcome to our website",
                textArr: ["Welcome to our website", "We offer exceptional solutions", "Explore boundless possibilities with us"],
                numberOrder: 1
            }
        }, 
        props: {

        },
        methods: {
            clickGetStartedBtn() {
                this.numberOrder++
                if (this.numberOrder > 3) this.numberOrder = 1
                this.text = this.textArr[this.numberOrder-1]
            },
            autoChange() {
                setInterval(
                    () => {
                        this.clickGetStartedBtn()
                    }, 2500
                )
            }

        },
        mounted() {
            this.autoChange()
        }
    }
</script>