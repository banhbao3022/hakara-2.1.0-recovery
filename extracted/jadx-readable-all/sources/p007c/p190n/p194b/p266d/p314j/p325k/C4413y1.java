package p007c.p190n.p194b.p266d.p314j.p325k;

import android.content.Context;

/* JADX INFO: renamed from: c.n.b.d.j.k.y1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4413y1 extends AbstractC4401x2 {

    /* JADX INFO: renamed from: a */
    public final Context f23633a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4125d3<AbstractC4097b3<C4236l2>> f23634b;

    public C4413y1(Context context, InterfaceC4125d3<AbstractC4097b3<C4236l2>> interfaceC4125d3) {
        this.f23633a = context;
        this.f23634b = interfaceC4125d3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4401x2
    /* JADX INFO: renamed from: a */
    public final Context mo10329a() {
        return this.f23633a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4401x2
    /* JADX INFO: renamed from: b */
    public final InterfaceC4125d3<AbstractC4097b3<C4236l2>> mo10330b() {
        return this.f23634b;
    }

    public final boolean equals(Object obj) {
        InterfaceC4125d3<AbstractC4097b3<C4236l2>> interfaceC4125d3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4401x2) {
            AbstractC4401x2 abstractC4401x2 = (AbstractC4401x2) obj;
            if (this.f23633a.equals(abstractC4401x2.mo10329a()) && ((interfaceC4125d3 = this.f23634b) != null ? interfaceC4125d3.equals(abstractC4401x2.mo10330b()) : abstractC4401x2.mo10330b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f23633a.hashCode() ^ 1000003) * 1000003;
        InterfaceC4125d3<AbstractC4097b3<C4236l2>> interfaceC4125d3 = this.f23634b;
        return iHashCode ^ (interfaceC4125d3 == null ? 0 : interfaceC4125d3.hashCode());
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23633a);
        String strValueOf2 = String.valueOf(this.f23634b);
        StringBuilder sb = new StringBuilder(strValueOf2.length() + strValueOf.length() + 46);
        sb.append("FlagsContext{context=");
        sb.append(strValueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
