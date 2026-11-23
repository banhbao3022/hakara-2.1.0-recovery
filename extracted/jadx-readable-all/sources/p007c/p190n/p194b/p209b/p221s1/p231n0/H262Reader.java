package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.NalUnitUtil;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.n0.p, reason: use source file name */
/* JADX INFO: compiled from: H262Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class H262Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public static final double[] f8268a = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: b */
    public String f8269b;

    /* JADX INFO: renamed from: c */
    public TrackOutput2 f8270c;

    /* JADX INFO: renamed from: d */
    public final UserDataReader f8271d;

    /* JADX INFO: renamed from: e */
    public final ParsableByteArray f8272e;

    /* JADX INFO: renamed from: f */
    public final NalUnitTargetBuffer f8273f;

    /* JADX INFO: renamed from: g */
    public final boolean[] f8274g;

    /* JADX INFO: renamed from: h */
    public final a f8275h;

    /* JADX INFO: renamed from: i */
    public long f8276i;

    /* JADX INFO: renamed from: j */
    public boolean f8277j;

    /* JADX INFO: renamed from: k */
    public boolean f8278k;

    /* JADX INFO: renamed from: l */
    public long f8279l;

    /* JADX INFO: renamed from: m */
    public long f8280m;

    /* JADX INFO: renamed from: n */
    public long f8281n;

    /* JADX INFO: renamed from: o */
    public long f8282o;

    /* JADX INFO: renamed from: p */
    public boolean f8283p;

    /* JADX INFO: renamed from: q */
    public boolean f8284q;

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.p$a */
    /* JADX INFO: compiled from: H262Reader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final byte[] f8285a = {0, 0, 1};

        /* JADX INFO: renamed from: b */
        public boolean f8286b;

        /* JADX INFO: renamed from: c */
        public int f8287c;

        /* JADX INFO: renamed from: d */
        public int f8288d;

        /* JADX INFO: renamed from: e */
        public byte[] f8289e;

        public a(int i) {
            this.f8289e = new byte[i];
        }

        /* JADX INFO: renamed from: a */
        public void m3891a(byte[] bArr, int i, int i2) {
            if (this.f8286b) {
                int i3 = i2 - i;
                byte[] bArr2 = this.f8289e;
                int length = bArr2.length;
                int i4 = this.f8287c;
                if (length < i4 + i3) {
                    this.f8289e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                }
                System.arraycopy(bArr, i, this.f8289e, this.f8287c, i3);
                this.f8287c += i3;
            }
        }
    }

    public H262Reader() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    /* JADX WARN: Code duplicated, block: B:49:0x011a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0125  */
    /* JADX WARN: Code duplicated, block: B:53:0x0149  */
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
        a aVar;
        byte[] bArrCopyOf;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        float f2;
        int i7;
        long j2;
        double[] dArr;
        double d;
        int i8;
        int i9;
        C2096e.m4572h(this.f8270c);
        int i10 = parsableByteArray.f6393b;
        int i11 = parsableByteArray.f6394c;
        byte[] bArr = parsableByteArray.f6392a;
        this.f8276i += (long) parsableByteArray.m3196a();
        this.f8270c.mo3758c(parsableByteArray, parsableByteArray.m3196a());
        while (true) {
            int iM3173b = NalUnitUtil.m3173b(bArr, i10, i11, this.f8274g);
            if (iM3173b == i11) {
                break;
            }
            int i12 = iM3173b + 3;
            int i13 = parsableByteArray.f6392a[i12] & 255;
            int i14 = iM3173b - i10;
            if (this.f8278k) {
                i13 = i13;
                i12 = i12;
            } else {
                if (i14 > 0) {
                    this.f8275h.m3891a(bArr, i10, iM3173b);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                a aVar2 = this.f8275h;
                if (aVar2.f8286b) {
                    int i16 = aVar2.f8287c - i15;
                    aVar2.f8287c = i16;
                    if (aVar2.f8288d == 0 && i13 == 181) {
                        aVar2.f8288d = i16;
                    } else {
                        aVar2.f8286b = false;
                        z = true;
                    }
                    if (z) {
                        aVar = this.f8275h;
                        String str = this.f8269b;
                        Objects.requireNonNull(str);
                        bArrCopyOf = Arrays.copyOf(aVar.f8289e, aVar.f8287c);
                        int i17 = bArrCopyOf[4] & 255;
                        int i18 = bArrCopyOf[5] & 255;
                        i3 = (i17 << 4) | (i18 >> 4);
                        i4 = ((i18 & 15) << 8) | (bArrCopyOf[6] & 255);
                        i5 = (bArrCopyOf[7] & 240) >> 4;
                        if (i5 != 2) {
                            f = i4 * 4;
                            i6 = i3 * 3;
                        } else if (i5 != 3) {
                            if (i5 != 4) {
                                f2 = 1.0f;
                            } else {
                                f = i4 * 121;
                                i6 = i3 * 100;
                            }
                            Format.b bVar = new Format.b();
                            bVar.f6948a = str;
                            bVar.f6958k = "video/mpeg2";
                            bVar.f6963p = i3;
                            bVar.f6964q = i4;
                            bVar.f6967t = f2;
                            bVar.f6960m = Collections.singletonList(bArrCopyOf);
                            Format formatM3519a = bVar.m3519a();
                            i7 = (bArrCopyOf[7] & 15) - 1;
                            if (i7 >= 0) {
                                dArr = f8268a;
                                if (i7 < dArr.length) {
                                    d = dArr[i7];
                                    int i19 = aVar.f8288d + 9;
                                    i8 = (bArrCopyOf[i19] & 96) >> 5;
                                    i9 = bArrCopyOf[i19] & 31;
                                    if (i8 != i9) {
                                        d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                                    }
                                    j2 = (long) (1000000.0d / d);
                                } else {
                                    i13 = i13;
                                    i12 = i12;
                                    j2 = 0;
                                }
                            } else {
                                i13 = i13;
                                i12 = i12;
                                j2 = 0;
                            }
                            Pair pairCreate = Pair.create(formatM3519a, Long.valueOf(j2));
                            this.f8270c.mo3760e((Format) pairCreate.first);
                            this.f8279l = ((Long) pairCreate.second).longValue();
                            this.f8278k = true;
                        } else {
                            f = i4 * 16;
                            i6 = i3 * 9;
                        }
                        f2 = f / i6;
                        Format.b bVar2 = new Format.b();
                        bVar2.f6948a = str;
                        bVar2.f6958k = "video/mpeg2";
                        bVar2.f6963p = i3;
                        bVar2.f6964q = i4;
                        bVar2.f6967t = f2;
                        bVar2.f6960m = Collections.singletonList(bArrCopyOf);
                        Format formatM3519a2 = bVar2.m3519a();
                        i7 = (bArrCopyOf[7] & 15) - 1;
                        if (i7 >= 0) {
                            dArr = f8268a;
                            if (i7 < dArr.length) {
                                d = dArr[i7];
                                int i110 = aVar.f8288d + 9;
                                i8 = (bArrCopyOf[i110] & 96) >> 5;
                                i9 = bArrCopyOf[i110] & 31;
                                if (i8 != i9) {
                                    d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                                }
                                j2 = (long) (1000000.0d / d);
                            } else {
                                i13 = i13;
                                i12 = i12;
                                j2 = 0;
                            }
                        } else {
                            i13 = i13;
                            i12 = i12;
                            j2 = 0;
                        }
                        Pair pairCreate2 = Pair.create(formatM3519a2, Long.valueOf(j2));
                        this.f8270c.mo3760e((Format) pairCreate2.first);
                        this.f8279l = ((Long) pairCreate2.second).longValue();
                        this.f8278k = true;
                    } else {
                        i13 = i13;
                        i12 = i12;
                    }
                } else if (i13 == 179) {
                    aVar2.f8286b = true;
                }
                byte[] bArr2 = a.f8285a;
                aVar2.m3891a(bArr2, 0, bArr2.length);
                z = false;
                if (z) {
                    aVar = this.f8275h;
                    String str2 = this.f8269b;
                    Objects.requireNonNull(str2);
                    bArrCopyOf = Arrays.copyOf(aVar.f8289e, aVar.f8287c);
                    int i111 = bArrCopyOf[4] & 255;
                    int i112 = bArrCopyOf[5] & 255;
                    i3 = (i111 << 4) | (i112 >> 4);
                    i4 = ((i112 & 15) << 8) | (bArrCopyOf[6] & 255);
                    i5 = (bArrCopyOf[7] & 240) >> 4;
                    if (i5 != 2) {
                        f = i4 * 4;
                        i6 = i3 * 3;
                    } else if (i5 != 3) {
                        if (i5 != 4) {
                            f2 = 1.0f;
                        } else {
                            f = i4 * 121;
                            i6 = i3 * 100;
                        }
                        Format.b bVar3 = new Format.b();
                        bVar3.f6948a = str2;
                        bVar3.f6958k = "video/mpeg2";
                        bVar3.f6963p = i3;
                        bVar3.f6964q = i4;
                        bVar3.f6967t = f2;
                        bVar3.f6960m = Collections.singletonList(bArrCopyOf);
                        Format formatM3519a3 = bVar3.m3519a();
                        i7 = (bArrCopyOf[7] & 15) - 1;
                        if (i7 >= 0) {
                            dArr = f8268a;
                            if (i7 < dArr.length) {
                                d = dArr[i7];
                                int i113 = aVar.f8288d + 9;
                                i8 = (bArrCopyOf[i113] & 96) >> 5;
                                i9 = bArrCopyOf[i113] & 31;
                                if (i8 != i9) {
                                    d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                                }
                                j2 = (long) (1000000.0d / d);
                            } else {
                                i13 = i13;
                                i12 = i12;
                                j2 = 0;
                            }
                        } else {
                            i13 = i13;
                            i12 = i12;
                            j2 = 0;
                        }
                        Pair pairCreate3 = Pair.create(formatM3519a3, Long.valueOf(j2));
                        this.f8270c.mo3760e((Format) pairCreate3.first);
                        this.f8279l = ((Long) pairCreate3.second).longValue();
                        this.f8278k = true;
                    } else {
                        f = i4 * 16;
                        i6 = i3 * 9;
                    }
                    f2 = f / i6;
                    Format.b bVar4 = new Format.b();
                    bVar4.f6948a = str2;
                    bVar4.f6958k = "video/mpeg2";
                    bVar4.f6963p = i3;
                    bVar4.f6964q = i4;
                    bVar4.f6967t = f2;
                    bVar4.f6960m = Collections.singletonList(bArrCopyOf);
                    Format formatM3519a4 = bVar4.m3519a();
                    i7 = (bArrCopyOf[7] & 15) - 1;
                    if (i7 >= 0) {
                        dArr = f8268a;
                        if (i7 < dArr.length) {
                            d = dArr[i7];
                            int i114 = aVar.f8288d + 9;
                            i8 = (bArrCopyOf[i114] & 96) >> 5;
                            i9 = bArrCopyOf[i114] & 31;
                            if (i8 != i9) {
                                d *= (((double) i8) + 1.0d) / ((double) (i9 + 1));
                            }
                            j2 = (long) (1000000.0d / d);
                        } else {
                            i13 = i13;
                            i12 = i12;
                            j2 = 0;
                        }
                    } else {
                        i13 = i13;
                        i12 = i12;
                        j2 = 0;
                    }
                    Pair pairCreate4 = Pair.create(formatM3519a4, Long.valueOf(j2));
                    this.f8270c.mo3760e((Format) pairCreate4.first);
                    this.f8279l = ((Long) pairCreate4.second).longValue();
                    this.f8278k = true;
                } else {
                    i13 = i13;
                    i12 = i12;
                }
            }
            NalUnitTargetBuffer nalUnitTargetBuffer = this.f8273f;
            if (nalUnitTargetBuffer != null) {
                if (i14 > 0) {
                    nalUnitTargetBuffer.m3900a(bArr, i10, iM3173b);
                    i2 = 0;
                } else {
                    i2 = -i14;
                }
                if (this.f8273f.m3901b(i2)) {
                    NalUnitTargetBuffer nalUnitTargetBuffer2 = this.f8273f;
                    int iM3176e = NalUnitUtil.m3176e(nalUnitTargetBuffer2.f8434d, nalUnitTargetBuffer2.f8435e);
                    ParsableByteArray parsableByteArray2 = this.f8272e;
                    int i20 = Util6.f6307a;
                    parsableByteArray2.m3192B(this.f8273f.f8434d, iM3176e);
                    this.f8271d.m3882a(this.f8282o, this.f8272e);
                }
                i = i13;
                if (i == 178 && parsableByteArray.f6392a[iM3173b + 2] == 1) {
                    this.f8273f.m3903d(i);
                }
            } else {
                i = i13;
            }
            if (i == 0 || i == 179) {
                int i21 = i11 - iM3173b;
                if (this.f8277j && this.f8284q && this.f8278k) {
                    this.f8270c.mo3759d(this.f8282o, this.f8283p ? 1 : 0, ((int) (this.f8276i - this.f8281n)) - i21, i21, null);
                }
                boolean z2 = this.f8277j;
                if (!z2 || this.f8284q) {
                    this.f8281n = this.f8276i - ((long) i21);
                    long j3 = this.f8280m;
                    if (j3 == -9223372036854775807L) {
                        j3 = z2 ? this.f8282o + this.f8279l : 0L;
                    }
                    this.f8282o = j3;
                    this.f8283p = false;
                    this.f8280m = -9223372036854775807L;
                    this.f8277j = true;
                }
                this.f8284q = i == 0;
            } else if (i == 184) {
                this.f8283p = true;
            }
            i10 = i12;
        }
        if (!this.f8278k) {
            this.f8275h.m3891a(bArr, i10, i11);
        }
        NalUnitTargetBuffer nalUnitTargetBuffer3 = this.f8273f;
        if (nalUnitTargetBuffer3 != null) {
            nalUnitTargetBuffer3.m3900a(bArr, i10, i11);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        NalUnitUtil.m3172a(this.f8274g);
        a aVar = this.f8275h;
        aVar.f8286b = false;
        aVar.f8287c = 0;
        aVar.f8288d = 0;
        NalUnitTargetBuffer nalUnitTargetBuffer = this.f8273f;
        if (nalUnitTargetBuffer != null) {
            nalUnitTargetBuffer.m3902c();
        }
        this.f8276i = 0L;
        this.f8277j = false;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: d */
    public void mo3872d() {
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: e */
    public void mo3873e(ExtractorOutput extractorOutput, TsPayloadReader.d dVar) {
        dVar.m3878a();
        this.f8269b = dVar.m3879b();
        this.f8270c = extractorOutput.mo3774o(dVar.m3880c(), 2);
        UserDataReader userDataReader = this.f8271d;
        if (userDataReader != null) {
            userDataReader.m3883b(extractorOutput, dVar);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8280m = j2;
    }

    public H262Reader(UserDataReader userDataReader) {
        this.f8271d = userDataReader;
        this.f8274g = new boolean[4];
        this.f8275h = new a(128);
        if (userDataReader != null) {
            this.f8273f = new NalUnitTargetBuffer(178, 128);
            this.f8272e = new ParsableByteArray();
        } else {
            this.f8273f = null;
            this.f8272e = null;
        }
    }
}
