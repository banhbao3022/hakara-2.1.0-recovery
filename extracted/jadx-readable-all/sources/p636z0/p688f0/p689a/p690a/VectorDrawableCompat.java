package p636z0.p688f0.p689a.p690a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p636z0.p691g.ArrayMap;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.ColorStateListInflaterCompat;
import p636z0.p725k.p727d.p728c.ComplexColorCompat;
import p636z0.p725k.p729e.PathParser2;

/* JADX INFO: renamed from: z0.f0.a.a.f, reason: use source file name */
/* JADX INFO: compiled from: VectorDrawableCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {

    /* JADX INFO: renamed from: g */
    public static final PorterDuff.Mode f36550g = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h */
    public h f36551h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f36552i;

    /* JADX INFO: renamed from: j */
    public ColorFilter f36553j;

    /* JADX INFO: renamed from: k */
    public boolean f36554k;

    /* JADX INFO: renamed from: l */
    public boolean f36555l;

    /* JADX INFO: renamed from: m */
    public final float[] f36556m;

    /* JADX INFO: renamed from: n */
    public final Matrix f36557n;

    /* JADX INFO: renamed from: o */
    public final Rect f36558o;

    /* JADX INFO: renamed from: z0.f0.a.a.f$b */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: renamed from: z0.f0.a.a.f$e */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class e {
        public e() {
        }

        /* JADX INFO: renamed from: a */
        public boolean mo15556a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo15557b(int[] iArr) {
            return false;
        }

        public e(a aVar) {
        }
    }

    /* JADX INFO: renamed from: z0.f0.a.a.f$h */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f36605a;

        /* JADX INFO: renamed from: b */
        public g f36606b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f36607c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f36608d;

        /* JADX INFO: renamed from: e */
        public boolean f36609e;

        /* JADX INFO: renamed from: f */
        public Bitmap f36610f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f36611g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f36612h;

        /* JADX INFO: renamed from: i */
        public int f36613i;

        /* JADX INFO: renamed from: j */
        public boolean f36614j;

        /* JADX INFO: renamed from: k */
        public boolean f36615k;

        /* JADX INFO: renamed from: l */
        public Paint f36616l;

        public h(h hVar) {
            this.f36607c = null;
            this.f36608d = VectorDrawableCompat.f36550g;
            if (hVar != null) {
                this.f36605a = hVar.f36605a;
                g gVar = new g(hVar.f36606b);
                this.f36606b = gVar;
                if (hVar.f36606b.f36593f != null) {
                    gVar.f36593f = new Paint(hVar.f36606b.f36593f);
                }
                if (hVar.f36606b.f36592e != null) {
                    this.f36606b.f36592e = new Paint(hVar.f36606b.f36592e);
                }
                this.f36607c = hVar.f36607c;
                this.f36608d = hVar.f36608d;
                this.f36609e = hVar.f36609e;
            }
        }

        /* JADX INFO: renamed from: a */
        public boolean m15560a() {
            g gVar = this.f36606b;
            if (gVar.f36603p == null) {
                gVar.f36603p = Boolean.valueOf(gVar.f36596i.mo15556a());
            }
            return gVar.f36603p.booleanValue();
        }

        /* JADX INFO: renamed from: b */
        public void m15561b(int i, int i2) {
            this.f36610f.eraseColor(0);
            Canvas canvas = new Canvas(this.f36610f);
            g gVar = this.f36606b;
            gVar.m15559a(gVar.f36596i, g.f36588a, canvas, i, i2, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36605a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        public h() {
            this.f36607c = null;
            this.f36608d = VectorDrawableCompat.f36550g;
            this.f36606b = new g();
        }
    }

    public VectorDrawableCompat() {
        this.f36555l = true;
        this.f36556m = new float[9];
        this.f36557n = new Matrix();
        this.f36558o = new Rect();
        this.f36551h = new h();
    }

    /* JADX INFO: renamed from: a */
    public static VectorDrawableCompat m15554a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    /* JADX INFO: renamed from: b */
    public PorterDuffColorFilter m15555b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f36549f;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f36558o);
        if (this.f36558o.width() <= 0 || this.f36558o.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f36553j;
        if (colorFilter == null) {
            colorFilter = this.f36552i;
        }
        canvas.getMatrix(this.f36557n);
        this.f36557n.getValues(this.f36556m);
        float fAbs = Math.abs(this.f36556m[0]);
        float fAbs2 = Math.abs(this.f36556m[4]);
        float fAbs3 = Math.abs(this.f36556m[1]);
        float fAbs4 = Math.abs(this.f36556m[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f36558o.width() * fAbs);
        int iHeight = (int) (this.f36558o.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f36558o;
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C8162a.m16075t(this) == 1) {
            canvas.translate(this.f36558o.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f36558o.offsetTo(0, 0);
        h hVar = this.f36551h;
        Bitmap bitmap = hVar.f36610f;
        if (bitmap == null) {
            hVar.f36610f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            hVar.f36615k = true;
        } else {
            if (!(iMin == bitmap.getWidth() && iMin2 == hVar.f36610f.getHeight())) {
                hVar.f36610f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                hVar.f36615k = true;
            }
        }
        if (this.f36555l) {
            h hVar2 = this.f36551h;
            if (!(!hVar2.f36615k && hVar2.f36611g == hVar2.f36607c && hVar2.f36612h == hVar2.f36608d && hVar2.f36614j == hVar2.f36609e && hVar2.f36613i == hVar2.f36606b.getRootAlpha())) {
                this.f36551h.m15561b(iMin, iMin2);
                h hVar3 = this.f36551h;
                hVar3.f36611g = hVar3.f36607c;
                hVar3.f36612h = hVar3.f36608d;
                hVar3.f36613i = hVar3.f36606b.getRootAlpha();
                hVar3.f36614j = hVar3.f36609e;
                hVar3.f36615k = false;
            }
        } else {
            this.f36551h.m15561b(iMin, iMin2);
        }
        h hVar4 = this.f36551h;
        Rect rect2 = this.f36558o;
        if ((hVar4.f36606b.getRootAlpha() < 255) || colorFilter != null) {
            if (hVar4.f36616l == null) {
                Paint paint2 = new Paint();
                hVar4.f36616l = paint2;
                paint2.setFilterBitmap(true);
            }
            hVar4.f36616l.setAlpha(hVar4.f36606b.getRootAlpha());
            hVar4.f36616l.setColorFilter(colorFilter);
            paint = hVar4.f36616l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(hVar4.f36610f, (Rect) null, rect2, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getAlpha() : this.f36551h.f36606b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f36551h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getColorFilter() : this.f36553j;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f36549f != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f36549f.getConstantState());
        }
        this.f36551h.f36605a = getChangingConfigurations();
        return this.f36551h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f36551h.f36606b.f36598k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f36551h.f36606b.f36597j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.isAutoMirrored() : this.f36551h.f36609e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f36551h) != null && (hVar.m15560a() || ((colorStateList = this.f36551h.f36607c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f36554k && super.mutate() == this) {
            this.f36551h = new h(this.f36551h);
            this.f36554k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        h hVar = this.f36551h;
        ColorStateList colorStateList = hVar.f36607c;
        if (colorStateList != null && (mode = hVar.f36608d) != null) {
            this.f36552i = m15555b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (hVar.m15560a()) {
            boolean zMo15557b = hVar.f36606b.f36596i.mo15557b(iArr);
            hVar.f36615k |= zMo15557b;
            if (zMo15557b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f36551h.f36606b.getRootAlpha() != i2) {
            this.f36551h.f36606b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f36551h.f36609e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f36553j = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            C8162a.m16048S(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            C8162a.m16049T(drawable, colorStateList);
            return;
        }
        h hVar = this.f36551h;
        if (hVar.f36607c != colorStateList) {
            hVar.f36607c = colorStateList;
            this.f36552i = m15555b(colorStateList, hVar.f36608d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            C8162a.m16050U(drawable, mode);
            return;
        }
        h hVar = this.f36551h;
        if (hVar.f36608d != mode) {
            hVar.f36608d = mode;
            this.f36552i = m15555b(hVar.f36607c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f36549f;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: z0.f0.a.a.f$i */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f36617a;

        public i(Drawable.ConstantState constantState) {
            this.f36617a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f36617a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f36617a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f36549f = (VectorDrawable) this.f36617a.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f36549f = (VectorDrawable) this.f36617a.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.f36549f = (VectorDrawable) this.f36617a.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }
    }

    /* JADX INFO: renamed from: z0.f0.a.a.f$f */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static abstract class f extends e {

        /* JADX INFO: renamed from: a */
        public PathParser2[] f36584a;

        /* JADX INFO: renamed from: b */
        public String f36585b;

        /* JADX INFO: renamed from: c */
        public int f36586c;

        /* JADX INFO: renamed from: d */
        public int f36587d;

        public f() {
            super(null);
            this.f36584a = null;
            this.f36586c = 0;
        }

        public PathParser2[] getPathData() {
            return this.f36584a;
        }

        public String getPathName() {
            return this.f36585b;
        }

        public void setPathData(PathParser2[] pathParser2Arr) {
            if (!C8162a.m16059d(this.f36584a, pathParser2Arr)) {
                this.f36584a = C8162a.m16073r(pathParser2Arr);
                return;
            }
            PathParser2[] pathParser2Arr2 = this.f36584a;
            for (int i = 0; i < pathParser2Arr.length; i++) {
                pathParser2Arr2[i].f37855a = pathParser2Arr[i].f37855a;
                for (int i2 = 0; i2 < pathParser2Arr[i].f37856b.length; i2++) {
                    pathParser2Arr2[i].f37856b[i2] = pathParser2Arr[i].f37856b[i2];
                }
            }
        }

        public f(f fVar) {
            super(null);
            this.f36584a = null;
            this.f36586c = 0;
            this.f36585b = fVar.f36585b;
            this.f36587d = fVar.f36587d;
            this.f36584a = C8162a.m16073r(fVar.f36584a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        ColorStateList colorStateListM16152a;
        g gVar;
        c cVar;
        TypedArray typedArray;
        TypedArray typedArray2;
        Drawable drawable = this.f36549f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f36551h;
        hVar.f36606b = new g();
        TypedArray typedArrayM16038I = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36524a);
        h hVar2 = this.f36551h;
        g gVar2 = hVar2.f36606b;
        int i2 = !C8162a.m16033D(xmlPullParser, "tintMode") ? -1 : typedArrayM16038I.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        hVar2.f36608d = mode;
        int i4 = 1;
        if (C8162a.m16033D(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayM16038I.getValue(1, typedValue);
            int i5 = typedValue.type;
            if (i5 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i5 >= 28 && i5 <= 31) {
                colorStateListM16152a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM16038I.getResources();
                int resourceId = typedArrayM16038I.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = ColorStateListInflaterCompat.f37818a;
                try {
                    colorStateListM16152a = ColorStateListInflaterCompat.m16152a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                    colorStateListM16152a = null;
                }
            }
        } else {
            colorStateListM16152a = null;
        }
        if (colorStateListM16152a != null) {
            hVar2.f36607c = colorStateListM16152a;
        }
        boolean z = hVar2.f36609e;
        if (C8162a.m16033D(xmlPullParser, "autoMirrored")) {
            z = typedArrayM16038I.getBoolean(5, z);
        }
        hVar2.f36609e = z;
        float f2 = gVar2.f36599l;
        if (C8162a.m16033D(xmlPullParser, "viewportWidth")) {
            f2 = typedArrayM16038I.getFloat(7, f2);
        }
        gVar2.f36599l = f2;
        float f3 = gVar2.f36600m;
        if (C8162a.m16033D(xmlPullParser, "viewportHeight")) {
            f3 = typedArrayM16038I.getFloat(8, f3);
        }
        gVar2.f36600m = f3;
        if (gVar2.f36599l <= 0.0f) {
            throw new XmlPullParserException(typedArrayM16038I.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            gVar2.f36597j = typedArrayM16038I.getDimension(3, gVar2.f36597j);
            float dimension = typedArrayM16038I.getDimension(2, gVar2.f36598k);
            gVar2.f36598k = dimension;
            if (gVar2.f36597j <= 0.0f) {
                throw new XmlPullParserException(typedArrayM16038I.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = gVar2.getAlpha();
                if (C8162a.m16033D(xmlPullParser, "alpha")) {
                    alpha = typedArrayM16038I.getFloat(4, alpha);
                }
                gVar2.setAlpha(alpha);
                String string = typedArrayM16038I.getString(0);
                if (string != null) {
                    gVar2.f36602o = string;
                    gVar2.f36604q.put(string, gVar2);
                }
                typedArrayM16038I.recycle();
                hVar.f36605a = getChangingConfigurations();
                hVar.f36615k = true;
                h hVar3 = this.f36551h;
                g gVar3 = hVar3.f36606b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(gVar3.f36596i);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                while (eventType != i4 && (xmlPullParser.getDepth() >= depth || eventType != i3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        d dVar = (d) arrayDeque.peek();
                        if ("path".equals(name)) {
                            c cVar2 = new c();
                            TypedArray typedArrayM16038I2 = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36526c);
                            cVar2.f36559e = null;
                            if (C8162a.m16033D(xmlPullParser, "pathData")) {
                                String string2 = typedArrayM16038I2.getString(0);
                                if (string2 != null) {
                                    cVar2.f36585b = string2;
                                }
                                String string3 = typedArrayM16038I2.getString(2);
                                if (string3 != null) {
                                    cVar2.f36584a = C8162a.m16071p(string3);
                                }
                                cVar = cVar2;
                                cVar.f36562h = C8162a.m16076u(typedArrayM16038I2, xmlPullParser, theme, "fillColor", 1, 0);
                                float f4 = cVar.f36564j;
                                if (C8162a.m16033D(xmlPullParser, "fillAlpha")) {
                                    typedArray = typedArrayM16038I2;
                                    f4 = typedArray.getFloat(12, f4);
                                } else {
                                    typedArray = typedArrayM16038I2;
                                }
                                cVar.f36564j = f4;
                                int i6 = !C8162a.m16033D(xmlPullParser, "strokeLineCap") ? -1 : typedArray.getInt(8, -1);
                                Paint.Cap cap = cVar.f36568n;
                                if (i6 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (i6 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (i6 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                cVar.f36568n = cap;
                                int i7 = !C8162a.m16033D(xmlPullParser, "strokeLineJoin") ? -1 : typedArray.getInt(9, -1);
                                Paint.Join join = cVar.f36569o;
                                if (i7 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (i7 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (i7 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                cVar.f36569o = join;
                                float f5 = cVar.f36570p;
                                if (C8162a.m16033D(xmlPullParser, "strokeMiterLimit")) {
                                    f5 = typedArray.getFloat(10, f5);
                                }
                                cVar.f36570p = f5;
                                typedArray2 = typedArray;
                                cVar.f36560f = C8162a.m16076u(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                                float f6 = cVar.f36563i;
                                if (C8162a.m16033D(xmlPullParser, "strokeAlpha")) {
                                    f6 = typedArray2.getFloat(11, f6);
                                }
                                cVar.f36563i = f6;
                                float f7 = cVar.f36561g;
                                if (C8162a.m16033D(xmlPullParser, "strokeWidth")) {
                                    f7 = typedArray2.getFloat(4, f7);
                                }
                                cVar.f36561g = f7;
                                float f8 = cVar.f36566l;
                                if (C8162a.m16033D(xmlPullParser, "trimPathEnd")) {
                                    f8 = typedArray2.getFloat(6, f8);
                                }
                                cVar.f36566l = f8;
                                float f9 = cVar.f36567m;
                                if (C8162a.m16033D(xmlPullParser, "trimPathOffset")) {
                                    f9 = typedArray2.getFloat(7, f9);
                                }
                                cVar.f36567m = f9;
                                float f10 = cVar.f36565k;
                                if (C8162a.m16033D(xmlPullParser, "trimPathStart")) {
                                    f10 = typedArray2.getFloat(5, f10);
                                }
                                cVar.f36565k = f10;
                                int i8 = cVar.f36586c;
                                if (C8162a.m16033D(xmlPullParser, "fillType")) {
                                    i8 = typedArray2.getInt(13, i8);
                                }
                                cVar.f36586c = i8;
                            } else {
                                typedArray2 = typedArrayM16038I2;
                                cVar = cVar2;
                            }
                            typedArray2.recycle();
                            dVar.f36572b.add(cVar);
                            if (cVar.getPathName() != null) {
                                gVar = gVar3;
                                gVar.f36604q.put(cVar.getPathName(), cVar);
                            } else {
                                gVar = gVar3;
                            }
                            hVar3.f36605a |= cVar.f36587d;
                            arrayDeque = arrayDeque;
                            z2 = false;
                        } else {
                            ArrayDeque arrayDeque2 = arrayDeque;
                            gVar = gVar3;
                            depth = depth;
                            if ("clip-path".equals(name)) {
                                b bVar = new b();
                                if (C8162a.m16033D(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayM16038I3 = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36527d);
                                    String string4 = typedArrayM16038I3.getString(0);
                                    if (string4 != null) {
                                        bVar.f36585b = string4;
                                    }
                                    String string5 = typedArrayM16038I3.getString(1);
                                    if (string5 != null) {
                                        bVar.f36584a = C8162a.m16071p(string5);
                                    }
                                    bVar.f36586c = !C8162a.m16033D(xmlPullParser, "fillType") ? 0 : typedArrayM16038I3.getInt(2, 0);
                                    typedArrayM16038I3.recycle();
                                }
                                dVar.f36572b.add(bVar);
                                if (bVar.getPathName() != null) {
                                    gVar.f36604q.put(bVar.getPathName(), bVar);
                                }
                                hVar3.f36605a = bVar.f36587d | hVar3.f36605a;
                            } else if ("group".equals(name)) {
                                d dVar2 = new d();
                                TypedArray typedArrayM16038I4 = C8162a.m16038I(resources, theme, attributeSet, AndroidResources.f36525b);
                                dVar2.f36582l = null;
                                float f11 = dVar2.f36573c;
                                if (C8162a.m16033D(xmlPullParser, "rotation")) {
                                    f11 = typedArrayM16038I4.getFloat(5, f11);
                                }
                                dVar2.f36573c = f11;
                                dVar2.f36574d = typedArrayM16038I4.getFloat(1, dVar2.f36574d);
                                dVar2.f36575e = typedArrayM16038I4.getFloat(2, dVar2.f36575e);
                                float f12 = dVar2.f36576f;
                                if (C8162a.m16033D(xmlPullParser, "scaleX")) {
                                    f12 = typedArrayM16038I4.getFloat(3, f12);
                                }
                                dVar2.f36576f = f12;
                                float f13 = dVar2.f36577g;
                                if (C8162a.m16033D(xmlPullParser, "scaleY")) {
                                    f13 = typedArrayM16038I4.getFloat(4, f13);
                                }
                                dVar2.f36577g = f13;
                                float f14 = dVar2.f36578h;
                                if (C8162a.m16033D(xmlPullParser, "translateX")) {
                                    f14 = typedArrayM16038I4.getFloat(6, f14);
                                }
                                dVar2.f36578h = f14;
                                float f15 = dVar2.f36579i;
                                if (C8162a.m16033D(xmlPullParser, "translateY")) {
                                    f15 = typedArrayM16038I4.getFloat(7, f15);
                                }
                                dVar2.f36579i = f15;
                                String string6 = typedArrayM16038I4.getString(0);
                                if (string6 != null) {
                                    dVar2.f36583m = string6;
                                }
                                dVar2.m15558c();
                                typedArrayM16038I4.recycle();
                                dVar.f36572b.add(dVar2);
                                arrayDeque = arrayDeque2;
                                arrayDeque.push(dVar2);
                                if (dVar2.getGroupName() != null) {
                                    gVar.f36604q.put(dVar2.getGroupName(), dVar2);
                                }
                                hVar3.f36605a = dVar2.f36581k | hVar3.f36605a;
                            }
                            arrayDeque = arrayDeque2;
                        }
                    } else {
                        gVar = gVar3;
                        depth = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i3 = 3;
                    i4 = 1;
                    gVar3 = gVar;
                    depth = depth;
                }
                if (!z2) {
                    this.f36552i = m15555b(hVar.f36607c, hVar.f36608d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM16038I.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM16038I.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public VectorDrawableCompat(h hVar) {
        this.f36555l = true;
        this.f36556m = new float[9];
        this.f36557n = new Matrix();
        this.f36558o = new Rect();
        this.f36551h = hVar;
        this.f36552i = m15555b(hVar.f36607c, hVar.f36608d);
    }

    /* JADX INFO: renamed from: z0.f0.a.a.f$c */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class c extends f {

        /* JADX INFO: renamed from: e */
        public int[] f36559e;

        /* JADX INFO: renamed from: f */
        public ComplexColorCompat f36560f;

        /* JADX INFO: renamed from: g */
        public float f36561g;

        /* JADX INFO: renamed from: h */
        public ComplexColorCompat f36562h;

        /* JADX INFO: renamed from: i */
        public float f36563i;

        /* JADX INFO: renamed from: j */
        public float f36564j;

        /* JADX INFO: renamed from: k */
        public float f36565k;

        /* JADX INFO: renamed from: l */
        public float f36566l;

        /* JADX INFO: renamed from: m */
        public float f36567m;

        /* JADX INFO: renamed from: n */
        public Paint.Cap f36568n;

        /* JADX INFO: renamed from: o */
        public Paint.Join f36569o;

        /* JADX INFO: renamed from: p */
        public float f36570p;

        public c() {
            this.f36561g = 0.0f;
            this.f36563i = 1.0f;
            this.f36564j = 1.0f;
            this.f36565k = 0.0f;
            this.f36566l = 1.0f;
            this.f36567m = 0.0f;
            this.f36568n = Paint.Cap.BUTT;
            this.f36569o = Paint.Join.MITER;
            this.f36570p = 4.0f;
        }

        @Override // p636z0.p688f0.p689a.p690a.VectorDrawableCompat.e
        /* JADX INFO: renamed from: a */
        public boolean mo15556a() {
            return this.f36562h.m16156c() || this.f36560f.m16156c();
        }

        @Override // p636z0.p688f0.p689a.p690a.VectorDrawableCompat.e
        /* JADX INFO: renamed from: b */
        public boolean mo15557b(int[] iArr) {
            return this.f36560f.m16157d(iArr) | this.f36562h.m16157d(iArr);
        }

        public float getFillAlpha() {
            return this.f36564j;
        }

        public int getFillColor() {
            return this.f36562h.f37821c;
        }

        public float getStrokeAlpha() {
            return this.f36563i;
        }

        public int getStrokeColor() {
            return this.f36560f.f37821c;
        }

        public float getStrokeWidth() {
            return this.f36561g;
        }

        public float getTrimPathEnd() {
            return this.f36566l;
        }

        public float getTrimPathOffset() {
            return this.f36567m;
        }

        public float getTrimPathStart() {
            return this.f36565k;
        }

        public void setFillAlpha(float f) {
            this.f36564j = f;
        }

        public void setFillColor(int i) {
            this.f36562h.f37821c = i;
        }

        public void setStrokeAlpha(float f) {
            this.f36563i = f;
        }

        public void setStrokeColor(int i) {
            this.f36560f.f37821c = i;
        }

        public void setStrokeWidth(float f) {
            this.f36561g = f;
        }

        public void setTrimPathEnd(float f) {
            this.f36566l = f;
        }

        public void setTrimPathOffset(float f) {
            this.f36567m = f;
        }

        public void setTrimPathStart(float f) {
            this.f36565k = f;
        }

        public c(c cVar) {
            super(cVar);
            this.f36561g = 0.0f;
            this.f36563i = 1.0f;
            this.f36564j = 1.0f;
            this.f36565k = 0.0f;
            this.f36566l = 1.0f;
            this.f36567m = 0.0f;
            this.f36568n = Paint.Cap.BUTT;
            this.f36569o = Paint.Join.MITER;
            this.f36570p = 4.0f;
            this.f36559e = cVar.f36559e;
            this.f36560f = cVar.f36560f;
            this.f36561g = cVar.f36561g;
            this.f36563i = cVar.f36563i;
            this.f36562h = cVar.f36562h;
            this.f36586c = cVar.f36586c;
            this.f36564j = cVar.f36564j;
            this.f36565k = cVar.f36565k;
            this.f36566l = cVar.f36566l;
            this.f36567m = cVar.f36567m;
            this.f36568n = cVar.f36568n;
            this.f36569o = cVar.f36569o;
            this.f36570p = cVar.f36570p;
        }
    }

    /* JADX INFO: renamed from: z0.f0.a.a.f$g */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class g {

        /* JADX INFO: renamed from: a */
        public static final Matrix f36588a = new Matrix();

        /* JADX INFO: renamed from: b */
        public final Path f36589b;

        /* JADX INFO: renamed from: c */
        public final Path f36590c;

        /* JADX INFO: renamed from: d */
        public final Matrix f36591d;

        /* JADX INFO: renamed from: e */
        public Paint f36592e;

        /* JADX INFO: renamed from: f */
        public Paint f36593f;

        /* JADX INFO: renamed from: g */
        public PathMeasure f36594g;

        /* JADX INFO: renamed from: h */
        public int f36595h;

        /* JADX INFO: renamed from: i */
        public final d f36596i;

        /* JADX INFO: renamed from: j */
        public float f36597j;

        /* JADX INFO: renamed from: k */
        public float f36598k;

        /* JADX INFO: renamed from: l */
        public float f36599l;

        /* JADX INFO: renamed from: m */
        public float f36600m;

        /* JADX INFO: renamed from: n */
        public int f36601n;

        /* JADX INFO: renamed from: o */
        public String f36602o;

        /* JADX INFO: renamed from: p */
        public Boolean f36603p;

        /* JADX INFO: renamed from: q */
        public final ArrayMap<String, Object> f36604q;

        public g() {
            this.f36591d = new Matrix();
            this.f36597j = 0.0f;
            this.f36598k = 0.0f;
            this.f36599l = 0.0f;
            this.f36600m = 0.0f;
            this.f36601n = 255;
            this.f36602o = null;
            this.f36603p = null;
            this.f36604q = new ArrayMap<>();
            this.f36596i = new d();
            this.f36589b = new Path();
            this.f36590c = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0 */
        /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r11v18 */
        /* JADX INFO: renamed from: a */
        public final void m15559a(d dVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            g gVar;
            g gVar2 = this;
            dVar.f36571a.set(matrix);
            dVar.f36571a.preConcat(dVar.f36580j);
            canvas.save();
            ?? r11 = 0;
            int i3 = 0;
            while (i3 < dVar.f36572b.size()) {
                e eVar = dVar.f36572b.get(i3);
                if (eVar instanceof d) {
                    m15559a((d) eVar, dVar.f36571a, canvas, i, i2, colorFilter);
                } else {
                    if (eVar instanceof f) {
                        f fVar = (f) eVar;
                        float f = i / gVar2.f36599l;
                        float f2 = i2 / gVar2.f36600m;
                        float fMin = Math.min(f, f2);
                        Matrix matrix2 = dVar.f36571a;
                        gVar2.f36591d.set(matrix2);
                        gVar2.f36591d.postScale(f, f2);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[r11], fArr[1]);
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f3 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f3) / fMax : 0.0f;
                        if (fAbs == 0.0f) {
                            gVar = this;
                        } else {
                            gVar = this;
                            Path path = gVar.f36589b;
                            Objects.requireNonNull(fVar);
                            path.reset();
                            PathParser2[] pathParser2Arr = fVar.f36584a;
                            if (pathParser2Arr != null) {
                                PathParser2.m16170b(pathParser2Arr, path);
                            }
                            Path path2 = gVar.f36589b;
                            gVar.f36590c.reset();
                            if (fVar instanceof b) {
                                gVar.f36590c.setFillType(fVar.f36586c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                gVar.f36590c.addPath(path2, gVar.f36591d);
                                canvas.clipPath(gVar.f36590c);
                            } else {
                                c cVar = (c) fVar;
                                float f4 = cVar.f36565k;
                                if (f4 != 0.0f || cVar.f36566l != 1.0f) {
                                    float f5 = cVar.f36567m;
                                    float f6 = (f4 + f5) % 1.0f;
                                    float f7 = (cVar.f36566l + f5) % 1.0f;
                                    if (gVar.f36594g == null) {
                                        gVar.f36594g = new PathMeasure();
                                    }
                                    gVar.f36594g.setPath(gVar.f36589b, r11);
                                    float length = gVar.f36594g.getLength();
                                    float f8 = f6 * length;
                                    float f9 = f7 * length;
                                    path2.reset();
                                    if (f8 > f9) {
                                        gVar.f36594g.getSegment(f8, length, path2, true);
                                        gVar.f36594g.getSegment(0.0f, f9, path2, true);
                                    } else {
                                        gVar.f36594g.getSegment(f8, f9, path2, true);
                                    }
                                    path2.rLineTo(0.0f, 0.0f);
                                }
                                gVar.f36590c.addPath(path2, gVar.f36591d);
                                ComplexColorCompat complexColorCompat = cVar.f36562h;
                                if (complexColorCompat.m16155b() || complexColorCompat.f37821c != 0) {
                                    ComplexColorCompat complexColorCompat2 = cVar.f36562h;
                                    if (gVar.f36593f == null) {
                                        Paint paint = new Paint(1);
                                        gVar.f36593f = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = gVar.f36593f;
                                    if (complexColorCompat2.m16155b()) {
                                        Shader shader = complexColorCompat2.f37819a;
                                        shader.setLocalMatrix(gVar.f36591d);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(cVar.f36564j * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i4 = complexColorCompat2.f37821c;
                                        float f10 = cVar.f36564j;
                                        PorterDuff.Mode mode = VectorDrawableCompat.f36550g;
                                        paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f10)) << 24));
                                    }
                                    paint2.setColorFilter(colorFilter);
                                    gVar.f36590c.setFillType(cVar.f36586c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(gVar.f36590c, paint2);
                                }
                                ComplexColorCompat complexColorCompat3 = cVar.f36560f;
                                if (complexColorCompat3.m16155b() || complexColorCompat3.f37821c != 0) {
                                    ComplexColorCompat complexColorCompat4 = cVar.f36560f;
                                    if (gVar.f36592e == null) {
                                        Paint paint3 = new Paint(1);
                                        gVar.f36592e = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    }
                                    Paint paint4 = gVar.f36592e;
                                    Paint.Join join = cVar.f36569o;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = cVar.f36568n;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(cVar.f36570p);
                                    if (complexColorCompat4.m16155b()) {
                                        Shader shader2 = complexColorCompat4.f37819a;
                                        shader2.setLocalMatrix(gVar.f36591d);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(cVar.f36563i * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i5 = complexColorCompat4.f37821c;
                                        float f11 = cVar.f36563i;
                                        PorterDuff.Mode mode2 = VectorDrawableCompat.f36550g;
                                        paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f11)) << 24));
                                    }
                                    paint4.setColorFilter(colorFilter);
                                    paint4.setStrokeWidth(cVar.f36561g * fAbs * fMin);
                                    canvas.drawPath(gVar.f36590c, paint4);
                                }
                            }
                        }
                    }
                    i3++;
                    gVar2 = gVar;
                    r11 = 0;
                }
                gVar = gVar2;
                i3++;
                gVar2 = gVar;
                r11 = 0;
            }
            canvas.restore();
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f36601n;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f36601n = i;
        }

        public g(g gVar) {
            this.f36591d = new Matrix();
            this.f36597j = 0.0f;
            this.f36598k = 0.0f;
            this.f36599l = 0.0f;
            this.f36600m = 0.0f;
            this.f36601n = 255;
            this.f36602o = null;
            this.f36603p = null;
            ArrayMap<String, Object> arrayMap = new ArrayMap<>();
            this.f36604q = arrayMap;
            this.f36596i = new d(gVar.f36596i, arrayMap);
            this.f36589b = new Path(gVar.f36589b);
            this.f36590c = new Path(gVar.f36590c);
            this.f36597j = gVar.f36597j;
            this.f36598k = gVar.f36598k;
            this.f36599l = gVar.f36599l;
            this.f36600m = gVar.f36600m;
            this.f36595h = gVar.f36595h;
            this.f36601n = gVar.f36601n;
            this.f36602o = gVar.f36602o;
            String str = gVar.f36602o;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.f36603p = gVar.f36603p;
        }
    }

    /* JADX INFO: renamed from: z0.f0.a.a.f$d */
    /* JADX INFO: compiled from: VectorDrawableCompat.java */
    public static class d extends e {

        /* JADX INFO: renamed from: a */
        public final Matrix f36571a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<e> f36572b;

        /* JADX INFO: renamed from: c */
        public float f36573c;

        /* JADX INFO: renamed from: d */
        public float f36574d;

        /* JADX INFO: renamed from: e */
        public float f36575e;

        /* JADX INFO: renamed from: f */
        public float f36576f;

        /* JADX INFO: renamed from: g */
        public float f36577g;

        /* JADX INFO: renamed from: h */
        public float f36578h;

        /* JADX INFO: renamed from: i */
        public float f36579i;

        /* JADX INFO: renamed from: j */
        public final Matrix f36580j;

        /* JADX INFO: renamed from: k */
        public int f36581k;

        /* JADX INFO: renamed from: l */
        public int[] f36582l;

        /* JADX INFO: renamed from: m */
        public String f36583m;

        public d(d dVar, ArrayMap<String, Object> arrayMap) {
            f bVar;
            super(null);
            this.f36571a = new Matrix();
            this.f36572b = new ArrayList<>();
            this.f36573c = 0.0f;
            this.f36574d = 0.0f;
            this.f36575e = 0.0f;
            this.f36576f = 1.0f;
            this.f36577g = 1.0f;
            this.f36578h = 0.0f;
            this.f36579i = 0.0f;
            Matrix matrix = new Matrix();
            this.f36580j = matrix;
            this.f36583m = null;
            this.f36573c = dVar.f36573c;
            this.f36574d = dVar.f36574d;
            this.f36575e = dVar.f36575e;
            this.f36576f = dVar.f36576f;
            this.f36577g = dVar.f36577g;
            this.f36578h = dVar.f36578h;
            this.f36579i = dVar.f36579i;
            this.f36582l = dVar.f36582l;
            String str = dVar.f36583m;
            this.f36583m = str;
            this.f36581k = dVar.f36581k;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(dVar.f36580j);
            ArrayList<e> arrayList = dVar.f36572b;
            for (int i = 0; i < arrayList.size(); i++) {
                e eVar = arrayList.get(i);
                if (eVar instanceof d) {
                    this.f36572b.add(new d((d) eVar, arrayMap));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f36572b.add(bVar);
                    String str2 = bVar.f36585b;
                    if (str2 != null) {
                        arrayMap.put(str2, bVar);
                    }
                }
            }
        }

        @Override // p636z0.p688f0.p689a.p690a.VectorDrawableCompat.e
        /* JADX INFO: renamed from: a */
        public boolean mo15556a() {
            for (int i = 0; i < this.f36572b.size(); i++) {
                if (this.f36572b.get(i).mo15556a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // p636z0.p688f0.p689a.p690a.VectorDrawableCompat.e
        /* JADX INFO: renamed from: b */
        public boolean mo15557b(int[] iArr) {
            boolean zMo15557b = false;
            for (int i = 0; i < this.f36572b.size(); i++) {
                zMo15557b |= this.f36572b.get(i).mo15557b(iArr);
            }
            return zMo15557b;
        }

        /* JADX INFO: renamed from: c */
        public final void m15558c() {
            this.f36580j.reset();
            this.f36580j.postTranslate(-this.f36574d, -this.f36575e);
            this.f36580j.postScale(this.f36576f, this.f36577g);
            this.f36580j.postRotate(this.f36573c, 0.0f, 0.0f);
            this.f36580j.postTranslate(this.f36578h + this.f36574d, this.f36579i + this.f36575e);
        }

        public String getGroupName() {
            return this.f36583m;
        }

        public Matrix getLocalMatrix() {
            return this.f36580j;
        }

        public float getPivotX() {
            return this.f36574d;
        }

        public float getPivotY() {
            return this.f36575e;
        }

        public float getRotation() {
            return this.f36573c;
        }

        public float getScaleX() {
            return this.f36576f;
        }

        public float getScaleY() {
            return this.f36577g;
        }

        public float getTranslateX() {
            return this.f36578h;
        }

        public float getTranslateY() {
            return this.f36579i;
        }

        public void setPivotX(float f) {
            if (f != this.f36574d) {
                this.f36574d = f;
                m15558c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f36575e) {
                this.f36575e = f;
                m15558c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f36573c) {
                this.f36573c = f;
                m15558c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f36576f) {
                this.f36576f = f;
                m15558c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f36577g) {
                this.f36577g = f;
                m15558c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f36578h) {
                this.f36578h = f;
                m15558c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f36579i) {
                this.f36579i = f;
                m15558c();
            }
        }

        public d() {
            super(null);
            this.f36571a = new Matrix();
            this.f36572b = new ArrayList<>();
            this.f36573c = 0.0f;
            this.f36574d = 0.0f;
            this.f36575e = 0.0f;
            this.f36576f = 1.0f;
            this.f36577g = 1.0f;
            this.f36578h = 0.0f;
            this.f36579i = 0.0f;
            this.f36580j = new Matrix();
            this.f36583m = null;
        }
    }
}
