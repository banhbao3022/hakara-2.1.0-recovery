package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import java.util.regex.Matcher;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lk2 implements cj2, jj2 {

    /* JADX INFO: renamed from: a */
    public static final int f16383a = jo2.m7375g("qt  ");

    /* JADX INFO: renamed from: f */
    public int f16388f;

    /* JADX INFO: renamed from: g */
    public int f16389g;

    /* JADX INFO: renamed from: h */
    public long f16390h;

    /* JADX INFO: renamed from: i */
    public int f16391i;

    /* JADX INFO: renamed from: j */
    public do2 f16392j;

    /* JADX INFO: renamed from: k */
    public int f16393k;

    /* JADX INFO: renamed from: l */
    public int f16394l;

    /* JADX INFO: renamed from: m */
    public dj2 f16395m;

    /* JADX INFO: renamed from: n */
    public kk2[] f16396n;

    /* JADX INFO: renamed from: o */
    public long f16397o;

    /* JADX INFO: renamed from: p */
    public boolean f16398p;

    /* JADX INFO: renamed from: d */
    public final do2 f16386d = new do2(16);

    /* JADX INFO: renamed from: e */
    public final Stack<uj2> f16387e = new Stack<>();

    /* JADX INFO: renamed from: b */
    public final do2 f16384b = new do2(bo2.f12762a);

    /* JADX INFO: renamed from: c */
    public final do2 f16385c = new do2(4);

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jj2
    /* JADX INFO: renamed from: a */
    public final long mo5818a() {
        return this.f16397o;
    }

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
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: b */
    public final int mo6193b(bj2 bj2Var, gj2 gj2Var) throws InterruptedException, IOException {
        kk2[] kk2VarArr;
        boolean z;
        boolean z2;
        while (true) {
            int i = this.f16388f;
            if (i == 0) {
                if (this.f16391i == 0) {
                    if (!bj2Var.m6021a(this.f16386d.f13340a, 0, 8, true)) {
                        return -1;
                    }
                    this.f16391i = 8;
                    this.f16386d.m6389f(0);
                    this.f16390h = this.f16386d.m6394k();
                    this.f16389g = this.f16386d.m6395l();
                }
                if (this.f16390h == 1) {
                    bj2Var.m6021a(this.f16386d.f13340a, 8, 8, false);
                    this.f16391i += 8;
                    this.f16390h = this.f16386d.m6398o();
                }
                int i2 = this.f16389g;
                if (i2 == wj2.f21143B || i2 == wj2.f21147D || i2 == wj2.f21149E || i2 == wj2.f21151F || i2 == wj2.f21153G || i2 == wj2.f21170P) {
                    long j2 = (bj2Var.f12710d + this.f16390h) - ((long) this.f16391i);
                    this.f16387e.add(new uj2(this.f16389g, j2));
                    if (this.f16390h == this.f16391i) {
                        m7590h(j2);
                    } else {
                        m7589g();
                    }
                } else {
                    if (i2 == wj2.f21172R || i2 == wj2.f21145C || i2 == wj2.f21173S || i2 == wj2.f21174T || i2 == wj2.f21204l0 || i2 == wj2.f21206m0 || i2 == wj2.f21208n0 || i2 == wj2.f21171Q || i2 == wj2.f21210o0 || i2 == wj2.f21212p0 || i2 == wj2.f21214q0 || i2 == wj2.f21216r0 || i2 == wj2.f21218s0 || i2 == wj2.f21169O || i2 == wj2.f21181a || i2 == wj2.f21232z0) {
                        C2622l.m5322V2(this.f16391i == 8);
                        C2622l.m5322V2(this.f16390h <= 2147483647L);
                        do2 do2Var = new do2((int) this.f16390h);
                        this.f16392j = do2Var;
                        System.arraycopy(this.f16386d.f13340a, 0, do2Var.f13340a, 0, 8);
                    } else {
                        this.f16392j = null;
                    }
                    this.f16388f = 1;
                }
            } else {
                if (i != 1) {
                    long j3 = Long.MAX_VALUE;
                    int i3 = 0;
                    int i4 = -1;
                    while (true) {
                        kk2VarArr = this.f16396n;
                        if (i3 >= kk2VarArr.length) {
                            break;
                        }
                        kk2 kk2Var = kk2VarArr[i3];
                        int i5 = kk2Var.f15975d;
                        qk2 qk2Var = kk2Var.f15973b;
                        if (i5 != qk2Var.f18369a) {
                            long j4 = qk2Var.f18370b[i5];
                            if (j4 < j3) {
                                i4 = i3;
                                j3 = j4;
                            }
                        }
                        i3++;
                    }
                    if (i4 == -1) {
                        return -1;
                    }
                    kk2 kk2Var2 = kk2VarArr[i4];
                    lj2 lj2Var = kk2Var2.f15974c;
                    int i6 = kk2Var2.f15975d;
                    qk2 qk2Var2 = kk2Var2.f15973b;
                    long j5 = qk2Var2.f18370b[i6];
                    int i7 = qk2Var2.f18371c[i6];
                    if (kk2Var2.f15972a.f17148g == 1) {
                        j5 += 8;
                        i7 -= 8;
                    }
                    long j6 = (j5 - bj2Var.f12710d) + ((long) this.f16393k);
                    if (j6 < 0 || j6 >= 262144) {
                        gj2Var.f14598a = j5;
                        return 1;
                    }
                    int i8 = (int) j6;
                    boolean z3 = false;
                    bj2Var.m6022b(i8, false);
                    int i9 = kk2Var2.f15972a.f17152k;
                    if (i9 == 0) {
                        while (true) {
                            int i10 = this.f16393k;
                            if (i10 >= i7) {
                                break;
                            }
                            int iM7518d = ((km2) lj2Var).m7518d(bj2Var, i7 - i10, false);
                            this.f16393k += iM7518d;
                            this.f16394l -= iM7518d;
                        }
                    } else {
                        byte[] bArr = this.f16385c.f13340a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i11 = 4 - i9;
                        while (this.f16393k < i7) {
                            int i12 = this.f16394l;
                            if (i12 == 0) {
                                bj2Var.m6021a(this.f16385c.f13340a, i11, i9, z3);
                                this.f16385c.m6389f(z3 ? 1 : 0);
                                this.f16394l = this.f16385c.m6397n();
                                this.f16384b.m6389f(z3 ? 1 : 0);
                                ((km2) lj2Var).m7516b(this.f16384b, 4);
                                this.f16393k += 4;
                                i7 += i11;
                            } else {
                                int iM7518d2 = ((km2) lj2Var).m7518d(bj2Var, i12, z3);
                                this.f16393k += iM7518d2;
                                this.f16394l -= iM7518d2;
                                z3 = false;
                            }
                        }
                    }
                    int i13 = i7;
                    qk2 qk2Var3 = kk2Var2.f15973b;
                    ((km2) lj2Var).m7517c(qk2Var3.f18373e[i6], qk2Var3.f18374f[i6], i13, 0, null);
                    kk2Var2.f15975d++;
                    this.f16393k = 0;
                    this.f16394l = 0;
                    return 0;
                }
                long j7 = this.f16390h;
                int i14 = this.f16391i;
                long j8 = j7 - ((long) i14);
                long j9 = bj2Var.f12710d + j8;
                do2 do2Var2 = this.f16392j;
                if (do2Var2 != null) {
                    bj2Var.m6021a(do2Var2.f13340a, i14, (int) j8, false);
                    if (this.f16389g == wj2.f21181a) {
                        do2 do2Var3 = this.f16392j;
                        do2Var3.m6389f(8);
                        if (do2Var3.m6395l() != f16383a) {
                            do2Var3.m6390g(4);
                            while (true) {
                                if (do2Var3.m6386c() <= 0) {
                                    z2 = false;
                                    break;
                                }
                                if (do2Var3.m6395l() == f16383a) {
                                    z2 = true;
                                    break;
                                }
                            }
                        } else {
                            z2 = true;
                            break;
                        }
                        this.f16398p = z2;
                    } else if (!this.f16387e.isEmpty()) {
                        this.f16387e.peek().f20362Q0.add(new vj2(this.f16389g, this.f16392j));
                    }
                } else {
                    if (j8 < 262144) {
                        bj2Var.m6022b((int) j8, false);
                    } else {
                        gj2Var.f14598a = j9;
                        z = true;
                    }
                    m7590h(j9);
                    if (z && this.f16388f != 2) {
                        return 1;
                    }
                }
                z = false;
                m7590h(j9);
                if (z) {
                    continue;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: c */
    public final boolean mo6194c(bj2 bj2Var) throws InterruptedException, IOException {
        return mk2.m7718a(bj2Var, false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: d */
    public final void mo6195d(dj2 dj2Var) {
        this.f16395m = dj2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jj2
    /* JADX INFO: renamed from: e */
    public final long mo5819e(long j2) {
        long j3 = Long.MAX_VALUE;
        for (kk2 kk2Var : this.f16396n) {
            qk2 qk2Var = kk2Var.f15973b;
            int iM8212a = qk2Var.m8212a(j2);
            if (iM8212a == -1) {
                iM8212a = qk2Var.m8213b(j2);
            }
            long j4 = qk2Var.f18370b[iM8212a];
            if (j4 < j3) {
                j3 = j4;
            }
        }
        return j3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: f */
    public final void mo6196f(long j2, long j3) {
        this.f16387e.clear();
        this.f16391i = 0;
        this.f16393k = 0;
        this.f16394l = 0;
        if (j2 == 0) {
            m7589g();
            return;
        }
        kk2[] kk2VarArr = this.f16396n;
        if (kk2VarArr != null) {
            for (kk2 kk2Var : kk2VarArr) {
                qk2 qk2Var = kk2Var.f15973b;
                int iM8212a = qk2Var.m8212a(j3);
                if (iM8212a == -1) {
                    iM8212a = qk2Var.m8213b(j3);
                }
                kk2Var.f15975d = iM8212a;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7589g() {
        this.f16388f = 0;
        this.f16391i = 0;
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0312 A[Catch: all -> 0x0341, TryCatch #0 {all -> 0x0341, blocks: (B:29:0x00a4, B:31:0x00a8, B:33:0x00ae, B:35:0x00b5, B:38:0x00bd, B:39:0x00c4, B:40:0x00cb, B:42:0x00cf, B:43:0x00d7, B:45:0x00db, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x00fe, B:54:0x0103, B:56:0x010f, B:63:0x0128, B:64:0x013f, B:65:0x015b, B:67:0x0164, B:69:0x0168, B:70:0x0170, B:72:0x0174, B:73:0x017b, B:75:0x017f, B:76:0x0186, B:78:0x018a, B:79:0x0191, B:81:0x0195, B:82:0x019c, B:84:0x01a0, B:85:0x01a7, B:87:0x01ab, B:88:0x01b3, B:90:0x01b7, B:92:0x01c3, B:94:0x01c7, B:95:0x01ce, B:97:0x01d2, B:99:0x01dd, B:102:0x01e5, B:104:0x01e9, B:106:0x01fb, B:107:0x0202, B:109:0x0206, B:110:0x020d, B:116:0x0217, B:118:0x0220, B:120:0x022a, B:125:0x0234, B:171:0x0302, B:173:0x0312, B:175:0x031d, B:174:0x0317, B:129:0x0255, B:131:0x025d, B:133:0x0269, B:134:0x027c, B:136:0x028e, B:138:0x0299, B:137:0x0293, B:140:0x029f, B:142:0x02a5, B:145:0x02ab, B:147:0x02af, B:150:0x02b5, B:152:0x02b9, B:153:0x02c1, B:155:0x02c5, B:156:0x02cd, B:158:0x02d1, B:159:0x02d8, B:161:0x02dc, B:162:0x02e3, B:164:0x02e7, B:165:0x02ee, B:167:0x02f2, B:168:0x02f7, B:170:0x02fb, B:177:0x0325, B:178:0x032c), top: B:475:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0317 A[Catch: all -> 0x0341, TryCatch #0 {all -> 0x0341, blocks: (B:29:0x00a4, B:31:0x00a8, B:33:0x00ae, B:35:0x00b5, B:38:0x00bd, B:39:0x00c4, B:40:0x00cb, B:42:0x00cf, B:43:0x00d7, B:45:0x00db, B:46:0x00e3, B:48:0x00e7, B:49:0x00f1, B:51:0x00f5, B:52:0x00fe, B:54:0x0103, B:56:0x010f, B:63:0x0128, B:64:0x013f, B:65:0x015b, B:67:0x0164, B:69:0x0168, B:70:0x0170, B:72:0x0174, B:73:0x017b, B:75:0x017f, B:76:0x0186, B:78:0x018a, B:79:0x0191, B:81:0x0195, B:82:0x019c, B:84:0x01a0, B:85:0x01a7, B:87:0x01ab, B:88:0x01b3, B:90:0x01b7, B:92:0x01c3, B:94:0x01c7, B:95:0x01ce, B:97:0x01d2, B:99:0x01dd, B:102:0x01e5, B:104:0x01e9, B:106:0x01fb, B:107:0x0202, B:109:0x0206, B:110:0x020d, B:116:0x0217, B:118:0x0220, B:120:0x022a, B:125:0x0234, B:171:0x0302, B:173:0x0312, B:175:0x031d, B:174:0x0317, B:129:0x0255, B:131:0x025d, B:133:0x0269, B:134:0x027c, B:136:0x028e, B:138:0x0299, B:137:0x0293, B:140:0x029f, B:142:0x02a5, B:145:0x02ab, B:147:0x02af, B:150:0x02b5, B:152:0x02b9, B:153:0x02c1, B:155:0x02c5, B:156:0x02cd, B:158:0x02d1, B:159:0x02d8, B:161:0x02dc, B:162:0x02e3, B:164:0x02e7, B:165:0x02ee, B:167:0x02f2, B:168:0x02f7, B:170:0x02fb, B:177:0x0325, B:178:0x032c), top: B:475:0x00a4 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:258:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:280:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:283:0x05d9 A[ADDED_TO_REGION, LOOP:13: B:283:0x05d9->B:284:0x05db, LOOP_START, PHI: r0 r1 r20 r36
  0x05d9: PHI (r0v23 c.n.b.d.j.a.nk2) = (r0v10 c.n.b.d.j.a.nk2), (r0v30 c.n.b.d.j.a.nk2) binds: [B:282:0x05d7, B:284:0x05db] A[DONT_GENERATE, DONT_INLINE]
  0x05d9: PHI (r1v34 c.n.b.d.j.a.do2) = (r1v27 c.n.b.d.j.a.do2), (r1v40 c.n.b.d.j.a.do2) binds: [B:282:0x05d7, B:284:0x05db] A[DONT_GENERATE, DONT_INLINE]
  0x05d9: PHI (r20v8 int) = (r20v4 int), (r20v11 int) binds: [B:282:0x05d7, B:284:0x05db] A[DONT_GENERATE, DONT_INLINE]
  0x05d9: PHI (r36v2 long) = (r36v1 long), (r36v4 long) binds: [B:282:0x05d7, B:284:0x05db] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:284:0x05db A[LOOP:13: B:283:0x05d9->B:284:0x05db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:287:0x05f9 A[ADDED_TO_REGION, LOOP:14: B:287:0x05f9->B:289:0x05fd, LOOP_START, PHI: r17 r18 r24
  0x05f9: PHI (r17v4 int) = (r17v2 int), (r17v8 int) binds: [B:286:0x05f7, B:289:0x05fd] A[DONT_GENERATE, DONT_INLINE]
  0x05f9: PHI (r18v6 int) = (r18v2 int), (r18v7 int) binds: [B:286:0x05f7, B:289:0x05fd] A[DONT_GENERATE, DONT_INLINE]
  0x05f9: PHI (r24v10 int) = (r24v4 int), (r24v11 int) binds: [B:286:0x05f7, B:289:0x05fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:288:0x05fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:289:0x05fd A[LOOP:14: B:287:0x05f9->B:289:0x05fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:295:0x061b  */
    /* JADX WARN: Code duplicated, block: B:296:0x061f  */
    /* JADX WARN: Code duplicated, block: B:299:0x0629  */
    /* JADX WARN: Code duplicated, block: B:300:0x062b  */
    /* JADX WARN: Code duplicated, block: B:303:0x0630  */
    /* JADX WARN: Code duplicated, block: B:305:0x0637  */
    /* JADX WARN: Code duplicated, block: B:308:0x0644 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:309:0x0646  */
    /* JADX WARN: Code duplicated, block: B:310:0x0654  */
    /* JADX WARN: Code duplicated, block: B:311:0x0657  */
    /* JADX WARN: Code duplicated, block: B:315:0x0671  */
    /* JADX WARN: Code duplicated, block: B:316:0x0673  */
    /* JADX WARN: Code duplicated, block: B:319:0x0679  */
    /* JADX WARN: Code duplicated, block: B:321:0x067f  */
    /* JADX WARN: Code duplicated, block: B:322:0x0681  */
    /* JADX WARN: Code duplicated, block: B:325:0x068d  */
    /* JADX WARN: Code duplicated, block: B:326:0x068f  */
    /* JADX WARN: Code duplicated, block: B:327:0x0691 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:328:0x0693  */
    /* JADX WARN: Code duplicated, block: B:329:0x0696  */
    /* JADX WARN: Code duplicated, block: B:332:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:337:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:339:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:342:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:344:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:345:0x0701  */
    /* JADX WARN: Code duplicated, block: B:347:0x0705  */
    /* JADX WARN: Code duplicated, block: B:369:0x078d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:372:0x0794  */
    /* JADX WARN: Code duplicated, block: B:374:0x079c  */
    /* JADX WARN: Code duplicated, block: B:377:0x07a0 A[LOOP:7: B:375:0x079d->B:377:0x07a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:382:0x07d3  */
    /* JADX WARN: Code duplicated, block: B:383:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:387:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:389:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:391:0x080b  */
    /* JADX WARN: Code duplicated, block: B:392:0x080d  */
    /* JADX WARN: Code duplicated, block: B:397:0x081f  */
    /* JADX WARN: Code duplicated, block: B:398:0x0821  */
    /* JADX WARN: Code duplicated, block: B:401:0x0825  */
    /* JADX WARN: Code duplicated, block: B:402:0x0828  */
    /* JADX WARN: Code duplicated, block: B:404:0x082c  */
    /* JADX WARN: Code duplicated, block: B:405:0x082f  */
    /* JADX WARN: Code duplicated, block: B:408:0x0833  */
    /* JADX WARN: Code duplicated, block: B:410:0x0837  */
    /* JADX WARN: Code duplicated, block: B:411:0x083a  */
    /* JADX WARN: Code duplicated, block: B:415:0x0846  */
    /* JADX WARN: Code duplicated, block: B:417:0x0854  */
    /* JADX WARN: Code duplicated, block: B:419:0x0870  */
    /* JADX WARN: Code duplicated, block: B:420:0x0882  */
    /* JADX WARN: Code duplicated, block: B:423:0x088c  */
    /* JADX WARN: Code duplicated, block: B:425:0x08b3  */
    /* JADX WARN: Code duplicated, block: B:430:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:435:0x08f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:436:0x08f2 A[LOOP:11: B:433:0x08ed->B:436:0x08f2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:441:0x0913 A[PHI: r35
  0x0913: PHI (r35v4 c.n.b.d.j.a.fj2) = (r4v2 c.n.b.d.j.a.fj2), (r35v9 c.n.b.d.j.a.fj2) binds: [B:336:0x06eb, B:344:0x06fd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:485:0x090b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:0x0819 A[EDGE_INSN: B:505:0x0819->B:395:0x0819 BREAK  A[LOOP:8: B:385:0x07da->B:394:0x0812], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0812 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x08e6 A[EDGE_INSN: B:508:0x08e6->B:432:0x08e6 BREAK  A[LOOP:9: B:413:0x0841->B:431:0x08d4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x08b9 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x08f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x08fb A[EDGE_INSN: B:516:0x08fb->B:438:0x08fb BREAK  A[LOOP:11: B:433:0x08ed->B:436:0x08f2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:522:0x0608 A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public final void m7590h(long j2) throws fh2 {
        el2 el2Var;
        uj2 uj2Var;
        ArrayList arrayList;
        long j3;
        ArrayList arrayList2;
        long jMax;
        fj2 fj2Var;
        nk2 nk2VarM6369a;
        yj2 bk2Var;
        boolean z;
        int iM6397n;
        int iM6397n2;
        int iM6397n3;
        long j4;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        int iM6397n4;
        int i;
        int iM6397n5;
        long j5;
        long j6;
        int i2;
        int i3;
        int iM6397n6;
        int i4;
        int iM6395l;
        nk2 nk2Var;
        boolean z2;
        int i5;
        int i6;
        int i7;
        long[] jArr3;
        int[] iArr3;
        int i8;
        boolean z3;
        do2 do2Var;
        int iMo5821a;
        int i9;
        int i10;
        int i11;
        long[] jArr4;
        qk2 qk2Var;
        fj2 fj2Var2;
        boolean z4;
        long[] jArr5;
        long[] jArr6;
        boolean z5;
        int i12;
        int i13;
        int i14;
        boolean z6;
        long[] jArr7;
        long j7;
        long[] jArr8;
        boolean z7;
        boolean z8;
        long[] jArr9;
        int[] iArr4;
        int[] iArr5;
        long[] jArr10;
        int i15;
        int i16;
        int i17;
        long[] jArr11;
        int[] iArr6;
        int i18;
        int i19;
        long[] jArr12;
        int[] iArr7;
        long j8;
        long j9;
        long[] jArr13;
        int[] iArr8;
        long[] jArr14;
        int iM7372d;
        int iM7372d2;
        int[] iArr9;
        long j10;
        int iM7372d3;
        boolean z9;
        char c2;
        int i20;
        qk2 qk2Var2;
        int length;
        nk2 nk2Var2;
        int i21;
        kl2 jl2Var;
        kl2 kl2VarM7357a;
        String str;
        String str2;
        String strValueOf;
        String str3;
        lk2 lk2Var = this;
        while (!lk2Var.f16387e.isEmpty() && lk2Var.f16387e.peek().f20361P0 == j2) {
            uj2 uj2VarPop = lk2Var.f16387e.pop();
            if (uj2VarPop.f21233O0 == wj2.f21143B) {
                ArrayList arrayList3 = new ArrayList();
                fj2 fj2Var3 = new fj2();
                vj2 vj2VarM8509b = uj2VarPop.m8509b(wj2.f21232z0);
                int i22 = 12;
                String str4 = null;
                if (vj2VarM8509b != null) {
                    boolean z10 = lk2Var.f16398p;
                    int i23 = dk2.f13294a;
                    if (!z10) {
                        do2 do2Var2 = vj2VarM8509b.f20809P0;
                        int i24 = 8;
                        do2Var2.m6389f(8);
                        while (true) {
                            if (do2Var2.m6386c() >= i24) {
                                int i25 = do2Var2.f13341b;
                                int iM6395l2 = do2Var2.m6395l();
                                if (do2Var2.m6395l() == wj2.f21142A0) {
                                    do2Var2.m6389f(i25);
                                    int i26 = i25 + iM6395l2;
                                    do2Var2.m6390g(i22);
                                    while (true) {
                                        int i27 = do2Var2.f13341b;
                                        if (i27 < i26) {
                                            int iM6395l3 = do2Var2.m6395l();
                                            if (do2Var2.m6395l() == wj2.f21144B0) {
                                                do2Var2.m6389f(i27);
                                                int i28 = i27 + iM6395l3;
                                                do2Var2.m6390g(i24);
                                                ArrayList arrayList4 = new ArrayList();
                                                while (true) {
                                                    int i29 = do2Var2.f13341b;
                                                    if (i29 >= i28) {
                                                        break;
                                                    }
                                                    int i30 = jk2.f15619a;
                                                    int iM6395l4 = do2Var2.m6395l() + i29;
                                                    int iM6395l5 = do2Var2.m6395l();
                                                    if (((iM6395l5 >> 24) & 255) != 169) {
                                                        try {
                                                            if (iM6395l5 == jk2.f15631m) {
                                                                int iM7360d = jk2.m7360d(do2Var2);
                                                                if (iM7360d > 0) {
                                                                    String[] strArr = jk2.f15618D;
                                                                    int length2 = strArr.length;
                                                                    if (iM7360d <= 148) {
                                                                        str2 = strArr[iM7360d - 1];
                                                                    } else {
                                                                        str2 = str4;
                                                                    }
                                                                } else {
                                                                    str2 = str4;
                                                                }
                                                                if (str2 != null) {
                                                                    kl2VarM7357a = new ml2("TCON", str4, str2);
                                                                    i21 = i28;
                                                                    jl2Var = kl2VarM7357a;
                                                                    do2Var2.m6389f(iM6395l4);
                                                                } else {
                                                                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                                                                    i21 = i28;
                                                                    jl2Var = null;
                                                                    do2Var2.m6389f(iM6395l4);
                                                                }
                                                            } else {
                                                                if (iM6395l5 == jk2.f15633o) {
                                                                    kl2VarM7357a = jk2.m7359c(iM6395l5, "TPOS", do2Var2);
                                                                } else if (iM6395l5 == jk2.f15634p) {
                                                                    kl2VarM7357a = jk2.m7359c(iM6395l5, "TRCK", do2Var2);
                                                                } else {
                                                                    if (iM6395l5 == jk2.f15635q) {
                                                                        jl2Var = jk2.m7358b(iM6395l5, "TBPM", do2Var2, true, false);
                                                                    } else if (iM6395l5 == jk2.f15636r) {
                                                                        kl2VarM7357a = jk2.m7358b(iM6395l5, "TCMP", do2Var2, true, true);
                                                                    } else if (iM6395l5 == jk2.f15630l) {
                                                                        int iM6395l6 = do2Var2.m6395l();
                                                                        if (do2Var2.m6395l() == wj2.f21150E0) {
                                                                            int iM6395l7 = do2Var2.m6395l() & 16777215;
                                                                            if (iM6395l7 == 13) {
                                                                                str = "image/jpeg";
                                                                            } else if (iM6395l7 == 14) {
                                                                                str = "image/png";
                                                                                iM6395l7 = 14;
                                                                            } else {
                                                                                str = str4;
                                                                            }
                                                                            if (str == null) {
                                                                                StringBuilder sb = new StringBuilder(41);
                                                                                sb.append("Unrecognized cover art flags: ");
                                                                                sb.append(iM6395l7);
                                                                                Log.w("MetadataUtil", sb.toString());
                                                                            } else {
                                                                                do2Var2.m6390g(4);
                                                                                int i31 = iM6395l6 - 16;
                                                                                byte[] bArr = new byte[i31];
                                                                                System.arraycopy(do2Var2.f13340a, do2Var2.f13341b, bArr, 0, i31);
                                                                                do2Var2.f13341b += i31;
                                                                                kl2VarM7357a = new hl2(str, str4, 3, bArr);
                                                                            }
                                                                        } else {
                                                                            Log.w("MetadataUtil", "Failed to parse cover art attribute");
                                                                        }
                                                                        i21 = i28;
                                                                        jl2Var = null;
                                                                        do2Var2.m6389f(iM6395l4);
                                                                    } else if (iM6395l5 == jk2.f15637s) {
                                                                        kl2VarM7357a = jk2.m7357a(iM6395l5, "TPE2", do2Var2);
                                                                    } else if (iM6395l5 == jk2.f15638t) {
                                                                        kl2VarM7357a = jk2.m7357a(iM6395l5, "TSOT", do2Var2);
                                                                    } else if (iM6395l5 == jk2.f15639u) {
                                                                        kl2VarM7357a = jk2.m7357a(iM6395l5, "TSO2", do2Var2);
                                                                    } else if (iM6395l5 == jk2.f15640v) {
                                                                        kl2VarM7357a = jk2.m7357a(iM6395l5, "TSOA", do2Var2);
                                                                    } else if (iM6395l5 == jk2.f15641w) {
                                                                        kl2VarM7357a = jk2.m7357a(iM6395l5, "TSOP", do2Var2);
                                                                    } else if (iM6395l5 == jk2.f15642x) {
                                                                        kl2VarM7357a = jk2.m7357a(iM6395l5, "TSOC", do2Var2);
                                                                    } else if (iM6395l5 == jk2.f15643y) {
                                                                        kl2VarM7357a = jk2.m7358b(iM6395l5, "ITUNESADVISORY", do2Var2, false, false);
                                                                    } else {
                                                                        if (iM6395l5 == jk2.f15644z) {
                                                                            jl2Var = jk2.m7358b(iM6395l5, "ITUNESGAPLESS", do2Var2, false, true);
                                                                        } else if (iM6395l5 == jk2.f15615A) {
                                                                            kl2VarM7357a = jk2.m7357a(iM6395l5, "TVSHOWSORT", do2Var2);
                                                                        } else if (iM6395l5 == jk2.f15616B) {
                                                                            kl2VarM7357a = jk2.m7357a(iM6395l5, "TVSHOW", do2Var2);
                                                                        } else if (iM6395l5 == jk2.f15617C) {
                                                                            String strM6399p = str4;
                                                                            String strM6399p2 = strM6399p;
                                                                            int i32 = -1;
                                                                            int i33 = -1;
                                                                            while (true) {
                                                                                int i34 = do2Var2.f13341b;
                                                                                if (i34 >= iM6395l4) {
                                                                                    break;
                                                                                }
                                                                                int iM6395l8 = do2Var2.m6395l();
                                                                                int iM6395l9 = do2Var2.m6395l();
                                                                                int i35 = i28;
                                                                                do2Var2.m6390g(4);
                                                                                if (iM6395l9 == wj2.f21146C0) {
                                                                                    strM6399p = do2Var2.m6399p(iM6395l8 - 12);
                                                                                } else if (iM6395l9 == wj2.f21148D0) {
                                                                                    strM6399p2 = do2Var2.m6399p(iM6395l8 - 12);
                                                                                } else {
                                                                                    int i36 = wj2.f21150E0;
                                                                                    if (iM6395l9 == i36) {
                                                                                        i33 = iM6395l8;
                                                                                    }
                                                                                    if (iM6395l9 == i36) {
                                                                                        i32 = i34;
                                                                                    }
                                                                                    do2Var2.m6390g(iM6395l8 - 12);
                                                                                }
                                                                                i28 = i35;
                                                                            }
                                                                            i21 = i28;
                                                                            if ("com.apple.iTunes".equals(strM6399p) && "iTunSMPB".equals(strM6399p2) && i32 != -1) {
                                                                                do2Var2.m6389f(i32);
                                                                                do2Var2.m6390g(16);
                                                                                jl2Var = new jl2("und", strM6399p2, do2Var2.m6399p(i33 - 16));
                                                                            }
                                                                            jl2Var = null;
                                                                            do2Var2.m6389f(iM6395l4);
                                                                        } else {
                                                                            i21 = i28;
                                                                            strValueOf = String.valueOf(wj2.m8658a(iM6395l5));
                                                                            if (strValueOf.length() != 0) {
                                                                                str3 = "Skipped unknown metadata entry: ".concat(strValueOf);
                                                                            } else {
                                                                                str3 = new String("Skipped unknown metadata entry: ");
                                                                            }
                                                                            Log.d("MetadataUtil", str3);
                                                                            do2Var2.m6389f(iM6395l4);
                                                                            jl2Var = null;
                                                                        }
                                                                        do2Var2.m6389f(iM6395l4);
                                                                    }
                                                                    i21 = i28;
                                                                    do2Var2.m6389f(iM6395l4);
                                                                }
                                                                i21 = i28;
                                                                jl2Var = kl2VarM7357a;
                                                                do2Var2.m6389f(iM6395l4);
                                                            }
                                                        } catch (Throwable th) {
                                                            do2Var2.m6389f(iM6395l4);
                                                            throw th;
                                                        }
                                                    } else {
                                                        i21 = i28;
                                                        int i37 = iM6395l5 & 16777215;
                                                        if (i37 == jk2.f15621c) {
                                                            int iM6395l10 = do2Var2.m6395l();
                                                            if (do2Var2.m6395l() == wj2.f21150E0) {
                                                                do2Var2.m6390g(8);
                                                                String strM6399p3 = do2Var2.m6399p(iM6395l10 - 16);
                                                                jl2Var = new jl2("und", strM6399p3, strM6399p3);
                                                            } else {
                                                                String strValueOf2 = String.valueOf(wj2.m8658a(iM6395l5));
                                                                Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf2) : new String("Failed to parse comment attribute: "));
                                                                jl2Var = null;
                                                            }
                                                        } else if (i37 == jk2.f15619a || i37 == jk2.f15620b) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TIT2", do2Var2);
                                                        } else if (i37 == jk2.f15626h || i37 == jk2.f15627i) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TCOM", do2Var2);
                                                        } else if (i37 == jk2.f15622d) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TDRC", do2Var2);
                                                        } else if (i37 == jk2.f15623e) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TPE1", do2Var2);
                                                        } else if (i37 == jk2.f15624f) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TSSE", do2Var2);
                                                        } else if (i37 == jk2.f15625g) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TALB", do2Var2);
                                                        } else if (i37 == jk2.f15628j) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "USLT", do2Var2);
                                                        } else if (i37 == jk2.f15629k) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TCON", do2Var2);
                                                        } else if (i37 == jk2.f15632n) {
                                                            jl2Var = jk2.m7357a(iM6395l5, "TIT1", do2Var2);
                                                        } else {
                                                            strValueOf = String.valueOf(wj2.m8658a(iM6395l5));
                                                            if (strValueOf.length() != 0) {
                                                                str3 = "Skipped unknown metadata entry: ".concat(strValueOf);
                                                            } else {
                                                                str3 = new String("Skipped unknown metadata entry: ");
                                                            }
                                                            Log.d("MetadataUtil", str3);
                                                            do2Var2.m6389f(iM6395l4);
                                                            jl2Var = null;
                                                        }
                                                        do2Var2.m6389f(iM6395l4);
                                                    }
                                                    if (jl2Var != null) {
                                                        arrayList4.add(jl2Var);
                                                    }
                                                    i28 = i21;
                                                    str4 = null;
                                                }
                                                if (!arrayList4.isEmpty()) {
                                                    el2Var = new el2(arrayList4);
                                                    break;
                                                }
                                                break;
                                            }
                                            do2Var2.m6390g(iM6395l3 - 8);
                                            str4 = null;
                                            i24 = 8;
                                        }
                                    }
                                } else {
                                    do2Var2.m6390g(iM6395l2 - 8);
                                    i22 = 12;
                                    str4 = null;
                                    i24 = 8;
                                }
                            }
                            el2Var = null;
                            break;
                        }
                    }
                    el2Var = null;
                    if (el2Var != null) {
                        int i38 = 0;
                        while (true) {
                            dl2[] dl2VarArr = el2Var.f13606f;
                            if (i38 >= dl2VarArr.length) {
                                break;
                            }
                            dl2 dl2Var = dl2VarArr[i38];
                            if (dl2Var instanceof jl2) {
                                jl2 jl2Var2 = (jl2) dl2Var;
                                String str5 = jl2Var2.f15652h;
                                String str6 = jl2Var2.f15653i;
                                if ("iTunSMPB".equals(str5)) {
                                    Matcher matcher = fj2.f14042a.matcher(str6);
                                    if (matcher.find()) {
                                        try {
                                            try {
                                                int i39 = Integer.parseInt(matcher.group(1), 16);
                                                int i40 = Integer.parseInt(matcher.group(2), 16);
                                                if (i39 > 0 || i40 > 0) {
                                                    fj2Var3.f14043b = i39;
                                                    fj2Var3.f14044c = i40;
                                                    break;
                                                }
                                            } catch (NumberFormatException unused) {
                                                continue;
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                }
                            }
                            i38++;
                        }
                    }
                } else {
                    el2Var = null;
                }
                long j11 = -9223372036854775807L;
                long j12 = Long.MAX_VALUE;
                int i41 = 0;
                while (i41 < uj2VarPop.f20363R0.size()) {
                    uj2 uj2Var2 = uj2VarPop.f20363R0.get(i41);
                    if (uj2Var2.f21233O0 == wj2.f21147D && (nk2VarM6369a = dk2.m6369a(uj2Var2, uj2VarPop.m8509b(wj2.f21145C), -9223372036854775807L, null, lk2Var.f16398p)) != null) {
                        uj2 uj2VarM8510c = uj2Var2.m8510c(wj2.f21149E).m8510c(wj2.f21151F).m8510c(wj2.f21153G);
                        vj2 vj2VarM8509b2 = uj2VarM8510c.m8509b(wj2.f21212p0);
                        if (vj2VarM8509b2 != null) {
                            bk2Var = new ak2(vj2VarM8509b2);
                        } else {
                            vj2 vj2VarM8509b3 = uj2VarM8510c.m8509b(wj2.f21214q0);
                            if (vj2VarM8509b3 == null) {
                                throw new fh2("Track has no sample table size information");
                            }
                            bk2Var = new bk2(vj2VarM8509b3);
                        }
                        int iZza = bk2Var.zza();
                        if (iZza == 0) {
                            qk2Var = new qk2(new long[0], new int[0], 0, new long[0], new int[0]);
                            uj2Var = uj2VarPop;
                            el2Var = el2Var;
                            arrayList = arrayList3;
                            fj2Var3 = fj2Var3;
                            j11 = j11;
                            j3 = j12;
                            i41 = i41;
                            nk2Var = nk2VarM6369a;
                        } else {
                            vj2 vj2VarM8509b4 = uj2VarM8510c.m8509b(wj2.f21216r0);
                            if (vj2VarM8509b4 == null) {
                                vj2VarM8509b4 = uj2VarM8510c.m8509b(wj2.f21218s0);
                                z = true;
                            } else {
                                z = false;
                            }
                            do2 do2Var3 = vj2VarM8509b4.f20809P0;
                            do2 do2Var4 = uj2VarM8510c.m8509b(wj2.f21210o0).f20809P0;
                            uj2Var = uj2VarPop;
                            do2 do2Var5 = uj2VarM8510c.m8509b(wj2.f21204l0).f20809P0;
                            j3 = j12;
                            vj2 vj2VarM8509b5 = uj2VarM8510c.m8509b(wj2.f21206m0);
                            do2 do2Var6 = vj2VarM8509b5 != null ? vj2VarM8509b5.f20809P0 : null;
                            vj2 vj2VarM8509b6 = uj2VarM8510c.m8509b(wj2.f21208n0);
                            do2 do2Var7 = vj2VarM8509b6 != null ? vj2VarM8509b6.f20809P0 : null;
                            xj2 xj2Var = new xj2(do2Var4, do2Var3, z);
                            do2Var5.m6389f(12);
                            int iM6397n7 = do2Var5.m6397n() - 1;
                            int iM6397n8 = do2Var5.m6397n();
                            int iM6397n9 = do2Var5.m6397n();
                            if (do2Var7 != null) {
                                do2Var7.m6389f(12);
                                iM6397n = do2Var7.m6397n();
                            } else {
                                iM6397n = 0;
                            }
                            if (do2Var6 != null) {
                                do2Var6.m6389f(12);
                                iM6397n2 = do2Var6.m6397n();
                                if (iM6397n2 > 0) {
                                    iM6397n3 = do2Var6.m6397n() - 1;
                                } else {
                                    do2Var6 = null;
                                }
                                j4 = 0;
                                if (bk2Var.mo5822b()) {
                                    arrayList = arrayList3;
                                    if (!"audio/raw".equals(nk2VarM6369a.f17147f.f13016k) && iM6397n7 == 0) {
                                        if (iM6397n == 0 && iM6397n2 == 0) {
                                            int i42 = xj2Var.f21561a;
                                            long[] jArr15 = new long[i42];
                                            int[] iArr10 = new int[i42];
                                            while (xj2Var.m8739a()) {
                                                int i43 = xj2Var.f21562b;
                                                jArr15[i43] = xj2Var.f21564d;
                                                iArr10[i43] = xj2Var.f21563c;
                                            }
                                            int iMo5821a2 = bk2Var.mo5821a();
                                            long j13 = iM6397n9;
                                            int i44 = 8192 / iMo5821a2;
                                            int i45 = 0;
                                            int iM7370b = 0;
                                            while (i45 < i42) {
                                                iM7370b += jo2.m7370b(iArr10[i45], i44);
                                                i45++;
                                                j11 = j11;
                                            }
                                            j11 = j11;
                                            jArr = new long[iM7370b];
                                            iArr = new int[iM7370b];
                                            jArr3 = new long[iM7370b];
                                            iArr3 = new int[iM7370b];
                                            el2Var = el2Var;
                                            int i46 = 0;
                                            int i47 = 0;
                                            int i48 = 0;
                                            int i49 = 0;
                                            while (i46 < i42) {
                                                int i50 = iArr10[i46];
                                                long j14 = jArr15[i46];
                                                int i51 = i42;
                                                int iMax = i47;
                                                int i52 = i48;
                                                long[] jArr16 = jArr15;
                                                int i53 = i52;
                                                int[] iArr11 = iArr10;
                                                int i54 = i50;
                                                while (i54 > 0) {
                                                    int iMin = Math.min(i44, i54);
                                                    jArr[i49] = j14;
                                                    long[] jArr17 = jArr;
                                                    int i55 = iMo5821a2 * iMin;
                                                    iArr[i49] = i55;
                                                    iMax = Math.max(iMax, i55);
                                                    jArr3[i49] = ((long) i53) * j13;
                                                    iArr3[i49] = 1;
                                                    j14 += (long) iArr[i49];
                                                    i53 += iMin;
                                                    i54 -= iMin;
                                                    i49++;
                                                    iMo5821a2 = iMo5821a2;
                                                    jArr = jArr17;
                                                    i44 = i44;
                                                }
                                                i46++;
                                                i47 = iMax;
                                                iArr10 = iArr11;
                                                i42 = i51;
                                                jArr = jArr;
                                                i48 = i53;
                                                jArr15 = jArr16;
                                            }
                                            nk2Var = nk2VarM6369a;
                                            i8 = i47;
                                            j6 = 0;
                                        } else {
                                            el2Var = el2Var;
                                            iM6397n7 = 0;
                                            jArr = new long[iZza];
                                            iArr = new int[iZza];
                                            jArr2 = new long[iZza];
                                            iArr2 = new int[iZza];
                                            iM6397n4 = iM6397n8;
                                            i = iM6397n2;
                                            iM6397n5 = iM6397n3;
                                            j5 = 0;
                                            j6 = 0;
                                            i2 = 0;
                                            i3 = 0;
                                            iM6397n6 = 0;
                                            i4 = 0;
                                            iM6395l = 0;
                                            while (i3 < iZza) {
                                                while (i4 == 0) {
                                                    C2622l.m5322V2(xj2Var.m8739a());
                                                    j5 = xj2Var.f21564d;
                                                    i4 = xj2Var.f21563c;
                                                    nk2VarM6369a = nk2VarM6369a;
                                                    do2Var5 = do2Var5;
                                                }
                                                nk2 nk2Var3 = nk2VarM6369a;
                                                do2Var = do2Var5;
                                                if (do2Var7 != null) {
                                                    while (iM6397n6 == 0) {
                                                        if (iM6397n <= 0) {
                                                            iM6397n6 = 0;
                                                            break;
                                                        } else {
                                                            iM6397n6 = do2Var7.m6397n();
                                                            iM6395l = do2Var7.m6395l();
                                                            iM6397n--;
                                                        }
                                                    }
                                                    iM6397n6--;
                                                }
                                                int i56 = iM6395l;
                                                jArr[i3] = j5;
                                                iMo5821a = bk2Var.mo5821a();
                                                iArr[i3] = iMo5821a;
                                                if (iMo5821a > i2) {
                                                    i9 = iMo5821a;
                                                } else {
                                                    i9 = i2;
                                                }
                                                jArr2[i3] = j6 + ((long) i56);
                                                if (do2Var6 == null) {
                                                    i10 = 1;
                                                } else {
                                                    i10 = 0;
                                                }
                                                iArr2[i3] = i10;
                                                if (i3 == iM6397n5) {
                                                    iArr2[i3] = 1;
                                                    i--;
                                                    if (i > 0) {
                                                        iM6397n5 = do2Var6.m6397n() - 1;
                                                    }
                                                }
                                                j6 += (long) iM6397n9;
                                                i11 = iM6397n4 - 1;
                                                if (i11 != 0) {
                                                    iM6397n4 = i11;
                                                } else if (iM6397n7 > 0) {
                                                    iM6397n7--;
                                                    iM6397n4 = do2Var.m6397n();
                                                    iM6397n9 = do2Var.m6397n();
                                                } else {
                                                    iM6397n4 = 0;
                                                }
                                                j5 += (long) iArr[i3];
                                                i4--;
                                                i3++;
                                                xj2Var = xj2Var;
                                                i2 = i9;
                                                do2Var5 = do2Var;
                                                iM6395l = i56;
                                                nk2VarM6369a = nk2Var3;
                                            }
                                            nk2Var = nk2VarM6369a;
                                            if (iM6397n6 == 0) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            C2622l.m5366f1(z2);
                                            while (iM6397n > 0) {
                                                if (do2Var7.m6397n() == 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                C2622l.m5366f1(z3);
                                                do2Var7.m6395l();
                                                iM6397n--;
                                            }
                                            if (i == 0) {
                                                if (iM6397n4 == 0) {
                                                    if (i4 == 0) {
                                                        if (iM6397n7 != 0) {
                                                            i4 = 0;
                                                        } else {
                                                            nk2Var = nk2Var;
                                                        }
                                                        jArr3 = jArr2;
                                                        iArr3 = iArr2;
                                                        i8 = i2;
                                                    }
                                                    iM6397n4 = 0;
                                                }
                                                i5 = i4;
                                                i6 = iM6397n4;
                                                i7 = 0;
                                            } else {
                                                i5 = i4;
                                                i6 = iM6397n4;
                                                i7 = i;
                                            }
                                            int i57 = nk2Var.f17142a;
                                            StringBuilder sb2 = new StringBuilder(215);
                                            sb2.append("Inconsistent stbl box for track ");
                                            sb2.append(i57);
                                            sb2.append(": remainingSynchronizationSamples ");
                                            sb2.append(i7);
                                            sb2.append(", remainingSamplesAtTimestampDelta ");
                                            sb2.append(i6);
                                            sb2.append(", remainingSamplesInChunk ");
                                            sb2.append(i5);
                                            sb2.append(", remainingTimestampDeltaChanges ");
                                            sb2.append(iM6397n7);
                                            Log.w("AtomParsers", sb2.toString());
                                            jArr3 = jArr2;
                                            iArr3 = iArr2;
                                            i8 = i2;
                                        }
                                    }
                                    jArr4 = nk2Var.f17150i;
                                    if (jArr4 != null) {
                                        fj2Var2 = fj2Var3;
                                        if (fj2Var2.f14043b != -1 || fj2Var2.f14044c == -1) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            fj2Var3 = fj2Var2;
                                            jo2.m7374f(jArr3, nk2Var.f17144c);
                                            qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                        } else {
                                            if (jArr4.length == 1 || nk2Var.f17143b != 1 || (length = jArr3.length) < 2) {
                                                jArr5 = jArr;
                                            } else {
                                                long j15 = nk2Var.f17151j[0];
                                                jArr5 = jArr;
                                                long jM7373e = jo2.m7373e(jArr4[0], nk2Var.f17144c, nk2Var.f17145d) + j15;
                                                long j16 = jArr3[0];
                                                if (j16 <= j15 && j15 < jArr3[1] && jArr3[length - 1] < jM7373e && jM7373e <= j6) {
                                                    long jM7373e2 = jo2.m7373e(j15 - j16, nk2Var.f17147f.f13029x, nk2Var.f17144c);
                                                    long jM7373e3 = jo2.m7373e(j6 - jM7373e, nk2Var.f17147f.f13029x, nk2Var.f17144c);
                                                    if ((jM7373e2 != 0 || jM7373e3 != 0) && jM7373e2 <= 2147483647L && jM7373e3 <= 2147483647L) {
                                                        fj2Var2.f14043b = (int) jM7373e2;
                                                        fj2Var2.f14044c = (int) jM7373e3;
                                                        jo2.m7374f(jArr3, nk2Var.f17144c);
                                                        qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                    }
                                                    qk2Var = qk2Var2;
                                                    fj2Var3 = fj2Var2;
                                                }
                                            }
                                            jArr6 = nk2Var.f17150i;
                                            if (jArr6.length == 1) {
                                                c2 = 0;
                                                if (jArr6[0] == 0) {
                                                    i20 = 0;
                                                    while (i20 < jArr3.length) {
                                                        jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                        i20++;
                                                        c2 = 0;
                                                    }
                                                    qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                    qk2Var = qk2Var2;
                                                    fj2Var3 = fj2Var2;
                                                }
                                            }
                                            if (nk2Var.f17143b == 1) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            i12 = 0;
                                            i13 = 0;
                                            i14 = 0;
                                            z6 = false;
                                            while (true) {
                                                jArr7 = nk2Var.f17150i;
                                                j7 = -1;
                                                if (i12 >= jArr7.length) {
                                                    break;
                                                }
                                                long[] jArr18 = jArr5;
                                                fj2 fj2Var4 = fj2Var2;
                                                j10 = nk2Var.f17151j[i12];
                                                if (j10 != -1) {
                                                    long jM7373e4 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                    iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                    int iM7372d4 = jo2.m7372d(jArr3, j10 + jM7373e4, z5, false);
                                                    int i58 = (iM7372d4 - iM7372d3) + i13;
                                                    if (i14 != iM7372d3) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    i14 = iM7372d4;
                                                    z6 = z9 | z6;
                                                    i13 = i58;
                                                }
                                                i12++;
                                                jArr5 = jArr18;
                                                fj2Var2 = fj2Var4;
                                            }
                                            jArr8 = jArr5;
                                            fj2Var3 = fj2Var2;
                                            if (i13 != iZza) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            z8 = z7 | z6;
                                            if (z8) {
                                                jArr9 = new long[i13];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (z8) {
                                                iArr4 = new int[i13];
                                            } else {
                                                iArr4 = iArr;
                                            }
                                            if (true == z8) {
                                                i8 = 0;
                                            }
                                            if (z8) {
                                                iArr5 = new int[i13];
                                            } else {
                                                iArr5 = iArr3;
                                            }
                                            jArr10 = new long[i13];
                                            i15 = i8;
                                            i16 = 0;
                                            i17 = 0;
                                            while (true) {
                                                jArr11 = nk2Var.f17150i;
                                                if (i17 >= jArr11.length) {
                                                    break;
                                                }
                                                jArr12 = jArr10;
                                                iArr7 = iArr5;
                                                j8 = nk2Var.f17151j[i17];
                                                j9 = jArr11[i17];
                                                if (j8 != j7) {
                                                    long jM7373e5 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                    iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                    iM7372d2 = jo2.m7372d(jArr3, jM7373e5 + j8, z5, false);
                                                    if (z8) {
                                                        int i59 = iM7372d2 - iM7372d;
                                                        jArr13 = jArr8;
                                                        System.arraycopy(jArr13, iM7372d, jArr9, i16, i59);
                                                        System.arraycopy(iArr, iM7372d, iArr4, i16, i59);
                                                        iArr9 = iArr7;
                                                        System.arraycopy(iArr3, iM7372d, iArr9, i16, i59);
                                                    } else {
                                                        jArr13 = jArr8;
                                                        iArr9 = iArr7;
                                                    }
                                                    int i60 = i15;
                                                    while (iM7372d < iM7372d2) {
                                                        long[] jArr19 = jArr9;
                                                        int[] iArr12 = iArr9;
                                                        long j17 = j8;
                                                        jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                        if (!z8 && iArr4[i16] > i60) {
                                                            i60 = iArr[iM7372d];
                                                        }
                                                        i16++;
                                                        iM7372d++;
                                                        jArr9 = jArr19;
                                                        iArr9 = iArr12;
                                                        j8 = j17;
                                                    }
                                                    jArr14 = jArr9;
                                                    iArr8 = iArr9;
                                                    i15 = i60;
                                                } else {
                                                    jArr13 = jArr8;
                                                    iArr8 = iArr7;
                                                    jArr14 = jArr9;
                                                    z5 = z5;
                                                }
                                                j4 += j9;
                                                i17++;
                                                z5 = z5;
                                                jArr9 = jArr14;
                                                jArr10 = jArr12;
                                                iArr5 = iArr8;
                                                jArr8 = jArr13;
                                                j7 = -1;
                                            }
                                            long[] jArr20 = jArr9;
                                            long[] jArr21 = jArr10;
                                            iArr6 = iArr5;
                                            i18 = 0;
                                            i19 = 0;
                                            while (true) {
                                                if (i19 >= iArr6.length) {
                                                    if (i18 != 0) {
                                                        break;
                                                    } else {
                                                        throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                } else {
                                                    if (i18 != 0) {
                                                        break;
                                                    }
                                                    i18 = iArr6[i19] & 1;
                                                    i19++;
                                                }
                                            }
                                            qk2Var = new qk2(jArr20, iArr4, i15, jArr21, iArr6);
                                        }
                                    } else {
                                        jo2.m7374f(jArr3, nk2Var.f17144c);
                                        qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                    }
                                } else {
                                    arrayList = arrayList3;
                                }
                                jArr = new long[iZza];
                                iArr = new int[iZza];
                                jArr2 = new long[iZza];
                                iArr2 = new int[iZza];
                                iM6397n4 = iM6397n8;
                                i = iM6397n2;
                                iM6397n5 = iM6397n3;
                                j5 = 0;
                                j6 = 0;
                                i2 = 0;
                                i3 = 0;
                                iM6397n6 = 0;
                                i4 = 0;
                                iM6395l = 0;
                                while (i3 < iZza) {
                                    while (i4 == 0) {
                                        C2622l.m5322V2(xj2Var.m8739a());
                                        j5 = xj2Var.f21564d;
                                        i4 = xj2Var.f21563c;
                                        nk2VarM6369a = nk2VarM6369a;
                                        do2Var5 = do2Var5;
                                    }
                                    nk2 nk2Var4 = nk2VarM6369a;
                                    do2Var = do2Var5;
                                    if (do2Var7 != null) {
                                        while (iM6397n6 == 0) {
                                            if (iM6397n <= 0) {
                                                iM6397n6 = 0;
                                                break;
                                            } else {
                                                iM6397n6 = do2Var7.m6397n();
                                                iM6395l = do2Var7.m6395l();
                                                iM6397n--;
                                            }
                                        }
                                        iM6397n6--;
                                    }
                                    int i510 = iM6395l;
                                    jArr[i3] = j5;
                                    iMo5821a = bk2Var.mo5821a();
                                    iArr[i3] = iMo5821a;
                                    if (iMo5821a > i2) {
                                        i9 = iMo5821a;
                                    } else {
                                        i9 = i2;
                                    }
                                    jArr2[i3] = j6 + ((long) i510);
                                    if (do2Var6 == null) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                    iArr2[i3] = i10;
                                    if (i3 == iM6397n5) {
                                        iArr2[i3] = 1;
                                        i--;
                                        if (i > 0) {
                                            iM6397n5 = do2Var6.m6397n() - 1;
                                        }
                                    }
                                    j6 += (long) iM6397n9;
                                    i11 = iM6397n4 - 1;
                                    if (i11 != 0) {
                                        iM6397n4 = i11;
                                    } else if (iM6397n7 > 0) {
                                        iM6397n7--;
                                        iM6397n4 = do2Var.m6397n();
                                        iM6397n9 = do2Var.m6397n();
                                    } else {
                                        iM6397n4 = 0;
                                    }
                                    j5 += (long) iArr[i3];
                                    i4--;
                                    i3++;
                                    xj2Var = xj2Var;
                                    i2 = i9;
                                    do2Var5 = do2Var;
                                    iM6395l = i510;
                                    nk2VarM6369a = nk2Var4;
                                }
                                nk2Var = nk2VarM6369a;
                                if (iM6397n6 == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                C2622l.m5366f1(z2);
                                while (iM6397n > 0) {
                                    if (do2Var7.m6397n() == 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    C2622l.m5366f1(z3);
                                    do2Var7.m6395l();
                                    iM6397n--;
                                }
                                if (i == 0) {
                                    if (iM6397n4 == 0) {
                                        if (i4 == 0) {
                                            if (iM6397n7 != 0) {
                                                i4 = 0;
                                            } else {
                                                nk2Var = nk2Var;
                                            }
                                            jArr3 = jArr2;
                                            iArr3 = iArr2;
                                            i8 = i2;
                                            jArr4 = nk2Var.f17150i;
                                            if (jArr4 != null) {
                                                fj2Var2 = fj2Var3;
                                                if (fj2Var2.f14043b != -1) {
                                                    z4 = false;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4) {
                                                    fj2Var3 = fj2Var2;
                                                    jo2.m7374f(jArr3, nk2Var.f17144c);
                                                    qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                                } else {
                                                    if (jArr4.length == 1) {
                                                        jArr5 = jArr;
                                                        jArr6 = nk2Var.f17150i;
                                                        if (jArr6.length == 1) {
                                                            c2 = 0;
                                                            if (jArr6[0] == 0) {
                                                                i20 = 0;
                                                                while (i20 < jArr3.length) {
                                                                    jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                                    i20++;
                                                                    c2 = 0;
                                                                }
                                                                qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                            }
                                                        }
                                                        if (nk2Var.f17143b == 1) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        i12 = 0;
                                                        i13 = 0;
                                                        i14 = 0;
                                                        z6 = false;
                                                        while (true) {
                                                            jArr7 = nk2Var.f17150i;
                                                            j7 = -1;
                                                            if (i12 >= jArr7.length) {
                                                                break;
                                                                break;
                                                            }
                                                            long[] jArr110 = jArr5;
                                                            fj2 fj2Var5 = fj2Var2;
                                                            j10 = nk2Var.f17151j[i12];
                                                            if (j10 != -1) {
                                                                long jM7373e6 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                                iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                                int iM7372d5 = jo2.m7372d(jArr3, j10 + jM7373e6, z5, false);
                                                                int i511 = (iM7372d5 - iM7372d3) + i13;
                                                                if (i14 != iM7372d3) {
                                                                    z9 = true;
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                i14 = iM7372d5;
                                                                z6 = z9 | z6;
                                                                i13 = i511;
                                                            }
                                                            i12++;
                                                            jArr5 = jArr110;
                                                            fj2Var2 = fj2Var5;
                                                        }
                                                        jArr8 = jArr5;
                                                        fj2Var3 = fj2Var2;
                                                        if (i13 != iZza) {
                                                            z7 = true;
                                                        } else {
                                                            z7 = false;
                                                        }
                                                        z8 = z7 | z6;
                                                        if (z8) {
                                                            jArr9 = new long[i13];
                                                        } else {
                                                            jArr9 = jArr8;
                                                        }
                                                        if (z8) {
                                                            iArr4 = new int[i13];
                                                        } else {
                                                            iArr4 = iArr;
                                                        }
                                                        if (true == z8) {
                                                            i8 = 0;
                                                        }
                                                        if (z8) {
                                                            iArr5 = new int[i13];
                                                        } else {
                                                            iArr5 = iArr3;
                                                        }
                                                        jArr10 = new long[i13];
                                                        i15 = i8;
                                                        i16 = 0;
                                                        i17 = 0;
                                                        while (true) {
                                                            jArr11 = nk2Var.f17150i;
                                                            if (i17 >= jArr11.length) {
                                                                break;
                                                                break;
                                                            }
                                                            jArr12 = jArr10;
                                                            iArr7 = iArr5;
                                                            j8 = nk2Var.f17151j[i17];
                                                            j9 = jArr11[i17];
                                                            if (j8 != j7) {
                                                                long jM7373e7 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                                iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                                iM7372d2 = jo2.m7372d(jArr3, jM7373e7 + j8, z5, false);
                                                                if (z8) {
                                                                    int i512 = iM7372d2 - iM7372d;
                                                                    jArr13 = jArr8;
                                                                    System.arraycopy(jArr13, iM7372d, jArr9, i16, i512);
                                                                    System.arraycopy(iArr, iM7372d, iArr4, i16, i512);
                                                                    iArr9 = iArr7;
                                                                    System.arraycopy(iArr3, iM7372d, iArr9, i16, i512);
                                                                } else {
                                                                    jArr13 = jArr8;
                                                                    iArr9 = iArr7;
                                                                }
                                                                int i61 = i15;
                                                                while (iM7372d < iM7372d2) {
                                                                    long[] jArr111 = jArr9;
                                                                    int[] iArr13 = iArr9;
                                                                    long j18 = j8;
                                                                    jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                                    if (!z8) {
                                                                    }
                                                                    i16++;
                                                                    iM7372d++;
                                                                    jArr9 = jArr111;
                                                                    iArr9 = iArr13;
                                                                    j8 = j18;
                                                                }
                                                                jArr14 = jArr9;
                                                                iArr8 = iArr9;
                                                                i15 = i61;
                                                            } else {
                                                                jArr13 = jArr8;
                                                                iArr8 = iArr7;
                                                                jArr14 = jArr9;
                                                                z5 = z5;
                                                            }
                                                            j4 += j9;
                                                            i17++;
                                                            z5 = z5;
                                                            jArr9 = jArr14;
                                                            jArr10 = jArr12;
                                                            iArr5 = iArr8;
                                                            jArr8 = jArr13;
                                                            j7 = -1;
                                                        }
                                                        long[] jArr22 = jArr9;
                                                        long[] jArr23 = jArr10;
                                                        iArr6 = iArr5;
                                                        i18 = 0;
                                                        i19 = 0;
                                                        while (true) {
                                                            if (i19 >= iArr6.length) {
                                                                if (i18 != 0) {
                                                                    break;
                                                                } else {
                                                                    throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                                }
                                                            } else if (i18 != 0) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i18 = iArr6[i19] & 1;
                                                                i19++;
                                                            }
                                                        }
                                                        qk2Var = new qk2(jArr22, iArr4, i15, jArr23, iArr6);
                                                    } else {
                                                        jArr5 = jArr;
                                                        jArr6 = nk2Var.f17150i;
                                                        if (jArr6.length == 1) {
                                                            c2 = 0;
                                                            if (jArr6[0] == 0) {
                                                                i20 = 0;
                                                                while (i20 < jArr3.length) {
                                                                    jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                                    i20++;
                                                                    c2 = 0;
                                                                }
                                                                qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                            }
                                                        }
                                                        if (nk2Var.f17143b == 1) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        i12 = 0;
                                                        i13 = 0;
                                                        i14 = 0;
                                                        z6 = false;
                                                        while (true) {
                                                            jArr7 = nk2Var.f17150i;
                                                            j7 = -1;
                                                            if (i12 >= jArr7.length) {
                                                                break;
                                                                break;
                                                            }
                                                            long[] jArr112 = jArr5;
                                                            fj2 fj2Var6 = fj2Var2;
                                                            j10 = nk2Var.f17151j[i12];
                                                            if (j10 != -1) {
                                                                long jM7373e8 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                                iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                                int iM7372d6 = jo2.m7372d(jArr3, j10 + jM7373e8, z5, false);
                                                                int i513 = (iM7372d6 - iM7372d3) + i13;
                                                                if (i14 != iM7372d3) {
                                                                    z9 = true;
                                                                } else {
                                                                    z9 = false;
                                                                }
                                                                i14 = iM7372d6;
                                                                z6 = z9 | z6;
                                                                i13 = i513;
                                                            }
                                                            i12++;
                                                            jArr5 = jArr112;
                                                            fj2Var2 = fj2Var6;
                                                        }
                                                        jArr8 = jArr5;
                                                        fj2Var3 = fj2Var2;
                                                        if (i13 != iZza) {
                                                            z7 = true;
                                                        } else {
                                                            z7 = false;
                                                        }
                                                        z8 = z7 | z6;
                                                        if (z8) {
                                                            jArr9 = new long[i13];
                                                        } else {
                                                            jArr9 = jArr8;
                                                        }
                                                        if (z8) {
                                                            iArr4 = new int[i13];
                                                        } else {
                                                            iArr4 = iArr;
                                                        }
                                                        if (true == z8) {
                                                            i8 = 0;
                                                        }
                                                        if (z8) {
                                                            iArr5 = new int[i13];
                                                        } else {
                                                            iArr5 = iArr3;
                                                        }
                                                        jArr10 = new long[i13];
                                                        i15 = i8;
                                                        i16 = 0;
                                                        i17 = 0;
                                                        while (true) {
                                                            jArr11 = nk2Var.f17150i;
                                                            if (i17 >= jArr11.length) {
                                                                break;
                                                                break;
                                                            }
                                                            jArr12 = jArr10;
                                                            iArr7 = iArr5;
                                                            j8 = nk2Var.f17151j[i17];
                                                            j9 = jArr11[i17];
                                                            if (j8 != j7) {
                                                                long jM7373e9 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                                iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                                iM7372d2 = jo2.m7372d(jArr3, jM7373e9 + j8, z5, false);
                                                                if (z8) {
                                                                    int i514 = iM7372d2 - iM7372d;
                                                                    jArr13 = jArr8;
                                                                    System.arraycopy(jArr13, iM7372d, jArr9, i16, i514);
                                                                    System.arraycopy(iArr, iM7372d, iArr4, i16, i514);
                                                                    iArr9 = iArr7;
                                                                    System.arraycopy(iArr3, iM7372d, iArr9, i16, i514);
                                                                } else {
                                                                    jArr13 = jArr8;
                                                                    iArr9 = iArr7;
                                                                }
                                                                int i62 = i15;
                                                                while (iM7372d < iM7372d2) {
                                                                    long[] jArr113 = jArr9;
                                                                    int[] iArr14 = iArr9;
                                                                    long j19 = j8;
                                                                    jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                                    if (!z8) {
                                                                    }
                                                                    i16++;
                                                                    iM7372d++;
                                                                    jArr9 = jArr113;
                                                                    iArr9 = iArr14;
                                                                    j8 = j19;
                                                                }
                                                                jArr14 = jArr9;
                                                                iArr8 = iArr9;
                                                                i15 = i62;
                                                            } else {
                                                                jArr13 = jArr8;
                                                                iArr8 = iArr7;
                                                                jArr14 = jArr9;
                                                                z5 = z5;
                                                            }
                                                            j4 += j9;
                                                            i17++;
                                                            z5 = z5;
                                                            jArr9 = jArr14;
                                                            jArr10 = jArr12;
                                                            iArr5 = iArr8;
                                                            jArr8 = jArr13;
                                                            j7 = -1;
                                                        }
                                                        long[] jArr24 = jArr9;
                                                        long[] jArr25 = jArr10;
                                                        iArr6 = iArr5;
                                                        i18 = 0;
                                                        i19 = 0;
                                                        while (true) {
                                                            if (i19 >= iArr6.length) {
                                                                if (i18 != 0) {
                                                                    break;
                                                                } else {
                                                                    throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                                }
                                                            } else if (i18 != 0) {
                                                                break;
                                                                break;
                                                            } else {
                                                                i18 = iArr6[i19] & 1;
                                                                i19++;
                                                            }
                                                        }
                                                        qk2Var = new qk2(jArr24, iArr4, i15, jArr25, iArr6);
                                                    }
                                                    qk2Var = qk2Var2;
                                                    fj2Var3 = fj2Var2;
                                                }
                                            } else {
                                                jo2.m7374f(jArr3, nk2Var.f17144c);
                                                qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                            }
                                        }
                                        iM6397n4 = 0;
                                    }
                                    i5 = i4;
                                    i6 = iM6397n4;
                                    i7 = 0;
                                } else {
                                    i5 = i4;
                                    i6 = iM6397n4;
                                    i7 = i;
                                }
                                int i515 = nk2Var.f17142a;
                                StringBuilder sb3 = new StringBuilder(215);
                                sb3.append("Inconsistent stbl box for track ");
                                sb3.append(i515);
                                sb3.append(": remainingSynchronizationSamples ");
                                sb3.append(i7);
                                sb3.append(", remainingSamplesAtTimestampDelta ");
                                sb3.append(i6);
                                sb3.append(", remainingSamplesInChunk ");
                                sb3.append(i5);
                                sb3.append(", remainingTimestampDeltaChanges ");
                                sb3.append(iM6397n7);
                                Log.w("AtomParsers", sb3.toString());
                                jArr3 = jArr2;
                                iArr3 = iArr2;
                                i8 = i2;
                                jArr4 = nk2Var.f17150i;
                                if (jArr4 != null) {
                                    fj2Var2 = fj2Var3;
                                    if (fj2Var2.f14043b != -1) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        fj2Var3 = fj2Var2;
                                        jo2.m7374f(jArr3, nk2Var.f17144c);
                                        qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                    } else {
                                        if (jArr4.length == 1) {
                                            jArr5 = jArr;
                                            jArr6 = nk2Var.f17150i;
                                            if (jArr6.length == 1) {
                                                c2 = 0;
                                                if (jArr6[0] == 0) {
                                                    i20 = 0;
                                                    while (i20 < jArr3.length) {
                                                        jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                        i20++;
                                                        c2 = 0;
                                                    }
                                                    qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                }
                                            }
                                            if (nk2Var.f17143b == 1) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            i12 = 0;
                                            i13 = 0;
                                            i14 = 0;
                                            z6 = false;
                                            while (true) {
                                                jArr7 = nk2Var.f17150i;
                                                j7 = -1;
                                                if (i12 >= jArr7.length) {
                                                    break;
                                                    break;
                                                }
                                                long[] jArr114 = jArr5;
                                                fj2 fj2Var7 = fj2Var2;
                                                j10 = nk2Var.f17151j[i12];
                                                if (j10 != -1) {
                                                    long jM7373e10 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                    iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                    int iM7372d7 = jo2.m7372d(jArr3, j10 + jM7373e10, z5, false);
                                                    int i516 = (iM7372d7 - iM7372d3) + i13;
                                                    if (i14 != iM7372d3) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    i14 = iM7372d7;
                                                    z6 = z9 | z6;
                                                    i13 = i516;
                                                }
                                                i12++;
                                                jArr5 = jArr114;
                                                fj2Var2 = fj2Var7;
                                            }
                                            jArr8 = jArr5;
                                            fj2Var3 = fj2Var2;
                                            if (i13 != iZza) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            z8 = z7 | z6;
                                            if (z8) {
                                                jArr9 = new long[i13];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (z8) {
                                                iArr4 = new int[i13];
                                            } else {
                                                iArr4 = iArr;
                                            }
                                            if (true == z8) {
                                                i8 = 0;
                                            }
                                            if (z8) {
                                                iArr5 = new int[i13];
                                            } else {
                                                iArr5 = iArr3;
                                            }
                                            jArr10 = new long[i13];
                                            i15 = i8;
                                            i16 = 0;
                                            i17 = 0;
                                            while (true) {
                                                jArr11 = nk2Var.f17150i;
                                                if (i17 >= jArr11.length) {
                                                    break;
                                                    break;
                                                }
                                                jArr12 = jArr10;
                                                iArr7 = iArr5;
                                                j8 = nk2Var.f17151j[i17];
                                                j9 = jArr11[i17];
                                                if (j8 != j7) {
                                                    long jM7373e11 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                    iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                    iM7372d2 = jo2.m7372d(jArr3, jM7373e11 + j8, z5, false);
                                                    if (z8) {
                                                        int i517 = iM7372d2 - iM7372d;
                                                        jArr13 = jArr8;
                                                        System.arraycopy(jArr13, iM7372d, jArr9, i16, i517);
                                                        System.arraycopy(iArr, iM7372d, iArr4, i16, i517);
                                                        iArr9 = iArr7;
                                                        System.arraycopy(iArr3, iM7372d, iArr9, i16, i517);
                                                    } else {
                                                        jArr13 = jArr8;
                                                        iArr9 = iArr7;
                                                    }
                                                    int i63 = i15;
                                                    while (iM7372d < iM7372d2) {
                                                        long[] jArr115 = jArr9;
                                                        int[] iArr15 = iArr9;
                                                        long j110 = j8;
                                                        jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                        if (!z8) {
                                                        }
                                                        i16++;
                                                        iM7372d++;
                                                        jArr9 = jArr115;
                                                        iArr9 = iArr15;
                                                        j8 = j110;
                                                    }
                                                    jArr14 = jArr9;
                                                    iArr8 = iArr9;
                                                    i15 = i63;
                                                } else {
                                                    jArr13 = jArr8;
                                                    iArr8 = iArr7;
                                                    jArr14 = jArr9;
                                                    z5 = z5;
                                                }
                                                j4 += j9;
                                                i17++;
                                                z5 = z5;
                                                jArr9 = jArr14;
                                                jArr10 = jArr12;
                                                iArr5 = iArr8;
                                                jArr8 = jArr13;
                                                j7 = -1;
                                            }
                                            long[] jArr26 = jArr9;
                                            long[] jArr27 = jArr10;
                                            iArr6 = iArr5;
                                            i18 = 0;
                                            i19 = 0;
                                            while (true) {
                                                if (i19 >= iArr6.length) {
                                                    if (i18 != 0) {
                                                        break;
                                                    } else {
                                                        throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                } else if (i18 != 0) {
                                                    break;
                                                    break;
                                                } else {
                                                    i18 = iArr6[i19] & 1;
                                                    i19++;
                                                }
                                            }
                                            qk2Var = new qk2(jArr26, iArr4, i15, jArr27, iArr6);
                                        } else {
                                            jArr5 = jArr;
                                            jArr6 = nk2Var.f17150i;
                                            if (jArr6.length == 1) {
                                                c2 = 0;
                                                if (jArr6[0] == 0) {
                                                    i20 = 0;
                                                    while (i20 < jArr3.length) {
                                                        jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                        i20++;
                                                        c2 = 0;
                                                    }
                                                    qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                }
                                            }
                                            if (nk2Var.f17143b == 1) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            i12 = 0;
                                            i13 = 0;
                                            i14 = 0;
                                            z6 = false;
                                            while (true) {
                                                jArr7 = nk2Var.f17150i;
                                                j7 = -1;
                                                if (i12 >= jArr7.length) {
                                                    break;
                                                    break;
                                                }
                                                long[] jArr116 = jArr5;
                                                fj2 fj2Var8 = fj2Var2;
                                                j10 = nk2Var.f17151j[i12];
                                                if (j10 != -1) {
                                                    long jM7373e12 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                    iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                    int iM7372d8 = jo2.m7372d(jArr3, j10 + jM7373e12, z5, false);
                                                    int i518 = (iM7372d8 - iM7372d3) + i13;
                                                    if (i14 != iM7372d3) {
                                                        z9 = true;
                                                    } else {
                                                        z9 = false;
                                                    }
                                                    i14 = iM7372d8;
                                                    z6 = z9 | z6;
                                                    i13 = i518;
                                                }
                                                i12++;
                                                jArr5 = jArr116;
                                                fj2Var2 = fj2Var8;
                                            }
                                            jArr8 = jArr5;
                                            fj2Var3 = fj2Var2;
                                            if (i13 != iZza) {
                                                z7 = true;
                                            } else {
                                                z7 = false;
                                            }
                                            z8 = z7 | z6;
                                            if (z8) {
                                                jArr9 = new long[i13];
                                            } else {
                                                jArr9 = jArr8;
                                            }
                                            if (z8) {
                                                iArr4 = new int[i13];
                                            } else {
                                                iArr4 = iArr;
                                            }
                                            if (true == z8) {
                                                i8 = 0;
                                            }
                                            if (z8) {
                                                iArr5 = new int[i13];
                                            } else {
                                                iArr5 = iArr3;
                                            }
                                            jArr10 = new long[i13];
                                            i15 = i8;
                                            i16 = 0;
                                            i17 = 0;
                                            while (true) {
                                                jArr11 = nk2Var.f17150i;
                                                if (i17 >= jArr11.length) {
                                                    break;
                                                    break;
                                                }
                                                jArr12 = jArr10;
                                                iArr7 = iArr5;
                                                j8 = nk2Var.f17151j[i17];
                                                j9 = jArr11[i17];
                                                if (j8 != j7) {
                                                    long jM7373e13 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                    iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                    iM7372d2 = jo2.m7372d(jArr3, jM7373e13 + j8, z5, false);
                                                    if (z8) {
                                                        int i519 = iM7372d2 - iM7372d;
                                                        jArr13 = jArr8;
                                                        System.arraycopy(jArr13, iM7372d, jArr9, i16, i519);
                                                        System.arraycopy(iArr, iM7372d, iArr4, i16, i519);
                                                        iArr9 = iArr7;
                                                        System.arraycopy(iArr3, iM7372d, iArr9, i16, i519);
                                                    } else {
                                                        jArr13 = jArr8;
                                                        iArr9 = iArr7;
                                                    }
                                                    int i64 = i15;
                                                    while (iM7372d < iM7372d2) {
                                                        long[] jArr117 = jArr9;
                                                        int[] iArr16 = iArr9;
                                                        long j111 = j8;
                                                        jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                        if (!z8) {
                                                        }
                                                        i16++;
                                                        iM7372d++;
                                                        jArr9 = jArr117;
                                                        iArr9 = iArr16;
                                                        j8 = j111;
                                                    }
                                                    jArr14 = jArr9;
                                                    iArr8 = iArr9;
                                                    i15 = i64;
                                                } else {
                                                    jArr13 = jArr8;
                                                    iArr8 = iArr7;
                                                    jArr14 = jArr9;
                                                    z5 = z5;
                                                }
                                                j4 += j9;
                                                i17++;
                                                z5 = z5;
                                                jArr9 = jArr14;
                                                jArr10 = jArr12;
                                                iArr5 = iArr8;
                                                jArr8 = jArr13;
                                                j7 = -1;
                                            }
                                            long[] jArr28 = jArr9;
                                            long[] jArr29 = jArr10;
                                            iArr6 = iArr5;
                                            i18 = 0;
                                            i19 = 0;
                                            while (true) {
                                                if (i19 >= iArr6.length) {
                                                    if (i18 != 0) {
                                                        break;
                                                    } else {
                                                        throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                    }
                                                } else if (i18 != 0) {
                                                    break;
                                                    break;
                                                } else {
                                                    i18 = iArr6[i19] & 1;
                                                    i19++;
                                                }
                                            }
                                            qk2Var = new qk2(jArr28, iArr4, i15, jArr29, iArr6);
                                        }
                                        qk2Var = qk2Var2;
                                        fj2Var3 = fj2Var2;
                                    }
                                } else {
                                    jo2.m7374f(jArr3, nk2Var.f17144c);
                                    qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                }
                            } else {
                                iM6397n2 = 0;
                            }
                            iM6397n3 = -1;
                            j4 = 0;
                            if (bk2Var.mo5822b()) {
                                arrayList = arrayList3;
                                if (!"audio/raw".equals(nk2VarM6369a.f17147f.f13016k)) {
                                }
                            } else {
                                arrayList = arrayList3;
                            }
                            jArr = new long[iZza];
                            iArr = new int[iZza];
                            jArr2 = new long[iZza];
                            iArr2 = new int[iZza];
                            iM6397n4 = iM6397n8;
                            i = iM6397n2;
                            iM6397n5 = iM6397n3;
                            j5 = 0;
                            j6 = 0;
                            i2 = 0;
                            i3 = 0;
                            iM6397n6 = 0;
                            i4 = 0;
                            iM6395l = 0;
                            while (i3 < iZza) {
                                while (i4 == 0) {
                                    C2622l.m5322V2(xj2Var.m8739a());
                                    j5 = xj2Var.f21564d;
                                    i4 = xj2Var.f21563c;
                                    nk2VarM6369a = nk2VarM6369a;
                                    do2Var5 = do2Var5;
                                }
                                nk2 nk2Var5 = nk2VarM6369a;
                                do2Var = do2Var5;
                                if (do2Var7 != null) {
                                    while (iM6397n6 == 0) {
                                        if (iM6397n <= 0) {
                                            iM6397n6 = 0;
                                            break;
                                        } else {
                                            iM6397n6 = do2Var7.m6397n();
                                            iM6395l = do2Var7.m6395l();
                                            iM6397n--;
                                        }
                                    }
                                    iM6397n6--;
                                }
                                int i5110 = iM6395l;
                                jArr[i3] = j5;
                                iMo5821a = bk2Var.mo5821a();
                                iArr[i3] = iMo5821a;
                                if (iMo5821a > i2) {
                                    i9 = iMo5821a;
                                } else {
                                    i9 = i2;
                                }
                                jArr2[i3] = j6 + ((long) i5110);
                                if (do2Var6 == null) {
                                    i10 = 1;
                                } else {
                                    i10 = 0;
                                }
                                iArr2[i3] = i10;
                                if (i3 == iM6397n5) {
                                    iArr2[i3] = 1;
                                    i--;
                                    if (i > 0) {
                                        iM6397n5 = do2Var6.m6397n() - 1;
                                    }
                                }
                                j6 += (long) iM6397n9;
                                i11 = iM6397n4 - 1;
                                if (i11 != 0) {
                                    iM6397n4 = i11;
                                } else if (iM6397n7 > 0) {
                                    iM6397n7--;
                                    iM6397n4 = do2Var.m6397n();
                                    iM6397n9 = do2Var.m6397n();
                                } else {
                                    iM6397n4 = 0;
                                }
                                j5 += (long) iArr[i3];
                                i4--;
                                i3++;
                                xj2Var = xj2Var;
                                i2 = i9;
                                do2Var5 = do2Var;
                                iM6395l = i5110;
                                nk2VarM6369a = nk2Var5;
                            }
                            nk2Var = nk2VarM6369a;
                            if (iM6397n6 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            C2622l.m5366f1(z2);
                            while (iM6397n > 0) {
                                if (do2Var7.m6397n() == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                C2622l.m5366f1(z3);
                                do2Var7.m6395l();
                                iM6397n--;
                            }
                            if (i == 0) {
                                if (iM6397n4 == 0) {
                                    if (i4 == 0) {
                                        if (iM6397n7 != 0) {
                                            i4 = 0;
                                        } else {
                                            nk2Var = nk2Var;
                                        }
                                        jArr3 = jArr2;
                                        iArr3 = iArr2;
                                        i8 = i2;
                                        jArr4 = nk2Var.f17150i;
                                        if (jArr4 != null) {
                                            fj2Var2 = fj2Var3;
                                            if (fj2Var2.f14043b != -1) {
                                                z4 = false;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                fj2Var3 = fj2Var2;
                                                jo2.m7374f(jArr3, nk2Var.f17144c);
                                                qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                            } else {
                                                if (jArr4.length == 1) {
                                                    jArr5 = jArr;
                                                    jArr6 = nk2Var.f17150i;
                                                    if (jArr6.length == 1) {
                                                        c2 = 0;
                                                        if (jArr6[0] == 0) {
                                                            i20 = 0;
                                                            while (i20 < jArr3.length) {
                                                                jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                                i20++;
                                                                c2 = 0;
                                                            }
                                                            qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                        }
                                                    }
                                                    if (nk2Var.f17143b == 1) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    i12 = 0;
                                                    i13 = 0;
                                                    i14 = 0;
                                                    z6 = false;
                                                    while (true) {
                                                        jArr7 = nk2Var.f17150i;
                                                        j7 = -1;
                                                        if (i12 >= jArr7.length) {
                                                            break;
                                                            break;
                                                        }
                                                        long[] jArr118 = jArr5;
                                                        fj2 fj2Var9 = fj2Var2;
                                                        j10 = nk2Var.f17151j[i12];
                                                        if (j10 != -1) {
                                                            long jM7373e14 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                            iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                            int iM7372d9 = jo2.m7372d(jArr3, j10 + jM7373e14, z5, false);
                                                            int i5111 = (iM7372d9 - iM7372d3) + i13;
                                                            if (i14 != iM7372d3) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            i14 = iM7372d9;
                                                            z6 = z9 | z6;
                                                            i13 = i5111;
                                                        }
                                                        i12++;
                                                        jArr5 = jArr118;
                                                        fj2Var2 = fj2Var9;
                                                    }
                                                    jArr8 = jArr5;
                                                    fj2Var3 = fj2Var2;
                                                    if (i13 != iZza) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    z8 = z7 | z6;
                                                    if (z8) {
                                                        jArr9 = new long[i13];
                                                    } else {
                                                        jArr9 = jArr8;
                                                    }
                                                    if (z8) {
                                                        iArr4 = new int[i13];
                                                    } else {
                                                        iArr4 = iArr;
                                                    }
                                                    if (true == z8) {
                                                        i8 = 0;
                                                    }
                                                    if (z8) {
                                                        iArr5 = new int[i13];
                                                    } else {
                                                        iArr5 = iArr3;
                                                    }
                                                    jArr10 = new long[i13];
                                                    i15 = i8;
                                                    i16 = 0;
                                                    i17 = 0;
                                                    while (true) {
                                                        jArr11 = nk2Var.f17150i;
                                                        if (i17 >= jArr11.length) {
                                                            break;
                                                            break;
                                                        }
                                                        jArr12 = jArr10;
                                                        iArr7 = iArr5;
                                                        j8 = nk2Var.f17151j[i17];
                                                        j9 = jArr11[i17];
                                                        if (j8 != j7) {
                                                            long jM7373e15 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                            iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                            iM7372d2 = jo2.m7372d(jArr3, jM7373e15 + j8, z5, false);
                                                            if (z8) {
                                                                int i5112 = iM7372d2 - iM7372d;
                                                                jArr13 = jArr8;
                                                                System.arraycopy(jArr13, iM7372d, jArr9, i16, i5112);
                                                                System.arraycopy(iArr, iM7372d, iArr4, i16, i5112);
                                                                iArr9 = iArr7;
                                                                System.arraycopy(iArr3, iM7372d, iArr9, i16, i5112);
                                                            } else {
                                                                jArr13 = jArr8;
                                                                iArr9 = iArr7;
                                                            }
                                                            int i65 = i15;
                                                            while (iM7372d < iM7372d2) {
                                                                long[] jArr119 = jArr9;
                                                                int[] iArr17 = iArr9;
                                                                long j112 = j8;
                                                                jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                                if (!z8) {
                                                                }
                                                                i16++;
                                                                iM7372d++;
                                                                jArr9 = jArr119;
                                                                iArr9 = iArr17;
                                                                j8 = j112;
                                                            }
                                                            jArr14 = jArr9;
                                                            iArr8 = iArr9;
                                                            i15 = i65;
                                                        } else {
                                                            jArr13 = jArr8;
                                                            iArr8 = iArr7;
                                                            jArr14 = jArr9;
                                                            z5 = z5;
                                                        }
                                                        j4 += j9;
                                                        i17++;
                                                        z5 = z5;
                                                        jArr9 = jArr14;
                                                        jArr10 = jArr12;
                                                        iArr5 = iArr8;
                                                        jArr8 = jArr13;
                                                        j7 = -1;
                                                    }
                                                    long[] jArr210 = jArr9;
                                                    long[] jArr211 = jArr10;
                                                    iArr6 = iArr5;
                                                    i18 = 0;
                                                    i19 = 0;
                                                    while (true) {
                                                        if (i19 >= iArr6.length) {
                                                            if (i18 != 0) {
                                                                break;
                                                            } else {
                                                                throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                            }
                                                        } else if (i18 != 0) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i18 = iArr6[i19] & 1;
                                                            i19++;
                                                        }
                                                    }
                                                    qk2Var = new qk2(jArr210, iArr4, i15, jArr211, iArr6);
                                                } else {
                                                    jArr5 = jArr;
                                                    jArr6 = nk2Var.f17150i;
                                                    if (jArr6.length == 1) {
                                                        c2 = 0;
                                                        if (jArr6[0] == 0) {
                                                            i20 = 0;
                                                            while (i20 < jArr3.length) {
                                                                jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                                i20++;
                                                                c2 = 0;
                                                            }
                                                            qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                                        }
                                                    }
                                                    if (nk2Var.f17143b == 1) {
                                                        z5 = true;
                                                    } else {
                                                        z5 = false;
                                                    }
                                                    i12 = 0;
                                                    i13 = 0;
                                                    i14 = 0;
                                                    z6 = false;
                                                    while (true) {
                                                        jArr7 = nk2Var.f17150i;
                                                        j7 = -1;
                                                        if (i12 >= jArr7.length) {
                                                            break;
                                                            break;
                                                        }
                                                        long[] jArr1110 = jArr5;
                                                        fj2 fj2Var10 = fj2Var2;
                                                        j10 = nk2Var.f17151j[i12];
                                                        if (j10 != -1) {
                                                            long jM7373e16 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                            iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                            int iM7372d10 = jo2.m7372d(jArr3, j10 + jM7373e16, z5, false);
                                                            int i5113 = (iM7372d10 - iM7372d3) + i13;
                                                            if (i14 != iM7372d3) {
                                                                z9 = true;
                                                            } else {
                                                                z9 = false;
                                                            }
                                                            i14 = iM7372d10;
                                                            z6 = z9 | z6;
                                                            i13 = i5113;
                                                        }
                                                        i12++;
                                                        jArr5 = jArr1110;
                                                        fj2Var2 = fj2Var10;
                                                    }
                                                    jArr8 = jArr5;
                                                    fj2Var3 = fj2Var2;
                                                    if (i13 != iZza) {
                                                        z7 = true;
                                                    } else {
                                                        z7 = false;
                                                    }
                                                    z8 = z7 | z6;
                                                    if (z8) {
                                                        jArr9 = new long[i13];
                                                    } else {
                                                        jArr9 = jArr8;
                                                    }
                                                    if (z8) {
                                                        iArr4 = new int[i13];
                                                    } else {
                                                        iArr4 = iArr;
                                                    }
                                                    if (true == z8) {
                                                        i8 = 0;
                                                    }
                                                    if (z8) {
                                                        iArr5 = new int[i13];
                                                    } else {
                                                        iArr5 = iArr3;
                                                    }
                                                    jArr10 = new long[i13];
                                                    i15 = i8;
                                                    i16 = 0;
                                                    i17 = 0;
                                                    while (true) {
                                                        jArr11 = nk2Var.f17150i;
                                                        if (i17 >= jArr11.length) {
                                                            break;
                                                            break;
                                                        }
                                                        jArr12 = jArr10;
                                                        iArr7 = iArr5;
                                                        j8 = nk2Var.f17151j[i17];
                                                        j9 = jArr11[i17];
                                                        if (j8 != j7) {
                                                            long jM7373e17 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                            iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                            iM7372d2 = jo2.m7372d(jArr3, jM7373e17 + j8, z5, false);
                                                            if (z8) {
                                                                int i5114 = iM7372d2 - iM7372d;
                                                                jArr13 = jArr8;
                                                                System.arraycopy(jArr13, iM7372d, jArr9, i16, i5114);
                                                                System.arraycopy(iArr, iM7372d, iArr4, i16, i5114);
                                                                iArr9 = iArr7;
                                                                System.arraycopy(iArr3, iM7372d, iArr9, i16, i5114);
                                                            } else {
                                                                jArr13 = jArr8;
                                                                iArr9 = iArr7;
                                                            }
                                                            int i66 = i15;
                                                            while (iM7372d < iM7372d2) {
                                                                long[] jArr1111 = jArr9;
                                                                int[] iArr18 = iArr9;
                                                                long j113 = j8;
                                                                jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                                if (!z8) {
                                                                }
                                                                i16++;
                                                                iM7372d++;
                                                                jArr9 = jArr1111;
                                                                iArr9 = iArr18;
                                                                j8 = j113;
                                                            }
                                                            jArr14 = jArr9;
                                                            iArr8 = iArr9;
                                                            i15 = i66;
                                                        } else {
                                                            jArr13 = jArr8;
                                                            iArr8 = iArr7;
                                                            jArr14 = jArr9;
                                                            z5 = z5;
                                                        }
                                                        j4 += j9;
                                                        i17++;
                                                        z5 = z5;
                                                        jArr9 = jArr14;
                                                        jArr10 = jArr12;
                                                        iArr5 = iArr8;
                                                        jArr8 = jArr13;
                                                        j7 = -1;
                                                    }
                                                    long[] jArr212 = jArr9;
                                                    long[] jArr213 = jArr10;
                                                    iArr6 = iArr5;
                                                    i18 = 0;
                                                    i19 = 0;
                                                    while (true) {
                                                        if (i19 >= iArr6.length) {
                                                            if (i18 != 0) {
                                                                break;
                                                            } else {
                                                                throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                            }
                                                        } else if (i18 != 0) {
                                                            break;
                                                            break;
                                                        } else {
                                                            i18 = iArr6[i19] & 1;
                                                            i19++;
                                                        }
                                                    }
                                                    qk2Var = new qk2(jArr212, iArr4, i15, jArr213, iArr6);
                                                }
                                                qk2Var = qk2Var2;
                                                fj2Var3 = fj2Var2;
                                            }
                                        } else {
                                            jo2.m7374f(jArr3, nk2Var.f17144c);
                                            qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                        }
                                    }
                                    iM6397n4 = 0;
                                }
                                i5 = i4;
                                i6 = iM6397n4;
                                i7 = 0;
                            } else {
                                i5 = i4;
                                i6 = iM6397n4;
                                i7 = i;
                            }
                            int i5115 = nk2Var.f17142a;
                            StringBuilder sb4 = new StringBuilder(215);
                            sb4.append("Inconsistent stbl box for track ");
                            sb4.append(i5115);
                            sb4.append(": remainingSynchronizationSamples ");
                            sb4.append(i7);
                            sb4.append(", remainingSamplesAtTimestampDelta ");
                            sb4.append(i6);
                            sb4.append(", remainingSamplesInChunk ");
                            sb4.append(i5);
                            sb4.append(", remainingTimestampDeltaChanges ");
                            sb4.append(iM6397n7);
                            Log.w("AtomParsers", sb4.toString());
                            jArr3 = jArr2;
                            iArr3 = iArr2;
                            i8 = i2;
                            jArr4 = nk2Var.f17150i;
                            if (jArr4 != null) {
                                fj2Var2 = fj2Var3;
                                if (fj2Var2.f14043b != -1) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    fj2Var3 = fj2Var2;
                                    jo2.m7374f(jArr3, nk2Var.f17144c);
                                    qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                                } else {
                                    if (jArr4.length == 1) {
                                        jArr5 = jArr;
                                        jArr6 = nk2Var.f17150i;
                                        if (jArr6.length == 1) {
                                            c2 = 0;
                                            if (jArr6[0] == 0) {
                                                i20 = 0;
                                                while (i20 < jArr3.length) {
                                                    jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                    i20++;
                                                    c2 = 0;
                                                }
                                                qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                            }
                                        }
                                        if (nk2Var.f17143b == 1) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        i12 = 0;
                                        i13 = 0;
                                        i14 = 0;
                                        z6 = false;
                                        while (true) {
                                            jArr7 = nk2Var.f17150i;
                                            j7 = -1;
                                            if (i12 >= jArr7.length) {
                                                break;
                                                break;
                                            }
                                            long[] jArr1112 = jArr5;
                                            fj2 fj2Var11 = fj2Var2;
                                            j10 = nk2Var.f17151j[i12];
                                            if (j10 != -1) {
                                                long jM7373e18 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                int iM7372d11 = jo2.m7372d(jArr3, j10 + jM7373e18, z5, false);
                                                int i5116 = (iM7372d11 - iM7372d3) + i13;
                                                if (i14 != iM7372d3) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                i14 = iM7372d11;
                                                z6 = z9 | z6;
                                                i13 = i5116;
                                            }
                                            i12++;
                                            jArr5 = jArr1112;
                                            fj2Var2 = fj2Var11;
                                        }
                                        jArr8 = jArr5;
                                        fj2Var3 = fj2Var2;
                                        if (i13 != iZza) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        z8 = z7 | z6;
                                        if (z8) {
                                            jArr9 = new long[i13];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (z8) {
                                            iArr4 = new int[i13];
                                        } else {
                                            iArr4 = iArr;
                                        }
                                        if (true == z8) {
                                            i8 = 0;
                                        }
                                        if (z8) {
                                            iArr5 = new int[i13];
                                        } else {
                                            iArr5 = iArr3;
                                        }
                                        jArr10 = new long[i13];
                                        i15 = i8;
                                        i16 = 0;
                                        i17 = 0;
                                        while (true) {
                                            jArr11 = nk2Var.f17150i;
                                            if (i17 >= jArr11.length) {
                                                break;
                                                break;
                                            }
                                            jArr12 = jArr10;
                                            iArr7 = iArr5;
                                            j8 = nk2Var.f17151j[i17];
                                            j9 = jArr11[i17];
                                            if (j8 != j7) {
                                                long jM7373e19 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                iM7372d2 = jo2.m7372d(jArr3, jM7373e19 + j8, z5, false);
                                                if (z8) {
                                                    int i5117 = iM7372d2 - iM7372d;
                                                    jArr13 = jArr8;
                                                    System.arraycopy(jArr13, iM7372d, jArr9, i16, i5117);
                                                    System.arraycopy(iArr, iM7372d, iArr4, i16, i5117);
                                                    iArr9 = iArr7;
                                                    System.arraycopy(iArr3, iM7372d, iArr9, i16, i5117);
                                                } else {
                                                    jArr13 = jArr8;
                                                    iArr9 = iArr7;
                                                }
                                                int i67 = i15;
                                                while (iM7372d < iM7372d2) {
                                                    long[] jArr1113 = jArr9;
                                                    int[] iArr19 = iArr9;
                                                    long j114 = j8;
                                                    jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                    if (!z8) {
                                                    }
                                                    i16++;
                                                    iM7372d++;
                                                    jArr9 = jArr1113;
                                                    iArr9 = iArr19;
                                                    j8 = j114;
                                                }
                                                jArr14 = jArr9;
                                                iArr8 = iArr9;
                                                i15 = i67;
                                            } else {
                                                jArr13 = jArr8;
                                                iArr8 = iArr7;
                                                jArr14 = jArr9;
                                                z5 = z5;
                                            }
                                            j4 += j9;
                                            i17++;
                                            z5 = z5;
                                            jArr9 = jArr14;
                                            jArr10 = jArr12;
                                            iArr5 = iArr8;
                                            jArr8 = jArr13;
                                            j7 = -1;
                                        }
                                        long[] jArr214 = jArr9;
                                        long[] jArr215 = jArr10;
                                        iArr6 = iArr5;
                                        i18 = 0;
                                        i19 = 0;
                                        while (true) {
                                            if (i19 >= iArr6.length) {
                                                if (i18 != 0) {
                                                    break;
                                                } else {
                                                    throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                }
                                            } else if (i18 != 0) {
                                                break;
                                                break;
                                            } else {
                                                i18 = iArr6[i19] & 1;
                                                i19++;
                                            }
                                        }
                                        qk2Var = new qk2(jArr214, iArr4, i15, jArr215, iArr6);
                                    } else {
                                        jArr5 = jArr;
                                        jArr6 = nk2Var.f17150i;
                                        if (jArr6.length == 1) {
                                            c2 = 0;
                                            if (jArr6[0] == 0) {
                                                i20 = 0;
                                                while (i20 < jArr3.length) {
                                                    jArr3[i20] = jo2.m7373e(jArr3[i20] - nk2Var.f17151j[c2], 1000000L, nk2Var.f17144c);
                                                    i20++;
                                                    c2 = 0;
                                                }
                                                qk2Var2 = new qk2(jArr5, iArr, i8, jArr3, iArr3);
                                            }
                                        }
                                        if (nk2Var.f17143b == 1) {
                                            z5 = true;
                                        } else {
                                            z5 = false;
                                        }
                                        i12 = 0;
                                        i13 = 0;
                                        i14 = 0;
                                        z6 = false;
                                        while (true) {
                                            jArr7 = nk2Var.f17150i;
                                            j7 = -1;
                                            if (i12 >= jArr7.length) {
                                                break;
                                                break;
                                            }
                                            long[] jArr1114 = jArr5;
                                            fj2 fj2Var12 = fj2Var2;
                                            j10 = nk2Var.f17151j[i12];
                                            if (j10 != -1) {
                                                long jM7373e110 = jo2.m7373e(jArr7[i12], nk2Var.f17144c, nk2Var.f17145d);
                                                iM7372d3 = jo2.m7372d(jArr3, j10, true, true);
                                                int iM7372d12 = jo2.m7372d(jArr3, j10 + jM7373e110, z5, false);
                                                int i5118 = (iM7372d12 - iM7372d3) + i13;
                                                if (i14 != iM7372d3) {
                                                    z9 = true;
                                                } else {
                                                    z9 = false;
                                                }
                                                i14 = iM7372d12;
                                                z6 = z9 | z6;
                                                i13 = i5118;
                                            }
                                            i12++;
                                            jArr5 = jArr1114;
                                            fj2Var2 = fj2Var12;
                                        }
                                        jArr8 = jArr5;
                                        fj2Var3 = fj2Var2;
                                        if (i13 != iZza) {
                                            z7 = true;
                                        } else {
                                            z7 = false;
                                        }
                                        z8 = z7 | z6;
                                        if (z8) {
                                            jArr9 = new long[i13];
                                        } else {
                                            jArr9 = jArr8;
                                        }
                                        if (z8) {
                                            iArr4 = new int[i13];
                                        } else {
                                            iArr4 = iArr;
                                        }
                                        if (true == z8) {
                                            i8 = 0;
                                        }
                                        if (z8) {
                                            iArr5 = new int[i13];
                                        } else {
                                            iArr5 = iArr3;
                                        }
                                        jArr10 = new long[i13];
                                        i15 = i8;
                                        i16 = 0;
                                        i17 = 0;
                                        while (true) {
                                            jArr11 = nk2Var.f17150i;
                                            if (i17 >= jArr11.length) {
                                                break;
                                                break;
                                            }
                                            jArr12 = jArr10;
                                            iArr7 = iArr5;
                                            j8 = nk2Var.f17151j[i17];
                                            j9 = jArr11[i17];
                                            if (j8 != j7) {
                                                long jM7373e111 = jo2.m7373e(j9, nk2Var.f17144c, nk2Var.f17145d);
                                                iM7372d = jo2.m7372d(jArr3, j8, true, true);
                                                iM7372d2 = jo2.m7372d(jArr3, jM7373e111 + j8, z5, false);
                                                if (z8) {
                                                    int i5119 = iM7372d2 - iM7372d;
                                                    jArr13 = jArr8;
                                                    System.arraycopy(jArr13, iM7372d, jArr9, i16, i5119);
                                                    System.arraycopy(iArr, iM7372d, iArr4, i16, i5119);
                                                    iArr9 = iArr7;
                                                    System.arraycopy(iArr3, iM7372d, iArr9, i16, i5119);
                                                } else {
                                                    jArr13 = jArr8;
                                                    iArr9 = iArr7;
                                                }
                                                int i68 = i15;
                                                while (iM7372d < iM7372d2) {
                                                    long[] jArr1115 = jArr9;
                                                    int[] iArr110 = iArr9;
                                                    long j115 = j8;
                                                    jArr12[i16] = jo2.m7373e(j4, 1000000L, nk2Var.f17145d) + jo2.m7373e(jArr3[iM7372d] - j8, 1000000L, nk2Var.f17144c);
                                                    if (!z8) {
                                                    }
                                                    i16++;
                                                    iM7372d++;
                                                    jArr9 = jArr1115;
                                                    iArr9 = iArr110;
                                                    j8 = j115;
                                                }
                                                jArr14 = jArr9;
                                                iArr8 = iArr9;
                                                i15 = i68;
                                            } else {
                                                jArr13 = jArr8;
                                                iArr8 = iArr7;
                                                jArr14 = jArr9;
                                                z5 = z5;
                                            }
                                            j4 += j9;
                                            i17++;
                                            z5 = z5;
                                            jArr9 = jArr14;
                                            jArr10 = jArr12;
                                            iArr5 = iArr8;
                                            jArr8 = jArr13;
                                            j7 = -1;
                                        }
                                        long[] jArr216 = jArr9;
                                        long[] jArr217 = jArr10;
                                        iArr6 = iArr5;
                                        i18 = 0;
                                        i19 = 0;
                                        while (true) {
                                            if (i19 >= iArr6.length) {
                                                if (i18 != 0) {
                                                    break;
                                                } else {
                                                    throw new fh2("The edited sample sequence does not contain a sync sample.");
                                                }
                                            } else if (i18 != 0) {
                                                break;
                                                break;
                                            } else {
                                                i18 = iArr6[i19] & 1;
                                                i19++;
                                            }
                                        }
                                        qk2Var = new qk2(jArr216, iArr4, i15, jArr217, iArr6);
                                    }
                                    qk2Var = qk2Var2;
                                    fj2Var3 = fj2Var2;
                                }
                            } else {
                                jo2.m7374f(jArr3, nk2Var.f17144c);
                                qk2Var = new qk2(jArr, iArr, i8, jArr3, iArr3);
                            }
                        }
                        if (qk2Var.f18369a != 0) {
                            kk2 kk2Var = new kk2(nk2Var, qk2Var, ((vl2) this.f16395m).m8570o(i41, nk2Var.f17143b));
                            int i69 = qk2Var.f18372d;
                            ch2 ch2Var = nk2Var.f17147f;
                            int i70 = i69 + 30;
                            String str7 = ch2Var.f13011f;
                            String str8 = ch2Var.f13015j;
                            String str9 = ch2Var.f13016k;
                            String str10 = ch2Var.f13013h;
                            int i71 = ch2Var.f13012g;
                            int i72 = ch2Var.f13020o;
                            int i73 = ch2Var.f13021p;
                            float f = ch2Var.f13022q;
                            int i74 = ch2Var.f13023r;
                            float f2 = ch2Var.f13024s;
                            qk2 qk2Var3 = qk2Var;
                            byte[] bArr2 = ch2Var.f13026u;
                            int i75 = ch2Var.f13025t;
                            mo2 mo2Var = ch2Var.f13027v;
                            int i76 = ch2Var.f13028w;
                            int i77 = ch2Var.f13029x;
                            int i78 = ch2Var.f13030y;
                            int i79 = ch2Var.f13031z;
                            int i80 = ch2Var.f13005A;
                            int i81 = ch2Var.f13007C;
                            String str11 = ch2Var.f13008D;
                            int i82 = ch2Var.f13009E;
                            long j20 = ch2Var.f13006B;
                            ch2 ch2Var2 = new ch2(str7, str8, str9, str10, i71, i70, i72, i73, f, i74, f2, bArr2, i75, mo2Var, i76, i77, i78, i79, i80, i81, str11, i82, j20, ch2Var.f13018m, ch2Var.f13019n, ch2Var.f13014i);
                            if (nk2Var.f17143b == 1) {
                                fj2Var = fj2Var3;
                                int i83 = fj2Var.f14043b;
                                nk2Var2 = nk2Var;
                                if ((i83 == -1 || fj2Var.f14044c == -1) ? false : true) {
                                    ch2Var2 = new ch2(str7, str8, str9, str10, i71, i70, i72, i73, f, i74, f2, bArr2, i75, mo2Var, i76, i77, i78, i83, fj2Var.f14044c, i81, str11, i82, j20, ch2Var2.f13018m, ch2Var2.f13019n, ch2Var2.f13014i);
                                }
                                el2Var = el2Var;
                                if (el2Var != null) {
                                    ch2Var2 = ch2Var2.m6186e(el2Var);
                                }
                            } else {
                                nk2Var2 = nk2Var;
                                el2Var = el2Var;
                                fj2Var = fj2Var3;
                            }
                            ((km2) kk2Var.f15974c).m7515a(ch2Var2);
                            jMax = Math.max(j11, nk2Var2.f17146e);
                            arrayList2 = arrayList;
                            arrayList2.add(kk2Var);
                            long j21 = qk2Var3.f18370b[0];
                            if (j21 < j3) {
                                j3 = j21;
                            }
                        }
                        i41++;
                        j11 = jMax;
                        arrayList3 = arrayList2;
                        uj2VarPop = uj2Var;
                        j12 = j3;
                        fj2Var3 = fj2Var;
                        lk2Var = this;
                    } else {
                        uj2Var = uj2VarPop;
                        el2Var = el2Var;
                        arrayList = arrayList3;
                        fj2Var3 = fj2Var3;
                        j11 = j11;
                        j3 = j12;
                        i41 = i41;
                    }
                    arrayList2 = arrayList;
                    jMax = j11;
                    el2Var = el2Var;
                    fj2Var = fj2Var3;
                    i41++;
                    j11 = jMax;
                    arrayList3 = arrayList2;
                    uj2VarPop = uj2Var;
                    j12 = j3;
                    fj2Var3 = fj2Var;
                    lk2Var = this;
                }
                ArrayList arrayList5 = arrayList3;
                lk2Var.f16397o = j11;
                lk2Var.f16396n = (kk2[]) arrayList5.toArray(new kk2[arrayList5.size()]);
                ((vl2) lk2Var.f16395m).m8571p();
                vl2 vl2Var = (vl2) lk2Var.f16395m;
                vl2Var.f20855u = lk2Var;
                vl2Var.f20852r.post(vl2Var.f20850p);
                lk2Var.f16387e.clear();
                lk2Var.f16388f = 2;
            } else if (!lk2Var.f16387e.isEmpty()) {
                lk2Var.f16387e.peek().f20363R0.add(uj2VarPop);
            }
        }
        if (lk2Var.f16388f != 2) {
            m7589g();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jj2
    public final boolean zza() {
        return true;
    }
}
