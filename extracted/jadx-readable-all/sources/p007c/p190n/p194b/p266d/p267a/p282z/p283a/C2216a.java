package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2216a {
    /* JADX INFO: renamed from: a */
    public static final boolean m4667a(Context context, Intent intent, InterfaceC2242y interfaceC2242y, InterfaceC2240w interfaceC2240w, boolean z) {
        int iM4769E;
        if (z) {
            try {
                iM4769E = C2330u.f10884a.f10889d.m4769E(context, intent.getData());
                if (interfaceC2242y != null) {
                    interfaceC2242y.mo4706d();
                }
            } catch (ActivityNotFoundException e) {
                C2622l.m5226A3(e.getMessage());
                iM4769E = 6;
            }
            if (interfaceC2240w != null) {
                interfaceC2240w.mo4703A(iM4769E);
            }
            return iM4769E == 5;
        }
        try {
            String strValueOf = String.valueOf(intent.toURI());
            C2096e.m4590z(strValueOf.length() != 0 ? "Launching an intent: ".concat(strValueOf) : new String("Launching an intent: "));
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            C2267h1.m4752k(context, intent);
            if (interfaceC2242y != null) {
                interfaceC2242y.mo4706d();
            }
            if (interfaceC2240w != null) {
                interfaceC2240w.mo4704B(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            C2622l.m5226A3(e2.getMessage());
            if (interfaceC2240w != null) {
                interfaceC2240w.mo4704B(false);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m4668b(Context context, C2223f c2223f, InterfaceC2242y interfaceC2242y, InterfaceC2240w interfaceC2240w) {
        int i = 0;
        if (c2223f == null) {
            C2622l.m5226A3("No intent data for launcher overlay.");
            return false;
        }
        C3052g3.m6922a(context);
        Intent intent = c2223f.f10639m;
        if (intent != null) {
            return m4667a(context, intent, interfaceC2242y, interfaceC2240w, c2223f.f10641o);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(c2223f.f10633g)) {
            C2622l.m5226A3("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(c2223f.f10634h)) {
            intent2.setData(Uri.parse(c2223f.f10633g));
        } else {
            intent2.setDataAndType(Uri.parse(c2223f.f10633g), c2223f.f10634h);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(c2223f.f10635i)) {
            intent2.setPackage(c2223f.f10635i);
        }
        if (!TextUtils.isEmpty(c2223f.f10636j)) {
            String[] strArrSplit = c2223f.f10636j.split("/", 2);
            if (strArrSplit.length < 2) {
                String strValueOf = String.valueOf(c2223f.f10636j);
                C2622l.m5226A3(strValueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(strValueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str = c2223f.f10637k;
        if (!TextUtils.isEmpty(str)) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                C2622l.m5226A3("Could not parse intent flags.");
            }
            intent2.addFlags(i);
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14432r2;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14425q2)).booleanValue()) {
                C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                C2267h1.m4737G(context, intent2);
            }
        }
        return m4667a(context, intent2, interfaceC2242y, interfaceC2240w, c2223f.f10641o);
    }
}
