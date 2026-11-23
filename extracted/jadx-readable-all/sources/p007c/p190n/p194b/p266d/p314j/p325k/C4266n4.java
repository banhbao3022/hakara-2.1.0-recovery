package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.n4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4266n4 implements InterfaceC4158f8 {

    /* JADX INFO: renamed from: a */
    public final AbstractC4238l4 f23336a;

    public C4266n4(AbstractC4238l4 abstractC4238l4) {
        Charset charset = C4127d5.f23112a;
        this.f23336a = abstractC4238l4;
        abstractC4238l4.f23287c = this;
    }

    /* JADX INFO: renamed from: a */
    public final void m10026a(int i, double d) throws IOException {
        AbstractC4238l4 abstractC4238l4 = this.f23336a;
        Objects.requireNonNull(abstractC4238l4);
        abstractC4238l4.mo9990z(i, Double.doubleToRawLongBits(d));
    }

    /* JADX INFO: renamed from: b */
    public final void m10027b(int i, float f) throws IOException {
        AbstractC4238l4 abstractC4238l4 = this.f23336a;
        Objects.requireNonNull(abstractC4238l4);
        abstractC4238l4.mo9974G(i, Float.floatToRawIntBits(f));
    }

    /* JADX INFO: renamed from: c */
    public final void m10028c(int i, Object obj) throws IOException {
        if (obj instanceof AbstractC4402x3) {
            this.f23336a.mo9988t(i, (AbstractC4402x3) obj);
        } else {
            this.f23336a.mo9981i(i, (InterfaceC4240l6) obj);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10029d(int i, Object obj, InterfaceC4431z6 interfaceC4431z6) throws IOException {
        this.f23336a.mo9982j(i, (InterfaceC4240l6) obj, interfaceC4431z6);
    }

    /* JADX INFO: renamed from: e */
    public final void m10030e(int i, Object obj, InterfaceC4431z6 interfaceC4431z6) throws IOException {
        AbstractC4238l4 abstractC4238l4 = this.f23336a;
        abstractC4238l4.mo9978f(i, 3);
        interfaceC4431z6.mo10057c((InterfaceC4240l6) obj, abstractC4238l4.f23287c);
        abstractC4238l4.mo9978f(i, 4);
    }

    /* JADX INFO: renamed from: f */
    public final void m10031f(int i, long j2) throws IOException {
        this.f23336a.mo9979g(i, AbstractC4238l4.m9957R(j2));
    }

    /* JADX INFO: renamed from: g */
    public final void m10032g(int i, int i2) throws IOException {
        this.f23336a.mo9989y(i, AbstractC4238l4.m9961V(i2));
    }
}
