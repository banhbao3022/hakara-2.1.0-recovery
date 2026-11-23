package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.sq */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3519sq implements hn2 {

    /* JADX INFO: renamed from: a */
    public final vn2<hn2> f19654a;

    /* JADX INFO: renamed from: b */
    public final Context f19655b;

    /* JADX INFO: renamed from: c */
    public final hn2 f19656c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3482rq f19657d;

    /* JADX INFO: renamed from: e */
    public final String f19658e;

    /* JADX INFO: renamed from: f */
    public final int f19659f;

    /* JADX INFO: renamed from: h */
    public InputStream f19661h;

    /* JADX INFO: renamed from: i */
    public boolean f19662i;

    /* JADX INFO: renamed from: j */
    public Uri f19663j;

    /* JADX INFO: renamed from: k */
    public volatile lr2 f19664k;

    /* JADX INFO: renamed from: l */
    public boolean f19665l = false;

    /* JADX INFO: renamed from: m */
    public boolean f19666m = false;

    /* JADX INFO: renamed from: n */
    public boolean f19667n = false;

    /* JADX INFO: renamed from: o */
    public boolean f19668o = false;

    /* JADX INFO: renamed from: p */
    public long f19669p = 0;

    /* JADX INFO: renamed from: r */
    public final AtomicLong f19671r = new AtomicLong(-1);

    /* JADX INFO: renamed from: q */
    public kv1<Long> f19670q = null;

    /* JADX INFO: renamed from: g */
    public final boolean f19660g = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue();

    public C3519sq(Context context, hn2 hn2Var, String str, int i, vn2<hn2> vn2Var, InterfaceC3482rq interfaceC3482rq) {
        this.f19655b = context;
        this.f19656c = hn2Var;
        this.f19654a = vn2Var;
        this.f19657d = interfaceC3482rq;
        this.f19658e = str;
        this.f19659f = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [c.n.b.d.j.a.io, c.n.b.d.j.a.pr2] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v30, types: [long] */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v4, types: [c.n.b.d.j.a.cr] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: a */
    public final long mo6843a(jn2 jn2Var) throws Throwable {
        ir2 ir2VarM7160b;
        vn2<hn2> vn2Var;
        boolean z;
        boolean z2;
        long jMo5621a;
        StringBuilder sb;
        vn2<hn2> vn2Var2;
        vn2<hn2> vn2Var3;
        jn2 jn2Var2 = jn2Var;
        if (this.f19662i) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        ?? r2 = 1;
        this.f19662i = true;
        this.f19663j = jn2Var2.f15667a;
        if (!this.f19660g && (vn2Var3 = this.f19654a) != null) {
            ((C3002er) vn2Var3).mo6225e(this, jn2Var2);
        }
        this.f19664k = lr2.m7611H(jn2Var2.f15667a);
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14369i2;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            if (this.f19664k != null) {
                this.f19664k.f16481m = jn2Var2.f15669c;
                this.f19664k.f16482n = C2622l.m5278L0(this.f19658e);
                this.f19664k.f16483o = this.f19659f;
                ir2VarM7160b = C2330u.f10884a.f10895j.m7160b(this.f19664k);
            } else {
                ir2VarM7160b = null;
            }
            if (ir2VarM7160b != null && ir2VarM7160b.zza()) {
                this.f19665l = ir2VarM7160b.m7294K();
                this.f19667n = ir2VarM7160b.m7297N();
                this.f19668o = ir2VarM7160b.m7295L();
                this.f19669p = ir2VarM7160b.m7296M();
                this.f19666m = true;
                if (!m8361f()) {
                    this.f19661h = ir2VarM7160b.m7293H();
                    if (!this.f19660g || (vn2Var = this.f19654a) == null) {
                        return -1L;
                    }
                    ((C3002er) vn2Var).mo6225e(this, jn2Var2);
                    return -1L;
                }
            }
        } else if (this.f19664k != null) {
            this.f19664k.f16481m = jn2Var2.f15669c;
            this.f19664k.f16482n = C2622l.m5278L0(this.f19658e);
            this.f19664k.f16483o = this.f19659f;
            ?? LongValue = (this.f19664k.f16480l ? (Long) c2862b.f12496d.m6596a(C3052g3.f14383k2) : (Long) c2862b.f12496d.m6596a(C3052g3.f14376j2)).longValue();
            C2330u c2330u = C2330u.f10884a;
            long jMo5621a2 = c2330u.f10896k.mo5621a();
            Context context = this.f19655b;
            lr2 lr2Var = this.f19664k;
            wr2 wr2Var = new wr2(context);
            ?? pr2Var = new pr2(wr2Var);
            ur2 ur2Var = new ur2(wr2Var, lr2Var, pr2Var);
            vr2 vr2Var = new vr2(wr2Var, pr2Var);
            synchronized (wr2Var.f21317d) {
                kr2 kr2Var = new kr2(context, c2330u.f10903r.m4786a(), ur2Var, vr2Var);
                wr2Var.f21314a = kr2Var;
                kr2Var.m5578o();
            }
            try {
                try {
                    yr2 yr2Var = (yr2) pr2Var.get(LongValue, TimeUnit.MILLISECONDS);
                    try {
                        this.f19665l = yr2Var.f21984b;
                        this.f19667n = yr2Var.f21985c;
                        this.f19668o = yr2Var.f21987e;
                        this.f19669p = yr2Var.f21986d;
                        if (!m8361f()) {
                            this.f19661h = yr2Var.f21983a;
                            if (this.f19660g && (vn2Var2 = this.f19654a) != null) {
                                ((C3002er) vn2Var2).mo6225e(this, jn2Var2);
                            }
                            long jMo5621a3 = c2330u.f10896k.mo5621a() - jMo5621a2;
                            ((C2928cr) this.f19657d).m6223a(true, jMo5621a3);
                            this.f19666m = true;
                            StringBuilder sb2 = new StringBuilder(44);
                            sb2.append("Cache connection took ");
                            sb2.append(jMo5621a3);
                            sb2.append("ms");
                            C2096e.m4590z(sb2.toString());
                            return -1L;
                        }
                        long jMo5621a4 = c2330u.f10896k.mo5621a() - jMo5621a2;
                        ((C2928cr) this.f19657d).m6223a(true, jMo5621a4);
                        this.f19666m = true;
                        sb = new StringBuilder(44);
                        sb.append("Cache connection took ");
                        sb.append(jMo5621a4);
                    } catch (InterruptedException unused) {
                        z2 = true;
                        pr2Var.cancel(true);
                        Thread.currentThread().interrupt();
                        jMo5621a = C2330u.f10884a.f10896k.mo5621a() - jMo5621a2;
                        ((C2928cr) this.f19657d).m6223a(z2, jMo5621a);
                        this.f19666m = z2;
                        sb = new StringBuilder(44);
                        LongValue = "Cache connection took ";
                        sb.append("Cache connection took ");
                        sb.append(jMo5621a);
                    } catch (ExecutionException | TimeoutException unused2) {
                        z = true;
                        pr2Var.cancel(true);
                        jMo5621a = C2330u.f10884a.f10896k.mo5621a() - jMo5621a2;
                        ((C2928cr) this.f19657d).m6223a(z, jMo5621a);
                        this.f19666m = z;
                        sb = new StringBuilder(44);
                        LongValue = "Cache connection took ";
                        sb.append("Cache connection took ");
                        sb.append(jMo5621a);
                    } catch (Throwable th) {
                        th = th;
                        long jMo5621a5 = C2330u.f10884a.f10896k.mo5621a() - jMo5621a2;
                        ((C2928cr) this.f19657d).m6223a(r2, jMo5621a5);
                        this.f19666m = r2;
                        StringBuilder sb3 = new StringBuilder(44);
                        sb3.append("Cache connection took ");
                        sb3.append(jMo5621a5);
                        sb3.append("ms");
                        C2096e.m4590z(sb3.toString());
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r2 = LongValue;
                }
            } catch (InterruptedException unused3) {
                z2 = false;
            } catch (ExecutionException | TimeoutException unused4) {
                z = false;
            } catch (Throwable th3) {
                th = th3;
                r2 = 0;
            }
            sb.append("ms");
            C2096e.m4590z(sb.toString());
        }
        this.f19666m = false;
        if (this.f19664k != null) {
            jn2Var2 = new jn2(Uri.parse(this.f19664k.f16474f), null, jn2Var2.f15668b, jn2Var2.f15669c, jn2Var2.f15670d, null, 0);
        }
        return this.f19656c.mo6843a(jn2Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: b */
    public final Uri mo6844b() {
        return this.f19663j;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: d */
    public final int mo6845d(byte[] bArr, int i, int i2) throws IOException {
        vn2<hn2> vn2Var;
        if (!this.f19662i) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f19661h;
        int iMo6845d = inputStream != null ? inputStream.read(bArr, i, i2) : this.f19656c.mo6845d(bArr, i, i2);
        if ((!this.f19660g || this.f19661h != null) && (vn2Var = this.f19654a) != null) {
            ((C3002er) vn2Var).m6667j(iMo6845d);
        }
        return iMo6845d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: e */
    public final void mo6846e() throws IOException {
        if (!this.f19662i) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f19662i = false;
        this.f19663j = null;
        InputStream inputStream = this.f19661h;
        if (inputStream == null) {
            this.f19656c.mo6846e();
        } else {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            this.f19661h = null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m8361f() {
        if (!this.f19660g) {
            return false;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14390l2;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() || this.f19667n) {
            return ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14397m2)).booleanValue() && !this.f19668o;
        }
        return true;
    }
}
