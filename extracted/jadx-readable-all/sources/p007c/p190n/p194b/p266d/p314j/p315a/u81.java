package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.pm.PackageInfo;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u81 implements zc2<s81> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f20238a;

    /* JADX INFO: renamed from: b */
    public final gd2<ii1> f20239b;

    /* JADX INFO: renamed from: c */
    public final gd2<PackageInfo> f20240c;

    /* JADX INFO: renamed from: d */
    public final gd2<InterfaceC2305w0> f20241d;

    public u81(gd2<lv1> gd2Var, gd2<ii1> gd2Var2, gd2<PackageInfo> gd2Var3, gd2<InterfaceC2305w0> gd2Var4) {
        this.f20238a = gd2Var;
        this.f20239b = gd2Var2;
        this.f20240c = gd2Var3;
        this.f20241d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new s81(lv1Var, ((y50) this.f20239b).m8778b(), this.f20240c.mo4613a(), ((gj1) this.f20241d).mo4613a());
    }
}
