package com.xiaojinzi.rxjava.observable.create.view

import android.os.Bundle
import com.xiaojinzi.component.anno.RouterAnno
import com.xiaojinzi.rxjava.base.ModuleConfig
import com.xiaojinzi.rxjava.base.view.BaseAct
import com.xiaojinzi.rxjava.observable.R

/**
 * 创建 Observable 的界面
 */
@RouterAnno(
    path = ModuleConfig.Observable.OBSERVABLE_CREATE
)
class ObservableCreateAct : BaseAct() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.observable_observable_create_act)
    }

}
