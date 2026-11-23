package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.a.cw */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2933cw {

    /* JADX INFO: renamed from: a */
    public final Context f13128a;

    /* JADX INFO: renamed from: b */
    public final jw2 f13129b;

    /* JADX INFO: renamed from: c */
    public final String f13130c;

    /* JADX INFO: renamed from: d */
    public final gd2<Context> f13131d;

    /* JADX INFO: renamed from: e */
    public final gd2<jw2> f13132e;

    /* JADX INFO: renamed from: f */
    public final gd2<h41> f13133f;

    /* JADX INFO: renamed from: g */
    public final gd2<l41> f13134g;

    /* JADX INFO: renamed from: h */
    public final gd2<ie1> f13135h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3600uw f13136i;

    public C2933cw(C3600uw c3600uw, Context context, String str, jw2 jw2Var) {
        this.f13136i = c3600uw;
        this.f13128a = context;
        this.f13129b = jw2Var;
        this.f13130c = str;
        Objects.requireNonNull(context, "instance cannot be null");
        ad2 ad2Var = new ad2(context);
        this.f13131d = ad2Var;
        Objects.requireNonNull(jw2Var, "instance cannot be null");
        ad2 ad2Var2 = new ad2(jw2Var);
        this.f13132e = ad2Var2;
        i41 i41Var = new i41(c3600uw.f20641n);
        Object obj = yc2.f21852a;
        gd2<h41> yc2Var = i41Var instanceof yc2 ? i41Var : new yc2(i41Var);
        this.f13133f = yc2Var;
        gd2<l41> gd2VarM8791b = yc2.m8791b(m41.f16678a);
        this.f13134g = gd2VarM8791b;
        gd2<ie1> je1Var = new je1(ad2Var, c3600uw.f20643o, ad2Var2, c3600uw.f20602M, yc2Var, gd2VarM8791b, ji1.f15601a);
        this.f13135h = je1Var instanceof yc2 ? je1Var : new yc2(je1Var);
    }
}
