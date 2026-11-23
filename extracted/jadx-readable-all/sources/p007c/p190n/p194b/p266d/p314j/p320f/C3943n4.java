package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.f.n4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3943n4 implements InterfaceC3887h8 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3923l4 f22821a;

    public C3943n4(AbstractC3923l4 abstractC3923l4) {
        Charset charset = C3814a5.f22506a;
        this.f22821a = abstractC3923l4;
        abstractC3923l4.f22765c = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m9150a(int i, double d) throws IOException {
        AbstractC3923l4 abstractC3923l4 = this.f22821a;
        Objects.requireNonNull(abstractC3923l4);
        abstractC3923l4.mo9104z(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: b */
    public final void m9151b(int i, float f) throws IOException {
        AbstractC3923l4 abstractC3923l4 = this.f22821a;
        Objects.requireNonNull(abstractC3923l4);
        abstractC3923l4.mo9089I(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: c */
    public final void m9152c(int i, Object obj, InterfaceC4059z6 interfaceC4059z6) throws IOException {
        this.f22821a.mo9096e(i, (InterfaceC3895i6) obj, interfaceC4059z6);
    }

    /* JADX INFO: renamed from: d */
    public final void m9153d(int i, long j2) throws IOException {
        this.f22821a.mo9093b(i, AbstractC3923l4.m9071U(j2));
    }

    /* JADX INFO: renamed from: e */
    public final void m9154e(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC3823b4) {
            this.f22821a.mo9100q(i, (AbstractC3823b4) obj);
        } else {
            this.f22821a.mo9095d(i, (InterfaceC3895i6) obj);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9155f(int i, Object obj, InterfaceC4059z6 interfaceC4059z6) throws IOException {
        AbstractC3923l4 abstractC3923l4 = this.f22821a;
        abstractC3923l4.mo9086B(i, 3);
        interfaceC4059z6.mo9125d((InterfaceC3895i6) obj, abstractC3923l4.f22765c);
        abstractC3923l4.mo9086B(i, 4);
    }

    /* JADX INFO: renamed from: g */
    public final void m9156g(int i, int i2) throws IOException {
        this.f22821a.mo9088F(i, AbstractC3923l4.m9078n(i2));
    }
}
