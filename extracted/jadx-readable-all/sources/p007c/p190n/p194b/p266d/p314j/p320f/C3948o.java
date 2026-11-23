package p007c.p190n.p194b.p266d.p314j.p320f;

import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p636z0.p767w.p768a.MediaRouter;

/* JADX INFO: renamed from: c.n.b.d.j.f.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3948o extends MediaRouter.a {

    /* JADX INFO: renamed from: a */
    public static final C2518b f22824a = new C2518b("MediaRouterCallback");

    /* JADX INFO: renamed from: b */
    public final InterfaceC3918l f22825b;

    public C3948o(InterfaceC3918l interfaceC3918l) {
        Objects.requireNonNull(interfaceC3918l, "null reference");
        this.f22825b = interfaceC3918l;
    }

    @Override // p636z0.p767w.p768a.MediaRouter.a
    /* JADX INFO: renamed from: a */
    public final void mo9166a(MediaRouter mediaRouter, MediaRouter.g gVar) {
        try {
            this.f22825b.mo9052F(gVar.f38875c, gVar.f38891s);
        } catch (RemoteException e) {
            f22824a.m5120b(e, "Unable to call %s on %s.", "onRouteAdded", InterfaceC3918l.class.getSimpleName());
        }
    }

    @Override // p636z0.p767w.p768a.MediaRouter.a
    /* JADX INFO: renamed from: b */
    public final void mo9167b(MediaRouter mediaRouter, MediaRouter.g gVar) {
        try {
            this.f22825b.mo9054p6(gVar.f38875c, gVar.f38891s);
        } catch (RemoteException e) {
            f22824a.m5120b(e, "Unable to call %s on %s.", "onRouteChanged", InterfaceC3918l.class.getSimpleName());
        }
    }

    @Override // p636z0.p767w.p768a.MediaRouter.a
    /* JADX INFO: renamed from: c */
    public final void mo9168c(MediaRouter mediaRouter, MediaRouter.g gVar) {
        try {
            this.f22825b.mo9051B5(gVar.f38875c, gVar.f38891s);
        } catch (RemoteException e) {
            f22824a.m5120b(e, "Unable to call %s on %s.", "onRouteRemoved", InterfaceC3918l.class.getSimpleName());
        }
    }

    @Override // p636z0.p767w.p768a.MediaRouter.a
    /* JADX INFO: renamed from: d */
    public final void mo9169d(MediaRouter mediaRouter, MediaRouter.g gVar) {
        try {
            this.f22825b.mo9053N4(gVar.f38875c, gVar.f38891s);
        } catch (RemoteException e) {
            f22824a.m5120b(e, "Unable to call %s on %s.", "onRouteSelected", InterfaceC3918l.class.getSimpleName());
        }
    }

    @Override // p636z0.p767w.p768a.MediaRouter.a
    /* JADX INFO: renamed from: e */
    public final void mo9170e(MediaRouter mediaRouter, MediaRouter.g gVar, int i) {
        try {
            this.f22825b.mo9055u3(gVar.f38875c, gVar.f38891s, i);
        } catch (RemoteException e) {
            f22824a.m5120b(e, "Unable to call %s on %s.", "onRouteUnselected", InterfaceC3918l.class.getSimpleName());
        }
    }
}
