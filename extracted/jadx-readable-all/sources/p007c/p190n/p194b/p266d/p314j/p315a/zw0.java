package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zw0 implements InterfaceC3695xg {
    /* JADX INFO: renamed from: a */
    public static rn1 m8909a(String str) {
        if ("native".equals(str)) {
            return rn1.NATIVE;
        }
        return "javascript".equals(str) ? rn1.JAVASCRIPT : rn1.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX INFO: renamed from: b */
    public static qn1 m8910b(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    b = 2;
                } else {
                    b = -1;
                }
            } else if (str.equals("definedByJavascript")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("beginToRender")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return qn1.BEGIN_TO_RENDER;
        }
        if (b != 1) {
            return b != 2 ? qn1.UNSPECIFIED : qn1.ONE_PIXEL;
        }
        return qn1.DEFINED_BY_JAVASCRIPT;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX INFO: renamed from: c */
    public static on1 m8911c(String str) {
        byte b;
        int iHashCode = str.hashCode();
        if (iHashCode != -382745961) {
            if (iHashCode != 112202875) {
                if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("video")) {
                b = 2;
            } else {
                b = -1;
            }
        } else if (str.equals("htmlDisplay")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b == 0) {
            return on1.HTML_DISPLAY;
        }
        if (b == 1) {
            return on1.NATIVE_DISPLAY;
        }
        if (b != 2) {
            return null;
        }
        return on1.VIDEO;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: R */
    public final void mo5878R(InterfaceC2799a interfaceC2799a) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && hn1.f14918a.f15327a) {
            Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799a);
            if (objM5639T1 instanceof jn1) {
                ((jn1) objM5639T1).mo7366c();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: k0 */
    public final void mo5880k0(InterfaceC2799a interfaceC2799a) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && hn1.f14918a.f15327a) {
            Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799a);
            if (objM5639T1 instanceof jn1) {
                ((jn1) objM5639T1).mo7364a();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: l0 */
    public final InterfaceC2799a mo5881l0(String str, WebView webView, String str2, String str3, String str4, String str5, EnumC3769zg enumC3769zg, EnumC3732yg enumC3732yg, String str6) {
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() || !hn1.f14918a.f15327a) {
            return null;
        }
        sn1 sn1VarM8357a = sn1.m8357a(str5, str);
        rn1 rn1VarM8909a = m8909a("javascript");
        rn1 rn1VarM8909a2 = m8909a(str4);
        on1 on1VarM8911c = m8911c(enumC3732yg.f21878j);
        rn1 rn1Var = rn1.NONE;
        if (rn1VarM8909a == rn1Var) {
            C2622l.m5226A3("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (on1VarM8911c == null) {
            String strValueOf = String.valueOf(enumC3732yg);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 54);
            sb.append("Omid js session error; Unable to parse creative type: ");
            sb.append(strValueOf);
            C2622l.m5226A3(sb.toString());
            return null;
        }
        if (on1VarM8911c == on1.VIDEO && rn1VarM8909a2 == rn1Var) {
            String strValueOf2 = String.valueOf(str4);
            C2622l.m5226A3(strValueOf2.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2) : new String("Omid js session error; Video events owner unknown for video creative: "));
            return null;
        }
        ln1 ln1Var = new ln1(sn1VarM8357a, webView, null, str6, mn1.JAVASCRIPT);
        qn1 qn1VarM8910b = m8910b(enumC3769zg.f22269k);
        C2622l.m5341a1(qn1VarM8910b, "ImpressionType is null");
        C2622l.m5341a1(rn1VarM8909a, "Impression owner is null");
        C2622l.m5457x2(rn1VarM8909a, on1VarM8911c, qn1VarM8910b);
        return new BinderC2800b(jn1.m7363f(new kn1(on1VarM8911c, qn1VarM8910b, rn1VarM8909a, rn1VarM8909a2), ln1Var));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC2799a mo5882m0(String str, WebView webView, String str2, String str3, String str4) {
        return mo5883n0(str, webView, "", "javascript", str4, "Google");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: n0 */
    public final InterfaceC2799a mo5883n0(String str, WebView webView, String str2, String str3, String str4, String str5) {
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() || !hn1.f14918a.f15327a) {
            return null;
        }
        sn1 sn1VarM8357a = sn1.m8357a(str5, str);
        rn1 rn1VarM8909a = m8909a("javascript");
        rn1 rn1VarM8909a2 = m8909a(str4);
        if (rn1VarM8909a == rn1.NONE) {
            return null;
        }
        ln1 ln1Var = new ln1(sn1VarM8357a, webView, null, null, mn1.HTML);
        C2622l.m5341a1(rn1VarM8909a, "Impression owner is null");
        C2622l.m5457x2(rn1VarM8909a, null, null);
        return new BinderC2800b(jn1.m7363f(new kn1(null, null, rn1VarM8909a, rn1VarM8909a2), ln1Var));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: o0 */
    public final boolean mo5884o0(Context context) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14259R2;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            C2622l.m5226A3("Omid flag is disabled");
            return false;
        }
        in1 in1Var = hn1.f14918a;
        if (in1Var.f15327a) {
            return true;
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14271T2)).booleanValue()) {
            in1Var.m7285a(context.getApplicationContext());
            return in1Var.f15327a;
        }
        in1Var.m7285a(context.getApplicationContext());
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: p0 */
    public final InterfaceC2799a mo5885p0(String str, WebView webView, String str2, String str3, String str4, EnumC3769zg enumC3769zg, EnumC3732yg enumC3732yg, String str5) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && hn1.f14918a.f15327a) {
            sn1 sn1VarM8357a = sn1.m8357a("Google", str);
            rn1 rn1VarM8909a = m8909a("javascript");
            on1 on1VarM8911c = m8911c(enumC3732yg.f21878j);
            rn1 rn1Var = rn1.NONE;
            if (rn1VarM8909a == rn1Var) {
                C2622l.m5226A3("Omid html session error; Unable to parse impression owner: javascript");
            } else if (on1VarM8911c == null) {
                String strValueOf = String.valueOf(enumC3732yg);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 56);
                sb.append("Omid html session error; Unable to parse creative type: ");
                sb.append(strValueOf);
                C2622l.m5226A3(sb.toString());
            } else {
                rn1 rn1VarM8909a2 = m8909a(str4);
                if (on1VarM8911c != on1.VIDEO || rn1VarM8909a2 != rn1Var) {
                    ln1 ln1Var = new ln1(sn1VarM8357a, webView, null, str5, mn1.HTML);
                    qn1 qn1VarM8910b = m8910b(enumC3769zg.f22269k);
                    C2622l.m5341a1(qn1VarM8910b, "ImpressionType is null");
                    C2622l.m5341a1(rn1VarM8909a, "Impression owner is null");
                    C2622l.m5457x2(rn1VarM8909a, on1VarM8911c, qn1VarM8910b);
                    return new BinderC2800b(jn1.m7363f(new kn1(on1VarM8911c, qn1VarM8910b, rn1VarM8909a, rn1VarM8909a2), ln1Var));
                }
                String strValueOf2 = String.valueOf(str4);
                C2622l.m5226A3(strValueOf2.length() != 0 ? "Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2) : new String("Omid html session error; Video events owner unknown for video creative: "));
            }
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: q0 */
    public final String mo5886q0(Context context) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue()) {
            return "a.1.3.3-google_20200416";
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: r0 */
    public final void mo5887r0(InterfaceC2799a interfaceC2799a, View view) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14259R2;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && hn1.f14918a.f15327a) {
            Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799a);
            if (objM5639T1 instanceof jn1) {
                jn1 jn1Var = (jn1) objM5639T1;
                if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14289W2)).booleanValue()) {
                    jn1Var.mo7367d(view, pn1.NOT_VISIBLE, "Ad overlay");
                } else {
                    jn1Var.mo7368e(view);
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3695xg
    /* JADX INFO: renamed from: s0 */
    public final void mo5888s0(InterfaceC2799a interfaceC2799a, View view) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14259R2)).booleanValue() && hn1.f14918a.f15327a) {
            Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799a);
            if (objM5639T1 instanceof jn1) {
                ((jn1) objM5639T1).mo7365b(view);
            }
        }
    }
}
