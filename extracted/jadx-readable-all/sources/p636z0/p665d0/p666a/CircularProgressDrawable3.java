package p636z0.p665d0.p666a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p754q.p755a.p756a.FastOutSlowInInterpolator;

/* JADX INFO: renamed from: z0.d0.a.d, reason: use source file name */
/* JADX INFO: compiled from: CircularProgressDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class CircularProgressDrawable3 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: f */
    public static final Interpolator f35381f = new LinearInterpolator();

    /* JADX INFO: renamed from: g */
    public static final Interpolator f35382g = new FastOutSlowInInterpolator();

    /* JADX INFO: renamed from: h */
    public static final int[] f35383h = {-16777216};

    /* JADX INFO: renamed from: i */
    public final a f35384i;

    /* JADX INFO: renamed from: j */
    public float f35385j;

    /* JADX INFO: renamed from: k */
    public Resources f35386k;

    /* JADX INFO: renamed from: l */
    public Animator f35387l;

    /* JADX INFO: renamed from: m */
    public float f35388m;

    /* JADX INFO: renamed from: n */
    public boolean f35389n;

    /* JADX INFO: renamed from: z0.d0.a.d$a */
    /* JADX INFO: compiled from: CircularProgressDrawable.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final RectF f35390a = new RectF();

        /* JADX INFO: renamed from: b */
        public final Paint f35391b;

        /* JADX INFO: renamed from: c */
        public final Paint f35392c;

        /* JADX INFO: renamed from: d */
        public final Paint f35393d;

        /* JADX INFO: renamed from: e */
        public float f35394e;

        /* JADX INFO: renamed from: f */
        public float f35395f;

        /* JADX INFO: renamed from: g */
        public float f35396g;

        /* JADX INFO: renamed from: h */
        public float f35397h;

        /* JADX INFO: renamed from: i */
        public int[] f35398i;

        /* JADX INFO: renamed from: j */
        public int f35399j;

        /* JADX INFO: renamed from: k */
        public float f35400k;

        /* JADX INFO: renamed from: l */
        public float f35401l;

        /* JADX INFO: renamed from: m */
        public float f35402m;

        /* JADX INFO: renamed from: n */
        public boolean f35403n;

        /* JADX INFO: renamed from: o */
        public Path f35404o;

        /* JADX INFO: renamed from: p */
        public float f35405p;

        /* JADX INFO: renamed from: q */
        public float f35406q;

        /* JADX INFO: renamed from: r */
        public int f35407r;

        /* JADX INFO: renamed from: s */
        public int f35408s;

        /* JADX INFO: renamed from: t */
        public int f35409t;

        /* JADX INFO: renamed from: u */
        public int f35410u;

        public a() {
            Paint paint = new Paint();
            this.f35391b = paint;
            Paint paint2 = new Paint();
            this.f35392c = paint2;
            Paint paint3 = new Paint();
            this.f35393d = paint3;
            this.f35394e = 0.0f;
            this.f35395f = 0.0f;
            this.f35396g = 0.0f;
            this.f35397h = 5.0f;
            this.f35405p = 1.0f;
            this.f35409t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* JADX INFO: renamed from: a */
        public void m15066a(int i) {
            this.f35399j = i;
            this.f35410u = this.f35398i[i];
        }

        /* JADX INFO: renamed from: b */
        public void m15067b(boolean z) {
            if (this.f35403n != z) {
                this.f35403n = z;
            }
        }
    }

    public CircularProgressDrawable3(Context context) {
        Objects.requireNonNull(context);
        this.f35386k = context.getResources();
        a aVar = new a();
        this.f35384i = aVar;
        aVar.f35398i = f35383h;
        aVar.m15066a(0);
        aVar.f35397h = 2.5f;
        aVar.f35391b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new CircularProgressDrawable(this, aVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f35381f);
        valueAnimatorOfFloat.addListener(new CircularProgressDrawable2(this, aVar));
        this.f35387l = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: a */
    public void m15062a(float f, a aVar, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f35389n) {
            m15065d(f, aVar);
            float fFloor = (float) (Math.floor(aVar.f35402m / 0.8f) + 1.0d);
            float f2 = aVar.f35400k;
            float f3 = aVar.f35401l;
            aVar.f35394e = (((f3 - 0.01f) - f2) * f) + f2;
            aVar.f35395f = f3;
            float f4 = aVar.f35402m;
            aVar.f35396g = outline.m1576a(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = aVar.f35402m;
            if (f < 0.5f) {
                interpolation = aVar.f35400k;
                interpolation2 = (f35382g.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = aVar.f35400k + 0.79f;
                interpolation = f6 - (((1.0f - f35382g.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f35388m) * 216.0f;
            aVar.f35394e = interpolation;
            aVar.f35395f = interpolation2;
            aVar.f35396g = f7;
            this.f35385j = f8;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15063b(float f, float f2, float f3, float f4) {
        a aVar = this.f35384i;
        float f5 = this.f35386k.getDisplayMetrics().density;
        float f6 = f2 * f5;
        aVar.f35397h = f6;
        aVar.f35391b.setStrokeWidth(f6);
        aVar.f35406q = f * f5;
        aVar.m15066a(0);
        aVar.f35407r = (int) (f3 * f5);
        aVar.f35408s = (int) (f4 * f5);
    }

    /* JADX INFO: renamed from: c */
    public void m15064c(int i) {
        if (i == 0) {
            m15063b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m15063b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    public void m15065d(float f, a aVar) {
        if (f <= 0.75f) {
            aVar.f35410u = aVar.f35398i[aVar.f35399j];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = aVar.f35398i;
        int i = aVar.f35399j;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        int i4 = (i2 >> 24) & 255;
        int i5 = (i2 >> 16) & 255;
        int i6 = (i2 >> 8) & 255;
        int i7 = i2 & 255;
        aVar.f35410u = ((i4 + ((int) ((((i3 >> 24) & 255) - i4) * f2))) << 24) | ((i5 + ((int) ((((i3 >> 16) & 255) - i5) * f2))) << 16) | ((i6 + ((int) ((((i3 >> 8) & 255) - i6) * f2))) << 8) | (i7 + ((int) (f2 * ((i3 & 255) - i7))));
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f35385j, bounds.exactCenterX(), bounds.exactCenterY());
        a aVar = this.f35384i;
        RectF rectF = aVar.f35390a;
        float f = aVar.f35406q;
        float fMin = (aVar.f35397h / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((aVar.f35407r * aVar.f35405p) / 2.0f, aVar.f35397h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = aVar.f35394e;
        float f3 = aVar.f35396g;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((aVar.f35395f + f3) * 360.0f) - f4;
        aVar.f35391b.setColor(aVar.f35410u);
        aVar.f35391b.setAlpha(aVar.f35409t);
        float f6 = aVar.f35397h / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f35393d);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, aVar.f35391b);
        if (aVar.f35403n) {
            Path path = aVar.f35404o;
            if (path == null) {
                Path path2 = new Path();
                aVar.f35404o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (aVar.f35407r * aVar.f35405p) / 2.0f;
            aVar.f35404o.moveTo(0.0f, 0.0f);
            aVar.f35404o.lineTo(aVar.f35407r * aVar.f35405p, 0.0f);
            Path path3 = aVar.f35404o;
            float f9 = aVar.f35407r;
            float f10 = aVar.f35405p;
            path3.lineTo((f9 * f10) / 2.0f, aVar.f35408s * f10);
            aVar.f35404o.offset((rectF.centerX() + fMin2) - f8, (aVar.f35397h / 2.0f) + rectF.centerY());
            aVar.f35404o.close();
            aVar.f35392c.setColor(aVar.f35410u);
            aVar.f35392c.setAlpha(aVar.f35409t);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f35404o, aVar.f35392c);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f35384i.f35409t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f35387l.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f35384i.f35409t = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f35384i.f35391b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f35387l.cancel();
        a aVar = this.f35384i;
        float f = aVar.f35394e;
        aVar.f35400k = f;
        float f2 = aVar.f35395f;
        aVar.f35401l = f2;
        aVar.f35402m = aVar.f35396g;
        if (f2 != f) {
            this.f35389n = true;
            this.f35387l.setDuration(666L);
            this.f35387l.start();
            return;
        }
        aVar.m15066a(0);
        a aVar2 = this.f35384i;
        aVar2.f35400k = 0.0f;
        aVar2.f35401l = 0.0f;
        aVar2.f35402m = 0.0f;
        aVar2.f35394e = 0.0f;
        aVar2.f35395f = 0.0f;
        aVar2.f35396g = 0.0f;
        this.f35387l.setDuration(1332L);
        this.f35387l.start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f35387l.cancel();
        this.f35385j = 0.0f;
        this.f35384i.m15067b(false);
        this.f35384i.m15066a(0);
        a aVar = this.f35384i;
        aVar.f35400k = 0.0f;
        aVar.f35401l = 0.0f;
        aVar.f35402m = 0.0f;
        aVar.f35394e = 0.0f;
        aVar.f35395f = 0.0f;
        aVar.f35396g = 0.0f;
        invalidateSelf();
    }
}
