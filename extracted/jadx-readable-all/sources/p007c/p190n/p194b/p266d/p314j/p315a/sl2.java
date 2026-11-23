package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sl2 implements sn2 {

    /* JADX INFO: renamed from: a */
    public final Uri f19606a;

    /* JADX INFO: renamed from: b */
    public final hn2 f19607b;

    /* JADX INFO: renamed from: c */
    public final tl2 f19608c;

    /* JADX INFO: renamed from: d */
    public final xn2 f19609d;

    /* JADX INFO: renamed from: e */
    public final gj2 f19610e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f19611f;

    /* JADX INFO: renamed from: g */
    public boolean f19612g;

    /* JADX INFO: renamed from: h */
    public long f19613h;

    /* JADX INFO: renamed from: i */
    public long f19614i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ vl2 f19615j;

    public sl2(vl2 vl2Var, Uri uri, hn2 hn2Var, tl2 tl2Var, xn2 xn2Var) {
        this.f19615j = vl2Var;
        Objects.requireNonNull(uri);
        this.f19606a = uri;
        Objects.requireNonNull(hn2Var);
        this.f19607b = hn2Var;
        Objects.requireNonNull(tl2Var);
        this.f19608c = tl2Var;
        this.f19609d = xn2Var;
        this.f19610e = new gj2();
        this.f19612g = true;
        this.f19614i = -1L;
    }

    /* JADX INFO: renamed from: a */
    public final void m8355a() throws Throwable {
        bj2 bj2Var;
        long j2;
        while (!this.f19611f) {
            int i = 0;
            try {
                long j3 = this.f19610e.f14598a;
                long jMo6843a = this.f19607b.mo6843a(new jn2(this.f19606a, null, j3, j3, -1L, null, 0));
                this.f19614i = jMo6843a;
                if (jMo6843a != -1) {
                    j2 = j3;
                    jMo6843a += j2;
                    this.f19614i = jMo6843a;
                } else {
                    j2 = j3;
                }
                bj2Var = new bj2(this.f19607b, j2, jMo6843a);
                try {
                    cj2 cj2VarM8427a = this.f19608c.m8427a(bj2Var, this.f19607b.mo6844b());
                    if (this.f19612g) {
                        cj2VarM8427a.mo6196f(j2, this.f19613h);
                        this.f19612g = false;
                    }
                    long j4 = j2;
                    int iMo6193b = 0;
                    while (iMo6193b == 0) {
                        try {
                            if (this.f19611f) {
                                iMo6193b = 0;
                                break;
                            }
                            xn2 xn2Var = this.f19609d;
                            synchronized (xn2Var) {
                                while (!xn2Var.f21623a) {
                                    xn2Var.wait();
                                }
                            }
                            iMo6193b = cj2VarM8427a.mo6193b(bj2Var, this.f19610e);
                            long j5 = bj2Var.f12710d;
                            if (j5 > this.f19615j.f20846l + j4) {
                                xn2 xn2Var2 = this.f19609d;
                                synchronized (xn2Var2) {
                                    xn2Var2.f21623a = false;
                                }
                                vl2 vl2Var = this.f19615j;
                                vl2Var.f20852r.post(vl2Var.f20851q);
                                j4 = j5;
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = iMo6193b;
                            if (i != 1 && bj2Var != null) {
                                this.f19610e.f14598a = bj2Var.f12710d;
                            }
                            hn2 hn2Var = this.f19607b;
                            int i2 = jo2.f15673a;
                            if (hn2Var != null) {
                                try {
                                    hn2Var.mo6846e();
                                } catch (IOException unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (iMo6193b != 1) {
                        this.f19610e.f14598a = bj2Var.f12710d;
                        i = iMo6193b;
                    }
                    hn2 hn2Var2 = this.f19607b;
                    int i3 = jo2.f15673a;
                    if (hn2Var2 != null) {
                        try {
                            hn2Var2.mo6846e();
                        } catch (IOException unused2) {
                        }
                    }
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                bj2Var = null;
            }
        }
    }
}
