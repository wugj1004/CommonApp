package com.wugj.compmain.event

/**
 * description:
 * </br>
 * author: wugj
 * </br>
 * date: 2019/9/30
 * </br>
 * version:
 */

class MyEventBus(msg:String) :BaseEvent(){
    var messagge:String

    init {
        this.messagge = msg
    }

    public fun showLog(){
        System.out.println("测试Message${messagge}")
    }

}