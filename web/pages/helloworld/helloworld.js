Page({

  /**
   * 页面的初始数据
   */
  data: {
    mott:1
  },

  myRand(){
    this.setData({ mott: Math.ceil(Math.random() * 1000)})
  }
})