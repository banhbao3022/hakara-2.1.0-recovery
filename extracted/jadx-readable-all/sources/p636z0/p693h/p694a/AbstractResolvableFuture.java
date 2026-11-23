package p636z0.p693h.p694a;

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

/* JADX INFO: renamed from: z0.h.a.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractResolvableFuture.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractResolvableFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: f */
    public static final boolean f36684f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: g */
    public static final Logger f36685g = Logger.getLogger(AbstractResolvableFuture.class.getName());

    /* JADX INFO: renamed from: h */
    public static final b f36686h;

    /* JADX INFO: renamed from: i */
    public static final Object f36687i;

    /* JADX INFO: renamed from: j */
    public volatile Object f36688j;

    /* JADX INFO: renamed from: k */
    public volatile e f36689k;

    /* JADX INFO: renamed from: l */
    public volatile i f36690l;

    /* JADX INFO: renamed from: z0.h.a.a$b */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static abstract class b {
        public b(a aVar) {
        }

        /* JADX INFO: renamed from: a */
        public abstract boolean mo15654a(AbstractResolvableFuture<?> abstractResolvableFuture, e eVar, e eVar2);

        /* JADX INFO: renamed from: b */
        public abstract boolean mo15655b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2);

        /* JADX INFO: renamed from: c */
        public abstract boolean mo15656c(AbstractResolvableFuture<?> abstractResolvableFuture, i iVar, i iVar2);

        /* JADX INFO: renamed from: d */
        public abstract void mo15657d(i iVar, i iVar2);

        /* JADX INFO: renamed from: e */
        public abstract void mo15658e(i iVar, Thread thread);
    }

    /* JADX INFO: renamed from: z0.h.a.a$c */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final c f36691a;

        /* JADX INFO: renamed from: b */
        public static final c f36692b;

        /* JADX INFO: renamed from: c */
        public final boolean f36693c;

        /* JADX INFO: renamed from: d */
        public final Throwable f36694d;

        static {
            if (AbstractResolvableFuture.f36684f) {
                f36692b = null;
                f36691a = null;
            } else {
                f36692b = new c(false, null);
                f36691a = new c(true, null);
            }
        }

        public c(boolean z, Throwable th) {
            this.f36693c = z;
            this.f36694d = th;
        }
    }

    /* JADX INFO: renamed from: z0.h.a.a$d */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final Throwable f36695a;

        /* JADX INFO: renamed from: z0.h.a.a$d$a */
        /* JADX INFO: compiled from: AbstractResolvableFuture.java */
        public static class a extends Throwable {
            public a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            a aVar = new a("Failure occurred while trying to finish a future.");
            boolean z = AbstractResolvableFuture.f36684f;
            Objects.requireNonNull(aVar);
        }

        public d(Throwable th) {
            boolean z = AbstractResolvableFuture.f36684f;
            Objects.requireNonNull(th);
            this.f36695a = th;
        }
    }

    /* JADX INFO: renamed from: z0.h.a.a$e */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final e f36696a = new e(null, null);

        /* JADX INFO: renamed from: b */
        public final Runnable f36697b;

        /* JADX INFO: renamed from: c */
        public final Executor f36698c;

        /* JADX INFO: renamed from: d */
        public e f36699d;

        public e(Runnable runnable, Executor executor) {
            this.f36697b = runnable;
            this.f36698c = executor;
        }
    }

    /* JADX INFO: renamed from: z0.h.a.a$f */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static final class f extends b {

        /* JADX INFO: renamed from: a */
        public final AtomicReferenceFieldUpdater<i, Thread> f36700a;

        /* JADX INFO: renamed from: b */
        public final AtomicReferenceFieldUpdater<i, i> f36701b;

        /* JADX INFO: renamed from: c */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, i> f36702c;

        /* JADX INFO: renamed from: d */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, e> f36703d;

        /* JADX INFO: renamed from: e */
        public final AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> f36704e;

        public f(AtomicReferenceFieldUpdater<i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<i, i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<AbstractResolvableFuture, i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<AbstractResolvableFuture, e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<AbstractResolvableFuture, Object> atomicReferenceFieldUpdater5) {
            super(null);
            this.f36700a = atomicReferenceFieldUpdater;
            this.f36701b = atomicReferenceFieldUpdater2;
            this.f36702c = atomicReferenceFieldUpdater3;
            this.f36703d = atomicReferenceFieldUpdater4;
            this.f36704e = atomicReferenceFieldUpdater5;
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: a */
        public boolean mo15654a(AbstractResolvableFuture<?> abstractResolvableFuture, e eVar, e eVar2) {
            return this.f36703d.compareAndSet(abstractResolvableFuture, eVar, eVar2);
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: b */
        public boolean mo15655b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            return this.f36704e.compareAndSet(abstractResolvableFuture, obj, obj2);
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: c */
        public boolean mo15656c(AbstractResolvableFuture<?> abstractResolvableFuture, i iVar, i iVar2) {
            return this.f36702c.compareAndSet(abstractResolvableFuture, iVar, iVar2);
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: d */
        public void mo15657d(i iVar, i iVar2) {
            this.f36701b.lazySet(iVar, iVar2);
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: e */
        public void mo15658e(i iVar, Thread thread) {
            this.f36700a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: renamed from: z0.h.a.a$g */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static final class g<V> implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            throw null;
        }
    }

    /* JADX INFO: renamed from: z0.h.a.a$h */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static final class h extends b {
        public h() {
            super(null);
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: a */
        public boolean mo15654a(AbstractResolvableFuture<?> abstractResolvableFuture, e eVar, e eVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f36689k != eVar) {
                    return false;
                }
                abstractResolvableFuture.f36689k = eVar2;
                return true;
            }
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: b */
        public boolean mo15655b(AbstractResolvableFuture<?> abstractResolvableFuture, Object obj, Object obj2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f36688j != obj) {
                    return false;
                }
                abstractResolvableFuture.f36688j = obj2;
                return true;
            }
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: c */
        public boolean mo15656c(AbstractResolvableFuture<?> abstractResolvableFuture, i iVar, i iVar2) {
            synchronized (abstractResolvableFuture) {
                if (abstractResolvableFuture.f36690l != iVar) {
                    return false;
                }
                abstractResolvableFuture.f36690l = iVar2;
                return true;
            }
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: d */
        public void mo15657d(i iVar, i iVar2) {
            iVar.f36707c = iVar2;
        }

        @Override // p636z0.p693h.p694a.AbstractResolvableFuture.b
        /* JADX INFO: renamed from: e */
        public void mo15658e(i iVar, Thread thread) {
            iVar.f36706b = thread;
        }
    }

    /* JADX INFO: renamed from: z0.h.a.a$i */
    /* JADX INFO: compiled from: AbstractResolvableFuture.java */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public static final i f36705a = new i(false);

        /* JADX INFO: renamed from: b */
        public volatile Thread f36706b;

        /* JADX INFO: renamed from: c */
        public volatile i f36707c;

        public i(boolean z) {
        }

        public i() {
            AbstractResolvableFuture.f36686h.mo15658e(this, Thread.currentThread());
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, i.class, "l"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, e.class, "k"), AtomicReferenceFieldUpdater.newUpdater(AbstractResolvableFuture.class, Object.class, "j"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f36686h = hVar;
        if (th != null) {
            f36685g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f36687i = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m15645b(AbstractResolvableFuture<?> abstractResolvableFuture) {
        i iVar;
        e eVar;
        do {
            iVar = abstractResolvableFuture.f36690l;
        } while (!f36686h.mo15656c(abstractResolvableFuture, iVar, i.f36705a));
        while (iVar != null) {
            Thread thread = iVar.f36706b;
            if (thread != null) {
                iVar.f36706b = null;
                LockSupport.unpark(thread);
            }
            iVar = iVar.f36707c;
        }
        do {
            eVar = abstractResolvableFuture.f36689k;
        } while (!f36686h.mo15654a(abstractResolvableFuture, eVar, e.f36696a));
        e eVar2 = null;
        while (eVar != null) {
            e eVar3 = eVar.f36699d;
            eVar.f36699d = eVar2;
            eVar2 = eVar;
            eVar = eVar3;
        }
        while (eVar2 != null) {
            e eVar4 = eVar2.f36699d;
            Runnable runnable = eVar2.f36697b;
            if (runnable instanceof g) {
                Objects.requireNonNull((g) runnable);
                throw null;
            }
            m15646c(runnable, eVar2.f36698c);
            eVar2 = eVar4;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15646c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f36685g.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static <V> V m15647e(Future<V> future) throws ExecutionException {
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
    public final void m15648a(StringBuilder sb) {
        try {
            Object objM15647e = m15647e(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM15647e == this ? "this future" : String.valueOf(objM15647e));
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
        Object obj = this.f36688j;
        if ((obj == null) | (obj instanceof g)) {
            if (f36684f) {
                cVar = new c(z, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z ? c.f36691a : c.f36692b;
            }
            while (!f36686h.mo15655b(this, obj, cVar)) {
                obj = this.f36688j;
                if (!(obj instanceof g)) {
                }
            }
            m15645b(this);
            if (!(obj instanceof g)) {
                return true;
            }
            Objects.requireNonNull((g) obj);
            throw null;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public final V m15649d(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            Throwable th = ((c) obj).f36694d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f36695a);
        }
        if (obj == f36687i) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public String mo15650g() {
        Object obj = this.f36688j;
        if (obj instanceof g) {
            Objects.requireNonNull((g) obj);
            return "setFuture=[null]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        StringBuilder sbM1556G = outline.m1556G("remaining delay=[");
        sbM1556G.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
        sbM1556G.append(" ms]");
        return sbM1556G.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f36688j;
        if ((obj != null) && (!(obj instanceof g))) {
            return m15649d(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f36690l;
            if (iVar != i.f36705a) {
                i iVar2 = new i();
                while (true) {
                    b bVar = f36686h;
                    bVar.mo15657d(iVar2, iVar);
                    if (bVar.mo15656c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m15651i(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f36688j;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return m15649d(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m15651i(iVar2);
                        break;
                    }
                    iVar = this.f36690l;
                    if (iVar == i.f36705a) {
                    }
                }
            }
            return m15649d(this.f36688j);
        }
        while (nanos > 0) {
            Object obj3 = this.f36688j;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
                return m15649d(obj3);
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
        e eVar = this.f36689k;
        if (eVar != e.f36696a) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f36699d = eVar;
                if (f36686h.mo15654a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f36689k;
                }
            } while (eVar != e.f36696a);
        }
        m15646c(runnable, executor);
    }

    /* JADX INFO: renamed from: i */
    public final void m15651i(i iVar) {
        iVar.f36706b = null;
        while (true) {
            i iVar2 = this.f36690l;
            if (iVar2 == i.f36705a) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f36707c;
                if (iVar2.f36706b != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f36707c = iVar4;
                    if (iVar3.f36706b == null) {
                    }
                } else if (!f36686h.mo15656c(this, iVar2, iVar4)) {
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f36688j instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f36688j;
        return (!(obj instanceof g)) & (obj != null);
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
    /* JADX INFO: renamed from: j */
    public boolean mo15652j(V v) {
        if (v == null) {
            v = (V) f36687i;
        }
        if (!f36686h.mo15655b(this, null, v)) {
            return false;
        }
        m15645b(this);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo15653k(Throwable th) {
        Objects.requireNonNull(th);
        if (!f36686h.mo15655b(this, null, new d(th))) {
            return false;
        }
        m15645b(this);
        return true;
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f36688j instanceof c) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m15648a(sb);
        } else {
            try {
                string = mo15650g();
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
                m15648a(sb);
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
            Object obj2 = this.f36688j;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return m15649d(obj2);
            }
            i iVar = this.f36690l;
            if (iVar != i.f36705a) {
                i iVar2 = new i();
                do {
                    b bVar = f36686h;
                    bVar.mo15657d(iVar2, iVar);
                    if (bVar.mo15656c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36688j;
                            } else {
                                m15651i(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return m15649d(obj);
                    }
                    iVar = this.f36690l;
                } while (iVar != i.f36705a);
            }
            return m15649d(this.f36688j);
        }
        throw new InterruptedException();
    }
}
