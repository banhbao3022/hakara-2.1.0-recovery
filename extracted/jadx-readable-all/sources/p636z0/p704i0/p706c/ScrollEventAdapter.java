package p636z0.p704i0.p706c;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: renamed from: z0.i0.c.f, reason: use source file name */
/* JADX INFO: compiled from: ScrollEventAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class ScrollEventAdapter extends RecyclerView.AbstractC0165r {

    /* JADX INFO: renamed from: a */
    public ViewPager2.AbstractC0215g f37193a;

    /* JADX INFO: renamed from: b */
    public final ViewPager2 f37194b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView f37195c;

    /* JADX INFO: renamed from: d */
    public final LinearLayoutManager f37196d;

    /* JADX INFO: renamed from: e */
    public int f37197e;

    /* JADX INFO: renamed from: f */
    public int f37198f;

    /* JADX INFO: renamed from: g */
    public a f37199g;

    /* JADX INFO: renamed from: h */
    public int f37200h;

    /* JADX INFO: renamed from: i */
    public int f37201i;

    /* JADX INFO: renamed from: j */
    public boolean f37202j;

    /* JADX INFO: renamed from: k */
    public boolean f37203k;

    /* JADX INFO: renamed from: l */
    public boolean f37204l;

    /* JADX INFO: renamed from: m */
    public boolean f37205m;

    /* JADX INFO: renamed from: z0.i0.c.f$a */
    /* JADX INFO: compiled from: ScrollEventAdapter.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f37206a;

        /* JADX INFO: renamed from: b */
        public float f37207b;

        /* JADX INFO: renamed from: c */
        public int f37208c;

        /* JADX INFO: renamed from: a */
        public void m15870a() {
            this.f37206a = -1;
            this.f37207b = 0.0f;
            this.f37208c = 0;
        }
    }

    public ScrollEventAdapter(ViewPager2 viewPager2) {
        this.f37194b = viewPager2;
        RecyclerView recyclerView = viewPager2.f1316o;
        this.f37195c = recyclerView;
        this.f37196d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f37199g = new a();
        m15868e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
    /* JADX INFO: renamed from: a */
    public void mo781a(RecyclerView recyclerView, int i) {
        ViewPager2.AbstractC0215g abstractC0215g;
        int i2 = this.f37197e;
        boolean z = true;
        if (!(i2 == 1 && this.f37198f == 1) && i == 1) {
            this.f37205m = false;
            this.f37197e = 1;
            int i3 = this.f37201i;
            if (i3 != -1) {
                this.f37200h = i3;
                this.f37201i = -1;
            } else if (this.f37200h == -1) {
                this.f37200h = this.f37196d.m545l1();
            }
            m15867d(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f37203k) {
                m15867d(2);
                this.f37202j = true;
                return;
            }
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 0) {
            m15869f();
            if (this.f37203k) {
                a aVar = this.f37199g;
                if (aVar.f37208c == 0) {
                    int i4 = this.f37200h;
                    int i5 = aVar.f37206a;
                    if (i4 != i5) {
                        m15866c(i5);
                    }
                } else {
                    z = false;
                }
            } else {
                int i6 = this.f37199g.f37206a;
                if (i6 != -1 && (abstractC0215g = this.f37193a) != null) {
                    abstractC0215g.mo932b(i6, 0.0f, 0);
                }
            }
            if (z) {
                m15867d(0);
                m15868e();
            }
        }
        if (this.f37197e == 2 && i == 0 && this.f37204l) {
            m15869f();
            a aVar2 = this.f37199g;
            if (aVar2.f37208c == 0) {
                int i7 = this.f37201i;
                int i8 = aVar2.f37206a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    m15866c(i8);
                }
                m15867d(0);
                m15868e();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x002f  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
    /* JADX INFO: renamed from: b */
    public void mo782b(RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int i3;
        this.f37203k = true;
        m15869f();
        if (this.f37202j) {
            this.f37202j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                    z = (i < 0) == this.f37194b.m924b();
                }
            }
            if (z) {
                a aVar = this.f37199g;
                if (aVar.f37208c != 0) {
                    i3 = aVar.f37206a + 1;
                } else {
                    i3 = this.f37199g.f37206a;
                }
            } else {
                i3 = this.f37199g.f37206a;
            }
            this.f37201i = i3;
            if (this.f37200h != i3) {
                m15866c(i3);
            }
        } else if (this.f37197e == 0) {
            int i4 = this.f37199g.f37206a;
            if (i4 == -1) {
                i4 = 0;
            }
            m15866c(i4);
        }
        a aVar2 = this.f37199g;
        int i5 = aVar2.f37206a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f = aVar2.f37207b;
        int i6 = aVar2.f37208c;
        ViewPager2.AbstractC0215g abstractC0215g = this.f37193a;
        if (abstractC0215g != null) {
            abstractC0215g.mo932b(i5, f, i6);
        }
        a aVar3 = this.f37199g;
        int i7 = aVar3.f37206a;
        int i8 = this.f37201i;
        if ((i7 == i8 || i8 == -1) && aVar3.f37208c == 0 && this.f37198f != 1) {
            m15867d(0);
            m15868e();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15866c(int i) {
        ViewPager2.AbstractC0215g abstractC0215g = this.f37193a;
        if (abstractC0215g != null) {
            abstractC0215g.mo929c(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15867d(int i) {
        if ((this.f37197e == 3 && this.f37198f == 0) || this.f37198f == i) {
            return;
        }
        this.f37198f = i;
        ViewPager2.AbstractC0215g abstractC0215g = this.f37193a;
        if (abstractC0215g != null) {
            abstractC0215g.mo928a(i);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15868e() {
        this.f37197e = 0;
        this.f37198f = 0;
        this.f37199g.m15870a();
        this.f37200h = -1;
        this.f37201i = -1;
        this.f37202j = false;
        this.f37203k = false;
        this.f37205m = false;
        this.f37204l = false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0154  */
    /* JADX WARN: Code duplicated, block: B:76:0x0180  */
    /* JADX INFO: renamed from: f */
    public final void m15869f() {
        int top;
        boolean z;
        boolean z2;
        boolean z3;
        int top2;
        int i;
        int bottom;
        int i2;
        a aVar = this.f37199g;
        int iM545l1 = this.f37196d.m545l1();
        aVar.f37206a = iM545l1;
        if (iM545l1 == -1) {
            aVar.m15870a();
            return;
        }
        View viewMo553t = this.f37196d.mo553t(iM545l1);
        if (viewMo553t == null) {
            aVar.m15870a();
            return;
        }
        Objects.requireNonNull(this.f37196d);
        int i3 = ((RecyclerView.C0161n) viewMo553t.getLayoutParams()).f1059b.left;
        Objects.requireNonNull(this.f37196d);
        int i4 = ((RecyclerView.C0161n) viewMo553t.getLayoutParams()).f1059b.right;
        Objects.requireNonNull(this.f37196d);
        int i5 = ((RecyclerView.C0161n) viewMo553t.getLayoutParams()).f1059b.top;
        Objects.requireNonNull(this.f37196d);
        int i6 = ((RecyclerView.C0161n) viewMo553t.getLayoutParams()).f1059b.bottom;
        ViewGroup.LayoutParams layoutParams = viewMo553t.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i3 += marginLayoutParams.leftMargin;
            i4 += marginLayoutParams.rightMargin;
            i5 += marginLayoutParams.topMargin;
            i6 += marginLayoutParams.bottomMargin;
        }
        int height = viewMo553t.getHeight() + i5 + i6;
        int width = viewMo553t.getWidth() + i3 + i4;
        if (this.f37196d.f877r == 0) {
            top = (viewMo553t.getLeft() - i3) - this.f37195c.getPaddingLeft();
            if (this.f37194b.m924b()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewMo553t.getTop() - i5) - this.f37195c.getPaddingTop();
        }
        int i7 = -top;
        aVar.f37208c = i7;
        if (i7 >= 0) {
            aVar.f37207b = height == 0 ? 0.0f : i7 / height;
            return;
        }
        LinearLayoutManager linearLayoutManager = this.f37196d;
        AnimateLayoutChangeDetector2 animateLayoutChangeDetector2 = new AnimateLayoutChangeDetector2(linearLayoutManager);
        int iM764y = linearLayoutManager.m764y();
        if (iM764y != 0) {
            boolean z4 = animateLayoutChangeDetector2.f37188b.f877r == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, iM764y, 2);
            for (int i8 = 0; i8 < iM764y; i8++) {
                View viewM762x = animateLayoutChangeDetector2.f37188b.m762x(i8);
                if (viewM762x == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = viewM762x.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : AnimateLayoutChangeDetector2.f37187a;
                int[] iArr2 = iArr[i8];
                if (z4) {
                    top2 = viewM762x.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = viewM762x.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i8];
                if (z4) {
                    bottom = viewM762x.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = viewM762x.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new AnimateLayoutChangeDetector(animateLayoutChangeDetector2));
            int i9 = 1;
            while (true) {
                if (i9 >= iM764y) {
                    int i10 = iArr[0][1] - iArr[0][0];
                    if (iArr[0][0] <= 0 && iArr[iM764y - 1][1] >= i10) {
                        z = true;
                    }
                } else if (iArr[i9 - 1][1] == iArr[i9][0]) {
                    i9++;
                }
                z = false;
            }
        } else {
            z = true;
        }
        if (!z || animateLayoutChangeDetector2.f37188b.m764y() <= 1) {
            int iM764y2 = animateLayoutChangeDetector2.f37188b.m764y();
            int i11 = 0;
            while (true) {
                if (i11 >= iM764y2) {
                    z2 = false;
                    break;
                } else {
                    if (AnimateLayoutChangeDetector2.m15864a(animateLayoutChangeDetector2.f37188b.m762x(i11))) {
                        z2 = true;
                        break;
                    }
                    i11++;
                }
            }
            if (z2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (!z3) {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f37208c)));
        }
        throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
    }
}
