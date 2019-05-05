//app.js
App({
  globalData: {
    page: 1, //初始加载商品时的页面号
    pageSize: 10000, //初始加载时的商品数，设置为10000保证小商户能加载完全部商品
    goodtypes: [],
    goods: [],
    goodsName: [],
    onLoadStatus: true,
    initChooseGoodType: null,
    initGoodList:[],

    globalBGColor: '#00afb4',
    bgRed: 0,
    bgGreen: 175,
    bgBlue: 180,
    userInfo: null,
    version: "1.0.0",
    shareProfile: '   一流的服务，做超新鲜的' // 首页转发的时候术语
  },

  onLaunch: function() {
    var that = this;
    //  获取商城类型
    wx.request({
      url: 'https://www.wangwang-miaomiao.xyz/goodtype/getall',
      success: function(res) {
        if (res.data.code == 0) {
          that.globalData.goodtypes = res.data.data;
          console.log("goodtype:", that.globalData.goodtypes);

          //获取所有商品
          wx.request({
            url: 'https://www.wangwang-miaomiao.xyz/item/getall',
            success: function(res) {
              if (res.data.code == 0) {
                var data = res.data.data;
                var goods = [];
                var goodtypes = that.globalData.goodtypes;
                for (var i = 0; i < goodtypes.length; i++) {
                  var temp = [];
                  for (var j = 0; j < data.length; j++) {
                    if (data[j].type === goodtypes[i].id) {
                      temp.push(data[j]);
                    }
                  }
                  goods.push({
                    "type": goodtypes[i].id,
                    "typename": goodtypes[i].name,
                    "goods": temp
                  })
                  //初始化物品列表
                  if (that.globalData.initChooseGoodType === null & that.globalData.goodtypes.length > 0) {
                    that.globalData.initChooseGoodType = that.globalData.goodtypes[0].id;
                    that.globalData.initGoodList = goods[0];
                  }
                }
                that.globalData.goods = goods;

                console.log("goods:", that.globalData.goods);
                console.log("initGoodList:", that.globalData.initGoodList, that.globalData.initChooseGoodType);
              }
            }
          })
        }
      }
    })
  }
})