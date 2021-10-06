<template>
  <div>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark padding">
      <NuxtLink class="navbar-brand" to="/">Home</NuxtLink>
      <NuxtLink class="navbar-brand" to="/todolist/">Todo List</NuxtLink>
    </nav>

    <div id="default-body">
      <nuxt />
    </div>
  </div>
</template>

<style scoped>
  .padding {
    padding: 1.5rem;
    background-color: black
  }
  .nav-left {
    margin-left: auto;
  }
</style>