package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.q8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3427q8 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18212a = C3612v7.f20705a;

    /* JADX INFO: renamed from: b */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18213b = C3649w7.f21013a;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18214c = C3686x7.f21444a;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18215d = C2909c8.f12954a;

    /* JADX INFO: renamed from: e */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18216e = new C3131i8();

    /* JADX INFO: renamed from: f */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18217f = new C3168j8();

    /* JADX INFO: renamed from: g */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18218g = C2946d8.f13186a;

    /* JADX INFO: renamed from: h */
    public static final InterfaceC3464r8<Object> f18219h = new C3205k8();

    /* JADX INFO: renamed from: i */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18220i = new C3242l8();

    /* JADX INFO: renamed from: j */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18221j = C2983e8.f13528a;

    /* JADX INFO: renamed from: k */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18222k = new C3279m8();

    /* JADX INFO: renamed from: l */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18223l = new C3316n8();

    /* JADX INFO: renamed from: m */
    public static final InterfaceC3464r8<InterfaceC3704xp> f18224m = new C3261lr();

    /* JADX INFO: renamed from: n */
    public static final InterfaceC3464r8<InterfaceC3704xp> f18225n = new C3298mr();

    /* JADX INFO: renamed from: o */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18226o = new C3574u7();

    /* JADX INFO: renamed from: p */
    public static final C3021f9 f18227p = new C3021f9();

    /* JADX INFO: renamed from: q */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18228q = new C3353o8();

    /* JADX INFO: renamed from: r */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18229r = new C3390p8();

    /* JADX INFO: renamed from: s */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18230s = new C3020f8();

    /* JADX INFO: renamed from: t */
    public static final InterfaceC3464r8<InterfaceC3410ps> f18231t = new C3057g8();

    /* JADX WARN: Code duplicated, block: B:28:0x00b1  */
    /* JADX INFO: renamed from: a */
    public static kv1<String> m8196a(InterfaceC3410ps interfaceC3410ps, String str) {
        String strM6051i;
        final String string;
        Uri uriM8272b = Uri.parse(str);
        try {
            rd2 rd2VarMo6502s = interfaceC3410ps.mo6502s();
            if (rd2VarMo6502s != null && rd2VarMo6502s.m8271a(uriM8272b)) {
                uriM8272b = rd2VarMo6502s.m8272b(uriM8272b, interfaceC3410ps.getContext(), interfaceC3410ps.mo6468X(), interfaceC3410ps.mo6482h());
            }
        } catch (sd2 unused) {
            C2622l.m5226A3(str.length() != 0 ? "Unable to append parameter to URL: ".concat(str) : new String("Unable to append parameter to URL: "));
        }
        Context context = interfaceC3410ps.getContext();
        C2330u c2330u = C2330u.f10884a;
        if (c2330u.f10910y.m6048f(context) && (strM6051i = c2330u.f10910y.m6051i(context)) != null) {
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14280V;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                String str2 = (String) c2862b.f12496d.m6596a(C3052g3.f14286W);
                String string2 = uriM8272b.toString();
                if (string2.contains(str2)) {
                    c2330u.f10910y.m6055n(context, "_ac", strM6051i, null);
                    string = C2622l.m5298P2(string2, context).replace(str2, strM6051i);
                } else {
                    string = uriM8272b.toString();
                }
            } else if (TextUtils.isEmpty(uriM8272b.getQueryParameter("fbs_aeid"))) {
                String string3 = C2622l.m5397l2(C2622l.m5298P2(uriM8272b.toString(), context), "fbs_aeid", strM6051i).toString();
                c2330u.f10910y.m6055n(context, "_ac", strM6051i, null);
                string = string3;
            } else {
                string = uriM8272b.toString();
            }
        } else {
            string = uriM8272b.toString();
        }
        if (!C3386p4.f17827f.m6603d().booleanValue()) {
            return cw0.m6231a(string);
        }
        zu1 zu1VarM8908s = zu1.m8908s(interfaceC3410ps.mo6434C());
        cs1 cs1Var = C3723y7.f21749a;
        lv1 lv1Var = C2962do.f13335f;
        return cw0.m6246p(cw0.m6250t(cw0.m6246p(zu1VarM8908s, Throwable.class, cs1Var, lv1Var), new cs1(string) { // from class: c.n.b.d.j.a.z7

            /* JADX INFO: renamed from: a */
            public final String f22189a;

            {
                this.f22189a = string;
            }

            /* JADX WARN: Code duplicated, block: B:16:0x004f  */
            /* JADX WARN: Code duplicated, block: B:19:0x0059  */
            /* JADX WARN: Code duplicated, block: B:21:0x0067  */
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                String strM6603d;
                String strM6603d2;
                Uri uri;
                String strReplace = this.f22189a;
                String str3 = (String) obj;
                InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
                if (str3 != null) {
                    if (C3386p4.f17826e.m6603d().booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(strReplace).getHost();
                        for (int i = 0; i < 3; i++) {
                            if (host.endsWith(strArr[i])) {
                                strM6603d = C3386p4.f17822a.m6603d();
                                strM6603d2 = C3386p4.f17823b.m6603d();
                                if (!TextUtils.isEmpty(strM6603d)) {
                                    strReplace = strReplace.replace(strM6603d, str3);
                                }
                                if (!TextUtils.isEmpty(strM6603d2)) {
                                    uri = Uri.parse(strReplace);
                                    if (!TextUtils.isEmpty(uri.getQueryParameter(strM6603d2))) {
                                        break;
                                    }
                                    return uri.buildUpon().appendQueryParameter(strM6603d2, str3).toString();
                                }
                                break;
                            }
                        }
                    } else {
                        strM6603d = C3386p4.f17822a.m6603d();
                        strM6603d2 = C3386p4.f17823b.m6603d();
                        if (!TextUtils.isEmpty(strM6603d)) {
                            strReplace = strReplace.replace(strM6603d, str3);
                        }
                        if (!TextUtils.isEmpty(strM6603d2)) {
                            uri = Uri.parse(strReplace);
                            if (!TextUtils.isEmpty(uri.getQueryParameter(strM6603d2))) {
                                return uri.buildUpon().appendQueryParameter(strM6603d2, str3).toString();
                            }
                        }
                    }
                }
                return strReplace;
            }
        }, lv1Var), Throwable.class, new cs1(string) { // from class: c.n.b.d.j.a.a8

            /* JADX INFO: renamed from: a */
            public final String f12032a;

            {
                this.f12032a = string;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                String str3 = this.f12032a;
                Throwable th = (Throwable) obj;
                InterfaceC3464r8<InterfaceC3410ps> interfaceC3464r8 = C3427q8.f18212a;
                if (C3386p4.f17829h.m6603d().booleanValue()) {
                    C2330u.f10884a.f10893h.m6647d(th, "prepareClickUrl.attestation2");
                }
                return str3;
            }
        }, lv1Var);
    }
}
