package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.r, reason: use source file name */
/* JADX INFO: compiled from: FitCenter.java */
/* JADX INFO: loaded from: classes.dex */
public class FitCenter extends BitmapTransformation {

    /* JADX INFO: renamed from: b */
    public static final byte[] f3575b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(Key.f3032a);

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        messageDigest.update(f3575b);
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p099d.BitmapTransformation
    /* JADX INFO: renamed from: c */
    public Bitmap mo1882c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        return TransformationUtils.m1875b(bitmapPool, bitmap, i, i2);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        return obj instanceof FitCenter;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return 1572326941;
    }
}
