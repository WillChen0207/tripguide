<template>
    <div class="relative z-0 bg-primary">
        <div class="bg-hero-pattern bg-cover bg-no-repeat bg-center">
            <homepage_nav v-bind:isLogin="isLogin"></homepage_nav>
            <homepage_hero></homepage_hero>
            <homepage_search></homepage_search>
        </div>
    </div>
</template>

<script>
    import homepage_nav from "./homepage_nav.vue";
    import homepage_hero from "./homepage_hero.vue";
    import homepage_search from "./homepage_search.vue";

    export default {
        name: 'Homepage',
        components: {
            homepage_nav,
            homepage_hero,
            homepage_search
        },
        data() {
            return {
                isLogin: true
            }
        },
        methods: {

        }
    }
</script>

<style>
    /* 定义全局样式属性 */
    html,
    body,
    #homepage {
        height: 100%;
        margin: 0;
        padding: 0;
    }
</style>
