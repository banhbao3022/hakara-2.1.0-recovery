package p007c.p190n.p194b.p334e.p343e0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import com.google.android.material.timepicker.TimePickerView;

/* JADX INFO: renamed from: c.n.b.e.e0.c, reason: use source file name */
/* JADX INFO: compiled from: TimePickerView.java */
/* JADX INFO: loaded from: classes.dex */
public class TimePickerView3 implements View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ GestureDetector f24977f;

    public TimePickerView3(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f24977f = gestureDetector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f24977f.onTouchEvent(motionEvent);
        }
        return false;
    }
}
