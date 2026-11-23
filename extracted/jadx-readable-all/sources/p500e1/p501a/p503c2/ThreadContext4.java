package p500e1.p501a.p503c2;

import p477d1.p485u.CoroutineContext;
import p500e1.p501a.ThreadContextElement;

/* JADX INFO: renamed from: e1.a.c2.x, reason: use source file name */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadContext4 {

    /* JADX INFO: renamed from: a */
    public final Object[] f29683a;

    /* JADX INFO: renamed from: b */
    public final ThreadContextElement<Object>[] f29684b;

    /* JADX INFO: renamed from: c */
    public int f29685c;

    /* JADX INFO: renamed from: d */
    public final CoroutineContext f29686d;

    public ThreadContext4(CoroutineContext coroutineContext, int i) {
        this.f29686d = coroutineContext;
        this.f29683a = new Object[i];
        this.f29684b = new ThreadContextElement[i];
    }
}
