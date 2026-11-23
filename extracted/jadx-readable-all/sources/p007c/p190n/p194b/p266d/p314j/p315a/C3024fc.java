package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.fc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3024fc implements InterfaceC3615va, InterfaceC2987ec {

    /* JADX INFO: renamed from: f */
    public final InterfaceC2987ec f14010f;

    /* JADX INFO: renamed from: g */
    public final HashSet<AbstractMap.SimpleEntry<String, InterfaceC3464r8<? super InterfaceC2987ec>>> f14011g = new HashSet<>();

    public C3024fc(InterfaceC2987ec interfaceC2987ec) {
        this.f14010f = interfaceC2987ec;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: B0 */
    public final void mo6433B0(String str, JSONObject jSONObject) {
        C2622l.m5452w2(this, str, jSONObject);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: Z */
    public final void mo6470Z(String str, String str2) {
        C2622l.m5313T1(this, str, str2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2987ec
    /* JADX INFO: renamed from: c */
    public final void mo6617c(String str, InterfaceC3464r8<? super InterfaceC2987ec> interfaceC3464r8) {
        this.f14010f.mo6617c(str, interfaceC3464r8);
        this.f14011g.remove(new AbstractMap.SimpleEntry(str, interfaceC3464r8));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2987ec
    /* JADX INFO: renamed from: e */
    public final void mo6618e(String str, InterfaceC3464r8<? super InterfaceC2987ec> interfaceC3464r8) {
        this.f14010f.mo6618e(str, interfaceC3464r8);
        this.f14011g.add(new AbstractMap.SimpleEntry<>(str, interfaceC3464r8));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3615va, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: f */
    public final void mo6478f(String str) {
        this.f14010f.mo6478f(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: r0 */
    public final void mo6501r0(String str, Map map) {
        try {
            C2622l.m5452w2(this, str, C2330u.f10884a.f10889d.m4767C(map));
        } catch (JSONException unused) {
            C2622l.m5226A3("Could not convert parameters to JSON.");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: u0 */
    public final void mo6507u0(String str, JSONObject jSONObject) {
        C2622l.m5313T1(this, str, jSONObject.toString());
    }
}
