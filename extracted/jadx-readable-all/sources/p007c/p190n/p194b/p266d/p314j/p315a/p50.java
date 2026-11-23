package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p50 implements zc2<o50> {

    /* JADX INFO: renamed from: a */
    public final gd2<yl1> f17842a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3702xn> f17843b;

    /* JADX INFO: renamed from: c */
    public final gd2<ApplicationInfo> f17844c;

    /* JADX INFO: renamed from: d */
    public final gd2<String> f17845d;

    /* JADX INFO: renamed from: e */
    public final gd2<List<String>> f17846e;

    /* JADX INFO: renamed from: f */
    public final gd2<PackageInfo> f17847f;

    /* JADX INFO: renamed from: g */
    public final gd2<kv1<String>> f17848g;

    /* JADX INFO: renamed from: h */
    public final gd2<InterfaceC2305w0> f17849h;

    /* JADX INFO: renamed from: i */
    public final gd2<String> f17850i;

    /* JADX INFO: renamed from: j */
    public final gd2<ma1<Bundle>> f17851j;

    public p50(gd2<yl1> gd2Var, gd2<C3702xn> gd2Var2, gd2<ApplicationInfo> gd2Var3, gd2<String> gd2Var4, gd2<List<String>> gd2Var5, gd2<PackageInfo> gd2Var6, gd2<kv1<String>> gd2Var7, gd2<InterfaceC2305w0> gd2Var8, gd2<String> gd2Var9, gd2<ma1<Bundle>> gd2Var10) {
        this.f17842a = gd2Var;
        this.f17843b = gd2Var2;
        this.f17844c = gd2Var3;
        this.f17845d = gd2Var4;
        this.f17846e = gd2Var5;
        this.f17847f = gd2Var6;
        this.f17848g = gd2Var7;
        this.f17849h = gd2Var8;
        this.f17850i = gd2Var9;
        this.f17851j = gd2Var10;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final o50 mo4613a() {
        yl1 yl1VarMo4613a = this.f17842a.mo4613a();
        C3702xn c3702xnM8831b = ((C3746yu) this.f17843b).m8831b();
        ApplicationInfo applicationInfoMo4613a = ((as0) this.f17844c).mo4613a();
        String strMo4613a = ((gs0) this.f17845d).mo4613a();
        List<String> listM6923b = C3052g3.m6923b();
        PackageInfo packageInfoMo4613a = this.f17847f.mo4613a();
        vc2 vc2VarM8792c = yc2.m8792c(this.f17848g);
        InterfaceC2305w0 interfaceC2305w0Mo4613a = ((gj1) this.f17849h).mo4613a();
        String strMo4613a2 = this.f17850i.mo4613a();
        na1 na1Var = (na1) this.f17851j;
        Objects.requireNonNull(na1Var);
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new o50(yl1VarMo4613a, c3702xnM8831b, applicationInfoMo4613a, strMo4613a, listM6923b, packageInfoMo4613a, vc2VarM8792c, interfaceC2305w0Mo4613a, strMo4613a2, new ma1(lv1Var, ((ed2) na1Var.f17062b).mo4613a()));
    }
}
