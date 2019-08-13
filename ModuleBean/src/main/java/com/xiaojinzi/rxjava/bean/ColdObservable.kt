package com.xiaojinzi.rxjava.bean

/**
 * 表示 冷 Observable 这个抽象的概念
 * 冷 Observable 一定会在一定的时间内完成所有信号的发射
 */
open abstract class ColdObservable : Observable {

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