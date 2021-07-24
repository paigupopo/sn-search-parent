app.service('hotWordsService',function($http){

    this.selectName=function () {
      return $http.get('../Governmenthots/selectName.do');
    }

    this.selectcount=function () {
        return $http.get('../governmenthotsiterm/selectCount.do');
    }

    this.selectAddress=function () {
        return $http.get("../governmenthotsiterm/selectAddress.do")
    }

    this.jourCount=function () {
        return $http.get("../jour/selectCount.do")
    }
    this.selectItem=function () {
      return $http.get("../governmenthotsiterm/selectItem.do")
    }

    /**
     * 搜索次数月增长率
     */
    this.thisMonth=function () {
        return $http.get("../governmenthotsiterm/thisMonth.do")
    }
    /**
     * 搜索次数月增长率
     */
    this.thisMonthCount=function () {
        return $http.get("../governmenthotsiterm/thisMonthCount.do")
    }

    /**
     * 每个月的搜索量
     */
    this.selectMonth=function (day) {
        return $http.get("../governmenthotsiterm/selectMonth.do",day)
    }
    this.selectCity=function () {
        return $http.get("../governmenthotsiterm/selectCity.do")
    }
    this.selectCityAddress=function () {
        return $http.get("../governmenthotsiterm/selectCityAddress.do")
    }

    this.selectCount=function(){
        return $http.get('../knowledgelib/selectCount.do');
    }



});