package p007c.p190n.p194b.p266d.p267a;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1;
import p007c.p190n.p194b.p266d.p314j.p315a.ow2;

/* JADX INFO: renamed from: c.n.b.d.a.s */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2192s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2976e1 f10588a;

    /* JADX INFO: renamed from: b */
    public final List<C2183j> f10589b = new ArrayList();

    public C2192s(InterfaceC2976e1 interfaceC2976e1) {
        this.f10588a = interfaceC2976e1;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14279U4)).booleanValue()) {
            try {
                List<ow2> listMo5695f = interfaceC2976e1.mo5695f();
                if (listMo5695f != null) {
                    Iterator<ow2> it = listMo5695f.iterator();
                    while (it.hasNext()) {
                        ow2 next = it.next();
                        C2183j c2183j = next != null ? new C2183j(next) : null;
                        if (c2183j != null) {
                            this.f10589b.add(c2183j);
                        }
                    }
                }
            } catch (RemoteException e) {
                C2622l.m5438t3("Could not forward getAdapterResponseInfo to ResponseInfo.", e);
            }
        }
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public final JSONObject m4634a() throws JSONException {
        String strMo5694d;
        JSONObject jSONObject = new JSONObject();
        String strMo5693c = null;
        try {
            InterfaceC2976e1 interfaceC2976e1 = this.f10588a;
            strMo5694d = interfaceC2976e1 != null ? interfaceC2976e1.mo5694d() : null;
        } catch (RemoteException e) {
            C2622l.m5438t3("Could not forward getResponseId to ResponseInfo.", e);
        }
        if (strMo5694d == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strMo5694d);
        }
        try {
            InterfaceC2976e1 interfaceC2976e2 = this.f10588a;
            if (interfaceC2976e2 != null) {
                strMo5693c = interfaceC2976e2.mo5693c();
            }
        } catch (RemoteException e2) {
            C2622l.m5438t3("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
        }
        if (strMo5693c == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strMo5693c);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C2183j> it = this.f10589b.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().m4629a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return m4634a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
