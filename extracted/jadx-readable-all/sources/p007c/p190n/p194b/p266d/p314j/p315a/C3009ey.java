package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.a.ey */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3009ey implements InterfaceC3712xx {

    /* JADX INFO: renamed from: a */
    public final qh1 f13753a;

    public C3009ey(qh1 qh1Var) {
        this.f13753a = qh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3712xx
    /* JADX INFO: renamed from: a */
    public final void mo6122a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            qh1 qh1Var = this.f13753a;
            if (Boolean.parseBoolean(str)) {
                qh1Var.m8204b(1, 2);
            } else {
                qh1Var.m8204b(2, 1);
            }
        } catch (Exception unused) {
            throw new IllegalStateException("Invalid render_in_browser state");
        }
    }
}
