<template>
    <nav class="sm:px-16 px-6 w-full flex items-center py-5 fixed top-0 z-20 bg-white">
        <img src="../assets/logo.svg" class="w-9 h-9 object-contain mr-5"/>
        <div class="w-full flex items-center max-w-7xl mx-auto">
            <p class='text-black text-[18px] font-bold cursor-pointer flex '>
                TripGuide &nbsp;
                <span class='sm:block hidden'> | Your trip assistant</span>
            </p>
        </div>
        <el-divider direction="vertical" />
        <img src="../assets/vue.svg" class="w-9 h-9 object-contain mr-5 float-right"/>
        <p class="font-bold">{{logUser}}</p>
    </nav>
</template>

<script>
    export default {
        name: "homepage_nav",
        data() {
            return {
                logUser: "Administrator"
            }
        }
    }
</script>

<style scoped>

</style>