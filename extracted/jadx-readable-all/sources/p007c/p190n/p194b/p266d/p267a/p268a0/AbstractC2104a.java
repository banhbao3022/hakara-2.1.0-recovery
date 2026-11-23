package p007c.p190n.p194b.p266d.p267a.p268a0;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.AbstractC2185l;
import p007c.p190n.p194b.p266d.p267a.C2172f;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3346o1;
import p007c.p190n.p194b.p266d.p314j.p315a.C3540ta;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v;
import p007c.p190n.p194b.p266d.p314j.p315a.bw2;

/* JADX INFO: renamed from: c.n.b.d.a.a0.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2104a {
    /* JADX INFO: renamed from: a */
    public static void m4599a(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C2172f c2172f, @RecentlyNonNull AbstractC2105b abstractC2105b) {
        C2622l.m5379i(context, "Context cannot be null.");
        C2622l.m5379i(str, "AdUnitId cannot be null.");
        C2622l.m5379i(c2172f, "AdRequest cannot be null.");
        C2622l.m5379i(abstractC2105b, "LoadCallback cannot be null.");
        C3540ta c3540ta = new C3540ta(context, str);
        C3346o1 c3346o1 = c2172f.f10554a;
        try {
            InterfaceC3604v interfaceC3604v = c3540ta.f19802c;
            if (interfaceC3604v != null) {
                c3540ta.f19803d.f16317f = c3346o1.f17490g;
                interfaceC3604v.mo4868E5(c3540ta.f19801b.m7314a(c3540ta.f19800a, c3346o1), new bw2(abstractC2105b, c3540ta));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            abstractC2105b.mo2740a(new C2186m(0, "Internal Error.", "com.google.android.gms.ads", null, null));
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo4600b(AbstractC2185l abstractC2185l);

    /* JADX INFO: renamed from: c */
    public abstract void mo4601c(boolean z);

    /* JADX INFO: renamed from: d */
    public abstract void mo4602d(@RecentlyNonNull Activity activity);
}
