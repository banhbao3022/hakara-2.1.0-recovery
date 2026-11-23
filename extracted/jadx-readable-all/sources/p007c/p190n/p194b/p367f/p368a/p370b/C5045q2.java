package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5045q2 extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List f25930g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5151o f25931h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5030n f25932i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5045q2(C5030n c5030n, C5151o c5151o, List list, C5151o c5151o2) {
        super(c5151o);
        this.f25932i = c5030n;
        this.f25930g = list;
        this.f25931h = c5151o2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        List<String> list = this.f25930g;
        C5089f c5089f = C5030n.f25877a;
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        try {
            C5030n c5030n = this.f25932i;
            ((InterfaceC5106n0) c5030n.f25881e.f26067l).mo11546j1(c5030n.f25879c, arrayList, C5030n.m11460h(), new BinderC5010i(this.f25932i, this.f25931h, (byte[]) null));
        } catch (RemoteException e) {
            C5030n.f25877a.m11532a(e, "cancelDownloads(%s)", this.f25930g);
        }
    }
}
