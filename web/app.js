//app.js
App({
    globalData: {
        page: 1, //初始加载商品时的页面号
        pageSize: 10000, //初始加载时的商品数，设置为10000保证小商户能加载完全部商品
        goodtypes: [],
        goods: [],
        hotGoods: ['桔', '火龙果', '香蕉', '酸奶', '甘蔗'], //自定义热门搜索商品
        goodsName: [],
        goodsList: [],
        onLoadStatus: true,
        activeCategoryId: null,

        globalBGColor: '#00afb4',
        bgRed: 0,
        bgGreen: 175,
        bgBlue: 180,
        userInfo: null,
        version: "1.0.0",
        shareProfile: '   一流的服务，做超新鲜的' // 首页转发的时候术语
    },

    onLaunch:function(){
      //  获取商城类型
      wx.request({
        url: 'http://127.0.0.1/goodtype/getall',
        success:function(res){
          if(res.data.code == 1){
            console.log("goodtype:",res.data);
            goodtypes = res.data.data;
          }
        }
      })
    }
})