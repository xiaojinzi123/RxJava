package com.xiaojinzi.rxjava.bean

/**
 * 表示 Observable 这个抽象的概念
 * 一些共有的属性
 * 一个 [Observable] 在正常的情况下可能会有若干个
 * 信号{@link com.xiaojinzi.rxjava.bean.Signal} 的
 * 结束正常情况下是完成信号结束, 否则就是一个错误信号结束
 */
open interface Observable {

    /**
     * 是否是热信号
     */
    val isHot: Boolean

}