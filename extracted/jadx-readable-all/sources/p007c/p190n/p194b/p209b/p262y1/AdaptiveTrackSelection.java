package p007c.p190n.p194b.p209b.p262y1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunkIterator;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.AbstractMultimap;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.MultimapBuilder;
import p007c.p190n.p378c.p380b.Multimaps;
import p007c.p190n.p378c.p380b.NaturalOrdering;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.y1.d, reason: use source file name */
/* JADX INFO: compiled from: AdaptiveTrackSelection.java */
/* JADX INFO: loaded from: classes.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {

    /* JADX INFO: renamed from: g */
    public final BandwidthMeter f10205g;

    /* JADX INFO: renamed from: h */
    public final long f10206h;

    /* JADX INFO: renamed from: i */
    public final long f10207i;

    /* JADX INFO: renamed from: j */
    public final long f10208j;

    /* JADX INFO: renamed from: k */
    public final float f10209k;

    /* JADX INFO: renamed from: l */
    public final float f10210l;

    /* JADX INFO: renamed from: m */
    public final ImmutableList2<a> f10211m;

    /* JADX INFO: renamed from: n */
    public final Clock2 f10212n;

    /* JADX INFO: renamed from: o */
    public float f10213o;

    /* JADX INFO: renamed from: p */
    public int f10214p;

    /* JADX INFO: renamed from: q */
    public int f10215q;

    /* JADX INFO: renamed from: r */
    public long f10216r;

    /* JADX INFO: renamed from: s */
    public MediaChunk f10217s;

    /* JADX INFO: renamed from: c.n.b.b.y1.d$a */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final long f10218a;

        /* JADX INFO: renamed from: b */
        public final long f10219b;

        public a(long j2, long j3) {
            this.f10218a = j2;
            this.f10219b = j3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10218a == aVar.f10218a && this.f10219b == aVar.f10219b;
        }

        public int hashCode() {
            return (((int) this.f10218a) * 31) + ((int) this.f10219b);
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.y1.d$b */
    /* JADX INFO: compiled from: AdaptiveTrackSelection.java */
    public static class b implements ExoTrackSelection2.b {

        /* JADX INFO: renamed from: a */
        public final int f10220a;

        /* JADX INFO: renamed from: b */
        public final int f10221b;

        /* JADX INFO: renamed from: c */
        public final int f10222c;

        /* JADX INFO: renamed from: d */
        public final float f10223d;

        /* JADX INFO: renamed from: e */
        public final float f10224e;

        /* JADX INFO: renamed from: f */
        public final Clock2 f10225f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, Clock2.f6300a);
        }

        /* JADX WARN: Code duplicated, block: B:97:0x020c  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2.b
        /* JADX INFO: renamed from: a */
        public final ExoTrackSelection2[] mo4511a(ExoTrackSelection2.a[] aVarArr, BandwidthMeter bandwidthMeter, MediaSource2.a aVar, Timeline timeline) {
            int i;
            double dLog;
            int[] iArr;
            ExoTrackSelection2.a[] aVarArr2 = aVarArr;
            ArrayList arrayList = new ArrayList();
            char c2 = 0;
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= aVarArr2.length) {
                    break;
                }
                if (aVarArr2[i2] == null || aVarArr2[i2].f10334b.length <= 1) {
                    arrayList.add(null);
                } else {
                    AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
                    ImmutableList2.a aVar2 = new ImmutableList2.a();
                    aVar2.m11646b(new a(0L, 0L));
                    arrayList.add(aVar2);
                }
                i2++;
            }
            int length = aVarArr2.length;
            long[][] jArr = new long[length][];
            for (int i3 = 0; i3 < aVarArr2.length; i3++) {
                ExoTrackSelection2.a aVar3 = aVarArr2[i3];
                if (aVar3 == null) {
                    jArr[i3] = new long[0];
                } else {
                    jArr[i3] = new long[aVar3.f10334b.length];
                    int i4 = 0;
                    while (true) {
                        int[] iArr2 = aVar3.f10334b;
                        if (i4 >= iArr2.length) {
                            break;
                        }
                        jArr[i3][i4] = aVar3.f10333a.f9065g[iArr2[i4]].f6930m;
                        i4++;
                    }
                    Arrays.sort(jArr[i3]);
                }
            }
            int[] iArr3 = new int[length];
            long[] jArr2 = new long[length];
            for (int i5 = 0; i5 < length; i5++) {
                jArr2[i5] = jArr[i5].length == 0 ? 0L : jArr[i5][0];
            }
            AdaptiveTrackSelection.m4505v(arrayList, jArr2);
            NaturalOrdering naturalOrdering = NaturalOrdering.f26194f;
            C4799a.m11000m(2, "expectedValuesPerKey");
            Multimaps multimaps = new Multimaps(new TreeMap(naturalOrdering), new MultimapBuilder(2));
            int i6 = 0;
            while (i6 < length) {
                if (jArr[i6].length <= i) {
                    iArr = iArr3;
                } else {
                    int length2 = jArr[i6].length;
                    double[] dArr = new double[length2];
                    int i7 = 0;
                    while (true) {
                        dLog = 0.0d;
                        if (i7 >= jArr[i6].length) {
                            break;
                        }
                        if (jArr[i6][i7] != -1) {
                            dLog = Math.log(jArr[i6][i7]);
                        }
                        dArr[i7] = dLog;
                        i7++;
                        iArr3 = iArr3;
                    }
                    iArr = iArr3;
                    int i8 = length2 - 1;
                    double d = dArr[i8] - dArr[c2];
                    int i9 = 0;
                    while (i9 < i8) {
                        double d2 = dArr[i9];
                        i9++;
                        Object objValueOf = Double.valueOf(d == dLog ? 1.0d : (((d2 + dArr[i9]) * 0.5d) - dArr[c2]) / d);
                        Integer numValueOf = Integer.valueOf(i6);
                        Collection collection = (Collection) multimaps.f26149i.get(objValueOf);
                        if (collection == null) {
                            Collection collectionMo11585h = multimaps.mo11585h();
                            if (!collectionMo11585h.add(numValueOf)) {
                                throw new AssertionError("New Collection violated the Collection spec");
                            }
                            multimaps.f26150j++;
                            multimaps.f26149i.put((K) objValueOf, (Collection<V>) collectionMo11585h);
                        } else if (collection.add(numValueOf)) {
                            multimaps.f26150j++;
                        }
                        c2 = 0;
                        dLog = 0.0d;
                    }
                }
                i6++;
                iArr3 = iArr;
                c2 = 0;
                i = 1;
            }
            int[] iArr4 = iArr3;
            Collection aVar4 = multimaps.f26185g;
            if (aVar4 == null) {
                aVar4 = new AbstractMultimap.a();
                multimaps.f26185g = aVar4;
            }
            ImmutableList2 immutableList2M11642x = ImmutableList2.m11642x(aVar4);
            for (int i10 = 0; i10 < immutableList2M11642x.size(); i10++) {
                int iIntValue = ((Integer) immutableList2M11642x.get(i10)).intValue();
                int i11 = iArr4[iIntValue] + 1;
                iArr4[iIntValue] = i11;
                jArr2[iIntValue] = jArr[iIntValue][i11];
                AdaptiveTrackSelection.m4505v(arrayList, jArr2);
            }
            for (int i12 = 0; i12 < aVarArr2.length; i12++) {
                if (arrayList.get(i12) != null) {
                    jArr2[i12] = jArr2[i12] * 2;
                }
            }
            AdaptiveTrackSelection.m4505v(arrayList, jArr2);
            ImmutableList2.a aVar5 = new ImmutableList2.a();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ImmutableList2.a aVar6 = (ImmutableList2.a) arrayList.get(i13);
                aVar5.m11646b(aVar6 == null ? RegularImmutableList.f26218h : aVar6.m11647c());
            }
            ImmutableList2 immutableList2M11647c = aVar5.m11647c();
            ExoTrackSelection2[] exoTrackSelection2Arr = new ExoTrackSelection2[aVarArr2.length];
            int i14 = 0;
            while (i14 < aVarArr2.length) {
                ExoTrackSelection2.a aVar7 = aVarArr2[i14];
                if (aVar7 != null) {
                    int[] iArr5 = aVar7.f10334b;
                    if (iArr5.length != 0) {
                        exoTrackSelection2Arr[i14] = iArr5.length == 1 ? new FixedTrackSelection(aVar7.f10333a, iArr5[0], aVar7.f10335c, aVar7.f10336d) : new AdaptiveTrackSelection(aVar7.f10333a, iArr5, bandwidthMeter, this.f10220a, this.f10221b, this.f10222c, this.f10223d, this.f10224e, (ImmutableList2) immutableList2M11647c.get(i14), this.f10225f);
                    }
                }
                i14++;
                aVarArr2 = aVarArr;
            }
            return exoTrackSelection2Arr;
        }

        public b(int i, int i2, int i3, float f) {
            this(i, i2, i3, f, 0.75f, Clock2.f6300a);
        }

        public b(int i, int i2, int i3, float f, float f2, Clock2 clock2) {
            this.f10220a = i;
            this.f10221b = i2;
            this.f10222c = i3;
            this.f10223d = f;
            this.f10224e = f2;
            this.f10225f = clock2;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, bandwidthMeter, 10000L, 25000L, 25000L, 0.7f, 0.75f, RegularImmutableList.f26218h, Clock2.f6300a);
        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
    }

    /* JADX INFO: renamed from: v */
    public static void m4505v(List<ImmutableList2.a<a>> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i = 0; i < list.size(); i++) {
            ImmutableList2.a<a> aVar = list.get(i);
            if (aVar != null) {
                aVar.m11646b(new a(j2, jArr[i]));
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: b */
    public int mo4302b() {
        return this.f10214p;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.BaseTrackSelection, p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: g */
    public void mo4506g() {
        this.f10216r = -9223372036854775807L;
        this.f10217s = null;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.BaseTrackSelection, p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: h */
    public void mo4507h() {
        this.f10217s = null;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.BaseTrackSelection, p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: j */
    public int mo4508j(long j2, List<? extends MediaChunk> list) {
        int i;
        int i2;
        long jMo3068a = this.f10212n.mo3068a();
        long j3 = this.f10216r;
        if (!(j3 == -9223372036854775807L || jMo3068a - j3 >= 1000 || !(list.isEmpty() || ((MediaChunk) C4799a.m10965P(list)).equals(this.f10217s)))) {
            return list.size();
        }
        this.f10216r = jMo3068a;
        this.f10217s = list.isEmpty() ? null : (MediaChunk) C4799a.m10965P(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jM3138z = Util6.m3138z(list.get(size - 1).f9115g - j2, this.f10213o);
        long j4 = this.f10208j;
        if (jM3138z < j4) {
            return size;
        }
        Format format = this.f10229d[m4510w(jMo3068a)];
        for (int i3 = 0; i3 < size; i3++) {
            MediaChunk mediaChunk = list.get(i3);
            Format format2 = mediaChunk.f9112d;
            if (Util6.m3138z(mediaChunk.f9115g - j2, this.f10213o) >= j4 && format2.f6930m < format.f6930m && (i = format2.f6940w) != -1 && i < 720 && (i2 = format2.f6939v) != -1 && i2 < 1280 && i < format.f6940w) {
                return i3;
            }
        }
        return size;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: l */
    public void mo4303l(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jMo3068a = this.f10212n.mo3068a();
        int i = this.f10215q;
        if (i == 0) {
            this.f10215q = 1;
            this.f10214p = m4510w(jMo3068a);
            return;
        }
        int i2 = this.f10214p;
        int iMo4518k = list.isEmpty() ? -1 : mo4518k(((MediaChunk) C4799a.m10965P(list)).f9112d);
        if (iMo4518k != -1) {
            i = ((MediaChunk) C4799a.m10965P(list)).f9113e;
            i2 = iMo4518k;
        }
        int iM4510w = m4510w(jMo3068a);
        if (!m4524u(i2, jMo3068a)) {
            Format[] formatArr = this.f10229d;
            Format format = formatArr[i2];
            int i3 = formatArr[iM4510w].f6930m;
            int i4 = format.f6930m;
            if (i3 > i4) {
                if (j3 < (j4 != -9223372036854775807L && j4 <= this.f10206h ? (long) (j4 * this.f10210l) : this.f10206h)) {
                    iM4510w = i2;
                } else if (i3 < i4) {
                    iM4510w = i2;
                }
            } else if (i3 < i4 && j3 >= this.f10207i) {
                iM4510w = i2;
            }
        }
        if (iM4510w != i2) {
            i = 3;
        }
        this.f10215q = i;
        this.f10214p = iM4510w;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: o */
    public int mo4304o() {
        return this.f10215q;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.BaseTrackSelection, p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: p */
    public void mo4509p(float f) {
        this.f10213o = f;
    }

    @Override // p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2
    /* JADX INFO: renamed from: q */
    public Object mo4305q() {
        return null;
    }

    /* JADX INFO: renamed from: w */
    public final int m4510w(long j2) {
        long jMo2919e = (long) (this.f10205g.mo2919e() * this.f10209k);
        if (!this.f10211m.isEmpty()) {
            int i = 1;
            while (i < this.f10211m.size() - 1 && this.f10211m.get(i).f10218a < jMo2919e) {
                i++;
            }
            a aVar = this.f10211m.get(i - 1);
            a aVar2 = this.f10211m.get(i);
            long j3 = aVar.f10218a;
            float f = (jMo2919e - j3) / (aVar2.f10218a - j3);
            long j4 = aVar.f10219b;
            jMo2919e = ((long) (f * (aVar2.f10219b - j4))) + j4;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f10227b; i3++) {
            if (j2 == Long.MIN_VALUE || !m4524u(i3, j2)) {
                if (((long) Math.round(((float) this.f10229d[i3].f6930m) * this.f10213o)) <= jMo2919e) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter, long j2, long j3, long j4, float f, float f2, List<a> list, Clock2 clock2) {
        super(trackGroup, iArr);
        this.f10205g = bandwidthMeter;
        this.f10206h = j2 * 1000;
        this.f10207i = j3 * 1000;
        this.f10208j = j4 * 1000;
        this.f10209k = f;
        this.f10210l = f2;
        this.f10211m = ImmutableList2.m11642x(list);
        this.f10212n = clock2;
        this.f10213o = 1.0f;
        this.f10215q = 0;
        this.f10216r = -9223372036854775807L;
    }
}
