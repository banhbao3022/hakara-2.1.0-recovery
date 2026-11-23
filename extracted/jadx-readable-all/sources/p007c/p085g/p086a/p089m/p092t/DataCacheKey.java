package p007c.p085g.p086a.p089m.p092t;

import java.security.MessageDigest;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Key;

/* JADX INFO: renamed from: c.g.a.m.t.e, reason: use source file name */
/* JADX INFO: compiled from: DataCacheKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class DataCacheKey implements Key {

    /* JADX INFO: renamed from: b */
    public final Key f3187b;

    /* JADX INFO: renamed from: c */
    public final Key f3188c;

    public DataCacheKey(Key key, Key key2) {
        this.f3187b = key;
        this.f3188c = key2;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        this.f3187b.mo1703a(messageDigest);
        this.f3188c.mo1703a(messageDigest);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof DataCacheKey)) {
            return false;
        }
        DataCacheKey dataCacheKey = (DataCacheKey) obj;
        return this.f3187b.equals(dataCacheKey.f3187b) && this.f3188c.equals(dataCacheKey.f3188c);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return this.f3188c.hashCode() + (this.f3187b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DataCacheKey{sourceKey=");
        sbM1556G.append(this.f3187b);
        sbM1556G.append(", signature=");
        sbM1556G.append(this.f3188c);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
