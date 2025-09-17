package com.example.electroniclearning;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

import androidx.appcompat.widget.AppCompatImageView;

public class ZoomImageView extends AppCompatImageView {
    private float scaleFactor = 1.0f;
    private float posX = 0f, posY = 0f;
    private float lastX, lastY;
    private boolean isDragging = false;
    private final ScaleGestureDetector scaleDetector;

    public ZoomImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setScaleType(ScaleType.CENTER_INSIDE);
        scaleDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener() {
            @Override
            public boolean onScale(ScaleGestureDetector detector) {
                scaleFactor *= detector.getScaleFactor();
                scaleFactor = Math.max(1.0f, Math.min(scaleFactor, 5.0f)); // จำกัดการซูม 1x–5x
                invalidate();
                return true;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        scaleDetector.onTouchEvent(ev);
        if (!scaleDetector.isInProgress()) {
            switch (ev.getActionMasked()) {
                case MotionEvent.ACTION_DOWN:
                    lastX = ev.getX() - posX;
                    lastY = ev.getY() - posY;
                    isDragging = true;
                    break;
                case MotionEvent.ACTION_MOVE:
                    if (isDragging && scaleFactor > 1f) {
                        posX = ev.getX() - lastX;
                        posY = ev.getY() - lastY;
                        invalidate();
                    }
                    break;
                case MotionEvent.ACTION_UP:
                case MotionEvent.ACTION_CANCEL:
                    isDragging = false;
                    break;
            }
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(posX, posY);
        canvas.scale(scaleFactor, scaleFactor, getWidth() / 2f, getHeight() / 2f);
        super.onDraw(canvas);
        canvas.restore();
    }
}
