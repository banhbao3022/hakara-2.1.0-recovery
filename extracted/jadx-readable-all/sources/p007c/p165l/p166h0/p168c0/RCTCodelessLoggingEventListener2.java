package p007c.p165l.p166h0.p168c0;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.p168c0.p169p.EventBinding;
import p007c.p165l.p166h0.p168c0.p169p.ViewHierarchy;
import p007c.p165l.p166h0.p171e0.AppEventUtility;

/* JADX INFO: renamed from: c.l.h0.c0.i, reason: use source file name */
/* JADX INFO: compiled from: RCTCodelessLoggingEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public class RCTCodelessLoggingEventListener2 implements View.OnTouchListener {

    /* JADX INFO: renamed from: f */
    public EventBinding f4649f;

    /* JADX INFO: renamed from: g */
    public WeakReference<View> f4650g;

    /* JADX INFO: renamed from: h */
    public WeakReference<View> f4651h;

    /* JADX INFO: renamed from: i */
    public View.OnTouchListener f4652i;

    /* JADX INFO: renamed from: j */
    public boolean f4653j;

    public RCTCodelessLoggingEventListener2(EventBinding eventBinding, View view, View view2) {
        this.f4653j = false;
        if (eventBinding == null || view == null || view2 == null) {
            return;
        }
        this.f4652i = ViewHierarchy.m2302f(view2);
        this.f4649f = eventBinding;
        this.f4650g = new WeakReference<>(view2);
        this.f4651h = new WeakReference<>(view);
        this.f4653j = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        EventBinding eventBinding;
        if (motionEvent.getAction() == 1 && (eventBinding = this.f4649f) != null) {
            String str = eventBinding.f4666a;
            Bundle bundleM2289b = CodelessMatcher2.m2289b(eventBinding, this.f4651h.get(), this.f4650g.get());
            if (bundleM2289b.containsKey("_valueToSum")) {
                bundleM2289b.putDouble("_valueToSum", AppEventUtility.m2316b(bundleM2289b.getString("_valueToSum")));
            }
            bundleM2289b.putString("_is_fb_codeless", "1");
            FacebookSdk.m2660b().execute(new RCTCodelessLoggingEventListener(this, str, bundleM2289b));
        }
        View.OnTouchListener onTouchListener = this.f4652i;
        return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
    }
}
