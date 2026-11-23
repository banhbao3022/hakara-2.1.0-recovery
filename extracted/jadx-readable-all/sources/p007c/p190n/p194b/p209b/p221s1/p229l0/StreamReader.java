package p007c.p190n.p194b.p209b.p221s1.p229l0;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.i, reason: use source file name */
/* JADX INFO: compiled from: StreamReader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class StreamReader {

    /* JADX INFO: renamed from: b */
    public TrackOutput2 f8059b;

    /* JADX INFO: renamed from: c */
    public ExtractorOutput f8060c;

    /* JADX INFO: renamed from: d */
    public OggSeeker f8061d;

    /* JADX INFO: renamed from: e */
    public long f8062e;

    /* JADX INFO: renamed from: f */
    public long f8063f;

    /* JADX INFO: renamed from: g */
    public long f8064g;

    /* JADX INFO: renamed from: h */
    public int f8065h;

    /* JADX INFO: renamed from: i */
    public int f8066i;

    /* JADX INFO: renamed from: k */
    public long f8068k;

    /* JADX INFO: renamed from: l */
    public boolean f8069l;

    /* JADX INFO: renamed from: m */
    public boolean f8070m;

    /* JADX INFO: renamed from: a */
    public final OggPacket f8058a = new OggPacket();

    /* JADX INFO: renamed from: j */
    public b f8067j = new b();

    /* JADX INFO: renamed from: c.n.b.b.s1.l0.i$b */
    /* JADX INFO: compiled from: StreamReader.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public Format f8071a;

        /* JADX INFO: renamed from: b */
        public OggSeeker f8072b;
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.l0.i$c */
    /* JADX INFO: compiled from: StreamReader.java */
    public static final class c implements OggSeeker {
        public c(a aVar) {
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
        /* JADX INFO: renamed from: a */
        public SeekMap mo3844a() {
            return new SeekMap.b(-9223372036854775807L);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
        /* JADX INFO: renamed from: b */
        public long mo3845b(ExtractorInput extractorInput) {
            return -1L;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
        /* JADX INFO: renamed from: c */
        public void mo3846c(long j2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public long m3856a(long j2) {
        return (((long) this.f8066i) * j2) / 1000000;
    }

    /* JADX INFO: renamed from: b */
    public void mo3857b(long j2) {
        this.f8064g = j2;
    }

    /* JADX INFO: renamed from: c */
    public abstract long mo3847c(ParsableByteArray parsableByteArray);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* JADX INFO: renamed from: d */
    public abstract boolean mo3848d(ParsableByteArray parsableByteArray, long j2, b bVar) throws IOException;

    /* JADX INFO: renamed from: e */
    public void mo3849e(boolean z) {
        if (z) {
            this.f8067j = new b();
            this.f8063f = 0L;
            this.f8065h = 0;
        } else {
            this.f8065h = 1;
        }
        this.f8062e = -1L;
        this.f8064g = 0L;
    }
}
