<template>
    <UploadFileComp/>
</template>
<script>
    import axios from 'axios';
    import UploadFileComp from '@/components/UploadFileComp.vue'

    export default {
        data() {
            return {
                name:""
            }
        },
        methods: {
            chooseImage() {
                this.name = this.$refs.fileInput.files[0].name
            },
            submitData() {
                var file = this.$refs.fileInput.files[0];
                console.log(file)
                axios.post()
                .then()
                .catch(err => {
                    console.log(err)
                })
            }

        },
        components: {
            UploadFileComp
        }

    }

</script>