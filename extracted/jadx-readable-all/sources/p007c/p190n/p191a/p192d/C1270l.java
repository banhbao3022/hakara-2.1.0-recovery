package p007c.p190n.p191a.p192d;

import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.AbstractC2138c;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2124r;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2119m;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2205h;
import p007c.p190n.p194b.p266d.p267a.p279w.InterfaceC2203f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3359oe;

/* JADX INFO: renamed from: c.n.a.d.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1270l extends AbstractC2138c implements AbstractC2205h.a, InterfaceC2203f.b, InterfaceC2203f.a {

    /* JADX INFO: renamed from: f */
    public final AbstractAdViewAdapter f5510f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2119m f5511g;

    public C1270l(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC2119m interfaceC2119m) {
        this.f5510f = abstractAdViewAdapter;
        this.f5511g = interfaceC2119m;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: b */
    public final void mo2735b() {
        C3359oe c3359oe = (C3359oe) this.f5511g;
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
        ((C3359oe) this.f5511g).m8001e(this.f5510f, c2186m);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: d */
    public final void mo2744d() {
        C3359oe c3359oe = (C3359oe) this.f5511g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        AbstractC2124r abstractC2124r = c3359oe.f17603b;
        if (c3359oe.f17604c == null) {
            if (abstractC2124r == null) {
                C2622l.m5271J3("#007 Could not call remote method.", null);
                return;
            } else if (!abstractC2124r.f10465m) {
                C2622l.m5318U2("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                return;
            }
        }
        C2622l.m5318U2("Adapter called onAdImpression.");
        try {
            c3359oe.f17602a.mo6588k();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: e */
    public final void mo2737e() {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2138c
    /* JADX INFO: renamed from: f */
    public final void mo2738f() {
        C3359oe c3359oe = (C3359oe) this.f5511g;
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
        C3359oe c3359oe = (C3359oe) this.f5511g;
        Objects.requireNonNull(c3359oe);
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        AbstractC2124r abstractC2124r = c3359oe.f17603b;
        if (c3359oe.f17604c == null) {
            if (abstractC2124r == null) {
                C2622l.m5271J3("#007 Could not call remote method.", null);
                return;
            } else if (!abstractC2124r.f10466n) {
                C2622l.m5318U2("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                return;
            }
        }
        C2622l.m5318U2("Adapter called onAdClicked.");
        try {
            c3359oe.f17602a.mo6581c();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }
}
