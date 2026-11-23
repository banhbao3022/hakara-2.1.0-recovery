package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.q7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3426q7 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3463r7 f18208a;

    public C3426q7(InterfaceC3463r7 interfaceC3463r7) {
        this.f18208a = interfaceC3463r7;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        if (this.f18208a == null) {
            return;
        }
        String str = map.get("name");
        if (str == null) {
            C2622l.m5458x3("Ad metadata with no name parameter.");
            str = "";
        }
        Bundle bundleM4782j = null;
        if (map.containsKey("info")) {
            try {
                bundleM4782j = C2269i0.m4782j(new JSONObject(map.get("info")));
            } catch (JSONException e) {
                C2622l.m5438t3("Failed to convert ad metadata to JSON.", e);
            }
        }
        if (bundleM4782j == null) {
            C2622l.m5408n3("Failed to convert ad metadata to Bundle.");
        } else {
            this.f18208a.mo5701F(str, bundleM4782j);
        }
    }
}
