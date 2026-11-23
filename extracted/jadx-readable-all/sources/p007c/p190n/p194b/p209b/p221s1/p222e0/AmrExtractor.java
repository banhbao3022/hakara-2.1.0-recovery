package p007c.p190n.p194b.p209b.p221s1.p222e0;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ConstantBitrateSeekMap;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory;
import p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.e0.b, reason: use source file name */
/* JADX INFO: compiled from: AmrExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public final class AmrExtractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public static final int[] f7578a;

    /* JADX INFO: renamed from: b */
    public static final int[] f7579b;

    /* JADX INFO: renamed from: c */
    public static final byte[] f7580c;

    /* JADX INFO: renamed from: d */
    public static final byte[] f7581d;

    /* JADX INFO: renamed from: e */
    public static final int f7582e;

    /* JADX INFO: renamed from: f */
    public final byte[] f7583f;

    /* JADX INFO: renamed from: g */
    public final int f7584g;

    /* JADX INFO: renamed from: h */
    public boolean f7585h;

    /* JADX INFO: renamed from: i */
    public long f7586i;

    /* JADX INFO: renamed from: j */
    public int f7587j;

    /* JADX INFO: renamed from: k */
    public int f7588k;

    /* JADX INFO: renamed from: l */
    public boolean f7589l;

    /* JADX INFO: renamed from: m */
    public long f7590m;

    /* JADX INFO: renamed from: n */
    public int f7591n;

    /* JADX INFO: renamed from: o */
    public int f7592o;

    /* JADX INFO: renamed from: p */
    public long f7593p;

    /* JADX INFO: renamed from: q */
    public ExtractorOutput f7594q;

    /* JADX INFO: renamed from: r */
    public TrackOutput2 f7595r;

    /* JADX INFO: renamed from: s */
    public SeekMap f7596s;

    /* JADX INFO: renamed from: t */
    public boolean f7597t;

    static {
        C1701a c1701a = new ExtractorsFactory2() { // from class: c.n.b.b.s1.e0.a
            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: a */
            public final Extractor[] mo3745a() {
                return new Extractor[]{new AmrExtractor()};
            }

            @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorsFactory2
            /* JADX INFO: renamed from: b */
            public /* synthetic */ Extractor[] mo3746b(Uri uri, Map map) {
                return ExtractorsFactory.m3807a(this, uri, map);
            }
        };
        f7578a = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f7579b = iArr;
        f7580c = Util6.m3093B("#!AMR\n");
        f7581d = Util6.m3093B("#!AMR-WB\n");
        f7582e = iArr[8];
    }

    public AmrExtractor() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003b  */
    /* JADX INFO: renamed from: a */
    public final int m3747a(ExtractorInput extractorInput) throws IOException {
        extractorInput.mo3736k();
        boolean z = false;
        extractorInput.mo3739o(this.f7583f, 0, 1);
        byte b = this.f7583f[0];
        if ((b & 131) > 0) {
            throw new ParserException(outline.m1590l("Invalid padding bits for frame header ", b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15) {
            boolean z2 = this.f7585h;
            if (z2 && (i < 10 || i > 13)) {
                z = true;
            } else {
                if (!z2 && (i < 12 || i > 14)) {
                    z = true;
                }
            }
        }
        if (z) {
            return this.f7585h ? f7579b[i] : f7578a[i];
        }
        StringBuilder sbM1556G = outline.m1556G("Illegal AMR ");
        sbM1556G.append(this.f7585h ? "WB" : "NB");
        sbM1556G.append(" frame type ");
        sbM1556G.append(i);
        throw new ParserException(sbM1556G.toString());
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3748b(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = f7580c;
        extractorInput.mo3736k();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.mo3739o(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f7585h = false;
            extractorInput.mo3737l(bArr.length);
            return true;
        }
        byte[] bArr3 = f7581d;
        extractorInput.mo3736k();
        byte[] bArr4 = new byte[bArr3.length];
        extractorInput.mo3739o(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f7585h = true;
        extractorInput.mo3737l(bArr3.length);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        return m3748b(extractorInput);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i;
        int i2;
        int iMo3757b;
        int i3;
        C2096e.m4572h(this.f7595r);
        if (extractorInput.mo3740p() == 0 && !m3748b(extractorInput)) {
            throw new ParserException("Could not find AMR header.");
        }
        if (!this.f7597t) {
            this.f7597t = true;
            boolean z = this.f7585h;
            String str = z ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z ? 16000 : 8000;
            TrackOutput2 trackOutput2 = this.f7595r;
            Format.b bVar = new Format.b();
            bVar.f6958k = str;
            bVar.f6959l = f7582e;
            bVar.f6971x = 1;
            bVar.f6972y = i4;
            trackOutput2.mo3760e(bVar.m3519a());
        }
        if (this.f7588k == 0) {
            try {
                int iM3747a = m3747a(extractorInput);
                this.f7587j = iM3747a;
                this.f7588k = iM3747a;
                if (this.f7591n == -1) {
                    this.f7590m = extractorInput.mo3740p();
                    this.f7591n = this.f7587j;
                }
                if (this.f7591n == this.f7587j) {
                    this.f7592o++;
                }
                iMo3757b = this.f7595r.mo3757b(extractorInput, this.f7588k, true);
                if (iMo3757b == -1) {
                    i = -1;
                } else {
                    i3 = this.f7588k - iMo3757b;
                    this.f7588k = i3;
                    i = 0;
                    if (i3 <= 0) {
                        this.f7595r.mo3759d(this.f7593p + this.f7586i, 1, this.f7587j, 0, null);
                        this.f7586i += 20000;
                    }
                }
            } catch (EOFException unused) {
            }
        } else {
            iMo3757b = this.f7595r.mo3757b(extractorInput, this.f7588k, true);
            if (iMo3757b == -1) {
                i = -1;
            } else {
                i3 = this.f7588k - iMo3757b;
                this.f7588k = i3;
                i = 0;
                if (i3 <= 0) {
                    this.f7595r.mo3759d(this.f7593p + this.f7586i, 1, this.f7587j, 0, null);
                    this.f7586i += 20000;
                }
            }
        }
        long jMo3729a = extractorInput.mo3729a();
        if (!this.f7589l) {
            if ((this.f7584g & 1) == 0 || jMo3729a == -1 || !((i2 = this.f7591n) == -1 || i2 == this.f7587j)) {
                SeekMap.b bVar2 = new SeekMap.b(-9223372036854775807L);
                this.f7596s = bVar2;
                this.f7594q.mo3772a(bVar2);
                this.f7589l = true;
            } else if (this.f7592o >= 20 || i == -1) {
                ConstantBitrateSeekMap constantBitrateSeekMap = new ConstantBitrateSeekMap(jMo3729a, this.f7590m, (int) ((((long) (i2 * 8)) * 1000000) / 20000), i2);
                this.f7596s = constantBitrateSeekMap;
                this.f7594q.mo3772a(constantBitrateSeekMap);
                this.f7589l = true;
            }
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        this.f7594q = extractorOutput;
        this.f7595r = extractorOutput.mo3774o(0, 1);
        extractorOutput.mo3773j();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        this.f7586i = 0L;
        this.f7587j = 0;
        this.f7588k = 0;
        if (j2 != 0) {
            SeekMap seekMap = this.f7596s;
            if (seekMap instanceof ConstantBitrateSeekMap) {
                ConstantBitrateSeekMap constantBitrateSeekMap = (ConstantBitrateSeekMap) seekMap;
                this.f7593p = ConstantBitrateSeekMap.m3727e(j2, constantBitrateSeekMap.f7558b, constantBitrateSeekMap.f7561e);
                return;
            }
        }
        this.f7593p = 0L;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public AmrExtractor(int i) {
        this.f7584g = i;
        this.f7583f = new byte[1];
        this.f7591n = -1;
    }
}
