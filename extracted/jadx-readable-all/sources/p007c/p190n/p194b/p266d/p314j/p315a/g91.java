package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g91 implements zc2<e91> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f14521a;

    /* JADX INFO: renamed from: b */
    public final gd2<Bundle> f14522b;

    public g91(gd2<lv1> gd2Var, gd2<Bundle> gd2Var2) {
        this.f14521a = gd2Var;
        this.f14522b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new e91(lv1Var, ((v50) this.f14522b).f20698a.f19769c);
    }
}
