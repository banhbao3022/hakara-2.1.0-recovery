package p007c.p085g.p086a.p108q.p109h;

import android.graphics.drawable.Drawable;
import p007c.p085g.p086a.p108q.Request2;

/* JADX INFO: renamed from: c.g.a.q.h.a, reason: use source file name */
/* JADX INFO: compiled from: BaseTarget.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class BaseTarget<Z> implements Target<Z> {

    /* JADX INFO: renamed from: f */
    public Request2 f3776f;

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: c */
    public void mo2018c(Request2 request2) {
        this.f3776f = request2;
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
    public Request2 mo2021g() {
        return this.f3776f;
    }

    @Override // p007c.p085g.p086a.p108q.p109h.Target
    /* JADX INFO: renamed from: h */
    public void mo1933h(Drawable drawable) {
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: j */
    public void mo1650j() {
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    public void onDestroy() {
    }
}
