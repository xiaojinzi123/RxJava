package com.xiaojinzi.rxjava.observable.create.vm

import android.app.Application
import com.xiaojinzi.rxjava.base.viewmodel.BaseViewModel
import io.reactivex.Observable
import io.reactivex.subjects.BehaviorSubject
import io.reactivex.subjects.Subject

/**
 * 创建 [Observable] 的 ViewModel
 */
class ObservableCreateViewModel(application: Application) : BaseViewModel(application) {

    /**
     * [Observable] 的时长
     */
    var durationSubject: Subject<Int> = BehaviorSubject.createDefault(5000);

    /**
     * 获取时长的 Observable
     */
    fun getDurationObservable(): Observable<Int> {
        return durationSubject.distinct();
    }

    fun setDuration(progress: Int) {
        durationSubject.onNext(progress)
    }

}