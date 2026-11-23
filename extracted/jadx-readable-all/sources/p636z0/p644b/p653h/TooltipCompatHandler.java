package p636z0.p644b.p653h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewConfigurationCompat;

/* JADX INFO: renamed from: z0.b.h.a1, reason: use source file name */
/* JADX INFO: compiled from: TooltipCompatHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: f */
    public static TooltipCompatHandler f34952f;

    /* JADX INFO: renamed from: g */
    public static TooltipCompatHandler f34953g;

    /* JADX INFO: renamed from: h */
    public final View f34954h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f34955i;

    /* JADX INFO: renamed from: j */
    public final int f34956j;

    /* JADX INFO: renamed from: k */
    public final Runnable f34957k = new a();

    /* JADX INFO: renamed from: l */
    public final Runnable f34958l = new b();

    /* JADX INFO: renamed from: m */
    public int f34959m;

    /* JADX INFO: renamed from: n */
    public int f34960n;

    /* JADX INFO: renamed from: o */
    public TooltipPopup f34961o;

    /* JADX INFO: renamed from: p */
    public boolean f34962p;

    /* JADX INFO: renamed from: z0.b.h.a1$a */
    /* JADX INFO: compiled from: TooltipCompatHandler.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TooltipCompatHandler.this.m14842d(false);
        }
    }

    /* JADX INFO: renamed from: z0.b.h.a1$b */
    /* JADX INFO: compiled from: TooltipCompatHandler.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TooltipCompatHandler.this.m14841b();
        }
    }

    public TooltipCompatHandler(View view, CharSequence charSequence) {
        this.f34954h = view;
        this.f34955i = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = ViewConfigurationCompat.f38091a;
        this.f34956j = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        m14840a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: c */
    public static void m14839c(TooltipCompatHandler tooltipCompatHandler) {
        TooltipCompatHandler tooltipCompatHandler2 = f34952f;
        if (tooltipCompatHandler2 != null) {
            tooltipCompatHandler2.f34954h.removeCallbacks(tooltipCompatHandler2.f34957k);
        }
        f34952f = tooltipCompatHandler;
        if (tooltipCompatHandler != null) {
            tooltipCompatHandler.f34954h.postDelayed(tooltipCompatHandler.f34957k, ViewConfiguration.getLongPressTimeout());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14840a() {
        this.f34959m = Integer.MAX_VALUE;
        this.f34960n = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: b */
    public void m14841b() {
        if (f34953g == this) {
            f34953g = null;
            TooltipPopup tooltipPopup = this.f34961o;
            if (tooltipPopup != null) {
                tooltipPopup.m14843a();
                this.f34961o = null;
                m14840a();
                this.f34954h.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f34952f == this) {
            m14839c(null);
        }
        this.f34954h.removeCallbacks(this.f34958l);
    }

    /* JADX INFO: renamed from: d */
    public void m14842d(boolean z) {
        int height;
        int i;
        long j2;
        int longPressTimeout;
        long j3;
        View view = this.f34954h;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (view.isAttachedToWindow()) {
            m14839c(null);
            TooltipCompatHandler tooltipCompatHandler = f34953g;
            if (tooltipCompatHandler != null) {
                tooltipCompatHandler.m14841b();
            }
            f34953g = this;
            this.f34962p = z;
            TooltipPopup tooltipPopup = new TooltipPopup(this.f34954h.getContext());
            this.f34961o = tooltipPopup;
            View view2 = this.f34954h;
            int width = this.f34959m;
            int i2 = this.f34960n;
            boolean z2 = this.f34962p;
            CharSequence charSequence = this.f34955i;
            if (tooltipPopup.f34969b.getParent() != null) {
                tooltipPopup.m14843a();
            }
            tooltipPopup.f34970c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = tooltipPopup.f34971d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = tooltipPopup.f34968a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                width = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = tooltipPopup.f34968a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i2 + dimensionPixelOffset2;
                i = i2 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = tooltipPopup.f34968a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(tooltipPopup.f34972e);
                Rect rect = tooltipPopup.f34972e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = tooltipPopup.f34968a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    tooltipPopup.f34972e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(tooltipPopup.f34974g);
                view2.getLocationOnScreen(tooltipPopup.f34973f);
                int[] iArr = tooltipPopup.f34973f;
                int i3 = iArr[0];
                int[] iArr2 = tooltipPopup.f34974g;
                iArr[0] = i3 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                tooltipPopup.f34969b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = tooltipPopup.f34969b.getMeasuredHeight();
                int[] iArr3 = tooltipPopup.f34973f;
                int i4 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i5 = iArr3[1] + height + dimensionPixelOffset3;
                if (z2) {
                    if (i4 >= 0) {
                        layoutParams.y = i4;
                    } else {
                        layoutParams.y = i5;
                    }
                } else if (measuredHeight + i5 <= tooltipPopup.f34972e.height()) {
                    layoutParams.y = i5;
                } else {
                    layoutParams.y = i4;
                }
            }
            ((WindowManager) tooltipPopup.f34968a.getSystemService("window")).addView(tooltipPopup.f34969b, tooltipPopup.f34971d);
            this.f34954h.addOnAttachStateChangeListener(this);
            if (this.f34962p) {
                j3 = 2500;
            } else {
                if ((this.f34954h.getWindowSystemUiVisibility() & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - ((long) longPressTimeout);
            }
            this.f34954h.removeCallbacks(this.f34958l);
            this.f34954h.postDelayed(this.f34958l, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f34961o != null && this.f34962p) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f34954h.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m14840a();
                m14841b();
            }
        } else if (this.f34954h.isEnabled() && this.f34961o == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f34959m) > this.f34956j || Math.abs(y - this.f34960n) > this.f34956j) {
                this.f34959m = x;
                this.f34960n = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m14839c(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f34959m = view.getWidth() / 2;
        this.f34960n = view.getHeight() / 2;
        m14842d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m14841b();
    }
}
