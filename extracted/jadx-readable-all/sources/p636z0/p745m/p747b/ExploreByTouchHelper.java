package p636z0.p745m.p747b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p691g.SparseArrayCompat;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeProviderCompat;

/* JADX INFO: renamed from: z0.m.b.a, reason: use source file name */
/* JADX INFO: compiled from: ExploreByTouchHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: d */
    public static final Rect f38151d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: e */
    public static final FocusStrategy<AccessibilityNodeInfoCompat> f38152e = new a();

    /* JADX INFO: renamed from: f */
    public static final FocusStrategy2<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> f38153f = new b();

    /* JADX INFO: renamed from: k */
    public final AccessibilityManager f38158k;

    /* JADX INFO: renamed from: l */
    public final View f38159l;

    /* JADX INFO: renamed from: m */
    public c f38160m;

    /* JADX INFO: renamed from: g */
    public final Rect f38154g = new Rect();

    /* JADX INFO: renamed from: h */
    public final Rect f38155h = new Rect();

    /* JADX INFO: renamed from: i */
    public final Rect f38156i = new Rect();

    /* JADX INFO: renamed from: j */
    public final int[] f38157j = new int[2];

    /* JADX INFO: renamed from: n */
    public int f38161n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: o */
    public int f38162o = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public int f38163p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: z0.m.b.a$a */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class a implements FocusStrategy<AccessibilityNodeInfoCompat> {
        /* JADX INFO: renamed from: a */
        public void m16373a(Object obj, Rect rect) {
            ((AccessibilityNodeInfoCompat) obj).f38018b.getBoundsInParent(rect);
        }
    }

    /* JADX INFO: renamed from: z0.m.b.a$b */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class b implements FocusStrategy2<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
    }

    /* JADX INFO: renamed from: z0.m.b.a$c */
    /* JADX INFO: compiled from: ExploreByTouchHelper.java */
    public class c extends AccessibilityNodeProviderCompat {
        public c() {
        }

        @Override // p636z0.p725k.p739l.p740b0.AccessibilityNodeProviderCompat
        /* JADX INFO: renamed from: a */
        public AccessibilityNodeInfoCompat mo16279a(int i) {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.m16369o(i).f38018b));
        }

        @Override // p636z0.p725k.p739l.p740b0.AccessibilityNodeProviderCompat
        /* JADX INFO: renamed from: b */
        public AccessibilityNodeInfoCompat mo16280b(int i) {
            int i2 = i == 2 ? ExploreByTouchHelper.this.f38161n : ExploreByTouchHelper.this.f38162o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.m16369o(i2).f38018b));
        }

        @Override // p636z0.p725k.p739l.p740b0.AccessibilityNodeProviderCompat
        /* JADX INFO: renamed from: c */
        public boolean mo16281c(int i, int i2, Bundle bundle) {
            int i3;
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            if (i == -1) {
                View view = exploreByTouchHelper.f38159l;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                return view.performAccessibilityAction(i2, bundle);
            }
            boolean z = true;
            if (i2 == 1) {
                return exploreByTouchHelper.m16370t(i);
            }
            if (i2 == 2) {
                return exploreByTouchHelper.m16366k(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? exploreByTouchHelper.mo12779p(i, i2, bundle) : exploreByTouchHelper.m16365j(i);
            }
            if (exploreByTouchHelper.f38158k.isEnabled() && exploreByTouchHelper.f38158k.isTouchExplorationEnabled() && (i3 = exploreByTouchHelper.f38161n) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    exploreByTouchHelper.m16365j(i3);
                }
                exploreByTouchHelper.f38161n = i;
                exploreByTouchHelper.f38159l.invalidate();
                exploreByTouchHelper.m16371u(i, 32768);
            } else {
                z = false;
            }
            return z;
        }
    }

    public ExploreByTouchHelper(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f38159l = view;
        this.f38158k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
    /* JADX INFO: renamed from: b */
    public AccessibilityNodeProviderCompat mo16219b(View view) {
        if (this.f38160m == null) {
            this.f38160m = new c();
        }
        return this.f38160m;
    }

    @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
    /* JADX INFO: renamed from: c */
    public void mo381c(View view, AccessibilityEvent accessibilityEvent) {
        this.f37977b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
    /* JADX INFO: renamed from: d */
    public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
        mo12780q(accessibilityNodeInfoCompat);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m16365j(int i) {
        if (this.f38161n != i) {
            return false;
        }
        this.f38161n = Integer.MIN_VALUE;
        this.f38159l.invalidate();
        m16371u(i, 65536);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m16366k(int i) {
        if (this.f38162o != i) {
            return false;
        }
        this.f38162o = Integer.MIN_VALUE;
        mo12782s(i, false);
        m16371u(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final AccessibilityNodeInfoCompat m16367l(int i) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatM16259n = AccessibilityNodeInfoCompat.m16259n();
        accessibilityNodeInfoCompatM16259n.f38018b.setEnabled(true);
        accessibilityNodeInfoCompatM16259n.f38018b.setFocusable(true);
        accessibilityNodeInfoCompatM16259n.f38018b.setClassName("android.view.View");
        Rect rect = f38151d;
        accessibilityNodeInfoCompatM16259n.f38018b.setBoundsInParent(rect);
        accessibilityNodeInfoCompatM16259n.f38018b.setBoundsInScreen(rect);
        View view = this.f38159l;
        accessibilityNodeInfoCompatM16259n.f38019c = -1;
        accessibilityNodeInfoCompatM16259n.f38018b.setParent(view);
        mo12781r(i, accessibilityNodeInfoCompatM16259n);
        if (accessibilityNodeInfoCompatM16259n.m16266i() == null && accessibilityNodeInfoCompatM16259n.m16264g() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatM16259n.f38018b.getBoundsInParent(this.f38155h);
        if (this.f38155h.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoCompatM16259n.f38018b.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompatM16259n.f38018b.setPackageName(this.f38159l.getContext().getPackageName());
        View view2 = this.f38159l;
        accessibilityNodeInfoCompatM16259n.f38020d = i;
        accessibilityNodeInfoCompatM16259n.f38018b.setSource(view2, i);
        boolean z = false;
        if (this.f38161n == i) {
            accessibilityNodeInfoCompatM16259n.f38018b.setAccessibilityFocused(true);
            accessibilityNodeInfoCompatM16259n.f38018b.addAction(128);
        } else {
            accessibilityNodeInfoCompatM16259n.f38018b.setAccessibilityFocused(false);
            accessibilityNodeInfoCompatM16259n.f38018b.addAction(64);
        }
        boolean z2 = this.f38162o == i;
        if (z2) {
            accessibilityNodeInfoCompatM16259n.f38018b.addAction(2);
        } else if (accessibilityNodeInfoCompatM16259n.m16268k()) {
            accessibilityNodeInfoCompatM16259n.f38018b.addAction(1);
        }
        accessibilityNodeInfoCompatM16259n.f38018b.setFocused(z2);
        this.f38159l.getLocationOnScreen(this.f38157j);
        accessibilityNodeInfoCompatM16259n.f38018b.getBoundsInScreen(this.f38154g);
        if (this.f38154g.equals(rect)) {
            accessibilityNodeInfoCompatM16259n.f38018b.getBoundsInParent(this.f38154g);
            if (accessibilityNodeInfoCompatM16259n.f38019c != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatM16259n2 = AccessibilityNodeInfoCompat.m16259n();
                for (int i2 = accessibilityNodeInfoCompatM16259n.f38019c; i2 != -1; i2 = accessibilityNodeInfoCompatM16259n2.f38019c) {
                    View view3 = this.f38159l;
                    accessibilityNodeInfoCompatM16259n2.f38019c = -1;
                    accessibilityNodeInfoCompatM16259n2.f38018b.setParent(view3, -1);
                    accessibilityNodeInfoCompatM16259n2.f38018b.setBoundsInParent(f38151d);
                    mo12781r(i2, accessibilityNodeInfoCompatM16259n2);
                    accessibilityNodeInfoCompatM16259n2.f38018b.getBoundsInParent(this.f38155h);
                    Rect rect2 = this.f38154g;
                    Rect rect3 = this.f38155h;
                    rect2.offset(rect3.left, rect3.top);
                }
                accessibilityNodeInfoCompatM16259n2.f38018b.recycle();
            }
            this.f38154g.offset(this.f38157j[0] - this.f38159l.getScrollX(), this.f38157j[1] - this.f38159l.getScrollY());
        }
        if (this.f38159l.getLocalVisibleRect(this.f38156i)) {
            this.f38156i.offset(this.f38157j[0] - this.f38159l.getScrollX(), this.f38157j[1] - this.f38159l.getScrollY());
            if (this.f38154g.intersect(this.f38156i)) {
                accessibilityNodeInfoCompatM16259n.f38018b.setBoundsInScreen(this.f38154g);
                Rect rect4 = this.f38154g;
                if (rect4 != null && !rect4.isEmpty() && this.f38159l.getWindowVisibility() == 0) {
                    Object parent = this.f38159l.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            if (parent == null) {
                                break;
                            }
                            z = true;
                            break;
                        }
                        View view4 = (View) parent;
                        if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                            break;
                        }
                        parent = view4.getParent();
                    }
                }
                if (z) {
                    accessibilityNodeInfoCompatM16259n.f38018b.setVisibleToUser(true);
                }
            }
        }
        return accessibilityNodeInfoCompatM16259n;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo12778m(List<Integer> list);

    /* JADX WARN: Code duplicated, block: B:95:0x01ae  */
    /* JADX INFO: renamed from: n */
    public final boolean m16368n(int i, Rect rect) {
        Object obj;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int iM15618i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        mo12778m(arrayList);
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sparseArrayCompat.m15619j(((Integer) arrayList.get(i2)).intValue(), m16367l(((Integer) arrayList.get(i2)).intValue()));
        }
        int i3 = this.f38162o;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = i3 == Integer.MIN_VALUE ? null : (AccessibilityNodeInfoCompat) sparseArrayCompat.m15616e(i3);
        int i4 = -1;
        if (i == 1 || i == 2) {
            View view = this.f38159l;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            boolean z2 = view.getLayoutDirection() == 1;
            FocusStrategy2<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> focusStrategy2 = f38153f;
            FocusStrategy<AccessibilityNodeInfoCompat> focusStrategy = f38152e;
            Objects.requireNonNull((b) focusStrategy2);
            int iM15620k = sparseArrayCompat.m15620k();
            ArrayList arrayList2 = new ArrayList(iM15620k);
            for (int i5 = 0; i5 < iM15620k; i5++) {
                if (sparseArrayCompat.f36669g) {
                    sparseArrayCompat.m15615d();
                }
                arrayList2.add((AccessibilityNodeInfoCompat) sparseArrayCompat.f36671i[i5]);
            }
            Collections.sort(arrayList2, new FocusStrategy3(z2, focusStrategy));
            if (i == 1) {
                int size = arrayList2.size();
                if (accessibilityNodeInfoCompat2 != null) {
                    size = arrayList2.indexOf(accessibilityNodeInfoCompat2);
                }
                int i6 = size - 1;
                if (i6 >= 0) {
                    obj = arrayList2.get(i6);
                } else {
                    obj = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (accessibilityNodeInfoCompat2 == null ? -1 : arrayList2.lastIndexOf(accessibilityNodeInfoCompat2)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i7 = this.f38162o;
            if (i7 != Integer.MIN_VALUE) {
                m16369o(i7).f38018b.getBoundsInParent(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.f38159l;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            FocusStrategy2<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> focusStrategy3 = f38153f;
            FocusStrategy<AccessibilityNodeInfoCompat> focusStrategy4 = f38152e;
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            Objects.requireNonNull((b) focusStrategy3);
            int iM15620k2 = sparseArrayCompat.m15620k();
            Rect rect4 = new Rect();
            accessibilityNodeInfoCompat = null;
            for (int i8 = 0; i8 < iM15620k2; i8++) {
                if (sparseArrayCompat.f36669g) {
                    sparseArrayCompat.m15615d();
                }
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = (AccessibilityNodeInfoCompat) sparseArrayCompat.f36671i[i8];
                if (accessibilityNodeInfoCompat3 != accessibilityNodeInfoCompat2) {
                    ((a) focusStrategy4).m16373a(accessibilityNodeInfoCompat3, rect4);
                    if (C8162a.m16034E(rect2, rect4, i)) {
                        if (C8162a.m16034E(rect2, rect3, i) && !C8162a.m16056a(i, rect2, rect4, rect3)) {
                            if (!C8162a.m16056a(i, rect2, rect3, rect4)) {
                                int iM16035F = C8162a.m16035F(i, rect2, rect4);
                                int iM16036G = C8162a.m16036G(i, rect2, rect4);
                                int i9 = (iM16036G * iM16036G) + (iM16035F * 13 * iM16035F);
                                int iM16035F2 = C8162a.m16035F(i, rect2, rect3);
                                int iM16036G2 = C8162a.m16036G(i, rect2, rect3);
                                if (i9 < (iM16036G2 * iM16036G2) + (iM16035F2 * 13 * iM16035F2)) {
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        rect3.set(rect4);
                        accessibilityNodeInfoCompat = accessibilityNodeInfoCompat3;
                    }
                }
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat4 = accessibilityNodeInfoCompat;
        if (accessibilityNodeInfoCompat4 == null) {
            iM15618i = Integer.MIN_VALUE;
        } else {
            if (sparseArrayCompat.f36669g) {
                sparseArrayCompat.m15615d();
            }
            for (int i10 = 0; i10 < sparseArrayCompat.f36672j; i10++) {
                if (sparseArrayCompat.f36671i[i10] == accessibilityNodeInfoCompat4) {
                    i4 = i10;
                    break;
                }
            }
            iM15618i = sparseArrayCompat.m15618i(i4);
        }
        return m16370t(iM15618i);
    }

    /* JADX INFO: renamed from: o */
    public AccessibilityNodeInfoCompat m16369o(int i) {
        if (i != -1) {
            return m16367l(i);
        }
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(this.f38159l);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfoObtain);
        View view = this.f38159l;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo12778m(arrayList);
        if (accessibilityNodeInfoCompat.m16263e() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            accessibilityNodeInfoCompat.f38018b.addChild(this.f38159l, ((Integer) arrayList.get(i2)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    /* JADX INFO: renamed from: p */
    public abstract boolean mo12779p(int i, int i2, Bundle bundle);

    /* JADX INFO: renamed from: q */
    public void mo12780q(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    /* JADX INFO: renamed from: r */
    public abstract void mo12781r(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    /* JADX INFO: renamed from: s */
    public void mo12782s(int i, boolean z) {
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16370t(int i) {
        int i2;
        if ((!this.f38159l.isFocused() && !this.f38159l.requestFocus()) || (i2 = this.f38162o) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m16366k(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f38162o = i;
        mo12782s(i, true);
        m16371u(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m16371u(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f38158k.isEnabled() || (parent = this.f38159l.getParent()) == null) {
            return false;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatM16369o = m16369o(i);
            accessibilityEventObtain.getText().add(accessibilityNodeInfoCompatM16369o.m16266i());
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfoCompatM16369o.m16264g());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfoCompatM16369o.m16269l());
            accessibilityEventObtain.setPassword(accessibilityNodeInfoCompatM16369o.f38018b.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfoCompatM16369o.f38018b.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfoCompatM16369o.f38018b.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfoCompatM16369o.f38018b.getClassName());
            accessibilityEventObtain.setSource(this.f38159l, i);
            accessibilityEventObtain.setPackageName(this.f38159l.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            this.f38159l.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        return parent.requestSendAccessibilityEvent(this.f38159l, accessibilityEventObtain);
    }

    /* JADX INFO: renamed from: v */
    public final void m16372v(int i) {
        int i2 = this.f38163p;
        if (i2 == i) {
            return;
        }
        this.f38163p = i;
        m16371u(i, 128);
        m16371u(i2, 256);
    }
}
