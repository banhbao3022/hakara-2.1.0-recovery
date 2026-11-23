package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2229l {

    /* JADX INFO: renamed from: a */
    public final int f10647a;

    /* JADX INFO: renamed from: b */
    public final ViewGroup.LayoutParams f10648b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f10649c;

    /* JADX INFO: renamed from: d */
    public final Context f10650d;

    public C2229l(InterfaceC3410ps interfaceC3410ps) throws C2227j {
        this.f10648b = interfaceC3410ps.getLayoutParams();
        ViewParent parent = interfaceC3410ps.getParent();
        this.f10650d = interfaceC3410ps.mo6498p0();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new C2227j("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f10649c = viewGroup;
        this.f10647a = viewGroup.indexOfChild(interfaceC3410ps.mo6468X());
        viewGroup.removeView(interfaceC3410ps.mo6468X());
        interfaceC3410ps.mo6451K0(true);
    }
}
