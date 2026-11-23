package p007c.p056c.p057a;

import java.util.Arrays;

/* JADX INFO: renamed from: c.c.a.r, reason: use source file name */
/* JADX INFO: compiled from: LottieResult.java */
/* JADX INFO: loaded from: classes.dex */
public final class LottieResult<V> {

    /* JADX INFO: renamed from: a */
    public final V f2479a;

    /* JADX INFO: renamed from: b */
    public final Throwable f2480b;

    public LottieResult(V v) {
        this.f2479a = v;
        this.f2480b = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieResult)) {
            return false;
        }
        LottieResult lottieResult = (LottieResult) obj;
        V v = this.f2479a;
        if (v != null && v.equals(lottieResult.f2479a)) {
            return true;
        }
        Throwable th = this.f2480b;
        if (th == null || lottieResult.f2480b == null) {
            return false;
        }
        return th.toString().equals(this.f2480b.toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2479a, this.f2480b});
    }

    public LottieResult(Throwable th) {
        this.f2480b = th;
        this.f2479a = null;
    }
}
