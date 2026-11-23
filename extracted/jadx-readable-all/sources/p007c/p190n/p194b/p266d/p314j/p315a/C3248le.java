package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.le */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3248le implements InterfaceC2110d<?, ?> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3618vd f16323a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BinderC3322ne f16324b;

    public C3248le(BinderC3322ne binderC3322ne, InterfaceC3618vd interfaceC3618vd) {
        this.f16324b = binderC3322ne;
        this.f16323a = interfaceC3618vd;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d
    /* JADX INFO: renamed from: a */
    public final void mo4603a(C2103a c2103a) {
        try {
            String canonicalName = this.f16324b.f17073f.getClass().getCanonicalName();
            int i = c2103a.f10443a;
            String str = c2103a.f10444b;
            String str2 = c2103a.f10445c;
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 85 + String.valueOf(str).length() + String.valueOf(str2).length());
            sb.append(canonicalName);
            sb.append("failed to load mediation ad: ErrorCode = ");
            sb.append(i);
            sb.append(". ErrorMessage = ");
            sb.append(str);
            sb.append(". ErrorDomain = ");
            sb.append(str2);
            C2622l.m5318U2(sb.toString());
            this.f16323a.mo6584g1(c2103a.m4597a());
            this.f16323a.mo6595z6(c2103a.f10443a, c2103a.f10444b);
            this.f16323a.mo6580Y(c2103a.f10443a);
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
