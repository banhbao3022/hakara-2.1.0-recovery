package p007c.p085g.p086a.p089m.p098v.p103h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.RequestBuilder;
import p007c.p085g.p086a.RequestManager;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p108q.RequestOptions;
import p007c.p085g.p086a.p108q.p109h.CustomTarget;
import p007c.p085g.p086a.p108q.p110i.Transition;
import p007c.p085g.p086a.p111r.ObjectKey;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.v.h.g, reason: use source file name */
/* JADX INFO: compiled from: GifFrameLoader.java */
/* JADX INFO: loaded from: classes.dex */
public class GifFrameLoader {

    /* JADX INFO: renamed from: a */
    public final GifDecoder f3630a;

    /* JADX INFO: renamed from: b */
    public final Handler f3631b;

    /* JADX INFO: renamed from: c */
    public final List<b> f3632c;

    /* JADX INFO: renamed from: d */
    public final RequestManager f3633d;

    /* JADX INFO: renamed from: e */
    public final BitmapPool f3634e;

    /* JADX INFO: renamed from: f */
    public boolean f3635f;

    /* JADX INFO: renamed from: g */
    public boolean f3636g;

    /* JADX INFO: renamed from: h */
    public RequestBuilder<Bitmap> f3637h;

    /* JADX INFO: renamed from: i */
    public a f3638i;

    /* JADX INFO: renamed from: j */
    public boolean f3639j;

    /* JADX INFO: renamed from: k */
    public a f3640k;

    /* JADX INFO: renamed from: l */
    public Bitmap f3641l;

    /* JADX INFO: renamed from: m */
    public Transformation<Bitmap> f3642m;

    /* JADX INFO: renamed from: n */
    public a f3643n;

    /* JADX INFO: renamed from: o */
    public int f3644o;

    /* JADX INFO: renamed from: p */
    public int f3645p;

    /* JADX INFO: renamed from: q */
    public int f3646q;

    /* JADX INFO: renamed from: c.g.a.m.v.h.g$a */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    public static class a extends CustomTarget<Bitmap> {

        /* JADX INFO: renamed from: i */
        public final Handler f3647i;

        /* JADX INFO: renamed from: j */
        public final int f3648j;

        /* JADX INFO: renamed from: k */
        public final long f3649k;

        /* JADX INFO: renamed from: l */
        public Bitmap f3650l;

        public a(Handler handler, int i, long j2) {
            this.f3647i = handler;
            this.f3648j = i;
            this.f3649k = j2;
        }

        @Override // p007c.p085g.p086a.p108q.p109h.Target
        /* JADX INFO: renamed from: b */
        public void mo1932b(Object obj, Transition transition) {
            this.f3650l = (Bitmap) obj;
            this.f3647i.sendMessageAtTime(this.f3647i.obtainMessage(1, this), this.f3649k);
        }

        @Override // p007c.p085g.p086a.p108q.p109h.Target
        /* JADX INFO: renamed from: h */
        public void mo1933h(Drawable drawable) {
            this.f3650l = null;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.v.h.g$b */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo1924a();
    }

    /* JADX INFO: renamed from: c.g.a.m.v.h.g$c */
    /* JADX INFO: compiled from: GifFrameLoader.java */
    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                GifFrameLoader.this.m1930b((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            GifFrameLoader.this.f3633d.m1654n((a) message.obj);
            return false;
        }
    }

    public GifFrameLoader(Glide glide, GifDecoder gifDecoder, int i, int i2, Transformation<Bitmap> transformation, Bitmap bitmap) {
        BitmapPool bitmapPool = glide.f2856h;
        RequestManager requestManagerM1627e = Glide.m1627e(glide.f2858j.getBaseContext());
        RequestBuilder<Bitmap> requestBuilderMo1637I = Glide.m1627e(glide.f2858j.getBaseContext()).mo1652l().mo1647a(new RequestOptions().mo1976g(DiskCacheStrategy.f3274a).mo1973F(true).mo1990x(true).mo1984q(i, i2));
        this.f3632c = new ArrayList();
        this.f3633d = requestManagerM1627e;
        Handler handler = new Handler(Looper.getMainLooper(), new c());
        this.f3634e = bitmapPool;
        this.f3631b = handler;
        this.f3637h = requestBuilderMo1637I;
        this.f3630a = gifDecoder;
        m1931c(transformation, bitmap);
    }

    /* JADX INFO: renamed from: a */
    public final void m1929a() {
        if (!this.f3635f || this.f3636g) {
            return;
        }
        a aVar = this.f3643n;
        if (aVar != null) {
            this.f3643n = null;
            m1930b(aVar);
            return;
        }
        this.f3636g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f3630a.getNextDelay());
        this.f3630a.advance();
        this.f3640k = new a(this.f3631b, this.f3630a.getCurrentFrameIndex(), jUptimeMillis);
        this.f3637h.mo1647a(new RequestOptions().mo1989w(new ObjectKey(Double.valueOf(Math.random())))).mo1644P(this.f3630a).m1640L(this.f3640k);
    }

    /* JADX INFO: renamed from: b */
    public void m1930b(a aVar) {
        this.f3636g = false;
        if (this.f3639j) {
            this.f3631b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f3635f) {
            this.f3643n = aVar;
            return;
        }
        if (aVar.f3650l != null) {
            Bitmap bitmap = this.f3641l;
            if (bitmap != null) {
                this.f3634e.mo1752d(bitmap);
                this.f3641l = null;
            }
            a aVar2 = this.f3638i;
            this.f3638i = aVar;
            int size = this.f3632c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.f3632c.get(size).mo1924a();
                }
            }
            if (aVar2 != null) {
                this.f3631b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        m1929a();
    }

    /* JADX INFO: renamed from: c */
    public void m1931c(Transformation<Bitmap> transformation, Bitmap bitmap) {
        Objects.requireNonNull(transformation, "Argument must not be null");
        this.f3642m = transformation;
        Objects.requireNonNull(bitmap, "Argument must not be null");
        this.f3641l = bitmap;
        this.f3637h = this.f3637h.mo1647a(new RequestOptions().m1992z(transformation, true));
        this.f3644o = Util4.m2049d(bitmap);
        this.f3645p = bitmap.getWidth();
        this.f3646q = bitmap.getHeight();
    }
}
