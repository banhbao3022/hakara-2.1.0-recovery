package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.j.a.hy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3120hy implements InterfaceC3712xx {

    /* JADX INFO: renamed from: a */
    public final CookieManager f15049a;

    public C3120hy(Context context) {
        this.f15049a = C2330u.f10884a.f10891f.mo4722k(context);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3712xx
    /* JADX INFO: renamed from: a */
    public final void mo6122a(Map<String, String> map) {
        if (this.f15049a == null) {
            return;
        }
        if (map.get("clear") == null) {
            String str = map.get("cookie");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f15049a.setCookie((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14458v0), str);
            return;
        }
        String str2 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14458v0);
        String cookie = this.f15049a.getCookie(str2);
        if (cookie == null) {
            return;
        }
        ks1 ks1VarM7543a = ks1.m7543a(new as1(';'));
        gs1 gs1Var = new gs1(ks1VarM7543a.f16030a, ks1VarM7543a, cookie);
        ArrayList arrayList = new ArrayList();
        while (gs1Var.hasNext()) {
            arrayList.add((String) gs1Var.next());
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        for (int i = 0; i < listUnmodifiableList.size(); i++) {
            CookieManager cookieManager = this.f15049a;
            js1 js1Var = (js1) ((is1) ks1.m7543a(new as1('=')).m7544b((String) listUnmodifiableList.get(i))).iterator();
            if (!js1Var.hasNext()) {
                StringBuilder sb = new StringBuilder(91);
                sb.append("position (0) must be less than the number of elements that remained (");
                sb.append(0);
                sb.append(")");
                throw new IndexOutOfBoundsException(sb.toString());
            }
            String strValueOf = String.valueOf((String) js1Var.next());
            String strValueOf2 = String.valueOf((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14395m0));
            cookieManager.setCookie(str2, strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf));
        }
    }
}
