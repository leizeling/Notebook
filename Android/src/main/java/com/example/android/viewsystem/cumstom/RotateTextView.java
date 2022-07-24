package com.example.android.viewsystem.cumstom;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

public class RotateTextView extends AppCompatTextView {
    public RotateTextView(@NonNull Context context) {
        super(context);
    }

    public RotateTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public RotateTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        // 以View的中心为旋转点，旋转45度
        canvas.rotate(45, getMeasuredWidth() >> 1, getMeasuredHeight() >> 1);
        super.onDraw(canvas);
        canvas.restore();
    }
}