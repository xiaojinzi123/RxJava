package com.xiaojinzi.rxjava.base.service.signal

import com.xiaojinzi.rxjava.bean.Signal

/**
 * 信号模块的一个 Service
 */
interface ISignalService {

    /**
     * 获取错误信号的列表
     *
     * @return 获取错误信号的列表
     */
    fun errorList(): List<Signal>

    /**
     * 获取普通信号的列表
     *
     * @return 获取普通信号的列表
     */
    fun normalList(): List<Signal>

}
