package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vl2 implements zl2, dj2, qn2 {

    /* JADX INFO: renamed from: A */
    public om2 f20828A;

    /* JADX INFO: renamed from: B */
    public long f20829B;

    /* JADX INFO: renamed from: C */
    public boolean[] f20830C;

    /* JADX INFO: renamed from: D */
    public boolean[] f20831D;

    /* JADX INFO: renamed from: E */
    public boolean f20832E;

    /* JADX INFO: renamed from: G */
    public long f20834G;

    /* JADX INFO: renamed from: I */
    public int f20836I;

    /* JADX INFO: renamed from: J */
    public boolean f20837J;

    /* JADX INFO: renamed from: K */
    public boolean f20838K;

    /* JADX INFO: renamed from: L */
    public final kn2 f20839L;

    /* JADX INFO: renamed from: f */
    public final Uri f20840f;

    /* JADX INFO: renamed from: g */
    public final hn2 f20841g;

    /* JADX INFO: renamed from: h */
    public final int f20842h;

    /* JADX INFO: renamed from: i */
    public final Handler f20843i;

    /* JADX INFO: renamed from: j */
    public final wl2 f20844j;

    /* JADX INFO: renamed from: k */
    public final am2 f20845k;

    /* JADX INFO: renamed from: l */
    public final long f20846l;

    /* JADX INFO: renamed from: n */
    public final tl2 f20848n;

    /* JADX INFO: renamed from: t */
    public yl2 f20854t;

    /* JADX INFO: renamed from: u */
    public jj2 f20855u;

    /* JADX INFO: renamed from: v */
    public boolean f20856v;

    /* JADX INFO: renamed from: w */
    public boolean f20857w;

    /* JADX INFO: renamed from: x */
    public boolean f20858x;

    /* JADX INFO: renamed from: y */
    public boolean f20859y;

    /* JADX INFO: renamed from: z */
    public int f20860z;

    /* JADX INFO: renamed from: m */
    public final un2 f20847m = new un2("Loader:ExtractorMediaPeriod");

    /* JADX INFO: renamed from: o */
    public final xn2 f20849o = new xn2();

    /* JADX INFO: renamed from: p */
    public final Runnable f20850p = new ol2(this);

    /* JADX INFO: renamed from: q */
    public final Runnable f20851q = new pl2(this);

    /* JADX INFO: renamed from: r */
    public final Handler f20852r = new Handler();

    /* JADX INFO: renamed from: H */
    public long f20835H = -9223372036854775807L;

    /* JADX INFO: renamed from: s */
    public final SparseArray<km2> f20853s = new SparseArray<>();

    /* JADX INFO: renamed from: F */
    public long f20833F = -1;

    public vl2(Uri uri, hn2 hn2Var, cj2[] cj2VarArr, int i, Handler handler, wl2 wl2Var, am2 am2Var, kn2 kn2Var, String str, int i2, byte[] bArr) {
        this.f20840f = uri;
        this.f20841g = hn2Var;
        this.f20842h = i;
        this.f20843i = handler;
        this.f20844j = wl2Var;
        this.f20845k = am2Var;
        this.f20839L = kn2Var;
        this.f20846l = i2;
        this.f20848n = new tl2(cj2VarArr, this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2, p007c.p190n.p194b.p266d.p314j.p315a.lm2
    /* JADX INFO: renamed from: a */
    public final boolean mo6205a(long j2) {
        if (this.f20837J) {
            return false;
        }
        if (this.f20857w && this.f20860z == 0) {
            return false;
        }
        boolean zM8743a = this.f20849o.m8743a();
        if (this.f20847m.m8513a()) {
            return zM8743a;
        }
        m8566j();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m8565b(sl2 sl2Var) {
        if (this.f20833F == -1) {
            this.f20833F = sl2Var.f19614i;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: c */
    public final long mo6206c(rm2[] rm2VarArr, boolean[] zArr, ul2[] ul2VarArr, boolean[] zArr2, long j2) {
        rm2 rm2Var;
        C2622l.m5322V2(this.f20857w);
        for (int i = 0; i < rm2VarArr.length; i++) {
            ul2 ul2Var = ul2VarArr[i];
            if (ul2Var != null && (rm2VarArr[i] == null || !zArr[i])) {
                int i2 = ul2Var.f20373a;
                C2622l.m5322V2(this.f20830C[i2]);
                this.f20860z--;
                this.f20830C[i2] = false;
                this.f20853s.valueAt(i2).m7520f();
                ul2VarArr[i] = null;
            }
        }
        boolean z = false;
        for (int i3 = 0; i3 < rm2VarArr.length; i3++) {
            if (ul2VarArr[i3] == null && (rm2Var = rm2VarArr[i3]) != null) {
                C2622l.m5322V2(rm2Var.f18959c.length == 1);
                C2622l.m5322V2(rm2Var.f18959c[0] == 0);
                int iM8043a = this.f20828A.m8043a(rm2Var.f18957a);
                C2622l.m5322V2(!this.f20830C[iM8043a]);
                this.f20860z++;
                this.f20830C[iM8043a] = true;
                ul2VarArr[i3] = new ul2(this, iM8043a);
                zArr2[i3] = true;
                z = true;
            }
        }
        if (!this.f20858x) {
            int size = this.f20853s.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (!this.f20830C[i4]) {
                    this.f20853s.valueAt(i4).m7520f();
                }
            }
        }
        if (this.f20860z == 0) {
            this.f20859y = false;
            if (this.f20847m.m8513a()) {
                this.f20847m.f20382b.m8301b(false);
            }
        } else if (!this.f20858x ? j2 != 0 : z) {
            j2 = mo6208e(j2);
            for (int i5 = 0; i5 < ul2VarArr.length; i5++) {
                if (ul2VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
            }
        }
        this.f20858x = true;
        return j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: d */
    public final void mo6207d() throws IOException {
        this.f20847m.m8514b(Integer.MIN_VALUE);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: e */
    public final long mo6208e(long j2) {
        if (true != this.f20855u.zza()) {
            j2 = 0;
        }
        this.f20834G = j2;
        int size = this.f20853s.size();
        boolean zM8569n = true ^ m8569n();
        int i = 0;
        while (zM8569n) {
            if (i >= size) {
                this.f20859y = false;
                return j2;
            }
            if (this.f20830C[i]) {
                zM8569n = this.f20853s.valueAt(i).m7523i(j2, false);
            }
            i++;
        }
        this.f20835H = j2;
        this.f20837J = false;
        if (this.f20847m.m8513a()) {
            this.f20847m.f20382b.m8301b(false);
        } else {
            for (int i2 = 0; i2 < size; i2++) {
                this.f20853s.valueAt(i2).m7519e(this.f20830C[i2]);
            }
        }
        this.f20859y = false;
        return j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: f */
    public final om2 mo6209f() {
        return this.f20828A;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: g */
    public final void mo6210g(yl2 yl2Var, long j2) {
        this.f20854t = yl2Var;
        this.f20849o.m8743a();
        m8566j();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: h */
    public final long mo6211h() {
        long jM8568m;
        if (this.f20837J) {
            return Long.MIN_VALUE;
        }
        if (m8569n()) {
            return this.f20835H;
        }
        if (this.f20832E) {
            int size = this.f20853s.size();
            jM8568m = Long.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                if (this.f20831D[i]) {
                    jM8568m = Math.min(jM8568m, this.f20853s.valueAt(i).m7522h());
                }
            }
        } else {
            jM8568m = m8568m();
        }
        return jM8568m == Long.MIN_VALUE ? this.f20834G : jM8568m;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: i */
    public final long mo6212i() {
        if (!this.f20859y) {
            return -9223372036854775807L;
        }
        this.f20859y = false;
        return this.f20834G;
    }

    /* JADX INFO: renamed from: j */
    public final void m8566j() {
        jj2 jj2Var;
        sl2 sl2Var = new sl2(this, this.f20840f, this.f20841g, this.f20848n, this.f20849o);
        if (this.f20857w) {
            C2622l.m5322V2(m8569n());
            long j2 = this.f20829B;
            if (j2 != -9223372036854775807L && this.f20835H >= j2) {
                this.f20837J = true;
                this.f20835H = -9223372036854775807L;
                return;
            }
            long jMo5819e = this.f20855u.mo5819e(this.f20835H);
            long j3 = this.f20835H;
            sl2Var.f19610e.f14598a = jMo5819e;
            sl2Var.f19613h = j3;
            sl2Var.f19612g = true;
            this.f20835H = -9223372036854775807L;
        }
        this.f20836I = m8567l();
        int i = this.f20842h;
        int i2 = 6;
        if (i != -1) {
            i2 = i;
        } else if (!this.f20857w || this.f20833F != -1 || ((jj2Var = this.f20855u) != null && jj2Var.mo5818a() != -9223372036854775807L)) {
            i2 = 3;
        }
        un2 un2Var = this.f20847m;
        Objects.requireNonNull(un2Var);
        Looper looperMyLooper = Looper.myLooper();
        C2622l.m5322V2(looperMyLooper != null);
        new rn2(un2Var, looperMyLooper, sl2Var, this, i2, SystemClock.elapsedRealtime()).m8300a(0L);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2
    /* JADX INFO: renamed from: k */
    public final void mo6213k(long j2) {
    }

    /* JADX INFO: renamed from: l */
    public final int m8567l() {
        int size = this.f20853s.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            im2 im2Var = this.f20853s.valueAt(i2).f15982a;
            i += im2Var.f15311j + im2Var.f15310i;
        }
        return i;
    }

    /* JADX INFO: renamed from: m */
    public final long m8568m() {
        int size = this.f20853s.size();
        long jMax = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, this.f20853s.valueAt(i).m7522h());
        }
        return jMax;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m8569n() {
        return this.f20835H != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: o */
    public final lj2 m8570o(int i, int i2) {
        km2 km2Var = this.f20853s.get(i);
        if (km2Var != null) {
            return km2Var;
        }
        km2 km2Var2 = new km2(this.f20839L, null);
        km2Var2.f15991j = this;
        this.f20853s.put(i, km2Var2);
        return km2Var2;
    }

    /* JADX INFO: renamed from: p */
    public final void m8571p() {
        this.f20856v = true;
        this.f20852r.post(this.f20850p);
    }

    /* JADX INFO: renamed from: q */
    public final void m8572q(jj2 jj2Var) {
        this.f20855u = jj2Var;
        this.f20852r.post(this.f20850p);
    }

    /* JADX INFO: renamed from: r */
    public final /* bridge */ /* synthetic */ void m8573r(sn2 sn2Var, long j2, long j3, boolean z) {
        m8565b((sl2) sn2Var);
        if (z || this.f20860z <= 0) {
            return;
        }
        int size = this.f20853s.size();
        for (int i = 0; i < size; i++) {
            this.f20853s.valueAt(i).m7519e(this.f20830C[i]);
        }
        this.f20854t.mo5792b(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl2, p007c.p190n.p194b.p266d.p314j.p315a.lm2
    public final long zza() {
        if (this.f20860z == 0) {
            return Long.MIN_VALUE;
        }
        return mo6211h();
    }
}
