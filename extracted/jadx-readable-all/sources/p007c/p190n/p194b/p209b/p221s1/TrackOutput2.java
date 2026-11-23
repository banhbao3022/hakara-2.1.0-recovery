package p007c.p190n.p194b.p209b.p221s1;

import java.io.IOException;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.s1.y, reason: use source file name */
/* JADX INFO: compiled from: TrackOutput.java */
/* JADX INFO: loaded from: classes.dex */
public interface TrackOutput2 {

    /* JADX INFO: renamed from: c.n.b.b.s1.y$a */
    /* JADX INFO: compiled from: TrackOutput.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f8527a;

        /* JADX INFO: renamed from: b */
        public final byte[] f8528b;

        /* JADX INFO: renamed from: c */
        public final int f8529c;

        /* JADX INFO: renamed from: d */
        public final int f8530d;

        public a(int i, byte[] bArr, int i2, int i3) {
            this.f8527a = i;
            this.f8528b = bArr;
            this.f8529c = i2;
            this.f8530d = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f8527a == aVar.f8527a && this.f8529c == aVar.f8529c && this.f8530d == aVar.f8530d && Arrays.equals(this.f8528b, aVar.f8528b);
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f8528b) + (this.f8527a * 31)) * 31) + this.f8529c) * 31) + this.f8530d;
        }
    }

    /* JADX INFO: renamed from: a */
    int mo3756a(DataReader dataReader, int i, boolean z, int i2) throws IOException;

    /* JADX INFO: renamed from: b */
    int mo3757b(DataReader dataReader, int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: c */
    void mo3758c(ParsableByteArray parsableByteArray, int i);

    /* JADX INFO: renamed from: d */
    void mo3759d(long j2, int i, int i2, int i3, a aVar);

    /* JADX INFO: renamed from: e */
    void mo3760e(Format format);

    /* JADX INFO: renamed from: f */
    void mo3761f(ParsableByteArray parsableByteArray, int i, int i2);
}
