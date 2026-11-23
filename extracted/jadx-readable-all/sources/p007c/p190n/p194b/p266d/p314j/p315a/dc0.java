package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2281m0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dc0 extends ha0<ip2> implements ip2 {

    /* JADX INFO: renamed from: g */
    public final Map<View, jp2> f13231g;

    /* JADX INFO: renamed from: h */
    public final Context f13232h;

    /* JADX INFO: renamed from: i */
    public final rh1 f13233i;

    public dc0(Context context, Set<bc0<ip2>> set, rh1 rh1Var) {
        super(set);
        this.f13231g = new WeakHashMap(1);
        this.f13232h = context;
        this.f13233i = rh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0053 A[Catch: all -> 0x0062, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000b, B:6:0x0020, B:8:0x0026, B:10:0x0038, B:11:0x004a, B:18:0x0052, B:19:0x0053, B:20:0x0059, B:27:0x0061, B:12:0x004b, B:13:0x004d, B:21:0x005a, B:22:0x005c), top: B:33:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: B0 */
    public final synchronized void m6351B0(View view) {
        C2281m0 c2281m0;
        long j2;
        jp2 jp2Var = this.f13231g.get(view);
        if (jp2Var == null) {
            jp2Var = new jp2(this.f13232h, view);
            jp2Var.f15699s.add(this);
            jp2Var.m7383e(3);
            this.f13231g.put(view, jp2Var);
        }
        if (!this.f13233i.f18794R) {
            c2281m0 = jp2Var.f15696p;
            j2 = jp2.f15686f;
            synchronized (c2281m0.f10749c) {
                c2281m0.f10747a = j2;
                return;
            }
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14233N0;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            c2281m0 = jp2Var.f15696p;
            j2 = jp2.f15686f;
            synchronized (c2281m0.f10749c) {
                c2281m0.f10747a = j2;
            }
            return;
        }
        long jLongValue = ((Long) c2862b.f12496d.m6596a(C3052g3.f14227M0)).longValue();
        C2281m0 c2281m1 = jp2Var.f15696p;
        synchronized (c2281m1.f10749c) {
            c2281m1.f10747a = jLongValue;
        }
        return;
        throw th;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
    /* JADX INFO: renamed from: q0 */
    public final synchronized void mo6352q0(final hp2 hp2Var) {
        m7108A0(new ga0(hp2Var) { // from class: c.n.b.d.j.a.cc0

            /* JADX INFO: renamed from: a */
            public final hp2 f12976a;

            {
                this.f12976a = hp2Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ga0
            /* JADX INFO: renamed from: a */
            public final void mo5710a(Object obj) {
                ((ip2) obj).mo6352q0(this.f12976a);
            }
        });
    }
}
