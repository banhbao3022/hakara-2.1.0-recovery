package p007c.p190n.p194b.p266d.p267a.p277g0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p007c.p190n.p194b.p266d.p267a.AbstractC2138c;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3420q1;
import p007c.p190n.p194b.p266d.p314j.p315a.hx2;

/* JADX INFO: renamed from: c.n.b.d.a.g0.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2179b extends ViewGroup {

    /* JADX INFO: renamed from: f */
    @NotOnlyInitialized
    public final C3420q1 f10573f;

    public C2179b(@RecentlyNonNull Context context) {
        super(context);
        this.f10573f = new C3420q1(this);
    }

    @RecentlyNonNull
    public AbstractC2138c getAdListener() {
        return this.f10573f.f18157f;
    }

    @RecentlyNullable
    public C2177g getAdSize() {
        return this.f10573f.m8175b();
    }

    @RecentlyNonNull
    public String getAdUnitId() {
        return this.f10573f.m8176c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i5 = ((i3 - i) - measuredWidth) / 2;
        int i6 = ((i4 - i2) - measuredHeight) / 2;
        childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C2177g adSize;
        int iM4627a;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e) {
                C2622l.m5438t3("Unable to retrieve ad size.", e);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iM4628b = adSize.m4628b(context);
                iM4627a = adSize.m4627a(context);
                measuredWidth = iM4628b;
            } else {
                iM4627a = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            measuredWidth = childAt.getMeasuredWidth();
            iM4627a = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(iM4627a, getSuggestedMinimumHeight()), i2));
    }

    public void setAdListener(@RecentlyNonNull AbstractC2138c abstractC2138c) {
        C3420q1 c3420q1 = this.f10573f;
        c3420q1.f18157f = abstractC2138c;
        hx2 hx2Var = c3420q1.f18155d;
        synchronized (hx2Var.f15047a) {
            hx2Var.f15048b = abstractC2138c;
        }
    }

    public void setAdSize(@RecentlyNonNull C2177g c2177g) {
        C3420q1 c3420q1 = this.f10573f;
        C2177g[] c2177gArr = {c2177g};
        if (c3420q1.f18158g != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        c3420q1.m8178e(c2177gArr);
    }

    public void setAdUnitId(@RecentlyNonNull String str) {
        C3420q1 c3420q1 = this.f10573f;
        if (c3420q1.f18162k != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        c3420q1.f18162k = str;
    }

    public C2179b(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10573f = new C3420q1(this, attributeSet, false);
    }

    public C2179b(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f10573f = new C3420q1(this, attributeSet, false);
    }
}
