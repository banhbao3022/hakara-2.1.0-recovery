package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wn2 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f21271a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final int[] f21272b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c */
    public static final int[] f21273c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: a */
    public static int m8661a(co2 co2Var) {
        int iM6217a = co2Var.m6217a(5);
        return iM6217a == 31 ? co2Var.m6217a(6) + 32 : iM6217a;
    }

    /* JADX INFO: renamed from: b */
    public static int m8662b(co2 co2Var) {
        int iM6217a = co2Var.m6217a(4);
        if (iM6217a == 15) {
            return co2Var.m6217a(24);
        }
        C2622l.m5366f1(iM6217a < 13);
        return f21272b[iM6217a];
    }
}
