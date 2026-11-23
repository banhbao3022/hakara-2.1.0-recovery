package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p336b0.ElasticTabIndicatorInterpolator;
import p007c.p190n.p194b.p334e.p336b0.TabIndicatorInterpolator;
import p007c.p190n.p194b.p334e.p336b0.TabItem;
import p007c.p190n.p194b.p334e.p336b0.TabLayout2;
import p007c.p190n.p194b.p334e.p337c.AnimationUtils;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p342e.BadgeDrawable;
import p007c.p190n.p194b.p334e.p342e.BadgeUtils;
import p007c.p190n.p194b.p334e.p357q.ElevationOverlayProvider;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p636z0.p644b.C7462a;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p695h0.p696a.PagerAdapter2;
import p636z0.p725k.C8162a;
import p636z0.p725k.p738k.Pools2;
import p636z0.p725k.p738k.Pools3;
import p636z0.p725k.p738k.Pools4;
import p636z0.p725k.p739l.PointerIconCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
@ViewPager.InterfaceC0196e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: f */
    public static final Pools2<C5969g> f29021f = new Pools4(16);

    /* JADX INFO: renamed from: A */
    public final int f29022A;

    /* JADX INFO: renamed from: B */
    public int f29023B;

    /* JADX INFO: renamed from: C */
    public int f29024C;

    /* JADX INFO: renamed from: D */
    public int f29025D;

    /* JADX INFO: renamed from: E */
    public int f29026E;

    /* JADX INFO: renamed from: F */
    public int f29027F;

    /* JADX INFO: renamed from: G */
    public boolean f29028G;

    /* JADX INFO: renamed from: H */
    public boolean f29029H;

    /* JADX INFO: renamed from: I */
    public int f29030I;

    /* JADX INFO: renamed from: J */
    public boolean f29031J;

    /* JADX INFO: renamed from: K */
    public TabIndicatorInterpolator f29032K;

    /* JADX INFO: renamed from: L */
    public InterfaceC5965c f29033L;

    /* JADX INFO: renamed from: M */
    public final ArrayList<InterfaceC5965c> f29034M;

    /* JADX INFO: renamed from: N */
    public InterfaceC5965c f29035N;

    /* JADX INFO: renamed from: O */
    public ValueAnimator f29036O;

    /* JADX INFO: renamed from: P */
    public ViewPager f29037P;

    /* JADX INFO: renamed from: Q */
    public PagerAdapter2 f29038Q;

    /* JADX INFO: renamed from: R */
    public DataSetObserver f29039R;

    /* JADX INFO: renamed from: S */
    public C5970h f29040S;

    /* JADX INFO: renamed from: T */
    public C5964b f29041T;

    /* JADX INFO: renamed from: U */
    public boolean f29042U;

    /* JADX INFO: renamed from: V */
    public final Pools2<C5971i> f29043V;

    /* JADX INFO: renamed from: g */
    public final ArrayList<C5969g> f29044g;

    /* JADX INFO: renamed from: h */
    public C5969g f29045h;

    /* JADX INFO: renamed from: i */
    public final C5968f f29046i;

    /* JADX INFO: renamed from: j */
    public int f29047j;

    /* JADX INFO: renamed from: k */
    public int f29048k;

    /* JADX INFO: renamed from: l */
    public int f29049l;

    /* JADX INFO: renamed from: m */
    public int f29050m;

    /* JADX INFO: renamed from: n */
    public int f29051n;

    /* JADX INFO: renamed from: o */
    public ColorStateList f29052o;

    /* JADX INFO: renamed from: p */
    public ColorStateList f29053p;

    /* JADX INFO: renamed from: q */
    public ColorStateList f29054q;

    /* JADX INFO: renamed from: r */
    public Drawable f29055r;

    /* JADX INFO: renamed from: s */
    public int f29056s;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f29057t;

    /* JADX INFO: renamed from: u */
    public float f29058u;

    /* JADX INFO: renamed from: v */
    public float f29059v;

    /* JADX INFO: renamed from: w */
    public final int f29060w;

    /* JADX INFO: renamed from: x */
    public int f29061x;

    /* JADX INFO: renamed from: y */
    public final int f29062y;

    /* JADX INFO: renamed from: z */
    public final int f29063z;

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$a */
    public class C5963a implements ValueAnimator.AnimatorUpdateListener {
        public C5963a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$b */
    public class C5964b implements ViewPager.InterfaceC0200i {

        /* JADX INFO: renamed from: a */
        public boolean f29065a;

        public C5964b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0200i
        /* JADX INFO: renamed from: a */
        public void mo906a(ViewPager viewPager, PagerAdapter2 pagerAdapter2, PagerAdapter2 pagerAdapter3) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f29037P == viewPager) {
                tabLayout.m12827l(pagerAdapter3, this.f29065a);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$c */
    @Deprecated
    public interface InterfaceC5965c<T extends C5969g> {
        /* JADX INFO: renamed from: a */
        void mo11027a(T t);

        /* JADX INFO: renamed from: b */
        void mo11028b(T t);

        /* JADX INFO: renamed from: c */
        void mo11029c(T t);
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$d */
    public interface InterfaceC5966d extends InterfaceC5965c<C5969g> {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$e */
    public class C5967e extends DataSetObserver {
        public C5967e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.m12824i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.m12824i();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f */
    public class C5968f extends LinearLayout {

        /* JADX INFO: renamed from: f */
        public ValueAnimator f29068f;

        /* JADX INFO: renamed from: g */
        public int f29069g;

        /* JADX INFO: renamed from: h */
        public float f29070h;

        /* JADX INFO: renamed from: i */
        public int f29071i;

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f29073a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f29074b;

            public a(View view, View view2) {
                this.f29073a = view;
                this.f29074b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C5968f.this.m12835c(this.f29073a, this.f29074b, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$f$b */
        public class b extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ int f29076a;

            public b(int i) {
                this.f29076a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C5968f.this.f29069g = this.f29076a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C5968f.this.f29069g = this.f29076a;
            }
        }

        public C5968f(Context context) {
            super(context);
            this.f29069g = -1;
            this.f29071i = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: renamed from: a */
        public final void m12833a() {
            View childAt = getChildAt(this.f29069g);
            TabLayout tabLayout = TabLayout.this;
            TabIndicatorInterpolator tabIndicatorInterpolator = tabLayout.f29032K;
            Drawable drawable = tabLayout.f29055r;
            Objects.requireNonNull(tabIndicatorInterpolator);
            RectF rectFM11023a = TabIndicatorInterpolator.m11023a(tabLayout, childAt);
            drawable.setBounds((int) rectFM11023a.left, drawable.getBounds().top, (int) rectFM11023a.right, drawable.getBounds().bottom);
        }

        /* JADX INFO: renamed from: b */
        public void m12834b(int i) {
            Rect bounds = TabLayout.this.f29055r.getBounds();
            TabLayout.this.f29055r.setBounds(bounds.left, 0, bounds.right, i);
            requestLayout();
        }

        /* JADX INFO: renamed from: c */
        public final void m12835c(View view, View view2, float f) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.f29032K.mo11022b(tabLayout, view, view2, f, tabLayout.f29055r);
            } else {
                Drawable drawable = TabLayout.this.f29055r;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f29055r.getBounds().bottom);
            }
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }

        /* JADX INFO: renamed from: d */
        public final void m12836d(boolean z, int i, int i2) {
            View childAt = getChildAt(this.f29069g);
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                m12833a();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z) {
                this.f29068f.removeAllUpdateListeners();
                this.f29068f.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f29068f = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.f24794b);
            valueAnimator.setDuration(i2);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i));
            valueAnimator.start();
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int iHeight = TabLayout.this.f29055r.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f29055r.getIntrinsicHeight();
            }
            int i = TabLayout.this.f29026E;
            int height = 0;
            if (i == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i == 1) {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            } else if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f29055r.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f29055r.getBounds();
                TabLayout.this.f29055r.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawableM16054Y = tabLayout.f29055r;
                if (tabLayout.f29056s != 0) {
                    drawableM16054Y = C8162a.m16054Y(drawableM16054Y);
                    if (Build.VERSION.SDK_INT == 21) {
                        drawableM16054Y.setColorFilter(TabLayout.this.f29056s, PorterDuff.Mode.SRC_IN);
                    } else {
                        drawableM16054Y.setTint(TabLayout.this.f29056s);
                    }
                }
                drawableM16054Y.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f29068f;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m12833a();
            } else {
                m12836d(false, this.f29069g, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.f29024C == 1 || tabLayout.f29027F == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i3 = 0; i3 < childCount; i3++) {
                    View childAt = getChildAt(i3);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) C4799a.m11020z(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f29024C = 0;
                    tabLayout2.m12832q(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.f29071i == i) {
                return;
            }
            requestLayout();
            this.f29071i = i;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$g */
    public static class C5969g {

        /* JADX INFO: renamed from: a */
        public Drawable f29078a;

        /* JADX INFO: renamed from: b */
        public CharSequence f29079b;

        /* JADX INFO: renamed from: c */
        public CharSequence f29080c;

        /* JADX INFO: renamed from: e */
        public View f29082e;

        /* JADX INFO: renamed from: g */
        public TabLayout f29084g;

        /* JADX INFO: renamed from: h */
        public C5971i f29085h;

        /* JADX INFO: renamed from: d */
        public int f29081d = -1;

        /* JADX INFO: renamed from: f */
        public int f29083f = 1;

        /* JADX INFO: renamed from: i */
        public int f29086i = -1;

        /* JADX INFO: renamed from: a */
        public C5969g m12837a(int i) {
            TabLayout tabLayout = this.f29084g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            m12838b(tabLayout.getResources().getText(i));
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C5969g m12838b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f29080c) && !TextUtils.isEmpty(charSequence)) {
                this.f29085h.setContentDescription(charSequence);
            }
            this.f29079b = charSequence;
            m12839c();
            return this;
        }

        /* JADX INFO: renamed from: c */
        public void m12839c() {
            C5971i c5971i = this.f29085h;
            if (c5971i != null) {
                c5971i.m12845f();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$h */
    public static class C5970h implements ViewPager.InterfaceC0201j {

        /* JADX INFO: renamed from: a */
        public final WeakReference<TabLayout> f29087a;

        /* JADX INFO: renamed from: b */
        public int f29088b;

        /* JADX INFO: renamed from: c */
        public int f29089c;

        public C5970h(TabLayout tabLayout) {
            this.f29087a = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0201j
        /* JADX INFO: renamed from: a */
        public void mo907a(int i) {
            this.f29088b = this.f29089c;
            this.f29089c = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0201j
        /* JADX INFO: renamed from: b */
        public void mo908b(int i) {
            TabLayout tabLayout = this.f29087a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.f29089c;
            tabLayout.m12826k(tabLayout.m12822g(i), i2 == 0 || (i2 == 2 && this.f29088b == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0201j
        /* JADX INFO: renamed from: c */
        public void mo909c(int i, float f, int i2) {
            TabLayout tabLayout = this.f29087a.get();
            if (tabLayout != null) {
                int i3 = this.f29089c;
                tabLayout.m12828m(i, f, i3 != 2 || this.f29088b == 1, (i3 == 2 && this.f29088b == 0) ? false : true);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$i */
    public final class C5971i extends LinearLayout {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ int f29090f = 0;

        /* JADX INFO: renamed from: g */
        public C5969g f29091g;

        /* JADX INFO: renamed from: h */
        public TextView f29092h;

        /* JADX INFO: renamed from: i */
        public ImageView f29093i;

        /* JADX INFO: renamed from: j */
        public View f29094j;

        /* JADX INFO: renamed from: k */
        public BadgeDrawable f29095k;

        /* JADX INFO: renamed from: l */
        public View f29096l;

        /* JADX INFO: renamed from: m */
        public TextView f29097m;

        /* JADX INFO: renamed from: n */
        public ImageView f29098n;

        /* JADX INFO: renamed from: o */
        public Drawable f29099o;

        /* JADX INFO: renamed from: p */
        public int f29100p;

        public C5971i(Context context) {
            super(context);
            this.f29100p = 2;
            m12846g(context);
            int i = TabLayout.this.f29047j;
            int i2 = TabLayout.this.f29048k;
            int i3 = TabLayout.this.f29049l;
            int i4 = TabLayout.this.f29050m;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            setPaddingRelative(i, i2, i3, i4);
            setGravity(17);
            setOrientation(!TabLayout.this.f29028G ? 1 : 0);
            setClickable(true);
            ViewCompat.m16328v(this, PointerIconCompat.m16306a(getContext(), CloseCodes.PROTOCOL_ERROR));
        }

        private BadgeDrawable getBadge() {
            return this.f29095k;
        }

        private BadgeDrawable getOrCreateBadge() {
            if (this.f29095k == null) {
                Context context = getContext();
                BadgeDrawable badgeDrawable = new BadgeDrawable(context);
                int[] iArr = C4801b.f24748c;
                ThemeEnforcement.m11344a(context, null, R.attr.badgeStyle, 2132017867);
                ThemeEnforcement.m11345b(context, null, iArr, R.attr.badgeStyle, 2132017867, new int[0]);
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.badgeStyle, 2132017867);
                badgeDrawable.m11100j(typedArrayObtainStyledAttributes.getInt(4, 4));
                if (typedArrayObtainStyledAttributes.hasValue(5)) {
                    badgeDrawable.m11101k(typedArrayObtainStyledAttributes.getInt(5, 0));
                }
                badgeDrawable.m11097g(C4799a.m10961L(context, typedArrayObtainStyledAttributes, 0).getDefaultColor());
                if (typedArrayObtainStyledAttributes.hasValue(2)) {
                    badgeDrawable.m11099i(C4799a.m10961L(context, typedArrayObtainStyledAttributes, 2).getDefaultColor());
                }
                badgeDrawable.m11098h(typedArrayObtainStyledAttributes.getInt(1, 8388661));
                badgeDrawable.f24951m.f24970p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
                badgeDrawable.m11103m();
                badgeDrawable.f24951m.f24971q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
                badgeDrawable.m11103m();
                typedArrayObtainStyledAttributes.recycle();
                this.f29095k = badgeDrawable;
            }
            m12843d();
            BadgeDrawable badgeDrawable2 = this.f29095k;
            if (badgeDrawable2 != null) {
                return badgeDrawable2;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: renamed from: a */
        public final boolean m12840a() {
            return this.f29095k != null;
        }

        /* JADX INFO: renamed from: b */
        public final void m12841b(View view) {
            if (m12840a() && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                BadgeUtils.m11104a(this.f29095k, view, null);
                this.f29094j = view;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m12842c() {
            if (m12840a()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f29094j;
                if (view != null) {
                    BadgeUtils.m11105b(this.f29095k, view);
                    this.f29094j = null;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m12843d() {
            C5969g c5969g;
            C5969g c5969g2;
            if (m12840a()) {
                if (this.f29096l != null) {
                    m12842c();
                    return;
                }
                ImageView imageView = this.f29093i;
                if (imageView != null && (c5969g2 = this.f29091g) != null && c5969g2.f29078a != null) {
                    if (this.f29094j == imageView) {
                        m12844e(imageView);
                        return;
                    } else {
                        m12842c();
                        m12841b(this.f29093i);
                        return;
                    }
                }
                TextView textView = this.f29092h;
                if (textView == null || (c5969g = this.f29091g) == null || c5969g.f29083f != 1) {
                    m12842c();
                } else if (this.f29094j == textView) {
                    m12844e(textView);
                } else {
                    m12842c();
                    m12841b(this.f29092h);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f29099o;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f29099o.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* JADX INFO: renamed from: e */
        public final void m12844e(View view) {
            if (m12840a() && view == this.f29094j) {
                BadgeUtils.m11106c(this.f29095k, view, null);
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m12845f() {
            Drawable drawable;
            C5969g c5969g = this.f29091g;
            Drawable drawableMutate = null;
            View view = c5969g != null ? c5969g.f29082e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f29096l = view;
                TextView textView = this.f29092h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f29093i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f29093i.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(android.R.id.text1);
                this.f29097m = textView2;
                if (textView2 != null) {
                    this.f29100p = textView2.getMaxLines();
                }
                this.f29098n = (ImageView) view.findViewById(android.R.id.icon);
            } else {
                View view2 = this.f29096l;
                if (view2 != null) {
                    removeView(view2);
                    this.f29096l = null;
                }
                this.f29097m = null;
                this.f29098n = null;
            }
            boolean z = false;
            if (this.f29096l == null) {
                if (this.f29093i == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f29093i = imageView2;
                    addView(imageView2, 0);
                }
                if (c5969g != null && (drawable = c5969g.f29078a) != null) {
                    drawableMutate = C8162a.m16054Y(drawable).mutate();
                }
                if (drawableMutate != null) {
                    drawableMutate.setTintList(TabLayout.this.f29053p);
                    PorterDuff.Mode mode = TabLayout.this.f29057t;
                    if (mode != null) {
                        drawableMutate.setTintMode(mode);
                    }
                }
                if (this.f29092h == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f29092h = textView3;
                    addView(textView3);
                    this.f29100p = this.f29092h.getMaxLines();
                }
                C8162a.m16047R(this.f29092h, TabLayout.this.f29051n);
                ColorStateList colorStateList = TabLayout.this.f29052o;
                if (colorStateList != null) {
                    this.f29092h.setTextColor(colorStateList);
                }
                m12847h(this.f29092h, this.f29093i);
                m12843d();
                ImageView imageView3 = this.f29093i;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new TabLayout2(this, imageView3));
                }
                TextView textView4 = this.f29092h;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new TabLayout2(this, textView4));
                }
            } else {
                TextView textView5 = this.f29097m;
                if (textView5 != null || this.f29098n != null) {
                    m12847h(textView5, this.f29098n);
                }
            }
            if (c5969g != null && !TextUtils.isEmpty(c5969g.f29080c)) {
                setContentDescription(c5969g.f29080c);
            }
            if (c5969g != null) {
                TabLayout tabLayout = c5969g.f29084g;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                if (tabLayout.getSelectedTabPosition() == c5969g.f29081d) {
                    z = true;
                }
            }
            setSelected(z);
        }

        /* JADX INFO: renamed from: g */
        public final void m12846g(Context context) {
            GradientDrawable gradientDrawable;
            int i = TabLayout.this.f29060w;
            if (i != 0) {
                Drawable drawableM14707b = AppCompatResources.m14707b(context, i);
                this.f29099o = drawableM14707b;
                if (drawableM14707b != null && drawableM14707b.isStateful()) {
                    this.f29099o.setState(getDrawableState());
                }
            } else {
                this.f29099o = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            Drawable rippleDrawable = gradientDrawable2;
            if (TabLayout.this.f29054q != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateListM11358a = RippleUtils.m11358a(TabLayout.this.f29054q);
                boolean z = TabLayout.this.f29031J;
                if (z) {
                    gradientDrawable = gradientDrawable2;
                    gradientDrawable = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListM11358a, gradientDrawable, z ? null : gradientDrawable3);
            }
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            setBackground(rippleDrawable);
            TabLayout.this.invalidate();
        }

        public int getContentHeight() {
            View[] viewArr = {this.f29092h, this.f29093i, this.f29096l};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f29092h, this.f29093i, this.f29096l};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public C5969g getTab() {
            return this.f29091g;
        }

        /* JADX INFO: renamed from: h */
        public final void m12847h(TextView textView, ImageView imageView) {
            Drawable drawable;
            C5969g c5969g = this.f29091g;
            Drawable drawableMutate = (c5969g == null || (drawable = c5969g.f29078a) == null) ? null : C8162a.m16054Y(drawable).mutate();
            C5969g c5969g2 = this.f29091g;
            CharSequence charSequence = c5969g2 != null ? c5969g2.f29079b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.f29091g.f29083f == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iM11020z = (z && imageView.getVisibility() == 0) ? (int) C4799a.m11020z(getContext(), 8) : 0;
                if (TabLayout.this.f29028G) {
                    if (iM11020z != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iM11020z);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iM11020z != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iM11020z;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C5969g c5969g3 = this.f29091g;
            CharSequence charSequence2 = c5969g3 != null ? c5969g3.f29080c : null;
            if (!z) {
                charSequence = charSequence2;
            }
            C7462a.m14578o(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            BadgeDrawable badgeDrawable = this.f29095k;
            if (badgeDrawable != null && badgeDrawable.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f29095k.m11093c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) AccessibilityNodeInfoCompat.c.m16278a(0, 1, this.f29091g.f29081d, 1, false, isSelected()).f38034a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) AccessibilityNodeInfoCompat.a.f38021a.f38029i);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0096  */
        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f29061x, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f29092h != null) {
                float f = TabLayout.this.f29058u;
                int i3 = this.f29100p;
                ImageView imageView = this.f29093i;
                boolean z = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f29092h;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.f29059v;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.f29092h.getTextSize();
                int lineCount = this.f29092h.getLineCount();
                int maxLines = this.f29092h.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.f29027F == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f29092h.getLayout();
                        if (layout != null) {
                            if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f29092h.setTextSize(0, f);
                        this.f29092h.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f29091g == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            C5969g c5969g = this.f29091g;
            TabLayout tabLayout = c5969g.f29084g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m12826k(c5969g, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.f29092h;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.f29093i;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f29096l;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(C5969g c5969g) {
            if (c5969g != this.f29091g) {
                this.f29091g = c5969g;
                m12845f();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$j */
    public static class C5972j implements InterfaceC5966d {

        /* JADX INFO: renamed from: a */
        public final ViewPager f29102a;

        public C5972j(ViewPager viewPager) {
            this.f29102a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: a */
        public void mo11027a(C5969g c5969g) {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: b */
        public void mo11028b(C5969g c5969g) {
            this.f29102a.setCurrentItem(c5969g.f29081d);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: c */
        public void mo11029c(C5969g c5969g) {
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private int getDefaultHeight() {
        int size = this.f29044g.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C5969g c5969g = this.f29044g.get(i);
            if (c5969g != null && c5969g.f29078a != null && !TextUtils.isEmpty(c5969g.f29079b)) {
                z = true;
                break;
            }
        }
        return (!z || this.f29028G) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i = this.f29062y;
        if (i != -1) {
            return i;
        }
        int i2 = this.f29027F;
        if (i2 == 0 || i2 == 2) {
            return this.f29022A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f29046i.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        int childCount = this.f29046i.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = this.f29046i.getChildAt(i2);
                boolean z = true;
                childAt.setSelected(i2 == i);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m12816a(C5969g c5969g, boolean z) {
        int size = this.f29044g.size();
        if (c5969g.f29084g != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        c5969g.f29081d = size;
        this.f29044g.add(size, c5969g);
        int size2 = this.f29044g.size();
        while (true) {
            size++;
            if (size >= size2) {
                break;
            } else {
                this.f29044g.get(size).f29081d = size;
            }
        }
        C5971i c5971i = c5969g.f29085h;
        c5971i.setSelected(false);
        c5971i.setActivated(false);
        C5968f c5968f = this.f29046i;
        int i = c5969g.f29081d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m12831p(layoutParams);
        c5968f.addView(c5971i, i, layoutParams);
        if (z) {
            TabLayout tabLayout = c5969g.f29084g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m12826k(c5969g, true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        m12817b(view);
    }

    /* JADX INFO: renamed from: b */
    public final void m12817b(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        C5969g c5969gM12823h = m12823h();
        CharSequence charSequence = tabItem.f24772f;
        if (charSequence != null) {
            c5969gM12823h.m12838b(charSequence);
        }
        Drawable drawable = tabItem.f24773g;
        if (drawable != null) {
            c5969gM12823h.f29078a = drawable;
            TabLayout tabLayout = c5969gM12823h.f29084g;
            if (tabLayout.f29024C == 1 || tabLayout.f29027F == 2) {
                tabLayout.m12832q(true);
            }
            c5969gM12823h.m12839c();
        }
        int i = tabItem.f24774h;
        if (i != 0) {
            c5969gM12823h.f29082e = LayoutInflater.from(c5969gM12823h.f29085h.getContext()).inflate(i, (ViewGroup) c5969gM12823h.f29085h, false);
            c5969gM12823h.m12839c();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            c5969gM12823h.f29080c = tabItem.getContentDescription();
            c5969gM12823h.m12839c();
        }
        m12816a(c5969gM12823h, this.f29044g.isEmpty());
    }

    /* JADX INFO: renamed from: c */
    public final void m12818c(int i) {
        boolean z;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (isLaidOut()) {
                C5968f c5968f = this.f29046i;
                int childCount = c5968f.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        z = false;
                        break;
                    } else {
                        if (c5968f.getChildAt(i2).getWidth() <= 0) {
                            z = true;
                            break;
                        }
                        i2++;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int iM12820e = m12820e(i, 0.0f);
                    if (scrollX != iM12820e) {
                        m12821f();
                        this.f29036O.setIntValues(scrollX, iM12820e);
                        this.f29036O.start();
                    }
                    C5968f c5968f2 = this.f29046i;
                    int i3 = this.f29025D;
                    ValueAnimator valueAnimator = c5968f2.f29068f;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        c5968f2.f29068f.cancel();
                    }
                    c5968f2.m12836d(true, i, i3);
                    return;
                }
            }
        }
        m12828m(i, 0.0f, true, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m12819d() {
        int i = this.f29027F;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.f29023B - this.f29047j) : 0;
        C5968f c5968f = this.f29046i;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        c5968f.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.f29027F;
        if (i2 == 0) {
            int i3 = this.f29024C;
            if (i3 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                this.f29046i.setGravity(1);
            } else if (i3 == 2) {
            }
            this.f29046i.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.f29024C == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f29046i.setGravity(1);
        }
        m12832q(true);
    }

    /* JADX INFO: renamed from: e */
    public final int m12820e(int i, float f) {
        int i2 = this.f29027F;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt = this.f29046i.getChildAt(i);
        int i3 = i + 1;
        View childAt2 = i3 < this.f29046i.getChildCount() ? this.f29046i.getChildAt(i3) : null;
        int width = childAt != null ? childAt.getWidth() : 0;
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    /* JADX INFO: renamed from: f */
    public final void m12821f() {
        if (this.f29036O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f29036O = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.f24794b);
            this.f29036O.setDuration(this.f29025D);
            this.f29036O.addUpdateListener(new C5963a());
        }
    }

    /* JADX INFO: renamed from: g */
    public C5969g m12822g(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f29044g.get(i);
    }

    public int getSelectedTabPosition() {
        C5969g c5969g = this.f29045h;
        if (c5969g != null) {
            return c5969g.f29081d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f29044g.size();
    }

    public int getTabGravity() {
        return this.f29024C;
    }

    public ColorStateList getTabIconTint() {
        return this.f29053p;
    }

    public int getTabIndicatorAnimationMode() {
        return this.f29030I;
    }

    public int getTabIndicatorGravity() {
        return this.f29026E;
    }

    public int getTabMaxWidth() {
        return this.f29061x;
    }

    public int getTabMode() {
        return this.f29027F;
    }

    public ColorStateList getTabRippleColor() {
        return this.f29054q;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f29055r;
    }

    public ColorStateList getTabTextColors() {
        return this.f29052o;
    }

    /* JADX INFO: renamed from: h */
    public C5969g m12823h() {
        C5969g c5969gMo2057a = f29021f.mo2057a();
        if (c5969gMo2057a == null) {
            c5969gMo2057a = new C5969g();
        }
        c5969gMo2057a.f29084g = this;
        Pools2<C5971i> pools2 = this.f29043V;
        C5971i c5971iMo2057a = pools2 != null ? pools2.mo2057a() : null;
        if (c5971iMo2057a == null) {
            c5971iMo2057a = new C5971i(getContext());
        }
        c5971iMo2057a.setTab(c5969gMo2057a);
        c5971iMo2057a.setFocusable(true);
        c5971iMo2057a.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c5969gMo2057a.f29080c)) {
            c5971iMo2057a.setContentDescription(c5969gMo2057a.f29079b);
        } else {
            c5971iMo2057a.setContentDescription(c5969gMo2057a.f29080c);
        }
        c5969gMo2057a.f29085h = c5971iMo2057a;
        int i = c5969gMo2057a.f29086i;
        if (i != -1) {
            c5971iMo2057a.setId(i);
        }
        return c5969gMo2057a;
    }

    /* JADX INFO: renamed from: i */
    public void m12824i() {
        int currentItem;
        m12825j();
        PagerAdapter2 pagerAdapter2 = this.f29038Q;
        if (pagerAdapter2 != null) {
            int iMo12480c = pagerAdapter2.mo12480c();
            for (int i = 0; i < iMo12480c; i++) {
                C5969g c5969gM12823h = m12823h();
                c5969gM12823h.m12838b(this.f29038Q.mo13991e(i));
                m12816a(c5969gM12823h, false);
            }
            ViewPager viewPager = this.f29037P;
            if (viewPager == null || iMo12480c <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m12826k(m12822g(currentItem), true);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m12825j() {
        int childCount = this.f29046i.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C5971i c5971i = (C5971i) this.f29046i.getChildAt(childCount);
            this.f29046i.removeViewAt(childCount);
            if (c5971i != null) {
                c5971i.setTab(null);
                c5971i.setSelected(false);
                this.f29043V.mo2058b(c5971i);
            }
            requestLayout();
        }
        Iterator<C5969g> it = this.f29044g.iterator();
        while (it.hasNext()) {
            C5969g next = it.next();
            it.remove();
            next.f29084g = null;
            next.f29085h = null;
            next.f29078a = null;
            next.f29086i = -1;
            next.f29079b = null;
            next.f29080c = null;
            next.f29081d = -1;
            next.f29082e = null;
            f29021f.mo2058b(next);
        }
        this.f29045h = null;
    }

    /* JADX INFO: renamed from: k */
    public void m12826k(C5969g c5969g, boolean z) {
        C5969g c5969g2 = this.f29045h;
        if (c5969g2 == c5969g) {
            if (c5969g2 != null) {
                for (int size = this.f29034M.size() - 1; size >= 0; size--) {
                    this.f29034M.get(size).mo11027a(c5969g);
                }
                m12818c(c5969g.f29081d);
                return;
            }
            return;
        }
        int i = c5969g != null ? c5969g.f29081d : -1;
        if (z) {
            if ((c5969g2 == null || c5969g2.f29081d == -1) && i != -1) {
                m12828m(i, 0.0f, true, true);
            } else {
                m12818c(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.f29045h = c5969g;
        if (c5969g2 != null) {
            for (int size2 = this.f29034M.size() - 1; size2 >= 0; size2--) {
                this.f29034M.get(size2).mo11029c(c5969g2);
            }
        }
        if (c5969g != null) {
            for (int size3 = this.f29034M.size() - 1; size3 >= 0; size3--) {
                this.f29034M.get(size3).mo11028b(c5969g);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m12827l(PagerAdapter2 pagerAdapter2, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter2 pagerAdapter3 = this.f29038Q;
        if (pagerAdapter3 != null && (dataSetObserver = this.f29039R) != null) {
            pagerAdapter3.f36715a.unregisterObserver(dataSetObserver);
        }
        this.f29038Q = pagerAdapter2;
        if (z && pagerAdapter2 != null) {
            if (this.f29039R == null) {
                this.f29039R = new C5967e();
            }
            pagerAdapter2.f36715a.registerObserver(this.f29039R);
        }
        m12824i();
    }

    /* JADX INFO: renamed from: m */
    public void m12828m(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound < 0 || iRound >= this.f29046i.getChildCount()) {
            return;
        }
        if (z2) {
            C5968f c5968f = this.f29046i;
            ValueAnimator valueAnimator = c5968f.f29068f;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c5968f.f29068f.cancel();
            }
            c5968f.f29069g = i;
            c5968f.f29070h = f;
            c5968f.m12835c(c5968f.getChildAt(i), c5968f.getChildAt(c5968f.f29069g + 1), c5968f.f29070h);
        }
        ValueAnimator valueAnimator2 = this.f29036O;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f29036O.cancel();
        }
        scrollTo(m12820e(i, f), 0);
        if (z) {
            setSelectedTabView(iRound);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m12829n(ViewPager viewPager, boolean z, boolean z2) {
        List<ViewPager.InterfaceC0200i> list;
        List<ViewPager.InterfaceC0201j> list2;
        ViewPager viewPager2 = this.f29037P;
        if (viewPager2 != null) {
            C5970h c5970h = this.f29040S;
            if (c5970h != null && (list2 = viewPager2.f1247d0) != null) {
                list2.remove(c5970h);
            }
            C5964b c5964b = this.f29041T;
            if (c5964b != null && (list = this.f29037P.f1249f0) != null) {
                list.remove(c5964b);
            }
        }
        InterfaceC5965c interfaceC5965c = this.f29035N;
        if (interfaceC5965c != null) {
            this.f29034M.remove(interfaceC5965c);
            this.f29035N = null;
        }
        if (viewPager != null) {
            this.f29037P = viewPager;
            if (this.f29040S == null) {
                this.f29040S = new C5970h(this);
            }
            C5970h c5970h2 = this.f29040S;
            c5970h2.f29089c = 0;
            c5970h2.f29088b = 0;
            if (viewPager.f1247d0 == null) {
                viewPager.f1247d0 = new ArrayList();
            }
            viewPager.f1247d0.add(c5970h2);
            C5972j c5972j = new C5972j(viewPager);
            this.f29035N = c5972j;
            if (!this.f29034M.contains(c5972j)) {
                this.f29034M.add(c5972j);
            }
            PagerAdapter2 adapter = viewPager.getAdapter();
            if (adapter != null) {
                m12827l(adapter, z);
            }
            if (this.f29041T == null) {
                this.f29041T = new C5964b();
            }
            C5964b c5964b2 = this.f29041T;
            c5964b2.f29065a = z;
            if (viewPager.f1249f0 == null) {
                viewPager.f1249f0 = new ArrayList();
            }
            viewPager.f1249f0.add(c5964b2);
            m12828m(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f29037P = null;
            m12827l(null, false);
        }
        this.f29042U = z2;
    }

    /* JADX INFO: renamed from: o */
    public final void m12830o() {
        int size = this.f29044g.size();
        for (int i = 0; i < size; i++) {
            this.f29044g.get(i).m12839c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            C4799a.m11005o0(this, (MaterialShapeDrawable) background);
        }
        if (this.f29037P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m12829n((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29042U) {
            setupWithViewPager(null);
            this.f29042U = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        C5971i c5971i;
        Drawable drawable;
        for (int i = 0; i < this.f29046i.getChildCount(); i++) {
            View childAt = this.f29046i.getChildAt(i);
            if ((childAt instanceof C5971i) && (drawable = (c5971i = (C5971i) childAt).f29099o) != null) {
                drawable.setBounds(c5971i.getLeft(), c5971i.getTop(), c5971i.getRight(), c5971i.getBottom());
                c5971i.f29099o.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) AccessibilityNodeInfoCompat.b.m16277a(1, getTabCount(), false, 1).f38033a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iRound = Math.round(C4799a.m11020z(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iM11020z = this.f29063z;
            if (iM11020z <= 0) {
                iM11020z = (int) (size - C4799a.m11020z(getContext(), 56));
            }
            this.f29061x = iM11020z;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.f29027F;
            if (i3 == 0) {
                if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                    z = true;
                }
            } else if (i3 != 1) {
                if (i3 == 2) {
                    if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                        z = true;
                    }
                }
            } else if (childAt.getMeasuredWidth() != getMeasuredWidth()) {
                z = true;
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m12831p(LinearLayout.LayoutParams layoutParams) {
        if (this.f29027F == 1 && this.f29024C == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m12832q(boolean z) {
        for (int i = 0; i < this.f29046i.getChildCount(); i++) {
            View childAt = this.f29046i.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m12831p((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C4799a.m11003n0(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.f29028G != z) {
            this.f29028G = z;
            for (int i = 0; i < this.f29046i.getChildCount(); i++) {
                View childAt = this.f29046i.getChildAt(i);
                if (childAt instanceof C5971i) {
                    C5971i c5971i = (C5971i) childAt;
                    c5971i.setOrientation(!TabLayout.this.f29028G ? 1 : 0);
                    TextView textView = c5971i.f29097m;
                    if (textView == null && c5971i.f29098n == null) {
                        c5971i.m12847h(c5971i.f29092h, c5971i.f29093i);
                    } else {
                        c5971i.m12847h(textView, c5971i.f29098n);
                    }
                }
            }
            m12819d();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC5966d interfaceC5966d) {
        setOnTabSelectedListener((InterfaceC5965c) interfaceC5966d);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m12821f();
        this.f29036O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.f29055r != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f29055r = drawable;
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f29056s = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.f29026E != i) {
            this.f29026E = i;
            C5968f c5968f = this.f29046i;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            c5968f.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.f29046i.m12834b(i);
    }

    public void setTabGravity(int i) {
        if (this.f29024C != i) {
            this.f29024C = i;
            m12819d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f29053p != colorStateList) {
            this.f29053p = colorStateList;
            m12830o();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(AppCompatResources.m14706a(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.f29030I = i;
        if (i == 0) {
            this.f29032K = new TabIndicatorInterpolator();
        } else {
            if (i == 1) {
                this.f29032K = new ElasticTabIndicatorInterpolator();
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.f29029H = z;
        C5968f c5968f = this.f29046i;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        c5968f.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.f29027F) {
            this.f29027F = i;
            m12819d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f29054q != colorStateList) {
            this.f29054q = colorStateList;
            for (int i = 0; i < this.f29046i.getChildCount(); i++) {
                View childAt = this.f29046i.getChildAt(i);
                if (childAt instanceof C5971i) {
                    Context context = getContext();
                    int i2 = C5971i.f29090f;
                    ((C5971i) childAt).m12846g(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(AppCompatResources.m14706a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f29052o != colorStateList) {
            this.f29052o = colorStateList;
            m12830o();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter2 pagerAdapter2) {
        m12827l(pagerAdapter2, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.f29031J != z) {
            this.f29031J = z;
            for (int i = 0; i < this.f29046i.getChildCount(); i++) {
                View childAt = this.f29046i.getChildAt(i);
                if (childAt instanceof C5971i) {
                    Context context = getContext();
                    int i2 = C5971i.f29090f;
                    ((C5971i) childAt).m12846g(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m12829n(viewPager, true, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        m12817b(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(InterfaceC5965c interfaceC5965c) {
        InterfaceC5965c interfaceC5965c2 = this.f29033L;
        if (interfaceC5965c2 != null) {
            this.f29034M.remove(interfaceC5965c2);
        }
        this.f29033L = interfaceC5965c;
        if (interfaceC5965c == null || this.f29034M.contains(interfaceC5965c)) {
            return;
        }
        this.f29034M.add(interfaceC5965c);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017853), attributeSet, i);
        this.f29044g = new ArrayList<>();
        this.f29055r = new GradientDrawable();
        this.f29056s = 0;
        this.f29061x = Integer.MAX_VALUE;
        this.f29034M = new ArrayList<>();
        this.f29043V = new Pools3(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C5968f c5968f = new C5968f(context2);
        this.f29046i = c5968f;
        super.addView(c5968f, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24741M, i, 2132017853, 23);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
            materialShapeDrawable.m11381q(ColorStateList.valueOf(colorDrawable.getColor()));
            materialShapeDrawable.f25574h.f25595b = new ElevationOverlayProvider(context2);
            materialShapeDrawable.m11365A();
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            materialShapeDrawable.m11380p(getElevation());
            setBackground(materialShapeDrawable);
        }
        setSelectedTabIndicator(C4799a.m10963N(context2, typedArrayM11347d, 5));
        setSelectedTabIndicatorColor(typedArrayM11347d.getColor(8, 0));
        c5968f.m12834b(typedArrayM11347d.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayM11347d.getInt(10, 0));
        setTabIndicatorFullWidth(typedArrayM11347d.getBoolean(9, true));
        setTabIndicatorAnimationMode(typedArrayM11347d.getInt(7, 0));
        int dimensionPixelSize = typedArrayM11347d.getDimensionPixelSize(16, 0);
        this.f29050m = dimensionPixelSize;
        this.f29049l = dimensionPixelSize;
        this.f29048k = dimensionPixelSize;
        this.f29047j = dimensionPixelSize;
        this.f29047j = typedArrayM11347d.getDimensionPixelSize(19, dimensionPixelSize);
        this.f29048k = typedArrayM11347d.getDimensionPixelSize(20, this.f29048k);
        this.f29049l = typedArrayM11347d.getDimensionPixelSize(18, this.f29049l);
        this.f29050m = typedArrayM11347d.getDimensionPixelSize(17, this.f29050m);
        int resourceId = typedArrayM11347d.getResourceId(23, 2132017606);
        this.f29051n = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C7463b.f34406v);
        try {
            this.f29058u = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.f29052o = C4799a.m10961L(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayM11347d.hasValue(24)) {
                this.f29052o = C4799a.m10961L(context2, typedArrayM11347d, 24);
            }
            if (typedArrayM11347d.hasValue(22)) {
                this.f29052o = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayM11347d.getColor(22, 0), this.f29052o.getDefaultColor()});
            }
            this.f29053p = C4799a.m10961L(context2, typedArrayM11347d, 3);
            this.f29057t = C4799a.m10999l0(typedArrayM11347d.getInt(4, -1), null);
            this.f29054q = C4799a.m10961L(context2, typedArrayM11347d, 21);
            this.f29025D = typedArrayM11347d.getInt(6, 300);
            this.f29062y = typedArrayM11347d.getDimensionPixelSize(14, -1);
            this.f29063z = typedArrayM11347d.getDimensionPixelSize(13, -1);
            this.f29060w = typedArrayM11347d.getResourceId(0, 0);
            this.f29023B = typedArrayM11347d.getDimensionPixelSize(1, 0);
            this.f29027F = typedArrayM11347d.getInt(15, 1);
            this.f29024C = typedArrayM11347d.getInt(2, 0);
            this.f29028G = typedArrayM11347d.getBoolean(12, false);
            this.f29031J = typedArrayM11347d.getBoolean(25, false);
            typedArrayM11347d.recycle();
            Resources resources = getResources();
            this.f29059v = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.f29022A = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            m12819d();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m12817b(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(AppCompatResources.m14707b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m12817b(view);
    }
}
