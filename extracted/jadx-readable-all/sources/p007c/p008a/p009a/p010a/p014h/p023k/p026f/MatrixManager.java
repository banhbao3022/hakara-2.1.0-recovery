package p007c.p008a.p009a.p010a.p014h.p023k.p026f;

import android.graphics.Point;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.k.f.a, reason: use source file name */
/* JADX INFO: compiled from: MatrixManager.kt */
/* JADX INFO: loaded from: classes.dex */
public class MatrixManager {

    /* JADX INFO: renamed from: b */
    public int f1648b;

    /* JADX INFO: renamed from: d */
    public Integer f1650d;

    /* JADX INFO: renamed from: e */
    public ScaleType f1651e;

    /* JADX INFO: renamed from: a */
    public Point f1647a = new Point(0, 0);

    /* JADX INFO: renamed from: c */
    public ScaleType f1649c = ScaleType.FIT_CENTER;

    /* JADX INFO: renamed from: f */
    public WeakReference<View> f1652f = new WeakReference<>(null);

    /* JADX INFO: renamed from: c.a.a.a.h.k.f.a$a */
    /* JADX INFO: compiled from: MatrixManager.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m1196a(View view) {
        Intrinsics2.m13089e(view, "view");
        m1204i(view, this.f1647a.x / view.getWidth(), this.f1647a.y / view.getHeight());
    }

    /* JADX INFO: renamed from: b */
    public final void m1197b(View view) {
        Intrinsics2.m13089e(view, "view");
        float width = view.getWidth() / this.f1647a.x;
        float height = view.getHeight() / this.f1647a.y;
        float fMin = Math.min(width, height);
        m1204i(view, fMin / width, fMin / height);
    }

    /* JADX INFO: renamed from: c */
    public final int m1198c() {
        Integer num = this.f1650d;
        return num != null ? num.intValue() : this.f1648b;
    }

    /* JADX INFO: renamed from: d */
    public final ScaleType m1199d() {
        ScaleType scaleType = this.f1651e;
        return scaleType != null ? scaleType : this.f1649c;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1200e() {
        Point point = this.f1647a;
        return point.x > 0 && point.y > 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m1201f(View view, int i) {
        Intrinsics2.m13089e(view, "view");
        if (!m1200e()) {
            this.f1650d = Integer.valueOf(i);
            this.f1652f = new WeakReference<>(view);
            return;
        }
        if (((i / 90) % 2 == 1) != ((m1198c() / 90) % 2 == 1)) {
            Point point = this.f1647a;
            int i2 = point.x;
            point.x = point.y;
            point.y = i2;
            m1202g(view, m1199d());
        }
        this.f1648b = i;
        view.setRotation(i);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1202g(View view, ScaleType scaleType) {
        Intrinsics2.m13089e(view, "view");
        Intrinsics2.m13089e(scaleType, "scaleType");
        if (!m1200e()) {
            this.f1651e = scaleType;
            this.f1652f = new WeakReference<>(view);
            return false;
        }
        if (view.getHeight() == 0 || view.getWidth() == 0) {
            StringBuilder sbM1556G = outline.m1556G("Unable to apply scale with a view size of (");
            sbM1556G.append(view.getWidth());
            sbM1556G.append(", ");
            sbM1556G.append(view.getHeight());
            sbM1556G.append(")");
            Log.d("MatrixManager", sbM1556G.toString());
            return false;
        }
        this.f1649c = scaleType;
        int iOrdinal = scaleType.ordinal();
        if (iOrdinal == 0) {
            m1196a(view);
        } else if (iOrdinal == 1) {
            Intrinsics2.m13089e(view, "view");
            float width = view.getWidth() / this.f1647a.x;
            float height = view.getHeight() / this.f1647a.y;
            float fMax = Math.max(width, height);
            m1204i(view, fMax / width, fMax / height);
        } else if (iOrdinal == 2) {
            Intrinsics2.m13089e(view, "view");
            if (this.f1647a.x > view.getWidth() || this.f1647a.y > view.getHeight()) {
                m1197b(view);
            } else {
                m1196a(view);
            }
        } else if (iOrdinal == 3) {
            m1197b(view);
        } else if (iOrdinal == 4) {
            Intrinsics2.m13089e(view, "view");
            m1204i(view, 1.0f, 1.0f);
        } else if (iOrdinal == 5) {
            m1204i(view, 1.0f, 1.0f);
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final void m1203h(int i, int i2) {
        boolean z = (m1198c() / 90) % 2 == 1;
        Point point = this.f1647a;
        point.x = z ? i2 : i;
        if (!z) {
            i = i2;
        }
        point.y = i;
        if (m1200e()) {
            View view = this.f1652f.get();
            if (view != null) {
                Integer num = this.f1650d;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Intrinsics2.m13088d(view, "view");
                    m1201f(view, iIntValue);
                    this.f1650d = null;
                }
                ScaleType scaleType = this.f1651e;
                if (scaleType != null) {
                    Intrinsics2.m13088d(view, "view");
                    m1202g(view, scaleType);
                    this.f1651e = null;
                }
            }
            this.f1652f = new WeakReference<>(null);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1204i(View view, float f, float f2) {
        Intrinsics2.m13089e(view, "view");
        if ((m1198c() / 90) % 2 == 1) {
            view.setScaleX((f2 * view.getHeight()) / view.getWidth());
            view.setScaleY((f * view.getWidth()) / view.getHeight());
        } else {
            view.setScaleX(f);
            view.setScaleY(f2);
        }
    }
}
