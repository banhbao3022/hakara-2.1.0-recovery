package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p007c.p190n.p194b.p266d.p267a.AbstractC2138c;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p267a.C2194u;
import p007c.p190n.p194b.p266d.p267a.InterfaceC2188o;
import p007c.p190n.p194b.p266d.p267a.p278v.InterfaceC2197c;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.q1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3420q1 {

    /* JADX INFO: renamed from: a */
    public final BinderC3247ld f18152a;

    /* JADX INFO: renamed from: b */
    public final iw2 f18153b;

    /* JADX INFO: renamed from: c */
    public final C2193t f18154c;

    /* JADX INFO: renamed from: d */
    public final hx2 f18155d;

    /* JADX INFO: renamed from: e */
    public uv2 f18156e;

    /* JADX INFO: renamed from: f */
    public AbstractC2138c f18157f;

    /* JADX INFO: renamed from: g */
    public C2177g[] f18158g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2197c f18159h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3604v f18160i;

    /* JADX INFO: renamed from: j */
    public C2194u f18161j;

    /* JADX INFO: renamed from: k */
    public String f18162k;

    /* JADX INFO: renamed from: l */
    @NotOnlyInitialized
    public final ViewGroup f18163l;

    /* JADX INFO: renamed from: m */
    public int f18164m;

    /* JADX INFO: renamed from: n */
    public boolean f18165n;

    /* JADX INFO: renamed from: o */
    public InterfaceC2188o f18166o;

    public C3420q1(ViewGroup viewGroup) {
        this(viewGroup, null, false, iw2.f15412a, null, 0);
    }

    /* JADX INFO: renamed from: a */
    public static jw2 m8174a(Context context, C2177g[] c2177gArr, int i) {
        for (C2177g c2177g : c2177gArr) {
            if (c2177g.equals(C2177g.f10564i)) {
                return jw2.m7417K();
            }
        }
        jw2 jw2Var = new jw2(context, c2177gArr);
        jw2Var.f15844o = i == 1;
        return jw2Var;
    }

    /* JADX INFO: renamed from: b */
    public final C2177g m8175b() {
        jw2 jw2VarMo4898p;
        try {
            InterfaceC3604v interfaceC3604v = this.f18160i;
            if (interfaceC3604v != null && (jw2VarMo4898p = interfaceC3604v.mo4898p()) != null) {
                return new C2177g(jw2VarMo4898p.f15839j, jw2VarMo4898p.f15836g, jw2VarMo4898p.f15835f);
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
        C2177g[] c2177gArr = this.f18158g;
        if (c2177gArr != null) {
            return c2177gArr[0];
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m8176c() {
        InterfaceC3604v interfaceC3604v;
        if (this.f18162k == null && (interfaceC3604v = this.f18160i) != null) {
            try {
                this.f18162k = interfaceC3604v.mo4901r();
            } catch (RemoteException e) {
                C2622l.m5271J3("#007 Could not call remote method.", e);
            }
        }
        return this.f18162k;
    }

    /* JADX INFO: renamed from: d */
    public final void m8177d(uv2 uv2Var) {
        try {
            this.f18156e = uv2Var;
            InterfaceC3604v interfaceC3604v = this.f18160i;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4876P1(uv2Var != null ? new vv2(uv2Var) : null);
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m8178e(C2177g... c2177gArr) {
        this.f18158g = c2177gArr;
        try {
            InterfaceC3604v interfaceC3604v = this.f18160i;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4869F2(m8174a(this.f18163l.getContext(), this.f18158g, this.f18164m));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
        this.f18163l.requestLayout();
    }

    /* JADX INFO: renamed from: f */
    public final void m8179f(InterfaceC2197c interfaceC2197c) {
        try {
            this.f18159h = interfaceC2197c;
            InterfaceC3604v interfaceC3604v = this.f18160i;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4867D5(interfaceC2197c != null ? new wp2(interfaceC2197c) : null);
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    public C3420q1(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, iw2.f15412a, null, i);
    }

    public C3420q1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, iw2.f15412a, null, 0);
    }

    public C3420q1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, iw2.f15412a, null, i);
    }

    public C3420q1(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, iw2 iw2Var, InterfaceC3604v interfaceC3604v, int i) {
        jw2 jw2VarM7417K;
        this.f18152a = new BinderC3247ld();
        this.f18154c = new C2193t();
        this.f18155d = new C3383p1(this);
        this.f18163l = viewGroup;
        this.f18153b = iw2Var;
        this.f18160i = null;
        new AtomicBoolean(false);
        this.f18164m = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                sw2 sw2Var = new sw2(context, attributeSet);
                if (!z && sw2Var.f19727a.length != 1) {
                    throw new IllegalArgumentException("The adSizes XML attribute is only allowed on PublisherAdViews.");
                }
                this.f18158g = sw2Var.f19727a;
                this.f18162k = sw2Var.f19728b;
                if (viewGroup.isInEditMode()) {
                    C3331nn c3331nn = gx2.f14692a.f14693b;
                    C2177g c2177g = this.f18158g[0];
                    int i2 = this.f18164m;
                    if (c2177g.equals(C2177g.f10564i)) {
                        jw2VarM7417K = jw2.m7417K();
                    } else {
                        jw2 jw2Var = new jw2(context, c2177g);
                        jw2Var.f15844o = i2 == 1;
                        jw2VarM7417K = jw2Var;
                    }
                    Objects.requireNonNull(c3331nn);
                    C3331nn.m7895m(viewGroup, jw2VarM7417K, "Ads by Google", -16777216, -1);
                }
            } catch (IllegalArgumentException e) {
                C3331nn c3331nn2 = gx2.f14692a.f14693b;
                jw2 jw2Var2 = new jw2(context, C2177g.f10556a);
                String message = e.getMessage();
                String message2 = e.getMessage();
                Objects.requireNonNull(c3331nn2);
                if (message2 != null) {
                    C2622l.m5226A3(message2);
                }
                C3331nn.m7895m(viewGroup, jw2Var2, message, -65536, -16777216);
            }
        }
    }
}
