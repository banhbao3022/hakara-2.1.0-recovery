package p007c.p085g.p086a.p089m.p092t.p094d0;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p112s.LruCache;
import p007c.p085g.p086a.p112s.Util4;
import p007c.p085g.p086a.p112s.p113k.FactoryPools;
import p007c.p085g.p086a.p112s.p113k.StateVerifier;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.t.d0.j, reason: use source file name */
/* JADX INFO: compiled from: SafeKeyGenerator.java */
/* JADX INFO: loaded from: classes.dex */
public class SafeKeyGenerator {

    /* JADX INFO: renamed from: a */
    public final LruCache<Key, String> f3183a = new LruCache<>(1000);

    /* JADX INFO: renamed from: b */
    public final Pools2<b> f3184b = FactoryPools.m2055a(10, new a(this));

    /* JADX INFO: renamed from: c.g.a.m.t.d0.j$a */
    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public class a implements FactoryPools.b<b> {
        public a(SafeKeyGenerator safeKeyGenerator) {
        }

        @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.b
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.d0.j$b */
    /* JADX INFO: compiled from: SafeKeyGenerator.java */
    public static final class b implements FactoryPools.d {

        /* JADX INFO: renamed from: f */
        public final MessageDigest f3185f;

        /* JADX INFO: renamed from: g */
        public final StateVerifier f3186g = new StateVerifier.b();

        public b(MessageDigest messageDigest) {
            this.f3185f = messageDigest;
        }

        @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.d
        /* JADX INFO: renamed from: l */
        public StateVerifier mo1785l() {
            return this.f3186g;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m1784a(Key key) {
        String strM2041a;
        synchronized (this.f3183a) {
            strM2041a = this.f3183a.m2041a(key);
        }
        if (strM2041a == null) {
            b bVarMo2057a = this.f3184b.mo2057a();
            Objects.requireNonNull(bVarMo2057a, "Argument must not be null");
            b bVar = bVarMo2057a;
            try {
                key.mo1703a(bVar.f3185f);
                byte[] bArrDigest = bVar.f3185f.digest();
                char[] cArr = Util4.f3829b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        int i2 = bArrDigest[i] & 255;
                        int i3 = i * 2;
                        char[] cArr2 = Util4.f3828a;
                        cArr[i3] = cArr2[i2 >>> 4];
                        cArr[i3 + 1] = cArr2[i2 & 15];
                    }
                    strM2041a = new String(cArr);
                }
                this.f3184b.mo2058b(bVar);
            } catch (Throwable th) {
                this.f3184b.mo2058b(bVar);
                throw th;
            }
        }
        synchronized (this.f3183a) {
            this.f3183a.m2042d(key, strM2041a);
        }
        return strM2041a;
    }
}
