package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a71 implements ia1<ha1<Bundle>> {

    /* JADX INFO: renamed from: a */
    public final te1 f12031a;

    public a71(te1 te1Var) {
        this.f12031a = te1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<ha1<Bundle>> zza() {
        String str;
        te1 te1Var = this.f12031a;
        ha1 ha1Var = null;
        if (te1Var != null && (str = te1Var.f19820a) != null && !str.isEmpty()) {
            ha1Var = new ha1(this) { // from class: c.n.b.d.j.a.z61

                /* JADX INFO: renamed from: a */
                public final a71 f22185a;

                {
                    this.f22185a = this;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
                /* JADX INFO: renamed from: d */
                public final void mo5696d(Object obj) {
                    ((Bundle) obj).putString("key_schema", this.f22185a.f12031a.f19820a);
                }
            };
        }
        return cw0.m6231a(ha1Var);
    }
}
