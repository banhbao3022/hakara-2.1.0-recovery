package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2240w;

/* JADX INFO: renamed from: c.n.b.d.j.a.a9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2835a9 implements InterfaceC2240w {

    /* JADX INFO: renamed from: a */
    public boolean f12038a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Map f12039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f12040c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uv2 f12041d;

    public C2835a9(Map map, Map map2, uv2 uv2Var) {
        this.f12039b = map;
        this.f12040c = map2;
        this.f12041d = uv2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2240w
    /* JADX INFO: renamed from: A */
    public final void mo4703A(int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2240w
    /* JADX INFO: renamed from: B */
    public final void mo4704B(boolean z) {
        if (this.f12038a) {
            return;
        }
        this.f12038a = true;
        this.f12039b.put((String) this.f12040c.get("event_id"), Boolean.valueOf(z));
        ((InterfaceC3577ua) this.f12041d).mo6501r0("openIntentAsync", this.f12039b);
    }
}
