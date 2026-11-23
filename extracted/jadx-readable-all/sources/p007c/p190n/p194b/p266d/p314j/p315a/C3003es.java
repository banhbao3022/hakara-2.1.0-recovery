package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import java.util.Arrays;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.es */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(16)
public final class C3003es extends AbstractC3669wr implements InterfaceC2965dr {

    /* JADX INFO: renamed from: i */
    public C3002er f13677i;

    /* JADX INFO: renamed from: j */
    public String f13678j;

    /* JADX INFO: renamed from: k */
    public boolean f13679k;

    /* JADX INFO: renamed from: l */
    public Exception f13680l;

    /* JADX INFO: renamed from: m */
    public boolean f13681m;

    public C3003es(InterfaceC3704xp interfaceC3704xp, C3667wp c3667wp) {
        super(interfaceC3704xp);
        C3002er c3002er = new C3002er(interfaceC3704xp.getContext(), c3667wp, this.f21309h.get());
        this.f13677i = c3002er;
        c3002er.f13662r = this;
    }

    /* JADX INFO: renamed from: q */
    public static final String m6676q(String str) {
        String strValueOf = String.valueOf(C3331nn.m7884b(str));
        return strValueOf.length() != 0 ? "cache:".concat(strValueOf) : new String("cache:");
    }

    /* JADX INFO: renamed from: s */
    public static String m6677s(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(str).length(), 2, String.valueOf(canonicalName).length(), String.valueOf(message).length()));
        outline.m1572W(sb, str, "/", canonicalName, ":");
        sb.append(message);
        return sb.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: a */
    public final void mo6426a(String str, Exception exc) {
        C2622l.m5241D3("Precache exception", exc);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: b */
    public final void mo6427b(String str, Exception exc) {
        String str2 = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14366i);
        if (str2 != null) {
            List listAsList = Arrays.asList(str2.split(","));
            if (listAsList.contains("all") || listAsList.contains(exc.getClass().getCanonicalName())) {
                return;
            }
        }
        this.f13680l = exc;
        C2622l.m5241D3("Precache error", exc);
        m6683r(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: c */
    public final void mo6428c(final boolean z, final long j2) {
        final InterfaceC3704xp interfaceC3704xp = this.f21309h.get();
        if (interfaceC3704xp != null) {
            C2962do.f13334e.execute(new Runnable(interfaceC3704xp, z, j2) { // from class: c.n.b.d.j.a.ds

                /* JADX INFO: renamed from: f */
                public final InterfaceC3704xp f13370f;

                /* JADX INFO: renamed from: g */
                public final boolean f13371g;

                /* JADX INFO: renamed from: h */
                public final long f13372h;

                {
                    this.f13370f = interfaceC3704xp;
                    this.f13371g = z;
                    this.f13372h = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f13370f.mo6441F0(this.f13371g, this.f13372h);
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: d */
    public final void mo6429d(int i) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2965dr
    /* JADX INFO: renamed from: f */
    public final void mo6430f(int i, int i2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: g */
    public final boolean mo5841g(String str) {
        return mo6678i(str, new String[]{str});
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0241 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6631. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo6678i(java.lang.String r46, java.lang.String[] r47) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p314j.p315a.C3003es.mo6678i(java.lang.String, java.lang.String[]):boolean");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: j */
    public final void mo6679j(int i) {
        C3556tq c3556tq = this.f13677i.f13653i;
        synchronized (c3556tq) {
            c3556tq.f19955c = ((long) i) * 1000;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: k */
    public final void mo6680k(int i) {
        C3556tq c3556tq = this.f13677i.f13653i;
        synchronized (c3556tq) {
            c3556tq.f19954b = ((long) i) * 1000;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: l */
    public final void mo6681l(int i) {
        C3556tq c3556tq = this.f13677i.f13653i;
        synchronized (c3556tq) {
            c3556tq.f19956d = ((long) i) * 1000;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: m */
    public final void mo6682m(int i) {
        C3556tq c3556tq = this.f13677i.f13653i;
        synchronized (c3556tq) {
            c3556tq.f19957e = ((long) i) * 1000;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr
    /* JADX INFO: renamed from: n */
    public final void mo5842n() {
        m6683r(null);
    }

    /* JADX INFO: renamed from: r */
    public final void m6683r(String str) {
        synchronized (this) {
            this.f13679k = true;
            notify();
            release();
        }
        String str2 = this.f13678j;
        if (str2 != null) {
            String strM6676q = m6676q(str2);
            Exception exc = this.f13680l;
            if (exc != null) {
                m8669o(this.f13678j, strM6676q, "badUrl", m6677s(str, exc));
            } else {
                m8669o(this.f13678j, strM6676q, "externalAbort", "Programmatic precache abort.");
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3669wr, p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2636i
    public final void release() {
        C3002er c3002er = this.f13677i;
        if (c3002er != null) {
            c3002er.f13662r = null;
            c3002er.m6672o();
        }
    }
}
