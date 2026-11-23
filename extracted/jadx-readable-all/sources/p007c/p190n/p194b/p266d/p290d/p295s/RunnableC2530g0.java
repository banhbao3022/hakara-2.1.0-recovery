package p007c.p190n.p194b.p266d.p290d.p295s;

import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p290d.C2383e;

/* JADX INFO: renamed from: c.n.b.d.d.s.g0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2530g0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2522c0 f11412f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2536j0 f11413g;

    public RunnableC2530g0(C2522c0 c2522c0, C2536j0 c2536j0) {
        this.f11412f = c2522c0;
        this.f11413g = c2536j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        boolean z3;
        C2522c0 c2522c0 = this.f11412f;
        C2536j0 c2536j0 = this.f11413g;
        C2518b c2518b = C2522c0.f11384A;
        Objects.requireNonNull(c2522c0);
        C2380d c2380d = c2536j0.f11427i;
        if (!C2516a.m5114d(c2380d, c2522c0.f11387D)) {
            c2522c0.f11387D = c2380d;
            c2522c0.f11389F.mo4957c(c2380d);
        }
        double d = c2536j0.f11424f;
        if (Double.isNaN(d) || Math.abs(d - c2522c0.f11398O) <= 1.0E-7d) {
            z = false;
        } else {
            c2522c0.f11398O = d;
            z = true;
        }
        boolean z4 = c2536j0.f11425g;
        if (z4 != c2522c0.f11395L) {
            c2522c0.f11395L = z4;
            z = true;
        }
        Double.isNaN(c2536j0.f11430l);
        C2518b c2518b2 = C2522c0.f11384A;
        c2518b2.m5119a("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c2522c0.f11397N));
        C2383e.c cVar = c2522c0.f11389F;
        if (cVar != null && (z || c2522c0.f11397N)) {
            cVar.mo4960f();
        }
        int i = c2536j0.f11426h;
        if (i != c2522c0.f11400Q) {
            c2522c0.f11400Q = i;
            z2 = true;
        } else {
            z2 = false;
        }
        c2518b2.m5119a("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c2522c0.f11397N));
        C2383e.c cVar2 = c2522c0.f11389F;
        if (cVar2 != null && (z2 || c2522c0.f11397N)) {
            cVar2.mo4955a(c2522c0.f11400Q);
        }
        int i2 = c2536j0.f11428j;
        if (i2 != c2522c0.f11401R) {
            c2522c0.f11401R = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        c2518b2.m5119a("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c2522c0.f11397N));
        C2383e.c cVar3 = c2522c0.f11389F;
        if (cVar3 != null && (z3 || c2522c0.f11397N)) {
            cVar3.mo4959e(c2522c0.f11401R);
        }
        if (!C2516a.m5114d(c2522c0.f11399P, c2536j0.f11429k)) {
            c2522c0.f11399P = c2536j0.f11429k;
        }
        c2522c0.f11397N = false;
    }
}
