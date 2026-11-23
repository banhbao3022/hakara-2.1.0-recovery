package p500e1.p501a.p504d2;

import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;

/* JADX INFO: renamed from: e1.a.d2.k, reason: use source file name */
/* JADX INFO: compiled from: Tasks.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Tasks7 extends Tasks5 {

    /* JADX INFO: renamed from: h */
    public final Runnable f29726h;

    public Tasks7(Runnable runnable, long j2, Tasks6 tasks6) {
        super(j2, tasks6);
        this.f29726h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f29726h.run();
        } finally {
            this.f29725g.mo13198B();
        }
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Task[");
        sbM1556G.append(C5729a.m12461p(this.f29726h));
        sbM1556G.append('@');
        sbM1556G.append(C5729a.m12463r(this.f29726h));
        sbM1556G.append(", ");
        sbM1556G.append(this.f29724f);
        sbM1556G.append(", ");
        sbM1556G.append(this.f29725g);
        sbM1556G.append(']');
        return sbM1556G.toString();
    }
}
