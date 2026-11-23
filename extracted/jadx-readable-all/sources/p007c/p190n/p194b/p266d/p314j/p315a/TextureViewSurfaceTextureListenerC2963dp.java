package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.cgfay.media.IMediaPlayer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2217a0;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2243z;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.dp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class TextureViewSurfaceTextureListenerC2963dp extends AbstractC3037fp implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {

    /* JADX INFO: renamed from: h */
    public static final Map<Integer, String> f13343h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3704xp f13344i;

    /* JADX INFO: renamed from: j */
    public final C3741yp f13345j;

    /* JADX INFO: renamed from: k */
    public final boolean f13346k;

    /* JADX INFO: renamed from: l */
    public int f13347l;

    /* JADX INFO: renamed from: m */
    public int f13348m;

    /* JADX INFO: renamed from: n */
    public MediaPlayer f13349n;

    /* JADX INFO: renamed from: o */
    public Uri f13350o;

    /* JADX INFO: renamed from: p */
    public int f13351p;

    /* JADX INFO: renamed from: q */
    public int f13352q;

    /* JADX INFO: renamed from: r */
    public int f13353r;

    /* JADX INFO: renamed from: s */
    public C3630vp f13354s;

    /* JADX INFO: renamed from: t */
    public final boolean f13355t;

    /* JADX INFO: renamed from: u */
    public int f13356u;

    /* JADX INFO: renamed from: v */
    public InterfaceC3000ep f13357v;

    /* JADX INFO: renamed from: w */
    public Integer f13358w;

    static {
        HashMap map = new HashMap();
        f13343h = map;
        map.put(-1004, "MEDIA_ERROR_IO");
        map.put(-1007, "MEDIA_ERROR_MALFORMED");
        map.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        map.put(-110, "MEDIA_ERROR_TIMED_OUT");
        map.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        map.put(100, "MEDIA_ERROR_SERVER_DIED");
        map.put(1, "MEDIA_ERROR_UNKNOWN");
        map.put(1, "MEDIA_INFO_UNKNOWN");
        map.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING), "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        map.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BUFFERING_START), "MEDIA_INFO_BUFFERING_START");
        map.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BUFFERING_END), "MEDIA_INFO_BUFFERING_END");
        map.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), "MEDIA_INFO_BAD_INTERLEAVING");
        map.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_NOT_SEEKABLE), "MEDIA_INFO_NOT_SEEKABLE");
        map.put(Integer.valueOf(IMediaPlayer.MEDIA_INFO_METADATA_UPDATE), "MEDIA_INFO_METADATA_UPDATE");
        map.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        map.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public TextureViewSurfaceTextureListenerC2963dp(Context context, InterfaceC3704xp interfaceC3704xp, boolean z, boolean z2, C3667wp c3667wp, C3741yp c3741yp) {
        super(context);
        this.f13347l = 0;
        this.f13348m = 0;
        this.f13358w = null;
        setSurfaceTextureListener(this);
        this.f13344i = interfaceC3704xp;
        this.f13345j = c3741yp;
        this.f13355t = z;
        this.f13346k = z2;
        c3741yp.m8817a(this);
    }

    /* JADX INFO: renamed from: C */
    public final void m6400C() {
        SurfaceTexture surfaceTexture;
        C2096e.m4590z("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.f13350o == null || surfaceTexture2 == null) {
            return;
        }
        m6402E(false);
        try {
            C2243z c2243z = C2330u.f10884a.f10904s;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f13349n = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.f13349n.setOnCompletionListener(this);
            this.f13349n.setOnErrorListener(this);
            this.f13349n.setOnInfoListener(this);
            this.f13349n.setOnPreparedListener(this);
            this.f13349n.setOnVideoSizeChangedListener(this);
            this.f13353r = 0;
            if (this.f13355t) {
                C3630vp c3630vp = new C3630vp(getContext());
                this.f13354s = c3630vp;
                int width = getWidth();
                int height = getHeight();
                c3630vp.f20891s = width;
                c3630vp.f20890r = height;
                c3630vp.f20893u = surfaceTexture2;
                this.f13354s.start();
                C3630vp c3630vp2 = this.f13354s;
                if (c3630vp2.f20893u == null) {
                    surfaceTexture = null;
                } else {
                    try {
                        c3630vp2.f20898z.await();
                    } catch (InterruptedException unused) {
                    }
                    surfaceTexture = c3630vp2.f20892t;
                }
                if (surfaceTexture != null) {
                    surfaceTexture2 = surfaceTexture;
                } else {
                    this.f13354s.m8580b();
                    this.f13354s = null;
                }
            }
            this.f13349n.setDataSource(getContext(), this.f13350o);
            C2217a0 c2217a0 = C2330u.f10884a.f10905t;
            this.f13349n.setSurface(new Surface(surfaceTexture2));
            this.f13349n.setAudioStreamType(3);
            this.f13349n.setScreenOnWhilePlaying(true);
            this.f13349n.prepareAsync();
            m6404G(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e) {
            String strValueOf = String.valueOf(this.f13350o);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(strValueOf);
            C2622l.m5241D3(sb.toString(), e);
            onError(this.f13349n, 1, 0);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m6401D() {
        if (this.f13346k && m6403F() && this.f13349n.getCurrentPosition() > 0 && this.f13348m != 3) {
            C2096e.m4590z("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer = this.f13349n;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                C2622l.m5226A3("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.f13349n.start();
            int currentPosition = this.f13349n.getCurrentPosition();
            long jMo5623c = C2330u.f10884a.f10896k.mo5623c();
            while (m6403F() && this.f13349n.getCurrentPosition() == currentPosition && C2330u.f10884a.f10896k.mo5623c() - jMo5623c <= 250) {
            }
            this.f13349n.pause();
            mo5839l();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m6402E(boolean z) {
        C2096e.m4590z("AdMediaPlayerView release");
        C3630vp c3630vp = this.f13354s;
        if (c3630vp != null) {
            c3630vp.m8580b();
            this.f13354s = null;
        }
        MediaPlayer mediaPlayer = this.f13349n;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f13349n.release();
            this.f13349n = null;
            m6404G(0);
            if (z) {
                this.f13348m = 0;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m6403F() {
        int i;
        return (this.f13349n == null || (i = this.f13347l) == -1 || i == 0 || i == 1) ? false : true;
    }

    /* JADX INFO: renamed from: G */
    public final void m6404G(int i) {
        if (i == 3) {
            this.f13345j.m8821e();
            C2889bq c2889bq = this.f14088g;
            c2889bq.f12772d = true;
            c2889bq.m6070b();
        } else if (this.f13347l == 3) {
            this.f13345j.f21960m = false;
            this.f14088g.m6069a();
        }
        this.f13347l = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: e */
    public final String mo6405e() {
        String str = true != this.f13355t ? "" : " spherical";
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: g */
    public final void mo6406g(InterfaceC3000ep interfaceC3000ep) {
        this.f13357v = interfaceC3000ep;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: h */
    public final void mo6407h(String str) {
        Uri uri = Uri.parse(str);
        lr2 lr2VarM7611H = lr2.m7611H(uri);
        if (lr2VarM7611H == null || lr2VarM7611H.f16474f != null) {
            if (lr2VarM7611H != null) {
                uri = Uri.parse(lr2VarM7611H.f16474f);
            }
            this.f13350o = uri;
            this.f13356u = 0;
            m6400C();
            requestLayout();
            invalidate();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: i */
    public final void mo6408i() {
        C2096e.m4590z("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.f13349n;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f13349n.release();
            this.f13349n = null;
            m6404G(0);
            this.f13348m = 0;
        }
        this.f13345j.m8819c();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: j */
    public final void mo6409j() {
        C2096e.m4590z("AdMediaPlayerView play");
        if (m6403F()) {
            this.f13349n.start();
            m6404G(3);
            this.f14087f.f19018c = true;
            C2267h1.f10713a.post(new RunnableC2888bp(this));
        }
        this.f13348m = 3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: k */
    public final void mo6410k() {
        C2096e.m4590z("AdMediaPlayerView pause");
        if (m6403F() && this.f13349n.isPlaying()) {
            this.f13349n.pause();
            m6404G(4);
            C2267h1.f10713a.post(new RunnableC2926cp(this));
        }
        this.f13348m = 4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2852aq
    /* JADX INFO: renamed from: l */
    public final void mo5839l() {
        C2889bq c2889bq = this.f14088g;
        float f = c2889bq.f12771c ? c2889bq.f12773e ? 0.0f : c2889bq.f12774f : 0.0f;
        MediaPlayer mediaPlayer = this.f13349n;
        if (mediaPlayer == null) {
            C2622l.m5226A3("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        } else {
            try {
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: m */
    public final int mo6411m() {
        if (m6403F()) {
            return this.f13349n.getDuration();
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: n */
    public final int mo6412n() {
        if (m6403F()) {
            return this.f13349n.getCurrentPosition();
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: o */
    public final void mo6413o(int i) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i);
        C2096e.m4590z(sb.toString());
        if (!m6403F()) {
            this.f13356u = i;
        } else {
            this.f13349n.seekTo(i);
            this.f13356u = 0;
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.f13353r = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        C2096e.m4590z("AdMediaPlayerView completion");
        m6404G(5);
        this.f13348m = 5;
        C2267h1.f10713a.post(new RunnableC3666wo(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f13343h;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C2622l.m5226A3(sb.toString());
        m6404G(-1);
        this.f13348m = -1;
        C2267h1.f10713a.post(new RunnableC3703xo(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        Map<Integer, String> map = f13343h;
        String str = map.get(Integer.valueOf(i));
        String str2 = map.get(Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        C2096e.m4590z(sb.toString());
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int defaultSize = TextureView.getDefaultSize(this.f13351p, i);
        int defaultSize2 = TextureView.getDefaultSize(this.f13352q, i2);
        if (this.f13351p > 0 && this.f13352q > 0 && this.f13354s == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                if (mode == 1073741824) {
                    i6 = (this.f13352q * size) / this.f13351p;
                    if (mode2 == Integer.MIN_VALUE || i6 <= size2) {
                        defaultSize2 = i6;
                        defaultSize = size;
                    }
                    defaultSize = size;
                    defaultSize2 = size2;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.f13351p * size2) / this.f13352q;
                        if (mode != Integer.MIN_VALUE && i5 > size) {
                            defaultSize = size;
                        }
                        defaultSize2 = size2;
                    } else {
                        i3 = this.f13351p;
                        i4 = this.f13352q;
                        if (mode2 == Integer.MIN_VALUE || i4 <= size2) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = (size2 * i3) / i4;
                        }
                        if (mode == Integer.MIN_VALUE && i5 > size) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            } else if (mode2 == 1073741824) {
                int i7 = this.f13351p;
                int i8 = i7 * size2;
                int i9 = this.f13352q;
                int i10 = size * i9;
                if (i8 < i10) {
                    defaultSize = i8 / i9;
                } else {
                    if (i8 > i10) {
                        defaultSize2 = i10 / i7;
                        defaultSize = size;
                    }
                    defaultSize = size;
                }
                defaultSize2 = size2;
            } else {
                mode = 1073741824;
                if (mode == 1073741824) {
                    i6 = (this.f13352q * size) / this.f13351p;
                    if (mode2 == Integer.MIN_VALUE) {
                    }
                    defaultSize2 = i6;
                    defaultSize = size;
                } else {
                    if (mode2 == 1073741824) {
                        i5 = (this.f13351p * size2) / this.f13352q;
                        if (mode != Integer.MIN_VALUE) {
                        }
                    } else {
                        i3 = this.f13351p;
                        i4 = this.f13352q;
                        if (mode2 == Integer.MIN_VALUE) {
                            i5 = i3;
                            size2 = i4;
                        } else {
                            i5 = i3;
                            size2 = i4;
                        }
                        if (mode == Integer.MIN_VALUE) {
                            defaultSize2 = (i4 * size) / i3;
                            defaultSize = size;
                        }
                    }
                    defaultSize = i5;
                    defaultSize2 = size2;
                }
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        C3630vp c3630vp = this.f13354s;
        if (c3630vp != null) {
            c3630vp.m8579a(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        C2096e.m4590z("AdMediaPlayerView prepared");
        m6404G(2);
        this.f13345j.m8818b();
        C2267h1.f10713a.post(new RunnableC3629vo(this, mediaPlayer));
        this.f13351p = mediaPlayer.getVideoWidth();
        this.f13352q = mediaPlayer.getVideoHeight();
        int i = this.f13356u;
        if (i != 0) {
            mo6413o(i);
        }
        m6401D();
        int i2 = this.f13351p;
        int i3 = this.f13352q;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        C2622l.m5458x3(sb.toString());
        if (this.f13348m == 3) {
            mo6409j();
        }
        mo5839l();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C2096e.m4590z("AdMediaPlayerView surface created");
        m6400C();
        C2267h1.f10713a.post(new RunnableC3740yo(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2096e.m4590z("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.f13349n;
        if (mediaPlayer != null && this.f13356u == 0) {
            this.f13356u = mediaPlayer.getCurrentPosition();
        }
        C3630vp c3630vp = this.f13354s;
        if (c3630vp != null) {
            c3630vp.m8580b();
        }
        C2267h1.f10713a.post(new RunnableC2851ap(this));
        m6402E(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C2096e.m4590z("AdMediaPlayerView surface changed");
        int i3 = this.f13348m;
        boolean z = false;
        if (this.f13351p == i && this.f13352q == i2) {
            z = true;
        }
        if (this.f13349n != null && i3 == 3 && z) {
            int i4 = this.f13356u;
            if (i4 != 0) {
                mo6413o(i4);
            }
            mo6409j();
        }
        C3630vp c3630vp = this.f13354s;
        if (c3630vp != null) {
            c3630vp.m8579a(i, i2);
        }
        C2267h1.f10713a.post(new RunnableC3777zo(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13345j.m8820d(this);
        this.f14087f.m8317a(surfaceTexture, this.f13357v);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        C2096e.m4590z(sb.toString());
        this.f13351p = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.f13352q = videoHeight;
        if (this.f13351p == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i);
        C2096e.m4590z(sb.toString());
        C2267h1.f10713a.post(new Runnable(this, i) { // from class: c.n.b.d.j.a.uo

            /* JADX INFO: renamed from: f */
            public final TextureViewSurfaceTextureListenerC2963dp f20384f;

            /* JADX INFO: renamed from: g */
            public final int f20385g;

            {
                this.f20384f = this;
                this.f20385g = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TextureViewSurfaceTextureListenerC2963dp textureViewSurfaceTextureListenerC2963dp = this.f20384f;
                int i2 = this.f20385g;
                InterfaceC3000ep interfaceC3000ep = textureViewSurfaceTextureListenerC2963dp.f13357v;
                if (interfaceC3000ep != null) {
                    ((C3333np) interfaceC3000ep).onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: p */
    public final void mo6414p(float f, float f2) {
        C3630vp c3630vp = this.f13354s;
        if (c3630vp != null) {
            c3630vp.m8581c(f, f2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: q */
    public final int mo6415q() {
        MediaPlayer mediaPlayer = this.f13349n;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: r */
    public final int mo6416r() {
        MediaPlayer mediaPlayer = this.f13349n;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: s */
    public final long mo6417s() {
        if (this.f13358w != null) {
            return (mo6419u() * ((long) this.f13353r)) / 100;
        }
        return -1L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: t */
    public final long mo6418t() {
        return 0L;
    }

    @Override // android.view.View
    public final String toString() {
        String name = TextureViewSurfaceTextureListenerC2963dp.class.getName();
        String hexString = Integer.toHexString(hashCode());
        return outline.m1552C(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: u */
    public final long mo6419u() {
        if (this.f13358w != null) {
            return ((long) (m6403F() ? this.f13349n.getDuration() : -1)) * ((long) this.f13358w.intValue());
        }
        return -1L;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3037fp
    /* JADX INFO: renamed from: v */
    public final int mo6420v() {
        if (Build.VERSION.SDK_INT < 26 || !m6403F()) {
            return -1;
        }
        return this.f13349n.getMetrics().getInt("android.media.mediaplayer.dropped");
    }
}
