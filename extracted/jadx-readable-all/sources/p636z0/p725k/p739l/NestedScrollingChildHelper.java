package p636z0.p725k.p739l;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: z0.k.l.h, reason: use source file name */
/* JADX INFO: compiled from: NestedScrollingChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollingChildHelper {

    /* JADX INFO: renamed from: a */
    public ViewParent f38062a;

    /* JADX INFO: renamed from: b */
    public ViewParent f38063b;

    /* JADX INFO: renamed from: c */
    public final View f38064c;

    /* JADX INFO: renamed from: d */
    public boolean f38065d;

    /* JADX INFO: renamed from: e */
    public int[] f38066e;

    public NestedScrollingChildHelper(View view) {
        this.f38064c = view;
    }

    /* JADX INFO: renamed from: a */
    public boolean m16291a(float f, float f2, boolean z) {
        ViewParent viewParentM16297g;
        if (!this.f38065d || (viewParentM16297g = m16297g(0)) == null) {
            return false;
        }
        try {
            return viewParentM16297g.onNestedFling(this.f38064c, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentM16297g + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m16292b(float f, float f2) {
        ViewParent viewParentM16297g;
        if (!this.f38065d || (viewParentM16297g = m16297g(0)) == null) {
            return false;
        }
        try {
            return viewParentM16297g.onNestedPreFling(this.f38064c, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentM16297g + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m16293c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM16297g;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f38065d || (viewParentM16297g = m16297g(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f38064c.getLocationInWindow(iArr2);
                i4 = iArr2[0];
                i5 = iArr2[1];
            } else {
                i4 = 0;
                i5 = 0;
            }
            if (iArr == null) {
                if (this.f38066e == null) {
                    this.f38066e = new int[2];
                }
                iArr3 = this.f38066e;
            } else {
                iArr3 = iArr;
            }
            iArr3[0] = 0;
            iArr3[1] = 0;
            View view = this.f38064c;
            if (viewParentM16297g instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) viewParentM16297g).mo174o(view, i, i2, iArr3, i3);
            } else if (i3 == 0) {
                try {
                    viewParentM16297g.onNestedPreScroll(view, i, i2, iArr3);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM16297g + " does not implement interface method onNestedPreScroll", e);
                }
            }
            if (iArr2 != null) {
                this.f38064c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i4;
                iArr2[1] = iArr2[1] - i5;
            }
            if (iArr3[0] != 0 || iArr3[1] != 0) {
                return true;
            }
        } else if (iArr2 != null) {
            iArr2[0] = 0;
            iArr2[1] = 0;
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public void m16294d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m16296f(i, i2, i3, i4, null, i5, iArr2);
    }

    /* JADX INFO: renamed from: e */
    public boolean m16295e(int i, int i2, int i3, int i4, int[] iArr) {
        return m16296f(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16296f(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM16297g;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f38065d || (viewParentM16297g = m16297g(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f38064c.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f38066e == null) {
                this.f38066e = new int[2];
            }
            int[] iArr4 = this.f38066e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f38064c;
        if (viewParentM16297g instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParentM16297g).mo169j(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (viewParentM16297g instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) viewParentM16297g).mo170k(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    viewParentM16297g.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM16297g + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            this.f38064c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final ViewParent m16297g(int i) {
        if (i == 0) {
            return this.f38062a;
        }
        if (i != 1) {
            return null;
        }
        return this.f38063b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m16298h(int i) {
        return m16297g(i) != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m16299i(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (m16297g(i2) != null) {
            return true;
        }
        if (this.f38065d) {
            View view = this.f38064c;
            for (ViewParent parent = this.f38064c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f38064c;
                boolean z = parent instanceof NestedScrollingParent2;
                if (z) {
                    zOnStartNestedScroll = ((NestedScrollingParent2) parent).mo171l(view, view2, i, i2);
                } else if (i2 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view, view2, i);
                    } catch (AbstractMethodError e) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        zOnStartNestedScroll = false;
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i2 == 0) {
                        this.f38062a = parent;
                    } else if (i2 == 1) {
                        this.f38063b = parent;
                    }
                    View view3 = this.f38064c;
                    if (z) {
                        ((NestedScrollingParent2) parent).mo172m(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m16300j(int i) {
        ViewParent viewParentM16297g = m16297g(i);
        if (viewParentM16297g != null) {
            View view = this.f38064c;
            if (viewParentM16297g instanceof NestedScrollingParent2) {
                ((NestedScrollingParent2) viewParentM16297g).mo173n(view, i);
            } else if (i == 0) {
                try {
                    viewParentM16297g.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM16297g + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f38062a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f38063b = null;
            }
        }
    }
}
