package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p007c.p190n.p194b.p266d.p267a.p282z.C2321l;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2223f;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2234q;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3463r7;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3537t7;
import p007c.p190n.p194b.p266d.p314j.p315a.im1;
import p007c.p190n.p194b.p266d.p314j.p315a.po0;
import p007c.p190n.p194b.p266d.p314j.p315a.pw0;
import p007c.p190n.p194b.p266d.p314j.p315a.uv2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AdOverlayInfoParcel extends AbstractC2767a implements ReflectedParcelable {

    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C2234q();

    /* JADX INFO: renamed from: A */
    @RecentlyNonNull
    public final String f28465A;

    /* JADX INFO: renamed from: B */
    @RecentlyNonNull
    public final String f28466B;

    /* JADX INFO: renamed from: f */
    public final C2223f f28467f;

    /* JADX INFO: renamed from: g */
    public final uv2 f28468g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2235r f28469h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3410ps f28470i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC3537t7 f28471j;

    /* JADX INFO: renamed from: k */
    @RecentlyNonNull
    public final String f28472k;

    /* JADX INFO: renamed from: l */
    public final boolean f28473l;

    /* JADX INFO: renamed from: m */
    @RecentlyNonNull
    public final String f28474m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC2242y f28475n;

    /* JADX INFO: renamed from: o */
    public final int f28476o;

    /* JADX INFO: renamed from: p */
    public final int f28477p;

    /* JADX INFO: renamed from: q */
    @RecentlyNonNull
    public final String f28478q;

    /* JADX INFO: renamed from: r */
    public final C3702xn f28479r;

    /* JADX INFO: renamed from: s */
    @RecentlyNonNull
    public final String f28480s;

    /* JADX INFO: renamed from: t */
    public final C2321l f28481t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC3463r7 f28482u;

    /* JADX INFO: renamed from: v */
    @RecentlyNonNull
    public final String f28483v;

    /* JADX INFO: renamed from: w */
    public final pw0 f28484w;

    /* JADX INFO: renamed from: x */
    public final po0 f28485x;

    /* JADX INFO: renamed from: y */
    public final im1 f28486y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC2266h0 f28487z;

    public AdOverlayInfoParcel(uv2 uv2Var, InterfaceC2235r interfaceC2235r, InterfaceC3463r7 interfaceC3463r7, InterfaceC3537t7 interfaceC3537t7, InterfaceC2242y interfaceC2242y, InterfaceC3410ps interfaceC3410ps, boolean z, int i, String str, C3702xn c3702xn) {
        this.f28467f = null;
        this.f28468g = uv2Var;
        this.f28469h = interfaceC2235r;
        this.f28470i = interfaceC3410ps;
        this.f28482u = interfaceC3463r7;
        this.f28471j = interfaceC3537t7;
        this.f28472k = null;
        this.f28473l = z;
        this.f28474m = null;
        this.f28475n = interfaceC2242y;
        this.f28476o = i;
        this.f28477p = 3;
        this.f28478q = str;
        this.f28479r = c3702xn;
        this.f28480s = null;
        this.f28481t = null;
        this.f28483v = null;
        this.f28465A = null;
        this.f28484w = null;
        this.f28485x = null;
        this.f28486y = null;
        this.f28487z = null;
        this.f28466B = null;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: H */
    public static AdOverlayInfoParcel m12636H(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5311T(parcel, 2, this.f28467f, i, false);
        C2622l.m5303R(parcel, 3, new BinderC2800b(this.f28468g), false);
        C2622l.m5303R(parcel, 4, new BinderC2800b(this.f28469h), false);
        C2622l.m5303R(parcel, 5, new BinderC2800b(this.f28470i), false);
        C2622l.m5303R(parcel, 6, new BinderC2800b(this.f28471j), false);
        C2622l.m5315U(parcel, 7, this.f28472k, false);
        boolean z = this.f28473l;
        parcel.writeInt(262152);
        parcel.writeInt(z ? 1 : 0);
        C2622l.m5315U(parcel, 9, this.f28474m, false);
        C2622l.m5303R(parcel, 10, new BinderC2800b(this.f28475n), false);
        int i2 = this.f28476o;
        parcel.writeInt(262155);
        parcel.writeInt(i2);
        int i3 = this.f28477p;
        parcel.writeInt(262156);
        parcel.writeInt(i3);
        C2622l.m5315U(parcel, 13, this.f28478q, false);
        C2622l.m5311T(parcel, 14, this.f28479r, i, false);
        C2622l.m5315U(parcel, 16, this.f28480s, false);
        C2622l.m5311T(parcel, 17, this.f28481t, i, false);
        C2622l.m5303R(parcel, 18, new BinderC2800b(this.f28482u), false);
        C2622l.m5315U(parcel, 19, this.f28483v, false);
        C2622l.m5303R(parcel, 20, new BinderC2800b(this.f28484w), false);
        C2622l.m5303R(parcel, 21, new BinderC2800b(this.f28485x), false);
        C2622l.m5303R(parcel, 22, new BinderC2800b(this.f28486y), false);
        C2622l.m5303R(parcel, 23, new BinderC2800b(this.f28487z), false);
        C2622l.m5315U(parcel, 24, this.f28465A, false);
        C2622l.m5315U(parcel, 25, this.f28466B, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    public AdOverlayInfoParcel(uv2 uv2Var, InterfaceC2235r interfaceC2235r, InterfaceC3463r7 interfaceC3463r7, InterfaceC3537t7 interfaceC3537t7, InterfaceC2242y interfaceC2242y, InterfaceC3410ps interfaceC3410ps, boolean z, int i, String str, String str2, C3702xn c3702xn) {
        this.f28467f = null;
        this.f28468g = uv2Var;
        this.f28469h = interfaceC2235r;
        this.f28470i = interfaceC3410ps;
        this.f28482u = interfaceC3463r7;
        this.f28471j = interfaceC3537t7;
        this.f28472k = str2;
        this.f28473l = z;
        this.f28474m = str;
        this.f28475n = interfaceC2242y;
        this.f28476o = i;
        this.f28477p = 3;
        this.f28478q = null;
        this.f28479r = c3702xn;
        this.f28480s = null;
        this.f28481t = null;
        this.f28483v = null;
        this.f28465A = null;
        this.f28484w = null;
        this.f28485x = null;
        this.f28486y = null;
        this.f28487z = null;
        this.f28466B = null;
    }

    public AdOverlayInfoParcel(uv2 uv2Var, InterfaceC2235r interfaceC2235r, InterfaceC2242y interfaceC2242y, InterfaceC3410ps interfaceC3410ps, int i, C3702xn c3702xn, String str, C2321l c2321l, String str2, String str3, String str4) {
        this.f28467f = null;
        this.f28468g = null;
        this.f28469h = interfaceC2235r;
        this.f28470i = interfaceC3410ps;
        this.f28482u = null;
        this.f28471j = null;
        this.f28472k = str2;
        this.f28473l = false;
        this.f28474m = str3;
        this.f28475n = null;
        this.f28476o = i;
        this.f28477p = 1;
        this.f28478q = null;
        this.f28479r = c3702xn;
        this.f28480s = str;
        this.f28481t = c2321l;
        this.f28483v = null;
        this.f28465A = null;
        this.f28484w = null;
        this.f28485x = null;
        this.f28486y = null;
        this.f28487z = null;
        this.f28466B = str4;
    }

    public AdOverlayInfoParcel(uv2 uv2Var, InterfaceC2235r interfaceC2235r, InterfaceC2242y interfaceC2242y, InterfaceC3410ps interfaceC3410ps, boolean z, int i, C3702xn c3702xn) {
        this.f28467f = null;
        this.f28468g = uv2Var;
        this.f28469h = interfaceC2235r;
        this.f28470i = interfaceC3410ps;
        this.f28482u = null;
        this.f28471j = null;
        this.f28472k = null;
        this.f28473l = z;
        this.f28474m = null;
        this.f28475n = interfaceC2242y;
        this.f28476o = i;
        this.f28477p = 2;
        this.f28478q = null;
        this.f28479r = c3702xn;
        this.f28480s = null;
        this.f28481t = null;
        this.f28483v = null;
        this.f28465A = null;
        this.f28484w = null;
        this.f28485x = null;
        this.f28486y = null;
        this.f28487z = null;
        this.f28466B = null;
    }

    public AdOverlayInfoParcel(C2223f c2223f, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, C3702xn c3702xn, String str4, C2321l c2321l, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7) {
        this.f28467f = c2223f;
        this.f28468g = (uv2) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder));
        this.f28469h = (InterfaceC2235r) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder2));
        this.f28470i = (InterfaceC3410ps) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder3));
        this.f28482u = (InterfaceC3463r7) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder6));
        this.f28471j = (InterfaceC3537t7) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder4));
        this.f28472k = str;
        this.f28473l = z;
        this.f28474m = str2;
        this.f28475n = (InterfaceC2242y) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder5));
        this.f28476o = i;
        this.f28477p = i2;
        this.f28478q = str3;
        this.f28479r = c3702xn;
        this.f28480s = str4;
        this.f28481t = c2321l;
        this.f28483v = str5;
        this.f28465A = str6;
        this.f28484w = (pw0) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder7));
        this.f28485x = (po0) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder8));
        this.f28486y = (im1) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder9));
        this.f28487z = (InterfaceC2266h0) BinderC2800b.m5639T1(InterfaceC2799a.a.m5638i1(iBinder10));
        this.f28466B = str7;
    }

    public AdOverlayInfoParcel(C2223f c2223f, uv2 uv2Var, InterfaceC2235r interfaceC2235r, InterfaceC2242y interfaceC2242y, C3702xn c3702xn, InterfaceC3410ps interfaceC3410ps) {
        this.f28467f = c2223f;
        this.f28468g = uv2Var;
        this.f28469h = interfaceC2235r;
        this.f28470i = interfaceC3410ps;
        this.f28482u = null;
        this.f28471j = null;
        this.f28472k = null;
        this.f28473l = false;
        this.f28474m = null;
        this.f28475n = interfaceC2242y;
        this.f28476o = -1;
        this.f28477p = 4;
        this.f28478q = null;
        this.f28479r = c3702xn;
        this.f28480s = null;
        this.f28481t = null;
        this.f28483v = null;
        this.f28465A = null;
        this.f28484w = null;
        this.f28485x = null;
        this.f28486y = null;
        this.f28487z = null;
        this.f28466B = null;
    }

    public AdOverlayInfoParcel(InterfaceC2235r interfaceC2235r, InterfaceC3410ps interfaceC3410ps, int i, C3702xn c3702xn) {
        this.f28469h = interfaceC2235r;
        this.f28470i = interfaceC3410ps;
        this.f28476o = 1;
        this.f28479r = c3702xn;
        this.f28467f = null;
        this.f28468g = null;
        this.f28482u = null;
        this.f28471j = null;
        this.f28472k = null;
        this.f28473l = false;
        this.f28474m = null;
        this.f28475n = null;
        this.f28477p = 1;
        this.f28478q = null;
        this.f28480s = null;
        this.f28481t = null;
        this.f28483v = null;
        this.f28465A = null;
        this.f28484w = null;
        this.f28485x = null;
        this.f28486y = null;
        this.f28487z = null;
        this.f28466B = null;
    }

    public AdOverlayInfoParcel(InterfaceC3410ps interfaceC3410ps, C3702xn c3702xn, InterfaceC2266h0 interfaceC2266h0, pw0 pw0Var, po0 po0Var, im1 im1Var, String str, String str2, int i) {
        this.f28467f = null;
        this.f28468g = null;
        this.f28469h = null;
        this.f28470i = interfaceC3410ps;
        this.f28482u = null;
        this.f28471j = null;
        this.f28472k = null;
        this.f28473l = false;
        this.f28474m = null;
        this.f28475n = null;
        this.f28476o = i;
        this.f28477p = 5;
        this.f28478q = null;
        this.f28479r = c3702xn;
        this.f28480s = null;
        this.f28481t = null;
        this.f28483v = str;
        this.f28465A = str2;
        this.f28484w = pw0Var;
        this.f28485x = po0Var;
        this.f28486y = im1Var;
        this.f28487z = interfaceC2266h0;
        this.f28466B = null;
    }
}
