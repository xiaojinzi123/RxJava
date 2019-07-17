package com.xiaojinzi.rxjava.signal.create.view

import android.os.Bundle
import com.xiaojinzi.rxjava.base.view.BaseAct
import com.xiaojinzi.rxjava.signal.R

/**
 * 创建 Signal 的界面
 */
class SignalCreateAct : BaseAct() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signal_create_act)
    }

}
