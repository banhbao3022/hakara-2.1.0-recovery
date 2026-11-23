package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qh1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2782b f18291a;

    /* JADX INFO: renamed from: b */
    public final Object f18292b = new Object();

    /* JADX INFO: renamed from: d */
    public volatile int f18294d = 1;

    /* JADX INFO: renamed from: c */
    public volatile long f18293c = 0;

    public qh1(InterfaceC2782b interfaceC2782b) {
        this.f18291a = interfaceC2782b;
    }

    /* JADX INFO: renamed from: a */
    public final void m8203a() {
        long jMo5623c = this.f18291a.mo5623c();
        synchronized (this.f18292b) {
            try {
                if (this.f18294d == 3) {
                    if (this.f18293c + ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14160B3)).longValue() <= jMo5623c) {
                        this.f18294d = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8204b(int i, int i2) {
        m8203a();
        long jMo5623c = this.f18291a.mo5623c();
        synchronized (this.f18292b) {
            if (this.f18294d != i) {
                return;
            }
            this.f18294d = i2;
            if (this.f18294d == 3) {
                this.f18293c = jMo5623c;
            }
        }
    }
}
