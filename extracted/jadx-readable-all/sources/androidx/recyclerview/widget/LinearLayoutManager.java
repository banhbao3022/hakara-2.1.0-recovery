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
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p770y.p773v.C8462c;
import p636z0.p774z.p775b.GapWorker;
import p636z0.p774z.p775b.LinearSmoothScroller;
import p636z0.p774z.p775b.OrientationHelper3;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC0160m implements RecyclerView.AbstractC0171x.b {

    /* JADX INFO: renamed from: A */
    public int f871A;

    /* JADX INFO: renamed from: B */
    public C0145d f872B;

    /* JADX INFO: renamed from: C */
    public final C0142a f873C;

    /* JADX INFO: renamed from: D */
    public final C0143b f874D;

    /* JADX INFO: renamed from: E */
    public int f875E;

    /* JADX INFO: renamed from: F */
    public int[] f876F;

    /* JADX INFO: renamed from: r */
    public int f877r;

    /* JADX INFO: renamed from: s */
    public C0144c f878s;

    /* JADX INFO: renamed from: t */
    public OrientationHelper3 f879t;

    /* JADX INFO: renamed from: u */
    public boolean f880u;

    /* JADX INFO: renamed from: v */
    public boolean f881v;

    /* JADX INFO: renamed from: w */
    public boolean f882w;

    /* JADX INFO: renamed from: x */
    public boolean f883x;

    /* JADX INFO: renamed from: y */
    public boolean f884y;

    /* JADX INFO: renamed from: z */
    public int f885z;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C0142a {

        /* JADX INFO: renamed from: a */
        public OrientationHelper3 f886a;

        /* JADX INFO: renamed from: b */
        public int f887b;

        /* JADX INFO: renamed from: c */
        public int f888c;

        /* JADX INFO: renamed from: d */
        public boolean f889d;

        /* JADX INFO: renamed from: e */
        public boolean f890e;

        public C0142a() {
            m562d();
        }

        /* JADX INFO: renamed from: a */
        public void m559a() {
            this.f888c = this.f889d ? this.f886a.mo17068g() : this.f886a.mo17072k();
        }

        /* JADX INFO: renamed from: b */
        public void m560b(View view, int i) {
            if (this.f889d) {
                this.f888c = this.f886a.m17078m() + this.f886a.mo17063b(view);
            } else {
                this.f888c = this.f886a.mo17066e(view);
            }
            this.f887b = i;
        }

        /* JADX INFO: renamed from: c */
        public void m561c(View view, int i) {
            int iM17078m = this.f886a.m17078m();
            if (iM17078m >= 0) {
                m560b(view, i);
                return;
            }
            this.f887b = i;
            if (!this.f889d) {
                int iMo17066e = this.f886a.mo17066e(view);
                int iMo17072k = iMo17066e - this.f886a.mo17072k();
                this.f888c = iMo17066e;
                if (iMo17072k > 0) {
                    int iMo17068g = (this.f886a.mo17068g() - Math.min(0, (this.f886a.mo17068g() - iM17078m) - this.f886a.mo17063b(view))) - (this.f886a.mo17064c(view) + iMo17066e);
                    if (iMo17068g < 0) {
                        this.f888c -= Math.min(iMo17072k, -iMo17068g);
                        return;
                    }
                    return;
                }
                return;
            }
            int iMo17068g2 = (this.f886a.mo17068g() - iM17078m) - this.f886a.mo17063b(view);
            this.f888c = this.f886a.mo17068g() - iMo17068g2;
            if (iMo17068g2 > 0) {
                int iMo17064c = this.f888c - this.f886a.mo17064c(view);
                int iMo17072k2 = this.f886a.mo17072k();
                int iMin = iMo17064c - (Math.min(this.f886a.mo17066e(view) - iMo17072k2, 0) + iMo17072k2);
                if (iMin < 0) {
                    this.f888c = Math.min(iMo17068g2, -iMin) + this.f888c;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m562d() {
            this.f887b = -1;
            this.f888c = Integer.MIN_VALUE;
            this.f889d = false;
            this.f890e = false;
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("AnchorInfo{mPosition=");
            sbM1556G.append(this.f887b);
            sbM1556G.append(", mCoordinate=");
            sbM1556G.append(this.f888c);
            sbM1556G.append(", mLayoutFromEnd=");
            sbM1556G.append(this.f889d);
            sbM1556G.append(", mValid=");
            sbM1556G.append(this.f890e);
            sbM1556G.append('}');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C0143b {

        /* JADX INFO: renamed from: a */
        public int f891a;

        /* JADX INFO: renamed from: b */
        public boolean f892b;

        /* JADX INFO: renamed from: c */
        public boolean f893c;

        /* JADX INFO: renamed from: d */
        public boolean f894d;
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C0144c {

        /* JADX INFO: renamed from: b */
        public int f896b;

        /* JADX INFO: renamed from: c */
        public int f897c;

        /* JADX INFO: renamed from: d */
        public int f898d;

        /* JADX INFO: renamed from: e */
        public int f899e;

        /* JADX INFO: renamed from: f */
        public int f900f;

        /* JADX INFO: renamed from: g */
        public int f901g;

        /* JADX INFO: renamed from: j */
        public int f904j;

        /* JADX INFO: renamed from: l */
        public boolean f906l;

        /* JADX INFO: renamed from: a */
        public boolean f895a = true;

        /* JADX INFO: renamed from: h */
        public int f902h = 0;

        /* JADX INFO: renamed from: i */
        public int f903i = 0;

        /* JADX INFO: renamed from: k */
        public List<RecyclerView.AbstractC0149b0> f905k = null;

        /* JADX INFO: renamed from: a */
        public void m563a(View view) {
            int iM772a;
            int size = this.f905k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f905k.get(i2).f1003b;
                RecyclerView.C0161n c0161n = (RecyclerView.C0161n) view3.getLayoutParams();
                if (view3 != view && !c0161n.m774c() && (iM772a = (c0161n.m772a() - this.f898d) * this.f899e) >= 0 && iM772a < i) {
                    view2 = view3;
                    if (iM772a == 0) {
                        break;
                    } else {
                        i = iM772a;
                    }
                }
            }
            if (view2 == null) {
                this.f898d = -1;
            } else {
                this.f898d = ((RecyclerView.C0161n) view2.getLayoutParams()).m772a();
            }
        }

        /* JADX INFO: renamed from: b */
        public boolean m564b(RecyclerView.C0172y c0172y) {
            int i = this.f898d;
            return i >= 0 && i < c0172y.m809b();
        }

        /* JADX INFO: renamed from: c */
        public View m565c(RecyclerView.C0167t c0167t) {
            List<RecyclerView.AbstractC0149b0> list = this.f905k;
            if (list == null) {
                View view = c0167t.m794j(this.f898d, false, Long.MAX_VALUE).f1003b;
                this.f898d += this.f899e;
                return view;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f905k.get(i).f1003b;
                RecyclerView.C0161n c0161n = (RecyclerView.C0161n) view2.getLayoutParams();
                if (!c0161n.m774c() && this.f898d == c0161n.m772a()) {
                    m563a(view2);
                    return view2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    @SuppressLint({"BanParcelableUsage"})
    public static class C0145d implements Parcelable {
        public static final Parcelable.Creator<C0145d> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f907f;

        /* JADX INFO: renamed from: g */
        public int f908g;

        /* JADX INFO: renamed from: h */
        public boolean f909h;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public class a implements Parcelable.Creator<C0145d> {
            @Override // android.os.Parcelable.Creator
            public C0145d createFromParcel(Parcel parcel) {
                return new C0145d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0145d[] newArray(int i) {
                return new C0145d[i];
            }
        }

        public C0145d() {
        }

        /* JADX INFO: renamed from: a */
        public boolean m566a() {
            return this.f907f >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f907f);
            parcel.writeInt(this.f908g);
            parcel.writeInt(this.f909h ? 1 : 0);
        }

        public C0145d(Parcel parcel) {
            this.f907f = parcel.readInt();
            this.f908g = parcel.readInt();
            this.f909h = parcel.readInt() == 1;
        }

        public C0145d(C0145d c0145d) {
            this.f907f = c0145d.f907f;
            this.f908g = c0145d.f908g;
            this.f909h = c0145d.f909h;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: A0 */
    public void mo513A0(Parcelable parcelable) {
        if (parcelable instanceof C0145d) {
            C0145d c0145d = (C0145d) parcelable;
            this.f872B = c0145d;
            if (this.f885z != -1) {
                c0145d.f907f = -1;
            }
            m727L0();
        }
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m514A1() {
        return this.f879t.mo17070i() == 0 && this.f879t.mo17067f() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: B0 */
    public Parcelable mo515B0() {
        C0145d c0145d = this.f872B;
        if (c0145d != null) {
            return new C0145d(c0145d);
        }
        C0145d c0145d2 = new C0145d();
        if (m764y() > 0) {
            m535g1();
            boolean z = this.f880u ^ this.f882w;
            c0145d2.f909h = z;
            if (z) {
                View viewM554t1 = m554t1();
                c0145d2.f908g = this.f879t.mo17068g() - this.f879t.mo17063b(viewM554t1);
                c0145d2.f907f = m735R(viewM554t1);
            } else {
                View viewM555u1 = m555u1();
                c0145d2.f907f = m735R(viewM555u1);
                c0145d2.f908g = this.f879t.mo17066e(viewM555u1) - this.f879t.mo17072k();
            }
        } else {
            c0145d2.f907f = -1;
        }
        return c0145d2;
    }

    /* JADX INFO: renamed from: B1 */
    public final void m516B1() {
        if (this.f877r == 1 || !m556v1()) {
            this.f882w = this.f881v;
        } else {
            this.f882w = !this.f881v;
        }
    }

    /* JADX INFO: renamed from: C1 */
    public int m517C1(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        if (m764y() == 0 || i == 0) {
            return 0;
        }
        m535g1();
        this.f878s.f895a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m519F1(i2, iAbs, true, c0172y);
        C0144c c0144c = this.f878s;
        int iM537h1 = m537h1(c0167t, c0144c, c0172y, false) + c0144c.f901g;
        if (iM537h1 < 0) {
            return 0;
        }
        if (iAbs > iM537h1) {
            i = i2 * iM537h1;
        }
        this.f879t.mo17076p(-i);
        this.f878s.f904j = i;
        return i;
    }

    /* JADX INFO: renamed from: D1 */
    public void m518D1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(outline.m1590l("invalid orientation:", i));
        }
        mo529d(null);
        if (i != this.f877r || this.f879t == null) {
            OrientationHelper3 orientationHelper3M17077a = OrientationHelper3.m17077a(this, i);
            this.f879t = orientationHelper3M17077a;
            this.f873C.f886a = orientationHelper3M17077a;
            this.f877r = i;
            m727L0();
        }
    }

    /* JADX INFO: renamed from: E1 */
    public void mo473E1(boolean z) {
        mo529d(null);
        if (this.f883x == z) {
            return;
        }
        this.f883x = z;
        m727L0();
    }

    /* JADX INFO: renamed from: F1 */
    public final void m519F1(int i, int i2, boolean z, RecyclerView.C0172y c0172y) {
        int iMo17072k;
        this.f878s.f906l = m514A1();
        this.f878s.f900f = i;
        int[] iArr = this.f876F;
        iArr[0] = 0;
        iArr[1] = 0;
        mo527a1(c0172y, iArr);
        int iMax = Math.max(0, this.f876F[0]);
        int iMax2 = Math.max(0, this.f876F[1]);
        boolean z2 = i == 1;
        C0144c c0144c = this.f878s;
        int i3 = z2 ? iMax2 : iMax;
        c0144c.f902h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c0144c.f903i = iMax;
        if (z2) {
            c0144c.f902h = this.f879t.mo17069h() + i3;
            View viewM554t1 = m554t1();
            C0144c c0144c2 = this.f878s;
            c0144c2.f899e = this.f882w ? -1 : 1;
            int iM735R = m735R(viewM554t1);
            C0144c c0144c3 = this.f878s;
            c0144c2.f898d = iM735R + c0144c3.f899e;
            c0144c3.f896b = this.f879t.mo17063b(viewM554t1);
            iMo17072k = this.f879t.mo17063b(viewM554t1) - this.f879t.mo17068g();
        } else {
            View viewM555u1 = m555u1();
            C0144c c0144c4 = this.f878s;
            c0144c4.f902h = this.f879t.mo17072k() + c0144c4.f902h;
            C0144c c0144c5 = this.f878s;
            c0144c5.f899e = this.f882w ? 1 : -1;
            int iM735R2 = m735R(viewM555u1);
            C0144c c0144c6 = this.f878s;
            c0144c5.f898d = iM735R2 + c0144c6.f899e;
            c0144c6.f896b = this.f879t.mo17066e(viewM555u1);
            iMo17072k = (-this.f879t.mo17066e(viewM555u1)) + this.f879t.mo17072k();
        }
        C0144c c0144c7 = this.f878s;
        c0144c7.f897c = i2;
        if (z) {
            c0144c7.f897c = i2 - iMo17072k;
        }
        c0144c7.f901g = iMo17072k;
    }

    /* JADX INFO: renamed from: G1 */
    public final void m520G1(int i, int i2) {
        this.f878s.f897c = this.f879t.mo17068g() - i2;
        C0144c c0144c = this.f878s;
        c0144c.f899e = this.f882w ? -1 : 1;
        c0144c.f898d = i;
        c0144c.f900f = 1;
        c0144c.f896b = i2;
        c0144c.f901g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: H1 */
    public final void m521H1(int i, int i2) {
        this.f878s.f897c = i2 - this.f879t.mo17072k();
        C0144c c0144c = this.f878s;
        c0144c.f898d = i;
        c0144c.f899e = this.f882w ? 1 : -1;
        c0144c.f900f = -1;
        c0144c.f896b = i2;
        c0144c.f901g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: M0 */
    public int mo478M0(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        if (this.f877r == 1) {
            return 0;
        }
        return m517C1(i, c0167t, c0172y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: N0 */
    public void mo522N0(int i) {
        this.f885z = i;
        this.f871A = Integer.MIN_VALUE;
        C0145d c0145d = this.f872B;
        if (c0145d != null) {
            c0145d.f907f = -1;
        }
        m727L0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: O0 */
    public int mo481O0(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        if (this.f877r == 0) {
            return 0;
        }
        return m517C1(i, c0167t, c0172y);
    }

    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: V0 */
    public boolean mo523V0() {
        boolean z;
        if (this.f1049o != 1073741824 && this.f1048n != 1073741824) {
            int iM764y = m764y();
            for (int i = 0; i < iM764y; i++) {
                ViewGroup.LayoutParams layoutParams = m762x(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: W */
    public boolean mo524W() {
        return true;
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
        return this.f872B == null && this.f880u == this.f883x;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0171x.b
    /* JADX INFO: renamed from: a */
    public PointF mo526a(int i) {
        if (m764y() == 0) {
            return null;
        }
        int i2 = (i < m735R(m762x(0))) != this.f882w ? -1 : 1;
        return this.f877r == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    /* JADX INFO: renamed from: a1 */
    public void mo527a1(RecyclerView.C0172y c0172y, int[] iArr) {
        int i;
        int iMo17073l = c0172y.f1094a != -1 ? this.f879t.mo17073l() : 0;
        if (this.f878s.f900f == -1) {
            i = 0;
        } else {
            i = iMo17073l;
            iMo17073l = 0;
        }
        iArr[0] = iMo17073l;
        iArr[1] = i;
    }

    /* JADX INFO: renamed from: b1 */
    public void mo489b1(RecyclerView.C0172y c0172y, C0144c c0144c, RecyclerView.AbstractC0160m.c cVar) {
        int i = c0144c.f898d;
        if (i < 0 || i >= c0172y.m809b()) {
            return;
        }
        ((GapWorker.b) cVar).m17052a(i, Math.max(0, c0144c.f901g));
    }

    /* JADX INFO: renamed from: c1 */
    public final int m528c1(RecyclerView.C0172y c0172y) {
        if (m764y() == 0) {
            return 0;
        }
        m535g1();
        return C8462c.m16936c(c0172y, this.f879t, m544k1(!this.f884y, true), m542j1(!this.f884y, true), this, this.f884y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: d */
    public void mo529d(String str) {
        RecyclerView recyclerView;
        if (this.f872B != null || (recyclerView = this.f1036b) == null) {
            return;
        }
        recyclerView.m609i(str);
    }

    /* JADX INFO: renamed from: d1 */
    public final int m530d1(RecyclerView.C0172y c0172y) {
        if (m764y() == 0) {
            return 0;
        }
        m535g1();
        return C8462c.m16937d(c0172y, this.f879t, m544k1(!this.f884y, true), m542j1(!this.f884y, true), this, this.f884y, this.f882w);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: e */
    public boolean mo531e() {
        return this.f877r == 0;
    }

    /* JADX INFO: renamed from: e1 */
    public final int m532e1(RecyclerView.C0172y c0172y) {
        if (m764y() == 0) {
            return 0;
        }
        m535g1();
        return C8462c.m16938e(c0172y, this.f879t, m544k1(!this.f884y, true), m542j1(!this.f884y, true), this, this.f884y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: f */
    public boolean mo533f() {
        return this.f877r == 1;
    }

    /* JADX INFO: renamed from: f1 */
    public int m534f1(int i) {
        if (i == 1) {
            return (this.f877r != 1 && m556v1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f877r != 1 && m556v1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f877r == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f877r == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f877r == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f877r == 0 ? 1 : Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: g1 */
    public void m535g1() {
        if (this.f878s == null) {
            this.f878s = new C0144c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: h0 */
    public void mo536h0(RecyclerView recyclerView, RecyclerView.C0167t c0167t) {
        m753g0();
    }

    /* JADX INFO: renamed from: h1 */
    public int m537h1(RecyclerView.C0167t c0167t, C0144c c0144c, RecyclerView.C0172y c0172y, boolean z) {
        int i = c0144c.f897c;
        int i2 = c0144c.f901g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0144c.f901g = i2 + i;
            }
            m557y1(c0167t, c0144c);
        }
        int i3 = c0144c.f897c + c0144c.f902h;
        C0143b c0143b = this.f874D;
        while (true) {
            if ((!c0144c.f906l && i3 <= 0) || !c0144c.m564b(c0172y)) {
                break;
            }
            c0143b.f891a = 0;
            c0143b.f892b = false;
            c0143b.f893c = false;
            c0143b.f894d = false;
            mo508w1(c0167t, c0172y, c0144c, c0143b);
            if (!c0143b.f892b) {
                int i4 = c0144c.f896b;
                int i5 = c0143b.f891a;
                c0144c.f896b = (c0144c.f900f * i5) + i4;
                if (!c0143b.f893c || c0144c.f905k != null || !c0172y.f1100g) {
                    c0144c.f897c -= i5;
                    i3 -= i5;
                }
                int i6 = c0144c.f901g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    c0144c.f901g = i7;
                    int i8 = c0144c.f897c;
                    if (i8 < 0) {
                        c0144c.f901g = i7 + i8;
                    }
                    m557y1(c0167t, c0144c);
                }
                if (z && c0143b.f894d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0144c.f897c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: i */
    public void mo538i(int i, int i2, RecyclerView.C0172y c0172y, RecyclerView.AbstractC0160m.c cVar) {
        if (this.f877r != 0) {
            i = i2;
        }
        if (m764y() == 0 || i == 0) {
            return;
        }
        m535g1();
        m519F1(i > 0 ? 1 : -1, Math.abs(i), true, c0172y);
        mo489b1(c0172y, this.f878s, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: i0 */
    public View mo491i0(View view, int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        int iM534f1;
        View viewM549o1;
        m516B1();
        if (m764y() == 0 || (iM534f1 = m534f1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m535g1();
        m519F1(iM534f1, (int) (this.f879t.mo17073l() * 0.33333334f), false, c0172y);
        C0144c c0144c = this.f878s;
        c0144c.f901g = Integer.MIN_VALUE;
        c0144c.f895a = false;
        m537h1(c0167t, c0144c, c0172y, true);
        if (iM534f1 == -1) {
            viewM549o1 = this.f882w ? m549o1(m764y() - 1, -1) : m549o1(0, m764y());
        } else {
            viewM549o1 = this.f882w ? m549o1(0, m764y()) : m549o1(m764y() - 1, -1);
        }
        View viewM555u1 = iM534f1 == -1 ? m555u1() : m554t1();
        if (!viewM555u1.hasFocusable()) {
            return viewM549o1;
        }
        if (viewM549o1 == null) {
            return null;
        }
        return viewM555u1;
    }

    /* JADX INFO: renamed from: i1 */
    public int m539i1() {
        View viewM550p1 = m550p1(0, m764y(), true, false);
        if (viewM550p1 == null) {
            return -1;
        }
        return m735R(viewM550p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: j */
    public void mo540j(int i, RecyclerView.AbstractC0160m.c cVar) {
        boolean z;
        int i2;
        C0145d c0145d = this.f872B;
        if (c0145d == null || !c0145d.m566a()) {
            m516B1();
            z = this.f882w;
            i2 = this.f885z;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            C0145d c0145d2 = this.f872B;
            z = c0145d2.f909h;
            i2 = c0145d2.f907f;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.f875E && i2 >= 0 && i2 < i; i4++) {
            ((GapWorker.b) cVar).m17052a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: j0 */
    public void mo541j0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.C0167t c0167t = this.f1036b.f965m;
        m754k0(accessibilityEvent);
        if (m764y() > 0) {
            accessibilityEvent.setFromIndex(m545l1());
            accessibilityEvent.setToIndex(m548n1());
        }
    }

    /* JADX INFO: renamed from: j1 */
    public View m542j1(boolean z, boolean z2) {
        return this.f882w ? m550p1(0, m764y(), z, z2) : m550p1(m764y() - 1, -1, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: k */
    public int mo543k(RecyclerView.C0172y c0172y) {
        return m528c1(c0172y);
    }

    /* JADX INFO: renamed from: k1 */
    public View m544k1(boolean z, boolean z2) {
        return this.f882w ? m550p1(m764y() - 1, -1, z, z2) : m550p1(0, m764y(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: l */
    public int mo492l(RecyclerView.C0172y c0172y) {
        return m530d1(c0172y);
    }

    /* JADX INFO: renamed from: l1 */
    public int m545l1() {
        View viewM550p1 = m550p1(0, m764y(), false, true);
        if (viewM550p1 == null) {
            return -1;
        }
        return m735R(viewM550p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: m */
    public int mo493m(RecyclerView.C0172y c0172y) {
        return m532e1(c0172y);
    }

    /* JADX INFO: renamed from: m1 */
    public int m546m1() {
        View viewM550p1 = m550p1(m764y() - 1, -1, true, false);
        if (viewM550p1 == null) {
            return -1;
        }
        return m735R(viewM550p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: n */
    public int mo547n(RecyclerView.C0172y c0172y) {
        return m528c1(c0172y);
    }

    /* JADX INFO: renamed from: n1 */
    public int m548n1() {
        View viewM550p1 = m550p1(m764y() - 1, -1, false, true);
        if (viewM550p1 == null) {
            return -1;
        }
        return m735R(viewM550p1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: o */
    public int mo495o(RecyclerView.C0172y c0172y) {
        return m530d1(c0172y);
    }

    /* JADX INFO: renamed from: o1 */
    public View m549o1(int i, int i2) {
        byte b;
        int i3;
        int i4;
        m535g1();
        if (i2 > i) {
            b = 1;
        } else {
            b = i2 < i ? (byte) -1 : (byte) 0;
        }
        if (b == 0) {
            return m762x(i);
        }
        if (this.f879t.mo17066e(m762x(i)) < this.f879t.mo17072k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return this.f877r == 0 ? this.f1039e.m17021a(i, i2, i3, i4) : this.f1040f.m17021a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: p */
    public int mo496p(RecyclerView.C0172y c0172y) {
        return m532e1(c0172y);
    }

    /* JADX INFO: renamed from: p1 */
    public View m550p1(int i, int i2, boolean z, boolean z2) {
        m535g1();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        return this.f877r == 0 ? this.f1039e.m17021a(i, i2, i3, i4) : this.f1040f.m17021a(i, i2, i3, i4);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX INFO: renamed from: q1 */
    public View mo499q1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, boolean z, boolean z2) {
        int iM764y;
        int i;
        m535g1();
        int iM764y2 = m764y();
        int i2 = -1;
        if (z2) {
            iM764y = m764y() - 1;
            i = -1;
        } else {
            i2 = iM764y2;
            iM764y = 0;
            i = 1;
        }
        int iM809b = c0172y.m809b();
        int iMo17072k = this.f879t.mo17072k();
        int iMo17068g = this.f879t.mo17068g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM764y != i2) {
            View viewM762x = m762x(iM764y);
            int iM735R = m735R(viewM762x);
            int iMo17066e = this.f879t.mo17066e(viewM762x);
            int iMo17063b = this.f879t.mo17063b(viewM762x);
            if (iM735R >= 0 && iM735R < iM809b) {
                if (!((RecyclerView.C0161n) viewM762x.getLayoutParams()).m774c()) {
                    boolean z3 = iMo17063b <= iMo17072k && iMo17066e < iMo17072k;
                    boolean z4 = iMo17066e >= iMo17068g && iMo17063b > iMo17068g;
                    if (!z3 && !z4) {
                        return viewM762x;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM762x;
                        } else if (view == null) {
                            view = viewM762x;
                        }
                    } else if (z3) {
                        view2 = viewM762x;
                    } else if (view == null) {
                        view = viewM762x;
                    }
                } else if (view3 == null) {
                    view3 = viewM762x;
                }
            }
            iM764y += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    /* JADX INFO: renamed from: r1 */
    public final int m551r1(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, boolean z) {
        int iMo17068g;
        int iMo17068g2 = this.f879t.mo17068g() - i;
        if (iMo17068g2 <= 0) {
            return 0;
        }
        int i2 = -m517C1(-iMo17068g2, c0167t, c0172y);
        int i3 = i + i2;
        if (!z || (iMo17068g = this.f879t.mo17068g() - i3) <= 0) {
            return i2;
        }
        this.f879t.mo17076p(iMo17068g);
        return iMo17068g + i2;
    }

    /* JADX INFO: renamed from: s1 */
    public final int m552s1(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, boolean z) {
        int iMo17072k;
        int iMo17072k2 = i - this.f879t.mo17072k();
        if (iMo17072k2 <= 0) {
            return 0;
        }
        int i2 = -m517C1(iMo17072k2, c0167t, c0172y);
        int i3 = i + i2;
        if (!z || (iMo17072k = i3 - this.f879t.mo17072k()) <= 0) {
            return i2;
        }
        this.f879t.mo17076p(-iMo17072k);
        return i2 - iMo17072k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: t */
    public View mo553t(int i) {
        int iM764y = m764y();
        if (iM764y == 0) {
            return null;
        }
        int iM735R = i - m735R(m762x(0));
        if (iM735R >= 0 && iM735R < iM764y) {
            View viewM762x = m762x(iM735R);
            if (m735R(viewM762x) == i) {
                return viewM762x;
            }
        }
        return super.mo553t(i);
    }

    /* JADX INFO: renamed from: t1 */
    public final View m554t1() {
        return m762x(this.f882w ? 0 : m764y() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: u */
    public RecyclerView.C0161n mo502u() {
        return new RecyclerView.C0161n(-2, -2);
    }

    /* JADX INFO: renamed from: u1 */
    public final View m555u1() {
        return m762x(this.f882w ? m764y() - 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x0201  */
    /* JADX WARN: Code duplicated, block: B:121:0x0205  */
    /* JADX WARN: Code duplicated, block: B:124:0x020a  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b7  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: v0 */
    public void mo505v0(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View viewMo499q1;
        int iMo17066e;
        int iMo17063b;
        int iMo17072k;
        int iMo17068g;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iM551r1;
        int i6;
        View viewMo553t;
        int iMo17066e2;
        int iMo17068g2;
        if (!(this.f872B == null && this.f885z == -1) && c0172y.m809b() == 0) {
            m715F0(c0167t);
            return;
        }
        C0145d c0145d = this.f872B;
        if (c0145d != null && c0145d.m566a()) {
            this.f885z = this.f872B.f907f;
        }
        m535g1();
        this.f878s.f895a = false;
        m516B1();
        View viewM720I = m720I();
        C0142a c0142a = this.f873C;
        if (!c0142a.f890e || this.f885z != -1 || this.f872B != null) {
            c0142a.m562d();
            C0142a c0142a2 = this.f873C;
            c0142a2.f889d = this.f882w ^ this.f883x;
            if (c0172y.f1100g || (i = this.f885z) == -1) {
                z = false;
            } else if (i < 0 || i >= c0172y.m809b()) {
                this.f885z = -1;
                this.f871A = Integer.MIN_VALUE;
                z = false;
            } else {
                c0142a2.f887b = this.f885z;
                C0145d c0145d2 = this.f872B;
                if (c0145d2 != null && c0145d2.m566a()) {
                    boolean z7 = this.f872B.f909h;
                    c0142a2.f889d = z7;
                    if (z7) {
                        c0142a2.f888c = this.f879t.mo17068g() - this.f872B.f908g;
                    } else {
                        c0142a2.f888c = this.f879t.mo17072k() + this.f872B.f908g;
                    }
                } else if (this.f871A == Integer.MIN_VALUE) {
                    View viewMo553t2 = mo553t(this.f885z);
                    if (viewMo553t2 == null) {
                        if (m764y() > 0) {
                            c0142a2.f889d = (this.f885z < m735R(m762x(0))) == this.f882w;
                        }
                        c0142a2.m559a();
                    } else if (this.f879t.mo17064c(viewMo553t2) > this.f879t.mo17073l()) {
                        c0142a2.m559a();
                    } else if (this.f879t.mo17066e(viewMo553t2) - this.f879t.mo17072k() < 0) {
                        c0142a2.f888c = this.f879t.mo17072k();
                        c0142a2.f889d = false;
                    } else if (this.f879t.mo17068g() - this.f879t.mo17063b(viewMo553t2) < 0) {
                        c0142a2.f888c = this.f879t.mo17068g();
                        c0142a2.f889d = true;
                    } else {
                        c0142a2.f888c = c0142a2.f889d ? this.f879t.m17078m() + this.f879t.mo17063b(viewMo553t2) : this.f879t.mo17066e(viewMo553t2);
                    }
                } else {
                    boolean z8 = this.f882w;
                    c0142a2.f889d = z8;
                    if (z8) {
                        c0142a2.f888c = this.f879t.mo17068g() - this.f871A;
                    } else {
                        c0142a2.f888c = this.f879t.mo17072k() + this.f871A;
                    }
                }
                z = true;
            }
            if (!z) {
                if (m764y() != 0) {
                    View viewM720I2 = m720I();
                    if (viewM720I2 != null) {
                        RecyclerView.C0161n c0161n = (RecyclerView.C0161n) viewM720I2.getLayoutParams();
                        if (!c0161n.m774c() && c0161n.m772a() >= 0 && c0161n.m772a() < c0172y.m809b()) {
                            c0142a2.m561c(viewM720I2, m735R(viewM720I2));
                        } else {
                            z3 = this.f880u;
                            z4 = this.f883x;
                            if (z3 == z4 && (viewMo499q1 = mo499q1(c0167t, c0172y, c0142a2.f889d, z4)) != null) {
                                c0142a2.m560b(viewMo499q1, m735R(viewMo499q1));
                                if (!c0172y.f1100g && mo488Z0()) {
                                    iMo17066e = this.f879t.mo17066e(viewMo499q1);
                                    iMo17063b = this.f879t.mo17063b(viewMo499q1);
                                    iMo17072k = this.f879t.mo17072k();
                                    iMo17068g = this.f879t.mo17068g();
                                    if (iMo17063b <= iMo17072k || iMo17066e >= iMo17072k) {
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (iMo17066e >= iMo17068g || iMo17063b <= iMo17068g) {
                                        z6 = false;
                                    } else {
                                        z6 = true;
                                    }
                                    if (z5 || z6) {
                                        if (c0142a2.f889d) {
                                            iMo17072k = iMo17068g;
                                        }
                                        c0142a2.f888c = iMo17072k;
                                    }
                                }
                            } else {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    } else {
                        z3 = this.f880u;
                        z4 = this.f883x;
                        if (z3 == z4) {
                            c0142a2.m560b(viewMo499q1, m735R(viewMo499q1));
                            if (!c0172y.f1100g) {
                                iMo17066e = this.f879t.mo17066e(viewMo499q1);
                                iMo17063b = this.f879t.mo17063b(viewMo499q1);
                                iMo17072k = this.f879t.mo17072k();
                                iMo17068g = this.f879t.mo17068g();
                                if (iMo17063b <= iMo17072k) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (iMo17066e >= iMo17068g) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                if (z5) {
                                    if (c0142a2.f889d) {
                                        iMo17072k = iMo17068g;
                                    }
                                    c0142a2.f888c = iMo17072k;
                                } else {
                                    if (c0142a2.f889d) {
                                        iMo17072k = iMo17068g;
                                    }
                                    c0142a2.f888c = iMo17072k;
                                }
                            }
                            z2 = true;
                        }
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    c0142a2.m559a();
                    c0142a2.f887b = this.f883x ? c0172y.m809b() - 1 : 0;
                }
            }
            this.f873C.f890e = true;
        } else if (viewM720I != null && (this.f879t.mo17066e(viewM720I) >= this.f879t.mo17068g() || this.f879t.mo17063b(viewM720I) <= this.f879t.mo17072k())) {
            this.f873C.m561c(viewM720I, m735R(viewM720I));
        }
        C0144c c0144c = this.f878s;
        c0144c.f900f = c0144c.f904j >= 0 ? 1 : -1;
        int[] iArr = this.f876F;
        iArr[0] = 0;
        iArr[1] = 0;
        mo527a1(c0172y, iArr);
        int iMo17072k2 = this.f879t.mo17072k() + Math.max(0, this.f876F[0]);
        int iMo17069h = this.f879t.mo17069h() + Math.max(0, this.f876F[1]);
        if (c0172y.f1100g && (i6 = this.f885z) != -1 && this.f871A != Integer.MIN_VALUE && (viewMo553t = mo553t(i6)) != null) {
            if (this.f882w) {
                iMo17068g2 = this.f879t.mo17068g() - this.f879t.mo17063b(viewMo553t);
                iMo17066e2 = this.f871A;
            } else {
                iMo17066e2 = this.f879t.mo17066e(viewMo553t) - this.f879t.mo17072k();
                iMo17068g2 = this.f871A;
            }
            int i7 = iMo17068g2 - iMo17066e2;
            if (i7 > 0) {
                iMo17072k2 += i7;
            } else {
                iMo17069h -= i7;
            }
        }
        C0142a c0142a3 = this.f873C;
        mo509x1(c0167t, c0172y, c0142a3, (!c0142a3.f889d ? this.f882w : !this.f882w) ? 1 : -1);
        m758q(c0167t);
        this.f878s.f906l = m514A1();
        Objects.requireNonNull(this.f878s);
        this.f878s.f903i = 0;
        C0142a c0142a4 = this.f873C;
        if (c0142a4.f889d) {
            m521H1(c0142a4.f887b, c0142a4.f888c);
            C0144c c0144c2 = this.f878s;
            c0144c2.f902h = iMo17072k2;
            m537h1(c0167t, c0144c2, c0172y, false);
            C0144c c0144c3 = this.f878s;
            i3 = c0144c3.f896b;
            int i8 = c0144c3.f898d;
            int i9 = c0144c3.f897c;
            if (i9 > 0) {
                iMo17069h += i9;
            }
            C0142a c0142a5 = this.f873C;
            m520G1(c0142a5.f887b, c0142a5.f888c);
            C0144c c0144c4 = this.f878s;
            c0144c4.f902h = iMo17069h;
            c0144c4.f898d += c0144c4.f899e;
            m537h1(c0167t, c0144c4, c0172y, false);
            C0144c c0144c5 = this.f878s;
            i2 = c0144c5.f896b;
            int i10 = c0144c5.f897c;
            if (i10 > 0) {
                m521H1(i8, i3);
                C0144c c0144c6 = this.f878s;
                c0144c6.f902h = i10;
                m537h1(c0167t, c0144c6, c0172y, false);
                i3 = this.f878s.f896b;
            }
        } else {
            m520G1(c0142a4.f887b, c0142a4.f888c);
            C0144c c0144c7 = this.f878s;
            c0144c7.f902h = iMo17069h;
            m537h1(c0167t, c0144c7, c0172y, false);
            C0144c c0144c8 = this.f878s;
            i2 = c0144c8.f896b;
            int i11 = c0144c8.f898d;
            int i12 = c0144c8.f897c;
            if (i12 > 0) {
                iMo17072k2 += i12;
            }
            C0142a c0142a6 = this.f873C;
            m521H1(c0142a6.f887b, c0142a6.f888c);
            C0144c c0144c9 = this.f878s;
            c0144c9.f902h = iMo17072k2;
            c0144c9.f898d += c0144c9.f899e;
            m537h1(c0167t, c0144c9, c0172y, false);
            C0144c c0144c10 = this.f878s;
            i3 = c0144c10.f896b;
            int i13 = c0144c10.f897c;
            if (i13 > 0) {
                m520G1(i11, i2);
                C0144c c0144c11 = this.f878s;
                c0144c11.f902h = i13;
                m537h1(c0167t, c0144c11, c0172y, false);
                i2 = this.f878s.f896b;
            }
        }
        if (m764y() > 0) {
            if (this.f882w ^ this.f883x) {
                int iM551r2 = m551r1(i2, c0167t, c0172y, true);
                i4 = i3 + iM551r2;
                i5 = i2 + iM551r2;
                iM551r1 = m552s1(i4, c0167t, c0172y, false);
            } else {
                int iM552s1 = m552s1(i3, c0167t, c0172y, true);
                i4 = i3 + iM552s1;
                i5 = i2 + iM552s1;
                iM551r1 = m551r1(i5, c0167t, c0172y, false);
            }
            i3 = i4 + iM551r1;
            i2 = i5 + iM551r1;
        }
        if (c0172y.f1104k && m764y() != 0 && !c0172y.f1100g && mo488Z0()) {
            List<RecyclerView.AbstractC0149b0> list = c0167t.f1071d;
            int size = list.size();
            int iM735R = m735R(m762x(0));
            int iMo17064c = 0;
            int iMo17064c2 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView.AbstractC0149b0 abstractC0149b0 = list.get(i14);
                if (!abstractC0149b0.m651m()) {
                    if (((abstractC0149b0.m644f() < iM735R) != this.f882w ? (byte) -1 : (byte) 1) == -1) {
                        iMo17064c += this.f879t.mo17064c(abstractC0149b0.f1003b);
                    } else {
                        iMo17064c2 += this.f879t.mo17064c(abstractC0149b0.f1003b);
                    }
                }
            }
            this.f878s.f905k = list;
            if (iMo17064c > 0) {
                m521H1(m735R(m555u1()), i3);
                C0144c c0144c12 = this.f878s;
                c0144c12.f902h = iMo17064c;
                c0144c12.f897c = 0;
                c0144c12.m563a(null);
                m537h1(c0167t, this.f878s, c0172y, false);
            }
            if (iMo17064c2 > 0) {
                m520G1(m735R(m554t1()), i2);
                C0144c c0144c13 = this.f878s;
                c0144c13.f902h = iMo17064c2;
                c0144c13.f897c = 0;
                c0144c13.m563a(null);
                m537h1(c0167t, this.f878s, c0172y, false);
            }
            this.f878s.f905k = null;
        }
        if (c0172y.f1100g) {
            this.f873C.m562d();
        } else {
            OrientationHelper3 orientationHelper3 = this.f879t;
            orientationHelper3.f39344b = orientationHelper3.mo17073l();
        }
        this.f880u = this.f883x;
    }

    /* JADX INFO: renamed from: v1 */
    public boolean m556v1() {
        return m724K() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: w0 */
    public void mo507w0(RecyclerView.C0172y c0172y) {
        this.f872B = null;
        this.f885z = -1;
        this.f871A = Integer.MIN_VALUE;
        this.f873C.m562d();
    }

    /* JADX INFO: renamed from: w1 */
    public void mo508w1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, C0144c c0144c, C0143b c0143b) {
        int i;
        int i2;
        int i3;
        int iM730O;
        int iMo17065d;
        View viewM565c = c0144c.m565c(c0167t);
        if (viewM565c == null) {
            c0143b.f892b = true;
            return;
        }
        RecyclerView.C0161n c0161n = (RecyclerView.C0161n) viewM565c.getLayoutParams();
        if (c0144c.f905k == null) {
            if (this.f882w == (c0144c.f900f == -1)) {
                m748c(viewM565c, -1, false);
            } else {
                m748c(viewM565c, 0, false);
            }
        } else {
            if (this.f882w == (c0144c.f900f == -1)) {
                m748c(viewM565c, -1, true);
            } else {
                m748c(viewM565c, 0, true);
            }
        }
        RecyclerView.C0161n c0161n2 = (RecyclerView.C0161n) viewM565c.getLayoutParams();
        Rect rectM583L = this.f1036b.m583L(viewM565c);
        int i4 = rectM583L.left + rectM583L.right + 0;
        int i5 = rectM583L.top + rectM583L.bottom + 0;
        int iM706z = RecyclerView.AbstractC0160m.m706z(this.f1050p, this.f1048n, m731P() + m730O() + ((ViewGroup.MarginLayoutParams) c0161n2).leftMargin + ((ViewGroup.MarginLayoutParams) c0161n2).rightMargin + i4, ((ViewGroup.MarginLayoutParams) c0161n2).width, mo531e());
        int iM706z2 = RecyclerView.AbstractC0160m.m706z(this.f1051q, this.f1049o, m729N() + m733Q() + ((ViewGroup.MarginLayoutParams) c0161n2).topMargin + ((ViewGroup.MarginLayoutParams) c0161n2).bottomMargin + i5, ((ViewGroup.MarginLayoutParams) c0161n2).height, mo533f());
        if (m739U0(viewM565c, iM706z, iM706z2, c0161n2)) {
            viewM565c.measure(iM706z, iM706z2);
        }
        c0143b.f891a = this.f879t.mo17064c(viewM565c);
        if (this.f877r == 1) {
            if (m556v1()) {
                iMo17065d = this.f1050p - m731P();
                iM730O = iMo17065d - this.f879t.mo17065d(viewM565c);
            } else {
                iM730O = m730O();
                iMo17065d = this.f879t.mo17065d(viewM565c) + iM730O;
            }
            if (c0144c.f900f == -1) {
                int i6 = c0144c.f896b;
                i3 = i6;
                i2 = iMo17065d;
                i = i6 - c0143b.f891a;
            } else {
                int i7 = c0144c.f896b;
                i = i7;
                i2 = iMo17065d;
                i3 = c0143b.f891a + i7;
            }
        } else {
            int iM733Q = m733Q();
            int iMo17065d2 = this.f879t.mo17065d(viewM565c) + iM733Q;
            if (c0144c.f900f == -1) {
                int i8 = c0144c.f896b;
                i2 = i8;
                i = iM733Q;
                i3 = iMo17065d2;
                iM730O = i8 - c0143b.f891a;
            } else {
                int i9 = c0144c.f896b;
                i = iM733Q;
                i2 = c0143b.f891a + i9;
                i3 = iMo17065d2;
                iM730O = i9;
            }
        }
        m745a0(viewM565c, iM730O, i, i2, i3);
        if (c0161n.m774c() || c0161n.m773b()) {
            c0143b.f893c = true;
        }
        c0143b.f894d = viewM565c.hasFocusable();
    }

    /* JADX INFO: renamed from: x1 */
    public void mo509x1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, C0142a c0142a, int i) {
    }

    /* JADX INFO: renamed from: y1 */
    public final void m557y1(RecyclerView.C0167t c0167t, C0144c c0144c) {
        if (!c0144c.f895a || c0144c.f906l) {
            return;
        }
        int i = c0144c.f901g;
        int i2 = c0144c.f903i;
        if (c0144c.f900f == -1) {
            int iM764y = m764y();
            if (i < 0) {
                return;
            }
            int iMo17067f = (this.f879t.mo17067f() - i) + i2;
            if (this.f882w) {
                for (int i3 = 0; i3 < iM764y; i3++) {
                    View viewM762x = m762x(i3);
                    if (this.f879t.mo17066e(viewM762x) < iMo17067f || this.f879t.mo17075o(viewM762x) < iMo17067f) {
                        m558z1(c0167t, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM764y - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM762x2 = m762x(i5);
                if (this.f879t.mo17066e(viewM762x2) < iMo17067f || this.f879t.mo17075o(viewM762x2) < iMo17067f) {
                    m558z1(c0167t, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i6 = i - i2;
        int iM764y2 = m764y();
        if (!this.f882w) {
            for (int i7 = 0; i7 < iM764y2; i7++) {
                View viewM762x3 = m762x(i7);
                if (this.f879t.mo17063b(viewM762x3) > i6 || this.f879t.mo17074n(viewM762x3) > i6) {
                    m558z1(c0167t, 0, i7);
                    return;
                }
            }
            return;
        }
        int i8 = iM764y2 - 1;
        for (int i9 = i8; i9 >= 0; i9--) {
            View viewM762x4 = m762x(i9);
            if (this.f879t.mo17063b(viewM762x4) > i6 || this.f879t.mo17074n(viewM762x4) > i6) {
                m558z1(c0167t, i8, i9);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: z1 */
    public final void m558z1(RecyclerView.C0167t c0167t, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m721I0(i, c0167t);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                m721I0(i3, c0167t);
            }
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f877r = 1;
        this.f881v = false;
        this.f882w = false;
        this.f883x = false;
        this.f884y = true;
        this.f885z = -1;
        this.f871A = Integer.MIN_VALUE;
        this.f872B = null;
        this.f873C = new C0142a();
        this.f874D = new C0143b();
        this.f875E = 2;
        this.f876F = new int[2];
        m518D1(i);
        mo529d(null);
        if (z == this.f881v) {
            return;
        }
        this.f881v = z;
        m727L0();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f877r = 1;
        this.f881v = false;
        this.f882w = false;
        this.f883x = false;
        this.f884y = true;
        this.f885z = -1;
        this.f871A = Integer.MIN_VALUE;
        this.f872B = null;
        this.f873C = new C0142a();
        this.f874D = new C0143b();
        this.f875E = 2;
        this.f876F = new int[2];
        RecyclerView.AbstractC0160m.d dVarM703S = RecyclerView.AbstractC0160m.m703S(context, attributeSet, i, i2);
        m518D1(dVarM703S.f1054a);
        boolean z = dVarM703S.f1056c;
        mo529d(null);
        if (z != this.f881v) {
            this.f881v = z;
            m727L0();
        }
        mo473E1(dVarM703S.f1057d);
    }
}
