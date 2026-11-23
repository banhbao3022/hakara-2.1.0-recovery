package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c.n.b.d.j.a.u8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3575u8 {

    /* JADX INFO: renamed from: a */
    public boolean f20228a = false;

    /* JADX INFO: renamed from: b */
    public boolean f20229b = false;

    /* JADX INFO: renamed from: c */
    public float f20230c = 0.0f;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f20231d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m8472a(boolean z) {
        if (!this.f20231d.get()) {
            return z;
        }
        return this.f20228a;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m8473b() {
        return this.f20229b;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized float m8474c() {
        return this.f20230c;
    }
}
