package p007c.p085g.p086a.p089m.p092t;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.p093c0.ArrayPool;
import p007c.p085g.p086a.p112s.LruCache;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.t.y, reason: use source file name */
/* JADX INFO: compiled from: ResourceCacheKey.java */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceCacheKey implements Key {

    /* JADX INFO: renamed from: b */
    public static final LruCache<Class<?>, byte[]> f3380b = new LruCache<>(50);

    /* JADX INFO: renamed from: c */
    public final ArrayPool f3381c;

    /* JADX INFO: renamed from: d */
    public final Key f3382d;

    /* JADX INFO: renamed from: e */
    public final Key f3383e;

    /* JADX INFO: renamed from: f */
    public final int f3384f;

    /* JADX INFO: renamed from: g */
    public final int f3385g;

    /* JADX INFO: renamed from: h */
    public final Class<?> f3386h;

    /* JADX INFO: renamed from: i */
    public final Options f3387i;

    /* JADX INFO: renamed from: j */
    public final Transformation<?> f3388j;

    public ResourceCacheKey(ArrayPool arrayPool, Key key, Key key2, int i, int i2, Transformation<?> transformation, Class<?> cls, Options options) {
        this.f3381c = arrayPool;
        this.f3382d = key;
        this.f3383e = key2;
        this.f3384f = i;
        this.f3385g = i2;
        this.f3388j = transformation;
        this.f3386h = cls;
        this.f3387i = options;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f3381c.mo1743c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3384f).putInt(this.f3385g).array();
        this.f3383e.mo1703a(messageDigest);
        this.f3382d.mo1703a(messageDigest);
        messageDigest.update(bArr);
        Transformation<?> transformation = this.f3388j;
        if (transformation != null) {
            transformation.mo1703a(messageDigest);
        }
        this.f3387i.mo1703a(messageDigest);
        LruCache<Class<?>, byte[]> lruCache = f3380b;
        byte[] bArrM2041a = lruCache.m2041a(this.f3386h);
        if (bArrM2041a == null) {
            bArrM2041a = this.f3386h.getName().getBytes(Key.f3032a);
            lruCache.m2042d(this.f3386h, bArrM2041a);
        }
        messageDigest.update(bArrM2041a);
        this.f3381c.mo1744d(bArr);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (!(obj instanceof ResourceCacheKey)) {
            return false;
        }
        ResourceCacheKey resourceCacheKey = (ResourceCacheKey) obj;
        return this.f3385g == resourceCacheKey.f3385g && this.f3384f == resourceCacheKey.f3384f && Util4.m2047b(this.f3388j, resourceCacheKey.f3388j) && this.f3386h.equals(resourceCacheKey.f3386h) && this.f3382d.equals(resourceCacheKey.f3382d) && this.f3383e.equals(resourceCacheKey.f3383e) && this.f3387i.equals(resourceCacheKey.f3387i);
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        int iHashCode = ((((this.f3383e.hashCode() + (this.f3382d.hashCode() * 31)) * 31) + this.f3384f) * 31) + this.f3385g;
        Transformation<?> transformation = this.f3388j;
        if (transformation != null) {
            iHashCode = (iHashCode * 31) + transformation.hashCode();
        }
        return this.f3387i.hashCode() + ((this.f3386h.hashCode() + (iHashCode * 31)) * 31);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ResourceCacheKey{sourceKey=");
        sbM1556G.append(this.f3382d);
        sbM1556G.append(", signature=");
        sbM1556G.append(this.f3383e);
        sbM1556G.append(", width=");
        sbM1556G.append(this.f3384f);
        sbM1556G.append(", height=");
        sbM1556G.append(this.f3385g);
        sbM1556G.append(", decodedResourceClass=");
        sbM1556G.append(this.f3386h);
        sbM1556G.append(", transformation='");
        sbM1556G.append(this.f3388j);
        sbM1556G.append('\'');
        sbM1556G.append(", options=");
        sbM1556G.append(this.f3387i);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
