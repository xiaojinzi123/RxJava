package com.xiaojinzi.rxjava.bean

import android.graphics.Color

/**
 * [Observable] 发射的信号, 可能是
 * 一个错误信号、完成信号、自定义的信号
 * 错误信号和完成信号是特别的
 */
open abstract class Signal {

    companion object {

        /**
         * 信号的普通类型
         */
        var SIGNAL_TYPE_NORMAL = 1;

        /**
         * 信号的完成类型
         */
        var SIGNAL_TYPE_COMPLETE = 2;

        /**
         * 信号的错误类型
         */
        var SIGNAL_TYPE_ERROR = 3;

        /**
         * 默认的信号的颜色
         */
        val SIGNAL_COLOR_NORMAL = Color.GREEN;

        /**
         * 默认的信号的文本颜色
         */
        val SIGNAL_TEXT_COLOR_NORMAL = Color.WHITE;

        /**
         * 默认的信号的颜色
         */
        val SIGNAL_COLOR_COMPLETE = Color.BLUE;

        /**
         * 默认的信号的文本颜色
         */
        val SIGNAL_TEXT_COLOR_COMPLETE = Color.WHITE;

        /**
         * 错误信号的颜色
         */
        val SIGNAL_COLOR_ERROR = Color.RED;

        /**
         * 错误信号的文本颜色
         */
        val SIGNAL_TEXT_COLOR_ERROR = SIGNAL_TEXT_COLOR_NORMAL;

    }

    /**
     * 信号的类型
     */
    var type: Int = SIGNAL_TYPE_NORMAL;

    /**
     * 信号的颜色
     */
    var color: Int = SIGNAL_COLOR_NORMAL;

    /**
     * 文本的颜色
     */
    var textColor: Int = SIGNAL_TEXT_COLOR_NORMAL;

    constructor()

    constructor(type: Int) {
        this.type = type
        if (isComplete()) {
            color = SIGNAL_COLOR_COMPLETE
            textColor = SIGNAL_TEXT_COLOR_COMPLETE
        } else if (isError()) {
            color = SIGNAL_COLOR_ERROR
            textColor = SIGNAL_TEXT_COLOR_ERROR
        }
    }

    constructor(color: Int, textColor: Int) {
        this.color = color
        this.textColor = textColor
    }

    fun isNormal(): Boolean {
        return this.type == SIGNAL_TYPE_NORMAL
    }

    fun isError(): Boolean {
        return this.type == SIGNAL_TYPE_ERROR
    }

    fun isComplete(): Boolean {
        return this.type == SIGNAL_TYPE_COMPLETE
    }

}