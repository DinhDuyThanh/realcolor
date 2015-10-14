package com.shinkansen.touchcolor;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;

public class TouchBlackHoleView extends View {
    public TouchBlackHoleView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	private boolean touch_disabled=true;
    @Override
    public boolean onTouchEvent(MotionEvent e) {
        return touch_disabled;
    }
    public void disable_touch(boolean b) {
        touch_disabled=b;
    }
}
