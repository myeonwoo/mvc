<template>
    <div class="container">
        <fireMyItem
        v-for="rental in myRentals"
        :key="rental.id"
        :item="rental"
        />
    </div>
</template>
<script>
    import { mapState } from 'vuex';
    export default {
        layout: "fire/no-nav",
        computed: {
            ...mapState([
                'myRentals'
                ])
        }
    }
</script>
<style scoped>
    .container {
        padding: 5rem 0
    }
</style>