package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: renamed from: c.n.b.d.j.a.dy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2972dy implements InterfaceC3712xx {

    /* JADX INFO: renamed from: a */
    public final Context f13423a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2305w0 f13424b = C2330u.f10884a.f10893h.m6649f();

    public C2972dy(Context context) {
        this.f13423a = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3712xx
    /* JADX INFO: renamed from: a */
    public final void mo6122a(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        String str = map.get("gad_idless");
        if (str != null) {
            boolean z = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14381k0;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                this.f13424b.mo4821s0(z);
                if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14236N3)).booleanValue() && z) {
                    this.f13423a.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        final Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14353g0)).booleanValue()) {
            C2330u.f10884a.f10910y.m6046d("setConsent", new InterfaceC2848am(bundle) { // from class: c.n.b.d.j.a.kl

                /* JADX INFO: renamed from: a */
                public final Bundle f15976a;

                {
                    this.f15976a = bundle;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2848am
                /* JADX INFO: renamed from: a */
                public final void mo5828a(InterfaceC3079gu interfaceC3079gu) throws RemoteException {
                    interfaceC3079gu.mo6627s1(this.f15976a);
                }
            });
        }
    }
}
