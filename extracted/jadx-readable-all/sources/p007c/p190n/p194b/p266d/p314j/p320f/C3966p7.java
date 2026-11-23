package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.f.p7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3966p7 extends AbstractC3946n7<C3936m7, C3936m7> {
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo9158a(C3936m7 c3936m7, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        c3936m7.m9144b(interfaceC3887h8);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: b */
    public final void mo9159b(C3936m7 c3936m7, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        C3936m7 c3936m8 = c3936m7;
        Objects.requireNonNull(c3936m8);
        Objects.requireNonNull(interfaceC3887h8);
        for (int i = 0; i < c3936m8.f22807b; i++) {
            ((C3943n4) interfaceC3887h8).m9154e(c3936m8.f22808c[i] >>> 3, c3936m8.f22809d[i]);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: c */
    public final void mo9160c(Object obj) {
        Objects.requireNonNull(((AbstractC4057z4) obj).zzbmy);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void mo9161d(Object obj, C3936m7 c3936m7) {
        ((AbstractC4057z4) obj).zzbmy = c3936m7;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: e */
    public final C3936m7 mo9162e(C3936m7 c3936m7, C3936m7 c3936m8) {
        C3936m7 c3936m9 = c3936m7;
        C3936m7 c3936m10 = c3936m8;
        if (c3936m10.equals(C3936m7.f22806a)) {
            return c3936m9;
        }
        int i = c3936m9.f22807b + c3936m10.f22807b;
        int[] iArrCopyOf = Arrays.copyOf(c3936m9.f22808c, i);
        System.arraycopy(c3936m10.f22808c, 0, iArrCopyOf, c3936m9.f22807b, c3936m10.f22807b);
        Object[] objArrCopyOf = Arrays.copyOf(c3936m9.f22809d, i);
        System.arraycopy(c3936m10.f22809d, 0, objArrCopyOf, c3936m9.f22807b, c3936m10.f22807b);
        return new C3936m7(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int mo9163f(C3936m7 c3936m7) {
        return c3936m7.m9145c();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3936m7 mo9164g(Object obj) {
        return ((AbstractC4057z4) obj).zzbmy;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3946n7
    /* JADX INFO: renamed from: h */
    public final int mo9165h(C3936m7 c3936m7) {
        C3936m7 c3936m8 = c3936m7;
        int i = c3936m8.f22810e;
        if (i != -1) {
            return i;
        }
        int iM9083v = 0;
        for (int i2 = 0; i2 < c3936m8.f22807b; i2++) {
            int i3 = c3936m8.f22808c[i2] >>> 3;
            AbstractC3823b4 abstractC3823b4 = (AbstractC3823b4) c3936m8.f22809d[i2];
            iM9083v += AbstractC3923l4.m9083v(3, abstractC3823b4) + AbstractC3923l4.m9064L(2, i3) + (AbstractC3923l4.m9073i(1) << 1);
        }
        c3936m8.f22810e = iM9083v;
        return iM9083v;
    }
}
