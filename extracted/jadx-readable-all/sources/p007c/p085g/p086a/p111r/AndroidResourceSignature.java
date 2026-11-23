package p007c.p085g.p086a.p111r;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.r.a, reason: use source file name */
/* JADX INFO: compiled from: AndroidResourceSignature.java */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidResourceSignature implements Key {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f3798b = 0;

    /* JADX INFO: renamed from: c */
    public final int f3799c;

    /* JADX INFO: renamed from: d */
    public final Key f3800d;

    public AndroidResourceSignature(int i, Key key) {
        this.f3799c = i;
        this.f3800d = key;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        this.f3800d.mo1703a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3799c).array());
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof AndroidResourceSignature)) {
            return false;
        }
        AndroidResourceSignature androidResourceSignature = (AndroidResourceSignature) obj;
        return this.f3799c == androidResourceSignature.f3799c && this.f3800d.equals(androidResourceSignature.f3800d);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return Util4.m2051f(this.f3800d, this.f3799c);
    }
}
