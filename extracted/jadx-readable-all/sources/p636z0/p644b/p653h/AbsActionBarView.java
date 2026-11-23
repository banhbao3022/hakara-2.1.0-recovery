package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import mtp.media.karaoke.R;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorListener;

/* JADX INFO: renamed from: z0.b.h.a, reason: use source file name */
/* JADX INFO: compiled from: AbsActionBarView.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbsActionBarView extends ViewGroup {

    /* JADX INFO: renamed from: f */
    public final a f34927f;

    /* JADX INFO: renamed from: g */
    public final Context f34928g;

    /* JADX INFO: renamed from: h */
    public ActionMenuView f34929h;

    /* JADX INFO: renamed from: i */
    public ActionMenuPresenter f34930i;

    /* JADX INFO: renamed from: j */
    public int f34931j;

    /* JADX INFO: renamed from: k */
    public ViewPropertyAnimatorCompat f34932k;

    /* JADX INFO: renamed from: l */
    public boolean f34933l;

    /* JADX INFO: renamed from: m */
    public boolean f34934m;

    /* JADX INFO: renamed from: z0.b.h.a$a */
    /* JADX INFO: compiled from: AbsActionBarView.java */
    public class a implements ViewPropertyAnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f34935a = false;

        /* JADX INFO: renamed from: b */
        public int f34936b;

        public a() {
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: a */
        public void mo14826a(View view) {
            this.f34935a = true;
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: b */
        public void mo14669b(View view) {
            if (this.f34935a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.f34932k = null;
            AbsActionBarView.super.setVisibility(this.f34936b);
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: c */
        public void mo14677c(View view) {
            AbsActionBarView.super.setVisibility(0);
            this.f34935a = false;
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: renamed from: c */
    public int m14823c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* JADX INFO: renamed from: d */
    public int m14824d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* JADX INFO: renamed from: e */
    public ViewPropertyAnimatorCompat m14825e(int i, long j2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f34932k;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.m16346b();
        }
        if (i != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b = ViewCompat.m16308b(this);
            viewPropertyAnimatorCompatM16308b.m16345a(0.0f);
            viewPropertyAnimatorCompatM16308b.m16347c(j2);
            a aVar = this.f34927f;
            AbsActionBarView.this.f34932k = viewPropertyAnimatorCompatM16308b;
            aVar.f34936b = i;
            View view = viewPropertyAnimatorCompatM16308b.f38092a.get();
            if (view != null) {
                viewPropertyAnimatorCompatM16308b.m16349e(view, aVar);
            }
            return viewPropertyAnimatorCompatM16308b;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b2 = ViewCompat.m16308b(this);
        viewPropertyAnimatorCompatM16308b2.m16345a(1.0f);
        viewPropertyAnimatorCompatM16308b2.m16347c(j2);
        a aVar2 = this.f34927f;
        AbsActionBarView.this.f34932k = viewPropertyAnimatorCompatM16308b2;
        aVar2.f34936b = i;
        View view2 = viewPropertyAnimatorCompatM16308b2.f38092a.get();
        if (view2 != null) {
            viewPropertyAnimatorCompatM16308b2.m16349e(view2, aVar2);
        }
        return viewPropertyAnimatorCompatM16308b2;
    }

    public int getAnimatedVisibility() {
        return this.f34932k != null ? this.f34927f.f34936b : getVisibility();
    }

    public int getContentHeight() {
        return this.f34931j;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, C7463b.f34385a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f34930i;
        if (actionMenuPresenter != null) {
            Configuration configuration2 = actionMenuPresenter.f34755g.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
                i = 5;
            } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
                i = 4;
            } else {
                i = i2 >= 360 ? 3 : 2;
            }
            actionMenuPresenter.f34987v = i;
            MenuBuilder menuBuilder = actionMenuPresenter.f34756h;
            if (menuBuilder != null) {
                menuBuilder.m14783q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f34934m = false;
        }
        if (!this.f34934m) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f34934m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f34934m = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f34933l = false;
        }
        if (!this.f34933l) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f34933l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f34933l = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f34932k;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.m16346b();
            }
            super.setVisibility(i);
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34927f = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f34928g = context;
        } else {
            this.f34928g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
