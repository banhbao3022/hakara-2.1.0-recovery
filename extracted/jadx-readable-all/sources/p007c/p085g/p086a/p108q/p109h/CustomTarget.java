package p007c.p085g.p086a.p108q.p109h;

import android.graphics.drawable.Drawable;
import p007c.p085g.p086a.p108q.Request2;
import p007c.p085g.p086a.p108q.SingleRequest;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.q.h.c, reason: use source file name */
/* JADX INFO: compiled from: CustomTarget.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTarget<T> implements Target<T> {

    /* JADX INFO: renamed from: f */
    public final int f3777f;

    /* JADX INFO: renamed from: g */
    public final int f3778g;

    /* JADX INFO: renamed from: h */
    public Request2 f3779h;

    public CustomTarget() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: a */
    public final void mo2023a(SizeReadyCallback sizeReadyCallback) {
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: c */
    public final void mo2018c(Request2 request2) {
        this.f3779h = request2;
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: d */
    public void mo2019d(Drawable drawable) {
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: e */
    public void mo1649e() {
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: f */
    public void mo2020f(Drawable drawable) {
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: g */
    public final Request2 mo2021g() {
        return this.f3779h;
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: i */
    public final void mo2024i(SizeReadyCallback sizeReadyCallback) throws Throwable {
        ((SingleRequest) sizeReadyCallback).mo2005a(this.f3777f, this.f3778g);
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: j */
    public void mo1650j() {
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    public void onDestroy() {
    }

    public CustomTarget(int i, int i2) {
        if (Util4.m2054i(i, i2)) {
            this.f3777f = i;
            this.f3778g = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
