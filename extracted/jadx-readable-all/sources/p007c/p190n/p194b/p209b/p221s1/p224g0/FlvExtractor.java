package p007c.p190n.p194b.p209b.p221s1.p224g0;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.IndexSeekMap;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.g0.c, reason: use source file name */
/* JADX INFO: compiled from: FlvExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class FlvExtractor implements Extractor {

    /* JADX INFO: renamed from: f */
    public ExtractorOutput f7632f;

    /* JADX INFO: renamed from: h */
    public boolean f7634h;

    /* JADX INFO: renamed from: i */
    public long f7635i;

    /* JADX INFO: renamed from: j */
    public int f7636j;

    /* JADX INFO: renamed from: k */
    public int f7637k;

    /* JADX INFO: renamed from: l */
    public int f7638l;

    /* JADX INFO: renamed from: m */
    public long f7639m;

    /* JADX INFO: renamed from: n */
    public boolean f7640n;

    /* JADX INFO: renamed from: o */
    public AudioTagPayloadReader f7641o;

    /* JADX INFO: renamed from: p */
    public VideoTagPayloadReader f7642p;

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray f7627a = new ParsableByteArray(4);

    /* JADX INFO: renamed from: b */
    public final ParsableByteArray f7628b = new ParsableByteArray(9);

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f7629c = new ParsableByteArray(11);

    /* JADX INFO: renamed from: d */
    public final ParsableByteArray f7630d = new ParsableByteArray();

    /* JADX INFO: renamed from: e */
    public final ScriptTagPayloadReader f7631e = new ScriptTagPayloadReader();

    /* JADX INFO: renamed from: g */
    public int f7633g = 1;

    static {
        C1709a c1709a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.g0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new FlvExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public final ParsableByteArray m3764a(ExtractorInput extractorInput) throws IOException {
        int i = this.f7638l;
        ParsableByteArray parsableByteArray = this.f7630d;
        byte[] bArr = parsableByteArray.f6392a;
        if (i > bArr.length) {
            parsableByteArray.f6392a = new byte[Math.max(bArr.length * 2, i)];
            parsableByteArray.f6394c = 0;
            parsableByteArray.f6393b = 0;
        } else {
            parsableByteArray.m3194D(0);
        }
        this.f7630d.m3193C(this.f7638l);
        extractorInput.readFully(this.f7630d.f6392a, 0, this.f7638l);
        return this.f7630d;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        extractorInput.mo3739o(this.f7627a.f6392a, 0, 3);
        this.f7627a.m3194D(0);
        if (this.f7627a.m3216u() != 4607062) {
            return false;
        }
        extractorInput.mo3739o(this.f7627a.f6392a, 0, 2);
        this.f7627a.m3194D(0);
        if ((this.f7627a.m3219x() & 250) != 0) {
            return false;
        }
        extractorInput.mo3739o(this.f7627a.f6392a, 0, 4);
        this.f7627a.m3194D(0);
        int iM3201f = this.f7627a.m3201f();
        extractorInput.mo3736k();
        extractorInput.mo3733f(iM3201f);
        extractorInput.mo3739o(this.f7627a.f6392a, 0, 4);
        this.f7627a.m3194D(0);
        return this.f7627a.m3201f() == 0;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0009 A[SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long j2;
        boolean zM3768a;
        boolean z;
        long j3;
        C2096e.m4572h(this.f7632f);
        while (true) {
            int i = this.f7633g;
            boolean z2 = false;
            if (i == 1) {
                if (extractorInput.mo3730b(this.f7628b.f6392a, 0, 9, true)) {
                    this.f7628b.m3194D(0);
                    this.f7628b.m3195E(4);
                    int iM3214s = this.f7628b.m3214s();
                    boolean z3 = (iM3214s & 4) != 0;
                    z2 = (iM3214s & 1) != 0;
                    if (z3 && this.f7641o == null) {
                        this.f7641o = new AudioTagPayloadReader(this.f7632f.mo3774o(8, 1));
                    }
                    if (z2 && this.f7642p == null) {
                        this.f7642p = new VideoTagPayloadReader(this.f7632f.mo3774o(9, 2));
                    }
                    this.f7632f.mo3773j();
                    this.f7636j = (this.f7628b.m3201f() - 9) + 4;
                    this.f7633g = 2;
                    z2 = true;
                }
                if (!z2) {
                    return -1;
                }
            } else if (i == 2) {
                extractorInput.mo3737l(this.f7636j);
                this.f7636j = 0;
                this.f7633g = 3;
            } else if (i == 3) {
                if (extractorInput.mo3730b(this.f7629c.f6392a, 0, 11, true)) {
                    this.f7629c.m3194D(0);
                    this.f7637k = this.f7629c.m3214s();
                    this.f7638l = this.f7629c.m3216u();
                    this.f7639m = this.f7629c.m3216u();
                    this.f7639m = (((long) (this.f7629c.m3214s() << 24)) | this.f7639m) * 1000;
                    this.f7629c.m3195E(3);
                    this.f7633g = 4;
                    z2 = true;
                }
                if (!z2) {
                    return -1;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                if (this.f7634h) {
                    j2 = this.f7635i + this.f7639m;
                } else {
                    j2 = this.f7631e.f7643b == -9223372036854775807L ? 0L : this.f7639m;
                }
                int i2 = this.f7637k;
                if (i2 == 8 && this.f7641o != null) {
                    if (!this.f7640n) {
                        this.f7632f.mo3772a(new SeekMap.b(-9223372036854775807L));
                        this.f7640n = true;
                    }
                    zM3768a = this.f7641o.m3768a(m3764a(extractorInput), j2);
                } else if (i2 != 9 || this.f7642p == null) {
                    if (i2 != 18 || this.f7640n) {
                        extractorInput.mo3737l(this.f7638l);
                        zM3768a = false;
                        z = false;
                    } else {
                        zM3768a = this.f7631e.m3768a(m3764a(extractorInput), j2);
                        ScriptTagPayloadReader scriptTagPayloadReader = this.f7631e;
                        long j4 = scriptTagPayloadReader.f7643b;
                        if (j4 != -9223372036854775807L) {
                            this.f7632f.mo3772a(new IndexSeekMap(scriptTagPayloadReader.f7645d, scriptTagPayloadReader.f7644c, j4));
                            this.f7640n = true;
                        }
                    }
                    if (!this.f7634h && zM3768a) {
                        this.f7634h = true;
                        if (this.f7631e.f7643b == -9223372036854775807L) {
                            j3 = -this.f7639m;
                        } else {
                            j3 = 0;
                        }
                        this.f7635i = j3;
                    }
                    this.f7636j = 4;
                    this.f7633g = 2;
                    if (z) {
                        return 0;
                    }
                } else {
                    if (!this.f7640n) {
                        this.f7632f.mo3772a(new SeekMap.b(-9223372036854775807L));
                        this.f7640n = true;
                    }
                    zM3768a = this.f7642p.m3768a(m3764a(extractorInput), j2);
                }
                z = true;
                if (!this.f7634h) {
                    this.f7634h = true;
                    if (this.f7631e.f7643b == -9223372036854775807L) {
                        j3 = -this.f7639m;
                    } else {
                        j3 = 0;
                    }
                    this.f7635i = j3;
                }
                this.f7636j = 4;
                this.f7633g = 2;
                if (z) {
                    return 0;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f7632f = extractorOutput;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        if (j2 == 0) {
            this.f7633g = 1;
            this.f7634h = false;
        } else {
            this.f7633g = 3;
        }
        this.f7636j = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }
}
