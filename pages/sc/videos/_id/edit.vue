<template>
  <div>
    <h1>Editing {{ video.name }} </h1>
    <nuxt-link :to="`/sc/videos/${video.id}`">
    <button>Go back to show</button>
    </nuxt-link>
  </div>
</template>

<script>
  export default {
    layout: 'sc/default',
    props: ['video']
  }
</script>

<style lang="scss" scoped>
</style>