package p007c.p190n.p194b.p209b;

import java.util.UUID;

/* JADX INFO: renamed from: c.n.b.b.c0, reason: use source file name */
/* JADX INFO: compiled from: C.java */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a */
    public static final UUID f6403a = new UUID(0, 0);

    /* JADX INFO: renamed from: b */
    public static final UUID f6404b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* JADX INFO: renamed from: c */
    public static final UUID f6405c = new UUID(-2129748144642739255L, 8654423357094679310L);

    /* JADX INFO: renamed from: d */
    public static final UUID f6406d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* JADX INFO: renamed from: e */
    public static final UUID f6407e = new UUID(-7348484286925749626L, -6083546864340672619L);

    /* JADX INFO: renamed from: a */
    public static String m3235a(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: b */
    public static long m3236b(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    /* JADX INFO: renamed from: c */
    public static long m3237c(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }
}
