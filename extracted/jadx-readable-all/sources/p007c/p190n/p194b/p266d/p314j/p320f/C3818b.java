package p007c.p190n.p194b.p266d.p314j.p320f;

import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2418p1;
import p007c.p190n.p194b.p266d.p290d.p291r.C2426c;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h;

/* JADX INFO: renamed from: c.n.b.d.j.f.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3818b extends C2418p1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C3937m8 f22515a;

    public C3818b(C3937m8 c3937m8, C3987r8 c3987r8) {
        this.f22515a = c3937m8;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2418p1
    /* JADX INFO: renamed from: a */
    public final void mo4991a() {
        C2426c.d dVar = (C2426c.d) this.f22515a.f22817g;
        Objects.requireNonNull(dVar);
        try {
            C2458h c2458h = C2426c.this.f11176l;
            if (c2458h != null) {
                c2458h.m5077t();
            }
            C2426c.this.f11171g.mo4998c0(null);
        } catch (RemoteException e) {
            C2426c.f11168d.m5120b(e, "Unable to call %s on %s.", "onConnected", InterfaceC2423a0.class.getSimpleName());
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2418p1
    /* JADX INFO: renamed from: b */
    public final void mo4992b(int i) {
        C2426c.d dVar = (C2426c.d) this.f22515a.f22817g;
        Objects.requireNonNull(dVar);
        try {
            C2426c.this.f11171g.mo4996Q(i);
        } catch (RemoteException e) {
            C2426c.f11168d.m5120b(e, "Unable to call %s on %s.", "onConnectionSuspended", InterfaceC2423a0.class.getSimpleName());
        }
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2418p1
    /* JADX INFO: renamed from: c */
    public final void mo4993c(int i) {
        ((C2426c.d) this.f22515a.f22817g).m5013a(i);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.C2418p1
    /* JADX INFO: renamed from: d */
    public final void mo4994d(int i) {
        ((C2426c.d) this.f22515a.f22817g).m5013a(i);
    }
}
