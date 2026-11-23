package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p01 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2782b f17805a;

    /* JADX INFO: renamed from: b */
    public final q01 f17806b;

    /* JADX INFO: renamed from: c */
    public final List<String> f17807c = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: d */
    public final boolean f17808d = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14427q4)).booleanValue();

    /* JADX INFO: renamed from: e */
    public final hx0 f17809e;

    public p01(InterfaceC2782b interfaceC2782b, q01 q01Var, hx0 hx0Var) {
        this.f17805a = interfaceC2782b;
        this.f17806b = q01Var;
        this.f17809e = hx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8076a(p01 p01Var, String str, int i, long j2, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j2);
        String string = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            string = outline.m1552C(new StringBuilder(String.valueOf(string).length() + 1 + String.valueOf(str2).length()), string, ".", str2);
        }
        p01Var.f17807c.add(string);
    }
}
