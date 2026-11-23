package p007c.p190n.p194b.p266d.p267a.p278v;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import p007c.p190n.p194b.p266d.p267a.AbstractC2184k;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.C2193t;
import p007c.p190n.p194b.p266d.p267a.C2194u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3310n2;
import p007c.p190n.p194b.p266d.p314j.p315a.C3420q1;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v;

/* JADX INFO: renamed from: c.n.b.d.a.v.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2195a extends AbstractC2184k {
    public C2195a(@RecentlyNonNull Context context) {
        super(context, 0);
        C2622l.m5379i(context, "Context cannot be null");
    }

    @RecentlyNullable
    public C2177g[] getAdSizes() {
        return this.f10578f.f18158g;
    }

    @RecentlyNullable
    public InterfaceC2197c getAppEventListener() {
        return this.f10578f.f18159h;
    }

    @RecentlyNonNull
    public C2193t getVideoController() {
        return this.f10578f.f18154c;
    }

    @RecentlyNullable
    public C2194u getVideoOptions() {
        return this.f10578f.f18161j;
    }

    public void setAdSizes(@RecentlyNonNull C2177g... c2177gArr) {
        if (c2177gArr == null || c2177gArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f10578f.m8178e(c2177gArr);
    }

    public void setAppEventListener(InterfaceC2197c interfaceC2197c) {
        this.f10578f.m8179f(interfaceC2197c);
    }

    public void setManualImpressionsEnabled(boolean z) {
        C3420q1 c3420q1 = this.f10578f;
        c3420q1.f18165n = z;
        try {
            InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4891h4(z);
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    public void setVideoOptions(@RecentlyNonNull C2194u c2194u) {
        C3420q1 c3420q1 = this.f10578f;
        c3420q1.f18161j = c2194u;
        try {
            InterfaceC3604v interfaceC3604v = c3420q1.f18160i;
            if (interfaceC3604v != null) {
                interfaceC3604v.mo4885a6(c2194u == null ? null : new C3310n2(c2194u));
            }
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    public C2195a(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet, true);
        C2622l.m5379i(context, "Context cannot be null");
    }

    public C2195a(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, true);
        C2622l.m5379i(context, "Context cannot be null");
    }
}
