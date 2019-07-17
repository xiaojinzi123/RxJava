package com.xiaojinzi.rxjava.bean

/**
 * 表示一个错误的信号,不能修改
 */
class ErrorSignal(color: Int, textColor: Int, val msg: String) : Signal(color, textColor);