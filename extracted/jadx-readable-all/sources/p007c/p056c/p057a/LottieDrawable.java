package p007c.p056c.p057a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import p007c.p056c.p057a.p058a0.FontAssetManager;
import p007c.p056c.p057a.p058a0.ImageAssetManager;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p059b0.KeyPathElement;
import p007c.p056c.p057a.p059b0.Marker;
import p007c.p056c.p057a.p059b0.p060j.AnimatableTransform;
import p007c.p056c.p057a.p059b0.p062l.CompositionLayer;
import p007c.p056c.p057a.p059b0.p062l.Layer;
import p007c.p056c.p057a.p064d0.LayerParser;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.LogcatLogger;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.LottieValueAnimator;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.l, reason: use source file name */
/* JADX INFO: compiled from: LottieDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieDrawable extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: A */
    public boolean f2394A;

    /* JADX INFO: renamed from: f */
    public final Matrix f2395f = new Matrix();

    /* JADX INFO: renamed from: g */
    public LottieComposition f2396g;

    /* JADX INFO: renamed from: h */
    public final LottieValueAnimator f2397h;

    /* JADX INFO: renamed from: i */
    public float f2398i;

    /* JADX INFO: renamed from: j */
    public boolean f2399j;

    /* JADX INFO: renamed from: k */
    public boolean f2400k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<o> f2401l;

    /* JADX INFO: renamed from: m */
    public final ValueAnimator.AnimatorUpdateListener f2402m;

    /* JADX INFO: renamed from: n */
    public ImageView.ScaleType f2403n;

    /* JADX INFO: renamed from: o */
    public ImageAssetManager f2404o;

    /* JADX INFO: renamed from: p */
    public String f2405p;

    /* JADX INFO: renamed from: q */
    public ImageAssetDelegate f2406q;

    /* JADX INFO: renamed from: r */
    public FontAssetManager f2407r;

    /* JADX INFO: renamed from: s */
    public FontAssetDelegate f2408s;

    /* JADX INFO: renamed from: t */
    public TextDelegate f2409t;

    /* JADX INFO: renamed from: u */
    public boolean f2410u;

    /* JADX INFO: renamed from: v */
    public CompositionLayer f2411v;

    /* JADX INFO: renamed from: w */
    public int f2412w;

    /* JADX INFO: renamed from: x */
    public boolean f2413x;

    /* JADX INFO: renamed from: y */
    public boolean f2414y;

    /* JADX INFO: renamed from: z */
    public boolean f2415z;

    /* JADX INFO: renamed from: c.c.a.l$a */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class a implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2416a;

        public a(String str) {
            this.f2416a = str;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1478q(this.f2416a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$b */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class b implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2418a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2419b;

        public b(int i, int i2) {
            this.f2418a = i;
            this.f2419b = i2;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1477p(this.f2418a, this.f2419b);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$c */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class c implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2421a;

        public c(int i) {
            this.f2421a = i;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1473l(this.f2421a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$d */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class d implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f2423a;

        public d(float f) {
            this.f2423a = f;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1482u(this.f2423a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$e */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class e implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ KeyPath f2425a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Object f2426b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LottieValueCallback f2427c;

        public e(KeyPath keyPath, Object obj, LottieValueCallback lottieValueCallback) {
            this.f2425a = keyPath;
            this.f2426b = obj;
            this.f2427c = lottieValueCallback;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1462a(this.f2425a, this.f2426b, this.f2427c);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$f */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class f implements ValueAnimator.AnimatorUpdateListener {
        public f() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            LottieDrawable lottieDrawable = LottieDrawable.this;
            CompositionLayer compositionLayer = lottieDrawable.f2411v;
            if (compositionLayer != null) {
                compositionLayer.mo1357p(lottieDrawable.f2397h.m1423e());
            }
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$g */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class g implements o {
        public g() {
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1471j();
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$h */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class h implements o {
        public h() {
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1472k();
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$i */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class i implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2432a;

        public i(int i) {
            this.f2432a = i;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1479r(this.f2432a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$j */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class j implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f2434a;

        public j(float f) {
            this.f2434a = f;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1481t(this.f2434a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$k */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class k implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f2436a;

        public k(int i) {
            this.f2436a = i;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1474m(this.f2436a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$l */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class l implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f2438a;

        public l(float f) {
            this.f2438a = f;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1476o(this.f2438a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$m */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class m implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2440a;

        public m(String str) {
            this.f2440a = str;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1480s(this.f2440a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$n */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public class n implements o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2442a;

        public n(String str) {
            this.f2442a = str;
        }

        @Override // p007c.p056c.p057a.LottieDrawable.o
        /* JADX INFO: renamed from: a */
        public void mo1485a(LottieComposition lottieComposition) {
            LottieDrawable.this.m1475n(this.f2442a);
        }
    }

    /* JADX INFO: renamed from: c.c.a.l$o */
    /* JADX INFO: compiled from: LottieDrawable.java */
    public interface o {
        /* JADX INFO: renamed from: a */
        void mo1485a(LottieComposition lottieComposition);
    }

    public LottieDrawable() {
        LottieValueAnimator lottieValueAnimator = new LottieValueAnimator();
        this.f2397h = lottieValueAnimator;
        this.f2398i = 1.0f;
        this.f2399j = true;
        this.f2400k = false;
        new HashSet();
        this.f2401l = new ArrayList<>();
        f fVar = new f();
        this.f2402m = fVar;
        this.f2412w = 255;
        this.f2415z = true;
        this.f2394A = false;
        lottieValueAnimator.f2321f.add(fVar);
    }

    /* JADX INFO: renamed from: a */
    public <T> void m1462a(KeyPath keyPath, T t, LottieValueCallback<T> lottieValueCallback) {
        List listEmptyList;
        CompositionLayer compositionLayer = this.f2411v;
        if (compositionLayer == null) {
            this.f2401l.add(new e(keyPath, t, lottieValueCallback));
            return;
        }
        boolean zIsEmpty = true;
        if (keyPath == KeyPath.f1992a) {
            compositionLayer.mo1338h(t, lottieValueCallback);
        } else {
            KeyPathElement keyPathElement = keyPath.f1994c;
            if (keyPathElement != null) {
                keyPathElement.mo1338h(t, lottieValueCallback);
            } else {
                if (compositionLayer == null) {
                    Logger2.m1420b("Cannot resolve KeyPath. Composition is not set yet.");
                    listEmptyList = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    this.f2411v.mo1337c(keyPath, 0, arrayList, new KeyPath(new String[0]));
                    listEmptyList = arrayList;
                }
                for (int i2 = 0; i2 < listEmptyList.size(); i2++) {
                    ((KeyPath) listEmptyList.get(i2)).f1994c.mo1338h(t, lottieValueCallback);
                }
                zIsEmpty = true ^ listEmptyList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (t == LottieProperty.f2449A) {
                m1482u(m1468g());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1463b() {
        LottieComposition lottieComposition = this.f2396g;
        JsonReader.a aVar = LayerParser.f2305a;
        Rect rect = lottieComposition.f2352j;
        Layer layer = new Layer(Collections.emptyList(), lottieComposition, "__container", -1L, Layer.a.PRE_COMP, -1L, null, Collections.emptyList(), new AnimatableTransform(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), Layer.b.NONE, null, false);
        LottieComposition lottieComposition2 = this.f2396g;
        this.f2411v = new CompositionLayer(this, layer, lottieComposition2.f2351i, lottieComposition2);
    }

    /* JADX INFO: renamed from: c */
    public void m1464c() {
        LottieValueAnimator lottieValueAnimator = this.f2397h;
        if (lottieValueAnimator.f2333p) {
            lottieValueAnimator.cancel();
        }
        this.f2396g = null;
        this.f2411v = null;
        this.f2404o = null;
        LottieValueAnimator lottieValueAnimator2 = this.f2397h;
        lottieValueAnimator2.f2332o = null;
        lottieValueAnimator2.f2330m = -2.1474836E9f;
        lottieValueAnimator2.f2331n = 2.1474836E9f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public final void m1465d(Canvas canvas) {
        float f2;
        float f3;
        int iSave = -1;
        if (ImageView.ScaleType.FIT_XY != this.f2403n) {
            if (this.f2411v == null) {
                return;
            }
            float f4 = this.f2398i;
            float fMin = Math.min(canvas.getWidth() / this.f2396g.f2352j.width(), canvas.getHeight() / this.f2396g.f2352j.height());
            if (f4 > fMin) {
                f2 = this.f2398i / fMin;
            } else {
                fMin = f4;
                f2 = 1.0f;
            }
            if (f2 > 1.0f) {
                iSave = canvas.save();
                float fWidth = this.f2396g.f2352j.width() / 2.0f;
                float fHeight = this.f2396g.f2352j.height() / 2.0f;
                float f5 = fWidth * fMin;
                float f6 = fHeight * fMin;
                float f7 = this.f2398i;
                canvas.translate((fWidth * f7) - f5, (f7 * fHeight) - f6);
                canvas.scale(f2, f2, f5, f6);
            }
            this.f2395f.reset();
            this.f2395f.preScale(fMin, fMin);
            this.f2411v.mo1349f(canvas, this.f2395f, this.f2412w);
            if (iSave > 0) {
                canvas.restoreToCount(iSave);
                return;
            }
            return;
        }
        if (this.f2411v == null) {
            return;
        }
        Rect bounds = getBounds();
        float fWidth2 = bounds.width() / this.f2396g.f2352j.width();
        float fHeight2 = bounds.height() / this.f2396g.f2352j.height();
        if (this.f2415z) {
            float fMin2 = Math.min(fWidth2, fHeight2);
            if (fMin2 < 1.0f) {
                f3 = 1.0f / fMin2;
                fWidth2 /= f3;
                fHeight2 /= f3;
            } else {
                f3 = 1.0f;
            }
            if (f3 > 1.0f) {
                iSave = canvas.save();
                float fWidth3 = bounds.width() / 2.0f;
                float fHeight3 = bounds.height() / 2.0f;
                float f8 = fWidth3 * fMin2;
                float f9 = fMin2 * fHeight3;
                canvas.translate(fWidth3 - f8, fHeight3 - f9);
                canvas.scale(f3, f3, f8, f9);
            }
        }
        this.f2395f.reset();
        this.f2395f.preScale(fWidth2, fHeight2);
        this.f2411v.mo1349f(canvas, this.f2395f, this.f2412w);
        if (iSave > 0) {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f2394A = false;
        if (this.f2400k) {
            try {
                m1465d(canvas);
            } catch (Throwable unused) {
                Objects.requireNonNull((LogcatLogger) Logger2.f2324a);
            }
        } else {
            m1465d(canvas);
        }
        L.m1365a("Drawable#draw");
    }

    /* JADX INFO: renamed from: e */
    public float m1466e() {
        return this.f2397h.m1424g();
    }

    /* JADX INFO: renamed from: f */
    public float m1467f() {
        return this.f2397h.m1425i();
    }

    /* JADX INFO: renamed from: g */
    public float m1468g() {
        return this.f2397h.m1423e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2412w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (lottieComposition.f2352j.height() * this.f2398i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            return -1;
        }
        return (int) (lottieComposition.f2352j.width() * this.f2398i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public int m1469h() {
        return this.f2397h.getRepeatCount();
    }

    /* JADX INFO: renamed from: i */
    public boolean m1470i() {
        LottieValueAnimator lottieValueAnimator = this.f2397h;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.f2333p;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.f2394A) {
            return;
        }
        this.f2394A = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return m1470i();
    }

    /* JADX INFO: renamed from: j */
    public void m1471j() {
        if (this.f2411v == null) {
            this.f2401l.add(new g());
            return;
        }
        if (this.f2399j || m1469h() == 0) {
            LottieValueAnimator lottieValueAnimator = this.f2397h;
            lottieValueAnimator.f2333p = true;
            boolean zM1426j = lottieValueAnimator.m1426j();
            for (Animator.AnimatorListener animatorListener : lottieValueAnimator.f2322g) {
                if (Build.VERSION.SDK_INT >= 26) {
                    animatorListener.onAnimationStart(lottieValueAnimator, zM1426j);
                } else {
                    animatorListener.onAnimationStart(lottieValueAnimator);
                }
            }
            lottieValueAnimator.m1429m((int) (lottieValueAnimator.m1426j() ? lottieValueAnimator.m1424g() : lottieValueAnimator.m1425i()));
            lottieValueAnimator.f2327j = 0L;
            lottieValueAnimator.f2329l = 0;
            lottieValueAnimator.m1427k();
        }
        if (this.f2399j) {
            return;
        }
        m1473l((int) (this.f2397h.f2325h < 0.0f ? m1467f() : m1466e()));
        this.f2397h.m1422d();
    }

    /* JADX INFO: renamed from: k */
    public void m1472k() {
        if (this.f2411v == null) {
            this.f2401l.add(new h());
            return;
        }
        if (this.f2399j || m1469h() == 0) {
            LottieValueAnimator lottieValueAnimator = this.f2397h;
            lottieValueAnimator.f2333p = true;
            lottieValueAnimator.m1427k();
            lottieValueAnimator.f2327j = 0L;
            if (lottieValueAnimator.m1426j() && lottieValueAnimator.f2328k == lottieValueAnimator.m1425i()) {
                lottieValueAnimator.f2328k = lottieValueAnimator.m1424g();
            } else if (!lottieValueAnimator.m1426j() && lottieValueAnimator.f2328k == lottieValueAnimator.m1424g()) {
                lottieValueAnimator.f2328k = lottieValueAnimator.m1425i();
            }
        }
        if (this.f2399j) {
            return;
        }
        m1473l((int) (this.f2397h.f2325h < 0.0f ? m1467f() : m1466e()));
        this.f2397h.m1422d();
    }

    /* JADX INFO: renamed from: l */
    public void m1473l(int i2) {
        if (this.f2396g == null) {
            this.f2401l.add(new c(i2));
        } else {
            this.f2397h.m1429m(i2);
        }
    }

    /* JADX INFO: renamed from: m */
    public void m1474m(int i2) {
        if (this.f2396g == null) {
            this.f2401l.add(new k(i2));
            return;
        }
        LottieValueAnimator lottieValueAnimator = this.f2397h;
        lottieValueAnimator.m1430n(lottieValueAnimator.f2330m, i2 + 0.99f);
    }

    /* JADX INFO: renamed from: n */
    public void m1475n(String str) {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            this.f2401l.add(new n(str));
            return;
        }
        Marker markerM1446d = lottieComposition.m1446d(str);
        if (markerM1446d == null) {
            throw new IllegalArgumentException(outline.m1600v("Cannot find marker with name ", str, "."));
        }
        m1474m((int) (markerM1446d.f1998b + markerM1446d.f1999c));
    }

    /* JADX INFO: renamed from: o */
    public void m1476o(float f2) {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            this.f2401l.add(new l(f2));
        } else {
            m1474m((int) MiscUtils.m1435e(lottieComposition.f2353k, lottieComposition.f2354l, f2));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m1477p(int i2, int i3) {
        if (this.f2396g == null) {
            this.f2401l.add(new b(i2, i3));
        } else {
            this.f2397h.m1430n(i2, i3 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1478q(String str) {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            this.f2401l.add(new a(str));
            return;
        }
        Marker markerM1446d = lottieComposition.m1446d(str);
        if (markerM1446d == null) {
            throw new IllegalArgumentException(outline.m1600v("Cannot find marker with name ", str, "."));
        }
        int i2 = (int) markerM1446d.f1998b;
        m1477p(i2, ((int) markerM1446d.f1999c) + i2);
    }

    /* JADX INFO: renamed from: r */
    public void m1479r(int i2) {
        if (this.f2396g == null) {
            this.f2401l.add(new i(i2));
        } else {
            LottieValueAnimator lottieValueAnimator = this.f2397h;
            lottieValueAnimator.m1430n(i2, (int) lottieValueAnimator.f2331n);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m1480s(String str) {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            this.f2401l.add(new m(str));
            return;
        }
        Marker markerM1446d = lottieComposition.m1446d(str);
        if (markerM1446d == null) {
            throw new IllegalArgumentException(outline.m1600v("Cannot find marker with name ", str, "."));
        }
        m1479r((int) markerM1446d.f1998b);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f2412w = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Logger2.m1420b("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || ((View) callback).isInEditMode()) {
            return;
        }
        m1471j();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f2401l.clear();
        this.f2397h.m1422d();
    }

    /* JADX INFO: renamed from: t */
    public void m1481t(float f2) {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            this.f2401l.add(new j(f2));
        } else {
            m1479r((int) MiscUtils.m1435e(lottieComposition.f2353k, lottieComposition.f2354l, f2));
        }
    }

    /* JADX INFO: renamed from: u */
    public void m1482u(float f2) {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            this.f2401l.add(new d(f2));
        } else {
            this.f2397h.m1429m(MiscUtils.m1435e(lottieComposition.f2353k, lottieComposition.f2354l, f2));
            L.m1365a("Drawable#setProgress");
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: v */
    public final void m1483v() {
        LottieComposition lottieComposition = this.f2396g;
        if (lottieComposition == null) {
            return;
        }
        float f2 = this.f2398i;
        setBounds(0, 0, (int) (lottieComposition.f2352j.width() * f2), (int) (this.f2396g.f2352j.height() * f2));
    }

    /* JADX INFO: renamed from: w */
    public boolean m1484w() {
        return this.f2409t == null && this.f2396g.f2349g.m15620k() > 0;
    }
}
