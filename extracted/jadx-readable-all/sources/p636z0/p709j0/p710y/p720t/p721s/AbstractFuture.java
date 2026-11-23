package p636z0.p709j0.p710y.p720t.p721s;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;

/* JADX INFO: renamed from: z0.j0.y.t.s.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractFuture.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: f */
    public static final boolean f37610f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: g */
    public static final Logger f37611g = Logger.getLogger(AbstractFuture.class.getName());

    /* JADX INFO: renamed from: h */
    public static final b f37612h;

    /* JADX INFO: renamed from: i */
    public static final Object f37613i;

    /* JADX INFO: renamed from: j */
    public volatile Object f37614j;

    /* JADX INFO: renamed from: k */
    public volatile e f37615k;

    /* JADX INFO: renamed from: l */
    public volatile i f37616l;

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$b */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static abstract class b {
        public b(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo16022a(AbstractFuture<?> abstractFuture, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo16023b(AbstractFuture<?> abstractFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo16024c(AbstractFuture<?> abstractFuture, i iVar, i iVar2);

        /* JADX INFO: renamed from: d */
        public abstract void mo16025d(i iVar, i iVar2);

        /* JADX INFO: renamed from: e */
        public abstract void mo16026e(i iVar, Thread thread);
    }

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$c */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final c f37617a;

        /* JADX INFO: renamed from: b */
        public static final c f37618b;

        /* JADX INFO: renamed from: c */
        public final boolean f37619c;

        /* JADX INFO: renamed from: d */
        public final Throwable f37620d;

        static {
            if (AbstractFuture.f37610f) {
                f37618b = null;
                f37617a = null;
            } else {
                f37618b = new c(false, null);
                f37617a = new c(true, null);
            }
        }

        public c(boolean z, Throwable th) {
            this.f37619c = z;
            this.f37620d = th;
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$d */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final d f37621a = new d(new a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: b */
        public final Throwable f37622b;

        /* JADX INFO: renamed from: z0.j0.y.t.s.a$d$a */
        /* JADX INFO: compiled from: AbstractFuture.java */
        public class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            boolean z = AbstractFuture.f37610f;
            Objects.requireNonNull(th);
            this.f37622b = th;
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$e */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final e f37623a = new e(null, null);

        /* JADX INFO: renamed from: b */
        public final Runnable f37624b;

        /* JADX INFO: renamed from: c */
        public final Executor f37625c;

        /* JADX INFO: renamed from: d */
        public e f37626d;

        public e(Runnable runnable, Executor executor) {
            this.f37624b = runnable;
            this.f37625c = executor;
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$f */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f37627a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f37628b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractFuture, i> f37629c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractFuture, e> f37630d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractFuture, Object> f37631e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractFuture, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractFuture, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractFuture, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f37627a = atomicReferenceFieldUpdater;
            this.f37628b = atomicReferenceFieldUpdater2;
            this.f37629c = atomicReferenceFieldUpdater3;
            this.f37630d = atomicReferenceFieldUpdater4;
            this.f37631e = atomicReferenceFieldUpdater5;
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: a */
        public boolean mo16022a(AbstractFuture<?> abstractFuture, e eVar, e eVar2) {
            return this.f37630d.compareAndSet(abstractFuture, eVar, eVar2);
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: b */
        public boolean mo16023b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            return this.f37631e.compareAndSet(abstractFuture, obj, obj2);
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: c */
        public boolean mo16024c(AbstractFuture<?> abstractFuture, i iVar, i iVar2) {
            return this.f37629c.compareAndSet(abstractFuture, iVar, iVar2);
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: d */
        public void mo16025d(i iVar, i iVar2) {
            this.f37628b.lazySet(iVar, iVar2);
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: e */
        public void mo16026e(i iVar, Thread thread) {
            this.f37627a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$g */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static final class g<V> implements Runnable {

        /* JADX INFO: renamed from: f */
        public final AbstractFuture<V> f37632f;

        /* JADX INFO: renamed from: g */
        public final ListenableFuture<? extends V> f37633g;

        public g(AbstractFuture<V> abstractFuture, ListenableFuture<? extends V> listenableFuture) {
            this.f37632f = abstractFuture;
            this.f37633g = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f37632f.f37614j != this) {
                return;
            }
            if (AbstractFuture.f37612h.mo16023b(this.f37632f, this, AbstractFuture.m16016e(this.f37633g))) {
                AbstractFuture.m16014b(this.f37632f);
            }
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$h */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static final class h extends b {
        public h() {
            super(null);
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: a */
        public boolean mo16022a(AbstractFuture<?> abstractFuture, e eVar, e eVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f37615k != eVar) {
                    return false;
                }
                abstractFuture.f37615k = eVar2;
                return true;
            }
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: b */
        public boolean mo16023b(AbstractFuture<?> abstractFuture, Object obj, Object obj2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f37614j != obj) {
                    return false;
                }
                abstractFuture.f37614j = obj2;
                return true;
            }
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: c */
        public boolean mo16024c(AbstractFuture<?> abstractFuture, i iVar, i iVar2) {
            synchronized (abstractFuture) {
                if (abstractFuture.f37616l != iVar) {
                    return false;
                }
                abstractFuture.f37616l = iVar2;
                return true;
            }
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: d */
        public void mo16025d(i iVar, i iVar2) {
            iVar.f37636c = iVar2;
        }

        @Override // p636z0.p709j0.p710y.p720t.p721s.AbstractFuture.b
        /* JADX INFO: renamed from: e */
        public void mo16026e(i iVar, Thread thread) {
            iVar.f37635b = thread;
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.t.s.a$i */
    /* JADX INFO: compiled from: AbstractFuture.java */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public static final i f37634a = new i(false);

        /* JADX INFO: renamed from: b */
        public volatile Thread f37635b;

        /* JADX INFO: renamed from: c */
        public volatile i f37636c;

        public i(boolean z) {
        }

        public i() {
            AbstractFuture.f37612h.mo16026e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, i.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractFuture.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f37612h = hVar;
        if (th != null) {
            f37611g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f37613i = new Object();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    public static void m16014b(AbstractFuture<?> abstractFuture) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = abstractFuture.f37616l;
            if (f37612h.mo16024c(abstractFuture, iVar, i.f37634a)) {
                while (iVar != null) {
                    Thread thread = iVar.f37635b;
                    if (thread != null) {
                        iVar.f37635b = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f37636c;
                }
                do {
                    eVar = abstractFuture.f37615k;
                } while (!f37612h.mo16022a(abstractFuture, eVar, e.f37623a));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f37626d;
                    eVar3.f37626d = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f37626d;
                    Runnable runnable = eVar2.f37624b;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        abstractFuture = gVar.f37632f;
                        if (abstractFuture.f37614j == gVar) {
                            if (f37612h.mo16023b(abstractFuture, gVar, m16016e(gVar.f37633g))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m16015c(runnable, eVar2.f37625c);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16015c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f37611g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m16016e(ListenableFuture<?> listenableFuture) {
        if (listenableFuture instanceof AbstractFuture) {
            Object obj = ((AbstractFuture) listenableFuture).f37614j;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            if (cVar.f37619c) {
                return cVar.f37620d != null ? new c(false, cVar.f37620d) : c.f37618b;
            }
            return obj;
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        if ((!f37610f) && zIsCancelled) {
            return c.f37618b;
        }
        try {
            Object objM16017g = m16017g(listenableFuture);
            return objM16017g == null ? f37613i : objM16017g;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new c(false, e2);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e2));
        } catch (ExecutionException e3) {
            return new d(e3.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static <V> V m16017g(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* JADX INFO: renamed from: a */
    public final void m16018a(StringBuilder sb) {
        try {
            Object objM16017g = m16017g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM16017g == this ? "this future" : String.valueOf(objM16017g));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        c cVar;
        Object obj = this.f37614j;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        if (f37610f) {
            cVar = new c(z, new CancellationException("Future.cancel() was called."));
        } else {
            cVar = z ? c.f37617a : c.f37618b;
        }
        boolean z2 = false;
        AbstractFuture<V> abstractFuture = this;
        while (true) {
            if (f37612h.mo16023b(abstractFuture, obj, cVar)) {
                m16014b(abstractFuture);
                if (!(obj instanceof g)) {
                    return true;
                }
                ListenableFuture<? extends V> listenableFuture = ((g) obj).f37633g;
                if (!(listenableFuture instanceof AbstractFuture)) {
                    listenableFuture.cancel(z);
                    return true;
                }
                abstractFuture = (AbstractFuture) listenableFuture;
                obj = abstractFuture.f37614j;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractFuture.f37614j;
                if (!(obj instanceof g)) {
                    return z2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final V m16019d(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            Throwable th = ((c) obj).f37620d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f37622b);
        }
        if (obj == f37613i) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f37614j;
        if ((obj != null) && (!(obj instanceof g))) {
            return m16019d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f37616l;
            if (iVar != i.f37634a) {
                i iVar2 = new i();
                while (true) {
                    b bVar = f37612h;
                    bVar.mo16025d(iVar2, iVar);
                    if (bVar.mo16024c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m16021j(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f37614j;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m16019d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m16021j(iVar2);
                        break;
                    }
                    iVar = this.f37616l;
                    if (iVar == i.f37634a) {
                    }
                }
            }
            return m16019d(this.f37614j);
        }
        while (nanos > 0) {
            Object obj3 = this.f37614j;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m16019d(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbM1560K = outline.m1560K("Waited ", j2, " ");
        sbM1560K.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM1560K.toString();
        if (nanos + 1000 < 0) {
            String strM1599u = outline.m1599u(string3, " (plus ");
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM1599u2 = strM1599u + jConvert + " " + lowerCase;
                if (z) {
                    strM1599u2 = outline.m1599u(strM1599u2, ",");
                }
                strM1599u = outline.m1599u(strM1599u2, " ");
            }
            if (z) {
                strM1599u = outline.m1595q(strM1599u, nanos2, " nanoseconds ");
            }
            string3 = outline.m1599u(strM1599u, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(outline.m1599u(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(outline.m1600v(string3, " for ", string));
    }

    @Override // p007c.p190n.p378c.p383e.p384a.ListenableFuture
    /* JADX INFO: renamed from: h */
    public final void mo11664h(Runnable runnable, Executor executor) {
        Objects.requireNonNull(runnable);
        Objects.requireNonNull(executor);
        e eVar = this.f37615k;
        if (eVar != e.f37623a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f37626d = eVar;
                if (f37612h.mo16022a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f37615k;
                }
            } while (eVar != e.f37623a);
        }
        m16015c(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public String m16020i() {
        Object obj = this.f37614j;
        if (obj instanceof g) {
            StringBuilder sbM1556G = outline.m1556G("setFuture=[");
            ListenableFuture<? extends V> listenableFuture = ((g) obj).f37633g;
            return outline.m1550A(sbM1556G, listenableFuture == this ? "this future" : String.valueOf(listenableFuture), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sbM1556G2 = outline.m1556G("remaining delay=[");
        sbM1556G2.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sbM1556G2.append(" ms]");
        return sbM1556G2.toString();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37614j instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f37614j;
        return (!(obj instanceof g)) & (obj != null);
    }

    /* JADX INFO: renamed from: j */
    public final void m16021j(i iVar) {
        iVar.f37635b = null;
        while (true) {
            i iVar2 = this.f37616l;
            if (iVar2 == i.f37634a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f37636c;
                if (iVar2.f37635b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f37636c = iVar4;
                    if (iVar3.f37635b == null) {
                    }
                } else if (!f37612h.mo16024c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f37614j instanceof c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m16018a(sb);
        } else {
            try {
                string = m16020i();
            } catch (RuntimeException e2) {
                StringBuilder sbM1556G = outline.m1556G("Exception thrown from implementation: ");
                sbM1556G.append(e2.getClass());
                string = sbM1556G.toString();
            }
            if (string != null && !string.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(string);
                sb.append("]");
            } else if (isDone()) {
                m16018a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f37614j;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m16019d(obj2);
            }
            i iVar = this.f37616l;
            if (iVar != i.f37634a) {
                i iVar2 = new i();
                do {
                    b bVar = f37612h;
                    bVar.mo16025d(iVar2, iVar);
                    if (bVar.mo16024c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f37614j;
                            } else {
                                m16021j(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m16019d(obj);
                    }
                    iVar = this.f37616l;
                } while (iVar != i.f37634a);
            }
            return m16019d(this.f37614j);
        }
        throw new InterruptedException();
    }
}
