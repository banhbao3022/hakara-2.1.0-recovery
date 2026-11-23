package p007c.p190n.p194b.p334e.p336b0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;

/* JADX INFO: renamed from: c.n.b.e.b0.b, reason: use source file name */
/* JADX INFO: compiled from: TabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes.dex */
public class TabIndicatorInterpolator {
    /* JADX INFO: renamed from: a */
    public static RectF m11023a(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f29029H || !(view instanceof TabLayout.C5971i)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.C5971i c5971i = (TabLayout.C5971i) view;
        int contentWidth = c5971i.getContentWidth();
        int contentHeight = c5971i.getContentHeight();
        int iM11020z = (int) C4799a.m11020z(c5971i.getContext(), 24);
        if (contentWidth < iM11020z) {
            contentWidth = iM11020z;
        }
        int right = (c5971i.getRight() + c5971i.getLeft()) / 2;
        int bottom = (c5971i.getBottom() + c5971i.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    /* JADX INFO: renamed from: b */
    public void mo11022b(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFM11023a = m11023a(tabLayout, view);
        RectF rectFM11023a2 = m11023a(tabLayout, view2);
        drawable.setBounds(AnimationUtils.m11031b((int) rectFM11023a.left, (int) rectFM11023a2.left, f), drawable.getBounds().top, AnimationUtils.m11031b((int) rectFM11023a.right, (int) rectFM11023a2.right, f), drawable.getBounds().bottom);
    }
}
