package p007c.p085g.p086a.p089m.p098v.p099d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;
import p007c.p085g.p086a.p089m.p092t.Initializable;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.d.v, reason: use source file name */
/* JADX INFO: compiled from: LazyBitmapDrawableResource.java */
/* JADX INFO: loaded from: classes.dex */
public final class LazyBitmapDrawableResource implements Resource2<BitmapDrawable>, Initializable {

    /* JADX INFO: renamed from: f */
    public final Resources f3590f;

    /* JADX INFO: renamed from: g */
    public final Resource2<Bitmap> f3591g;

    public LazyBitmapDrawableResource(Resources resources, Resource2<Bitmap> resource2) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f3590f = resources;
        this.f3591g = resource2;
    }

    /* JADX INFO: renamed from: e */
    public static Resource2<BitmapDrawable> m1914e(Resources resources, Resource2<Bitmap> resource2) {
        if (resource2 == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(resources, resource2);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Initializable
    /* JADX INFO: renamed from: a */
    public void mo1840a() {
        Resource2<Bitmap> resource2 = this.f3591g;
        if (resource2 instanceof Initializable) {
            ((Initializable) resource2).mo1840a();
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public void mo1830b() {
        this.f3591g.mo1830b();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public int mo1831c() {
        return this.f3591g.mo1831c();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<BitmapDrawable> mo1832d() {
        return BitmapDrawable.class;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f3590f, this.f3591g.get());
    }
}
