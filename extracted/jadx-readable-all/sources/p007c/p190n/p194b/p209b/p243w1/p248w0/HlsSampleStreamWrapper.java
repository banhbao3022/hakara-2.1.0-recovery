package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataReader;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.HttpDataSource;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionEventListener2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p221s1.DummyTrackOutput;
import p007c.p190n.p194b.p209b.p221s1.ExtractorOutput;
import p007c.p190n.p194b.p209b.p221s1.SeekMap;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput;
import p007c.p190n.p194b.p209b.p221s1.TrackOutput2;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessage;
import p007c.p190n.p194b.p209b.p234u1.p236j.EventMessageDecoder;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder;
import p007c.p190n.p194b.p209b.p234u1.p239m.PrivFrame;
import p007c.p190n.p194b.p209b.p243w1.BehindLiveWindowException;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.SampleQueue;
import p007c.p190n.p194b.p209b.p243w1.SequenceableLoader;
import p007c.p190n.p194b.p209b.p243w1.TrackGroup;
import p007c.p190n.p194b.p209b.p243w1.TrackGroupArray;
import p007c.p190n.p194b.p209b.p243w1.p245u0.Chunk;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunkIterator;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.DefaultHlsPlaylistTracker;
import p007c.p190n.p194b.p209b.p243w1.p248w0.p249w.HlsMediaPlaylist;
import p007c.p190n.p194b.p209b.p262y1.ExoTrackSelection2;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.r, reason: use source file name */
/* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsSampleStreamWrapper implements Loader.b<Chunk>, Loader.f, SequenceableLoader, ExtractorOutput, SampleQueue.b {

    /* JADX INFO: renamed from: f */
    public static final Set<Integer> f9442f = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: A */
    public d[] f9443A;

    /* JADX INFO: renamed from: C */
    public Set<Integer> f9445C;

    /* JADX INFO: renamed from: D */
    public SparseIntArray f9446D;

    /* JADX INFO: renamed from: E */
    public TrackOutput2 f9447E;

    /* JADX INFO: renamed from: F */
    public int f9448F;

    /* JADX INFO: renamed from: G */
    public int f9449G;

    /* JADX INFO: renamed from: H */
    public boolean f9450H;

    /* JADX INFO: renamed from: I */
    public boolean f9451I;

    /* JADX INFO: renamed from: J */
    public int f9452J;

    /* JADX INFO: renamed from: K */
    public Format f9453K;

    /* JADX INFO: renamed from: L */
    public Format f9454L;

    /* JADX INFO: renamed from: M */
    public boolean f9455M;

    /* JADX INFO: renamed from: N */
    public TrackGroupArray f9456N;

    /* JADX INFO: renamed from: O */
    public Set<TrackGroup> f9457O;

    /* JADX INFO: renamed from: P */
    public int[] f9458P;

    /* JADX INFO: renamed from: Q */
    public int f9459Q;

    /* JADX INFO: renamed from: R */
    public boolean f9460R;

    /* JADX INFO: renamed from: S */
    public boolean[] f9461S;

    /* JADX INFO: renamed from: T */
    public boolean[] f9462T;

    /* JADX INFO: renamed from: U */
    public long f9463U;

    /* JADX INFO: renamed from: V */
    public long f9464V;

    /* JADX INFO: renamed from: W */
    public boolean f9465W;

    /* JADX INFO: renamed from: X */
    public boolean f9466X;

    /* JADX INFO: renamed from: Y */
    public boolean f9467Y;

    /* JADX INFO: renamed from: Z */
    public boolean f9468Z;

    /* JADX INFO: renamed from: a0 */
    public long f9469a0;

    /* JADX INFO: renamed from: b0 */
    public DrmInitData f9470b0;

    /* JADX INFO: renamed from: c0 */
    public HlsMediaChunk f9471c0;

    /* JADX INFO: renamed from: g */
    public final int f9472g;

    /* JADX INFO: renamed from: h */
    public final b f9473h;

    /* JADX INFO: renamed from: i */
    public final HlsChunkSource f9474i;

    /* JADX INFO: renamed from: j */
    public final Allocator f9475j;

    /* JADX INFO: renamed from: k */
    public final Format f9476k;

    /* JADX INFO: renamed from: l */
    public final DrmSessionManager2 f9477l;

    /* JADX INFO: renamed from: m */
    public final DrmSessionEventListener2.a f9478m;

    /* JADX INFO: renamed from: n */
    public final LoadErrorHandlingPolicy f9479n;

    /* JADX INFO: renamed from: p */
    public final MediaSourceEventListener.a f9481p;

    /* JADX INFO: renamed from: q */
    public final int f9482q;

    /* JADX INFO: renamed from: s */
    public final ArrayList<HlsMediaChunk> f9484s;

    /* JADX INFO: renamed from: t */
    public final List<HlsMediaChunk> f9485t;

    /* JADX INFO: renamed from: u */
    public final Runnable f9486u;

    /* JADX INFO: renamed from: v */
    public final Runnable f9487v;

    /* JADX INFO: renamed from: w */
    public final Handler f9488w;

    /* JADX INFO: renamed from: x */
    public final ArrayList<HlsSampleStream> f9489x;

    /* JADX INFO: renamed from: y */
    public final Map<String, DrmInitData> f9490y;

    /* JADX INFO: renamed from: z */
    public Chunk f9491z;

    /* JADX INFO: renamed from: o */
    public final Loader f9480o = new Loader("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: r */
    public final HlsChunkSource.b f9483r = new HlsChunkSource.b();

    /* JADX INFO: renamed from: B */
    public int[] f9444B = new int[0];

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.r$b */
    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public interface b extends SequenceableLoader.a<HlsSampleStreamWrapper> {
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.r$c */
    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static class c implements TrackOutput2 {

        /* JADX INFO: renamed from: a */
        public static final Format f9492a;

        /* JADX INFO: renamed from: b */
        public static final Format f9493b;

        /* JADX INFO: renamed from: c */
        public final EventMessageDecoder f9494c = new EventMessageDecoder();

        /* JADX INFO: renamed from: d */
        public final TrackOutput2 f9495d;

        /* JADX INFO: renamed from: e */
        public final Format f9496e;

        /* JADX INFO: renamed from: f */
        public Format f9497f;

        /* JADX INFO: renamed from: g */
        public byte[] f9498g;

        /* JADX INFO: renamed from: h */
        public int f9499h;

        static {
            Format.b bVar = new Format.b();
            bVar.f6958k = "application/id3";
            f9492a = bVar.m3519a();
            Format.b bVar2 = new Format.b();
            bVar2.f6958k = "application/x-emsg";
            f9493b = bVar2.m3519a();
        }

        public c(TrackOutput2 trackOutput2, int i) {
            this.f9495d = trackOutput2;
            if (i == 1) {
                this.f9496e = f9492a;
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(outline.m1590l("Unknown metadataType: ", i));
                }
                this.f9496e = f9493b;
            }
            this.f9498g = new byte[0];
            this.f9499h = 0;
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: a */
        public int mo3756a(DataReader dataReader, int i, boolean z, int i2) throws IOException {
            int i3 = this.f9499h + i;
            byte[] bArr = this.f9498g;
            if (bArr.length < i3) {
                this.f9498g = Arrays.copyOf(bArr, (i3 / 2) + i3);
            }
            int i4 = dataReader.read(this.f9498g, this.f9499h, i);
            if (i4 != -1) {
                this.f9499h += i4;
                return i4;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: b */
        public /* synthetic */ int mo3757b(DataReader dataReader, int i, boolean z) {
            return TrackOutput.m3926a(this, dataReader, i, z);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: c */
        public /* synthetic */ void mo3758c(ParsableByteArray parsableByteArray, int i) {
            TrackOutput.m3927b(this, parsableByteArray, i);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: d */
        public void mo3759d(long j2, int i, int i2, int i3, TrackOutput2.a aVar) {
            Objects.requireNonNull(this.f9497f);
            int i4 = this.f9499h - i3;
            ParsableByteArray parsableByteArray = new ParsableByteArray(Arrays.copyOfRange(this.f9498g, i4 - i2, i4));
            byte[] bArr = this.f9498g;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.f9499h = i3;
            if (!Util6.m3113a(this.f9497f.f6934q, this.f9496e.f6934q)) {
                if (!"application/x-emsg".equals(this.f9497f.f6934q)) {
                    outline.m1571V(outline.m1556G("Ignoring sample for unsupported format: "), this.f9497f.f6934q, "EmsgUnwrappingTrackOutput");
                    return;
                }
                EventMessage eventMessageM4019c = this.f9494c.m4019c(parsableByteArray);
                Format formatMo4011q = eventMessageM4019c.mo4011q();
                if (!(formatMo4011q != null && Util6.m3113a(this.f9496e.f6934q, formatMo4011q.f6934q))) {
                    Log.w("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f9496e.f6934q, eventMessageM4019c.mo4011q()));
                    return;
                } else {
                    byte[] bArr2 = eventMessageM4019c.mo4011q() != null ? eventMessageM4019c.f8684l : null;
                    Objects.requireNonNull(bArr2);
                    parsableByteArray = new ParsableByteArray(bArr2);
                }
            }
            int iM3196a = parsableByteArray.m3196a();
            this.f9495d.mo3758c(parsableByteArray, iM3196a);
            this.f9495d.mo3759d(j2, i, iM3196a, i3, aVar);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: e */
        public void mo3760e(Format format) {
            this.f9497f = format;
            this.f9495d.mo3760e(this.f9496e);
        }

        @Override // p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: f */
        public void mo3761f(ParsableByteArray parsableByteArray, int i, int i2) {
            int i3 = this.f9499h + i;
            byte[] bArr = this.f9498g;
            if (bArr.length < i3) {
                this.f9498g = Arrays.copyOf(bArr, (i3 / 2) + i3);
            }
            parsableByteArray.m3200e(this.f9498g, this.f9499h, i);
            this.f9499h += i;
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.r$d */
    /* JADX INFO: compiled from: HlsSampleStreamWrapper.java */
    public static final class d extends SampleQueue {

        /* JADX INFO: renamed from: J */
        public final Map<String, DrmInitData> f9500J;

        /* JADX INFO: renamed from: K */
        public DrmInitData f9501K;

        public d(Allocator allocator, Looper looper, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar, Map map, a aVar2) {
            super(allocator, looper, drmSessionManager2, aVar);
            this.f9500J = map;
        }

        @Override // p007c.p190n.p194b.p209b.p243w1.SampleQueue, p007c.p190n.p194b.p209b.p221s1.TrackOutput2
        /* JADX INFO: renamed from: d */
        public void mo3759d(long j2, int i, int i2, int i3, TrackOutput2.a aVar) {
            super.mo3759d(j2, i, i2, i3, aVar);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001b  */
        @Override // p007c.p190n.p194b.p209b.p243w1.SampleQueue
        /* JADX INFO: renamed from: m */
        public Format mo4162m(Format format) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.f9501K;
            if (drmInitData2 == null) {
                drmInitData2 = format.f6937t;
            }
            if (drmInitData2 != null && (drmInitData = this.f9500J.get(drmInitData2.f7430h)) != null) {
                drmInitData2 = drmInitData;
            }
            Metadata metadata = format.f6932o;
            if (metadata == null) {
                metadata = null;
            } else {
                int length = metadata.f8661f.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    Metadata.b bVar = metadata.f8661f[i2];
                    if ((bVar instanceof PrivFrame) && "com.apple.streaming.transportStreamTimestamp".equals(((PrivFrame) bVar).f8748g)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (length == 1) {
                        metadata = null;
                    } else {
                        Metadata.b[] bVarArr = new Metadata.b[length - 1];
                        while (i < length) {
                            if (i != i2) {
                                bVarArr[i < i2 ? i : i - 1] = metadata.f8661f[i];
                            }
                            i++;
                        }
                        metadata = new Metadata(bVarArr);
                    }
                }
            }
            if (drmInitData2 != format.f6937t || metadata != format.f6932o) {
                Format.b bVarM3515a = format.m3515a();
                bVarM3515a.f6961n = drmInitData2;
                bVarM3515a.f6956i = metadata;
                format = bVarM3515a.m3519a();
            }
            return super.mo4162m(format);
        }
    }

    public HlsSampleStreamWrapper(int i, b bVar, HlsChunkSource hlsChunkSource, Map<String, DrmInitData> map, Allocator allocator, long j2, Format format, DrmSessionManager2 drmSessionManager2, DrmSessionEventListener2.a aVar, LoadErrorHandlingPolicy loadErrorHandlingPolicy, MediaSourceEventListener.a aVar2, int i2) {
        this.f9472g = i;
        this.f9473h = bVar;
        this.f9474i = hlsChunkSource;
        this.f9490y = map;
        this.f9475j = allocator;
        this.f9476k = format;
        this.f9477l = drmSessionManager2;
        this.f9478m = aVar;
        this.f9479n = loadErrorHandlingPolicy;
        this.f9481p = aVar2;
        this.f9482q = i2;
        Set<Integer> set = f9442f;
        this.f9445C = new HashSet(set.size());
        this.f9446D = new SparseIntArray(set.size());
        this.f9443A = new d[0];
        this.f9462T = new boolean[0];
        this.f9461S = new boolean[0];
        ArrayList<HlsMediaChunk> arrayList = new ArrayList<>();
        this.f9484s = arrayList;
        this.f9485t = Collections.unmodifiableList(arrayList);
        this.f9489x = new ArrayList<>();
        this.f9486u = new Runnable() { // from class: c.n.b.b.w1.w0.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9344f.m4322D();
            }
        };
        this.f9487v = new Runnable() { // from class: c.n.b.b.w1.w0.b
            @Override // java.lang.Runnable
            public final void run() {
                HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f9343f;
                hlsSampleStreamWrapper.f9450H = true;
                hlsSampleStreamWrapper.m4322D();
            }
        };
        this.f9488w = Util6.m3124l();
        this.f9463U = j2;
        this.f9464V = j2;
    }

    /* JADX INFO: renamed from: B */
    public static int m4317B(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: w */
    public static DummyTrackOutput m4318w(int i, int i2) {
        Log.w("HlsSampleStreamWrapper", "Unmapped track with id " + i + " of type " + i2);
        return new DummyTrackOutput();
    }

    /* JADX INFO: renamed from: y */
    public static Format m4319y(Format format, Format format2, boolean z) {
        String strM3161c;
        String strM3163e;
        if (format == null) {
            return format2;
        }
        int iM3167i = MimeTypes.m3167i(format2.f6934q);
        if (Util6.m3130r(format.f6931n, iM3167i) == 1) {
            strM3161c = Util6.m3131s(format.f6931n, iM3167i);
            strM3163e = MimeTypes.m3163e(strM3161c);
        } else {
            strM3161c = MimeTypes.m3161c(format.f6931n, format2.f6934q);
            strM3163e = format2.f6934q;
        }
        Format.b bVarM3515a = format2.m3515a();
        bVarM3515a.f6948a = format.f6923f;
        bVarM3515a.f6949b = format.f6924g;
        bVarM3515a.f6950c = format.f6925h;
        bVarM3515a.f6951d = format.f6926i;
        bVarM3515a.f6952e = format.f6927j;
        bVarM3515a.f6953f = z ? format.f6928k : -1;
        bVarM3515a.f6954g = z ? format.f6929l : -1;
        bVarM3515a.f6955h = strM3161c;
        bVarM3515a.f6963p = format.f6939v;
        bVarM3515a.f6964q = format.f6940w;
        if (strM3163e != null) {
            bVarM3515a.f6958k = strM3163e;
        }
        int i = format.f6915D;
        if (i != -1) {
            bVarM3515a.f6971x = i;
        }
        Metadata metadataM4009b = format.f6932o;
        if (metadataM4009b != null) {
            Metadata metadata = format2.f6932o;
            if (metadata != null) {
                metadataM4009b = metadata.m4009b(metadataM4009b);
            }
            bVarM3515a.f6956i = metadataM4009b;
        }
        return bVarM3515a.m3519a();
    }

    /* JADX INFO: renamed from: A */
    public final HlsMediaChunk m4320A() {
        ArrayList<HlsMediaChunk> arrayList = this.f9484s;
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m4321C() {
        return this.f9464V != -9223372036854775807L;
    }

    /* JADX INFO: renamed from: D */
    public final void m4322D() {
        if (!this.f9455M && this.f9458P == null && this.f9450H) {
            for (d dVar : this.f9443A) {
                if (dVar.m4168s() == null) {
                    return;
                }
            }
            TrackGroupArray trackGroupArray = this.f9456N;
            if (trackGroupArray != null) {
                int i = trackGroupArray.f9068g;
                int[] iArr = new int[i];
                this.f9458P = iArr;
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = 0;
                    while (true) {
                        d[] dVarArr = this.f9443A;
                        if (i3 >= dVarArr.length) {
                            break;
                        }
                        Format formatM4168s = dVarArr[i3].m4168s();
                        C2096e.m4572h(formatM4168s);
                        Format format = this.f9456N.f9069h[i2].f9065g[0];
                        String str = formatM4168s.f6934q;
                        String str2 = format.f6934q;
                        int iM3167i = MimeTypes.m3167i(str);
                        if (iM3167i == 3 ? Util6.m3113a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || formatM4168s.f6920I == format.f6920I) : iM3167i == MimeTypes.m3167i(str2)) {
                            this.f9458P[i2] = i3;
                            break;
                        }
                        i3++;
                    }
                }
                Iterator<HlsSampleStream> it = this.f9489x.iterator();
                while (it.hasNext()) {
                    it.next().m4315b();
                }
                return;
            }
            int length = this.f9443A.length;
            int i4 = 0;
            int i5 = 7;
            int i6 = -1;
            while (true) {
                int i7 = 2;
                if (i4 >= length) {
                    break;
                }
                Format formatM4168s2 = this.f9443A[i4].m4168s();
                C2096e.m4572h(formatM4168s2);
                String str3 = formatM4168s2.f6934q;
                if (!MimeTypes.m3171m(str3)) {
                    i7 = MimeTypes.m3169k(str3) ? 1 : MimeTypes.m3170l(str3) ? 3 : 7;
                }
                if (m4317B(i7) > m4317B(i5)) {
                    i6 = i4;
                    i5 = i7;
                } else if (i7 == i5 && i6 != -1) {
                    i6 = -1;
                }
                i4++;
            }
            TrackGroup trackGroup = this.f9474i.f9367h;
            int i8 = trackGroup.f9064f;
            this.f9459Q = -1;
            this.f9458P = new int[length];
            for (int i9 = 0; i9 < length; i9++) {
                this.f9458P[i9] = i9;
            }
            TrackGroup[] trackGroupArr = new TrackGroup[length];
            for (int i10 = 0; i10 < length; i10++) {
                Format formatM4168s3 = this.f9443A[i10].m4168s();
                C2096e.m4572h(formatM4168s3);
                if (i10 == i6) {
                    Format[] formatArr = new Format[i8];
                    if (i8 == 1) {
                        formatArr[0] = formatM4168s3.m3518e(trackGroup.f9065g[0]);
                    } else {
                        for (int i11 = 0; i11 < i8; i11++) {
                            formatArr[i11] = m4319y(trackGroup.f9065g[i11], formatM4168s3, true);
                        }
                    }
                    trackGroupArr[i10] = new TrackGroup(formatArr);
                    this.f9459Q = i10;
                } else {
                    trackGroupArr[i10] = new TrackGroup(m4319y((i5 == 2 && MimeTypes.m3169k(formatM4168s3.f6934q)) ? this.f9476k : null, formatM4168s3, false));
                }
            }
            this.f9456N = m4329x(trackGroupArr);
            C2096e.m4570f(this.f9457O == null);
            this.f9457O = Collections.emptySet();
            this.f9451I = true;
            ((HlsMediaPeriod) this.f9473h).m4314o();
        }
    }

    /* JADX INFO: renamed from: E */
    public void m4323E() throws IOException {
        this.f9480o.m2900f(Integer.MIN_VALUE);
        HlsChunkSource hlsChunkSource = this.f9474i;
        IOException iOException = hlsChunkSource.f9372m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = hlsChunkSource.f9373n;
        if (uri == null || !hlsChunkSource.f9377r) {
            return;
        }
        ((DefaultHlsPlaylistTracker) hlsChunkSource.f9366g).m4339f(uri);
    }

    /* JADX INFO: renamed from: F */
    public void m4324F(TrackGroup[] trackGroupArr, int i, int... iArr) {
        this.f9456N = m4329x(trackGroupArr);
        this.f9457O = new HashSet();
        for (int i2 : iArr) {
            this.f9457O.add(this.f9456N.f9069h[i2]);
        }
        this.f9459Q = i;
        Handler handler = this.f9488w;
        final b bVar = this.f9473h;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: c.n.b.b.w1.w0.d
            @Override // java.lang.Runnable
            public final void run() {
                ((HlsMediaPeriod) bVar).m4314o();
            }
        });
        this.f9451I = true;
    }

    /* JADX INFO: renamed from: G */
    public final void m4325G() {
        for (d dVar : this.f9443A) {
            dVar.m4151D(this.f9465W);
        }
        this.f9465W = false;
    }

    /* JADX INFO: renamed from: H */
    public boolean m4326H(long j2, boolean z) {
        boolean z2;
        this.f9463U = j2;
        if (m4321C()) {
            this.f9464V = j2;
            return true;
        }
        if (this.f9450H && !z) {
            int length = this.f9443A.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z2 = true;
                    break;
                }
                if (!this.f9443A[i].m4153F(j2, false) && (this.f9462T[i] || !this.f9460R)) {
                    z2 = false;
                    break;
                }
                i++;
            }
            if (z2) {
                return false;
            }
        }
        this.f9464V = j2;
        this.f9467Y = false;
        this.f9484s.clear();
        if (this.f9480o.m2899e()) {
            if (this.f9450H) {
                for (d dVar : this.f9443A) {
                    dVar.m4158i();
                }
            }
            this.f9480o.m2897b();
        } else {
            this.f9480o.f5962f = null;
            m4325G();
        }
        return true;
    }

    /* JADX INFO: renamed from: I */
    public void m4327I(long j2) {
        if (this.f9469a0 != j2) {
            this.f9469a0 = j2;
            for (d dVar : this.f9443A) {
                if (dVar.f8993H != j2) {
                    dVar.f8993H = j2;
                    dVar.f8986A = true;
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: a */
    public void mo3772a(SeekMap seekMap) {
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: b */
    public long mo4068b() {
        if (m4321C()) {
            return this.f9464V;
        }
        if (this.f9467Y) {
            return Long.MIN_VALUE;
        }
        return m4320A().f9116h;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SampleQueue.b
    /* JADX INFO: renamed from: c */
    public void mo4121c(Format format) {
        this.f9488w.post(this.f9486u);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0270 A[PHI: r1
  0x0270: PHI (r1v34 c.n.b.b.w1.w0.j$e) = (r1v33 c.n.b.b.w1.w0.j$e), (r1v46 c.n.b.b.w1.w0.j$e) binds: [B:91:0x022d, B:99:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x027c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0288  */
    /* JADX WARN: Code duplicated, block: B:111:0x0293  */
    /* JADX WARN: Code duplicated, block: B:113:0x0297  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:123:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:124:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:131:0x030f  */
    /* JADX WARN: Code duplicated, block: B:132:0x0312  */
    /* JADX WARN: Code duplicated, block: B:135:0x031b  */
    /* JADX WARN: Code duplicated, block: B:136:0x031e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0322  */
    /* JADX WARN: Code duplicated, block: B:139:0x032c  */
    /* JADX WARN: Code duplicated, block: B:141:0x032f  */
    /* JADX WARN: Code duplicated, block: B:142:0x033a  */
    /* JADX WARN: Code duplicated, block: B:145:0x0340 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0342  */
    /* JADX WARN: Code duplicated, block: B:147:0x0344  */
    /* JADX WARN: Code duplicated, block: B:149:0x0347  */
    /* JADX WARN: Code duplicated, block: B:150:0x0351  */
    /* JADX WARN: Code duplicated, block: B:153:0x0371  */
    /* JADX WARN: Code duplicated, block: B:154:0x037b  */
    /* JADX WARN: Code duplicated, block: B:156:0x0383  */
    /* JADX WARN: Code duplicated, block: B:159:0x039c  */
    /* JADX WARN: Code duplicated, block: B:161:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:164:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:169:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:175:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:176:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:178:0x03ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:183:0x03db  */
    /* JADX WARN: Code duplicated, block: B:186:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:191:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:193:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:196:0x0426  */
    /* JADX WARN: Code duplicated, block: B:92:0x022f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0233  */
    /* JADX WARN: Code duplicated, block: B:95:0x0244  */
    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: d */
    public boolean mo4069d(long j2) {
        List<HlsMediaChunk> listEmptyList;
        long jMax;
        long j3;
        HlsChunkSource hlsChunkSource;
        List<HlsMediaChunk> list;
        int iIntValue;
        HlsChunkSource.e eVar;
        HlsChunkSource.e eVar2;
        HlsMediaPlaylist.d dVar;
        Uri uriM4586v;
        Chunk chunkM4301d;
        HlsMediaPlaylist.e eVar3;
        Uri uriM4586v2;
        Chunk chunkM4301d2;
        DataSource3 dataSource3;
        TimestampAdjusterProvider timestampAdjusterProvider;
        FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache;
        byte[] bArr;
        FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache2;
        byte[] bArr2;
        HlsMediaPlaylist.e eVar4;
        int i;
        boolean z;
        byte[] bArrM4306f;
        DataSource3 aes128DataSource;
        HlsMediaPlaylist.d dVar2;
        DataSource3 dataSource4;
        DataSpec dataSpec;
        boolean z2;
        int i2;
        HlsChunkSource.e eVar5;
        Id3Decoder id3Decoder;
        ParsableByteArray parsableByteArray;
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        boolean z3;
        TimestampAdjuster timestampAdjuster;
        boolean z4;
        HlsMediaPlaylist.e eVar6;
        boolean z5;
        boolean z6;
        HlsMediaChunkExtractor hlsMediaChunkExtractor2;
        boolean z7;
        byte[] bArrM4306f2;
        DataSource3 aes128DataSource2;
        String str;
        String str2;
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this;
        if (hlsSampleStreamWrapper.f9467Y || hlsSampleStreamWrapper.f9480o.m2899e() || hlsSampleStreamWrapper.f9480o.m2898d()) {
            return false;
        }
        if (m4321C()) {
            listEmptyList = Collections.emptyList();
            jMax = hlsSampleStreamWrapper.f9464V;
            for (d dVar3 : hlsSampleStreamWrapper.f9443A) {
                dVar3.f9015u = hlsSampleStreamWrapper.f9464V;
            }
        } else {
            listEmptyList = hlsSampleStreamWrapper.f9485t;
            HlsMediaChunk hlsMediaChunkM4320A = m4320A();
            jMax = hlsMediaChunkM4320A.f9398I ? hlsMediaChunkM4320A.f9116h : Math.max(hlsSampleStreamWrapper.f9463U, hlsMediaChunkM4320A.f9115g);
        }
        List<HlsMediaChunk> list2 = listEmptyList;
        long j4 = jMax;
        HlsChunkSource hlsChunkSource2 = hlsSampleStreamWrapper.f9474i;
        boolean z8 = hlsSampleStreamWrapper.f9451I || !list2.isEmpty();
        HlsChunkSource.b bVar = hlsSampleStreamWrapper.f9483r;
        Objects.requireNonNull(hlsChunkSource2);
        HlsMediaChunk hlsMediaChunk = list2.isEmpty() ? null : (HlsMediaChunk) C4799a.m10965P(list2);
        int iM4192a = hlsMediaChunk == null ? -1 : hlsChunkSource2.f9367h.m4192a(hlsMediaChunk.f9112d);
        long jMax2 = j4 - j2;
        long j5 = hlsChunkSource2.f9376q;
        long jMax3 = (j5 > (-9223372036854775807L) ? 1 : (j5 == (-9223372036854775807L) ? 0 : -1)) != 0 ? j5 - j2 : -9223372036854775807L;
        if (hlsMediaChunk != null) {
            hlsChunkSource = hlsChunkSource2;
            if (hlsChunkSource.f9374o) {
                list = list2;
                j3 = -9223372036854775807L;
            } else {
                list = list2;
                long j6 = hlsMediaChunk.f9116h - hlsMediaChunk.f9115g;
                jMax2 = Math.max(0L, jMax2 - j6);
                j3 = -9223372036854775807L;
                if (jMax3 != -9223372036854775807L) {
                    jMax3 = Math.max(0L, jMax3 - j6);
                }
            }
        } else {
            j3 = -9223372036854775807L;
            hlsChunkSource = hlsChunkSource2;
            list = list2;
        }
        MediaChunkIterator[] mediaChunkIteratorArrM4298a = hlsChunkSource.m4298a(hlsMediaChunk, j4);
        int i3 = iM4192a;
        HlsChunkSource hlsChunkSource3 = hlsChunkSource;
        HlsMediaChunk hlsMediaChunk2 = hlsMediaChunk;
        hlsChunkSource.f9375p.mo4303l(j2, jMax2, jMax3, list, mediaChunkIteratorArrM4298a);
        int iMo4519m = hlsChunkSource3.f9375p.mo4519m();
        boolean z9 = i3 != iMo4519m;
        Uri uri = hlsChunkSource3.f9364e[iMo4519m];
        if (((DefaultHlsPlaylistTracker) hlsChunkSource3.f9366g).m4338e(uri)) {
            HlsMediaPlaylist hlsMediaPlaylistM4336c = ((DefaultHlsPlaylistTracker) hlsChunkSource3.f9366g).m4336c(uri, true);
            Objects.requireNonNull(hlsMediaPlaylistM4336c);
            hlsChunkSource3.f9374o = hlsMediaPlaylistM4336c.f9613c;
            hlsChunkSource3.f9376q = hlsMediaPlaylistM4336c.f9581m ? j3 : hlsMediaPlaylistM4336c.m4346b() - ((DefaultHlsPlaylistTracker) hlsChunkSource3.f9366g).f9538u;
            long j7 = hlsMediaPlaylistM4336c.f9574f - ((DefaultHlsPlaylistTracker) hlsChunkSource3.f9366g).f9538u;
            Pair<Long, Integer> pairM4300c = hlsChunkSource3.m4300c(hlsMediaChunk2, z9, hlsMediaPlaylistM4336c, j7, j4);
            long jLongValue = ((Long) pairM4300c.first).longValue();
            int iIntValue2 = ((Integer) pairM4300c.second).intValue();
            if (jLongValue >= hlsMediaPlaylistM4336c.f9577i || hlsMediaChunk2 == null || !z9) {
                iIntValue = iIntValue2;
            } else {
                uri = hlsChunkSource3.f9364e[i3];
                hlsMediaPlaylistM4336c = ((DefaultHlsPlaylistTracker) hlsChunkSource3.f9366g).m4336c(uri, true);
                Objects.requireNonNull(hlsMediaPlaylistM4336c);
                j7 = hlsMediaPlaylistM4336c.f9574f - ((DefaultHlsPlaylistTracker) hlsChunkSource3.f9366g).f9538u;
                Pair<Long, Integer> pairM4300c2 = hlsChunkSource3.m4300c(hlsMediaChunk2, false, hlsMediaPlaylistM4336c, j7, j4);
                jLongValue = ((Long) pairM4300c2.first).longValue();
                iIntValue = ((Integer) pairM4300c2.second).intValue();
                iMo4519m = i3;
            }
            long j8 = hlsMediaPlaylistM4336c.f9577i;
            if (jLongValue < j8) {
                hlsChunkSource3.f9372m = new BehindLiveWindowException();
            } else {
                int i4 = (int) (jLongValue - j8);
                if (i4 == hlsMediaPlaylistM4336c.f9584p.size()) {
                    if (iIntValue == -1) {
                        iIntValue = 0;
                    }
                    eVar2 = iIntValue < hlsMediaPlaylistM4336c.f9585q.size() ? new HlsChunkSource.e(hlsMediaPlaylistM4336c.f9585q.get(iIntValue), jLongValue, iIntValue) : null;
                } else {
                    HlsMediaPlaylist.d dVar4 = hlsMediaPlaylistM4336c.f9584p.get(i4);
                    if (iIntValue == -1) {
                        eVar = new HlsChunkSource.e(dVar4, jLongValue, -1);
                    } else if (iIntValue < dVar4.f9594r.size()) {
                        eVar2 = new HlsChunkSource.e(dVar4.f9594r.get(iIntValue), jLongValue, iIntValue);
                    } else {
                        int i5 = i4 + 1;
                        eVar = i5 < hlsMediaPlaylistM4336c.f9584p.size() ? new HlsChunkSource.e(hlsMediaPlaylistM4336c.f9584p.get(i5), jLongValue + 1, -1) : !hlsMediaPlaylistM4336c.f9585q.isEmpty() ? new HlsChunkSource.e(hlsMediaPlaylistM4336c.f9585q.get(0), jLongValue + 1, 0) : null;
                    }
                    if (eVar != null) {
                        hlsChunkSource3.f9377r = false;
                        hlsChunkSource3.f9373n = null;
                        dVar = eVar.f9384a.f9596g;
                        if (dVar != null || (str2 = dVar.f9601l) == null) {
                            uriM4586v = null;
                        } else {
                            uriM4586v = C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, str2);
                        }
                        chunkM4301d = hlsChunkSource3.m4301d(uriM4586v, iMo4519m);
                        bVar.f9379a = chunkM4301d;
                        if (chunkM4301d == null) {
                            eVar3 = eVar.f9384a;
                            if (eVar3 != null || (str = eVar3.f9601l) == null) {
                                uriM4586v2 = null;
                            } else {
                                uriM4586v2 = C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, str);
                            }
                            chunkM4301d2 = hlsChunkSource3.m4301d(uriM4586v2, iMo4519m);
                            bVar.f9379a = chunkM4301d2;
                            if (chunkM4301d2 == null) {
                                HlsExtractorFactory hlsExtractorFactory = hlsChunkSource3.f9360a;
                                dataSource3 = hlsChunkSource3.f9361b;
                                Format format = hlsChunkSource3.f9365f[iMo4519m];
                                List<Format> list3 = hlsChunkSource3.f9368i;
                                int iMo4304o = hlsChunkSource3.f9375p.mo4304o();
                                Object objMo4305q = hlsChunkSource3.f9375p.mo4305q();
                                boolean z10 = hlsChunkSource3.f9370k;
                                timestampAdjusterProvider = hlsChunkSource3.f9363d;
                                fullSegmentEncryptionKeyCache = hlsChunkSource3.f9369j;
                                Objects.requireNonNull(fullSegmentEncryptionKeyCache);
                                if (uriM4586v2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = fullSegmentEncryptionKeyCache.f9358a.get(uriM4586v2);
                                }
                                fullSegmentEncryptionKeyCache2 = hlsChunkSource3.f9369j;
                                Objects.requireNonNull(fullSegmentEncryptionKeyCache2);
                                if (uriM4586v == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = fullSegmentEncryptionKeyCache2.f9358a.get(uriM4586v);
                                }
                                AtomicInteger atomicInteger = HlsMediaChunk.f9389k;
                                eVar4 = eVar.f9384a;
                                DataSpec.b bVar2 = new DataSpec.b();
                                bVar2.f6147a = C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, eVar4.f9595f);
                                bVar2.f6152f = eVar4.f9603n;
                                bVar2.f6153g = eVar4.f9604o;
                                if (eVar.f9387d) {
                                    i = 8;
                                } else {
                                    i = 0;
                                }
                                bVar2.f6155i = i;
                                DataSpec dataSpecM3005a = bVar2.m3005a();
                                if (bArr != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    String str3 = eVar4.f9602m;
                                    Objects.requireNonNull(str3);
                                    bArrM4306f = HlsMediaChunk.m4306f(str3);
                                } else {
                                    bArrM4306f = null;
                                }
                                if (bArr != null) {
                                    Objects.requireNonNull(bArrM4306f);
                                    aes128DataSource = new Aes128DataSource(dataSource3, bArr, bArrM4306f);
                                } else {
                                    aes128DataSource = dataSource3;
                                }
                                dVar2 = eVar4.f9596g;
                                if (dVar2 != null) {
                                    if (bArr2 != null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        String str4 = dVar2.f9602m;
                                        Objects.requireNonNull(str4);
                                        bArrM4306f2 = HlsMediaChunk.m4306f(str4);
                                    } else {
                                        bArrM4306f2 = null;
                                    }
                                    boolean z11 = z7;
                                    DataSpec dataSpec2 = new DataSpec(C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, dVar2.f9595f), dVar2.f9603n, dVar2.f9604o);
                                    if (bArr2 != null) {
                                        Objects.requireNonNull(bArrM4306f2);
                                        aes128DataSource2 = new Aes128DataSource(dataSource3, bArr2, bArrM4306f2);
                                    } else {
                                        aes128DataSource2 = dataSource3;
                                    }
                                    z2 = z11;
                                    dataSpec = dataSpec2;
                                    dataSource4 = aes128DataSource2;
                                } else {
                                    dataSource4 = null;
                                    dataSpec = null;
                                    z2 = false;
                                }
                                long j9 = j7 + eVar4.f9599j;
                                long j10 = j9 + eVar4.f9597h;
                                i2 = hlsMediaPlaylistM4336c.f9576h + eVar4.f9598i;
                                if (hlsMediaChunk2 != null) {
                                    if (uri.equals(hlsMediaChunk2.f9404n) || !hlsMediaChunk2.f9398I) {
                                        z4 = false;
                                    } else {
                                        z4 = true;
                                    }
                                    Id3Decoder id3Decoder2 = hlsMediaChunk2.f9416z;
                                    ParsableByteArray parsableByteArray2 = hlsMediaChunk2.f9390A;
                                    eVar5 = eVar;
                                    eVar6 = eVar5.f9384a;
                                    if (!(eVar6 instanceof HlsMediaPlaylist.b)) {
                                        z5 = hlsMediaPlaylistM4336c.f9613c;
                                    } else if (!((HlsMediaPlaylist.b) eVar6).f9589q || (eVar5.f9386c == 0 && hlsMediaPlaylistM4336c.f9613c)) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (!z4 || (z5 && j9 >= hlsMediaChunk2.f9116h)) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    boolean z12 = !z6;
                                    if (z4 || hlsMediaChunk2.f9400K || hlsMediaChunk2.f9403m != i2) {
                                        hlsMediaChunkExtractor2 = null;
                                    } else {
                                        hlsMediaChunkExtractor2 = hlsMediaChunk2.f9393D;
                                    }
                                    id3Decoder = id3Decoder2;
                                    parsableByteArray = parsableByteArray2;
                                    z3 = z12;
                                    hlsMediaChunkExtractor = hlsMediaChunkExtractor2;
                                } else {
                                    eVar5 = eVar;
                                    id3Decoder = new Id3Decoder();
                                    parsableByteArray = new ParsableByteArray(10);
                                    hlsMediaChunkExtractor = null;
                                    z3 = false;
                                }
                                long j11 = eVar5.f9385b;
                                int i6 = eVar5.f9386c;
                                boolean z13 = !eVar5.f9387d;
                                boolean z14 = eVar4.f9605p;
                                timestampAdjuster = timestampAdjusterProvider.f9511a.get(i2);
                                if (timestampAdjuster == null) {
                                    timestampAdjuster = new TimestampAdjuster(Long.MAX_VALUE);
                                    timestampAdjusterProvider.f9511a.put(i2, timestampAdjuster);
                                }
                                bVar.f9379a = new HlsMediaChunk(hlsExtractorFactory, aes128DataSource, dataSpecM3005a, format, z, dataSource4, dataSpec, z2, uri, list3, iMo4304o, objMo4305q, j9, j10, j11, i6, z13, i2, z14, z10, timestampAdjuster, eVar4.f9600k, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z3);
                                hlsSampleStreamWrapper = this;
                            }
                        }
                    } else if (!hlsMediaPlaylistM4336c.f9581m) {
                        bVar.f9381c = uri;
                        hlsChunkSource3.f9377r &= uri.equals(hlsChunkSource3.f9373n);
                        hlsChunkSource3.f9373n = uri;
                    } else if (!z8 || hlsMediaPlaylistM4336c.f9584p.isEmpty()) {
                        bVar.f9380b = true;
                    } else {
                        eVar = new HlsChunkSource.e((HlsMediaPlaylist.e) C4799a.m10965P(hlsMediaPlaylistM4336c.f9584p), (hlsMediaPlaylistM4336c.f9577i + ((long) hlsMediaPlaylistM4336c.f9584p.size())) - 1, -1);
                        hlsChunkSource3.f9377r = false;
                        hlsChunkSource3.f9373n = null;
                        dVar = eVar.f9384a.f9596g;
                        if (dVar != null) {
                            uriM4586v = null;
                        } else {
                            uriM4586v = null;
                        }
                        chunkM4301d = hlsChunkSource3.m4301d(uriM4586v, iMo4519m);
                        bVar.f9379a = chunkM4301d;
                        if (chunkM4301d == null) {
                            eVar3 = eVar.f9384a;
                            if (eVar3 != null) {
                                uriM4586v2 = null;
                            } else {
                                uriM4586v2 = null;
                            }
                            chunkM4301d2 = hlsChunkSource3.m4301d(uriM4586v2, iMo4519m);
                            bVar.f9379a = chunkM4301d2;
                            if (chunkM4301d2 == null) {
                                HlsExtractorFactory hlsExtractorFactory2 = hlsChunkSource3.f9360a;
                                dataSource3 = hlsChunkSource3.f9361b;
                                Format format2 = hlsChunkSource3.f9365f[iMo4519m];
                                List<Format> list4 = hlsChunkSource3.f9368i;
                                int iMo4304o2 = hlsChunkSource3.f9375p.mo4304o();
                                Object objMo4305q2 = hlsChunkSource3.f9375p.mo4305q();
                                boolean z15 = hlsChunkSource3.f9370k;
                                timestampAdjusterProvider = hlsChunkSource3.f9363d;
                                fullSegmentEncryptionKeyCache = hlsChunkSource3.f9369j;
                                Objects.requireNonNull(fullSegmentEncryptionKeyCache);
                                if (uriM4586v2 == null) {
                                    bArr = null;
                                } else {
                                    bArr = fullSegmentEncryptionKeyCache.f9358a.get(uriM4586v2);
                                }
                                fullSegmentEncryptionKeyCache2 = hlsChunkSource3.f9369j;
                                Objects.requireNonNull(fullSegmentEncryptionKeyCache2);
                                if (uriM4586v == null) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = fullSegmentEncryptionKeyCache2.f9358a.get(uriM4586v);
                                }
                                AtomicInteger atomicInteger2 = HlsMediaChunk.f9389k;
                                eVar4 = eVar.f9384a;
                                DataSpec.b bVar3 = new DataSpec.b();
                                bVar3.f6147a = C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, eVar4.f9595f);
                                bVar3.f6152f = eVar4.f9603n;
                                bVar3.f6153g = eVar4.f9604o;
                                if (eVar.f9387d) {
                                    i = 8;
                                } else {
                                    i = 0;
                                }
                                bVar3.f6155i = i;
                                DataSpec dataSpecM3005a2 = bVar3.m3005a();
                                if (bArr != null) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    String str5 = eVar4.f9602m;
                                    Objects.requireNonNull(str5);
                                    bArrM4306f = HlsMediaChunk.m4306f(str5);
                                } else {
                                    bArrM4306f = null;
                                }
                                if (bArr != null) {
                                    Objects.requireNonNull(bArrM4306f);
                                    aes128DataSource = new Aes128DataSource(dataSource3, bArr, bArrM4306f);
                                } else {
                                    aes128DataSource = dataSource3;
                                }
                                dVar2 = eVar4.f9596g;
                                if (dVar2 != null) {
                                    if (bArr2 != null) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z7) {
                                        String str6 = dVar2.f9602m;
                                        Objects.requireNonNull(str6);
                                        bArrM4306f2 = HlsMediaChunk.m4306f(str6);
                                    } else {
                                        bArrM4306f2 = null;
                                    }
                                    boolean z16 = z7;
                                    DataSpec dataSpec3 = new DataSpec(C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, dVar2.f9595f), dVar2.f9603n, dVar2.f9604o);
                                    if (bArr2 != null) {
                                        Objects.requireNonNull(bArrM4306f2);
                                        aes128DataSource2 = new Aes128DataSource(dataSource3, bArr2, bArrM4306f2);
                                    } else {
                                        aes128DataSource2 = dataSource3;
                                    }
                                    z2 = z16;
                                    dataSpec = dataSpec3;
                                    dataSource4 = aes128DataSource2;
                                } else {
                                    dataSource4 = null;
                                    dataSpec = null;
                                    z2 = false;
                                }
                                long j12 = j7 + eVar4.f9599j;
                                long j13 = j12 + eVar4.f9597h;
                                i2 = hlsMediaPlaylistM4336c.f9576h + eVar4.f9598i;
                                if (hlsMediaChunk2 != null) {
                                    if (uri.equals(hlsMediaChunk2.f9404n)) {
                                        z4 = false;
                                    } else {
                                        z4 = false;
                                    }
                                    Id3Decoder id3Decoder3 = hlsMediaChunk2.f9416z;
                                    ParsableByteArray parsableByteArray3 = hlsMediaChunk2.f9390A;
                                    eVar5 = eVar;
                                    eVar6 = eVar5.f9384a;
                                    if (!(eVar6 instanceof HlsMediaPlaylist.b)) {
                                        z5 = hlsMediaPlaylistM4336c.f9613c;
                                    } else if (((HlsMediaPlaylist.b) eVar6).f9589q) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z4) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    boolean z17 = !z6;
                                    if (z4) {
                                        hlsMediaChunkExtractor2 = null;
                                    } else {
                                        hlsMediaChunkExtractor2 = null;
                                    }
                                    id3Decoder = id3Decoder3;
                                    parsableByteArray = parsableByteArray3;
                                    z3 = z17;
                                    hlsMediaChunkExtractor = hlsMediaChunkExtractor2;
                                } else {
                                    eVar5 = eVar;
                                    id3Decoder = new Id3Decoder();
                                    parsableByteArray = new ParsableByteArray(10);
                                    hlsMediaChunkExtractor = null;
                                    z3 = false;
                                }
                                long j14 = eVar5.f9385b;
                                int i7 = eVar5.f9386c;
                                boolean z18 = !eVar5.f9387d;
                                boolean z19 = eVar4.f9605p;
                                timestampAdjuster = timestampAdjusterProvider.f9511a.get(i2);
                                if (timestampAdjuster == null) {
                                    timestampAdjuster = new TimestampAdjuster(Long.MAX_VALUE);
                                    timestampAdjusterProvider.f9511a.put(i2, timestampAdjuster);
                                }
                                bVar.f9379a = new HlsMediaChunk(hlsExtractorFactory2, aes128DataSource, dataSpecM3005a2, format2, z, dataSource4, dataSpec, z2, uri, list4, iMo4304o2, objMo4305q2, j12, j13, j14, i7, z18, i2, z19, z15, timestampAdjuster, eVar4.f9600k, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z3);
                                hlsSampleStreamWrapper = this;
                            }
                        }
                    }
                }
                eVar = eVar2;
                if (eVar != null) {
                    hlsChunkSource3.f9377r = false;
                    hlsChunkSource3.f9373n = null;
                    dVar = eVar.f9384a.f9596g;
                    if (dVar != null) {
                        uriM4586v = null;
                    } else {
                        uriM4586v = null;
                    }
                    chunkM4301d = hlsChunkSource3.m4301d(uriM4586v, iMo4519m);
                    bVar.f9379a = chunkM4301d;
                    if (chunkM4301d == null) {
                        eVar3 = eVar.f9384a;
                        if (eVar3 != null) {
                            uriM4586v2 = null;
                        } else {
                            uriM4586v2 = null;
                        }
                        chunkM4301d2 = hlsChunkSource3.m4301d(uriM4586v2, iMo4519m);
                        bVar.f9379a = chunkM4301d2;
                        if (chunkM4301d2 == null) {
                            HlsExtractorFactory hlsExtractorFactory3 = hlsChunkSource3.f9360a;
                            dataSource3 = hlsChunkSource3.f9361b;
                            Format format3 = hlsChunkSource3.f9365f[iMo4519m];
                            List<Format> list5 = hlsChunkSource3.f9368i;
                            int iMo4304o3 = hlsChunkSource3.f9375p.mo4304o();
                            Object objMo4305q3 = hlsChunkSource3.f9375p.mo4305q();
                            boolean z110 = hlsChunkSource3.f9370k;
                            timestampAdjusterProvider = hlsChunkSource3.f9363d;
                            fullSegmentEncryptionKeyCache = hlsChunkSource3.f9369j;
                            Objects.requireNonNull(fullSegmentEncryptionKeyCache);
                            if (uriM4586v2 == null) {
                                bArr = null;
                            } else {
                                bArr = fullSegmentEncryptionKeyCache.f9358a.get(uriM4586v2);
                            }
                            fullSegmentEncryptionKeyCache2 = hlsChunkSource3.f9369j;
                            Objects.requireNonNull(fullSegmentEncryptionKeyCache2);
                            if (uriM4586v == null) {
                                bArr2 = null;
                            } else {
                                bArr2 = fullSegmentEncryptionKeyCache2.f9358a.get(uriM4586v);
                            }
                            AtomicInteger atomicInteger3 = HlsMediaChunk.f9389k;
                            eVar4 = eVar.f9384a;
                            DataSpec.b bVar4 = new DataSpec.b();
                            bVar4.f6147a = C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, eVar4.f9595f);
                            bVar4.f6152f = eVar4.f9603n;
                            bVar4.f6153g = eVar4.f9604o;
                            if (eVar.f9387d) {
                                i = 8;
                            } else {
                                i = 0;
                            }
                            bVar4.f6155i = i;
                            DataSpec dataSpecM3005a3 = bVar4.m3005a();
                            if (bArr != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                String str7 = eVar4.f9602m;
                                Objects.requireNonNull(str7);
                                bArrM4306f = HlsMediaChunk.m4306f(str7);
                            } else {
                                bArrM4306f = null;
                            }
                            if (bArr != null) {
                                Objects.requireNonNull(bArrM4306f);
                                aes128DataSource = new Aes128DataSource(dataSource3, bArr, bArrM4306f);
                            } else {
                                aes128DataSource = dataSource3;
                            }
                            dVar2 = eVar4.f9596g;
                            if (dVar2 != null) {
                                if (bArr2 != null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (z7) {
                                    String str8 = dVar2.f9602m;
                                    Objects.requireNonNull(str8);
                                    bArrM4306f2 = HlsMediaChunk.m4306f(str8);
                                } else {
                                    bArrM4306f2 = null;
                                }
                                boolean z111 = z7;
                                DataSpec dataSpec4 = new DataSpec(C2096e.m4586v(hlsMediaPlaylistM4336c.f9611a, dVar2.f9595f), dVar2.f9603n, dVar2.f9604o);
                                if (bArr2 != null) {
                                    Objects.requireNonNull(bArrM4306f2);
                                    aes128DataSource2 = new Aes128DataSource(dataSource3, bArr2, bArrM4306f2);
                                } else {
                                    aes128DataSource2 = dataSource3;
                                }
                                z2 = z111;
                                dataSpec = dataSpec4;
                                dataSource4 = aes128DataSource2;
                            } else {
                                dataSource4 = null;
                                dataSpec = null;
                                z2 = false;
                            }
                            long j15 = j7 + eVar4.f9599j;
                            long j16 = j15 + eVar4.f9597h;
                            i2 = hlsMediaPlaylistM4336c.f9576h + eVar4.f9598i;
                            if (hlsMediaChunk2 != null) {
                                if (uri.equals(hlsMediaChunk2.f9404n)) {
                                    z4 = false;
                                } else {
                                    z4 = false;
                                }
                                Id3Decoder id3Decoder4 = hlsMediaChunk2.f9416z;
                                ParsableByteArray parsableByteArray4 = hlsMediaChunk2.f9390A;
                                eVar5 = eVar;
                                eVar6 = eVar5.f9384a;
                                if (!(eVar6 instanceof HlsMediaPlaylist.b)) {
                                    z5 = hlsMediaPlaylistM4336c.f9613c;
                                } else if (((HlsMediaPlaylist.b) eVar6).f9589q) {
                                    z5 = true;
                                } else {
                                    z5 = true;
                                }
                                if (z4) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                boolean z112 = !z6;
                                if (z4) {
                                    hlsMediaChunkExtractor2 = null;
                                } else {
                                    hlsMediaChunkExtractor2 = null;
                                }
                                id3Decoder = id3Decoder4;
                                parsableByteArray = parsableByteArray4;
                                z3 = z112;
                                hlsMediaChunkExtractor = hlsMediaChunkExtractor2;
                            } else {
                                eVar5 = eVar;
                                id3Decoder = new Id3Decoder();
                                parsableByteArray = new ParsableByteArray(10);
                                hlsMediaChunkExtractor = null;
                                z3 = false;
                            }
                            long j17 = eVar5.f9385b;
                            int i8 = eVar5.f9386c;
                            boolean z113 = !eVar5.f9387d;
                            boolean z114 = eVar4.f9605p;
                            timestampAdjuster = timestampAdjusterProvider.f9511a.get(i2);
                            if (timestampAdjuster == null) {
                                timestampAdjuster = new TimestampAdjuster(Long.MAX_VALUE);
                                timestampAdjusterProvider.f9511a.put(i2, timestampAdjuster);
                            }
                            bVar.f9379a = new HlsMediaChunk(hlsExtractorFactory3, aes128DataSource, dataSpecM3005a3, format3, z, dataSource4, dataSpec, z2, uri, list5, iMo4304o3, objMo4305q3, j15, j16, j17, i8, z113, i2, z114, z110, timestampAdjuster, eVar4.f9600k, hlsMediaChunkExtractor, id3Decoder, parsableByteArray, z3);
                            hlsSampleStreamWrapper = this;
                        }
                    }
                } else if (!hlsMediaPlaylistM4336c.f9581m) {
                    bVar.f9381c = uri;
                    hlsChunkSource3.f9377r &= uri.equals(hlsChunkSource3.f9373n);
                    hlsChunkSource3.f9373n = uri;
                } else {
                    if (z8) {
                    }
                    bVar.f9380b = true;
                }
            }
        } else {
            bVar.f9381c = uri;
            hlsChunkSource3.f9377r &= uri.equals(hlsChunkSource3.f9373n);
            hlsChunkSource3.f9373n = uri;
        }
        HlsChunkSource.b bVar5 = hlsSampleStreamWrapper.f9483r;
        boolean z20 = bVar5.f9380b;
        Chunk chunk = bVar5.f9379a;
        Uri uri2 = bVar5.f9381c;
        bVar5.f9379a = null;
        bVar5.f9380b = false;
        bVar5.f9381c = null;
        if (z20) {
            hlsSampleStreamWrapper.f9464V = -9223372036854775807L;
            hlsSampleStreamWrapper.f9467Y = true;
            return true;
        }
        if (chunk == null) {
            if (uri2 == null) {
                return false;
            }
            DefaultHlsPlaylistTracker.a aVar = ((DefaultHlsPlaylistTracker) ((HlsMediaPeriod) hlsSampleStreamWrapper.f9473h).f9419g).f9527j.get(uri2);
            aVar.m4342c(aVar.f9539f);
            return false;
        }
        if (chunk instanceof HlsMediaChunk) {
            HlsMediaChunk hlsMediaChunk3 = (HlsMediaChunk) chunk;
            hlsSampleStreamWrapper.f9471c0 = hlsMediaChunk3;
            hlsSampleStreamWrapper.f9453K = hlsMediaChunk3.f9112d;
            hlsSampleStreamWrapper.f9464V = -9223372036854775807L;
            hlsSampleStreamWrapper.f9484s.add(hlsMediaChunk3);
            AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
            ImmutableList2.a aVar2 = new ImmutableList2.a();
            for (d dVar5 : hlsSampleStreamWrapper.f9443A) {
                aVar2.m11646b(Integer.valueOf(dVar5.m4169t()));
            }
            ImmutableList2<Integer> immutableList2M11647c = aVar2.m11647c();
            hlsMediaChunk3.f9394E = hlsSampleStreamWrapper;
            hlsMediaChunk3.f9399J = immutableList2M11647c;
            for (d dVar6 : hlsSampleStreamWrapper.f9443A) {
                Objects.requireNonNull(dVar6);
                dVar6.f8990E = hlsMediaChunk3.f9402l;
                if (hlsMediaChunk3.f9405o) {
                    dVar6.f8994I = true;
                }
            }
        }
        hlsSampleStreamWrapper.f9491z = chunk;
        hlsSampleStreamWrapper.f9481p.m4111n(new LoadEventInfo(chunk.f9109a, chunk.f9110b, hlsSampleStreamWrapper.f9480o.m2902h(chunk, hlsSampleStreamWrapper, ((DefaultLoadErrorHandlingPolicy) hlsSampleStreamWrapper.f9479n).m3025b(chunk.f9111c))), chunk.f9111c, hlsSampleStreamWrapper.f9472g, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h);
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: e */
    public boolean mo4070e() {
        return this.f9480o.m2899e();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: g */
    public long mo4072g() {
        if (this.f9467Y) {
            return Long.MIN_VALUE;
        }
        if (m4321C()) {
            return this.f9464V;
        }
        long jMax = this.f9463U;
        HlsMediaChunk hlsMediaChunkM4320A = m4320A();
        if (!hlsMediaChunkM4320A.f9398I) {
            if (this.f9484s.size() > 1) {
                ArrayList<HlsMediaChunk> arrayList = this.f9484s;
                hlsMediaChunkM4320A = arrayList.get(arrayList.size() - 2);
            } else {
                hlsMediaChunkM4320A = null;
            }
        }
        if (hlsMediaChunkM4320A != null) {
            jMax = Math.max(jMax, hlsMediaChunkM4320A.f9116h);
        }
        if (this.f9450H) {
            for (d dVar : this.f9443A) {
                jMax = Math.max(jMax, dVar.m4163n());
            }
        }
        return jMax;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.SequenceableLoader
    /* JADX INFO: renamed from: h */
    public void mo4073h(long j2) {
        if (this.f9480o.m2898d() || m4321C()) {
            return;
        }
        if (this.f9480o.m2899e()) {
            Objects.requireNonNull(this.f9491z);
            HlsChunkSource hlsChunkSource = this.f9474i;
            if (hlsChunkSource.f9372m != null ? false : hlsChunkSource.f9375p.mo4514d(j2, this.f9491z, this.f9485t)) {
                this.f9480o.m2897b();
                return;
            }
            return;
        }
        int size = this.f9485t.size();
        while (size > 0 && this.f9474i.m4299b(this.f9485t.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f9485t.size()) {
            m4330z(size);
        }
        HlsChunkSource hlsChunkSource2 = this.f9474i;
        List<HlsMediaChunk> list = this.f9485t;
        int size2 = (hlsChunkSource2.f9372m != null || hlsChunkSource2.f9375p.length() < 2) ? list.size() : hlsChunkSource2.f9375p.mo4508j(j2, list);
        if (size2 < this.f9484s.size()) {
            m4330z(size2);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.f
    /* JADX INFO: renamed from: i */
    public void mo2911i() {
        for (d dVar : this.f9443A) {
            dVar.m4150C();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: j */
    public void mo3773j() {
        this.f9468Z = true;
        this.f9488w.post(this.f9487v);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: k */
    public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
        Chunk chunk = (Chunk) eVar;
        this.f9491z = null;
        long j4 = chunk.f9109a;
        DataSpec dataSpec = chunk.f9110b;
        StatsDataSource statsDataSource = chunk.f9117i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f9479n);
        this.f9481p.m4102e(loadEventInfo, chunk.f9111c, this.f9472g, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h);
        if (z) {
            return;
        }
        if (m4321C() || this.f9452J == 0) {
            m4325G();
        }
        if (this.f9452J > 0) {
            ((HlsMediaPeriod) this.f9473h).mo3428i(this);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: l */
    public void mo2904l(Loader.e eVar, long j2, long j3) {
        Chunk chunk = (Chunk) eVar;
        this.f9491z = null;
        HlsChunkSource hlsChunkSource = this.f9474i;
        Objects.requireNonNull(hlsChunkSource);
        if (chunk instanceof HlsChunkSource.a) {
            HlsChunkSource.a aVar = (HlsChunkSource.a) chunk;
            hlsChunkSource.f9371l = aVar.f9154j;
            FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache = hlsChunkSource.f9369j;
            Uri uri = aVar.f9110b.f6137a;
            byte[] bArr = aVar.f9378l;
            Objects.requireNonNull(bArr);
            LinkedHashMap<Uri, byte[]> linkedHashMap = fullSegmentEncryptionKeyCache.f9358a;
            Objects.requireNonNull(uri);
            linkedHashMap.put(uri, bArr);
        }
        long j4 = chunk.f9109a;
        DataSpec dataSpec = chunk.f9110b;
        StatsDataSource statsDataSource = chunk.f9117i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f9479n);
        this.f9481p.m4105h(loadEventInfo, chunk.f9111c, this.f9472g, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h);
        if (this.f9451I) {
            ((HlsMediaPeriod) this.f9473h).mo3428i(this);
        } else {
            mo4069d(this.f9463U);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.ExtractorOutput
    /* JADX INFO: renamed from: o */
    public TrackOutput2 mo3774o(int i, int i2) {
        Set<Integer> set = f9442f;
        TrackOutput2 trackOutput2M4318w = null;
        if (set.contains(Integer.valueOf(i2))) {
            C2096e.m4566b(set.contains(Integer.valueOf(i2)));
            int i3 = this.f9446D.get(i2, -1);
            if (i3 != -1) {
                if (this.f9445C.add(Integer.valueOf(i2))) {
                    this.f9444B[i3] = i;
                }
                trackOutput2M4318w = this.f9444B[i3] == i ? this.f9443A[i3] : m4318w(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                TrackOutput2[] trackOutput2Arr = this.f9443A;
                if (i4 >= trackOutput2Arr.length) {
                    break;
                }
                if (this.f9444B[i4] == i) {
                    trackOutput2M4318w = trackOutput2Arr[i4];
                    break;
                }
                i4++;
            }
        }
        if (trackOutput2M4318w == null) {
            if (this.f9468Z) {
                return m4318w(i, i2);
            }
            int length = this.f9443A.length;
            boolean z = i2 == 1 || i2 == 2;
            d dVar = new d(this.f9475j, this.f9488w.getLooper(), this.f9477l, this.f9478m, this.f9490y, null);
            dVar.f9015u = this.f9463U;
            if (z) {
                dVar.f9501K = this.f9470b0;
                dVar.f8986A = true;
            }
            dVar.m4154G(this.f9469a0);
            HlsMediaChunk hlsMediaChunk = this.f9471c0;
            if (hlsMediaChunk != null) {
                dVar.f8990E = hlsMediaChunk.f9402l;
            }
            dVar.f9000f = this;
            int i5 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f9444B, i5);
            this.f9444B = iArrCopyOf;
            iArrCopyOf[length] = i;
            d[] dVarArr = this.f9443A;
            int i6 = Util6.f6307a;
            Object[] objArrCopyOf = Arrays.copyOf(dVarArr, dVarArr.length + 1);
            objArrCopyOf[dVarArr.length] = dVar;
            this.f9443A = (d[]) objArrCopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f9462T, i5);
            this.f9462T = zArrCopyOf;
            zArrCopyOf[length] = z;
            this.f9460R = zArrCopyOf[length] | this.f9460R;
            this.f9445C.add(Integer.valueOf(i2));
            this.f9446D.append(i2, length);
            if (m4317B(i2) > m4317B(this.f9448F)) {
                this.f9449G = length;
                this.f9448F = i2;
            }
            this.f9461S = Arrays.copyOf(this.f9461S, i5);
            trackOutput2M4318w = dVar;
        }
        if (i2 != 5) {
            return trackOutput2M4318w;
        }
        if (this.f9447E == null) {
            this.f9447E = new c(trackOutput2M4318w, this.f9482q);
        }
        return this.f9447E;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: t */
    public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
        boolean zMo4513c;
        Loader.c cVarM2895c;
        int i2;
        Chunk chunk = (Chunk) eVar;
        boolean z = chunk instanceof HlsMediaChunk;
        if (z && !((HlsMediaChunk) chunk).f9401L && (iOException instanceof HttpDataSource.f) && ((i2 = ((HttpDataSource.f) iOException).f6242f) == 410 || i2 == 404)) {
            return Loader.f5957a;
        }
        long j4 = chunk.f9117i.f5997b;
        long j5 = chunk.f9109a;
        DataSpec dataSpec = chunk.f9110b;
        StatsDataSource statsDataSource = chunk.f9117i;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j5, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, j4);
        LoadErrorHandlingPolicy.a aVar = new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(chunk.f9111c, this.f9472g, chunk.f9112d, chunk.f9113e, chunk.f9114f, C.m3237c(chunk.f9115g), C.m3237c(chunk.f9116h)), iOException, i);
        long jM3024a = ((DefaultLoadErrorHandlingPolicy) this.f9479n).m3024a(aVar);
        if (jM3024a != -9223372036854775807L) {
            HlsChunkSource hlsChunkSource = this.f9474i;
            ExoTrackSelection2 exoTrackSelection2 = hlsChunkSource.f9375p;
            zMo4513c = exoTrackSelection2.mo4513c(exoTrackSelection2.mo4523t(hlsChunkSource.f9367h.m4192a(chunk.f9112d)), jM3024a);
        } else {
            zMo4513c = false;
        }
        if (zMo4513c) {
            if (z && j4 == 0) {
                ArrayList<HlsMediaChunk> arrayList = this.f9484s;
                C2096e.m4570f(arrayList.remove(arrayList.size() - 1) == chunk);
                if (this.f9484s.isEmpty()) {
                    this.f9464V = this.f9463U;
                } else {
                    ((HlsMediaChunk) C4799a.m10965P(this.f9484s)).f9400K = true;
                }
            }
            cVarM2895c = Loader.f5958b;
        } else {
            long jM3026c = ((DefaultLoadErrorHandlingPolicy) this.f9479n).m3026c(aVar);
            cVarM2895c = jM3026c != -9223372036854775807L ? Loader.m2895c(false, jM3026c) : Loader.f5959c;
        }
        Loader.c cVar = cVarM2895c;
        boolean z2 = !cVar.m2906a();
        this.f9481p.m4107j(loadEventInfo, chunk.f9111c, this.f9472g, chunk.f9112d, chunk.f9113e, chunk.f9114f, chunk.f9115g, chunk.f9116h, iOException, z2);
        if (z2) {
            this.f9491z = null;
            Objects.requireNonNull(this.f9479n);
        }
        if (zMo4513c) {
            if (this.f9451I) {
                ((HlsMediaPeriod) this.f9473h).mo3428i(this);
            } else {
                mo4069d(this.f9463U);
            }
        }
        return cVar;
    }

    @EnsuresNonNull({"trackGroups", "optionalTrackGroups"})
    /* JADX INFO: renamed from: v */
    public final void m4328v() {
        C2096e.m4570f(this.f9451I);
        Objects.requireNonNull(this.f9456N);
        Objects.requireNonNull(this.f9457O);
    }

    /* JADX INFO: renamed from: x */
    public final TrackGroupArray m4329x(TrackGroup[] trackGroupArr) {
        for (int i = 0; i < trackGroupArr.length; i++) {
            TrackGroup trackGroup = trackGroupArr[i];
            Format[] formatArr = new Format[trackGroup.f9064f];
            for (int i2 = 0; i2 < trackGroup.f9064f; i2++) {
                Format format = trackGroup.f9065g[i2];
                formatArr[i2] = format.m3516b(this.f9477l.mo3680b(format));
            }
            trackGroupArr[i] = new TrackGroup(formatArr);
        }
        return new TrackGroupArray(trackGroupArr);
    }

    /* JADX INFO: renamed from: z */
    public final void m4330z(int i) {
        boolean z;
        C2096e.m4570f(!this.f9480o.m2899e());
        while (true) {
            if (i >= this.f9484s.size()) {
                i = -1;
                break;
            }
            int i2 = i;
            while (true) {
                if (i2 >= this.f9484s.size()) {
                    HlsMediaChunk hlsMediaChunk = this.f9484s.get(i);
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.f9443A.length) {
                            z = true;
                            break;
                        } else {
                            if (this.f9443A[i3].m4165p() <= hlsMediaChunk.m4308g(i3)) {
                                i3++;
                            }
                        }
                    }
                } else if (!this.f9484s.get(i2).f9405o) {
                    i2++;
                }
                z = false;
                break;
            }
            if (z) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j2 = m4320A().f9116h;
        HlsMediaChunk hlsMediaChunk2 = this.f9484s.get(i);
        ArrayList<HlsMediaChunk> arrayList = this.f9484s;
        Util6.m3103L(arrayList, i, arrayList.size());
        for (int i4 = 0; i4 < this.f9443A.length; i4++) {
            this.f9443A[i4].m4160k(hlsMediaChunk2.m4308g(i4));
        }
        if (this.f9484s.isEmpty()) {
            this.f9464V = this.f9463U;
        } else {
            ((HlsMediaChunk) C4799a.m10965P(this.f9484s)).f9400K = true;
        }
        this.f9467Y = false;
        this.f9481p.m4113p(this.f9448F, hlsMediaChunk2.f9115g, j2);
    }
}
