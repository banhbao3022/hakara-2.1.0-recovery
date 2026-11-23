package p007c.p190n.p194b.p266d.p298f.p307u;

import android.os.SystemClock;

/* JADX INFO: renamed from: c.n.b.d.f.u.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2784d implements InterfaceC2782b {

    /* JADX INFO: renamed from: a */
    public static final C2784d f11944a = new C2784d();

    @Override // p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b
    /* JADX INFO: renamed from: a */
    public final long mo5621a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b
    /* JADX INFO: renamed from: b */
    public final long mo5622b() {
        return System.nanoTime();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b
    /* JADX INFO: renamed from: c */
    public final long mo5623c() {
        return System.currentTimeMillis();
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b
    /* JADX INFO: renamed from: d */
    public final long mo5624d() {
        return SystemClock.currentThreadTimeMillis();
    }
}
