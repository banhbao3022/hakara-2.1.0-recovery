package p636z0.p688f0.p689a.p690a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p636z0.p691g.ArrayMap;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.ResourcesCompat;

/* JADX INFO: renamed from: z0.f0.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable {

    /* JADX INFO: renamed from: g */
    public b f36536g;

    /* JADX INFO: renamed from: h */
    public Context f36537h;

    /* JADX INFO: renamed from: i */
    public ArgbEvaluator f36538i;

    /* JADX INFO: renamed from: j */
    public final Drawable.Callback f36539j;

    /* JADX INFO: renamed from: z0.f0.a.a.b$a */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public class a implements Drawable.Callback {
        public a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: z0.f0.a.a.b$b */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f36541a;

        /* JADX INFO: renamed from: b */
        public VectorDrawableCompat f36542b;

        /* JADX INFO: renamed from: c */
        public AnimatorSet f36543c;

        /* JADX INFO: renamed from: d */
        public ArrayList<Animator> f36544d;

        /* JADX INFO: renamed from: e */
        public ArrayMap<Animator, String> f36545e;

        public b(Context context, b bVar, Drawable.Callback callback, Resources resources) {
            if (bVar != null) {
                this.f36541a = bVar.f36541a;
                VectorDrawableCompat vectorDrawableCompat = bVar.f36542b;
                if (vectorDrawableCompat != null) {
                    Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.f36542b = (VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.f36542b = (VectorDrawableCompat) constantState.newDrawable();
                    }
                    VectorDrawableCompat vectorDrawableCompat2 = this.f36542b;
                    vectorDrawableCompat2.mutate();
                    this.f36542b = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.f36542b.setBounds(bVar.f36542b.getBounds());
                    this.f36542b.f36555l = false;
                }
                ArrayList<Animator> arrayList = bVar.f36544d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f36544d = new ArrayList<>(size);
                    this.f36545e = new ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = bVar.f36544d.get(i);
                        Animator animatorClone = animator.clone();
                        String orDefault = bVar.f36545e.getOrDefault(animator, null);
                        animatorClone.setTarget(this.f36542b.f36551h.f36606b.f36604q.getOrDefault(orDefault, null));
                        this.f36544d.add(animatorClone);
                        this.f36545e.put(animatorClone, orDefault);
                    }
                    if (this.f36543c == null) {
                        this.f36543c = new AnimatorSet();
                    }
                    this.f36543c.playTogether(this.f36544d);
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36541a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    public AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    @Override // p636z0.p688f0.p689a.p690a.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f36536g.f36542b.draw(canvas);
        if (this.f36536g.f36543c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getAlpha() : this.f36536g.f36542b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f36536g.f36541a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getColorFilter() : this.f36536g.f36542b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f36549f == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f36549f.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f36536g.f36542b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f36536g.f36542b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getOpacity() : this.f36536g.f36542b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        XmlResourceParser animation;
        Animator animatorM15549a;
        VectorDrawableCompat vectorDrawableCompatM15554a;
        int next;
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM16038I = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36528e);
                    int resourceId = typedArrayM16038I.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = VectorDrawableCompat.f36550g;
                        if (Build.VERSION.SDK_INT >= 24) {
                            vectorDrawableCompatM15554a = new VectorDrawableCompat();
                            ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f37835a;
                            vectorDrawableCompatM15554a.f36549f = resources.getDrawable(resourceId, theme);
                            new VectorDrawableCompat.i(vectorDrawableCompatM15554a.f36549f.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
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
                                vectorDrawableCompatM15554a = VectorDrawableCompat.m15554a(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e) {
                                Log.e("VectorDrawableCompat", "parser error", e);
                                vectorDrawableCompatM15554a = null;
                            } catch (XmlPullParserException e2) {
                                Log.e("VectorDrawableCompat", "parser error", e2);
                                vectorDrawableCompatM15554a = null;
                            }
                        }
                        vectorDrawableCompatM15554a.f36555l = false;
                        vectorDrawableCompatM15554a.setCallback(this.f36539j);
                        VectorDrawableCompat vectorDrawableCompat = this.f36536g.f36542b;
                        if (vectorDrawableCompat != null) {
                            vectorDrawableCompat.setCallback(null);
                        }
                        this.f36536g.f36542b = vectorDrawableCompatM15554a;
                    }
                    typedArrayM16038I.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AndroidResources.f36529f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f36537h;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            animatorM15549a = AnimatorInflater.loadAnimator(context, resourceId2);
                        } else {
                            Resources resources2 = context.getResources();
                            Resources.Theme theme2 = context.getTheme();
                            try {
                                try {
                                    animation = resources2.getAnimation(resourceId2);
                                    try {
                                        animatorM15549a = AnimatorInflaterCompat.m15549a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0, 1.0f);
                                        animation.close();
                                    } catch (IOException e3) {
                                        e = e3;
                                        Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException.initCause(e);
                                        throw notFoundException;
                                    } catch (XmlPullParserException e4) {
                                        e = e4;
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e);
                                        throw notFoundException2;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (animation != null) {
                                            animation.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    animation = null;
                                }
                            } catch (IOException e5) {
                                e = e5;
                            } catch (XmlPullParserException e6) {
                                e = e6;
                            }
                        }
                        animatorM15549a.setTarget(this.f36536g.f36542b.f36551h.f36606b.f36604q.getOrDefault(string, null));
                        b bVar = this.f36536g;
                        if (bVar.f36544d == null) {
                            bVar.f36544d = new ArrayList<>();
                            this.f36536g.f36545e = new ArrayMap<>();
                        }
                        this.f36536g.f36544d.add(animatorM15549a);
                        this.f36536g.f36545e.put(animatorM15549a, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        b bVar2 = this.f36536g;
        if (bVar2.f36543c == null) {
            bVar2.f36543c = new AnimatorSet();
        }
        bVar2.f36543c.playTogether(bVar2.f36544d);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.isAutoMirrored() : this.f36536g.f36542b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f36549f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f36536g.f36543c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.isStateful() : this.f36536g.f36542b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f36536g.f36542b.setBounds(rect);
        }
    }

    @Override // p636z0.p688f0.p689a.p690a.VectorDrawableCommon, android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.setLevel(i) : this.f36536g.f36542b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.setState(iArr) : this.f36536g.f36542b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f36536g.f36542b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
            return;
        }
        VectorDrawableCompat vectorDrawableCompat = this.f36536g.f36542b;
        Drawable drawable2 = vectorDrawableCompat.f36549f;
        if (drawable2 != null) {
            drawable2.setAutoMirrored(z);
        } else {
            vectorDrawableCompat.f36551h.f36609e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        VectorDrawableCompat vectorDrawableCompat = this.f36536g.f36542b;
        Drawable drawable2 = vectorDrawableCompat.f36549f;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        } else {
            vectorDrawableCompat.f36553j = colorFilter;
            vectorDrawableCompat.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            C8162a.m16048S(drawable, i);
        } else {
            this.f36536g.f36542b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            C8162a.m16049T(drawable, colorStateList);
        } else {
            this.f36536g.f36542b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            C8162a.m16050U(drawable, mode);
        } else {
            this.f36536g.f36542b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f36536g.f36542b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f36536g.f36543c.isStarted()) {
                return;
            }
            this.f36536g.f36543c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f36536g.f36543c.end();
        }
    }

    public AnimatedVectorDrawableCompat(Context context, b bVar, Resources resources) {
        this.f36538i = null;
        a aVar = new a();
        this.f36539j = aVar;
        this.f36537h = context;
        this.f36536g = new b(context, null, aVar, null);
    }

    /* JADX INFO: renamed from: z0.f0.a.a.b$c */
    /* JADX INFO: compiled from: AnimatedVectorDrawableCompat.java */
    public static class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f36546a;

        public c(Drawable.ConstantState constantState) {
            this.f36546a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f36546a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36546a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, null, null);
            Drawable drawableNewDrawable = this.f36546a.newDrawable();
            animatedVectorDrawableCompat.f36549f = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f36539j);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, null, null);
            Drawable drawableNewDrawable = this.f36546a.newDrawable(resources);
            animatedVectorDrawableCompat.f36549f = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f36539j);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null, null, null);
            Drawable drawableNewDrawable = this.f36546a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f36549f = drawableNewDrawable;
            drawableNewDrawable.setCallback(animatedVectorDrawableCompat.f36539j);
            return animatedVectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
