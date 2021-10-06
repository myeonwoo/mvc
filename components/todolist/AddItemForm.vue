<template>
  <div>
    <div class="addItem">
      <input type="text" v-model="item.name" class="btn" />
      <button 
        @click="addItem()"
        :class="[item.name ? 'active': 'inactive', 'btn plus']"
      >추가</button>
    </div>
  </div>
</template>

<script >
  export default {
    data(){
      return {
        item: {
          name:""
        }
      }
    },
    methods:{
      async addItem() {
        if (this.item.name == ''){
          return;
        }
        await this.$axios.$post('http://127.0.0.1:8000/api/item/store', {
          item: this.item
        })
        .then( response => {
          this.item.name="";
          this.$emit('reloadlist');
        })
        .catch( error => {
          console.log(error);
        })
      },
    }
  }
</script>

<style scoped>
  .addItem {
    display:flex;
    justify-content: safe center;
    align-items: center;
  }
  input{
    background: #f7f7f7;
    border: 0px;
    outline: none;
    padding: 5px;
    margin-right: 10px;
    width: 70%;
  }
  .plus{
    background-color: #F6EAEA;
    font-size: 20px;
  }
  .active{
    color: #00ce25;
  }
  .inactive{
    color: #999999;
  }
</style>
