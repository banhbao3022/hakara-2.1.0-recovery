package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import java.util.Objects;
import p007c.p085g.p086a.p089m.p092t.Initializable;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.v.d.e, reason: use source file name */
/* JADX INFO: compiled from: BitmapResource.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapResource implements Resource2<Bitmap>, Initializable {

    /* JADX INFO: renamed from: f */
    public final Bitmap f3539f;

    /* JADX INFO: renamed from: g */
    public final BitmapPool f3540g;

    public BitmapResource(Bitmap bitmap, BitmapPool bitmapPool) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f3539f = bitmap;
        Objects.requireNonNull(bitmapPool, "BitmapPool must not be null");
        this.f3540g = bitmapPool;
    }

    /* JADX INFO: renamed from: e */
    public static BitmapResource m1881e(Bitmap bitmap, BitmapPool bitmapPool) {
        if (bitmap == null) {
            return null;
        }
        return new BitmapResource(bitmap, bitmapPool);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Initializable
    /* JADX INFO: renamed from: a */
    public void mo1840a() {
        this.f3539f.prepareToDraw();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: b */
    public void mo1830b() {
        this.f3540g.mo1752d(this.f3539f);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: c */
    public int mo1831c() {
        return Util4.m2049d(this.f3539f);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    /* JADX INFO: renamed from: d */
    public Class<Bitmap> mo1832d() {
        return Bitmap.class;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.Resource2
    public Bitmap get() {
        return this.f3539f;
    }
}
