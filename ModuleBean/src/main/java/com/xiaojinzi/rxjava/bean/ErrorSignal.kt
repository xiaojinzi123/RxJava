package com.xiaojinzi.rxjava.bean

/**
 * 表示一个错误的信号,不能修改
 */
class ErrorSignal(val msg: String) : Signal(Signal.SIGNAL_TYPE_ERROR);