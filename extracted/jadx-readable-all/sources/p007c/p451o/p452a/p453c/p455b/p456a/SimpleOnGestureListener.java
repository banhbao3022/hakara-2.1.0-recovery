package p007c.p451o.p452a.p453c.p455b.p456a;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.o.a.c.b.a.a, reason: use source file name */
/* JADX INFO: compiled from: SimpleOnGestureListener.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SimpleOnGestureListener extends GestureDetector.SimpleOnGestureListener {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<MotionEvent, Boolean> f27828f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<MotionEvent, Boolean> f27829g;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleOnGestureListener() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ SimpleOnGestureListener(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : interfaceC6164l, (i & 2) != 0 ? null : interfaceC6164l2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        Boolean boolMo3b;
        Intrinsics2.m13090f(motionEvent, "event");
        InterfaceC6164l<MotionEvent, Boolean> interfaceC6164l = this.f27829g;
        if (interfaceC6164l == null || (boolMo3b = interfaceC6164l.mo3b(motionEvent)) == null) {
            return false;
        }
        return boolMo3b.booleanValue();
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        Boolean boolMo3b;
        Intrinsics2.m13090f(motionEvent, "event");
        InterfaceC6164l<MotionEvent, Boolean> interfaceC6164l = this.f27828f;
        if (interfaceC6164l == null || (boolMo3b = interfaceC6164l.mo3b(motionEvent)) == null) {
            return false;
        }
        return boolMo3b.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleOnGestureListener(InterfaceC6164l<? super MotionEvent, Boolean> interfaceC6164l, InterfaceC6164l<? super MotionEvent, Boolean> interfaceC6164l2) {
        this.f27828f = interfaceC6164l;
        this.f27829g = interfaceC6164l2;
    }
}
