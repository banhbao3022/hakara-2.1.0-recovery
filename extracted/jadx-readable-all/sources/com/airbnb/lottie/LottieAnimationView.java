package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.io.ByteArrayInputStream;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import mtp.media.karaoke.R;
import p007c.p056c.p057a.C0469v;
import p007c.p056c.p057a.FontAssetDelegate;
import p007c.p056c.p057a.ImageAssetDelegate;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.LottieAnimationView2;
import p007c.p056c.p057a.LottieAnimationView3;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.LottieCompositionFactory;
import p007c.p056c.p057a.LottieCompositionFactory2;
import p007c.p056c.p057a.LottieCompositionFactory3;
import p007c.p056c.p057a.LottieCompositionFactory4;
import p007c.p056c.p057a.LottieCompositionFactory5;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.LottieListener;
import p007c.p056c.p057a.LottieOnCompositionLoadedListener;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.LottieTask2;
import p007c.p056c.p057a.PerformanceTracker;
import p007c.p056c.p057a.RenderMode;
import p007c.p056c.p057a.SimpleColorFilter;
import p007c.p056c.p057a.TextDelegate;
import p007c.p056c.p057a.p058a0.FontAssetManager;
import p007c.p056c.p057a.p058a0.ImageAssetManager;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p066e0.Logger2;
import p007c.p056c.p057a.p066e0.LottieValueAnimator;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {

    /* JADX INFO: renamed from: h */
    public static final String f28097h = LottieAnimationView.class.getSimpleName();

    /* JADX INFO: renamed from: i */
    public static final LottieListener<Throwable> f28098i = new C5773a();

    /* JADX INFO: renamed from: A */
    public LottieComposition f28099A;

    /* JADX INFO: renamed from: j */
    public final LottieListener<LottieComposition> f28100j;

    /* JADX INFO: renamed from: k */
    public final LottieListener<Throwable> f28101k;

    /* JADX INFO: renamed from: l */
    public LottieListener<Throwable> f28102l;

    /* JADX INFO: renamed from: m */
    public int f28103m;

    /* JADX INFO: renamed from: n */
    public final LottieDrawable f28104n;

    /* JADX INFO: renamed from: o */
    public boolean f28105o;

    /* JADX INFO: renamed from: p */
    public String f28106p;

    /* JADX INFO: renamed from: q */
    public int f28107q;

    /* JADX INFO: renamed from: r */
    public boolean f28108r;

    /* JADX INFO: renamed from: s */
    public boolean f28109s;

    /* JADX INFO: renamed from: t */
    public boolean f28110t;

    /* JADX INFO: renamed from: u */
    public boolean f28111u;

    /* JADX INFO: renamed from: v */
    public boolean f28112v;

    /* JADX INFO: renamed from: w */
    public RenderMode f28113w;

    /* JADX INFO: renamed from: x */
    public Set<LottieOnCompositionLoadedListener> f28114x;

    /* JADX INFO: renamed from: y */
    public int f28115y;

    /* JADX INFO: renamed from: z */
    public LottieTask2<LottieComposition> f28116z;

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$a */
    public class C5773a implements LottieListener<Throwable> {
        @Override // p007c.p056c.p057a.LottieListener
        /* JADX INFO: renamed from: a */
        public void mo1461a(Throwable th) {
            Throwable th2 = th;
            ThreadLocal<PathMeasure> threadLocal = Utils.f2337a;
            if (!((th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException))) {
                throw new IllegalStateException("Unable to parse composition", th2);
            }
            Logger2.m1421c("Unable to load composition.", th2);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$b */
    public class C5774b implements LottieListener<LottieComposition> {
        public C5774b() {
        }

        @Override // p007c.p056c.p057a.LottieListener
        /* JADX INFO: renamed from: a */
        public void mo1461a(LottieComposition lottieComposition) {
            LottieAnimationView.this.setComposition(lottieComposition);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$c */
    public class C5775c implements LottieListener<Throwable> {
        public C5775c() {
        }

        @Override // p007c.p056c.p057a.LottieListener
        /* JADX INFO: renamed from: a */
        public void mo1461a(Throwable th) {
            Throwable th2 = th;
            LottieAnimationView lottieAnimationView = LottieAnimationView.this;
            int i = lottieAnimationView.f28103m;
            if (i != 0) {
                lottieAnimationView.setImageResource(i);
            }
            LottieListener<Throwable> lottieListener = LottieAnimationView.this.f28102l;
            if (lottieListener == null) {
                String str = LottieAnimationView.f28097h;
                lottieListener = LottieAnimationView.f28098i;
            }
            lottieListener.mo1461a(th2);
        }
    }

    /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$d */
    public static class C5776d extends View.BaseSavedState {
        public static final Parcelable.Creator<C5776d> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public String f28119f;

        /* JADX INFO: renamed from: g */
        public int f28120g;

        /* JADX INFO: renamed from: h */
        public float f28121h;

        /* JADX INFO: renamed from: i */
        public boolean f28122i;

        /* JADX INFO: renamed from: j */
        public String f28123j;

        /* JADX INFO: renamed from: k */
        public int f28124k;

        /* JADX INFO: renamed from: l */
        public int f28125l;

        /* JADX INFO: renamed from: com.airbnb.lottie.LottieAnimationView$d$a */
        public class a implements Parcelable.Creator<C5776d> {
            @Override // android.os.Parcelable.Creator
            public C5776d createFromParcel(Parcel parcel) {
                return new C5776d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public C5776d[] newArray(int i) {
                return new C5776d[i];
            }
        }

        public C5776d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f28119f);
            parcel.writeFloat(this.f28121h);
            parcel.writeInt(this.f28122i ? 1 : 0);
            parcel.writeString(this.f28123j);
            parcel.writeInt(this.f28124k);
            parcel.writeInt(this.f28125l);
        }

        public C5776d(Parcel parcel, C5773a c5773a) {
            super(parcel);
            this.f28119f = parcel.readString();
            this.f28121h = parcel.readFloat();
            this.f28122i = parcel.readInt() == 1;
            this.f28123j = parcel.readString();
            this.f28124k = parcel.readInt();
            this.f28125l = parcel.readInt();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.f28100j = new C5774b();
        this.f28101k = new C5775c();
        this.f28103m = 0;
        this.f28104n = new LottieDrawable();
        this.f28108r = false;
        this.f28109s = false;
        this.f28110t = false;
        this.f28111u = false;
        this.f28112v = true;
        this.f28113w = RenderMode.AUTOMATIC;
        this.f28114x = new HashSet();
        this.f28115y = 0;
        m12549f(null, R.attr.lottieAnimationViewStyle);
    }

    private void setCompositionTask(LottieTask2<LottieComposition> lottieTask2) {
        this.f28099A = null;
        this.f28104n.m1464c();
        m12547d();
        lottieTask2.m1488b(this.f28100j);
        lottieTask2.m1487a(this.f28101k);
        this.f28116z = lottieTask2;
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        this.f28115y++;
        super.buildDrawingCache(z);
        if (this.f28115y == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(RenderMode.HARDWARE);
        }
        this.f28115y--;
        L.m1365a("buildDrawingCache");
    }

    /* JADX INFO: renamed from: c */
    public void m12546c() {
        this.f28110t = false;
        this.f28109s = false;
        this.f28108r = false;
        LottieDrawable lottieDrawable = this.f28104n;
        lottieDrawable.f2401l.clear();
        lottieDrawable.f2397h.cancel();
        m12548e();
    }

    /* JADX INFO: renamed from: d */
    public final void m12547d() {
        LottieTask2<LottieComposition> lottieTask2 = this.f28116z;
        if (lottieTask2 != null) {
            LottieListener<LottieComposition> lottieListener = this.f28100j;
            synchronized (lottieTask2) {
                lottieTask2.f2483b.remove(lottieListener);
            }
            LottieTask2<LottieComposition> lottieTask3 = this.f28116z;
            LottieListener<Throwable> lottieListener2 = this.f28101k;
            synchronized (lottieTask3) {
                lottieTask3.f2484c.remove(lottieListener2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:5:0x000c  */
    /* JADX INFO: renamed from: e */
    public final void m12548e() {
        int i;
        int iOrdinal = this.f28113w.ordinal();
        int i2 = 2;
        if (iOrdinal == 0) {
            LottieComposition lottieComposition = this.f28099A;
            boolean z = false;
            if ((lottieComposition == null || !lottieComposition.f2356n || Build.VERSION.SDK_INT >= 28) && ((lottieComposition == null || lottieComposition.f2357o <= 4) && (i = Build.VERSION.SDK_INT) != 24 && i != 25)) {
                z = true;
            }
            if (!z) {
                i2 = 1;
            }
        } else if (iOrdinal != 1) {
            i2 = 1;
        }
        if (i2 != getLayerType()) {
            setLayerType(i2, null);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12549f(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0469v.f2491a, i, 0);
        this.f28112v = typedArrayObtainStyledAttributes.getBoolean(1, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(9);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(5);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(15);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(9, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(5);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(15)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(4, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(0, false)) {
            this.f28110t = true;
            this.f28111u = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(7, false)) {
            this.f28104n.f2397h.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(12, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(11)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(11, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(14)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(14, 1.0f));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(6));
        setProgress(typedArrayObtainStyledAttributes.getFloat(8, 0.0f));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, false);
        LottieDrawable lottieDrawable = this.f28104n;
        if (lottieDrawable.f2410u != z) {
            lottieDrawable.f2410u = z;
            if (lottieDrawable.f2396g != null) {
                lottieDrawable.m1463b();
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f28104n.m1462a(new KeyPath("**"), LottieProperty.f2451C, new LottieValueCallback(new SimpleColorFilter(typedArrayObtainStyledAttributes.getColor(2, 0))));
        }
        if (typedArrayObtainStyledAttributes.hasValue(13)) {
            LottieDrawable lottieDrawable2 = this.f28104n;
            lottieDrawable2.f2398i = typedArrayObtainStyledAttributes.getFloat(13, 1.0f);
            lottieDrawable2.m1483v();
        }
        if (typedArrayObtainStyledAttributes.hasValue(10)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(10, 0);
            RenderMode.values();
            if (i2 >= 3) {
                i2 = 0;
            }
            setRenderMode(RenderMode.values()[i2]);
        }
        if (getScaleType() != null) {
            this.f28104n.f2403n = getScaleType();
        }
        typedArrayObtainStyledAttributes.recycle();
        LottieDrawable lottieDrawable3 = this.f28104n;
        Context context = getContext();
        ThreadLocal<PathMeasure> threadLocal = Utils.f2337a;
        Boolean boolValueOf = Boolean.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f);
        Objects.requireNonNull(lottieDrawable3);
        lottieDrawable3.f2399j = boolValueOf.booleanValue();
        m12548e();
        this.f28105o = true;
    }

    /* JADX INFO: renamed from: g */
    public void m12550g() {
        this.f28111u = false;
        this.f28110t = false;
        this.f28109s = false;
        this.f28108r = false;
        LottieDrawable lottieDrawable = this.f28104n;
        lottieDrawable.f2401l.clear();
        lottieDrawable.f2397h.m1428l();
        m12548e();
    }

    public LottieComposition getComposition() {
        return this.f28099A;
    }

    public long getDuration() {
        LottieComposition lottieComposition = this.f28099A;
        if (lottieComposition != null) {
            return (long) lottieComposition.m1444b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.f28104n.f2397h.f2328k;
    }

    public String getImageAssetsFolder() {
        return this.f28104n.f2405p;
    }

    public float getMaxFrame() {
        return this.f28104n.m1466e();
    }

    public float getMinFrame() {
        return this.f28104n.m1467f();
    }

    public PerformanceTracker getPerformanceTracker() {
        LottieComposition lottieComposition = this.f28104n.f2396g;
        if (lottieComposition != null) {
            return lottieComposition.f2343a;
        }
        return null;
    }

    public float getProgress() {
        return this.f28104n.m1468g();
    }

    public int getRepeatCount() {
        return this.f28104n.m1469h();
    }

    public int getRepeatMode() {
        return this.f28104n.f2397h.getRepeatMode();
    }

    public float getScale() {
        return this.f28104n.f2398i;
    }

    public float getSpeed() {
        return this.f28104n.f2397h.f2325h;
    }

    /* JADX INFO: renamed from: h */
    public void m12551h() {
        if (!isShown()) {
            this.f28108r = true;
        } else {
            this.f28104n.m1471j();
            m12548e();
        }
    }

    /* JADX INFO: renamed from: i */
    public void m12552i() {
        if (isShown()) {
            this.f28104n.m1472k();
            m12548e();
        } else {
            this.f28108r = false;
            this.f28109s = true;
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        LottieDrawable lottieDrawable = this.f28104n;
        if (drawable2 == lottieDrawable) {
            super.invalidateDrawable(lottieDrawable);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && (this.f28111u || this.f28110t)) {
            m12551h();
            this.f28111u = false;
            this.f28110t = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        if (this.f28104n.m1470i()) {
            m12546c();
            this.f28110t = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5776d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5776d c5776d = (C5776d) parcelable;
        super.onRestoreInstanceState(c5776d.getSuperState());
        String str = c5776d.f28119f;
        this.f28106p = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.f28106p);
        }
        int i = c5776d.f28120g;
        this.f28107q = i;
        if (i != 0) {
            setAnimation(i);
        }
        setProgress(c5776d.f28121h);
        if (c5776d.f28122i) {
            m12551h();
        }
        this.f28104n.f2405p = c5776d.f28123j;
        setRepeatMode(c5776d.f28124k);
        setRepeatCount(c5776d.f28125l);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0030  */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C5776d c5776d = new C5776d(super.onSaveInstanceState());
        c5776d.f28119f = this.f28106p;
        c5776d.f28120g = this.f28107q;
        c5776d.f28121h = this.f28104n.m1468g();
        if (this.f28104n.m1470i()) {
            z = true;
        } else {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (isAttachedToWindow() || !this.f28110t) {
                z = false;
            } else {
                z = true;
            }
        }
        c5776d.f28122i = z;
        LottieDrawable lottieDrawable = this.f28104n;
        c5776d.f28123j = lottieDrawable.f2405p;
        c5776d.f28124k = lottieDrawable.f2397h.getRepeatMode();
        c5776d.f28125l = this.f28104n.m1469h();
        return c5776d;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        if (this.f28105o) {
            if (!isShown()) {
                if (this.f28104n.m1470i()) {
                    m12550g();
                    this.f28109s = true;
                    return;
                }
                return;
            }
            if (this.f28109s) {
                m12552i();
            } else if (this.f28108r) {
                m12551h();
            }
            this.f28109s = false;
            this.f28108r = false;
        }
    }

    public void setAnimation(int i) {
        LottieTask2<LottieComposition> lottieTask2M1453a;
        LottieTask2<LottieComposition> lottieTask2;
        this.f28107q = i;
        this.f28106p = null;
        if (isInEditMode()) {
            lottieTask2 = new LottieTask2<>(new LottieAnimationView2(this, i), true);
        } else {
            if (this.f28112v) {
                Context context = getContext();
                String strM1460h = LottieCompositionFactory.m1460h(context, i);
                lottieTask2M1453a = LottieCompositionFactory.m1453a(strM1460h, new LottieCompositionFactory4(new WeakReference(context), context.getApplicationContext(), i, strM1460h));
            } else {
                Context context2 = getContext();
                Map<String, LottieTask2<LottieComposition>> map = LottieCompositionFactory.f2378a;
                lottieTask2M1453a = LottieCompositionFactory.m1453a(null, new LottieCompositionFactory4(new WeakReference(context2), context2.getApplicationContext(), i, null));
            }
            lottieTask2 = lottieTask2M1453a;
        }
        setCompositionTask(lottieTask2);
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setCompositionTask(LottieCompositionFactory.m1453a(null, new LottieCompositionFactory5(new ByteArrayInputStream(str.getBytes()), null)));
    }

    public void setAnimationFromUrl(String str) {
        LottieTask2<LottieComposition> lottieTask2M1453a;
        if (this.f28112v) {
            Context context = getContext();
            Map<String, LottieTask2<LottieComposition>> map = LottieCompositionFactory.f2378a;
            String strM1599u = outline.m1599u("url_", str);
            lottieTask2M1453a = LottieCompositionFactory.m1453a(strM1599u, new LottieCompositionFactory2(context, str, strM1599u));
        } else {
            lottieTask2M1453a = LottieCompositionFactory.m1453a(null, new LottieCompositionFactory2(getContext(), str, null));
        }
        setCompositionTask(lottieTask2M1453a);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f28104n.f2414y = z;
    }

    public void setCacheComposition(boolean z) {
        this.f28112v = z;
    }

    public void setComposition(LottieComposition lottieComposition) {
        this.f28104n.setCallback(this);
        this.f28099A = lottieComposition;
        LottieDrawable lottieDrawable = this.f28104n;
        boolean z = false;
        if (lottieDrawable.f2396g != lottieComposition) {
            lottieDrawable.f2394A = false;
            lottieDrawable.m1464c();
            lottieDrawable.f2396g = lottieComposition;
            lottieDrawable.m1463b();
            LottieValueAnimator lottieValueAnimator = lottieDrawable.f2397h;
            z = lottieValueAnimator.f2332o == null;
            lottieValueAnimator.f2332o = lottieComposition;
            if (z) {
                lottieValueAnimator.m1430n((int) Math.max(lottieValueAnimator.f2330m, lottieComposition.f2353k), (int) Math.min(lottieValueAnimator.f2331n, lottieComposition.f2354l));
            } else {
                lottieValueAnimator.m1430n((int) lottieComposition.f2353k, (int) lottieComposition.f2354l);
            }
            float f = lottieValueAnimator.f2328k;
            lottieValueAnimator.f2328k = 0.0f;
            lottieValueAnimator.m1429m((int) f);
            lottieValueAnimator.m1415b();
            lottieDrawable.m1482u(lottieDrawable.f2397h.getAnimatedFraction());
            lottieDrawable.f2398i = lottieDrawable.f2398i;
            lottieDrawable.m1483v();
            lottieDrawable.m1483v();
            Iterator it = new ArrayList(lottieDrawable.f2401l).iterator();
            while (it.hasNext()) {
                ((LottieDrawable.o) it.next()).mo1485a(lottieComposition);
                it.remove();
            }
            lottieDrawable.f2401l.clear();
            lottieComposition.f2343a.f2488a = lottieDrawable.f2413x;
            Drawable.Callback callback = lottieDrawable.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(lottieDrawable);
            }
            z = true;
        }
        m12548e();
        if (getDrawable() != this.f28104n || z) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator<LottieOnCompositionLoadedListener> it2 = this.f28114x.iterator();
            while (it2.hasNext()) {
                it2.next().m1486a(lottieComposition);
            }
        }
    }

    public void setFailureListener(LottieListener<Throwable> lottieListener) {
        this.f28102l = lottieListener;
    }

    public void setFallbackResource(int i) {
        this.f28103m = i;
    }

    public void setFontAssetDelegate(FontAssetDelegate fontAssetDelegate) {
        LottieDrawable lottieDrawable = this.f28104n;
        lottieDrawable.f2408s = fontAssetDelegate;
        FontAssetManager fontAssetManager = lottieDrawable.f2407r;
        if (fontAssetManager != null) {
            fontAssetManager.f1959e = fontAssetDelegate;
        }
    }

    public void setFrame(int i) {
        this.f28104n.m1473l(i);
    }

    public void setImageAssetDelegate(ImageAssetDelegate imageAssetDelegate) {
        LottieDrawable lottieDrawable = this.f28104n;
        lottieDrawable.f2406q = imageAssetDelegate;
        ImageAssetManager imageAssetManager = lottieDrawable.f2404o;
        if (imageAssetManager != null) {
            imageAssetManager.f1964d = imageAssetDelegate;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.f28104n.f2405p = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m12547d();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m12547d();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        m12547d();
        super.setImageResource(i);
    }

    public void setMaxFrame(int i) {
        this.f28104n.m1474m(i);
    }

    public void setMaxProgress(float f) {
        this.f28104n.m1476o(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f28104n.m1478q(str);
    }

    public void setMinFrame(int i) {
        this.f28104n.m1479r(i);
    }

    public void setMinProgress(float f) {
        this.f28104n.m1481t(f);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        LottieDrawable lottieDrawable = this.f28104n;
        lottieDrawable.f2413x = z;
        LottieComposition lottieComposition = lottieDrawable.f2396g;
        if (lottieComposition != null) {
            lottieComposition.f2343a.f2488a = z;
        }
    }

    public void setProgress(float f) {
        this.f28104n.m1482u(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        this.f28113w = renderMode;
        m12548e();
    }

    public void setRepeatCount(int i) {
        this.f28104n.f2397h.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.f28104n.f2397h.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.f28104n.f2400k = z;
    }

    public void setScale(float f) {
        LottieDrawable lottieDrawable = this.f28104n;
        lottieDrawable.f2398i = f;
        lottieDrawable.m1483v();
        if (getDrawable() == this.f28104n) {
            setImageDrawable(null);
            setImageDrawable(this.f28104n);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        LottieDrawable lottieDrawable = this.f28104n;
        if (lottieDrawable != null) {
            lottieDrawable.f2403n = scaleType;
        }
    }

    public void setSpeed(float f) {
        this.f28104n.f2397h.f2325h = f;
    }

    public void setTextDelegate(TextDelegate textDelegate) {
        this.f28104n.f2409t = textDelegate;
    }

    public void setMaxFrame(String str) {
        this.f28104n.m1475n(str);
    }

    public void setMinFrame(String str) {
        this.f28104n.m1480s(str);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28100j = new C5774b();
        this.f28101k = new C5775c();
        this.f28103m = 0;
        this.f28104n = new LottieDrawable();
        this.f28108r = false;
        this.f28109s = false;
        this.f28110t = false;
        this.f28111u = false;
        this.f28112v = true;
        this.f28113w = RenderMode.AUTOMATIC;
        this.f28114x = new HashSet();
        this.f28115y = 0;
        m12549f(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public void setAnimation(String str) {
        LottieTask2<LottieComposition> lottieTask2M1453a;
        LottieTask2<LottieComposition> lottieTask2;
        this.f28106p = str;
        this.f28107q = 0;
        if (isInEditMode()) {
            lottieTask2 = new LottieTask2<>(new LottieAnimationView3(this, str), true);
        } else {
            if (this.f28112v) {
                Context context = getContext();
                Map<String, LottieTask2<LottieComposition>> map = LottieCompositionFactory.f2378a;
                String strM1599u = outline.m1599u("asset_", str);
                lottieTask2M1453a = LottieCompositionFactory.m1453a(strM1599u, new LottieCompositionFactory3(context.getApplicationContext(), str, strM1599u));
            } else {
                Context context2 = getContext();
                Map<String, LottieTask2<LottieComposition>> map2 = LottieCompositionFactory.f2378a;
                lottieTask2M1453a = LottieCompositionFactory.m1453a(null, new LottieCompositionFactory3(context2.getApplicationContext(), str, null));
            }
            lottieTask2 = lottieTask2M1453a;
        }
        setCompositionTask(lottieTask2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28100j = new C5774b();
        this.f28101k = new C5775c();
        this.f28103m = 0;
        this.f28104n = new LottieDrawable();
        this.f28108r = false;
        this.f28109s = false;
        this.f28110t = false;
        this.f28111u = false;
        this.f28112v = true;
        this.f28113w = RenderMode.AUTOMATIC;
        this.f28114x = new HashSet();
        this.f28115y = 0;
        m12549f(attributeSet, i);
    }
}
