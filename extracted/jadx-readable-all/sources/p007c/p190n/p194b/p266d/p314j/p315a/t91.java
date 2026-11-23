package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class t91 implements ia1<u91> {

    /* JADX INFO: renamed from: a */
    public final C2885bm f19794a;

    /* JADX INFO: renamed from: b */
    public final lv1 f19795b;

    /* JADX INFO: renamed from: c */
    public final Context f19796c;

    public t91(C2885bm c2885bm, lv1 lv1Var, Context context) {
        this.f19794a = c2885bm;
        this.f19795b = lv1Var;
        this.f19796c = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<u91> zza() {
        return this.f19795b.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.s91

            /* JADX INFO: renamed from: a */
            public final t91 f19504a;

            {
                this.f19504a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                Long l;
                t91 t91Var = this.f19504a;
                if (!t91Var.f19794a.m6048f(t91Var.f19796c)) {
                    return new u91(null, null, null, null, null);
                }
                String strM6049g = t91Var.f19794a.m6049g(t91Var.f19796c);
                if (strM6049g == null) {
                    strM6049g = "";
                }
                String str2 = strM6049g;
                String strM6050h = t91Var.f19794a.m6050h(t91Var.f19796c);
                if (strM6050h == null) {
                    strM6050h = "";
                }
                String str3 = strM6050h;
                String strM6051i = t91Var.f19794a.m6051i(t91Var.f19796c);
                if (strM6051i == null) {
                    strM6051i = "";
                }
                String str4 = strM6051i;
                C2885bm c2885bm = t91Var.f19794a;
                Context context = t91Var.f19796c;
                if (c2885bm.m6048f(context)) {
                    synchronized (c2885bm.f12733b) {
                        str = c2885bm.f12735d;
                        if (str == null) {
                            if (C2885bm.m6042m(context)) {
                                c2885bm.f12735d = (String) c2885bm.m6047e("getAppIdOrigin", c2885bm.f12735d, C3292ml.f16787a);
                            } else {
                                c2885bm.f12735d = "fa";
                            }
                            str = c2885bm.f12735d;
                        }
                    }
                } else {
                    str = null;
                }
                String str5 = str == null ? "" : str;
                if ("TIME_OUT".equals(str3)) {
                    l = (Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14292X);
                } else {
                    l = null;
                }
                return new u91(str2, str3, str4, str5, l);
            }
        });
    }
}
