package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.el */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2996el {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2782b f13603a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2305w0 f13604b;

    /* JADX INFO: renamed from: c */
    public final C2885bm f13605c;

    public C2996el(InterfaceC2782b interfaceC2782b, InterfaceC2305w0 interfaceC2305w0, C2885bm c2885bm) {
        this.f13603a = interfaceC2782b;
        this.f13604b = interfaceC2305w0;
        this.f13605c = c2885bm;
    }

    /* JADX INFO: renamed from: a */
    public final void m6635a(int i, long j2) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14360h0;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            return;
        }
        if (j2 - this.f13604b.mo4817o0() < 0) {
            C2096e.m4590z("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14367i0)).booleanValue()) {
            this.f13604b.mo4813c0(i);
            this.f13604b.mo4826x0(j2);
        } else {
            this.f13604b.mo4813c0(-1);
            this.f13604b.mo4826x0(j2);
        }
        m6636b();
    }

    /* JADX INFO: renamed from: b */
    public final void m6636b() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14367i0)).booleanValue()) {
            synchronized (this.f13605c.f12743l) {
            }
        }
    }
}
