package p007c.p190n.p194b.p209b.p221s1.p231n0;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
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

/* JADX INFO: renamed from: c.n.b.b.s1.n0.r, reason: use source file name */
/* JADX INFO: compiled from: H264Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class H264Reader implements ElementaryStreamReader {

    /* JADX INFO: renamed from: a */
    public final SeiReader f8316a;

    /* JADX INFO: renamed from: b */
    public final boolean f8317b;

    /* JADX INFO: renamed from: c */
    public final boolean f8318c;

    /* JADX INFO: renamed from: g */
    public long f8322g;

    /* JADX INFO: renamed from: i */
    public String f8324i;

    /* JADX INFO: renamed from: j */
    public TrackOutput2 f8325j;

    /* JADX INFO: renamed from: k */
    public b f8326k;

    /* JADX INFO: renamed from: l */
    public boolean f8327l;

    /* JADX INFO: renamed from: m */
    public long f8328m;

    /* JADX INFO: renamed from: n */
    public boolean f8329n;

    /* JADX INFO: renamed from: h */
    public final boolean[] f8323h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final NalUnitTargetBuffer f8319d = new NalUnitTargetBuffer(7, 128);

    /* JADX INFO: renamed from: e */
    public final NalUnitTargetBuffer f8320e = new NalUnitTargetBuffer(8, 128);

    /* JADX INFO: renamed from: f */
    public final NalUnitTargetBuffer f8321f = new NalUnitTargetBuffer(6, 128);

    /* JADX INFO: renamed from: o */
    public final ParsableByteArray f8330o = new ParsableByteArray();

    /* JADX INFO: renamed from: c.n.b.b.s1.n0.r$b */
    /* JADX INFO: compiled from: H264Reader.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final TrackOutput2 f8331a;

        /* JADX INFO: renamed from: b */
        public final boolean f8332b;

        /* JADX INFO: renamed from: c */
        public final boolean f8333c;

        /* JADX INFO: renamed from: f */
        public final ParsableNalUnitBitArray f8336f;

        /* JADX INFO: renamed from: g */
        public byte[] f8337g;

        /* JADX INFO: renamed from: h */
        public int f8338h;

        /* JADX INFO: renamed from: i */
        public int f8339i;

        /* JADX INFO: renamed from: j */
        public long f8340j;

        /* JADX INFO: renamed from: l */
        public long f8342l;

        /* JADX INFO: renamed from: p */
        public long f8346p;

        /* JADX INFO: renamed from: q */
        public long f8347q;

        /* JADX INFO: renamed from: r */
        public boolean f8348r;

        /* JADX INFO: renamed from: d */
        public final SparseArray<NalUnitUtil.b> f8334d = new SparseArray<>();

        /* JADX INFO: renamed from: e */
        public final SparseArray<NalUnitUtil.a> f8335e = new SparseArray<>();

        /* JADX INFO: renamed from: m */
        public a f8343m = new a(null);

        /* JADX INFO: renamed from: n */
        public a f8344n = new a(null);

        /* JADX INFO: renamed from: k */
        public boolean f8341k = false;

        /* JADX INFO: renamed from: o */
        public boolean f8345o = false;

        /* JADX INFO: renamed from: c.n.b.b.s1.n0.r$b$a */
        /* JADX INFO: compiled from: H264Reader.java */
        public static final class a {

            /* JADX INFO: renamed from: a */
            public boolean f8349a;

            /* JADX INFO: renamed from: b */
            public boolean f8350b;

            /* JADX INFO: renamed from: c */
            public NalUnitUtil.b f8351c;

            /* JADX INFO: renamed from: d */
            public int f8352d;

            /* JADX INFO: renamed from: e */
            public int f8353e;

            /* JADX INFO: renamed from: f */
            public int f8354f;

            /* JADX INFO: renamed from: g */
            public int f8355g;

            /* JADX INFO: renamed from: h */
            public boolean f8356h;

            /* JADX INFO: renamed from: i */
            public boolean f8357i;

            /* JADX INFO: renamed from: j */
            public boolean f8358j;

            /* JADX INFO: renamed from: k */
            public boolean f8359k;

            /* JADX INFO: renamed from: l */
            public int f8360l;

            /* JADX INFO: renamed from: m */
            public int f8361m;

            /* JADX INFO: renamed from: n */
            public int f8362n;

            /* JADX INFO: renamed from: o */
            public int f8363o;

            /* JADX INFO: renamed from: p */
            public int f8364p;

            public a(a aVar) {
            }
        }

        public b(TrackOutput2 trackOutput2, boolean z, boolean z2) {
            this.f8331a = trackOutput2;
            this.f8332b = z;
            this.f8333c = z2;
            byte[] bArr = new byte[128];
            this.f8337g = bArr;
            this.f8336f = new ParsableNalUnitBitArray(bArr, 0, 0);
            a aVar = this.f8344n;
            aVar.f8350b = false;
            aVar.f8349a = false;
        }
    }

    public H264Reader(SeiReader seiReader, boolean z, boolean z2) {
        this.f8316a = seiReader;
        this.f8317b = z;
        this.f8318c = z2;
    }

    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0134  */
    /* JADX WARN: Code duplicated, block: B:65:0x0139  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:75:0x0164  */
    /* JADX WARN: Code duplicated, block: B:77:0x0169  */
    /* JADX WARN: Code duplicated, block: B:90:0x0198  */
    @RequiresNonNull({"sampleReader"})
    /* JADX INFO: renamed from: a */
    public final void m3895a(byte[] bArr, int i, int i2) {
        boolean zM3225d;
        boolean zM3225d2;
        boolean z;
        boolean z2;
        int iM3227f;
        int i3;
        int iM3228g;
        int i4;
        int iM3226e;
        int iM3228g2;
        int i5;
        int iM3228g3;
        if (!this.f8327l || this.f8326k.f8333c) {
            this.f8319d.m3900a(bArr, i, i2);
            this.f8320e.m3900a(bArr, i, i2);
        }
        this.f8321f.m3900a(bArr, i, i2);
        b bVar = this.f8326k;
        if (bVar.f8341k) {
            int i6 = i2 - i;
            byte[] bArr2 = bVar.f8337g;
            int length = bArr2.length;
            int i7 = bVar.f8338h + i6;
            if (length < i7) {
                bVar.f8337g = Arrays.copyOf(bArr2, i7 * 2);
            }
            System.arraycopy(bArr, i, bVar.f8337g, bVar.f8338h, i6);
            int i8 = bVar.f8338h + i6;
            bVar.f8338h = i8;
            bVar.f8336f.m3229h(bVar.f8337g, 0, i8);
            if (bVar.f8336f.m3223b(8)) {
                bVar.f8336f.m3231j();
                int iM3226e2 = bVar.f8336f.m3226e(2);
                bVar.f8336f.m3232k(5);
                if (bVar.f8336f.m3224c()) {
                    bVar.f8336f.m3227f();
                    if (bVar.f8336f.m3224c()) {
                        int iM3227f2 = bVar.f8336f.m3227f();
                        if (!bVar.f8333c) {
                            bVar.f8341k = false;
                            b.a aVar = bVar.f8344n;
                            aVar.f8353e = iM3227f2;
                            aVar.f8350b = true;
                            return;
                        }
                        if (bVar.f8336f.m3224c()) {
                            int iM3227f3 = bVar.f8336f.m3227f();
                            if (bVar.f8335e.indexOfKey(iM3227f3) < 0) {
                                bVar.f8341k = false;
                                return;
                            }
                            NalUnitUtil.a aVar2 = bVar.f8335e.get(iM3227f3);
                            NalUnitUtil.b bVar2 = bVar.f8334d.get(aVar2.f6373b);
                            if (bVar2.f6382h) {
                                if (!bVar.f8336f.m3223b(2)) {
                                    return;
                                } else {
                                    bVar.f8336f.m3232k(2);
                                }
                            }
                            if (bVar.f8336f.m3223b(bVar2.f6384j)) {
                                int iM3226e3 = bVar.f8336f.m3226e(bVar2.f6384j);
                                if (!bVar2.f6383i) {
                                    if (bVar.f8336f.m3223b(1)) {
                                        zM3225d = bVar.f8336f.m3225d();
                                        if (zM3225d) {
                                            if (!bVar.f8336f.m3223b(1)) {
                                                return;
                                            }
                                            zM3225d2 = bVar.f8336f.m3225d();
                                            z = true;
                                        }
                                        if (bVar.f8339i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iM3227f = 0;
                                        } else if (!bVar.f8336f.m3224c()) {
                                            return;
                                        } else {
                                            iM3227f = bVar.f8336f.m3227f();
                                        }
                                        i3 = bVar2.f6385k;
                                        if (i3 != 0) {
                                            if (i3 == 1 || bVar2.f6387m) {
                                                iM3228g = 0;
                                            } else {
                                                if (!bVar.f8336f.m3224c()) {
                                                    return;
                                                }
                                                iM3228g = bVar.f8336f.m3228g();
                                                if (aVar2.f6374c && !zM3225d) {
                                                    if (!bVar.f8336f.m3224c()) {
                                                        return;
                                                    }
                                                    iM3228g2 = bVar.f8336f.m3228g();
                                                    i5 = 0;
                                                    i4 = iM3228g;
                                                    iM3226e = 0;
                                                }
                                            }
                                            i4 = iM3228g;
                                            iM3226e = 0;
                                            iM3228g2 = 0;
                                            i5 = 0;
                                        } else {
                                            if (!bVar.f8336f.m3223b(bVar2.f6386l)) {
                                                return;
                                            }
                                            iM3226e = bVar.f8336f.m3226e(bVar2.f6386l);
                                            if (aVar2.f6374c || zM3225d) {
                                                iM3228g3 = 0;
                                            } else if (!bVar.f8336f.m3224c()) {
                                                return;
                                            } else {
                                                iM3228g3 = bVar.f8336f.m3228g();
                                            }
                                            i5 = iM3228g3;
                                            iM3228g2 = 0;
                                            i4 = 0;
                                        }
                                        b.a aVar3 = bVar.f8344n;
                                        aVar3.f8351c = bVar2;
                                        aVar3.f8352d = iM3226e2;
                                        aVar3.f8353e = iM3227f2;
                                        aVar3.f8354f = iM3226e3;
                                        aVar3.f8355g = iM3227f3;
                                        aVar3.f8356h = zM3225d;
                                        aVar3.f8357i = z;
                                        aVar3.f8358j = zM3225d2;
                                        aVar3.f8359k = z2;
                                        aVar3.f8360l = iM3227f;
                                        aVar3.f8361m = iM3226e;
                                        aVar3.f8362n = i5;
                                        aVar3.f8363o = i4;
                                        aVar3.f8364p = iM3228g2;
                                        aVar3.f8349a = true;
                                        aVar3.f8350b = true;
                                        bVar.f8341k = false;
                                    }
                                    return;
                                }
                                zM3225d = false;
                                zM3225d2 = false;
                                z = false;
                                if (bVar.f8339i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iM3227f = 0;
                                } else if (!bVar.f8336f.m3224c()) {
                                    return;
                                } else {
                                    iM3227f = bVar.f8336f.m3227f();
                                }
                                i3 = bVar2.f6385k;
                                if (i3 != 0) {
                                    if (!bVar.f8336f.m3223b(bVar2.f6386l)) {
                                        return;
                                    }
                                    iM3226e = bVar.f8336f.m3226e(bVar2.f6386l);
                                    if (aVar2.f6374c) {
                                        iM3228g3 = 0;
                                    } else {
                                        iM3228g3 = 0;
                                    }
                                    i5 = iM3228g3;
                                    iM3228g2 = 0;
                                    i4 = 0;
                                } else if (i3 == 1) {
                                    iM3228g = 0;
                                    i4 = iM3228g;
                                    iM3226e = 0;
                                    iM3228g2 = 0;
                                    i5 = 0;
                                } else {
                                    iM3228g = 0;
                                    i4 = iM3228g;
                                    iM3226e = 0;
                                    iM3228g2 = 0;
                                    i5 = 0;
                                }
                                b.a aVar4 = bVar.f8344n;
                                aVar4.f8351c = bVar2;
                                aVar4.f8352d = iM3226e2;
                                aVar4.f8353e = iM3227f2;
                                aVar4.f8354f = iM3226e3;
                                aVar4.f8355g = iM3227f3;
                                aVar4.f8356h = zM3225d;
                                aVar4.f8357i = z;
                                aVar4.f8358j = zM3225d2;
                                aVar4.f8359k = z2;
                                aVar4.f8360l = iM3227f;
                                aVar4.f8361m = iM3226e;
                                aVar4.f8362n = i5;
                                aVar4.f8363o = i4;
                                aVar4.f8364p = iM3228g2;
                                aVar4.f8349a = true;
                                aVar4.f8350b = true;
                                bVar.f8341k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f3  */
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
        byte[] bArr;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        boolean z2;
        C2096e.m4572h(this.f8325j);
        int i7 = Util6.f6307a;
        int i8 = parsableByteArray.f6393b;
        int i9 = parsableByteArray.f6394c;
        byte[] bArr2 = parsableByteArray.f6392a;
        this.f8322g += (long) parsableByteArray.m3196a();
        this.f8325j.mo3758c(parsableByteArray, parsableByteArray.m3196a());
        while (true) {
            int iM3173b = NalUnitUtil.m3173b(bArr2, i8, i9, this.f8323h);
            if (iM3173b == i9) {
                m3895a(bArr2, i8, i9);
                return;
            }
            int i10 = iM3173b + 3;
            int i11 = bArr2[i10] & 31;
            int i12 = iM3173b - i8;
            if (i12 > 0) {
                m3895a(bArr2, i8, iM3173b);
            }
            int i13 = i9 - iM3173b;
            long j2 = this.f8322g - ((long) i13);
            int i14 = i12 < 0 ? -i12 : 0;
            long j3 = this.f8328m;
            if (!this.f8327l || this.f8326k.f8333c) {
                this.f8319d.m3901b(i14);
                this.f8320e.m3901b(i14);
                if (this.f8327l) {
                    i = i9;
                    bArr = bArr2;
                    NalUnitTargetBuffer nalUnitTargetBuffer = this.f8319d;
                    if (nalUnitTargetBuffer.f8433c) {
                        NalUnitUtil.b bVarM3175d = NalUnitUtil.m3175d(nalUnitTargetBuffer.f8434d, 3, nalUnitTargetBuffer.f8435e);
                        this.f8326k.f8334d.append(bVarM3175d.f6378d, bVarM3175d);
                        this.f8319d.m3902c();
                    } else {
                        NalUnitTargetBuffer nalUnitTargetBuffer2 = this.f8320e;
                        if (nalUnitTargetBuffer2.f8433c) {
                            NalUnitUtil.a aVarM3174c = NalUnitUtil.m3174c(nalUnitTargetBuffer2.f8434d, 3, nalUnitTargetBuffer2.f8435e);
                            this.f8326k.f8335e.append(aVarM3174c.f6372a, aVarM3174c);
                            this.f8320e.m3902c();
                        }
                    }
                } else if (this.f8319d.f8433c && this.f8320e.f8433c) {
                    ArrayList arrayList = new ArrayList();
                    NalUnitTargetBuffer nalUnitTargetBuffer3 = this.f8319d;
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer3.f8434d, nalUnitTargetBuffer3.f8435e));
                    NalUnitTargetBuffer nalUnitTargetBuffer4 = this.f8320e;
                    arrayList.add(Arrays.copyOf(nalUnitTargetBuffer4.f8434d, nalUnitTargetBuffer4.f8435e));
                    NalUnitTargetBuffer nalUnitTargetBuffer5 = this.f8319d;
                    NalUnitUtil.b bVarM3175d2 = NalUnitUtil.m3175d(nalUnitTargetBuffer5.f8434d, 3, nalUnitTargetBuffer5.f8435e);
                    NalUnitTargetBuffer nalUnitTargetBuffer6 = this.f8320e;
                    NalUnitUtil.a aVarM3174c2 = NalUnitUtil.m3174c(nalUnitTargetBuffer6.f8434d, 3, nalUnitTargetBuffer6.f8435e);
                    i = i9;
                    String strM3089a = CodecSpecificDataUtil.m3089a(bVarM3175d2.f6375a, bVarM3175d2.f6376b, bVarM3175d2.f6377c);
                    TrackOutput2 trackOutput2 = this.f8325j;
                    Format.b bVar = new Format.b();
                    bArr = bArr2;
                    bVar.f6948a = this.f8324i;
                    bVar.f6958k = "video/avc";
                    bVar.f6955h = strM3089a;
                    bVar.f6963p = bVarM3175d2.f6379e;
                    bVar.f6964q = bVarM3175d2.f6380f;
                    bVar.f6967t = bVarM3175d2.f6381g;
                    bVar.f6960m = arrayList;
                    trackOutput2.mo3760e(bVar.m3519a());
                    this.f8327l = true;
                    this.f8326k.f8334d.append(bVarM3175d2.f6378d, bVarM3175d2);
                    this.f8326k.f8335e.append(aVarM3174c2.f6372a, aVarM3174c2);
                    this.f8319d.m3902c();
                    this.f8320e.m3902c();
                } else {
                    i = i9;
                    bArr = bArr2;
                }
            } else {
                i = i9;
                bArr = bArr2;
            }
            if (this.f8321f.m3901b(i14)) {
                NalUnitTargetBuffer nalUnitTargetBuffer7 = this.f8321f;
                this.f8330o.m3192B(this.f8321f.f8434d, NalUnitUtil.m3176e(nalUnitTargetBuffer7.f8434d, nalUnitTargetBuffer7.f8435e));
                this.f8330o.m3194D(4);
                C1095a.m2394j(j3, this.f8330o, this.f8316a.f8131b);
            }
            b bVar2 = this.f8326k;
            boolean z3 = this.f8327l;
            boolean z4 = this.f8329n;
            if (bVar2.f8339i == 9) {
                if (z3 && bVar2.f8345o) {
                    long j4 = bVar2.f8340j;
                    bVar2.f8331a.mo3759d(bVar2.f8347q, bVar2.f8348r ? 1 : 0, (int) (j4 - bVar2.f8346p), i13 + ((int) (j2 - j4)), null);
                }
                bVar2.f8346p = bVar2.f8340j;
                bVar2.f8347q = bVar2.f8342l;
                bVar2.f8348r = false;
                bVar2.f8345o = true;
            } else if (bVar2.f8333c) {
                b.a aVar = bVar2.f8344n;
                b.a aVar2 = bVar2.f8343m;
                if (aVar.f8349a) {
                    if (aVar2.f8349a) {
                        NalUnitUtil.b bVar3 = aVar.f8351c;
                        C2096e.m4572h(bVar3);
                        NalUnitUtil.b bVar4 = aVar2.f8351c;
                        C2096e.m4572h(bVar4);
                        if (aVar.f8354f == aVar2.f8354f && aVar.f8355g == aVar2.f8355g && aVar.f8356h == aVar2.f8356h && ((!aVar.f8357i || !aVar2.f8357i || aVar.f8358j == aVar2.f8358j) && (((i4 = aVar.f8352d) == (i5 = aVar2.f8352d) || (i4 != 0 && i5 != 0)) && (((i6 = bVar3.f6385k) != 0 || bVar4.f6385k != 0 || (aVar.f8361m == aVar2.f8361m && aVar.f8362n == aVar2.f8362n)) && ((i6 != 1 || bVar4.f6385k != 1 || (aVar.f8363o == aVar2.f8363o && aVar.f8364p == aVar2.f8364p)) && (z2 = aVar.f8359k) == aVar2.f8359k && (!z2 || aVar.f8360l == aVar2.f8360l)))))) {
                            z = false;
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (z3) {
                        long j5 = bVar2.f8340j;
                        bVar2.f8331a.mo3759d(bVar2.f8347q, bVar2.f8348r ? 1 : 0, (int) (j5 - bVar2.f8346p), i13 + ((int) (j2 - j5)), null);
                    }
                    bVar2.f8346p = bVar2.f8340j;
                    bVar2.f8347q = bVar2.f8342l;
                    bVar2.f8348r = false;
                    bVar2.f8345o = true;
                }
            }
            if (bVar2.f8332b) {
                b.a aVar3 = bVar2.f8344n;
                z4 = aVar3.f8350b && ((i3 = aVar3.f8353e) == 7 || i3 == 2);
            }
            boolean z5 = bVar2.f8348r;
            int i15 = bVar2.f8339i;
            boolean z6 = z5 | (i15 == 5 || (z4 && i15 == 1));
            bVar2.f8348r = z6;
            if (z6) {
                this.f8329n = false;
            }
            long j6 = this.f8328m;
            if (!this.f8327l || this.f8326k.f8333c) {
                this.f8319d.m3903d(i11);
                this.f8320e.m3903d(i11);
            }
            this.f8321f.m3903d(i11);
            b bVar5 = this.f8326k;
            bVar5.f8339i = i11;
            bVar5.f8342l = j6;
            bVar5.f8340j = j2;
            if (bVar5.f8332b) {
                i2 = 1;
                if (i11 == 1) {
                    b.a aVar4 = bVar5.f8343m;
                    bVar5.f8343m = bVar5.f8344n;
                    bVar5.f8344n = aVar4;
                    aVar4.f8350b = false;
                    aVar4.f8349a = false;
                    bVar5.f8338h = 0;
                    bVar5.f8341k = true;
                }
                i8 = i10;
                i9 = i;
                bArr2 = bArr;
            } else {
                i2 = 1;
            }
            if (bVar5.f8333c && (i11 == 5 || i11 == i2 || i11 == 2)) {
                b.a aVar5 = bVar5.f8343m;
                bVar5.f8343m = bVar5.f8344n;
                bVar5.f8344n = aVar5;
                aVar5.f8350b = false;
                aVar5.f8349a = false;
                bVar5.f8338h = 0;
                bVar5.f8341k = true;
            }
            i8 = i10;
            i9 = i;
            bArr2 = bArr;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: c */
    public void mo3871c() {
        this.f8322g = 0L;
        this.f8329n = false;
        NalUnitUtil.m3172a(this.f8323h);
        this.f8319d.m3902c();
        this.f8320e.m3902c();
        this.f8321f.m3902c();
        b bVar = this.f8326k;
        if (bVar != null) {
            bVar.f8341k = false;
            bVar.f8345o = false;
            b.a aVar = bVar.f8344n;
            aVar.f8350b = false;
            aVar.f8349a = false;
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
        this.f8324i = dVar.m3879b();
        TrackOutput2 trackOutput2Mo3774o = extractorOutput.mo3774o(dVar.m3880c(), 2);
        this.f8325j = trackOutput2Mo3774o;
        this.f8326k = new b(trackOutput2Mo3774o, this.f8317b, this.f8318c);
        this.f8316a.m3869a(extractorOutput, dVar);
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.p231n0.ElementaryStreamReader
    /* JADX INFO: renamed from: f */
    public void mo3874f(long j2, int i) {
        this.f8328m = j2;
        this.f8329n |= (i & 2) != 0;
    }
}
