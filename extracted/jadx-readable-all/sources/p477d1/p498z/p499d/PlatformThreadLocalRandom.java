package p477d1.p498z.p499d;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p498z.PlatformRandom;

/* JADX INFO: renamed from: d1.z.d.a, reason: use source file name */
/* JADX INFO: compiled from: PlatformThreadLocalRandom.kt */
/* JADX INFO: loaded from: classes.dex */
public final class PlatformThreadLocalRandom extends PlatformRandom {
    @Override // p477d1.p498z.Random
    /* JADX INFO: renamed from: d */
    public int mo13107d(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // p477d1.p498z.PlatformRandom
    /* JADX INFO: renamed from: e */
    public Random mo13106e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        Intrinsics2.m13088d(threadLocalRandomCurrent, "ThreadLocalRandom.current()");
        return threadLocalRandomCurrent;
    }
}
