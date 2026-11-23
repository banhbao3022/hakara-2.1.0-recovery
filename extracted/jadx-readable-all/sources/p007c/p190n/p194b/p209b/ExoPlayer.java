package p007c.p190n.p194b.p209b;

import android.content.Context;
import android.os.Looper;
import p007c.p190n.p194b.p209b.p210a2.BandwidthMeter;
import p007c.p190n.p194b.p209b.p210a2.DefaultBandwidthMeter;
import p007c.p190n.p194b.p209b.p212b2.Clock2;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p214m1.AnalyticsCollector;
import p007c.p190n.p194b.p209b.p243w1.DefaultMediaSourceFactory;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;
import p007c.p190n.p194b.p209b.p243w1.MediaSourceFactory;
import p007c.p190n.p194b.p209b.p262y1.DefaultTrackSelector;
import p007c.p190n.p194b.p209b.p262y1.TrackSelector;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p380b.ImmutableListMultimap;

/* JADX INFO: renamed from: c.n.b.b.h0, reason: use source file name */
/* JADX INFO: compiled from: ExoPlayer.java */
/* JADX INFO: loaded from: classes.dex */
public interface ExoPlayer extends Player2 {
    /* JADX INFO: renamed from: a */
    void mo3366a(MediaSource2 mediaSource2);

    /* JADX INFO: renamed from: q */
    PlayerMessage mo3367q(PlayerMessage.b bVar);

    /* JADX INFO: renamed from: c.n.b.b.h0$a */
    /* JADX INFO: compiled from: ExoPlayer.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Renderer2[] f6621a;

        /* JADX INFO: renamed from: b */
        public Clock2 f6622b;

        /* JADX INFO: renamed from: c */
        public TrackSelector f6623c;

        /* JADX INFO: renamed from: d */
        public MediaSourceFactory f6624d;

        /* JADX INFO: renamed from: e */
        public LoadControl f6625e;

        /* JADX INFO: renamed from: f */
        public BandwidthMeter f6626f;

        /* JADX INFO: renamed from: g */
        public Looper f6627g;

        /* JADX INFO: renamed from: h */
        public AnalyticsCollector f6628h;

        /* JADX INFO: renamed from: i */
        public boolean f6629i;

        /* JADX INFO: renamed from: j */
        public SeekParameters f6630j;

        /* JADX INFO: renamed from: k */
        public long f6631k;

        /* JADX INFO: renamed from: l */
        public LivePlaybackSpeedControl f6632l;

        /* JADX INFO: renamed from: m */
        public boolean f6633m;

        public a(Context context, Renderer2... renderer2Arr) {
            DefaultBandwidthMeter defaultBandwidthMeter;
            DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(context);
            DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(context);
            DefaultLoadControl defaultLoadControl = new DefaultLoadControl();
            ImmutableListMultimap<String, Integer> immutableListMultimap = DefaultBandwidthMeter.f6165a;
            synchronized (DefaultBandwidthMeter.class) {
                if (DefaultBandwidthMeter.f6171g == null) {
                    DefaultBandwidthMeter.a aVar = new DefaultBandwidthMeter.a(context);
                    DefaultBandwidthMeter.f6171g = new DefaultBandwidthMeter(aVar.f6185a, aVar.f6186b, aVar.f6187c, aVar.f6188d, aVar.f6189e);
                }
                defaultBandwidthMeter = DefaultBandwidthMeter.f6171g;
            }
            this(renderer2Arr, defaultTrackSelector, defaultMediaSourceFactory, defaultLoadControl, defaultBandwidthMeter);
        }

        public a(Renderer2[] renderer2Arr, TrackSelector trackSelector, MediaSourceFactory mediaSourceFactory, LoadControl loadControl, BandwidthMeter bandwidthMeter) {
            C2096e.m4566b(renderer2Arr.length > 0);
            this.f6621a = renderer2Arr;
            this.f6623c = trackSelector;
            this.f6624d = mediaSourceFactory;
            this.f6625e = loadControl;
            this.f6626f = bandwidthMeter;
            this.f6627g = Util6.m3132t();
            this.f6629i = true;
            this.f6630j = SeekParameters.f6737b;
            DefaultLivePlaybackSpeedControl.b bVar = new DefaultLivePlaybackSpeedControl.b();
            this.f6632l = new DefaultLivePlaybackSpeedControl(bVar.f6564a, bVar.f6565b, bVar.f6566c, bVar.f6567d, bVar.f6568e, bVar.f6569f, bVar.f6570g, null);
            this.f6622b = Clock2.f6300a;
            this.f6631k = 500L;
        }
    }
}
