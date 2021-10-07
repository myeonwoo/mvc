<template>
  <div class="container">
    <h1>Login</h1>

    <AuthForm buttonText="Register" :submitForm="registerUser" hasName="true" />
  </div>
</template>

<script>
  import AuthForm from '@/components/user/AuthForm'
  
  export default {
    components: {
      AuthForm
    },
    methods: {
      async registerUser(registrationInfo){
        registrationInfo.password_confirmation = registrationInfo.password;
        console.log(registrationInfo);
        await this.$axios.$post('http://127.0.0.1:8000/api/auth/register', registrationInfo)
          .then(response=>{
            console.log(['success',response])
          })
          .catch(error=>{
            console.log(['error',error])
          });
          
        this.$auth.loginWith('local', {
          data: registrationInfo
        });
        return;

      }
    }
  }
</script>

<style lang="scss" scoped>

</style>