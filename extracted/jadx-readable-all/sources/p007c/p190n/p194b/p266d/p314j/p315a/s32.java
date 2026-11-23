package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s32 extends g82<s32, p32> implements m92 {
    private static final s32 zzf;
    private int zzb;
    private o82<r32> zze = t92.f19797g;

    static {
        s32 s32Var = new s32();
        zzf = s32Var;
        g82.m6957t(s32.class, s32Var);
    }

    /* JADX INFO: renamed from: z */
    public static s32 m8342z(byte[] bArr, s72 s72Var) throws r82 {
        g82 g82VarM6954m = g82.m6954m(zzf, bArr, 0, bArr.length, s72Var);
        g82.m6950i(g82VarM6954m);
        return (s32) g82VarM6954m;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g82
    /* JADX INFO: renamed from: u */
    public final Object mo5663u(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new u92(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzb", "zze", r32.class});
        }
        if (i2 == 3) {
            return new s32();
        }
        o32 o32Var = null;
        if (i2 == 4) {
            return new p32(o32Var);
        }
        if (i2 != 5) {
            return null;
        }
        return zzf;
    }

    /* JADX INFO: renamed from: v */
    public final int m8343v() {
        return this.zzb;
    }

    /* JADX INFO: renamed from: x */
    public final List<r32> m8344x() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final int m8345y() {
        return this.zze.size();
    }
}
