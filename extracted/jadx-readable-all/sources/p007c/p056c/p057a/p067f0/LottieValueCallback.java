package p007c.p056c.p057a.p067f0;

/* JADX INFO: renamed from: c.c.a.f0.c, reason: use source file name */
/* JADX INFO: compiled from: LottieValueCallback.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieValueCallback<T> {

    /* JADX INFO: renamed from: a */
    public final LottieFrameInfo<T> f2374a;

    /* JADX INFO: renamed from: b */
    public T f2375b;

    public LottieValueCallback() {
        this.f2374a = new LottieFrameInfo<>();
        this.f2375b = null;
    }

    /* JADX INFO: renamed from: a */
    public final T m1452a(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        LottieFrameInfo<T> lottieFrameInfo = this.f2374a;
        lottieFrameInfo.f2372a = t;
        lottieFrameInfo.f2373b = t2;
        return this.f2375b;
    }

    public LottieValueCallback(T t) {
        this.f2374a = new LottieFrameInfo<>();
        this.f2375b = null;
        this.f2375b = t;
    }
}
