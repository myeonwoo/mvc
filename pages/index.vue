<template>
  <div>
    <div class="container">
      <ul>
        <li><NuxtLink to="/fire">App #1 : Firngii</NuxtLink></li>
        <li><NuxtLink to="/todolist">App #2 : Todo List</NuxtLink></li>
        <li>App #3</li>
      </ul>
    </div>
  </div>
</template>

<script>
import {largeCardSections, smallCardSections} from "@/assets/data.js"
export default {
  data(){
    return {
      largeCardSections: largeCardSections,
      smallCardSections
    }
  }
}
</script>
<style>
</style>
