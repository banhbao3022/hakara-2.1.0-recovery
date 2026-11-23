package p007c.p190n.p194b.p266d.p267a.p282z;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p314j.p315a.C2956di;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2884bl;

/* JADX INFO: renamed from: c.n.b.d.a.z.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2313d {

    /* JADX INFO: renamed from: a */
    public final Context f10832a;

    /* JADX INFO: renamed from: b */
    public boolean f10833b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2884bl f10834c;

    /* JADX INFO: renamed from: d */
    public final C2956di f10835d = new C2956di(false, Collections.emptyList());

    public C2313d(Context context, InterfaceC2884bl interfaceC2884bl, C2956di c2956di) {
        this.f10832a = context;
        this.f10834c = interfaceC2884bl;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4842a() {
        return !m4844c() || this.f10833b;
    }

    /* JADX INFO: renamed from: b */
    public final void m4843b(String str) {
        List<String> list;
        if (m4844c()) {
            if (str == null) {
                str = "";
            }
            InterfaceC2884bl interfaceC2884bl = this.f10834c;
            if (interfaceC2884bl != null) {
                interfaceC2884bl.mo6036c(str, null, 3);
                return;
            }
            C2956di c2956di = this.f10835d;
            if (!c2956di.f13277f || (list = c2956di.f13278g) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String strReplace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                    C2267h1.m4751j(this.f10832a, "", strReplace);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4844c() {
        InterfaceC2884bl interfaceC2884bl = this.f10834c;
        return (interfaceC2884bl != null && interfaceC2884bl.zza().f22315k) || this.f10835d.f13277f;
    }
}
