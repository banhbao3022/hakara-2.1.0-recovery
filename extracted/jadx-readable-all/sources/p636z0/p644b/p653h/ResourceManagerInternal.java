package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import mtp.media.karaoke.R;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p636z0.p644b.p648e.p649a.AnimatedStateListDrawableCompat;
import p636z0.p688f0.p689a.p690a.AnimatedVectorDrawableCompat;
import p636z0.p688f0.p689a.p690a.VectorDrawableCompat;
import p636z0.p691g.LongSparseArray;
import p636z0.p691g.LruCache2;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p691g.SparseArrayCompat;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.b.h.n0, reason: use source file name */
/* JADX INFO: compiled from: ResourceManagerInternal.java */
/* JADX INFO: loaded from: classes.dex */
public final class ResourceManagerInternal {

    /* JADX INFO: renamed from: b */
    public static ResourceManagerInternal f35132b;

    /* JADX INFO: renamed from: d */
    public WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f35134d;

    /* JADX INFO: renamed from: e */
    public SimpleArrayMap<String, e> f35135e;

    /* JADX INFO: renamed from: f */
    public SparseArrayCompat<String> f35136f;

    /* JADX INFO: renamed from: g */
    public final WeakHashMap<Context, LongSparseArray<WeakReference<Drawable.ConstantState>>> f35137g = new WeakHashMap<>(0);

    /* JADX INFO: renamed from: h */
    public TypedValue f35138h;

    /* JADX INFO: renamed from: i */
    public boolean f35139i;

    /* JADX INFO: renamed from: j */
    public f f35140j;

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f35131a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c */
    public static final c f35133c = new c(6);

    /* JADX INFO: renamed from: z0.b.h.n0$a */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class a implements e {
        @Override // p636z0.p644b.p653h.ResourceManagerInternal.e
        /* JADX INFO: renamed from: a */
        public Drawable mo14944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return AnimatedStateListDrawableCompat.m14708g(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.n0$b */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class b implements e {
        @Override // p636z0.p644b.p653h.ResourceManagerInternal.e
        /* JADX INFO: renamed from: a */
        public Drawable mo14944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context, null, null);
                animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
                return animatedVectorDrawableCompat;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.n0$c */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class c extends LruCache2<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }
    }

