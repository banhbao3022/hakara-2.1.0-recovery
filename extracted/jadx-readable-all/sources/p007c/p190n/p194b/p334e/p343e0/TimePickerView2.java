package p007c.p190n.p194b.p334e.p343e0;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.material.timepicker.TimePickerView;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.e.e0.b, reason: use source file name */
/* JADX INFO: compiled from: TimePickerView.java */
/* JADX INFO: loaded from: classes.dex */
public class TimePickerView2 extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TimePickerView f24976f;

    public TimePickerView2(TimePickerView timePickerView) {
        this.f24976f = timePickerView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        boolean zOnDoubleTap = super.onDoubleTap(motionEvent);
        TimePickerView timePickerView = this.f24976f;
        int i = TimePickerView.f29234y;
        Objects.requireNonNull(timePickerView);
        return zOnDoubleTap;
    }
}
