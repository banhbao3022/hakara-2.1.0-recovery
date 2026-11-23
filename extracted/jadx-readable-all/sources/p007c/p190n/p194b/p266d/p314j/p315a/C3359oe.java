package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2124r;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2114h;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2117k;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2119m;
import p007c.p190n.p194b.p266d.p267a.p279w.InterfaceC2203f;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.oe */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3359oe implements InterfaceC2114h, InterfaceC2117k, InterfaceC2119m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3618vd f17602a;

    /* JADX INFO: renamed from: b */
    public AbstractC2124r f17603b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2203f f17604c;

    public C3359oe(InterfaceC3618vd interfaceC3618vd) {
        this.f17602a = interfaceC3618vd;
    }

    /* JADX INFO: renamed from: a */
    public final void m7997a(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdClosed.");
        try {
            this.f17602a.mo6582d();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m7998b(MediationBannerAdapter mediationBannerAdapter, C2103a c2103a) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        int i = c2103a.f10443a;
        String str = c2103a.f10444b;
        String str2 = c2103a.f10445c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        C2622l.m5318U2(sb.toString());
        try {
            this.f17602a.mo6584g1(c2103a.m4597a());
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m7999c(MediationInterstitialAdapter mediationInterstitialAdapter, int i) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        StringBuilder sb = new StringBuilder(55);
        sb.append("Adapter called onAdFailedToLoad with error ");
        sb.append(i);
        sb.append(".");
        C2622l.m5318U2(sb.toString());
        try {
            this.f17602a.mo6580Y(i);
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8000d(MediationInterstitialAdapter mediationInterstitialAdapter, C2103a c2103a) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        int i = c2103a.f10443a;
        String str = c2103a.f10444b;
        String str2 = c2103a.f10445c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        C2622l.m5318U2(sb.toString());
        try {
            this.f17602a.mo6584g1(c2103a.m4597a());
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8001e(MediationNativeAdapter mediationNativeAdapter, C2103a c2103a) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        int i = c2103a.f10443a;
        String str = c2103a.f10444b;
        String str2 = c2103a.f10445c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 97 + String.valueOf(str2).length());
        sb.append("Adapter called onAdFailedToLoad with error. ErrorCode: ");
        sb.append(i);
        sb.append(". ErrorMessage: ");
        sb.append(str);
        sb.append(". ErrorDomain: ");
        sb.append(str2);
        C2622l.m5318U2(sb.toString());
        try {
            this.f17602a.mo6584g1(c2103a.m4597a());
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8002f(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdLoaded.");
        try {
            this.f17602a.mo6585h();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8003g(MediationInterstitialAdapter mediationInterstitialAdapter) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdOpened.");
        try {
            this.f17602a.mo6586i();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
