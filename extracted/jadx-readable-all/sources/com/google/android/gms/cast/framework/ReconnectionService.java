package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.p291r.C2422a;
import p007c.p190n.p194b.p266d.p290d.p291r.C2438i;
import p007c.p190n.p194b.p266d.p290d.p291r.C2511w;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2427c0;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2429d0;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2437h0;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p320f.C3858f;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class ReconnectionService extends Service {

    /* JADX INFO: renamed from: f */
    public static final C2518b f28589f = new C2518b("ReconnectionService");

    /* JADX INFO: renamed from: g */
    public InterfaceC2429d0 f28590g;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f28590g.mo5016y4(intent);
        } catch (RemoteException e) {
            f28589f.m5120b(e, "Unable to call %s on %s.", "onBind", InterfaceC2429d0.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        InterfaceC2799a interfaceC2799aMo5028G0;
        InterfaceC2799a interfaceC2799aMo5014G0;
        C2422a c2422aM4995a = C2422a.m4995a(this);
        Objects.requireNonNull(c2422aM4995a);
        C2622l.m5354d("Must be called from the main thread.");
        C2438i c2438i = c2422aM4995a.f11145e;
        Objects.requireNonNull(c2438i);
        InterfaceC2429d0 interfaceC2429d0Mo9034e4 = null;
        try {
            interfaceC2799aMo5028G0 = c2438i.f11192b.mo5028G0();
        } catch (RemoteException e) {
            C2438i.f11191a.m5120b(e, "Unable to call %s on %s.", "getWrappedThis", InterfaceC2437h0.class.getSimpleName());
            interfaceC2799aMo5028G0 = null;
        }
        C2622l.m5354d("Must be called from the main thread.");
        C2511w c2511w = c2422aM4995a.f11146f;
        Objects.requireNonNull(c2511w);
        try {
            interfaceC2799aMo5014G0 = c2511w.f11367b.mo5014G0();
        } catch (RemoteException e2) {
            C2511w.f11366a.m5120b(e2, "Unable to call %s on %s.", "getWrappedThis", InterfaceC2427c0.class.getSimpleName());
            interfaceC2799aMo5014G0 = null;
        }
        C2518b c2518b = C3858f.f22572a;
        try {
            interfaceC2429d0Mo9034e4 = C3858f.m9021a(getApplicationContext()).mo9034e4(new BinderC2800b(this), interfaceC2799aMo5028G0, interfaceC2799aMo5014G0);
        } catch (RemoteException e3) {
            C3858f.f22572a.m5120b(e3, "Unable to call %s on %s.", "newReconnectionServiceImpl", InterfaceC3878h.class.getSimpleName());
        }
        this.f28590g = interfaceC2429d0Mo9034e4;
        try {
            interfaceC2429d0Mo9034e4.mo5015e2();
        } catch (RemoteException e4) {
            f28589f.m5120b(e4, "Unable to call %s on %s.", "onCreate", InterfaceC2429d0.class.getSimpleName());
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f28590g.onDestroy();
        } catch (RemoteException e) {
            f28589f.m5120b(e, "Unable to call %s on %s.", "onDestroy", InterfaceC2429d0.class.getSimpleName());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.f28590g.mo5017z5(intent, i, i2);
        } catch (RemoteException e) {
            f28589f.m5120b(e, "Unable to call %s on %s.", "onStartCommand", InterfaceC2429d0.class.getSimpleName());
            return 1;
        }
    }
}
