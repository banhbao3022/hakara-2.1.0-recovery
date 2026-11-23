package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.stetho.websocket.CloseCodes;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.ExoPlayerLibraryInfo;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p210a2.Allocator;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.SntpClient;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p218q1.DefaultDrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManager2;
import p007c.p190n.p194b.p209b.p218q1.DrmSessionManagerProvider;
import p007c.p190n.p194b.p209b.p242v1.StreamKey;
import p007c.p190n.p194b.p209b.p243w1.BaseMediaSource;
import p007c.p190n.p194b.p209b.p243w1.CompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.DefaultCompositeSequenceableLoaderFactory;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.p245u0.ChunkSampleStream;
import p007c.p190n.p194b.p209b.p243w1.p246v0.DashChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p246v0.DashManifestStaleException;
import p007c.p190n.p194b.p209b.p243w1.p246v0.DashMediaPeriod;
import p007c.p190n.p194b.p209b.p243w1.p246v0.DashSegmentIndex;
import p007c.p190n.p194b.p209b.p243w1.p246v0.DefaultDashChunkSource;
import p007c.p190n.p194b.p209b.p243w1.p246v0.EventSampleStream;
import p007c.p190n.p194b.p209b.p243w1.p246v0.PlayerEmsgHandler;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.AdaptationSet;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.DashManifest;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.EventStream;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Period;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.Representation;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.ServiceDescriptionElement;
import p007c.p190n.p194b.p209b.p243w1.p246v0.p247l.UtcTimingElement;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Charsets;
import p007c.p190n.p378c.p381c.LongMath;

