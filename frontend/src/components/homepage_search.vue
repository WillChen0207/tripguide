<template>
    <div class="absolute top-[550px] w-full h-screen max-h-96 flex justify-center z-20">
        <el-card shadow="hover" class="w-4/6">
            <el-tabs type="card" v-model="activeTab">
                <el-tab-pane label="住宿" name="hotel" class="flex flex-row space-x-10">
                        <div class="">
                            <el-date-picker
                                v-model="dateRange"
                                type="daterange"
                                range-separator="至"
                                start-placeholder="入榻日期"
                                end-placeholder="离宿日期"
                                size="large"
                            />
                        </div>
                        <div class="float-right">
                            <button type="button" class="py-2 px-10 text-black font-semibold rounded-full shadow-2xl bg-blue-200" @click="checkDate">
                                <p>检索</p>
                            </button>
                        </div>
                        <div>
                            {{dateRange}}
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
        name: "homepage_search",
        data() {
            const end = new Date()
            const start = new Date()
            start.setTime(start.getTime() - 3600 * 1000 * 24 * 7)
            return {
                dateRange: [start, end],
                activeTab: "hotel"
            }
        },
        methods: {
            checkDate() {
                console.log(this.dateRange)
            }
        }
    }
</script>

<style scoped>

</style>