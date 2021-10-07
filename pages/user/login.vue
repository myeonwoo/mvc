<template>
  <div class="container">
    <h1>Login</h1>

    <AuthForm buttonText="Login" :submitForm="loginUser" />
  </div>
</template>

<script>
  import AuthForm from '@/components/user/AuthForm'
  
  export default {
    components: {
      AuthForm
    },
    methods: {
      loginUser(logininfo){
        this.$auth.loginWith('local', {
          data: logininfo
        });
        console.log('You pressed a button')
      }
    }
  }
</script>

<style lang="scss" scoped>

</style>