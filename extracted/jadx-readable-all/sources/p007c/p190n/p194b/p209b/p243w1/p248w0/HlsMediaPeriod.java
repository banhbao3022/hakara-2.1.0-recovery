package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.net.Uri;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.SeekParameters;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.DefaultCompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.SampleStream;
import p007c.p190n.p194b.p209b.p243w1.SequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.DefaultHlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsMasterPlaylist;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.p, reason: use source file name */
/* JADX INFO: compiled from: HlsMediaPeriod.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaPeriod implements MediaPeriod, HlsSampleStreamWrapper.b, HlsPlaylistTracker.b {

    /* JADX INFO: renamed from: A */
    public SequenceableLoader f9417A;

    /* JADX INFO: renamed from: f */
    public final HlsExtractorFactory f9418f;

    /* JADX INFO: renamed from: g */
    public final HlsPlaylistTracker f9419g;

    /* JADX INFO: renamed from: h */
    public final HlsDataSourceFactory f9420h;

    /* JADX INFO: renamed from: i */
    public final TransferListener f9421i;

    /* JADX INFO: renamed from: j */
    public final DrmSessionManager2 f9422j;

    /* JADX INFO: renamed from: k */
    public final DrmSessionEventListener2.a f9423k;

    /* JADX INFO: renamed from: l */
    public final LoadErrorHandlingPolicy f9424l;

    /* JADX INFO: renamed from: m */
    public final MediaSourceEventListener.a f9425m;

    /* JADX INFO: renamed from: n */
    public final Allocator f9426n;

    /* JADX INFO: renamed from: o */
    public final IdentityHashMap<SampleStream, Integer> f9427o;

    /* JADX INFO: renamed from: p */
    public final TimestampAdjusterProvider f9428p;

    /* JADX INFO: renamed from: q */
    public final CompositeSequenceableLoaderFactory f9429q;

    /* JADX INFO: renamed from: r */
    public final boolean f9430r;

    /* JADX INFO: renamed from: s */
    public final int f9431s;

    /* JADX INFO: renamed from: t */
    public final boolean f9432t;

    /* JADX INFO: renamed from: u */
    public MediaPeriod.a f9433u;

    /* JADX INFO: renamed from: v */
    public int f9434v;

    /* JADX INFO: renamed from: w */
    public TrackGroupArray f9435w;

    /* JADX INFO: renamed from: x */
    public HlsSampleStreamWrapper[] f9436x;

    /* JADX INFO: renamed from: y */
    public HlsSampleStreamWrapper[] f9437y;

    /* JADX INFO: renamed from: z */
    public int f9438z;

    public HlsMediaPeriod(HlsExtractorFactory hlsExtractorFactory, HlsPlaylistTracker hlsPlaylistTracker, HlsDataSourceFactory hlsDataSourceFactory, TransferListener transferListener, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.a aVar2, Allocator allocator, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, boolean z, int i, boolean z2) {
        this.f9418f = hlsExtractorFactory;
        this.f9419g = hlsPlaylistTracker;
        this.f9420h = hlsDataSourceFactory;
        this.f9421i = transferListener;
        this.f9422j = drmSessionManager2;
        this.f9423k = aVar;
        this.f9424l = loadErrorHandlingPolicy;
        this.f9425m = aVar2;
        this.f9426n = allocator;
        this.f9429q = compositeSequenceableLoaderFactory;
        this.f9430r = z;
        this.f9431s = i;
        this.f9432t = z2;
        Objects.requireNonNull((DefaultCompositeSequenceableLoaderFactory) compositeSequenceableLoaderFactory);
        this.f9417A = new CompositeSequenceableLoader(new SequenceableLoader[0]);
        this.f9427o = new IdentityHashMap<>();
        this.f9428p = new TimestampAdjusterProvider();
        this.f9436x = new HlsSampleStreamWrapper[0];
        this.f9437y = new HlsSampleStreamWrapper[0];
    }

    /* JADX INFO: renamed from: l */
    public static Format m4310l(Format format, Format format2, boolean z) {
        String str;
        Metadata metadata;
        int i;
        int i2;
        int i3;
        String str2;
        String str3;
        if (format2 != null) {
            str2 = format2.f6931n;
            metadata = format2.f6932o;
            int i4 = format2.f6915D;
            i2 = format2.f6926i;
            int i5 = format2.f6927j;
            String str4 = format2.f6925h;
            str3 = format2.f6924g;
            i3 = i4;
            i = i5;
            str = str4;
        } else {
            String strM3131s = Util6.m3131s(format.f6931n, 1);
            Metadata metadata2 = format.f6932o;
            if (z) {
                int i6 = format.f6915D;
                int i7 = format.f6926i;
                int i8 = format.f6927j;
                str = format.f6925h;
                str2 = strM3131s;
                str3 = format.f6924g;
                i3 = i6;
                i2 = i7;
                metadata = metadata2;
                i = i8;
            } else {
                str = null;
                metadata = metadata2;
                i = 0;
                i2 = 0;
                i3 = -1;
                str2 = strM3131s;
                str3 = null;
            }
        }
        String strM3163e = MimeTypes.m3163e(str2);
        int i9 = z ? format.f6928k : -1;
        int i10 = z ? format.f6929l : -1;
        Format.b bVar = new Format.b();
        bVar.f6948a = format.f6923f;
        bVar.f6949b = str3;
        bVar.f6957j = format.f6933p;
        bVar.f6958k = strM3163e;
        bVar.f6955h = str2;
        bVar.f6956i = metadata;
        bVar.f6953f = i9;
        bVar.f6954g = i10;
        bVar.f6971x = i3;
        bVar.f6951d = i2;
        bVar.f6952e = i;
        bVar.f6950c = str;
        return bVar.m3519a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistTracker.b
    /* JADX INFO: renamed from: a */
    public void mo4311a() {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f9436x) {
            if (!hlsSampleStreamWrapper.f9484s.isEmpty()) {
                HlsMediaChunk hlsMediaChunk = (HlsMediaChunk) C4799a.m10965P(hlsSampleStreamWrapper.f9484s);
                int iM4299b = hlsSampleStreamWrapper.f9474i.m4299b(hlsMediaChunk);
                if (iM4299b == 1) {
                    hlsMediaChunk.f9401L = true;
                } else if (iM4299b == 2 && !hlsSampleStreamWrapper.f9467Y && hlsSampleStreamWrapper.f9480o.m2899e()) {
                    hlsSampleStreamWrapper.f9480o.m2897b();
                }
            }
        }
        this.f9433u.mo3428i(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        return this.f9417A.mo4068b();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    @Override // p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsPlaylistTracker.b
    /* JADX INFO: renamed from: c */
    public boolean mo4312c(Uri uri, long j2) {
        boolean z;
        int iMo4523t;
        boolean z2 = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f9436x) {
            HlsChunkSource hlsChunkSource = hlsSampleStreamWrapper.f9474i;
            int i = 0;
            while (true) {
                Uri[] uriArr = hlsChunkSource.f9364e;
                if (i >= uriArr.length) {
                    i = -1;
                    break;
                }
                if (uriArr[i].equals(uri)) {
                    break;
                }
                i++;
            }
            if (i == -1 || (iMo4523t = hlsChunkSource.f9375p.mo4523t(i)) == -1) {
                z = true;
            } else {
                hlsChunkSource.f9377r |= uri.equals(hlsChunkSource.f9373n);
                if (j2 == -9223372036854775807L || hlsChunkSource.f9375p.mo4513c(iMo4523t, j2)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            z2 &= z;
        }
        this.f9433u.mo3428i(this);
        return z2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        if (this.f9435w != null) {
            return this.f9417A.mo4069d(j2);
        }
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f9436x) {
            if (!hlsSampleStreamWrapper.f9451I) {
                hlsSampleStreamWrapper.mo4069d(hlsSampleStreamWrapper.f9463U);
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        return this.f9417A.mo4070e();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: f */
    public long mo4071f(long j2, SeekParameters seekParameters) {
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        return this.f9417A.mo4072g();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod, p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
        this.f9417A.mo4073h(j2);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader.a
    /* JADX INFO: renamed from: i */
    public void mo3428i(SequenceableLoader sequenceableLoader) {
        this.f9433u.mo3428i(this);
    }

    /* JADX INFO: renamed from: k */
    public final HlsSampleStreamWrapper m4313k(int i, Uri[] uriArr, Format[] formatArr, Format format, List<Format> list, Map<String, DrmInitData> map, long j2) {
        return new HlsSampleStreamWrapper(i, this, new HlsChunkSource(this.f9418f, this.f9419g, uriArr, formatArr, this.f9420h, this.f9421i, this.f9428p, list), map, this.f9426n, j2, format, this.f9422j, this.f9423k, this.f9424l, this.f9425m, this.f9431s);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: m */
    public void mo4074m() throws IOException {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f9436x) {
            hlsSampleStreamWrapper.m4323E();
            if (hlsSampleStreamWrapper.f9467Y && !hlsSampleStreamWrapper.f9451I) {
                throw new ParserException("Loading finished before preparation is complete.");
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: n */
    public long mo4075n(long j2) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.f9437y;
        if (hlsSampleStreamWrapperArr.length > 0) {
            boolean zM4326H = hlsSampleStreamWrapperArr[0].m4326H(j2, false);
            int i = 1;
            while (true) {
                HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2 = this.f9437y;
                if (i >= hlsSampleStreamWrapperArr2.length) {
                    break;
                }
                hlsSampleStreamWrapperArr2[i].m4326H(j2, zM4326H);
                i++;
            }
            if (zM4326H) {
                this.f9428p.f9511a.clear();
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: o */
    public void m4314o() {
        int i = this.f9434v - 1;
        this.f9434v = i;
        if (i > 0) {
            return;
        }
        int i2 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f9436x) {
            hlsSampleStreamWrapper.m4328v();
            i2 += hlsSampleStreamWrapper.f9456N.f9068g;
        }
        TrackGroup[] trackGroupArr = new TrackGroup[i2];
        int i3 = 0;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper2 : this.f9436x) {
            hlsSampleStreamWrapper2.m4328v();
            int i4 = hlsSampleStreamWrapper2.f9456N.f9068g;
            int i5 = 0;
            while (i5 < i4) {
                hlsSampleStreamWrapper2.m4328v();
                trackGroupArr[i3] = hlsSampleStreamWrapper2.f9456N.f9069h[i5];
                i5++;
                i3++;
            }
        }
        this.f9435w = new TrackGroupArray(trackGroupArr);
        this.f9433u.mo3429j(this);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: p */
    public long mo4076p() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x015d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0195  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a A[LOOP:4: B:77:0x0198->B:78:0x019a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:91:0x021c A[LOOP:5: B:89:0x0216->B:91:0x021c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x0235  */
    /* JADX WARN: Code duplicated, block: B:95:0x023a A[LOOP:6: B:94:0x0238->B:95:0x023a, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r22v0, types: [c.n.b.b.w1.w0.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v44, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.Map] */
    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: q */
    public void mo4077q(MediaPeriod.a aVar, long j2) {
        ?? EmptyMap;
        ?? r21;
        List<HlsMasterPlaylist.a> list;
        ArrayList arrayList;
        ArrayList arrayList2;
        HashSet hashSet;
        int i;
        boolean z;
        int i2;
        boolean z2;
        Uri[] uriArr;
        Format[] formatArr;
        int[] iArr;
        int i3;
        int i4;
        int iM3130r;
        int iM3130r2;
        boolean z3;
        ?? r22;
        HlsSampleStreamWrapper hlsSampleStreamWrapperM4313k;
        ArrayList arrayList3;
        Format[] formatArr2;
        int i5;
        int i6;
        Format[] formatArr3;
        int i7;
        List<Format> list2;
        int i8;
        boolean z4;
        String str;
        this.f9433u = aVar;
        DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = (DefaultHlsPlaylistTracker) this.f9419g;
        Objects.requireNonNull(defaultHlsPlaylistTracker);
        defaultHlsPlaylistTracker.f9528k.add(this);
        HlsMasterPlaylist hlsMasterPlaylist = ((DefaultHlsPlaylistTracker) this.f9419g).f9534q;
        Objects.requireNonNull(hlsMasterPlaylist);
        if (this.f9432t) {
            List<DrmInitData> list3 = hlsMasterPlaylist.f9562n;
            ArrayList arrayList4 = new ArrayList(list3);
            EmptyMap = new HashMap();
            int i9 = 0;
            while (i9 < arrayList4.size()) {
                DrmInitData drmInitData = list3.get(i9);
                String str2 = drmInitData.f7430h;
                i9++;
                int i10 = i9;
                while (i10 < arrayList4.size()) {
                    DrmInitData drmInitData2 = (DrmInitData) arrayList4.get(i10);
                    if (TextUtils.equals(drmInitData2.f7430h, str2)) {
                        String str3 = drmInitData.f7430h;
                        C2096e.m4570f(str3 == null || (str = drmInitData2.f7430h) == null || TextUtils.equals(str3, str));
                        String str4 = drmInitData.f7430h;
                        if (str4 == null) {
                            str4 = drmInitData2.f7430h;
                        }
                        DrmInitData.b[] bVarArr = drmInitData.f7428f;
                        DrmInitData.b[] bVarArr2 = drmInitData2.f7428f;
                        int i11 = Util6.f6307a;
                        Object[] objArrCopyOf = Arrays.copyOf(bVarArr, bVarArr.length + bVarArr2.length);
                        System.arraycopy(bVarArr2, 0, objArrCopyOf, bVarArr.length, bVarArr2.length);
                        drmInitData = new DrmInitData(str4, (DrmInitData.b[]) objArrCopyOf);
                        arrayList4.remove(i10);
                    } else {
                        i10++;
                    }
                }
                EmptyMap.put(str2, drmInitData);
            }
        } else {
            EmptyMap = Collections.emptyMap();
        }
        ?? r13 = EmptyMap;
        boolean z5 = !hlsMasterPlaylist.f9554f.isEmpty();
        List<HlsMasterPlaylist.a> list4 = hlsMasterPlaylist.f9556h;
        List<HlsMasterPlaylist.a> list5 = hlsMasterPlaylist.f9557i;
        this.f9434v = 0;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        if (z5) {
            int size = hlsMasterPlaylist.f9554f.size();
            int[] iArr2 = new int[size];
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < hlsMasterPlaylist.f9554f.size(); i14++) {
                Format format = hlsMasterPlaylist.f9554f.get(i14).f9567b;
                if (format.f6940w > 0 || Util6.m3131s(format.f6931n, 2) != null) {
                    iArr2[i14] = 2;
                    i12++;
                } else if (Util6.m3131s(format.f6931n, 1) != null) {
                    iArr2[i14] = 1;
                    i13++;
                } else {
                    iArr2[i14] = -1;
                }
            }
            if (i12 > 0) {
                z = true;
            } else {
                if (i13 < size) {
                    i2 = size - i13;
                    z = false;
                    z2 = true;
                } else {
                    i12 = size;
                    z = false;
                }
                uriArr = new Uri[i2];
                formatArr = new Format[i2];
                iArr = new int[i2];
                i3 = 0;
                i4 = 0;
                while (i3 < hlsMasterPlaylist.f9554f.size()) {
                    if (z) {
                        z4 = z;
                        if (iArr2[i3] == 2) {
                        }
                        i3++;
                        z = z4;
                    } else {
                        z4 = z;
                    }
                    if (z2 || iArr2[i3] != 1) {
                        HlsMasterPlaylist.b bVar = hlsMasterPlaylist.f9554f.get(i3);
                        uriArr[i4] = bVar.f9566a;
                        formatArr[i4] = bVar.f9567b;
                        iArr[i4] = i3;
                        i4++;
                    }
                    i3++;
                    z = z4;
                }
                String str5 = formatArr[0].f6931n;
                iM3130r = Util6.m3130r(str5, 2);
                iM3130r2 = Util6.m3130r(str5, 1);
                if (iM3130r2 <= 1 || iM3130r > 1 || iM3130r2 + iM3130r <= 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                r22 = r13;
                list = list5;
                arrayList = arrayList5;
                arrayList2 = arrayList6;
                hlsSampleStreamWrapperM4313k = m4313k(0, uriArr, formatArr, hlsMasterPlaylist.f9559k, hlsMasterPlaylist.f9560l, r13, j2);
                arrayList.add(hlsSampleStreamWrapperM4313k);
                arrayList2.add(iArr);
                r21 = r22;
                r21 = r22;
                if (this.f9430r && z3) {
                    arrayList3 = new ArrayList();
                    if (iM3130r > 0) {
                        formatArr3 = new Format[i2];
                        for (i7 = 0; i7 < i2; i7++) {
                            Format format2 = formatArr[i7];
                            String strM3131s = Util6.m3131s(format2.f6931n, 2);
                            String strM3163e = MimeTypes.m3163e(strM3131s);
                            Format.b bVar2 = new Format.b();
                            bVar2.f6948a = format2.f6923f;
                            bVar2.f6949b = format2.f6924g;
                            bVar2.f6957j = format2.f6933p;
                            bVar2.f6958k = strM3163e;
                            bVar2.f6955h = strM3131s;
                            bVar2.f6956i = format2.f6932o;
                            bVar2.f6953f = format2.f6928k;
                            bVar2.f6954g = format2.f6929l;
                            bVar2.f6963p = format2.f6939v;
                            bVar2.f6964q = format2.f6940w;
                            bVar2.f6965r = format2.f6941x;
                            bVar2.f6951d = format2.f6926i;
                            bVar2.f6952e = format2.f6927j;
                            formatArr3[i7] = bVar2.m3519a();
                        }
                        arrayList3.add(new TrackGroup(formatArr3));
                        if (iM3130r2 > 0 && (hlsMasterPlaylist.f9559k != null || hlsMasterPlaylist.f9556h.isEmpty())) {
                            arrayList3.add(new TrackGroup(m4310l(formatArr[0], hlsMasterPlaylist.f9559k, false)));
                        }
                        list2 = hlsMasterPlaylist.f9560l;
                        if (list2 != null) {
                            for (i8 = 0; i8 < list2.size(); i8++) {
                                arrayList3.add(new TrackGroup(list2.get(i8)));
                            }
                        }
                        i6 = 1;
                    } else {
                        formatArr2 = new Format[i2];
                        for (i5 = 0; i5 < i2; i5++) {
                            formatArr2[i5] = m4310l(formatArr[i5], hlsMasterPlaylist.f9559k, true);
                        }
                        i6 = 1;
                        arrayList3.add(new TrackGroup(formatArr2));
                    }
                    Format[] formatArr4 = new Format[i6];
                    Format.b bVar3 = new Format.b();
                    bVar3.f6948a = "ID3";
                    bVar3.f6958k = "application/id3";
                    formatArr4[0] = bVar3.m3519a();
                    TrackGroup trackGroup = new TrackGroup(formatArr4);
                    arrayList3.add(trackGroup);
                    hlsSampleStreamWrapperM4313k.m4324F((TrackGroup[]) arrayList3.toArray(new TrackGroup[0]), 0, arrayList3.indexOf(trackGroup));
                    r21 = r22;
                }
            }
            i2 = i12;
            z2 = false;
            uriArr = new Uri[i2];
            formatArr = new Format[i2];
            iArr = new int[i2];
            i3 = 0;
            i4 = 0;
            while (i3 < hlsMasterPlaylist.f9554f.size()) {
                if (z) {
                    z4 = z;
                    if (iArr2[i3] == 2) {
                    }
                    i3++;
                    z = z4;
                } else {
                    z4 = z;
                }
                if (z2) {
                    HlsMasterPlaylist.b bVar4 = hlsMasterPlaylist.f9554f.get(i3);
                    uriArr[i4] = bVar4.f9566a;
                    formatArr[i4] = bVar4.f9567b;
                    iArr[i4] = i3;
                    i4++;
                } else {
                    HlsMasterPlaylist.b bVar5 = hlsMasterPlaylist.f9554f.get(i3);
                    uriArr[i4] = bVar5.f9566a;
                    formatArr[i4] = bVar5.f9567b;
                    iArr[i4] = i3;
                    i4++;
                }
                i3++;
                z = z4;
            }
            String str6 = formatArr[0].f6931n;
            iM3130r = Util6.m3130r(str6, 2);
            iM3130r2 = Util6.m3130r(str6, 1);
            if (iM3130r2 <= 1) {
                z3 = false;
            } else {
                z3 = false;
            }
            r22 = r13;
            list = list5;
            arrayList = arrayList5;
            arrayList2 = arrayList6;
            hlsSampleStreamWrapperM4313k = m4313k(0, uriArr, formatArr, hlsMasterPlaylist.f9559k, hlsMasterPlaylist.f9560l, r13, j2);
            arrayList.add(hlsSampleStreamWrapperM4313k);
            arrayList2.add(iArr);
            r21 = r22;
            r21 = r22;
            if (this.f9430r) {
                arrayList3 = new ArrayList();
                if (iM3130r > 0) {
                    formatArr3 = new Format[i2];
                    while (i7 < i2) {
                        Format format3 = formatArr[i7];
                        String strM3131s2 = Util6.m3131s(format3.f6931n, 2);
                        String strM3163e2 = MimeTypes.m3163e(strM3131s2);
                        Format.b bVar6 = new Format.b();
                        bVar6.f6948a = format3.f6923f;
                        bVar6.f6949b = format3.f6924g;
                        bVar6.f6957j = format3.f6933p;
                        bVar6.f6958k = strM3163e2;
                        bVar6.f6955h = strM3131s2;
                        bVar6.f6956i = format3.f6932o;
                        bVar6.f6953f = format3.f6928k;
                        bVar6.f6954g = format3.f6929l;
                        bVar6.f6963p = format3.f6939v;
                        bVar6.f6964q = format3.f6940w;
                        bVar6.f6965r = format3.f6941x;
                        bVar6.f6951d = format3.f6926i;
                        bVar6.f6952e = format3.f6927j;
                        formatArr3[i7] = bVar6.m3519a();
                    }
                    arrayList3.add(new TrackGroup(formatArr3));
                    if (iM3130r2 > 0) {
                        arrayList3.add(new TrackGroup(m4310l(formatArr[0], hlsMasterPlaylist.f9559k, false)));
                    }
                    list2 = hlsMasterPlaylist.f9560l;
                    if (list2 != null) {
                        while (i8 < list2.size()) {
                            arrayList3.add(new TrackGroup(list2.get(i8)));
                        }
                    }
                    i6 = 1;
                } else {
                    formatArr2 = new Format[i2];
                    while (i5 < i2) {
                        formatArr2[i5] = m4310l(formatArr[i5], hlsMasterPlaylist.f9559k, true);
                    }
                    i6 = 1;
                    arrayList3.add(new TrackGroup(formatArr2));
                }
                Format[] formatArr5 = new Format[i6];
                Format.b bVar7 = new Format.b();
                bVar7.f6948a = "ID3";
                bVar7.f6958k = "application/id3";
                formatArr5[0] = bVar7.m3519a();
                TrackGroup trackGroup2 = new TrackGroup(formatArr5);
                arrayList3.add(trackGroup2);
                hlsSampleStreamWrapperM4313k.m4324F((TrackGroup[]) arrayList3.toArray(new TrackGroup[0]), 0, arrayList3.indexOf(trackGroup2));
                r21 = r22;
            }
        } else {
            r21 = r13;
            list = list5;
            arrayList = arrayList5;
            arrayList2 = arrayList6;
        }
        ArrayList arrayList7 = new ArrayList(list4.size());
        ArrayList arrayList8 = new ArrayList(list4.size());
        ArrayList arrayList9 = new ArrayList(list4.size());
        HashSet hashSet2 = new HashSet();
        int i15 = 0;
        while (i15 < list4.size()) {
            String str7 = list4.get(i15).f9565c;
            if (hashSet2.add(str7)) {
                arrayList7.clear();
                arrayList8.clear();
                arrayList9.clear();
                boolean z6 = true;
                for (int i16 = 0; i16 < list4.size(); i16++) {
                    if (Util6.m3113a(str7, list4.get(i16).f9565c)) {
                        HlsMasterPlaylist.a aVar2 = list4.get(i16);
                        arrayList9.add(Integer.valueOf(i16));
                        arrayList7.add(aVar2.f9563a);
                        arrayList8.add(aVar2.f9564b);
                        z6 &= Util6.m3130r(aVar2.f9564b.f6931n, 1) == 1;
                    }
                }
                int i17 = Util6.f6307a;
                hashSet = hashSet2;
                i = i15;
                HlsSampleStreamWrapper hlsSampleStreamWrapperM4313k2 = m4313k(1, (Uri[]) arrayList7.toArray(new Uri[0]), (Format[]) arrayList8.toArray(new Format[0]), null, Collections.emptyList(), r21, j2);
                arrayList2.add(C4799a.m11011r0(arrayList9));
                arrayList.add(hlsSampleStreamWrapperM4313k2);
                if (this.f9430r && z6) {
                    hlsSampleStreamWrapperM4313k2.m4324F(new TrackGroup[]{new TrackGroup((Format[]) arrayList8.toArray(new Format[0]))}, 0, new int[0]);
                }
            } else {
                hashSet = hashSet2;
                i = i15;
            }
            i15 = i + 1;
            hashSet2 = hashSet;
        }
        this.f9438z = arrayList.size();
        for (int i18 = 0; i18 < list.size(); i18++) {
            HlsMasterPlaylist.a aVar3 = list.get(i18);
            HlsSampleStreamWrapper hlsSampleStreamWrapperM4313k3 = m4313k(3, new Uri[]{aVar3.f9563a}, new Format[]{aVar3.f9564b}, null, Collections.emptyList(), r21, j2);
            arrayList2.add(new int[]{i18});
            arrayList.add(hlsSampleStreamWrapperM4313k3);
            hlsSampleStreamWrapperM4313k3.m4324F(new TrackGroup[]{new TrackGroup(aVar3.f9564b)}, 0, new int[0]);
        }
        this.f9436x = (HlsSampleStreamWrapper[]) arrayList.toArray(new HlsSampleStreamWrapper[0]);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr = this.f9436x;
        this.f9434v = hlsSampleStreamWrapperArr.length;
        hlsSampleStreamWrapperArr[0].f9474i.f9370k = true;
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : hlsSampleStreamWrapperArr) {
            if (!hlsSampleStreamWrapper.f9451I) {
                hlsSampleStreamWrapper.mo4069d(hlsSampleStreamWrapper.f9463U);
            }
        }
        this.f9437y = this.f9436x;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x023e  */
    /* JADX WARN: Code duplicated, block: B:114:0x025f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0265  */
    /* JADX WARN: Code duplicated, block: B:118:0x0269  */
    /* JADX WARN: Code duplicated, block: B:151:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:194:0x026c A[SYNTHETIC] */
    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: r */
    public long mo4078r(ExoTrackSelection2[] exoTrackSelection2Arr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j2) {
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr;
        int i;
        ExoTrackSelection2[] exoTrackSelection2Arr2;
        HlsSampleStreamWrapper hlsSampleStreamWrapper;
        int[] iArr;
        int i2;
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr2;
        int i3;
        int i4;
        SampleStream[] sampleStreamArr2;
        SampleStream[] sampleStreamArr3;
        boolean z;
        boolean z2;
        int i5;
        boolean z3;
        SampleStream[] sampleStreamArr4;
        HlsMediaPeriod hlsMediaPeriod = this;
        SampleStream[] sampleStreamArr5 = sampleStreamArr;
        int[] iArr2 = new int[exoTrackSelection2Arr.length];
        int[] iArr3 = new int[exoTrackSelection2Arr.length];
        for (int i6 = 0; i6 < exoTrackSelection2Arr.length; i6++) {
            iArr2[i6] = sampleStreamArr5[i6] == null ? -1 : hlsMediaPeriod.f9427o.get(sampleStreamArr5[i6]).intValue();
            iArr3[i6] = -1;
            if (exoTrackSelection2Arr[i6] != null) {
                TrackGroup trackGroupMo4512a = exoTrackSelection2Arr[i6].mo4512a();
                int i7 = 0;
                while (true) {
                    HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr3 = hlsMediaPeriod.f9436x;
                    if (i7 >= hlsSampleStreamWrapperArr3.length) {
                        break;
                    }
                    HlsSampleStreamWrapper hlsSampleStreamWrapper2 = hlsSampleStreamWrapperArr3[i7];
                    hlsSampleStreamWrapper2.m4328v();
                    if (hlsSampleStreamWrapper2.f9456N.m4193a(trackGroupMo4512a) != -1) {
                        iArr3[i6] = i7;
                        break;
                    }
                    i7++;
                }
            }
        }
        hlsMediaPeriod.f9427o.clear();
        int length = exoTrackSelection2Arr.length;
        SampleStream[] sampleStreamArr6 = new SampleStream[length];
        int length2 = exoTrackSelection2Arr.length;
        SampleStream[] sampleStreamArr7 = new SampleStream[length2];
        int length3 = exoTrackSelection2Arr.length;
        ExoTrackSelection2[] exoTrackSelection2Arr3 = new ExoTrackSelection2[length3];
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr4 = new HlsSampleStreamWrapper[hlsMediaPeriod.f9436x.length];
        int i8 = length;
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        while (i9 < hlsMediaPeriod.f9436x.length) {
            int i11 = 0;
            while (true) {
                hlsSampleStreamWrapperArr = hlsSampleStreamWrapperArr4;
                if (i11 >= exoTrackSelection2Arr.length) {
                    break;
                }
                sampleStreamArr7[i11] = iArr2[i11] == i9 ? sampleStreamArr5[i11] : null;
                exoTrackSelection2Arr3[i11] = iArr3[i11] == i9 ? exoTrackSelection2Arr[i11] : null;
                i11++;
                hlsSampleStreamWrapperArr4 = hlsSampleStreamWrapperArr;
            }
            HlsSampleStreamWrapper hlsSampleStreamWrapper3 = hlsMediaPeriod.f9436x[i9];
            hlsSampleStreamWrapper3.m4328v();
            int i12 = hlsSampleStreamWrapper3.f9452J;
            int i13 = 0;
            while (i13 < length3) {
                int i14 = length2;
                HlsSampleStream hlsSampleStream = (HlsSampleStream) sampleStreamArr7[i13];
                if (hlsSampleStream != null && (exoTrackSelection2Arr3[i13] == null || !zArr[i13])) {
                    hlsSampleStreamWrapper3.f9452J--;
                    if (hlsSampleStream.f9441h != -1) {
                        HlsSampleStreamWrapper hlsSampleStreamWrapper4 = hlsSampleStream.f9440g;
                        int i15 = hlsSampleStream.f9439f;
                        hlsSampleStreamWrapper4.m4328v();
                        Objects.requireNonNull(hlsSampleStreamWrapper4.f9458P);
                        int i16 = hlsSampleStreamWrapper4.f9458P[i15];
                        C2096e.m4570f(hlsSampleStreamWrapper4.f9461S[i16]);
                        hlsSampleStreamWrapper4.f9461S[i16] = false;
                        hlsSampleStream.f9441h = -1;
                    }
                    sampleStreamArr7[i13] = null;
                }
                i13++;
                i9 = i9;
                length2 = i14;
                sampleStreamArr6 = sampleStreamArr6;
            }
            int i17 = length2;
            int i18 = i9;
            SampleStream[] sampleStreamArr8 = sampleStreamArr6;
            boolean z5 = z4 || (!hlsSampleStreamWrapper3.f9466X ? j2 == hlsSampleStreamWrapper3.f9463U : i12 != 0);
            ExoTrackSelection2 exoTrackSelection2 = hlsSampleStreamWrapper3.f9474i.f9375p;
            boolean z6 = z5;
            ExoTrackSelection2 exoTrackSelection3 = exoTrackSelection2;
            for (int i19 = 0; i19 < length3; i19++) {
                ExoTrackSelection2 exoTrackSelection4 = exoTrackSelection2Arr3[i19];
                if (exoTrackSelection4 != null) {
                    int iM4193a = hlsSampleStreamWrapper3.f9456N.m4193a(exoTrackSelection4.mo4512a());
                    if (iM4193a == hlsSampleStreamWrapper3.f9459Q) {
                        hlsSampleStreamWrapper3.f9474i.f9375p = exoTrackSelection4;
                        exoTrackSelection3 = exoTrackSelection4;
                    }
                    if (sampleStreamArr7[i19] == null) {
                        hlsSampleStreamWrapper3.f9452J++;
                        sampleStreamArr7[i19] = new HlsSampleStream(hlsSampleStreamWrapper3, iM4193a);
                        zArr2[i19] = true;
                        if (hlsSampleStreamWrapper3.f9458P != null) {
                            ((HlsSampleStream) sampleStreamArr7[i19]).m4315b();
                            if (!z6) {
                                HlsSampleStreamWrapper.d dVar = hlsSampleStreamWrapper3.f9443A[hlsSampleStreamWrapper3.f9458P[iM4193a]];
                                z6 = (dVar.m4153F(j2, true) || dVar.m4165p() == 0) ? false : true;
                            }
                        }
                    }
                }
            }
            if (hlsSampleStreamWrapper3.f9452J == 0) {
                hlsSampleStreamWrapper3.f9474i.f9372m = null;
                hlsSampleStreamWrapper3.f9454L = null;
                hlsSampleStreamWrapper3.f9465W = true;
                hlsSampleStreamWrapper3.f9484s.clear();
                if (hlsSampleStreamWrapper3.f9480o.m2899e()) {
                    if (hlsSampleStreamWrapper3.f9450H) {
                        for (HlsSampleStreamWrapper.d dVar2 : hlsSampleStreamWrapper3.f9443A) {
                            dVar2.m4158i();
                        }
                    }
                    hlsSampleStreamWrapper3.f9480o.m2897b();
                } else {
                    hlsSampleStreamWrapper3.m4325G();
                }
                i = length3;
                exoTrackSelection2Arr2 = exoTrackSelection2Arr3;
                hlsSampleStreamWrapper = hlsSampleStreamWrapper3;
                iArr = iArr2;
                i2 = i8;
                hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr;
                i3 = i18;
                i4 = i17;
                sampleStreamArr2 = sampleStreamArr8;
                sampleStreamArr3 = sampleStreamArr7;
            } else {
                if (hlsSampleStreamWrapper3.f9484s.isEmpty() || Util6.m3113a(exoTrackSelection3, exoTrackSelection2)) {
                    i = length3;
                    exoTrackSelection2Arr2 = exoTrackSelection2Arr3;
                    hlsSampleStreamWrapper = hlsSampleStreamWrapper3;
                    iArr = iArr2;
                    i2 = i8;
                    hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr;
                    i3 = i18;
                    i4 = i17;
                    sampleStreamArr2 = sampleStreamArr8;
                    sampleStreamArr3 = sampleStreamArr7;
                } else {
                    if (hlsSampleStreamWrapper3.f9466X) {
                        i = length3;
                        exoTrackSelection2Arr2 = exoTrackSelection2Arr3;
                        hlsSampleStreamWrapper = hlsSampleStreamWrapper3;
                        iArr = iArr2;
                        i2 = i8;
                        hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr;
                        i3 = i18;
                        i4 = i17;
                        sampleStreamArr2 = sampleStreamArr8;
                        sampleStreamArr3 = sampleStreamArr7;
                    } else {
                        long j3 = j2 < 0 ? -j2 : 0L;
                        HlsMediaChunk hlsMediaChunkM4320A = hlsSampleStreamWrapper3.m4320A();
                        i = length3;
                        exoTrackSelection2Arr2 = exoTrackSelection2Arr3;
                        hlsSampleStreamWrapperArr2 = hlsSampleStreamWrapperArr;
                        iArr = iArr2;
                        i4 = i17;
                        sampleStreamArr3 = sampleStreamArr7;
                        i2 = i8;
                        i3 = i18;
                        sampleStreamArr2 = sampleStreamArr8;
                        hlsSampleStreamWrapper = hlsSampleStreamWrapper3;
                        exoTrackSelection3.mo4303l(j2, j3, -9223372036854775807L, hlsSampleStreamWrapper3.f9485t, hlsSampleStreamWrapper3.f9474i.m4298a(hlsMediaChunkM4320A, j2));
                        if (exoTrackSelection3.mo4519m() == hlsSampleStreamWrapper.f9474i.f9367h.m4192a(hlsMediaChunkM4320A.f9112d)) {
                            z3 = false;
                        }
                        if (z3) {
                            hlsSampleStreamWrapper.f9465W = true;
                            z = true;
                            z2 = true;
                        }
                        if (z2) {
                            hlsSampleStreamWrapper.m4326H(j2, z);
                            for (i5 = 0; i5 < i4; i5++) {
                                if (sampleStreamArr3[i5] != null) {
                                    zArr2[i5] = true;
                                }
                            }
                        }
                        z6 = z2;
                    }
                    z3 = true;
                    if (z3) {
                        hlsSampleStreamWrapper.f9465W = true;
                        z = true;
                        z2 = true;
                    }
                    if (z2) {
                        hlsSampleStreamWrapper.m4326H(j2, z);
                        while (i5 < i4) {
                            if (sampleStreamArr3[i5] != null) {
                                zArr2[i5] = true;
                            }
                        }
                    }
                    z6 = z2;
                }
                z = z4;
                z2 = z6;
                if (z2) {
                    hlsSampleStreamWrapper.m4326H(j2, z);
                    while (i5 < i4) {
                        if (sampleStreamArr3[i5] != null) {
                            zArr2[i5] = true;
                        }
                    }
                }
                z6 = z2;
            }
            hlsSampleStreamWrapper.f9489x.clear();
            for (int i20 = 0; i20 < i4; i20++) {
                SampleStream sampleStream = sampleStreamArr3[i20];
                if (sampleStream != null) {
                    hlsSampleStreamWrapper.f9489x.add((HlsSampleStream) sampleStream);
                }
            }
            hlsSampleStreamWrapper.f9466X = true;
            boolean z7 = false;
            int i21 = 0;
            while (i21 < exoTrackSelection2Arr.length) {
                SampleStream sampleStream2 = sampleStreamArr3[i21];
                int i22 = i3;
                if (iArr3[i21] == i22) {
                    Objects.requireNonNull(sampleStream2);
                    sampleStreamArr4 = sampleStreamArr2;
                    sampleStreamArr4[i21] = sampleStream2;
                    this.f9427o.put(sampleStream2, Integer.valueOf(i22));
                    z7 = true;
                } else {
                    sampleStreamArr4 = sampleStreamArr2;
                    if (iArr[i21] == i22) {
                        C2096e.m4570f(sampleStream2 == null);
                    }
                }
                i21++;
                sampleStreamArr2 = sampleStreamArr4;
                i3 = i22;
            }
            SampleStream[] sampleStreamArr9 = sampleStreamArr2;
            int i23 = i3;
            if (z7) {
                int i24 = i10;
                hlsSampleStreamWrapperArr2[i24] = hlsSampleStreamWrapper;
                i10 = i24 + 1;
                if (i24 == 0) {
                    hlsSampleStreamWrapper.f9474i.f9370k = true;
                    if (z6) {
                        this.f9428p.f9511a.clear();
                        z4 = true;
                    } else {
                        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr5 = this.f9437y;
                        if (hlsSampleStreamWrapperArr5.length != 0) {
                            if (hlsSampleStreamWrapper != hlsSampleStreamWrapperArr5[0]) {
                            }
                        }
                        this.f9428p.f9511a.clear();
                        z4 = true;
                    }
                } else {
                    hlsSampleStreamWrapper.f9474i.f9370k = i23 < this.f9438z;
                }
            }
            i9 = i23 + 1;
            hlsMediaPeriod = this;
            sampleStreamArr6 = sampleStreamArr9;
            sampleStreamArr7 = sampleStreamArr3;
            length3 = i;
            exoTrackSelection2Arr3 = exoTrackSelection2Arr2;
            hlsSampleStreamWrapperArr4 = hlsSampleStreamWrapperArr2;
            iArr2 = iArr;
            i8 = i2;
            length2 = i4;
            sampleStreamArr5 = sampleStreamArr;
        }
        HlsMediaPeriod hlsMediaPeriod2 = hlsMediaPeriod;
        System.arraycopy(sampleStreamArr6, 0, sampleStreamArr5, 0, i8);
        HlsSampleStreamWrapper[] hlsSampleStreamWrapperArr6 = (HlsSampleStreamWrapper[]) Util6.m3100I(hlsSampleStreamWrapperArr4, i10);
        hlsMediaPeriod2.f9437y = hlsSampleStreamWrapperArr6;
        Objects.requireNonNull((DefaultCompositeSequenceableLoaderFactory) hlsMediaPeriod2.f9429q);
        hlsMediaPeriod2.f9417A = new CompositeSequenceableLoader(hlsSampleStreamWrapperArr6);
        return j2;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: s */
    public TrackGroupArray mo4079s() {
        TrackGroupArray trackGroupArray = this.f9435w;
        Objects.requireNonNull(trackGroupArray);
        return trackGroupArray;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaPeriod
    /* JADX INFO: renamed from: u */
    public void mo4080u(long j2, boolean z) {
        for (HlsSampleStreamWrapper hlsSampleStreamWrapper : this.f9437y) {
            if (hlsSampleStreamWrapper.f9450H && !hlsSampleStreamWrapper.m4321C()) {
                int length = hlsSampleStreamWrapper.f9443A.length;
                for (int i = 0; i < length; i++) {
                    hlsSampleStreamWrapper.f9443A[i].m4157h(j2, z, hlsSampleStreamWrapper.f9461S[i]);
                }
            }
        }
    }
}
