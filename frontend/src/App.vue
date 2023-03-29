<template>
  <div id="app">
    <img src="./assets/logo.png">
    <HelloWorld/>
    <h1>Hello, {{testAns}}</h1>
  </div>
</template>

<script>
import HelloWorld from './components/HelloWorld'
import {
  GetTest
} from './api/main/main'

let getTest = function () {
  GetTest().then(res => {
    this.testAns = res.data
  })
}

export default {
  name: 'App',
  data() {
    return {
      testAns: 'Test not succeeded.',
    }
  },
  components: {
    HelloWorld
  },
  methods: {
    getTest:getTest
  },
  created() {
    this.getTest()
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
