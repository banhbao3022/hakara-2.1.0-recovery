package p007c.p190n.p194b.p209b.p243w1.p248w0.p249w;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p209b.C;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.DefaultLoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.HttpDataSource;
import p007c.p190n.p194b.p209b.p210a2.LoadErrorHandlingPolicy;
import p007c.p190n.p194b.p209b.p210a2.Loader;
import p007c.p190n.p194b.p209b.p210a2.ParsingLoadable;
import p007c.p190n.p194b.p209b.p210a2.StatsDataSource;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.LoadEventInfo;
import p007c.p190n.p194b.p209b.p243w1.MediaLoadData;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceEventListener;
import p007c.p190n.p194b.p209b.p243w1.SinglePeriodTimeline;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsDataSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.p248w0.HlsManifest;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.w1.w0.w.d, reason: use source file name */
/* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultHlsPlaylistTracker implements HlsPlaylistTracker, Loader.b<ParsingLoadable<HlsPlaylist>> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f9523f = 0;

    /* JADX INFO: renamed from: g */
    public final HlsDataSourceFactory f9524g;

    /* JADX INFO: renamed from: h */
    public final HlsPlaylistParserFactory f9525h;

    /* JADX INFO: renamed from: i */
    public final LoadErrorHandlingPolicy f9526i;

    /* JADX INFO: renamed from: j */
    public final HashMap<Uri, a> f9527j;

    /* JADX INFO: renamed from: k */
    public final List<HlsPlaylistTracker.b> f9528k;

    /* JADX INFO: renamed from: l */
    public final double f9529l;

    /* JADX INFO: renamed from: m */
    public MediaSourceEventListener.a f9530m;

    /* JADX INFO: renamed from: n */
    public Loader f9531n;

    /* JADX INFO: renamed from: o */
    public Handler f9532o;

    /* JADX INFO: renamed from: p */
    public HlsPlaylistTracker.e f9533p;

    /* JADX INFO: renamed from: q */
    public HlsMasterPlaylist f9534q;

    /* JADX INFO: renamed from: r */
    public Uri f9535r;

    /* JADX INFO: renamed from: s */
    public HlsMediaPlaylist f9536s;

    /* JADX INFO: renamed from: t */
    public boolean f9537t;

    /* JADX INFO: renamed from: u */
    public long f9538u;

    /* JADX INFO: renamed from: c.n.b.b.w1.w0.w.d$a */
    /* JADX INFO: compiled from: DefaultHlsPlaylistTracker.java */
    public final class a implements Loader.b<ParsingLoadable<HlsPlaylist>> {

        /* JADX INFO: renamed from: f */
        public final Uri f9539f;

        /* JADX INFO: renamed from: g */
        public final Loader f9540g = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: h */
        public final DataSource3 f9541h;

        /* JADX INFO: renamed from: i */
        public HlsMediaPlaylist f9542i;

        /* JADX INFO: renamed from: j */
        public long f9543j;

        /* JADX INFO: renamed from: k */
        public long f9544k;

        /* JADX INFO: renamed from: l */
        public long f9545l;

        /* JADX INFO: renamed from: m */
        public long f9546m;

        /* JADX INFO: renamed from: n */
        public boolean f9547n;

        /* JADX INFO: renamed from: o */
        public IOException f9548o;

        public a(Uri uri) {
            this.f9539f = uri;
            this.f9541h = DefaultHlsPlaylistTracker.this.f9524g.mo4296a(4);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0052 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        /* JADX INFO: renamed from: a */
        public final boolean m4340a(long j2) {
            boolean z;
            this.f9546m = SystemClock.elapsedRealtime() + j2;
            if (!this.f9539f.equals(DefaultHlsPlaylistTracker.this.f9535r)) {
                return false;
            }
            DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = DefaultHlsPlaylistTracker.this;
            List<HlsMasterPlaylist.b> list = defaultHlsPlaylistTracker.f9534q.f9554f;
            int size = list.size();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            for (int i = 0; i < size; i++) {
                a aVar = defaultHlsPlaylistTracker.f9527j.get(list.get(i).f9566a);
                Objects.requireNonNull(aVar);
                if (jElapsedRealtime > aVar.f9546m) {
                    Uri uri = aVar.f9539f;
                    defaultHlsPlaylistTracker.f9535r = uri;
                    aVar.m4342c(defaultHlsPlaylistTracker.m4337d(uri));
                    z = true;
                    if (z) {
                        return false;
                    }
                    return true;
                }
            }
            z = false;
            if (z) {
                return true;
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final void m4341b(Uri uri) {
            DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = DefaultHlsPlaylistTracker.this;
            ParsingLoadable parsingLoadable = new ParsingLoadable(this.f9541h, uri, 4, defaultHlsPlaylistTracker.f9525h.mo4332a(defaultHlsPlaylistTracker.f9534q, this.f9542i));
            DefaultHlsPlaylistTracker.this.f9530m.m4110m(new LoadEventInfo(parsingLoadable.f5978a, parsingLoadable.f5979b, this.f9540g.m2902h(parsingLoadable, this, ((DefaultLoadErrorHandlingPolicy) DefaultHlsPlaylistTracker.this.f9526i).m3025b(parsingLoadable.f5980c))), parsingLoadable.f5980c);
        }

        /* JADX INFO: renamed from: c */
        public final void m4342c(final Uri uri) {
            this.f9546m = 0L;
            if (this.f9547n || this.f9540g.m2899e() || this.f9540g.m2898d()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.f9545l;
            if (jElapsedRealtime >= j2) {
                m4341b(uri);
            } else {
                this.f9547n = true;
                DefaultHlsPlaylistTracker.this.f9532o.postDelayed(new Runnable() { // from class: c.n.b.b.w1.w0.w.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultHlsPlaylistTracker.a aVar = this.f9520f;
                        Uri uri2 = uri;
                        aVar.f9547n = false;
                        aVar.m4341b(uri2);
                    }
                }, j2 - jElapsedRealtime);
            }
        }

        /* JADX WARN: Code duplicated, block: B:143:0x0396 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:144:0x0398  */
        /* JADX WARN: Code duplicated, block: B:145:0x039b  */
        /* JADX WARN: Code duplicated, block: B:147:0x03a2  */
        /* JADX WARN: Code duplicated, block: B:154:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:156:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:158:0x03d1  */
        /* JADX WARN: Code duplicated, block: B:163:0x03e5  */
        /* JADX WARN: Code duplicated, block: B:165:0x03f3  */
        /* JADX WARN: Code duplicated, block: B:167:0x0413  */
        /* JADX WARN: Code duplicated, block: B:169:0x041f  */
        /* JADX WARN: Code duplicated, block: B:175:0x0443  */
        /* JADX WARN: Code duplicated, block: B:177:0x0447  */
        /* JADX WARN: Code duplicated, block: B:178:0x044a  */
        /* JADX WARN: Code duplicated, block: B:186:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:187:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x0053  */
        /* JADX INFO: renamed from: d */
        public final void m4343d(HlsMediaPlaylist hlsMediaPlaylist, LoadEventInfo loadEventInfo) {
            boolean z;
            long jM4346b;
            int i;
            HlsMediaPlaylist.d dVarM4335b;
            HlsMediaPlaylist hlsMediaPlaylist2;
            HlsMediaPlaylist hlsMediaPlaylist3;
            long j2;
            boolean z2;
            HlsMediaPlaylist hlsMediaPlaylist4;
            HlsMediaPlaylist.f fVar;
            Uri.Builder builderBuildUpon;
            HlsMediaPlaylist hlsMediaPlaylist5;
            HlsMediaPlaylist.f fVar2;
            Uri uriBuild;
            String str;
            HlsMediaPlaylist hlsMediaPlaylist6;
            List<HlsMediaPlaylist.b> list;
            int size;
            long j3;
            SinglePeriodTimeline singlePeriodTimeline;
            long j4;
            long jM3236b;
            long j5;
            int size2;
            int size3;
            int size4;
            HlsMediaPlaylist hlsMediaPlaylist7 = this.f9542i;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f9543j = jElapsedRealtime;
            DefaultHlsPlaylistTracker defaultHlsPlaylistTracker = DefaultHlsPlaylistTracker.this;
            int i2 = DefaultHlsPlaylistTracker.f9523f;
            Objects.requireNonNull(defaultHlsPlaylistTracker);
            Objects.requireNonNull(hlsMediaPlaylist);
            if (hlsMediaPlaylist7 != null) {
                long j6 = hlsMediaPlaylist.f9577i;
                long j7 = hlsMediaPlaylist7.f9577i;
                if (j6 <= j7 && (j6 < j7 || ((size2 = hlsMediaPlaylist.f9584p.size() - hlsMediaPlaylist7.f9584p.size()) == 0 ? !((size3 = hlsMediaPlaylist.f9585q.size()) > (size4 = hlsMediaPlaylist7.f9585q.size()) || (size3 == size4 && hlsMediaPlaylist.f9581m && !hlsMediaPlaylist7.f9581m)) : size2 <= 0))) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            if (z) {
                if (hlsMediaPlaylist.f9582n) {
                    jM4346b = hlsMediaPlaylist.f9574f;
                } else {
                    HlsMediaPlaylist hlsMediaPlaylist8 = defaultHlsPlaylistTracker.f9536s;
                    jM4346b = hlsMediaPlaylist8 != null ? hlsMediaPlaylist8.f9574f : 0L;
                    if (hlsMediaPlaylist7 != null) {
                        int size5 = hlsMediaPlaylist7.f9584p.size();
                        HlsMediaPlaylist.d dVarM4335b2 = DefaultHlsPlaylistTracker.m4335b(hlsMediaPlaylist7, hlsMediaPlaylist);
                        if (dVarM4335b2 != null) {
                            jM4346b = hlsMediaPlaylist7.f9574f + dVarM4335b2.f9599j;
                        } else if (size5 == hlsMediaPlaylist.f9577i - hlsMediaPlaylist7.f9577i) {
                            jM4346b = hlsMediaPlaylist7.m4346b();
                        }
                    }
                }
                long j8 = jM4346b;
                if (hlsMediaPlaylist.f9575g) {
                    i = hlsMediaPlaylist.f9576h;
                } else {
                    HlsMediaPlaylist hlsMediaPlaylist9 = defaultHlsPlaylistTracker.f9536s;
                    i = hlsMediaPlaylist9 != null ? hlsMediaPlaylist9.f9576h : 0;
                    if (hlsMediaPlaylist7 != null && (dVarM4335b = DefaultHlsPlaylistTracker.m4335b(hlsMediaPlaylist7, hlsMediaPlaylist)) != null) {
                        i = (hlsMediaPlaylist7.f9576h + dVarM4335b.f9598i) - hlsMediaPlaylist.f9584p.get(0).f9598i;
                    }
                }
                hlsMediaPlaylist2 = new HlsMediaPlaylist(hlsMediaPlaylist.f9572d, hlsMediaPlaylist.f9611a, hlsMediaPlaylist.f9612b, hlsMediaPlaylist.f9573e, j8, true, i, hlsMediaPlaylist.f9577i, hlsMediaPlaylist.f9578j, hlsMediaPlaylist.f9579k, hlsMediaPlaylist.f9580l, hlsMediaPlaylist.f9613c, hlsMediaPlaylist.f9581m, hlsMediaPlaylist.f9582n, hlsMediaPlaylist.f9583o, hlsMediaPlaylist.f9584p, hlsMediaPlaylist.f9585q, hlsMediaPlaylist.f9588t, hlsMediaPlaylist.f9586r);
            } else {
                hlsMediaPlaylist2 = (!hlsMediaPlaylist.f9581m || hlsMediaPlaylist7.f9581m) ? hlsMediaPlaylist7 : new HlsMediaPlaylist(hlsMediaPlaylist7.f9572d, hlsMediaPlaylist7.f9611a, hlsMediaPlaylist7.f9612b, hlsMediaPlaylist7.f9573e, hlsMediaPlaylist7.f9574f, hlsMediaPlaylist7.f9575g, hlsMediaPlaylist7.f9576h, hlsMediaPlaylist7.f9577i, hlsMediaPlaylist7.f9578j, hlsMediaPlaylist7.f9579k, hlsMediaPlaylist7.f9580l, hlsMediaPlaylist7.f9613c, true, hlsMediaPlaylist7.f9582n, hlsMediaPlaylist7.f9583o, hlsMediaPlaylist7.f9584p, hlsMediaPlaylist7.f9585q, hlsMediaPlaylist7.f9588t, hlsMediaPlaylist7.f9586r);
            }
            this.f9542i = hlsMediaPlaylist2;
            if (hlsMediaPlaylist2 == hlsMediaPlaylist7) {
                hlsMediaPlaylist7 = hlsMediaPlaylist7;
                jElapsedRealtime = jElapsedRealtime;
                if (!hlsMediaPlaylist2.f9581m) {
                    long size6 = hlsMediaPlaylist.f9577i + ((long) hlsMediaPlaylist.f9584p.size());
                    HlsMediaPlaylist hlsMediaPlaylist10 = this.f9542i;
                    if (size6 < hlsMediaPlaylist10.f9577i) {
                        this.f9548o = new HlsPlaylistTracker.c(this.f9539f);
                        DefaultHlsPlaylistTracker.m4334a(DefaultHlsPlaylistTracker.this, this.f9539f, -9223372036854775807L);
                    } else if (jElapsedRealtime - this.f9544k > C.m3237c(hlsMediaPlaylist10.f9579k) * DefaultHlsPlaylistTracker.this.f9529l) {
                        this.f9548o = new HlsPlaylistTracker.d(this.f9539f);
                        long jM3024a = ((DefaultLoadErrorHandlingPolicy) DefaultHlsPlaylistTracker.this.f9526i).m3024a(new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(4), this.f9548o, 1));
                        DefaultHlsPlaylistTracker.m4334a(DefaultHlsPlaylistTracker.this, this.f9539f, jM3024a);
                        if (jM3024a != -9223372036854775807L) {
                            m4340a(jM3024a);
                        }
                    }
                }
                hlsMediaPlaylist3 = this.f9542i;
                if (hlsMediaPlaylist3.f9588t.f9610e) {
                    j2 = 0;
                } else {
                    if (hlsMediaPlaylist3 != hlsMediaPlaylist7) {
                        j3 = hlsMediaPlaylist3.f9579k;
                    } else {
                        j3 = hlsMediaPlaylist3.f9579k / 2;
                    }
                    j2 = j3;
                }
                this.f9545l = C.m3237c(j2) + jElapsedRealtime;
                if (this.f9542i.f9580l == -9223372036854775807L || this.f9539f.equals(DefaultHlsPlaylistTracker.this.f9535r)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    hlsMediaPlaylist4 = this.f9542i;
                    if (hlsMediaPlaylist4.f9581m) {
                    }
                    fVar = hlsMediaPlaylist4.f9588t;
                    if (fVar.f9606a == -9223372036854775807L || fVar.f9610e) {
                        builderBuildUpon = this.f9539f.buildUpon();
                        hlsMediaPlaylist5 = this.f9542i;
                        if (hlsMediaPlaylist5.f9588t.f9610e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hlsMediaPlaylist5.f9577i + ((long) hlsMediaPlaylist5.f9584p.size())));
                            hlsMediaPlaylist6 = this.f9542i;
                            if (hlsMediaPlaylist6.f9580l != -9223372036854775807L) {
                                list = hlsMediaPlaylist6.f9585q;
                                size = list.size();
                                if (!list.isEmpty() && ((HlsMediaPlaylist.b) C4799a.m10965P(list)).f9590r) {
                                    size--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                            }
                        }
                        fVar2 = this.f9542i.f9588t;
                        if (fVar2.f9606a != -9223372036854775807L) {
                            if (fVar2.f9607b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    } else {
                        uriBuild = this.f9539f;
                    }
                    m4342c(uriBuild);
                }
            }
            this.f9548o = null;
            this.f9544k = jElapsedRealtime;
            DefaultHlsPlaylistTracker defaultHlsPlaylistTracker2 = DefaultHlsPlaylistTracker.this;
            if (this.f9539f.equals(defaultHlsPlaylistTracker2.f9535r)) {
                if (defaultHlsPlaylistTracker2.f9536s == null) {
                    defaultHlsPlaylistTracker2.f9537t = !hlsMediaPlaylist2.f9581m;
                    defaultHlsPlaylistTracker2.f9538u = hlsMediaPlaylist2.f9574f;
                }
                defaultHlsPlaylistTracker2.f9536s = hlsMediaPlaylist2;
                HlsMediaSource hlsMediaSource = (HlsMediaSource) defaultHlsPlaylistTracker2.f9533p;
                Objects.requireNonNull(hlsMediaSource);
                long jM3237c = hlsMediaPlaylist2.f9582n ? C.m3237c(hlsMediaPlaylist2.f9574f) : -9223372036854775807L;
                int i3 = hlsMediaPlaylist2.f9572d;
                long j9 = (i3 == 2 || i3 == 1) ? jM3237c : -9223372036854775807L;
                long j10 = hlsMediaPlaylist2.f9573e;
                HlsMasterPlaylist hlsMasterPlaylist = ((DefaultHlsPlaylistTracker) hlsMediaSource.f28378u).f9534q;
                Objects.requireNonNull(hlsMasterPlaylist);
                HlsManifest hlsManifest = new HlsManifest(hlsMasterPlaylist, hlsMediaPlaylist2);
                if (((DefaultHlsPlaylistTracker) hlsMediaSource.f28378u).f9537t) {
                    long jM3236b2 = hlsMediaPlaylist2.f9582n ? C.m3236b(Util6.m3135w(hlsMediaSource.f28379v)) - hlsMediaPlaylist2.m4346b() : 0L;
                    long j11 = hlsMediaSource.f28381x.f7513a;
                    if (j11 != -9223372036854775807L) {
                        jM3236b = C.m3236b(j11);
                    } else {
                        HlsMediaPlaylist.f fVar3 = hlsMediaPlaylist2.f9588t;
                        long j12 = hlsMediaPlaylist2.f9573e;
                        if (j12 != -9223372036854775807L) {
                            j4 = hlsMediaPlaylist2.f9587s - j12;
                        } else {
                            long j13 = fVar3.f9609d;
                            if (j13 == -9223372036854775807L || hlsMediaPlaylist2.f9580l == -9223372036854775807L) {
                                j4 = fVar3.f9608c;
                                if (j4 == -9223372036854775807L) {
                                    j4 = hlsMediaPlaylist2.f9579k * 3;
                                }
                            } else {
                                j4 = j13;
                            }
                        }
                        jM3236b = j4 + jM3236b2;
                    }
                    long jM3237c2 = C.m3237c(Util6.m3122j(jM3236b, jM3236b2, hlsMediaPlaylist2.f9587s + jM3236b2));
                    if (jM3237c2 != hlsMediaSource.f28381x.f7513a) {
                        MediaItem2.c cVarM3707a = hlsMediaSource.f28380w.m3707a();
                        cVarM3707a.f7497x = jM3237c2;
                        hlsMediaSource.f28381x = cVarM3707a.m3708a().f7467c;
                    }
                    long j14 = hlsMediaPlaylist2.f9574f - ((DefaultHlsPlaylistTracker) hlsMediaSource.f28378u).f9538u;
                    long j15 = hlsMediaPlaylist2.f9581m ? hlsMediaPlaylist2.f9587s + j14 : -9223372036854775807L;
                    if (hlsMediaPlaylist2.f9584p.isEmpty()) {
                        j5 = j10 == -9223372036854775807L ? 0L : j10;
                    } else {
                        List<HlsMediaPlaylist.d> list2 = hlsMediaPlaylist2.f9584p;
                        int size7 = list2.size() - 1;
                        long jM3236b3 = (hlsMediaPlaylist2.f9587s + jM3236b2) - C.m3236b(hlsMediaSource.f28381x.f7513a);
                        while (size7 > 0 && list2.get(size7).f9599j > jM3236b3) {
                            size7--;
                        }
                        j5 = list2.get(size7).f9599j;
                    }
                    singlePeriodTimeline = new SinglePeriodTimeline(j9, jM3237c, -9223372036854775807L, j15, hlsMediaPlaylist2.f9587s, j14, j5, true, !hlsMediaPlaylist2.f9581m, (Object) hlsManifest, hlsMediaSource.f28380w, hlsMediaSource.f28381x);
                } else {
                    hlsMediaPlaylist7 = hlsMediaPlaylist7;
                    jElapsedRealtime = jElapsedRealtime;
                    long j16 = j10 == -9223372036854775807L ? 0L : j10;
                    long j17 = hlsMediaPlaylist2.f9587s;
                    singlePeriodTimeline = new SinglePeriodTimeline(j9, jM3237c, -9223372036854775807L, j17, j17, 0L, j16, true, false, (Object) hlsManifest, hlsMediaSource.f28380w, (MediaItem2.f) null);
                }
                hlsMediaSource.m4147v(singlePeriodTimeline);
            } else {
                hlsMediaPlaylist7 = hlsMediaPlaylist7;
                jElapsedRealtime = jElapsedRealtime;
            }
            int size8 = defaultHlsPlaylistTracker2.f9528k.size();
            for (int i4 = 0; i4 < size8; i4++) {
                defaultHlsPlaylistTracker2.f9528k.get(i4).mo4311a();
            }
            hlsMediaPlaylist3 = this.f9542i;
            if (hlsMediaPlaylist3.f9588t.f9610e) {
                if (hlsMediaPlaylist3 != hlsMediaPlaylist7) {
                    j3 = hlsMediaPlaylist3.f9579k;
                } else {
                    j3 = hlsMediaPlaylist3.f9579k / 2;
                }
                j2 = j3;
            } else {
                j2 = 0;
            }
            this.f9545l = C.m3237c(j2) + jElapsedRealtime;
            if (this.f9542i.f9580l == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (z2) {
                hlsMediaPlaylist4 = this.f9542i;
                if (hlsMediaPlaylist4.f9581m) {
                    fVar = hlsMediaPlaylist4.f9588t;
                    if (fVar.f9606a == -9223372036854775807L) {
                        builderBuildUpon = this.f9539f.buildUpon();
                        hlsMediaPlaylist5 = this.f9542i;
                        if (hlsMediaPlaylist5.f9588t.f9610e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hlsMediaPlaylist5.f9577i + ((long) hlsMediaPlaylist5.f9584p.size())));
                            hlsMediaPlaylist6 = this.f9542i;
                            if (hlsMediaPlaylist6.f9580l != -9223372036854775807L) {
                                list = hlsMediaPlaylist6.f9585q;
                                size = list.size();
                                if (!list.isEmpty()) {
                                    size--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                            }
                        }
                        fVar2 = this.f9542i.f9588t;
                        if (fVar2.f9606a != -9223372036854775807L) {
                            if (fVar2.f9607b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    } else {
                        builderBuildUpon = this.f9539f.buildUpon();
                        hlsMediaPlaylist5 = this.f9542i;
                        if (hlsMediaPlaylist5.f9588t.f9610e) {
                            builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(hlsMediaPlaylist5.f9577i + ((long) hlsMediaPlaylist5.f9584p.size())));
                            hlsMediaPlaylist6 = this.f9542i;
                            if (hlsMediaPlaylist6.f9580l != -9223372036854775807L) {
                                list = hlsMediaPlaylist6.f9585q;
                                size = list.size();
                                if (!list.isEmpty()) {
                                    size--;
                                }
                                builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                            }
                        }
                        fVar2 = this.f9542i.f9588t;
                        if (fVar2.f9606a != -9223372036854775807L) {
                            if (fVar2.f9607b) {
                                str = "v2";
                            } else {
                                str = "YES";
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_skip", str);
                        }
                        uriBuild = builderBuildUpon.build();
                    }
                    m4342c(uriBuild);
                }
            }
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: k */
        public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
            ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
            long j4 = parsingLoadable.f5978a;
            DataSpec dataSpec = parsingLoadable.f5979b;
            StatsDataSource statsDataSource = parsingLoadable.f5981d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
            Objects.requireNonNull(DefaultHlsPlaylistTracker.this.f9526i);
            DefaultHlsPlaylistTracker.this.f9530m.m4101d(loadEventInfo, 4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: l */
        public void mo2904l(Loader.e eVar, long j2, long j3) {
            ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
            HlsPlaylist hlsPlaylist = (HlsPlaylist) parsingLoadable.f5983f;
            long j4 = parsingLoadable.f5978a;
            DataSpec dataSpec = parsingLoadable.f5979b;
            StatsDataSource statsDataSource = parsingLoadable.f5981d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
            if (hlsPlaylist instanceof HlsMediaPlaylist) {
                m4343d((HlsMediaPlaylist) hlsPlaylist, loadEventInfo);
                DefaultHlsPlaylistTracker.this.f9530m.m4104g(loadEventInfo, 4);
            } else {
                ParserException parserException = new ParserException("Loaded playlist has unexpected type.");
                this.f9548o = parserException;
                DefaultHlsPlaylistTracker.this.f9530m.m4108k(loadEventInfo, 4, parserException, true);
            }
            Objects.requireNonNull(DefaultHlsPlaylistTracker.this.f9526i);
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
        /* JADX INFO: renamed from: t */
        public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
            Loader.c cVarM2895c;
            ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
            long j4 = parsingLoadable.f5978a;
            DataSpec dataSpec = parsingLoadable.f5979b;
            StatsDataSource statsDataSource = parsingLoadable.f5981d;
            LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
            boolean z = iOException instanceof HlsPlaylistParser.a;
            if ((parsingLoadable.f5981d.f5998c.getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof HttpDataSource.f ? ((HttpDataSource.f) iOException).f6242f : Integer.MAX_VALUE;
                if (z || i2 == 400 || i2 == 503) {
                    this.f9545l = SystemClock.elapsedRealtime();
                    m4342c(this.f9539f);
                    MediaSourceEventListener.a aVar = DefaultHlsPlaylistTracker.this.f9530m;
                    int i3 = Util6.f6307a;
                    aVar.m4108k(loadEventInfo, parsingLoadable.f5980c, iOException, true);
                    return Loader.f5958b;
                }
            }
            LoadErrorHandlingPolicy.a aVar2 = new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(parsingLoadable.f5980c), iOException, i);
            long jM3024a = ((DefaultLoadErrorHandlingPolicy) DefaultHlsPlaylistTracker.this.f9526i).m3024a(aVar2);
            boolean z2 = jM3024a != -9223372036854775807L;
            boolean zM4340a = DefaultHlsPlaylistTracker.m4334a(DefaultHlsPlaylistTracker.this, this.f9539f, jM3024a) || !z2;
            if (z2) {
                zM4340a |= m4340a(jM3024a);
            }
            if (zM4340a) {
                long jM3026c = ((DefaultLoadErrorHandlingPolicy) DefaultHlsPlaylistTracker.this.f9526i).m3026c(aVar2);
                cVarM2895c = jM3026c != -9223372036854775807L ? Loader.m2895c(false, jM3026c) : Loader.f5959c;
            } else {
                cVarM2895c = Loader.f5958b;
            }
            boolean zM2906a = true ^ cVarM2895c.m2906a();
            DefaultHlsPlaylistTracker.this.f9530m.m4108k(loadEventInfo, parsingLoadable.f5980c, iOException, zM2906a);
            if (!zM2906a) {
                return cVarM2895c;
            }
            Objects.requireNonNull(DefaultHlsPlaylistTracker.this.f9526i);
            return cVarM2895c;
        }
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory) {
        this(hlsDataSourceFactory, loadErrorHandlingPolicy, hlsPlaylistParserFactory, 3.5d);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4334a(DefaultHlsPlaylistTracker defaultHlsPlaylistTracker, Uri uri, long j2) {
        int size = defaultHlsPlaylistTracker.f9528k.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !defaultHlsPlaylistTracker.f9528k.get(i).mo4312c(uri, j2);
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public static HlsMediaPlaylist.d m4335b(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist hlsMediaPlaylist2) {
        int i = (int) (hlsMediaPlaylist2.f9577i - hlsMediaPlaylist.f9577i);
        List<HlsMediaPlaylist.d> list = hlsMediaPlaylist.f9584p;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public HlsMediaPlaylist m4336c(Uri uri, boolean z) {
        HlsMediaPlaylist hlsMediaPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = this.f9527j.get(uri).f9542i;
        if (hlsMediaPlaylist2 != null && z && !uri.equals(this.f9535r)) {
            List<HlsMasterPlaylist.b> list = this.f9534q.f9554f;
            boolean z2 = false;
            for (int i = 0; i < list.size(); i++) {
                if (uri.equals(list.get(i).f9566a)) {
                    z2 = true;
                    break;
                }
            }
            if (z2 && ((hlsMediaPlaylist = this.f9536s) == null || !hlsMediaPlaylist.f9581m)) {
                this.f9535r = uri;
                this.f9527j.get(uri).m4342c(m4337d(uri));
            }
        }
        return hlsMediaPlaylist2;
    }

    /* JADX INFO: renamed from: d */
    public final Uri m4337d(Uri uri) {
        HlsMediaPlaylist.c cVar;
        HlsMediaPlaylist hlsMediaPlaylist = this.f9536s;
        if (hlsMediaPlaylist == null || !hlsMediaPlaylist.f9588t.f9610e || (cVar = hlsMediaPlaylist.f9586r.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f9591a));
        int i = cVar.f9592b;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    /* JADX INFO: renamed from: e */
    public boolean m4338e(Uri uri) {
        int i;
        a aVar = this.f9527j.get(uri);
        if (aVar.f9542i == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, C.m3237c(aVar.f9542i.f9587s));
        HlsMediaPlaylist hlsMediaPlaylist = aVar.f9542i;
        return hlsMediaPlaylist.f9581m || (i = hlsMediaPlaylist.f9572d) == 2 || i == 1 || aVar.f9543j + jMax > jElapsedRealtime;
    }

    /* JADX INFO: renamed from: f */
    public void m4339f(Uri uri) throws IOException {
        a aVar = this.f9527j.get(uri);
        aVar.f9540g.m2900f(Integer.MIN_VALUE);
        IOException iOException = aVar.f9548o;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: k */
    public void mo2903k(Loader.e eVar, long j2, long j3, boolean z) {
        ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
        long j4 = parsingLoadable.f5978a;
        DataSpec dataSpec = parsingLoadable.f5979b;
        StatsDataSource statsDataSource = parsingLoadable.f5981d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        Objects.requireNonNull(this.f9526i);
        this.f9530m.m4101d(loadEventInfo, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: l */
    public void mo2904l(Loader.e eVar, long j2, long j3) {
        HlsMasterPlaylist hlsMasterPlaylist;
        ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
        HlsPlaylist hlsPlaylist = (HlsPlaylist) parsingLoadable.f5983f;
        boolean z = hlsPlaylist instanceof HlsMediaPlaylist;
        if (z) {
            String str = hlsPlaylist.f9611a;
            HlsMasterPlaylist hlsMasterPlaylist2 = HlsMasterPlaylist.f9552d;
            Uri uri = Uri.parse(str);
            Format.b bVar = new Format.b();
            bVar.f6948a = "0";
            bVar.f6957j = "application/x-mpegURL";
            hlsMasterPlaylist = new HlsMasterPlaylist("", Collections.emptyList(), Collections.singletonList(new HlsMasterPlaylist.b(uri, bVar.m3519a(), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            hlsMasterPlaylist = (HlsMasterPlaylist) hlsPlaylist;
        }
        this.f9534q = hlsMasterPlaylist;
        this.f9535r = hlsMasterPlaylist.f9554f.get(0).f9566a;
        List<Uri> list = hlsMasterPlaylist.f9553e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri2 = list.get(i);
            this.f9527j.put(uri2, new a(uri2));
        }
        long j4 = parsingLoadable.f5978a;
        DataSpec dataSpec = parsingLoadable.f5979b;
        StatsDataSource statsDataSource = parsingLoadable.f5981d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        a aVar = this.f9527j.get(this.f9535r);
        if (z) {
            aVar.m4343d((HlsMediaPlaylist) hlsPlaylist, loadEventInfo);
        } else {
            aVar.m4342c(aVar.f9539f);
        }
        Objects.requireNonNull(this.f9526i);
        this.f9530m.m4104g(loadEventInfo, 4);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.Loader.b
    /* JADX INFO: renamed from: t */
    public Loader.c mo2905t(Loader.e eVar, long j2, long j3, IOException iOException, int i) {
        ParsingLoadable parsingLoadable = (ParsingLoadable) eVar;
        long j4 = parsingLoadable.f5978a;
        DataSpec dataSpec = parsingLoadable.f5979b;
        StatsDataSource statsDataSource = parsingLoadable.f5981d;
        LoadEventInfo loadEventInfo = new LoadEventInfo(j4, dataSpec, statsDataSource.f5998c, statsDataSource.f5999d, j2, j3, statsDataSource.f5997b);
        long jM3026c = ((DefaultLoadErrorHandlingPolicy) this.f9526i).m3026c(new LoadErrorHandlingPolicy.a(loadEventInfo, new MediaLoadData(parsingLoadable.f5980c), iOException, i));
        boolean z = jM3026c == -9223372036854775807L;
        this.f9530m.m4108k(loadEventInfo, parsingLoadable.f5980c, iOException, z);
        if (z) {
            Objects.requireNonNull(this.f9526i);
        }
        return z ? Loader.f5959c : Loader.m2895c(false, jM3026c);
    }

    public DefaultHlsPlaylistTracker(HlsDataSourceFactory hlsDataSourceFactory, LoadErrorHandlingPolicy loadErrorHandlingPolicy, HlsPlaylistParserFactory hlsPlaylistParserFactory, double d) {
        this.f9524g = hlsDataSourceFactory;
        this.f9525h = hlsPlaylistParserFactory;
        this.f9526i = loadErrorHandlingPolicy;
        this.f9529l = d;
        this.f9528k = new ArrayList();
        this.f9527j = new HashMap<>();
        this.f9538u = -9223372036854775807L;
    }
}
