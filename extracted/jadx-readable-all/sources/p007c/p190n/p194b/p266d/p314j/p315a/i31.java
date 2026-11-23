package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i31 extends AbstractBinderC3323nf {

    /* JADX INFO: renamed from: f */
    public final String f15082f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3249lf f15083g;

    /* JADX INFO: renamed from: h */
    public final C3147io<JSONObject> f15084h;

    /* JADX INFO: renamed from: i */
    public final JSONObject f15085i;

    /* JADX INFO: renamed from: j */
    public boolean f15086j;

    public i31(String str, InterfaceC3249lf interfaceC3249lf, C3147io<JSONObject> c3147io) {
        JSONObject jSONObject = new JSONObject();
        this.f15085i = jSONObject;
        this.f15086j = false;
        this.f15084h = c3147io;
        this.f15082f = str;
        this.f15083g = interfaceC3249lf;
        try {
            jSONObject.put("adapter_version", interfaceC3249lf.mo7329d().toString());
            jSONObject.put("sdk_version", interfaceC3249lf.mo7331f().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: S */
    public final synchronized void m7193S(String str) throws RemoteException {
        if (this.f15086j) {
            return;
        }
        try {
            this.f15085i.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.f15084h.m7286a(this.f15085i);
        this.f15086j = true;
    }
}
