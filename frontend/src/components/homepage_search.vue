<template>
    <div class="absolute top-[550px] w-full h-screen max-h-96 flex justify-center z-20">
        <el-card shadow="hover" class="w-4/6">
            <el-tabs type="card">
                <el-tab-pane label="住宿" name="hotel" class="flex justify-center space-x-10">
                    <div class="rounded-lg hover:shadow-2xl w-1/4 h-10 bg-gray-100">
                        <el-input placeholder="请选择入住日期" class="h-full"/>
                    </div>
                    <div class="rounded-lg hover:shadow-2xl w-1/4 h-10 bg-gray-100">
                        <el-input placeholder="请选择离宿日期"  class="h-full"/>
                    </div>
                </el-tab-pane>
                <el-tab-pane label="航班" name="flight">航班</el-tab-pane>
                <el-tab-pane label="轨道交通" name="railway">轨道交通</el-tab-pane>
            </el-tabs>
        </el-card>
    </div>
</template>

<script>
    export default {
        name: "homepage_search"
    }
</script>

<style scoped>

</style>