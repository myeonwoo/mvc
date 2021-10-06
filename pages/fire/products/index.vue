<template>
  <div>
    <div class="container">
      <fireLargeCardDisplay
        v-for="cardInfo in largeCardSections.slice(0,1)"
        :key="'A' + cardInfo.id"
        :cardsSection="cardInfo"
      />
      <hr>
      <fireSmallCardDisplay 
        v-for="cardInfo in smallCardSections"
        :key="'B' + cardInfo.id"
        :cardsSection="cardInfo"
      /> 
    </div>
  </div>
</template>

<script>
  import { largeCardSections, smallCardSections } from "@/assets/data.js"
  export default {
    layout: "fire/default",
    data(){
      return {
        largeCardSections: largeCardSections,
        smallCardSections: smallCardSections
      }
    }
  }
</script>

<style scoped>

</style>