    /* JADX INFO: renamed from: z0.b.h.n0$d */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class d implements e {
        @Override // p636z0.p644b.p653h.ResourceManagerInternal.e
        /* JADX INFO: renamed from: a */
        public Drawable mo14944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.n0$e */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public interface e {
        /* JADX INFO: renamed from: a */
        Drawable mo14944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* JADX INFO: renamed from: z0.b.h.n0$f */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public interface f {
    }

    /* JADX INFO: renamed from: z0.b.h.n0$g */
    /* JADX INFO: compiled from: ResourceManagerInternal.java */
    public static class g implements e {
        @Override // p636z0.p644b.p653h.ResourceManagerInternal.e
        /* JADX INFO: renamed from: a */
        public Drawable mo14944a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return VectorDrawableCompat.m15554a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static synchronized ResourceManagerInternal m14931d() {
        if (f35132b == null) {
            ResourceManagerInternal resourceManagerInternal = new ResourceManagerInternal();
            f35132b = resourceManagerInternal;
            m14933j(resourceManagerInternal);
        }
        return f35132b;
    }

    /* JADX INFO: renamed from: h */
    public static synchronized PorterDuffColorFilter m14932h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterM15597a;
        c cVar = f35133c;
        Objects.requireNonNull(cVar);
        int i2 = (i + 31) * 31;
        porterDuffColorFilterM15597a = cVar.m15597a(Integer.valueOf(mode.hashCode() + i2));
        if (porterDuffColorFilterM15597a == null) {
            porterDuffColorFilterM15597a = new PorterDuffColorFilter(i, mode);
            Objects.requireNonNull(cVar);
            cVar.m15598b(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilterM15597a);
        }
        return porterDuffColorFilterM15597a;
    }

    /* JADX INFO: renamed from: j */
    public static void m14933j(ResourceManagerInternal resourceManagerInternal) {
        if (Build.VERSION.SDK_INT < 24) {
            resourceManagerInternal.m14934a("vector", new g());
            resourceManagerInternal.m14934a("animated-vector", new b());
            resourceManagerInternal.m14934a("animated-selector", new a());
            resourceManagerInternal.m14934a("drawable", new d());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14934a(String str, e eVar) {
        if (this.f35135e == null) {
            this.f35135e = new SimpleArrayMap<>();
        }
        this.f35135e.put(str, eVar);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m14935b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.f35137g.get(context);
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
            this.f35137g.put(context, longSparseArray);
        }
        longSparseArray.m15593m(j2, new WeakReference<>(constantState));
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final Drawable m14936c(Context context, int i) {
        if (this.f35138h == null) {
            this.f35138h = new TypedValue();
        }
        TypedValue typedValue = this.f35138h;
        context.getResources().getValue(i, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM14937e = m14937e(context, j2);
        if (drawableM14937e != null) {
            return drawableM14937e;
        }
        f fVar = this.f35140j;
        LayerDrawable layerDrawableM14912c = null;
        if (fVar != null) {
            AppCompatDrawableManager.a aVar = (AppCompatDrawableManager.a) fVar;
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawableM14912c = new LayerDrawable(new Drawable[]{m14938f(context, R.drawable.abc_cab_background_internal_bg), m14938f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i == R.drawable.abc_ratingbar_material) {
                layerDrawableM14912c = aVar.m14912c(this, context, R.dimen.abc_star_big);
            } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableM14912c = aVar.m14912c(this, context, R.dimen.abc_star_medium);
            } else if (i == R.drawable.abc_ratingbar_small_material) {
                layerDrawableM14912c = aVar.m14912c(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableM14912c != null) {
            layerDrawableM14912c.setChangingConfigurations(typedValue.changingConfigurations);
            m14935b(context, j2, layerDrawableM14912c);
        }
        return layerDrawableM14912c;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized Drawable m14937e(Context context, long j2) {
        LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = this.f35137g.get(context);
        if (longSparseArray == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> weakReferenceM15590j = longSparseArray.m15590j(j2, null);
        if (weakReferenceM15590j != null) {
            Drawable.ConstantState constantState = weakReferenceM15590j.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            longSparseArray.m15594n(j2);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public synchronized Drawable m14938f(Context context, int i) {
        return m14939g(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r0 != false) goto L15;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized android.graphics.drawable.Drawable m14939g(android.content.Context r5, int r6, boolean r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f35139i     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L6
            goto L2b
        L6:
            r0 = 1
            r4.f35139i = r0     // Catch: java.lang.Throwable -> L4a
            r1 = 2131230866(0x7f080092, float:1.8077797E38)
            android.graphics.drawable.Drawable r1 = r4.m14938f(r5, r1)     // Catch: java.lang.Throwable -> L4a
            r2 = 0
            if (r1 == 0) goto L4c
            boolean r3 = r1 instanceof p636z0.p688f0.p689a.p690a.VectorDrawableCompat     // Catch: java.lang.Throwable -> L4a
            if (r3 != 0) goto L29
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r1 = r1.getClass()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4a
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L28
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L4c
        L2b:
            android.graphics.drawable.Drawable r0 = r4.m14941k(r5, r6)     // Catch: java.lang.Throwable -> L4a
            if (r0 != 0) goto L35
            android.graphics.drawable.Drawable r0 = r4.m14936c(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L35:
            if (r0 != 0) goto L3d
            java.lang.Object r0 = p636z0.p725k.p727d.ContextCompat.f37815a     // Catch: java.lang.Throwable -> L4a
            android.graphics.drawable.Drawable r0 = p636z0.p725k.p727d.ContextCompat.c.m16141b(r5, r6)     // Catch: java.lang.Throwable -> L4a
        L3d:
            if (r0 == 0) goto L43
            android.graphics.drawable.Drawable r0 = r4.m14942l(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L4a
        L43:
            if (r0 == 0) goto L48
            p636z0.p644b.p653h.DrawableUtils.m14886b(r0)     // Catch: java.lang.Throwable -> L4a
        L48:
            monitor-exit(r4)
            return r0
        L4a:
            r5 = move-exception
            goto L56
        L4c:
            r4.f35139i = r2     // Catch: java.lang.Throwable -> L4a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4a
            throw r5     // Catch: java.lang.Throwable -> L4a
        L56:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p636z0.p644b.p653h.ResourceManagerInternal.m14939g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX INFO: renamed from: i */
    public synchronized ColorStateList m14940i(Context context, int i) {
        ColorStateList colorStateListM15617g;
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.f35134d;
        ColorStateList colorStateListM14913d = null;
        colorStateListM15617g = (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) ? null : sparseArrayCompat.m15617g(i, null);
        if (colorStateListM15617g == null) {
            f fVar = this.f35140j;
            if (fVar != null) {
                colorStateListM14913d = ((AppCompatDrawableManager.a) fVar).m14913d(context, i);
            }
            if (colorStateListM14913d != null) {
                if (this.f35134d == null) {
                    this.f35134d = new WeakHashMap<>();
                }
                SparseArrayCompat<ColorStateList> sparseArrayCompat2 = this.f35134d.get(context);
                if (sparseArrayCompat2 == null) {
                    sparseArrayCompat2 = new SparseArrayCompat<>();
                    this.f35134d.put(context, sparseArrayCompat2);
                }
                sparseArrayCompat2.m15613a(i, colorStateListM14913d);
            }
            colorStateListM15617g = colorStateListM14913d;
        }
        return colorStateListM15617g;
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m14941k(Context context, int i) {
        int next;
        SimpleArrayMap<String, e> simpleArrayMap = this.f35135e;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.f35136f;
        if (sparseArrayCompat != null) {
            String strM15617g = sparseArrayCompat.m15617g(i, null);
            if ("appcompat_skip_skip".equals(strM15617g) || (strM15617g != null && this.f35135e.getOrDefault(strM15617g, null) == null)) {
                return null;
            }
        } else {
            this.f35136f = new SparseArrayCompat<>();
        }
        if (this.f35138h == null) {
            this.f35138h = new TypedValue();
        }
        TypedValue typedValue = this.f35138h;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j2 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableM14937e = m14937e(context, j2);
        if (drawableM14937e != null) {
            return drawableM14937e;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f35136f.m15613a(i, name);
                e eVar = this.f35135e.get(name);
                if (eVar != null) {
                    drawableM14937e = eVar.mo14944a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableM14937e != null) {
                    drawableM14937e.setChangingConfigurations(typedValue.changingConfigurations);
                    m14935b(context, j2, drawableM14937e);
                }
            } catch (Exception e2) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e2);
            }
        }
        if (drawableM14937e == null) {
            this.f35136f.m15613a(i, "appcompat_skip_skip");
        }
        return drawableM14937e;
    }

    /* JADX INFO: renamed from: l */
    public final Drawable m14942l(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList colorStateListM14940i = m14940i(context, i);
        PorterDuff.Mode mode = null;
        if (colorStateListM14940i != null) {
            if (DrawableUtils.m14885a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableM16054Y = C8162a.m16054Y(drawable);
            drawableM16054Y.setTintList(colorStateListM14940i);
            f fVar = this.f35140j;
            if (fVar != null) {
                if (i == R.drawable.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
            }
            if (mode == null) {
                return drawableM16054Y;
            }
            drawableM16054Y.setTintMode(mode);
            return drawableM16054Y;
        }
        f fVar2 = this.f35140j;
        if (fVar2 != null) {
            AppCompatDrawableManager.a aVar = (AppCompatDrawableManager.a) fVar2;
            boolean z2 = true;
            if (i == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iM14964c = ThemeUtils.m14964c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = AppCompatDrawableManager.f35069a;
                aVar.m14914e(drawableFindDrawableByLayerId, iM14964c, mode2);
                aVar.m14914e(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.m14964c(context, R.attr.colorControlNormal), mode2);
                aVar.m14914e(layerDrawable.findDrawableByLayerId(android.R.id.progress), ThemeUtils.m14964c(context, R.attr.colorControlActivated), mode2);
            } else if (i == R.drawable.abc_ratingbar_material || i == R.drawable.abc_ratingbar_indicator_material || i == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iM14963b = ThemeUtils.m14963b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = AppCompatDrawableManager.f35069a;
                aVar.m14914e(drawableFindDrawableByLayerId2, iM14963b, mode3);
                aVar.m14914e(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), ThemeUtils.m14964c(context, R.attr.colorControlActivated), mode3);
                aVar.m14914e(layerDrawable2.findDrawableByLayerId(android.R.id.progress), ThemeUtils.m14964c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (m14943m(context, i, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0052  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public boolean m14943m(Context context, int i, Drawable drawable) {
        int i2;
        int iRound;
        boolean z;
        boolean z2;
        f fVar = this.f35140j;
        if (fVar != null) {
            AppCompatDrawableManager.a aVar = (AppCompatDrawableManager.a) fVar;
            Objects.requireNonNull(aVar);
            PorterDuff.Mode mode = AppCompatDrawableManager.f35069a;
            boolean zM14910a = aVar.m14910a(aVar.f35072a, i);
            int i3 = android.R.attr.colorBackground;
            if (zM14910a) {
                i3 = R.attr.colorControlNormal;
            } else if (aVar.m14910a(aVar.f35074c, i)) {
                i3 = R.attr.colorControlActivated;
            } else if (aVar.m14910a(aVar.f35075d, i)) {
                mode = PorterDuff.Mode.MULTIPLY;
            } else {
                if (i == R.drawable.abc_list_divider_mtrl_alpha) {
                    i2 = android.R.attr.colorForeground;
                    iRound = Math.round(40.8f);
                    z = true;
                } else if (i != R.drawable.abc_dialog_material_background) {
                    i2 = 0;
                    iRound = -1;
                    z = false;
                }
                if (z) {
                    if (DrawableUtils.m14885a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(AppCompatDrawableManager.m14905c(ThemeUtils.m14964c(context, i2), mode));
                    if (iRound != -1) {
                        drawable.setAlpha(iRound);
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            i2 = i3;
            iRound = -1;
            z = true;
            if (z) {
                if (DrawableUtils.m14885a(drawable)) {
                    drawable = drawable.mutate();
                }
                drawable.setColorFilter(AppCompatDrawableManager.m14905c(ThemeUtils.m14964c(context, i2), mode));
                if (iRound != -1) {
                    drawable.setAlpha(iRound);
                }
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }
}
