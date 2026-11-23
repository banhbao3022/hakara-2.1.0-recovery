package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import java.io.IOException;
import p007c.p190n.p194b.p266d.p267a.p280x.C2211a;
import p007c.p190n.p194b.p266d.p298f.C2612g;
import p007c.p190n.p194b.p266d.p298f.C2614h;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3553tn;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.u0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2301u0 extends AbstractC2245a0 {

    /* JADX INFO: renamed from: b */
    public final Context f10788b;

    public C2301u0(Context context) {
        this.f10788b = context;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.AbstractC2245a0
    /* JADX INFO: renamed from: a */
    public final void mo4671a() {
        boolean zM4657d;
        try {
            zM4657d = C2211a.m4657d(this.f10788b);
        } catch (C2612g | C2614h | IOException | IllegalStateException e) {
            C2622l.m5438t3("Fail to get isAdIdFakeForDebugLogging", e);
            zM4657d = false;
        }
        synchronized (C3553tn.f19921a) {
            C3553tn.f19922b = true;
            C3553tn.f19923c = zM4657d;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Update ad debug logging enablement as ");
        sb.append(zM4657d);
        C2622l.m5226A3(sb.toString());
    }
}
