package p007c.p190n.p194b.p334e.p336b0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;

/* JADX INFO: renamed from: c.n.b.e.b0.a, reason: use source file name */
/* JADX INFO: compiled from: ElasticTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes.dex */
public class ElasticTabIndicatorInterpolator extends TabIndicatorInterpolator {
    /* JADX INFO: renamed from: c */
    public static float m11021c(float f) {
        return (float) (1.0d - Math.cos((((double) f) * 3.141592653589793d) / 2.0d));
    }

    @Override // p007c.p190n.p194b.p334e.p336b0.TabIndicatorInterpolator
    /* JADX INFO: renamed from: b */
    public void mo11022b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fSin;
        float fM11021c;
        RectF rectFM11023a = TabIndicatorInterpolator.m11023a(tabLayout, view);
        RectF rectFM11023a2 = TabIndicatorInterpolator.m11023a(tabLayout, view2);
        if (rectFM11023a.left < rectFM11023a2.left) {
            fSin = m11021c(f);
            fM11021c = (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
        } else {
            fSin = (float) Math.sin((((double) f) * 3.141592653589793d) / 2.0d);
            fM11021c = m11021c(f);
        }
        drawable.setBounds(AnimationUtils.m11031b((int) rectFM11023a.left, (int) rectFM11023a2.left, fSin), drawable.getBounds().top, AnimationUtils.m11031b((int) rectFM11023a.right, (int) rectFM11023a2.right, fM11021c), drawable.getBounds().bottom);
    }
}
