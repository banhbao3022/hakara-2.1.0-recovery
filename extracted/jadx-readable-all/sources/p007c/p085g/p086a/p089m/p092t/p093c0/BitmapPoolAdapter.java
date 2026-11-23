package p007c.p085g.p086a.p089m.p092t.p093c0;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: c.g.a.m.t.c0.e, reason: use source file name */
/* JADX INFO: compiled from: BitmapPoolAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapPoolAdapter implements BitmapPool {
    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: a */
    public void mo1749a(int i) {
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: b */
    public void mo1750b() {
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: c */
    public Bitmap mo1751c(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: d */
    public void mo1752d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
    /* JADX INFO: renamed from: e */
    public Bitmap mo1753e(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
