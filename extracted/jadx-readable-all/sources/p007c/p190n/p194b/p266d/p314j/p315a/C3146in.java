package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashSet;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: renamed from: c.n.b.d.j.a.in */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3146in implements cq2 {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2305w0 f15320b;

    /* JADX INFO: renamed from: d */
    public final C3035fn f15322d;

    /* JADX INFO: renamed from: a */
    public final Object f15319a = new Object();

    /* JADX INFO: renamed from: e */
    public final HashSet<C3775zm> f15323e = new HashSet<>();

    /* JADX INFO: renamed from: f */
    public final HashSet<C3109hn> f15324f = new HashSet<>();

    /* JADX INFO: renamed from: g */
    public boolean f15325g = false;

    /* JADX INFO: renamed from: c */
    public final C3072gn f15321c = new C3072gn();

    public C3146in(String str, InterfaceC2305w0 interfaceC2305w0) {
        this.f15322d = new C3035fn(str, interfaceC2305w0);
        this.f15320b = interfaceC2305w0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cq2
    /* JADX INFO: renamed from: B */
    public final void mo6222B(boolean z) {
        long jMo5623c = C2330u.f10884a.f10896k.mo5623c();
        if (!z) {
            this.f15320b.mo4827y0(jMo5623c);
            this.f15320b.mo4825w0(this.f15322d.f14069d);
            return;
        }
        if (jMo5623c - this.f15320b.mo4815l() > ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14486z0)).longValue()) {
            this.f15322d.f14069d = -1;
        } else {
            this.f15322d.f14069d = this.f15320b.mo4819q();
        }
        this.f15325g = true;
    }

    /* JADX INFO: renamed from: a */
    public final void m7283a(C3775zm c3775zm) {
        synchronized (this.f15319a) {
            this.f15323e.add(c3775zm);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7284b() {
        synchronized (this.f15319a) {
            try {
                C3035fn c3035fn = this.f15322d;
                Objects.requireNonNull(c3035fn);
                if (C3571u4.f20210a.m6603d().booleanValue()) {
                    synchronized (c3035fn.f14071f) {
                        c3035fn.f14068c--;
                        c3035fn.f14069d--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
