package p007c.p190n.p194b.p266d.p314j.p315a;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.h5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3091h5 extends AbstractBinderC3572u5 {

    /* JADX INFO: renamed from: f */
    public final Drawable f14759f;

    /* JADX INFO: renamed from: g */
    public final Uri f14760g;

    /* JADX INFO: renamed from: h */
    public final double f14761h;

    /* JADX INFO: renamed from: i */
    public final int f14762i;

    /* JADX INFO: renamed from: j */
    public final int f14763j;

    public BinderC3091h5(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f14759f = drawable;
        this.f14760g = uri;
        this.f14761h = d;
        this.f14762i = i;
        this.f14763j = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: a */
    public final InterfaceC2799a mo7056a() throws RemoteException {
        return new BinderC2800b(this.f14759f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: b */
    public final Uri mo7057b() throws RemoteException {
        return this.f14760g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: c */
    public final int mo7058c() {
        return this.f14762i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: d */
    public final int mo7059d() {
        return this.f14763j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: e */
    public final double mo7060e() {
        return this.f14761h;
    }
}
