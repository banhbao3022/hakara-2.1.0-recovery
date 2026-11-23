package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o92<T> implements ba2<T> {

    /* JADX INFO: renamed from: a */
    public final l92 f17566a;

    /* JADX INFO: renamed from: b */
    public final oa2<?, ?> f17567b;

    /* JADX INFO: renamed from: c */
    public final boolean f17568c;

    /* JADX INFO: renamed from: d */
    public final t72<?> f17569d;

    public o92(oa2<?, ?> oa2Var, t72<?> t72Var, l92 l92Var) {
        this.f17567b = oa2Var;
        this.f17568c = t72Var.mo8400a(l92Var);
        this.f17569d = t72Var;
        this.f17566a = l92Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: c */
    public final int mo5948c(T t) {
        oa2<?, ?> oa2Var = this.f17567b;
        int iMo7992p = oa2Var.mo7992p(oa2Var.mo7986j(t));
        if (!this.f17568c) {
            return iMo7992p;
        }
        this.f17569d.mo8401b(t);
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: e */
    public final int mo5949e(T t) {
        int iHashCode = this.f17567b.mo7986j(t).hashCode();
        if (!this.f17568c) {
            return iHashCode;
        }
        this.f17569d.mo8401b(t);
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: f */
    public final void mo5950f(T t, T t2) {
        oa2<?, ?> oa2Var = this.f17567b;
        Class<?> cls = da2.f13197a;
        oa2Var.mo7985i(t, oa2Var.mo7991o(oa2Var.mo7986j(t), oa2Var.mo7986j(t2)));
        if (this.f17568c) {
            this.f17569d.mo8401b(t2);
            throw null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: g */
    public final boolean mo5951g(T t) {
        this.f17569d.mo8401b(t);
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: h */
    public final void mo5952h(T t) {
        this.f17567b.mo7989m(t);
        this.f17569d.mo8403d(t);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: i */
    public final boolean mo5953i(T t, T t2) {
        if (!this.f17567b.mo7986j(t).equals(this.f17567b.mo7986j(t2))) {
            return false;
        }
        if (!this.f17568c) {
            return true;
        }
        this.f17569d.mo8401b(t);
        this.f17569d.mo8401b(t2);
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: j */
    public final void mo5954j(T t, k72 k72Var, s72 s72Var) throws IOException {
        boolean zM7484w;
        oa2<?, ?> oa2Var = this.f17567b;
        t72<?> t72Var = this.f17569d;
        Object objMo7987k = oa2Var.mo7987k(t);
        x72<T> x72VarMo8402c = t72Var.mo8402c(t);
        while (k72Var.m7483v() != Integer.MAX_VALUE) {
            try {
                int i = k72Var.f15897b;
                if (i != 11) {
                    if ((i & 7) == 2) {
                        Object objMo8405f = t72Var.mo8405f(s72Var, this.f17566a, i >>> 3);
                        if (objMo8405f != null) {
                            t72Var.mo8406g(k72Var, objMo8405f, s72Var, x72VarMo8402c);
                        } else {
                            zM7484w = oa2Var.m7990n(objMo7987k, k72Var);
                        }
                    } else {
                        zM7484w = k72Var.m7484w();
                    }
                    if (!zM7484w) {
                        oa2Var.mo7988l(t, objMo7987k);
                        return;
                    }
                } else {
                    int iM7455I = 0;
                    Object objMo8405f2 = null;
                    g72 g72VarM7454H = null;
                    while (k72Var.m7483v() != Integer.MAX_VALUE) {
                        int i2 = k72Var.f15897b;
                        if (i2 == 16) {
                            iM7455I = k72Var.m7455I();
                            objMo8405f2 = t72Var.mo8405f(s72Var, this.f17566a, iM7455I);
                        } else if (i2 == 26) {
                            if (objMo8405f2 != null) {
                                t72Var.mo8406g(k72Var, objMo8405f2, s72Var, x72VarMo8402c);
                            } else {
                                g72VarM7454H = k72Var.m7454H();
                            }
                        } else if (!k72Var.m7484w()) {
                            break;
                        }
                    }
                    if (k72Var.f15897b != 12) {
                        throw r82.m8264e();
                    }
                    if (g72VarM7454H != null) {
                        if (objMo8405f2 != null) {
                            t72Var.mo8407h(g72VarM7454H, objMo8405f2, s72Var, x72VarMo8402c);
                        } else {
                            oa2Var.mo7981e(objMo7987k, iM7455I, g72VarM7454H);
                        }
                    }
                }
            } catch (Throwable th) {
                oa2Var.mo7988l(t, objMo7987k);
                throw th;
            }
        }
        oa2Var.mo7988l(t, objMo7987k);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: k */
    public final void mo5955k(T t, p72 p72Var) throws IOException {
        this.f17569d.mo8401b(t);
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    /* JADX INFO: renamed from: l */
    public final void mo5956l(T t, byte[] bArr, int i, int i2, w62 w62Var) throws IOException {
        g82 g82Var = (g82) t;
        if (g82Var.zzc == pa2.f17890a) {
            g82Var.zzc = pa2.m8091a();
        }
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ba2
    public final T zza() {
        return (T) this.f17566a.mo6960d().mo6297k();
    }
}
