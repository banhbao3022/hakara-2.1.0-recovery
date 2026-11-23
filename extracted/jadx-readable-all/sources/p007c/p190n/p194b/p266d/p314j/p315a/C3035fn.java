package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: renamed from: c.n.b.d.j.a.fn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3035fn {

    /* JADX INFO: renamed from: g */
    public final String f14072g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2305w0 f14073h;

    /* JADX INFO: renamed from: a */
    public long f14066a = -1;

    /* JADX INFO: renamed from: b */
    public long f14067b = -1;

    /* JADX INFO: renamed from: c */
    public int f14068c = -1;

    /* JADX INFO: renamed from: d */
    public int f14069d = -1;

    /* JADX INFO: renamed from: e */
    public long f14070e = 0;

    /* JADX INFO: renamed from: f */
    public final Object f14071f = new Object();

    /* JADX INFO: renamed from: i */
    public int f14074i = 0;

    /* JADX INFO: renamed from: j */
    public int f14075j = 0;

    public C3035fn(String str, InterfaceC2305w0 interfaceC2305w0) {
        this.f14072g = str;
        this.f14073h = interfaceC2305w0;
    }

    /* JADX INFO: renamed from: a */
    public final void m6842a(ew2 ew2Var, long j2) {
        synchronized (this.f14071f) {
            try {
                long jMo4815l = this.f14073h.mo4815l();
                long jMo5623c = C2330u.f10884a.f10896k.mo5623c();
                if (this.f14067b == -1) {
                    if (jMo5623c - jMo4815l > ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14486z0)).longValue()) {
                        this.f14069d = -1;
                    } else {
                        this.f14069d = this.f14073h.mo4819q();
                    }
                    this.f14067b = j2;
                    this.f14066a = j2;
                } else {
                    this.f14066a = j2;
                }
                Bundle bundle = ew2Var.f13715h;
                if (bundle != null && bundle.getInt("gw", 2) == 1) {
                    return;
                }
                this.f14068c++;
                int i = this.f14069d + 1;
                this.f14069d = i;
                if (i == 0) {
                    this.f14070e = 0L;
                    this.f14073h.mo4823u0(jMo5623c);
                } else {
                    this.f14070e = jMo5623c - this.f14073h.mo4820r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
