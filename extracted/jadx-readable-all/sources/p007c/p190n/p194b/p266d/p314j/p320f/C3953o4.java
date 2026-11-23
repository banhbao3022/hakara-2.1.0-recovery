package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.f.o4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3953o4 extends AbstractC3963p4<AbstractC4057z4.e> {
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3963p4
    /* JADX INFO: renamed from: a */
    public final int mo9173a(Map.Entry<?, ?> entry) {
        throw new NoSuchMethodError();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3963p4
    /* JADX INFO: renamed from: b */
    public final void mo9174b(InterfaceC3887h8 interfaceC3887h8, Map.Entry<?, ?> entry) throws IOException {
        throw new NoSuchMethodError();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3963p4
    /* JADX INFO: renamed from: c */
    public final C3973q4<AbstractC4057z4.e> mo9175c(Object obj) {
        return ((AbstractC4057z4.b) obj).zzbnb;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3963p4
    /* JADX INFO: renamed from: d */
    public final C3973q4<AbstractC4057z4.e> mo9176d(Object obj) {
        AbstractC4057z4.b bVar = (AbstractC4057z4.b) obj;
        C3973q4<AbstractC4057z4.e> c3973q4 = bVar.zzbnb;
        if (c3973q4.f22848c) {
            bVar.zzbnb = (C3973q4) c3973q4.clone();
        }
        return bVar.zzbnb;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3963p4
    /* JADX INFO: renamed from: e */
    public final void mo9177e(Object obj) {
        ((AbstractC4057z4.b) obj).zzbnb.m9199m();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3963p4
    /* JADX INFO: renamed from: f */
    public final boolean mo9178f(InterfaceC3895i6 interfaceC3895i6) {
        return interfaceC3895i6 instanceof AbstractC4057z4.b;
    }
}
