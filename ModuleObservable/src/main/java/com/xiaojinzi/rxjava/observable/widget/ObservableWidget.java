package com.xiaojinzi.rxjava.observable.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * 这个控件是为了展示一个流程中其中一个 Observable的
 */
public class ObservableWidget extends View {


    public ObservableWidget(Context context) {
        this(context, null);
    }

    public ObservableWidget(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ObservableWidget(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



}
