package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p314j.p325k.C4118ca;
import p007c.p190n.p194b.p266d.p314j.p325k.C4132da;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4174ga;

/* JADX INFO: renamed from: c.n.b.d.k.b.g9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4527g9 {

    /* JADX INFO: renamed from: a */
    public long f23949a;

    /* JADX INFO: renamed from: b */
    public long f23950b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4541i f23951c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C4744z8 f23952d;

    public C4527g9(C4744z8 c4744z8) {
        this.f23952d = c4744z8;
        this.f23951c = new C4515f9(this, c4744z8.f24476a);
        long jMo5621a = c4744z8.f24476a.f24541o.mo5621a();
        this.f23949a = jMo5621a;
        this.f23950b = jMo5621a;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10588a(boolean z, boolean z2, long j2) {
        this.f23952d.mo10381b();
        this.f23952d.m10479t();
        if (!C4118ca.m9505a() || !this.f23952d.f24476a.f24534h.m10417k(C4647r.f24370q0) || this.f23952d.f24476a.m10828d()) {
            this.f23952d.m10818g().f23907v.m10611b(this.f23952d.f24476a.f24541o.mo5623c());
        }
        long jM10589b = j2 - this.f23949a;
        if (!z && jM10589b < 1000) {
            this.f23952d.mo10684l().f24426n.m10812b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(jM10589b));
            return false;
        }
        if (this.f23952d.f24476a.f24534h.m10417k(C4647r.f24330T) && !z2) {
            if (((InterfaceC4174ga) C4132da.f23116f.zza()).zza() && this.f23952d.f24476a.f24534h.m10417k(C4647r.f24332V)) {
                jM10589b = j2 - this.f23950b;
                this.f23950b = j2;
            } else {
                jM10589b = m10589b();
            }
        }
        this.f23952d.mo10684l().f24426n.m10812b("Recording user engagement, ms", Long.valueOf(jM10589b));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", jM10589b);
        C4573k7.m10622A(this.f23952d.m10386q().m10628w(!this.f23952d.f24476a.f24534h.m10428z().booleanValue()), bundle, true);
        if (this.f23952d.f24476a.f24534h.m10417k(C4647r.f24330T) && !this.f23952d.f24476a.f24534h.m10417k(C4647r.f24331U) && z2) {
            bundle.putLong("_fr", 1L);
        }
        if (!this.f23952d.f24476a.f24534h.m10417k(C4647r.f24331U) || !z2) {
            this.f23952d.m10383i().m10517H("auto", "_e", bundle);
        }
        this.f23949a = j2;
        this.f23951c.m10597c();
        this.f23951c.m10596b(3600000L);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final long m10589b() {
        long jMo5621a = this.f23952d.f24476a.f24541o.mo5621a();
        long j2 = jMo5621a - this.f23950b;
        this.f23950b = jMo5621a;
        return j2;
    }
}
