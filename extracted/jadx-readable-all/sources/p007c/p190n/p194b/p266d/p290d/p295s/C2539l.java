package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p290d.C2392h;
import p007c.p190n.p194b.p266d.p290d.C2404l;
import p007c.p190n.p194b.p266d.p290d.C2410n;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2458h;
import p007c.p190n.p194b.p266d.p290d.p291r.p292l.C2484m0;

/* JADX INFO: renamed from: c.n.b.d.d.s.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2539l extends C2551v {

    /* JADX INFO: renamed from: e */
    public static final String f11431e = C2516a.m5116f("com.google.cast.media");

    /* JADX INFO: renamed from: A */
    public final C2549t f11432A;

    /* JADX INFO: renamed from: B */
    public final C2549t f11433B;

    /* JADX INFO: renamed from: f */
    public long f11434f;

    /* JADX INFO: renamed from: g */
    public C2410n f11435g;

    /* JADX INFO: renamed from: h */
    public Long f11436h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2541m f11437i;

    /* JADX INFO: renamed from: j */
    public final C2549t f11438j;

    /* JADX INFO: renamed from: k */
    public final C2549t f11439k;

    /* JADX INFO: renamed from: l */
    public final C2549t f11440l;

    /* JADX INFO: renamed from: m */
    public final C2549t f11441m;

    /* JADX INFO: renamed from: n */
    public final C2549t f11442n;

    /* JADX INFO: renamed from: o */
    public final C2549t f11443o;

    /* JADX INFO: renamed from: p */
    public final C2549t f11444p;

    /* JADX INFO: renamed from: q */
    public final C2549t f11445q;

    /* JADX INFO: renamed from: r */
    public final C2549t f11446r;

    /* JADX INFO: renamed from: s */
    public final C2549t f11447s;

    /* JADX INFO: renamed from: t */
    public final C2549t f11448t;

    /* JADX INFO: renamed from: u */
    public final C2549t f11449u;

    /* JADX INFO: renamed from: v */
    public final C2549t f11450v;

    /* JADX INFO: renamed from: w */
    public final C2549t f11451w;

    /* JADX INFO: renamed from: x */
    public final C2549t f11452x;

    /* JADX INFO: renamed from: y */
    public final C2549t f11453y;

    /* JADX INFO: renamed from: z */
    public final C2549t f11454z;

    public C2539l(String str) {
        super(f11431e, "MediaControlChannel", null);
        C2549t c2549t = new C2549t(86400000L);
        this.f11438j = c2549t;
        C2549t c2549t2 = new C2549t(86400000L);
        this.f11439k = c2549t2;
        C2549t c2549t3 = new C2549t(86400000L);
        this.f11440l = c2549t3;
        C2549t c2549t4 = new C2549t(86400000L);
        this.f11441m = c2549t4;
        C2549t c2549t5 = new C2549t(10000L);
        this.f11442n = c2549t5;
        C2549t c2549t6 = new C2549t(86400000L);
        this.f11443o = c2549t6;
        C2549t c2549t7 = new C2549t(86400000L);
        this.f11444p = c2549t7;
        C2549t c2549t8 = new C2549t(86400000L);
        this.f11445q = c2549t8;
        C2549t c2549t9 = new C2549t(86400000L);
        this.f11446r = c2549t9;
        C2549t c2549t10 = new C2549t(86400000L);
        this.f11447s = c2549t10;
        C2549t c2549t11 = new C2549t(86400000L);
        this.f11448t = c2549t11;
        C2549t c2549t12 = new C2549t(86400000L);
        this.f11449u = c2549t12;
        C2549t c2549t13 = new C2549t(86400000L);
        this.f11450v = c2549t13;
        C2549t c2549t14 = new C2549t(86400000L);
        this.f11451w = c2549t14;
        C2549t c2549t15 = new C2549t(86400000L);
        this.f11452x = c2549t15;
        C2549t c2549t16 = new C2549t(86400000L);
        this.f11454z = c2549t16;
        this.f11453y = new C2549t(86400000L);
        C2549t c2549t17 = new C2549t(86400000L);
        this.f11432A = c2549t17;
        C2549t c2549t18 = new C2549t(86400000L);
        this.f11433B = c2549t18;
        this.f11471d.add(c2549t);
        this.f11471d.add(c2549t2);
        this.f11471d.add(c2549t3);
        this.f11471d.add(c2549t4);
        this.f11471d.add(c2549t5);
        this.f11471d.add(c2549t6);
        this.f11471d.add(c2549t7);
        this.f11471d.add(c2549t8);
        this.f11471d.add(c2549t9);
        this.f11471d.add(c2549t10);
        this.f11471d.add(c2549t11);
        this.f11471d.add(c2549t12);
        this.f11471d.add(c2549t13);
        this.f11471d.add(c2549t14);
        this.f11471d.add(c2549t15);
        this.f11471d.add(c2549t16);
        this.f11471d.add(c2549t16);
        this.f11471d.add(c2549t17);
        this.f11471d.add(c2549t18);
        m5161n();
    }

    /* JADX INFO: renamed from: m */
    public static int[] m5149m(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            iArr[i] = jSONArray.getInt(i);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public static C2544o m5150o(JSONObject jSONObject) {
        Parcelable.Creator<MediaError> creator = MediaError.CREATOR;
        MediaError mediaError = new MediaError(jSONObject.optLong("requestId"), jSONObject.has("detailedErrorCode") ? Integer.valueOf(jSONObject.optInt("detailedErrorCode")) : null, jSONObject.has("reason") ? jSONObject.optString("reason") : null);
        C2544o c2544o = new C2544o();
        c2544o.f11457a = jSONObject.optJSONObject("customData");
        c2544o.f11458b = mediaError;
        return c2544o;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.C2551v
    /* JADX INFO: renamed from: b */
    public final void mo5151b() {
        super.mo5151b();
        m5161n();
    }

    /* JADX INFO: renamed from: d */
    public final long m5152d() {
        C2392h c2392h;
        MediaInfo mediaInfoM5153e = m5153e();
        long jM5159k = 0;
        if (mediaInfoM5153e == null) {
            return 0L;
        }
        Long l = this.f11436h;
        if (l == null) {
            if (this.f11434f == 0) {
                return 0L;
            }
            C2410n c2410n = this.f11435g;
            double d = c2410n.f11098i;
            long j2 = c2410n.f11101l;
            return (d == 0.0d || c2410n.f11099j != 2) ? j2 : m5159k(d, j2, mediaInfoM5153e.f28568j);
        }
        if (l.equals(4294967296000L)) {
            if (this.f11435g.f11115z != null) {
                long jLongValue = this.f11436h.longValue();
                C2410n c2410n2 = this.f11435g;
                if (c2410n2 != null && (c2392h = c2410n2.f11115z) != null) {
                    long j3 = c2392h.f11039h;
                    jM5159k = !c2392h.f11041j ? m5159k(1.0d, j3, -1L) : j3;
                }
                return Math.min(jLongValue, jM5159k);
            }
            if (m5154f() >= 0) {
                return Math.min(this.f11436h.longValue(), m5154f());
            }
        }
        return this.f11436h.longValue();
    }

    /* JADX INFO: renamed from: e */
    public final MediaInfo m5153e() {
        C2410n c2410n = this.f11435g;
        if (c2410n == null) {
            return null;
        }
        return c2410n.f11095f;
    }

    /* JADX INFO: renamed from: f */
    public final long m5154f() {
        MediaInfo mediaInfoM5153e = m5153e();
        if (mediaInfoM5153e != null) {
            return mediaInfoM5153e.f28568j;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: g */
    public final void m5155g() {
        InterfaceC2541m interfaceC2541m = this.f11437i;
        if (interfaceC2541m != null) {
            C2484m0 c2484m0 = (C2484m0) interfaceC2541m;
            Objects.requireNonNull(c2484m0.f11345a);
            Iterator<C2458h.b> it = c2484m0.f11345a.f11294h.iterator();
            while (it.hasNext()) {
                it.next().mo5080a();
            }
            Iterator<C2458h.a> it2 = c2484m0.f11345a.f11295i.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5156h() {
        InterfaceC2541m interfaceC2541m = this.f11437i;
        if (interfaceC2541m != null) {
            C2484m0 c2484m0 = (C2484m0) interfaceC2541m;
            Iterator<C2458h.b> it = c2484m0.f11345a.f11294h.iterator();
            while (it.hasNext()) {
                it.next().mo5083d();
            }
            Iterator<C2458h.a> it2 = c2484m0.f11345a.f11295i.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5157i() {
        InterfaceC2541m interfaceC2541m = this.f11437i;
        if (interfaceC2541m != null) {
            C2484m0 c2484m0 = (C2484m0) interfaceC2541m;
            Iterator<C2458h.b> it = c2484m0.f11345a.f11294h.iterator();
            while (it.hasNext()) {
                it.next().mo5081b();
            }
            Iterator<C2458h.a> it2 = c2484m0.f11345a.f11295i.iterator();
            while (it2.hasNext()) {
                Objects.requireNonNull(it2.next());
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5158j() {
        InterfaceC2541m interfaceC2541m = this.f11437i;
        if (interfaceC2541m != null) {
            C2484m0 c2484m0 = (C2484m0) interfaceC2541m;
            Objects.requireNonNull(c2484m0.f11345a);
            C2458h c2458h = c2484m0.f11345a;
            for (C2458h.i iVar : c2458h.f11296j.values()) {
                if (c2458h.m5067h() && !iVar.f11307d) {
                    C2458h.this.f11289c.removeCallbacks(iVar.f11306c);
                    iVar.f11307d = true;
                    C2458h.this.f11289c.postDelayed(iVar.f11306c, iVar.f11305b);
                } else if (!c2458h.m5067h() && iVar.f11307d) {
                    C2458h.this.f11289c.removeCallbacks(iVar.f11306c);
                    iVar.f11307d = false;
                }
                if (iVar.f11307d && (c2458h.m5068i() || c2458h.m5078u() || c2458h.m5071l() || c2458h.m5070k())) {
                    c2458h.m5076s(iVar.f11304a);
                }
            }
            Iterator<C2458h.b> it = c2484m0.f11345a.f11294h.iterator();
            while (it.hasNext()) {
                it.next().mo5084e();
            }
            Iterator<C2458h.a> it2 = c2484m0.f11345a.f11295i.iterator();
            while (it2.hasNext()) {
                it2.next().mo5049a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final long m5159k(double d, long j2, long j3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11434f;
        if (jElapsedRealtime < 0) {
            jElapsedRealtime = 0;
        }
        if (jElapsedRealtime == 0) {
            return j2;
        }
        long j4 = j2 + ((long) (jElapsedRealtime * d));
        if (j3 > 0 && j4 > j3) {
            return j3;
        }
        if (j4 < 0) {
            return 0L;
        }
        return j4;
    }

    /* JADX INFO: renamed from: l */
    public final long m5160l(InterfaceC2546q interfaceC2546q, int i, long j2, C2404l[] c2404lArr, int i2, Integer num, JSONObject jSONObject) throws IllegalStateException, C2545p, IllegalArgumentException {
        if (j2 != -1 && j2 < 0) {
            StringBuilder sb = new StringBuilder(53);
            sb.append("playPosition cannot be negative: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
        JSONObject jSONObject2 = new JSONObject();
        long jM5170c = m5170c();
        try {
            jSONObject2.put("requestId", jM5170c);
            jSONObject2.put("type", "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", m5162p());
            if (i != 0) {
                jSONObject2.put("currentItemId", i);
            }
            if (i2 != 0) {
                jSONObject2.put("jump", i2);
            }
            if (j2 != -1) {
                jSONObject2.put("currentTime", C2516a.m5111a(j2));
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        m5169a(jSONObject2.toString(), jM5170c, null);
        this.f11449u.m5165c(jM5170c, interfaceC2546q);
        return jM5170c;
    }

    /* JADX INFO: renamed from: n */
    public final void m5161n() {
        this.f11434f = 0L;
        this.f11435g = null;
        Iterator<C2549t> it = this.f11471d.iterator();
        while (it.hasNext()) {
            it.next().m5166d(2002);
        }
    }

    /* JADX INFO: renamed from: p */
    public final long m5162p() throws C2545p {
        C2410n c2410n = this.f11435g;
        if (c2410n != null) {
            return c2410n.f11096g;
        }
        throw new C2545p();
    }
}
