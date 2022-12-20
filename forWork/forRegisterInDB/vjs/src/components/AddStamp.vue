<template>
    <div>
        <h2 class="text-center mb-3">STAMP</h2>
        <button @click="regiBTN">Good!</button>
        <ul class="list-group">
          <li class="list-group-item" v-show="showFlg"> {{ date }}<strong>のスタンプ登録完了</strong></li>
        </ul>
    </div>  
</template>

<script>
    export default {
        name: "DateComponent",
        data: () => ({
          date: '',
          showFlg: false
        }),
        methods: {
          printDate: function () {
            return new Date().toLocaleDateString();
          },
          regiBTN: function () {
            this.showFlg = true;
        }
        },
        mounted: function () {
          this.date = this.printDate();
        },
    };
</script>