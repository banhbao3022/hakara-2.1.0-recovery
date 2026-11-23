package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4990d extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25720g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25721h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f25722i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f25723j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C5151o f25724k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C5030n f25725l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4990d(C5030n c5030n, C5151o c5151o, int i, String str, String str2, int i2, C5151o c5151o2) {
        super(c5151o);
        this.f25725l = c5030n;
        this.f25720g = i;
        this.f25721h = str;
        this.f25722i = str2;
        this.f25723j = i2;
        this.f25724k = c5151o2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        try {
            C5030n c5030n = this.f25725l;
            ((InterfaceC5106n0) c5030n.f25881e.f26067l).mo11544b6(c5030n.f25879c, C5030n.m11462j(this.f25720g, this.f25721h, this.f25722i, this.f25723j), C5030n.m11460h(), new BinderC5010i(this.f25725l, this.f25724k, (char[]) null));
        } catch (RemoteException e) {
            C5030n.f25877a.m11532a(e, "notifyChunkTransferred", new Object[0]);
        }
    }
}
