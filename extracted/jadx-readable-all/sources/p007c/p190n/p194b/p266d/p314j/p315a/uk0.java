package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0<T> implements InterfaceC3464r8<Object> {

    /* JADX INFO: renamed from: a */
    public final WeakReference<T> f20365a;

    /* JADX INFO: renamed from: b */
    public final String f20366b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3464r8<T> f20367c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vk0 f20368d;

    public /* synthetic */ uk0(vk0 vk0Var, WeakReference weakReference, String str, InterfaceC3464r8 interfaceC3464r8) {
        this.f20368d = vk0Var;
        this.f20365a = weakReference;
        this.f20366b = str;
        this.f20367c = interfaceC3464r8;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(Object obj, Map<String, String> map) {
        T t = this.f20365a.get();
        if (t == null) {
            this.f20368d.m8563c(this.f20366b, this);
        } else {
            this.f20367c.mo6148a(t, map);
        }
    }
}
