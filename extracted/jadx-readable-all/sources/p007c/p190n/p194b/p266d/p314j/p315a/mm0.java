package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import com.google.ads.mediation.AdUrlAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.zzasz;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mm0 {

    /* JADX INFO: renamed from: a */
    public final jm0 f16796a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<InterfaceC3395pd> f16797b = new AtomicReference<>();

    public mm0(jm0 jm0Var) {
        this.f16796a = jm0Var;
    }

    /* JADX INFO: renamed from: a */
    public final vi1 m7719a(String str, JSONObject jSONObject) throws mi1 {
        InterfaceC3506sd interfaceC3506sdMo7586t;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC3506sdMo7586t = new BinderC3322ne(new AdMobAdapter());
            } else if ("com.google.ads.mediation.AdUrlAdapter".equals(str)) {
                interfaceC3506sdMo7586t = new BinderC3322ne(new AdUrlAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC3506sdMo7586t = new BinderC3322ne(new zzasz());
            } else {
                InterfaceC3395pd interfaceC3395pdM7721c = m7721c();
                if ("com.google.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (interfaceC3395pdM7721c.mo7583E(string)) {
                            interfaceC3506sdMo7586t = interfaceC3395pdM7721c.mo7586t("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else {
                            interfaceC3506sdMo7586t = interfaceC3395pdM7721c.mo7585o0(string) ? interfaceC3395pdM7721c.mo7586t(string) : interfaceC3395pdM7721c.mo7586t("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        C2622l.m5438t3("Invalid custom event.", e);
                        interfaceC3506sdMo7586t = interfaceC3395pdM7721c.mo7586t(str);
                    }
                } else {
                    interfaceC3506sdMo7586t = interfaceC3395pdM7721c.mo7586t(str);
                }
            }
            vi1 vi1Var = new vi1(interfaceC3506sdMo7586t);
            jm0 jm0Var = this.f16796a;
            synchronized (jm0Var) {
                try {
                    if (!jm0Var.f15656a.containsKey(str)) {
                        try {
                            try {
                                jm0Var.f15656a.put(str, new im0(str, vi1Var.f20804a.mo7833X(), vi1Var.f20804a.mo7824H0()));
                            } catch (Throwable th) {
                                throw new mi1(th);
                            }
                        } catch (Throwable th2) {
                            throw new mi1(th2);
                        }
                    }
                } catch (mi1 unused) {
                }
            }
            return vi1Var;
        } catch (Throwable th3) {
            throw new mi1(th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3249lf m7720b(String str) throws RemoteException {
        InterfaceC3249lf interfaceC3249lfMo7584S = m7721c().mo7584S(str);
        jm0 jm0Var = this.f16796a;
        synchronized (jm0Var) {
            if (!jm0Var.f15656a.containsKey(str)) {
                try {
                    jm0Var.f15656a.put(str, new im0(str, interfaceC3249lfMo7584S.mo7329d(), interfaceC3249lfMo7584S.mo7331f()));
                } catch (Throwable unused) {
                }
            }
        }
        return interfaceC3249lfMo7584S;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3395pd m7721c() throws RemoteException {
        InterfaceC3395pd interfaceC3395pd = this.f16797b.get();
        if (interfaceC3395pd != null) {
            return interfaceC3395pd;
        }
        C2622l.m5226A3("Unexpected call to adapter creator.");
        throw new RemoteException();
    }
}
