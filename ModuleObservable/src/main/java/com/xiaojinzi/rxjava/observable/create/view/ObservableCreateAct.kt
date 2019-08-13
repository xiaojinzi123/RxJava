package com.xiaojinzi.rxjava.observable.create.view

import android.os.Bundle
import android.widget.SeekBar
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.xiaojinzi.component.anno.RouterAnno
import com.xiaojinzi.rxjava.base.ModuleConfig
import com.xiaojinzi.rxjava.base.view.BaseAct
import com.xiaojinzi.rxjava.observable.R
import com.xiaojinzi.rxjava.observable.create.vm.ObservableCreateViewModel
import com.xiaojinzi.rxjava.observable.widget.ObservableCreateWidget
import io.reactivex.Observable
import io.reactivex.functions.Consumer

/**
 * 创建 Observable 的界面
 */
@RouterAnno(
    path = ModuleConfig.Observable.OBSERVABLE_CREATE
)
class ObservableCreateAct : BaseAct<ObservableCreateViewModel>() {

    var observableCreateViewModel: ObservableCreateViewModel? = null
    var widgetObservableCreate: ObservableCreateWidget? = null
    var seekbarDuration: SeekBar? = null

    override fun onInjectView() {
        super.onInjectView()
        seekbarDuration = findViewById(R.id.seekbar_duration)
    }

    override fun getLayoutId(): Int {
        return R.layout.observable_observable_create_act
    }

    override fun onInit() {
        super.onInit()

        seekbarDuration!!.max = 10000

        observableCreateViewModel = ViewModelProviders.of(this)
            .get(ObservableCreateViewModel::class.java)

        observableCreateViewModel!!.getDurationObservable()
            .subscribe({
                println("progress = " + it)
                seekbarDuration!!.progress = it
            })

        seekbarDuration!!.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                observableCreateViewModel!!.setDuration(seekBar!!.progress)
            }

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                observableCreateViewModel!!.setDuration(seekBar!!.progress)
            }
        })
    }

}
