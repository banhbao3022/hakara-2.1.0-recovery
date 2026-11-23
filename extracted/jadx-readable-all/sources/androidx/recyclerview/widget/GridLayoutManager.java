package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p774z.p775b.GapWorker;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: G */
    public boolean f859G;

    /* JADX INFO: renamed from: H */
    public int f860H;

    /* JADX INFO: renamed from: I */
    public int[] f861I;

    /* JADX INFO: renamed from: J */
    public View[] f862J;

    /* JADX INFO: renamed from: K */
    public final SparseIntArray f863K;

    /* JADX INFO: renamed from: L */
    public final SparseIntArray f864L;

    /* JADX INFO: renamed from: M */
    public AbstractC0141c f865M;

    /* JADX INFO: renamed from: N */
    public final Rect f866N;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C0139a extends AbstractC0141c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0141c
        /* JADX INFO: renamed from: b */
        public int mo510b(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0141c
        /* JADX INFO: renamed from: c */
        public int mo511c(int i) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC0141c {

        /* JADX INFO: renamed from: a */
        public final SparseIntArray f869a = new SparseIntArray();

        /* JADX INFO: renamed from: b */
        public final SparseIntArray f870b = new SparseIntArray();

        /* JADX INFO: renamed from: a */
        public int m512a(int i, int i2) {
            int iMo511c = mo511c(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int iMo511c2 = mo511c(i5);
                i3 += iMo511c2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = iMo511c2;
                }
            }
            return i3 + iMo511c > i2 ? i4 + 1 : i4;
        }

        /* JADX INFO: renamed from: b */
        public int mo510b(int i, int i2) {
            int iMo511c = mo511c(i);
            if (iMo511c == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int iMo511c2 = mo511c(i4);
                i3 += iMo511c2;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = iMo511c2;
                }
            }
            if (iMo511c + i3 <= i2) {
                return i3;
            }
            return 0;
        }

        /* JADX INFO: renamed from: c */
        public abstract int mo511c(int i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f859G = false;
        this.f860H = -1;
        this.f863K = new SparseIntArray();
        this.f864L = new SparseIntArray();
        this.f865M = new C0139a();
        this.f866N = new Rect();
        m484Q1(RecyclerView.AbstractC0160m.m703S(context, attributeSet, i, i2).f1055b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: A */
    public int mo472A(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        if (this.f877r == 1) {
            return this.f860H;
        }
        if (c0172y.m809b() < 1) {
            return 0;
        }
        return m477L1(c0167t, c0172y, c0172y.m809b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: E1 */
    public void mo473E1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        mo529d(null);
        if (this.f883x) {
            this.f883x = false;
            m727L0();
        }
    }

    /* JADX INFO: renamed from: I1 */
    public final void m474I1(int i) {
        int i2;
        int[] iArr = this.f861I;
        int i3 = this.f860H;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f861I = iArr;
    }

    /* JADX INFO: renamed from: J1 */
    public final void m475J1() {
        View[] viewArr = this.f862J;
        if (viewArr == null || viewArr.length != this.f860H) {
            this.f862J = new View[this.f860H];
        }
    }

    /* JADX INFO: renamed from: K1 */
    public int m476K1(int i, int i2) {
        if (this.f877r != 1 || !m556v1()) {
            int[] iArr = this.f861I;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f861I;
        int i3 = this.f860H;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* JADX INFO: renamed from: L1 */
    public final int m477L1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, int i) {
        if (!c0172y.f1100g) {
            return this.f865M.m512a(i, this.f860H);
        }
        int iM787c = c0167t.m787c(i);
        if (iM787c != -1) {
            return this.f865M.m512a(iM787c, this.f860H);
        }
        outline.m1565P("Cannot find span size for pre layout position. ", i, "GridLayoutManager");
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: M0 */
    public int mo478M0(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        m486R1();
        m475J1();
        if (this.f877r == 1) {
            return 0;
        }
        return m517C1(i, c0167t, c0172y);
    }

    /* JADX INFO: renamed from: M1 */
    public final int m479M1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, int i) {
        if (!c0172y.f1100g) {
            return this.f865M.mo510b(i, this.f860H);
        }
        int i2 = this.f864L.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM787c = c0167t.m787c(i);
        if (iM787c != -1) {
            return this.f865M.mo510b(iM787c, this.f860H);
        }
        outline.m1565P("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
        return 0;
    }

    /* JADX INFO: renamed from: N1 */
    public final int m480N1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, int i) {
        if (!c0172y.f1100g) {
            return this.f865M.mo511c(i);
        }
        int i2 = this.f863K.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iM787c = c0167t.m787c(i);
        if (iM787c != -1) {
            return this.f865M.mo511c(iM787c);
        }
        outline.m1565P("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", i, "GridLayoutManager");
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: O0 */
    public int mo481O0(int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        m486R1();
        m475J1();
        if (this.f877r == 0) {
            return 0;
        }
        return m517C1(i, c0167t, c0172y);
    }

    /* JADX INFO: renamed from: O1 */
    public final void m482O1(View view, int i, boolean z) {
        int iM706z;
        int iM706z2;
        C0140b c0140b = (C0140b) view.getLayoutParams();
        Rect rect = c0140b.f1059b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c0140b).topMargin + ((ViewGroup.MarginLayoutParams) c0140b).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c0140b).leftMargin + ((ViewGroup.MarginLayoutParams) c0140b).rightMargin;
        int iM476K1 = m476K1(c0140b.f867e, c0140b.f868f);
        if (this.f877r == 1) {
            iM706z2 = RecyclerView.AbstractC0160m.m706z(iM476K1, i, i3, ((ViewGroup.MarginLayoutParams) c0140b).width, false);
            iM706z = RecyclerView.AbstractC0160m.m706z(this.f879t.mo17073l(), this.f1049o, i2, ((ViewGroup.MarginLayoutParams) c0140b).height, true);
        } else {
            int iM706z3 = RecyclerView.AbstractC0160m.m706z(iM476K1, i, i2, ((ViewGroup.MarginLayoutParams) c0140b).height, false);
            int iM706z4 = RecyclerView.AbstractC0160m.m706z(this.f879t.mo17073l(), this.f1048n, i3, ((ViewGroup.MarginLayoutParams) c0140b).width, true);
            iM706z = iM706z3;
            iM706z2 = iM706z4;
        }
        m483P1(view, iM706z2, iM706z, z);
    }

    /* JADX INFO: renamed from: P1 */
    public final void m483P1(View view, int i, int i2, boolean z) {
        RecyclerView.C0161n c0161n = (RecyclerView.C0161n) view.getLayoutParams();
        if (z ? m741W0(view, i, i2, c0161n) : m739U0(view, i, i2, c0161n)) {
            view.measure(i, i2);
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public void m484Q1(int i) {
        if (i == this.f860H) {
            return;
        }
        this.f859G = true;
        if (i < 1) {
            throw new IllegalArgumentException(outline.m1590l("Span count should be at least 1. Provided ", i));
        }
        this.f860H = i;
        this.f865M.f869a.clear();
        m727L0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: R0 */
    public void mo485R0(Rect rect, int i, int i2) {
        int iM705h;
        int iM705h2;
        if (this.f861I == null) {
            super.mo485R0(rect, i, i2);
        }
        int iM731P = m731P() + m730O();
        int iM729N = m729N() + m733Q();
        if (this.f877r == 1) {
            iM705h2 = RecyclerView.AbstractC0160m.m705h(i2, rect.height() + iM729N, m726L());
            int[] iArr = this.f861I;
            iM705h = RecyclerView.AbstractC0160m.m705h(i, iArr[iArr.length - 1] + iM731P, m728M());
        } else {
            iM705h = RecyclerView.AbstractC0160m.m705h(i, rect.width() + iM731P, m728M());
            int[] iArr2 = this.f861I;
            iM705h2 = RecyclerView.AbstractC0160m.m705h(i2, iArr2[iArr2.length - 1] + iM729N, m726L());
        }
        this.f1036b.setMeasuredDimension(iM705h, iM705h2);
    }

    /* JADX INFO: renamed from: R1 */
    public final void m486R1() {
        int iM729N;
        int iM733Q;
        if (this.f877r == 1) {
            iM729N = this.f1050p - m731P();
            iM733Q = m730O();
        } else {
            iM729N = this.f1051q - m729N();
            iM733Q = m733Q();
        }
        m474I1(iM729N - iM733Q);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: T */
    public int mo487T(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        if (this.f877r == 0) {
            return this.f860H;
        }
        if (c0172y.m809b() < 1) {
            return 0;
        }
        return m477L1(c0167t, c0172y, c0172y.m809b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: Z0 */
    public boolean mo488Z0() {
        return this.f872B == null && !this.f859G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: b1 */
    public void mo489b1(RecyclerView.C0172y c0172y, LinearLayoutManager.C0144c c0144c, RecyclerView.AbstractC0160m.c cVar) {
        int iMo511c = this.f860H;
        for (int i = 0; i < this.f860H && c0144c.m564b(c0172y) && iMo511c > 0; i++) {
            int i2 = c0144c.f898d;
            ((GapWorker.b) cVar).m17052a(i2, Math.max(0, c0144c.f901g));
            iMo511c -= this.f865M.mo511c(i2);
            c0144c.f898d += c0144c.f899e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: g */
    public boolean mo490g(RecyclerView.C0161n c0161n) {
        return c0161n instanceof C0140b;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0109  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: i0 */
    public View mo491i0(View view, int i, RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        int iM764y;
        int iM764y2;
        int i2;
        View view2;
        View view3;
        int iMin;
        boolean z;
        RecyclerView.C0167t c0167t2 = c0167t;
        RecyclerView.C0172y c0172y2 = c0172y;
        View viewM760s = m760s(view);
        View view4 = null;
        if (viewM760s == null) {
            return null;
        }
        C0140b c0140b = (C0140b) viewM760s.getLayoutParams();
        int i3 = c0140b.f867e;
        int i4 = c0140b.f868f + i3;
        if (super.mo491i0(view, i, c0167t, c0172y) == null) {
            return null;
        }
        if ((m534f1(i) == 1) != this.f882w) {
            iM764y2 = m764y() - 1;
            iM764y = -1;
            i2 = -1;
        } else {
            iM764y = m764y();
            iM764y2 = 0;
            i2 = 1;
        }
        boolean z2 = this.f877r == 1 && m556v1();
        int iM477L1 = m477L1(c0167t2, c0172y2, iM764y2);
        int i5 = iM764y2;
        int i6 = i2;
        int i7 = -1;
        int i8 = 0;
        int iMin2 = 0;
        int i9 = -1;
        View view5 = null;
        while (i5 != iM764y) {
            int i10 = iM764y;
            int iM477L2 = m477L1(c0167t2, c0172y2, i5);
            View viewM762x = m762x(i5);
            if (viewM762x == viewM760s) {
                break;
            }
            if (!viewM762x.hasFocusable() || iM477L2 == iM477L1) {
                C0140b c0140b2 = (C0140b) viewM762x.getLayoutParams();
                int i11 = c0140b2.f867e;
                view2 = viewM760s;
                int i12 = c0140b2.f868f + i11;
                if (viewM762x.hasFocusable() && i11 == i3 && i12 == i4) {
                    return viewM762x;
                }
                if (!(viewM762x.hasFocusable() && view4 == null) && (viewM762x.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int iMin3 = Math.min(i12, i4) - Math.max(i11, i3);
                    if (!viewM762x.hasFocusable()) {
                        if (view4 == null) {
                            iMin = i8;
                            if (m744Z(viewM762x, false)) {
                                if (iMin3 <= iMin2) {
                                    if (iMin3 == iMin2) {
                                        if (z2 == (i11 > i7)) {
                                        }
                                    }
                                }
                                z = true;
                            }
                            if (z) {
                                if (viewM762x.hasFocusable()) {
                                    int i13 = c0140b2.f867e;
                                    iMin = Math.min(i12, i4) - Math.max(i11, i3);
                                    i9 = i13;
                                    view5 = view3;
                                    view4 = viewM762x;
                                } else {
                                    int i14 = c0140b2.f867e;
                                    iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                                    i7 = i14;
                                    view5 = viewM762x;
                                }
                            }
                            i5 += i6;
                            c0167t2 = c0167t;
                            c0172y2 = c0172y;
                            iM764y = i10;
                            viewM760s = view2;
                            i8 = iMin;
                        }
                        z = false;
                        if (z) {
                            if (viewM762x.hasFocusable()) {
                                int i15 = c0140b2.f867e;
                                iMin = Math.min(i12, i4) - Math.max(i11, i3);
                                i9 = i15;
                                view5 = view3;
                                view4 = viewM762x;
                            } else {
                                int i16 = c0140b2.f867e;
                                iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                                i7 = i16;
                                view5 = viewM762x;
                            }
                        }
                        i5 += i6;
                        c0167t2 = c0167t;
                        c0172y2 = c0172y;
                        iM764y = i10;
                        viewM760s = view2;
                        i8 = iMin;
                    } else if (iMin3 <= i8) {
                        if (iMin3 == i8) {
                            if (z2 == (i11 > i9)) {
                            }
                            if (z) {
                                if (viewM762x.hasFocusable()) {
                                    int i17 = c0140b2.f867e;
                                    iMin = Math.min(i12, i4) - Math.max(i11, i3);
                                    i9 = i17;
                                    view5 = view3;
                                    view4 = viewM762x;
                                } else {
                                    int i18 = c0140b2.f867e;
                                    iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                                    i7 = i18;
                                    view5 = viewM762x;
                                }
                            }
                            i5 += i6;
                            c0167t2 = c0167t;
                            c0172y2 = c0172y;
                            iM764y = i10;
                            viewM760s = view2;
                            i8 = iMin;
                        }
                    }
                    iMin = i8;
                    z = false;
                    if (z) {
                        if (viewM762x.hasFocusable()) {
                            int i19 = c0140b2.f867e;
                            iMin = Math.min(i12, i4) - Math.max(i11, i3);
                            i9 = i19;
                            view5 = view3;
                            view4 = viewM762x;
                        } else {
                            int i110 = c0140b2.f867e;
                            iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                            i7 = i110;
                            view5 = viewM762x;
                        }
                    }
                    i5 += i6;
                    c0167t2 = c0167t;
                    c0172y2 = c0172y;
                    iM764y = i10;
                    viewM760s = view2;
                    i8 = iMin;
                } else {
                    view3 = view5;
                }
                iMin = i8;
                z = true;
                if (z) {
                    if (viewM762x.hasFocusable()) {
                        int i111 = c0140b2.f867e;
                        iMin = Math.min(i12, i4) - Math.max(i11, i3);
                        i9 = i111;
                        view5 = view3;
                        view4 = viewM762x;
                    } else {
                        int i112 = c0140b2.f867e;
                        iMin2 = Math.min(i12, i4) - Math.max(i11, i3);
                        i7 = i112;
                        view5 = viewM762x;
                    }
                }
                i5 += i6;
                c0167t2 = c0167t;
                c0172y2 = c0172y;
                iM764y = i10;
                viewM760s = view2;
                i8 = iMin;
            } else {
                if (view4 != null) {
                    break;
                }
                view2 = viewM760s;
                view3 = view5;
                iMin = i8;
            }
            view5 = view3;
            i5 += i6;
            c0167t2 = c0167t;
            c0172y2 = c0172y;
            iM764y = i10;
            viewM760s = view2;
            i8 = iMin;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: l */
    public int mo492l(RecyclerView.C0172y c0172y) {
        return m530d1(c0172y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: m */
    public int mo493m(RecyclerView.C0172y c0172y) {
        return m532e1(c0172y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: n0 */
    public void mo494n0(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0140b)) {
            m756m0(view, accessibilityNodeInfoCompat);
            return;
        }
        C0140b c0140b = (C0140b) layoutParams;
        int iM477L1 = m477L1(c0167t, c0172y, c0140b.m772a());
        if (this.f877r == 0) {
            accessibilityNodeInfoCompat.m16273q(AccessibilityNodeInfoCompat.c.m16278a(c0140b.f867e, c0140b.f868f, iM477L1, 1, false, false));
        } else {
            accessibilityNodeInfoCompat.m16273q(AccessibilityNodeInfoCompat.c.m16278a(iM477L1, 1, c0140b.f867e, c0140b.f868f, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: o */
    public int mo495o(RecyclerView.C0172y c0172y) {
        return m530d1(c0172y);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: p */
    public int mo496p(RecyclerView.C0172y c0172y) {
        return m532e1(c0172y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: p0 */
    public void mo497p0(RecyclerView recyclerView, int i, int i2) {
        this.f865M.f869a.clear();
        this.f865M.f870b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: q0 */
    public void mo498q0(RecyclerView recyclerView) {
        this.f865M.f869a.clear();
        this.f865M.f870b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: q1 */
    public View mo499q1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, boolean z, boolean z2) {
        int iM764y;
        int iM764y2 = m764y();
        int i = -1;
        int i2 = 1;
        if (z2) {
            iM764y = m764y() - 1;
            i2 = -1;
        } else {
            i = iM764y2;
            iM764y = 0;
        }
        int iM809b = c0172y.m809b();
        m535g1();
        int iMo17072k = this.f879t.mo17072k();
        int iMo17068g = this.f879t.mo17068g();
        View view = null;
        View view2 = null;
        while (iM764y != i) {
            View viewM762x = m762x(iM764y);
            int iM735R = m735R(viewM762x);
            if (iM735R >= 0 && iM735R < iM809b && m479M1(c0167t, c0172y, iM735R) == 0) {
                if (((RecyclerView.C0161n) viewM762x.getLayoutParams()).m774c()) {
                    if (view2 == null) {
                        view2 = viewM762x;
                    }
                } else {
                    if (this.f879t.mo17066e(viewM762x) < iMo17068g && this.f879t.mo17063b(viewM762x) >= iMo17072k) {
                        return viewM762x;
                    }
                    if (view == null) {
                        view = viewM762x;
                    }
                }
            }
            iM764y += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: r0 */
    public void mo500r0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f865M.f869a.clear();
        this.f865M.f870b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: s0 */
    public void mo501s0(RecyclerView recyclerView, int i, int i2) {
        this.f865M.f869a.clear();
        this.f865M.f870b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: u */
    public RecyclerView.C0161n mo502u() {
        return this.f877r == 0 ? new C0140b(-2, -1) : new C0140b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: u0 */
    public void mo503u0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f865M.f869a.clear();
        this.f865M.f870b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: v */
    public RecyclerView.C0161n mo504v(Context context, AttributeSet attributeSet) {
        return new C0140b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: v0 */
    public void mo505v0(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y) {
        if (c0172y.f1100g) {
            int iM764y = m764y();
            for (int i = 0; i < iM764y; i++) {
                C0140b c0140b = (C0140b) m762x(i).getLayoutParams();
                int iM772a = c0140b.m772a();
                this.f863K.put(iM772a, c0140b.f868f);
                this.f864L.put(iM772a, c0140b.f867e);
            }
        }
        super.mo505v0(c0167t, c0172y);
        this.f863K.clear();
        this.f864L.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: w */
    public RecyclerView.C0161n mo506w(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0140b((ViewGroup.MarginLayoutParams) layoutParams) : new C0140b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: w0 */
    public void mo507w0(RecyclerView.C0172y c0172y) {
        this.f872B = null;
        this.f885z = -1;
        this.f871A = Integer.MIN_VALUE;
        this.f873C.m562d();
        this.f859G = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v27 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: w1 */
    public void mo508w1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, LinearLayoutManager.C0144c c0144c, LinearLayoutManager.C0143b c0143b) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM730O;
        int iMo17065d;
        int i5;
        int i6;
        int i7;
        int iMo17065d2;
        int iM706z;
        int iM706z2;
        ?? r11;
        View viewM565c;
        int iMo17071j = this.f879t.mo17071j();
        boolean z = iMo17071j != 1073741824;
        int i8 = m764y() > 0 ? this.f861I[this.f860H] : 0;
        if (z) {
            m486R1();
        }
        boolean z2 = c0144c.f899e == 1;
        int iM479M1 = this.f860H;
        if (!z2) {
            iM479M1 = m479M1(c0167t, c0172y, c0144c.f898d) + m480N1(c0167t, c0172y, c0144c.f898d);
        }
        int i9 = 0;
        while (i9 < this.f860H && c0144c.m564b(c0172y) && iM479M1 > 0) {
            int i10 = c0144c.f898d;
            int iM480N1 = m480N1(c0167t, c0172y, i10);
            if (iM480N1 > this.f860H) {
                throw new IllegalArgumentException(outline.m1603y(outline.m1559J("Item at position ", i10, " requires ", iM480N1, " spans but GridLayoutManager has only "), this.f860H, " spans."));
            }
            iM479M1 -= iM480N1;
            if (iM479M1 < 0 || (viewM565c = c0144c.m565c(c0167t)) == null) {
                break;
            }
            this.f862J[i9] = viewM565c;
            i9++;
        }
        if (i9 == 0) {
            c0143b.f892b = true;
            return;
        }
        if (z2) {
            i = 0;
            i2 = i9;
            i3 = 0;
            i4 = 1;
        } else {
            i = i9 - 1;
            i2 = -1;
            i3 = 0;
            i4 = -1;
        }
        while (i != i2) {
            View view = this.f862J[i];
            C0140b c0140b = (C0140b) view.getLayoutParams();
            int iM480N2 = m480N1(c0167t, c0172y, m735R(view));
            c0140b.f868f = iM480N2;
            c0140b.f867e = i3;
            i3 += iM480N2;
            i += i4;
        }
        float f = 0.0f;
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            View view2 = this.f862J[i12];
            if (c0144c.f905k != null) {
                r11 = 0;
                r11 = 0;
                if (z2) {
                    m748c(view2, -1, true);
                } else {
                    m748c(view2, 0, true);
                }
            } else if (z2) {
                m746b(view2);
                r11 = 0;
            } else {
                r11 = 0;
                m748c(view2, 0, false);
            }
            Rect rect = this.f866N;
            RecyclerView recyclerView = this.f1036b;
            if (recyclerView == null) {
                rect.set(r11, r11, r11, r11);
            } else {
                rect.set(recyclerView.m583L(view2));
            }
            m482O1(view2, iMo17071j, r11);
            int iMo17064c = this.f879t.mo17064c(view2);
            if (iMo17064c > i11) {
                i11 = iMo17064c;
            }
            float fMo17065d = (this.f879t.mo17065d(view2) * 1.0f) / ((C0140b) view2.getLayoutParams()).f868f;
            if (fMo17065d > f) {
                f = fMo17065d;
            }
        }
        if (z) {
            m474I1(Math.max(Math.round(f * this.f860H), i8));
            i11 = 0;
            for (int i13 = 0; i13 < i9; i13++) {
                View view3 = this.f862J[i13];
                m482O1(view3, 1073741824, true);
                int iMo17064c2 = this.f879t.mo17064c(view3);
                if (iMo17064c2 > i11) {
                    i11 = iMo17064c2;
                }
            }
        }
        for (int i14 = 0; i14 < i9; i14++) {
            View view4 = this.f862J[i14];
            if (this.f879t.mo17064c(view4) != i11) {
                C0140b c0140b2 = (C0140b) view4.getLayoutParams();
                Rect rect2 = c0140b2.f1059b;
                int i15 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) c0140b2).topMargin + ((ViewGroup.MarginLayoutParams) c0140b2).bottomMargin;
                int i16 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) c0140b2).leftMargin + ((ViewGroup.MarginLayoutParams) c0140b2).rightMargin;
                int iM476K1 = m476K1(c0140b2.f867e, c0140b2.f868f);
                if (this.f877r == 1) {
                    iM706z2 = RecyclerView.AbstractC0160m.m706z(iM476K1, 1073741824, i16, ((ViewGroup.MarginLayoutParams) c0140b2).width, false);
                    iM706z = View.MeasureSpec.makeMeasureSpec(i11 - i15, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - i16, 1073741824);
                    iM706z = RecyclerView.AbstractC0160m.m706z(iM476K1, 1073741824, i15, ((ViewGroup.MarginLayoutParams) c0140b2).height, false);
                    iM706z2 = iMakeMeasureSpec;
                }
                m483P1(view4, iM706z2, iM706z, true);
            }
        }
        c0143b.f891a = i11;
        if (this.f877r == 1) {
            if (c0144c.f900f == -1) {
                i6 = c0144c.f896b;
                i5 = i6 - i11;
            } else {
                i5 = c0144c.f896b;
                i6 = i11 + i5;
            }
            iMo17065d = 0;
            iM730O = 0;
        } else {
            if (c0144c.f900f == -1) {
                int i17 = c0144c.f896b;
                iMo17065d = i17;
                iM730O = i17 - i11;
            } else {
                int i18 = c0144c.f896b;
                iM730O = i18;
                iMo17065d = i11 + i18;
            }
            i5 = 0;
            i6 = 0;
        }
        int i19 = 0;
        while (i19 < i9) {
            View view5 = this.f862J[i19];
            C0140b c0140b3 = (C0140b) view5.getLayoutParams();
            if (this.f877r == 1) {
                if (m556v1()) {
                    iMo17065d = m730O() + this.f861I[this.f860H - c0140b3.f867e];
                    iM730O = iMo17065d - this.f879t.mo17065d(view5);
                } else {
                    iM730O = this.f861I[c0140b3.f867e] + m730O();
                    iMo17065d = this.f879t.mo17065d(view5) + iM730O;
                }
                iMo17065d2 = i6;
                i7 = i5;
            } else {
                int iM733Q = m733Q() + this.f861I[c0140b3.f867e];
                i7 = iM733Q;
                iMo17065d2 = this.f879t.mo17065d(view5) + iM733Q;
            }
            int i20 = iMo17065d;
            int i21 = iM730O;
            m745a0(view5, i21, i7, i20, iMo17065d2);
            if (c0140b3.m774c() || c0140b3.m773b()) {
                c0143b.f893c = true;
            }
            c0143b.f894d |= view5.hasFocusable();
            i19++;
            i6 = iMo17065d2;
            i5 = i7;
            iMo17065d = i20;
            iM730O = i21;
        }
        Arrays.fill(this.f862J, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: x1 */
    public void mo509x1(RecyclerView.C0167t c0167t, RecyclerView.C0172y c0172y, LinearLayoutManager.C0142a c0142a, int i) {
        m486R1();
        if (c0172y.m809b() > 0 && !c0172y.f1100g) {
            boolean z = i == 1;
            int iM479M1 = m479M1(c0167t, c0172y, c0142a.f887b);
            if (z) {
                while (iM479M1 > 0) {
                    int i2 = c0142a.f887b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c0142a.f887b = i3;
                    iM479M1 = m479M1(c0167t, c0172y, i3);
                }
            } else {
                int iM809b = c0172y.m809b() - 1;
                int i4 = c0142a.f887b;
                while (i4 < iM809b) {
                    int i5 = i4 + 1;
                    int iM479M2 = m479M1(c0167t, c0172y, i5);
                    if (iM479M2 <= iM479M1) {
                        break;
                    }
                    i4 = i5;
                    iM479M1 = iM479M2;
                }
                c0142a.f887b = i4;
            }
        }
        m475J1();
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C0140b extends RecyclerView.C0161n {

        /* JADX INFO: renamed from: e */
        public int f867e;

        /* JADX INFO: renamed from: f */
        public int f868f;

        public C0140b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f867e = -1;
            this.f868f = 0;
        }

        public C0140b(int i, int i2) {
            super(i, i2);
            this.f867e = -1;
            this.f868f = 0;
        }

        public C0140b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f867e = -1;
            this.f868f = 0;
        }

        public C0140b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f867e = -1;
            this.f868f = 0;
        }

        public C0140b(RecyclerView.C0161n c0161n) {
            super(c0161n);
            this.f867e = -1;
            this.f868f = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.f859G = false;
        this.f860H = -1;
        this.f863K = new SparseIntArray();
        this.f864L = new SparseIntArray();
        this.f865M = new C0139a();
        this.f866N = new Rect();
        m484Q1(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.f859G = false;
        this.f860H = -1;
        this.f863K = new SparseIntArray();
        this.f864L = new SparseIntArray();
        this.f865M = new C0139a();
        this.f866N = new Rect();
        m484Q1(i);
    }
}
