<template>
    <div class="shadow-xl w-fit p-7">
        <div class="text-center h-80" 
        @dragover.prevent
        @dragenter.prevent
        @dragleave.prevent
        @drop.prevent="handleDrop"
        >
            <h1 class="font-bold mb-6 text-xl">Upload</h1>
            <div class="flex flex-col border border-dotted border-black h-56 items-center justify-around p-5">
                <img src="@/assets/upload.png" alt="" srcset="" class="size-14 ">
                <h1 class="font-bold">
                    Drag & drop files or
                    <strong class="text-blue-500 underline cursor-pointer">Browser</strong>
                </h1>
                <label class="bg-slate-400 text-slate-100 font-bold p-1.5 rounded-lg hover:bg-slate-700">
                    <input ref="inputFromLocalAtt" @change="inputFromLocalMethod()" class="hidden" type="file" accept="image/*">
                    <h1>Upload Image From Local</h1>
                </label>
                <h1 class="text-sm font-extralight text-">Supported image file formates: JPEG, PNG, JPG, GIF,...</h1>
            </div>
            <h1>Uploading</h1>
            <div></div>
            <h1>Uploaded</h1>
            <div></div>
            <button @click="uploadFile()" class="bg-blue-500 w-full rounded-sm pt-1 pb-1 text-white font-bold">Upload files</button>
        </div>
    </div>
</template>
<script>
import axios from 'axios'

    export default {
        data() {
            return {
                count: 0,
                nameFileStack: []
            }
        },
        methods: {
            handleDrop() {
                console.log("Hello world")
                console.log(event.dataTransfer.file)
            },

            inputFromLocalMethod() {
                var file = this.$refs.inputFromLocalAtt.files[0]
                console.log(file)
                console.log(file.name)
                this.count++
                console.log(this.count)
            },

            uploadFile() {
                console.log("Upload")
            }
        },
        created() {
            axios.get("http://localhost:8080/actressName")
            .then(res => {
                console.log(res)
            })
            .catch(err => {
                console.log(err)
            })
        }
    }


</script>