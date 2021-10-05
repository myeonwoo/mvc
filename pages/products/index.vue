<template>
  <div>
    <div class="container">
      <LargeCardDisplay
        v-for="cardInfo in largeCardSections.slice(0,1)"
        :key="cardInfo.id"
        :cardsSection="cardInfo"
      />
      <hr>
      <SmallCardDisplay 
        v-for="cardInfo in smallCardSections"
        :key="cardInfo.id"
        :cardsSection="cardInfo"
      /> 
    </div>
  </div>
</template>

<script>
  import { largeCardSections, smallCardSections } from "@/assets/data.js"
  export default {
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