package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import java.io.IOException;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.v.d.c0, reason: use source file name */
/* JADX INFO: compiled from: UnitBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {

    /* JADX INFO: renamed from: c.g.a.m.v.d.c0$a */
    /* JADX INFO: compiled from: UnitBitmapDecoder.java */
    public static final class a implements Resource2<Bitmap> {

        /* JADX INFO: renamed from: f */
        public final Bitmap f3529f;

        public a(Bitmap bitmap) {
            this.f3529f = bitmap;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.Resource2
        /* JADX INFO: renamed from: b */
        public void mo1830b() {
        }

        @Override // p007c.p085g.p086a.p089m.p092t.Resource2
        /* JADX INFO: renamed from: c */
        public int mo1831c() {
            return Util4.m2049d(this.f3529f);
        }

        @Override // p007c.p085g.p086a.p089m.p092t.Resource2
        /* JADX INFO: renamed from: d */
        public Class<Bitmap> mo1832d() {
            return Bitmap.class;
        }

        @Override // p007c.p085g.p086a.p089m.p092t.Resource2
        public Bitmap get() {
            return this.f3529f;
        }
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1709a(Bitmap bitmap, Options options) throws IOException {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(Bitmap bitmap, int i, int i2, Options options) throws IOException {
        return new a(bitmap);
    }
}
