package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.v1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3606v1 extends AbstractBinderC3419q0 {

    /* JADX INFO: renamed from: f */
    public final String f20685f;

    /* JADX INFO: renamed from: g */
    public final String f20686g;

    public BinderC3606v1(String str, String str2) {
        this.f20685f = str;
        this.f20686g = str2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3456r0
    /* JADX INFO: renamed from: c */
    public final String mo8074c() throws RemoteException {
        return this.f20685f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3456r0
    /* JADX INFO: renamed from: d */
    public final String mo8075d() throws RemoteException {
        return this.f20686g;
    }
}
