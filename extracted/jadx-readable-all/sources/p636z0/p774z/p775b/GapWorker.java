package p636z0.p774z.p775b;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p636z0.p725k.p735h.TraceCompat;

/* JADX INFO: renamed from: z0.z.b.p, reason: use source file name */
/* JADX INFO: compiled from: GapWorker.java */
/* JADX INFO: loaded from: classes.dex */
public final class GapWorker implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final ThreadLocal<GapWorker> f39305f = new ThreadLocal<>();

    /* JADX INFO: renamed from: g */
    public static Comparator<c> f39306g = new a();

    /* JADX INFO: renamed from: i */
    public long f39308i;

    /* JADX INFO: renamed from: j */
    public long f39309j;

    /* JADX INFO: renamed from: h */
    public ArrayList<RecyclerView> f39307h = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public ArrayList<c> f39310k = new ArrayList<>();

    /* JADX INFO: renamed from: z0.z.b.p$a */
    /* JADX INFO: compiled from: GapWorker.java */
    public class a implements Comparator<c> {
        /* JADX WARN: Code duplicated, block: B:17:0x0022  */
        @Override // java.util.Comparator
        public int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f39318d;
            int i = 1;
            if ((recyclerView == null) == (cVar4.f39318d == null)) {
                boolean z = cVar3.f39315a;
                if (z == cVar4.f39315a) {
                    int i2 = cVar4.f39316b - cVar3.f39316b;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = cVar3.f39317c - cVar4.f39317c;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
                if (z) {
                    i = -1;
                }
            } else if (recyclerView != null) {
                i = -1;
            }
            return i;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.p$b */
    /* JADX INFO: compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    public static class b implements RecyclerView.AbstractC0160m.c {

        /* JADX INFO: renamed from: a */
        public int f39311a;

        /* JADX INFO: renamed from: b */
        public int f39312b;

        /* JADX INFO: renamed from: c */
        public int[] f39313c;

        /* JADX INFO: renamed from: d */
        public int f39314d;

        /* JADX INFO: renamed from: a */
        public void m17052a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f39314d * 2;
            int[] iArr = this.f39313c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f39313c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f39313c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f39313c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f39314d++;
        }

        /* JADX INFO: renamed from: b */
        public void m17053b(RecyclerView recyclerView, boolean z) {
            this.f39314d = 0;
            int[] iArr = this.f39313c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0160m abstractC0160m = recyclerView.f987x;
            if (recyclerView.f985w == null || abstractC0160m == null || !abstractC0160m.f1045k) {
                return;
            }
            if (z) {
                if (!recyclerView.f969o.m16966g()) {
                    abstractC0160m.mo540j(recyclerView.f985w.mo662d(), this);
                }
            } else if (!recyclerView.m584M()) {
                abstractC0160m.mo538i(this.f39311a, this.f39312b, recyclerView.f980t0, this);
            }
            int i = this.f39314d;
            if (i > abstractC0160m.f1046l) {
                abstractC0160m.f1046l = i;
                abstractC0160m.f1047m = z;
                recyclerView.f965m.m796l();
            }
        }

        /* JADX INFO: renamed from: c */
        public boolean m17054c(int i) {
            if (this.f39313c != null) {
                int i2 = this.f39314d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f39313c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: z0.z.b.p$c */
    /* JADX INFO: compiled from: GapWorker.java */
    public static class c {

        /* JADX INFO: renamed from: a */
        public boolean f39315a;

        /* JADX INFO: renamed from: b */
        public int f39316b;

        /* JADX INFO: renamed from: c */
        public int f39317c;

        /* JADX INFO: renamed from: d */
        public RecyclerView f39318d;

        /* JADX INFO: renamed from: e */
        public int f39319e;
    }

    /* JADX INFO: renamed from: a */
    public void m17049a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f39308i == 0) {
            this.f39308i = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f978s0;
        bVar.f39311a = i;
        bVar.f39312b = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m17050b(long j2) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f39307h.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f39307h.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f978s0.m17053b(recyclerView3, false);
                i += recyclerView3.f978s0.f39314d;
            }
        }
        this.f39310k.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f39307h.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f978s0;
                int iAbs = Math.abs(bVar.f39312b) + Math.abs(bVar.f39311a);
                for (int i5 = 0; i5 < bVar.f39314d * 2; i5 += 2) {
                    if (i3 >= this.f39310k.size()) {
                        cVar2 = new c();
                        this.f39310k.add(cVar2);
                    } else {
                        cVar2 = this.f39310k.get(i3);
                    }
                    int[] iArr = bVar.f39313c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f39315a = i6 <= iAbs;
                    cVar2.f39316b = iAbs;
                    cVar2.f39317c = i6;
                    cVar2.f39318d = recyclerView4;
                    cVar2.f39319e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f39310k, f39306g);
        for (int i7 = 0; i7 < this.f39310k.size() && (recyclerView = (cVar = this.f39310k.get(i7)).f39318d) != null; i7++) {
            RecyclerView.AbstractC0149b0 abstractC0149b0M17051c = m17051c(recyclerView, cVar.f39319e, cVar.f39315a ? Long.MAX_VALUE : j2);
            if (abstractC0149b0M17051c != null && abstractC0149b0M17051c.f1004c != null && abstractC0149b0M17051c.m648j() && !abstractC0149b0M17051c.m649k() && (recyclerView2 = abstractC0149b0M17051c.f1004c.get()) != null) {
                if (recyclerView2.f944P && recyclerView2.f971p.m17008h() != 0) {
                    recyclerView2.m601d0();
                }
                b bVar2 = recyclerView2.f978s0;
                bVar2.m17053b(recyclerView2, true);
                if (bVar2.f39314d != 0) {
                    try {
                        int i8 = TraceCompat.f37894a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.C0172y c0172y = recyclerView2.f980t0;
                        RecyclerView.AbstractC0152e abstractC0152e = recyclerView2.f985w;
                        c0172y.f1097d = 1;
                        c0172y.f1098e = abstractC0152e.mo662d();
                        c0172y.f1100g = false;
                        c0172y.f1101h = false;
                        c0172y.f1102i = false;
                        for (int i9 = 0; i9 < bVar2.f39314d * 2; i9 += 2) {
                            m17051c(recyclerView2, bVar2.f39313c[i9], j2);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = TraceCompat.f37894a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.f39315a = false;
            cVar.f39316b = 0;
            cVar.f39317c = 0;
            cVar.f39318d = null;
            cVar.f39319e = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public final RecyclerView.AbstractC0149b0 m17051c(RecyclerView recyclerView, int i, long j2) {
        boolean z;
        int iM17008h = recyclerView.f971p.m17008h();
        int i2 = 0;
        while (true) {
            if (i2 >= iM17008h) {
                z = false;
                break;
            }
            RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(recyclerView.f971p.m17007g(i2));
            if (abstractC0149b0M568K.f1005d == i && !abstractC0149b0M568K.m649k()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C0167t c0167t = recyclerView.f965m;
        try {
            recyclerView.m592U();
            RecyclerView.AbstractC0149b0 abstractC0149b0M794j = c0167t.m794j(i, false, j2);
            if (abstractC0149b0M794j != null) {
                if (!abstractC0149b0M794j.m648j() || abstractC0149b0M794j.m649k()) {
                    c0167t.m785a(abstractC0149b0M794j, false);
                } else {
                    c0167t.m791g(abstractC0149b0M794j.f1003b);
                }
            }
            return abstractC0149b0M794j;
        } finally {
            recyclerView.m593V(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i = TraceCompat.f37894a;
            Trace.beginSection("RV Prefetch");
            if (this.f39307h.isEmpty()) {
                this.f39308i = 0L;
                return;
            }
            int size = this.f39307h.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f39307h.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f39308i = 0L;
            } else {
                m17050b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f39309j);
                this.f39308i = 0L;
            }
        } finally {
            this.f39308i = 0L;
            int i3 = TraceCompat.f37894a;
            Trace.endSection();
        }
    }
}
