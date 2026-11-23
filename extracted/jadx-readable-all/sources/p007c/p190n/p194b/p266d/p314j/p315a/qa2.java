package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qa2 extends oa2<pa2, pa2> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: a */
    public final boolean mo7977a(k72 k72Var) {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo7978b(pa2 pa2Var, int i, long j2) {
        pa2Var.m8093c(i << 3, Long.valueOf(j2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ void mo7979c(pa2 pa2Var, int i, int i2) {
        pa2Var.m8093c((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ void mo7980d(pa2 pa2Var, int i, long j2) {
        pa2Var.m8093c((i << 3) | 1, Long.valueOf(j2));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ void mo7981e(pa2 pa2Var, int i, g72 g72Var) {
        pa2Var.m8093c((i << 3) | 2, g72Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo7982f(pa2 pa2Var, int i, pa2 pa2Var2) {
        pa2Var.m8093c((i << 3) | 3, pa2Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ pa2 mo7983g() {
        return pa2.m8091a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: h */
    public final pa2 mo7984h(pa2 pa2Var) {
        pa2Var.f17895f = false;
        return pa2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ void mo7985i(Object obj, pa2 pa2Var) {
        ((g82) obj).zzc = pa2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ pa2 mo7986j(Object obj) {
        return ((g82) obj).zzc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ pa2 mo7987k(Object obj) {
        g82 g82Var = (g82) obj;
        pa2 pa2Var = g82Var.zzc;
        if (pa2Var != pa2.f17890a) {
            return pa2Var;
        }
        pa2 pa2VarM8091a = pa2.m8091a();
        g82Var.zzc = pa2VarM8091a;
        return pa2VarM8091a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ void mo7988l(Object obj, pa2 pa2Var) {
        ((g82) obj).zzc = pa2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: m */
    public final void mo7989m(Object obj) {
        ((g82) obj).zzc.f17895f = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: o */
    public final pa2 mo7991o(pa2 pa2Var, pa2 pa2Var2) {
        pa2 pa2Var3 = pa2Var2;
        if (pa2Var3.equals(pa2.f17890a)) {
            return pa2Var;
        }
        pa2 pa2Var4 = pa2Var;
        int i = pa2Var4.f17891b + pa2Var3.f17891b;
        int[] iArrCopyOf = Arrays.copyOf(pa2Var4.f17892c, i);
        System.arraycopy(pa2Var3.f17892c, 0, iArrCopyOf, pa2Var4.f17891b, pa2Var3.f17891b);
        Object[] objArrCopyOf = Arrays.copyOf(pa2Var4.f17893d, i);
        System.arraycopy(pa2Var3.f17893d, 0, objArrCopyOf, pa2Var4.f17891b, pa2Var3.f17891b);
        return new pa2(i, iArrCopyOf, objArrCopyOf, true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: p */
    public final int mo7992p(pa2 pa2Var) {
        pa2 pa2Var2 = pa2Var;
        int i = pa2Var2.f17894e;
        if (i != -1) {
            return i;
        }
        int iM7971u = 0;
        for (int i2 = 0; i2 < pa2Var2.f17891b; i2++) {
            int i3 = pa2Var2.f17892c[i2];
            g72 g72Var = (g72) pa2Var2.f17893d[i2];
            int iM7971u2 = o72.m7971u(8);
            int iM7971u3 = o72.m7971u(16);
            int iM7971u4 = o72.m7971u(i3 >>> 3);
            int iM7971u5 = o72.m7971u(24);
            int iMo5719m = g72Var.mo5719m();
            int i4 = iM7971u3 + iM7971u4;
            iM7971u += o72.m7971u(iMo5719m) + iMo5719m + iM7971u5 + i4 + iM7971u2 + iM7971u2;
        }
        pa2Var2.f17894e = iM7971u;
        return iM7971u;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: q */
    public final /* bridge */ /* synthetic */ int mo7993q(pa2 pa2Var) {
        return pa2Var.m8092b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.oa2
    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ void mo7994r(pa2 pa2Var, p72 p72Var) throws IOException {
        pa2Var.m8094d(p72Var);
    }
}
