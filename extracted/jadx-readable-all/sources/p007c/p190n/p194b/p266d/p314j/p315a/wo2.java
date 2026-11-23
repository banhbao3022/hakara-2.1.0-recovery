package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wo2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ch2 f21280f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ cp2 f21281g;

    public wo2(cp2 cp2Var, ch2 ch2Var) {
        this.f21281g = cp2Var;
        this.f21280f = ch2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dp2 dp2Var = this.f21281g.f13078b;
        ch2 ch2Var = this.f21280f;
        InterfaceC3704xp interfaceC3704xp = ((C3002er) dp2Var).f13661q.get();
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue() || interfaceC3704xp == null || ch2Var == null) {
            return;
        }
        HashMap map = new HashMap();
        map.put("frameRate", String.valueOf(ch2Var.f13022q));
        map.put("bitRate", String.valueOf(ch2Var.f13012g));
        int i = ch2Var.f13020o;
        int i2 = ch2Var.f13021p;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        map.put("resolution", sb.toString());
        map.put("videoMime", ch2Var.f13015j);
        map.put("videoSampleMime", ch2Var.f13016k);
        map.put("videoCodec", ch2Var.f13013h);
        interfaceC3704xp.mo6501r0("onMetadataEvent", map);
    }
}
