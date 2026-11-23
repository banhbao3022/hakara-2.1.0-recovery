package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 implements kx0<wf0, vi1, yy0> {

    /* JADX INFO: renamed from: a */
    public final Context f22141a;

    /* JADX INFO: renamed from: b */
    public final qe0 f22142b;

    /* JADX INFO: renamed from: c */
    public final Executor f22143c;

    public yz0(Context context, qe0 qe0Var, Executor executor) {
        this.f22141a = context;
        this.f22142b = qe0Var;
        this.f22143c = executor;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m8839c(di1 di1Var, int i) {
        return di1Var.f13280a.f22289a.f15194g.contains(Integer.toString(i));
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0398  */
    /* JADX WARN: Code duplicated, block: B:76:0x03de  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: a */
    public final wf0 mo5897a(di1 di1Var, rh1 rh1Var, ex0 ex0Var) throws mi1, s01 {
        C3766zd c3766zd;
        InterfaceC2952de interfaceC2952de;
        di1 di1Var2;
        C2840ae c2840ae;
        bg0 bg0VarM5992m;
        C2840ae c2840ae2;
        vi1 vi1Var = (vi1) ex0Var.f13744b;
        Objects.requireNonNull(vi1Var);
        try {
            C3766zd c3766zdMo7852p0 = vi1Var.f20804a.mo7852p0();
            vi1 vi1Var2 = (vi1) ex0Var.f13744b;
            Objects.requireNonNull(vi1Var2);
            try {
                C2840ae c2840aeMo7820D = vi1Var2.f20804a.mo7820D();
                vi1 vi1Var3 = (vi1) ex0Var.f13744b;
                Objects.requireNonNull(vi1Var3);
                try {
                    InterfaceC2952de interfaceC2952deMo7835b5 = vi1Var3.f20804a.mo7835b5();
                    if (interfaceC2952deMo7835b5 == null || !m8839c(di1Var, 6)) {
                        if (c3766zdMo7852p0 != null && m8839c(di1Var, 6)) {
                            try {
                                ag0 ag0VarM5994o = bg0.m5994o(c3766zdMo7852p0.m8888q3(), null);
                                InterfaceC3350o5 interfaceC3350o5M8883J3 = c3766zdMo7852p0.m8883J3();
                                View view = (View) bg0.m5993n(c3766zdMo7852p0.m8882F3());
                                Parcel parcelM7003i1 = c3766zdMo7852p0.m7003i1(2, c3766zdMo7852p0.m7001E0());
                                String string = parcelM7003i1.readString();
                                parcelM7003i1.recycle();
                                Parcel parcelM7003i2 = c3766zdMo7852p0.m7003i1(3, c3766zdMo7852p0.m7001E0());
                                ArrayList arrayList = parcelM7003i2.readArrayList(ig2.f15182a);
                                parcelM7003i2.recycle();
                                Parcel parcelM7003i3 = c3766zdMo7852p0.m7003i1(4, c3766zdMo7852p0.m7001E0());
                                String string2 = parcelM7003i3.readString();
                                parcelM7003i3.recycle();
                                Bundle bundleM8884K2 = c3766zdMo7852p0.m8884K2();
                                Parcel parcelM7003i4 = c3766zdMo7852p0.m7003i1(6, c3766zdMo7852p0.m7001E0());
                                String string3 = parcelM7003i4.readString();
                                parcelM7003i4.recycle();
                                View view2 = (View) bg0.m5993n(c3766zdMo7852p0.m8887i4());
                                InterfaceC2799a interfaceC2799aM8885O5 = c3766zdMo7852p0.m8885O5();
                                Parcel parcelM7003i5 = c3766zdMo7852p0.m7003i1(8, c3766zdMo7852p0.m7001E0());
                                String string4 = parcelM7003i5.readString();
                                parcelM7003i5.recycle();
                                Parcel parcelM7003i6 = c3766zdMo7852p0.m7003i1(9, c3766zdMo7852p0.m7001E0());
                                String string5 = parcelM7003i6.readString();
                                parcelM7003i6.recycle();
                                Parcel parcelM7003i7 = c3766zdMo7852p0.m7003i1(7, c3766zdMo7852p0.m7001E0());
                                double d = parcelM7003i7.readDouble();
                                parcelM7003i7.recycle();
                                bg0VarM5992m = bg0.m5992m(ag0VarM5994o, interfaceC3350o5M8883J3, view, string, arrayList, string2, bundleM8884K2, string3, view2, interfaceC2799aM8885O5, string4, string5, d, c3766zdMo7852p0.m8886g(), null, 0.0f);
                            } catch (RemoteException e) {
                                C2622l.m5241D3("Failed to get native ad assets from app install ad mapper", e);
                                bg0VarM5992m = null;
                            }
                        } else if (c3766zdMo7852p0 == null || !m8839c(di1Var, 2)) {
                            c3766zd = c3766zdMo7852p0;
                            interfaceC2952de = interfaceC2952deMo7835b5;
                            di1Var2 = di1Var;
                            if (c2840aeMo7820D != null && m8839c(di1Var2, 6)) {
                                try {
                                    ag0 ag0VarM5994o2 = bg0.m5994o(c2840aeMo7820D.m5738q3(), null);
                                    InterfaceC3350o5 interfaceC3350o5M5734F3 = c2840aeMo7820D.m5734F3();
                                    View view3 = (View) bg0.m5993n(c2840aeMo7820D.m5739z());
                                    c2840ae2 = c2840aeMo7820D;
                                    try {
                                        Parcel parcelM7003i8 = c2840ae2.m7003i1(2, c2840aeMo7820D.m7001E0());
                                        String string6 = parcelM7003i8.readString();
                                        parcelM7003i8.recycle();
                                        Parcel parcelM7003i9 = c2840ae2.m7003i1(3, c2840ae2.m7001E0());
                                        ArrayList arrayList2 = parcelM7003i9.readArrayList(ig2.f15182a);
                                        parcelM7003i9.recycle();
                                        Parcel parcelM7003i10 = c2840ae2.m7003i1(4, c2840ae2.m7001E0());
                                        String string7 = parcelM7003i10.readString();
                                        parcelM7003i10.recycle();
                                        Bundle bundleM5736K2 = c2840ae2.m5736K2();
                                        Parcel parcelM7003i11 = c2840ae2.m7003i1(6, c2840ae2.m7001E0());
                                        String string8 = parcelM7003i11.readString();
                                        parcelM7003i11.recycle();
                                        View view4 = (View) bg0.m5993n(c2840ae2.m5735J3());
                                        InterfaceC2799a interfaceC2799aM5733C = c2840ae2.m5733C();
                                        InterfaceC3610v5 interfaceC3610v5M5737g = c2840ae2.m5737g();
                                        Parcel parcelM7003i12 = c2840ae2.m7003i1(7, c2840ae2.m7001E0());
                                        String string9 = parcelM7003i12.readString();
                                        parcelM7003i12.recycle();
                                        bg0VarM5992m = bg0.m5992m(ag0VarM5994o2, interfaceC3350o5M5734F3, view3, string6, arrayList2, string7, bundleM5736K2, string8, view4, interfaceC2799aM5733C, null, null, -1.0d, interfaceC3610v5M5737g, string9, 0.0f);
                                    } catch (RemoteException e2) {
                                        e = e2;
                                        C2622l.m5241D3("Failed to get native ad assets from content ad mapper", e);
                                        bg0VarM5992m = null;
                                    }
                                } catch (RemoteException e3) {
                                    e = e3;
                                    c2840ae2 = c2840aeMo7820D;
                                }
                                c2840ae = c2840ae2;
                            } else {
                                if (c2840aeMo7820D == null || !m8839c(di1Var2, 1)) {
                                    throw new s01(1, "No native ad mappers");
                                }
                                try {
                                    ag0 ag0VarM5994o3 = bg0.m5994o(c2840aeMo7820D.m5738q3(), null);
                                    InterfaceC3350o5 interfaceC3350o5M5734F4 = c2840aeMo7820D.m5734F3();
                                    View view5 = (View) bg0.m5993n(c2840aeMo7820D.m5739z());
                                    Parcel parcelM7003i13 = c2840aeMo7820D.m7003i1(2, c2840aeMo7820D.m7001E0());
                                    String string10 = parcelM7003i13.readString();
                                    parcelM7003i13.recycle();
                                    Parcel parcelM7003i14 = c2840aeMo7820D.m7003i1(3, c2840aeMo7820D.m7001E0());
                                    ArrayList arrayList3 = parcelM7003i14.readArrayList(ig2.f15182a);
                                    parcelM7003i14.recycle();
                                    Parcel parcelM7003i15 = c2840aeMo7820D.m7003i1(4, c2840aeMo7820D.m7001E0());
                                    String string11 = parcelM7003i15.readString();
                                    parcelM7003i15.recycle();
                                    Bundle bundleM5736K3 = c2840aeMo7820D.m5736K2();
                                    Parcel parcelM7003i16 = c2840aeMo7820D.m7003i1(6, c2840aeMo7820D.m7001E0());
                                    String string12 = parcelM7003i16.readString();
                                    parcelM7003i16.recycle();
                                    View view6 = (View) bg0.m5993n(c2840aeMo7820D.m5735J3());
                                    InterfaceC2799a interfaceC2799aM5733C2 = c2840aeMo7820D.m5733C();
                                    Parcel parcelM7003i17 = c2840aeMo7820D.m7003i1(7, c2840aeMo7820D.m7001E0());
                                    String string13 = parcelM7003i17.readString();
                                    parcelM7003i17.recycle();
                                    InterfaceC3610v5 interfaceC3610v5M5737g2 = c2840aeMo7820D.m5737g();
                                    c2840ae = c2840aeMo7820D;
                                    try {
                                        bg0 bg0Var = new bg0();
                                        bg0Var.f12601a = 1;
                                        bg0Var.f12602b = ag0VarM5994o3;
                                        bg0Var.f12603c = interfaceC3350o5M5734F4;
                                        bg0Var.f12604d = view5;
                                        bg0Var.m6006p("headline", string10);
                                        bg0Var.f12605e = arrayList3;
                                        bg0Var.m6006p("body", string11);
                                        bg0Var.f12608h = bundleM5736K3;
                                        bg0Var.m6006p("call_to_action", string12);
                                        bg0Var.f12612l = view6;
                                        bg0Var.f12613m = interfaceC2799aM5733C2;
                                        bg0Var.m6006p("advertiser", string13);
                                        bg0Var.f12616p = interfaceC3610v5M5737g2;
                                        bg0VarM5992m = bg0Var;
                                    } catch (RemoteException e4) {
                                        e = e4;
                                        C2622l.m5241D3("Failed to get native ad from content ad mapper", e);
                                        bg0VarM5992m = null;
                                    }
                                } catch (RemoteException e5) {
                                    e = e5;
                                    c2840ae = c2840aeMo7820D;
                                }
                                di1Var2 = di1Var;
                            }
                        } else {
                            try {
                                ag0 ag0VarM5994o4 = bg0.m5994o(c3766zdMo7852p0.m8888q3(), null);
                                InterfaceC3350o5 interfaceC3350o5M8883J4 = c3766zdMo7852p0.m8883J3();
                                View view7 = (View) bg0.m5993n(c3766zdMo7852p0.m8882F3());
                                Parcel parcelM7003i18 = c3766zdMo7852p0.m7003i1(2, c3766zdMo7852p0.m7001E0());
                                String string14 = parcelM7003i18.readString();
                                parcelM7003i18.recycle();
                                Parcel parcelM7003i19 = c3766zdMo7852p0.m7003i1(3, c3766zdMo7852p0.m7001E0());
                                ArrayList arrayList4 = parcelM7003i19.readArrayList(ig2.f15182a);
                                parcelM7003i19.recycle();
                                Parcel parcelM7003i20 = c3766zdMo7852p0.m7003i1(4, c3766zdMo7852p0.m7001E0());
                                String string15 = parcelM7003i20.readString();
                                parcelM7003i20.recycle();
                                Bundle bundleM8884K3 = c3766zdMo7852p0.m8884K2();
                                interfaceC2952de = interfaceC2952deMo7835b5;
                                try {
                                    Parcel parcelM7003i21 = c3766zdMo7852p0.m7003i1(6, c3766zdMo7852p0.m7001E0());
                                    String string16 = parcelM7003i21.readString();
                                    parcelM7003i21.recycle();
                                    View view8 = (View) bg0.m5993n(c3766zdMo7852p0.m8887i4());
                                    InterfaceC2799a interfaceC2799aM8885O6 = c3766zdMo7852p0.m8885O5();
                                    c2840ae = c2840aeMo7820D;
                                    try {
                                        Parcel parcelM7003i22 = c3766zdMo7852p0.m7003i1(8, c3766zdMo7852p0.m7001E0());
                                        String string17 = parcelM7003i22.readString();
                                        parcelM7003i22.recycle();
                                        Parcel parcelM7003i23 = c3766zdMo7852p0.m7003i1(9, c3766zdMo7852p0.m7001E0());
                                        String string18 = parcelM7003i23.readString();
                                        parcelM7003i23.recycle();
                                        Parcel parcelM7003i24 = c3766zdMo7852p0.m7003i1(7, c3766zdMo7852p0.m7001E0());
                                        double d2 = parcelM7003i24.readDouble();
                                        parcelM7003i24.recycle();
                                        InterfaceC3610v5 interfaceC3610v5M8886g = c3766zdMo7852p0.m8886g();
                                        c3766zd = c3766zdMo7852p0;
                                        try {
                                            bg0 bg0Var2 = new bg0();
                                            bg0Var2.f12601a = 2;
                                            bg0Var2.f12602b = ag0VarM5994o4;
                                            bg0Var2.f12603c = interfaceC3350o5M8883J4;
                                            bg0Var2.f12604d = view7;
                                            bg0Var2.m6006p("headline", string14);
                                            bg0Var2.f12605e = arrayList4;
                                            bg0Var2.m6006p("body", string15);
                                            bg0Var2.f12608h = bundleM8884K3;
                                            bg0Var2.m6006p("call_to_action", string16);
                                            bg0Var2.f12612l = view8;
                                            bg0Var2.f12613m = interfaceC2799aM8885O6;
                                            bg0Var2.m6006p("store", string17);
                                            bg0Var2.m6006p("price", string18);
                                            bg0Var2.f12614n = d2;
                                            bg0Var2.f12615o = interfaceC3610v5M8886g;
                                            bg0VarM5992m = bg0Var2;
                                        } catch (RemoteException e6) {
                                            e = e6;
                                            C2622l.m5241D3("Failed to get native ad from app install ad mapper", e);
                                            bg0VarM5992m = null;
                                        }
                                    } catch (RemoteException e7) {
                                        e = e7;
                                        c3766zd = c3766zdMo7852p0;
                                    }
                                } catch (RemoteException e8) {
                                    e = e8;
                                    c3766zd = c3766zdMo7852p0;
                                    c2840ae = c2840aeMo7820D;
                                }
                            } catch (RemoteException e9) {
                                e = e9;
                                c3766zd = c3766zdMo7852p0;
                                c2840ae = c2840aeMo7820D;
                                interfaceC2952de = interfaceC2952deMo7835b5;
                            }
                            di1Var2 = di1Var;
                        }
                        if (di1Var2.f13280a.f22289a.f15194g.contains(Integer.toString(bg0VarM5992m.m6008r()))) {
                            throw new s01(1, "No corresponding native ad listener");
                        }
                        dg0 dg0VarMo7940d = this.f22142b.mo7940d(new c30(di1Var2, rh1Var, ex0Var.f13743a), new ng0(bg0VarM5992m), new bi0(c2840ae, c3766zd, interfaceC2952de, null));
                        ((yy0) ex0Var.f13745c).m8838G6(dg0VarMo7940d.mo7410f());
                        dg0VarMo7940d.mo7406a().m7109u0(new C3194jy((vi1) ex0Var.f13744b), this.f22143c);
                        return dg0VarMo7940d.mo6798h();
                    }
                    bg0VarM5992m = bg0.m5991l(interfaceC2952deMo7835b5);
                    di1Var2 = di1Var;
                    c3766zd = c3766zdMo7852p0;
                    c2840ae = c2840aeMo7820D;
                    interfaceC2952de = interfaceC2952deMo7835b5;
                    if (di1Var2.f13280a.f22289a.f15194g.contains(Integer.toString(bg0VarM5992m.m6008r()))) {
                        throw new s01(1, "No corresponding native ad listener");
                    }
                    dg0 dg0VarMo7940d2 = this.f22142b.mo7940d(new c30(di1Var2, rh1Var, ex0Var.f13743a), new ng0(bg0VarM5992m), new bi0(c2840ae, c3766zd, interfaceC2952de, null));
                    ((yy0) ex0Var.f13745c).m8838G6(dg0VarMo7940d2.mo7410f());
                    dg0VarMo7940d2.mo7406a().m7109u0(new C3194jy((vi1) ex0Var.f13744b), this.f22143c);
                    return dg0VarMo7940d2.mo6798h();
                } catch (Throwable th) {
                    throw new mi1(th);
                }
            } catch (Throwable th2) {
                throw new mi1(th2);
            }
        } catch (Throwable th3) {
            throw new mi1(th3);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kx0
    /* JADX INFO: renamed from: b */
    public final void mo5898b(di1 di1Var, rh1 rh1Var, ex0<vi1, yy0> ex0Var) throws mi1 {
        vi1 vi1Var = ex0Var.f13744b;
        Context context = this.f22141a;
        ew2 ew2Var = di1Var.f13280a.f22289a.f15191d;
        String string = rh1Var.f18830u.toString();
        String strM4783k = C2269i0.m4783k(rh1Var.f18827r);
        InterfaceC3618vd interfaceC3618vd = (InterfaceC3618vd) ex0Var.f13745c;
        ii1 ii1Var = di1Var.f13280a.f22289a;
        C3165j5 c3165j5 = ii1Var.f15196i;
        ArrayList<String> arrayList = ii1Var.f15194g;
        Objects.requireNonNull(vi1Var);
        try {
            vi1Var.f20804a.mo7837c2(new BinderC2800b(context), ew2Var, string, strM4783k, interfaceC3618vd, c3165j5, arrayList);
        } catch (Throwable th) {
            throw new mi1(th);
        }
    }
}
