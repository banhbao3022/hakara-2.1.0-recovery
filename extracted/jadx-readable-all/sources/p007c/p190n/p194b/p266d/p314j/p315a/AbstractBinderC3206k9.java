package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.k9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3206k9 extends hg2 implements IInterface {
    public AbstractBinderC3206k9() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ef  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        byte b;
        byte b2 = 2;
        if (i == 1) {
            String string = parcel.readString();
            rp0 rp0Var = (rp0) this;
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14169C5;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                String strValueOf = String.valueOf(string);
                C2096e.m4590z(strValueOf.length() != 0 ? "Received H5 gmsg: ".concat(strValueOf) : new String("Received H5 gmsg: "));
                Uri uri = Uri.parse(string);
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                Map<String, String> mapM4754m = C2267h1.m4754m(uri);
                String str = mapM4754m.get("action");
                if (TextUtils.isEmpty(str)) {
                    C2622l.m5318U2("H5 gmsg did not contain an action");
                } else {
                    int iHashCode = str.hashCode();
                    String str2 = "initialize";
                    if (iHashCode != 579053441) {
                        if (iHashCode == 871091088 && str.equals("initialize")) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("dispose_all")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        rp0Var.f19021h.clear();
                        rp0Var.f19020g.m8143e(new op0(str2));
                    } else if (b != 1) {
                        String str3 = mapM4754m.get("obj_id");
                        try {
                            str3.getClass();
                            long j2 = Long.parseLong(str3);
                            switch (str.hashCode()) {
                                case -1790951212:
                                    if (!str.equals("show_interstitial_ad")) {
                                        b2 = -1;
                                    }
                                    break;
                                case -1266374734:
                                    if (!str.equals("show_rewarded_ad")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 5;
                                    }
                                    break;
                                case -257098725:
                                    if (!str.equals("load_rewarded_ad")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 4;
                                    }
                                    break;
                                case 393881811:
                                    if (!str.equals("create_interstitial_ad")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 0;
                                    }
                                    break;
                                case 585513149:
                                    if (!str.equals("load_interstitial_ad")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 1;
                                    }
                                    break;
                                case 1671767583:
                                    if (!str.equals("dispose")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 6;
                                    }
                                    break;
                                case 2109237041:
                                    if (!str.equals("create_rewarded_ad")) {
                                        b2 = -1;
                                    } else {
                                        b2 = 3;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            String str4 = "creation";
                            String str5 = "rewarded";
                            String str6 = "interstitial";
                            switch (b2) {
                                case 0:
                                    if (rp0Var.f19021h.size() < ((Integer) c2862b.f12496d.m6596a(C3052g3.f14176D5)).intValue()) {
                                        Map<Long, np0> map = rp0Var.f19021h;
                                        Long lValueOf = Long.valueOf(j2);
                                        if (!map.containsKey(lValueOf)) {
                                            String str7 = mapM4754m.get("ad_unit");
                                            if (!TextUtils.isEmpty(str7)) {
                                                C3007ew c3007ewMo7177a = rp0Var.f19019f.mo7177a();
                                                c3007ewMo7177a.f13707a = Long.valueOf(j2);
                                                Objects.requireNonNull(str7);
                                                c3007ewMo7177a.f13708b = str7;
                                                C3081gw c3081gwM6694a = c3007ewMo7177a.m6694a();
                                                long jLongValue = c3081gwM6694a.f14685a.longValue();
                                                C3118hw c3118hw = c3081gwM6694a.f14687c;
                                                rp0Var.f19021h.put(lValueOf, new vp0(jLongValue, c3118hw.f15028a, new pp0(c3118hw.f15029b), c3118hw.f15034g, c3081gwM6694a.f14686b));
                                                pp0 pp0Var = rp0Var.f19020g;
                                                Objects.requireNonNull(pp0Var);
                                                op0 op0Var = new op0(str4);
                                                op0Var.f17713a = Long.valueOf(j2);
                                                op0Var.f17715c = "nativeObjectCreated";
                                                pp0Var.m8143e(op0Var);
                                                StringBuilder sb = new StringBuilder(str7.length() + 59);
                                                outline.m1570U(sb, "Created H5 interstitial #", j2, " with ad unit ");
                                                sb.append(str7);
                                                C2096e.m4590z(sb.toString());
                                            } else {
                                                C2622l.m5226A3("Could not create H5 ad, missing ad unit id");
                                                rp0Var.f19020g.m8139a(j2);
                                            }
                                        } else {
                                            C2622l.m5318U2("Could not create H5 ad, object ID already exists");
                                            rp0Var.f19020g.m8139a(j2);
                                        }
                                    } else {
                                        C2622l.m5226A3("Could not create H5 ad, too many existing objects");
                                        rp0Var.f19020g.m8139a(j2);
                                    }
                                    break;
                                case 1:
                                    np0 np0Var = rp0Var.f19021h.get(Long.valueOf(j2));
                                    if (np0Var != null) {
                                        np0Var.mo7911c(rp0.m8318F6(mapM4754m));
                                    } else {
                                        C2622l.m5318U2("Could not load H5 ad, object ID does not exist");
                                        pp0 pp0Var2 = rp0Var.f19020g;
                                        Objects.requireNonNull(pp0Var2);
                                        op0 op0Var2 = new op0(str6);
                                        op0Var2.f17713a = Long.valueOf(j2);
                                        op0Var2.f17715c = "onNativeAdObjectNotAvailable";
                                        pp0Var2.m8143e(op0Var2);
                                    }
                                    break;
                                case 2:
                                    np0 np0Var2 = rp0Var.f19021h.get(Long.valueOf(j2));
                                    if (np0Var2 != null) {
                                        np0Var2.mo7909a();
                                    } else {
                                        C2622l.m5318U2("Could not show H5 ad, object ID does not exist");
                                        pp0 pp0Var3 = rp0Var.f19020g;
                                        Objects.requireNonNull(pp0Var3);
                                        op0 op0Var3 = new op0(str6);
                                        op0Var3.f17713a = Long.valueOf(j2);
                                        op0Var3.f17715c = "onNativeAdObjectNotAvailable";
                                        pp0Var3.m8143e(op0Var3);
                                    }
                                    break;
                                case 3:
                                    if (rp0Var.f19021h.size() < ((Integer) c2862b.f12496d.m6596a(C3052g3.f14176D5)).intValue()) {
                                        Map<Long, np0> map2 = rp0Var.f19021h;
                                        Long lValueOf2 = Long.valueOf(j2);
                                        if (!map2.containsKey(lValueOf2)) {
                                            String str8 = mapM4754m.get("ad_unit");
                                            if (!TextUtils.isEmpty(str8)) {
                                                C3007ew c3007ewMo7177a2 = rp0Var.f19019f.mo7177a();
                                                c3007ewMo7177a2.f13707a = Long.valueOf(j2);
                                                Objects.requireNonNull(str8);
                                                c3007ewMo7177a2.f13708b = str8;
                                                C3081gw c3081gwM6694a2 = c3007ewMo7177a2.m6694a();
                                                long jLongValue2 = c3081gwM6694a2.f14685a.longValue();
                                                C3118hw c3118hw2 = c3081gwM6694a2.f14687c;
                                                rp0Var.f19021h.put(lValueOf2, new yp0(jLongValue2, c3118hw2.f15028a, new pp0(c3118hw2.f15029b), c3118hw2.f15034g, c3081gwM6694a2.f14686b));
                                                pp0 pp0Var4 = rp0Var.f19020g;
                                                Objects.requireNonNull(pp0Var4);
                                                op0 op0Var4 = new op0(str4);
                                                op0Var4.f17713a = Long.valueOf(j2);
                                                op0Var4.f17715c = "nativeObjectCreated";
                                                pp0Var4.m8143e(op0Var4);
                                                StringBuilder sb2 = new StringBuilder(str8.length() + 55);
                                                outline.m1570U(sb2, "Created H5 rewarded #", j2, " with ad unit ");
                                                sb2.append(str8);
                                                C2096e.m4590z(sb2.toString());
                                            } else {
                                                C2622l.m5226A3("Could not create H5 ad, missing ad unit id");
                                                rp0Var.f19020g.m8139a(j2);
                                            }
                                        } else {
                                            C2622l.m5318U2("Could not create H5 ad, object ID already exists");
                                            rp0Var.f19020g.m8139a(j2);
                                        }
                                    } else {
                                        C2622l.m5226A3("Could not create H5 ad, too many existing objects");
                                        rp0Var.f19020g.m8139a(j2);
                                    }
                                    break;
                                case 4:
                                    np0 np0Var3 = rp0Var.f19021h.get(Long.valueOf(j2));
                                    if (np0Var3 != null) {
                                        np0Var3.mo7911c(rp0.m8318F6(mapM4754m));
                                    } else {
                                        C2622l.m5318U2("Could not load H5 ad, object ID does not exist");
                                        pp0 pp0Var5 = rp0Var.f19020g;
                                        Objects.requireNonNull(pp0Var5);
                                        op0 op0Var5 = new op0(str5);
                                        op0Var5.f17713a = Long.valueOf(j2);
                                        op0Var5.f17715c = "onNativeAdObjectNotAvailable";
                                        pp0Var5.m8143e(op0Var5);
                                    }
                                    break;
                                case 5:
                                    np0 np0Var4 = rp0Var.f19021h.get(Long.valueOf(j2));
                                    if (np0Var4 != null) {
                                        np0Var4.mo7909a();
                                    } else {
                                        C2622l.m5318U2("Could not show H5 ad, object ID does not exist");
                                        pp0 pp0Var6 = rp0Var.f19020g;
                                        Objects.requireNonNull(pp0Var6);
                                        op0 op0Var6 = new op0(str5);
                                        op0Var6.f17713a = Long.valueOf(j2);
                                        op0Var6.f17715c = "onNativeAdObjectNotAvailable";
                                        pp0Var6.m8143e(op0Var6);
                                    }
                                    break;
                                case 6:
                                    Map<Long, np0> map3 = rp0Var.f19021h;
                                    Long lValueOf3 = Long.valueOf(j2);
                                    np0 np0Var5 = map3.get(lValueOf3);
                                    if (np0Var5 != null) {
                                        np0Var5.mo7910b();
                                        rp0Var.f19021h.remove(lValueOf3);
                                        StringBuilder sb3 = new StringBuilder(36);
                                        sb3.append("Disposed H5 ad #");
                                        sb3.append(j2);
                                        C2096e.m4590z(sb3.toString());
                                    } else {
                                        C2622l.m5318U2("Could not dispose H5 ad, object ID does not exist");
                                    }
                                    break;
                                default:
                                    C2622l.m5318U2(str.length() != 0 ? "H5 gmsg contained invalid action: ".concat(str) : new String("H5 gmsg contained invalid action: "));
                                    break;
                            }
                        } catch (NullPointerException | NumberFormatException unused) {
                            String strValueOf2 = String.valueOf(str3);
                            C2622l.m5318U2(strValueOf2.length() != 0 ? "H5 gmsg did not contain a valid object id: ".concat(strValueOf2) : new String("H5 gmsg did not contain a valid object id: "));
                        }
                    } else {
                        Iterator<np0> it = rp0Var.f19021h.values().iterator();
                        while (it.hasNext()) {
                            it.next().mo7910b();
                        }
                        rp0Var.f19021h.clear();
                    }
                }
            }
        } else {
            if (i != 2) {
                return false;
            }
            ((rp0) this).f19021h.clear();
        }
        parcel2.writeNoException();
        return true;
    }
}
