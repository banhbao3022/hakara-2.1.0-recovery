package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.q, reason: use source file name */
/* JADX INFO: compiled from: H263Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class H263Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public static final float[] f8290a = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: b */
    public final UserDataReader f8291b;

    /* JADX INFO: renamed from: c */
    public final ParsableByteArray f8292c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f8293d;

    /* JADX INFO: renamed from: e */
    public final a f8294e;

    /* JADX INFO: renamed from: f */
    public final NalUnitTargetBuffer f8295f;

    /* JADX INFO: renamed from: g */
    public b f8296g;

    /* JADX INFO: renamed from: h */
    public long f8297h;

    /* JADX INFO: renamed from: i */
    public String f8298i;

    /* JADX INFO: renamed from: j */
    public TrackOutput2 f8299j;

    /* JADX INFO: renamed from: k */
    public boolean f8300k;

    /* JADX INFO: renamed from: l */
    public long f8301l;

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.q$a */
    /* JADX INFO: compiled from: H263Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final byte[] f8302a = {0, 0, 1};

        /* JADX INFO: renamed from: b */
        public boolean f8303b;

        /* JADX INFO: renamed from: c */
        public int f8304c;

        /* JADX INFO: renamed from: d */
        public int f8305d;

        /* JADX INFO: renamed from: e */
        public int f8306e;

        /* JADX INFO: renamed from: f */
        public byte[] f8307f;

        public a(int i) {
            this.f8307f = new byte[i];
        }

        /* JADX INFO: renamed from: a */
        public void m3892a(byte[] bArr, int i, int i2) {
            if (this.f8303b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f8307f;
                int length = bArr2.length;
                int i4 = this.f8305d;
                if (length < i4 + i3) {
                    this.f8307f = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f8307f, this.f8305d, i3);
                this.f8305d += i3;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m3893b() {
            this.f8303b = false;
            this.f8305d = 0;
            this.f8304c = 0;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.q$b */
    /* JADX INFO: compiled from: H263Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final TrackOutput2 f8308a;

        /* JADX INFO: renamed from: b */
        public boolean f8309b;

        /* JADX INFO: renamed from: c */
        public boolean f8310c;

        /* JADX INFO: renamed from: d */
        public boolean f8311d;

        /* JADX INFO: renamed from: e */
        public int f8312e;

        /* JADX INFO: renamed from: f */
        public int f8313f;

        /* JADX INFO: renamed from: g */
        public long f8314g;

        /* JADX INFO: renamed from: h */
        public long f8315h;

        public b(TrackOutput2 trackOutput2) {
            this.f8308a = trackOutput2;
        }

        /* JADX INFO: renamed from: a */
        public void m3894a(byte[] bArr, int i, int i2) {
            if (this.f8310c) {
                int i3 = this.f8313f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f8313f = (i2 - i) + i3;
                } else {
                    this.f8311d = ((bArr[i4] & 192) >> 6) == 0;
                    this.f8310c = false;
                }
            }
        }
    }

    public H263Reader() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x011e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x012b  */
    /* JADX WARN: Code duplicated, block: B:63:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:70:0x014e  */
    /* JADX WARN: Code duplicated, block: B:73:0x017b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x019f A[LOOP:1: B:79:0x019d->B:80:0x019f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01df  */
    /* JADX WARN: Code duplicated, block: B:97:0x022d  */
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
    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: b */
    public void mo3870b(ParsableByteArray parsableByteArray) {
        int i;
        int i2;
        boolean z;
        ParsableBitArray parsableBitArray;
        int iM3183g;
        float[] fArr;
        float f;
        int iM3183g2;
        int i3;
        int i4;
        int iM3183g3;
        int iM3183g4;
        C2096e.m4572h(this.f8296g);
        C2096e.m4572h(this.f8299j);
        int i5 = parsableByteArray.f6393b;
        int i6 = parsableByteArray.f6394c;
        byte[] bArr = parsableByteArray.f6392a;
        this.f8297h += (long) parsableByteArray.m3196a();
        this.f8299j.mo3758c(parsableByteArray, parsableByteArray.m3196a());
        while (true) {
            int iM3173b = NalUnitUtil.m3173b(bArr, i5, i6, this.f8293d);
            if (iM3173b == i6) {
                if (!this.f8300k) {
                    this.f8294e.m3892a(bArr, i5, i6);
                }
                this.f8296g.m3894a(bArr, i5, i6);
                NalUnitTargetBuffer nalUnitTargetBuffer = this.f8295f;
                if (nalUnitTargetBuffer != null) {
                    nalUnitTargetBuffer.m3900a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iM3173b + 3;
            int i8 = parsableByteArray.f6392a[i7] & 255;
            int i9 = iM3173b - i5;
            if (this.f8300k) {
                i = i6;
            } else {
                if (i9 > 0) {
                    this.f8294e.m3892a(bArr, i5, iM3173b);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                a aVar = this.f8294e;
                int i11 = aVar.f8304c;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    throw new IllegalStateException();
                                }
                                if (i8 == 179 || i8 == 181) {
                                    aVar.f8305d -= i10;
                                    aVar.f8303b = false;
                                    z = true;
                                }
                                if (z) {
                                    TrackOutput2 trackOutput2 = this.f8299j;
                                    a aVar2 = this.f8294e;
                                    int i12 = aVar2.f8306e;
                                    String str = this.f8298i;
                                    Objects.requireNonNull(str);
                                    byte[] bArrCopyOf = Arrays.copyOf(aVar2.f8307f, aVar2.f8305d);
                                    parsableBitArray = new ParsableBitArray(bArrCopyOf);
                                    parsableBitArray.m3190n(i12);
                                    parsableBitArray.m3190n(4);
                                    parsableBitArray.m3188l();
                                    parsableBitArray.m3189m(8);
                                    if (parsableBitArray.m3182f()) {
                                        parsableBitArray.m3189m(4);
                                        parsableBitArray.m3189m(3);
                                    }
                                    iM3183g = parsableBitArray.m3183g(4);
                                    if (iM3183g == 15) {
                                        iM3183g3 = parsableBitArray.m3183g(8);
                                        iM3183g4 = parsableBitArray.m3183g(8);
                                        if (iM3183g4 == 0) {
                                            Log.w("H263Reader", "Invalid aspect ratio");
                                            i = i6;
                                            f = 1.0f;
                                        } else {
                                            f = iM3183g3 / iM3183g4;
                                            i = i6;
                                        }
                                    } else {
                                        fArr = f8290a;
                                        i = i6;
                                        if (iM3183g < fArr.length) {
                                            f = fArr[iM3183g];
                                        } else {
                                            Log.w("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                        }
                                    }
                                    if (parsableBitArray.m3182f()) {
                                        parsableBitArray.m3189m(2);
                                        parsableBitArray.m3189m(1);
                                        if (parsableBitArray.m3182f()) {
                                            parsableBitArray.m3189m(15);
                                            parsableBitArray.m3188l();
                                            parsableBitArray.m3189m(15);
                                            parsableBitArray.m3188l();
                                            parsableBitArray.m3189m(15);
                                            parsableBitArray.m3188l();
                                            parsableBitArray.m3189m(3);
                                            parsableBitArray.m3189m(11);
                                            parsableBitArray.m3188l();
                                            parsableBitArray.m3189m(15);
                                            parsableBitArray.m3188l();
                                        }
                                    }
                                    if (parsableBitArray.m3183g(2) != 0) {
                                        Log.w("H263Reader", "Unhandled video object layer shape");
                                    }
                                    parsableBitArray.m3188l();
                                    iM3183g2 = parsableBitArray.m3183g(16);
                                    parsableBitArray.m3188l();
                                    if (parsableBitArray.m3182f()) {
                                        if (iM3183g2 == 0) {
                                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                                        } else {
                                            i4 = 0;
                                            for (i3 = iM3183g2 - 1; i3 > 0; i3 >>= 1) {
                                                i4++;
                                            }
                                            parsableBitArray.m3189m(i4);
                                        }
                                    }
                                    parsableBitArray.m3188l();
                                    int iM3183g5 = parsableBitArray.m3183g(13);
                                    parsableBitArray.m3188l();
                                    int iM3183g6 = parsableBitArray.m3183g(13);
                                    parsableBitArray.m3188l();
                                    parsableBitArray.m3188l();
                                    Format.b bVar = new Format.b();
                                    bVar.f6948a = str;
                                    bVar.f6958k = "video/mp4v-es";
                                    bVar.f6963p = iM3183g5;
                                    bVar.f6964q = iM3183g6;
                                    bVar.f6967t = f;
                                    bVar.f6960m = Collections.singletonList(bArrCopyOf);
                                    trackOutput2.mo3760e(bVar.m3519a());
                                    this.f8300k = true;
                                } else {
                                    i = i6;
                                }
                            } else if ((i8 & 240) != 32) {
                                Log.w("H263Reader", "Unexpected start code value");
                                aVar.m3893b();
                            } else {
                                aVar.f8306e = aVar.f8305d;
                                aVar.f8304c = 4;
                            }
                        } else if (i8 > 31) {
                            Log.w("H263Reader", "Unexpected start code value");
                            aVar.m3893b();
                        } else {
                            aVar.f8304c = 3;
                        }
                    } else if (i8 != 181) {
                        Log.w("H263Reader", "Unexpected start code value");
                        aVar.m3893b();
                    } else {
                        aVar.f8304c = 2;
                    }
                } else if (i8 == 176) {
                    aVar.f8304c = 1;
                    aVar.f8303b = true;
                }
                byte[] bArr2 = a.f8302a;
                aVar.m3892a(bArr2, 0, bArr2.length);
                z = false;
                if (z) {
                    TrackOutput2 trackOutput3 = this.f8299j;
                    a aVar3 = this.f8294e;
                    int i13 = aVar3.f8306e;
                    String str2 = this.f8298i;
                    Objects.requireNonNull(str2);
                    byte[] bArrCopyOf2 = Arrays.copyOf(aVar3.f8307f, aVar3.f8305d);
                    parsableBitArray = new ParsableBitArray(bArrCopyOf2);
                    parsableBitArray.m3190n(i13);
                    parsableBitArray.m3190n(4);
                    parsableBitArray.m3188l();
                    parsableBitArray.m3189m(8);
                    if (parsableBitArray.m3182f()) {
                        parsableBitArray.m3189m(4);
                        parsableBitArray.m3189m(3);
                    }
                    iM3183g = parsableBitArray.m3183g(4);
                    if (iM3183g == 15) {
                        iM3183g3 = parsableBitArray.m3183g(8);
                        iM3183g4 = parsableBitArray.m3183g(8);
                        if (iM3183g4 == 0) {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            i = i6;
                            f = 1.0f;
                        } else {
                            f = iM3183g3 / iM3183g4;
                            i = i6;
                        }
                    } else {
                        fArr = f8290a;
                        i = i6;
                        if (iM3183g < fArr.length) {
                            f = fArr[iM3183g];
                        } else {
                            Log.w("H263Reader", "Invalid aspect ratio");
                            f = 1.0f;
                        }
                    }
                    if (parsableBitArray.m3182f()) {
                        parsableBitArray.m3189m(2);
                        parsableBitArray.m3189m(1);
                        if (parsableBitArray.m3182f()) {
                            parsableBitArray.m3189m(15);
                            parsableBitArray.m3188l();
                            parsableBitArray.m3189m(15);
                            parsableBitArray.m3188l();
                            parsableBitArray.m3189m(15);
                            parsableBitArray.m3188l();
                            parsableBitArray.m3189m(3);
                            parsableBitArray.m3189m(11);
                            parsableBitArray.m3188l();
                            parsableBitArray.m3189m(15);
                            parsableBitArray.m3188l();
                        }
                    }
                    if (parsableBitArray.m3183g(2) != 0) {
                        Log.w("H263Reader", "Unhandled video object layer shape");
                    }
                    parsableBitArray.m3188l();
                    iM3183g2 = parsableBitArray.m3183g(16);
                    parsableBitArray.m3188l();
                    if (parsableBitArray.m3182f()) {
                        if (iM3183g2 == 0) {
                            Log.w("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            i4 = 0;
                            while (i3 > 0) {
                                i4++;
                            }
                            parsableBitArray.m3189m(i4);
                        }
                    }
                    parsableBitArray.m3188l();
                    int iM3183g7 = parsableBitArray.m3183g(13);
                    parsableBitArray.m3188l();
                    int iM3183g8 = parsableBitArray.m3183g(13);
                    parsableBitArray.m3188l();
                    parsableBitArray.m3188l();
                    Format.b bVar2 = new Format.b();
                    bVar2.f6948a = str2;
                    bVar2.f6958k = "video/mp4v-es";
                    bVar2.f6963p = iM3183g7;
                    bVar2.f6964q = iM3183g8;
                    bVar2.f6967t = f;
                    bVar2.f6960m = Collections.singletonList(bArrCopyOf2);
                    trackOutput3.mo3760e(bVar2.m3519a());
                    this.f8300k = true;
                } else {
                    i = i6;
                }
            }
            this.f8296g.m3894a(bArr, i5, iM3173b);
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.f8295f;
            if (nalUnitTargetBuffer2 != null) {
                if (i9 > 0) {
                    nalUnitTargetBuffer2.m3900a(bArr, i5, iM3173b);
                    i2 = 0;
                } else {
                    i2 = -i9;
                }
                if (this.f8295f.m3901b(i2)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer3 = this.f8295f;
                    int iM3176e = NalUnitUtil.m3176e(nalUnitTargetBuffer3.f8434d, nalUnitTargetBuffer3.f8435e);
                    ParsableByteArray parsableByteArray2 = this.f8292c;
                    int i14 = Util6.f6307a;
                    parsableByteArray2.m3192B(this.f8295f.f8434d, iM3176e);
                    this.f8291b.m3882a(this.f8301l, this.f8292c);
                }
                if (i8 == 178) {
                    if (parsableByteArray.f6392a[iM3173b + 2] == 1) {
                        this.f8295f.m3903d(i8);
                    }
                }
            }
            int i15 = i - iM3173b;
            long j2 = this.f8297h - ((long) i15);
            b bVar3 = this.f8296g;
            boolean z2 = this.f8300k;
            if (bVar3.f8312e == 182 && z2 && bVar3.f8309b) {
                bVar3.f8308a.mo3759d(bVar3.f8315h, bVar3.f8311d ? 1 : 0, (int) (j2 - bVar3.f8314g), i15, null);
            }
            if (bVar3.f8312e != 179) {
                bVar3.f8314g = j2;
            }
            b bVar4 = this.f8296g;
            long j3 = this.f8301l;
            bVar4.f8312e = i8;
            bVar4.f8311d = false;
            bVar4.f8309b = i8 == 182 || i8 == 179;
            bVar4.f8310c = i8 == 182;
            bVar4.f8313f = 0;
            bVar4.f8315h = j3;
            i6 = i;
            i5 = i7;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        NalUnitUtil.m3172a(this.f8293d);
        this.f8294e.m3893b();
        b bVar = this.f8296g;
        if (bVar != null) {
            bVar.f8309b = false;
            bVar.f8310c = false;
            bVar.f8311d = false;
            bVar.f8312e = -1;
        }
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f8295f;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.m3902c();
        }
        this.f8297h = 0L;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8298i = dVar.m3879b();
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 2);
        this.f8299j = trackOutput2Mo3774o;
        this.f8296g = new b(trackOutput2Mo3774o);
        UserDataReader userDataReader = this.f8291b;
        if (userDataReader != null) {
            userDataReader.m3883b(extractorOutput, dVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8301l = j2;
    }

    public H263Reader(UserDataReader userDataReader) {
        this.f8291b = userDataReader;
        this.f8293d = new boolean[4];
        this.f8294e = new a(128);
        if (userDataReader != null) {
            this.f8295f = new NalUnitTargetBuffer(178, 128);
            this.f8292c = new ParsableByteArray();
        } else {
            this.f8295f = null;
            this.f8292c = null;
        }
    }
}
