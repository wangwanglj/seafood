var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
    shopLogo: "https://www.wangwang-miaomiao.xyz/seafood/20190417/d92f118b8714ed46.jpg",
    goodtypes: [], //商品类型列表
    goods: [], //商品列表
    chooseGoodType: null, //选择的商品类型
    chooseGoodList:[],//选择的商品信息
    shopDelivery: "¥28起送 | 同城免费送 | 由于业务有限仅送县城范围"
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function(options) {
    var that = this;
    this.setData({
      chooseGoodList: app.globalData.initGoodList,
      chooseGoodType: app.globalData.initChooseGoodType,
      goodtypes: app.globalData.goodtypes,
      goods: app.globalData.goods,
      background_color: app.globalData.globalBGColor,
      bgRed: app.globalData.bgRed,
      bgGreen: app.globalData.bgGreen,
      bgBlue: app.globalData.bgBlue
    })
    if (app.globalData.initChooseGoodType > 0){

    }
  },

  /**
   * 现在物品类型
   */
  chooseItemType: function(data) {
    var that = this;
    var id = data.target.dataset.id;
    if (id === that.data.chooseGoodType) {

    } else {
      that.setData({
        chooseGoodType: id,
      })
      for (var i = 0; i < that.data.goods.length; i++) {
        if (id === that.data.goods[i].type) {
          that.setData({
            chooseGoodList: that.data.goods[i]
          })
        }
      }
    }
    console.log("chooseGoodList:", that.data.chooseGoodList);
  },

  //事件处理函数
  toDetailsTap: function (e) {
    wx.navigateTo({
      url: "/pages/goods-details/index?id=" + e.currentTarget.dataset.id
    })
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function() {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function() {

  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function() {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function() {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function() {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function() {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function() {

  }
})