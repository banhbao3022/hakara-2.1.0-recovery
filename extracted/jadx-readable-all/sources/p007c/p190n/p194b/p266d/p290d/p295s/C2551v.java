package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.C2372a0;
import p007c.p190n.p194b.p266d.p290d.InterfaceC2415o1;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2491s;
import p007c.p190n.p194b.p266d.p290d.p295s.C2532h0;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2687r;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o;
import p007c.p190n.p194b.p266d.p314j.p320f.C3927l8;
import p007c.p190n.p194b.p266d.p314j.p320f.C3937m8;
import p007c.p190n.p194b.p266d.p314j.p320f.C3957o8;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4006t7;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.d.s.v */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2551v {

    /* JADX INFO: renamed from: a */
    public final C2518b f11468a;

    /* JADX INFO: renamed from: b */
    public final String f11469b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2547r f11470c;

    /* JADX INFO: renamed from: d */
    public final List<C2549t> f11471d;

    public C2551v(String str, String str2, String str3) {
        C2516a.m5113c(str);
        this.f11469b = str;
        C2518b c2518b = new C2518b(str2);
        this.f11468a = c2518b;
        if (!TextUtils.isEmpty(null)) {
            c2518b.f11375c = TextUtils.isEmpty(null) ? null : String.format("[%s] ", null);
        }
        this.f11471d = Collections.synchronizedList(new ArrayList());
    }

    /* JADX INFO: renamed from: a */
    public final void m5169a(final String str, long j2, String str2) {
        AbstractC2634g abstractC2634gM5420q0;
        Objects.requireNonNull(this.f11468a);
        InterfaceC2547r interfaceC2547r = this.f11470c;
        final String str3 = this.f11469b;
        C2458h.e eVar = (C2458h.e) interfaceC2547r;
        InterfaceC4006t7 interfaceC4006t7 = eVar.f11297a;
        if (interfaceC4006t7 == null) {
            throw new IllegalStateException("No GoogleApiClient available");
        }
        InterfaceC2415o1 interfaceC2415o1 = ((C3937m8) interfaceC4006t7).f22818h;
        if (interfaceC2415o1 != null) {
            final C2372a0 c2372a0 = (C2372a0) interfaceC2415o1;
            C2516a.m5113c(str3);
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("The message payload cannot be null or empty");
            }
            if (str.length() > 524288) {
                C2518b c2518b = C2372a0.f10968j;
                Log.w(c2518b.f11373a, c2518b.m5123e("Message send failed. Message exceeds maximum size", new Object[0]));
                throw new IllegalArgumentException("Message exceeds maximum size524288");
            }
            AbstractC2687r.a aVarM5551a = AbstractC2687r.m5551a();
            aVarM5551a.f11748a = new InterfaceC2681o(c2372a0, str3, str) { // from class: c.n.b.d.d.f0

                /* JADX INFO: renamed from: a */
                public final C2372a0 f11028a;

                /* JADX INFO: renamed from: b */
                public final String f11029b;

                /* JADX INFO: renamed from: c */
                public final String f11030c;

                {
                    this.f11028a = c2372a0;
                    this.f11029b = str3;
                    this.f11030c = str;
                }

                @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
                /* JADX INFO: renamed from: a */
                public final void mo4950a(Object obj, Object obj2) {
                    C2372a0 c2372a1 = this.f11028a;
                    String str4 = this.f11029b;
                    String str5 = this.f11030c;
                    C2532h0 c2532h0 = (C2532h0) obj;
                    C4782j<Void> c4782j = (C4782j) obj2;
                    long jIncrementAndGet = c2372a1.f10986t.incrementAndGet();
                    c2372a1.m4943d();
                    try {
                        c2372a1.f10975E.put(Long.valueOf(jIncrementAndGet), c4782j);
                        ((InterfaceC2542m0) c2532h0.m5581u()).mo5147y1(str4, str5, jIncrementAndGet);
                    } catch (RemoteException e) {
                        c2372a1.f10975E.remove(Long.valueOf(jIncrementAndGet));
                        c4782j.f24683a.m10943p(e);
                    }
                }
            };
            abstractC2634gM5420q0 = C2622l.m5420q0(c2372a0.m5487c(1, aVarM5551a.m5553a()), C3927l8.f22769a, C3957o8.f22833a);
        } else {
            abstractC2634gM5420q0 = null;
        }
        abstractC2634gM5420q0.mo5494d(new C2491s(eVar, j2));
    }

    /* JADX INFO: renamed from: b */
    public void mo5151b() {
        synchronized (this.f11471d) {
            Iterator<C2549t> it = this.f11471d.iterator();
            while (it.hasNext()) {
                it.next().m5166d(2002);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final long m5170c() {
        C2458h.e eVar = (C2458h.e) this.f11470c;
        long j2 = eVar.f11298b + 1;
        eVar.f11298b = j2;
        return j2;
    }
}
