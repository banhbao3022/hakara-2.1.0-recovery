package p007c.p085g.p086a.p089m.p092t;

import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.Transformation;

/* JADX INFO: renamed from: c.g.a.m.t.o, reason: use source file name */
/* JADX INFO: compiled from: EngineKey.java */
/* JADX INFO: loaded from: classes.dex */
public class EngineKey implements Key {

    /* JADX INFO: renamed from: b */
    public final Object f3336b;

    /* JADX INFO: renamed from: c */
    public final int f3337c;

    /* JADX INFO: renamed from: d */
    public final int f3338d;

    /* JADX INFO: renamed from: e */
    public final Class<?> f3339e;

    /* JADX INFO: renamed from: f */
    public final Class<?> f3340f;

    /* JADX INFO: renamed from: g */
    public final Key f3341g;

    /* JADX INFO: renamed from: h */
    public final Map<Class<?>, Transformation<?>> f3342h;

    /* JADX INFO: renamed from: i */
    public final Options f3343i;

    /* JADX INFO: renamed from: j */
    public int f3344j;

    public EngineKey(Object obj, Key key, int i, int i2, Map<Class<?>, Transformation<?>> map, Class<?> cls, Class<?> cls2, Options options) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f3336b = obj;
        Objects.requireNonNull(key, "Signature must not be null");
        this.f3341g = key;
        this.f3337c = i;
        this.f3338d = i2;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f3342h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f3339e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f3340f = cls2;
        Objects.requireNonNull(options, "Argument must not be null");
        this.f3343i = options;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof EngineKey)) {
            return false;
        }
        EngineKey engineKey = (EngineKey) obj;
        return this.f3336b.equals(engineKey.f3336b) && this.f3341g.equals(engineKey.f3341g) && this.f3338d == engineKey.f3338d && this.f3337c == engineKey.f3337c && this.f3342h.equals(engineKey.f3342h) && this.f3339e.equals(engineKey.f3339e) && this.f3340f.equals(engineKey.f3340f) && this.f3343i.equals(engineKey.f3343i);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        if (this.f3344j == 0) {
            int iHashCode = this.f3336b.hashCode();
            this.f3344j = iHashCode;
            int iHashCode2 = this.f3341g.hashCode() + (iHashCode * 31);
            this.f3344j = iHashCode2;
            int i = (iHashCode2 * 31) + this.f3337c;
            this.f3344j = i;
            int i2 = (i * 31) + this.f3338d;
            this.f3344j = i2;
            int iHashCode3 = this.f3342h.hashCode() + (i2 * 31);
            this.f3344j = iHashCode3;
            int iHashCode4 = this.f3339e.hashCode() + (iHashCode3 * 31);
            this.f3344j = iHashCode4;
            int iHashCode5 = this.f3340f.hashCode() + (iHashCode4 * 31);
            this.f3344j = iHashCode5;
            this.f3344j = this.f3343i.hashCode() + (iHashCode5 * 31);
        }
        return this.f3344j;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("EngineKey{model=");
        sbM1556G.append(this.f3336b);
        sbM1556G.append(", width=");
        sbM1556G.append(this.f3337c);
        sbM1556G.append(", height=");
        sbM1556G.append(this.f3338d);
        sbM1556G.append(", resourceClass=");
        sbM1556G.append(this.f3339e);
        sbM1556G.append(", transcodeClass=");
        sbM1556G.append(this.f3340f);
        sbM1556G.append(", signature=");
        sbM1556G.append(this.f3341g);
        sbM1556G.append(", hashCode=");
        sbM1556G.append(this.f3344j);
        sbM1556G.append(", transformations=");
        sbM1556G.append(this.f3342h);
        sbM1556G.append(", options=");
        sbM1556G.append(this.f3343i);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
