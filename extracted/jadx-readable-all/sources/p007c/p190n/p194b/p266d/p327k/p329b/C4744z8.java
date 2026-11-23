package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Handler;
import android.os.Looper;
import p007c.p190n.p194b.p266d.p314j.p325k.HandlerC4260mc;

/* JADX INFO: renamed from: c.n.b.d.k.b.z8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4744z8 extends AbstractC4475c5 {

    /* JADX INFO: renamed from: c */
    public Handler f24632c;

    /* JADX INFO: renamed from: d */
    public final C4551i9 f24633d;

    /* JADX INFO: renamed from: e */
    public final C4527g9 f24634e;

    /* JADX INFO: renamed from: f */
    public final C4455a9 f24635f;

    public C4744z8(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24633d = new C4551i9(this);
        this.f24634e = new C4527g9(this);
        this.f24635f = new C4455a9(this);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4475c5
    /* JADX INFO: renamed from: v */
    public final boolean mo10481v() {
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m10914w(boolean z, boolean z2, long j2) {
        return this.f24634e.m10588a(z, z2, j2);
    }

    /* JADX INFO: renamed from: x */
    public final void m10915x() {
        mo10381b();
        if (this.f24632c == null) {
            this.f24632c = new HandlerC4260mc(Looper.getMainLooper());
        }
    }
}
