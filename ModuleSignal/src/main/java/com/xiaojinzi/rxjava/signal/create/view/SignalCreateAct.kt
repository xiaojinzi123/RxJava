package com.xiaojinzi.rxjava.signal.create.view

import android.os.Bundle
import com.xiaojinzi.rxjava.base.view.BaseAct
import com.xiaojinzi.rxjava.base.viewmodel.BaseViewModel
import com.xiaojinzi.rxjava.signal.R

/**
 * 创建 Signal 的界面
 */
class SignalCreateAct : BaseAct<BaseViewModel>() {

    override fun getLayoutId(): Int {
        return R.layout.signal_create_act
    }

}
