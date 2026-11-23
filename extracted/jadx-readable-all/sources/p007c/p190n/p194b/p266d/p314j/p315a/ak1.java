package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ak1 {

    /* JADX INFO: renamed from: a */
    public final HashMap<rj1, zj1<? extends m20>> f12191a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final <AdT extends m20> zj1<AdT> m5820a(rj1 rj1Var, Context context, jj1 jj1Var, hk1<AdT> hk1Var) {
        sj1 sj1Var;
        zj1<AdT> zj1Var = (zj1) this.f12191a.get(rj1Var);
        if (zj1Var != null) {
            return zj1Var;
        }
        Parcelable.Creator<sj1> creator = sj1.CREATOR;
        if (rj1Var == rj1.Rewarded) {
            AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14278U3;
            C2862b c2862b = C2862b.f12493a;
            sj1Var = new sj1(context, rj1Var, ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue(), ((Integer) c2862b.f12496d.m6596a(C3052g3.f14315a4)).intValue(), ((Integer) c2862b.f12496d.m6596a(C3052g3.f14329c4)).intValue(), (String) c2862b.f12496d.m6596a(C3052g3.f14343e4), (String) c2862b.f12496d.m6596a(C3052g3.f14290W3), (String) c2862b.f12496d.m6596a(C3052g3.f14302Y3));
        } else if (rj1Var == rj1.Interstitial) {
            AbstractC3718y2<Integer> abstractC3718y3 = C3052g3.f14284V3;
            C2862b c2862b2 = C2862b.f12493a;
            sj1Var = new sj1(context, rj1Var, ((Integer) c2862b2.f12496d.m6596a(abstractC3718y3)).intValue(), ((Integer) c2862b2.f12496d.m6596a(C3052g3.f14322b4)).intValue(), ((Integer) c2862b2.f12496d.m6596a(C3052g3.f14336d4)).intValue(), (String) c2862b2.f12496d.m6596a(C3052g3.f14350f4), (String) c2862b2.f12496d.m6596a(C3052g3.f14296X3), (String) c2862b2.f12496d.m6596a(C3052g3.f14308Z3));
        } else if (rj1Var == rj1.AppOpen) {
            AbstractC3718y2<Integer> abstractC3718y4 = C3052g3.f14371i4;
            C2862b c2862b3 = C2862b.f12493a;
            sj1Var = new sj1(context, rj1Var, ((Integer) c2862b3.f12496d.m6596a(abstractC3718y4)).intValue(), ((Integer) c2862b3.f12496d.m6596a(C3052g3.f14385k4)).intValue(), ((Integer) c2862b3.f12496d.m6596a(C3052g3.f14392l4)).intValue(), (String) c2862b3.f12496d.m6596a(C3052g3.f14357g4), (String) c2862b3.f12496d.m6596a(C3052g3.f14364h4), (String) c2862b3.f12496d.m6596a(C3052g3.f14378j4));
        } else {
            sj1Var = null;
        }
        oj1 oj1Var = new oj1(sj1Var);
        zj1<AdT> zj1Var2 = new zj1<>(oj1Var, new jk1(oj1Var, jj1Var, hk1Var));
        this.f12191a.put(rj1Var, zj1Var2);
        return zj1Var2;
    }
}
