<template>
  <div>
    <div v-if="flagApiLive" class="todoListContainer">

      <div class="heading">
        <h4 id="title">리스트</h4>
        <todolistAddItemForm 
        @reloadlist="getList()"
        />
      </div>
      <todolistListView :items="items" @reloadlist="getList()" />
    </div>
    <div v-else class="todoListContainer">

      <div class="heading">
          <h4 id="title">API 서버 반응이 없습니다.</h4>
      </div>
    </div>

  </div>
  
</template>

<script>

  export default {
    layout: "todolist/default",
    data (){
      return {
        items:[],
        flagApiLive: false
      }
    },
    methods: {
      async getList() {
        await this.$axios.$get('http://127.0.0.1:8000/api/items')
        .then(response => {
          this.flagApiLive = true;
          this.items = response;
        })
        .catch(error=>{
          console.log(['error-getList',error]);
          this.flagApiLive = false;
          this.items = [];
        })
      }
    },
    created(){
      this.getList();
    }
  }
</script>

<style scoped>
  .todoListContainer {
    width: 350px;
    margin: auto;
  }
  .heading{
    background: #e6e6e6;
    padding: 10px;
  }
  #title{
    text-align: center;
  }
</style>