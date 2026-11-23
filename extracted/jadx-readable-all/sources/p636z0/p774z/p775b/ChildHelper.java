package p636z0.p774z.p775b;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.z.b.g, reason: use source file name */
/* JADX INFO: compiled from: ChildHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class ChildHelper {

    /* JADX INFO: renamed from: a */
    public final b f39177a;

    /* JADX INFO: renamed from: b */
    public final a f39178b = new a();

    /* JADX INFO: renamed from: c */
    public final List<View> f39179c = new ArrayList();

    /* JADX INFO: renamed from: z0.z.b.g$a */
    /* JADX INFO: compiled from: ChildHelper.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public long f39180a = 0;

        /* JADX INFO: renamed from: b */
        public a f39181b;

        /* JADX INFO: renamed from: a */
        public void m17013a(int i) {
            if (i < 64) {
                this.f39180a &= ~(1 << i);
                return;
            }
            a aVar = this.f39181b;
            if (aVar != null) {
                aVar.m17013a(i - 64);
            }
        }

        /* JADX INFO: renamed from: b */
        public int m17014b(int i) {
            a aVar = this.f39181b;
            if (aVar == null) {
                return i >= 64 ? Long.bitCount(this.f39180a) : Long.bitCount(this.f39180a & ((1 << i) - 1));
            }
            if (i < 64) {
                return Long.bitCount(this.f39180a & ((1 << i) - 1));
            }
            return Long.bitCount(this.f39180a) + aVar.m17014b(i - 64);
        }

        /* JADX INFO: renamed from: c */
        public final void m17015c() {
            if (this.f39181b == null) {
                this.f39181b = new a();
            }
        }

        /* JADX INFO: renamed from: d */
        public boolean m17016d(int i) {
            if (i < 64) {
                return (this.f39180a & (1 << i)) != 0;
            }
            m17015c();
            return this.f39181b.m17016d(i - 64);
        }

        /* JADX INFO: renamed from: e */
        public void m17017e(int i, boolean z) {
            if (i >= 64) {
                m17015c();
                this.f39181b.m17017e(i - 64, z);
                return;
            }
            long j2 = this.f39180a;
            boolean z2 = (Long.MIN_VALUE & j2) != 0;
            long j3 = (1 << i) - 1;
            this.f39180a = ((j2 & (~j3)) << 1) | (j2 & j3);
            if (z) {
                m17020h(i);
            } else {
                m17013a(i);
            }
            if (z2 || this.f39181b != null) {
                m17015c();
                this.f39181b.m17017e(0, z2);
            }
        }

        /* JADX INFO: renamed from: f */
        public boolean m17018f(int i) {
            if (i >= 64) {
                m17015c();
                return this.f39181b.m17018f(i - 64);
            }
            long j2 = 1 << i;
            long j3 = this.f39180a;
            boolean z = (j3 & j2) != 0;
            long j4 = j3 & (~j2);
            this.f39180a = j4;
            long j5 = j2 - 1;
            this.f39180a = (j4 & j5) | Long.rotateRight((~j5) & j4, 1);
            a aVar = this.f39181b;
            if (aVar != null) {
                if (aVar.m17016d(0)) {
                    m17020h(63);
                }
                this.f39181b.m17018f(0);
            }
            return z;
        }

        /* JADX INFO: renamed from: g */
        public void m17019g() {
            this.f39180a = 0L;
            a aVar = this.f39181b;
            if (aVar != null) {
                aVar.m17019g();
            }
        }

        /* JADX INFO: renamed from: h */
        public void m17020h(int i) {
            if (i < 64) {
                this.f39180a |= 1 << i;
            } else {
                m17015c();
                this.f39181b.m17020h(i - 64);
            }
        }

        public String toString() {
            if (this.f39181b == null) {
                return Long.toBinaryString(this.f39180a);
            }
            return this.f39181b.toString() + "xx" + Long.toBinaryString(this.f39180a);
        }
    }

    /* JADX INFO: renamed from: z0.z.b.g$b */
    /* JADX INFO: compiled from: ChildHelper.java */
    public interface b {
    }

    public ChildHelper(b bVar) {
        this.f39177a = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m17001a(View view, int i, boolean z) {
        int iM16974b = i < 0 ? ((RecyclerView2) this.f39177a).m16974b() : m17006f(i);
        this.f39178b.m17017e(iM16974b, z);
        if (z) {
            m17009i(view);
        }
        RecyclerView2 recyclerView2 = (RecyclerView2) this.f39177a;
        recyclerView2.f39135a.addView(view, iM16974b);
        RecyclerView recyclerView = recyclerView2.f39135a;
        Objects.requireNonNull(recyclerView);
        RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
        recyclerView.m590S();
        RecyclerView.AbstractC0152e abstractC0152e = recyclerView.f985w;
        if (abstractC0152e != null && abstractC0149b0M568K != null) {
            abstractC0152e.mo670l(abstractC0149b0M568K);
        }
        List<RecyclerView.InterfaceC0162o> list = recyclerView.f943O;
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                recyclerView.f943O.get(size).mo776b(view);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17002b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iM16974b = i < 0 ? ((RecyclerView2) this.f39177a).m16974b() : m17006f(i);
        this.f39178b.m17017e(iM16974b, z);
        if (z) {
            m17009i(view);
        }
        RecyclerView2 recyclerView2 = (RecyclerView2) this.f39177a;
        Objects.requireNonNull(recyclerView2);
        RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
        if (abstractC0149b0M568K != null) {
            if (!abstractC0149b0M568K.m653o() && !abstractC0149b0M568K.m659u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(abstractC0149b0M568K);
                throw new IllegalArgumentException(outline.m1588j(recyclerView2.f39135a, sb));
            }
            abstractC0149b0M568K.f1012k &= -257;
        }
        recyclerView2.f39135a.attachViewToParent(view, iM16974b, layoutParams);
    }

    /* JADX INFO: renamed from: c */
    public void m17003c(int i) {
        RecyclerView.AbstractC0149b0 abstractC0149b0M568K;
        int iM17006f = m17006f(i);
        this.f39178b.m17018f(iM17006f);
        RecyclerView2 recyclerView2 = (RecyclerView2) this.f39177a;
        View childAt = recyclerView2.f39135a.getChildAt(iM17006f);
        if (childAt != null && (abstractC0149b0M568K = RecyclerView.m568K(childAt)) != null) {
            if (abstractC0149b0M568K.m653o() && !abstractC0149b0M568K.m659u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(abstractC0149b0M568K);
                throw new IllegalArgumentException(outline.m1588j(recyclerView2.f39135a, sb));
            }
            abstractC0149b0M568K.m640b(256);
        }
        recyclerView2.f39135a.detachViewFromParent(iM17006f);
    }

    /* JADX INFO: renamed from: d */
    public View m17004d(int i) {
        return ((RecyclerView2) this.f39177a).m16973a(m17006f(i));
    }

    /* JADX INFO: renamed from: e */
    public int m17005e() {
        return ((RecyclerView2) this.f39177a).m16974b() - this.f39179c.size();
    }

    /* JADX INFO: renamed from: f */
    public final int m17006f(int i) {
        if (i < 0) {
            return -1;
        }
        int iM16974b = ((RecyclerView2) this.f39177a).m16974b();
        int i2 = i;
        while (i2 < iM16974b) {
            int iM17014b = i - (i2 - this.f39178b.m17014b(i2));
            if (iM17014b == 0) {
                while (this.f39178b.m17016d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM17014b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: g */
    public View m17007g(int i) {
        return ((RecyclerView2) this.f39177a).f39135a.getChildAt(i);
    }

    /* JADX INFO: renamed from: h */
    public int m17008h() {
        return ((RecyclerView2) this.f39177a).m16974b();
    }

    /* JADX INFO: renamed from: i */
    public final void m17009i(View view) {
        this.f39179c.add(view);
        RecyclerView2 recyclerView2 = (RecyclerView2) this.f39177a;
        Objects.requireNonNull(recyclerView2);
        RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
        if (abstractC0149b0M568K != null) {
            RecyclerView recyclerView = recyclerView2.f39135a;
            int i = abstractC0149b0M568K.f1019r;
            if (i != -1) {
                abstractC0149b0M568K.f1018q = i;
            } else {
                View view2 = abstractC0149b0M568K.f1003b;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                abstractC0149b0M568K.f1018q = view2.getImportantForAccessibility();
            }
            recyclerView.m613k0(abstractC0149b0M568K, 4);
        }
    }

    /* JADX INFO: renamed from: j */
    public int m17010j(View view) {
        int iIndexOfChild = ((RecyclerView2) this.f39177a).f39135a.indexOfChild(view);
        if (iIndexOfChild == -1 || this.f39178b.m17016d(iIndexOfChild)) {
            return -1;
        }
        return iIndexOfChild - this.f39178b.m17014b(iIndexOfChild);
    }

    /* JADX INFO: renamed from: k */
    public boolean m17011k(View view) {
        return this.f39179c.contains(view);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m17012l(View view) {
        if (!this.f39179c.remove(view)) {
            return false;
        }
        RecyclerView2 recyclerView2 = (RecyclerView2) this.f39177a;
        Objects.requireNonNull(recyclerView2);
        RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(view);
        if (abstractC0149b0M568K == null) {
            return true;
        }
        recyclerView2.f39135a.m613k0(abstractC0149b0M568K, abstractC0149b0M568K.f1018q);
        abstractC0149b0M568K.f1018q = 0;
        return true;
    }

    public String toString() {
        return this.f39178b.toString() + ", hidden list:" + this.f39179c.size();
    }
}
