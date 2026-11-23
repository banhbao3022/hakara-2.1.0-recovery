package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: renamed from: c.n.b.d.j.a.cs */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2929cs extends AbstractC3669wr implements vn2<hn2> {

    /* JADX INFO: renamed from: i */
    public String f13105i;

    /* JADX INFO: renamed from: j */
    public final C3667wp f13106j;

    /* JADX INFO: renamed from: k */
    public boolean f13107k;

    /* JADX INFO: renamed from: l */
    public final C2891bs f13108l;

    /* JADX INFO: renamed from: m */
    public final C3113hr f13109m;

    /* JADX INFO: renamed from: n */
    public ByteBuffer f13110n;

    /* JADX INFO: renamed from: o */
    public boolean f13111o;

    /* JADX INFO: renamed from: p */
    public final Object f13112p;

    /* JADX INFO: renamed from: q */
    public final String f13113q;

    /* JADX INFO: renamed from: r */
    public final int f13114r;

    /* JADX INFO: renamed from: s */
    public boolean f13115s;

    public C2929cs(InterfaceC3704xp interfaceC3704xp, C3667wp c3667wp) {
        super(interfaceC3704xp);
        this.f13106j = c3667wp;
        this.f13108l = new C2891bs();
        this.f13109m = new C3113hr();
        this.f13112p = new Object();
        this.f13113q = interfaceC3704xp != null ? interfaceC3704xp.mo6497p() : "";
        this.f13114r = interfaceC3704xp != null ? interfaceC3704xp.mo6493n() : 0;
    }

    /* JADX INFO: renamed from: q */
    public static final String m6224q(String str) {
        String strValueOf = String.valueOf(C3331nn.m7884b(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.vn2
    /* JADX INFO: renamed from: e */
    public final void mo6225e(hn2 hn2Var, jn2 jn2Var) {
        this.f13108l.f12804a.add((ln2) hn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: g */
    public final boolean mo5841g(String str) {
        String str2;
        this.f13105i = str;
        String strM6224q = m6224q(str);
        int i = 0;
        try {
            String str3 = this.f21308g;
            C3667wp c3667wp = this.f13106j;
            hn2 ln2Var = new ln2(str3, null, this, c3667wp.f21285d, c3667wp.f21286e, true, null);
            if (this.f13106j.f21290i) {
                ln2Var = new C3519sq(this.f21307f, ln2Var, this.f13113q, this.f13114r, null, null);
            }
            ln2Var.mo6843a(new jn2(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            InterfaceC3704xp interfaceC3704xp = this.f21309h.get();
            if (interfaceC3704xp != null) {
                interfaceC3704xp.mo6516z(strM6224q, this);
            }
            InterfaceC2782b interfaceC2782b = C2330u.f10884a.f10896k;
            long jMo5623c = interfaceC2782b.mo5623c();
            AbstractC3718y2<Long> abstractC3718y2 = C3052g3.f14429r;
            C2862b c2862b = C2862b.f12493a;
            long jLongValue = ((Long) c2862b.f12496d.m6596a(abstractC3718y2)).longValue();
            long jLongValue2 = ((Long) c2862b.f12496d.m6596a(C3052g3.f14422q)).longValue();
            this.f13110n = ByteBuffer.allocate(this.f13106j.f21284c);
            int i2 = 8192;
            byte[] bArr = new byte[8192];
            long j2 = jMo5623c;
            while (true) {
                try {
                    int iMo6845d = ln2Var.mo6845d(bArr, i, Math.min(this.f13110n.remaining(), i2));
                    if (iMo6845d == -1) {
                        this.f13115s = true;
                        C3331nn.f17166a.post(new RunnableC3594ur(this, str, strM6224q, (int) this.f13109m.m7157a(this.f13110n)));
                        return true;
                    }
                    synchronized (this.f13112p) {
                        if (!this.f13107k) {
                            this.f13110n.put(bArr, 0, iMo6845d);
                        }
                    }
                    if (this.f13110n.remaining() <= 0) {
                        m6227r();
                        return true;
                    }
                    try {
                        if (this.f13107k) {
                            int iLimit = this.f13110n.limit();
                            StringBuilder sb = new StringBuilder(35);
                            sb.append("Precache abort at ");
                            sb.append(iLimit);
                            sb.append(" bytes");
                            throw new IOException(sb.toString());
                        }
                        long jMo5623c2 = interfaceC2782b.mo5623c();
                        if (jMo5623c2 - j2 >= jLongValue) {
                            m6227r();
                            j2 = jMo5623c2;
                        }
                        if (jMo5623c2 - jMo5623c > 1000 * jLongValue2) {
                            StringBuilder sb2 = new StringBuilder(49);
                            sb2.append("Timeout exceeded. Limit: ");
                            sb2.append(jLongValue2);
                            sb2.append(" sec");
                            throw new IOException(sb2.toString());
                        }
                        i2 = 8192;
                        i = 0;
                        ln2Var = ln2Var;
                    } catch (Exception e) {
                        e = e;
                        str2 = interfaceC2782b;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str2 = "error";
                }
                String canonicalName = e.getClass().getCanonicalName();
                String message = e.getMessage();
                String strM1552C = outline.m1552C(new StringBuilder(String.valueOf(canonicalName).length() + 1 + String.valueOf(message).length()), canonicalName, ":", message);
                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(strM1552C).length());
                sb3.append("Failed to preload url ");
                sb3.append(str);
                sb3.append(" Exception: ");
                sb3.append(strM1552C);
                C2622l.m5226A3(sb3.toString());
                m8669o(str, strM6224q, str2, strM1552C);
                return false;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.vn2
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo6226h(hn2 hn2Var, int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: n */
    public final void mo5842n() {
        this.f13107k = true;
    }

    /* JADX INFO: renamed from: r */
    public final void m6227r() {
        C2891bs c2891bs = this.f13108l;
        Iterator<ln2> it = c2891bs.f12804a.iterator();
        while (it.hasNext()) {
            HttpURLConnection httpURLConnection = it.next().f16422i;
            Map<String, List<String>> headerFields = httpURLConnection == null ? null : httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase(entry.getKey())) {
                            c2891bs.f12805b = Math.max(c2891bs.f12805b, Long.parseLong(entry.getValue().get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        int i = (int) c2891bs.f12805b;
        int iM7157a = (int) this.f13109m.m7157a(this.f13110n);
        int iPosition = this.f13110n.position();
        int iRound = Math.round((iPosition / i) * iM7157a);
        boolean z = iRound > 0;
        int i2 = C3002er.f13650f;
        int i3 = C3002er.f13651g;
        String str = this.f13105i;
        C3331nn.f17166a.post(new RunnableC3520sr(this, str, m6224q(str), iPosition, i, iRound, iM7157a, z, i2, i3));
    }
}
