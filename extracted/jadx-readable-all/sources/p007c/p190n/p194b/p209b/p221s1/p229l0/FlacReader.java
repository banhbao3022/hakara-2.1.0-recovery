package p007c.p190n.p194b.p209b.p221s1.p229l0;

import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.FlacFrameReader;
import p007c.p190n.p194b.p209b.p221s1.FlacSeekTableSeekMap;
import p007c.p190n.p194b.p209b.p221s1.FlacStreamMetadata;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.c, reason: use source file name */
/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class FlacReader extends StreamReader {

    /* JADX INFO: renamed from: n */
    public FlacStreamMetadata f8034n;

    /* JADX INFO: renamed from: o */
    public a f8035o;

    /* JADX INFO: renamed from: c.n.b.b.s1.l0.c$a */
    /* JADX INFO: compiled from: FlacReader.java */
    public static final class a implements OggSeeker {

        /* JADX INFO: renamed from: a */
        public FlacStreamMetadata f8036a;

        /* JADX INFO: renamed from: b */
        public FlacStreamMetadata.a f8037b;

        /* JADX INFO: renamed from: c */
        public long f8038c = -1;

        /* JADX INFO: renamed from: d */
        public long f8039d = -1;

        public a(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.a aVar) {
            this.f8036a = flacStreamMetadata;
            this.f8037b = aVar;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
        /* JADX INFO: renamed from: a */
        public SeekMap mo3844a() {
            C2096e.m4570f(this.f8038c != -1);
            return new FlacSeekTableSeekMap(this.f8036a, this.f8038c);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
        /* JADX INFO: renamed from: b */
        public long mo3845b(ExtractorInput extractorInput) {
            long j2 = this.f8039d;
            if (j2 < 0) {
                return -1L;
            }
            long j3 = -(j2 + 2);
            this.f8039d = -1L;
            return j3;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
        /* JADX INFO: renamed from: c */
        public void mo3846c(long j2) {
            long[] jArr = this.f8037b.f8508a;
            this.f8039d = jArr[Util6.m3118f(jArr, j2, true, true)];
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    /* JADX INFO: renamed from: c */
    public long mo3847c(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f6392a;
        if (!(bArr[0] == -1)) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            parsableByteArray.m3195E(4);
            parsableByteArray.m3220y();
        }
        int iM3860c = FlacFrameReader.m3860c(parsableByteArray, i);
        parsableByteArray.m3194D(0);
        return iM3860c;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: d */
    public boolean mo3848d(ParsableByteArray parsableByteArray, long j2, StreamReader.b bVar) {
        byte[] bArr = parsableByteArray.f6392a;
        FlacStreamMetadata flacStreamMetadata = this.f8034n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.f8034n = flacStreamMetadata2;
            bVar.f8071a = flacStreamMetadata2.m3920e(Arrays.copyOfRange(bArr, 9, parsableByteArray.f6394c), null);
            return true;
        }
        if ((bArr[0] & 127) == 3) {
            FlacStreamMetadata.a aVarM2375B = C1095a.m2375B(parsableByteArray);
            FlacStreamMetadata flacStreamMetadataM3918b = flacStreamMetadata.m3918b(aVarM2375B);
            this.f8034n = flacStreamMetadataM3918b;
            this.f8035o = new a(flacStreamMetadataM3918b, aVarM2375B);
            return true;
        }
        if (!(bArr[0] == -1)) {
            return true;
        }
        a aVar = this.f8035o;
        if (aVar != null) {
            aVar.f8038c = j2;
            bVar.f8072b = aVar;
        }
        Objects.requireNonNull(bVar.f8071a);
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.StreamReader
    /* JADX INFO: renamed from: e */
    public void mo3849e(boolean z) {
        super.mo3849e(z);
        if (z) {
            this.f8034n = null;
            this.f8035o = null;
        }
    }
}
