package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fu2 extends g82<fu2, eu2> implements m92 {
    private static final l82<Integer, vs2> zzj = new du2();
    private static final fu2 zzr;
    private int zzb;
    private long zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private k82 zzi = h82.f14787g;
    private au2 zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;

    static {
        fu2 fu2Var = new fu2();
        zzr = fu2Var;
        g82.m6957t(fu2.class, fu2Var);
    }

    /* JADX INFO: renamed from: K */
    public static fu2 m6862K(byte[] bArr) throws r82 {
        g82 g82VarM6954m = g82.m6954m(zzr, bArr, 0, bArr.length, s72.m8347a());
        g82.m6950i(g82VarM6954m);
        return (fu2) g82VarM6954m;
    }

    /* JADX INFO: renamed from: L */
    public static eu2 m6863L() {
        return zzr.m6963o();
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m6865N(fu2 fu2Var, long j2) {
        fu2Var.zzb |= 1;
        fu2Var.zze = j2;
    }

    /* JADX INFO: renamed from: O */
    public static void m6866O(fu2 fu2Var, lt2 lt2Var) {
        fu2Var.zzf = lt2Var.f16508j;
        fu2Var.zzb |= 2;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m6867P(fu2 fu2Var, long j2) {
        fu2Var.zzb |= 4;
        fu2Var.zzg = j2;
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m6868Q(fu2 fu2Var, long j2) {
        fu2Var.zzb |= 8;
        fu2Var.zzh = j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public static void m6869R(fu2 fu2Var, Iterable iterable) {
        k82 k82Var = fu2Var.zzi;
        if (!((u62) k82Var).f20226f) {
            fu2Var.zzi = g82.m6952k(k82Var);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            vs2 vs2Var = (vs2) it.next();
            ((h82) fu2Var.zzi).m7102j(vs2Var.f20938r);
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m6870S(fu2 fu2Var, au2 au2Var) {
        au2Var.getClass();
        fu2Var.zzk = au2Var;
        fu2Var.zzb |= 16;
    }

    /* JADX INFO: renamed from: T */
    public static void m6871T(fu2 fu2Var, lt2 lt2Var) {
        fu2Var.zzl = lt2Var.f16508j;
        fu2Var.zzb |= 32;
    }

    /* JADX INFO: renamed from: U */
    public static void m6872U(fu2 fu2Var, lt2 lt2Var) {
        fu2Var.zzm = lt2Var.f16508j;
        fu2Var.zzb |= 64;
    }

    /* JADX INFO: renamed from: V */
    public static void m6873V(fu2 fu2Var, lt2 lt2Var) {
        fu2Var.zzn = lt2Var.f16508j;
        fu2Var.zzb |= 128;
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m6874W(fu2 fu2Var, int i) {
        fu2Var.zzb |= 256;
        fu2Var.zzo = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m6875v(fu2 fu2Var, lt2 lt2Var) {
        fu2Var.zzp = lt2Var.f16508j;
        fu2Var.zzb |= 512;
    }

    /* JADX INFO: renamed from: x */
    public static void m6876x(fu2 fu2Var, iu2 iu2Var) {
        fu2Var.zzq = iu2Var.f15399m;
        fu2Var.zzb |= 1024;
    }

    /* JADX INFO: renamed from: A */
    public final long m6877A() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: B */
    public final long m6878B() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: C */
    public final List<vs2> m6879C() {
        return new m82(this.zzi, zzj);
    }

    /* JADX INFO: renamed from: D */
    public final au2 m6880D() {
        au2 au2Var = this.zzk;
        return au2Var == null ? au2.m5853B() : au2Var;
    }

    /* JADX INFO: renamed from: E */
    public final lt2 m6881E() {
        lt2 lt2VarM7617f = lt2.m7617f(this.zzl);
        return lt2VarM7617f == null ? lt2.ENUM_FALSE : lt2VarM7617f;
    }

    /* JADX INFO: renamed from: F */
    public final lt2 m6882F() {
        lt2 lt2VarM7617f = lt2.m7617f(this.zzm);
        return lt2VarM7617f == null ? lt2.ENUM_FALSE : lt2VarM7617f;
    }

    /* JADX INFO: renamed from: G */
    public final lt2 m6883G() {
        lt2 lt2VarM7617f = lt2.m7617f(this.zzn);
        return lt2VarM7617f == null ? lt2.ENUM_FALSE : lt2VarM7617f;
    }

    /* JADX INFO: renamed from: H */
    public final int m6884H() {
        return this.zzo;
    }

    /* JADX INFO: renamed from: I */
    public final lt2 m6885I() {
        lt2 lt2VarM7617f = lt2.m7617f(this.zzp);
        return lt2VarM7617f == null ? lt2.ENUM_FALSE : lt2VarM7617f;
    }

    /* JADX INFO: renamed from: J */
    public final iu2 m6886J() {
        iu2 iu2VarM7304f = iu2.m7304f(this.zzq);
        return iu2VarM7304f == null ? iu2.UNSPECIFIED : iu2VarM7304f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            j82 j82Var = kt2.f16038a;
            return new u92(zzr, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzb", "zze", "zzf", j82Var, "zzg", "zzh", "zzi", us2.f20426a, "zzk", "zzl", j82Var, "zzm", j82Var, "zzn", j82Var, "zzo", "zzp", j82Var, "zzq", hu2.f15021a});
        }
        if (i2 == 3) {
            return new fu2();
        }
        es2 es2Var = null;
        if (i2 == 4) {
            return new eu2(es2Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzr;
    }

    /* JADX INFO: renamed from: y */
    public final long m6887y() {
        return this.zze;
    }

    /* JADX INFO: renamed from: z */
    public final lt2 m6888z() {
        lt2 lt2VarM7617f = lt2.m7617f(this.zzf);
        return lt2VarM7617f == null ? lt2.ENUM_FALSE : lt2VarM7617f;
    }
}
