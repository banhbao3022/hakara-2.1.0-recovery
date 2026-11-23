package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ik2 implements cj2 {

    /* JADX INFO: renamed from: a */
    public static final int f15259a = jo2.m7375g("seig");

    /* JADX INFO: renamed from: b */
    public static final byte[] f15260b = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: c */
    public final SparseArray<hk2> f15261c;

    /* JADX INFO: renamed from: d */
    public final do2 f15262d;

    /* JADX INFO: renamed from: e */
    public final do2 f15263e;

    /* JADX INFO: renamed from: f */
    public final do2 f15264f;

    /* JADX INFO: renamed from: g */
    public final do2 f15265g;

    /* JADX INFO: renamed from: h */
    public final byte[] f15266h;

    /* JADX INFO: renamed from: i */
    public final Stack<uj2> f15267i;

    /* JADX INFO: renamed from: j */
    public final LinkedList<fk2> f15268j;

    /* JADX INFO: renamed from: k */
    public int f15269k;

    /* JADX INFO: renamed from: l */
    public int f15270l;

    /* JADX INFO: renamed from: m */
    public long f15271m;

    /* JADX INFO: renamed from: n */
    public int f15272n;

    /* JADX INFO: renamed from: o */
    public do2 f15273o;

    /* JADX INFO: renamed from: p */
    public long f15274p;

    /* JADX INFO: renamed from: q */
    public long f15275q;

    /* JADX INFO: renamed from: r */
    public hk2 f15276r;

    /* JADX INFO: renamed from: s */
    public int f15277s;

    /* JADX INFO: renamed from: t */
    public int f15278t;

    /* JADX INFO: renamed from: u */
    public int f15279u;

    /* JADX INFO: renamed from: v */
    public dj2 f15280v;

    /* JADX INFO: renamed from: w */
    public boolean f15281w;

    public ik2() {
        this(0, null, null);
    }

    /* JADX INFO: renamed from: g */
    public static void m7275g(do2 do2Var, int i, pk2 pk2Var) throws fh2 {
        do2Var.m6389f(i + 8);
        int iM6395l = do2Var.m6395l();
        int i2 = wj2.f21181a;
        int i3 = iM6395l & 16777215;
        if ((i3 & 1) != 0) {
            throw new fh2("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (i3 & 2) != 0;
        int iM6397n = do2Var.m6397n();
        int i4 = pk2Var.f18008e;
        if (iM6397n != i4) {
            throw new fh2(outline.m1586h(41, "Length mismatch: ", iM6397n, ", ", i4));
        }
        Arrays.fill(pk2Var.f18016m, 0, iM6397n, z);
        pk2Var.m8123a(do2Var.m6386c());
        do2Var.m6391h(pk2Var.f18019p.f13340a, 0, pk2Var.f18018o);
        pk2Var.f18019p.m6389f(0);
        pk2Var.f18020q = false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX INFO: renamed from: h */
    public static yi2 m7276h(List<vj2> list) {
        Pair pairCreate;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            vj2 vj2Var = list.get(i);
            int i2 = vj2Var.f21233O0;
            int i3 = wj2.f21175U;
            if (i2 == i3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = vj2Var.f20809P0.f13340a;
                do2 do2Var = new do2(bArr);
                if (do2Var.f13342c < 32) {
                    pairCreate = null;
                } else {
                    do2Var.m6389f(0);
                    if (do2Var.m6395l() == do2Var.m6386c() + 4 && do2Var.m6395l() == i3) {
                        int iM6395l = (do2Var.m6395l() >> 24) & 255;
                        if (iM6395l > 1) {
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Unsupported pssh version: ");
                            sb.append(iM6395l);
                            Log.w("PsshAtomUtil", sb.toString());
                        } else {
                            UUID uuid = new UUID(do2Var.m6396m(), do2Var.m6396m());
                            if (iM6395l == 1) {
                                do2Var.m6390g(do2Var.m6397n() * 16);
                            }
                            int iM6397n = do2Var.m6397n();
                            if (iM6397n == do2Var.m6386c()) {
                                byte[] bArr2 = new byte[iM6397n];
                                System.arraycopy(do2Var.f13340a, do2Var.f13341b, bArr2, 0, iM6397n);
                                do2Var.f13341b += iM6397n;
                                pairCreate = Pair.create(uuid, bArr2);
                            }
                        }
                        pairCreate = null;
                    } else {
                        pairCreate = null;
                    }
                }
                UUID uuid2 = pairCreate == null ? null : (UUID) pairCreate.first;
                if (uuid2 == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new xi2(uuid2, "video/mp4", bArr, false));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new yi2(arrayList);
    }

    /* JADX INFO: renamed from: a */
    public final void m7277a() {
        this.f15269k = 0;
        this.f15272n = 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: b */
    public final int mo6193b(bj2 bj2Var, gj2 gj2Var) throws InterruptedException, IOException {
        ok2 ok2Var;
        kj2 kj2Var;
        int i;
        long jM6398o;
        long jM6398o2;
        while (true) {
            int i2 = this.f15269k;
            int i3 = 0;
            if (i2 == 0) {
                if (this.f15272n == 0) {
                    if (!bj2Var.m6021a(this.f15265g.f13340a, 0, 8, true)) {
                        return -1;
                    }
                    this.f15272n = 8;
                    this.f15265g.m6389f(0);
                    this.f15271m = this.f15265g.m6394k();
                    this.f15270l = this.f15265g.m6395l();
                }
                long jM6398o3 = this.f15271m;
                if (jM6398o3 == 1) {
                    bj2Var.m6021a(this.f15265g.f13340a, 8, 8, false);
                    this.f15272n += 8;
                    jM6398o3 = this.f15265g.m6398o();
                    this.f15271m = jM6398o3;
                }
                long j2 = this.f15272n;
                if (jM6398o3 < j2) {
                    throw new fh2("Atom size less than header length (unsupported).");
                }
                long j3 = bj2Var.f12710d - j2;
                if (this.f15270l == wj2.f21161K) {
                    int size = this.f15261c.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        pk2 pk2Var = this.f15261c.valueAt(i4).f14891a;
                        pk2Var.f18006c = j3;
                        pk2Var.f18005b = j3;
                    }
                }
                int i5 = this.f15270l;
                if (i5 == wj2.f21195h) {
                    this.f15276r = null;
                    this.f15274p = j3 + this.f15271m;
                    if (!this.f15281w) {
                        vl2 vl2Var = (vl2) this.f15280v;
                        vl2Var.f20855u = new ij2(this.f15275q);
                        vl2Var.f20852r.post(vl2Var.f20850p);
                        this.f15281w = true;
                    }
                    this.f15269k = 2;
                } else if (i5 == wj2.f21143B || i5 == wj2.f21147D || i5 == wj2.f21149E || i5 == wj2.f21151F || i5 == wj2.f21153G || i5 == wj2.f21161K || i5 == wj2.f21163L || i5 == wj2.f21165M || i5 == wj2.f21170P) {
                    long j4 = (bj2Var.f12710d + this.f15271m) - 8;
                    this.f15267i.add(new uj2(this.f15270l, j4));
                    if (this.f15271m == this.f15272n) {
                        m7278e(j4);
                    } else {
                        m7277a();
                    }
                } else if (i5 == wj2.f21173S || i5 == wj2.f21172R || i5 == wj2.f21145C || i5 == wj2.f21141A || i5 == wj2.f21174T || i5 == wj2.f21225w || i5 == wj2.f21227x || i5 == wj2.f21169O || i5 == wj2.f21229y || i5 == wj2.f21231z || i5 == wj2.f21175U || i5 == wj2.f21186c0 || i5 == wj2.f21188d0 || i5 == wj2.f21196h0 || i5 == wj2.f21194g0 || i5 == wj2.f21190e0 || i5 == wj2.f21192f0 || i5 == wj2.f21171Q || i5 == wj2.f21167N || i5 == wj2.f21152F0) {
                    if (this.f15272n != 8) {
                        throw new fh2("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j5 = this.f15271m;
                    if (j5 > 2147483647L) {
                        throw new fh2("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    do2 do2Var = new do2((int) j5);
                    this.f15273o = do2Var;
                    System.arraycopy(this.f15265g.f13340a, 0, do2Var.f13340a, 0, 8);
                    this.f15269k = 1;
                } else {
                    if (this.f15271m > 2147483647L) {
                        throw new fh2("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f15273o = null;
                    this.f15269k = 1;
                }
            } else if (i2 != 1) {
                long j6 = Long.MAX_VALUE;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.f15276r == null) {
                            SparseArray<hk2> sparseArray = this.f15261c;
                            int size2 = sparseArray.size();
                            hk2 hk2Var = null;
                            for (int i6 = 0; i6 < size2; i6++) {
                                hk2 hk2VarValueAt = sparseArray.valueAt(i6);
                                int i7 = hk2VarValueAt.f14897g;
                                pk2 pk2Var2 = hk2VarValueAt.f14891a;
                                if (i7 != pk2Var2.f18007d) {
                                    long j7 = pk2Var2.f18009f[i7];
                                    if (j7 < j6) {
                                        hk2Var = hk2VarValueAt;
                                        j6 = j7;
                                    }
                                }
                            }
                            if (hk2Var == null) {
                                int i8 = (int) (this.f15274p - bj2Var.f12710d);
                                if (i8 < 0) {
                                    throw new fh2("Offset to end of mdat was negative.");
                                }
                                bj2Var.m6022b(i8, false);
                                m7277a();
                            } else {
                                int i9 = (int) (hk2Var.f14891a.f18009f[hk2Var.f14897g] - bj2Var.f12710d);
                                if (i9 < 0) {
                                    Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                    i9 = 0;
                                }
                                bj2Var.m6022b(i9, false);
                                this.f15276r = hk2Var;
                            }
                        }
                        hk2 hk2Var2 = this.f15276r;
                        pk2 pk2Var3 = hk2Var2.f14891a;
                        int[] iArr = pk2Var3.f18011h;
                        int i10 = hk2Var2.f14895e;
                        int i11 = iArr[i10];
                        this.f15277s = i11;
                        if (pk2Var3.f18015l) {
                            do2 do2Var2 = pk2Var3.f18019p;
                            int i12 = pk2Var3.f18004a.f13599a;
                            ok2 ok2Var2 = pk2Var3.f18017n;
                            if (ok2Var2 == null) {
                                ok2Var2 = hk2Var2.f14893c.f17149h[i12];
                            }
                            int i13 = ok2Var2.f17663a;
                            boolean z = pk2Var3.f18016m[i10];
                            do2 do2Var3 = this.f15264f;
                            do2Var3.f13340a[0] = (byte) ((true != z ? 0 : 128) | i13);
                            do2Var3.m6389f(0);
                            km2 km2Var = (km2) hk2Var2.f14892b;
                            km2Var.m7516b(this.f15264f, 1);
                            km2Var.m7516b(do2Var2, i13);
                            if (z) {
                                int iM6393j = do2Var2.m6393j();
                                do2Var2.m6390g(-2);
                                int i14 = (iM6393j * 6) + 2;
                                km2Var.m7516b(do2Var2, i14);
                                i = i13 + 1 + i14;
                            } else {
                                i = i13 + 1;
                            }
                            this.f15278t = i;
                            i11 = this.f15277s + i;
                            this.f15277s = i11;
                        } else {
                            this.f15278t = 0;
                        }
                        if (this.f15276r.f14893c.f17148g == 1) {
                            this.f15277s = i11 - 8;
                            bj2Var.m6022b(8, false);
                        }
                        this.f15269k = 4;
                        this.f15279u = 0;
                    }
                    hk2 hk2Var3 = this.f15276r;
                    pk2 pk2Var4 = hk2Var3.f14891a;
                    nk2 nk2Var = hk2Var3.f14893c;
                    lj2 lj2Var = hk2Var3.f14892b;
                    int i15 = hk2Var3.f14895e;
                    int i16 = nk2Var.f17152k;
                    if (i16 == 0) {
                        while (true) {
                            int i17 = this.f15278t;
                            int i18 = this.f15277s;
                            if (i17 >= i18) {
                                break;
                            }
                            this.f15278t += ((km2) lj2Var).m7518d(bj2Var, i18 - i17, false);
                        }
                    } else {
                        byte[] bArr = this.f15263e.f13340a;
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        int i19 = i16 + 1;
                        int i20 = 4 - i16;
                        while (this.f15278t < this.f15277s) {
                            int i21 = this.f15279u;
                            if (i21 == 0) {
                                bj2Var.m6021a(bArr, i20, i19, false);
                                this.f15263e.m6389f(0);
                                this.f15279u = this.f15263e.m6397n() - 1;
                                this.f15262d.m6389f(0);
                                km2 km2Var2 = (km2) lj2Var;
                                km2Var2.m7516b(this.f15262d, 4);
                                km2Var2.m7516b(this.f15263e, 1);
                                this.f15278t += 5;
                                this.f15277s += i20;
                            } else {
                                int iM7518d = ((km2) lj2Var).m7518d(bj2Var, i21, false);
                                this.f15278t += iM7518d;
                                this.f15279u -= iM7518d;
                            }
                        }
                    }
                    long j8 = (pk2Var4.f18013j[i15] + ((long) pk2Var4.f18012i[i15])) * 1000;
                    boolean z2 = pk2Var4.f18015l;
                    int i22 = (true != z2 ? 0 : 1073741824) | (pk2Var4.f18014k[i15] ? 1 : 0);
                    if (z2) {
                        ok2Var = pk2Var4.f18017n;
                        if (ok2Var == null) {
                            ok2Var = nk2Var.f17149h[pk2Var4.f18004a.f13599a];
                        }
                        hk2 hk2Var4 = this.f15276r;
                        kj2Var = ok2Var != hk2Var4.f14899i ? new kj2(1, ok2Var.f17664b) : hk2Var4.f14898h;
                    } else {
                        ok2Var = null;
                        kj2Var = null;
                    }
                    hk2 hk2Var5 = this.f15276r;
                    hk2Var5.f14898h = kj2Var;
                    hk2Var5.f14899i = ok2Var;
                    ((km2) lj2Var).m7517c(j8, i22, this.f15277s, 0, kj2Var);
                    if (!this.f15268j.isEmpty()) {
                        Objects.requireNonNull(this.f15268j.removeFirst());
                        throw null;
                    }
                    hk2 hk2Var6 = this.f15276r;
                    hk2Var6.f14895e++;
                    int i23 = hk2Var6.f14896f + 1;
                    hk2Var6.f14896f = i23;
                    int[] iArr2 = pk2Var4.f18010g;
                    int i24 = hk2Var6.f14897g;
                    if (i23 == iArr2[i24]) {
                        hk2Var6.f14897g = i24 + 1;
                        hk2Var6.f14896f = 0;
                        this.f15276r = null;
                    }
                    this.f15269k = 3;
                    return 0;
                }
                int size3 = this.f15261c.size();
                hk2 hk2VarValueAt2 = null;
                for (int i25 = 0; i25 < size3; i25++) {
                    pk2 pk2Var5 = this.f15261c.valueAt(i25).f14891a;
                    if (pk2Var5.f18020q) {
                        long j9 = pk2Var5.f18006c;
                        if (j9 < j6) {
                            hk2VarValueAt2 = this.f15261c.valueAt(i25);
                            j6 = j9;
                        }
                    }
                }
                if (hk2VarValueAt2 == null) {
                    this.f15269k = 3;
                } else {
                    int i26 = (int) (j6 - bj2Var.f12710d);
                    if (i26 < 0) {
                        throw new fh2("Offset to encryption data was negative.");
                    }
                    bj2Var.m6022b(i26, false);
                    pk2 pk2Var6 = hk2VarValueAt2.f14891a;
                    bj2Var.m6021a(pk2Var6.f18019p.f13340a, 0, pk2Var6.f18018o, false);
                    pk2Var6.f18019p.m6389f(0);
                    pk2Var6.f18020q = false;
                }
            } else {
                int i27 = ((int) this.f15271m) - this.f15272n;
                do2 do2Var4 = this.f15273o;
                if (do2Var4 != null) {
                    bj2Var.m6021a(do2Var4.f13340a, 8, i27, false);
                    vj2 vj2Var = new vj2(this.f15270l, this.f15273o);
                    long j10 = bj2Var.f12710d;
                    if (!this.f15267i.isEmpty()) {
                        this.f15267i.peek().f20362Q0.add(vj2Var);
                    } else if (vj2Var.f21233O0 == wj2.f21141A) {
                        do2 do2Var5 = vj2Var.f20809P0;
                        do2Var5.m6389f(8);
                        int iM6395l = do2Var5.m6395l();
                        do2Var5.m6390g(4);
                        long jM6394k = do2Var5.m6394k();
                        if (((iM6395l >> 24) & 255) == 0) {
                            jM6398o = do2Var5.m6394k();
                            jM6398o2 = do2Var5.m6394k();
                        } else {
                            jM6398o = do2Var5.m6398o();
                            jM6398o2 = do2Var5.m6398o();
                        }
                        long j11 = j10 + jM6398o2;
                        long jM7373e = jo2.m7373e(jM6398o, 1000000L, jM6394k);
                        do2Var5.m6390g(2);
                        int iM6393j2 = do2Var5.m6393j();
                        int[] iArr3 = new int[iM6393j2];
                        long[] jArr = new long[iM6393j2];
                        long[] jArr2 = new long[iM6393j2];
                        long[] jArr3 = new long[iM6393j2];
                        long jM7373e2 = jM7373e;
                        while (i3 < iM6393j2) {
                            int iM6395l2 = do2Var5.m6395l();
                            if ((iM6395l2 & Integer.MIN_VALUE) != 0) {
                                throw new fh2("Unhandled indirect reference");
                            }
                            long jM6394k2 = do2Var5.m6394k();
                            iArr3[i3] = iM6395l2 & Integer.MAX_VALUE;
                            jArr[i3] = j11;
                            jArr3[i3] = jM7373e2;
                            long j12 = jM6398o + jM6394k2;
                            int i28 = iM6393j2;
                            long[] jArr4 = jArr2;
                            long[] jArr5 = jArr3;
                            jM7373e2 = jo2.m7373e(j12, 1000000L, jM6394k);
                            jArr4[i3] = jM7373e2 - jArr5[i3];
                            do2Var5.m6390g(4);
                            j11 += (long) iArr3[i3];
                            i3++;
                            jArr3 = jArr5;
                            jArr = jArr;
                            jArr2 = jArr4;
                            iM6393j2 = i28;
                            jM6398o = j12;
                        }
                        Pair pairCreate = Pair.create(Long.valueOf(jM7373e), new aj2(iArr3, jArr, jArr2, jArr3));
                        ((Long) pairCreate.first).longValue();
                        ((vl2) this.f15280v).m8572q((jj2) pairCreate.second);
                        this.f15281w = true;
                    }
                } else {
                    bj2Var.m6022b(i27, false);
                }
                m7278e(bj2Var.f12710d);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: c */
    public final boolean mo6194c(bj2 bj2Var) throws InterruptedException, IOException {
        return mk2.m7718a(bj2Var, true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: d */
    public final void mo6195d(dj2 dj2Var) {
        this.f15280v = dj2Var;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0366  */
    /* JADX WARN: Code duplicated, block: B:121:0x0369  */
    /* JADX WARN: Code duplicated, block: B:123:0x036d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x036f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0378  */
    /* JADX WARN: Code duplicated, block: B:127:0x037e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0387  */
    /* JADX WARN: Code duplicated, block: B:130:0x038d  */
    /* JADX WARN: Code duplicated, block: B:132:0x0390  */
    /* JADX WARN: Code duplicated, block: B:133:0x0395 A[DONT_INVERT, PHI: r10
  0x0395: PHI (r10v21 int) = (r10v19 int), (r10v24 int) binds: [B:129:0x038b, B:131:0x038e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:134:0x0397  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:137:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:138:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:141:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:142:0x03da  */
    /* JADX WARN: Code duplicated, block: B:228:0x05da  */
    /* JADX INFO: renamed from: e */
    public final void m7278e(long j2) throws fh2 {
        nk2 nk2VarM6369a;
        byte[] bArr;
        uj2 uj2Var;
        SparseArray<hk2> sparseArray;
        int i;
        int i2;
        pk2 pk2Var;
        byte[] bArr2;
        int i3;
        int i4;
        int i5;
        long jM7373e;
        int[] iArr;
        int[] iArr2;
        long[] jArr;
        boolean[] zArr;
        int i6;
        long j3;
        long j4;
        long j5;
        int iM6397n;
        int iM6397n2;
        int iM6395l;
        boolean z;
        loop0: while (true) {
            ik2 ik2Var = this;
            while (true) {
                if (ik2Var.f15267i.isEmpty() || ik2Var.f15267i.peek().f20361P0 != j2) {
                    break loop0;
                }
                uj2 uj2VarPop = ik2Var.f15267i.pop();
                int i7 = uj2VarPop.f21233O0;
                int i8 = 12;
                int i9 = 8;
                if (i7 == wj2.f21143B) {
                    yi2 yi2VarM7276h = m7276h(uj2VarPop.f20362Q0);
                    uj2 uj2VarM8510c = uj2VarPop.m8510c(wj2.f21165M);
                    SparseArray sparseArray2 = new SparseArray();
                    int size = uj2VarM8510c.f20362Q0.size();
                    int i10 = 0;
                    long jM6394k = -9223372036854775807L;
                    while (i10 < size) {
                        vj2 vj2Var = uj2VarM8510c.f20362Q0.get(i10);
                        int i11 = vj2Var.f21233O0;
                        if (i11 == wj2.f21229y) {
                            do2 do2Var = vj2Var.f20809P0;
                            do2Var.m6389f(i8);
                            Pair pairCreate = Pair.create(Integer.valueOf(do2Var.m6395l()), new ek2(do2Var.m6397n() - 1, do2Var.m6397n(), do2Var.m6397n(), do2Var.m6395l()));
                            sparseArray2.put(((Integer) pairCreate.first).intValue(), (ek2) pairCreate.second);
                        } else if (i11 == wj2.f21167N) {
                            do2 do2Var2 = vj2Var.f20809P0;
                            do2Var2.m6389f(8);
                            jM6394k = ((do2Var2.m6395l() >> 24) & 255) == 0 ? do2Var2.m6394k() : do2Var2.m6398o();
                        }
                        i10++;
                        i8 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size2 = uj2VarPop.f20363R0.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        uj2 uj2Var2 = uj2VarPop.f20363R0.get(i12);
                        if (uj2Var2.f21233O0 == wj2.f21147D && (nk2VarM6369a = dk2.m6369a(uj2Var2, uj2VarPop.m8509b(wj2.f21145C), jM6394k, yi2VarM7276h, false)) != null) {
                            sparseArray3.put(nk2VarM6369a.f17142a, nk2VarM6369a);
                        }
                    }
                    int size3 = sparseArray3.size();
                    if (ik2Var.f15261c.size() == 0) {
                        for (int i13 = 0; i13 < size3; i13++) {
                            nk2 nk2Var = (nk2) sparseArray3.valueAt(i13);
                            hk2 hk2Var = new hk2(((vl2) ik2Var.f15280v).m8570o(i13, nk2Var.f17143b));
                            ek2 ek2Var = (ek2) sparseArray2.get(nk2Var.f17142a);
                            hk2Var.f14893c = nk2Var;
                            Objects.requireNonNull(ek2Var);
                            hk2Var.f14894d = ek2Var;
                            ((km2) hk2Var.f14892b).m7515a(nk2Var.f17147f);
                            hk2Var.m7138a();
                            ik2Var.f15261c.put(nk2Var.f17142a, hk2Var);
                            ik2Var.f15275q = Math.max(ik2Var.f15275q, nk2Var.f17146e);
                        }
                        ((vl2) ik2Var.f15280v).m8571p();
                    } else {
                        C2622l.m5322V2(ik2Var.f15261c.size() == size3);
                        for (int i14 = 0; i14 < size3; i14++) {
                            nk2 nk2Var2 = (nk2) sparseArray3.valueAt(i14);
                            hk2 hk2Var2 = ik2Var.f15261c.get(nk2Var2.f17142a);
                            ek2 ek2Var2 = (ek2) sparseArray2.get(nk2Var2.f17142a);
                            Objects.requireNonNull(hk2Var2);
                            hk2Var2.f14893c = nk2Var2;
                            Objects.requireNonNull(ek2Var2);
                            hk2Var2.f14894d = ek2Var2;
                            ((km2) hk2Var2.f14892b).m7515a(nk2Var2.f17147f);
                            hk2Var2.m7138a();
                        }
                    }
                } else if (i7 == wj2.f21161K) {
                    SparseArray<hk2> sparseArray4 = ik2Var.f15261c;
                    byte[] bArr3 = ik2Var.f15266h;
                    int size4 = uj2VarPop.f20363R0.size();
                    int i15 = 0;
                    int i16 = 1;
                    while (i15 < size4) {
                        uj2 uj2Var3 = uj2VarPop.f20363R0.get(i15);
                        if (uj2Var3.f21233O0 == wj2.f21163L) {
                            do2 do2Var3 = uj2Var3.m8509b(wj2.f21227x).f20809P0;
                            do2Var3.m6389f(i9);
                            int iM6395l2 = do2Var3.m6395l() & 16777215;
                            hk2 hk2Var3 = sparseArray4.get(do2Var3.m6395l());
                            if (hk2Var3 == null) {
                                hk2Var3 = null;
                            } else {
                                if ((iM6395l2 & 1) != 0) {
                                    long jM6398o = do2Var3.m6398o();
                                    pk2 pk2Var2 = hk2Var3.f14891a;
                                    pk2Var2.f18005b = jM6398o;
                                    pk2Var2.f18006c = jM6398o;
                                }
                                ek2 ek2Var3 = hk2Var3.f14894d;
                                hk2Var3.f14891a.f18004a = new ek2((iM6395l2 & 2) != 0 ? do2Var3.m6397n() - 1 : ek2Var3.f13599a, (iM6395l2 & 8) != 0 ? do2Var3.m6397n() : ek2Var3.f13600b, (iM6395l2 & 16) != 0 ? do2Var3.m6397n() : ek2Var3.f13601c, (iM6395l2 & 32) != 0 ? do2Var3.m6397n() : ek2Var3.f13602d);
                            }
                            if (hk2Var3 == null) {
                                bArr = bArr3;
                                uj2Var = uj2VarPop;
                                sparseArray = sparseArray4;
                                i = size4;
                                i2 = i15;
                            } else {
                                pk2 pk2Var3 = hk2Var3.f14891a;
                                long jM6398o2 = pk2Var3.f18021r;
                                hk2Var3.m7138a();
                                int i17 = wj2.f21225w;
                                if (uj2Var3.m8509b(i17) != null) {
                                    do2 do2Var4 = uj2Var3.m8509b(i17).f20809P0;
                                    do2Var4.m6389f(i9);
                                    jM6398o2 = ((do2Var4.m6395l() >> 24) & 255) == i16 ? do2Var4.m6398o() : do2Var4.m6394k();
                                }
                                List<vj2> list = uj2Var3.f20362Q0;
                                int size5 = list.size();
                                int i18 = 0;
                                int i19 = 0;
                                int i20 = 0;
                                while (i20 < size5) {
                                    SparseArray<hk2> sparseArray5 = sparseArray4;
                                    vj2 vj2Var2 = list.get(i20);
                                    int i21 = size4;
                                    long j6 = jM6398o2;
                                    if (vj2Var2.f21233O0 == wj2.f21231z) {
                                        do2 do2Var5 = vj2Var2.f20809P0;
                                        do2Var5.m6389f(12);
                                        int iM6397n3 = do2Var5.m6397n();
                                        if (iM6397n3 > 0) {
                                            i18 += iM6397n3;
                                            i19++;
                                        }
                                    }
                                    i20++;
                                    size4 = i21;
                                    sparseArray4 = sparseArray5;
                                    jM6398o2 = j6;
                                }
                                sparseArray = sparseArray4;
                                i = size4;
                                long j7 = jM6398o2;
                                hk2Var3.f14897g = 0;
                                hk2Var3.f14896f = 0;
                                hk2Var3.f14895e = 0;
                                pk2 pk2Var4 = hk2Var3.f14891a;
                                pk2Var4.f18007d = i19;
                                pk2Var4.f18008e = i18;
                                int[] iArr3 = pk2Var4.f18010g;
                                if (iArr3 == null || iArr3.length < i19) {
                                    pk2Var4.f18009f = new long[i19];
                                    pk2Var4.f18010g = new int[i19];
                                }
                                int[] iArr4 = pk2Var4.f18011h;
                                if (iArr4 == null || iArr4.length < i18) {
                                    int i22 = (i18 * 125) / 100;
                                    pk2Var4.f18011h = new int[i22];
                                    pk2Var4.f18012i = new int[i22];
                                    pk2Var4.f18013j = new long[i22];
                                    pk2Var4.f18014k = new boolean[i22];
                                    pk2Var4.f18016m = new boolean[i22];
                                }
                                int i23 = 0;
                                int i24 = 0;
                                int i25 = 0;
                                while (i23 < size5) {
                                    vj2 vj2Var3 = list.get(i23);
                                    if (vj2Var3.f21233O0 == wj2.f21231z) {
                                        int i26 = i24 + 1;
                                        do2 do2Var6 = vj2Var3.f20809P0;
                                        do2Var6.m6389f(8);
                                        int iM6395l3 = do2Var6.m6395l() & 16777215;
                                        nk2 nk2Var3 = hk2Var3.f14893c;
                                        pk2 pk2Var5 = hk2Var3.f14891a;
                                        ek2 ek2Var4 = pk2Var5.f18004a;
                                        pk2Var5.f18010g[i24] = do2Var6.m6397n();
                                        long[] jArr2 = pk2Var5.f18009f;
                                        long j8 = pk2Var5.f18005b;
                                        jArr2[i24] = j8;
                                        if ((iM6395l3 & 1) != 0) {
                                            jArr2[i24] = j8 + ((long) do2Var6.m6395l());
                                        }
                                        int i27 = iM6395l3 & 4;
                                        int iM6397n4 = ek2Var4.f13602d;
                                        if (i27 != 0) {
                                            iM6397n4 = do2Var6.m6397n();
                                        }
                                        int i28 = iM6395l3 & 256;
                                        int i29 = iM6395l3 & 512;
                                        int i30 = iM6395l3 & 1024;
                                        int i31 = iM6395l3 & 2048;
                                        long[] jArr3 = nk2Var3.f17150i;
                                        if (jArr3 != null) {
                                            i5 = iM6397n4;
                                            i4 = i15;
                                            if (jArr3.length == 1 && jArr3[0] == 0) {
                                                jM7373e = jo2.m7373e(nk2Var3.f17151j[0], 1000L, nk2Var3.f17144c);
                                            }
                                            iArr = pk2Var5.f18011h;
                                            iArr2 = pk2Var5.f18012i;
                                            jArr = pk2Var5.f18013j;
                                            zArr = pk2Var5.f18014k;
                                            i6 = pk2Var5.f18010g[i24] + i25;
                                            j3 = jM7373e;
                                            j4 = nk2Var3.f17144c;
                                            if (i24 > 0) {
                                                j5 = pk2Var5.f18021r;
                                            } else {
                                                j5 = j7;
                                            }
                                            while (i25 < i6) {
                                                if (i28 != 0) {
                                                    iM6397n = do2Var6.m6397n();
                                                } else {
                                                    iM6397n = ek2Var4.f13600b;
                                                }
                                                if (i29 != 0) {
                                                    iM6397n2 = do2Var6.m6397n();
                                                } else {
                                                    iM6397n2 = ek2Var4.f13601c;
                                                }
                                                if (i25 == 0) {
                                                    i25 = 0;
                                                    if (i27 != 0) {
                                                        iM6395l = i5;
                                                    } else if (i30 != 0) {
                                                        iM6395l = do2Var6.m6395l();
                                                    } else {
                                                        iM6395l = ek2Var4.f13602d;
                                                    }
                                                } else if (i30 != 0) {
                                                    iM6395l = do2Var6.m6395l();
                                                } else {
                                                    iM6395l = ek2Var4.f13602d;
                                                }
                                                if (i31 != 0) {
                                                    iArr2[i25] = (int) (((long) (do2Var6.m6395l() * CloseCodes.NORMAL_CLOSURE)) / j4);
                                                } else {
                                                    iArr2[i25] = 0;
                                                }
                                                jArr[i25] = jo2.m7373e(j5, 1000L, j4) - j3;
                                                iArr[i25] = iM6397n2;
                                                if (1 != (((iM6395l >> 16) & 1) ^ 1)) {
                                                    z = false;
                                                } else {
                                                    z = true;
                                                }
                                                zArr[i25] = z;
                                                j5 += (long) iM6397n;
                                                i25++;
                                                i28 = i28;
                                                i6 = i6;
                                                i27 = i27;
                                                i31 = i31;
                                                ek2Var4 = ek2Var4;
                                                i29 = i29;
                                            }
                                            pk2Var5.f18021r = j5;
                                            i24 = i26;
                                            i25 = i6;
                                        } else {
                                            i5 = iM6397n4;
                                            i4 = i15;
                                        }
                                        jM7373e = 0;
                                        iArr = pk2Var5.f18011h;
                                        iArr2 = pk2Var5.f18012i;
                                        jArr = pk2Var5.f18013j;
                                        zArr = pk2Var5.f18014k;
                                        i6 = pk2Var5.f18010g[i24] + i25;
                                        j3 = jM7373e;
                                        j4 = nk2Var3.f17144c;
                                        if (i24 > 0) {
                                            j5 = pk2Var5.f18021r;
                                        } else {
                                            j5 = j7;
                                        }
                                        while (i25 < i6) {
                                            if (i28 != 0) {
                                                iM6397n = do2Var6.m6397n();
                                            } else {
                                                iM6397n = ek2Var4.f13600b;
                                            }
                                            if (i29 != 0) {
                                                iM6397n2 = do2Var6.m6397n();
                                            } else {
                                                iM6397n2 = ek2Var4.f13601c;
                                            }
                                            if (i25 == 0) {
                                                i25 = 0;
                                                if (i27 != 0) {
                                                    iM6395l = i5;
                                                } else if (i30 != 0) {
                                                    iM6395l = do2Var6.m6395l();
                                                } else {
                                                    iM6395l = ek2Var4.f13602d;
                                                }
                                            } else if (i30 != 0) {
                                                iM6395l = do2Var6.m6395l();
                                            } else {
                                                iM6395l = ek2Var4.f13602d;
                                            }
                                            if (i31 != 0) {
                                                iArr2[i25] = (int) (((long) (do2Var6.m6395l() * CloseCodes.NORMAL_CLOSURE)) / j4);
                                            } else {
                                                iArr2[i25] = 0;
                                            }
                                            jArr[i25] = jo2.m7373e(j5, 1000L, j4) - j3;
                                            iArr[i25] = iM6397n2;
                                            if (1 != (((iM6395l >> 16) & 1) ^ 1)) {
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            zArr[i25] = z;
                                            j5 += (long) iM6397n;
                                            i25++;
                                            i28 = i28;
                                            i6 = i6;
                                            i27 = i27;
                                            i31 = i31;
                                            ek2Var4 = ek2Var4;
                                            i29 = i29;
                                        }
                                        pk2Var5.f18021r = j5;
                                        i24 = i26;
                                        i25 = i6;
                                    } else {
                                        uj2VarPop = uj2VarPop;
                                        i4 = i15;
                                        uj2Var3 = uj2Var3;
                                        pk2Var3 = pk2Var3;
                                    }
                                    i23++;
                                    list = list;
                                    size5 = size5;
                                    bArr3 = bArr3;
                                    uj2VarPop = uj2VarPop;
                                    uj2Var3 = uj2Var3;
                                    pk2Var3 = pk2Var3;
                                    i15 = i4;
                                    hk2Var3 = hk2Var3;
                                }
                                byte[] bArr4 = bArr3;
                                uj2Var = uj2VarPop;
                                i2 = i15;
                                pk2 pk2Var6 = pk2Var3;
                                hk2 hk2Var4 = hk2Var3;
                                vj2 vj2VarM8509b = uj2Var3.m8509b(wj2.f21186c0);
                                if (vj2VarM8509b != null) {
                                    pk2Var = pk2Var6;
                                    ok2 ok2Var = hk2Var4.f14893c.f17149h[pk2Var.f18004a.f13599a];
                                    do2 do2Var7 = vj2VarM8509b.f20809P0;
                                    int i32 = ok2Var.f17663a;
                                    do2Var7.m6389f(8);
                                    if ((do2Var7.m6395l() & 16777215 & 1) == 1) {
                                        do2Var7.m6390g(8);
                                    }
                                    int iM6392i = do2Var7.m6392i();
                                    int iM6397n5 = do2Var7.m6397n();
                                    int i33 = pk2Var.f18008e;
                                    if (iM6397n5 != i33) {
                                        throw new fh2(outline.m1586h(41, "Length mismatch: ", iM6397n5, ", ", i33));
                                    }
                                    if (iM6392i == 0) {
                                        boolean[] zArr2 = pk2Var.f18016m;
                                        i3 = 0;
                                        for (int i34 = 0; i34 < iM6397n5; i34++) {
                                            int iM6392i2 = do2Var7.m6392i();
                                            i3 += iM6392i2;
                                            zArr2[i34] = iM6392i2 > i32;
                                        }
                                    } else {
                                        i3 = iM6392i * iM6397n5;
                                        Arrays.fill(pk2Var.f18016m, 0, iM6397n5, iM6392i > i32);
                                    }
                                    pk2Var.m8123a(i3);
                                } else {
                                    pk2Var = pk2Var6;
                                }
                                vj2 vj2VarM8509b2 = uj2Var3.m8509b(wj2.f21188d0);
                                if (vj2VarM8509b2 != null) {
                                    do2 do2Var8 = vj2VarM8509b2.f20809P0;
                                    do2Var8.m6389f(8);
                                    int iM6395l4 = do2Var8.m6395l();
                                    if ((16777215 & iM6395l4 & 1) == 1) {
                                        do2Var8.m6390g(8);
                                    }
                                    int iM6397n6 = do2Var8.m6397n();
                                    if (iM6397n6 != 1) {
                                        throw new fh2(outline.m1585g(40, "Unexpected saio entry count: ", iM6397n6));
                                    }
                                    pk2Var.f18006c += ((iM6395l4 >> 24) & 255) == 0 ? do2Var8.m6394k() : do2Var8.m6398o();
                                }
                                vj2 vj2VarM8509b3 = uj2Var3.m8509b(wj2.f21196h0);
                                if (vj2VarM8509b3 != null) {
                                    m7275g(vj2VarM8509b3.f20809P0, 0, pk2Var);
                                }
                                vj2 vj2VarM8509b4 = uj2Var3.m8509b(wj2.f21190e0);
                                vj2 vj2VarM8509b5 = uj2Var3.m8509b(wj2.f21192f0);
                                if (vj2VarM8509b4 != null && vj2VarM8509b5 != null) {
                                    do2 do2Var9 = vj2VarM8509b4.f20809P0;
                                    do2 do2Var10 = vj2VarM8509b5.f20809P0;
                                    do2Var9.m6389f(8);
                                    int iM6395l5 = do2Var9.m6395l();
                                    int iM6395l6 = do2Var9.m6395l();
                                    int i35 = f15259a;
                                    if (iM6395l6 == i35) {
                                        if (((iM6395l5 >> 24) & 255) == 1) {
                                            do2Var9.m6390g(4);
                                        }
                                        if (do2Var9.m6395l() != 1) {
                                            throw new fh2("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        do2Var10.m6389f(8);
                                        int iM6395l7 = do2Var10.m6395l();
                                        if (do2Var10.m6395l() == i35) {
                                            int i36 = (iM6395l7 >> 24) & 255;
                                            if (i36 == 1) {
                                                if (do2Var10.m6394k() == 0) {
                                                    throw new fh2("Variable length decription in sgpd found (unsupported)");
                                                }
                                            } else if (i36 >= 2) {
                                                do2Var10.m6390g(4);
                                            }
                                            if (do2Var10.m6394k() != 1) {
                                                throw new fh2("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            do2Var10.m6390g(2);
                                            if (do2Var10.m6392i() == 1) {
                                                int iM6392i3 = do2Var10.m6392i();
                                                byte[] bArr5 = new byte[16];
                                                System.arraycopy(do2Var10.f13340a, do2Var10.f13341b, bArr5, 0, 16);
                                                do2Var10.f13341b += 16;
                                                pk2Var.f18015l = true;
                                                pk2Var.f18017n = new ok2(true, iM6392i3, bArr5);
                                            }
                                        }
                                    }
                                }
                                int size6 = uj2Var3.f20362Q0.size();
                                int i37 = 0;
                                while (i37 < size6) {
                                    vj2 vj2Var4 = uj2Var3.f20362Q0.get(i37);
                                    if (vj2Var4.f21233O0 == wj2.f21194g0) {
                                        do2 do2Var11 = vj2Var4.f20809P0;
                                        do2Var11.m6389f(8);
                                        bArr2 = bArr4;
                                        do2Var11.m6391h(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, f15260b)) {
                                            m7275g(do2Var11, 16, pk2Var);
                                        }
                                    } else {
                                        bArr2 = bArr4;
                                    }
                                    i37++;
                                    bArr4 = bArr2;
                                }
                                bArr = bArr4;
                            }
                        } else {
                            bArr = bArr3;
                            uj2Var = uj2VarPop;
                            sparseArray = sparseArray4;
                            i = size4;
                            i2 = i15;
                        }
                        i15 = i2 + 1;
                        i16 = 1;
                        bArr3 = bArr;
                        size4 = i;
                        sparseArray4 = sparseArray;
                        uj2VarPop = uj2Var;
                        i9 = 8;
                    }
                    yi2 yi2VarM7276h2 = m7276h(uj2VarPop.f20362Q0);
                    if (yi2VarM7276h2 != null) {
                        ik2 ik2Var2 = this;
                        int i38 = 0;
                        for (int size7 = ik2Var2.f15261c.size(); i38 < size7; size7 = size7) {
                            hk2 hk2VarValueAt = ik2Var2.f15261c.valueAt(i38);
                            lj2 lj2Var = hk2VarValueAt.f14892b;
                            ch2 ch2Var = hk2VarValueAt.f14893c.f17147f;
                            ((km2) lj2Var).m7515a(new ch2(ch2Var.f13011f, ch2Var.f13015j, ch2Var.f13016k, ch2Var.f13013h, ch2Var.f13012g, ch2Var.f13017l, ch2Var.f13020o, ch2Var.f13021p, ch2Var.f13022q, ch2Var.f13023r, ch2Var.f13024s, ch2Var.f13026u, ch2Var.f13025t, ch2Var.f13027v, ch2Var.f13028w, ch2Var.f13029x, ch2Var.f13030y, ch2Var.f13031z, ch2Var.f13005A, ch2Var.f13007C, ch2Var.f13008D, ch2Var.f13009E, ch2Var.f13006B, ch2Var.f13018m, yi2VarM7276h2, ch2Var.f13014i));
                            i38++;
                            ik2Var2 = this;
                        }
                        ik2Var = this;
                    }
                } else if (!ik2Var.f15267i.isEmpty()) {
                    ik2Var.f15267i.peek().f20363R0.add(uj2VarPop);
                }
            }
        }
        m7277a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.cj2
    /* JADX INFO: renamed from: f */
    public final void mo6196f(long j2, long j3) {
        int size = this.f15261c.size();
        for (int i = 0; i < size; i++) {
            this.f15261c.valueAt(i).m7138a();
        }
        this.f15268j.clear();
        this.f15267i.clear();
        m7277a();
    }

    public ik2(int i, ho2 ho2Var, nk2 nk2Var) {
        this.f15265g = new do2(16);
        this.f15262d = new do2(bo2.f12762a);
        this.f15263e = new do2(5);
        new do2();
        this.f15264f = new do2(1);
        this.f15266h = new byte[16];
        this.f15267i = new Stack<>();
        this.f15268j = new LinkedList<>();
        this.f15261c = new SparseArray<>();
        this.f15275q = -9223372036854775807L;
        m7277a();
    }
}
