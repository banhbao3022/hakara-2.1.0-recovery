package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5002g extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25785g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25786h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f25787i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f25788j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C5151o f25789k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C5030n f25790l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5002g(C5030n c5030n, C5151o c5151o, int i, String str, String str2, int i2, C5151o c5151o2) {
        super(c5151o);
        this.f25790l = c5030n;
        this.f25785g = i;
        this.f25786h = str;
        this.f25787i = str2;
        this.f25788j = i2;
        this.f25789k = c5151o2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        try {
            C5030n c5030n = this.f25790l;
            ((InterfaceC5106n0) c5030n.f25881e.f26067l).mo11543R2(c5030n.f25879c, C5030n.m11462j(this.f25785g, this.f25786h, this.f25787i, this.f25788j), C5030n.m11460h(), new BinderC5014j(this.f25790l, this.f25789k));
        } catch (RemoteException e) {
            C5030n.f25877a.m11533b(6, "getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{this.f25786h, this.f25787i, Integer.valueOf(this.f25788j), Integer.valueOf(this.f25785g)});
            this.f25789k.m11572a(new RuntimeException(e));
        }
    }
}
