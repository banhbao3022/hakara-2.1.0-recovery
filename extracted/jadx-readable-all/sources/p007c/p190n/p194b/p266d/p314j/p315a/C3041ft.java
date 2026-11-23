package p007c.p190n.p194b.p266d.p314j.p315a;

import android.text.TextUtils;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ft */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3041ft implements InterfaceC3464r8<InterfaceC3410ps> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3115ht f14111a;

    public C3041ft(ViewTreeObserverOnGlobalLayoutListenerC3115ht viewTreeObserverOnGlobalLayoutListenerC3115ht) {
        this.f14111a = viewTreeObserverOnGlobalLayoutListenerC3115ht;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i = Integer.parseInt(str);
                synchronized (this.f14111a) {
                    try {
                        ViewTreeObserverOnGlobalLayoutListenerC3115ht viewTreeObserverOnGlobalLayoutListenerC3115ht = this.f14111a;
                        if (viewTreeObserverOnGlobalLayoutListenerC3115ht.f14968L != i) {
                            viewTreeObserverOnGlobalLayoutListenerC3115ht.f14968L = i;
                            viewTreeObserverOnGlobalLayoutListenerC3115ht.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                C2622l.m5241D3("Exception occurred while getting webview content height", e);
            }
        }
    }
}
