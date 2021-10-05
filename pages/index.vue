<template>
  <div>
    <div class="container">
      <Hero />
      <LargeCardDisplay 
        v-for="cardInfo in largeCardSections"
        :key="cardInfo.id"
        :cardsSection="cardInfo"
      />
      <hr>
      <h3>Small cards here</h3>
      <SmallCardDisplay
        v-for="cardInfo in smallCardSections"
        :key="cardInfo.id"
        :cardsSection="cardInfo"
      />
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
