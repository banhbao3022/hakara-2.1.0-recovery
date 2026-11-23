package p007c.p085g.p086a.p089m.p098v.p103h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.gifdecoder.GifDecoder;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.v.h.c, reason: use source file name */
/* JADX INFO: compiled from: GifDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class GifDrawable extends Drawable implements GifFrameLoader.b, Animatable {

    /* JADX INFO: renamed from: f */
    public final a f3618f;

    /* JADX INFO: renamed from: g */
    public boolean f3619g;

    /* JADX INFO: renamed from: h */
    public boolean f3620h;

    /* JADX INFO: renamed from: i */
    public boolean f3621i;

    /* JADX INFO: renamed from: j */
    public boolean f3622j;

    /* JADX INFO: renamed from: k */
    public int f3623k;

    /* JADX INFO: renamed from: l */
    public int f3624l;

    /* JADX INFO: renamed from: m */
    public boolean f3625m;

    /* JADX INFO: renamed from: n */
    public Paint f3626n;

    /* JADX INFO: renamed from: o */
    public Rect f3627o;

    /* JADX INFO: renamed from: c.g.a.m.v.h.c$a */
    /* JADX INFO: compiled from: GifDrawable.java */
    public static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final GifFrameLoader f3628a;

        public a(GifFrameLoader gifFrameLoader) {
            this.f3628a = gifFrameLoader;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new GifDrawable(this);
        }
    }

    @Deprecated
    public GifDrawable(Context context, GifDecoder gifDecoder, BitmapPool bitmapPool, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        this(context, gifDecoder, transformation, i, i2, bitmap);
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p103h.GifFrameLoader.b
    /* JADX INFO: renamed from: a */
    public void mo1924a() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        GifFrameLoader gifFrameLoader = this.f3618f.f3628a;
        GifFrameLoader.a aVar = gifFrameLoader.f3638i;
        if ((aVar != null ? aVar.f3648j : -1) == gifFrameLoader.f3630a.getFrameCount() - 1) {
            this.f3623k++;
        }
        int i = this.f3624l;
        if (i == -1 || this.f3623k < i) {
            return;
        }
        stop();
    }

    /* JADX INFO: renamed from: b */
    public Bitmap m1925b() {
        return this.f3618f.f3628a.f3641l;
    }

    /* JADX INFO: renamed from: c */
    public final Paint m1926c() {
        if (this.f3626n == null) {
            this.f3626n = new Paint(2);
        }
        return this.f3626n;
    }

    /* JADX INFO: renamed from: d */
    public final void m1927d() {
        C8462c.m16935b(!this.f3621i, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3618f.f3628a.f3630a.getFrameCount() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f3619g) {
            return;
        }
        this.f3619g = true;
        GifFrameLoader gifFrameLoader = this.f3618f.f3628a;
        if (gifFrameLoader.f3639j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (gifFrameLoader.f3632c.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = gifFrameLoader.f3632c.isEmpty();
        gifFrameLoader.f3632c.add(this);
        if (zIsEmpty && !gifFrameLoader.f3635f) {
            gifFrameLoader.f3635f = true;
            gifFrameLoader.f3639j = false;
            gifFrameLoader.m1929a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3621i) {
            return;
        }
        if (this.f3625m) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f3627o == null) {
                this.f3627o = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f3627o);
            this.f3625m = false;
        }
        GifFrameLoader gifFrameLoader = this.f3618f.f3628a;
        GifFrameLoader.a aVar = gifFrameLoader.f3638i;
        Bitmap bitmap = aVar != null ? aVar.f3650l : gifFrameLoader.f3641l;
        if (this.f3627o == null) {
            this.f3627o = new Rect();
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f3627o, m1926c());
    }

    /* JADX INFO: renamed from: e */
    public final void m1928e() {
        this.f3619g = false;
        GifFrameLoader gifFrameLoader = this.f3618f.f3628a;
        gifFrameLoader.f3632c.remove(this);
        if (gifFrameLoader.f3632c.isEmpty()) {
            gifFrameLoader.f3635f = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3618f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3618f.f3628a.f3646q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3618f.f3628a.f3645p;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3619g;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f3625m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m1926c().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m1926c().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        C8462c.m16935b(!this.f3621i, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3622j = z;
        if (!z) {
            m1928e();
        } else if (this.f3620h) {
            m1927d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3620h = true;
        this.f3623k = 0;
        if (this.f3622j) {
            m1927d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3620h = false;
        m1928e();
    }

    public GifDrawable(Context context, GifDecoder gifDecoder, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        a aVar = new a(new GifFrameLoader(Glide.m1624b(context), gifDecoder, i, i2, transformation, bitmap));
        this.f3622j = true;
        this.f3624l = -1;
        this.f3618f = aVar;
    }

    public GifDrawable(a aVar) {
        this.f3622j = true;
        this.f3624l = -1;
        this.f3618f = aVar;
    }
}
