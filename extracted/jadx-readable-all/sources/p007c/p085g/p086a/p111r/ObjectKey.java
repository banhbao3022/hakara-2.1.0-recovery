package p007c.p085g.p086a.p111r;

import java.security.MessageDigest;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Key;

/* JADX INFO: renamed from: c.g.a.r.d, reason: use source file name */
/* JADX INFO: compiled from: ObjectKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectKey implements Key {

    /* JADX INFO: renamed from: b */
    public final Object f3803b;

    public ObjectKey(Object obj) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f3803b = obj;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        messageDigest.update(this.f3803b.toString().getBytes(Key.f3032a));
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.f3803b.equals(((ObjectKey) obj).f3803b);
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return this.f3803b.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ObjectKey{object=");
        sbM1556G.append(this.f3803b);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
