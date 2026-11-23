package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.cd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2914cd implements InterfaceC2984e9 {

    /* JADX INFO: renamed from: a */
    public final C3147io f12980a;

    public C2914cd(C2951dd c2951dd, C3147io c3147io) {
        this.f12980a = c3147io;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2984e9
    /* JADX INFO: renamed from: t */
    public final void mo6167t(String str) {
        try {
            if (str == null) {
                this.f12980a.m7287b(new C3061gc());
            } else {
                this.f12980a.m7287b(new C3061gc(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2984e9
    /* JADX INFO: renamed from: u */
    public final void mo6168u(JSONObject jSONObject) {
        try {
            this.f12980a.m7286a(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.f12980a.m7287b(e);
        }
    }
}
