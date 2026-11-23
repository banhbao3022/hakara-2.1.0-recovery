package p007c.p190n.p194b.p209b.p221s1.p231n0;

import java.io.IOException;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.f0, reason: use source file name */
/* JADX INFO: compiled from: TsBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class TsBinarySearchSeeker extends BinarySearchSeeker {

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.f0$a */
    /* JADX INFO: compiled from: TsBinarySearchSeeker.java */
    public static final class a implements BinarySearchSeeker.f {

        /* JADX INFO: renamed from: a */
        public final TimestampAdjuster f8135a;

        /* JADX INFO: renamed from: b */
        public final ParsableByteArray f8136b = new ParsableByteArray();

        /* JADX INFO: renamed from: c */
        public final int f8137c;

        /* JADX INFO: renamed from: d */
        public final int f8138d;

        public a(int i, TimestampAdjuster timestampAdjuster, int i2) {
            this.f8137c = i;
            this.f8135a = timestampAdjuster;
            this.f8138d = i2;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.f
        /* JADX INFO: renamed from: a */
        public void mo3724a() {
            this.f8136b.m3191A(Util6.f6312f);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.f
        /* JADX INFO: renamed from: b */
        public BinarySearchSeeker.e mo3725b(ExtractorInput extractorInput, long j2) throws IOException {
            long jMo3740p = extractorInput.mo3740p();
            int iMin = (int) Math.min(this.f8138d, extractorInput.mo3729a() - jMo3740p);
            this.f8136b.m3221z(iMin);
            extractorInput.mo3739o(this.f8136b.f6392a, 0, iMin);
            ParsableByteArray parsableByteArray = this.f8136b;
            int i = parsableByteArray.f6394c;
            long j3 = -1;
            long j4 = -1;
            long j5 = -9223372036854775807L;
            while (parsableByteArray.m3196a() >= 188) {
                byte[] bArr = parsableByteArray.f6392a;
                int i2 = parsableByteArray.f6393b;
                while (i2 < i && bArr[i2] != 71) {
                    i2++;
                }
                int i3 = i2 + 188;
                if (i3 > i) {
                    break;
                }
                long jM2374A = C1095a.m2374A(parsableByteArray, i2, this.f8137c);
                if (jM2374A != -9223372036854775807L) {
                    long jM3085b = this.f8135a.m3085b(jM2374A);
                    if (jM3085b > j2) {
                        return j5 == -9223372036854775807L ? BinarySearchSeeker.e.m3721a(jM3085b, jMo3740p) : BinarySearchSeeker.e.m3722b(jMo3740p + j4);
                    }
                    if (100000 + jM3085b > j2) {
                        return BinarySearchSeeker.e.m3722b(jMo3740p + ((long) i2));
                    }
                    j5 = jM3085b;
                    j4 = i2;
                }
                parsableByteArray.m3194D(i3);
                j3 = i3;
            }
            return j5 != -9223372036854775807L ? BinarySearchSeeker.e.m3723c(j5, jMo3740p + j3) : BinarySearchSeeker.e.f7545a;
        }
    }

    public TsBinarySearchSeeker(TimestampAdjuster timestampAdjuster, long j2, long j3, int i, int i2) {
        super(new BinarySearchSeeker.b(), new a(i, timestampAdjuster, i2), j2, 0L, j2 + 1, 0L, j3, 188L, 940);
    }
}
