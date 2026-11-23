package p636z0.p644b.p648e.p649a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import java.util.Objects;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.b.e.a.b, reason: use source file name */
/* JADX INFO: compiled from: DrawableContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class DrawableContainer extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f34608f = 0;

    /* JADX INFO: renamed from: g */
    public c f34609g;

    /* JADX INFO: renamed from: h */
    public Rect f34610h;

    /* JADX INFO: renamed from: i */
    public Drawable f34611i;

    /* JADX INFO: renamed from: j */
    public Drawable f34612j;

    /* JADX INFO: renamed from: l */
    public boolean f34614l;

    /* JADX INFO: renamed from: n */
    public boolean f34616n;

    /* JADX INFO: renamed from: o */
    public Runnable f34617o;

    /* JADX INFO: renamed from: p */
    public long f34618p;

    /* JADX INFO: renamed from: q */
    public long f34619q;

    /* JADX INFO: renamed from: r */
    public b f34620r;

    /* JADX INFO: renamed from: k */
    public int f34613k = 255;

    /* JADX INFO: renamed from: m */
    public int f34615m = -1;

    /* JADX INFO: renamed from: z0.b.e.a.b$a */
    /* JADX INFO: compiled from: DrawableContainer.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DrawableContainer.this.m14719a(true);
            DrawableContainer.this.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: z0.b.e.a.b$b */
    /* JADX INFO: compiled from: DrawableContainer.java */
    public static class b implements Drawable.Callback {

        /* JADX INFO: renamed from: f */
        public Drawable.Callback f34622f;

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            Drawable.Callback callback = this.f34622f;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j2);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f34622f;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.e.a.b$c */
    /* JADX INFO: compiled from: DrawableContainer.java */
    public static abstract class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: A */
        public int f34623A;

        /* JADX INFO: renamed from: B */
        public int f34624B;

        /* JADX INFO: renamed from: C */
        public boolean f34625C;

        /* JADX INFO: renamed from: D */
        public ColorFilter f34626D;

        /* JADX INFO: renamed from: E */
        public boolean f34627E;

        /* JADX INFO: renamed from: F */
        public ColorStateList f34628F;

        /* JADX INFO: renamed from: G */
        public PorterDuff.Mode f34629G;

        /* JADX INFO: renamed from: H */
        public boolean f34630H;

        /* JADX INFO: renamed from: I */
        public boolean f34631I;

        /* JADX INFO: renamed from: a */
        public final DrawableContainer f34632a;

        /* JADX INFO: renamed from: b */
        public Resources f34633b;

        /* JADX INFO: renamed from: c */
        public int f34634c;

        /* JADX INFO: renamed from: d */
        public int f34635d;

        /* JADX INFO: renamed from: e */
        public int f34636e;

        /* JADX INFO: renamed from: f */
        public SparseArray<Drawable.ConstantState> f34637f;

        /* JADX INFO: renamed from: g */
        public Drawable[] f34638g;

        /* JADX INFO: renamed from: h */
        public int f34639h;

        /* JADX INFO: renamed from: i */
        public boolean f34640i;

        /* JADX INFO: renamed from: j */
        public boolean f34641j;

        /* JADX INFO: renamed from: k */
        public Rect f34642k;

        /* JADX INFO: renamed from: l */
        public boolean f34643l;

        /* JADX INFO: renamed from: m */
        public boolean f34644m;

        /* JADX INFO: renamed from: n */
        public int f34645n;

        /* JADX INFO: renamed from: o */
        public int f34646o;

        /* JADX INFO: renamed from: p */
        public int f34647p;

        /* JADX INFO: renamed from: q */
        public int f34648q;

        /* JADX INFO: renamed from: r */
        public boolean f34649r;

        /* JADX INFO: renamed from: s */
        public int f34650s;

        /* JADX INFO: renamed from: t */
        public boolean f34651t;

        /* JADX INFO: renamed from: u */
        public boolean f34652u;

        /* JADX INFO: renamed from: v */
        public boolean f34653v;

        /* JADX INFO: renamed from: w */
        public boolean f34654w;

        /* JADX INFO: renamed from: x */
        public boolean f34655x;

        /* JADX INFO: renamed from: y */
        public boolean f34656y;

        /* JADX INFO: renamed from: z */
        public int f34657z;

        public c(c cVar, DrawableContainer drawableContainer, Resources resources) {
            this.f34640i = false;
            this.f34643l = false;
            this.f34655x = true;
            this.f34623A = 0;
            this.f34624B = 0;
            this.f34632a = drawableContainer;
            this.f34633b = resources != null ? resources : cVar != null ? cVar.f34633b : null;
            int i = cVar != null ? cVar.f34634c : 0;
            int i2 = DrawableContainer.f34608f;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? 160 : i;
            this.f34634c = i;
            if (cVar == null) {
                this.f34638g = new Drawable[10];
                this.f34639h = 0;
                return;
            }
            this.f34635d = cVar.f34635d;
            this.f34636e = cVar.f34636e;
            this.f34653v = true;
            this.f34654w = true;
            this.f34640i = cVar.f34640i;
            this.f34643l = cVar.f34643l;
            this.f34655x = cVar.f34655x;
            this.f34656y = cVar.f34656y;
            this.f34657z = cVar.f34657z;
            this.f34623A = cVar.f34623A;
            this.f34624B = cVar.f34624B;
            this.f34625C = cVar.f34625C;
            this.f34626D = cVar.f34626D;
            this.f34627E = cVar.f34627E;
            this.f34628F = cVar.f34628F;
            this.f34629G = cVar.f34629G;
            this.f34630H = cVar.f34630H;
            this.f34631I = cVar.f34631I;
            if (cVar.f34634c == i) {
                if (cVar.f34641j) {
                    this.f34642k = cVar.f34642k != null ? new Rect(cVar.f34642k) : null;
                    this.f34641j = true;
                }
                if (cVar.f34644m) {
                    this.f34645n = cVar.f34645n;
                    this.f34646o = cVar.f34646o;
                    this.f34647p = cVar.f34647p;
                    this.f34648q = cVar.f34648q;
                    this.f34644m = true;
                }
            }
            if (cVar.f34649r) {
                this.f34650s = cVar.f34650s;
                this.f34649r = true;
            }
            if (cVar.f34651t) {
                this.f34652u = cVar.f34652u;
                this.f34651t = true;
            }
            Drawable[] drawableArr = cVar.f34638g;
            this.f34638g = new Drawable[drawableArr.length];
            this.f34639h = cVar.f34639h;
            SparseArray<Drawable.ConstantState> sparseArray = cVar.f34637f;
            if (sparseArray != null) {
                this.f34637f = sparseArray.clone();
            } else {
                this.f34637f = new SparseArray<>(this.f34639h);
            }
            int i3 = this.f34639h;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                    if (constantState != null) {
                        this.f34637f.put(i4, constantState);
                    } else {
                        this.f34638g[i4] = drawableArr[i4];
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final int m14722a(Drawable drawable) {
            int i = this.f34639h;
            if (i >= this.f34638g.length) {
                int i2 = i + 10;
                StateListDrawable.a aVar = (StateListDrawable.a) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = aVar.f34638g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                aVar.f34638g = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(aVar.f34661J, 0, iArr, 0, i);
                aVar.f34661J = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f34632a);
            this.f34638g[i] = drawable;
            this.f34639h++;
            this.f34636e = drawable.getChangingConfigurations() | this.f34636e;
            this.f34649r = false;
            this.f34651t = false;
            this.f34642k = null;
            this.f34641j = false;
            this.f34644m = false;
            this.f34653v = false;
            return i;
        }

        /* JADX INFO: renamed from: b */
        public void m14723b() {
            this.f34644m = true;
            m14724c();
            int i = this.f34639h;
            Drawable[] drawableArr = this.f34638g;
            this.f34646o = -1;
            this.f34645n = -1;
            this.f34648q = 0;
            this.f34647p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f34645n) {
                    this.f34645n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f34646o) {
                    this.f34646o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f34647p) {
                    this.f34647p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f34648q) {
                    this.f34648q = minimumHeight;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m14724c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f34637f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f34637f.keyAt(i);
                    Drawable.ConstantState constantStateValueAt = this.f34637f.valueAt(i);
                    Drawable[] drawableArr = this.f34638g;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.f34633b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        C8162a.m16043N(drawableNewDrawable, this.f34657z);
                    }
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f34632a);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f34637f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f34639h;
            Drawable[] drawableArr = this.f34638g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f34637f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: d */
        public final Drawable m14725d(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f34638g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f34637f;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = this.f34637f.valueAt(iIndexOfKey).newDrawable(this.f34633b);
            if (Build.VERSION.SDK_INT >= 23) {
                C8162a.m16043N(drawableNewDrawable, this.f34657z);
            }
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f34632a);
            this.f34638g[i] = drawableMutate;
            this.f34637f.removeAt(iIndexOfKey);
            if (this.f34637f.size() == 0) {
                this.f34637f = null;
            }
            return drawableMutate;
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo14715e();

        /* JADX INFO: renamed from: f */
        public final void m14726f(Resources resources) {
            if (resources != null) {
                this.f34633b = resources;
                int i = DrawableContainer.f34608f;
                int i2 = resources.getDisplayMetrics().densityDpi;
                if (i2 == 0) {
                    i2 = 160;
                }
                int i3 = this.f34634c;
                this.f34634c = i2;
                if (i3 != i2) {
                    this.f34644m = false;
                    this.f34641j = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f34635d | this.f34636e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public void m14719a(boolean z) {
        boolean z2;
        Drawable drawable;
        long j2;
        boolean z3 = true;
        this.f34614l = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f34611i;
        if (drawable2 != null) {
            long j3 = this.f34618p;
            if (j3 != 0) {
                if (j3 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f34613k);
                    this.f34618p = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j3 - jUptimeMillis) * 255)) / this.f34609g.f34623A)) * this.f34613k) / 255);
                    z2 = true;
                }
            }
            drawable = this.f34612j;
            if (drawable != null) {
                j2 = this.f34619q;
                if (j2 == 0) {
                    if (j2 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f34612j = null;
                        this.f34619q = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f34609g.f34624B) * this.f34613k) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f34617o, jUptimeMillis + 16);
                return;
            }
            this.f34619q = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f34618p = 0L;
        z2 = false;
        drawable = this.f34612j;
        if (drawable != null) {
            j2 = this.f34619q;
            if (j2 == 0) {
                if (j2 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f34612j = null;
                    this.f34619q = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j2 - jUptimeMillis) * 255)) / this.f34609g.f34624B) * this.f34613k) / 255);
                }
            }
            if (z) {
            }
        }
        this.f34619q = 0L;
        z3 = z2;
        if (z) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f34609g;
        Objects.requireNonNull(cVar);
        if (theme != null) {
            cVar.m14724c();
            int i = cVar.f34639h;
            Drawable[] drawableArr = cVar.f34638g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    cVar.f34636e |= drawableArr[i2].getChangingConfigurations();
                }
            }
            cVar.m14726f(theme.getResources());
        }
    }

    /* JADX INFO: renamed from: b */
    public c mo14709b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    public final void m14720c(Drawable drawable) {
        if (this.f34620r == null) {
            this.f34620r = new b();
        }
        b bVar = this.f34620r;
        bVar.f34622f = drawable.getCallback();
        drawable.setCallback(bVar);
        try {
            if (this.f34609g.f34623A <= 0 && this.f34614l) {
                drawable.setAlpha(this.f34613k);
            }
            c cVar = this.f34609g;
            if (cVar.f34627E) {
                drawable.setColorFilter(cVar.f34626D);
            } else {
                if (cVar.f34630H) {
                    drawable.setTintList(cVar.f34628F);
                }
                c cVar2 = this.f34609g;
                if (cVar2.f34631I) {
                    drawable.setTintMode(cVar2.f34629G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f34609g.f34655x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                C8162a.m16043N(drawable, C8162a.m16075t(this));
            }
            drawable.setAutoMirrored(this.f34609g.f34625C);
            Rect rect = this.f34610h;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            b bVar2 = this.f34620r;
            Drawable.Callback callback = bVar2.f34622f;
            bVar2.f34622f = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f34609g.canApplyTheme();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: d */
    public boolean m14721d(int i) {
        if (i == this.f34615m) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f34609g.f34624B > 0) {
            Drawable drawable = this.f34612j;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f34611i;
            if (drawable2 != null) {
                this.f34612j = drawable2;
                this.f34619q = ((long) this.f34609g.f34624B) + jUptimeMillis;
            } else {
                this.f34612j = null;
                this.f34619q = 0L;
            }
        } else {
            Drawable drawable3 = this.f34611i;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            c cVar = this.f34609g;
            if (i < cVar.f34639h) {
                Drawable drawableM14725d = cVar.m14725d(i);
                this.f34611i = drawableM14725d;
                this.f34615m = i;
                if (drawableM14725d != null) {
                    int i2 = this.f34609g.f34623A;
                    if (i2 > 0) {
                        this.f34618p = jUptimeMillis + ((long) i2);
                    }
                    m14720c(drawableM14725d);
                }
            } else {
                this.f34611i = null;
                this.f34615m = -1;
            }
        } else {
            this.f34611i = null;
            this.f34615m = -1;
        }
        if (this.f34618p != 0 || this.f34619q != 0) {
            Runnable runnable = this.f34617o;
            if (runnable == null) {
                this.f34617o = new a();
            } else {
                unscheduleSelf(runnable);
            }
            m14719a(true);
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f34612j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public void mo14710e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f34613k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f34609g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c cVar = this.f34609g;
        boolean z = false;
        if (!cVar.f34653v) {
            cVar.m14724c();
            cVar.f34653v = true;
            int i = cVar.f34639h;
            Drawable[] drawableArr = cVar.f34638g;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    cVar.f34654w = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    cVar.f34654w = false;
                    break;
                }
                i2++;
            }
        } else {
            z = cVar.f34654w;
        }
        if (!z) {
            return null;
        }
        this.f34609g.f34635d = getChangingConfigurations();
        return this.f34609g;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f34611i;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f34610h;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        c cVar = this.f34609g;
        if (cVar.f34643l) {
            if (!cVar.f34644m) {
                cVar.m14723b();
            }
            return cVar.f34646o;
        }
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        c cVar = this.f34609g;
        if (cVar.f34643l) {
            if (!cVar.f34644m) {
                cVar.m14723b();
            }
            return cVar.f34645n;
        }
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        c cVar = this.f34609g;
        if (cVar.f34643l) {
            if (!cVar.f34644m) {
                cVar.m14723b();
            }
            return cVar.f34648q;
        }
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        c cVar = this.f34609g;
        if (cVar.f34643l) {
            if (!cVar.f34644m) {
                cVar.m14723b();
            }
            return cVar.f34647p;
        }
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f34611i;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f34609g;
        if (cVar.f34649r) {
            return cVar.f34650s;
        }
        cVar.m14724c();
        int i = cVar.f34639h;
        Drawable[] drawableArr = cVar.f34638g;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        cVar.f34650s = opacity;
        cVar.f34649r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f34609g;
        Rect rect2 = null;
        if (!cVar.f34640i) {
            Rect rect3 = cVar.f34642k;
            if (rect3 != null || cVar.f34641j) {
                rect2 = rect3;
            } else {
                cVar.m14724c();
                Rect rect4 = new Rect();
                int i = cVar.f34639h;
                Drawable[] drawableArr = cVar.f34638g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                cVar.f34641j = true;
                cVar.f34642k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f34611i;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f34609g.f34625C && C8162a.m16075t(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        c cVar = this.f34609g;
        if (cVar != null) {
            cVar.f34649r = false;
            cVar.f34651t = false;
        }
        if (drawable != this.f34611i || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f34609g.f34625C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f34612j;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f34612j = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f34611i;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f34614l) {
                this.f34611i.setAlpha(this.f34613k);
            }
        }
        if (this.f34619q != 0) {
            this.f34619q = 0L;
            z = true;
        }
        if (this.f34618p != 0) {
            this.f34618p = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f34616n && super.mutate() == this) {
            c cVarMo14709b = mo14709b();
            cVarMo14709b.mo14715e();
            mo14710e(cVarMo14709b);
            this.f34616n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f34612j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f34611i;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        c cVar = this.f34609g;
        int i2 = this.f34615m;
        int i3 = cVar.f34639h;
        Drawable[] drawableArr = cVar.f34638g;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean zM16043N = Build.VERSION.SDK_INT >= 23 ? C8162a.m16043N(drawableArr[i4], i) : false;
                if (i4 == i2) {
                    z = zM16043N;
                }
            }
        }
        cVar.f34657z = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f34612j;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f34611i;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f34612j;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f34611i;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        if (drawable != this.f34611i || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.f34614l && this.f34613k == i) {
            return;
        }
        this.f34614l = true;
        this.f34613k = i;
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            if (this.f34618p == 0) {
                drawable.setAlpha(i);
            } else {
                m14719a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        c cVar = this.f34609g;
        if (cVar.f34625C != z) {
            cVar.f34625C = z;
            Drawable drawable = this.f34611i;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f34609g;
        cVar.f34627E = true;
        if (cVar.f34626D != colorFilter) {
            cVar.f34626D = colorFilter;
            Drawable drawable = this.f34611i;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        c cVar = this.f34609g;
        if (cVar.f34655x != z) {
            cVar.f34655x = z;
            Drawable drawable = this.f34611i;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f34610h;
        if (rect == null) {
            this.f34610h = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f34611i;
        if (drawable != null) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        c cVar = this.f34609g;
        cVar.f34630H = true;
        if (cVar.f34628F != colorStateList) {
            cVar.f34628F = colorStateList;
            C8162a.m16049T(this.f34611i, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f34609g;
        cVar.f34631I = true;
        if (cVar.f34629G != mode) {
            cVar.f34629G = mode;
            C8162a.m16050U(this.f34611i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f34612j;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f34611i;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f34611i || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
