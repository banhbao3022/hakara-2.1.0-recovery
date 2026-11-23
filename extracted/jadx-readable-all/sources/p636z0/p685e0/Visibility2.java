package p636z0.p685e0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e0.b0, reason: use source file name */
/* JADX INFO: compiled from: Visibility.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class Visibility2 extends Transition3 {

    /* JADX INFO: renamed from: D */
    public static final String[] f36407D = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: E */
    public int f36408E;

    /* JADX INFO: renamed from: z0.e0.b0$a */
    /* JADX INFO: compiled from: Visibility.java */
    public static class a extends AnimatorListenerAdapter implements Transition3.d {

        /* JADX INFO: renamed from: a */
        public final View f36409a;

        /* JADX INFO: renamed from: b */
        public final int f36410b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f36411c;

        /* JADX INFO: renamed from: d */
        public final boolean f36412d;

        /* JADX INFO: renamed from: e */
        public boolean f36413e;

        /* JADX INFO: renamed from: f */
        public boolean f36414f = false;

        public a(View view, int i, boolean z) {
            this.f36409a = view;
            this.f36410b = i;
            this.f36411c = (ViewGroup) view.getParent();
            this.f36412d = z;
            m15469g(true);
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: a */
        public void mo12473a(Transition3 transition3) {
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: b */
        public void mo12474b(Transition3 transition3) {
            m15469g(false);
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: c */
        public void mo12475c(Transition3 transition3) {
            m15468f();
            transition3.mo15518z(this);
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: d */
        public void mo12476d(Transition3 transition3) {
        }

        @Override // p636z0.p685e0.Transition3.d
        /* JADX INFO: renamed from: e */
        public void mo12477e(Transition3 transition3) {
            m15469g(true);
        }

        /* JADX INFO: renamed from: f */
        public final void m15468f() {
            if (!this.f36414f) {
                ViewUtils6.f36500a.mo15539f(this.f36409a, this.f36410b);
                ViewGroup viewGroup = this.f36411c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m15469g(false);
        }

        /* JADX INFO: renamed from: g */
        public final void m15469g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f36412d || this.f36413e == z || (viewGroup = this.f36411c) == null) {
                return;
            }
            this.f36413e = z;
            ViewGroupUtils.m15529a(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f36414f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m15468f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f36414f) {
                return;
            }
            ViewUtils6.f36500a.mo15539f(this.f36409a, this.f36410b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f36414f) {
                return;
            }
            ViewUtils6.f36500a.mo15539f(this.f36409a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: z0.e0.b0$b */
    /* JADX INFO: compiled from: Visibility.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public boolean f36415a;

        /* JADX INFO: renamed from: b */
        public boolean f36416b;

        /* JADX INFO: renamed from: c */
        public int f36417c;

        /* JADX INFO: renamed from: d */
        public int f36418d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f36419e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f36420f;
    }

    public Visibility2() {
        this.f36408E = 3;
    }

    /* JADX INFO: renamed from: O */
    public final void m15462O(TransitionValues transitionValues) {
        transitionValues.f36492a.put("android:visibility:visibility", Integer.valueOf(transitionValues.f36493b.getVisibility()));
        transitionValues.f36492a.put("android:visibility:parent", transitionValues.f36493b.getParent());
        int[] iArr = new int[2];
        transitionValues.f36493b.getLocationOnScreen(iArr);
        transitionValues.f36492a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: P */
    public final b m15463P(TransitionValues transitionValues, TransitionValues transitionValues2) {
        b bVar = new b();
        bVar.f36415a = false;
        bVar.f36416b = false;
        if (transitionValues == null || !transitionValues.f36492a.containsKey("android:visibility:visibility")) {
            bVar.f36417c = -1;
            bVar.f36419e = null;
        } else {
            bVar.f36417c = ((Integer) transitionValues.f36492a.get("android:visibility:visibility")).intValue();
            bVar.f36419e = (ViewGroup) transitionValues.f36492a.get("android:visibility:parent");
        }
        if (transitionValues2 == null || !transitionValues2.f36492a.containsKey("android:visibility:visibility")) {
            bVar.f36418d = -1;
            bVar.f36420f = null;
        } else {
            bVar.f36418d = ((Integer) transitionValues2.f36492a.get("android:visibility:visibility")).intValue();
            bVar.f36420f = (ViewGroup) transitionValues2.f36492a.get("android:visibility:parent");
        }
        if (transitionValues != null && transitionValues2 != null) {
            int i = bVar.f36417c;
            int i2 = bVar.f36418d;
            if (i == i2 && bVar.f36419e == bVar.f36420f) {
                return bVar;
            }
            if (i != i2) {
                if (i == 0) {
                    bVar.f36416b = false;
                    bVar.f36415a = true;
                } else if (i2 == 0) {
                    bVar.f36416b = true;
                    bVar.f36415a = true;
                }
            } else if (bVar.f36420f == null) {
                bVar.f36416b = false;
                bVar.f36415a = true;
            } else if (bVar.f36419e == null) {
                bVar.f36416b = true;
                bVar.f36415a = true;
            }
        } else if (transitionValues == null && bVar.f36418d == 0) {
            bVar.f36416b = true;
            bVar.f36415a = true;
        } else if (transitionValues2 == null && bVar.f36417c == 0) {
            bVar.f36416b = false;
            bVar.f36415a = true;
        }
        return bVar;
    }

    /* JADX INFO: renamed from: Q */
    public Animator mo15464Q(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX INFO: renamed from: R */
    public Animator mo15465R(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX INFO: renamed from: S */
    public void m15466S(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f36408E = i;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: e */
    public void mo11341e(TransitionValues transitionValues) {
        m15462O(transitionValues);
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: j */
    public void mo11342j(TransitionValues transitionValues) {
        m15462O(transitionValues);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:70:0x014f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0167 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fc  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (m15463P(m15514q(r4, false), m15515t(r4, false)).f36415a != false) goto L19;
     */
    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.animation.Animator mo11343n(android.view.ViewGroup r22, p636z0.p685e0.TransitionValues r23, p636z0.p685e0.TransitionValues r24) {
        /*
            Method dump skipped, instruction units count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p636z0.p685e0.Visibility2.mo11343n(android.view.ViewGroup, z0.e0.q, z0.e0.q):android.animation.Animator");
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: s */
    public String[] mo15461s() {
        return f36407D;
    }

    @Override // p636z0.p685e0.Transition3
    /* JADX INFO: renamed from: v */
    public boolean mo15467v(TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null && transitionValues2 == null) {
            return false;
        }
        if (transitionValues != null && transitionValues2 != null && transitionValues2.f36492a.containsKey("android:visibility:visibility") != transitionValues.f36492a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b bVarM15463P = m15463P(transitionValues, transitionValues2);
        if (bVarM15463P.f36415a) {
            return bVarM15463P.f36417c == 0 || bVarM15463P.f36418d == 0;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36408E = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.f36440c);
        int iM16077v = C8162a.m16077v(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (iM16077v != 0) {
            m15466S(iM16077v);
        }
    }
}
