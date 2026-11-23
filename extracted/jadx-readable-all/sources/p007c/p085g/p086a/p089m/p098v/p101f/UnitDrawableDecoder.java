package p007c.p085g.p086a.p089m.p098v.p101f;

import android.graphics.drawable.Drawable;
import java.io.IOException;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;

/* JADX INFO: renamed from: c.g.a.m.v.f.f, reason: use source file name */
/* JADX INFO: compiled from: UnitDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class UnitDrawableDecoder implements ResourceDecoder<Drawable, Drawable> {
    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1709a(Drawable drawable, Options options) throws IOException {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Drawable> mo1710b(Drawable drawable, int i, int i2, Options options) throws IOException {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new NonOwnedDrawableResource(drawable2);
        }
        return null;
    }
}
