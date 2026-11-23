package p636z0.p725k.p739l;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p729e.Insets;

/* JADX INFO: renamed from: z0.k.l.d, reason: use source file name */
/* JADX INFO: compiled from: DisplayCutoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class DisplayCutoutCompat {

    /* JADX INFO: renamed from: a */
    public final Object f38055a;

    public DisplayCutoutCompat(Rect rect, List<Rect> list) {
        this.f38055a = Build.VERSION.SDK_INT >= 28 ? new DisplayCutout(rect, list) : null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f38055a, ((DisplayCutoutCompat) obj).f38055a);
    }

    public int hashCode() {
        Object obj = this.f38055a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DisplayCutoutCompat{");
        sbM1556G.append(this.f38055a);
        sbM1556G.append("}");
        return sbM1556G.toString();
    }

    public DisplayCutoutCompat(Object obj) {
        this.f38055a = obj;
    }

    public DisplayCutoutCompat(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
        DisplayCutout displayCutout;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            displayCutout = new DisplayCutout(insets.m16168c(), rect, rect2, rect3, rect4, insets2.m16168c());
        } else if (i >= 29) {
            displayCutout = new DisplayCutout(insets.m16168c(), rect, rect2, rect3, rect4);
        } else if (i >= 28) {
            Rect rect5 = new Rect(insets.f37851b, insets.f37852c, insets.f37853d, insets.f37854e);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            displayCutout = new DisplayCutout(rect5, arrayList);
        } else {
            displayCutout = null;
        }
        this.f38055a = displayCutout;
    }
}
