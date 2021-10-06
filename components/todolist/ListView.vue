<template>
  <div>
    <div v-for="(item, index) in items" :key="index">
      <todolistListItem 
        :item="item"
        class="item"
        @itemchanged="$emit('reloadlist')"
      />
    </div>
  </div>
</template>

<script >

  export default {
    props: ['items']
  }
</script>

<style scoped>
  .item{
    background: #e6e6e6;
    padding: 5px;
    margin-top: 5px;
  }
</style>