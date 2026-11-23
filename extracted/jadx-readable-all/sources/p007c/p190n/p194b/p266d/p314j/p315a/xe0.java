package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xe0 implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<af0> f21493a;

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        af0 af0Var = this.f21493a.get();
        if (af0Var != null && "_ac".equals(map.get("eventName"))) {
            af0Var.f12095h.m7108A0(f60.f13980a);
        }
    }
}
