package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r71 implements ia1<s71> {

    /* JADX INFO: renamed from: a */
    public final lv1 f18715a;

    public r71(Context context, lv1 lv1Var) {
        this.f18715a = lv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<s71> zza() {
        return this.f18715a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.q71
            @Override // java.util.concurrent.Callable
            public final Object call() {
                xp2 xp2Var;
                String str;
                String strM4839i;
                String str2;
                String str3;
                C2330u c2330u = C2330u.f10884a;
                C2267h1 c2267h1 = c2330u.f10889d;
                iq2 iq2VarM4834d = ((C2311z0) c2330u.f10893h.m6649f()).m4834d();
                Bundle bundle = null;
                if (iq2VarM4834d != null && (!((C2311z0) c2330u.f10893h.m6649f()).m4835e() || !((C2311z0) c2330u.f10893h.m6649f()).m4837g())) {
                    int i = 0;
                    if (iq2VarM4834d.f15341g) {
                        synchronized (iq2VarM4834d.f15342h) {
                            iq2VarM4834d.f15341g = false;
                            iq2VarM4834d.f15342h.notifyAll();
                            C2622l.m5318U2("ContentFetchThread: wakeup");
                        }
                    }
                    yp2 yp2Var = iq2VarM4834d.f15343i;
                    boolean z = iq2VarM4834d.f15355u;
                    synchronized (yp2Var.f21969a) {
                        if (yp2Var.f21971c.size() == 0) {
                            C2622l.m5318U2("Queue empty");
                            xp2Var = null;
                        } else if (yp2Var.f21971c.size() >= 2) {
                            xp2Var = null;
                            int i2 = 0;
                            int i3 = Integer.MIN_VALUE;
                            for (xp2 xp2Var2 : yp2Var.f21971c) {
                                int i4 = xp2Var2.f21649n;
                                if (i4 > i3) {
                                    i = i2;
                                }
                                int i5 = i4 > i3 ? i4 : i3;
                                if (i4 > i3) {
                                    xp2Var = xp2Var2;
                                }
                                i2++;
                                i3 = i5;
                            }
                            yp2Var.f21971c.remove(i);
                        } else {
                            xp2Var = yp2Var.f21971c.get(0);
                            if (z) {
                                yp2Var.f21971c.remove(0);
                            } else {
                                synchronized (xp2Var.f21642g) {
                                    xp2Var.f21649n -= 100;
                                }
                            }
                        }
                    }
                    if (xp2Var != null) {
                        str2 = xp2Var.f21650o;
                        str3 = xp2Var.f21651p;
                        strM4839i = xp2Var.f21652q;
                        if (str2 != null) {
                            ((C2311z0) C2330u.f10884a.f10893h.m6649f()).m4836f(str2);
                        }
                        if (strM4839i != null) {
                            ((C2311z0) C2330u.f10884a.f10893h.m6649f()).m4838h(strM4839i);
                        }
                    } else {
                        C2330u c2330u2 = C2330u.f10884a;
                        C2311z0 c2311z0 = (C2311z0) c2330u2.f10893h.m6649f();
                        c2311z0.m4831a();
                        synchronized (c2311z0.f10805a) {
                            str = c2311z0.f10813i;
                        }
                        strM4839i = ((C2311z0) c2330u2.f10893h.m6649f()).m4839i();
                        str2 = str;
                        str3 = null;
                    }
                    Bundle bundle2 = new Bundle(1);
                    C2330u c2330u3 = C2330u.f10884a;
                    if (!((C2311z0) c2330u3.f10893h.m6649f()).m4837g()) {
                        if (strM4839i == null || TextUtils.isEmpty(strM4839i)) {
                            bundle2.putString("v_fp_vertical", "no_hash");
                        } else {
                            bundle2.putString("v_fp_vertical", strM4839i);
                        }
                    }
                    if (str2 != null && !((C2311z0) c2330u3.f10893h.m6649f()).m4835e()) {
                        bundle2.putString("fingerprint", str2);
                        if (!str2.equals(str3)) {
                            bundle2.putString("v_fp", str3);
                        }
                    }
                    if (!bundle2.isEmpty()) {
                        bundle = bundle2;
                    }
                }
                return new s71(bundle);
            }
        });
    }
}
