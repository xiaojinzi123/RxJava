package com.xiaojinzi.rxjava.bean

import android.graphics.Color

/**
 * [Observable] 发射的信号, 可能是
 * 一个错误信号、完成信号、自定义的信号
 * 错误信号和完成信号是特别的
 */
open class Signal {

    companion object {

        /**
         * 默认的信号的颜色
         */
        val SIGNAL_COLOR_NORMAL = Color.GREEN;

        /**
         * 默认的信号的文本颜色
         */
        val TEXT_COLOR_NORMAL = Color.WHITE;

        /**
         * 错误信号的颜色
         */
        val SIGNAL_COLOR_ERROR = Color.RED;

        /**
         * 错误信号的文本颜色
         */
        val TEXT_COLOR_ERROR = TEXT_COLOR_NORMAL;

    }

    /**
     * 信号的颜色
     */
    var color: Int = SIGNAL_COLOR_NORMAL;

    /**
     * 文本的颜色
     */
    var textColor: Int = TEXT_COLOR_NORMAL;

    constructor(color: Int, textColor: Int) {
        this.color = color
        this.textColor = textColor
    }

}