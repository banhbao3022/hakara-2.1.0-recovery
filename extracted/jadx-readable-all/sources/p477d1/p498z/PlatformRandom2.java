package p477d1.p498z;

import java.util.Random;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.z.b, reason: use source file name */
/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformRandom2 extends PlatformRandom {

    /* JADX INFO: renamed from: c */
    public final a f29607c = new a();

    /* JADX INFO: renamed from: d1.z.b$a */
    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        @Override // java.lang.ThreadLocal
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // p477d1.p498z.PlatformRandom
    /* JADX INFO: renamed from: e */
    public Random mo13106e() {
        Random random = this.f29607c.get();
        Intrinsics2.m13088d(random, "implStorage.get()");
        return random;
    }
}
