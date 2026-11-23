package p007c.p190n.p194b.p209b.p221s1.p223f0;

import java.io.IOException;
import java.util.Objects;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker;
import p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker2;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.FlacFrameReader;
import p007c.p190n.p194b.p209b.p221s1.FlacStreamMetadata;

/* JADX INFO: renamed from: c.n.b.b.s1.f0.c, reason: use source file name */
/* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    /* JADX INFO: renamed from: c.n.b.b.s1.f0.c$b */
    /* JADX INFO: compiled from: FlacBinarySearchSeeker.java */
    public static final class b implements BinarySearchSeeker.f {

        /* JADX INFO: renamed from: a */
        public final FlacStreamMetadata f7604a;

        /* JADX INFO: renamed from: b */
        public final int f7605b;

        /* JADX INFO: renamed from: c */
        public final FlacFrameReader.a f7606c = new FlacFrameReader.a();

        public b(FlacStreamMetadata flacStreamMetadata, int i, a aVar) {
            this.f7604a = flacStreamMetadata;
            this.f7605b = i;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.f
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void mo3724a() {
            BinarySearchSeeker2.m3726a(this);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.f
        /* JADX INFO: renamed from: b */
        public BinarySearchSeeker.e mo3725b(ExtractorInput extractorInput, long j2) throws IOException {
            long jMo3740p = extractorInput.mo3740p();
            long jM3754c = m3754c(extractorInput);
            long jMo3732e = extractorInput.mo3732e();
            extractorInput.mo3733f(Math.max(6, this.f7604a.f8498c));
            long jM3754c2 = m3754c(extractorInput);
            long jMo3732e2 = extractorInput.mo3732e();
            if (jM3754c > j2 || jM3754c2 <= j2) {
                return jM3754c2 <= j2 ? BinarySearchSeeker.e.m3723c(jM3754c2, jMo3732e2) : BinarySearchSeeker.e.m3721a(jM3754c, jMo3740p);
            }
            return BinarySearchSeeker.e.m3722b(jMo3732e);
        }

        /* JADX INFO: renamed from: c */
        public final long m3754c(ExtractorInput extractorInput) throws IOException {
            while (extractorInput.mo3732e() < extractorInput.mo3729a() - 6) {
                FlacStreamMetadata flacStreamMetadata = this.f7604a;
                int i = this.f7605b;
                FlacFrameReader.a aVar = this.f7606c;
                long jMo3732e = extractorInput.mo3732e();
                byte[] bArr = new byte[2];
                boolean zM3859b = false;
                extractorInput.mo3739o(bArr, 0, 2);
                if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                    extractorInput.mo3736k();
                    extractorInput.mo3733f((int) (jMo3732e - extractorInput.mo3740p()));
                } else {
                    ParsableByteArray parsableByteArray = new ParsableByteArray(16);
                    System.arraycopy(bArr, 0, parsableByteArray.f6392a, 0, 2);
                    parsableByteArray.m3193C(C1095a.m2409y(extractorInput, parsableByteArray.f6392a, 2, 14));
                    extractorInput.mo3736k();
                    extractorInput.mo3733f((int) (jMo3732e - extractorInput.mo3740p()));
                    zM3859b = FlacFrameReader.m3859b(parsableByteArray, flacStreamMetadata, i, aVar);
                }
                if (zM3859b) {
                    break;
                }
                extractorInput.mo3733f(1);
            }
            if (extractorInput.mo3732e() < extractorInput.mo3729a() - 6) {
                return this.f7606c.f8082a;
            }
            extractorInput.mo3733f((int) (extractorInput.mo3729a() - extractorInput.mo3732e()));
            return this.f7604a.f8505j;
        }
    }

    public FlacBinarySearchSeeker(final FlacStreamMetadata flacStreamMetadata, int i, long j2, long j3) {
        long j4;
        long j5;
        Objects.requireNonNull(flacStreamMetadata);
        BinarySearchSeeker.d dVar = new BinarySearchSeeker.d() { // from class: c.n.b.b.s1.f0.b
            @Override // p007c.p190n.p194b.p209b.p221s1.BinarySearchSeeker.d
            /* JADX INFO: renamed from: a */
            public final long mo3719a(long j6) {
                return flacStreamMetadata.m3922g(j6);
            }
        };
        b bVar = new b(flacStreamMetadata, i, null);
        long jM3919d = flacStreamMetadata.m3919d();
        long j6 = flacStreamMetadata.f8505j;
        int i2 = flacStreamMetadata.f8499d;
        if (i2 > 0) {
            j4 = (((long) i2) + ((long) flacStreamMetadata.f8498c)) / 2;
            j5 = 1;
        } else {
            int i3 = flacStreamMetadata.f8496a;
            j4 = ((((i3 != flacStreamMetadata.f8497b || i3 <= 0) ? 4096L : i3) * ((long) flacStreamMetadata.f8502g)) * ((long) flacStreamMetadata.f8503h)) / 8;
            j5 = 64;
        }
        super(dVar, bVar, jM3919d, 0L, j6, j2, j3, j4 + j5, Math.max(6, flacStreamMetadata.f8498c));
    }
}
