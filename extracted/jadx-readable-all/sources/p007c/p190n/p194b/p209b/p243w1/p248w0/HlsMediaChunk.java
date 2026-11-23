package p007c.p190n.p194b.p209b.p243w1.p248w0;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p212b2.MimeTypes;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.TimestampAdjuster;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DrmInitData;
import p007c.p190n.p194b.p209b.p221s1.DefaultExtractorInput;
import p007c.p190n.p194b.p209b.p221s1.Extractor;
import p007c.p190n.p194b.p209b.p221s1.p227j0.Mp3Extractor;
import p007c.p190n.p194b.p209b.p221s1.p228k0.FragmentedMp4Extractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.Ac3Extractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.Ac4Extractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.AdtsExtractor;
import p007c.p190n.p194b.p209b.p221s1.p231n0.DefaultTsPayloadReaderFactory;
import p007c.p190n.p194b.p209b.p221s1.p231n0.TsExtractor;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.p239m.Id3Decoder;
import p007c.p190n.p194b.p209b.p234u1.p239m.PrivFrame;
import p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.AbstractIndexedListIterator;
import p007c.p190n.p378c.p380b.ImmutableList2;
import p007c.p190n.p378c.p380b.RegularImmutableList;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.n, reason: use source file name */
/* JADX INFO: compiled from: HlsMediaChunk.java */
/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaChunk extends MediaChunk {

    /* JADX INFO: renamed from: k */
    public static final AtomicInteger f9389k = new AtomicInteger();

    /* JADX INFO: renamed from: A */
    public final ParsableByteArray f9390A;

    /* JADX INFO: renamed from: B */
    public final boolean f9391B;

    /* JADX INFO: renamed from: C */
    public final boolean f9392C;

    /* JADX INFO: renamed from: D */
    public HlsMediaChunkExtractor f9393D;

    /* JADX INFO: renamed from: E */
    public HlsSampleStreamWrapper f9394E;

    /* JADX INFO: renamed from: F */
    public int f9395F;

    /* JADX INFO: renamed from: G */
    public boolean f9396G;

    /* JADX INFO: renamed from: H */
    public volatile boolean f9397H;

    /* JADX INFO: renamed from: I */
    public boolean f9398I;

    /* JADX INFO: renamed from: J */
    public ImmutableList2<Integer> f9399J;

    /* JADX INFO: renamed from: K */
    public boolean f9400K;

    /* JADX INFO: renamed from: L */
    public boolean f9401L;

    /* JADX INFO: renamed from: l */
    public final int f9402l;

    /* JADX INFO: renamed from: m */
    public final int f9403m;

    /* JADX INFO: renamed from: n */
    public final Uri f9404n;

    /* JADX INFO: renamed from: o */
    public final boolean f9405o;

    /* JADX INFO: renamed from: p */
    public final int f9406p;

    /* JADX INFO: renamed from: q */
    public final DataSource3 f9407q;

    /* JADX INFO: renamed from: r */
    public final DataSpec f9408r;

    /* JADX INFO: renamed from: s */
    public final HlsMediaChunkExtractor f9409s;

    /* JADX INFO: renamed from: t */
    public final boolean f9410t;

    /* JADX INFO: renamed from: u */
    public final boolean f9411u;

    /* JADX INFO: renamed from: v */
    public final TimestampAdjuster f9412v;

    /* JADX INFO: renamed from: w */
    public final HlsExtractorFactory f9413w;

    /* JADX INFO: renamed from: x */
    public final List<Format> f9414x;

    /* JADX INFO: renamed from: y */
    public final DrmInitData f9415y;

    /* JADX INFO: renamed from: z */
    public final Id3Decoder f9416z;

    public HlsMediaChunk(HlsExtractorFactory hlsExtractorFactory, DataSource3 dataSource3, DataSpec dataSpec, Format format, boolean z, DataSource3 dataSource4, DataSpec dataSpec2, boolean z2, Uri uri, List<Format> list, int i, Object obj, long j2, long j3, long j4, int i2, boolean z3, int i3, boolean z4, boolean z5, TimestampAdjuster timestampAdjuster, DrmInitData drmInitData, HlsMediaChunkExtractor hlsMediaChunkExtractor, Id3Decoder id3Decoder, ParsableByteArray parsableByteArray, boolean z6) {
        super(dataSource3, dataSpec, format, i, obj, j2, j3, j4);
        this.f9391B = z;
        this.f9406p = i2;
        this.f9401L = z3;
        this.f9403m = i3;
        this.f9408r = dataSpec2;
        this.f9407q = dataSource4;
        this.f9396G = dataSpec2 != null;
        this.f9392C = z2;
        this.f9404n = uri;
        this.f9410t = z5;
        this.f9412v = timestampAdjuster;
        this.f9411u = z4;
        this.f9413w = hlsExtractorFactory;
        this.f9414x = list;
        this.f9415y = drmInitData;
        this.f9409s = hlsMediaChunkExtractor;
        this.f9416z = id3Decoder;
        this.f9390A = parsableByteArray;
        this.f9405o = z6;
        AbstractIndexedListIterator<Object> abstractIndexedListIterator = ImmutableList2.f26255g;
        this.f9399J = RegularImmutableList.f26218h;
        this.f9402l = f9389k.getAndIncrement();
    }

    /* JADX INFO: renamed from: f */
    public static byte[] m4306f(String str) {
        if (Util6.m3111T(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: a */
    public void mo2909a() throws IOException {
        HlsMediaChunkExtractor hlsMediaChunkExtractor;
        Objects.requireNonNull(this.f9394E);
        if (this.f9393D == null && (hlsMediaChunkExtractor = this.f9409s) != null) {
            Extractor extractor = ((BundledHlsMediaChunkExtractor) hlsMediaChunkExtractor).f9351b;
            if ((extractor instanceof TsExtractor) || (extractor instanceof FragmentedMp4Extractor)) {
                this.f9393D = hlsMediaChunkExtractor;
                this.f9396G = false;
            }
        }
        if (this.f9396G) {
            Objects.requireNonNull(this.f9407q);
            Objects.requireNonNull(this.f9408r);
            m4307e(this.f9407q, this.f9408r, this.f9392C);
            this.f9395F = 0;
            this.f9396G = false;
        }
        if (this.f9397H) {
            return;
        }
        if (!this.f9411u) {
            try {
                TimestampAdjuster timestampAdjuster = this.f9412v;
                boolean z = this.f9410t;
                long j2 = this.f9115g;
                synchronized (timestampAdjuster) {
                    if (z) {
                        try {
                            if (!timestampAdjuster.f6301a) {
                                timestampAdjuster.f6302b = j2;
                                timestampAdjuster.f6301a = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!z || j2 != timestampAdjuster.f6302b) {
                        while (timestampAdjuster.f6304d == -9223372036854775807L) {
                            timestampAdjuster.wait();
                        }
                    }
                }
                m4307e(this.f9117i, this.f9110b, this.f9391B);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        }
        this.f9398I = !this.f9397H;
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.e
    /* JADX INFO: renamed from: b */
    public void mo2910b() {
        this.f9397H = true;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.p245u0.MediaChunk
    /* JADX INFO: renamed from: d */
    public boolean mo4222d() {
        return this.f9398I;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: e */
    public final void m4307e(DataSource3 dataSource3, DataSpec dataSpec, boolean z) throws IOException {
        DataSpec dataSpecM3003d;
        boolean z2;
        long j2;
        long j3;
        if (z) {
            z2 = this.f9395F != 0;
            dataSpecM3003d = dataSpec;
        } else {
            dataSpecM3003d = dataSpec.m3003d(this.f9395F);
            z2 = false;
        }
        try {
            DefaultExtractorInput defaultExtractorInputM4309h = m4309h(dataSource3, dataSpecM3003d);
            if (z2) {
                defaultExtractorInputM4309h.mo3737l(this.f9395F);
            }
            do {
                try {
                    try {
                        if (this.f9397H) {
                            break;
                        }
                    } catch (Throwable th) {
                        this.f9395F = (int) (defaultExtractorInputM4309h.f7573d - dataSpec.f6142f);
                        throw th;
                    }
                } catch (EOFException e) {
                    if ((this.f9112d.f6927j & 16384) == 0) {
                        throw e;
                    }
                    ((BundledHlsMediaChunkExtractor) this.f9393D).f9351b.mo3752g(0L, 0L);
                    j2 = defaultExtractorInputM4309h.f7573d;
                    j3 = dataSpec.f6142f;
                }
            } while (((BundledHlsMediaChunkExtractor) this.f9393D).f9351b.mo3750e(defaultExtractorInputM4309h, BundledHlsMediaChunkExtractor.f9350a) == 0);
            j2 = defaultExtractorInputM4309h.f7573d;
            j3 = dataSpec.f6142f;
            this.f9395F = (int) (j2 - j3);
            try {
                dataSource3.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            if (dataSource3 != null) {
                try {
                    dataSource3.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: g */
    public int m4308g(int i) {
        C2096e.m4570f(!this.f9405o);
        if (i >= this.f9399J.size()) {
            return 0;
        }
        return this.f9399J.get(i).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
    @EnsuresNonNull({"extractor"})
    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: h */
    public final DefaultExtractorInput m4309h(DataSource3 dataSource3, DataSpec dataSpec) throws IOException {
        long jM3208m;
        long j2;
        int i;
        BundledHlsMediaChunkExtractor bundledHlsMediaChunkExtractor;
        BundledHlsMediaChunkExtractor bundledHlsMediaChunkExtractor2;
        Extractor ac3Extractor;
        boolean zMo3749c;
        boolean z;
        List<Format> listEmptyList;
        Extractor mp3Extractor;
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource3, dataSpec.f6142f, dataSource3.mo2913h(dataSpec));
        int i2 = 0;
        if (this.f9393D == null) {
            defaultExtractorInput.mo3736k();
            try {
                this.f9390A.m3221z(10);
                defaultExtractorInput.mo3739o(this.f9390A.f6392a, 0, 10);
                if (this.f9390A.m3216u() != 4801587) {
                    jM3208m = -9223372036854775807L;
                    break;
                }
                this.f9390A.m3195E(3);
                int iM3213r = this.f9390A.m3213r();
                int i3 = iM3213r + 10;
                ParsableByteArray parsableByteArray = this.f9390A;
                byte[] bArr = parsableByteArray.f6392a;
                if (i3 > bArr.length) {
                    parsableByteArray.m3221z(i3);
                    System.arraycopy(bArr, 0, this.f9390A.f6392a, 0, 10);
                }
                defaultExtractorInput.mo3739o(this.f9390A.f6392a, 10, iM3213r);
                Metadata metadataM4045d = this.f9416z.m4045d(this.f9390A.f6392a, iM3213r);
                if (metadataM4045d == null) {
                    jM3208m = -9223372036854775807L;
                    break;
                }
                int length = metadataM4045d.f8661f.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        jM3208m = -9223372036854775807L;
                        break;
                    }
                    Metadata.b bVar = metadataM4045d.f8661f[i4];
                    if (bVar instanceof PrivFrame) {
                        PrivFrame privFrame = (PrivFrame) bVar;
                        if ("com.apple.streaming.transportStreamTimestamp".equals(privFrame.f8748g)) {
                            System.arraycopy(privFrame.f8749h, 0, this.f9390A.f6392a, 0, 8);
                            this.f9390A.m3194D(0);
                            this.f9390A.m3193C(8);
                            jM3208m = this.f9390A.m3208m() & 8589934591L;
                            break;
                        }
                    }
                    i4++;
                }
            } catch (EOFException unused) {
            }
            defaultExtractorInput.f7575f = 0;
            HlsMediaChunkExtractor hlsMediaChunkExtractor = this.f9409s;
            if (hlsMediaChunkExtractor != null) {
                BundledHlsMediaChunkExtractor bundledHlsMediaChunkExtractor3 = (BundledHlsMediaChunkExtractor) hlsMediaChunkExtractor;
                Extractor extractor = bundledHlsMediaChunkExtractor3.f9351b;
                C2096e.m4570f(!((extractor instanceof TsExtractor) || (extractor instanceof FragmentedMp4Extractor)));
                Extractor extractor2 = bundledHlsMediaChunkExtractor3.f9351b;
                if (extractor2 instanceof WebvttExtractor) {
                    mp3Extractor = new WebvttExtractor(bundledHlsMediaChunkExtractor3.f9352c.f6925h, bundledHlsMediaChunkExtractor3.f9353d);
                } else if (extractor2 instanceof AdtsExtractor) {
                    mp3Extractor = new AdtsExtractor();
                } else if (extractor2 instanceof Ac3Extractor) {
                    mp3Extractor = new Ac3Extractor();
                } else if (extractor2 instanceof Ac4Extractor) {
                    mp3Extractor = new Ac4Extractor();
                } else {
                    if (!(extractor2 instanceof Mp3Extractor)) {
                        StringBuilder sbM1556G = outline.m1556G("Unexpected extractor type for recreation: ");
                        sbM1556G.append(bundledHlsMediaChunkExtractor3.f9351b.getClass().getSimpleName());
                        throw new IllegalStateException(sbM1556G.toString());
                    }
                    mp3Extractor = new Mp3Extractor();
                }
                bundledHlsMediaChunkExtractor2 = new BundledHlsMediaChunkExtractor(mp3Extractor, bundledHlsMediaChunkExtractor3.f9352c, bundledHlsMediaChunkExtractor3.f9353d);
                j2 = jM3208m;
            } else {
                HlsExtractorFactory hlsExtractorFactory = this.f9413w;
                Uri uri = dataSpec.f6137a;
                Format format = this.f9112d;
                List<Format> list = this.f9414x;
                TimestampAdjuster timestampAdjuster = this.f9412v;
                Map<String, List<String>> mapMo2916j = dataSource3.mo2916j();
                DefaultHlsExtractorFactory defaultHlsExtractorFactory = (DefaultHlsExtractorFactory) hlsExtractorFactory;
                Objects.requireNonNull(defaultHlsExtractorFactory);
                int iM4577m = C2096e.m4577m(format.f6934q);
                int iM4578n = C2096e.m4578n(mapMo2916j);
                int iM4579o = C2096e.m4579o(uri);
                int[] iArr = DefaultHlsExtractorFactory.f9355b;
                ArrayList arrayList = new ArrayList(iArr.length);
                DefaultHlsExtractorFactory.m4297a(iM4577m, arrayList);
                DefaultHlsExtractorFactory.m4297a(iM4578n, arrayList);
                DefaultHlsExtractorFactory.m4297a(iM4579o, arrayList);
                for (int i5 : iArr) {
                    DefaultHlsExtractorFactory.m4297a(i5, arrayList);
                }
                defaultExtractorInput.mo3736k();
                int i6 = 0;
                Extractor extractor3 = null;
                while (true) {
                    if (i6 >= arrayList.size()) {
                        j2 = jM3208m;
                        i = 0;
                        Objects.requireNonNull(extractor3);
                        bundledHlsMediaChunkExtractor = new BundledHlsMediaChunkExtractor(extractor3, format, timestampAdjuster);
                        break;
                    }
                    int iIntValue = ((Integer) arrayList.get(i6)).intValue();
                    if (iIntValue == 0) {
                        defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                        j2 = jM3208m;
                        arrayList = arrayList;
                        i = 0;
                        ac3Extractor = new Ac3Extractor();
                    } else if (iIntValue == 1) {
                        defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                        j2 = jM3208m;
                        arrayList = arrayList;
                        i = 0;
                        ac3Extractor = new Ac4Extractor();
                    } else if (iIntValue == 2) {
                        defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                        j2 = jM3208m;
                        arrayList = arrayList;
                        i = 0;
                        ac3Extractor = new AdtsExtractor();
                    } else if (iIntValue != 7) {
                        if (iIntValue == 8) {
                            defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                            j2 = jM3208m;
                            Metadata metadata = format.f6932o;
                            if (metadata == null) {
                                z = false;
                                break;
                            }
                            int i7 = 0;
                            while (true) {
                                Metadata.b[] bVarArr = metadata.f8661f;
                                if (i7 >= bVarArr.length) {
                                    z = false;
                                    break;
                                }
                                Metadata.b bVar2 = bVarArr[i7];
                                if (bVar2 instanceof HlsTrackMetadataEntry) {
                                    z = !((HlsTrackMetadataEntry) bVar2).f9504h.isEmpty();
                                    break;
                                }
                                i7++;
                            }
                            ac3Extractor = new FragmentedMp4Extractor(z ? 4 : 0, timestampAdjuster, null, list != null ? list : Collections.emptyList());
                        } else if (iIntValue == 11) {
                            int i8 = defaultHlsExtractorFactory.f9356c;
                            boolean z2 = defaultHlsExtractorFactory.f9357d;
                            int i9 = i8 | 16;
                            if (list != null) {
                                i9 |= 32;
                                listEmptyList = list;
                            } else if (z2) {
                                Format.b bVar3 = new Format.b();
                                bVar3.f6958k = "application/cea-608";
                                listEmptyList = Collections.singletonList(bVar3.m3519a());
                            } else {
                                listEmptyList = Collections.emptyList();
                            }
                            String str = format.f6931n;
                            if (TextUtils.isEmpty(str)) {
                                j2 = jM3208m;
                            } else {
                                j2 = jM3208m;
                                if (!(MimeTypes.m3161c(str, "audio/mp4a-latm") != null)) {
                                    i9 |= 2;
                                }
                                if (!(MimeTypes.m3161c(str, "video/avc") != null)) {
                                    i9 |= 4;
                                }
                            }
                            ac3Extractor = new TsExtractor(2, timestampAdjuster, new DefaultTsPayloadReaderFactory(i9, listEmptyList));
                        } else if (iIntValue != 13) {
                            ac3Extractor = null;
                            defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                            j2 = jM3208m;
                        } else {
                            ac3Extractor = new WebvttExtractor(format.f6925h, timestampAdjuster);
                            defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                            j2 = jM3208m;
                        }
                        i = 0;
                    } else {
                        defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                        j2 = jM3208m;
                        arrayList = arrayList;
                        i = 0;
                        ac3Extractor = new Mp3Extractor(0, 0L);
                    }
                    Objects.requireNonNull(ac3Extractor);
                    try {
                        zMo3749c = ac3Extractor.mo3749c(defaultExtractorInput);
                        defaultExtractorInput.mo3736k();
                    } catch (EOFException unused2) {
                        defaultExtractorInput.mo3736k();
                        zMo3749c = false;
                    } catch (Throwable th) {
                        defaultExtractorInput.mo3736k();
                        throw th;
                    }
                    if (zMo3749c) {
                        bundledHlsMediaChunkExtractor = new BundledHlsMediaChunkExtractor(ac3Extractor, format, timestampAdjuster);
                        break;
                    }
                    if (extractor3 == null && (iIntValue == iM4577m || iIntValue == iM4578n || iIntValue == iM4579o || iIntValue == 11)) {
                        extractor3 = ac3Extractor;
                    }
                    i6++;
                    arrayList = arrayList;
                    defaultHlsExtractorFactory = defaultHlsExtractorFactory;
                    jM3208m = j2;
                }
                bundledHlsMediaChunkExtractor2 = bundledHlsMediaChunkExtractor;
                i2 = i;
            }
            this.f9393D = bundledHlsMediaChunkExtractor2;
            Extractor extractor4 = bundledHlsMediaChunkExtractor2.f9351b;
            if ((extractor4 instanceof AdtsExtractor) || (extractor4 instanceof Ac3Extractor) || (extractor4 instanceof Ac4Extractor) || (extractor4 instanceof Mp3Extractor)) {
                this.f9394E.m4327I(j2 != -9223372036854775807L ? this.f9412v.m3085b(j2) : this.f9115g);
            } else {
                this.f9394E.m4327I(0L);
            }
            this.f9394E.f9445C.clear();
            ((BundledHlsMediaChunkExtractor) this.f9393D).f9351b.mo3751f(this.f9394E);
        }
        HlsSampleStreamWrapper hlsSampleStreamWrapper = this.f9394E;
        DrmInitData drmInitData = this.f9415y;
        if (!Util6.m3113a(hlsSampleStreamWrapper.f9470b0, drmInitData)) {
            hlsSampleStreamWrapper.f9470b0 = drmInitData;
            while (true) {
                HlsSampleStreamWrapper.d[] dVarArr = hlsSampleStreamWrapper.f9443A;
                if (i2 >= dVarArr.length) {
                    break;
                }
                if (hlsSampleStreamWrapper.f9462T[i2]) {
                    HlsSampleStreamWrapper.d dVar = dVarArr[i2];
                    dVar.f9501K = drmInitData;
                    dVar.f8986A = true;
                }
                i2++;
            }
        }
        return defaultExtractorInput;
    }
}
