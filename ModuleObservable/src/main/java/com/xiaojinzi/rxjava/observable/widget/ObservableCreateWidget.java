package com.xiaojinzi.rxjava.observable.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.xiaojinzi.rxjava.bean.Signal;

/**
 * 这个控件的作用如下：
 * 1.内部有持有多个信号,能检测信号的排列是否合理
 * 2.展示一个时间线展示所有的信号
 * 3.支持用户手动拖拽每一个信号来设置信号的发射时间点
 */
public class ObservableCreateWidget extends ViewGroup {

    public ObservableCreateWidget(Context context) {
        this(context, null);
    }

    public ObservableCreateWidget(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ObservableCreateWidget(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paintForSignal.setColor(Signal.Companion.getSIGNAL_COLOR_NORMAL());
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3);
    }

    private Paint paint = new Paint();

    private int signalRadius = 26;

    private Paint paintForSignal = new Paint();

    @Override
    protected void dispatchDraw(Canvas c) {
        super.dispatchDraw(c);

        c.drawLine(getWidth() - 40, getHeight() / 2 - 40, getWidth(), getHeight() / 2, paint);
        c.drawLine(getWidth() - 40, getHeight() / 2 + 40, getWidth(), getHeight() / 2, paint);
        c.drawLine(getWidth() - 60, getHeight() / 2 - 40, getWidth() - 60, getHeight() / 2 + 40, paint);
        c.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2, paint);
        c.drawCircle(getWidth() / 2, getHeight() / 2, signalRadius, paintForSignal);
        c.drawCircle(getWidth() / 2 - 100, getHeight() / 2, signalRadius, paintForSignal);
        c.drawCircle(getWidth() / 2 + 300, getHeight() / 2, signalRadius, paintForSignal);

    }

    @Override
    protected void onDraw(Canvas c) {
        super.onDraw(c);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

}