/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource extends BaseMediaSource {

    /* JADX INFO: renamed from: A */
    public final PlayerEmsgHandler.b f28312A;

    /* JADX INFO: renamed from: B */
    public final LoaderErrorThrower f28313B;

    /* JADX INFO: renamed from: C */
    public DataSource3 f28314C;

    /* JADX INFO: renamed from: D */
    public Loader f28315D;

    /* JADX INFO: renamed from: E */
    public TransferListener f28316E;

    /* JADX INFO: renamed from: F */
    public IOException f28317F;

    /* JADX INFO: renamed from: G */
    public Handler f28318G;

    /* JADX INFO: renamed from: H */
    public MediaItem2.f f28319H;

    /* JADX INFO: renamed from: I */
    public Uri f28320I;

    /* JADX INFO: renamed from: J */
    public Uri f28321J;

    /* JADX INFO: renamed from: K */
    public DashManifest f28322K;

    /* JADX INFO: renamed from: L */
    public boolean f28323L;

    /* JADX INFO: renamed from: M */
    public long f28324M;

    /* JADX INFO: renamed from: N */
    public long f28325N;

    /* JADX INFO: renamed from: O */
    public long f28326O;

    /* JADX INFO: renamed from: P */
    public int f28327P;

    /* JADX INFO: renamed from: Q */
    public long f28328Q;

    /* JADX INFO: renamed from: R */
    public int f28329R;

    /* JADX INFO: renamed from: l */
    public final MediaItem2 f28330l;

    /* JADX INFO: renamed from: m */
    public final boolean f28331m;

    /* JADX INFO: renamed from: n */
    public final DataSource3.a f28332n;

    /* JADX INFO: renamed from: o */
    public final DashChunkSource.a f28333o;

    /* JADX INFO: renamed from: p */
    public final CompositeSequenceableLoaderFactory f28334p;

    /* JADX INFO: renamed from: q */
    public final DrmSessionManager2 f28335q;

    /* JADX INFO: renamed from: r */
    public final LoadErrorHandlingPolicy f28336r;

    /* JADX INFO: renamed from: s */
    public final long f28337s;

    /* JADX INFO: renamed from: t */
    public final MediaSourceEventListener.a f28338t;

    /* JADX INFO: renamed from: u */
    public final ParsingLoadable.a<? extends DashManifest> f28339u;

    /* JADX INFO: renamed from: v */
    public final C5876e f28340v;

    /* JADX INFO: renamed from: w */
    public final Object f28341w;

    /* JADX INFO: renamed from: x */
    public final SparseArray<DashMediaPeriod> f28342x;

    /* JADX INFO: renamed from: y */
    public final Runnable f28343y;

    /* JADX INFO: renamed from: z */
    public final Runnable f28344z;

    public static final class Factory implements MediaSourceFactory {

        /* JADX INFO: renamed from: a */
        public final DashChunkSource.a f28345a;

        /* JADX INFO: renamed from: b */
        public final DataSource3.a f28346b;

        /* JADX INFO: renamed from: c */
        public DrmSessionManagerProvider f28347c;

        /* JADX INFO: renamed from: d */
        public CompositeSequenceableLoaderFactory f28348d;

        /* JADX INFO: renamed from: e */
        public LoadErrorHandlingPolicy f28349e;

        /* JADX INFO: renamed from: f */
        public long f28350f;

        /* JADX INFO: renamed from: g */
        public long f28351g;

        /* JADX INFO: renamed from: h */
        public List<StreamKey> f28352h;

        public Factory(DataSource3.a aVar) {
            this(new DefaultDashChunkSource.a(aVar), aVar);
        }

        public Factory(DashChunkSource.a aVar, DataSource3.a aVar2) {
            Objects.requireNonNull(aVar);
            this.f28345a = aVar;
            this.f28346b = aVar2;
            this.f28347c = new DefaultDrmSessionManagerProvider();
            this.f28349e = new DefaultLoadErrorHandlingPolicy();
            this.f28350f = -9223372036854775807L;
            this.f28351g = 30000L;
            this.f28348d = new DefaultCompositeSequenceableLoaderFactory();
            this.f28352h = Collections.emptyList();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$a */
    public class C5872a implements SntpClient.b {
        public C5872a() {
        }

        /* JADX INFO: renamed from: a */
        public void m12627a() {
            long j2;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            synchronized (SntpClient.f6279b) {
                j2 = SntpClient.f6280c ? SntpClient.f6281d : -9223372036854775807L;
            }
            dashMediaSource.f28326O = j2;
            dashMediaSource.m12621C(true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$b */
    public static final class C5873b extends Timeline {

        /* JADX INFO: renamed from: b */
        public final long f28354b;

        /* JADX INFO: renamed from: c */
        public final long f28355c;

        /* JADX INFO: renamed from: d */
        public final long f28356d;

        /* JADX INFO: renamed from: e */
        public final int f28357e;

        /* JADX INFO: renamed from: f */
        public final long f28358f;

        /* JADX INFO: renamed from: g */
        public final long f28359g;

        /* JADX INFO: renamed from: h */
        public final long f28360h;

        /* JADX INFO: renamed from: i */
        public final DashManifest f28361i;

        /* JADX INFO: renamed from: j */
        public final MediaItem2 f28362j;

        /* JADX INFO: renamed from: k */
        public final MediaItem2.f f28363k;

        public C5873b(long j2, long j3, long j4, int i, long j5, long j6, long j7, DashManifest dashManifest, MediaItem2 mediaItem2, MediaItem2.f fVar) {
            C2096e.m4570f(dashManifest.f9257d == (fVar != null));
            this.f28354b = j2;
            this.f28355c = j3;
            this.f28356d = j4;
            this.f28357e = i;
            this.f28358f = j5;
            this.f28359g = j6;
            this.f28360h = j7;
            this.f28361i = dashManifest;
            this.f28362j = mediaItem2;
            this.f28363k = fVar;
        }

        /* JADX INFO: renamed from: r */
        public static boolean m12628r(DashManifest dashManifest) {
            return dashManifest.f9257d && dashManifest.f9258e != -9223372036854775807L && dashManifest.f9255b == -9223372036854775807L;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: b */
        public int mo3457b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f28357e) >= 0 && iIntValue < mo3355i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: g */
        public Timeline.b mo3462g(int i, Timeline.b bVar, boolean z) {
            C2096e.m4569e(i, 0, mo3355i());
            bVar.m3476f(z ? this.f28361i.f9266m.get(i).f9286a : null, z ? Integer.valueOf(this.f28357e + i) : null, 0, C.m3236b(this.f28361i.m4255d(i)), C.m3236b(this.f28361i.f9266m.get(i).f9287b - this.f28361i.m4253b(0).f9287b) - this.f28358f);
            return bVar;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: i */
        public int mo3355i() {
            return this.f28361i.m4254c();
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: m */
        public Object mo3467m(int i) {
            C2096e.m4569e(i, 0, mo3355i());
            return Integer.valueOf(this.f28357e + i);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b A[PHI: r3
  0x002b: PHI (r3v2 long) = (r3v1 long), (r3v4 long) binds: [B:6:0x001b, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:21:0x006a A[LOOP:1: B:17:0x005b->B:21:0x006a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:35:0x006d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:36:0x006e A[EDGE_INSN: B:36:0x006e->B:23:0x006e BREAK  A[LOOP:1: B:17:0x005b->B:21:0x006a], SYNTHETIC] */
        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: o */
        public Timeline.c mo3469o(int i, Timeline.c cVar, long j2) {
            long j3;
            long jM4256e;
            int i2;
            Period periodM4253b;
            int size;
            int i3;
            DashSegmentIndex dashSegmentIndexMo4284l;
            C2096e.m4569e(i, 0, 1);
            long jMo4230a = this.f28360h;
            if (m12628r(this.f28361i)) {
                if (j2 > 0) {
                    jMo4230a += j2;
                    if (jMo4230a > this.f28359g) {
                        jMo4230a = -9223372036854775807L;
                    } else {
                        j3 = this.f28358f + jMo4230a;
                        jM4256e = this.f28361i.m4256e(0);
                        i2 = 0;
                        while (i2 < this.f28361i.m4254c() - 1 && j3 >= jM4256e) {
                            j3 -= jM4256e;
                            i2++;
                            jM4256e = this.f28361i.m4256e(i2);
                        }
                        periodM4253b = this.f28361i.m4253b(i2);
                        size = periodM4253b.f9288c.size();
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                                i3 = -1;
                                break;
                            }
                            if (periodM4253b.f9288c.get(i3).f9249b == 2) {
                                break;
                            }
                            i3++;
                        }
                        if (i3 != -1 && (dashSegmentIndexMo4284l = periodM4253b.f9288c.get(i3).f9250c.get(0).mo4284l()) != null && dashSegmentIndexMo4284l.mo4238i(jM4256e) != 0) {
                            jMo4230a = (dashSegmentIndexMo4284l.mo4230a(dashSegmentIndexMo4284l.mo4235f(j3, jM4256e)) + jMo4230a) - j3;
                        }
                    }
                } else {
                    j3 = this.f28358f + jMo4230a;
                    jM4256e = this.f28361i.m4256e(0);
                    i2 = 0;
                    while (i2 < this.f28361i.m4254c() - 1) {
                        j3 -= jM4256e;
                        i2++;
                        jM4256e = this.f28361i.m4256e(i2);
                    }
                    periodM4253b = this.f28361i.m4253b(i2);
                    size = periodM4253b.f9288c.size();
                    i3 = 0;
                    while (true) {
                        if (i3 < size) {
                            i3 = -1;
                            break;
                        }
                        if (periodM4253b.f9288c.get(i3).f9249b == 2) {
                            break;
                            break;
                        }
                        i3++;
                    }
                    if (i3 != -1) {
                        jMo4230a = (dashSegmentIndexMo4284l.mo4230a(dashSegmentIndexMo4284l.mo4235f(j3, jM4256e)) + jMo4230a) - j3;
                    }
                }
            }
            long j4 = jMo4230a;
            Object obj = Timeline.c.f6750a;
            MediaItem2 mediaItem2 = this.f28362j;
            DashManifest dashManifest = this.f28361i;
            cVar.m3480d(obj, mediaItem2, dashManifest, this.f28354b, this.f28355c, this.f28356d, true, m12628r(dashManifest), this.f28363k, j4, this.f28359g, 0, mo3355i() - 1, this.f28358f);
            return cVar;
        }

        @Override // p007c.p190n.p194b.p209b.Timeline
        /* JADX INFO: renamed from: p */
        public int mo3356p() {
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$c */
    public final class C5874c implements PlayerEmsgHandler.b {
        public C5874c(C5872a c5872a) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$d */
    public static final class C5875d implements ParsingLoadable.a<Long> {

        /* JADX INFO: renamed from: a */
        public static final Pattern f28365a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // p007c.p190n.p194b.p209b.p210a2.ParsingLoadable.a
        /* JADX INFO: renamed from: a */
        public Long mo2912a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, Charsets.f26131c)).readLine();
            try {
                Matcher matcher = f28365a.matcher(line);
                if (!matcher.matches()) {
                    throw new ParserException("Couldn't parse timestamp: " + line);
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j2 = "+".equals(matcher.group(4)) ? 1L : -1L;
                    long j3 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= ((((j3 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60) * 1000) * j2;
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw new ParserException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$e */
    public final class C5876e implements Loader.b<ParsingLoadable<DashManifest>> {
        public C5876e(C5872a c5872a) {
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: k */
        public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
            DashMediaSource.this.m12626z((ParsingLoadable) eVar, j2, j3);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
        /* JADX WARN: Code duplicated, block: B:26:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:28:0x00d3  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: l */
        public void mo2904l(Loader.e eVar, long j2, long j3) {
            boolean z;
            int i;
            ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            Objects.requireNonNull(dashMediaSource);
            long j4 = parsingLoadable.f5978a;
            DataSpec dataSpec = parsingLoadable.f5979b;
            StatsDataSource statsDataSource = parsingLoadable.f5981d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
            Objects.requireNonNull(dashMediaSource.f28336r);
            dashMediaSource.f28338t.m4104g(loadEventInfo, parsingLoadable.f5980c);
            DashManifest dashManifest = (DashManifest) parsingLoadable.f5983f;
            DashManifest dashManifest2 = dashMediaSource.f28322K;
            int iM4254c = dashManifest2 == null ? 0 : dashManifest2.m4254c();
            long j5 = dashManifest.m4253b(0).f9287b;
            int i2 = 0;
            while (i2 < iM4254c && dashMediaSource.f28322K.m4253b(i2).f9287b < j5) {
                i2++;
            }
            if (dashManifest.f9257d) {
                if (iM4254c - i2 > dashManifest.m4254c()) {
                    Log.w("DashMediaSource", "Loaded out of sync manifest");
                } else {
                    long j6 = dashMediaSource.f28328Q;
                    if (j6 == -9223372036854775807L || dashManifest.f9261h * 1000 > j6) {
                        z = false;
                    } else {
                        StringBuilder sbM1556G = outline.m1556G("Loaded stale dynamic manifest: ");
                        sbM1556G.append(dashManifest.f9261h);
                        sbM1556G.append(", ");
                        outline.m1568S(sbM1556G, dashMediaSource.f28328Q, "DashMediaSource");
                    }
                    if (z) {
                        i = dashMediaSource.f28327P;
                        dashMediaSource.f28327P = i + 1;
                        if (i < ((DefaultLoadErrorHandlingPolicy) dashMediaSource.f28336r).m3025b(parsingLoadable.f5980c)) {
                            dashMediaSource.f28318G.postDelayed(dashMediaSource.f28343y, Math.min((dashMediaSource.f28327P - 1) * CloseCodes.NORMAL_CLOSURE, 5000));
                            return;
                        } else {
                            dashMediaSource.f28317F = new DashManifestStaleException();
                            return;
                        }
                    }
                    dashMediaSource.f28327P = 0;
                }
                z = true;
                if (z) {
                    i = dashMediaSource.f28327P;
                    dashMediaSource.f28327P = i + 1;
                    if (i < ((DefaultLoadErrorHandlingPolicy) dashMediaSource.f28336r).m3025b(parsingLoadable.f5980c)) {
                        dashMediaSource.f28318G.postDelayed(dashMediaSource.f28343y, Math.min((dashMediaSource.f28327P - 1) * CloseCodes.NORMAL_CLOSURE, 5000));
                        return;
                    } else {
                        dashMediaSource.f28317F = new DashManifestStaleException();
                        return;
                    }
                }
                dashMediaSource.f28327P = 0;
            }
            dashMediaSource.f28322K = dashManifest;
            dashMediaSource.f28323L = dashManifest.f9257d & dashMediaSource.f28323L;
            dashMediaSource.f28324M = j2 - j3;
            dashMediaSource.f28325N = j2;
            synchronized (dashMediaSource.f28341w) {
                if (parsingLoadable.f5979b.f6137a == dashMediaSource.f28320I) {
                    Uri uri = dashMediaSource.f28322K.f9264k;
                    if (uri == null) {
                        uri = parsingLoadable.f5981d.f5998c;
                    }
                    dashMediaSource.f28320I = uri;
                }
            }
            if (iM4254c != 0) {
                dashMediaSource.f28329R += i2;
                dashMediaSource.m12621C(true);
                return;
            }
            DashManifest dashManifest3 = dashMediaSource.f28322K;
            if (!dashManifest3.f9257d) {
                dashMediaSource.m12621C(true);
                return;
            }
            UtcTimingElement utcTimingElement = dashManifest3.f9262i;
            if (utcTimingElement == null) {
                dashMediaSource.m12625y();
                return;
            }
            String str = utcTimingElement.f9335a;
            if (Util6.m3113a(str, "urn:mpeg:dash:utc:direct:2014") || Util6.m3113a(str, "urn:mpeg:dash:utc:direct:2012")) {
                try {
                    dashMediaSource.m12620B(Util6.m3101J(utcTimingElement.f9336b) - dashMediaSource.f28325N);
                    return;
                } catch (ParserException e) {
                    dashMediaSource.m12619A(e);
                    return;
                }
            }
            if (Util6.m3113a(str, "urn:mpeg:dash:utc:http-iso:2014") || Util6.m3113a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                dashMediaSource.m12622D(utcTimingElement, new C5875d());
                return;
            }
            if (Util6.m3113a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Util6.m3113a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                dashMediaSource.m12622D(utcTimingElement, new C5879h(null));
            } else if (Util6.m3113a(str, "urn:mpeg:dash:utc:ntp:2014") || Util6.m3113a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                dashMediaSource.m12625y();
            } else {
                dashMediaSource.m12619A(new IOException("Unsupported UTC timing scheme"));
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: t */
        public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
            ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            Objects.requireNonNull(dashMediaSource);
            long j4 = parsingLoadable.f5978a;
            DataSpec dataSpec = parsingLoadable.f5979b;
            StatsDataSource statsDataSource = parsingLoadable.f5981d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
            long jM3026c = ((DefaultLoadErrorHandlingPolicy) dashMediaSource.f28336r).m3026c(new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(parsingLoadable.f5980c), iOException, i));
            Loader.c cVarM2895c = jM3026c == -9223372036854775807L ? Loader.f5959c : Loader.m2895c(false, jM3026c);
            boolean z = !cVarM2895c.m2906a();
            dashMediaSource.f28338t.m4108k(loadEventInfo, parsingLoadable.f5980c, iOException, z);
            if (z) {
                Objects.requireNonNull(dashMediaSource.f28336r);
            }
            return cVarM2895c;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$f */
    public final class C5877f implements LoaderErrorThrower {
        public C5877f() {
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.LoaderErrorThrower
        /* JADX INFO: renamed from: a */
        public void mo2896a() throws IOException {
            DashMediaSource.this.f28315D.m2900f(Integer.MIN_VALUE);
            IOException iOException = DashMediaSource.this.f28317F;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$g */
    public final class C5878g implements Loader.b<ParsingLoadable<Long>> {
        public C5878g(C5872a c5872a) {
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: k */
        public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
            DashMediaSource.this.m12626z((ParsingLoadable) eVar, j2, j3);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: l */
        public void mo2904l(Loader.e eVar, long j2, long j3) {
            ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            Objects.requireNonNull(dashMediaSource);
            long j4 = parsingLoadable.f5978a;
            DataSpec dataSpec = parsingLoadable.f5979b;
            StatsDataSource statsDataSource = parsingLoadable.f5981d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
            Objects.requireNonNull(dashMediaSource.f28336r);
            dashMediaSource.f28338t.m4104g(loadEventInfo, parsingLoadable.f5980c);
            dashMediaSource.m12620B(((Long) parsingLoadable.f5983f).longValue() - j2);
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: t */
        public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
            ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
            DashMediaSource dashMediaSource = DashMediaSource.this;
            MediaSourceEventListener.a aVar = dashMediaSource.f28338t;
            long j4 = parsingLoadable.f5978a;
            DataSpec dataSpec = parsingLoadable.f5979b;
            StatsDataSource statsDataSource = parsingLoadable.f5981d;
            aVar.m4108k(new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b), parsingLoadable.f5980c, iOException, true);
            Objects.requireNonNull(dashMediaSource.f28336r);
            dashMediaSource.m12619A(iOException);
            return Loader.f5958b;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.DashMediaSource$h */
    public static final class C5879h implements ParsingLoadable.a<Long> {
        public C5879h(C5872a c5872a) {
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.ParsingLoadable.a
        /* JADX INFO: renamed from: a */
        public Long mo2912a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(Util6.m3101J(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        ExoPlayerLibraryInfo.m3455a("goog.exo.dash");
    }

    public DashMediaSource(MediaItem2 mediaItem2, DashManifest dashManifest, DataSource3.a aVar, ParsingLoadable.a aVar2, DashChunkSource.a aVar3, CompositeSequenceableLoaderFactory compositeSequenceableLoaderFactory, DrmSessionManager2 drmSessionManager2, LoadErrorHandlingPolicy loadErrorHandlingPolicy, long j2, C5872a c5872a) {
        this.f28330l = mediaItem2;
        this.f28319H = mediaItem2.f7467c;
        MediaItem2.g gVar = mediaItem2.f7466b;
        Objects.requireNonNull(gVar);
        this.f28320I = gVar.f7518a;
        this.f28321J = mediaItem2.f7466b.f7518a;
        this.f28322K = null;
        this.f28332n = aVar;
        this.f28339u = aVar2;
        this.f28333o = aVar3;
        this.f28335q = drmSessionManager2;
        this.f28336r = loadErrorHandlingPolicy;
        this.f28337s = j2;
        this.f28334p = compositeSequenceableLoaderFactory;
        this.f28331m = false;
        this.f28338t = m4144q(null);
        this.f28341w = new Object();
        this.f28342x = new SparseArray<>();
        this.f28312A = new C5874c(null);
        this.f28328Q = -9223372036854775807L;
        this.f28326O = -9223372036854775807L;
        this.f28340v = new C5876e(null);
        this.f28313B = new C5877f();
        this.f28343y = new Runnable() { // from class: c.n.b.b.w1.v0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f9167f.m12624F();
            }
        };
        this.f28344z = new Runnable() { // from class: c.n.b.b.w1.v0.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f9169f.m12621C(false);
            }
        };
    }

    /* JADX INFO: renamed from: x */
    public static boolean m12618x(Period period) {
        for (int i = 0; i < period.f9288c.size(); i++) {
            int i2 = period.f9288c.get(i).f9249b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m12619A(IOException iOException) {
        p007c.p190n.p194b.p209b.p212b2.Log.m3154b("DashMediaSource", "Failed to resolve time offset.", iOException);
        m12621C(true);
    }

    /* JADX INFO: renamed from: B */
    public final void m12620B(long j2) {
        this.f28326O = j2;
        m12621C(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x025c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280  */
    /* JADX WARN: Code duplicated, block: B:125:0x029c  */
    /* JADX WARN: Code duplicated, block: B:134:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:137:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:215:0x0467  */
    /* JADX WARN: Code duplicated, block: B:221:0x0472  */
    /* JADX WARN: Code duplicated, block: B:45:0x0121 A[PHI: r19
  0x0121: PHI (r19v6 boolean) = (r19v4 boolean), (r19v7 boolean) binds: [B:44:0x011f, B:40:0x0116] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0188 A[PHI: r21
  0x0188: PHI (r21v12 boolean) = (r21v10 boolean), (r21v13 boolean) binds: [B:65:0x0186, B:61:0x017c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x0200  */
    /* JADX INFO: renamed from: C */
    public final void m12621C(boolean z) {
        boolean z2;
        long j2;
        long j3;
        DashSegmentIndex dashSegmentIndexMo4284l;
        long jM3237c;
        long j4;
        long j5;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        boolean z5;
        for (int i = 0; i < this.f28342x.size(); i++) {
            int iKeyAt = this.f28342x.keyAt(i);
            if (iKeyAt >= this.f28329R) {
                DashMediaPeriod dashMediaPeriodValueAt = this.f28342x.valueAt(i);
                DashManifest dashManifest = this.f28322K;
                int i2 = iKeyAt - this.f28329R;
                dashMediaPeriodValueAt.f9172A = dashManifest;
                dashMediaPeriodValueAt.f9173B = i2;
                PlayerEmsgHandler playerEmsgHandler = dashMediaPeriodValueAt.f9186s;
                playerEmsgHandler.f9239n = false;
                playerEmsgHandler.f9237l = -9223372036854775807L;
                playerEmsgHandler.f9236k = dashManifest;
                Iterator<Map.Entry<Long, Long>> it = playerEmsgHandler.f9235j.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getKey().longValue() < playerEmsgHandler.f9236k.f9261h) {
                        it.remove();
                    }
                }
                ChunkSampleStream<DashChunkSource>[] chunkSampleStreamArr = dashMediaPeriodValueAt.f9191x;
                if (chunkSampleStreamArr != null) {
                    for (ChunkSampleStream<DashChunkSource> chunkSampleStream : chunkSampleStreamArr) {
                        ((DashChunkSource) chunkSampleStream.f9126j).mo4225g(dashManifest, i2);
                    }
                    dashMediaPeriodValueAt.f9190w.mo3428i(dashMediaPeriodValueAt);
                }
                dashMediaPeriodValueAt.f9174C = dashManifest.f9266m.get(i2).f9289d;
                for (EventSampleStream eventSampleStream : dashMediaPeriodValueAt.f9192y) {
                    for (EventStream eventStream : dashMediaPeriodValueAt.f9174C) {
                        if (eventStream.m4281a().equals(eventSampleStream.f9227j.m4281a())) {
                            eventSampleStream.m4251d(eventStream, dashManifest.f9257d && i2 == dashManifest.m4254c() - 1);
                            break;
                        }
                    }
                }
            }
        }
        Period periodM4253b = this.f28322K.m4253b(0);
        int iM4254c = this.f28322K.m4254c() - 1;
        Period periodM4253b2 = this.f28322K.m4253b(iM4254c);
        long jM4256e = this.f28322K.m4256e(iM4254c);
        long jM3236b = C.m3236b(Util6.m3135w(this.f28326O));
        long jM4256e2 = this.f28322K.m4256e(0);
        long jM3236b2 = C.m3236b(periodM4253b.f9287b);
        boolean zM12618x = m12618x(periodM4253b);
        long jMax = jM3236b2;
        int i3 = 0;
        while (true) {
            if (i3 >= periodM4253b.f9288c.size()) {
                jM3236b2 = jMax;
                break;
            }
            AdaptationSet adaptationSet = periodM4253b.f9288c.get(i3);
            List<Representation> list = adaptationSet.f9250c;
            if (zM12618x) {
                z5 = zM12618x;
                if (adaptationSet.f9249b != 3) {
                }
                i3++;
                periodM4253b = periodM4253b;
                zM12618x = z5;
            } else {
                z5 = zM12618x;
            }
            if (!list.isEmpty()) {
                DashSegmentIndex dashSegmentIndexMo4284l2 = list.get(0).mo4284l();
                if (dashSegmentIndexMo4284l2 == null || dashSegmentIndexMo4284l2.mo4239j(jM4256e2, jM3236b) == 0) {
                    break;
                } else {
                    jMax = Math.max(jMax, dashSegmentIndexMo4284l2.mo4230a(dashSegmentIndexMo4284l2.mo4232c(jM4256e2, jM3236b)) + jM3236b2);
                }
            }
            i3++;
            periodM4253b = periodM4253b;
            zM12618x = z5;
        }
        long jM3236b3 = C.m3236b(periodM4253b2.f9287b);
        boolean zM12618x2 = m12618x(periodM4253b2);
        long jMin = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < periodM4253b2.f9288c.size()) {
            AdaptationSet adaptationSet2 = periodM4253b2.f9288c.get(i4);
            List<Representation> list2 = adaptationSet2.f9250c;
            if (zM12618x2) {
                z4 = zM12618x2;
                if (adaptationSet2.f9249b != 3) {
                }
                i4++;
                periodM4253b = periodM4253b;
                zM12618x2 = z4;
            } else {
                z4 = zM12618x2;
            }
            if (!list2.isEmpty()) {
                DashSegmentIndex dashSegmentIndexMo4284l3 = list2.get(0).mo4284l();
                if (dashSegmentIndexMo4284l3 == null) {
                    jM3236b3 += jM4256e;
                } else {
                    int iMo4239j = dashSegmentIndexMo4284l3.mo4239j(jM4256e, jM3236b);
                    if (iMo4239j != 0) {
                        long jMo4232c = (dashSegmentIndexMo4284l3.mo4232c(jM4256e, jM3236b) + ((long) iMo4239j)) - 1;
                        jMin = Math.min(jMin, dashSegmentIndexMo4284l3.mo4231b(jMo4232c, jM4256e) + dashSegmentIndexMo4284l3.mo4230a(jMo4232c) + jM3236b3);
                    }
                }
                jMin = jM3236b3;
                break;
            }
            i4++;
            periodM4253b = periodM4253b;
            zM12618x2 = z4;
        }
        Period period = periodM4253b;
        if (this.f28322K.f9257d) {
            int i5 = 0;
            while (true) {
                if (i5 >= periodM4253b2.f9288c.size()) {
                    z3 = false;
                    break;
                }
                DashSegmentIndex dashSegmentIndexMo4284l4 = periodM4253b2.f9288c.get(i5).f9250c.get(0).mo4284l();
                if (dashSegmentIndexMo4284l4 == null || dashSegmentIndexMo4284l4.mo4236g()) {
                    z3 = true;
                    break;
                }
                i5++;
            }
            if (z3) {
                z2 = false;
            } else {
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            long j6 = this.f28322K.f9259f;
            if (j6 != -9223372036854775807L) {
                jM3236b2 = Math.max(jM3236b2, jMin - C.m3236b(j6));
            }
        }
        long j7 = jMin - jM3236b2;
        DashManifest dashManifest2 = this.f28322K;
        if (dashManifest2.f9257d) {
            C2096e.m4570f(dashManifest2.f9254a != -9223372036854775807L);
            long jM3236b4 = (jM3236b - C.m3236b(this.f28322K.f9254a)) - jM3236b2;
            long jM3237c2 = this.f28330l.f7467c.f7515c;
            if (jM3237c2 == -9223372036854775807L) {
                ServiceDescriptionElement serviceDescriptionElement = this.f28322K.f9263j;
                if (serviceDescriptionElement != null) {
                    jM3237c2 = serviceDescriptionElement.f9327c;
                    if (jM3237c2 == -9223372036854775807L) {
                        jM3237c2 = C.m3237c(jM3236b4);
                    }
                } else {
                    jM3237c2 = C.m3237c(jM3236b4);
                }
            }
            long j8 = this.f28330l.f7467c.f7514b;
            if (j8 != -9223372036854775807L) {
                j5 = -9223372036854775807L;
                jM3237c = j8;
            } else {
                ServiceDescriptionElement serviceDescriptionElement2 = this.f28322K.f9263j;
                if (serviceDescriptionElement2 != null) {
                    long j9 = serviceDescriptionElement2.f9326b;
                    if (j9 != -9223372036854775807L) {
                        jM3237c = j9;
                        j5 = -9223372036854775807L;
                    } else {
                        jM3237c = C.m3237c(jM3236b4 - j7);
                        if (jM3237c < 0 && jM3237c2 > 0) {
                            jM3237c = 0;
                        }
                        j4 = this.f28322K.f9256c;
                        j5 = -9223372036854775807L;
                        if (j4 != -9223372036854775807L) {
                            jM3237c = Math.min(jM3237c + j4, jM3237c2);
                        }
                    }
                } else {
                    jM3237c = C.m3237c(jM3236b4 - j7);
                    if (jM3237c < 0) {
                        jM3237c = 0;
                    }
                    j4 = this.f28322K.f9256c;
                    j5 = -9223372036854775807L;
                    if (j4 != -9223372036854775807L) {
                        jM3237c = Math.min(jM3237c + j4, jM3237c2);
                    }
                }
            }
            long jM3122j = this.f28319H.f7513a;
            if (jM3122j == j5) {
                DashManifest dashManifest3 = this.f28322K;
                ServiceDescriptionElement serviceDescriptionElement3 = dashManifest3.f9263j;
                if (serviceDescriptionElement3 != null) {
                    long j10 = serviceDescriptionElement3.f9325a;
                    if (j10 != j5) {
                        jM3122j = j10;
                    } else {
                        jM3122j = dashManifest3.f9260g;
                        if (jM3122j == j5) {
                            jM3122j = this.f28337s;
                        }
                    }
                } else {
                    jM3122j = dashManifest3.f9260g;
                    if (jM3122j == j5) {
                        jM3122j = this.f28337s;
                    }
                }
            }
            if (jM3122j < jM3237c) {
                jM3122j = jM3237c;
            }
            if (jM3122j > jM3237c2) {
                jM3122j = Util6.m3122j(C.m3237c(jM3236b4 - Math.min(5000000L, j7 / 2)), jM3237c, jM3237c2);
            }
            long j11 = jM3122j;
            MediaItem2.f fVar = this.f28330l.f7467c;
            float f3 = fVar.f7516d;
            if (f3 == -3.4028235E38f) {
                ServiceDescriptionElement serviceDescriptionElement4 = this.f28322K.f9263j;
                if (serviceDescriptionElement4 != null) {
                    f3 = serviceDescriptionElement4.f9328d;
                    f = f3;
                } else {
                    f = -3.4028235E38f;
                }
            } else {
                f = f3;
            }
            float f4 = fVar.f7517e;
            if (f4 == -3.4028235E38f) {
                ServiceDescriptionElement serviceDescriptionElement5 = this.f28322K.f9263j;
                if (serviceDescriptionElement5 != null) {
                    f4 = serviceDescriptionElement5.f9329e;
                    f2 = f4;
                } else {
                    f2 = -3.4028235E38f;
                }
            } else {
                f2 = f4;
            }
            this.f28319H = new MediaItem2.f(j11, jM3237c, jM3237c2, f, f2);
            long jM3237c3 = C.m3237c(jM3236b2) + this.f28322K.f9254a;
            long jM3236b5 = jM3236b4 - C.m3236b(this.f28319H.f7513a);
            long jMin2 = Math.min(5000000L, j7 / 2);
            if (jM3236b5 < jMin2) {
                jM3236b5 = jMin2;
            }
            j2 = jM3237c3;
            j3 = jM3236b5;
        } else {
            j2 = -9223372036854775807L;
            j3 = 0;
        }
        long jM3236b6 = jM3236b2 - C.m3236b(period.f9287b);
        DashManifest dashManifest4 = this.f28322K;
        m4147v(new C5873b(dashManifest4.f9254a, j2, this.f28326O, this.f28329R, jM3236b6, j7, j3, dashManifest4, this.f28330l, dashManifest4.f9257d ? this.f28319H : null));
        if (this.f28331m) {
            return;
        }
        this.f28318G.removeCallbacks(this.f28344z);
        if (z2) {
            Handler handler = this.f28318G;
            Runnable runnable = this.f28344z;
            DashManifest dashManifest5 = this.f28322K;
            long jM3135w = Util6.m3135w(this.f28326O);
            int iM4254c2 = dashManifest5.m4254c() - 1;
            Period periodM4253b3 = dashManifest5.m4253b(iM4254c2);
            long jM3236b7 = C.m3236b(periodM4253b3.f9287b);
            long jM4256e3 = dashManifest5.m4256e(iM4254c2);
            long jM3236b8 = C.m3236b(jM3135w);
            long jM3236b9 = C.m3236b(dashManifest5.f9254a);
            long jM3236b10 = C.m3236b(5000L);
            for (int i6 = 0; i6 < periodM4253b3.f9288c.size(); i6++) {
                List<Representation> list3 = periodM4253b3.f9288c.get(i6).f9250c;
                if (!list3.isEmpty() && (dashSegmentIndexMo4284l = list3.get(0).mo4284l()) != null) {
                    long jMo4233d = (dashSegmentIndexMo4284l.mo4233d(jM4256e3, jM3236b8) + (jM3236b9 + jM3236b7)) - jM3236b8;
                    if (jMo4233d < jM3236b10 - 100000 || (jMo4233d > jM3236b10 && jMo4233d < jM3236b10 + 100000)) {
                        jM3236b10 = jMo4233d;
                    }
                }
            }
            boolean z6 = false;
            RoundingMode roundingMode = RoundingMode.CEILING;
            Objects.requireNonNull(roundingMode);
            long j12 = jM3236b10 / 1000;
            long j13 = jM3236b10 - (j12 * 1000);
            if (j13 != 0) {
                int i7 = ((int) ((jM3236b10 ^ 1000) >> 63)) | 1;
                switch (LongMath.f26293a[roundingMode.ordinal()]) {
                    case 1:
                        if (!(j13 == 0)) {
                            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                        }
                        if (z6) {
                            j12 += (long) i7;
                        }
                        break;
                    case 2:
                        if (z6) {
                            j12 += (long) i7;
                        }
                        break;
                    case 3:
                        if (i7 < 0) {
                            z6 = true;
                        }
                        if (z6) {
                            j12 += (long) i7;
                        }
                        break;
                    case 4:
                        z6 = true;
                        if (z6) {
                            j12 += (long) i7;
                        }
                        break;
                    case 5:
                        if (i7 > 0) {
                            z6 = true;
                        }
                        if (z6) {
                            j12 += (long) i7;
                        }
                        break;
                    case 6:
                    case 7:
                    case 8:
                        long jAbs = Math.abs(j13);
                        long jAbs2 = jAbs - (Math.abs(1000L) - jAbs);
                        if (jAbs2 == 0) {
                            z6 = (((j12 & 1) != 0) & (roundingMode == RoundingMode.HALF_EVEN)) | (roundingMode == RoundingMode.HALF_UP);
                        } else if (jAbs2 > 0) {
                            z6 = true;
                        }
                        if (z6) {
                            j12 += (long) i7;
                        }
                        break;
                    default:
                        throw new AssertionError();
                }
            }
            handler.postDelayed(runnable, j12);
        }
        if (this.f28323L) {
            m12624F();
            return;
        }
        if (z) {
            DashManifest dashManifest6 = this.f28322K;
            if (dashManifest6.f9257d) {
                long j14 = dashManifest6.f9258e;
                if (j14 != -9223372036854775807L) {
                    if (j14 == 0) {
                        j14 = 5000;
                    }
                    this.f28318G.postDelayed(this.f28343y, Math.max(0L, (this.f28324M + j14) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m12622D(UtcTimingElement utcTimingElement, ParsingLoadable.a<Long> aVar) {
        m12623E(new ParsingLoadable(this.f28314C, Uri.parse(utcTimingElement.f9336b), 5, aVar), new C5878g(null), 1);
    }

    /* JADX INFO: renamed from: E */
    public final <T> void m12623E(ParsingLoadable<T> parsingLoadable, Loader.b<ParsingLoadable<T>> bVar, int i) {
        this.f28338t.m4110m(new LoadEventInfo(parsingLoadable.f5978a, parsingLoadable.f5979b, this.f28315D.m2902h(parsingLoadable, bVar, i)), parsingLoadable.f5980c);
    }

    /* JADX INFO: renamed from: F */
    public final void m12624F() {
        Uri uri;
        this.f28318G.removeCallbacks(this.f28343y);
        if (this.f28315D.m2898d()) {
            return;
        }
        if (this.f28315D.m2899e()) {
            this.f28323L = true;
            return;
        }
        synchronized (this.f28341w) {
            uri = this.f28320I;
        }
        this.f28323L = false;
        m12623E(new ParsingLoadable(this.f28314C, uri, 4, this.f28339u), this.f28340v, ((DefaultLoadErrorHandlingPolicy) this.f28336r).m3025b(4));
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: a */
    public MediaPeriod mo4084a(MediaSource2.a aVar, Allocator allocator, long j2) {
        int iIntValue = ((Integer) aVar.f8857a).intValue() - this.f28329R;
        MediaSourceEventListener.a aVarM4115r = this.f8982h.m4115r(0, aVar, this.f28322K.m4253b(iIntValue).f9287b);
        DashMediaPeriod dashMediaPeriod = new DashMediaPeriod(this.f28329R + iIntValue, this.f28322K, iIntValue, this.f28333o, this.f28316E, this.f28335q, this.f8983i.m3701g(0, aVar), this.f28336r, aVarM4115r, this.f28326O, this.f28313B, allocator, this.f28334p, this.f28312A);
        this.f28342x.put(dashMediaPeriod.f9175h, dashMediaPeriod);
        return dashMediaPeriod;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: f */
    public MediaItem2 mo4089f() {
        return this.f28330l;
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: h */
    public void mo4091h() throws IOException {
        this.f28313B.mo2896a();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.MediaSource2
    /* JADX INFO: renamed from: j */
    public void mo4093j(MediaPeriod mediaPeriod) {
        DashMediaPeriod dashMediaPeriod = (DashMediaPeriod) mediaPeriod;
        PlayerEmsgHandler playerEmsgHandler = dashMediaPeriod.f9186s;
        playerEmsgHandler.f9240o = true;
        playerEmsgHandler.f9234i.removeCallbacksAndMessages(null);
        for (ChunkSampleStream<DashChunkSource> chunkSampleStream : dashMediaPeriod.f9191x) {
            chunkSampleStream.m4203B(dashMediaPeriod);
        }
        dashMediaPeriod.f9190w = null;
        this.f28342x.remove(dashMediaPeriod.f9175h);
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: u */
    public void mo4132u(TransferListener transferListener) {
        this.f28316E = transferListener;
        this.f28335q.prepare();
        if (this.f28331m) {
            m12621C(false);
            return;
        }
        this.f28314C = this.f28332n.mo2953a();
        this.f28315D = new Loader("Loader:DashMediaSource");
        this.f28318G = Util6.m3124l();
        m12624F();
    }

    @Override // p007c.p190n.p194b.p209b.p243w1.BaseMediaSource
    /* JADX INFO: renamed from: w */
    public void mo4133w() {
        this.f28323L = false;
        this.f28314C = null;
        Loader loader = this.f28315D;
        if (loader != null) {
            loader.m2901g(null);
            this.f28315D = null;
        }
        this.f28324M = 0L;
        this.f28325N = 0L;
        this.f28322K = this.f28331m ? this.f28322K : null;
        this.f28320I = this.f28321J;
        this.f28317F = null;
        Handler handler = this.f28318G;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f28318G = null;
        }
        this.f28326O = -9223372036854775807L;
        this.f28327P = 0;
        this.f28328Q = -9223372036854775807L;
        this.f28329R = 0;
        this.f28342x.clear();
        this.f28335q.release();
    }

    /* JADX INFO: renamed from: y */
    public final void m12625y() {
        boolean z;
        Loader loader = this.f28315D;
        C5872a c5872a = new C5872a();
        synchronized (SntpClient.f6279b) {
            z = SntpClient.f6280c;
        }
        if (z) {
            c5872a.m12627a();
            return;
        }
        if (loader == null) {
            loader = new Loader("SntpClient");
        }
        loader.m2902h(new SntpClient.d(null), new SntpClient.c(c5872a), 1);
    }

    /* JADX INFO: renamed from: z */
    public void m12626z(ParsingLoadable<?> parsingLoadable, long j2, long j3) {
        long j4 = parsingLoadable.f5978a;
        DataSpec dataSpec = parsingLoadable.f5979b;
        StatsDataSource statsDataSource = parsingLoadable.f5981d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f28336r);
        this.f28338t.m4101d(loadEventInfo, parsingLoadable.f5980c);
    }
}
