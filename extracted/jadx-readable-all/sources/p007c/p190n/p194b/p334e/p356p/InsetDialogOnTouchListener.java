package p007c.p190n.p194b.p334e.p356p;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: c.n.b.e.p.a, reason: use source file name */
/* JADX INFO: compiled from: InsetDialogOnTouchListener.java */
/* JADX INFO: loaded from: classes.dex */
public class InsetDialogOnTouchListener implements View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public final Dialog f25316f;

    /* JADX INFO: renamed from: g */
    public final int f25317g;

    /* JADX INFO: renamed from: h */
    public final int f25318h;

    /* JADX INFO: renamed from: i */
    public final int f25319i;

    public InsetDialogOnTouchListener(Dialog dialog, Rect rect) {
        this.f25316f = dialog;
        this.f25317g = rect.left;
        this.f25318h = rect.top;
        this.f25319i = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = viewFindViewById.getLeft() + this.f25317g;
        int width = viewFindViewById.getWidth() + left;
        int top = viewFindViewById.getTop() + this.f25318h;
        if (new RectF(left, top, width, viewFindViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i = this.f25319i;
            motionEventObtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f25316f.onTouchEvent(motionEventObtain);
    }
}
