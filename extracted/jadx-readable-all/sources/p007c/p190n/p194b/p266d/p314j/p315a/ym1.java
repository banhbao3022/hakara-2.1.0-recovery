package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ym1 {

    /* JADX INFO: renamed from: a */
    public final p01 f21921a;

    /* JADX INFO: renamed from: b */
    public final String f21922b;

    /* JADX INFO: renamed from: c */
    public final String f21923c;

    /* JADX INFO: renamed from: d */
    public final String f21924d;

    /* JADX INFO: renamed from: e */
    public final Context f21925e;

    /* JADX INFO: renamed from: f */
    public final ei1 f21926f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2782b f21927g;

    /* JADX INFO: renamed from: h */
    public final rd2 f21928h;

    public ym1(p01 p01Var, C3702xn c3702xn, String str, String str2, Context context, ei1 ei1Var, InterfaceC2782b interfaceC2782b, rd2 rd2Var) {
        this.f21921a = p01Var;
        this.f21922b = c3702xn.f21615f;
        this.f21923c = str;
        this.f21924d = str2;
        this.f21925e = context;
        this.f21926f = ei1Var;
        this.f21927g = interfaceC2782b;
        this.f21928h = rd2Var;
    }

    /* JADX INFO: renamed from: c */
    public static String m8803c(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final List<String> m8804a(di1 di1Var, rh1 rh1Var, List<String> list) {
        return m8805b(di1Var, rh1Var, false, "", "", list);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final List<String> m8805b(di1 di1Var, rh1 rh1Var, boolean z, String str, String str2, List<String> list) {
        Uri.Builder builderBuildUpon;
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String strM8803c = m8803c(m8803c(m8803c(it.next(), "@gw_adlocid@", di1Var.f13280a.f22289a.f15193f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f21922b);
            if (rh1Var != null) {
                strM8803c = C2622l.m5283M0(m8803c(m8803c(m8803c(strM8803c, "@gw_qdata@", rh1Var.f18833x), "@gw_adnetid@", rh1Var.f18832w), "@gw_allocid@", rh1Var.f18831v), this.f21925e, rh1Var.f18793Q);
            }
            String strM8803c2 = m8803c(m8803c(m8803c(strM8803c, "@gw_adnetstatus@", TextUtils.join("_", this.f21921a.f17807c)), "@gw_seqnum@", this.f21923c), "@gw_sessid@", this.f21924d);
            boolean z2 = false;
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14210J1)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (z2) {
                if (this.f21928h.m8271a(Uri.parse(strM8803c2))) {
                    builderBuildUpon = Uri.parse(strM8803c2).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strM8803c2 = builderBuildUpon.build().toString();
                }
            } else if (z3) {
                z3 = true;
                if (this.f21928h.m8271a(Uri.parse(strM8803c2))) {
                    builderBuildUpon = Uri.parse(strM8803c2).buildUpon();
                    if (z2) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                    }
                    if (z3) {
                        builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                    }
                    strM8803c2 = builderBuildUpon.build().toString();
                }
            }
            arrayList.add(strM8803c2);
        }
        return arrayList;
    }
}
