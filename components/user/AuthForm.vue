<template>
  <div>
    <b-form>
      <b-form-group
        id="input-group-1"
        label="Name:"
        label-for="input-1"
        v-if="hasName"
      >
        <b-form-input
          id="input-1"
          v-model="userInfo.name"
          placeholder="Enter name"
          required
        ></b-form-input>
      </b-form-group>
      <b-form-group
        id="input-group-2"
        label="Email address:"
        label-for="input-2"
        description="We'll never share your email with anyone else."
      >
        <b-form-input
          id="input-2"
          v-model="userInfo.email"
          type="email"
          placeholder="Enter email"
          required
        ></b-form-input>
      </b-form-group>

      <b-form-group
        id="input-group-3"
        label="Password:"
        label-for="input-3"
        @click="showPassword = !showPassword"
      >
        <b-form-input
          id="input-3"
          v-model="userInfo.password"
          :type="showPassword ? 'text' : 'password'" 
          placeholder="Enter password"
          required
        ></b-form-input>
      </b-form-group>

      <b-button 
        @click="submitForm(userInfo)" 
        :disabled="!valid" 
        variant="danger">
        {{buttonText}}
      </b-button>
    </b-form>

  </div>
  <!-- <v-form v-model="valid">
    <v-text-field v-model="userInfo.name" 
    label="Name" 
    :rules="[required('name')]"
    v-if="hasName" />

    <v-text-field v-model="userInfo.email" 
    label="Email" 
    :rules="[required('email'), emailFormat()]"/>

    <v-text-field v-model="userInfo.password"
    label="Password"
    :type="showPassword ? 'text' : 'password'" 
    :append-icon="showPassword ? 'mdi-eye' : 'mdi-eye-off'"
    @click:append="showPassword = !showPassword"
    counter=true
    :rules="[required('password'), minLength('password', 8)]"
    />

    <v-btn @click="submitForm(userInfo)" :disabled="!valid">{{ buttonText }}</v-btn>
  </v-form> -->
</template>

<script>
  import validations from "@/utils/validations";

  export default {
    data() {
      return {
        valid: true,
        showPassword: false,
        userInfo: {
          name: 'myeonwoo',
          email: 'mw.lim@gmail.com',
          password: '123456'
        },
        ...validations
      }
    },
    props: ["submitForm", "buttonText", "hasName"]
  }
</script>

<style lang="scss" scoped>

</style>