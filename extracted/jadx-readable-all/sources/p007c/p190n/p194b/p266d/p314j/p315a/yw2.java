package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yw2 extends fx2<InterfaceC3604v> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f22127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jw2 f22128c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f22129d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC3395pd f22130e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ex2 f22131f;

    public yw2(ex2 ex2Var, Context context, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd) {
        this.f22131f = ex2Var;
        this.f22127b = context;
        this.f22128c = jw2Var;
        this.f22129d = str;
        this.f22130e = interfaceC3395pd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3604v mo5889a() {
        ex2.m6696b(this.f22127b, "banner");
        return new BinderC2903c2();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3604v mo5890b() throws RemoteException {
        return this.f22131f.f13749a.m6536c(this.f22127b, this.f22128c, this.f22129d, this.f22130e, 1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3604v mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6133h6(new BinderC2800b(this.f22127b), this.f22128c, this.f22129d, this.f22130e, 210890000);
    }
}
