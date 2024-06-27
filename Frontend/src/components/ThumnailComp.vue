<template>
    <div class="bg-white w-72 shadow-xl hover:bg-slate-300">
        <a :href="href">
            <video ref="trailer" :poster="srcPoster" @mousemove="trailerPlay()" @mouseout="mouseOutTrailer()" muted="muted">
                <source :src="srcTrailer" type="video/mp4">
            </video>
            <div class="p-5">
                <h1 class="text-xl font-bold">{{ code }}</h1>
                <h1 class="pt-1 pb-1 text-base hover:cursor-pointer hover:underline">{{ title }}</h1>
                <h1 class="text-xs text-pretty text-slate-600 ">
                    <font-awesome-icon icon="calendar" />
                    Released: {{ release }}
                    <font-awesome-icon icon="clock" class="pl-4" /> 
                    Timer: {{ timer }}
                </h1>
                <h1 class="text-xs text-pretty text-slate-600">
                    <font-awesome-icon icon="venus" />
                    Acress: 
                    <button class="bg-red-500 hover:bg-red-600 pl-1 pr-1 rounded-sm text-xs text-white">{{ nameActress }}</button>
                </h1>
                <h1 class="text-xs text-pretty text-slate-600">
                    <font-awesome-icon icon="video" />
                    Category: 
                </h1>
            </div>
        </a>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                
            }
        },
        props: {
            href: {
                type: String
            },
            srcPoster: {
                type: String
            },
            srcTrailer: {
                type: String
            },
            code: {
                type: String
            },
            title: {
                type: String
            },
            release: {
                type: Date
            },
            nameActress: {
                type: String
            },
            timer: {
                type: Number
            },
            category: {
                type: []
            }

        },
        computed: {
            
        },
        methods: {
            trailerPlay() {
                var trailer = this.$refs.trailer;
                if (trailer.paused) {
                    trailer.play();
                }
            },
            mouseOutTrailer() {
                this.$refs.trailer.load()
            }
        }
    }
</script>
<style>
    
</style>