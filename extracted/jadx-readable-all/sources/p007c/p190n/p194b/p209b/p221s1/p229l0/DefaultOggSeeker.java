package p007c.p190n.p194b.p209b.p221s1.p229l0;

import java.io.EOFException;
import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.SeekPoint;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.l0.b, reason: use source file name */
/* JADX INFO: compiled from: DefaultOggSeeker.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultOggSeeker implements OggSeeker {

    /* JADX INFO: renamed from: a */
    public final OggPageHeader f8021a;

    /* JADX INFO: renamed from: b */
    public final long f8022b;

    /* JADX INFO: renamed from: c */
    public final long f8023c;

    /* JADX INFO: renamed from: d */
    public final StreamReader f8024d;

    /* JADX INFO: renamed from: e */
    public int f8025e;

    /* JADX INFO: renamed from: f */
    public long f8026f;

    /* JADX INFO: renamed from: g */
    public long f8027g;

    /* JADX INFO: renamed from: h */
    public long f8028h;

    /* JADX INFO: renamed from: i */
    public long f8029i;

    /* JADX INFO: renamed from: j */
    public long f8030j;

    /* JADX INFO: renamed from: k */
    public long f8031k;

    /* JADX INFO: renamed from: l */
    public long f8032l;

    /* JADX INFO: renamed from: c.n.b.b.s1.l0.b$b */
    /* JADX INFO: compiled from: DefaultOggSeeker.java */
    public final class b implements SeekMap {
        public b(a aVar) {
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: d */
        public boolean mo3716d() {
            return true;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: h */
        public SeekMap.a mo3717h(long j2) {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            long j3 = (((long) defaultOggSeeker.f8024d.f8066i) * j2) / 1000000;
            long j4 = defaultOggSeeker.f8022b;
            long j5 = defaultOggSeeker.f8023c;
            return new SeekMap.a(new SeekPoint(j2, Util6.m3122j(((((j5 - j4) * j3) / defaultOggSeeker.f8026f) + j4) - 30000, j4, j5 - 1)));
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
        /* JADX INFO: renamed from: i */
        public long mo3718i() {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            return (defaultOggSeeker.f8026f * 1000000) / ((long) defaultOggSeeker.f8024d.f8066i);
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j2, long j3, long j4, long j5, boolean z) {
        C2096e.m4566b(j2 >= 0 && j3 > j2);
        this.f8024d = streamReader;
        this.f8022b = j2;
        this.f8023c = j3;
        if (j4 == j3 - j2 || z) {
            this.f8026f = j5;
            this.f8025e = 4;
        } else {
            this.f8025e = 0;
        }
        this.f8021a = new OggPageHeader();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
    /* JADX INFO: renamed from: a */
    public SeekMap mo3844a() {
        if (this.f8026f != 0) {
            return new b(null);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
    /* JADX INFO: renamed from: b */
    public long mo3845b(ExtractorInput extractorInput) throws IOException {
        long jM3122j;
        long j2;
        int i = this.f8025e;
        if (i == 0) {
            long jMo3740p = extractorInput.mo3740p();
            this.f8027g = jMo3740p;
            this.f8025e = 1;
            long j3 = this.f8023c - 65307;
            if (j3 > jMo3740p) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f8029i == this.f8030j) {
                    jM3122j = -1;
                } else {
                    long jMo3740p2 = extractorInput.mo3740p();
                    if (this.f8021a.m3855c(extractorInput, this.f8030j)) {
                        this.f8021a.m3853a(extractorInput, false);
                        extractorInput.mo3736k();
                        long j4 = this.f8028h;
                        OggPageHeader oggPageHeader = this.f8021a;
                        long j5 = oggPageHeader.f8050c;
                        long j6 = j4 - j5;
                        int i2 = oggPageHeader.f8052e + oggPageHeader.f8053f;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.f8030j = jMo3740p2;
                                this.f8032l = j5;
                            } else {
                                this.f8029i = extractorInput.mo3740p() + ((long) i2);
                                this.f8031k = this.f8021a.f8050c;
                            }
                            long j7 = this.f8030j;
                            long j8 = this.f8029i;
                            if (j7 - j8 < 100000) {
                                this.f8030j = j8;
                                jM3122j = j8;
                            } else {
                                long jMo3740p3 = extractorInput.mo3740p() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.f8030j;
                                long j10 = this.f8029i;
                                jM3122j = Util6.m3122j((((j9 - j10) * j6) / (this.f8032l - this.f8031k)) + jMo3740p3, j10, j9 - 1);
                            }
                        } else {
                            jM3122j = -1;
                        }
                    } else {
                        jM3122j = this.f8029i;
                        if (jM3122j == jMo3740p2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j2 = -1;
                if (jM3122j != -1) {
                    return jM3122j;
                }
                this.f8025e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j2 = -1;
            }
            while (true) {
                this.f8021a.m3855c(extractorInput, j2);
                this.f8021a.m3853a(extractorInput, false);
                OggPageHeader oggPageHeader2 = this.f8021a;
                if (oggPageHeader2.f8050c > this.f8028h) {
                    extractorInput.mo3736k();
                    this.f8025e = 4;
                    return -(this.f8031k + 2);
                }
                extractorInput.mo3737l(oggPageHeader2.f8052e + oggPageHeader2.f8053f);
                this.f8029i = extractorInput.mo3740p();
                this.f8031k = this.f8021a.f8050c;
                j2 = -1;
            }
        }
        this.f8021a.m3854b();
        if (!this.f8021a.m3855c(extractorInput, -1L)) {
            throw new EOFException();
        }
        do {
            this.f8021a.m3853a(extractorInput, false);
            OggPageHeader oggPageHeader3 = this.f8021a;
            extractorInput.mo3737l(oggPageHeader3.f8052e + oggPageHeader3.f8053f);
            OggPageHeader oggPageHeader4 = this.f8021a;
            if ((oggPageHeader4.f8049b & 4) == 4 || !oggPageHeader4.m3855c(extractorInput, -1L)) {
                break;
            }
        } while (extractorInput.mo3740p() < this.f8023c);
        this.f8026f = this.f8021a.f8050c;
        this.f8025e = 4;
        return this.f8027g;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p229l0.OggSeeker
    /* JADX INFO: renamed from: c */
    public void mo3846c(long j2) {
        this.f8028h = Util6.m3122j(j2, 0L, this.f8026f - 1);
        this.f8025e = 2;
        this.f8029i = this.f8022b;
        this.f8030j = this.f8023c;
        this.f8031k = 0L;
        this.f8032l = this.f8026f;
    }
}
