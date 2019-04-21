var app = getApp();
Page({

  /**
   * 页面的初始数据
   */
  data: {
      shopLogo:"http://www.wangwang-miaomiao.xyz/seafood/20190417/d92f118b8714ed46.jpg",
      loadingStatus: false,
      shopDelivery: [],
      shopPrompt: [],
      categories: []
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
      this.setData({
          background_color: app.globalData.globalBGColor,
          bgRed: app.globalData.bgRed,
          bgGreen: app.globalData.bgGreen,
          bgBlue: app.globalData.bgBlue
      })
    
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
    
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
    
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
    
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
    
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
    
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
    
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
    
  }
})