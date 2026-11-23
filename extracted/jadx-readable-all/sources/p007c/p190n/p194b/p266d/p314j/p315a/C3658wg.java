package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.wg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3658wg implements InterfaceC3695xg {

    /* JADX INFO: renamed from: a */
    public static final Object f21077a = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean f21078b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f21079c = false;

    /* JADX INFO: renamed from: d */
    public fn1 f21080d;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: R */
    public final void mo5878R(InterfaceC2799a interfaceC2799a) {
        synchronized (f21077a) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && f21078b) {
                try {
                    this.f21080d.mo6378R(interfaceC2799a);
                } catch (RemoteException | NullPointerException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8641a(Context context) {
        synchronized (f21077a) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && !f21079c) {
                try {
                    f21079c = true;
                    this.f21080d = (fn1) C2622l.m5233C0(context, "com.google.android.gms.ads.omid.DynamiteOmid", C3621vg.f20762a);
                } catch (C3628vn e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: k0 */
    public final void mo5880k0(InterfaceC2799a interfaceC2799a) {
        synchronized (f21077a) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && f21078b) {
                try {
                    this.f21080d.zzf(interfaceC2799a);
                } catch (RemoteException | NullPointerException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: l0 */
    public final InterfaceC2799a mo5881l0(String str, WebView webView, String str2, String str3, String str4, String str5, EnumC3769zg enumC3769zg, EnumC3732yg enumC3732yg, String str6) throws Throwable {
        synchronized (f21077a) {
            try {
                try {
                    AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14259R2;
                    C2862b c2862b = C2862b.f12493a;
                    if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && f21078b) {
                        if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14283V2)).booleanValue()) {
                            return mo5883n0(str, webView, "", "javascript", str4, str5);
                        }
                        try {
                            return this.f21080d.mo6376P0(str, new BinderC2800b(webView), "", "javascript", str4, str5, enumC3769zg.f22269k, enumC3732yg.f21878j, str6);
                        } catch (RemoteException | NullPointerException e) {
                            C2622l.m5271J3("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC2799a mo5882m0(String str, WebView webView, String str2, String str3, String str4) {
        return mo5883n0(str, webView, "", "javascript", str4, "Google");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC2799a mo5883n0(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (f21077a) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && f21078b) {
                try {
                    return this.f21080d.mo6375A4(str, new BinderC2800b(webView), "", "javascript", str4, str5);
                } catch (RemoteException | NullPointerException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                    return null;
                }
            }
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: o0 */
    public final boolean mo5884o0(Context context) {
        synchronized (f21077a) {
            try {
                if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue()) {
                    return false;
                }
                if (f21078b) {
                    return true;
                }
                try {
                    m8641a(context);
                    boolean zMo6382h0 = this.f21080d.mo6382h0(new BinderC2800b(context));
                    f21078b = zMo6382h0;
                    return zMo6382h0;
                } catch (RemoteException e) {
                    e = e;
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                    return false;
                } catch (NullPointerException e2) {
                    e = e2;
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                    return false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC2799a mo5885p0(String str, WebView webView, String str2, String str3, String str4, EnumC3769zg enumC3769zg, EnumC3732yg enumC3732yg, String str5) throws Throwable {
        synchronized (f21077a) {
            try {
                try {
                    AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14259R2;
                    C2862b c2862b = C2862b.f12493a;
                    if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && f21078b) {
                        if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14277U2)).booleanValue()) {
                            return mo5883n0(str, webView, "", "javascript", str4, "Google");
                        }
                        try {
                            return this.f21080d.mo6377P5(str, new BinderC2800b(webView), "", "javascript", str4, "Google", enumC3769zg.f22269k, enumC3732yg.f21878j, str5);
                        } catch (RemoteException | NullPointerException e) {
                            C2622l.m5271J3("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: q0 */
    public final String mo5886q0(Context context) {
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue()) {
            return null;
        }
        try {
            m8641a(context);
            String strValueOf = String.valueOf(this.f21080d.mo6380g());
            return strValueOf.length() != 0 ? "a.".concat(strValueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: r0 */
    public final void mo5887r0(InterfaceC2799a interfaceC2799a, View view) {
        synchronized (f21077a) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && f21078b) {
                try {
                    this.f21080d.mo6379f3(interfaceC2799a, new BinderC2800b(view));
                } catch (RemoteException | NullPointerException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: s0 */
    public final void mo5888s0(InterfaceC2799a interfaceC2799a, View view) {
        synchronized (f21077a) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && f21078b) {
                try {
                    this.f21080d.mo6381g5(interfaceC2799a, new BinderC2800b(view));
                } catch (RemoteException | NullPointerException e) {
                    C2622l.m5271J3("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
