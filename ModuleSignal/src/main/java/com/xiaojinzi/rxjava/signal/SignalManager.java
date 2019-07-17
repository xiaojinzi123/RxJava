package com.xiaojinzi.rxjava.signal;

import androidx.annotation.NonNull;

import com.xiaojinzi.rxjava.base.service.signal.ISignalService;
import com.xiaojinzi.rxjava.bean.Signal;

import java.util.List;

/**
 * 信号的管理
 */
public class SignalManager implements ISignalService {

    public static final SignalManager instance = new SignalManager();

    /**
     * 获取单例
     *
     * @return
     */
    public static SignalManager getInstance() {
        return instance;
    }

    @NonNull
    public List<Signal> errorList() {
        return null;
    }

    @NonNull
    @Override
    public List<Signal> normalList() {
        return null;
    }

    /**
     * 删除一个信号
     *
     * @param signal
     */
    public void delete(@NonNull Signal signal) {

    }

}
