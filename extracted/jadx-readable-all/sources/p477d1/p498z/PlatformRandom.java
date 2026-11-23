package p477d1.p498z;

import java.util.Random;

/* JADX INFO: renamed from: d1.z.a, reason: use source file name */
/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class PlatformRandom extends Random {
    @Override // p477d1.p498z.Random
    /* JADX INFO: renamed from: a */
    public int mo13103a(int i) {
        return ((-i) >> 31) & (mo13106e().nextInt() >>> (32 - i));
    }

    @Override // p477d1.p498z.Random
    /* JADX INFO: renamed from: b */
    public int mo13104b() {
        return mo13106e().nextInt();
    }

    @Override // p477d1.p498z.Random
    /* JADX INFO: renamed from: c */
    public int mo13105c(int i) {
        return mo13106e().nextInt(i);
    }

    /* JADX INFO: renamed from: e */
    public abstract Random mo13106e();
}
