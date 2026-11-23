package p526i1.p534c.p535a;

import java.lang.ref.WeakReference;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.c.a.a, reason: use source file name */
/* JADX INFO: compiled from: Async.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Async<T> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<T> f30858a;

    public Async(WeakReference<T> weakReference) {
        Intrinsics2.m13090f(weakReference, "weakRef");
        this.f30858a = weakReference;
    }
}
