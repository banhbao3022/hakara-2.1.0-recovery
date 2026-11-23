package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.v4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4696v4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final String f24497a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4674t4 f24498b;

    public C4696v4(C4674t4 c4674t4, String str) {
        this.f24498b = c4674t4;
        Objects.requireNonNull(str, "null reference");
        this.f24497a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f24498b.mo10684l().f24418f.m10812b(this.f24497a, th);
    }
}
