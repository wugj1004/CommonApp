package com.wugj.compmain.eventbus1

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/30
 * </br>
 * version:
 */

class MyEventBus(msg:String){
    var messagge:String

    init {
        this.messagge = msg
    }

    public fun showLog(){
        System.out.println("测试Message${messagge}")
    }

}