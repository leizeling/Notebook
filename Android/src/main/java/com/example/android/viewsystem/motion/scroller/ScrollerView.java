package com.example.android.viewsystem.motion.scroller;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Scroller;

import androidx.annotation.Nullable;

public class ScrollerView extends View {
    private Scroller scroller;

    public ScrollerView(Context context) {
        this(context, null);
    }

    public ScrollerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ScrollerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        // step1：初始化时创建对象
        scroller = new Scroller(getContext());
    }

    // step3：draw时会调用该方法
    @Override
    public void computeScroll() {
        super.computeScroll();
        // computeScrollOffset为true表示动画没有结束
        if (scroller.computeScrollOffset()) {
            // 注意需要调用父容器的scrollTo方法
            ((View) getParent()).scrollTo(scroller.getCurrX(), scroller.getCurrY());
            // 继续触发draw，从而实现移动
            invalidate();
        }
    }

    // step2：外部调用该自定义的方法，方法中触发scroller.startScroll()
    public void smoothScrollTo(int destX, int destY) {
        int scrollX = getScrollX();
        int dx = destX - scrollX;
        int scrollY = getScrollY();
        int dy = destY - scrollY;
        // dx, dy正值表示往屏幕坐标原点方向移动
        scroller.startScroll(scrollX, scrollY, dx, dy, 3000);
        // 触发绘制
        invalidate();
    }
}