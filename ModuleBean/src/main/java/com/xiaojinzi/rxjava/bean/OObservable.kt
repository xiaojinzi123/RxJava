package com.xiaojinzi.rxjava.bean

/**
 * 表示 Observable 这个实现类, 是一个冷信号
 */
open class OObservable(totalMilliSeconds: Int?, signals: List<Signal>?) :
    ColdObservable(totalMilliSeconds, signals) {



}
