package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.annotation.KeepName;
import java.util.Objects;
import p007c.p190n.p191a.C1254c;
import p007c.p190n.p191a.EnumC1252a;
import p007c.p190n.p191a.p192d.C1255a;
import p007c.p190n.p191a.p192d.InterfaceC1257c;
import p007c.p190n.p191a.p192d.InterfaceC1258d;
import p007c.p190n.p191a.p192d.p193g.C1263c;
import p007c.p190n.p191a.p192d.p193g.C1264d;
import p007c.p190n.p191a.p192d.p193g.C1265e;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.C2128c;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3581ue;
import p007c.p190n.p194b.p266d.p314j.p315a.RunnableC3507se;
import p007c.p190n.p194b.p266d.p314j.p315a.RunnableC3544te;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter<C2128c, C1263c>, MediationInterstitialAdapter<C2128c, C1263c> {

    /* JADX INFO: renamed from: a */
    public CustomEventBanner f28308a;

    /* JADX INFO: renamed from: b */
    public CustomEventInterstitial f28309b;

    /* JADX INFO: renamed from: a */
    public static <T> T m12617a(String str) {
        try {
            return (T) Class.forName(null).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder("null".length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append((String) null);
            sb.append(". ");
            sb.append(message);
            C2622l.m5226A3(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, p007c.p190n.p191a.p192d.InterfaceC1256b
    public void destroy() {
        CustomEventBanner customEventBanner = this.f28308a;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f28309b;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, p007c.p190n.p191a.p192d.InterfaceC1256b
    @RecentlyNonNull
    public Class<C2128c> getAdditionalParametersType() {
        return C2128c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return null;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, p007c.p190n.p191a.p192d.InterfaceC1256b
    @RecentlyNonNull
    public Class<C1263c> getServerParametersType() {
        return C1263c.class;
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.f28309b.showInterstitial();
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull InterfaceC1257c interfaceC1257c, @RecentlyNonNull Activity activity, @RecentlyNonNull C1263c c1263c, @RecentlyNonNull C1254c c1254c, @RecentlyNonNull C1255a c1255a, @RecentlyNonNull C2128c c2128c) {
        Objects.requireNonNull(c1263c);
        CustomEventBanner customEventBanner = (CustomEventBanner) m12617a(null);
        this.f28308a = customEventBanner;
        if (customEventBanner != null) {
            this.f28308a.requestBannerAd(new C1264d(this, interfaceC1257c), activity, null, null, c1254c, c1255a, c2128c != null ? c2128c.f10470a.get(null) : null);
            return;
        }
        EnumC1252a enumC1252a = EnumC1252a.INTERNAL_ERROR;
        C3581ue c3581ue = (C3581ue) interfaceC1257c;
        Objects.requireNonNull(c3581ue);
        String strValueOf = String.valueOf(enumC1252a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error. ");
        sb.append(strValueOf);
        C2622l.m5318U2(sb.toString());
        C3331nn c3331nn = gx2.f14692a.f14693b;
        if (!C3331nn.m7890h()) {
            C2622l.m5271J3("#008 Must be called on the main UI thread.", null);
            C3331nn.f17166a.post(new RunnableC3507se(c3581ue, enumC1252a));
        } else {
            try {
                c3581ue.f20293a.mo6580Y(C2622l.m5355d0(enumC1252a));
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull InterfaceC1258d interfaceC1258d, @RecentlyNonNull Activity activity, @RecentlyNonNull C1263c c1263c, @RecentlyNonNull C1255a c1255a, @RecentlyNonNull C2128c c2128c) {
        Objects.requireNonNull(c1263c);
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m12617a(null);
        this.f28309b = customEventInterstitial;
        if (customEventInterstitial != null) {
            this.f28309b.requestInterstitialAd(new C1265e(this, this, interfaceC1258d), activity, null, null, c1255a, c2128c != null ? c2128c.f10470a.get(null) : null);
            return;
        }
        EnumC1252a enumC1252a = EnumC1252a.INTERNAL_ERROR;
        C3581ue c3581ue = (C3581ue) interfaceC1258d;
        Objects.requireNonNull(c3581ue);
        String strValueOf = String.valueOf(enumC1252a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 47);
        sb.append("Adapter called onFailedToReceiveAd with error ");
        sb.append(strValueOf);
        sb.append(".");
        C2622l.m5318U2(sb.toString());
        C3331nn c3331nn = gx2.f14692a.f14693b;
        if (!C3331nn.m7890h()) {
            C2622l.m5271J3("#008 Must be called on the main UI thread.", null);
            C3331nn.f17166a.post(new RunnableC3544te(c3581ue, enumC1252a));
        } else {
            try {
                c3581ue.f20293a.mo6580Y(C2622l.m5355d0(enumC1252a));
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }
}
