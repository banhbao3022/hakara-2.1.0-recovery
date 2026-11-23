package p007c.p190n.p194b.p209b.p221s1.p228k0;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p215n1.Ac4Util;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p221s1.ChunkIndex;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.GaplessInfoHolder;
import p007c.p190n.p194b.p209b.p221s1.PositionHolder;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessage;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessageEncoder;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Function;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.g, reason: use source file name */
/* JADX INFO: compiled from: FragmentedMp4Extractor.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentedMp4Extractor implements Extractor {

    /* JADX INFO: renamed from: a */
    public static final byte[] f7887a = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: b */
    public static final Format f7888b;

    /* JADX INFO: renamed from: A */
    public long f7889A;

    /* JADX INFO: renamed from: B */
    public b f7890B;

    /* JADX INFO: renamed from: C */
    public int f7891C;

    /* JADX INFO: renamed from: D */
    public int f7892D;

    /* JADX INFO: renamed from: E */
    public int f7893E;

    /* JADX INFO: renamed from: F */
    public boolean f7894F;

    /* JADX INFO: renamed from: G */
    public ExtractorOutput f7895G;

    /* JADX INFO: renamed from: H */
    public TrackOutput2[] f7896H;

    /* JADX INFO: renamed from: I */
    public TrackOutput2[] f7897I;

    /* JADX INFO: renamed from: J */
    public boolean f7898J;

    /* JADX INFO: renamed from: c */
    public final int f7899c;

    /* JADX INFO: renamed from: d */
    public final Track f7900d;

    /* JADX INFO: renamed from: e */
    public final List<Format> f7901e;

    /* JADX INFO: renamed from: f */
    public final SparseArray<b> f7902f;

    /* JADX INFO: renamed from: g */
    public final ParsableByteArray f7903g;

    /* JADX INFO: renamed from: h */
    public final ParsableByteArray f7904h;

    /* JADX INFO: renamed from: i */
    public final ParsableByteArray f7905i;

    /* JADX INFO: renamed from: j */
    public final byte[] f7906j;

    /* JADX INFO: renamed from: k */
    public final ParsableByteArray f7907k;

    /* JADX INFO: renamed from: l */
    public final TimestampAdjuster f7908l;

    /* JADX INFO: renamed from: m */
    public final EventMessageEncoder f7909m;

    /* JADX INFO: renamed from: n */
    public final ParsableByteArray f7910n;

    /* JADX INFO: renamed from: o */
    public final ArrayDeque<Atom.a> f7911o;

    /* JADX INFO: renamed from: p */
    public final ArrayDeque<a> f7912p;

    /* JADX INFO: renamed from: q */
    public final TrackOutput2 f7913q;

    /* JADX INFO: renamed from: r */
    public int f7914r;

    /* JADX INFO: renamed from: s */
    public int f7915s;

    /* JADX INFO: renamed from: t */
    public long f7916t;

    /* JADX INFO: renamed from: u */
    public int f7917u;

    /* JADX INFO: renamed from: v */
    public ParsableByteArray f7918v;

    /* JADX INFO: renamed from: w */
    public long f7919w;

    /* JADX INFO: renamed from: x */
    public int f7920x;

    /* JADX INFO: renamed from: y */
    public long f7921y;

    /* JADX INFO: renamed from: z */
    public long f7922z;

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.g$a */
    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f7923a;

        /* JADX INFO: renamed from: b */
        public final int f7924b;

        public a(long j2, int i) {
            this.f7923a = j2;
            this.f7924b = i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.k0.g$b */
    /* JADX INFO: compiled from: FragmentedMp4Extractor.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final TrackOutput2 f7925a;

        /* JADX INFO: renamed from: d */
        public TrackSampleTable f7928d;

        /* JADX INFO: renamed from: e */
        public DefaultSampleValues f7929e;

        /* JADX INFO: renamed from: f */
        public int f7930f;

        /* JADX INFO: renamed from: g */
        public int f7931g;

        /* JADX INFO: renamed from: h */
        public int f7932h;

        /* JADX INFO: renamed from: i */
        public int f7933i;

        /* JADX INFO: renamed from: l */
        public boolean f7936l;

        /* JADX INFO: renamed from: b */
        public final TrackFragment f7926b = new TrackFragment();

        /* JADX INFO: renamed from: c */
        public final ParsableByteArray f7927c = new ParsableByteArray();

        /* JADX INFO: renamed from: j */
        public final ParsableByteArray f7934j = new ParsableByteArray(1);

        /* JADX INFO: renamed from: k */
        public final ParsableByteArray f7935k = new ParsableByteArray();

        public b(TrackOutput2 trackOutput2, TrackSampleTable trackSampleTable, DefaultSampleValues defaultSampleValues) {
            this.f7925a = trackOutput2;
            this.f7928d = trackSampleTable;
            this.f7929e = defaultSampleValues;
            this.f7928d = trackSampleTable;
            this.f7929e = defaultSampleValues;
            trackOutput2.mo3760e(trackSampleTable.f8012a.f7983f);
            m3830e();
        }

        /* JADX INFO: renamed from: a */
        public long m3826a() {
            return !this.f7936l ? this.f7928d.f8014c[this.f7930f] : this.f7926b.f7999f[this.f7932h];
        }

        /* JADX INFO: renamed from: b */
        public TrackEncryptionBox m3827b() {
            if (!this.f7936l) {
                return null;
            }
            TrackFragment trackFragment = this.f7926b;
            DefaultSampleValues defaultSampleValues = trackFragment.f7994a;
            int i = Util6.f6307a;
            int i2 = defaultSampleValues.f7883a;
            TrackEncryptionBox trackEncryptionBoxM3841a = trackFragment.f8007n;
            if (trackEncryptionBoxM3841a == null) {
                trackEncryptionBoxM3841a = this.f7928d.f8012a.m3841a(i2);
            }
            if (trackEncryptionBoxM3841a == null || !trackEncryptionBoxM3841a.f7989a) {
                return null;
            }
            return trackEncryptionBoxM3841a;
        }

        /* JADX INFO: renamed from: c */
        public boolean m3828c() {
            this.f7930f++;
            if (!this.f7936l) {
                return false;
            }
            int i = this.f7931g + 1;
            this.f7931g = i;
            int[] iArr = this.f7926b.f8000g;
            int i2 = this.f7932h;
            if (i != iArr[i2]) {
                return true;
            }
            this.f7932h = i2 + 1;
            this.f7931g = 0;
            return false;
        }

        /* JADX INFO: renamed from: d */
        public int m3829d(int i, int i2) {
            ParsableByteArray parsableByteArray;
            TrackEncryptionBox trackEncryptionBoxM3827b = m3827b();
            if (trackEncryptionBoxM3827b == null) {
                return 0;
            }
            int length = trackEncryptionBoxM3827b.f7992d;
            if (length != 0) {
                parsableByteArray = this.f7926b.f8008o;
            } else {
                byte[] bArr = trackEncryptionBoxM3827b.f7993e;
                int i3 = Util6.f6307a;
                ParsableByteArray parsableByteArray2 = this.f7935k;
                int length2 = bArr.length;
                parsableByteArray2.f6392a = bArr;
                parsableByteArray2.f6394c = length2;
                parsableByteArray2.f6393b = 0;
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            TrackFragment trackFragment = this.f7926b;
            boolean z = trackFragment.f8005l && trackFragment.f8006m[this.f7930f];
            boolean z2 = z || i2 != 0;
            ParsableByteArray parsableByteArray3 = this.f7934j;
            parsableByteArray3.f6392a[0] = (byte) ((z2 ? 128 : 0) | length);
            parsableByteArray3.m3194D(0);
            this.f7925a.mo3761f(this.f7934j, 1, 1);
            this.f7925a.mo3761f(parsableByteArray, length, 1);
            if (!z2) {
                return length + 1;
            }
            if (!z) {
                this.f7927c.m3221z(8);
                ParsableByteArray parsableByteArray4 = this.f7927c;
                byte[] bArr2 = parsableByteArray4.f6392a;
                bArr2[0] = 0;
                bArr2[1] = 1;
                bArr2[2] = (byte) ((i2 >> 8) & 255);
                bArr2[3] = (byte) (i2 & 255);
                bArr2[4] = (byte) ((i >> 24) & 255);
                bArr2[5] = (byte) ((i >> 16) & 255);
                bArr2[6] = (byte) ((i >> 8) & 255);
                bArr2[7] = (byte) (i & 255);
                this.f7925a.mo3761f(parsableByteArray4, 8, 1);
                return length + 1 + 8;
            }
            ParsableByteArray parsableByteArray5 = this.f7926b.f8008o;
            int iM3219x = parsableByteArray5.m3219x();
            parsableByteArray5.m3195E(-2);
            int i4 = (iM3219x * 6) + 2;
            if (i2 != 0) {
                this.f7927c.m3221z(i4);
                byte[] bArr3 = this.f7927c.f6392a;
                parsableByteArray5.m3200e(bArr3, 0, i4);
                int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
                bArr3[2] = (byte) ((i5 >> 8) & 255);
                bArr3[3] = (byte) (i5 & 255);
                parsableByteArray5 = this.f7927c;
            }
            this.f7925a.mo3761f(parsableByteArray5, i4, 1);
            return length + 1 + i4;
        }

        /* JADX INFO: renamed from: e */
        public void m3830e() {
            TrackFragment trackFragment = this.f7926b;
            trackFragment.f7997d = 0;
            trackFragment.f8010q = 0L;
            trackFragment.f8011r = false;
            trackFragment.f8005l = false;
            trackFragment.f8009p = false;
            trackFragment.f8007n = null;
            this.f7930f = 0;
            this.f7932h = 0;
            this.f7931g = 0;
            this.f7933i = 0;
            this.f7936l = false;
        }
    }

    static {
        Format.b bVar = new Format.b();
        bVar.f6958k = "application/x-emsg";
        f7888b = bVar.m3519a();
    }

    public FragmentedMp4Extractor() {
        this(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m3820a(int i) throws ParserException {
        if (i >= 0) {
            return i;
        }
        throw new ParserException(outline.m1590l("Unexpected negative value: ", i));
    }

    /* JADX INFO: renamed from: h */
    public static DrmInitData m3821h(List<Atom.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            Atom.b bVar = list.get(i);
            if (bVar.f7853a == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.f7857b.f6392a;
                PsshAtomUtil psshAtomUtilM2405u = C1095a.m2405u(bArr);
                UUID uuid = psshAtomUtilM2405u == null ? null : psshAtomUtilM2405u.f7967a;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.b(uuid, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    /* JADX INFO: renamed from: i */
    public static void m3822i(ParsableByteArray parsableByteArray, int i, TrackFragment trackFragment) throws ParserException {
        parsableByteArray.m3194D(i + 8);
        int iM3201f = parsableByteArray.m3201f() & 16777215;
        if ((iM3201f & 1) != 0) {
            throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM3201f & 2) != 0;
        int iM3217v = parsableByteArray.m3217v();
        if (iM3217v == 0) {
            Arrays.fill(trackFragment.f8006m, 0, trackFragment.f7998e, false);
            return;
        }
        if (iM3217v != trackFragment.f7998e) {
            StringBuilder sbM1557H = outline.m1557H("Senc sample count ", iM3217v, " is different from fragment sample count");
            sbM1557H.append(trackFragment.f7998e);
            throw new ParserException(sbM1557H.toString());
        }
        Arrays.fill(trackFragment.f8006m, 0, iM3217v, z);
        int iM3196a = parsableByteArray.m3196a();
        ParsableByteArray parsableByteArray2 = trackFragment.f8008o;
        byte[] bArr = parsableByteArray2.f6392a;
        if (bArr.length < iM3196a) {
            bArr = new byte[iM3196a];
        }
        parsableByteArray2.f6392a = bArr;
        parsableByteArray2.f6394c = iM3196a;
        parsableByteArray2.f6393b = 0;
        trackFragment.f8005l = true;
        trackFragment.f8009p = true;
        parsableByteArray.m3200e(bArr, 0, iM3196a);
        trackFragment.f8008o.m3194D(0);
        trackFragment.f8009p = false;
    }

    /* JADX INFO: renamed from: b */
    public final void m3823b() {
        this.f7914r = 0;
        this.f7917u = 0;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: c */
    public boolean mo3749c(ExtractorInput extractorInput) throws IOException {
        return Sniffer2.m3840a(extractorInput, true, false);
    }

    /* JADX INFO: renamed from: d */
    public final DefaultSampleValues m3824d(SparseArray<DefaultSampleValues> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        DefaultSampleValues defaultSampleValues = sparseArray.get(i);
        Objects.requireNonNull(defaultSampleValues);
        return defaultSampleValues;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:106:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x0245 A[LOOP:5: B:109:0x0245->B:111:0x024b, LOOP_START] */
    /* JADX WARN: Code duplicated, block: B:111:0x024b A[LOOP:5: B:109:0x0245->B:111:0x024b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x025b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0264  */
    /* JADX WARN: Code duplicated, block: B:117:0x026e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0270  */
    /* JADX WARN: Code duplicated, block: B:121:0x0277  */
    /* JADX WARN: Code duplicated, block: B:124:0x0281  */
    /* JADX WARN: Code duplicated, block: B:125:0x0284  */
    /* JADX WARN: Code duplicated, block: B:129:0x0296  */
    /* JADX WARN: Code duplicated, block: B:131:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:216:0x05a4  */
    /* JADX WARN: Code duplicated, block: B:217:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:219:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:226:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:229:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:237:0x0620  */
    /* JADX WARN: Code duplicated, block: B:239:0x0629 A[LOOP:10: B:238:0x0627->B:239:0x0629, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x0641  */
    /* JADX WARN: Code duplicated, block: B:243:0x064e  */
    /* JADX WARN: Code duplicated, block: B:262:0x067b  */
    /* JADX WARN: Code duplicated, block: B:264:0x067e  */
    /* JADX WARN: Code duplicated, block: B:266:0x069d  */
    /* JADX WARN: Code duplicated, block: B:267:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:268:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:324:0x0730  */
    /* JADX WARN: Code duplicated, block: B:327:0x0736  */
    /* JADX WARN: Code duplicated, block: B:329:0x073c  */
    /* JADX WARN: Code duplicated, block: B:331:0x0742  */
    /* JADX WARN: Code duplicated, block: B:336:0x0768  */
    /* JADX WARN: Code duplicated, block: B:338:0x076e  */
    /* JADX WARN: Code duplicated, block: B:349:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:0x0784 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x0760 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x0758 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:356:0x077c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:373:0x0257 A[EDGE_INSN: B:373:0x0257->B:112:0x0257 BREAK  A[LOOP:5: B:109:0x0245->B:111:0x024b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0091  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x013f  */
    /* JADX WARN: Code duplicated, block: B:71:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0181  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: e */
    public int mo3750e(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        FragmentedMp4Extractor fragmentedMp4Extractor;
        long j2;
        long jMo3729a;
        long jMo3740p;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long j3;
        long jMo3740p2;
        boolean z3;
        int size;
        int i3;
        long jM3104M;
        String str;
        String str2;
        long jM3104M2;
        long jM3215t;
        long jM3084a;
        long jM3218w;
        long jM3218w2;
        char c2;
        TrackSampleTable trackSampleTable;
        Track track;
        TrackOutput2 trackOutput2;
        long jM3084a2;
        TimestampAdjuster timestampAdjuster;
        long j4;
        int i4;
        int i5;
        int i6;
        int i7;
        TrackEncryptionBox trackEncryptionBoxM3827b;
        TrackOutput2.a aVar;
        a aVarRemoveFirst;
        long jM3084a3;
        TimestampAdjuster timestampAdjuster2;
        TrackOutput2[] trackOutput2Arr;
        int length;
        int i8;
        byte[] bArr;
        int i9;
        int i10;
        int i11;
        int iMo3757b;
        int iM3201f;
        boolean z4;
        String str3;
        byte b2;
        int i12;
        TrackEncryptionBox trackEncryptionBoxM3827b2;
        ParsableByteArray parsableByteArray;
        int i13;
        TrackFragment trackFragment;
        boolean z5;
        FragmentedMp4Extractor fragmentedMp4Extractor2 = this;
        ExtractorInput extractorInput2 = extractorInput;
        while (true) {
            int i14 = fragmentedMp4Extractor2.f7914r;
            int i15 = 1;
            if (i14 == 0) {
                fragmentedMp4Extractor = fragmentedMp4Extractor2;
                if (fragmentedMp4Extractor.f7917u != 0) {
                    j2 = fragmentedMp4Extractor.f7916t;
                    if (j2 == 1) {
                        extractorInput2.readFully(fragmentedMp4Extractor.f7910n.f6392a, 8, 8);
                        fragmentedMp4Extractor.f7917u += 8;
                        fragmentedMp4Extractor.f7916t = fragmentedMp4Extractor.f7910n.m3218w();
                    } else if (j2 == 0) {
                        jMo3729a = extractorInput.mo3729a();
                        if (jMo3729a == -1 && !fragmentedMp4Extractor.f7911o.isEmpty()) {
                            jMo3729a = fragmentedMp4Extractor.f7911o.peek().f7854b;
                        }
                        if (jMo3729a != -1) {
                            fragmentedMp4Extractor.f7916t = (jMo3729a - extractorInput.mo3740p()) + ((long) fragmentedMp4Extractor.f7917u);
                        }
                    }
                    if (fragmentedMp4Extractor.f7916t >= fragmentedMp4Extractor.f7917u) {
                        throw new ParserException("Atom size less than header length (unsupported).");
                    }
                    jMo3740p = extractorInput.mo3740p() - ((long) fragmentedMp4Extractor.f7917u);
                    i = fragmentedMp4Extractor.f7915s;
                    if ((i != 1836019558 || i == 1835295092) && !fragmentedMp4Extractor.f7898J) {
                        fragmentedMp4Extractor.f7895G.mo3772a(new SeekMap.b(fragmentedMp4Extractor.f7922z, jMo3740p));
                        fragmentedMp4Extractor.f7898J = true;
                    }
                    if (fragmentedMp4Extractor.f7915s == 1836019558) {
                        size = fragmentedMp4Extractor.f7902f.size();
                        for (i3 = 0; i3 < size; i3++) {
                            TrackFragment trackFragment2 = fragmentedMp4Extractor.f7902f.valueAt(i3).f7926b;
                            Objects.requireNonNull(trackFragment2);
                            trackFragment2.f7996c = jMo3740p;
                            trackFragment2.f7995b = jMo3740p;
                        }
                    }
                    i2 = fragmentedMp4Extractor.f7915s;
                    if (i2 == 1835295092) {
                        fragmentedMp4Extractor.f7890B = null;
                        fragmentedMp4Extractor.f7919w = jMo3740p + fragmentedMp4Extractor.f7916t;
                        fragmentedMp4Extractor.f7914r = 2;
                    } else {
                        if (i2 != 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1836019558 || i2 == 1953653094 || i2 == 1836475768 || i2 == 1701082227) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            jMo3740p2 = (extractorInput.mo3740p() + fragmentedMp4Extractor.f7916t) - 8;
                            fragmentedMp4Extractor.f7911o.push(new Atom.a(fragmentedMp4Extractor.f7915s, jMo3740p2));
                            if (fragmentedMp4Extractor.f7916t == fragmentedMp4Extractor.f7917u) {
                                fragmentedMp4Extractor.m3825j(jMo3740p2);
                            } else {
                                m3823b();
                            }
                        } else {
                            if (i2 != 1751411826 || i2 == 1835296868 || i2 == 1836476516 || i2 == 1936286840 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1668576371 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1937011571 || i2 == 1952867444 || i2 == 1952868452 || i2 == 1953196132 || i2 == 1953654136 || i2 == 1953658222 || i2 == 1886614376 || i2 == 1935763834 || i2 == 1935763823 || i2 == 1936027235 || i2 == 1970628964 || i2 == 1935828848 || i2 == 1936158820 || i2 == 1701606260 || i2 == 1835362404 || i2 == 1701671783) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (fragmentedMp4Extractor.f7917u == 8) {
                                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                                }
                                j3 = fragmentedMp4Extractor.f7916t;
                                if (j3 <= 2147483647L) {
                                    throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                ParsableByteArray parsableByteArray2 = new ParsableByteArray((int) j3);
                                System.arraycopy(fragmentedMp4Extractor.f7910n.f6392a, 0, parsableByteArray2.f6392a, 0, 8);
                                fragmentedMp4Extractor.f7918v = parsableByteArray2;
                                fragmentedMp4Extractor.f7914r = 1;
                            } else {
                                if (fragmentedMp4Extractor.f7916t <= 2147483647L) {
                                    throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                fragmentedMp4Extractor.f7918v = null;
                                fragmentedMp4Extractor.f7914r = 1;
                            }
                        }
                    }
                    z3 = true;
                } else if (extractorInput2.mo3730b(fragmentedMp4Extractor.f7910n.f6392a, 0, 8, true)) {
                    fragmentedMp4Extractor.f7917u = 8;
                    fragmentedMp4Extractor.f7910n.m3194D(0);
                    fragmentedMp4Extractor.f7916t = fragmentedMp4Extractor.f7910n.m3215t();
                    fragmentedMp4Extractor.f7915s = fragmentedMp4Extractor.f7910n.m3201f();
                    j2 = fragmentedMp4Extractor.f7916t;
                    if (j2 == 1) {
                        extractorInput2.readFully(fragmentedMp4Extractor.f7910n.f6392a, 8, 8);
                        fragmentedMp4Extractor.f7917u += 8;
                        fragmentedMp4Extractor.f7916t = fragmentedMp4Extractor.f7910n.m3218w();
                    } else if (j2 == 0) {
                        jMo3729a = extractorInput.mo3729a();
                        if (jMo3729a == -1) {
                            jMo3729a = fragmentedMp4Extractor.f7911o.peek().f7854b;
                        }
                        if (jMo3729a != -1) {
                            fragmentedMp4Extractor.f7916t = (jMo3729a - extractorInput.mo3740p()) + ((long) fragmentedMp4Extractor.f7917u);
                        }
                    }
                    if (fragmentedMp4Extractor.f7916t >= fragmentedMp4Extractor.f7917u) {
                        throw new ParserException("Atom size less than header length (unsupported).");
                    }
                    jMo3740p = extractorInput.mo3740p() - ((long) fragmentedMp4Extractor.f7917u);
                    i = fragmentedMp4Extractor.f7915s;
                    if (i != 1836019558) {
                        fragmentedMp4Extractor.f7895G.mo3772a(new SeekMap.b(fragmentedMp4Extractor.f7922z, jMo3740p));
                        fragmentedMp4Extractor.f7898J = true;
                    } else {
                        fragmentedMp4Extractor.f7895G.mo3772a(new SeekMap.b(fragmentedMp4Extractor.f7922z, jMo3740p));
                        fragmentedMp4Extractor.f7898J = true;
                    }
                    if (fragmentedMp4Extractor.f7915s == 1836019558) {
                        size = fragmentedMp4Extractor.f7902f.size();
                        while (i3 < size) {
                            TrackFragment trackFragment3 = fragmentedMp4Extractor.f7902f.valueAt(i3).f7926b;
                            Objects.requireNonNull(trackFragment3);
                            trackFragment3.f7996c = jMo3740p;
                            trackFragment3.f7995b = jMo3740p;
                        }
                    }
                    i2 = fragmentedMp4Extractor.f7915s;
                    if (i2 == 1835295092) {
                        fragmentedMp4Extractor.f7890B = null;
                        fragmentedMp4Extractor.f7919w = jMo3740p + fragmentedMp4Extractor.f7916t;
                        fragmentedMp4Extractor.f7914r = 2;
                    } else {
                        if (i2 != 1836019574) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (z) {
                            jMo3740p2 = (extractorInput.mo3740p() + fragmentedMp4Extractor.f7916t) - 8;
                            fragmentedMp4Extractor.f7911o.push(new Atom.a(fragmentedMp4Extractor.f7915s, jMo3740p2));
                            if (fragmentedMp4Extractor.f7916t == fragmentedMp4Extractor.f7917u) {
                                fragmentedMp4Extractor.m3825j(jMo3740p2);
                            } else {
                                m3823b();
                            }
                        } else {
                            if (i2 != 1751411826) {
                                z2 = true;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (fragmentedMp4Extractor.f7917u == 8) {
                                    throw new ParserException("Leaf atom defines extended atom size (unsupported).");
                                }
                                j3 = fragmentedMp4Extractor.f7916t;
                                if (j3 <= 2147483647L) {
                                    throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
                                }
                                ParsableByteArray parsableByteArray3 = new ParsableByteArray((int) j3);
                                System.arraycopy(fragmentedMp4Extractor.f7910n.f6392a, 0, parsableByteArray3.f6392a, 0, 8);
                                fragmentedMp4Extractor.f7918v = parsableByteArray3;
                                fragmentedMp4Extractor.f7914r = 1;
                            } else {
                                if (fragmentedMp4Extractor.f7916t <= 2147483647L) {
                                    throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
                                }
                                fragmentedMp4Extractor.f7918v = null;
                                fragmentedMp4Extractor.f7914r = 1;
                            }
                        }
                    }
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    return -1;
                }
            } else if (i14 != 1) {
                long j5 = Long.MAX_VALUE;
                if (i14 != 2) {
                    b bVar = fragmentedMp4Extractor2.f7890B;
                    if (bVar == null) {
                        SparseArray<b> sparseArray = fragmentedMp4Extractor2.f7902f;
                        int size2 = sparseArray.size();
                        long j6 = Long.MAX_VALUE;
                        b bVar2 = null;
                        for (int i16 = 0; i16 < size2; i16++) {
                            b bVarValueAt = sparseArray.valueAt(i16);
                            boolean z6 = bVarValueAt.f7936l;
                            if ((z6 || bVarValueAt.f7930f != bVarValueAt.f7928d.f8013b) && (!z6 || bVarValueAt.f7932h != bVarValueAt.f7926b.f7997d)) {
                                long jM3826a = bVarValueAt.m3826a();
                                if (jM3826a < j6) {
                                    bVar2 = bVarValueAt;
                                    j6 = jM3826a;
                                }
                            }
                        }
                        if (bVar2 == null) {
                            int iMo3740p = (int) (fragmentedMp4Extractor2.f7919w - extractorInput.mo3740p());
                            if (iMo3740p < 0) {
                                throw new ParserException("Offset to end of mdat was negative.");
                            }
                            extractorInput2.mo3737l(iMo3740p);
                            m3823b();
                            i15 = 0;
                        } else {
                            int iM3826a = (int) (bVar2.m3826a() - extractorInput.mo3740p());
                            if (iM3826a < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                iM3826a = 0;
                            }
                            extractorInput2.mo3737l(iM3826a);
                            fragmentedMp4Extractor2.f7890B = bVar2;
                            bVar = bVar2;
                            c2 = 6;
                            if (fragmentedMp4Extractor2.f7914r != 3) {
                                trackSampleTable = bVar.f7928d;
                                track = trackSampleTable.f8012a;
                                trackOutput2 = bVar.f7925a;
                                if (bVar.f7936l) {
                                    TrackFragment trackFragment4 = bVar.f7926b;
                                    int i17 = bVar.f7930f;
                                    jM3084a2 = ((long) trackFragment4.f8002i[i17]) + trackFragment4.f8003j[i17];
                                } else {
                                    jM3084a2 = trackSampleTable.f8017f[bVar.f7930f];
                                }
                                timestampAdjuster = fragmentedMp4Extractor2.f7908l;
                                if (timestampAdjuster != null) {
                                    jM3084a2 = timestampAdjuster.m3084a(jM3084a2);
                                }
                                j4 = jM3084a2;
                                i4 = track.f7987j;
                                if (i4 != 0) {
                                    while (true) {
                                        i5 = fragmentedMp4Extractor2.f7892D;
                                        i6 = fragmentedMp4Extractor2.f7891C;
                                        if (i5 < i6) {
                                            break;
                                        }
                                        fragmentedMp4Extractor2.f7892D += trackOutput2.mo3757b(extractorInput2, i6 - i5, false);
                                    }
                                } else {
                                    bArr = fragmentedMp4Extractor2.f7904h.f6392a;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i9 = i4 + 1;
                                    i10 = 4 - i4;
                                    while (fragmentedMp4Extractor2.f7892D < fragmentedMp4Extractor2.f7891C) {
                                        i11 = fragmentedMp4Extractor2.f7893E;
                                        if (i11 == 0) {
                                            extractorInput2.readFully(bArr, i10, i9);
                                            fragmentedMp4Extractor2.f7904h.m3194D(0);
                                            iM3201f = fragmentedMp4Extractor2.f7904h.m3201f();
                                            if (iM3201f >= i15) {
                                                throw new ParserException("Invalid NAL length");
                                            }
                                            fragmentedMp4Extractor2.f7893E = iM3201f - 1;
                                            fragmentedMp4Extractor2.f7903g.m3194D(0);
                                            trackOutput2.mo3758c(fragmentedMp4Extractor2.f7903g, 4);
                                            trackOutput2.mo3758c(fragmentedMp4Extractor2.f7904h, i15);
                                            if (fragmentedMp4Extractor2.f7897I.length > 0) {
                                                str3 = track.f7983f.f6934q;
                                                b2 = bArr[4];
                                                byte[] bArr2 = NalUnitUtil.f6368a;
                                                if ((!"video/avc".equals(str3) && (b2 & 31) == c2) || ("video/hevc".equals(str3) && ((b2 & 126) >> i15) == 39)) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            } else {
                                                z4 = false;
                                            }
                                            fragmentedMp4Extractor2.f7894F = z4;
                                            fragmentedMp4Extractor2.f7892D += 5;
                                            fragmentedMp4Extractor2.f7891C += i10;
                                        } else {
                                            if (fragmentedMp4Extractor2.f7894F) {
                                                fragmentedMp4Extractor2.f7905i.m3221z(i11);
                                                extractorInput2.readFully(fragmentedMp4Extractor2.f7905i.f6392a, 0, fragmentedMp4Extractor2.f7893E);
                                                trackOutput2.mo3758c(fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7893E);
                                                iMo3757b = fragmentedMp4Extractor2.f7893E;
                                                ParsableByteArray parsableByteArray4 = fragmentedMp4Extractor2.f7905i;
                                                int iM3176e = NalUnitUtil.m3176e(parsableByteArray4.f6392a, parsableByteArray4.f6394c);
                                                fragmentedMp4Extractor2.f7905i.m3194D("video/hevc".equals(track.f7983f.f6934q) ? 1 : 0);
                                                fragmentedMp4Extractor2.f7905i.m3193C(iM3176e);
                                                C1095a.m2394j(j4, fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7897I);
                                            } else {
                                                iMo3757b = trackOutput2.mo3757b(extractorInput2, i11, false);
                                            }
                                            fragmentedMp4Extractor2.f7892D += iMo3757b;
                                            fragmentedMp4Extractor2.f7893E -= iMo3757b;
                                            c2 = 6;
                                            i15 = 1;
                                        }
                                    }
                                }
                                if (!bVar.f7936l) {
                                    i7 = bVar.f7928d.f8018g[bVar.f7930f];
                                } else if (bVar.f7926b.f8004k[bVar.f7930f]) {
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                                if (bVar.m3827b() != null) {
                                    i7 |= 1073741824;
                                }
                                int i18 = i7;
                                trackEncryptionBoxM3827b = bVar.m3827b();
                                if (trackEncryptionBoxM3827b != null) {
                                    aVar = trackEncryptionBoxM3827b.f7991c;
                                } else {
                                    aVar = null;
                                }
                                trackOutput2.mo3759d(j4, i18, fragmentedMp4Extractor2.f7891C, 0, aVar);
                                while (!fragmentedMp4Extractor2.f7912p.isEmpty()) {
                                    aVarRemoveFirst = fragmentedMp4Extractor2.f7912p.removeFirst();
                                    fragmentedMp4Extractor2.f7920x -= aVarRemoveFirst.f7924b;
                                    jM3084a3 = aVarRemoveFirst.f7923a + j4;
                                    timestampAdjuster2 = fragmentedMp4Extractor2.f7908l;
                                    if (timestampAdjuster2 != null) {
                                        jM3084a3 = timestampAdjuster2.m3084a(jM3084a3);
                                    }
                                    trackOutput2Arr = fragmentedMp4Extractor2.f7896H;
                                    i8 = 0;
                                    for (length = trackOutput2Arr.length; i8 < length; length = length) {
                                        trackOutput2Arr[i8].mo3759d(jM3084a3, 1, aVarRemoveFirst.f7924b, fragmentedMp4Extractor2.f7920x, null);
                                        i8++;
                                    }
                                }
                                if (!bVar.m3828c()) {
                                    fragmentedMp4Extractor2.f7890B = null;
                                }
                                fragmentedMp4Extractor2.f7914r = 3;
                                i15 = 1;
                            } else {
                                if (bVar.f7936l) {
                                    i12 = bVar.f7926b.f8001h[bVar.f7930f];
                                } else {
                                    i12 = bVar.f7928d.f8015d[bVar.f7930f];
                                }
                                fragmentedMp4Extractor2.f7891C = i12;
                                if (bVar.f7930f < bVar.f7933i) {
                                    extractorInput2.mo3737l(i12);
                                    trackEncryptionBoxM3827b2 = bVar.m3827b();
                                    if (trackEncryptionBoxM3827b2 != null) {
                                        parsableByteArray = bVar.f7926b.f8008o;
                                        i13 = trackEncryptionBoxM3827b2.f7992d;
                                        if (i13 != 0) {
                                            parsableByteArray.m3195E(i13);
                                        }
                                        trackFragment = bVar.f7926b;
                                        int i19 = bVar.f7930f;
                                        if (trackFragment.f8005l || !trackFragment.f8006m[i19]) {
                                            z5 = false;
                                        } else {
                                            z5 = true;
                                        }
                                        if (z5) {
                                            parsableByteArray.m3195E(parsableByteArray.m3219x() * 6);
                                        }
                                    }
                                    if (!bVar.m3828c()) {
                                        fragmentedMp4Extractor2.f7890B = null;
                                    }
                                    fragmentedMp4Extractor2.f7914r = 3;
                                } else {
                                    if (bVar.f7928d.f8012a.f7984g == 1) {
                                        fragmentedMp4Extractor2.f7891C = i12 - 8;
                                        extractorInput2.mo3737l(8);
                                    }
                                    if ("audio/ac4".equals(bVar.f7928d.f8012a.f7983f.f6934q)) {
                                        fragmentedMp4Extractor2.f7892D = bVar.m3829d(fragmentedMp4Extractor2.f7891C, 7);
                                        Ac4Util.m3556a(fragmentedMp4Extractor2.f7891C, fragmentedMp4Extractor2.f7907k);
                                        bVar.f7925a.mo3758c(fragmentedMp4Extractor2.f7907k, 7);
                                        fragmentedMp4Extractor2.f7892D += 7;
                                    } else {
                                        fragmentedMp4Extractor2.f7892D = bVar.m3829d(fragmentedMp4Extractor2.f7891C, 0);
                                    }
                                    fragmentedMp4Extractor2.f7891C += fragmentedMp4Extractor2.f7892D;
                                    fragmentedMp4Extractor2.f7914r = 4;
                                    fragmentedMp4Extractor2.f7893E = 0;
                                    trackSampleTable = bVar.f7928d;
                                    track = trackSampleTable.f8012a;
                                    trackOutput2 = bVar.f7925a;
                                    if (bVar.f7936l) {
                                        jM3084a2 = trackSampleTable.f8017f[bVar.f7930f];
                                    } else {
                                        TrackFragment trackFragment5 = bVar.f7926b;
                                        int i110 = bVar.f7930f;
                                        jM3084a2 = ((long) trackFragment5.f8002i[i110]) + trackFragment5.f8003j[i110];
                                    }
                                    timestampAdjuster = fragmentedMp4Extractor2.f7908l;
                                    if (timestampAdjuster != null) {
                                        jM3084a2 = timestampAdjuster.m3084a(jM3084a2);
                                    }
                                    j4 = jM3084a2;
                                    i4 = track.f7987j;
                                    if (i4 != 0) {
                                        while (true) {
                                            i5 = fragmentedMp4Extractor2.f7892D;
                                            i6 = fragmentedMp4Extractor2.f7891C;
                                            if (i5 < i6) {
                                                break;
                                                break;
                                            }
                                            fragmentedMp4Extractor2.f7892D += trackOutput2.mo3757b(extractorInput2, i6 - i5, false);
                                        }
                                    } else {
                                        bArr = fragmentedMp4Extractor2.f7904h.f6392a;
                                        bArr[0] = 0;
                                        bArr[1] = 0;
                                        bArr[2] = 0;
                                        i9 = i4 + 1;
                                        i10 = 4 - i4;
                                        while (fragmentedMp4Extractor2.f7892D < fragmentedMp4Extractor2.f7891C) {
                                            i11 = fragmentedMp4Extractor2.f7893E;
                                            if (i11 == 0) {
                                                extractorInput2.readFully(bArr, i10, i9);
                                                fragmentedMp4Extractor2.f7904h.m3194D(0);
                                                iM3201f = fragmentedMp4Extractor2.f7904h.m3201f();
                                                if (iM3201f >= i15) {
                                                    throw new ParserException("Invalid NAL length");
                                                }
                                                fragmentedMp4Extractor2.f7893E = iM3201f - 1;
                                                fragmentedMp4Extractor2.f7903g.m3194D(0);
                                                trackOutput2.mo3758c(fragmentedMp4Extractor2.f7903g, 4);
                                                trackOutput2.mo3758c(fragmentedMp4Extractor2.f7904h, i15);
                                                if (fragmentedMp4Extractor2.f7897I.length > 0) {
                                                    str3 = track.f7983f.f6934q;
                                                    b2 = bArr[4];
                                                    byte[] bArr3 = NalUnitUtil.f6368a;
                                                    if ((!"video/avc".equals(str3) && (b2 & 31) == c2) || ("video/hevc".equals(str3) && ((b2 & 126) >> i15) == 39)) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                } else {
                                                    z4 = false;
                                                }
                                                fragmentedMp4Extractor2.f7894F = z4;
                                                fragmentedMp4Extractor2.f7892D += 5;
                                                fragmentedMp4Extractor2.f7891C += i10;
                                            } else {
                                                if (fragmentedMp4Extractor2.f7894F) {
                                                    fragmentedMp4Extractor2.f7905i.m3221z(i11);
                                                    extractorInput2.readFully(fragmentedMp4Extractor2.f7905i.f6392a, 0, fragmentedMp4Extractor2.f7893E);
                                                    trackOutput2.mo3758c(fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7893E);
                                                    iMo3757b = fragmentedMp4Extractor2.f7893E;
                                                    ParsableByteArray parsableByteArray5 = fragmentedMp4Extractor2.f7905i;
                                                    int iM3176e2 = NalUnitUtil.m3176e(parsableByteArray5.f6392a, parsableByteArray5.f6394c);
                                                    fragmentedMp4Extractor2.f7905i.m3194D("video/hevc".equals(track.f7983f.f6934q) ? 1 : 0);
                                                    fragmentedMp4Extractor2.f7905i.m3193C(iM3176e2);
                                                    C1095a.m2394j(j4, fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7897I);
                                                } else {
                                                    iMo3757b = trackOutput2.mo3757b(extractorInput2, i11, false);
                                                }
                                                fragmentedMp4Extractor2.f7892D += iMo3757b;
                                                fragmentedMp4Extractor2.f7893E -= iMo3757b;
                                                c2 = 6;
                                                i15 = 1;
                                            }
                                        }
                                    }
                                    if (!bVar.f7936l) {
                                        i7 = bVar.f7928d.f8018g[bVar.f7930f];
                                    } else if (bVar.f7926b.f8004k[bVar.f7930f]) {
                                        i7 = 1;
                                    } else {
                                        i7 = 0;
                                    }
                                    if (bVar.m3827b() != null) {
                                        i7 |= 1073741824;
                                    }
                                    int i111 = i7;
                                    trackEncryptionBoxM3827b = bVar.m3827b();
                                    if (trackEncryptionBoxM3827b != null) {
                                        aVar = trackEncryptionBoxM3827b.f7991c;
                                    } else {
                                        aVar = null;
                                    }
                                    trackOutput2.mo3759d(j4, i111, fragmentedMp4Extractor2.f7891C, 0, aVar);
                                    while (!fragmentedMp4Extractor2.f7912p.isEmpty()) {
                                        aVarRemoveFirst = fragmentedMp4Extractor2.f7912p.removeFirst();
                                        fragmentedMp4Extractor2.f7920x -= aVarRemoveFirst.f7924b;
                                        jM3084a3 = aVarRemoveFirst.f7923a + j4;
                                        timestampAdjuster2 = fragmentedMp4Extractor2.f7908l;
                                        if (timestampAdjuster2 != null) {
                                            jM3084a3 = timestampAdjuster2.m3084a(jM3084a3);
                                        }
                                        trackOutput2Arr = fragmentedMp4Extractor2.f7896H;
                                        i8 = 0;
                                        while (i8 < length) {
                                            trackOutput2Arr[i8].mo3759d(jM3084a3, 1, aVarRemoveFirst.f7924b, fragmentedMp4Extractor2.f7920x, null);
                                            i8++;
                                        }
                                    }
                                    if (!bVar.m3828c()) {
                                        fragmentedMp4Extractor2.f7890B = null;
                                    }
                                    fragmentedMp4Extractor2.f7914r = 3;
                                    i15 = 1;
                                }
                            }
                        }
                    } else {
                        c2 = 6;
                        if (fragmentedMp4Extractor2.f7914r != 3) {
                            trackSampleTable = bVar.f7928d;
                            track = trackSampleTable.f8012a;
                            trackOutput2 = bVar.f7925a;
                            if (bVar.f7936l) {
                                jM3084a2 = trackSampleTable.f8017f[bVar.f7930f];
                            } else {
                                TrackFragment trackFragment6 = bVar.f7926b;
                                int i112 = bVar.f7930f;
                                jM3084a2 = ((long) trackFragment6.f8002i[i112]) + trackFragment6.f8003j[i112];
                            }
                            timestampAdjuster = fragmentedMp4Extractor2.f7908l;
                            if (timestampAdjuster != null) {
                                jM3084a2 = timestampAdjuster.m3084a(jM3084a2);
                            }
                            j4 = jM3084a2;
                            i4 = track.f7987j;
                            if (i4 != 0) {
                                while (true) {
                                    i5 = fragmentedMp4Extractor2.f7892D;
                                    i6 = fragmentedMp4Extractor2.f7891C;
                                    if (i5 < i6) {
                                        break;
                                        break;
                                    }
                                    fragmentedMp4Extractor2.f7892D += trackOutput2.mo3757b(extractorInput2, i6 - i5, false);
                                }
                            } else {
                                bArr = fragmentedMp4Extractor2.f7904h.f6392a;
                                bArr[0] = 0;
                                bArr[1] = 0;
                                bArr[2] = 0;
                                i9 = i4 + 1;
                                i10 = 4 - i4;
                                while (fragmentedMp4Extractor2.f7892D < fragmentedMp4Extractor2.f7891C) {
                                    i11 = fragmentedMp4Extractor2.f7893E;
                                    if (i11 == 0) {
                                        extractorInput2.readFully(bArr, i10, i9);
                                        fragmentedMp4Extractor2.f7904h.m3194D(0);
                                        iM3201f = fragmentedMp4Extractor2.f7904h.m3201f();
                                        if (iM3201f >= i15) {
                                            throw new ParserException("Invalid NAL length");
                                        }
                                        fragmentedMp4Extractor2.f7893E = iM3201f - 1;
                                        fragmentedMp4Extractor2.f7903g.m3194D(0);
                                        trackOutput2.mo3758c(fragmentedMp4Extractor2.f7903g, 4);
                                        trackOutput2.mo3758c(fragmentedMp4Extractor2.f7904h, i15);
                                        if (fragmentedMp4Extractor2.f7897I.length > 0) {
                                            str3 = track.f7983f.f6934q;
                                            b2 = bArr[4];
                                            byte[] bArr4 = NalUnitUtil.f6368a;
                                            if ((!"video/avc".equals(str3) && (b2 & 31) == c2) || ("video/hevc".equals(str3) && ((b2 & 126) >> i15) == 39)) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                        } else {
                                            z4 = false;
                                        }
                                        fragmentedMp4Extractor2.f7894F = z4;
                                        fragmentedMp4Extractor2.f7892D += 5;
                                        fragmentedMp4Extractor2.f7891C += i10;
                                    } else {
                                        if (fragmentedMp4Extractor2.f7894F) {
                                            fragmentedMp4Extractor2.f7905i.m3221z(i11);
                                            extractorInput2.readFully(fragmentedMp4Extractor2.f7905i.f6392a, 0, fragmentedMp4Extractor2.f7893E);
                                            trackOutput2.mo3758c(fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7893E);
                                            iMo3757b = fragmentedMp4Extractor2.f7893E;
                                            ParsableByteArray parsableByteArray6 = fragmentedMp4Extractor2.f7905i;
                                            int iM3176e3 = NalUnitUtil.m3176e(parsableByteArray6.f6392a, parsableByteArray6.f6394c);
                                            fragmentedMp4Extractor2.f7905i.m3194D("video/hevc".equals(track.f7983f.f6934q) ? 1 : 0);
                                            fragmentedMp4Extractor2.f7905i.m3193C(iM3176e3);
                                            C1095a.m2394j(j4, fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7897I);
                                        } else {
                                            iMo3757b = trackOutput2.mo3757b(extractorInput2, i11, false);
                                        }
                                        fragmentedMp4Extractor2.f7892D += iMo3757b;
                                        fragmentedMp4Extractor2.f7893E -= iMo3757b;
                                        c2 = 6;
                                        i15 = 1;
                                    }
                                }
                            }
                            if (!bVar.f7936l) {
                                i7 = bVar.f7928d.f8018g[bVar.f7930f];
                            } else if (bVar.f7926b.f8004k[bVar.f7930f]) {
                                i7 = 1;
                            } else {
                                i7 = 0;
                            }
                            if (bVar.m3827b() != null) {
                                i7 |= 1073741824;
                            }
                            int i113 = i7;
                            trackEncryptionBoxM3827b = bVar.m3827b();
                            if (trackEncryptionBoxM3827b != null) {
                                aVar = trackEncryptionBoxM3827b.f7991c;
                            } else {
                                aVar = null;
                            }
                            trackOutput2.mo3759d(j4, i113, fragmentedMp4Extractor2.f7891C, 0, aVar);
                            while (!fragmentedMp4Extractor2.f7912p.isEmpty()) {
                                aVarRemoveFirst = fragmentedMp4Extractor2.f7912p.removeFirst();
                                fragmentedMp4Extractor2.f7920x -= aVarRemoveFirst.f7924b;
                                jM3084a3 = aVarRemoveFirst.f7923a + j4;
                                timestampAdjuster2 = fragmentedMp4Extractor2.f7908l;
                                if (timestampAdjuster2 != null) {
                                    jM3084a3 = timestampAdjuster2.m3084a(jM3084a3);
                                }
                                trackOutput2Arr = fragmentedMp4Extractor2.f7896H;
                                i8 = 0;
                                while (i8 < length) {
                                    trackOutput2Arr[i8].mo3759d(jM3084a3, 1, aVarRemoveFirst.f7924b, fragmentedMp4Extractor2.f7920x, null);
                                    i8++;
                                }
                            }
                            if (!bVar.m3828c()) {
                                fragmentedMp4Extractor2.f7890B = null;
                            }
                            fragmentedMp4Extractor2.f7914r = 3;
                            i15 = 1;
                        } else {
                            if (bVar.f7936l) {
                                i12 = bVar.f7928d.f8015d[bVar.f7930f];
                            } else {
                                i12 = bVar.f7926b.f8001h[bVar.f7930f];
                            }
                            fragmentedMp4Extractor2.f7891C = i12;
                            if (bVar.f7930f < bVar.f7933i) {
                                extractorInput2.mo3737l(i12);
                                trackEncryptionBoxM3827b2 = bVar.m3827b();
                                if (trackEncryptionBoxM3827b2 != null) {
                                    parsableByteArray = bVar.f7926b.f8008o;
                                    i13 = trackEncryptionBoxM3827b2.f7992d;
                                    if (i13 != 0) {
                                        parsableByteArray.m3195E(i13);
                                    }
                                    trackFragment = bVar.f7926b;
                                    int i114 = bVar.f7930f;
                                    if (trackFragment.f8005l) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        parsableByteArray.m3195E(parsableByteArray.m3219x() * 6);
                                    }
                                }
                                if (!bVar.m3828c()) {
                                    fragmentedMp4Extractor2.f7890B = null;
                                }
                                fragmentedMp4Extractor2.f7914r = 3;
                            } else {
                                if (bVar.f7928d.f8012a.f7984g == 1) {
                                    fragmentedMp4Extractor2.f7891C = i12 - 8;
                                    extractorInput2.mo3737l(8);
                                }
                                if ("audio/ac4".equals(bVar.f7928d.f8012a.f7983f.f6934q)) {
                                    fragmentedMp4Extractor2.f7892D = bVar.m3829d(fragmentedMp4Extractor2.f7891C, 7);
                                    Ac4Util.m3556a(fragmentedMp4Extractor2.f7891C, fragmentedMp4Extractor2.f7907k);
                                    bVar.f7925a.mo3758c(fragmentedMp4Extractor2.f7907k, 7);
                                    fragmentedMp4Extractor2.f7892D += 7;
                                } else {
                                    fragmentedMp4Extractor2.f7892D = bVar.m3829d(fragmentedMp4Extractor2.f7891C, 0);
                                }
                                fragmentedMp4Extractor2.f7891C += fragmentedMp4Extractor2.f7892D;
                                fragmentedMp4Extractor2.f7914r = 4;
                                fragmentedMp4Extractor2.f7893E = 0;
                                trackSampleTable = bVar.f7928d;
                                track = trackSampleTable.f8012a;
                                trackOutput2 = bVar.f7925a;
                                if (bVar.f7936l) {
                                    jM3084a2 = trackSampleTable.f8017f[bVar.f7930f];
                                } else {
                                    TrackFragment trackFragment7 = bVar.f7926b;
                                    int i115 = bVar.f7930f;
                                    jM3084a2 = ((long) trackFragment7.f8002i[i115]) + trackFragment7.f8003j[i115];
                                }
                                timestampAdjuster = fragmentedMp4Extractor2.f7908l;
                                if (timestampAdjuster != null) {
                                    jM3084a2 = timestampAdjuster.m3084a(jM3084a2);
                                }
                                j4 = jM3084a2;
                                i4 = track.f7987j;
                                if (i4 != 0) {
                                    while (true) {
                                        i5 = fragmentedMp4Extractor2.f7892D;
                                        i6 = fragmentedMp4Extractor2.f7891C;
                                        if (i5 < i6) {
                                            break;
                                            break;
                                        }
                                        fragmentedMp4Extractor2.f7892D += trackOutput2.mo3757b(extractorInput2, i6 - i5, false);
                                    }
                                } else {
                                    bArr = fragmentedMp4Extractor2.f7904h.f6392a;
                                    bArr[0] = 0;
                                    bArr[1] = 0;
                                    bArr[2] = 0;
                                    i9 = i4 + 1;
                                    i10 = 4 - i4;
                                    while (fragmentedMp4Extractor2.f7892D < fragmentedMp4Extractor2.f7891C) {
                                        i11 = fragmentedMp4Extractor2.f7893E;
                                        if (i11 == 0) {
                                            extractorInput2.readFully(bArr, i10, i9);
                                            fragmentedMp4Extractor2.f7904h.m3194D(0);
                                            iM3201f = fragmentedMp4Extractor2.f7904h.m3201f();
                                            if (iM3201f >= i15) {
                                                throw new ParserException("Invalid NAL length");
                                            }
                                            fragmentedMp4Extractor2.f7893E = iM3201f - 1;
                                            fragmentedMp4Extractor2.f7903g.m3194D(0);
                                            trackOutput2.mo3758c(fragmentedMp4Extractor2.f7903g, 4);
                                            trackOutput2.mo3758c(fragmentedMp4Extractor2.f7904h, i15);
                                            if (fragmentedMp4Extractor2.f7897I.length > 0) {
                                                str3 = track.f7983f.f6934q;
                                                b2 = bArr[4];
                                                byte[] bArr5 = NalUnitUtil.f6368a;
                                                if ((!"video/avc".equals(str3) && (b2 & 31) == c2) || ("video/hevc".equals(str3) && ((b2 & 126) >> i15) == 39)) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                            } else {
                                                z4 = false;
                                            }
                                            fragmentedMp4Extractor2.f7894F = z4;
                                            fragmentedMp4Extractor2.f7892D += 5;
                                            fragmentedMp4Extractor2.f7891C += i10;
                                        } else {
                                            if (fragmentedMp4Extractor2.f7894F) {
                                                fragmentedMp4Extractor2.f7905i.m3221z(i11);
                                                extractorInput2.readFully(fragmentedMp4Extractor2.f7905i.f6392a, 0, fragmentedMp4Extractor2.f7893E);
                                                trackOutput2.mo3758c(fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7893E);
                                                iMo3757b = fragmentedMp4Extractor2.f7893E;
                                                ParsableByteArray parsableByteArray7 = fragmentedMp4Extractor2.f7905i;
                                                int iM3176e4 = NalUnitUtil.m3176e(parsableByteArray7.f6392a, parsableByteArray7.f6394c);
                                                fragmentedMp4Extractor2.f7905i.m3194D("video/hevc".equals(track.f7983f.f6934q) ? 1 : 0);
                                                fragmentedMp4Extractor2.f7905i.m3193C(iM3176e4);
                                                C1095a.m2394j(j4, fragmentedMp4Extractor2.f7905i, fragmentedMp4Extractor2.f7897I);
                                            } else {
                                                iMo3757b = trackOutput2.mo3757b(extractorInput2, i11, false);
                                            }
                                            fragmentedMp4Extractor2.f7892D += iMo3757b;
                                            fragmentedMp4Extractor2.f7893E -= iMo3757b;
                                            c2 = 6;
                                            i15 = 1;
                                        }
                                    }
                                }
                                if (!bVar.f7936l) {
                                    i7 = bVar.f7928d.f8018g[bVar.f7930f];
                                } else if (bVar.f7926b.f8004k[bVar.f7930f]) {
                                    i7 = 1;
                                } else {
                                    i7 = 0;
                                }
                                if (bVar.m3827b() != null) {
                                    i7 |= 1073741824;
                                }
                                int i116 = i7;
                                trackEncryptionBoxM3827b = bVar.m3827b();
                                if (trackEncryptionBoxM3827b != null) {
                                    aVar = trackEncryptionBoxM3827b.f7991c;
                                } else {
                                    aVar = null;
                                }
                                trackOutput2.mo3759d(j4, i116, fragmentedMp4Extractor2.f7891C, 0, aVar);
                                while (!fragmentedMp4Extractor2.f7912p.isEmpty()) {
                                    aVarRemoveFirst = fragmentedMp4Extractor2.f7912p.removeFirst();
                                    fragmentedMp4Extractor2.f7920x -= aVarRemoveFirst.f7924b;
                                    jM3084a3 = aVarRemoveFirst.f7923a + j4;
                                    timestampAdjuster2 = fragmentedMp4Extractor2.f7908l;
                                    if (timestampAdjuster2 != null) {
                                        jM3084a3 = timestampAdjuster2.m3084a(jM3084a3);
                                    }
                                    trackOutput2Arr = fragmentedMp4Extractor2.f7896H;
                                    i8 = 0;
                                    while (i8 < length) {
                                        trackOutput2Arr[i8].mo3759d(jM3084a3, 1, aVarRemoveFirst.f7924b, fragmentedMp4Extractor2.f7920x, null);
                                        i8++;
                                    }
                                }
                                if (!bVar.m3828c()) {
                                    fragmentedMp4Extractor2.f7890B = null;
                                }
                                fragmentedMp4Extractor2.f7914r = 3;
                                i15 = 1;
                            }
                        }
                    }
                    if (i15 != 0) {
                        return 0;
                    }
                } else {
                    int size3 = fragmentedMp4Extractor2.f7902f.size();
                    b bVarValueAt2 = null;
                    for (int i20 = 0; i20 < size3; i20++) {
                        TrackFragment trackFragment8 = fragmentedMp4Extractor2.f7902f.valueAt(i20).f7926b;
                        if (trackFragment8.f8009p) {
                            long j7 = trackFragment8.f7996c;
                            if (j7 < j5) {
                                bVarValueAt2 = fragmentedMp4Extractor2.f7902f.valueAt(i20);
                                j5 = j7;
                            }
                        }
                    }
                    if (bVarValueAt2 == null) {
                        fragmentedMp4Extractor2.f7914r = 3;
                    } else {
                        int iMo3740p2 = (int) (j5 - extractorInput.mo3740p());
                        if (iMo3740p2 < 0) {
                            throw new ParserException("Offset to encryption data was negative.");
                        }
                        extractorInput2.mo3737l(iMo3740p2);
                        TrackFragment trackFragment9 = bVarValueAt2.f7926b;
                        ParsableByteArray parsableByteArray8 = trackFragment9.f8008o;
                        extractorInput2.readFully(parsableByteArray8.f6392a, 0, parsableByteArray8.f6394c);
                        trackFragment9.f8008o.m3194D(0);
                        trackFragment9.f8009p = false;
                    }
                }
                fragmentedMp4Extractor = fragmentedMp4Extractor2;
            } else {
                int i21 = ((int) fragmentedMp4Extractor2.f7916t) - fragmentedMp4Extractor2.f7917u;
                ParsableByteArray parsableByteArray9 = fragmentedMp4Extractor2.f7918v;
                if (parsableByteArray9 != null) {
                    extractorInput2.readFully(parsableByteArray9.f6392a, 8, i21);
                    Atom.b bVar3 = new Atom.b(fragmentedMp4Extractor2.f7915s, parsableByteArray9);
                    long jMo3740p3 = extractorInput.mo3740p();
                    if (fragmentedMp4Extractor2.f7911o.isEmpty()) {
                        int i22 = bVar3.f7853a;
                        if (i22 == 1936286840) {
                            ParsableByteArray parsableByteArray10 = bVar3.f7857b;
                            parsableByteArray10.m3194D(8);
                            int iM3201f2 = (parsableByteArray10.m3201f() >> 24) & 255;
                            parsableByteArray10.m3195E(4);
                            long jM3215t2 = parsableByteArray10.m3215t();
                            if (iM3201f2 == 0) {
                                jM3218w = parsableByteArray10.m3215t();
                                jM3218w2 = parsableByteArray10.m3215t();
                            } else {
                                jM3218w = parsableByteArray10.m3218w();
                                jM3218w2 = parsableByteArray10.m3218w();
                            }
                            long j8 = jM3218w;
                            long j9 = jMo3740p3 + jM3218w2;
                            long jM3104M3 = Util6.m3104M(j8, 1000000L, jM3215t2);
                            parsableByteArray10.m3195E(2);
                            int iM3219x = parsableByteArray10.m3219x();
                            int[] iArr = new int[iM3219x];
                            long[] jArr = new long[iM3219x];
                            long[] jArr2 = new long[iM3219x];
                            long[] jArr3 = new long[iM3219x];
                            long j10 = j8;
                            long j11 = jM3104M3;
                            int i23 = 0;
                            while (i23 < iM3219x) {
                                int iM3201f3 = parsableByteArray10.m3201f();
                                if ((iM3201f3 & Integer.MIN_VALUE) != 0) {
                                    throw new ParserException("Unhandled indirect reference");
                                }
                                long jM3215t3 = parsableByteArray10.m3215t();
                                iArr[i23] = iM3201f3 & Integer.MAX_VALUE;
                                jArr[i23] = j9;
                                jArr3[i23] = j11;
                                long j12 = j10 + jM3215t3;
                                int i24 = iM3219x;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int[] iArr2 = iArr;
                                long jM3104M4 = Util6.m3104M(j12, 1000000L, jM3215t2);
                                jArr4[i23] = jM3104M4 - jArr5[i23];
                                parsableByteArray10.m3195E(4);
                                j9 += (long) iArr2[i23];
                                i23++;
                                iArr = iArr2;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                jArr = jArr;
                                iM3219x = i24;
                                j10 = j12;
                                j11 = jM3104M4;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM3104M3), new ChunkIndex(iArr, jArr, jArr2, jArr3));
                            fragmentedMp4Extractor = this;
                            fragmentedMp4Extractor.f7889A = ((Long) pairCreate.first).longValue();
                            fragmentedMp4Extractor.f7895G.mo3772a((SeekMap) pairCreate.second);
                            fragmentedMp4Extractor.f7898J = true;
                        } else {
                            fragmentedMp4Extractor = fragmentedMp4Extractor2;
                            if (i22 == 1701671783) {
                                ParsableByteArray parsableByteArray11 = bVar3.f7857b;
                                if (fragmentedMp4Extractor.f7896H.length != 0) {
                                    parsableByteArray11.m3194D(8);
                                    int iM3201f4 = (parsableByteArray11.m3201f() >> 24) & 255;
                                    if (iM3201f4 == 0) {
                                        String strM3209n = parsableByteArray11.m3209n();
                                        Objects.requireNonNull(strM3209n);
                                        String strM3209n2 = parsableByteArray11.m3209n();
                                        Objects.requireNonNull(strM3209n2);
                                        long jM3215t4 = parsableByteArray11.m3215t();
                                        jM3104M = Util6.m3104M(parsableByteArray11.m3215t(), 1000000L, jM3215t4);
                                        long j13 = fragmentedMp4Extractor.f7889A;
                                        long j14 = j13 != -9223372036854775807L ? j13 + jM3104M : -9223372036854775807L;
                                        str = strM3209n;
                                        str2 = strM3209n2;
                                        jM3104M2 = Util6.m3104M(parsableByteArray11.m3215t(), 1000L, jM3215t4);
                                        jM3215t = parsableByteArray11.m3215t();
                                        jM3084a = j14;
                                    } else if (iM3201f4 != 1) {
                                        outline.m1565P("Skipping unsupported emsg version: ", iM3201f4, "FragmentedMp4Extractor");
                                    } else {
                                        long jM3215t5 = parsableByteArray11.m3215t();
                                        long jM3104M5 = Util6.m3104M(parsableByteArray11.m3218w(), 1000000L, jM3215t5);
                                        long jM3104M6 = Util6.m3104M(parsableByteArray11.m3215t(), 1000L, jM3215t5);
                                        long jM3215t6 = parsableByteArray11.m3215t();
                                        String strM3209n3 = parsableByteArray11.m3209n();
                                        Objects.requireNonNull(strM3209n3);
                                        String strM3209n4 = parsableByteArray11.m3209n();
                                        Objects.requireNonNull(strM3209n4);
                                        str = strM3209n3;
                                        str2 = strM3209n4;
                                        jM3104M2 = jM3104M6;
                                        jM3215t = jM3215t6;
                                        jM3084a = jM3104M5;
                                        jM3104M = -9223372036854775807L;
                                    }
                                    byte[] bArr6 = new byte[parsableByteArray11.m3196a()];
                                    int iM3196a = parsableByteArray11.m3196a();
                                    System.arraycopy(parsableByteArray11.f6392a, parsableByteArray11.f6393b, bArr6, 0, iM3196a);
                                    parsableByteArray11.f6393b += iM3196a;
                                    ParsableByteArray parsableByteArray12 = new ParsableByteArray(fragmentedMp4Extractor.f7909m.m4021a(new EventMessage(str, str2, jM3104M2, jM3215t, bArr6)));
                                    int iM3196a2 = parsableByteArray12.m3196a();
                                    for (TrackOutput2 trackOutput3 : fragmentedMp4Extractor.f7896H) {
                                        parsableByteArray12.m3194D(0);
                                        trackOutput3.mo3758c(parsableByteArray12, iM3196a2);
                                    }
                                    if (jM3084a == -9223372036854775807L) {
                                        fragmentedMp4Extractor.f7912p.addLast(new a(jM3104M, iM3196a2));
                                        fragmentedMp4Extractor.f7920x += iM3196a2;
                                    } else {
                                        TimestampAdjuster timestampAdjuster3 = fragmentedMp4Extractor.f7908l;
                                        if (timestampAdjuster3 != null) {
                                            jM3084a = timestampAdjuster3.m3084a(jM3084a);
                                        }
                                        for (TrackOutput2 trackOutput4 : fragmentedMp4Extractor.f7896H) {
                                            trackOutput4.mo3759d(jM3084a, 1, iM3196a2, 0, null);
                                        }
                                    }
                                }
                            }
                        }
                        extractorInput2 = extractorInput;
                    } else {
                        fragmentedMp4Extractor2.f7911o.peek().f7855c.add(bVar3);
                        fragmentedMp4Extractor = fragmentedMp4Extractor2;
                    }
                } else {
                    fragmentedMp4Extractor = fragmentedMp4Extractor2;
                    extractorInput2.mo3737l(i21);
                }
                fragmentedMp4Extractor.m3825j(extractorInput.mo3740p());
            }
            fragmentedMp4Extractor2 = fragmentedMp4Extractor;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: f */
    public void mo3751f(ExtractorOutput extractorOutput) {
        int i;
        this.f7895G = extractorOutput;
        m3823b();
        TrackOutput2[] trackOutput2Arr = new TrackOutput2[2];
        this.f7896H = trackOutput2Arr;
        TrackOutput2 trackOutput2 = this.f7913q;
        if (trackOutput2 != null) {
            trackOutput2Arr[0] = trackOutput2;
            i = 1;
        } else {
            i = 0;
        }
        int i2 = 100;
        if ((this.f7899c & 4) != 0) {
            trackOutput2Arr[i] = this.f7895G.mo3774o(100, 5);
            i2 = 101;
            i++;
        }
        TrackOutput2[] trackOutput2Arr2 = (TrackOutput2[]) Util6.m3100I(this.f7896H, i);
        this.f7896H = trackOutput2Arr2;
        for (TrackOutput2 trackOutput3 : trackOutput2Arr2) {
            trackOutput3.mo3760e(f7888b);
        }
        this.f7897I = new TrackOutput2[this.f7901e.size()];
        int i3 = 0;
        while (i3 < this.f7897I.length) {
            TrackOutput2 trackOutput2Mo3774o = this.f7895G.mo3774o(i2, 3);
            trackOutput2Mo3774o.mo3760e(this.f7901e.get(i3));
            this.f7897I[i3] = trackOutput2Mo3774o;
            i3++;
            i2++;
        }
        Track track = this.f7900d;
        if (track != null) {
            this.f7902f.put(0, new b(extractorOutput.mo3774o(0, track.f7979b), new TrackSampleTable(this.f7900d, new long[0], new int[0], 0, new long[0], new int[0], 0L), new DefaultSampleValues(0, 0, 0, 0)));
            this.f7895G.mo3773j();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    /* JADX INFO: renamed from: g */
    public void mo3752g(long j2, long j3) {
        int size = this.f7902f.size();
        for (int i = 0; i < size; i++) {
            this.f7902f.valueAt(i).m3830e();
        }
        this.f7912p.clear();
        this.f7920x = 0;
        this.f7921y = j3;
        this.f7911o.clear();
        m3823b();
    }

    /* JADX WARN: Code duplicated, block: B:149:0x038d  */
    /* JADX WARN: Code duplicated, block: B:152:0x03a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:157:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:158:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:162:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:165:0x03da  */
    /* JADX WARN: Code duplicated, block: B:167:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:171:0x0411  */
    /* JADX WARN: Code duplicated, block: B:172:0x0421  */
    /* JADX WARN: Code duplicated, block: B:178:0x0435  */
    /* JADX WARN: Code duplicated, block: B:290:0x06d9  */
    /* JADX INFO: renamed from: j */
    public final void m3825j(long j2) throws ParserException {
        FragmentedMp4Extractor fragmentedMp4Extractor;
        byte[] bArr;
        SparseArray<b> sparseArray;
        Atom.a aVar;
        int i;
        int i2;
        int i3;
        int i4;
        byte[] bArr2;
        byte[] bArr3;
        int i5;
        TrackFragment trackFragment;
        b bVar;
        int i6;
        long jM3104M;
        int[] iArr;
        long[] jArr;
        boolean[] zArr;
        b bVar2;
        boolean z;
        int i7;
        long j3;
        int[] iArr2;
        long j4;
        int i8;
        int iM3201f;
        int iM3201f2;
        int iM3201f3;
        b bVar3;
        boolean z2;
        FragmentedMp4Extractor fragmentedMp4Extractor2 = this;
        final FragmentedMp4Extractor fragmentedMp4Extractor3 = fragmentedMp4Extractor2;
        while (!fragmentedMp4Extractor3.f7911o.isEmpty() && fragmentedMp4Extractor3.f7911o.peek().f7854b == j2) {
            Atom.a aVarPop = fragmentedMp4Extractor3.f7911o.pop();
            int i9 = aVarPop.f7853a;
            int i10 = 12;
            if (i9 == 1836019574) {
                C2096e.m4571g(fragmentedMp4Extractor3.f7900d == null, "Unexpected moov box.");
                DrmInitData drmInitDataM3821h = m3821h(aVarPop.f7855c);
                Atom.a aVarM3809b = aVarPop.m3809b(1836475768);
                Objects.requireNonNull(aVarM3809b);
                SparseArray<DefaultSampleValues> sparseArray2 = new SparseArray<>();
                int size = aVarM3809b.f7855c.size();
                long jM3215t = -9223372036854775807L;
                int i11 = 0;
                while (i11 < size) {
                    Atom.b bVar4 = aVarM3809b.f7855c.get(i11);
                    int i12 = bVar4.f7853a;
                    if (i12 == 1953654136) {
                        ParsableByteArray parsableByteArray = bVar4.f7857b;
                        parsableByteArray.m3194D(i10);
                        Pair pairCreate = Pair.create(Integer.valueOf(parsableByteArray.m3201f()), new DefaultSampleValues(parsableByteArray.m3201f() - 1, parsableByteArray.m3201f(), parsableByteArray.m3201f(), parsableByteArray.m3201f()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (DefaultSampleValues) pairCreate.second);
                    } else {
                        if (i12 == 1835362404) {
                            ParsableByteArray parsableByteArray2 = bVar4.f7857b;
                            parsableByteArray2.m3194D(8);
                            jM3215t = ((parsableByteArray2.m3201f() >> 24) & 255) == 0 ? parsableByteArray2.m3215t() : parsableByteArray2.m3218w();
                        }
                        i11++;
                        i10 = 12;
                    }
                    i11++;
                    i10 = 12;
                }
                ArrayList arrayList = (ArrayList) AtomParsers.m3815e(aVarPop, new GaplessInfoHolder(), jM3215t, drmInitDataM3821h, (fragmentedMp4Extractor3.f7899c & 16) != 0, false, new Function() { // from class: c.n.b.b.s1.k0.c
                    @Override // p007c.p190n.p378c.p379a.Function
                    public final Object apply(Object obj) {
                        Track track = (Track) obj;
                        Objects.requireNonNull(this.f7852a);
                        return track;
                    }
                });
                int size2 = arrayList.size();
                if (fragmentedMp4Extractor3.f7902f.size() == 0) {
                    for (int i13 = 0; i13 < size2; i13++) {
                        TrackSampleTable trackSampleTable = (TrackSampleTable) arrayList.get(i13);
                        Track track = trackSampleTable.f8012a;
                        fragmentedMp4Extractor3.f7902f.put(track.f7978a, new b(fragmentedMp4Extractor3.f7895G.mo3774o(i13, track.f7979b), trackSampleTable, fragmentedMp4Extractor3.m3824d(sparseArray2, track.f7978a)));
                        fragmentedMp4Extractor3.f7922z = Math.max(fragmentedMp4Extractor3.f7922z, track.f7982e);
                    }
                    fragmentedMp4Extractor3.f7895G.mo3773j();
                } else {
                    C2096e.m4570f(fragmentedMp4Extractor3.f7902f.size() == size2);
                    for (int i14 = 0; i14 < size2; i14++) {
                        TrackSampleTable trackSampleTable2 = (TrackSampleTable) arrayList.get(i14);
                        Track track2 = trackSampleTable2.f8012a;
                        b bVar5 = fragmentedMp4Extractor3.f7902f.get(track2.f7978a);
                        DefaultSampleValues defaultSampleValuesM3824d = fragmentedMp4Extractor3.m3824d(sparseArray2, track2.f7978a);
                        bVar5.f7928d = trackSampleTable2;
                        bVar5.f7929e = defaultSampleValuesM3824d;
                        bVar5.f7925a.mo3760e(trackSampleTable2.f8012a.f7983f);
                        bVar5.m3830e();
                    }
                }
                fragmentedMp4Extractor = fragmentedMp4Extractor2;
            } else {
                int i15 = 8;
                if (i9 == 1836019558) {
                    SparseArray<b> sparseArray3 = fragmentedMp4Extractor3.f7902f;
                    int i16 = fragmentedMp4Extractor3.f7899c;
                    byte[] bArr4 = fragmentedMp4Extractor3.f7906j;
                    int size3 = aVarPop.f7856d.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Atom.a aVar2 = aVarPop.f7856d.get(i17);
                        if (aVar2.f7853a == 1953653094) {
                            Atom.b bVarM3810c = aVar2.m3810c(1952868452);
                            Objects.requireNonNull(bVarM3810c);
                            ParsableByteArray parsableByteArray3 = bVarM3810c.f7857b;
                            parsableByteArray3.m3194D(i15);
                            int iM3201f4 = parsableByteArray3.m3201f() & 16777215;
                            b bVarValueAt = sparseArray3.size() == 1 ? sparseArray3.valueAt(0) : sparseArray3.get(parsableByteArray3.m3201f());
                            if (bVarValueAt == null) {
                                bVarValueAt = null;
                            } else {
                                if ((iM3201f4 & 1) != 0) {
                                    long jM3218w = parsableByteArray3.m3218w();
                                    TrackFragment trackFragment2 = bVarValueAt.f7926b;
                                    trackFragment2.f7995b = jM3218w;
                                    trackFragment2.f7996c = jM3218w;
                                }
                                DefaultSampleValues defaultSampleValues = bVarValueAt.f7929e;
                                bVarValueAt.f7926b.f7994a = new DefaultSampleValues((iM3201f4 & 2) != 0 ? parsableByteArray3.m3201f() - 1 : defaultSampleValues.f7883a, (iM3201f4 & 8) != 0 ? parsableByteArray3.m3201f() : defaultSampleValues.f7884b, (iM3201f4 & 16) != 0 ? parsableByteArray3.m3201f() : defaultSampleValues.f7885c, (iM3201f4 & 32) != 0 ? parsableByteArray3.m3201f() : defaultSampleValues.f7886d);
                            }
                            if (bVarValueAt == null) {
                                bArr = bArr4;
                                sparseArray = sparseArray3;
                                aVar = aVarPop;
                                i = i16;
                                i2 = size3;
                                i3 = i17;
                            } else {
                                TrackFragment trackFragment3 = bVarValueAt.f7926b;
                                long j5 = trackFragment3.f8010q;
                                boolean z3 = trackFragment3.f8011r;
                                bVarValueAt.m3830e();
                                bVarValueAt.f7936l = true;
                                Atom.b bVarM3810c2 = aVar2.m3810c(1952867444);
                                if (bVarM3810c2 == null || (i16 & 2) != 0) {
                                    trackFragment3.f8010q = j5;
                                    trackFragment3.f8011r = z3;
                                } else {
                                    ParsableByteArray parsableByteArray4 = bVarM3810c2.f7857b;
                                    parsableByteArray4.m3194D(i15);
                                    trackFragment3.f8010q = ((parsableByteArray4.m3201f() >> 24) & 255) == 1 ? parsableByteArray4.m3218w() : parsableByteArray4.m3215t();
                                    trackFragment3.f8011r = true;
                                }
                                List<Atom.b> list = aVar2.f7855c;
                                int size4 = list.size();
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = 0;
                                while (true) {
                                    i4 = 1953658222;
                                    if (i18 >= size4) {
                                        break;
                                    }
                                    SparseArray<b> sparseArray4 = sparseArray3;
                                    Atom.b bVar6 = list.get(i18);
                                    int i21 = size3;
                                    if (bVar6.f7853a == 1953658222) {
                                        ParsableByteArray parsableByteArray5 = bVar6.f7857b;
                                        parsableByteArray5.m3194D(12);
                                        int iM3217v = parsableByteArray5.m3217v();
                                        if (iM3217v > 0) {
                                            i20 += iM3217v;
                                            i19++;
                                        }
                                    }
                                    i18++;
                                    size3 = i21;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                i2 = size3;
                                bVarValueAt.f7932h = 0;
                                bVarValueAt.f7931g = 0;
                                bVarValueAt.f7930f = 0;
                                TrackFragment trackFragment4 = bVarValueAt.f7926b;
                                trackFragment4.f7997d = i19;
                                trackFragment4.f7998e = i20;
                                if (trackFragment4.f8000g.length < i19) {
                                    trackFragment4.f7999f = new long[i19];
                                    trackFragment4.f8000g = new int[i19];
                                }
                                if (trackFragment4.f8001h.length < i20) {
                                    int i22 = (i20 * 125) / 100;
                                    trackFragment4.f8001h = new int[i22];
                                    trackFragment4.f8002i = new int[i22];
                                    trackFragment4.f8003j = new long[i22];
                                    trackFragment4.f8004k = new boolean[i22];
                                    trackFragment4.f8006m = new boolean[i22];
                                }
                                int i23 = 0;
                                int i24 = 0;
                                int i25 = 0;
                                while (i23 < size4) {
                                    Atom.b bVar7 = list.get(i23);
                                    if (bVar7.f7853a == i4) {
                                        int i26 = i24 + 1;
                                        ParsableByteArray parsableByteArray6 = bVar7.f7857b;
                                        parsableByteArray6.m3194D(8);
                                        int iM3201f5 = parsableByteArray6.m3201f() & 16777215;
                                        Track track3 = bVarValueAt.f7928d.f8012a;
                                        TrackFragment trackFragment5 = bVarValueAt.f7926b;
                                        DefaultSampleValues defaultSampleValues2 = trackFragment5.f7994a;
                                        int i27 = Util6.f6307a;
                                        trackFragment5.f8000g[i24] = parsableByteArray6.m3217v();
                                        long[] jArr2 = trackFragment5.f7999f;
                                        jArr2[i24] = trackFragment5.f7995b;
                                        if ((iM3201f5 & 1) != 0) {
                                            jArr2[i24] = jArr2[i24] + ((long) parsableByteArray6.m3201f());
                                        }
                                        boolean z4 = (iM3201f5 & 4) != 0;
                                        int iM3201f6 = defaultSampleValues2.f7886d;
                                        if (z4) {
                                            iM3201f6 = parsableByteArray6.m3201f();
                                        }
                                        boolean z5 = (iM3201f5 & 256) != 0;
                                        boolean z6 = (iM3201f5 & 512) != 0;
                                        boolean z7 = (iM3201f5 & 1024) != 0;
                                        boolean z8 = (iM3201f5 & 2048) != 0;
                                        long[] jArr3 = track3.f7985h;
                                        if (jArr3 != null) {
                                            i6 = iM3201f6;
                                            trackFragment = trackFragment3;
                                            if (jArr3.length == 1 && jArr3[0] == 0) {
                                                z8 = z8;
                                                jM3104M = Util6.m3104M(track3.f7986i[0], 1000000L, track3.f7980c);
                                            }
                                            iArr = trackFragment5.f8001h;
                                            int[] iArr3 = trackFragment5.f8002i;
                                            jArr = trackFragment5.f8003j;
                                            zArr = trackFragment5.f8004k;
                                            bVar2 = bVarValueAt;
                                            if (track3.f7979b == 2 || (i16 & 1) == 0) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            i7 = trackFragment5.f8000g[i24] + i25;
                                            j3 = track3.f7980c;
                                            boolean z9 = z;
                                            iArr2 = iArr3;
                                            j4 = trackFragment5.f8010q;
                                            i8 = i25;
                                            while (i8 < i7) {
                                                if (z5) {
                                                    iM3201f = parsableByteArray6.m3201f();
                                                } else {
                                                    iM3201f = defaultSampleValues2.f7884b;
                                                }
                                                m3820a(iM3201f);
                                                if (z6) {
                                                    iM3201f2 = parsableByteArray6.m3201f();
                                                } else {
                                                    iM3201f2 = defaultSampleValues2.f7885c;
                                                }
                                                m3820a(iM3201f2);
                                                if (z7) {
                                                    iM3201f3 = parsableByteArray6.m3201f();
                                                } else if (i8 == 0 || !z4) {
                                                    iM3201f3 = defaultSampleValues2.f7886d;
                                                } else {
                                                    iM3201f3 = i6;
                                                }
                                                if (z8) {
                                                    iArr2[i8] = (int) ((((long) parsableByteArray6.m3201f()) * 1000000) / j3);
                                                } else {
                                                    iArr2[i8] = 0;
                                                }
                                                jArr[i8] = Util6.m3104M(j4, 1000000L, j3) - jM3104M;
                                                if (trackFragment5.f8011r) {
                                                    bVar3 = bVar2;
                                                } else {
                                                    bVar3 = bVar2;
                                                    jArr[i8] = jArr[i8] + bVar3.f7928d.f8019h;
                                                }
                                                iArr[i8] = iM3201f2;
                                                if (((iM3201f3 >> 16) & 1) == 0 || (z9 && i8 != 0)) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                zArr[i8] = z2;
                                                j4 += (long) iM3201f;
                                                i8++;
                                                i7 = i7;
                                                iArr2 = iArr2;
                                                z5 = z5;
                                                z6 = z6;
                                                z4 = z4;
                                                parsableByteArray6 = parsableByteArray6;
                                                defaultSampleValues2 = defaultSampleValues2;
                                                bVar2 = bVar3;
                                                z8 = z8;
                                            }
                                            bVar = bVar2;
                                            int i28 = i7;
                                            trackFragment5.f8010q = j4;
                                            i24 = i26;
                                            i25 = i28;
                                        } else {
                                            i6 = iM3201f6;
                                            trackFragment = trackFragment3;
                                        }
                                        jM3104M = 0;
                                        iArr = trackFragment5.f8001h;
                                        int[] iArr4 = trackFragment5.f8002i;
                                        jArr = trackFragment5.f8003j;
                                        zArr = trackFragment5.f8004k;
                                        bVar2 = bVarValueAt;
                                        if (track3.f7979b == 2) {
                                            z = false;
                                        } else {
                                            z = false;
                                        }
                                        i7 = trackFragment5.f8000g[i24] + i25;
                                        j3 = track3.f7980c;
                                        boolean z10 = z;
                                        iArr2 = iArr4;
                                        j4 = trackFragment5.f8010q;
                                        i8 = i25;
                                        while (i8 < i7) {
                                            if (z5) {
                                                iM3201f = parsableByteArray6.m3201f();
                                            } else {
                                                iM3201f = defaultSampleValues2.f7884b;
                                            }
                                            m3820a(iM3201f);
                                            if (z6) {
                                                iM3201f2 = parsableByteArray6.m3201f();
                                            } else {
                                                iM3201f2 = defaultSampleValues2.f7885c;
                                            }
                                            m3820a(iM3201f2);
                                            if (z7) {
                                                iM3201f3 = parsableByteArray6.m3201f();
                                            } else if (i8 == 0) {
                                                iM3201f3 = defaultSampleValues2.f7886d;
                                            } else {
                                                iM3201f3 = defaultSampleValues2.f7886d;
                                            }
                                            if (z8) {
                                                iArr2[i8] = (int) ((((long) parsableByteArray6.m3201f()) * 1000000) / j3);
                                            } else {
                                                iArr2[i8] = 0;
                                            }
                                            jArr[i8] = Util6.m3104M(j4, 1000000L, j3) - jM3104M;
                                            if (trackFragment5.f8011r) {
                                                bVar3 = bVar2;
                                                jArr[i8] = jArr[i8] + bVar3.f7928d.f8019h;
                                            } else {
                                                bVar3 = bVar2;
                                            }
                                            iArr[i8] = iM3201f2;
                                            if (((iM3201f3 >> 16) & 1) == 0) {
                                                z2 = false;
                                            } else {
                                                z2 = false;
                                            }
                                            zArr[i8] = z2;
                                            j4 += (long) iM3201f;
                                            i8++;
                                            i7 = i7;
                                            iArr2 = iArr2;
                                            z5 = z5;
                                            z6 = z6;
                                            z4 = z4;
                                            parsableByteArray6 = parsableByteArray6;
                                            defaultSampleValues2 = defaultSampleValues2;
                                            bVar2 = bVar3;
                                            z8 = z8;
                                        }
                                        bVar = bVar2;
                                        int i29 = i7;
                                        trackFragment5.f8010q = j4;
                                        i24 = i26;
                                        i25 = i29;
                                    } else {
                                        bArr4 = bArr4;
                                        i23 = i23;
                                        aVarPop = aVarPop;
                                        trackFragment = trackFragment3;
                                        bVar = bVarValueAt;
                                    }
                                    i23++;
                                    i4 = 1953658222;
                                    bVarValueAt = bVar;
                                    list = list;
                                    size4 = size4;
                                    i17 = i17;
                                    aVar2 = aVar2;
                                    aVarPop = aVarPop;
                                    bArr4 = bArr4;
                                    trackFragment3 = trackFragment;
                                    i16 = i16;
                                }
                                byte[] bArr5 = bArr4;
                                aVar = aVarPop;
                                i = i16;
                                i3 = i17;
                                TrackFragment trackFragment6 = trackFragment3;
                                Track track4 = bVarValueAt.f7928d.f8012a;
                                DefaultSampleValues defaultSampleValues3 = trackFragment6.f7994a;
                                Objects.requireNonNull(defaultSampleValues3);
                                TrackEncryptionBox trackEncryptionBoxM3841a = track4.m3841a(defaultSampleValues3.f7883a);
                                Atom.b bVarM3810c3 = aVar2.m3810c(1935763834);
                                if (bVarM3810c3 != null) {
                                    Objects.requireNonNull(trackEncryptionBoxM3841a);
                                    ParsableByteArray parsableByteArray7 = bVarM3810c3.f7857b;
                                    int i30 = trackEncryptionBoxM3841a.f7992d;
                                    parsableByteArray7.m3194D(8);
                                    if ((parsableByteArray7.m3201f() & 16777215 & 1) == 1) {
                                        parsableByteArray7.m3195E(8);
                                    }
                                    int iM3214s = parsableByteArray7.m3214s();
                                    int iM3217v2 = parsableByteArray7.m3217v();
                                    if (iM3217v2 > trackFragment6.f7998e) {
                                        StringBuilder sbM1557H = outline.m1557H("Saiz sample count ", iM3217v2, " is greater than fragment sample count");
                                        sbM1557H.append(trackFragment6.f7998e);
                                        throw new ParserException(sbM1557H.toString());
                                    }
                                    if (iM3214s == 0) {
                                        boolean[] zArr2 = trackFragment6.f8006m;
                                        i5 = 0;
                                        for (int i31 = 0; i31 < iM3217v2; i31++) {
                                            int iM3214s2 = parsableByteArray7.m3214s();
                                            i5 += iM3214s2;
                                            zArr2[i31] = iM3214s2 > i30;
                                        }
                                    } else {
                                        i5 = (iM3214s * iM3217v2) + 0;
                                        Arrays.fill(trackFragment6.f8006m, 0, iM3217v2, iM3214s > i30);
                                    }
                                    Arrays.fill(trackFragment6.f8006m, iM3217v2, trackFragment6.f7998e, false);
                                    if (i5 > 0) {
                                        ParsableByteArray parsableByteArray8 = trackFragment6.f8008o;
                                        byte[] bArr6 = parsableByteArray8.f6392a;
                                        if (bArr6.length < i5) {
                                            bArr6 = new byte[i5];
                                        }
                                        parsableByteArray8.m3192B(bArr6, i5);
                                        trackFragment6.f8005l = true;
                                        trackFragment6.f8009p = true;
                                    }
                                }
                                Atom.b bVarM3810c4 = aVar2.m3810c(1935763823);
                                if (bVarM3810c4 != null) {
                                    ParsableByteArray parsableByteArray9 = bVarM3810c4.f7857b;
                                    parsableByteArray9.m3194D(8);
                                    int iM3201f7 = parsableByteArray9.m3201f();
                                    if ((16777215 & iM3201f7 & 1) == 1) {
                                        parsableByteArray9.m3195E(8);
                                    }
                                    int iM3217v3 = parsableByteArray9.m3217v();
                                    if (iM3217v3 != 1) {
                                        throw new ParserException(outline.m1590l("Unexpected saio entry count: ", iM3217v3));
                                    }
                                    trackFragment6.f7996c += ((iM3201f7 >> 24) & 255) == 0 ? parsableByteArray9.m3215t() : parsableByteArray9.m3218w();
                                }
                                Atom.b bVarM3810c5 = aVar2.m3810c(1936027235);
                                if (bVarM3810c5 != null) {
                                    m3822i(bVarM3810c5.f7857b, 0, trackFragment6);
                                }
                                String str = trackEncryptionBoxM3841a != null ? trackEncryptionBoxM3841a.f7990b : null;
                                ParsableByteArray parsableByteArray10 = null;
                                ParsableByteArray parsableByteArray11 = null;
                                for (int i32 = 0; i32 < aVar2.f7855c.size(); i32++) {
                                    Atom.b bVar8 = aVar2.f7855c.get(i32);
                                    ParsableByteArray parsableByteArray12 = bVar8.f7857b;
                                    int i33 = bVar8.f7853a;
                                    if (i33 == 1935828848) {
                                        parsableByteArray12.m3194D(12);
                                        if (parsableByteArray12.m3201f() == 1936025959) {
                                            parsableByteArray10 = parsableByteArray12;
                                        }
                                    } else if (i33 == 1936158820) {
                                        parsableByteArray12.m3194D(12);
                                        if (parsableByteArray12.m3201f() == 1936025959) {
                                            parsableByteArray11 = parsableByteArray12;
                                        }
                                    }
                                }
                                if (parsableByteArray10 != null && parsableByteArray11 != null) {
                                    parsableByteArray10.m3194D(8);
                                    int iM3201f8 = (parsableByteArray10.m3201f() >> 24) & 255;
                                    parsableByteArray10.m3195E(4);
                                    if (iM3201f8 == 1) {
                                        parsableByteArray10.m3195E(4);
                                    }
                                    if (parsableByteArray10.m3201f() != 1) {
                                        throw new ParserException("Entry count in sbgp != 1 (unsupported).");
                                    }
                                    parsableByteArray11.m3194D(8);
                                    int iM3201f9 = (parsableByteArray11.m3201f() >> 24) & 255;
                                    parsableByteArray11.m3195E(4);
                                    if (iM3201f9 == 1) {
                                        if (parsableByteArray11.m3215t() == 0) {
                                            throw new ParserException("Variable length description in sgpd found (unsupported)");
                                        }
                                    } else if (iM3201f9 >= 2) {
                                        parsableByteArray11.m3195E(4);
                                    }
                                    if (parsableByteArray11.m3215t() != 1) {
                                        throw new ParserException("Entry count in sgpd != 1 (unsupported).");
                                    }
                                    parsableByteArray11.m3195E(1);
                                    int iM3214s3 = parsableByteArray11.m3214s();
                                    int i34 = (iM3214s3 & 240) >> 4;
                                    int i35 = iM3214s3 & 15;
                                    boolean z11 = parsableByteArray11.m3214s() == 1;
                                    if (z11) {
                                        int iM3214s4 = parsableByteArray11.m3214s();
                                        byte[] bArr7 = new byte[16];
                                        System.arraycopy(parsableByteArray11.f6392a, parsableByteArray11.f6393b, bArr7, 0, 16);
                                        parsableByteArray11.f6393b += 16;
                                        if (iM3214s4 == 0) {
                                            int iM3214s5 = parsableByteArray11.m3214s();
                                            byte[] bArr8 = new byte[iM3214s5];
                                            System.arraycopy(parsableByteArray11.f6392a, parsableByteArray11.f6393b, bArr8, 0, iM3214s5);
                                            parsableByteArray11.f6393b += iM3214s5;
                                            bArr3 = bArr8;
                                        } else {
                                            bArr3 = null;
                                        }
                                        trackFragment6.f8005l = true;
                                        trackFragment6.f8007n = new TrackEncryptionBox(z11, str, iM3214s4, bArr7, i34, i35, bArr3);
                                    }
                                }
                                int size5 = aVar2.f7855c.size();
                                int i36 = 0;
                                while (i36 < size5) {
                                    Atom.b bVar9 = aVar2.f7855c.get(i36);
                                    if (bVar9.f7853a == 1970628964) {
                                        ParsableByteArray parsableByteArray13 = bVar9.f7857b;
                                        parsableByteArray13.m3194D(8);
                                        bArr2 = bArr5;
                                        System.arraycopy(parsableByteArray13.f6392a, parsableByteArray13.f6393b, bArr2, 0, 16);
                                        parsableByteArray13.f6393b += 16;
                                        if (Arrays.equals(bArr2, f7887a)) {
                                            m3822i(parsableByteArray13, 16, trackFragment6);
                                        }
                                    } else {
                                        bArr2 = bArr5;
                                    }
                                    i36++;
                                    bArr5 = bArr2;
                                }
                                bArr = bArr5;
                            }
                        } else {
                            bArr = bArr4;
                            sparseArray = sparseArray3;
                            aVar = aVarPop;
                            i = i16;
                            i2 = size3;
                            i3 = i17;
                        }
                        i17 = i3 + 1;
                        i15 = 8;
                        bArr4 = bArr;
                        size3 = i2;
                        sparseArray3 = sparseArray;
                        aVarPop = aVar;
                        i16 = i;
                    }
                    DrmInitData drmInitDataM3821h2 = m3821h(aVarPop.f7855c);
                    fragmentedMp4Extractor = this;
                    if (drmInitDataM3821h2 != null) {
                        int size6 = fragmentedMp4Extractor.f7902f.size();
                        for (int i37 = 0; i37 < size6; i37++) {
                            b bVarValueAt2 = fragmentedMp4Extractor.f7902f.valueAt(i37);
                            Track track5 = bVarValueAt2.f7928d.f8012a;
                            DefaultSampleValues defaultSampleValues4 = bVarValueAt2.f7926b.f7994a;
                            int i38 = Util6.f6307a;
                            TrackEncryptionBox trackEncryptionBoxM3841a2 = track5.m3841a(defaultSampleValues4.f7883a);
                            DrmInitData drmInitDataM3687a = drmInitDataM3821h2.m3687a(trackEncryptionBoxM3841a2 != null ? trackEncryptionBoxM3841a2.f7990b : null);
                            Format.b bVarM3515a = bVarValueAt2.f7928d.f8012a.f7983f.m3515a();
                            bVarM3515a.f6961n = drmInitDataM3687a;
                            bVarValueAt2.f7925a.mo3760e(bVarM3515a.m3519a());
                        }
                    }
                    if (fragmentedMp4Extractor.f7921y != -9223372036854775807L) {
                        int size7 = fragmentedMp4Extractor.f7902f.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            b bVarValueAt3 = fragmentedMp4Extractor.f7902f.valueAt(i39);
                            long j6 = fragmentedMp4Extractor.f7921y;
                            int i40 = bVarValueAt3.f7930f;
                            while (true) {
                                TrackFragment trackFragment7 = bVarValueAt3.f7926b;
                                if (i40 >= trackFragment7.f7998e || trackFragment7.f8003j[i40] + ((long) trackFragment7.f8002i[i40]) >= j6) {
                                    break;
                                }
                                if (trackFragment7.f8004k[i40]) {
                                    bVarValueAt3.f7933i = i40;
                                }
                                i40++;
                            }
                        }
                        fragmentedMp4Extractor.f7921y = -9223372036854775807L;
                    }
                    fragmentedMp4Extractor3 = fragmentedMp4Extractor;
                } else {
                    fragmentedMp4Extractor = fragmentedMp4Extractor2;
                    if (!fragmentedMp4Extractor3.f7911o.isEmpty()) {
                        fragmentedMp4Extractor3.f7911o.peek().f7856d.add(aVarPop);
                    }
                }
            }
            fragmentedMp4Extractor2 = fragmentedMp4Extractor;
        }
        m3823b();
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.Extractor
    public void release() {
    }

    public FragmentedMp4Extractor(int i) {
        this(i, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster) {
        this(i, timestampAdjuster, null, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster, Track track) {
        this(i, timestampAdjuster, track, Collections.emptyList());
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster, Track track, List<Format> list) {
        this(i, timestampAdjuster, track, list, null);
    }

    public FragmentedMp4Extractor(int i, TimestampAdjuster timestampAdjuster, Track track, List<Format> list, TrackOutput2 trackOutput2) {
        this.f7899c = i;
        this.f7908l = timestampAdjuster;
        this.f7900d = track;
        this.f7901e = Collections.unmodifiableList(list);
        this.f7913q = trackOutput2;
        this.f7909m = new EventMessageEncoder();
        this.f7910n = new ParsableByteArray(16);
        this.f7903g = new ParsableByteArray(NalUnitUtil.f6368a);
        this.f7904h = new ParsableByteArray(5);
        this.f7905i = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.f7906j = bArr;
        this.f7907k = new ParsableByteArray(bArr);
        this.f7911o = new ArrayDeque<>();
        this.f7912p = new ArrayDeque<>();
        this.f7902f = new SparseArray<>();
        this.f7922z = -9223372036854775807L;
        this.f7921y = -9223372036854775807L;
        this.f7889A = -9223372036854775807L;
        this.f7895G = ExtractorOutput.f7809b;
        this.f7896H = new TrackOutput2[0];
        this.f7897I = new TrackOutput2[0];
    }
}
