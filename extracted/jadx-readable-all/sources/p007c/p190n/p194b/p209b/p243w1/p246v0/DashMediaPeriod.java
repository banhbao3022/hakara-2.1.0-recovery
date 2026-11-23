package p007c.p190n.p194b.p209b.p243w1.p246v0;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.DefaultCompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.EmptySampleStream;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.SequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSampleStream;
import p007c.p190n.p194b.p209b.p243w1.p246v0.PlayerEmsgHandler.c;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.AdaptationSet;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifest;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Descriptor2;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.EventStream;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Period;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.f, reason: use source file name */
/* JADX INFO: compiled from: DashMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class DashMediaPeriod implements MediaPeriod, SequenceableLoader.a<ChunkSampleStream<DashChunkSource>>, ChunkSampleStream.b<DashChunkSource> {

    /* JADX INFO: renamed from: f */
    public static final Pattern f9170f = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: g */
    public static final Pattern f9171g = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: A */
    public DashManifest f9172A;

    /* JADX INFO: renamed from: B */
    public int f9173B;

    /* JADX INFO: renamed from: C */
    public List<EventStream> f9174C;

    /* JADX INFO: renamed from: h */
    public final int f9175h;

    /* JADX INFO: renamed from: i */
    public final DashChunkSource.a f9176i;

    /* JADX INFO: renamed from: j */
    public final TransferListener f9177j;

    /* JADX INFO: renamed from: k */
    public final DrmSessionManager2 f9178k;

    /* JADX INFO: renamed from: l */
    public final LoadErrorHandlingPolicy f9179l;

    /* JADX INFO: renamed from: m */
    public final long f9180m;

    /* JADX INFO: renamed from: n */
    public final LoaderErrorThrower f9181n;

    /* JADX INFO: renamed from: o */
    public final Allocator f9182o;

    /* JADX INFO: renamed from: p */
    public final TrackGroupArray f9183p;

    /* JADX INFO: renamed from: q */
    public final a[] f9184q;

    /* JADX INFO: renamed from: r */
    public final CompositeSequenceableLoaderFactory f9185r;

    /* JADX INFO: renamed from: s */
    public final PlayerEmsgHandler f9186s;

    /* JADX INFO: renamed from: u */
    public final MediaSourceEventListener.a f9188u;

    /* JADX INFO: renamed from: v */
    public final DrmSessionEventListener2.a f9189v;

    /* JADX INFO: renamed from: w */
    public MediaPeriod.a f9190w;

    /* JADX INFO: renamed from: z */
    public SequenceableLoader f9193z;

    /* JADX INFO: renamed from: x */
    public ChunkSampleStream<DashChunkSource>[] f9191x = new ChunkSampleStream[0];

    /* JADX INFO: renamed from: y */
    public EventSampleStream[] f9192y = new EventSampleStream[0];

    /* JADX INFO: renamed from: t */
    public final IdentityHashMap<ChunkSampleStream<DashChunkSource>, PlayerEmsgHandler.c> f9187t = new IdentityHashMap<>();

    /* JADX INFO: renamed from: c.n.b.b.w1.v0.f$a */
    /* JADX INFO: compiled from: DashMediaPeriod.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int[] f9194a;

        /* JADX INFO: renamed from: b */
        public final int f9195b;

        /* JADX INFO: renamed from: c */
        public final int f9196c;

        /* JADX INFO: renamed from: d */
        public final int f9197d;

        /* JADX INFO: renamed from: e */
        public final int f9198e;

        /* JADX INFO: renamed from: f */
        public final int f9199f;

        /* JADX INFO: renamed from: g */
        public final int f9200g;

        public a(int i, int i2, int[] iArr, int i3, int i4, int i5, int i6) {
            this.f9195b = i;
            this.f9194a = iArr;
            this.f9196c = i2;
            this.f9198e = i3;
            this.f9199f = i4;
            this.f9200g = i5;
            this.f9197d = i6;
        }
    }

    public DashMediaPeriod(int i, DashManifest dashManifest, int i2, DashChunkSource.a aVar, TransferListener transferListener, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.a aVar3, long j2, LoaderErrorThrower loaderErrorThrower, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, PlayerEmsgHandler.b bVar) {
        int i3;
        int i4;
        boolean z;
        Format[] formatArrM4228k;
        Descriptor2 descriptor2M4227a;
        DrmSessionManager2 drmSessionManager3 = drmSessionManager2;
        this.f9175h = i;
        this.f9172A = dashManifest;
        this.f9173B = i2;
        this.f9176i = aVar;
        this.f9177j = transferListener;
        this.f9178k = drmSessionManager3;
        this.f9189v = aVar2;
        this.f9179l = loadErrorHandlingPolicy;
        this.f9188u = aVar3;
        this.f9180m = j2;
        this.f9181n = loaderErrorThrower;
        this.f9182o = allocator;
        this.f9185r = compositeSequenceableLoaderFactory;
        this.f9186s = new PlayerEmsgHandler(dashManifest, bVar, allocator);
        int i5 = 0;
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = this.f9191x;
        Objects.requireNonNull((DefaultCompositeSequenceableLoaderFactory) compositeSequenceableLoaderFactory);
        this.f9193z = new CompositeSequenceableLoader(chunkSampleStreamArr);
        Period period = dashManifest.f9266m.get(i2);
        List<EventStream> list = period.f9289d;
        this.f9174C = list;
        List<AdaptationSet> list2 = period.f9288c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i6 = 0; i6 < size; i6++) {
            sparseIntArray.put(list2.get(i6).f9248a, i6);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i6));
            arrayList.add(arrayList2);
            sparseArray.put(i6, arrayList2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            AdaptationSet adaptationSet = list2.get(i7);
            Descriptor2 descriptor2M4227a2 = m4227a(adaptationSet.f9252e, "http://dashif.org/guidelines/trickmode");
            descriptor2M4227a2 = descriptor2M4227a2 == null ? m4227a(adaptationSet.f9253f, "http://dashif.org/guidelines/trickmode") : descriptor2M4227a2;
            int iMin = (descriptor2M4227a2 == null || (iMin = sparseIntArray.get(Integer.parseInt(descriptor2M4227a2.f9280b), -1)) == -1) ? i7 : iMin;
            if (iMin == i7 && (descriptor2M4227a = m4227a(adaptationSet.f9253f, "urn:mpeg:dash:adaptation-set-switching:2016")) != null) {
                for (String str : Util6.m3106O(descriptor2M4227a.f9280b, ",")) {
                    int i8 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i8 != -1) {
                        iMin = Math.min(iMin, i8);
                    }
                }
            }
            if (iMin != i7) {
                List list3 = (List) sparseArray.get(i7);
                List list4 = (List) sparseArray.get(iMin);
                list4.addAll(list3);
                sparseArray.put(i7, list4);
                arrayList.remove(list3);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i9 = 0; i9 < size2; i9++) {
            iArr[i9] = C4799a.m11011r0((Collection) arrayList.get(i9));
            Arrays.sort(iArr[i9]);
        }
        boolean[] zArr = new boolean[size2];
        Format[][] formatArr = new Format[size2][];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size2) {
            int[] iArr2 = iArr[i10];
            int length = iArr2.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    z = false;
                    break;
                }
                List<Representation> list5 = list2.get(iArr2[i12]).f9250c;
                while (i5 < list5.size()) {
                    if (!list5.get(i5).f9302d.isEmpty()) {
                        z = true;
                        break;
                    }
                    i5++;
                }
                i12++;
                i5 = 0;
            }
            if (z) {
                zArr[i10] = true;
                i11++;
            }
            int[] iArr3 = iArr[i10];
            int length2 = iArr3.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length2) {
                    formatArrM4228k = new Format[0];
                    break;
                }
                int i14 = iArr3[i13];
                AdaptationSet adaptationSet2 = list2.get(i14);
                List<Descriptor2> list6 = list2.get(i14).f9251d;
                int i15 = 0;
                int[] iArr4 = iArr3;
                while (i15 < list6.size()) {
                    Descriptor2 descriptor2 = list6.get(i15);
                    int i16 = length2;
                    List<Descriptor2> list7 = list6;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor2.f9279a)) {
                        Format.b bVar2 = new Format.b();
                        bVar2.f6958k = "application/cea-608";
                        bVar2.f6948a = outline.m1603y(new StringBuilder(), adaptationSet2.f9248a, ":cea608");
                        formatArrM4228k = m4228k(descriptor2, f9170f, bVar2.m3519a());
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor2.f9279a)) {
                        Format.b bVar3 = new Format.b();
                        bVar3.f6958k = "application/cea-708";
                        bVar3.f6948a = outline.m1603y(new StringBuilder(), adaptationSet2.f9248a, ":cea708");
                        formatArrM4228k = m4228k(descriptor2, f9171g, bVar3.m3519a());
                        break;
                    }
                    i15++;
                    length2 = i16;
                    list6 = list7;
                }
                i13++;
                iArr3 = iArr4;
            }
            formatArr[i10] = formatArrM4228k;
            if (formatArr[i10].length != 0) {
                i11++;
            }
            i10++;
            i5 = 0;
        }
        int size3 = list.size() + i11 + size2;
        TrackGroup[] trackGroupArr = new TrackGroup[size3];
        a[] aVarArr = new a[size3];
        int i17 = 0;
        int i18 = 0;
        while (i17 < size2) {
            int[] iArr5 = iArr[i17];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr5.length;
            int i19 = size2;
            int i20 = 0;
            while (i20 < length3) {
                arrayList3.addAll(list2.get(iArr5[i20]).f9250c);
                i20++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            Format[] formatArr2 = new Format[size4];
            int i21 = 0;
            while (i21 < size4) {
                int i22 = size4;
                Format format = ((Representation) arrayList3.get(i21)).f9299a;
                formatArr2[i21] = format.m3516b(drmSessionManager3.mo3680b(format));
                i21++;
                size4 = i22;
                arrayList3 = arrayList3;
            }
            AdaptationSet adaptationSet3 = list2.get(iArr5[0]);
            int i23 = i18 + 1;
            if (zArr[i17]) {
                i3 = i23;
                i23++;
            } else {
                i3 = -1;
            }
            if (formatArr[i17].length != 0) {
                i4 = i23 + 1;
            } else {
                i4 = i23;
                i23 = -1;
            }
            trackGroupArr[i18] = new TrackGroup(formatArr2);
            aVarArr[i18] = new a(adaptationSet3.f9249b, 0, iArr5, i18, i3, i23, -1);
            int i24 = -1;
            if (i3 != -1) {
                Format.b bVar4 = new Format.b();
                bVar4.f6948a = outline.m1603y(new StringBuilder(), adaptationSet3.f9248a, ":emsg");
                bVar4.f6958k = "application/x-emsg";
                trackGroupArr[i3] = new TrackGroup(bVar4.m3519a());
                aVarArr[i3] = new a(5, 1, iArr5, i18, -1, -1, -1);
                i24 = -1;
            }
            if (i23 != i24) {
                trackGroupArr[i23] = new TrackGroup(formatArr[i17]);
                aVarArr[i23] = new a(3, 1, iArr5, i18, -1, -1, -1);
            }
            i17++;
            size2 = i19;
            i18 = i4;
            drmSessionManager3 = drmSessionManager2;
            iArr = iArr6;
            list2 = list2;
        }
        int i25 = 0;
        while (i25 < list.size()) {
            EventStream eventStream = list.get(i25);
            Format.b bVar5 = new Format.b();
            bVar5.f6948a = eventStream.m4281a();
            bVar5.f6958k = "application/x-emsg";
            trackGroupArr[i18] = new TrackGroup(bVar5.m3519a());
            aVarArr[i18] = new a(5, 2, new int[0], -1, -1, -1, i25);
            i25++;
            i18++;
        }
        Pair pairCreate = Pair.create(new TrackGroupArray(trackGroupArr), aVarArr);
        this.f9183p = (TrackGroupArray) pairCreate.first;
        this.f9184q = (a[]) pairCreate.second;
    }

    /* JADX INFO: renamed from: a */
    public static Descriptor2 m4227a(List<Descriptor2> list, String str) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor2 descriptor2 = list.get(i);
            if (str.equals(descriptor2.f9279a)) {
                return descriptor2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static Format[] m4228k(Descriptor2 descriptor2, Pattern pattern, Format format) {
        String str = descriptor2.f9280b;
        if (str == null) {
            return new Format[]{format};
        }
        int i = Util6.f6307a;
        String[] strArrSplit = str.split(";", -1);
        Format[] formatArr = new Format[strArrSplit.length];
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            Matcher matcher = pattern.matcher(strArrSplit[i2]);
            if (!matcher.matches()) {
                return new Format[]{format};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            Format.b bVarM3515a = format.m3515a();
            bVarM3515a.f6948a = format.f6923f + ":" + i3;
            bVarM3515a.f6946C = i3;
            bVarM3515a.f6950c = matcher.group(2);
            formatArr[i2] = bVarM3515a.m3519a();
        }
        return formatArr;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        return this.f9193z.mo4068b();
    }

    /* JADX INFO: renamed from: c */
    public final int m4229c(int i, int[] iArr) {
        int i2 = iArr[i];
        if (i2 == -1) {
            return -1;
        }
        int i3 = this.f9184q[i2].f9198e;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            int i5 = iArr[i4];
            if (i5 == i3 && this.f9184q[i5].f9196c == 0) {
                return i4;
            }
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        return this.f9193z.mo4069d(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        return this.f9193z.mo4070e();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: f */
    public long mo4071f(long j2, SeekParameters seekParameters) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.f9191x) {
            if (chunkSampleStream.f9122f == 2) {
                return chunkSampleStream.f9126j.mo4217f(j2, seekParameters);
            }
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        return this.f9193z.mo4072g();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
        this.f9193z.mo4073h(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader.a
    /* JADX INFO: renamed from: i */
    public void mo3428i(SequenceableLoader sequenceableLoader) {
        this.f9190w.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: m */
    public void mo4074m() throws IOException {
        this.f9181n.mo2896a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: n */
    public long mo4075n(long j2) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.f9191x) {
            chunkSampleStream.m4205D(j2);
        }
        for (EventSampleStream eventSampleStream : this.f9192y) {
            eventSampleStream.m4250b(j2);
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: p */
    public long mo4076p() {
        return -9223372036854775807L;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: q */
    public void mo4077q(MediaPeriod.a aVar, long j2) {
        this.f9190w = aVar;
        aVar.mo3429j(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: r */
    public long mo4078r(ExoTrackSelection2[] exoTrackSelection2Arr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        int i;
        boolean z;
        int i2;
        int[] iArr;
        TrackGroup trackGroup;
        int i3;
        TrackGroup trackGroup2;
        int i4;
        PlayerEmsgHandler.c cVar;
        ExoTrackSelection2[] exoTrackSelection2Arr2 = exoTrackSelection2Arr;
        int[] iArr2 = new int[exoTrackSelection2Arr2.length];
        int i5 = 0;
        while (true) {
            i = -1;
            if (i5 >= exoTrackSelection2Arr2.length) {
                break;
            }
            if (exoTrackSelection2Arr2[i5] != null) {
                iArr2[i5] = this.f9183p.m4193a(exoTrackSelection2Arr2[i5].mo4512a());
            } else {
                iArr2[i5] = -1;
            }
            i5++;
        }
        for (int i6 = 0; i6 < exoTrackSelection2Arr2.length; i6++) {
            if (exoTrackSelection2Arr2[i6] == null || !zArr[i6]) {
                if (sampleStreamArr[i6] instanceof ChunkSampleStream) {
                    ((ChunkSampleStream) sampleStreamArr[i6]).m4203B(this);
                } else if (sampleStreamArr[i6] instanceof ChunkSampleStream.a) {
                    ((ChunkSampleStream.a) sampleStreamArr[i6]).m4213d();
                }
                sampleStreamArr[i6] = null;
            }
        }
        int i7 = 0;
        while (true) {
            z = true;
            boolean z2 = true;
            if (i7 >= exoTrackSelection2Arr2.length) {
                break;
            }
            if ((sampleStreamArr[i7] instanceof EmptySampleStream) || (sampleStreamArr[i7] instanceof ChunkSampleStream.a)) {
                int iM4229c = m4229c(i7, iArr2);
                if (iM4229c == -1) {
                    z2 = sampleStreamArr[i7] instanceof EmptySampleStream;
                } else if (!(sampleStreamArr[i7] instanceof ChunkSampleStream.a) || ((ChunkSampleStream.a) sampleStreamArr[i7]).f9143f != sampleStreamArr[iM4229c]) {
                    z2 = false;
                }
                if (!z2) {
                    if (sampleStreamArr[i7] instanceof ChunkSampleStream.a) {
                        ((ChunkSampleStream.a) sampleStreamArr[i7]).m4213d();
                    }
                    sampleStreamArr[i7] = null;
                }
            }
            i7++;
        }
        SampleStream[] sampleStreamArr2 = sampleStreamArr;
        int i8 = 0;
        while (i8 < exoTrackSelection2Arr2.length) {
            ExoTrackSelection2 exoTrackSelection2 = exoTrackSelection2Arr2[i8];
            if (exoTrackSelection2 == null) {
                i2 = i8;
                iArr = iArr2;
            } else if (sampleStreamArr2[i8] == null) {
                zArr2[i8] = z;
                a aVar = this.f9184q[iArr2[i8]];
                int i9 = aVar.f9196c;
                if (i9 == 0) {
                    int i10 = aVar.f9199f;
                    boolean z3 = i10 != i;
                    if (z3) {
                        trackGroup = this.f9183p.f9069h[i10];
                        i3 = 1;
                    } else {
                        trackGroup = null;
                        i3 = 0;
                    }
                    int i11 = aVar.f9200g;
                    boolean z4 = i11 != i;
                    if (z4) {
                        trackGroup2 = this.f9183p.f9069h[i11];
                        i3 += trackGroup2.f9064f;
                    } else {
                        trackGroup2 = null;
                    }
                    Format[] formatArr = new Format[i3];
                    int[] iArr3 = new int[i3];
                    if (z3) {
                        formatArr[0] = trackGroup.f9065g[0];
                        iArr3[0] = 5;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        for (int i12 = 0; i12 < trackGroup2.f9064f; i12++) {
                            formatArr[i4] = trackGroup2.f9065g[i12];
                            iArr3[i4] = 3;
                            arrayList.add(formatArr[i4]);
                            i4 += z ? 1 : 0;
                        }
                    }
                    if (this.f9172A.f9257d && z3) {
                        PlayerEmsgHandler playerEmsgHandler = this.f9186s;
                        cVar = playerEmsgHandler.new c(playerEmsgHandler.f9231f);
                    } else {
                        cVar = null;
                    }
                    i2 = i8;
                    iArr = iArr2;
                    PlayerEmsgHandler.c cVar2 = cVar;
                    ChunkSampleStream<DashChunkSource> chunkSampleStream = new ChunkSampleStream<>(aVar.f9195b, iArr3, formatArr, this.f9176i.mo4226a(this.f9181n, this.f9172A, this.f9173B, aVar.f9194a, exoTrackSelection2, aVar.f9195b, this.f9180m, z3, arrayList, cVar, this.f9177j), this, this.f9182o, j2, this.f9178k, this.f9189v, this.f9179l, this.f9188u);
                    synchronized (this) {
                        this.f9187t.put(chunkSampleStream, cVar2);
                    }
                    sampleStreamArr[i2] = chunkSampleStream;
                    sampleStreamArr2 = sampleStreamArr;
                } else {
                    i2 = i8;
                    iArr = iArr2;
                    if (i9 == 2) {
                        sampleStreamArr2[i2] = new EventSampleStream(this.f9174C.get(aVar.f9197d), exoTrackSelection2.mo4512a().f9065g[0], this.f9172A.f9257d);
                    }
                }
            } else {
                i2 = i8;
                iArr = iArr2;
                if (sampleStreamArr2[i2] instanceof ChunkSampleStream) {
                    ((DashChunkSource) ((ChunkSampleStream) sampleStreamArr2[i2]).f9126j).mo4224b(exoTrackSelection2);
                }
            }
            i8 = i2 + 1;
            exoTrackSelection2Arr2 = exoTrackSelection2Arr;
            iArr2 = iArr;
            z = true;
            i = -1;
        }
        int[] iArr4 = iArr2;
        int i13 = 0;
        while (i13 < exoTrackSelection2Arr.length) {
            if (sampleStreamArr2[i13] == null && exoTrackSelection2Arr[i13] != null) {
                a aVar2 = this.f9184q[iArr4[i13]];
                if (aVar2.f9196c == 1) {
                    iArr4 = iArr4;
                    int iM4229c2 = m4229c(i13, iArr4);
                    if (iM4229c2 == -1) {
                        sampleStreamArr2[i13] = new EmptySampleStream();
                    } else {
                        ChunkSampleStream chunkSampleStream2 = (ChunkSampleStream) sampleStreamArr2[iM4229c2];
                        int i14 = aVar2.f9195b;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= chunkSampleStream2.f9135s.length) {
                                throw new IllegalStateException();
                            }
                            if (chunkSampleStream2.f9123g[i15] == i14) {
                                C2096e.m4570f(!chunkSampleStream2.f9125i[i15]);
                                chunkSampleStream2.f9125i[i15] = true;
                                chunkSampleStream2.f9135s[i15].m4153F(j2, true);
                                sampleStreamArr2[i13] = new ChunkSampleStream.a(chunkSampleStream2, chunkSampleStream2.f9135s[i15], i15);
                                break;
                            }
                            i15++;
                        }
                    }
                }
                i13++;
                iArr4 = iArr4;
            }
            i13++;
            iArr4 = iArr4;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (SampleStream sampleStream : sampleStreamArr2) {
            if (sampleStream instanceof ChunkSampleStream) {
                arrayList2.add((ChunkSampleStream) sampleStream);
            } else if (sampleStream instanceof EventSampleStream) {
                arrayList3.add((EventSampleStream) sampleStream);
            }
        }
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = new ChunkSampleStream[arrayList2.size()];
        this.f9191x = chunkSampleStreamArr;
        arrayList2.toArray(chunkSampleStreamArr);
        EventSampleStream[] eventSampleStreamArr = new EventSampleStream[arrayList3.size()];
        this.f9192y = eventSampleStreamArr;
        arrayList3.toArray(eventSampleStreamArr);
        CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory = this.f9185r;
        ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr2 = this.f9191x;
        Objects.requireNonNull((DefaultCompositeSequenceableLoaderFactory) compositeSequenceableLoaderFactory);
        this.f9193z = new CompositeSequenceableLoader(chunkSampleStreamArr2);
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: s */
    public TrackGroupArray mo4079s() {
        return this.f9183p;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: u */
    public void mo4080u(long j2, boolean z) {
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : this.f9191x) {
            chunkSampleStream.m4206u(j2, z);
        }
    }
}
