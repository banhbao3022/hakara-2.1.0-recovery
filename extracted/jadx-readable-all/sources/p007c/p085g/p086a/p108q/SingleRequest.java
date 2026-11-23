package p007c.p085g.p086a.p108q;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.GlideContext;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.p092t.Engine;
import p007c.p085g.p086a.p089m.p092t.GlideException;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p096u.Model;
import p007c.p085g.p086a.p089m.p098v.p101f.DrawableDecoderCompat;
import p007c.p085g.p086a.p108q.p109h.SizeReadyCallback;
import p007c.p085g.p086a.p108q.p109h.Target;
import p007c.p085g.p086a.p108q.p110i.TransitionFactory;
import p007c.p085g.p086a.p112s.LogTime;
import p007c.p085g.p086a.p112s.Util4;
import p007c.p085g.p086a.p112s.p113k.StateVerifier;

/* JADX INFO: renamed from: c.g.a.q.g, reason: use source file name */
/* JADX INFO: compiled from: SingleRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class SingleRequest<R> implements Request2, SizeReadyCallback, ResourceCallback {

    /* JADX INFO: renamed from: a */
    public static final boolean f3746a = Log.isLoggable("Request", 2);

    /* JADX INFO: renamed from: A */
    public int f3747A;

    /* JADX INFO: renamed from: B */
    public int f3748B;

    /* JADX INFO: renamed from: C */
    public boolean f3749C;

    /* JADX INFO: renamed from: D */
    public RuntimeException f3750D;

    /* JADX INFO: renamed from: b */
    public final String f3751b;

    /* JADX INFO: renamed from: c */
    public final StateVerifier f3752c;

    /* JADX INFO: renamed from: d */
    public final Object f3753d;

    /* JADX INFO: renamed from: e */
    public final RequestListener<R> f3754e;

    /* JADX INFO: renamed from: f */
    public final RequestCoordinator f3755f;

    /* JADX INFO: renamed from: g */
    public final Context f3756g;

    /* JADX INFO: renamed from: h */
    public final GlideContext f3757h;

    /* JADX INFO: renamed from: i */
    public final Object f3758i;

    /* JADX INFO: renamed from: j */
    public final Class<R> f3759j;

    /* JADX INFO: renamed from: k */
    public final BaseRequestOptions<?> f3760k;

    /* JADX INFO: renamed from: l */
    public final int f3761l;

    /* JADX INFO: renamed from: m */
    public final int f3762m;

    /* JADX INFO: renamed from: n */
    public final Priority f3763n;

    /* JADX INFO: renamed from: o */
    public final Target<R> f3764o;

    /* JADX INFO: renamed from: p */
    public final List<RequestListener<R>> f3765p;

    /* JADX INFO: renamed from: q */
    public final TransitionFactory<? super R> f3766q;

    /* JADX INFO: renamed from: r */
    public final Executor f3767r;

    /* JADX INFO: renamed from: s */
    public Resource2<R> f3768s;

    /* JADX INFO: renamed from: t */
    public Engine.d f3769t;

    /* JADX INFO: renamed from: u */
    public long f3770u;

    /* JADX INFO: renamed from: v */
    public volatile Engine f3771v;

    /* JADX INFO: renamed from: w */
    public int f3772w;

    /* JADX INFO: renamed from: x */
    public Drawable f3773x;

    /* JADX INFO: renamed from: y */
    public Drawable f3774y;

    /* JADX INFO: renamed from: z */
    public Drawable f3775z;

    public SingleRequest(Context context, GlideContext glideContext, Object obj, Object obj2, Class<R> cls, BaseRequestOptions<?> baseRequestOptions, int i, int i2, Priority priority, Target<R> target, RequestListener<R> requestListener, List<RequestListener<R>> list, RequestCoordinator requestCoordinator, Engine engine, TransitionFactory<? super R> transitionFactory, Executor executor) {
        this.f3751b = f3746a ? String.valueOf(hashCode()) : null;
        this.f3752c = new StateVerifier.b();
        this.f3753d = obj;
        this.f3756g = context;
        this.f3757h = glideContext;
        this.f3758i = obj2;
        this.f3759j = cls;
        this.f3760k = baseRequestOptions;
        this.f3761l = i;
        this.f3762m = i2;
        this.f3763n = priority;
        this.f3764o = target;
        this.f3754e = requestListener;
        this.f3765p = list;
        this.f3755f = requestCoordinator;
        this.f3771v = engine;
        this.f3766q = transitionFactory;
        this.f3767r = executor;
        this.f3772w = 1;
        if (this.f3750D == null && glideContext.f2887i) {
            this.f3750D = new RuntimeException("Glide request origin trace");
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00fe */
    @Override // p007c.p085g.p086a.p108q.p109h.SizeReadyCallback
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2005a(int r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p085g.p086a.p108q.SingleRequest.mo2005a(int, int):void");
    }

    @Override // p007c.p085g.p086a.p108q.Request2
    /* JADX INFO: renamed from: b */
    public boolean mo1993b() {
        boolean z;
        synchronized (this.f3753d) {
            z = this.f3772w == 6;
        }
        return z;
    }

    @Override // p007c.p085g.p086a.p108q.Request2
    /* JADX INFO: renamed from: c */
    public void mo1994c() {
        synchronized (this.f3753d) {
            m2006e();
            this.f3752c.mo2059a();
            int i = LogTime.f3820b;
            this.f3770u = SystemClock.elapsedRealtimeNanos();
            if (this.f3758i == null) {
                if (Util4.m2054i(this.f3761l, this.f3762m)) {
                    this.f3747A = this.f3761l;
                    this.f3748B = this.f3762m;
                }
                m2014m(new GlideException("Received null model"), m2008g() == null ? 5 : 3);
                return;
            }
            int i2 = this.f3772w;
            if (i2 == 2) {
                throw new IllegalArgumentException("Cannot restart a running request");
            }
            if (i2 == 4) {
                m2015n(this.f3768s, DataSource.MEMORY_CACHE);
                return;
            }
            this.f3772w = 3;
            if (Util4.m2054i(this.f3761l, this.f3762m)) {
                mo2005a(this.f3761l, this.f3762m);
            } else {
                this.f3764o.mo2024i(this);
            }
            int i3 = this.f3772w;
            if (i3 == 2 || i3 == 3) {
                RequestCoordinator requestCoordinator = this.f3755f;
                if (requestCoordinator == null || requestCoordinator.m1999d(this)) {
                    this.f3764o.mo2020f(m2009h());
                }
            }
            if (f3746a) {
                m2013l("finished run method in " + LogTime.m2040a(this.f3770u));
            }
        }
    }

    @Override // p007c.p085g.p086a.p108q.Request2
    public void clear() {
        synchronized (this.f3753d) {
            m2006e();
            this.f3752c.mo2059a();
            if (this.f3772w == 6) {
                return;
            }
            m2007f();
            Resource2<R> resource2 = this.f3768s;
            if (resource2 != null) {
                this.f3768s = null;
            } else {
                resource2 = null;
            }
            RequestCoordinator requestCoordinator = this.f3755f;
            if (requestCoordinator == null || requestCoordinator.m2002g(this)) {
                this.f3764o.mo1933h(m2009h());
            }
            this.f3772w = 6;
            if (resource2 != null) {
                this.f3771v.m1818f(resource2);
            }
        }
    }

    @Override // p007c.p085g.p086a.p108q.Request2
    /* JADX INFO: renamed from: d */
    public boolean mo1995d() {
        boolean z;
        synchronized (this.f3753d) {
            z = this.f3772w == 4;
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public final void m2006e() {
        if (this.f3749C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2007f() {
        m2006e();
        this.f3752c.mo2059a();
        this.f3764o.mo2023a(this);
        Engine.d dVar = this.f3769t;
        if (dVar != null) {
            synchronized (Engine.this) {
                dVar.f3301a.m1827g(dVar.f3302b);
            }
            this.f3769t = null;
        }
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m2008g() {
        int i;
        if (this.f3775z == null) {
            BaseRequestOptions<?> baseRequestOptions = this.f3760k;
            Drawable drawable = baseRequestOptions.f3739t;
            this.f3775z = drawable;
            if (drawable == null && (i = baseRequestOptions.f3740u) > 0) {
                this.f3775z = m2012k(i);
            }
        }
        return this.f3775z;
    }

    /* JADX INFO: renamed from: h */
    public final Drawable m2009h() {
        int i;
        if (this.f3774y == null) {
            BaseRequestOptions<?> baseRequestOptions = this.f3760k;
            Drawable drawable = baseRequestOptions.f3731l;
            this.f3774y = drawable;
            if (drawable == null && (i = baseRequestOptions.f3732m) > 0) {
                this.f3774y = m2012k(i);
            }
        }
        return this.f3774y;
    }

    /* JADX INFO: renamed from: i */
    public boolean m2010i(Request2 request2) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        BaseRequestOptions<?> baseRequestOptions;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        BaseRequestOptions<?> baseRequestOptions2;
        Priority priority2;
        int size2;
        boolean zM1861a;
        if (!(request2 instanceof SingleRequest)) {
            return false;
        }
        synchronized (this.f3753d) {
            i = this.f3761l;
            i2 = this.f3762m;
            obj = this.f3758i;
            cls = this.f3759j;
            baseRequestOptions = this.f3760k;
            priority = this.f3763n;
            List<RequestListener<R>> list = this.f3765p;
            size = list != null ? list.size() : 0;
        }
        SingleRequest singleRequest = (SingleRequest) request2;
        synchronized (singleRequest.f3753d) {
            i3 = singleRequest.f3761l;
            i4 = singleRequest.f3762m;
            obj2 = singleRequest.f3758i;
            cls2 = singleRequest.f3759j;
            baseRequestOptions2 = singleRequest.f3760k;
            priority2 = singleRequest.f3763n;
            List<RequestListener<R>> list2 = singleRequest.f3765p;
            size2 = list2 != null ? list2.size() : 0;
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = Util4.f3828a;
            if (obj == null) {
                zM1861a = obj2 == null;
            } else {
                zM1861a = obj instanceof Model ? ((Model) obj).m1861a(obj2) : obj.equals(obj2);
            }
            if (zM1861a && cls.equals(cls2) && baseRequestOptions.equals(baseRequestOptions2) && priority == priority2 && size == size2) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p108q.Request2
    public boolean isRunning() {
        boolean z;
        synchronized (this.f3753d) {
            int i = this.f3772w;
            z = i == 2 || i == 3;
        }
        return z;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2011j() {
        RequestCoordinator requestCoordinator = this.f3755f;
        return requestCoordinator == null || !requestCoordinator.m1998c().m1997b();
    }

    /* JADX INFO: renamed from: k */
    public final Drawable m2012k(int i) {
        Resources.Theme theme = this.f3760k.f3745z;
        if (theme == null) {
            theme = this.f3756g.getTheme();
        }
        GlideContext glideContext = this.f3757h;
        return DrawableDecoderCompat.m1918a(glideContext, glideContext, i, theme);
    }

    /* JADX INFO: renamed from: l */
    public final void m2013l(String str) {
        StringBuilder sbM1561L = outline.m1561L(str, " this: ");
        sbM1561L.append(this.f3751b);
        Log.v("Request", sbM1561L.toString());
    }

    /* JADX INFO: renamed from: m */
    public final void m2014m(GlideException glideException, int i) {
        boolean zM2003a;
        this.f3752c.mo2059a();
        synchronized (this.f3753d) {
            Objects.requireNonNull(glideException);
            int i2 = this.f3757h.f2888j;
            if (i2 <= i) {
                Log.w("Glide", "Load failed for " + this.f3758i + " with size [" + this.f3747A + "x" + this.f3748B + "]", glideException);
                if (i2 <= 4) {
                    glideException.m1838e("Glide");
                }
            }
            this.f3769t = null;
            this.f3772w = 5;
            boolean z = true;
            this.f3749C = true;
            try {
                List<RequestListener<R>> list = this.f3765p;
                if (list != null) {
                    Iterator<RequestListener<R>> it = list.iterator();
                    zM2003a = false;
                    while (it.hasNext()) {
                        zM2003a |= it.next().m2003a(glideException, this.f3758i, this.f3764o, m2011j());
                    }
                } else {
                    zM2003a = false;
                }
                RequestListener<R> requestListener = this.f3754e;
                if (requestListener == null || !requestListener.m2003a(glideException, this.f3758i, this.f3764o, m2011j())) {
                    z = false;
                }
                if (!(zM2003a | z)) {
                    m2017p();
                }
                this.f3749C = false;
                RequestCoordinator requestCoordinator = this.f3755f;
                if (requestCoordinator != null) {
                    requestCoordinator.m1996a(this);
                }
            } catch (Throwable th) {
                this.f3749C = false;
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [c.g.a.q.b, c.g.a.q.g, c.g.a.q.g<R>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [c.g.a.q.g] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX INFO: renamed from: n */
    public void m2015n(Resource2<?> resource2, DataSource dataSource) throws Throwable {
        ?? r8;
        Throwable th;
        this.f3752c.mo2059a();
        Resource2<?> resource3 = null;
        try {
            synchronized (this.f3753d) {
                try {
                    this.f3769t = null;
                    if (resource2 == null) {
                        m2014m(new GlideException("Expected to receive a Resource<R> with an object of " + this.f3759j + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = resource2.get();
                    try {
                        if (obj == null || !this.f3759j.isAssignableFrom(obj.getClass())) {
                            this.f3768s = null;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected to receive an object of ");
                            sb.append(this.f3759j);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(resource2);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            m2014m(new GlideException(sb.toString()), 5);
                        } else {
                            RequestCoordinator requestCoordinator = this.f3755f;
                            if (requestCoordinator == null || requestCoordinator.m2000e(this)) {
                                m2016o(resource2, obj, dataSource);
                                return;
                            } else {
                                this.f3768s = null;
                                this.f3772w = 4;
                            }
                        }
                        this.f3771v.m1818f(resource2);
                    } catch (Throwable th2) {
                        th = th2;
                        resource3 = resource2;
                        r8 = this;
                        while (true) {
                            try {
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (resource3 != null) {
                                        r8.f3771v.m1818f(resource3);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r8 = r8;
                            }
                            th = th4;
                            r8 = r8;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r8 = this;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            r8 = this;
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2016o(Resource2<R> resource2, R r, DataSource dataSource) {
        boolean zM2004b;
        boolean zM2011j = m2011j();
        this.f3772w = 4;
        this.f3768s = resource2;
        if (this.f3757h.f2888j <= 3) {
            StringBuilder sbM1556G = outline.m1556G("Finished loading ");
            sbM1556G.append(r.getClass().getSimpleName());
            sbM1556G.append(" from ");
            sbM1556G.append(dataSource);
            sbM1556G.append(" for ");
            sbM1556G.append(this.f3758i);
            sbM1556G.append(" with size [");
            sbM1556G.append(this.f3747A);
            sbM1556G.append("x");
            sbM1556G.append(this.f3748B);
            sbM1556G.append("] in ");
            sbM1556G.append(LogTime.m2040a(this.f3770u));
            sbM1556G.append(" ms");
            Log.d("Glide", sbM1556G.toString());
        }
        boolean z = true;
        this.f3749C = true;
        try {
            List<RequestListener<R>> list = this.f3765p;
            if (list != null) {
                Iterator<RequestListener<R>> it = list.iterator();
                zM2004b = false;
                while (it.hasNext()) {
                    zM2004b |= it.next().m2004b(r, this.f3758i, this.f3764o, dataSource, zM2011j);
                }
            } else {
                zM2004b = false;
            }
            RequestListener<R> requestListener = this.f3754e;
            if (requestListener == null || !requestListener.m2004b(r, this.f3758i, this.f3764o, dataSource, zM2011j)) {
                z = false;
            }
            if (!(z | zM2004b)) {
                this.f3764o.mo1932b(r, this.f3766q.mo2031a(dataSource, zM2011j));
            }
            this.f3749C = false;
            RequestCoordinator requestCoordinator = this.f3755f;
            if (requestCoordinator != null) {
                requestCoordinator.m2001f(this);
            }
        } catch (Throwable th) {
            this.f3749C = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2017p() {
        int i;
        RequestCoordinator requestCoordinator = this.f3755f;
        if (requestCoordinator == null || requestCoordinator.m1999d(this)) {
            Drawable drawableM2008g = this.f3758i == null ? m2008g() : null;
            if (drawableM2008g == null) {
                if (this.f3773x == null) {
                    BaseRequestOptions<?> baseRequestOptions = this.f3760k;
                    Drawable drawable = baseRequestOptions.f3729j;
                    this.f3773x = drawable;
                    if (drawable == null && (i = baseRequestOptions.f3730k) > 0) {
                        this.f3773x = m2012k(i);
                    }
                }
                drawableM2008g = this.f3773x;
            }
            if (drawableM2008g == null) {
                drawableM2008g = m2009h();
            }
            this.f3764o.mo2019d(drawableM2008g);
        }
    }

    @Override // p007c.p085g.p086a.p108q.Request2
    public void pause() {
        synchronized (this.f3753d) {
            if (isRunning()) {
                clear();
            }
        }
    }
}
