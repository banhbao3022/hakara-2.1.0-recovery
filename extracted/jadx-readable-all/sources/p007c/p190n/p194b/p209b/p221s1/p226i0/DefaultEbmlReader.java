package p007c.p190n.p194b.p209b.p221s1.p226i0;

import java.io.IOException;
import java.util.ArrayDeque;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.i0.b, reason: use source file name */
/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultEbmlReader implements EbmlReader {

    /* JADX INFO: renamed from: a */
    public final byte[] f7677a = new byte[8];

    /* JADX INFO: renamed from: b */
    public final ArrayDeque<b> f7678b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c */
    public final VarintReader f7679c = new VarintReader();

    /* JADX INFO: renamed from: d */
    public EbmlProcessor f7680d;

    /* JADX INFO: renamed from: e */
    public int f7681e;

    /* JADX INFO: renamed from: f */
    public int f7682f;

    /* JADX INFO: renamed from: g */
    public long f7683g;

    /* JADX INFO: renamed from: c.n.b.b.s1.i0.b$b */
    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f7684a;

        /* JADX INFO: renamed from: b */
        public final long f7685b;

        public b(int i, long j2, a aVar) {
            this.f7684a = i;
            this.f7685b = j2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final long m3777a(ExtractorInput extractorInput, int i) throws IOException {
        extractorInput.readFully(this.f7677a, 0, i);
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 = (j2 << 8) | ((long) (this.f7677a[i2] & 255));
        }
        return j2;
    }
}
