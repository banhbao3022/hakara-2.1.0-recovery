package p007c.p085g.p086a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy;
import p007c.p085g.p086a.p105n.RequestTracker;
import p007c.p085g.p086a.p108q.BaseRequestOptions;
import p007c.p085g.p086a.p108q.Request2;
import p007c.p085g.p086a.p108q.RequestCoordinator;
import p007c.p085g.p086a.p108q.RequestListener;
import p007c.p085g.p086a.p108q.RequestOptions;
import p007c.p085g.p086a.p108q.SingleRequest;
import p007c.p085g.p086a.p108q.p109h.BitmapImageViewTarget;
import p007c.p085g.p086a.p108q.p109h.DrawableImageViewTarget;
import p007c.p085g.p086a.p108q.p109h.Target;
import p007c.p085g.p086a.p108q.p109h.ViewTarget;
import p007c.p085g.p086a.p111r.AndroidResourceSignature;
import p007c.p085g.p086a.p111r.ApplicationVersionSignature;
import p007c.p085g.p086a.p111r.ObjectKey;
import p007c.p085g.p086a.p112s.Executors;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.h, reason: use source file name */
/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestBuilder<TranscodeType> extends BaseRequestOptions<RequestBuilder<TranscodeType>> implements Cloneable {

    /* JADX INFO: renamed from: F */
    public final Context f2905F;

    /* JADX INFO: renamed from: G */
    public final RequestManager f2906G;

    /* JADX INFO: renamed from: H */
    public final Class<TranscodeType> f2907H;

    /* JADX INFO: renamed from: I */
    public final GlideContext f2908I;

    /* JADX INFO: renamed from: J */
    public TransitionOptions<?, ? super TranscodeType> f2909J;

    /* JADX INFO: renamed from: K */
    public Object f2910K;

    /* JADX INFO: renamed from: L */
    public List<RequestListener<TranscodeType>> f2911L;

    /* JADX INFO: renamed from: M */
    public boolean f2912M = true;

    /* JADX INFO: renamed from: N */
    public boolean f2913N;

    /* JADX INFO: renamed from: c.g.a.h$a */
    /* JADX INFO: compiled from: RequestBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2914a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f2915b;

        static {
            Priority.values();
            int[] iArr = new int[4];
            f2915b = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2915b[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2915b[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2915b[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f2914a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2914a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2914a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2914a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2914a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2914a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2914a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2914a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    static {
        new RequestOptions().mo1976g(DiskCacheStrategy.f3275b).mo1986s(Priority.LOW).mo1990x(true);
    }

    @SuppressLint({"CheckResult"})
    public RequestBuilder(Glide glide, RequestManager requestManager, Class<TranscodeType> cls, Context context) {
        RequestOptions requestOptions;
        this.f2906G = requestManager;
        this.f2907H = cls;
        this.f2905F = context;
        GlideContext glideContext = requestManager.f2917g.f2858j;
        TransitionOptions transitionOptions = glideContext.f2885g.get(cls);
        if (transitionOptions == null) {
            for (Map.Entry<Class<?>, TransitionOptions<?, ?>> entry : glideContext.f2885g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    transitionOptions = (TransitionOptions) entry.getValue();
                }
            }
        }
        this.f2909J = transitionOptions == null ? GlideContext.f2879a : transitionOptions;
        this.f2908I = glide.f2858j;
        Iterator<RequestListener<Object>> it = requestManager.f2926p.iterator();
        while (it.hasNext()) {
            mo1636G((RequestListener) it.next());
        }
        synchronized (requestManager) {
            requestOptions = requestManager.f2927q;
        }
        mo1647a(requestOptions);
    }

    /* JADX INFO: renamed from: G */
    public RequestBuilder<TranscodeType> mo1636G(RequestListener<TranscodeType> requestListener) {
        if (requestListener != null) {
            if (this.f2911L == null) {
                this.f2911L = new ArrayList();
            }
            this.f2911L.add(requestListener);
        }
        return this;
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> mo1647a(BaseRequestOptions<?> baseRequestOptions) {
        Objects.requireNonNull(baseRequestOptions, "Argument must not be null");
        return (RequestBuilder) super.mo1647a(baseRequestOptions);
    }

    /* JADX INFO: renamed from: J */
    public final Request2 m1638J(Object obj, Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        return m1646R(obj, target, requestListener, baseRequestOptions, null, transitionOptions, priority, i, i2, executor);
    }

    @Override // p007c.p085g.p086a.p108q.BaseRequestOptions
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public RequestBuilder<TranscodeType> clone() {
        RequestBuilder<TranscodeType> requestBuilder = (RequestBuilder) super.clone();
        requestBuilder.f2909J = requestBuilder.f2909J.m1660a();
        return requestBuilder;
    }

    /* JADX INFO: renamed from: L */
    public <Y extends Target<TranscodeType>> Y m1640L(Y y) {
        m1641M(y, null, this, Executors.f3816a);
        return y;
    }

    /* JADX INFO: renamed from: M */
    public final <Y extends Target<TranscodeType>> Y m1641M(Y y, RequestListener<TranscodeType> requestListener, BaseRequestOptions<?> baseRequestOptions, Executor executor) {
        Objects.requireNonNull(y, "Argument must not be null");
        if (!this.f2913N) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        Request2 request2M1638J = m1638J(new Object(), y, requestListener, null, this.f2909J, baseRequestOptions.f3728i, baseRequestOptions.f3735p, baseRequestOptions.f3734o, baseRequestOptions, executor);
        Request2 request2Mo2021g = y.mo2021g();
        SingleRequest singleRequest = (SingleRequest) request2M1638J;
        if (singleRequest.m2010i(request2Mo2021g)) {
            if (!(!baseRequestOptions.f3733n && request2Mo2021g.mo1995d())) {
                Objects.requireNonNull(request2Mo2021g, "Argument must not be null");
                if (!request2Mo2021g.isRunning()) {
                    request2Mo2021g.mo1994c();
                }
                return y;
            }
        }
        this.f2906G.m1654n(y);
        y.mo2018c(request2M1638J);
        RequestManager requestManager = this.f2906G;
        synchronized (requestManager) {
            requestManager.f2922l.f3701f.add(y);
            RequestTracker requestTracker = requestManager.f2920j;
            requestTracker.f3691a.add(request2M1638J);
            if (requestTracker.f3693c) {
                singleRequest.clear();
                if (Log.isLoggable("RequestTracker", 2)) {
                    Log.v("RequestTracker", "Paused, delaying request");
                }
                requestTracker.f3692b.add(request2M1638J);
            } else {
                singleRequest.mo1994c();
            }
        }
        return y;
    }

    /* JADX INFO: renamed from: N */
    public ViewTarget<ImageView, TranscodeType> m1642N(ImageView imageView) {
        BaseRequestOptions baseRequestOptionsMo1980m;
        ViewTarget<ImageView, TranscodeType> drawableImageViewTarget;
        Util4.m2046a();
        Objects.requireNonNull(imageView, "Argument must not be null");
        if (!BaseRequestOptions.m1969k(this.f3725f, 2048) && this.f3738s && imageView.getScaleType() != null) {
            switch (a.f2914a[imageView.getScaleType().ordinal()]) {
                case 1:
                    baseRequestOptionsMo1980m = clone().mo1980m();
                    break;
                case 2:
                    baseRequestOptionsMo1980m = clone().mo1981n();
                    break;
                case 3:
                case 4:
                case 5:
                    baseRequestOptionsMo1980m = clone().mo1982o();
                    break;
                case 6:
                    baseRequestOptionsMo1980m = clone().mo1981n();
                    break;
                default:
                    baseRequestOptionsMo1980m = this;
                    break;
            }
        } else {
            baseRequestOptionsMo1980m = this;
        }
        GlideContext glideContext = this.f2908I;
        Class<TranscodeType> cls = this.f2907H;
        Objects.requireNonNull(glideContext.f2882d);
        if (Bitmap.class.equals(cls)) {
            drawableImageViewTarget = new BitmapImageViewTarget(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            drawableImageViewTarget = new DrawableImageViewTarget(imageView);
        }
        m1641M(drawableImageViewTarget, null, baseRequestOptionsMo1980m, Executors.f3816a);
        return drawableImageViewTarget;
    }

    /* JADX INFO: renamed from: O */
    public RequestBuilder<TranscodeType> mo1643O(Integer num) {
        PackageInfo packageInfo;
        this.f2910K = num;
        this.f2913N = true;
        Context context = this.f2905F;
        int i = AndroidResourceSignature.f3798b;
        ConcurrentMap<String, Key> concurrentMap = ApplicationVersionSignature.f3801a;
        String packageName = context.getPackageName();
        Key keyPutIfAbsent = ApplicationVersionSignature.f3801a.get(packageName);
        if (keyPutIfAbsent == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sbM1556G = outline.m1556G("Cannot resolve info for");
                sbM1556G.append(context.getPackageName());
                Log.e("AppVersionSignature", sbM1556G.toString(), e);
                packageInfo = null;
            }
            ObjectKey objectKey = new ObjectKey(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            keyPutIfAbsent = ApplicationVersionSignature.f3801a.putIfAbsent(packageName, objectKey);
            if (keyPutIfAbsent == null) {
                keyPutIfAbsent = objectKey;
            }
        }
        return mo1647a(new RequestOptions().mo1989w(new AndroidResourceSignature(context.getResources().getConfiguration().uiMode & 48, keyPutIfAbsent)));
    }

    /* JADX INFO: renamed from: P */
    public RequestBuilder<TranscodeType> mo1644P(Object obj) {
        this.f2910K = obj;
        this.f2913N = true;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public RequestBuilder<TranscodeType> mo1645Q(String str) {
        this.f2910K = str;
        this.f2913N = true;
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final Request2 m1646R(Object obj, Target<TranscodeType> target, RequestListener<TranscodeType> requestListener, BaseRequestOptions<?> baseRequestOptions, RequestCoordinator requestCoordinator, TransitionOptions<?, ? super TranscodeType> transitionOptions, Priority priority, int i, int i2, Executor executor) {
        Context context = this.f2905F;
        GlideContext glideContext = this.f2908I;
        return new SingleRequest(context, glideContext, obj, this.f2910K, this.f2907H, baseRequestOptions, i, i2, priority, target, requestListener, this.f2911L, requestCoordinator, glideContext.f2886h, transitionOptions.f2931f, executor);
    }
}
