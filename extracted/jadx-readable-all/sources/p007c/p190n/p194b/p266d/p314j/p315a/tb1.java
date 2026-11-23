package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tb1 implements zc2<rb1> {

    /* JADX INFO: renamed from: a */
    public final gd2<or2> f19809a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f19810b;

    /* JADX INFO: renamed from: c */
    public final gd2<Context> f19811c;

    public tb1(gd2<or2> gd2Var, gd2<lv1> gd2Var2, gd2<Context> gd2Var3) {
        this.f19809a = gd2Var;
        this.f19810b = gd2Var2;
        this.f19811c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        or2 or2Var = new or2();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new rb1(or2Var, lv1Var, ((C3412pu) this.f19811c).m8156b(), null);
    }
}
