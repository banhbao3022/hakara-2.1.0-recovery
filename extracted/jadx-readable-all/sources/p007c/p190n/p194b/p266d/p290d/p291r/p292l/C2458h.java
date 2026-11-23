package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.C2383e;
import p007c.p190n.p194b.p266d.p290d.C2404l;
import p007c.p190n.p194b.p266d.p290d.C2410n;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p290d.p295s.C2539l;
import p007c.p190n.p194b.p266d.p290d.p295s.C2545p;
import p007c.p190n.p194b.p266d.p290d.p295s.C2549t;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2541m;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2546q;
import p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2547r;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2634g;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k;
import p007c.p190n.p194b.p266d.p314j.p320f.C3937m8;
import p007c.p190n.p194b.p266d.p314j.p320f.HandlerC4025w;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4006t7;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2458h implements C2383e.d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f11287a = 0;

    /* JADX INFO: renamed from: b */
    public final Object f11288b;

    /* JADX INFO: renamed from: c */
    public final Handler f11289c;

    /* JADX INFO: renamed from: d */
    public final C2539l f11290d;

    /* JADX INFO: renamed from: e */
    public final e f11291e;

    /* JADX INFO: renamed from: f */
    public final C2450d f11292f;

    /* JADX INFO: renamed from: g */
    public InterfaceC4006t7 f11293g;

    /* JADX INFO: renamed from: h */
    public final List<b> f11294h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: i */
    public final List<a> f11295i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j */
    public final Map<Long, i> f11296j;

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static abstract class a {
        /* JADX INFO: renamed from: a */
        public void mo5049a() {
        }

        /* JADX INFO: renamed from: b */
        public void mo5050b(int[] iArr) {
        }

        /* JADX INFO: renamed from: c */
        public void mo5051c(int[] iArr, int i) {
        }

        /* JADX INFO: renamed from: d */
        public void mo5052d(C2404l[] c2404lArr) {
        }

        /* JADX INFO: renamed from: e */
        public void mo5053e(int[] iArr) {
        }

        /* JADX INFO: renamed from: f */
        public void mo5054f(int[] iArr) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    @Deprecated
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo5080a();

        /* JADX INFO: renamed from: b */
        void mo5081b();

        /* JADX INFO: renamed from: c */
        void mo5082c();

        /* JADX INFO: renamed from: d */
        void mo5083d();

        /* JADX INFO: renamed from: e */
        void mo5084e();

        /* JADX INFO: renamed from: f */
        void mo5085f();
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$c */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public interface c extends InterfaceC2638k {
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$d */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public interface d {
        /* JADX INFO: renamed from: a */
        void m5086a(long j2, long j3);
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$e */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class e implements InterfaceC2547r {

        /* JADX INFO: renamed from: a */
        public InterfaceC4006t7 f11297a;

        /* JADX INFO: renamed from: b */
        public long f11298b = 0;

        public e() {
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$f */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static class f extends BasePendingResult<c> {
        public f() {
            super((AbstractC2632e) null);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* JADX INFO: renamed from: f */
        public final InterfaceC2638k mo4929f(Status status) {
            return new C2492t(status);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$g */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public abstract class g extends BasePendingResult<c> {

        /* JADX INFO: renamed from: n */
        public InterfaceC2546q f11300n;

        /* JADX INFO: renamed from: o */
        public final boolean f11301o;

        public g(boolean z) {
            super((AbstractC2632e) null);
            this.f11301o = z;
            this.f11300n = new C2493u(this, C2458h.this);
        }

        @Override // com.google.android.gms.common.api.internal.BasePendingResult
        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC2638k mo4929f(Status status) {
            return new C2494v(status);
        }

        /* JADX INFO: renamed from: m */
        public abstract void mo5087m() throws C2545p;

        /* JADX INFO: renamed from: n */
        public final void m5088n() {
            if (!this.f11301o) {
                Iterator<b> it = C2458h.this.f11294h.iterator();
                while (it.hasNext()) {
                    it.next().mo5082c();
                }
                Iterator<a> it2 = C2458h.this.f11295i.iterator();
                while (it2.hasNext()) {
                    Objects.requireNonNull(it2.next());
                }
            }
            try {
                synchronized (C2458h.this.f11288b) {
                    mo5087m();
                }
            } catch (C2545p unused) {
                mo4931a(new C2494v(new Status(2100)));
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$h */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public static final class h implements c {

        /* JADX INFO: renamed from: f */
        public final Status f11303f;

        public h(Status status, JSONObject jSONObject, MediaError mediaError) {
            this.f11303f = status;
        }

        @Override // p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2638k
        /* JADX INFO: renamed from: B */
        public final Status mo4909B() {
            return this.f11303f;
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.d.r.l.h$i */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
    public class i {

        /* JADX INFO: renamed from: a */
        public final Set<d> f11304a = new HashSet();

        /* JADX INFO: renamed from: b */
        public final long f11305b;

        /* JADX INFO: renamed from: c */
        public final Runnable f11306c;

        /* JADX INFO: renamed from: d */
        public boolean f11307d;

        public i(long j2) {
            this.f11305b = j2;
            this.f11306c = new C2495w(this, C2458h.this);
        }
    }

    static {
        String str = C2539l.f11431e;
    }

    public C2458h(C2539l c2539l) {
        new ConcurrentHashMap();
        this.f11296j = new ConcurrentHashMap();
        this.f11288b = new Object();
        this.f11289c = new HandlerC4025w(Looper.getMainLooper());
        e eVar = new e();
        this.f11291e = eVar;
        Objects.requireNonNull(c2539l, "null reference");
        this.f11290d = c2539l;
        c2539l.f11437i = new C2484m0(this);
        c2539l.f11470c = eVar;
        if (eVar == null) {
            c2539l.mo5151b();
        }
        this.f11292f = new C2450d(this);
    }

    /* JADX INFO: renamed from: p */
    public static g m5059p(g gVar) {
        try {
            gVar.m5088n();
        } catch (IllegalArgumentException e2) {
            throw e2;
        } catch (Throwable unused) {
            gVar.mo4931a(new C2494v(new Status(2100)));
        }
        return gVar;
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC2634g<c> m5060q(int i2, String str) {
        f fVar = new f();
        fVar.mo4931a(new C2492t(new Status(i2, (String) null)));
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p007c.p190n.p194b.p266d.p290d.C2383e.d
    /* JADX INFO: renamed from: a */
    public void mo4961a(CastDevice castDevice, String str, String str2) {
        int iM4987K;
        C2410n c2410n;
        int[] iArrM5149m;
        C2539l c2539l = this.f11290d;
        c2539l.f11468a.m5119a("message received: %s", str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String string = jSONObject.getString("type");
            long jOptLong = jSONObject.optLong("requestId", -1L);
            byte b2 = -1;
            switch (string) {
                case "MEDIA_STATUS":
                    JSONArray jSONArray = jSONObject.getJSONArray("status");
                    if (jSONArray.length() > 0) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                        boolean zM5163a = c2539l.f11438j.m5163a(jOptLong);
                        int i2 = ((!c2539l.f11443o.m5168f() || c2539l.f11443o.m5163a(jOptLong)) && (!c2539l.f11444p.m5168f() || c2539l.f11444p.m5163a(jOptLong))) ? 0 : 1;
                        if (zM5163a || (c2410n = c2539l.f11435g) == null) {
                            c2539l.f11435g = new C2410n(jSONObject2);
                            c2539l.f11434f = SystemClock.elapsedRealtime();
                            iM4987K = 127;
                        } else {
                            iM4987K = c2410n.m4987K(jSONObject2, i2);
                        }
                        if ((iM4987K & 1) != 0) {
                            c2539l.f11434f = SystemClock.elapsedRealtime();
                            c2539l.m5158j();
                        }
                        if ((iM4987K & 2) != 0) {
                            c2539l.f11434f = SystemClock.elapsedRealtime();
                            c2539l.m5158j();
                        }
                        if ((iM4987K & 128) != 0) {
                            c2539l.f11434f = SystemClock.elapsedRealtime();
                        }
                        if ((iM4987K & 4) != 0) {
                            c2539l.m5155g();
                        }
                        if ((iM4987K & 8) != 0) {
                            c2539l.m5157i();
                        }
                        if ((iM4987K & 16) != 0) {
                            c2539l.m5156h();
                        }
                        if ((iM4987K & 32) != 0) {
                            c2539l.f11434f = SystemClock.elapsedRealtime();
                            InterfaceC2541m interfaceC2541m = c2539l.f11437i;
                            if (interfaceC2541m != null) {
                                C2484m0 c2484m0 = (C2484m0) interfaceC2541m;
                                Iterator<b> it = c2484m0.f11345a.f11294h.iterator();
                                while (it.hasNext()) {
                                    it.next().mo5085f();
                                }
                                Iterator<a> it2 = c2484m0.f11345a.f11295i.iterator();
                                while (it2.hasNext()) {
                                    Objects.requireNonNull(it2.next());
                                }
                            }
                        }
                        if ((iM4987K & 64) != 0) {
                            c2539l.f11434f = SystemClock.elapsedRealtime();
                            c2539l.m5158j();
                        }
                    } else {
                        c2539l.f11435g = null;
                        c2539l.m5158j();
                        c2539l.m5155g();
                        c2539l.m5157i();
                        c2539l.m5156h();
                    }
                    Iterator<C2549t> it3 = c2539l.f11471d.iterator();
                    while (it3.hasNext()) {
                        it3.next().m5167e(jOptLong, 0, null);
                    }
                    break;
                case "INVALID_PLAYER_STATE":
                    C2518b c2518b = c2539l.f11468a;
                    Log.w(c2518b.f11373a, c2518b.m5123e("received unexpected error: Invalid Player State.", new Object[0]));
                    Iterator<C2549t> it4 = c2539l.f11471d.iterator();
                    while (it4.hasNext()) {
                        it4.next().m5167e(jOptLong, 2100, C2539l.m5150o(jSONObject));
                    }
                    break;
                case "LOAD_FAILED":
                    c2539l.f11438j.m5167e(jOptLong, 2100, C2539l.m5150o(jSONObject));
                    break;
                case "LOAD_CANCELLED":
                    c2539l.f11438j.m5167e(jOptLong, 2101, C2539l.m5150o(jSONObject));
                    break;
                case "INVALID_REQUEST":
                    C2518b c2518b2 = c2539l.f11468a;
                    Log.w(c2518b2.f11373a, c2518b2.m5123e("received unexpected error: Invalid Request.", new Object[0]));
                    Iterator<C2549t> it5 = c2539l.f11471d.iterator();
                    while (it5.hasNext()) {
                        it5.next().m5167e(jOptLong, 2100, C2539l.m5150o(jSONObject));
                    }
                    break;
                case "QUEUE_ITEM_IDS":
                    c2539l.f11452x.m5167e(jOptLong, 0, null);
                    if (c2539l.f11437i != null && (iArrM5149m = C2539l.m5149m(jSONObject.getJSONArray("itemIds"))) != null) {
                        ((C2484m0) c2539l.f11437i).m5104a(iArrM5149m);
                        break;
                    }
                    break;
                case "QUEUE_CHANGE":
                    c2539l.f11454z.m5167e(jOptLong, 0, null);
                    if (c2539l.f11437i != null) {
                        String string2 = jSONObject.getString("changeType");
                        int[] iArrM5149m2 = C2539l.m5149m(jSONObject.getJSONArray("itemIds"));
                        int iOptInt = jSONObject.optInt("insertBefore", 0);
                        if (iArrM5149m2 != null) {
                            switch (string2.hashCode()) {
                                case -2130463047:
                                    if (string2.equals("INSERT")) {
                                        b2 = 0;
                                    }
                                    break;
                                case -1881281404:
                                    if (string2.equals("REMOVE")) {
                                        b2 = 2;
                                    }
                                    break;
                                case -1785516855:
                                    if (string2.equals("UPDATE")) {
                                        b2 = 3;
                                    }
                                    break;
                                case 1122976047:
                                    if (string2.equals("ITEMS_CHANGE")) {
                                        b2 = 1;
                                    }
                                    break;
                                case 1395699694:
                                    if (string2.equals("NO_CHANGE")) {
                                        b2 = 4;
                                    }
                                    break;
                            }
                            if (b2 == 0) {
                                Iterator<a> it6 = ((C2484m0) c2539l.f11437i).f11345a.f11295i.iterator();
                                while (it6.hasNext()) {
                                    it6.next().mo5051c(iArrM5149m2, iOptInt);
                                }
                            } else if (b2 == 1) {
                                Iterator<a> it7 = ((C2484m0) c2539l.f11437i).f11345a.f11295i.iterator();
                                while (it7.hasNext()) {
                                    it7.next().mo5053e(iArrM5149m2);
                                }
                            } else if (b2 == 2) {
                                Iterator<a> it8 = ((C2484m0) c2539l.f11437i).f11345a.f11295i.iterator();
                                while (it8.hasNext()) {
                                    it8.next().mo5054f(iArrM5149m2);
                                }
                            } else if (b2 == 3) {
                                ((C2484m0) c2539l.f11437i).m5104a(iArrM5149m2);
                            }
                        }
                        break;
                    }
                    break;
                case "QUEUE_ITEMS":
                    c2539l.f11453y.m5167e(jOptLong, 0, null);
                    if (c2539l.f11437i != null) {
                        JSONArray jSONArray2 = jSONObject.getJSONArray("items");
                        C2404l[] c2404lArr = new C2404l[jSONArray2.length()];
                        for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                            c2404lArr[i3] = new C2404l.a(jSONArray2.getJSONObject(i3)).m4969a();
                        }
                        Iterator<a> it9 = ((C2484m0) c2539l.f11437i).f11345a.f11295i.iterator();
                        while (it9.hasNext()) {
                            it9.next().mo5052d(c2404lArr);
                        }
                        break;
                    }
                    break;
            }
        } catch (JSONException e2) {
            C2518b c2518b3 = c2539l.f11468a;
            Log.w(c2518b3.f11373a, c2518b3.m5123e("Message is malformed (%s); ignoring: %s", e2.getMessage(), str2));
        }
    }

    /* JADX INFO: renamed from: b */
    public long m5061b() {
        long jM5152d;
        synchronized (this.f11288b) {
            C2622l.m5354d("Must be called from the main thread.");
            jM5152d = this.f11290d.m5152d();
        }
        return jM5152d;
    }

    /* JADX INFO: renamed from: c */
    public C2404l m5062c() {
        C2622l.m5354d("Must be called from the main thread.");
        C2410n c2410nM5064e = m5064e();
        if (c2410nM5064e == null) {
            return null;
        }
        return c2410nM5064e.m4986H(c2410nM5064e.f11106q);
    }

    /* JADX INFO: renamed from: d */
    public MediaInfo m5063d() {
        MediaInfo mediaInfoM5153e;
        synchronized (this.f11288b) {
            C2622l.m5354d("Must be called from the main thread.");
            mediaInfoM5153e = this.f11290d.m5153e();
        }
        return mediaInfoM5153e;
    }

    /* JADX INFO: renamed from: e */
    public C2410n m5064e() {
        C2410n c2410n;
        synchronized (this.f11288b) {
            C2622l.m5354d("Must be called from the main thread.");
            c2410n = this.f11290d.f11435g;
        }
        return c2410n;
    }

    /* JADX INFO: renamed from: f */
    public int m5065f() {
        int i2;
        synchronized (this.f11288b) {
            C2622l.m5354d("Must be called from the main thread.");
            C2410n c2410nM5064e = m5064e();
            i2 = c2410nM5064e != null ? c2410nM5064e.f11099j : 1;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public long m5066g() {
        long jM5154f;
        synchronized (this.f11288b) {
            C2622l.m5354d("Must be called from the main thread.");
            jM5154f = this.f11290d.m5154f();
        }
        return jM5154f;
    }

    /* JADX INFO: renamed from: h */
    public boolean m5067h() {
        C2622l.m5354d("Must be called from the main thread.");
        return m5068i() || m5078u() || m5072m() || m5071l() || m5070k();
    }

    /* JADX INFO: renamed from: i */
    public boolean m5068i() {
        C2622l.m5354d("Must be called from the main thread.");
        C2410n c2410nM5064e = m5064e();
        return c2410nM5064e != null && c2410nM5064e.f11099j == 4;
    }

    /* JADX INFO: renamed from: j */
    public boolean m5069j() {
        C2622l.m5354d("Must be called from the main thread.");
        MediaInfo mediaInfoM5063d = m5063d();
        return mediaInfoM5063d != null && mediaInfoM5063d.f28565g == 2;
    }

    /* JADX INFO: renamed from: k */
    public boolean m5070k() {
        C2622l.m5354d("Must be called from the main thread.");
        C2410n c2410nM5064e = m5064e();
        return (c2410nM5064e == null || c2410nM5064e.f11106q == 0) ? false : true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m5071l() {
        int i2;
        C2622l.m5354d("Must be called from the main thread.");
        C2410n c2410nM5064e = m5064e();
        if (c2410nM5064e != null) {
            if (c2410nM5064e.f11099j == 3) {
                return true;
            }
            if (m5069j()) {
                synchronized (this.f11288b) {
                    C2622l.m5354d("Must be called from the main thread.");
                    C2410n c2410nM5064e2 = m5064e();
                    i2 = c2410nM5064e2 != null ? c2410nM5064e2.f11100k : 0;
                }
                if (i2 == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m5072m() {
        C2622l.m5354d("Must be called from the main thread.");
        C2410n c2410nM5064e = m5064e();
        return c2410nM5064e != null && c2410nM5064e.f11099j == 2;
    }

    /* JADX INFO: renamed from: n */
    public boolean m5073n() {
        C2622l.m5354d("Must be called from the main thread.");
        C2410n c2410nM5064e = m5064e();
        return c2410nM5064e != null && c2410nM5064e.f11112w;
    }

    /* JADX INFO: renamed from: o */
    public void m5074o() {
        C2622l.m5354d("Must be called from the main thread.");
        int iM5065f = m5065f();
        if (iM5065f == 4 || iM5065f == 2) {
            C2622l.m5354d("Must be called from the main thread.");
            if (m5079v()) {
                m5059p(new C2488p(this, null));
                return;
            } else {
                m5060q(17, null);
                return;
            }
        }
        C2622l.m5354d("Must be called from the main thread.");
        if (m5079v()) {
            m5059p(new C2490r(this, null));
        } else {
            m5060q(17, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5075r(InterfaceC4006t7 interfaceC4006t7) {
        InterfaceC4006t7 interfaceC4006t8 = this.f11293g;
        if (interfaceC4006t8 == interfaceC4006t7) {
            return;
        }
        if (interfaceC4006t8 != null) {
            this.f11290d.mo5151b();
            this.f11292f.m5043a();
            try {
                InterfaceC4006t7 interfaceC4006t9 = this.f11293g;
                C2622l.m5354d("Must be called from the main thread.");
                ((C3937m8) interfaceC4006t9).m9146a(this.f11290d.f11469b);
            } catch (IOException unused) {
            }
            this.f11291e.f11297a = null;
            this.f11289c.removeCallbacksAndMessages(null);
        }
        this.f11293g = interfaceC4006t7;
        if (interfaceC4006t7 != null) {
            this.f11291e.f11297a = interfaceC4006t7;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m5076s(Set<d> set) {
        HashSet hashSet = new HashSet(set);
        if (m5072m() || m5071l() || m5068i() || m5078u()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((d) it.next()).m5086a(m5061b(), m5066g());
            }
        } else {
            if (!m5070k()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).m5086a(0L, 0L);
                }
                return;
            }
            C2404l c2404lM5062c = m5062c();
            if (c2404lM5062c == null || c2404lM5062c.f11073f == null) {
                return;
            }
            Iterator it3 = hashSet.iterator();
            while (it3.hasNext()) {
                ((d) it3.next()).m5086a(0L, c2404lM5062c.f11073f.f28568j);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m5077t() {
        InterfaceC4006t7 interfaceC4006t7 = this.f11293g;
        if (interfaceC4006t7 == null) {
            return;
        }
        try {
            C2622l.m5354d("Must be called from the main thread.");
            ((C3937m8) interfaceC4006t7).m9147b(this.f11290d.f11469b, this);
        } catch (IOException unused) {
        }
        C2622l.m5354d("Must be called from the main thread.");
        if (m5079v()) {
            m5059p(new C2486n0(this));
        } else {
            m5060q(17, null);
        }
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5078u() {
        C2622l.m5354d("Must be called from the main thread.");
        C2410n c2410nM5064e = m5064e();
        return c2410nM5064e != null && c2410nM5064e.f11099j == 5;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m5079v() {
        return this.f11293g != null;
    }
}
