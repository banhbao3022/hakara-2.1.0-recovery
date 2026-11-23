package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uh2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ch2 f20325f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ yh2 f20326g;

    public uh2(yh2 yh2Var, ch2 ch2Var) {
        this.f20326g = yh2Var;
        this.f20325f = ch2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zh2 zh2Var = this.f20326g.f21887b;
        ch2 ch2Var = this.f20325f;
        InterfaceC3704xp interfaceC3704xp = ((C3002er) zh2Var).f13661q.get();
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue() || interfaceC3704xp == null || ch2Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("audioMime", ch2Var.f13015j);
        map.put("audioSampleMime", ch2Var.f13016k);
        map.put("audioCodec", ch2Var.f13013h);
        interfaceC3704xp.mo6501r0("onMetadataEvent", map);
    }
}
