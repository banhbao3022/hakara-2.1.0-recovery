package p007c.p190n.p194b.p266d.p314j.p315a;

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
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class du1<V> extends aw1 implements kv1<V> {

    /* JADX INFO: renamed from: f */
    public static final boolean f13389f;

    /* JADX INFO: renamed from: g */
    public static final Logger f13390g;

    /* JADX INFO: renamed from: h */
    public static final st1 f13391h;

    /* JADX INFO: renamed from: i */
    public static final Object f13392i;

    /* JADX INFO: renamed from: j */
    @NullableDecl
    public volatile Object f13393j;

    /* JADX INFO: renamed from: k */
    @NullableDecl
    public volatile vt1 f13394k;

    /* JADX INFO: renamed from: l */
    @NullableDecl
    public volatile cu1 f13395l;

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        st1 yt1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f13389f = z;
        f13390g = Logger.getLogger(du1.class.getName());
        try {
            yt1Var = new bu1();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th = null;
                th2 = th3;
                yt1Var = new wt1(AtomicReferenceFieldUpdater.newUpdater(cu1.class, Thread.class, "b"), AtomicReferenceFieldUpdater.newUpdater(cu1.class, cu1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(du1.class, cu1.class, "l"), AtomicReferenceFieldUpdater.newUpdater(du1.class, vt1.class, "k"), AtomicReferenceFieldUpdater.newUpdater(du1.class, Object.class, "j"));
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                yt1Var = new yt1();
            }
        }
        f13391h = yt1Var;
        if (th != null) {
            Logger logger = f13390g;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f13392i = new Object();
    }

    /* JADX INFO: renamed from: b */
    public static void m6521b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f13390g;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", outline.m1553D(new StringBuilder(strValueOf.length() + 57 + strValueOf2.length()), "RuntimeException while executing runnable ", strValueOf, " with executor ", strValueOf2), (Throwable) e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static final V m6522c(Object obj) throws ExecutionException {
        if (obj instanceof tt1) {
            Throwable th = ((tt1) obj).f19984d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof ut1) {
            throw new ExecutionException(((ut1) obj).f20429b);
        }
        if (obj == f13392i) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static Object m6523e(kv1<?> kv1Var) {
        Throwable thMo5869a;
        if (kv1Var instanceof zt1) {
            Object obj = ((du1) kv1Var).f13393j;
            if (!(obj instanceof tt1)) {
                return obj;
            }
            tt1 tt1Var = (tt1) obj;
            if (!tt1Var.f19983c) {
                return obj;
            }
            Throwable th = tt1Var.f19984d;
            return th != null ? new tt1(false, th) : tt1.f19982b;
        }
        if ((kv1Var instanceof aw1) && (thMo5869a = ((aw1) kv1Var).mo5869a()) != null) {
            return new ut1(thMo5869a);
        }
        boolean zIsCancelled = kv1Var.isCancelled();
        if ((!f13389f) && zIsCancelled) {
            return tt1.f19982b;
        }
        try {
            Object objM6524p = m6524p(kv1Var);
            if (!zIsCancelled) {
                return objM6524p == null ? f13392i : objM6524p;
            }
            String strValueOf = String.valueOf(kv1Var);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 84);
            sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
            sb.append(strValueOf);
            return new tt1(false, new IllegalArgumentException(sb.toString()));
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new tt1(false, e);
            }
            String strValueOf2 = String.valueOf(kv1Var);
            return new ut1(new IllegalArgumentException(outline.m1550A(new StringBuilder(strValueOf2.length() + 77), "get() threw CancellationException, despite reporting isCancelled() == false: ", strValueOf2), e));
        } catch (ExecutionException e2) {
            if (!zIsCancelled) {
                return new ut1(e2.getCause());
            }
            String strValueOf3 = String.valueOf(kv1Var);
            return new tt1(false, new IllegalArgumentException(outline.m1550A(new StringBuilder(strValueOf3.length() + 84), "get() did not throw CancellationException, despite reporting isCancelled() == true: ", strValueOf3), e2));
        } catch (Throwable th2) {
            return new ut1(th2);
        }
    }

    /* JADX INFO: renamed from: p */
    public static <V> V m6524p(Future<V> future) throws ExecutionException {
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
    /* JADX INFO: renamed from: q */
    public static void m6525q(du1<?> du1Var) {
        vt1 vt1Var;
        vt1 vt1Var2;
        vt1 vt1Var3 = null;
        while (true) {
            cu1 cu1Var = du1Var.f13395l;
            if (f13391h.mo6102c(du1Var, cu1Var, cu1.f13120a)) {
                while (cu1Var != null) {
                    Thread thread = cu1Var.f13121b;
                    if (thread != null) {
                        cu1Var.f13121b = null;
                        LockSupport.unpark(thread);
                    }
                    cu1Var = cu1Var.f13122c;
                }
                du1Var.mo6528i();
                do {
                    vt1Var = du1Var.f13394k;
                } while (!f13391h.mo6103d(du1Var, vt1Var, vt1.f20940a));
                while (true) {
                    vt1Var2 = vt1Var3;
                    vt1Var3 = vt1Var;
                    if (vt1Var3 == null) {
                        break;
                    }
                    vt1Var = vt1Var3.f20943d;
                    vt1Var3.f20943d = vt1Var2;
                }
                while (vt1Var2 != null) {
                    vt1Var3 = vt1Var2.f20943d;
                    Runnable runnable = vt1Var2.f20941b;
                    if (runnable instanceof xt1) {
                        xt1 xt1Var = (xt1) runnable;
                        du1Var = xt1Var.f21672f;
                        if (du1Var.f13393j == xt1Var) {
                            if (f13391h.mo6104e(du1Var, xt1Var, m6523e(xt1Var.f21673g))) {
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m6521b(runnable, vt1Var2.f20942c);
                    }
                    vt1Var2 = vt1Var3;
                }
                return;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.aw1
    @NullableDecl
    /* JADX INFO: renamed from: a */
    public final Throwable mo5869a() {
        if (!(this instanceof zt1)) {
            return null;
        }
        Object obj = this.f13393j;
        if (obj instanceof ut1) {
            return ((ut1) obj).f20429b;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        tt1 tt1Var;
        Object obj = this.f13393j;
        if (!(obj == null) && !(obj instanceof xt1)) {
            return false;
        }
        if (f13389f) {
            tt1Var = new tt1(z, new CancellationException("Future.cancel() was called."));
        } else {
            tt1Var = z ? tt1.f19981a : tt1.f19982b;
        }
        boolean z2 = false;
        du1<V> du1Var = this;
        while (true) {
            if (f13391h.mo6104e(du1Var, obj, tt1Var)) {
                if (z) {
                    du1Var.mo6529j();
                }
                m6525q(du1Var);
                if (obj instanceof xt1) {
                    kv1<? extends V> kv1Var = ((xt1) obj).f21673g;
                    if (kv1Var instanceof zt1) {
                        du1Var = (du1) kv1Var;
                        obj = du1Var.f13393j;
                        if ((obj == null) | (obj instanceof xt1)) {
                            z2 = true;
                        }
                    } else {
                        kv1Var.cancel(z);
                    }
                }
                return true;
            }
            obj = du1Var.f13393j;
            if (!(obj instanceof xt1)) {
                return z2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6526d(cu1 cu1Var) {
        cu1Var.f13121b = null;
        while (true) {
            cu1 cu1Var2 = this.f13395l;
            if (cu1Var2 != cu1.f13120a) {
                cu1 cu1Var3 = null;
                while (cu1Var2 != null) {
                    cu1 cu1Var4 = cu1Var2.f13122c;
                    if (cu1Var2.f13121b != null) {
                        cu1Var3 = cu1Var2;
                    } else if (cu1Var3 != null) {
                        cu1Var3.f13122c = cu1Var4;
                        if (cu1Var3.f13121b == null) {
                        }
                    } else if (!f13391h.mo6102c(this, cu1Var2, cu1Var4)) {
                    }
                    cu1Var2 = cu1Var4;
                }
                return;
            }
            return;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.kv1
    /* JADX INFO: renamed from: f */
    public void mo6230f(Runnable runnable, Executor executor) {
        vt1 vt1Var;
        C2622l.m5289N1(runnable, "Runnable was null.");
        C2622l.m5289N1(executor, "Executor was null.");
        if (!isDone() && (vt1Var = this.f13394k) != vt1.f20940a) {
            vt1 vt1Var2 = new vt1(runnable, executor);
            do {
                vt1Var2.f20943d = vt1Var;
                if (f13391h.mo6103d(this, vt1Var, vt1Var2)) {
                    return;
                } else {
                    vt1Var = this.f13394k;
                }
            } while (vt1Var != vt1.f20940a);
        }
        m6521b(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NullableDecl
    /* JADX INFO: renamed from: g */
    public String mo6527g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f13393j;
        if ((obj2 != null) && (!(obj2 instanceof xt1))) {
            return (V) m6522c(obj2);
        }
        cu1 cu1Var = this.f13395l;
        if (cu1Var != cu1.f13120a) {
            cu1 cu1Var2 = new cu1();
            do {
                st1 st1Var = f13391h;
                st1Var.mo6101b(cu1Var2, cu1Var);
                if (st1Var.mo6102c(this, cu1Var, cu1Var2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            m6526d(cu1Var2);
                            throw new InterruptedException();
                        }
                        obj = this.f13393j;
                    } while (!((obj != null) & (!(obj instanceof xt1))));
                    return (V) m6522c(obj);
                }
                cu1Var = this.f13395l;
            } while (cu1Var != cu1.f13120a);
        }
        return (V) m6522c(this.f13393j);
    }

    /* JADX INFO: renamed from: i */
    public void mo6528i() {
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f13393j instanceof tt1;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.f13393j;
        return (!(obj instanceof xt1)) & (obj != null);
    }

    /* JADX INFO: renamed from: j */
    public void mo6529j() {
    }

    /* JADX INFO: renamed from: k */
    public final boolean m6530k() {
        Object obj = this.f13393j;
        return (obj instanceof tt1) && ((tt1) obj).f19983c;
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
    /* JADX INFO: renamed from: l */
    public boolean mo6531l(@NullableDecl V v) {
        if (v == null) {
            v = (V) f13392i;
        }
        if (!f13391h.mo6104e(this, null, v)) {
            return false;
        }
        m6525q(this);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo6532m(Throwable th) {
        Objects.requireNonNull(th);
        if (!f13391h.mo6104e(this, null, new ut1(th))) {
            return false;
        }
        m6525q(this);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m6533n(kv1<? extends V> kv1Var) {
        ut1 ut1Var;
        Objects.requireNonNull(kv1Var);
        Object obj = this.f13393j;
        if (obj == null) {
            if (kv1Var.isDone()) {
                if (!f13391h.mo6104e(this, null, m6523e(kv1Var))) {
                    return false;
                }
                m6525q(this);
                return true;
            }
            xt1 xt1Var = new xt1(this, kv1Var);
            if (f13391h.mo6104e(this, null, xt1Var)) {
                try {
                    kv1Var.mo6230f(xt1Var, wu1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        ut1Var = new ut1(th);
                    } catch (Throwable unused) {
                        ut1Var = ut1.f20428a;
                    }
                    f13391h.mo6104e(this, xt1Var, ut1Var);
                }
                return true;
            }
            obj = this.f13393j;
        }
        if (obj instanceof tt1) {
            kv1Var.cancel(((tt1) obj).f19983c);
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m6534o(@NullableDecl Future<?> future) {
        if ((future != null) && (this.f13393j instanceof tt1)) {
            future.cancel(m6530k());
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m6535r(StringBuilder sb) {
        try {
            Object objM6524p = m6524p(this);
            sb.append("SUCCESS, result=[");
            if (objM6524p == null) {
                sb.append("null");
            } else if (objM6524p == this) {
                sb.append("this future");
            } else {
                sb.append(objM6524p.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objM6524p)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    public String toString() {
        String strM1550A;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m6535r(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f13393j;
            if (obj instanceof xt1) {
                sb.append(", setFuture=[");
                kv1<? extends V> kv1Var = ((xt1) obj).f21673g;
                try {
                    if (kv1Var == this) {
                        sb.append("this future");
                    } else {
                        sb.append(kv1Var);
                    }
                } catch (RuntimeException | StackOverflowError e) {
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strM1550A = mo6527g();
                    int i = fs1.f14109a;
                    if (strM1550A == null || strM1550A.isEmpty()) {
                        strM1550A = null;
                    }
                } catch (RuntimeException | StackOverflowError e2) {
                    String strValueOf = String.valueOf(e2.getClass());
                    strM1550A = outline.m1550A(new StringBuilder(strValueOf.length() + 38), "Exception thrown from implementation: ", strValueOf);
                }
                if (strM1550A != null) {
                    sb.append(", info=[");
                    sb.append(strM1550A);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                m6535r(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f13393j;
            if ((obj != null) & (!(obj instanceof xt1))) {
                return (V) m6522c(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                cu1 cu1Var = this.f13395l;
                if (cu1Var != cu1.f13120a) {
                    cu1 cu1Var2 = new cu1();
                    while (true) {
                        st1 st1Var = f13391h;
                        st1Var.mo6101b(cu1Var2, cu1Var);
                        if (st1Var.mo6102c(this, cu1Var, cu1Var2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f13393j;
                                    if ((obj2 != null) & (!(obj2 instanceof xt1))) {
                                        return (V) m6522c(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    m6526d(cu1Var2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m6526d(cu1Var2);
                            break;
                        }
                        cu1Var = this.f13395l;
                        if (cu1Var == cu1.f13120a) {
                        }
                    }
                }
                return (V) m6522c(this.f13393j);
            }
            while (nanos > 0) {
                Object obj3 = this.f13393j;
                if ((obj3 != null) & (!(obj3 instanceof xt1))) {
                    return (V) m6522c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
            outline.m1570U(sb, "Waited ", j2, " ");
            sb.append(lowerCase2);
            String string3 = sb.toString();
            if (nanos + 1000 < 0) {
                String strConcat = String.valueOf(string3).concat(" (plus ");
                long j3 = -nanos;
                long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(jConvert);
                boolean z = jConvert == 0 || nanos2 > 1000;
                if (jConvert > 0) {
                    String strValueOf = String.valueOf(strConcat);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                    outline.m1570U(sb2, strValueOf, jConvert, " ");
                    sb2.append(lowerCase);
                    String string4 = sb2.toString();
                    if (z) {
                        string4 = String.valueOf(string4).concat(",");
                    }
                    strConcat = String.valueOf(string4).concat(" ");
                }
                if (z) {
                    String strValueOf2 = String.valueOf(strConcat);
                    StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
                    sb3.append(strValueOf2);
                    sb3.append(nanos2);
                    sb3.append(" nanoseconds ");
                    strConcat = sb3.toString();
                }
                string3 = String.valueOf(strConcat).concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(outline.m1552C(new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length()), string3, " for ", string));
        }
        throw new InterruptedException();
    }
}
