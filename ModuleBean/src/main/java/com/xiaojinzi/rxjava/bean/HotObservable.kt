package com.xiaojinzi.rxjava.bean

/**
 * 表示 热 Observable 这个抽象的概念
 * 热 Observable 也会在在一定的时间内完成所有信号的发射,
 * 但是很多时候这个时间是无限的, 所以很多时候热信号都是没有完成信号的
 */
open abstract class HotObservable : Observable {

    /**
     * 总时长, 默认是无限长, 表示默认不结束
     */
    var totalMilliSeconds: Int? = null;

    /**
     * 需要发射的所有信号
     * 最后一个信号一定需要是错误信号或者结束的信号
     * @see Signal
     * @see ErrorSignal
     * @see CompleteSignal
     */
    var signals: List<Signal>? = null

    constructor(signals: List<Signal>?) {
        this.totalMilliSeconds = Int.MAX_VALUE
        this.signals = signals
    }

    constructor(totalMilliSeconds: Int?, signals: List<Signal>?) {
        this.totalMilliSeconds = totalMilliSeconds
        this.signals = signals
    }

    override val isHot: Boolean get() = true;

}