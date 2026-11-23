package p007c.p451o.p452a.p453c.p455b.p457b;

import android.content.Context;
import android.view.ViewConfiguration;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.o.a.c.b.b.b, reason: use source file name */
/* JADX INFO: compiled from: SwipeDirectionDetector.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SwipeDirectionDetector {

    /* JADX INFO: renamed from: a */
    public final int f27837a;

    /* JADX INFO: renamed from: b */
    public float f27838b;

    /* JADX INFO: renamed from: c */
    public float f27839c;

    /* JADX INFO: renamed from: d */
    public boolean f27840d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC6164l<SwipeDirection, Unit> f27841e;

    /* JADX WARN: Multi-variable type inference failed */
    public SwipeDirectionDetector(Context context, InterfaceC6164l<? super SwipeDirection, Unit> interfaceC6164l) {
        Intrinsics2.m13090f(context, "context");
        Intrinsics2.m13090f(interfaceC6164l, "onDirectionDetected");
        this.f27841e = interfaceC6164l;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        Intrinsics2.m13086b(viewConfiguration, "ViewConfiguration.get(context)");
        this.f27837a = viewConfiguration.getScaledTouchSlop();
    }
}
