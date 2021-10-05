<template>
  <div>
    <h6>파일 : sc/videos/_id/index.vue</h6>

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