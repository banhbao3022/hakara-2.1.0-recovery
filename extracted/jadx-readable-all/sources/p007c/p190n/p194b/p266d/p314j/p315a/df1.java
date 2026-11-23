package p007c.p190n.p194b.p266d.p314j.p315a;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class df1 implements cs1<ot0, gf1> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hf1 f13258a;

    public df1(hf1 hf1Var) {
        this.f13258a = hf1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
    @NullableDecl
    public final /* synthetic */ gf1 apply(@NullableDecl ot0 ot0Var) {
        C2622l.m5438t3("", ot0Var);
        C2096e.m4590z("Failed to get a cache key, reverting to legacy flow.");
        hf1 hf1Var = this.f13258a;
        hf1Var.f14836e = new gf1(null, hf1Var.m7117a());
        return this.f13258a.f14836e;
    }
}
