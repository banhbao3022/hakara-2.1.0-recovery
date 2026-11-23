package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import java.util.Collections;
import java.util.Map;
import p007c.p190n.p194b.p266d.p314j.p315a.C3189jt;
import p007c.p190n.p194b.p266d.p314j.p315a.C3553tn;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3239l5;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3275m4;
import p007c.p190n.p194b.p266d.p314j.p315a.ji2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2310z extends C3189jt {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte[] f10802t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ Map f10803u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ C3553tn f10804v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2310z(int i, String str, InterfaceC3239l5 interfaceC3239l5, InterfaceC3275m4 interfaceC3275m4, byte[] bArr, Map map, C3553tn c3553tn) {
        super(i, str, interfaceC3239l5, interfaceC3275m4);
        this.f10802t = bArr;
        this.f10803u = map;
        this.f10804v = c3553tn;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.C3189jt
    /* JADX INFO: renamed from: A */
    public final void mo4729x(String str) {
        this.f10804v.m8435c(str);
        super.mo4729x(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0
    /* JADX INFO: renamed from: q */
    public final Map<String, String> mo4829q() throws ji2 {
        Map<String, String> map = this.f10803u;
        return map == null ? Collections.emptyMap() : map;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0
    /* JADX INFO: renamed from: s */
    public final byte[] mo4830s() throws ji2 {
        byte[] bArr = this.f10802t;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.C3189jt, p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3679x0
    /* JADX INFO: renamed from: x */
    public final void mo4729x(String str) {
        String str2 = str;
        this.f10804v.m8435c(str2);
        super.mo4729x(str2);
    }
}
