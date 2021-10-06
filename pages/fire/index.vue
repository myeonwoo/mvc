<template>
  <div>
    <div class="container">
      <fireHero />
      <fireLargeCardDisplay 
      v-for="cardInfo in largeCardSections"
      :key="'A' + cardInfo.id"
      :cardsSection="cardInfo"
      />
      <hr>
      <h3>Small cards here</h3>
      <fireSmallCardDisplay
      v-for="cardInfo in smallCardSections"
      :key="'B' + cardInfo.id"
      :cardsSection="cardInfo"
      />
    </div>
  </div>
</template>

<script>
  import {largeCardSections, smallCardSections} from "@/assets/data.js"
  export default {
    layout: "fire/default",
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
