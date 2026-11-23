package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.w5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3647w5 extends AbstractC2201d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3610v5 f20999a;

    /* JADX INFO: renamed from: b */
    public final Drawable f21000b;

    /* JADX INFO: renamed from: c */
    public final Uri f21001c;

    /* JADX INFO: renamed from: d */
    public final double f21002d;

    /* JADX INFO: renamed from: e */
    public final int f21003e;

    /* JADX INFO: renamed from: f */
    public final int f21004f;

    public C3647w5(InterfaceC3610v5 interfaceC3610v5) {
        Drawable drawable;
        double dMo7060e;
        int iMo7058c;
        this.f20999a = interfaceC3610v5;
        Uri uriMo7057b = null;
        try {
            InterfaceC2799a interfaceC2799aMo7056a = interfaceC3610v5.mo7056a();
            drawable = interfaceC2799aMo7056a != null ? (Drawable) BinderC2800b.m5639T1(interfaceC2799aMo7056a) : null;
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
        this.f21000b = drawable;
        try {
            uriMo7057b = this.f20999a.mo7057b();
        } catch (RemoteException e2) {
            C2622l.m5438t3("", e2);
        }
        this.f21001c = uriMo7057b;
        try {
            dMo7060e = this.f20999a.mo7060e();
        } catch (RemoteException e3) {
            C2622l.m5438t3("", e3);
            dMo7060e = 1.0d;
        }
        this.f21002d = dMo7060e;
        int iMo7059d = -1;
        try {
            iMo7058c = this.f20999a.mo7058c();
        } catch (RemoteException e4) {
            C2622l.m5438t3("", e4);
            iMo7058c = -1;
        }
        this.f21003e = iMo7058c;
        try {
            iMo7059d = this.f20999a.mo7059d();
        } catch (RemoteException e5) {
            C2622l.m5438t3("", e5);
        }
        this.f21004f = iMo7059d;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d
    /* JADX INFO: renamed from: a */
    public final Drawable mo4640a() {
        return this.f21000b;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d
    /* JADX INFO: renamed from: b */
    public final double mo4641b() {
        return this.f21002d;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d
    /* JADX INFO: renamed from: c */
    public final Uri mo4642c() {
        return this.f21001c;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d
    /* JADX INFO: renamed from: d */
    public final int mo4643d() {
        return this.f21003e;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p279w.AbstractC2201d
    /* JADX INFO: renamed from: e */
    public final int mo4644e() {
        return this.f21004f;
    }
}
