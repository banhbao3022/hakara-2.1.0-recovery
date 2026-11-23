package p007c.p190n.p191a.p192d;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.AbstractC2138c;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2114h;
import p007c.p190n.p194b.p266d.p267a.p278v.InterfaceC2197c;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3359oe;
import p007c.p190n.p194b.p266d.p314j.p315a.uv2;

/* JADX INFO: renamed from: c.n.a.d.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1267i extends AbstractC2138c implements InterfaceC2197c, uv2 {

    /* JADX INFO: renamed from: f */
    public final AbstractAdViewAdapter f5504f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2114h f5505g;

    public C1267i(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC2114h interfaceC2114h) {
        this.f5504f = abstractAdViewAdapter;
        this.f5505g = interfaceC2114h;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p278v.InterfaceC2197c
    /* JADX INFO: renamed from: a */
    public final void mo2734a(String str, String str2) {
        C3359oe c3359oe = (C3359oe) this.f5505g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAppEvent.");
        try {
            c3359oe.f17602a.mo6594x5(str, str2);
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: b */
    public final void mo2735b() {
        C3359oe c3359oe = (C3359oe) this.f5505g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdClosed.");
        try {
            c3359oe.f17602a.mo6582d();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: c */
    public final void mo2736c(C2186m c2186m) {
        ((C3359oe) this.f5505g).m7998b(this.f5504f, c2186m);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: e */
    public final void mo2737e() {
        C3359oe c3359oe = (C3359oe) this.f5505g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdLoaded.");
        try {
            c3359oe.f17602a.mo6585h();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: f */
    public final void mo2738f() {
        C3359oe c3359oe = (C3359oe) this.f5505g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdOpened.");
        try {
            c3359oe.f17602a.mo6586i();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c, p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        C3359oe c3359oe = (C3359oe) this.f5505g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        C2622l.m5318U2("Adapter called onAdClicked.");
        try {
            c3359oe.f17602a.mo6581c();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
