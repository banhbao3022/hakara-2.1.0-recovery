package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2223f;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2233p;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p636z0.p663d.p664a.CustomTabsIntent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ry0 implements bx0<yc0> {

    /* JADX INFO: renamed from: a */
    public final Context f19420a;

    /* JADX INFO: renamed from: b */
    public final ud0 f19421b;

    /* JADX INFO: renamed from: c */
    public final Executor f19422c;

    /* JADX INFO: renamed from: d */
    public final qh1 f19423d;

    public ry0(Context context, Executor executor, ud0 ud0Var, qh1 qh1Var) {
        this.f19420a = context;
        this.f19421b = ud0Var;
        this.f19422c = executor;
        this.f19423d = qh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: a */
    public final kv1<yc0> mo6115a(final di1 di1Var, final rh1 rh1Var) {
        String string;
        try {
            string = rh1Var.f18830u.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        final Uri uri = string != null ? Uri.parse(string) : null;
        return cw0.m6249s(cw0.m6231a(null), new qu1(this, uri, di1Var, rh1Var) { // from class: c.n.b.d.j.a.py0

            /* JADX INFO: renamed from: a */
            public final ry0 f18132a;

            /* JADX INFO: renamed from: b */
            public final Uri f18133b;

            /* JADX INFO: renamed from: c */
            public final di1 f18134c;

            /* JADX INFO: renamed from: d */
            public final rh1 f18135d;

            {
                this.f18132a = this;
                this.f18133b = uri;
                this.f18134c = di1Var;
                this.f18135d = rh1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                ry0 ry0Var = this.f18132a;
                Uri uri2 = this.f18133b;
                di1 di1Var2 = this.f18134c;
                rh1 rh1Var2 = this.f18135d;
                Objects.requireNonNull(ry0Var);
                try {
                    CustomTabsIntent customTabsIntentM15061a = new CustomTabsIntent.a().m15061a();
                    customTabsIntentM15061a.f35369a.setData(uri2);
                    C2223f c2223f = new C2223f(customTabsIntentM15061a.f35369a, null);
                    final C3147io c3147io = new C3147io();
                    zc0 zc0VarMo7564c = ry0Var.f19421b.mo7564c(new c30(di1Var2, rh1Var2, null), new cd0(new ce0(c3147io) { // from class: c.n.b.d.j.a.qy0

                        /* JADX INFO: renamed from: a */
                        public final C3147io f18665a;

                        {
                            this.f18665a = c3147io;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.ce0
                        /* JADX INFO: renamed from: a */
                        public final void mo6171a(boolean z, Context context) {
                            C3147io c3147io2 = this.f18665a;
                            try {
                                C2233p c2233p = C2330u.f10884a.f10888c;
                                C2233p.m4697a(context, (AdOverlayInfoParcel) c3147io2.get(), true);
                            } catch (Exception unused2) {
                            }
                        }
                    }, null));
                    c3147io.m7286a(new AdOverlayInfoParcel(c2223f, null, zc0VarMo7564c.mo7413i(), null, new C3702xn(0, 0, false, false, false), null));
                    ry0Var.f19423d.m8204b(2, 3);
                    return cw0.m6231a(zc0VarMo7564c.mo7412h());
                } catch (Throwable th) {
                    C2622l.m5438t3("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            }
        }, this.f19422c);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bx0
    /* JADX INFO: renamed from: b */
    public final boolean mo6116b(di1 di1Var, rh1 rh1Var) {
        String string;
        Context context = this.f19420a;
        if (!(context instanceof Activity) || !C2830a4.m5684a(context)) {
            return false;
        }
        try {
            string = rh1Var.f18830u.getString("tab_url");
        } catch (Exception unused) {
            string = null;
        }
        return !TextUtils.isEmpty(string);
    }
}
