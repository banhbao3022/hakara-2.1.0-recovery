package p636z0.p644b.p653h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: z0.b.h.a0, reason: use source file name */
/* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextViewAutoSizeHelper {

    /* JADX INFO: renamed from: a */
    public static final RectF f34938a = new RectF();

    /* JADX INFO: renamed from: b */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Method> f34939b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c */
    @SuppressLint({"BanConcurrentHashMap"})
    public static ConcurrentHashMap<String, Field> f34940c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d */
    public int f34941d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f34942e = false;

    /* JADX INFO: renamed from: f */
    public float f34943f = -1.0f;

    /* JADX INFO: renamed from: g */
    public float f34944g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f34945h = -1.0f;

    /* JADX INFO: renamed from: i */
    public int[] f34946i = new int[0];

    /* JADX INFO: renamed from: j */
    public boolean f34947j = false;

    /* JADX INFO: renamed from: k */
    public TextPaint f34948k;

    /* JADX INFO: renamed from: l */
    public final TextView f34949l;

    /* JADX INFO: renamed from: m */
    public final Context f34950m;

    /* JADX INFO: renamed from: n */
    public final c f34951n;

    /* JADX INFO: renamed from: z0.b.h.a0$a */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class a extends c {
        @Override // p636z0.p644b.p653h.AppCompatTextViewAutoSizeHelper.c
        /* JADX INFO: renamed from: a */
        public void mo14837a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) AppCompatTextViewAutoSizeHelper.m14828e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: renamed from: z0.b.h.a0$b */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class b extends a {
        @Override // p636z0.p644b.p653h.AppCompatTextViewAutoSizeHelper.a, p636z0.p644b.p653h.AppCompatTextViewAutoSizeHelper.c
        /* JADX INFO: renamed from: a */
        public void mo14837a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // p636z0.p644b.p653h.AppCompatTextViewAutoSizeHelper.c
        /* JADX INFO: renamed from: b */
        public boolean mo14838b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: renamed from: z0.b.h.a0$c */
    /* JADX INFO: compiled from: AppCompatTextViewAutoSizeHelper.java */
    public static class c {
        /* JADX INFO: renamed from: a */
        public void mo14837a(StaticLayout.Builder builder, TextView textView) {
        }

        /* JADX INFO: renamed from: b */
        public boolean mo14838b(TextView textView) {
            return ((Boolean) AppCompatTextViewAutoSizeHelper.m14828e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public AppCompatTextViewAutoSizeHelper(TextView textView) {
        this.f34949l = textView;
        this.f34950m = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            this.f34951n = new b();
        } else if (i >= 23) {
            this.f34951n = new a();
        } else {
            this.f34951n = new c();
        }
    }

    /* JADX INFO: renamed from: d */
    public static Method m14827d(String str) {
        try {
            Method declaredMethod = f34939b.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f34939b.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static <T> T m14828e(Object obj, String str, T t) {
        try {
            return (T) m14827d(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14829a() {
        if (m14835i() && this.f34941d != 0) {
            if (this.f34942e) {
                if (this.f34949l.getMeasuredHeight() <= 0 || this.f34949l.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f34951n.mo14838b(this.f34949l) ? 1048576 : (this.f34949l.getMeasuredWidth() - this.f34949l.getTotalPaddingLeft()) - this.f34949l.getTotalPaddingRight();
                int height = (this.f34949l.getHeight() - this.f34949l.getCompoundPaddingBottom()) - this.f34949l.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f34938a;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fM14831c = m14831c(rectF);
                    if (fM14831c != this.f34949l.getTextSize()) {
                        m14832f(0, fM14831c);
                    }
                }
            }
            this.f34942e = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int[] m14830b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0115  */
    /* JADX INFO: renamed from: c */
    public final int m14831c(RectF rectF) {
        byte b2;
        StaticLayout staticLayout;
        boolean z;
        CharSequence transformation;
        int length = this.f34946i.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i) {
            int i5 = (i3 + i) / 2;
            int i6 = this.f34946i[i5];
            CharSequence text = this.f34949l.getText();
            TransformationMethod transformationMethod = this.f34949l.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f34949l)) != null) {
                text = transformation;
            }
            int i7 = Build.VERSION.SDK_INT;
            int maxLines = this.f34949l.getMaxLines();
            TextPaint textPaint = this.f34948k;
            if (textPaint == null) {
                this.f34948k = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f34948k.set(this.f34949l.getPaint());
            this.f34948k.setTextSize(i6);
            Layout.Alignment alignment = (Layout.Alignment) m14828e(this.f34949l, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            int iRound = Math.round(rectF.right);
            if (i7 >= 23) {
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, i2, text.length(), this.f34948k, iRound);
                builderObtain.setAlignment(alignment).setLineSpacing(this.f34949l.getLineSpacingExtra(), this.f34949l.getLineSpacingMultiplier()).setIncludePad(this.f34949l.getIncludeFontPadding()).setBreakStrategy(this.f34949l.getBreakStrategy()).setHyphenationFrequency(this.f34949l.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f34951n.mo14837a(builderObtain, this.f34949l);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                staticLayout = builderObtain.build();
                b2 = -1;
            } else {
                b2 = -1;
                staticLayout = new StaticLayout(text, this.f34948k, iRound, alignment, this.f34949l.getLineSpacingMultiplier(), this.f34949l.getLineSpacingExtra(), this.f34949l.getIncludeFontPadding());
            }
            if (maxLines != b2 && (staticLayout.getLineCount() > maxLines || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length())) {
                z = false;
            } else if (staticLayout.getHeight() > rectF.bottom) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i8 = i5 + 1;
                i2 = 0;
                i4 = i3;
                i3 = i8;
            } else {
                i4 = i5 - 1;
                i = i4;
                i2 = 0;
            }
        }
        return this.f34946i[i4];
    }

    /* JADX INFO: renamed from: f */
    public void m14832f(int i, float f) {
        Context context = this.f34950m;
        float fApplyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        if (fApplyDimension != this.f34949l.getPaint().getTextSize()) {
            this.f34949l.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f34949l.isInLayout();
            if (this.f34949l.getLayout() != null) {
                this.f34942e = false;
                try {
                    Method methodM14827d = m14827d("nullLayouts");
                    if (methodM14827d != null) {
                        methodM14827d.invoke(this.f34949l, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (zIsInLayout) {
                    this.f34949l.forceLayout();
                } else {
                    this.f34949l.requestLayout();
                }
                this.f34949l.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m14833g() {
        if (m14835i() && this.f34941d == 1) {
            if (!this.f34947j || this.f34946i.length == 0) {
                int iFloor = ((int) Math.floor((this.f34945h - this.f34944g) / this.f34943f)) + 1;
                int[] iArr = new int[iFloor];
                for (int i = 0; i < iFloor; i++) {
                    iArr[i] = Math.round((i * this.f34943f) + this.f34944g);
                }
                this.f34946i = m14830b(iArr);
            }
            this.f34942e = true;
        } else {
            this.f34942e = false;
        }
        return this.f34942e;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m14834h() {
        int[] iArr = this.f34946i;
        int length = iArr.length;
        boolean z = length > 0;
        this.f34947j = z;
        if (z) {
            this.f34941d = 1;
            this.f34944g = iArr[0];
            this.f34945h = iArr[length - 1];
            this.f34943f = -1.0f;
        }
        return z;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m14835i() {
        return !(this.f34949l instanceof AppCompatEditText);
    }

    /* JADX INFO: renamed from: j */
    public final void m14836j(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.f34941d = 1;
        this.f34944g = f;
        this.f34945h = f2;
        this.f34943f = f3;
        this.f34947j = false;
    }
}
