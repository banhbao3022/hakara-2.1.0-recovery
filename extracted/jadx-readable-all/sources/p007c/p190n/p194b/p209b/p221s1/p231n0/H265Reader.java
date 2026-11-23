package p007c.p190n.p194b.p209b.p221s1.p231n0;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.CodecSpecificDataUtil;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableNalUnitBitArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.s, reason: use source file name */
/* JADX INFO: compiled from: H265Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class H265Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final SeiReader f8365a;

    /* JADX INFO: renamed from: b */
    public String f8366b;

    /* JADX INFO: renamed from: c */
    public TrackOutput2 f8367c;

    /* JADX INFO: renamed from: d */
    public a f8368d;

    /* JADX INFO: renamed from: e */
    public boolean f8369e;

    /* JADX INFO: renamed from: l */
    public long f8376l;

    /* JADX INFO: renamed from: m */
    public long f8377m;

    /* JADX INFO: renamed from: f */
    public final boolean[] f8370f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final NalUnitTargetBuffer f8371g = new NalUnitTargetBuffer(32, 128);

    /* JADX INFO: renamed from: h */
    public final NalUnitTargetBuffer f8372h = new NalUnitTargetBuffer(33, 128);

    /* JADX INFO: renamed from: i */
    public final NalUnitTargetBuffer f8373i = new NalUnitTargetBuffer(34, 128);

    /* JADX INFO: renamed from: j */
    public final NalUnitTargetBuffer f8374j = new NalUnitTargetBuffer(39, 128);

    /* JADX INFO: renamed from: k */
    public final NalUnitTargetBuffer f8375k = new NalUnitTargetBuffer(40, 128);

    /* JADX INFO: renamed from: n */
    public final ParsableByteArray f8378n = new ParsableByteArray();

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.s$a */
    /* JADX INFO: compiled from: H265Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final TrackOutput2 f8379a;

        /* JADX INFO: renamed from: b */
        public long f8380b;

        /* JADX INFO: renamed from: c */
        public boolean f8381c;

        /* JADX INFO: renamed from: d */
        public int f8382d;

        /* JADX INFO: renamed from: e */
        public long f8383e;

        /* JADX INFO: renamed from: f */
        public boolean f8384f;

        /* JADX INFO: renamed from: g */
        public boolean f8385g;

        /* JADX INFO: renamed from: h */
        public boolean f8386h;

        /* JADX INFO: renamed from: i */
        public boolean f8387i;

        /* JADX INFO: renamed from: j */
        public boolean f8388j;

        /* JADX INFO: renamed from: k */
        public long f8389k;

        /* JADX INFO: renamed from: l */
        public long f8390l;

        /* JADX INFO: renamed from: m */
        public boolean f8391m;

        public a(TrackOutput2 trackOutput2) {
            this.f8379a = trackOutput2;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: a */
        public final void m3897a(int i) {
            boolean z = this.f8391m;
            this.f8379a.mo3759d(this.f8390l, z ? 1 : 0, (int) (this.f8380b - this.f8389k), i, null);
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.f8365a = seiReader;
    }

    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: a */
    public final void m3896a(byte[] bArr, int i, int i2) {
        a aVar = this.f8368d;
        if (aVar.f8384f) {
            int i3 = aVar.f8382d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                aVar.f8385g = (bArr[i4] & 128) != 0;
                aVar.f8384f = false;
            } else {
                aVar.f8382d = (i2 - i) + i3;
            }
        }
        if (!this.f8369e) {
            this.f8371g.m3900a(bArr, i, i2);
            this.f8372h.m3900a(bArr, i, i2);
            this.f8373i.m3900a(bArr, i, i2);
        }
        this.f8374j.m3900a(bArr, i, i2);
        this.f8375k.m3900a(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:156:0x031e  */
    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        long j2;
        long j3;
        C2096e.m4572h(this.f8367c);
        int i = Util6.f6307a;
        while (parsableByteArray.m3196a() > 0) {
            int i2 = parsableByteArray.f6393b;
            int i3 = parsableByteArray.f6394c;
            byte[] bArr = parsableByteArray.f6392a;
            this.f8376l += (long) parsableByteArray.m3196a();
            this.f8367c.mo3758c(parsableByteArray, parsableByteArray.m3196a());
            while (i2 < i3) {
                int iM3173b = NalUnitUtil.m3173b(bArr, i2, i3, this.f8370f);
                if (iM3173b == i3) {
                    m3896a(bArr, i2, i3);
                    return;
                }
                int i4 = iM3173b + 3;
                int i5 = (bArr[i4] & 126) >> 1;
                int i6 = iM3173b - i2;
                if (i6 > 0) {
                    m3896a(bArr, i2, iM3173b);
                }
                int i7 = i3 - iM3173b;
                long j4 = this.f8376l - ((long) i7);
                int i8 = i6 < 0 ? -i6 : 0;
                long j5 = this.f8377m;
                a aVar = this.f8368d;
                boolean z = this.f8369e;
                if (aVar.f8388j && aVar.f8385g) {
                    aVar.f8391m = aVar.f8381c;
                    aVar.f8388j = false;
                } else if (aVar.f8386h || aVar.f8385g) {
                    if (z && aVar.f8387i) {
                        aVar.m3897a(((int) (j4 - aVar.f8380b)) + i7);
                    }
                    aVar.f8389k = aVar.f8380b;
                    aVar.f8390l = aVar.f8383e;
                    aVar.f8391m = aVar.f8381c;
                    aVar.f8387i = true;
                }
                if (this.f8369e) {
                    j4 = j4;
                    j2 = j5;
                } else {
                    this.f8371g.m3901b(i8);
                    this.f8372h.m3901b(i8);
                    this.f8373i.m3901b(i8);
                    NalUnitTargetBuffer nalUnitTargetBuffer = this.f8371g;
                    if (nalUnitTargetBuffer.f8433c) {
                        NalUnitTargetBuffer nalUnitTargetBuffer2 = this.f8372h;
                        if (nalUnitTargetBuffer2.f8433c) {
                            NalUnitTargetBuffer nalUnitTargetBuffer3 = this.f8373i;
                            if (nalUnitTargetBuffer3.f8433c) {
                                TrackOutput2 trackOutput2 = this.f8367c;
                                String str = this.f8366b;
                                int i9 = nalUnitTargetBuffer.f8435e;
                                byte[] bArr2 = new byte[nalUnitTargetBuffer2.f8435e + i9 + nalUnitTargetBuffer3.f8435e];
                                System.arraycopy(nalUnitTargetBuffer.f8434d, 0, bArr2, 0, i9);
                                System.arraycopy(nalUnitTargetBuffer2.f8434d, 0, bArr2, nalUnitTargetBuffer.f8435e, nalUnitTargetBuffer2.f8435e);
                                System.arraycopy(nalUnitTargetBuffer3.f8434d, 0, bArr2, nalUnitTargetBuffer.f8435e + nalUnitTargetBuffer2.f8435e, nalUnitTargetBuffer3.f8435e);
                                ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(nalUnitTargetBuffer2.f8434d, 0, nalUnitTargetBuffer2.f8435e);
                                parsableNalUnitBitArray.m3232k(44);
                                int iM3226e = parsableNalUnitBitArray.m3226e(3);
                                parsableNalUnitBitArray.m3231j();
                                parsableNalUnitBitArray.m3232k(88);
                                parsableNalUnitBitArray.m3232k(8);
                                int i10 = 0;
                                for (int i11 = 0; i11 < iM3226e; i11++) {
                                    if (parsableNalUnitBitArray.m3225d()) {
                                        i10 += 89;
                                    }
                                    if (parsableNalUnitBitArray.m3225d()) {
                                        i10 += 8;
                                    }
                                }
                                parsableNalUnitBitArray.m3232k(i10);
                                if (iM3226e > 0) {
                                    parsableNalUnitBitArray.m3232k((8 - iM3226e) * 2);
                                }
                                parsableNalUnitBitArray.m3227f();
                                int iM3227f = parsableNalUnitBitArray.m3227f();
                                if (iM3227f == 3) {
                                    parsableNalUnitBitArray.m3231j();
                                }
                                int iM3227f2 = parsableNalUnitBitArray.m3227f();
                                int iM3227f3 = parsableNalUnitBitArray.m3227f();
                                if (parsableNalUnitBitArray.m3225d()) {
                                    int iM3227f4 = parsableNalUnitBitArray.m3227f();
                                    int iM3227f5 = parsableNalUnitBitArray.m3227f();
                                    int iM3227f6 = parsableNalUnitBitArray.m3227f();
                                    int iM3227f7 = parsableNalUnitBitArray.m3227f();
                                    iM3227f2 -= (iM3227f4 + iM3227f5) * ((iM3227f == 1 || iM3227f == 2) ? 2 : 1);
                                    iM3227f3 -= (iM3227f6 + iM3227f7) * (iM3227f == 1 ? 2 : 1);
                                }
                                parsableNalUnitBitArray.m3227f();
                                parsableNalUnitBitArray.m3227f();
                                int iM3227f8 = parsableNalUnitBitArray.m3227f();
                                for (int i12 = parsableNalUnitBitArray.m3225d() ? 0 : iM3226e; i12 <= iM3226e; i12++) {
                                    parsableNalUnitBitArray.m3227f();
                                    parsableNalUnitBitArray.m3227f();
                                    parsableNalUnitBitArray.m3227f();
                                }
                                parsableNalUnitBitArray.m3227f();
                                parsableNalUnitBitArray.m3227f();
                                parsableNalUnitBitArray.m3227f();
                                parsableNalUnitBitArray.m3227f();
                                parsableNalUnitBitArray.m3227f();
                                parsableNalUnitBitArray.m3227f();
                                if (parsableNalUnitBitArray.m3225d() && parsableNalUnitBitArray.m3225d()) {
                                    int i13 = 0;
                                    for (int i14 = 4; i13 < i14; i14 = 4) {
                                        int i15 = 0;
                                        while (i15 < 6) {
                                            if (parsableNalUnitBitArray.m3225d()) {
                                                int iMin = Math.min(64, 1 << ((i13 << 1) + 4));
                                                if (i13 > 1) {
                                                    parsableNalUnitBitArray.m3228g();
                                                }
                                                for (int i16 = 0; i16 < iMin; i16++) {
                                                    parsableNalUnitBitArray.m3228g();
                                                }
                                            } else {
                                                parsableNalUnitBitArray.m3227f();
                                            }
                                            i15 += i13 == 3 ? 3 : 1;
                                            j5 = j5;
                                        }
                                        i13++;
                                    }
                                }
                                j2 = j5;
                                parsableNalUnitBitArray.m3232k(2);
                                if (parsableNalUnitBitArray.m3225d()) {
                                    parsableNalUnitBitArray.m3232k(8);
                                    parsableNalUnitBitArray.m3227f();
                                    parsableNalUnitBitArray.m3227f();
                                    parsableNalUnitBitArray.m3231j();
                                }
                                int i17 = 0;
                                boolean zM3225d = false;
                                int i18 = 0;
                                for (int iM3227f9 = parsableNalUnitBitArray.m3227f(); i17 < iM3227f9; iM3227f9 = iM3227f9) {
                                    if (i17 != 0) {
                                        zM3225d = parsableNalUnitBitArray.m3225d();
                                    }
                                    if (zM3225d) {
                                        parsableNalUnitBitArray.m3231j();
                                        parsableNalUnitBitArray.m3227f();
                                        for (int i19 = 0; i19 <= i18; i19++) {
                                            if (parsableNalUnitBitArray.m3225d()) {
                                                parsableNalUnitBitArray.m3231j();
                                            }
                                        }
                                    } else {
                                        int iM3227f10 = parsableNalUnitBitArray.m3227f();
                                        int iM3227f11 = parsableNalUnitBitArray.m3227f();
                                        int i20 = iM3227f10 + iM3227f11;
                                        for (int i21 = 0; i21 < iM3227f10; i21++) {
                                            parsableNalUnitBitArray.m3227f();
                                            parsableNalUnitBitArray.m3231j();
                                        }
                                        for (int i22 = 0; i22 < iM3227f11; i22++) {
                                            parsableNalUnitBitArray.m3227f();
                                            parsableNalUnitBitArray.m3231j();
                                        }
                                        i18 = i20;
                                    }
                                    i17++;
                                }
                                if (parsableNalUnitBitArray.m3225d()) {
                                    for (int i23 = 0; i23 < parsableNalUnitBitArray.m3227f(); i23++) {
                                        parsableNalUnitBitArray.m3232k(iM3227f8 + 4 + 1);
                                    }
                                }
                                parsableNalUnitBitArray.m3232k(2);
                                float f = 1.0f;
                                if (parsableNalUnitBitArray.m3225d()) {
                                    if (parsableNalUnitBitArray.m3225d()) {
                                        int iM3226e2 = parsableNalUnitBitArray.m3226e(8);
                                        if (iM3226e2 == 255) {
                                            int iM3226e3 = parsableNalUnitBitArray.m3226e(16);
                                            int iM3226e4 = parsableNalUnitBitArray.m3226e(16);
                                            if (iM3226e3 != 0 && iM3226e4 != 0) {
                                                f = iM3226e3 / iM3226e4;
                                            }
                                        } else {
                                            float[] fArr = NalUnitUtil.f6369b;
                                            if (iM3226e2 < fArr.length) {
                                                f = fArr[iM3226e2];
                                            } else {
                                                outline.m1565P("Unexpected aspect_ratio_idc value: ", iM3226e2, "H265Reader");
                                            }
                                        }
                                    }
                                    if (parsableNalUnitBitArray.m3225d()) {
                                        parsableNalUnitBitArray.m3231j();
                                    }
                                    if (parsableNalUnitBitArray.m3225d()) {
                                        parsableNalUnitBitArray.m3232k(4);
                                        if (parsableNalUnitBitArray.m3225d()) {
                                            parsableNalUnitBitArray.m3232k(24);
                                        }
                                    }
                                    if (parsableNalUnitBitArray.m3225d()) {
                                        parsableNalUnitBitArray.m3227f();
                                        parsableNalUnitBitArray.m3227f();
                                    }
                                    parsableNalUnitBitArray.m3231j();
                                    if (parsableNalUnitBitArray.m3225d()) {
                                        iM3227f3 *= 2;
                                    }
                                }
                                parsableNalUnitBitArray.m3229h(nalUnitTargetBuffer2.f8434d, 0, nalUnitTargetBuffer2.f8435e);
                                parsableNalUnitBitArray.m3232k(24);
                                String strM3090b = CodecSpecificDataUtil.m3090b(parsableNalUnitBitArray);
                                Format.b bVar = new Format.b();
                                bVar.f6948a = str;
                                bVar.f6958k = "video/hevc";
                                bVar.f6955h = strM3090b;
                                bVar.f6963p = iM3227f2;
                                bVar.f6964q = iM3227f3;
                                bVar.f6967t = f;
                                bVar.f6960m = Collections.singletonList(bArr2);
                                trackOutput2.mo3760e(bVar.m3519a());
                                this.f8369e = true;
                            } else {
                                j4 = j4;
                                j2 = j5;
                            }
                        } else {
                            j4 = j4;
                            j2 = j5;
                        }
                    } else {
                        j4 = j4;
                        j2 = j5;
                    }
                }
                if (this.f8374j.m3901b(i8)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer4 = this.f8374j;
                    this.f8378n.m3192B(this.f8374j.f8434d, NalUnitUtil.m3176e(nalUnitTargetBuffer4.f8434d, nalUnitTargetBuffer4.f8435e));
                    this.f8378n.m3195E(5);
                    j3 = j2;
                    C1095a.m2394j(j3, this.f8378n, this.f8365a.f8131b);
                } else {
                    j3 = j2;
                }
                if (this.f8375k.m3901b(i8)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer5 = this.f8375k;
                    this.f8378n.m3192B(this.f8375k.f8434d, NalUnitUtil.m3176e(nalUnitTargetBuffer5.f8434d, nalUnitTargetBuffer5.f8435e));
                    this.f8378n.m3195E(5);
                    C1095a.m2394j(j3, this.f8378n, this.f8365a.f8131b);
                }
                long j6 = this.f8377m;
                a aVar2 = this.f8368d;
                boolean z2 = this.f8369e;
                aVar2.f8385g = false;
                aVar2.f8386h = false;
                aVar2.f8383e = j6;
                aVar2.f8382d = 0;
                aVar2.f8380b = j4;
                if (!(i5 < 32 || i5 == 40)) {
                    if (aVar2.f8387i && !aVar2.f8388j) {
                        if (z2) {
                            aVar2.m3897a(i7);
                        }
                        aVar2.f8387i = false;
                    }
                    if ((32 <= i5 && i5 <= 35) || i5 == 39) {
                        aVar2.f8386h = !aVar2.f8388j;
                        aVar2.f8388j = true;
                    }
                }
                boolean z3 = i5 >= 16 && i5 <= 21;
                aVar2.f8381c = z3;
                aVar2.f8384f = z3 || i5 <= 9;
                if (!this.f8369e) {
                    this.f8371g.m3903d(i5);
                    this.f8372h.m3903d(i5);
                    this.f8373i.m3903d(i5);
                }
                this.f8374j.m3903d(i5);
                this.f8375k.m3903d(i5);
                i3 = i3;
                bArr = bArr;
                i2 = i4;
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8376l = 0L;
        NalUnitUtil.m3172a(this.f8370f);
        this.f8371g.m3902c();
        this.f8372h.m3902c();
        this.f8373i.m3902c();
        this.f8374j.m3902c();
        this.f8375k.m3902c();
        a aVar = this.f8368d;
        if (aVar != null) {
            aVar.f8384f = false;
            aVar.f8385g = false;
            aVar.f8386h = false;
            aVar.f8387i = false;
            aVar.f8388j = false;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8366b = dVar.m3879b();
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 2);
        this.f8367c = trackOutput2Mo3774o;
        this.f8368d = new a(trackOutput2Mo3774o);
        this.f8365a.m3869a(extractorOutput, dVar);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8377m = j2;
    }
}
