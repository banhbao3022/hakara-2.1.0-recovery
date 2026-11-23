package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oh1 extends AbstractBinderC3142ij {

    /* JADX INFO: renamed from: f */
    public final gh1 f17618f;

    /* JADX INFO: renamed from: g */
    public final wg1 f17619g;

    /* JADX INFO: renamed from: h */
    public final ei1 f17620h;

    /* JADX INFO: renamed from: i */
    public dl0 f17621i;

    /* JADX INFO: renamed from: j */
    public boolean f17622j = false;

    public oh1(gh1 gh1Var, wg1 wg1Var, ei1 ei1Var) {
        this.f17618f = gh1Var;
        this.f17619g = wg1Var;
        this.f17620h = ei1Var;
    }

    /* JADX INFO: renamed from: F6 */
    public final synchronized void m8010F6(InterfaceC2799a interfaceC2799a) {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        Context context = null;
        this.f17619g.f21096g.set(null);
        if (this.f17621i != null) {
            if (interfaceC2799a != null) {
                context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            }
            this.f17621i.f16666c.m6938P0(context);
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final Bundle m8011G6() {
        Bundle bundle;
        C2622l.m5354d("getAdMetadata can only be called from the UI thread.");
        dl0 dl0Var = this.f17621i;
        if (dl0Var == null) {
            return new Bundle();
        }
        a80 a80Var = dl0Var.f13310n;
        synchronized (a80Var) {
            bundle = new Bundle(a80Var.f12033g);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: H6 */
    public final synchronized void m8012H6(InterfaceC2799a interfaceC2799a) throws RemoteException {
        C2622l.m5354d("showAd must be called on the main UI thread.");
        if (this.f17621i != null) {
            Activity activity = null;
            if (interfaceC2799a != null) {
                Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799a);
                if (objM5639T1 instanceof Activity) {
                    activity = (Activity) objM5639T1;
                }
            }
            this.f17621i.m6373c(this.f17622j, activity);
        }
    }

    /* JADX INFO: renamed from: I6 */
    public final synchronized void m8013I6(String str) throws RemoteException {
        C2622l.m5354d("#008 Must be called on the main UI thread.: setCustomData");
        this.f17620h.f13589b = str;
    }

    /* JADX INFO: renamed from: J6 */
    public final synchronized void m8014J6(boolean z) {
        C2622l.m5354d("setImmersiveMode must be called on the main UI thread.");
        this.f17622j = z;
    }

    /* JADX INFO: renamed from: M4 */
    public final synchronized void m8015M4(InterfaceC2799a interfaceC2799a) {
        C2622l.m5354d("resume must be called on the main UI thread.");
        if (this.f17621i != null) {
            this.f17621i.f16666c.m6937E0(interfaceC2799a == null ? null : (Context) BinderC2800b.m5639T1(interfaceC2799a));
        }
    }

    /* JADX INFO: renamed from: N */
    public final synchronized boolean m8016N() {
        dl0 dl0Var;
        dl0Var = this.f17621i;
        return (dl0Var == null || dl0Var.f13311o.f14729g.get()) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public final synchronized void m8017R(InterfaceC2799a interfaceC2799a) {
        C2622l.m5354d("pause must be called on the main UI thread.");
        if (this.f17621i != null) {
            this.f17621i.f16666c.m6936B0(interfaceC2799a == null ? null : (Context) BinderC2800b.m5639T1(interfaceC2799a));
        }
    }

    /* JADX INFO: renamed from: o */
    public final synchronized InterfaceC2976e1 m8018o() throws RemoteException {
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14413o4)).booleanValue()) {
            return null;
        }
        dl0 dl0Var = this.f17621i;
        if (dl0Var == null) {
            return null;
        }
        return dl0Var.f16669f;
    }
}
