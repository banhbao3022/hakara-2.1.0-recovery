package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2636i;

/* JADX INFO: renamed from: c.n.b.d.j.a.wr */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3669wr implements InterfaceC2636i {

    /* JADX INFO: renamed from: f */
    public final Context f21307f;

    /* JADX INFO: renamed from: g */
    public final String f21308g;

    /* JADX INFO: renamed from: h */
    public final WeakReference<InterfaceC3704xp> f21309h;

    public AbstractC3669wr(InterfaceC3704xp interfaceC3704xp) {
        Context context = interfaceC3704xp.getContext();
        this.f21307f = context;
        this.f21308g = C2330u.f10884a.f10889d.m4766B(context, interfaceC3704xp.mo6495o().f21615f);
        this.f21309h = new WeakReference<>(interfaceC3704xp);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m8668p(AbstractC3669wr abstractC3669wr, Map map) {
        InterfaceC3704xp interfaceC3704xp = abstractC3669wr.f21309h.get();
        if (interfaceC3704xp != null) {
            interfaceC3704xp.mo6501r0("onPrecacheEvent", map);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo5841g(String str);

    /* JADX INFO: renamed from: i */
    public boolean mo6678i(String str, String[] strArr) {
        return mo5841g(str);
    }

    /* JADX INFO: renamed from: j */
    public void mo6679j(int i) {
    }

    /* JADX INFO: renamed from: k */
    public void mo6680k(int i) {
    }

    /* JADX INFO: renamed from: l */
    public void mo6681l(int i) {
    }

    /* JADX INFO: renamed from: m */
    public void mo6682m(int i) {
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo5842n();

    /* JADX INFO: renamed from: o */
    public final void m8669o(String str, String str2, String str3, String str4) {
        C3331nn.f17166a.post(new RunnableC3632vr(this, str, str2, str3, str4));
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2636i
    public void release() {
    }
}
