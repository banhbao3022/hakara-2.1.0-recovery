package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.j */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC5014j extends BinderC5010i<ParcelFileDescriptor> {
    public BinderC5014j(C5030n c5030n, C5151o<ParcelFileDescriptor> c5151o) {
        super(c5030n, c5151o);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p367f.p368a.p370b.BinderC5010i, p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: t5 */
    public final void mo11454t5(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f25824g.f25881e.m11549b();
        C5030n.f25877a.m11533b(4, "onGetChunkFileDescriptor", new Object[0]);
        this.f25823f.m11573b((T) ((ParcelFileDescriptor) bundle.getParcelable("chunk_file_descriptor")));
    }
}
