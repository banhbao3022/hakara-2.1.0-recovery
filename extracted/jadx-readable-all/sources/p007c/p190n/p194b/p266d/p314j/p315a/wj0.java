package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wj0 extends AbstractBinderC3244la implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, InterfaceC3054g5 {

    /* JADX INFO: renamed from: f */
    public View f21136f;

    /* JADX INFO: renamed from: g */
    public InterfaceC3087h1 f21137g;

    /* JADX INFO: renamed from: h */
    public wf0 f21138h;

    /* JADX INFO: renamed from: i */
    public boolean f21139i = false;

    /* JADX INFO: renamed from: j */
    public boolean f21140j = false;

    public wj0(wf0 wf0Var, bg0 bg0Var) {
        this.f21136f = bg0Var.m6000f();
        this.f21137g = bg0Var.m6009s();
        this.f21138h = wf0Var;
        if (bg0Var.m6003i() != null) {
            bg0Var.m6003i().mo6452L(this);
        }
    }

    /* JADX INFO: renamed from: G6 */
    public static final void m8653G6(InterfaceC3429qa interfaceC3429qa, int i) {
        try {
            interfaceC3429qa.mo7817y(i);
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: F6 */
    public final void m8654F6(InterfaceC2799a interfaceC2799a, InterfaceC3429qa interfaceC3429qa) throws RemoteException {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        if (this.f21139i) {
            C2622l.m5408n3("Instream ad can not be shown after destroy().");
            m8653G6(interfaceC3429qa, 2);
            return;
        }
        View view = this.f21136f;
        if (view == null || this.f21137g == null) {
            String str = view == null ? "can not get video view." : "can not get video controller.";
            C2622l.m5408n3(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            m8653G6(interfaceC3429qa, 0);
            return;
        }
        if (this.f21140j) {
            C2622l.m5408n3("Instream ad should not be used again.");
            m8653G6(interfaceC3429qa, 1);
            return;
        }
        this.f21140j = true;
        m8656f();
        ((ViewGroup) BinderC2800b.m5639T1(interfaceC2799a)).addView(this.f21136f, new ViewGroup.LayoutParams(-1, -1));
        C2330u c2330u = C2330u.f10884a;
        C3443qo c3443qo = c2330u.f10886B;
        C3443qo.m8220a(this.f21136f, this);
        C3443qo c3443qo2 = c2330u.f10886B;
        C3443qo.m8221b(this.f21136f, this);
        m8657g();
        try {
            interfaceC3429qa.mo7816c();
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8655b() throws RemoteException {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        m8656f();
        wf0 wf0Var = this.f21138h;
        if (wf0Var != null) {
            wf0Var.mo7041b();
        }
        this.f21138h = null;
        this.f21136f = null;
        this.f21137g = null;
        this.f21139i = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8656f() {
        View view = this.f21136f;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f21136f);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8657g() {
        View view;
        wf0 wf0Var = this.f21138h;
        if (wf0Var == null || (view = this.f21136f) == null) {
            return;
        }
        wf0Var.m8639m(view, Collections.emptyMap(), Collections.emptyMap(), wf0.m8628n(this.f21136f));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m8657g();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m8657g();
    }
}
