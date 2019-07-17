package com.xiaojinzi.rxjava.main.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.xiaojinzi.component.impl.Router
import com.xiaojinzi.rxjava.base.ModuleConfig
import com.xiaojinzi.rxjava.main.R

/**
 * 主界面
 */
class HomeAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_home_act)

        Router.with(this)
            .host(ModuleConfig.Observable.NAME)
            .path(ModuleConfig.Observable.OBSERVABLE_CREATE)
            .navigate();

    }

}
