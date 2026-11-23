package p007c.p085g.p086a.p108q;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;
import java.util.Objects;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.MultiTransformation;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy;
import p007c.p085g.p086a.p089m.p098v.p099d.CenterCrop;
import p007c.p085g.p086a.p089m.p098v.p099d.CenterInside;
import p007c.p085g.p086a.p089m.p098v.p099d.DownsampleStrategy;
import p007c.p085g.p086a.p089m.p098v.p099d.DrawableTransformation;
import p007c.p085g.p086a.p089m.p098v.p099d.FitCenter;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawable;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawableTransformation;
import p007c.p085g.p086a.p108q.BaseRequestOptions;
import p007c.p085g.p086a.p111r.EmptySignature;
import p007c.p085g.p086a.p112s.CachedHashCodeArrayMap;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.q.a, reason: use source file name */
/* JADX INFO: compiled from: BaseRequestOptions.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {

    /* JADX INFO: renamed from: A */
    public boolean f3720A;

    /* JADX INFO: renamed from: B */
    public boolean f3721B;

    /* JADX INFO: renamed from: C */
    public boolean f3722C;

    /* JADX INFO: renamed from: D */
    public boolean f3723D;

    /* JADX INFO: renamed from: E */
    public boolean f3724E;

    /* JADX INFO: renamed from: f */
    public int f3725f;

    /* JADX INFO: renamed from: j */
    public Drawable f3729j;

    /* JADX INFO: renamed from: k */
    public int f3730k;

    /* JADX INFO: renamed from: l */
    public Drawable f3731l;

    /* JADX INFO: renamed from: m */
    public int f3732m;

    /* JADX INFO: renamed from: q */
    public Key f3736q;

    /* JADX INFO: renamed from: r */
    public boolean f3737r;

    /* JADX INFO: renamed from: s */
    public boolean f3738s;

    /* JADX INFO: renamed from: t */
    public Drawable f3739t;

    /* JADX INFO: renamed from: u */
    public int f3740u;

    /* JADX INFO: renamed from: v */
    public Options f3741v;

    /* JADX INFO: renamed from: w */
    public Map<Class<?>, Transformation<?>> f3742w;

    /* JADX INFO: renamed from: x */
    public Class<?> f3743x;

    /* JADX INFO: renamed from: y */
    public boolean f3744y;

    /* JADX INFO: renamed from: z */
    public Resources.Theme f3745z;

    /* JADX INFO: renamed from: g */
    public float f3726g = 1.0f;

    /* JADX INFO: renamed from: h */
    public DiskCacheStrategy f3727h = DiskCacheStrategy.f3277d;

    /* JADX INFO: renamed from: i */
    public Priority f3728i = Priority.NORMAL;

    /* JADX INFO: renamed from: n */
    public boolean f3733n = true;

    /* JADX INFO: renamed from: o */
    public int f3734o = -1;

    /* JADX INFO: renamed from: p */
    public int f3735p = -1;

    public BaseRequestOptions() {
        EmptySignature emptySignature = EmptySignature.f3802b;
        this.f3736q = EmptySignature.f3802b;
        this.f3738s = true;
        this.f3741v = new Options();
        this.f3742w = new CachedHashCodeArrayMap();
        this.f3743x = Object.class;
        this.f3723D = true;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m1969k(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: A */
    public final T m1970A(DownsampleStrategy downsampleStrategy, Transformation<Bitmap> transformation) {
        if (this.f3720A) {
            return (T) clone().m1970A(downsampleStrategy, transformation);
        }
        mo1977i(downsampleStrategy);
        return (T) mo1991y(transformation);
    }

    /* JADX INFO: renamed from: C */
    public <Y> T m1971C(Class<Y> cls, Transformation<Y> transformation, boolean z) {
        if (this.f3720A) {
            return (T) clone().m1971C(cls, transformation, z);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        Objects.requireNonNull(transformation, "Argument must not be null");
        this.f3742w.put(cls, transformation);
        int i = this.f3725f | 2048;
        this.f3725f = i;
        this.f3738s = true;
        int i2 = i | 65536;
        this.f3725f = i2;
        this.f3723D = false;
        if (z) {
            this.f3725f = i2 | 131072;
            this.f3737r = true;
        }
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: E */
    public T mo1972E(Transformation<Bitmap>... transformationArr) {
        if (transformationArr.length > 1) {
            return (T) m1992z(new MultiTransformation(transformationArr), true);
        }
        if (transformationArr.length == 1) {
            return (T) mo1991y(transformationArr[0]);
        }
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: F */
    public T mo1973F(boolean z) {
        if (this.f3720A) {
            return (T) clone().mo1973F(z);
        }
        this.f3724E = z;
        this.f3725f |= 1048576;
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: a */
    public T mo1647a(BaseRequestOptions<?> baseRequestOptions) {
        if (this.f3720A) {
            return (T) clone().mo1647a(baseRequestOptions);
        }
        if (m1969k(baseRequestOptions.f3725f, 2)) {
            this.f3726g = baseRequestOptions.f3726g;
        }
        if (m1969k(baseRequestOptions.f3725f, 262144)) {
            this.f3721B = baseRequestOptions.f3721B;
        }
        if (m1969k(baseRequestOptions.f3725f, 1048576)) {
            this.f3724E = baseRequestOptions.f3724E;
        }
        if (m1969k(baseRequestOptions.f3725f, 4)) {
            this.f3727h = baseRequestOptions.f3727h;
        }
        if (m1969k(baseRequestOptions.f3725f, 8)) {
            this.f3728i = baseRequestOptions.f3728i;
        }
        if (m1969k(baseRequestOptions.f3725f, 16)) {
            this.f3729j = baseRequestOptions.f3729j;
            this.f3730k = 0;
            this.f3725f &= -33;
        }
        if (m1969k(baseRequestOptions.f3725f, 32)) {
            this.f3730k = baseRequestOptions.f3730k;
            this.f3729j = null;
            this.f3725f &= -17;
        }
        if (m1969k(baseRequestOptions.f3725f, 64)) {
            this.f3731l = baseRequestOptions.f3731l;
            this.f3732m = 0;
            this.f3725f &= -129;
        }
        if (m1969k(baseRequestOptions.f3725f, 128)) {
            this.f3732m = baseRequestOptions.f3732m;
            this.f3731l = null;
            this.f3725f &= -65;
        }
        if (m1969k(baseRequestOptions.f3725f, 256)) {
            this.f3733n = baseRequestOptions.f3733n;
        }
        if (m1969k(baseRequestOptions.f3725f, 512)) {
            this.f3735p = baseRequestOptions.f3735p;
            this.f3734o = baseRequestOptions.f3734o;
        }
        if (m1969k(baseRequestOptions.f3725f, 1024)) {
            this.f3736q = baseRequestOptions.f3736q;
        }
        if (m1969k(baseRequestOptions.f3725f, 4096)) {
            this.f3743x = baseRequestOptions.f3743x;
        }
        if (m1969k(baseRequestOptions.f3725f, 8192)) {
            this.f3739t = baseRequestOptions.f3739t;
            this.f3740u = 0;
            this.f3725f &= -16385;
        }
        if (m1969k(baseRequestOptions.f3725f, 16384)) {
            this.f3740u = baseRequestOptions.f3740u;
            this.f3739t = null;
            this.f3725f &= -8193;
        }
        if (m1969k(baseRequestOptions.f3725f, 32768)) {
            this.f3745z = baseRequestOptions.f3745z;
        }
        if (m1969k(baseRequestOptions.f3725f, 65536)) {
            this.f3738s = baseRequestOptions.f3738s;
        }
        if (m1969k(baseRequestOptions.f3725f, 131072)) {
            this.f3737r = baseRequestOptions.f3737r;
        }
        if (m1969k(baseRequestOptions.f3725f, 2048)) {
            this.f3742w.putAll(baseRequestOptions.f3742w);
            this.f3723D = baseRequestOptions.f3723D;
        }
        if (m1969k(baseRequestOptions.f3725f, 524288)) {
            this.f3722C = baseRequestOptions.f3722C;
        }
        if (!this.f3738s) {
            this.f3742w.clear();
            int i = this.f3725f & (-2049);
            this.f3725f = i;
            this.f3737r = false;
            this.f3725f = i & (-131073);
            this.f3723D = true;
        }
        this.f3725f |= baseRequestOptions.f3725f;
        this.f3741v.m1708d(baseRequestOptions.f3741v);
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: b */
    public T mo1974b() {
        if (this.f3744y && !this.f3720A) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f3720A = true;
        return (T) mo1979l();
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            Options options = new Options();
            t.f3741v = options;
            options.m1708d(this.f3741v);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t.f3742w = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.f3742w);
            t.f3744y = false;
            t.f3720A = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: e */
    public T mo1975e(Class<?> cls) {
        if (this.f3720A) {
            return (T) clone().mo1975e(cls);
        }
        Objects.requireNonNull(cls, "Argument must not be null");
        this.f3743x = cls;
        this.f3725f |= 4096;
        m1987t();
        return this;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BaseRequestOptions)) {
            return false;
        }
        BaseRequestOptions baseRequestOptions = (BaseRequestOptions) obj;
        return Float.compare(baseRequestOptions.f3726g, this.f3726g) == 0 && this.f3730k == baseRequestOptions.f3730k && Util4.m2047b(this.f3729j, baseRequestOptions.f3729j) && this.f3732m == baseRequestOptions.f3732m && Util4.m2047b(this.f3731l, baseRequestOptions.f3731l) && this.f3740u == baseRequestOptions.f3740u && Util4.m2047b(this.f3739t, baseRequestOptions.f3739t) && this.f3733n == baseRequestOptions.f3733n && this.f3734o == baseRequestOptions.f3734o && this.f3735p == baseRequestOptions.f3735p && this.f3737r == baseRequestOptions.f3737r && this.f3738s == baseRequestOptions.f3738s && this.f3721B == baseRequestOptions.f3721B && this.f3722C == baseRequestOptions.f3722C && this.f3727h.equals(baseRequestOptions.f3727h) && this.f3728i == baseRequestOptions.f3728i && this.f3741v.equals(baseRequestOptions.f3741v) && this.f3742w.equals(baseRequestOptions.f3742w) && this.f3743x.equals(baseRequestOptions.f3743x) && Util4.m2047b(this.f3736q, baseRequestOptions.f3736q) && Util4.m2047b(this.f3745z, baseRequestOptions.f3745z);
    }

    /* JADX INFO: renamed from: g */
    public T mo1976g(DiskCacheStrategy diskCacheStrategy) {
        if (this.f3720A) {
            return (T) clone().mo1976g(diskCacheStrategy);
        }
        Objects.requireNonNull(diskCacheStrategy, "Argument must not be null");
        this.f3727h = diskCacheStrategy;
        this.f3725f |= 4;
        m1987t();
        return this;
    }

    public int hashCode() {
        float f = this.f3726g;
        char[] cArr = Util4.f3828a;
        return Util4.m2051f(this.f3745z, Util4.m2051f(this.f3736q, Util4.m2051f(this.f3743x, Util4.m2051f(this.f3742w, Util4.m2051f(this.f3741v, Util4.m2051f(this.f3728i, Util4.m2051f(this.f3727h, (((((((((((((Util4.m2051f(this.f3739t, (Util4.m2051f(this.f3731l, (Util4.m2051f(this.f3729j, ((Float.floatToIntBits(f) + 527) * 31) + this.f3730k) * 31) + this.f3732m) * 31) + this.f3740u) * 31) + (this.f3733n ? 1 : 0)) * 31) + this.f3734o) * 31) + this.f3735p) * 31) + (this.f3737r ? 1 : 0)) * 31) + (this.f3738s ? 1 : 0)) * 31) + (this.f3721B ? 1 : 0)) * 31) + (this.f3722C ? 1 : 0))))))));
    }

    /* JADX INFO: renamed from: i */
    public T mo1977i(DownsampleStrategy downsampleStrategy) {
        Option option = DownsampleStrategy.f3557f;
        Objects.requireNonNull(downsampleStrategy, "Argument must not be null");
        return (T) mo1988v(option, downsampleStrategy);
    }

    /* JADX INFO: renamed from: j */
    public T mo1978j(Drawable drawable) {
        if (this.f3720A) {
            return (T) clone().mo1978j(drawable);
        }
        this.f3729j = drawable;
        int i = this.f3725f | 16;
        this.f3725f = i;
        this.f3730k = 0;
        this.f3725f = i & (-33);
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: l */
    public T mo1979l() {
        this.f3744y = true;
        return this;
    }

    /* JADX INFO: renamed from: m */
    public T mo1980m() {
        return (T) m1983p(DownsampleStrategy.f3554c, new CenterCrop());
    }

    /* JADX INFO: renamed from: n */
    public T mo1981n() {
        T t = (T) m1983p(DownsampleStrategy.f3553b, new CenterInside());
        t.f3723D = true;
        return t;
    }

    /* JADX INFO: renamed from: o */
    public T mo1982o() {
        T t = (T) m1983p(DownsampleStrategy.f3552a, new FitCenter());
        t.f3723D = true;
        return t;
    }

    /* JADX INFO: renamed from: p */
    public final T m1983p(DownsampleStrategy downsampleStrategy, Transformation<Bitmap> transformation) {
        if (this.f3720A) {
            return (T) clone().m1983p(downsampleStrategy, transformation);
        }
        mo1977i(downsampleStrategy);
        return (T) m1992z(transformation, false);
    }

    /* JADX INFO: renamed from: q */
    public T mo1984q(int i, int i2) {
        if (this.f3720A) {
            return (T) clone().mo1984q(i, i2);
        }
        this.f3735p = i;
        this.f3734o = i2;
        this.f3725f |= 512;
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: r */
    public T mo1985r(Drawable drawable) {
        if (this.f3720A) {
            return (T) clone().mo1985r(drawable);
        }
        this.f3731l = drawable;
        int i = this.f3725f | 64;
        this.f3725f = i;
        this.f3732m = 0;
        this.f3725f = i & (-129);
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: s */
    public T mo1986s(Priority priority) {
        if (this.f3720A) {
            return (T) clone().mo1986s(priority);
        }
        Objects.requireNonNull(priority, "Argument must not be null");
        this.f3728i = priority;
        this.f3725f |= 8;
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: t */
    public final T m1987t() {
        if (this.f3744y) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    /* JADX INFO: renamed from: v */
    public <Y> T mo1988v(Option<Y> option, Y y) {
        if (this.f3720A) {
            return (T) clone().mo1988v(option, y);
        }
        Objects.requireNonNull(option, "Argument must not be null");
        Objects.requireNonNull(y, "Argument must not be null");
        this.f3741v.f3039b.put(option, y);
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: w */
    public T mo1989w(Key key) {
        if (this.f3720A) {
            return (T) clone().mo1989w(key);
        }
        Objects.requireNonNull(key, "Argument must not be null");
        this.f3736q = key;
        this.f3725f |= 1024;
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: x */
    public T mo1990x(boolean z) {
        if (this.f3720A) {
            return (T) clone().mo1990x(true);
        }
        this.f3733n = !z;
        this.f3725f |= 256;
        m1987t();
        return this;
    }

    /* JADX INFO: renamed from: y */
    public T mo1991y(Transformation<Bitmap> transformation) {
        return (T) m1992z(transformation, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z */
    public T m1992z(Transformation<Bitmap> transformation, boolean z) {
        if (this.f3720A) {
            return (T) clone().m1992z(transformation, z);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        m1971C(Bitmap.class, transformation, z);
        m1971C(Drawable.class, drawableTransformation, z);
        m1971C(BitmapDrawable.class, drawableTransformation, z);
        m1971C(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        m1987t();
        return this;
    }
}
