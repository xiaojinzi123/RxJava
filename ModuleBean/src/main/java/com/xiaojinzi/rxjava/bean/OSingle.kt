package com.xiaojinzi.rxjava.bean

import java.util.*

/**
 * 表示一个 Single 的 Observable
 * 初始化的时候,初始化时间和一个信号,这个信号有可能是错误信号也有可能是一个正常的信号
 */
open class OSingle : Observable {

    private constructor(totalMilliSeconds: Int?, signal: Signal) :
            super(totalMilliSeconds, Arrays.asList(signal)) {
    }

    companion object {

        fun create(totalMilliSeconds: Int?, signal: Signal) {

        }

    }

}