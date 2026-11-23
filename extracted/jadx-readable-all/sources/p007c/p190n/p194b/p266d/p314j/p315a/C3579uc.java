package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.uc */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3579uc implements InterfaceC2984e9 {

    /* JADX INFO: renamed from: a */
    public final C3690xb f20259a;

    /* JADX INFO: renamed from: b */
    public final C3147io f20260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3617vc f20261c;

    public C3579uc(C3617vc c3617vc, C3690xb c3690xb, C3147io c3147io) {
        this.f20261c = c3617vc;
        this.f20259a = c3690xb;
        this.f20260b = c3147io;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2984e9
    /* JADX INFO: renamed from: t */
    public final void mo6167t(String str) {
        C3690xb c3690xb;
        try {
            if (str == null) {
                this.f20260b.m7287b(new C3061gc());
            } else {
                this.f20260b.m7287b(new C3061gc(str));
            }
            c3690xb = this.f20259a;
        } catch (IllegalStateException unused) {
            c3690xb = this.f20259a;
        } catch (Throwable th) {
            this.f20259a.m8731d();
            throw th;
        }
        c3690xb.m8731d();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2984e9
    /* JADX INFO: renamed from: u */
    public final void mo6168u(JSONObject jSONObject) {
        C3690xb c3690xb;
        try {
            try {
                this.f20260b.m7286a(this.f20261c.f20731a.mo6859u(jSONObject));
                c3690xb = this.f20259a;
            } catch (IllegalStateException unused) {
                c3690xb = this.f20259a;
            } catch (JSONException e) {
                this.f20260b.m7287b(e);
                c3690xb = this.f20259a;
            }
            c3690xb.m8731d();
        } catch (Throwable th) {
            this.f20259a.m8731d();
            throw th;
        }
    }
}
