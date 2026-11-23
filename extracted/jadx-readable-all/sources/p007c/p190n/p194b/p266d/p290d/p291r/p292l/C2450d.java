package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TimerTask;
import p007c.p190n.p194b.p266d.p290d.C2404l;
import p007c.p190n.p194b.p266d.p290d.C2410n;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l;
import p007c.p190n.p194b.p266d.p314j.p320f.HandlerC4025w;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2450d {

    /* JADX INFO: renamed from: b */
    public long f11214b;

    /* JADX INFO: renamed from: c */
    public final C2458h f11215c;

    /* JADX INFO: renamed from: d */
    public List<Integer> f11216d;

    /* JADX INFO: renamed from: e */
    public final SparseIntArray f11217e;

    /* JADX INFO: renamed from: f */
    public LruCache<Integer, C2404l> f11218f;

    /* JADX INFO: renamed from: g */
    public final List<Integer> f11219g;

    /* JADX INFO: renamed from: h */
    public final Deque<Integer> f11220h;

    /* JADX INFO: renamed from: i */
    public final Handler f11221i;

    /* JADX INFO: renamed from: j */
    public TimerTask f11222j;

    /* JADX INFO: renamed from: k */
    public AbstractC2634g<C2458h.c> f11223k;

    /* JADX INFO: renamed from: l */
    public AbstractC2634g<C2458h.c> f11224l;

    /* JADX INFO: renamed from: m */
    public Set<a> f11225m = new HashSet();

    /* JADX INFO: renamed from: a */
    public final C2518b f11213a = new C2518b("MediaQueue");

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.d$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static abstract class a {
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.d$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class b extends C2458h.a {
        public b() {
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.a
        /* JADX INFO: renamed from: a */
        public final void mo5049a() {
            long jM5045d = C2450d.this.m5045d();
            C2450d c2450d = C2450d.this;
            if (jM5045d != c2450d.f11214b) {
                c2450d.f11214b = jM5045d;
                c2450d.m5043a();
                C2450d c2450d2 = C2450d.this;
                if (c2450d2.f11214b != 0) {
                    c2450d2.m5044b();
                }
            }
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.a
        /* JADX INFO: renamed from: b */
        public final void mo5050b(int[] iArr) {
            List<Integer> listM5117g = C2516a.m5117g(iArr);
            if (C2450d.this.f11216d.equals(listM5117g)) {
                return;
            }
            C2450d.this.m5046f();
            C2450d.this.f11218f.evictAll();
            C2450d.this.f11219g.clear();
            C2450d c2450d = C2450d.this;
            c2450d.f11216d = listM5117g;
            C2450d.m5042e(c2450d);
            C2450d.this.m5048h();
            C2450d.this.m5047g();
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.a
        /* JADX INFO: renamed from: c */
        public final void mo5051c(int[] iArr, int i) {
            int size;
            int length = iArr.length;
            if (i == 0) {
                size = C2450d.this.f11216d.size();
            } else {
                size = C2450d.this.f11217e.get(i, -1);
                if (size == -1) {
                    C2450d.this.m5044b();
                    return;
                }
            }
            C2450d.this.m5046f();
            C2450d.this.f11216d.addAll(size, C2516a.m5117g(iArr));
            C2450d.m5042e(C2450d.this);
            Iterator<a> it = C2450d.this.f11225m.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            C2450d.this.m5047g();
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.a
        /* JADX INFO: renamed from: d */
        public final void mo5052d(C2404l[] c2404lArr) {
            HashSet hashSet = new HashSet();
            C2450d.this.f11219g.clear();
            for (C2404l c2404l : c2404lArr) {
                int i = c2404l.f11074g;
                C2450d.this.f11218f.put(Integer.valueOf(i), c2404l);
                int i2 = C2450d.this.f11217e.get(i, -1);
                if (i2 == -1) {
                    C2450d.this.m5044b();
                    return;
                }
                hashSet.add(Integer.valueOf(i2));
            }
            Iterator<Integer> it = C2450d.this.f11219g.iterator();
            while (it.hasNext()) {
                int i3 = C2450d.this.f11217e.get(it.next().intValue(), -1);
                if (i3 != -1) {
                    hashSet.add(Integer.valueOf(i3));
                }
            }
            C2450d.this.f11219g.clear();
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            C2450d.this.m5046f();
            C2450d.m5041c(C2450d.this, C2516a.m5115e(arrayList));
            C2450d.this.m5047g();
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.a
        /* JADX INFO: renamed from: e */
        public final void mo5053e(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                C2450d.this.f11218f.remove(Integer.valueOf(i));
                int i2 = C2450d.this.f11217e.get(i, -1);
                if (i2 == -1) {
                    C2450d.this.m5044b();
                    return;
                }
                arrayList.add(Integer.valueOf(i2));
            }
            Collections.sort(arrayList);
            C2450d.this.m5046f();
            C2450d.m5041c(C2450d.this, C2516a.m5115e(arrayList));
            C2450d.this.m5047g();
        }

        @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h.a
        /* JADX INFO: renamed from: f */
        public final void mo5054f(int[] iArr) {
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                C2450d.this.f11218f.remove(Integer.valueOf(i));
                int i2 = C2450d.this.f11217e.get(i, -1);
                if (i2 == -1) {
                    C2450d.this.m5044b();
                    return;
                } else {
                    C2450d.this.f11217e.delete(i);
                    arrayList.add(Integer.valueOf(i2));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Collections.sort(arrayList);
            C2450d.this.m5046f();
            C2450d.this.f11216d.removeAll(C2516a.m5117g(iArr));
            C2450d.m5042e(C2450d.this);
            C2450d c2450d = C2450d.this;
            C2516a.m5115e(arrayList);
            Iterator<a> it = c2450d.f11225m.iterator();
            while (it.hasNext()) {
                Objects.requireNonNull(it.next());
            }
            C2450d.this.m5047g();
        }
    }

    public C2450d(C2458h c2458h) {
        this.f11215c = c2458h;
        Math.max(20, 1);
        this.f11216d = new ArrayList();
        this.f11217e = new SparseIntArray();
        this.f11219g = new ArrayList();
        this.f11220h = new ArrayDeque(20);
        this.f11221i = new HandlerC4025w(Looper.getMainLooper());
        this.f11222j = new C2476i0(this);
        b bVar = new b();
        C2622l.m5354d("Must be called from the main thread.");
        c2458h.f11295i.add(bVar);
        this.f11218f = new C2459h0(this, 20);
        this.f11214b = m5045d();
        m5044b();
    }

    /* JADX INFO: renamed from: c */
    public static void m5041c(C2450d c2450d, int[] iArr) {
        Iterator<a> it = c2450d.f11225m.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m5042e(C2450d c2450d) {
        c2450d.f11217e.clear();
        for (int i = 0; i < c2450d.f11216d.size(); i++) {
            c2450d.f11217e.put(c2450d.f11216d.get(i).intValue(), i);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5043a() {
        m5046f();
        this.f11216d.clear();
        this.f11217e.clear();
        this.f11218f.evictAll();
        this.f11219g.clear();
        this.f11221i.removeCallbacks(this.f11222j);
        this.f11220h.clear();
        AbstractC2634g<C2458h.c> abstractC2634g = this.f11224l;
        if (abstractC2634g != null) {
            abstractC2634g.mo5493c();
            this.f11224l = null;
        }
        AbstractC2634g<C2458h.c> abstractC2634g2 = this.f11223k;
        if (abstractC2634g2 != null) {
            abstractC2634g2.mo5493c();
            this.f11223k = null;
        }
        m5048h();
        m5047g();
    }

    /* JADX INFO: renamed from: b */
    public final void m5044b() {
        AbstractC2634g<C2458h.c> abstractC2634g;
        AbstractC2634g<C2458h.c> abstractC2634gM5060q;
        C2622l.m5354d("Must be called from the main thread.");
        if (this.f11214b != 0 && (abstractC2634g = this.f11224l) == null) {
            if (abstractC2634g != null) {
                abstractC2634g.mo5493c();
                this.f11224l = null;
            }
            AbstractC2634g<C2458h.c> abstractC2634g2 = this.f11223k;
            if (abstractC2634g2 != null) {
                abstractC2634g2.mo5493c();
                this.f11223k = null;
            }
            C2458h c2458h = this.f11215c;
            Objects.requireNonNull(c2458h);
            C2622l.m5354d("Must be called from the main thread.");
            if (c2458h.m5079v()) {
                C2485n c2485n = new C2485n(c2458h);
                C2458h.m5059p(c2485n);
                abstractC2634gM5060q = c2485n;
            } else {
                abstractC2634gM5060q = C2458h.m5060q(17, null);
            }
            this.f11224l = abstractC2634gM5060q;
            abstractC2634gM5060q.mo5494d(new InterfaceC2639l(this) { // from class: c.n.b.d.d.r.l.g0

                /* JADX INFO: renamed from: a */
                public final C2450d f11286a;

                {
                    this.f11286a = this;
                }

                @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2639l
                /* JADX INFO: renamed from: a */
                public final void mo5012a(InterfaceC2638k interfaceC2638k) {
                    C2450d c2450d = this.f11286a;
                    Objects.requireNonNull(c2450d);
                    Status statusMo4909B = ((C2458h.c) interfaceC2638k).mo4909B();
                    int i = statusMo4909B.f28654l;
                    if (i != 0) {
                        c2450d.f11213a.m5122d(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i), statusMo4909B.f28655m), new Object[0]);
                    }
                    c2450d.f11224l = null;
                    if (c2450d.f11220h.isEmpty()) {
                        return;
                    }
                    c2450d.f11221i.removeCallbacks(c2450d.f11222j);
                    c2450d.f11221i.postDelayed(c2450d.f11222j, 500L);
                }
            });
        }
    }

    /* JADX INFO: renamed from: d */
    public final long m5045d() {
        C2410n c2410nM5064e = this.f11215c.m5064e();
        if (c2410nM5064e == null) {
            return 0L;
        }
        MediaInfo mediaInfo = c2410nM5064e.f11095f;
        if (C2410n.m4985L(c2410nM5064e.f11099j, c2410nM5064e.f11100k, c2410nM5064e.f11106q, mediaInfo == null ? -1 : mediaInfo.f28565g)) {
            return 0L;
        }
        return c2410nM5064e.f11096g;
    }

    /* JADX INFO: renamed from: f */
    public final void m5046f() {
        Iterator<a> it = this.f11225m.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5047g() {
        Iterator<a> it = this.f11225m.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5048h() {
        Iterator<a> it = this.f11225m.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }
}
