package p007c.p085g.p086a.p089m.p098v.p101f;

import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: c.g.a.m.v.f.d, reason: use source file name */
/* JADX INFO: compiled from: NonOwnedDrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class NonOwnedDrawableResource extends DrawableResource<Drawable> {
    public NonOwnedDrawableResource(Drawable drawable) {
        super(drawable);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public void mo1830b() {
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public int mo1831c() {
        return Math.max(1, this.f3606f.getIntrinsicHeight() * this.f3606f.getIntrinsicWidth() * 4);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<Drawable> mo1832d() {
        return this.f3606f.getClass();
    }
}
