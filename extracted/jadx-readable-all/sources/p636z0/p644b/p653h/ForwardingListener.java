package p636z0.p644b.p653h;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p636z0.p644b.p651g.p652i.ShowableListMenu;

/* JADX INFO: renamed from: z0.b.h.h0, reason: use source file name */
/* JADX INFO: compiled from: ForwardingListener.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: f */
    public final float f35037f;

    /* JADX INFO: renamed from: g */
    public final int f35038g;

    /* JADX INFO: renamed from: h */
    public final int f35039h;

    /* JADX INFO: renamed from: i */
    public final View f35040i;

    /* JADX INFO: renamed from: j */
    public Runnable f35041j;

    /* JADX INFO: renamed from: k */
    public Runnable f35042k;

    /* JADX INFO: renamed from: l */
    public boolean f35043l;

    /* JADX INFO: renamed from: m */
    public int f35044m;

    /* JADX INFO: renamed from: n */
    public final int[] f35045n = new int[2];

    /* JADX INFO: renamed from: z0.b.h.h0$a */
    /* JADX INFO: compiled from: ForwardingListener.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = ForwardingListener.this.f35040i.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.h0$b */
    /* JADX INFO: compiled from: ForwardingListener.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ForwardingListener forwardingListener = ForwardingListener.this;
            forwardingListener.m14893a();
            View view = forwardingListener.f35040i;
            if (view.isEnabled() && !view.isLongClickable() && forwardingListener.mo148c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                forwardingListener.f35043l = true;
            }
        }
    }

    public ForwardingListener(View view) {
        this.f35040i = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f35037f = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f35038g = tapTimeout;
        this.f35039h = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX INFO: renamed from: a */
    public final void m14893a() {
        Runnable runnable = this.f35042k;
        if (runnable != null) {
            this.f35040i.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f35041j;
        if (runnable2 != null) {
            this.f35040i.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract ShowableListMenu mo147b();

    /* JADX INFO: renamed from: c */
    public boolean mo148c() {
        ShowableListMenu showableListMenuMo147b = mo147b();
        if (showableListMenuMo147b == null || showableListMenuMo147b.mo14749a()) {
            return true;
        }
        showableListMenuMo147b.mo14750b();
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo14849d() {
        ShowableListMenu showableListMenuMo147b = mo147b();
        if (showableListMenuMo147b == null || !showableListMenuMo147b.mo14749a()) {
            return true;
        }
        showableListMenuMo147b.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d4  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        DropDownListView dropDownListView;
        boolean z4 = this.f35043l;
        if (z4) {
            View view2 = this.f35040i;
            ShowableListMenu showableListMenuMo147b = mo147b();
            if (showableListMenuMo147b == null || !showableListMenuMo147b.mo14749a() || (dropDownListView = (DropDownListView) showableListMenuMo147b.mo14755i()) == null || !dropDownListView.isShown()) {
                z3 = false;
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f35045n;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                int[] iArr2 = this.f35045n;
                dropDownListView.getLocationOnScreen(iArr2);
                motionEventObtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                boolean zM14890b = dropDownListView.m14890b(motionEventObtainNoHistory, this.f35044m);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z5 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zM14890b && z5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
            }
            z2 = z3 || !mo14849d();
        } else {
            View view3 = this.f35040i;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f35044m = motionEvent.getPointerId(0);
                    if (this.f35041j == null) {
                        this.f35041j = new a();
                    }
                    view3.postDelayed(this.f35041j, this.f35038g);
                    if (this.f35042k == null) {
                        this.f35042k = new b();
                    }
                    view3.postDelayed(this.f35042k, this.f35039h);
                } else if (actionMasked2 == 1) {
                    m14893a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f35044m);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f35037f;
                        float f2 = -f;
                        if (!(x >= f2 && y >= f2 && x < ((float) (view3.getRight() - view3.getLeft())) + f && y < ((float) (view3.getBottom() - view3.getTop())) + f)) {
                            m14893a();
                            view3.getParent().requestDisallowInterceptTouchEvent(true);
                            z = true;
                        }
                    }
                } else if (actionMasked2 == 3) {
                    m14893a();
                }
                z = false;
            } else {
                z = false;
            }
            z2 = z && mo148c();
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f35040i.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f35043l = z2;
        return z2 || z4;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f35043l = false;
        this.f35044m = -1;
        Runnable runnable = this.f35041j;
        if (runnable != null) {
            this.f35040i.removeCallbacks(runnable);
        }
    }
}
