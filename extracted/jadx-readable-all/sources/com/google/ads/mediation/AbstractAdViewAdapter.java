package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbic;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p191a.p192d.C1267i;
import p007c.p190n.p191a.p192d.C1268j;
import p007c.p190n.p191a.p192d.C1270l;
import p007c.p190n.p194b.p266d.p267a.C2169e;
import p007c.p190n.p194b.p266d.p267a.C2172f;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.C2182i;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p267a.C2194u;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2136v;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2114h;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2117k;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2119m;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2121o;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2123q;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2137w;
import p007c.p190n.p194b.p266d.p267a.p272c0.C2139a;
import p007c.p190n.p194b.p266d.p267a.p278v.InterfaceC2197c;
import p007c.p190n.p194b.p266d.p267a.p279w.C2202e;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC2828a2;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3088h2;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3278m7;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3315n7;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3389p7;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3754z1;
import p007c.p190n.p194b.p266d.p314j.p315a.C3165j5;
import p007c.p190n.p194b.p266d.p314j.p315a.C3310n2;
import p007c.p190n.p194b.p266d.p314j.p315a.C3331nn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3346o1;
import p007c.p190n.p194b.p266d.p314j.p315a.C3352o7;
import p007c.p190n.p194b.p266d.p314j.p315a.C3420q1;
import p007c.p190n.p194b.p266d.p314j.p315a.C3433qe;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v;
import p007c.p190n.p194b.p266d.p314j.p315a.aw2;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;
import p007c.p190n.p194b.p266d.p314j.p315a.iw2;
import p007c.p190n.p194b.p266d.p314j.p315a.jw2;
import p007c.p190n.p194b.p266d.p314j.p315a.uv2;
import p007c.p190n.p194b.p266d.p314j.p315a.vv2;
import p007c.p190n.p194b.p266d.p314j.p315a.wp2;
import p007c.p190n.p194b.p266d.p314j.p315a.yw2;
import p007c.p190n.p194b.p266d.p314j.p315a.zw2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements com.google.android.gms.ads.mediation.MediationBannerAdapter, MediationNativeAdapter, InterfaceC2123q, zzbic, InterfaceC2137w {

    @RecentlyNonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";

    @RecentlyNonNull
    public C2182i zza;

    @RecentlyNonNull
    public AbstractC2104a zzb;
    private C2169e zzc;

    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbic
    @RecentlyNonNull
    public Bundle getInterstitialAdapterInfo() {
        C2136v c2136v = new C2136v();
        c2136v.f10472a = 1;
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", c2136v.f10472a);
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2137w
    public InterfaceC3087h1 getVideoController() {
        InterfaceC3087h1 interfaceC3087h1;
        C2182i c2182i = this.zza;
        if (c2182i == null) {
            return null;
        }
        C2193t c2193t = c2182i.f10578f.f18154c;
        synchronized (c2193t.f10590a) {
            interfaceC3087h1 = c2193t.f10591b;
        }
        return interfaceC3087h1;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        C2182i c2182i = this.zza;
        if (c2182i != null) {
            C3420q1 c3420q1 = c2182i.f10578f;
            Objects.requireNonNull(c3420q1);
            try {
                InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
                if (interfaceC3604v != null) {
                    interfaceC3604v.mo4886b();
                }
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
            this.zza = null;
        }
        if (this.zzb != null) {
            this.zzb = null;
        }
        if (this.zzc != null) {
            this.zzc = null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2123q
    public void onImmersiveModeUpdated(boolean z) {
        AbstractC2104a abstractC2104a = this.zzb;
        if (abstractC2104a != null) {
            abstractC2104a.mo4601c(z);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        C2182i c2182i = this.zza;
        if (c2182i != null) {
            C3420q1 c3420q1 = c2182i.f10578f;
            Objects.requireNonNull(c3420q1);
            try {
                InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
                if (interfaceC3604v != null) {
                    interfaceC3604v.mo4889d();
                }
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        C2182i c2182i = this.zza;
        if (c2182i != null) {
            C3420q1 c3420q1 = c2182i.f10578f;
            Objects.requireNonNull(c3420q1);
            try {
                InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
                if (interfaceC3604v != null) {
                    interfaceC3604v.mo4890f();
                }
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2114h interfaceC2114h, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C2177g c2177g, @RecentlyNonNull InterfaceC2111e interfaceC2111e, @RecentlyNonNull Bundle bundle2) {
        C2182i c2182i = new C2182i(context);
        this.zza = c2182i;
        c2182i.setAdSize(new C2177g(c2177g.f10566k, c2177g.f10567l));
        this.zza.setAdUnitId(getAdUnitId(bundle));
        this.zza.setAdListener(new C1267i(this, interfaceC2114h));
        C2182i c2182i2 = this.zza;
        C2172f c2172fZzb = zzb(context, interfaceC2111e, bundle2, bundle);
        C3420q1 c3420q1 = c2182i2.f10578f;
        C3346o1 c3346o1 = c2172fZzb.f10554a;
        Objects.requireNonNull(c3420q1);
        try {
            if (c3420q1.f18160i == null) {
                if (c3420q1.f18158g == null || c3420q1.f18162k == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context2 = c3420q1.f18163l.getContext();
                jw2 jw2VarM8174a = C3420q1.m8174a(context2, c3420q1.f18158g, c3420q1.f18164m);
                InterfaceC3604v interfaceC3604vM6891d = "search_v2".equals(jw2VarM8174a.f15835f) ? new zw2(gx2.f14692a.f14694c, context2, jw2VarM8174a, c3420q1.f18162k).m6891d(context2, false) : new yw2(gx2.f14692a.f14694c, context2, jw2VarM8174a, c3420q1.f18162k, c3420q1.f18152a).m6891d(context2, false);
                c3420q1.f18160i = interfaceC3604vM6891d;
                interfaceC3604vM6891d.mo4893j5(new aw2(c3420q1.f18155d));
                uv2 uv2Var = c3420q1.f18156e;
                if (uv2Var != null) {
                    c3420q1.f18160i.mo4876P1(new vv2(uv2Var));
                }
                InterfaceC2197c interfaceC2197c = c3420q1.f18159h;
                if (interfaceC2197c != null) {
                    c3420q1.f18160i.mo4867D5(new wp2(interfaceC2197c));
                }
                C2194u c2194u = c3420q1.f18161j;
                if (c2194u != null) {
                    c3420q1.f18160i.mo4885a6(new C3310n2(c2194u));
                }
                c3420q1.f18160i.mo4880T5(new BinderC3088h2(c3420q1.f18166o));
                c3420q1.f18160i.mo4891h4(c3420q1.f18165n);
                InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
                if (interfaceC3604v != null) {
                    try {
                        InterfaceC2799a interfaceC2799aMo4883a = interfaceC3604v.mo4883a();
                        if (interfaceC2799aMo4883a != null) {
                            c3420q1.f18163l.addView((View) BinderC2800b.m5639T1(interfaceC2799aMo4883a));
                        }
                    } catch (RemoteException e) {
                        C2622l.m5271J3("#007 Could not call remote method.", e);
                    }
                }
            }
            InterfaceC3604v interfaceC3604v2 = c3420q1.f18160i;
            Objects.requireNonNull(interfaceC3604v2);
            if (interfaceC3604v2.mo4904y0(c3420q1.f18153b.m7314a(c3420q1.f18163l.getContext(), c3346o1))) {
                c3420q1.f18152a.f16317f = c3346o1.f17490g;
            }
        } catch (RemoteException e2) {
            C2622l.m5271J3("#007 Could not call remote method.", e2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2117k interfaceC2117k, @RecentlyNonNull Bundle bundle, @RecentlyNonNull InterfaceC2111e interfaceC2111e, @RecentlyNonNull Bundle bundle2) {
        AbstractC2104a.m4599a(context, getAdUnitId(bundle), zzb(context, interfaceC2111e, bundle2, bundle), new C1268j(this, interfaceC2117k));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2119m interfaceC2119m, @RecentlyNonNull Bundle bundle, @RecentlyNonNull InterfaceC2121o interfaceC2121o, @RecentlyNonNull Bundle bundle2) {
        C2202e c2202e;
        C2139a c2139a;
        C2169e c2169e;
        C1270l c1270l = new C1270l(this, interfaceC2119m);
        C2169e.a aVar = new C2169e.a(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        try {
            aVar.f10552b.mo5670K0(new aw2(c1270l));
        } catch (RemoteException e) {
            C2622l.m5241D3("Failed to set AdListener.", e);
        }
        C3433qe c3433qe = (C3433qe) interfaceC2121o;
        C3165j5 c3165j5 = c3433qe.f18258g;
        C2202e.a aVar2 = new C2202e.a();
        if (c3165j5 == null) {
            c2202e = new C2202e(aVar2);
        } else {
            int i = c3165j5.f15475f;
            if (i == 2) {
                aVar2.f10610f = c3165j5.f15479j;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        aVar2.f10611g = c3165j5.f15481l;
                        aVar2.f10607c = c3165j5.f15482m;
                    }
                }
                C3310n2 c3310n2 = c3165j5.f15480k;
                if (c3310n2 != null) {
                    aVar2.f10609e = new C2194u(c3310n2);
                }
                aVar2.f10610f = c3165j5.f15479j;
            }
            aVar2.f10605a = c3165j5.f15476g;
            aVar2.f10606b = c3165j5.f15477h;
            aVar2.f10608d = c3165j5.f15478i;
            c2202e = new C2202e(aVar2);
        }
        try {
            aVar.f10552b.mo5667C5(new C3165j5(c2202e));
        } catch (RemoteException e2) {
            C2622l.m5241D3("Failed to specify native ad options", e2);
        }
        C3165j5 c3165j6 = c3433qe.f18258g;
        Parcelable.Creator<C3165j5> creator = C3165j5.CREATOR;
        C2139a.a aVar3 = new C2139a.a();
        if (c3165j6 == null) {
            c2139a = new C2139a(aVar3);
        } else {
            int i2 = c3165j6.f15475f;
            if (i2 == 2) {
                aVar3.f10483e = c3165j6.f15479j;
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        aVar3.f10484f = c3165j6.f15481l;
                        aVar3.f10480b = c3165j6.f15482m;
                    }
                }
                C3310n2 c3310n3 = c3165j6.f15480k;
                if (c3310n3 != null) {
                    aVar3.f10482d = new C2194u(c3310n3);
                }
                aVar3.f10483e = c3165j6.f15479j;
            }
            aVar3.f10479a = c3165j6.f15476g;
            aVar3.f10481c = c3165j6.f15478i;
            c2139a = new C2139a(aVar3);
        }
        try {
            aVar.f10552b.mo5667C5(new C3165j5(4, c2139a.f10473a, -1, c2139a.f10475c, c2139a.f10476d, c2139a.f10477e != null ? new C3310n2(c2139a.f10477e) : null, c2139a.f10478f, c2139a.f10474b));
        } catch (RemoteException e3) {
            C2622l.m5241D3("Failed to specify native ad options", e3);
        }
        if (c3433qe.f18259h.contains("6")) {
            try {
                aVar.f10552b.mo5674c5(new BinderC3389p7(c1270l));
            } catch (RemoteException e4) {
                C2622l.m5241D3("Failed to add google native ad listener", e4);
            }
        }
        if (c3433qe.f18259h.contains("3")) {
            for (String str : c3433qe.f18261j.keySet()) {
                C3352o7 c3352o7 = new C3352o7(c1270l, true != c3433qe.f18261j.get(str).booleanValue() ? null : c1270l);
                try {
                    aVar.f10552b.mo5666B6(str, new BinderC3315n7(c3352o7), c3352o7.f17547b == null ? null : new BinderC3278m7(c3352o7));
                } catch (RemoteException e5) {
                    C2622l.m5241D3("Failed to add custom template ad listener", e5);
                }
            }
        }
        try {
            c2169e = new C2169e(aVar.f10551a, aVar.f10552b.mo5673c(), iw2.f15412a);
        } catch (RemoteException e6) {
            C2622l.m5438t3("Failed to build AdLoader.", e6);
            c2169e = new C2169e(aVar.f10551a, new BinderC3754z1(new BinderC2828a2()), iw2.f15412a);
        }
        this.zzc = c2169e;
        try {
            c2169e.f10550c.mo7651y0(c2169e.f10548a.m7314a(c2169e.f10549b, zzb(context, interfaceC2121o, bundle2, bundle).f10554a));
        } catch (RemoteException e7) {
            C2622l.m5438t3("Failed to load ad.", e7);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        AbstractC2104a abstractC2104a = this.zzb;
        if (abstractC2104a != null) {
            abstractC2104a.mo4602d(null);
        }
    }

    @RecentlyNonNull
    public abstract Bundle zza(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    public final C2172f zzb(Context context, InterfaceC2111e interfaceC2111e, Bundle bundle, Bundle bundle2) {
        C2172f.a aVar = new C2172f.a();
        Date dateMo4606c = interfaceC2111e.mo4606c();
        if (dateMo4606c != null) {
            aVar.f10555a.f16982g = dateMo4606c;
        }
        int iMo4610g = interfaceC2111e.mo4610g();
        if (iMo4610g != 0) {
            aVar.f10555a.f16984i = iMo4610g;
        }
        Set<String> setMo4608e = interfaceC2111e.mo4608e();
        if (setMo4608e != null) {
            Iterator<String> it = setMo4608e.iterator();
            while (it.hasNext()) {
                aVar.f10555a.f16976a.add(it.next());
            }
        }
        Location locationMo4609f = interfaceC2111e.mo4609f();
        if (locationMo4609f != null) {
            aVar.f10555a.f16985j = locationMo4609f;
        }
        if (interfaceC2111e.mo4607d()) {
            C3331nn c3331nn = gx2.f14692a.f14693b;
            aVar.f10555a.f16979d.add(C3331nn.m7894l(context));
        }
        if (interfaceC2111e.mo4604a() != -1) {
            aVar.f10555a.f16986k = interfaceC2111e.mo4604a() != 1 ? 0 : 1;
        }
        aVar.f10555a.f16987l = interfaceC2111e.mo4605b();
        Bundle bundleZza = zza(bundle, bundle2);
        aVar.f10555a.f16977b.putBundle(AdMobAdapter.class.getName(), bundleZza);
        if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundleZza.getBoolean("_emulatorLiveAds")) {
            aVar.f10555a.f16979d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new C2172f(aVar);
    }
}
