<template>
  <div>
    We are in video {{ video.name }}.
    <nuxt-link :to="`/sc/videos/${video.id}/edit`">
    <button>Edit</button>
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