<template>
  <div>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark padding">
      <NuxtLink class="navbar-brand" to="/">Home</NuxtLink>
      <NuxtLink class="navbar-brand" to="/fire/">Fire</NuxtLink>
      <NuxtLink class="navbar-brand" to="/todolist/">Todo List</NuxtLink>


      <div class="collapse navbar-collapse ml-auto">
        <ul v-if="$auth.loggedIn" class="navbar-nav ml-auto">
          <li class="nav-item active">
            <span class="nav-link">{{$auth.user.email}}</span>
          </li>
          <li class="nav-item active">
            <b-button @click="$auth.logout()" >Logout</b-button>
            <!-- <NuxtLink to="/user/logout" class="nav-link">Logout</NuxtLink> -->
          </li>
        </ul>
        <ul v-else class="navbar-nav ml-auto">
          <li class="nav-item active">
            <NuxtLink to="/user/login" class="nav-link">Login</NuxtLink>
          </li>
          <li class="nav-item active">
            <NuxtLink to="/user/register" class="nav-link">Register</NuxtLink>
          </li>
        </ul>
      </div>
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
  #default-body {
    margin-top: 20px;
  }
</style>