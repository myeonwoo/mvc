<template>
  <div>
    <h6>파일 : sc/videos/index.vue</h6>

    <nuxt-child />
    <h1>Videos</h1>
    <div v-for="video in videos" :key="video.id">
      <nuxt-link :to="`/sc/videos/${video.id}`">{{video.id}} : {{ video.name }}</nuxt-link>
    </div>
  </div>
</template>

<script>
  export default {
    layout: 'sc/default',
    data () {
      return {
        videos: [{
          id: '16',
          name: 'Intro to NuxtJS'
        }, {
          id: '1',
          name: 'Intro to VueJS'
        }, {
          id: '71',
          name: 'Advanced Techniques for Library X'
        }]
      }
    }
  }
</script>

<style scoped>
</style>