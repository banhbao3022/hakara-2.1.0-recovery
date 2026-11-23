package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2872b9;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3275m4;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.y */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2308y implements InterfaceC3275m4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f10799a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2248b0 f10800b;

    public C2308y(String str, C2248b0 c2248b0) {
        this.f10799a = str;
        this.f10800b = c2248b0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3275m4
    /* JADX INFO: renamed from: a */
    public final void mo4710a(C2872b9 c2872b9) {
        String str = this.f10799a;
        String string = c2872b9.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        C2622l.m5226A3(sb.toString());
        this.f10800b.m7286a(null);
    }
}
