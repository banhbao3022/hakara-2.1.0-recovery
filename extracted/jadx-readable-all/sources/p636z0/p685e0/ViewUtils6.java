package p636z0.p685e0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.e0.t, reason: use source file name */
/* JADX INFO: compiled from: ViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewUtils6 {

    /* JADX INFO: renamed from: a */
    public static final ViewUtilsBase f36500a;

    /* JADX INFO: renamed from: b */
    public static final Property<View, Float> f36501b;

    /* JADX INFO: renamed from: z0.e0.t$a */
    /* JADX INFO: compiled from: ViewUtils.java */
    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(View view) {
            return Float.valueOf(ViewUtils6.m15530a(view));
        }

        @Override // android.util.Property
        public void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            ViewUtils6.f36500a.mo15535e(view, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: z0.e0.t$b */
    /* JADX INFO: compiled from: ViewUtils.java */
    public static class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Rect get(View view) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public void set(View view, Rect rect) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view.setClipBounds(rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f36500a = new ViewUtilsApi29();
        } else if (i >= 23) {
            f36500a = new ViewUtilsApi23();
        } else if (i >= 22) {
            f36500a = new ViewUtilsApi22();
        } else {
            f36500a = new ViewUtilsApi21();
        }
        f36501b = new a(Float.class, "translationAlpha");
        new b(Rect.class, "clipBounds");
    }

    /* JADX INFO: renamed from: a */
    public static float m15530a(View view) {
        return f36500a.mo15533b(view);
    }

    /* JADX INFO: renamed from: b */
    public static void m15531b(View view, int i, int i2, int i3, int i4) {
        f36500a.mo15538d(view, i, i2, i3, i4);
    }
}
