package com.xiaojinzi.rxjava.bean

/**
 * 表示 Observable 这个抽象的概念
 * 一些共有的属性
 */
open abstract class Observable {

    /**
     * 总时长
     */
    var totalMilliSeconds: Int? = null

    /**
     * 需要发射的所有信号
     * 最后一个信号一定需要是错误信号或者结束的信号
     * @see Signal
     * @see ErrorSignal
     * @see CompleteSignal
     */
    var signals: List<Signal>? = null

    constructor(totalMilliSeconds: Int?, signals: List<Signal>?) {
        this.totalMilliSeconds = totalMilliSeconds
        this.signals = signals
    }

}