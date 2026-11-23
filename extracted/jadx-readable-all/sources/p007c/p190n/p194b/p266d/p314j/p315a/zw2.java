package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zw2 extends fx2<InterfaceC3604v> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f22429b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jw2 f22430c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f22431d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ex2 f22432e;

    public zw2(ex2 ex2Var, Context context, jw2 jw2Var, String str) {
        this.f22432e = ex2Var;
        this.f22429b = context;
        this.f22430c = jw2Var;
        this.f22431d = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3604v mo5889a() {
        ex2.m6696b(this.f22429b, "search");
        return new BinderC2903c2();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3604v mo5890b() throws RemoteException {
        return this.f22432e.f13749a.m6536c(this.f22429b, this.f22430c, this.f22431d, null, 3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3604v mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6134o1(new BinderC2800b(this.f22429b), this.f22430c, this.f22431d, 210890000);
    }
}
