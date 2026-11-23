package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p770y.p773v.C8462c;
import p636z0.p774z.p775b.GapWorker;
import p636z0.p774z.p775b.LayoutState;
import p636z0.p774z.p775b.LinearSmoothScroller;
import p636z0.p774z.p775b.OrientationHelper3;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.AbstractC0160m implements RecyclerView.AbstractC0171x.b {

    /* JADX INFO: renamed from: A */
    public BitSet f1108A;

    /* JADX INFO: renamed from: B */
    public int f1109B;

    /* JADX INFO: renamed from: C */
    public int f1110C;

    /* JADX INFO: renamed from: D */
    public C0177d f1111D;

    /* JADX INFO: renamed from: E */
    public int f1112E;

    /* JADX INFO: renamed from: F */
    public boolean f1113F;

    /* JADX INFO: renamed from: G */
    public boolean f1114G;

    /* JADX INFO: renamed from: H */
    public C0178e f1115H;

    /* JADX INFO: renamed from: I */
    public int f1116I;

    /* JADX INFO: renamed from: J */
    public final Rect f1117J;

    /* JADX INFO: renamed from: K */
    public final C0175b f1118K;

    /* JADX INFO: renamed from: L */
    public boolean f1119L;

    /* JADX INFO: renamed from: M */
    public int[] f1120M;

    /* JADX INFO: renamed from: N */
    public final Runnable f1121N;

    /* JADX INFO: renamed from: r */
    public int f1122r;

    /* JADX INFO: renamed from: s */
    public C0179f[] f1123s;

    /* JADX INFO: renamed from: t */
    public OrientationHelper3 f1124t;

    /* JADX INFO: renamed from: u */
    public OrientationHelper3 f1125u;

    /* JADX INFO: renamed from: v */
    public int f1126v;

    /* JADX INFO: renamed from: w */
    public int f1127w;

    /* JADX INFO: renamed from: x */
    public final LayoutState f1128x;

    /* JADX INFO: renamed from: y */
    public boolean f1129y;

    /* JADX INFO: renamed from: z */
    public boolean f1130z;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class RunnableC0174a implements Runnable {
        public RunnableC0174a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.m818b1();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C0175b {

        /* JADX INFO: renamed from: a */
        public int f1132a;

        /* JADX INFO: renamed from: b */
        public int f1133b;

        /* JADX INFO: renamed from: c */
        public boolean f1134c;

        /* JADX INFO: renamed from: d */
        public boolean f1135d;

        /* JADX INFO: renamed from: e */
        public boolean f1136e;

        /* JADX INFO: renamed from: f */
        public int[] f1137f;

        public C0175b() {
            m844b();
        }

        /* JADX INFO: renamed from: a */
        public void m843a() {
            this.f1133b = this.f1134c ? StaggeredGridLayoutManager.this.f1124t.mo17068g() : StaggeredGridLayoutManager.this.f1124t.mo17072k();
        }

        /* JADX INFO: renamed from: b */
        public void m844b() {
            this.f1132a = -1;
            this.f1133b = Integer.MIN_VALUE;
            this.f1134c = false;
            this.f1135d = false;
            this.f1136e = false;
            int[] iArr = this.f1137f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0176c extends RecyclerView.C0161n {

        /* JADX INFO: renamed from: e */
        public C0179f f1139e;

        public C0176c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0176c(int i, int i2) {
            super(i, i2);
        }

        public C0176c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0176c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0176c(RecyclerView.C0161n c0161n) {
            super(c0161n);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    @SuppressLint({"BanParcelableUsage"})
    public static class C0178e implements Parcelable {
        public static final Parcelable.Creator<C0178e> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f1146f;

        /* JADX INFO: renamed from: g */
        public int f1147g;

        /* JADX INFO: renamed from: h */
        public int f1148h;

        /* JADX INFO: renamed from: i */
        public int[] f1149i;

        /* JADX INFO: renamed from: j */
        public int f1150j;

        /* JADX INFO: renamed from: k */
        public int[] f1151k;

        /* JADX INFO: renamed from: l */
        public List<C0177d.a> f1152l;

        /* JADX INFO: renamed from: m */
        public boolean f1153m;

        /* JADX INFO: renamed from: n */
        public boolean f1154n;

        /* JADX INFO: renamed from: o */
        public boolean f1155o;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        public class a implements Parcelable.Creator<C0178e> {
            @Override // android.os.Parcelable.Creator
            public C0178e createFromParcel(Parcel parcel) {
                return new C0178e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0178e[] newArray(int i) {
                return new C0178e[i];
            }
        }

        public C0178e() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1146f);
            parcel.writeInt(this.f1147g);
            parcel.writeInt(this.f1148h);
            if (this.f1148h > 0) {
                parcel.writeIntArray(this.f1149i);
            }
            parcel.writeInt(this.f1150j);
            if (this.f1150j > 0) {
                parcel.writeIntArray(this.f1151k);
            }
            parcel.writeInt(this.f1153m ? 1 : 0);
            parcel.writeInt(this.f1154n ? 1 : 0);
            parcel.writeInt(this.f1155o ? 1 : 0);
            parcel.writeList(this.f1152l);
        }

        public C0178e(Parcel parcel) {
            this.f1146f = parcel.readInt();
            this.f1147g = parcel.readInt();
            int i = parcel.readInt();
            this.f1148h = i;
            if (i > 0) {
                int[] iArr = new int[i];
                this.f1149i = iArr;
                parcel.readIntArray(iArr);
            }
            int i2 = parcel.readInt();
            this.f1150j = i2;
            if (i2 > 0) {
                int[] iArr2 = new int[i2];
                this.f1151k = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f1153m = parcel.readInt() == 1;
            this.f1154n = parcel.readInt() == 1;
            this.f1155o = parcel.readInt() == 1;
            this.f1152l = parcel.readArrayList(C0177d.a.class.getClassLoader());
        }

        public C0178e(C0178e c0178e) {
            this.f1148h = c0178e.f1148h;
            this.f1146f = c0178e.f1146f;
            this.f1147g = c0178e.f1147g;
            this.f1149i = c0178e.f1149i;
            this.f1150j = c0178e.f1150j;
            this.f1151k = c0178e.f1151k;
            this.f1153m = c0178e.f1153m;
            this.f1154n = c0178e.f1154n;
            this.f1155o = c0178e.f1155o;
            this.f1152l = c0178e.f1152l;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    public class C0179f {

        /* JADX INFO: renamed from: a */
        public ArrayList<View> f1156a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public int f1157b = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: c */
        public int f1158c = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: d */
        public int f1159d = 0;

        /* JADX INFO: renamed from: e */
        public final int f1160e;

        public C0179f(int i) {
            this.f1160e = i;
        }

        /* JADX INFO: renamed from: a */
        public void m851a(View view) {
            C0176c c0176cM860j = m860j(view);
            c0176cM860j.f1139e = this;
            this.f1156a.add(view);
            this.f1158c = Integer.MIN_VALUE;
            if (this.f1156a.size() == 1) {
                this.f1157b = Integer.MIN_VALUE;
            }
            if (c0176cM860j.m774c() || c0176cM860j.m773b()) {
                this.f1159d = StaggeredGridLayoutManager.this.f1124t.mo17064c(view) + this.f1159d;
            }
        }

        /* JADX INFO: renamed from: b */
        public void m852b() {
            ArrayList<View> arrayList = this.f1156a;
            View view = arrayList.get(arrayList.size() - 1);
            C0176c c0176cM860j = m860j(view);
            this.f1158c = StaggeredGridLayoutManager.this.f1124t.mo17063b(view);
            Objects.requireNonNull(c0176cM860j);
        }

        /* JADX INFO: renamed from: c */
        public void m853c() {
            View view = this.f1156a.get(0);
            C0176c c0176cM860j = m860j(view);
            this.f1157b = StaggeredGridLayoutManager.this.f1124t.mo17066e(view);
            Objects.requireNonNull(c0176cM860j);
        }

        /* JADX INFO: renamed from: d */
        public void m854d() {
            this.f1156a.clear();
            this.f1157b = Integer.MIN_VALUE;
            this.f1158c = Integer.MIN_VALUE;
            this.f1159d = 0;
        }

        /* JADX INFO: renamed from: e */
        public int m855e() {
            return StaggeredGridLayoutManager.this.f1129y ? m857g(this.f1156a.size() - 1, -1, true) : m857g(0, this.f1156a.size(), true);
        }

        /* JADX INFO: renamed from: f */
        public int m856f() {
            return StaggeredGridLayoutManager.this.f1129y ? m857g(0, this.f1156a.size(), true) : m857g(this.f1156a.size() - 1, -1, true);
        }

        /* JADX INFO: renamed from: g */
        public int m857g(int i, int i2, boolean z) {
            int iMo17072k = StaggeredGridLayoutManager.this.f1124t.mo17072k();
            int iMo17068g = StaggeredGridLayoutManager.this.f1124t.mo17068g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1156a.get(i);
                int iMo17066e = StaggeredGridLayoutManager.this.f1124t.mo17066e(view);
                int iMo17063b = StaggeredGridLayoutManager.this.f1124t.mo17063b(view);
                boolean z2 = false;
                boolean z3 = !z ? iMo17066e >= iMo17068g : iMo17066e > iMo17068g;
                if (!z ? iMo17063b > iMo17072k : iMo17063b >= iMo17072k) {
                    z2 = true;
                }
                if (z3 && z2 && (iMo17066e < iMo17072k || iMo17063b > iMo17068g)) {
                    return StaggeredGridLayoutManager.this.m735R(view);
                }
                i += i3;
            }
            return -1;
        }

        /* JADX INFO: renamed from: h */
        public int m858h(int i) {
            int i2 = this.f1158c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1156a.size() == 0) {
                return i;
            }
            m852b();
            return this.f1158c;
        }

        /* JADX INFO: renamed from: i */
        public View m859i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1156a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1156a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f1129y && staggeredGridLayoutManager.m735R(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f1129y && staggeredGridLayoutManager2.m735R(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1156a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1156a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f1129y && staggeredGridLayoutManager3.m735R(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f1129y && staggeredGridLayoutManager4.m735R(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* JADX INFO: renamed from: j */
        public C0176c m860j(View view) {
            return (C0176c) view.getLayoutParams();
        }

        /* JADX INFO: renamed from: k */
        public int m861k(int i) {
            int i2 = this.f1157b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1156a.size() == 0) {
                return i;
            }
            m853c();
            return this.f1157b;
        }

        /* JADX INFO: renamed from: l */
        public void m862l() {
            int size = this.f1156a.size();
            View viewRemove = this.f1156a.remove(size - 1);
            C0176c c0176cM860j = m860j(viewRemove);
            c0176cM860j.f1139e = null;
            if (c0176cM860j.m774c() || c0176cM860j.m773b()) {
                this.f1159d -= StaggeredGridLayoutManager.this.f1124t.mo17064c(viewRemove);
            }
            if (size == 1) {
                this.f1157b = Integer.MIN_VALUE;
            }
            this.f1158c = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: m */
        public void m863m() {
            View viewRemove = this.f1156a.remove(0);
            C0176c c0176cM860j = m860j(viewRemove);
            c0176cM860j.f1139e = null;
            if (this.f1156a.size() == 0) {
                this.f1158c = Integer.MIN_VALUE;
            }
            if (c0176cM860j.m774c() || c0176cM860j.m773b()) {
                this.f1159d -= StaggeredGridLayoutManager.this.f1124t.mo17064c(viewRemove);
            }
            this.f1157b = Integer.MIN_VALUE;
        }

        /* JADX INFO: renamed from: n */
        public void m864n(View view) {
            C0176c c0176cM860j = m860j(view);
            c0176cM860j.f1139e = this;
            this.f1156a.add(0, view);
            this.f1157b = Integer.MIN_VALUE;
            if (this.f1156a.size() == 1) {
                this.f1158c = Integer.MIN_VALUE;
            }
            if (c0176cM860j.m774c() || c0176cM860j.m773b()) {
                this.f1159d = StaggeredGridLayoutManager.this.f1124t.mo17064c(view) + this.f1159d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1122r = -1;
        this.f1129y = false;
        this.f1130z = false;
        this.f1109B = -1;
        this.f1110C = Integer.MIN_VALUE;
        this.f1111D = new C0177d();
        this.f1112E = 2;
        this.f1117J = new Rect();
        this.f1118K = new C0175b();
        this.f1119L = true;
        this.f1121N = new RunnableC0174a();
        RecyclerView.AbstractC0160m.d dVarM703S = RecyclerView.AbstractC0160m.m703S(context, attributeSet, i, i2);
        int i3 = dVarM703S.f1054a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        mo529d(null);
        if (i3 != this.f1126v) {
            this.f1126v = i3;
            OrientationHelper3 orientationHelper3 = this.f1124t;
            this.f1124t = this.f1125u;
            this.f1125u = orientationHelper3;
            m727L0();
        }
        m812B1(dVarM703S.f1055b);
        boolean z = dVarM703S.f1056c;
        mo529d(null);
        C0178e c0178e = this.f1115H;
        if (c0178e != null && c0178e.f1153m != z) {
            c0178e.f1153m = z;
        }
        this.f1129y = z;
        m727L0();
        this.f1128x = new LayoutState();
        this.f1124t = OrientationHelper3.m17077a(this, this.f1126v);
        this.f1125u = OrientationHelper3.m17077a(this, 1 - this.f1126v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: A0 */
    public void mo513A0(Parcelable parcelable) {
        if (parcelable instanceof C0178e) {
            C0178e c0178e = (C0178e) parcelable;
            this.f1115H = c0178e;
            if (this.f1109B != -1) {
                c0178e.f1149i = null;
                c0178e.f1148h = 0;
                c0178e.f1146f = -1;
                c0178e.f1147g = -1;
                c0178e.f1149i = null;
                c0178e.f1148h = 0;
                c0178e.f1150j = 0;
                c0178e.f1151k = null;
                c0178e.f1152l = null;
            }
            m727L0();
        }
    }

    /* JADX INFO: renamed from: A1 */
    public final void m811A1(int i) {
        LayoutState layoutState = this.f1128x;
        layoutState.f39324e = i;
        layoutState.f39323d = this.f1130z != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: B0 */
    public Parcelable mo515B0() {
        int iM861k;
        int iMo17072k;
        int[] iArr;
        C0178e c0178e = this.f1115H;
        if (c0178e != null) {
            return new C0178e(c0178e);
        }
        C0178e c0178e2 = new C0178e();
        c0178e2.f1153m = this.f1129y;
        c0178e2.f1154n = this.f1113F;
        c0178e2.f1155o = this.f1114G;
        C0177d c0177d = this.f1111D;
        if (c0177d == null || (iArr = c0177d.f1140a) == null) {
            c0178e2.f1150j = 0;
        } else {
            c0178e2.f1151k = iArr;
            c0178e2.f1150j = iArr.length;
            c0178e2.f1152l = c0177d.f1141b;
        }
        if (m764y() > 0) {
            c0178e2.f1146f = this.f1113F ? m828l1() : m827k1();
            View viewM823g1 = this.f1130z ? m823g1(true) : m824h1(true);
            c0178e2.f1147g = viewM823g1 != null ? m735R(viewM823g1) : -1;
            int i = this.f1122r;
            c0178e2.f1148h = i;
            c0178e2.f1149i = new int[i];
            for (int i2 = 0; i2 < this.f1122r; i2++) {
                if (this.f1113F) {
                    iM861k = this.f1123s[i2].m858h(Integer.MIN_VALUE);
                    if (iM861k != Integer.MIN_VALUE) {
                        iMo17072k = this.f1124t.mo17068g();
                        iM861k -= iMo17072k;
                    }
                } else {
                    iM861k = this.f1123s[i2].m861k(Integer.MIN_VALUE);
                    if (iM861k != Integer.MIN_VALUE) {
                        iMo17072k = this.f1124t.mo17072k();
                        iM861k -= iMo17072k;
                    }
                }
                c0178e2.f1149i[i2] = iM861k;
            }
        } else {
            c0178e2.f1146f = -1;
            c0178e2.f1147g = -1;
            c0178e2.f1148h = 0;
        }
        return c0178e2;
    }

    /* JADX INFO: renamed from: B1 */
    public void m812B1(int i) {
        mo529d(null);
        if (i != this.f1122r) {
            this.f1111D.m845a();
            m727L0();
            this.f1122r = i;
            this.f1108A = new BitSet(this.f1122r);
            this.f1123s = new C0179f[this.f1122r];
            for (int i2 = 0; i2 < this.f1122r; i2++) {
                this.f1123s[i2] = new C0179f(i2);
            }
            m727L0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: C0 */
    public void mo709C0(int i) {
        if (i == 0) {
            m818b1();
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m813C1(int i, int i2) {
        for (int i3 = 0; i3 < this.f1122r; i3++) {
            if (!this.f1123s[i3].f1156a.isEmpty()) {
                m815E1(this.f1123s[i3], i, i2);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x003f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0042  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX INFO: renamed from: D1 */
    public final void m814D1(int i, RecyclerView.C0172y c0172y) {
        int iMo17073l;
        int iMo17073l2;
        RecyclerView recyclerView;
        boolean z;
        int i2;
        LayoutState layoutState = this.f1128x;
        boolean z2 = false;
        layoutState.f39321b = 0;
        layoutState.f39322c = i;
        RecyclerView.AbstractC0171x abstractC0171x = this.f1041g;
        if ((abstractC0171x != null && abstractC0171x.f1083e) && (i2 = c0172y.f1094a) != -1) {
            if (this.f1130z == (i2 < i)) {
                iMo17073l = this.f1124t.mo17073l();
            } else {
                iMo17073l2 = this.f1124t.mo17073l();
                iMo17073l = 0;
            }
            recyclerView = this.f1036b;
            if (recyclerView == null && recyclerView.f975r) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f1128x.f39325f = this.f1124t.mo17072k() - iMo17073l2;
                this.f1128x.f39326g = this.f1124t.mo17068g() + iMo17073l;
            } else {
                this.f1128x.f39326g = this.f1124t.mo17067f() + iMo17073l;
                this.f1128x.f39325f = -iMo17073l2;
            }
            LayoutState layoutState2 = this.f1128x;
            layoutState2.f39327h = false;
            layoutState2.f39320a = true;
            if (this.f1124t.mo17070i() == 0 && this.f1124t.mo17067f() == 0) {
                z2 = true;
            }
            layoutState2.f39328i = z2;
        }
        iMo17073l = 0;
        iMo17073l2 = 0;
        recyclerView = this.f1036b;
        if (recyclerView == null) {
            z = false;
        } else {
            z = false;
        }
        if (z) {
            this.f1128x.f39325f = this.f1124t.mo17072k() - iMo17073l2;
            this.f1128x.f39326g = this.f1124t.mo17068g() + iMo17073l;
        } else {
            this.f1128x.f39326g = this.f1124t.mo17067f() + iMo17073l;
            this.f1128x.f39325f = -iMo17073l2;
        }
        LayoutState layoutState3 = this.f1128x;
        layoutState3.f39327h = false;
        layoutState3.f39320a = true;
        if (this.f1124t.mo17070i() == 0) {
            z2 = true;
        }
        layoutState3.f39328i = z2;
    }

    /* JADX INFO: renamed from: E1 */
    public final void m815E1(C0179f c0179f, int i, int i2) {
        int i3 = c0179f.f1159d;
        if (i == -1) {
            int i4 = c0179f.f1157b;
            if (i4 == Integer.MIN_VALUE) {
                c0179f.m853c();
                i4 = c0179f.f1157b;
            }
            if (i4 + i3 <= i2) {
                this.f1108A.set(c0179f.f1160e, false);
                return;
            }
            return;
        }
        int i5 = c0179f.f1158c;
        if (i5 == Integer.MIN_VALUE) {
            c0179f.m852b();
            i5 = c0179f.f1158c;
        }
        if (i5 - i3 >= i2) {
            this.f1108A.set(c0179f.f1160e, false);
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final int m816F1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: M0 */
    public int mo478M0(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        return m842z1(i, c0167t, c0172y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: N0 */
    public void mo522N0(int i) {
        C0178e c0178e = this.f1115H;
        if (c0178e != null && c0178e.f1146f != i) {
            c0178e.f1149i = null;
            c0178e.f1148h = 0;
            c0178e.f1146f = -1;
            c0178e.f1147g = -1;
        }
        this.f1109B = i;
        this.f1110C = Integer.MIN_VALUE;
        m727L0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: O0 */
    public int mo481O0(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        return m842z1(i, c0167t, c0172y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: R0 */
    public void mo485R0(Rect rect, int i, int i2) {
        int iM705h;
        int iM705h2;
        int iM731P = m731P() + m730O();
        int iM729N = m729N() + m733Q();
        if (this.f1126v == 1) {
            iM705h2 = RecyclerView.AbstractC0160m.m705h(i2, rect.height() + iM729N, m726L());
            iM705h = RecyclerView.AbstractC0160m.m705h(i, (this.f1127w * this.f1122r) + iM731P, m728M());
        } else {
            iM705h = RecyclerView.AbstractC0160m.m705h(i, rect.width() + iM731P, m728M());
            iM705h2 = RecyclerView.AbstractC0160m.m705h(i2, (this.f1127w * this.f1122r) + iM729N, m726L());
        }
        this.f1036b.setMeasuredDimension(iM705h, iM705h2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: W */
    public boolean mo524W() {
        return this.f1112E != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: X0 */
    public void mo525X0(RecyclerView recyclerView, RecyclerView.C0172y c0172y, int i) {
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext());
        linearSmoothScroller.f1079a = i;
        m743Y0(linearSmoothScroller);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: Z0 */
    public boolean mo488Z0() {
        return this.f1115H == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0171x.b
    /* JADX INFO: renamed from: a */
    public PointF mo526a(int i) {
        int iM817a1 = m817a1(i);
        PointF pointF = new PointF();
        if (iM817a1 == 0) {
            return null;
        }
        if (this.f1126v == 0) {
            pointF.x = iM817a1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iM817a1;
        }
        return pointF;
    }

    /* JADX INFO: renamed from: a1 */
    public final int m817a1(int i) {
        if (m764y() == 0) {
            return this.f1130z ? 1 : -1;
        }
        return (i < m827k1()) != this.f1130z ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: b0 */
    public void mo747b0(int i) {
        super.mo747b0(i);
        for (int i2 = 0; i2 < this.f1122r; i2++) {
            C0179f c0179f = this.f1123s[i2];
            int i3 = c0179f.f1157b;
            if (i3 != Integer.MIN_VALUE) {
                c0179f.f1157b = i3 + i;
            }
            int i4 = c0179f.f1158c;
            if (i4 != Integer.MIN_VALUE) {
                c0179f.f1158c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m818b1() {
        int iM827k1;
        if (m764y() != 0 && this.f1112E != 0 && this.f1043i) {
            if (this.f1130z) {
                iM827k1 = m828l1();
                m827k1();
            } else {
                iM827k1 = m827k1();
                m828l1();
            }
            if (iM827k1 == 0 && m832p1() != null) {
                this.f1111D.m845a();
                this.f1042h = true;
                m727L0();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: c0 */
    public void mo749c0(int i) {
        super.mo749c0(i);
        for (int i2 = 0; i2 < this.f1122r; i2++) {
            C0179f c0179f = this.f1123s[i2];
            int i3 = c0179f.f1157b;
            if (i3 != Integer.MIN_VALUE) {
                c0179f.f1157b = i3 + i;
            }
            int i4 = c0179f.f1158c;
            if (i4 != Integer.MIN_VALUE) {
                c0179f.f1158c = i4 + i;
            }
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final int m819c1(RecyclerView.C0172y c0172y) {
        if (m764y() == 0) {
            return 0;
        }
        return C8462c.m16936c(c0172y, this.f1124t, m824h1(!this.f1119L), m823g1(!this.f1119L), this, this.f1119L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: d */
    public void mo529d(String str) {
        RecyclerView recyclerView;
        if (this.f1115H != null || (recyclerView = this.f1036b) == null) {
            return;
        }
        recyclerView.m609i(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: d0 */
    public void mo750d0(RecyclerView.AbstractC0152e abstractC0152e, RecyclerView.AbstractC0152e abstractC0152e2) {
        this.f1111D.m845a();
        for (int i = 0; i < this.f1122r; i++) {
            this.f1123s[i].m854d();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final int m820d1(RecyclerView.C0172y c0172y) {
        if (m764y() == 0) {
            return 0;
        }
        return C8462c.m16937d(c0172y, this.f1124t, m824h1(!this.f1119L), m823g1(!this.f1119L), this, this.f1119L, this.f1130z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: e */
    public boolean mo531e() {
        return this.f1126v == 0;
    }

    /* JADX INFO: renamed from: e1 */
    public final int m821e1(RecyclerView.C0172y c0172y) {
        if (m764y() == 0) {
            return 0;
        }
        return C8462c.m16938e(c0172y, this.f1124t, m824h1(!this.f1119L), m823g1(!this.f1119L), this, this.f1119L);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: f */
    public boolean mo533f() {
        return this.f1126v == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX INFO: renamed from: f1 */
    public final int m822f1(RecyclerView.C0167t c0167t, LayoutState layoutState, RecyclerView.C0172y c0172y) {
        int i;
        int iM829m1;
        C0179f c0179f;
        ?? r2;
        int iMo17064c;
        int iMo17064c2;
        int iMo17072k;
        int iMo17064c3;
        int i2;
        int i3;
        int i4;
        boolean z = false;
        this.f1108A.set(0, this.f1122r, true);
        if (this.f1128x.f39328i) {
            i = layoutState.f39324e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = layoutState.f39324e == 1 ? layoutState.f39326g + layoutState.f39321b : layoutState.f39325f - layoutState.f39321b;
        }
        m813C1(layoutState.f39324e, i);
        int iMo17068g = this.f1130z ? this.f1124t.mo17068g() : this.f1124t.mo17072k();
        boolean z2 = false;
        while (true) {
            int i5 = layoutState.f39322c;
            if (!(i5 >= 0 && i5 < c0172y.m809b()) || (!this.f1128x.f39328i && this.f1108A.isEmpty())) {
                break;
            }
            View view = c0167t.m794j(layoutState.f39322c, z, Long.MAX_VALUE).f1003b;
            layoutState.f39322c += layoutState.f39323d;
            C0176c c0176c = (C0176c) view.getLayoutParams();
            int iM772a = c0176c.m772a();
            int[] iArr = this.f1111D.f1140a;
            int i6 = (iArr == null || iM772a >= iArr.length) ? -1 : iArr[iM772a];
            if (i6 == -1) {
                if (m836t1(layoutState.f39324e)) {
                    i3 = this.f1122r - 1;
                    i2 = -1;
                    i4 = -1;
                } else {
                    i2 = this.f1122r;
                    i3 = 0;
                    i4 = 1;
                }
                C0179f c0179f2 = null;
                if (layoutState.f39324e == 1) {
                    int iMo17072k2 = this.f1124t.mo17072k();
                    int i7 = Integer.MAX_VALUE;
                    while (i3 != i2) {
                        C0179f c0179f3 = this.f1123s[i3];
                        int iM858h = c0179f3.m858h(iMo17072k2);
                        if (iM858h < i7) {
                            c0179f2 = c0179f3;
                            i7 = iM858h;
                        }
                        i3 += i4;
                    }
                } else {
                    int iMo17068g2 = this.f1124t.mo17068g();
                    int i8 = Integer.MIN_VALUE;
                    while (i3 != i2) {
                        C0179f c0179f4 = this.f1123s[i3];
                        int iM861k = c0179f4.m861k(iMo17068g2);
                        if (iM861k > i8) {
                            c0179f2 = c0179f4;
                            i8 = iM861k;
                        }
                        i3 += i4;
                    }
                }
                c0179f = c0179f2;
                C0177d c0177d = this.f1111D;
                c0177d.m846b(iM772a);
                c0177d.f1140a[iM772a] = c0179f.f1160e;
            } else {
                c0179f = this.f1123s[i6];
            }
            C0179f c0179f5 = c0179f;
            c0176c.f1139e = c0179f5;
            if (layoutState.f39324e == 1) {
                r2 = 0;
                m748c(view, -1, false);
            } else {
                r2 = 0;
                m748c(view, 0, false);
            }
            if (this.f1126v == 1) {
                m834r1(view, RecyclerView.AbstractC0160m.m706z(this.f1127w, this.f1048n, r2, ((ViewGroup.MarginLayoutParams) c0176c).width, r2), RecyclerView.AbstractC0160m.m706z(this.f1051q, this.f1049o, m729N() + m733Q(), ((ViewGroup.MarginLayoutParams) c0176c).height, true), r2);
            } else {
                m834r1(view, RecyclerView.AbstractC0160m.m706z(this.f1050p, this.f1048n, m731P() + m730O(), ((ViewGroup.MarginLayoutParams) c0176c).width, true), RecyclerView.AbstractC0160m.m706z(this.f1127w, this.f1049o, 0, ((ViewGroup.MarginLayoutParams) c0176c).height, false), false);
            }
            if (layoutState.f39324e == 1) {
                int iM858h2 = c0179f5.m858h(iMo17068g);
                iMo17064c2 = iM858h2;
                iMo17064c = this.f1124t.mo17064c(view) + iM858h2;
            } else {
                int iM861k2 = c0179f5.m861k(iMo17068g);
                iMo17064c = iM861k2;
                iMo17064c2 = iM861k2 - this.f1124t.mo17064c(view);
            }
            if (layoutState.f39324e == 1) {
                c0176c.f1139e.m851a(view);
            } else {
                c0176c.f1139e.m864n(view);
            }
            if (m833q1() && this.f1126v == 1) {
                iMo17064c3 = this.f1125u.mo17068g() - (((this.f1122r - 1) - c0179f5.f1160e) * this.f1127w);
                iMo17072k = iMo17064c3 - this.f1125u.mo17064c(view);
            } else {
                iMo17072k = this.f1125u.mo17072k() + (c0179f5.f1160e * this.f1127w);
                iMo17064c3 = this.f1125u.mo17064c(view) + iMo17072k;
            }
            int i9 = iMo17064c3;
            int i10 = iMo17072k;
            if (this.f1126v == 1) {
                m745a0(view, i10, iMo17064c2, i9, iMo17064c);
            } else {
                m745a0(view, iMo17064c2, i10, iMo17064c, i9);
            }
            m815E1(c0179f5, this.f1128x.f39324e, i);
            m838v1(c0167t, this.f1128x);
            if (this.f1128x.f39327h && view.hasFocusable()) {
                this.f1108A.set(c0179f5.f1160e, false);
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            m838v1(c0167t, this.f1128x);
        }
        if (this.f1128x.f39324e == -1) {
            iM829m1 = this.f1124t.mo17072k() - m830n1(this.f1124t.mo17072k());
        } else {
            iM829m1 = m829m1(this.f1124t.mo17068g()) - this.f1124t.mo17068g();
        }
        if (iM829m1 > 0) {
            return Math.min(layoutState.f39321b, iM829m1);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: g */
    public boolean mo490g(RecyclerView.C0161n c0161n) {
        return c0161n instanceof C0176c;
    }

    /* JADX INFO: renamed from: g1 */
    public View m823g1(boolean z) {
        int iMo17072k = this.f1124t.mo17072k();
        int iMo17068g = this.f1124t.mo17068g();
        View view = null;
        for (int iM764y = m764y() - 1; iM764y >= 0; iM764y--) {
            View viewM762x = m762x(iM764y);
            int iMo17066e = this.f1124t.mo17066e(viewM762x);
            int iMo17063b = this.f1124t.mo17063b(viewM762x);
            if (iMo17063b > iMo17072k && iMo17066e < iMo17068g) {
                if (iMo17063b <= iMo17068g || !z) {
                    return viewM762x;
                }
                if (view == null) {
                    view = viewM762x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: h0 */
    public void mo536h0(RecyclerView recyclerView, RecyclerView.C0167t c0167t) {
        m753g0();
        Runnable runnable = this.f1121N;
        RecyclerView recyclerView2 = this.f1036b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.f1122r; i++) {
            this.f1123s[i].m854d();
        }
        recyclerView.requestLayout();
    }

    /* JADX INFO: renamed from: h1 */
    public View m824h1(boolean z) {
        int iMo17072k = this.f1124t.mo17072k();
        int iMo17068g = this.f1124t.mo17068g();
        int iM764y = m764y();
        View view = null;
        for (int i = 0; i < iM764y; i++) {
            View viewM762x = m762x(i);
            int iMo17066e = this.f1124t.mo17066e(viewM762x);
            if (this.f1124t.mo17063b(viewM762x) > iMo17072k && iMo17066e < iMo17068g) {
                if (iMo17066e >= iMo17072k || !z) {
                    return viewM762x;
                }
                if (view == null) {
                    view = viewM762x;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: i */
    public void mo538i(int i, int i2, RecyclerView.C0172y c0172y, RecyclerView.AbstractC0160m.c cVar) {
        int iM858h;
        int iM861k;
        if (this.f1126v != 0) {
            i = i2;
        }
        if (m764y() == 0 || i == 0) {
            return;
        }
        m837u1(i, c0172y);
        int[] iArr = this.f1120M;
        if (iArr == null || iArr.length < this.f1122r) {
            this.f1120M = new int[this.f1122r];
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f1122r; i4++) {
            LayoutState layoutState = this.f1128x;
            if (layoutState.f39323d == -1) {
                iM858h = layoutState.f39325f;
                iM861k = this.f1123s[i4].m861k(iM858h);
            } else {
                iM858h = this.f1123s[i4].m858h(layoutState.f39326g);
                iM861k = this.f1128x.f39326g;
            }
            int i5 = iM858h - iM861k;
            if (i5 >= 0) {
                this.f1120M[i3] = i5;
                i3++;
            }
        }
        Arrays.sort(this.f1120M, 0, i3);
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = this.f1128x.f39322c;
            if (!(i7 >= 0 && i7 < c0172y.m809b())) {
                return;
            }
            ((GapWorker.b) cVar).m17052a(this.f1128x.f39322c, this.f1120M[i6]);
            LayoutState layoutState2 = this.f1128x;
            layoutState2.f39322c += layoutState2.f39323d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x005a  */
    /* JADX WARN: Code duplicated, block: B:46:0x005c  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: i0 */
    public View mo491i0(View view, int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        View viewM760s;
        int i2;
        if (m764y() == 0 || (viewM760s = m760s(view)) == null) {
            return null;
        }
        m841y1();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66 ? this.f1126v == 0 : !(i != 130 || this.f1126v != 1)) {
                            i2 = 1;
                        }
                    } else if (this.f1126v == 1) {
                        i2 = -1;
                    }
                    i2 = Integer.MIN_VALUE;
                } else if (this.f1126v == 0) {
                    i2 = -1;
                } else {
                    i2 = Integer.MIN_VALUE;
                }
            } else if (this.f1126v != 1 && m833q1()) {
                i2 = -1;
            } else {
                i2 = 1;
            }
        } else if (this.f1126v != 1 && m833q1()) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        C0176c c0176c = (C0176c) viewM760s.getLayoutParams();
        Objects.requireNonNull(c0176c);
        C0179f c0179f = c0176c.f1139e;
        int iM828l1 = i2 == 1 ? m828l1() : m827k1();
        m814D1(iM828l1, c0172y);
        m811A1(i2);
        LayoutState layoutState = this.f1128x;
        layoutState.f39322c = layoutState.f39323d + iM828l1;
        layoutState.f39321b = (int) (this.f1124t.mo17073l() * 0.33333334f);
        LayoutState layoutState2 = this.f1128x;
        layoutState2.f39327h = true;
        layoutState2.f39320a = false;
        m822f1(c0167t, layoutState2, c0172y);
        this.f1113F = this.f1130z;
        View viewM859i = c0179f.m859i(iM828l1, i2);
        if (viewM859i != null && viewM859i != viewM760s) {
            return viewM859i;
        }
        if (m836t1(i2)) {
            for (int i3 = this.f1122r - 1; i3 >= 0; i3--) {
                View viewM859i2 = this.f1123s[i3].m859i(iM828l1, i2);
                if (viewM859i2 != null && viewM859i2 != viewM760s) {
                    return viewM859i2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f1122r; i4++) {
                View viewM859i3 = this.f1123s[i4].m859i(iM828l1, i2);
                if (viewM859i3 != null && viewM859i3 != viewM760s) {
                    return viewM859i3;
                }
            }
        }
        boolean z = (this.f1129y ^ true) == (i2 == -1);
        View viewMo553t = mo553t(z ? c0179f.m855e() : c0179f.m856f());
        if (viewMo553t != null && viewMo553t != viewM760s) {
            return viewMo553t;
        }
        if (m836t1(i2)) {
            for (int i5 = this.f1122r - 1; i5 >= 0; i5--) {
                if (i5 != c0179f.f1160e) {
                    View viewMo553t2 = mo553t(z ? this.f1123s[i5].m855e() : this.f1123s[i5].m856f());
                    if (viewMo553t2 != null && viewMo553t2 != viewM760s) {
                        return viewMo553t2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f1122r; i6++) {
                View viewMo553t3 = mo553t(z ? this.f1123s[i6].m855e() : this.f1123s[i6].m856f());
                if (viewMo553t3 != null && viewMo553t3 != viewM760s) {
                    return viewMo553t3;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i1 */
    public final void m825i1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, boolean z) {
        int iMo17068g;
        int iM829m1 = m829m1(Integer.MIN_VALUE);
        if (iM829m1 != Integer.MIN_VALUE && (iMo17068g = this.f1124t.mo17068g() - iM829m1) > 0) {
            int i = iMo17068g - (-m842z1(-iMo17068g, c0167t, c0172y));
            if (!z || i <= 0) {
                return;
            }
            this.f1124t.mo17076p(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: j0 */
    public void mo541j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0167t c0167t = this.f1036b.f965m;
        m754k0(accessibilityEvent);
        if (m764y() > 0) {
            View viewM824h1 = m824h1(false);
            View viewM823g1 = m823g1(false);
            if (viewM824h1 == null || viewM823g1 == null) {
                return;
            }
            int iM735R = m735R(viewM824h1);
            int iM735R2 = m735R(viewM823g1);
            if (iM735R < iM735R2) {
                accessibilityEvent.setFromIndex(iM735R);
                accessibilityEvent.setToIndex(iM735R2);
            } else {
                accessibilityEvent.setFromIndex(iM735R2);
                accessibilityEvent.setToIndex(iM735R);
            }
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final void m826j1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, boolean z) {
        int iMo17072k;
        int iM830n1 = m830n1(Integer.MAX_VALUE);
        if (iM830n1 != Integer.MAX_VALUE && (iMo17072k = iM830n1 - this.f1124t.mo17072k()) > 0) {
            int iM842z1 = iMo17072k - m842z1(iMo17072k, c0167t, c0172y);
            if (!z || iM842z1 <= 0) {
                return;
            }
            this.f1124t.mo17076p(-iM842z1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: k */
    public int mo543k(RecyclerView.C0172y c0172y) {
        return m819c1(c0172y);
    }

    /* JADX INFO: renamed from: k1 */
    public int m827k1() {
        if (m764y() == 0) {
            return 0;
        }
        return m735R(m762x(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: l */
    public int mo492l(RecyclerView.C0172y c0172y) {
        return m820d1(c0172y);
    }

    /* JADX INFO: renamed from: l1 */
    public int m828l1() {
        int iM764y = m764y();
        if (iM764y == 0) {
            return 0;
        }
        return m735R(m762x(iM764y - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: m */
    public int mo493m(RecyclerView.C0172y c0172y) {
        return m821e1(c0172y);
    }

    /* JADX INFO: renamed from: m1 */
    public final int m829m1(int i) {
        int iM858h = this.f1123s[0].m858h(i);
        for (int i2 = 1; i2 < this.f1122r; i2++) {
            int iM858h2 = this.f1123s[i2].m858h(i);
            if (iM858h2 > iM858h) {
                iM858h = iM858h2;
            }
        }
        return iM858h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: n */
    public int mo547n(RecyclerView.C0172y c0172y) {
        return m819c1(c0172y);
    }

    /* JADX INFO: renamed from: n1 */
    public final int m830n1(int i) {
        int iM861k = this.f1123s[0].m861k(i);
        for (int i2 = 1; i2 < this.f1122r; i2++) {
            int iM861k2 = this.f1123s[i2].m861k(i);
            if (iM861k2 < iM861k) {
                iM861k = iM861k2;
            }
        }
        return iM861k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: o */
    public int mo495o(RecyclerView.C0172y c0172y) {
        return m820d1(c0172y);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0025  */
    /* JADX WARN: Code duplicated, block: B:17:0x0028 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: o1 */
    public final void m831o1(int i, int i2, int i3) {
        int i4;
        int i5;
        int iM828l1;
        int iM828l2 = this.f1130z ? m828l1() : m827k1();
        if (i3 == 8) {
            if (i < i2) {
                i4 = i2 + 1;
            } else {
                i4 = i + 1;
                i5 = i2;
            }
            this.f1111D.m848d(i5);
            if (i3 != 1) {
                this.f1111D.m849e(i, i2);
            } else if (i3 != 2) {
                this.f1111D.m850f(i, i2);
            } else if (i3 == 8) {
                this.f1111D.m850f(i, 1);
                this.f1111D.m849e(i2, 1);
            }
            if (i4 <= iM828l2) {
                return;
            }
            if (this.f1130z) {
                iM828l1 = m827k1();
            } else {
                iM828l1 = m828l1();
            }
            if (i5 <= iM828l1) {
                m727L0();
            }
        }
        i4 = i + i2;
        i5 = i;
        this.f1111D.m848d(i5);
        if (i3 != 1) {
            this.f1111D.m849e(i, i2);
        } else if (i3 != 2) {
            this.f1111D.m850f(i, i2);
        } else if (i3 == 8) {
            this.f1111D.m850f(i, 1);
            this.f1111D.m849e(i2, 1);
        }
        if (i4 <= iM828l2) {
            return;
        }
        if (this.f1130z) {
            iM828l1 = m827k1();
        } else {
            iM828l1 = m828l1();
        }
        if (i5 <= iM828l1) {
            m727L0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: p */
    public int mo496p(RecyclerView.C0172y c0172y) {
        return m821e1(c0172y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: p0 */
    public void mo497p0(RecyclerView recyclerView, int i, int i2) {
        m831o1(i, i2, 1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX INFO: renamed from: p1 */
    public View m832p1() {
        int i;
        boolean z;
        boolean z2;
        int iM764y = m764y() - 1;
        BitSet bitSet = new BitSet(this.f1122r);
        bitSet.set(0, this.f1122r, true);
        byte b = (this.f1126v == 1 && m833q1()) ? (byte) 1 : (byte) -1;
        if (this.f1130z) {
            i = -1;
        } else {
            i = iM764y + 1;
            iM764y = 0;
        }
        int i2 = iM764y < i ? 1 : -1;
        while (iM764y != i) {
            View viewM762x = m762x(iM764y);
            C0176c c0176c = (C0176c) viewM762x.getLayoutParams();
            if (bitSet.get(c0176c.f1139e.f1160e)) {
                C0179f c0179f = c0176c.f1139e;
                if (this.f1130z) {
                    int i3 = c0179f.f1158c;
                    if (i3 == Integer.MIN_VALUE) {
                        c0179f.m852b();
                        i3 = c0179f.f1158c;
                    }
                    if (i3 < this.f1124t.mo17068g()) {
                        ArrayList<View> arrayList = c0179f.f1156a;
                        Objects.requireNonNull(c0179f.m860j(arrayList.get(arrayList.size() - 1)));
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    int i4 = c0179f.f1157b;
                    if (i4 == Integer.MIN_VALUE) {
                        c0179f.m853c();
                        i4 = c0179f.f1157b;
                    }
                    if (i4 > this.f1124t.mo17072k()) {
                        Objects.requireNonNull(c0179f.m860j(c0179f.f1156a.get(0)));
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    return viewM762x;
                }
                bitSet.clear(c0176c.f1139e.f1160e);
            }
            int i5 = iM764y + i2;
            if (i5 != i) {
                View viewM762x2 = m762x(i5);
                if (this.f1130z) {
                    int iMo17063b = this.f1124t.mo17063b(viewM762x);
                    int iMo17063b2 = this.f1124t.mo17063b(viewM762x2);
                    if (iMo17063b < iMo17063b2) {
                        return viewM762x;
                    }
                    if (iMo17063b == iMo17063b2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    int iMo17066e = this.f1124t.mo17066e(viewM762x);
                    int iMo17066e2 = this.f1124t.mo17066e(viewM762x2);
                    if (iMo17066e > iMo17066e2) {
                        return viewM762x;
                    }
                    if (iMo17066e == iMo17066e2) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    if ((c0176c.f1139e.f1160e - ((C0176c) viewM762x2.getLayoutParams()).f1139e.f1160e < 0) != (b < 0)) {
                        return viewM762x;
                    }
                } else {
                    continue;
                }
            }
            iM764y += i2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: q0 */
    public void mo498q0(RecyclerView recyclerView) {
        this.f1111D.m845a();
        m727L0();
    }

    /* JADX INFO: renamed from: q1 */
    public boolean m833q1() {
        return m724K() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: r0 */
    public void mo500r0(RecyclerView recyclerView, int i, int i2, int i3) {
        m831o1(i, i2, 8);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m834r1(View view, int i, int i2, boolean z) {
        Rect rect = this.f1117J;
        RecyclerView recyclerView = this.f1036b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.m583L(view));
        }
        C0176c c0176c = (C0176c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0176c).leftMargin;
        Rect rect2 = this.f1117J;
        int iM816F1 = m816F1(i, i3 + rect2.left, ((ViewGroup.MarginLayoutParams) c0176c).rightMargin + rect2.right);
        int i4 = ((ViewGroup.MarginLayoutParams) c0176c).topMargin;
        Rect rect3 = this.f1117J;
        int iM816F2 = m816F1(i2, i4 + rect3.top, ((ViewGroup.MarginLayoutParams) c0176c).bottomMargin + rect3.bottom);
        if (z ? m741W0(view, iM816F1, iM816F2, c0176c) : m739U0(view, iM816F1, iM816F2, c0176c)) {
            view.measure(iM816F1, iM816F2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: s0 */
    public void mo501s0(RecyclerView recyclerView, int i, int i2) {
        m831o1(i, i2, 2);
    }

    /* JADX WARN: Code duplicated, block: B:248:0x041a  */
    /* JADX INFO: renamed from: s1 */
    public final void m835s1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, boolean z) {
        boolean z2;
        C0178e c0178e;
        boolean z3;
        int iM735R;
        int i;
        C0175b c0175b = this.f1118K;
        if (!(this.f1115H == null && this.f1109B == -1) && c0172y.m809b() == 0) {
            m715F0(c0167t);
            c0175b.m844b();
            return;
        }
        boolean z4 = (c0175b.f1136e && this.f1109B == -1 && this.f1115H == null) ? false : true;
        if (z4) {
            c0175b.m844b();
            C0178e c0178e2 = this.f1115H;
            if (c0178e2 != null) {
                int i2 = c0178e2.f1148h;
                if (i2 > 0) {
                    if (i2 == this.f1122r) {
                        for (int i3 = 0; i3 < this.f1122r; i3++) {
                            this.f1123s[i3].m854d();
                            C0178e c0178e3 = this.f1115H;
                            int iMo17068g = c0178e3.f1149i[i3];
                            if (iMo17068g != Integer.MIN_VALUE) {
                                iMo17068g += c0178e3.f1154n ? this.f1124t.mo17068g() : this.f1124t.mo17072k();
                            }
                            C0179f c0179f = this.f1123s[i3];
                            c0179f.f1157b = iMo17068g;
                            c0179f.f1158c = iMo17068g;
                        }
                    } else {
                        c0178e2.f1149i = null;
                        c0178e2.f1148h = 0;
                        c0178e2.f1150j = 0;
                        c0178e2.f1151k = null;
                        c0178e2.f1152l = null;
                        c0178e2.f1146f = c0178e2.f1147g;
                    }
                }
                C0178e c0178e4 = this.f1115H;
                this.f1114G = c0178e4.f1155o;
                boolean z5 = c0178e4.f1153m;
                mo529d(null);
                C0178e c0178e5 = this.f1115H;
                if (c0178e5 != null && c0178e5.f1153m != z5) {
                    c0178e5.f1153m = z5;
                }
                this.f1129y = z5;
                m727L0();
                m841y1();
                C0178e c0178e6 = this.f1115H;
                int i4 = c0178e6.f1146f;
                if (i4 != -1) {
                    this.f1109B = i4;
                    c0175b.f1134c = c0178e6.f1154n;
                } else {
                    c0175b.f1134c = this.f1130z;
                }
                if (c0178e6.f1150j > 1) {
                    C0177d c0177d = this.f1111D;
                    c0177d.f1140a = c0178e6.f1151k;
                    c0177d.f1141b = c0178e6.f1152l;
                }
            } else {
                m841y1();
                c0175b.f1134c = this.f1130z;
            }
            if (c0172y.f1100g || (i = this.f1109B) == -1) {
                z3 = false;
            } else if (i < 0 || i >= c0172y.m809b()) {
                this.f1109B = -1;
                this.f1110C = Integer.MIN_VALUE;
                z3 = false;
            } else {
                C0178e c0178e7 = this.f1115H;
                if (c0178e7 == null || c0178e7.f1146f == -1 || c0178e7.f1148h < 1) {
                    View viewMo553t = mo553t(this.f1109B);
                    if (viewMo553t != null) {
                        c0175b.f1132a = this.f1130z ? m828l1() : m827k1();
                        if (this.f1110C != Integer.MIN_VALUE) {
                            if (c0175b.f1134c) {
                                c0175b.f1133b = (this.f1124t.mo17068g() - this.f1110C) - this.f1124t.mo17063b(viewMo553t);
                            } else {
                                c0175b.f1133b = (this.f1124t.mo17072k() + this.f1110C) - this.f1124t.mo17066e(viewMo553t);
                            }
                        } else if (this.f1124t.mo17064c(viewMo553t) > this.f1124t.mo17073l()) {
                            c0175b.f1133b = c0175b.f1134c ? this.f1124t.mo17068g() : this.f1124t.mo17072k();
                        } else {
                            int iMo17066e = this.f1124t.mo17066e(viewMo553t) - this.f1124t.mo17072k();
                            if (iMo17066e < 0) {
                                c0175b.f1133b = -iMo17066e;
                            } else {
                                int iMo17068g2 = this.f1124t.mo17068g() - this.f1124t.mo17063b(viewMo553t);
                                if (iMo17068g2 < 0) {
                                    c0175b.f1133b = iMo17068g2;
                                } else {
                                    c0175b.f1133b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i5 = this.f1109B;
                        c0175b.f1132a = i5;
                        int i6 = this.f1110C;
                        if (i6 == Integer.MIN_VALUE) {
                            c0175b.f1134c = m817a1(i5) == 1;
                            c0175b.m843a();
                        } else if (c0175b.f1134c) {
                            c0175b.f1133b = StaggeredGridLayoutManager.this.f1124t.mo17068g() - i6;
                        } else {
                            c0175b.f1133b = StaggeredGridLayoutManager.this.f1124t.mo17072k() + i6;
                        }
                        c0175b.f1135d = true;
                    }
                } else {
                    c0175b.f1133b = Integer.MIN_VALUE;
                    c0175b.f1132a = this.f1109B;
                }
                z3 = true;
            }
            if (!z3) {
                if (this.f1113F) {
                    int iM809b = c0172y.m809b();
                    int iM764y = m764y();
                    while (true) {
                        iM764y--;
                        if (iM764y < 0) {
                            iM735R = 0;
                            break;
                        }
                        iM735R = m735R(m762x(iM764y));
                        if (iM735R >= 0 && iM735R < iM809b) {
                            break;
                        }
                    }
                } else {
                    int iM809b2 = c0172y.m809b();
                    int iM764y2 = m764y();
                    int i7 = 0;
                    while (true) {
                        if (i7 >= iM764y2) {
                            iM735R = 0;
                            break;
                        }
                        int iM735R2 = m735R(m762x(i7));
                        if (iM735R2 >= 0 && iM735R2 < iM809b2) {
                            iM735R = iM735R2;
                            break;
                        }
                        i7++;
                    }
                }
                c0175b.f1132a = iM735R;
                c0175b.f1133b = Integer.MIN_VALUE;
            }
            c0175b.f1136e = true;
        }
        if (this.f1115H == null && this.f1109B == -1 && (c0175b.f1134c != this.f1113F || m833q1() != this.f1114G)) {
            this.f1111D.m845a();
            c0175b.f1135d = true;
        }
        if (m764y() > 0 && ((c0178e = this.f1115H) == null || c0178e.f1148h < 1)) {
            if (c0175b.f1135d) {
                for (int i8 = 0; i8 < this.f1122r; i8++) {
                    this.f1123s[i8].m854d();
                    int i9 = c0175b.f1133b;
                    if (i9 != Integer.MIN_VALUE) {
                        C0179f c0179f2 = this.f1123s[i8];
                        c0179f2.f1157b = i9;
                        c0179f2.f1158c = i9;
                    }
                }
            } else if (z4 || this.f1118K.f1137f == null) {
                for (int i10 = 0; i10 < this.f1122r; i10++) {
                    C0179f c0179f3 = this.f1123s[i10];
                    boolean z6 = this.f1130z;
                    int i11 = c0175b.f1133b;
                    int iM858h = z6 ? c0179f3.m858h(Integer.MIN_VALUE) : c0179f3.m861k(Integer.MIN_VALUE);
                    c0179f3.m854d();
                    if (iM858h != Integer.MIN_VALUE && ((!z6 || iM858h >= StaggeredGridLayoutManager.this.f1124t.mo17068g()) && (z6 || iM858h <= StaggeredGridLayoutManager.this.f1124t.mo17072k()))) {
                        if (i11 != Integer.MIN_VALUE) {
                            iM858h += i11;
                        }
                        c0179f3.f1158c = iM858h;
                        c0179f3.f1157b = iM858h;
                    }
                }
                C0175b c0175b2 = this.f1118K;
                C0179f[] c0179fArr = this.f1123s;
                Objects.requireNonNull(c0175b2);
                int length = c0179fArr.length;
                int[] iArr = c0175b2.f1137f;
                if (iArr == null || iArr.length < length) {
                    c0175b2.f1137f = new int[StaggeredGridLayoutManager.this.f1123s.length];
                }
                for (int i12 = 0; i12 < length; i12++) {
                    c0175b2.f1137f[i12] = c0179fArr[i12].m861k(Integer.MIN_VALUE);
                }
            } else {
                for (int i13 = 0; i13 < this.f1122r; i13++) {
                    C0179f c0179f4 = this.f1123s[i13];
                    c0179f4.m854d();
                    int i14 = this.f1118K.f1137f[i13];
                    c0179f4.f1157b = i14;
                    c0179f4.f1158c = i14;
                }
            }
        }
        m758q(c0167t);
        this.f1128x.f39320a = false;
        int iMo17073l = this.f1125u.mo17073l();
        this.f1127w = iMo17073l / this.f1122r;
        this.f1116I = View.MeasureSpec.makeMeasureSpec(iMo17073l, this.f1125u.mo17070i());
        m814D1(c0175b.f1132a, c0172y);
        if (c0175b.f1134c) {
            m811A1(-1);
            m822f1(c0167t, this.f1128x, c0172y);
            m811A1(1);
            LayoutState layoutState = this.f1128x;
            layoutState.f39322c = c0175b.f1132a + layoutState.f39323d;
            m822f1(c0167t, layoutState, c0172y);
        } else {
            m811A1(1);
            m822f1(c0167t, this.f1128x, c0172y);
            m811A1(-1);
            LayoutState layoutState2 = this.f1128x;
            layoutState2.f39322c = c0175b.f1132a + layoutState2.f39323d;
            m822f1(c0167t, layoutState2, c0172y);
        }
        if (this.f1125u.mo17070i() != 1073741824) {
            float fMax = 0.0f;
            int iM764y3 = m764y();
            for (int i15 = 0; i15 < iM764y3; i15++) {
                View viewM762x = m762x(i15);
                float fMo17064c = this.f1125u.mo17064c(viewM762x);
                if (fMo17064c >= fMax) {
                    Objects.requireNonNull((C0176c) viewM762x.getLayoutParams());
                    fMax = Math.max(fMax, fMo17064c);
                }
            }
            int i16 = this.f1127w;
            int iRound = Math.round(fMax * this.f1122r);
            if (this.f1125u.mo17070i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f1125u.mo17073l());
            }
            this.f1127w = iRound / this.f1122r;
            this.f1116I = View.MeasureSpec.makeMeasureSpec(iRound, this.f1125u.mo17070i());
            if (this.f1127w != i16) {
                for (int i17 = 0; i17 < iM764y3; i17++) {
                    View viewM762x2 = m762x(i17);
                    C0176c c0176c = (C0176c) viewM762x2.getLayoutParams();
                    Objects.requireNonNull(c0176c);
                    if (m833q1() && this.f1126v == 1) {
                        int i18 = this.f1122r;
                        int i19 = c0176c.f1139e.f1160e;
                        viewM762x2.offsetLeftAndRight(((-((i18 - 1) - i19)) * this.f1127w) - ((-((i18 - 1) - i19)) * i16));
                    } else {
                        int i20 = c0176c.f1139e.f1160e;
                        int i21 = this.f1127w * i20;
                        int i22 = i20 * i16;
                        if (this.f1126v == 1) {
                            viewM762x2.offsetLeftAndRight(i21 - i22);
                        } else {
                            viewM762x2.offsetTopAndBottom(i21 - i22);
                        }
                    }
                }
            }
        }
        if (m764y() > 0) {
            if (this.f1130z) {
                m825i1(c0167t, c0172y, true);
                m826j1(c0167t, c0172y, false);
            } else {
                m826j1(c0167t, c0172y, true);
                m825i1(c0167t, c0172y, false);
            }
        }
        if (z && !c0172y.f1100g) {
            if ((this.f1112E == 0 || m764y() <= 0 || m832p1() == null) ? false : true) {
                Runnable runnable = this.f1121N;
                RecyclerView recyclerView = this.f1036b;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(runnable);
                }
                z2 = m818b1();
            }
        }
        if (c0172y.f1100g) {
            this.f1118K.m844b();
        }
        this.f1113F = c0175b.f1134c;
        this.f1114G = m833q1();
        if (z2) {
            this.f1118K.m844b();
            m835s1(c0167t, c0172y, false);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final boolean m836t1(int i) {
        if (this.f1126v == 0) {
            return (i == -1) != this.f1130z;
        }
        return ((i == -1) == this.f1130z) == m833q1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: u */
    public RecyclerView.C0161n mo502u() {
        return this.f1126v == 0 ? new C0176c(-2, -1) : new C0176c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: u0 */
    public void mo503u0(RecyclerView recyclerView, int i, int i2, Object obj) {
        m831o1(i, i2, 4);
    }

    /* JADX INFO: renamed from: u1 */
    public void m837u1(int i, RecyclerView.C0172y c0172y) {
        int iM827k1;
        int i2;
        if (i > 0) {
            iM827k1 = m828l1();
            i2 = 1;
        } else {
            iM827k1 = m827k1();
            i2 = -1;
        }
        this.f1128x.f39320a = true;
        m814D1(iM827k1, c0172y);
        m811A1(i2);
        LayoutState layoutState = this.f1128x;
        layoutState.f39322c = iM827k1 + layoutState.f39323d;
        layoutState.f39321b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: v */
    public RecyclerView.C0161n mo504v(Context context, AttributeSet attributeSet) {
        return new C0176c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: v0 */
    public void mo505v0(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        m835s1(c0167t, c0172y, true);
    }

    /* JADX INFO: renamed from: v1 */
    public final void m838v1(RecyclerView.C0167t c0167t, LayoutState layoutState) {
        int iMin;
        if (!layoutState.f39320a || layoutState.f39328i) {
            return;
        }
        if (layoutState.f39321b == 0) {
            if (layoutState.f39324e == -1) {
                m839w1(c0167t, layoutState.f39326g);
                return;
            } else {
                m840x1(c0167t, layoutState.f39325f);
                return;
            }
        }
        int i = 1;
        if (layoutState.f39324e == -1) {
            int i2 = layoutState.f39325f;
            int iM861k = this.f1123s[0].m861k(i2);
            while (i < this.f1122r) {
                int iM861k2 = this.f1123s[i].m861k(i2);
                if (iM861k2 > iM861k) {
                    iM861k = iM861k2;
                }
                i++;
            }
            int i3 = i2 - iM861k;
            m839w1(c0167t, i3 < 0 ? layoutState.f39326g : layoutState.f39326g - Math.min(i3, layoutState.f39321b));
            return;
        }
        int i4 = layoutState.f39326g;
        int iM858h = this.f1123s[0].m858h(i4);
        while (i < this.f1122r) {
            int iM858h2 = this.f1123s[i].m858h(i4);
            if (iM858h2 < iM858h) {
                iM858h = iM858h2;
            }
            i++;
        }
        int i5 = iM858h - layoutState.f39326g;
        if (i5 < 0) {
            iMin = layoutState.f39325f;
        } else {
            iMin = Math.min(i5, layoutState.f39321b) + layoutState.f39325f;
        }
        m840x1(c0167t, iMin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: w */
    public RecyclerView.C0161n mo506w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0176c((ViewGroup.MarginLayoutParams) layoutParams) : new C0176c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: w0 */
    public void mo507w0(RecyclerView.C0172y c0172y) {
        this.f1109B = -1;
        this.f1110C = Integer.MIN_VALUE;
        this.f1115H = null;
        this.f1118K.m844b();
    }

    /* JADX INFO: renamed from: w1 */
    public final void m839w1(RecyclerView.C0167t c0167t, int i) {
        for (int iM764y = m764y() - 1; iM764y >= 0; iM764y--) {
            View viewM762x = m762x(iM764y);
            if (this.f1124t.mo17066e(viewM762x) < i || this.f1124t.mo17075o(viewM762x) < i) {
                return;
            }
            C0176c c0176c = (C0176c) viewM762x.getLayoutParams();
            Objects.requireNonNull(c0176c);
            if (c0176c.f1139e.f1156a.size() == 1) {
                return;
            }
            c0176c.f1139e.m862l();
            m719H0(viewM762x, c0167t);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m840x1(RecyclerView.C0167t c0167t, int i) {
        while (m764y() > 0) {
            View viewM762x = m762x(0);
            if (this.f1124t.mo17063b(viewM762x) > i || this.f1124t.mo17074n(viewM762x) > i) {
                return;
            }
            C0176c c0176c = (C0176c) viewM762x.getLayoutParams();
            Objects.requireNonNull(c0176c);
            if (c0176c.f1139e.f1156a.size() == 1) {
                return;
            }
            c0176c.f1139e.m863m();
            m719H0(viewM762x, c0167t);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final void m841y1() {
        if (this.f1126v == 1 || !m833q1()) {
            this.f1130z = this.f1129y;
        } else {
            this.f1130z = !this.f1129y;
        }
    }

    /* JADX INFO: renamed from: z1 */
    public int m842z1(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        if (m764y() == 0 || i == 0) {
            return 0;
        }
        m837u1(i, c0172y);
        int iM822f1 = m822f1(c0167t, this.f1128x, c0172y);
        if (this.f1128x.f39321b >= iM822f1) {
            i = i < 0 ? -iM822f1 : iM822f1;
        }
        this.f1124t.mo17076p(-i);
        this.f1113F = this.f1130z;
        LayoutState layoutState = this.f1128x;
        layoutState.f39321b = 0;
        m838v1(c0167t, layoutState);
        return i;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    public static class C0177d {

        /* JADX INFO: renamed from: a */
        public int[] f1140a;

        /* JADX INFO: renamed from: b */
        public List<a> f1141b;

        /* JADX INFO: renamed from: a */
        public void m845a() {
            int[] iArr = this.f1140a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1141b = null;
        }

        /* JADX INFO: renamed from: b */
        public void m846b(int i) {
            int[] iArr = this.f1140a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f1140a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f1140a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1140a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX INFO: renamed from: c */
        public a m847c(int i) {
            List<a> list = this.f1141b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1141b.get(size);
                if (aVar.f1142f == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x000e  */
        /* JADX INFO: renamed from: d */
        public int m848d(int i) {
            int i2;
            int[] iArr = this.f1140a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            if (this.f1141b != null) {
                a aVarM847c = m847c(i);
                if (aVarM847c != null) {
                    this.f1141b.remove(aVarM847c);
                }
                int size = this.f1141b.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        i3 = -1;
                        break;
                    }
                    if (this.f1141b.get(i3).f1142f >= i) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1) {
                    a aVar = this.f1141b.get(i3);
                    this.f1141b.remove(i3);
                    i2 = aVar.f1142f;
                } else {
                    i2 = -1;
                }
            } else {
                i2 = -1;
            }
            if (i2 == -1) {
                int[] iArr2 = this.f1140a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f1140a.length;
            }
            int iMin = Math.min(i2 + 1, this.f1140a.length);
            Arrays.fill(this.f1140a, i, iMin, -1);
            return iMin;
        }

        /* JADX INFO: renamed from: e */
        public void m849e(int i, int i2) {
            int[] iArr = this.f1140a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m846b(i3);
            int[] iArr2 = this.f1140a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f1140a, i, i3, -1);
            List<a> list = this.f1141b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1141b.get(size);
                int i4 = aVar.f1142f;
                if (i4 >= i) {
                    aVar.f1142f = i4 + i2;
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public void m850f(int i, int i2) {
            int[] iArr = this.f1140a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            m846b(i3);
            int[] iArr2 = this.f1140a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f1140a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<a> list = this.f1141b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1141b.get(size);
                int i4 = aVar.f1142f;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f1141b.remove(size);
                    } else {
                        aVar.f1142f = i4 - i2;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C8498a();

            /* JADX INFO: renamed from: f */
            public int f1142f;

            /* JADX INFO: renamed from: g */
            public int f1143g;

            /* JADX INFO: renamed from: h */
            public int[] f1144h;

            /* JADX INFO: renamed from: i */
            public boolean f1145i;

            /* JADX INFO: renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public class C8498a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(Parcel parcel) {
                this.f1142f = parcel.readInt();
                this.f1143g = parcel.readInt();
                this.f1145i = parcel.readInt() == 1;
                int i = parcel.readInt();
                if (i > 0) {
                    int[] iArr = new int[i];
                    this.f1144h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sbM1556G = outline.m1556G("FullSpanItem{mPosition=");
                sbM1556G.append(this.f1142f);
                sbM1556G.append(", mGapDir=");
                sbM1556G.append(this.f1143g);
                sbM1556G.append(", mHasUnwantedGapAfter=");
                sbM1556G.append(this.f1145i);
                sbM1556G.append(", mGapPerSpan=");
                sbM1556G.append(Arrays.toString(this.f1144h));
                sbM1556G.append('}');
                return sbM1556G.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1142f);
                parcel.writeInt(this.f1143g);
                parcel.writeInt(this.f1145i ? 1 : 0);
                int[] iArr = this.f1144h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f1144h);
                }
            }

            public a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f1122r = -1;
        this.f1129y = false;
        this.f1130z = false;
        this.f1109B = -1;
        this.f1110C = Integer.MIN_VALUE;
        this.f1111D = new C0177d();
        this.f1112E = 2;
        this.f1117J = new Rect();
        this.f1118K = new C0175b();
        this.f1119L = true;
        this.f1121N = new RunnableC0174a();
        this.f1126v = i2;
        m812B1(i);
        this.f1128x = new LayoutState();
        this.f1124t = OrientationHelper3.m17077a(this, this.f1126v);
        this.f1125u = OrientationHelper3.m17077a(this, 1 - this.f1126v);
    }
}
