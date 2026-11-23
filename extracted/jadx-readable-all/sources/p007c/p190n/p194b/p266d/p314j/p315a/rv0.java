package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rv0 implements u70, l60 {

    /* JADX INFO: renamed from: f */
    public static final Object f19228f = new Object();

    /* JADX INFO: renamed from: g */
    public static int f19229g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2305w0 f19230h;

    /* JADX INFO: renamed from: i */
    public final aw0 f19231i;

    public rv0(aw0 aw0Var, InterfaceC2305w0 interfaceC2305w0) {
        this.f19231i = aw0Var;
        this.f19230h = interfaceC2305w0;
    }

    /* JADX INFO: renamed from: a */
    public final void m8330a(boolean z) {
        int i;
        int iIntValue;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14236N3;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && !this.f19230h.mo4811O()) {
            Object obj = f19228f;
            synchronized (obj) {
                i = f19229g;
                iIntValue = ((Integer) c2862b.f12496d.m6596a(C3052g3.f14242O3)).intValue();
            }
            if (i >= iIntValue) {
                return;
            }
            aw0 aw0Var = this.f19231i;
            kv1<Bundle> kv1VarM7963a = aw0Var.f12468c.m7963a();
            zv0 zv0Var = new zv0(aw0Var, z);
            ((fl1) kv1VarM7963a).mo6230f(new ev1(kv1VarM7963a, zv0Var), C2962do.f13335f);
            synchronized (obj) {
                f19229g++;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        m8330a(true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(yv2 yv2Var) {
        m8330a(false);
    }
}
