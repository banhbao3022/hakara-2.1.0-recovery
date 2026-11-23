package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class eq2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f13648f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ iq2 f13649g;

    public eq2(iq2 iq2Var, View view) {
        this.f13649g = iq2Var;
        this.f13648f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        iq2 iq2Var = this.f13649g;
        View view = this.f13648f;
        Objects.requireNonNull(iq2Var);
        try {
            xp2 xp2Var = new xp2(iq2Var.f15345k, iq2Var.f15346l, iq2Var.f15347m, iq2Var.f15348n, iq2Var.f15349o, iq2Var.f15350p, iq2Var.f15351q, iq2Var.f15354t);
            Context contextM6425e = C2330u.f10884a.f10892g.m6425e();
            if (contextM6425e != null && !TextUtils.isEmpty(iq2Var.f15352r)) {
                String str = (String) view.getTag(contextM6425e.getResources().getIdentifier((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14232N), "id", contextM6425e.getPackageName()));
                if (str != null && str.equals(iq2Var.f15352r)) {
                    return;
                }
            }
            hq2 hq2VarM7288a = iq2Var.m7288a(view, xp2Var);
            xp2Var.m8746b();
            if (hq2VarM7288a.f14938a == 0 && hq2VarM7288a.f14939b == 0) {
                return;
            }
            int i = hq2VarM7288a.f14939b;
            if (i == 0 && xp2Var.f21646k == 0) {
                return;
            }
            if (i == 0) {
                yp2 yp2Var = iq2Var.f15343i;
                synchronized (yp2Var.f21969a) {
                    z = yp2Var.f21971c.contains(xp2Var);
                }
                if (z) {
                    return;
                }
            }
            iq2Var.f15343i.m8824b(xp2Var);
        } catch (Exception e) {
            C2622l.m5438t3("Exception in fetchContentOnUIThread", e);
            C2998en c2998en = C2330u.f10884a.f10893h;
            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "ContentFetchTask.fetchContent");
        }
    }
}
