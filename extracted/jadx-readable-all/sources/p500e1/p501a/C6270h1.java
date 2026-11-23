package p500e1.p501a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Exceptions;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p485u.p487j.p488a.ContinuationImpl3;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.p503c2.Atomic3;
import p500e1.p501a.p503c2.LockFreeLinkedList2;
import p500e1.p501a.p503c2.LockFreeLinkedList3;
import p500e1.p501a.p503c2.Symbol;

/* JADX INFO: renamed from: e1.a.h1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public class C6270h1 implements Job, Job5, Job6 {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29745f = AtomicReferenceFieldUpdater.newUpdater(C6270h1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: renamed from: e1.a.h1$a */
    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class a<T> extends CancellableContinuationImpl4<T> {

        /* JADX INFO: renamed from: m */
        public final C6270h1 f29746m;

        public a(Continuation<? super T> continuation, C6270h1 c6270h1) {
            super(continuation, 1);
            this.f29746m = c6270h1;
        }

        @Override // p500e1.p501a.CancellableContinuationImpl4
        /* JADX INFO: renamed from: r */
        public Throwable mo13244r(Job job) {
            Throwable thM13248d;
            Object objM13242x = this.f29746m.m13242x();
            if (!(objM13242x instanceof c) || (thM13248d = ((c) objM13242x).m13248d()) == null) {
                return objM13242x instanceof CompletionState2 ? ((CompletionState2) objM13242x).f29810b : ((C6270h1) job).mo13127H();
            }
            return thM13248d;
        }

        @Override // p500e1.p501a.CancellableContinuationImpl4
        /* JADX INFO: renamed from: v */
        public String mo13245v() {
            return "AwaitContinuation";
        }
    }

    /* JADX INFO: renamed from: e1.a.h1$b */
    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class b extends AbstractC6267g1 {

        /* JADX INFO: renamed from: j */
        public final C6270h1 f29747j;

        /* JADX INFO: renamed from: k */
        public final c f29748k;

        /* JADX INFO: renamed from: l */
        public final C6286n f29749l;

        /* JADX INFO: renamed from: m */
        public final Object f29750m;

        public b(C6270h1 c6270h1, c cVar, C6286n c6286n, Object obj) {
            this.f29747j = c6270h1;
            this.f29748k = cVar;
            this.f29749l = c6286n;
            this.f29750m = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public /* bridge */ /* synthetic */ Unit mo3b(Throwable th) {
            mo13120q(th);
            return Unit.f29502a;
        }

        @Override // p500e1.p501a.CompletionHandler2
        /* JADX INFO: renamed from: q */
        public void mo13120q(Throwable th) {
            C6270h1 c6270h1 = this.f29747j;
            c cVar = this.f29748k;
            C6286n c6286n = this.f29749l;
            Object obj = this.f29750m;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C6270h1.f29745f;
            C6286n c6286nM13222F = c6270h1.m13222F(c6286n);
            if (c6286nM13222F == null || !c6270h1.m13230Q(cVar, c6286nM13222F, obj)) {
                c6270h1.mo13162d(c6270h1.m13238q(cVar, obj));
            }
        }
    }

    /* JADX INFO: renamed from: e1.a.h1$c */
    /* JADX INFO: compiled from: JobSupport.kt */
    public static final class c implements InterfaceC6317x0 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* JADX INFO: renamed from: f */
        public final C6282l1 f29751f;

        public c(C6282l1 c6282l1, boolean z, Throwable th) {
            this.f29751f = c6282l1;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @Override // p500e1.p501a.InterfaceC6317x0
        /* JADX INFO: renamed from: a */
        public boolean mo13216a() {
            return ((Throwable) this._rootCause) == null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public final void m13246b(Throwable th) {
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 == null) {
                this._rootCause = th;
                return;
            }
            if (th == th2) {
                return;
            }
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                this._exceptionsHolder = th;
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(outline.m1598t("State is ", obj).toString());
                }
                ((ArrayList) obj).add(th);
            } else {
                if (th == obj) {
                    return;
                }
                ArrayList<Throwable> arrayListM13247c = m13247c();
                arrayListM13247c.add(obj);
                arrayListM13247c.add(th);
                this._exceptionsHolder = arrayListM13247c;
            }
        }

        /* JADX INFO: renamed from: c */
        public final ArrayList<Throwable> m13247c() {
            return new ArrayList<>(4);
        }

        /* JADX INFO: renamed from: d */
        public final Throwable m13248d() {
            return (Throwable) this._rootCause;
        }

        @Override // p500e1.p501a.InterfaceC6317x0
        /* JADX INFO: renamed from: e */
        public C6282l1 mo13217e() {
            return this.f29751f;
        }

        /* JADX INFO: renamed from: f */
        public final boolean m13249f() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        /* JADX INFO: renamed from: g */
        public final boolean m13250g() {
            return this._isCompleting;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m13251h() {
            return this._exceptionsHolder == C6273i1.f29759e;
        }

        /* JADX INFO: renamed from: i */
        public final List<Throwable> m13252i(Throwable th) {
            ArrayList arrayListM13247c;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayListM13247c = m13247c();
            } else if (obj instanceof Throwable) {
                ArrayList arrayListM13247c2 = m13247c();
                arrayListM13247c2.add(obj);
                arrayListM13247c = arrayListM13247c2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(outline.m1598t("State is ", obj).toString());
                }
                arrayListM13247c = (ArrayList) obj;
            }
            Throwable th2 = (Throwable) this._rootCause;
            if (th2 != null) {
                arrayListM13247c.add(0, th2);
            }
            if (th != null && (!Intrinsics2.m13085a(th, th2))) {
                arrayListM13247c.add(th);
            }
            this._exceptionsHolder = C6273i1.f29759e;
            return arrayListM13247c;
        }

        /* JADX INFO: renamed from: j */
        public final void m13253j(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Finishing[cancelling=");
            sbM1556G.append(m13249f());
            sbM1556G.append(", completing=");
            sbM1556G.append((boolean) this._isCompleting);
            sbM1556G.append(", rootCause=");
            sbM1556G.append((Throwable) this._rootCause);
            sbM1556G.append(", exceptions=");
            sbM1556G.append(this._exceptionsHolder);
            sbM1556G.append(", list=");
            sbM1556G.append(this.f29751f);
            sbM1556G.append(']');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: e1.a.h1$d */
    /* JADX INFO: compiled from: LockFreeLinkedList.kt */
    public static final class d extends LockFreeLinkedList3.a {

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C6270h1 f29752d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f29753e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LockFreeLinkedList3 lockFreeLinkedList3, LockFreeLinkedList3 lockFreeLinkedList4, C6270h1 c6270h1, Object obj) {
            super(lockFreeLinkedList4);
            this.f29752d = c6270h1;
            this.f29753e = obj;
        }

        @Override // p500e1.p501a.p503c2.Atomic2
        /* JADX INFO: renamed from: c */
        public Object mo13133c(LockFreeLinkedList3 lockFreeLinkedList3) {
            if (this.f29752d.m13242x() == this.f29753e) {
                return null;
            }
            return LockFreeLinkedList2.f29649a;
        }
    }

    public C6270h1(boolean z) {
        this._state = z ? C6273i1.f29761g : C6273i1.f29760f;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: A */
    public final void m13220A(Job job) {
        if (job == null) {
            this._parentHandle = Job4.f29773f;
            return;
        }
        job.start();
        Job3 job3Mo13126D0 = job.mo13126D0(this);
        this._parentHandle = job3Mo13126D0;
        if (!(m13242x() instanceof InterfaceC6317x0)) {
            job3Mo13126D0.dispose();
            this._parentHandle = Job4.f29773f;
        }
    }

    /* JADX INFO: renamed from: B */
    public boolean mo13161B() {
        return this instanceof Builders;
    }

    /* JADX INFO: renamed from: C */
    public final Object m13221C(Object obj) throws Throwable {
        Object objM13229P;
        do {
            objM13229P = m13229P(m13242x(), obj);
            if (objM13229P == C6273i1.f29755a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                if (!(obj instanceof CompletionState2)) {
                    obj = null;
                }
                CompletionState2 completionState2 = (CompletionState2) obj;
                throw new IllegalStateException(str, completionState2 != null ? completionState2.f29810b : null);
            }
        } while (objM13229P == C6273i1.f29757c);
        return objM13229P;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00a2 A[SYNTHETIC] */
    @Override // p500e1.p501a.Job
    /* JADX INFO: renamed from: D */
    public final Job2 mo13125D(boolean z, boolean z2, InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        AbstractC6267g1 c6212b1;
        Throwable thM13248d;
        if (z) {
            c6212b1 = (AbstractC6261e1) (!(interfaceC6164l instanceof AbstractC6261e1) ? null : interfaceC6164l);
            if (c6212b1 == null) {
                c6212b1 = new C6208a1(interfaceC6164l);
            }
        } else {
            c6212b1 = (AbstractC6267g1) (!(interfaceC6164l instanceof AbstractC6267g1) ? null : interfaceC6164l);
            if (c6212b1 == null) {
                c6212b1 = new C6212b1(interfaceC6164l);
            }
        }
        c6212b1.f29743i = this;
        while (true) {
            Object objM13242x = m13242x();
            if (objM13242x instanceof C6287n0) {
                C6287n0 c6287n0 = (C6287n0) objM13242x;
                if (!c6287n0.f29775f) {
                    C6282l1 c6282l1 = new C6282l1();
                    Object c6314w0 = c6282l1;
                    if (!c6287n0.f29775f) {
                        c6314w0 = new C6314w0(c6282l1);
                    }
                    f29745f.compareAndSet(this, c6287n0, c6314w0);
                } else if (f29745f.compareAndSet(this, objM13242x, c6212b1)) {
                    return c6212b1;
                }
            } else {
                if (!(objM13242x instanceof InterfaceC6317x0)) {
                    if (z2) {
                        if (!(objM13242x instanceof CompletionState2)) {
                            objM13242x = null;
                        }
                        CompletionState2 completionState2 = (CompletionState2) objM13242x;
                        interfaceC6164l.mo3b(completionState2 != null ? completionState2.f29810b : null);
                    }
                    return Job4.f29773f;
                }
                C6282l1 c6282l1Mo13217e = ((InterfaceC6317x0) objM13242x).mo13217e();
                if (c6282l1Mo13217e == null) {
                    Objects.requireNonNull(objM13242x, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m13224K((AbstractC6267g1) objM13242x);
                } else {
                    Job2 job2 = Job4.f29773f;
                    if (z && (objM13242x instanceof c)) {
                        synchronized (objM13242x) {
                            thM13248d = ((c) objM13242x).m13248d();
                            if (thM13248d == null || ((interfaceC6164l instanceof C6286n) && !((c) objM13242x).m13250g())) {
                                if (m13231b(objM13242x, c6282l1Mo13217e, c6212b1)) {
                                    if (thM13248d == null) {
                                        return c6212b1;
                                    }
                                    job2 = c6212b1;
                                }
                            }
                        }
                        if (thM13248d != null) {
                            if (z2) {
                                interfaceC6164l.mo3b(thM13248d);
                            }
                            return job2;
                        }
                        if (m13231b(objM13242x, c6282l1Mo13217e, c6212b1)) {
                            return c6212b1;
                        }
                    } else {
                        thM13248d = null;
                        if (thM13248d != null) {
                            if (z2) {
                                interfaceC6164l.mo3b(thM13248d);
                            }
                            return job2;
                        }
                        if (m13231b(objM13242x, c6282l1Mo13217e, c6212b1)) {
                            return c6212b1;
                        }
                    }
                }
            }
        }
    }

    @Override // p500e1.p501a.Job
    /* JADX INFO: renamed from: D0 */
    public final Job3 mo13126D0(Job5 job5) {
        Job2 job2M12467v = C5729a.m12467v(this, true, false, new C6286n(job5), 2, null);
        Objects.requireNonNull(job2M12467v, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (Job3) job2M12467v;
    }

    /* JADX INFO: renamed from: E */
    public String mo13108E() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: F */
    public final C6286n m13222F(LockFreeLinkedList3 lockFreeLinkedList3) {
        while (lockFreeLinkedList3.mo13143o()) {
            lockFreeLinkedList3 = lockFreeLinkedList3.m13148n();
        }
        while (true) {
            lockFreeLinkedList3 = lockFreeLinkedList3.m13147m();
            if (!lockFreeLinkedList3.mo13143o()) {
                if (lockFreeLinkedList3 instanceof C6286n) {
                    return (C6286n) lockFreeLinkedList3;
                }
                if (lockFreeLinkedList3 instanceof C6282l1) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m13223G(C6282l1 c6282l1, Throwable th) throws Throwable {
        C6319y c6319y = null;
        Object objM13146k = c6282l1.m13146k();
        Objects.requireNonNull(objM13146k, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        for (LockFreeLinkedList3 lockFreeLinkedList3M13147m = (LockFreeLinkedList3) objM13146k; !Intrinsics2.m13085a(lockFreeLinkedList3M13147m, c6282l1); lockFreeLinkedList3M13147m = lockFreeLinkedList3M13147m.m13147m()) {
            if (lockFreeLinkedList3M13147m instanceof AbstractC6261e1) {
                AbstractC6267g1 abstractC6267g1 = (AbstractC6267g1) lockFreeLinkedList3M13147m;
                try {
                    abstractC6267g1.mo13120q(th);
                } catch (Throwable th2) {
                    if (c6319y != null) {
                        Exceptions.m12964a(c6319y, th2);
                    } else {
                        c6319y = new C6319y("Exception in completion handler " + abstractC6267g1 + " for " + this, th2);
                    }
                }
            }
        }
        if (c6319y != null) {
            mo13117z(c6319y);
        }
        m13233l(th);
    }

    @Override // p500e1.p501a.Job
    /* JADX INFO: renamed from: H */
    public final CancellationException mo13127H() {
        Object objM13242x = m13242x();
        if (objM13242x instanceof c) {
            Throwable thM13248d = ((c) objM13242x).m13248d();
            if (thM13248d != null) {
                return m13227N(thM13248d, getClass().getSimpleName() + " is cancelling");
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objM13242x instanceof InterfaceC6317x0) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (objM13242x instanceof CompletionState2) {
            return m13227N(((CompletionState2) objM13242x).f29810b, null);
        }
        return new Exceptions6(getClass().getSimpleName() + " has completed normally", null, this);
    }

    /* JADX INFO: renamed from: I */
    public void mo13109I(Object obj) {
    }

    /* JADX INFO: renamed from: J */
    public void mo13110J() {
    }

    /* JADX INFO: renamed from: K */
    public final void m13224K(AbstractC6267g1 abstractC6267g1) {
        C6282l1 c6282l1 = new C6282l1();
        LockFreeLinkedList3.f29651g.lazySet(c6282l1, abstractC6267g1);
        LockFreeLinkedList3.f29650f.lazySet(c6282l1, abstractC6267g1);
        while (abstractC6267g1.m13146k() == abstractC6267g1) {
            if (LockFreeLinkedList3.f29650f.compareAndSet(abstractC6267g1, abstractC6267g1, c6282l1)) {
                c6282l1.m13145i(abstractC6267g1);
                break;
            }
        }
        f29745f.compareAndSet(this, abstractC6267g1, abstractC6267g1.m13147m());
    }

    /* JADX INFO: renamed from: L */
    public final int m13225L(Object obj) {
        if (obj instanceof C6287n0) {
            if (((C6287n0) obj).f29775f) {
                return 0;
            }
            if (!f29745f.compareAndSet(this, obj, C6273i1.f29761g)) {
                return -1;
            }
            mo13110J();
            return 1;
        }
        if (!(obj instanceof C6314w0)) {
            return 0;
        }
        if (!f29745f.compareAndSet(this, obj, ((C6314w0) obj).f29816f)) {
            return -1;
        }
        mo13110J();
        return 1;
    }

    /* JADX INFO: renamed from: M */
    public final String m13226M(Object obj) {
        if (!(obj instanceof c)) {
            if (obj instanceof InterfaceC6317x0) {
                return ((InterfaceC6317x0) obj).mo13216a() ? "Active" : "New";
            }
            return obj instanceof CompletionState2 ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        if (cVar.m13249f()) {
            return "Cancelling";
        }
        return cVar.m13250g() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: N */
    public final CancellationException m13227N(Throwable th, String str) {
        CancellationException exceptions6 = (CancellationException) (!(th instanceof CancellationException) ? null : th);
        if (exceptions6 == null) {
            if (str == null) {
                str = mo13116m();
            }
            exceptions6 = new Exceptions6(str, th, this);
        }
        return exceptions6;
    }

    @Override // p500e1.p501a.Job5
    /* JADX INFO: renamed from: O */
    public final void mo13228O(Job6 job6) throws Throwable {
        m13232k(job6);
    }

    /* JADX INFO: renamed from: P */
    public final Object m13229P(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof InterfaceC6317x0)) {
            return C6273i1.f29755a;
        }
        boolean z = true;
        if (((obj instanceof C6287n0) || (obj instanceof AbstractC6267g1)) && !(obj instanceof C6286n) && !(obj2 instanceof CompletionState2)) {
            InterfaceC6317x0 interfaceC6317x0 = (InterfaceC6317x0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29745f;
            Symbol symbol = C6273i1.f29755a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC6317x0, obj2 instanceof InterfaceC6317x0 ? new C6320y0((InterfaceC6317x0) obj2) : obj2)) {
                mo13109I(obj2);
                m13236o(interfaceC6317x0, obj2);
            } else {
                z = false;
            }
            return z ? obj2 : C6273i1.f29757c;
        }
        InterfaceC6317x0 interfaceC6317x1 = (InterfaceC6317x0) obj;
        C6282l1 c6282l1M13240v = m13240v(interfaceC6317x1);
        if (c6282l1M13240v == null) {
            return C6273i1.f29757c;
        }
        C6286n c6286nM13222F = null;
        c cVar = (c) (!(interfaceC6317x1 instanceof c) ? null : interfaceC6317x1);
        if (cVar == null) {
            cVar = new c(c6282l1M13240v, false, null);
        }
        synchronized (cVar) {
            if (cVar.m13250g()) {
                return C6273i1.f29755a;
            }
            cVar.m13253j(true);
            if (cVar != interfaceC6317x1 && !f29745f.compareAndSet(this, interfaceC6317x1, cVar)) {
                return C6273i1.f29757c;
            }
            boolean zM13249f = cVar.m13249f();
            CompletionState2 completionState2 = (CompletionState2) (!(obj2 instanceof CompletionState2) ? null : obj2);
            if (completionState2 != null) {
                cVar.m13246b(completionState2.f29810b);
            }
            Throwable thM13248d = cVar.m13248d();
            if (!(true ^ zM13249f)) {
                thM13248d = null;
            }
            if (thM13248d != null) {
                m13223G(c6282l1M13240v, thM13248d);
            }
            C6286n c6286n = (C6286n) (!(interfaceC6317x1 instanceof C6286n) ? null : interfaceC6317x1);
            if (c6286n != null) {
                c6286nM13222F = c6286n;
            } else {
                C6282l1 c6282l1Mo13217e = interfaceC6317x1.mo13217e();
                if (c6282l1Mo13217e != null) {
                    c6286nM13222F = m13222F(c6282l1Mo13217e);
                }
            }
            return (c6286nM13222F == null || !m13230Q(cVar, c6286nM13222F, obj2)) ? m13238q(cVar, obj2) : C6273i1.f29756b;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m13230Q(c cVar, C6286n c6286n, Object obj) {
        while (C5729a.m12467v(c6286n.f29774j, false, false, new b(this, cVar, c6286n, obj), 1, null) == Job4.f29773f) {
            c6286n = m13222F(c6286n);
            if (c6286n == null) {
                return false;
            }
        }
        return true;
    }

    @Override // p500e1.p501a.Job
    /* JADX INFO: renamed from: a */
    public boolean mo13115a() {
        Object objM13242x = m13242x();
        return (objM13242x instanceof InterfaceC6317x0) && ((InterfaceC6317x0) objM13242x).mo13216a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13231b(Object obj, C6282l1 c6282l1, AbstractC6267g1 abstractC6267g1) {
        char c2;
        d dVar = new d(abstractC6267g1, abstractC6267g1, this, obj);
        do {
            LockFreeLinkedList3 lockFreeLinkedList3M13148n = c6282l1.m13148n();
            LockFreeLinkedList3.f29651g.lazySet(abstractC6267g1, lockFreeLinkedList3M13148n);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedList3.f29650f;
            atomicReferenceFieldUpdater.lazySet(abstractC6267g1, c6282l1);
            dVar.f29653b = c6282l1;
            if (atomicReferenceFieldUpdater.compareAndSet(lockFreeLinkedList3M13148n, c6282l1, dVar)) {
                c2 = dVar.mo13131a(lockFreeLinkedList3M13148n) == null ? (char) 1 : (char) 2;
            } else {
                c2 = 0;
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    @Override // p500e1.p501a.Job
    /* JADX INFO: renamed from: b0 */
    public final Job2 mo13128b0(InterfaceC6164l<? super Throwable, Unit> interfaceC6164l) {
        return mo13125D(false, true, interfaceC6164l);
    }

    /* JADX INFO: renamed from: d */
    public void mo13162d(Object obj) {
    }

    @Override // p477d1.p485u.CoroutineContext
    public <R> R fold(R r, InterfaceC6168p<? super R, ? super CoroutineContext.a, ? extends R> interfaceC6168p) {
        return (R) CoroutineContext.a.C8537a.m13059a(this, r, interfaceC6168p);
    }

    @Override // p477d1.p485u.CoroutineContext.a, p477d1.p485u.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        return (E) CoroutineContext.a.C8537a.m13060b(this, bVar);
    }

    @Override // p477d1.p485u.CoroutineContext.a
    public final CoroutineContext.b<?> getKey() {
        return Job.f29633e;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00b8  */
    /* JADX INFO: renamed from: k */
    public final boolean m13232k(Object obj) throws Throwable {
        Symbol symbol;
        boolean z;
        Object objM13229P = C6273i1.f29755a;
        if (mo13215t()) {
            do {
                Object objM13242x = m13242x();
                if (!(objM13242x instanceof InterfaceC6317x0) || ((objM13242x instanceof c) && ((c) objM13242x).m13250g())) {
                    objM13229P = C6273i1.f29755a;
                    break;
                }
                objM13229P = m13229P(objM13242x, new CompletionState2(m13237p(obj), false, 2, null));
            } while (objM13229P == C6273i1.f29757c);
            if (objM13229P == C6273i1.f29756b) {
                return true;
            }
        }
        if (objM13229P == C6273i1.f29755a) {
            Throwable thM13237p = null;
            while (true) {
                Object objM13242x2 = m13242x();
                if (objM13242x2 instanceof c) {
                    synchronized (objM13242x2) {
                        if (((c) objM13242x2).m13251h()) {
                            symbol = C6273i1.f29758d;
                        } else {
                            boolean zM13249f = ((c) objM13242x2).m13249f();
                            if (obj != null || !zM13249f) {
                                if (thM13237p == null) {
                                    thM13237p = m13237p(obj);
                                }
                                ((c) objM13242x2).m13246b(thM13237p);
                            }
                            Throwable thM13248d = zM13249f ^ true ? ((c) objM13242x2).m13248d() : null;
                            if (thM13248d != null) {
                                m13223G(((c) objM13242x2).f29751f, thM13248d);
                            }
                            symbol = C6273i1.f29755a;
                        }
                    }
                } else if (objM13242x2 instanceof InterfaceC6317x0) {
                    if (thM13237p == null) {
                        thM13237p = m13237p(obj);
                    }
                    InterfaceC6317x0 interfaceC6317x0 = (InterfaceC6317x0) objM13242x2;
                    if (interfaceC6317x0.mo13216a()) {
                        C6282l1 c6282l1M13240v = m13240v(interfaceC6317x0);
                        if (c6282l1M13240v != null) {
                            if (f29745f.compareAndSet(this, interfaceC6317x0, new c(c6282l1M13240v, false, thM13237p))) {
                                m13223G(c6282l1M13240v, thM13237p);
                                z = true;
                            } else {
                                z = false;
                            }
                        } else {
                            z = false;
                        }
                        if (z) {
                            symbol = C6273i1.f29755a;
                        }
                    } else {
                        Object objM13229P2 = m13229P(objM13242x2, new CompletionState2(thM13237p, false, 2, null));
                        if (objM13229P2 == C6273i1.f29755a) {
                            throw new IllegalStateException(outline.m1598t("Cannot happen in ", objM13242x2).toString());
                        }
                        if (objM13229P2 != C6273i1.f29757c) {
                            objM13229P = objM13229P2;
                            break;
                        }
                    }
                } else {
                    symbol = C6273i1.f29758d;
                }
                objM13229P = symbol;
                break;
            }
        }
        if (objM13229P != C6273i1.f29755a && objM13229P != C6273i1.f29756b) {
            if (objM13229P == C6273i1.f29758d) {
                return false;
            }
            mo13162d(objM13229P);
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m13233l(Throwable th) {
        if (mo13161B()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        Job3 job3 = (Job3) this._parentHandle;
        if (job3 == null || job3 == Job4.f29773f) {
            return z;
        }
        return job3.mo13273j(th) || z;
    }

    /* JADX INFO: renamed from: m */
    public String mo13116m() {
        return "Job was cancelled";
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        return CoroutineContext.a.C8537a.m13061c(this, bVar);
    }

    /* JADX INFO: renamed from: n */
    public boolean mo13234n(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m13232k(th) && mo13214s();
    }

    @Override // p500e1.p501a.Job6
    /* JADX INFO: renamed from: n0 */
    public CancellationException mo13235n0() {
        Throwable thM13248d;
        Object objM13242x = m13242x();
        if (objM13242x instanceof c) {
            thM13248d = ((c) objM13242x).m13248d();
        } else if (objM13242x instanceof CompletionState2) {
            thM13248d = ((CompletionState2) objM13242x).f29810b;
        } else {
            if (objM13242x instanceof InterfaceC6317x0) {
                throw new IllegalStateException(outline.m1598t("Cannot be cancelling child in this state: ", objM13242x).toString());
            }
            thM13248d = null;
        }
        CancellationException cancellationException = (CancellationException) (thM13248d instanceof CancellationException ? thM13248d : null);
        if (cancellationException != null) {
            return cancellationException;
        }
        StringBuilder sbM1556G = outline.m1556G("Parent job is ");
        sbM1556G.append(m13226M(objM13242x));
        return new Exceptions6(sbM1556G.toString(), thM13248d, this);
    }

    /* JADX INFO: renamed from: o */
    public final void m13236o(InterfaceC6317x0 interfaceC6317x0, Object obj) throws Throwable {
        Job3 job3 = (Job3) this._parentHandle;
        if (job3 != null) {
            job3.dispose();
            this._parentHandle = Job4.f29773f;
        }
        C6319y c6319y = null;
        if (!(obj instanceof CompletionState2)) {
            obj = null;
        }
        CompletionState2 completionState2 = (CompletionState2) obj;
        Throwable th = completionState2 != null ? completionState2.f29810b : null;
        if (interfaceC6317x0 instanceof AbstractC6267g1) {
            try {
                ((AbstractC6267g1) interfaceC6317x0).mo13120q(th);
                return;
            } catch (Throwable th2) {
                mo13117z(new C6319y("Exception in completion handler " + interfaceC6317x0 + " for " + this, th2));
                return;
            }
        }
        C6282l1 c6282l1Mo13217e = interfaceC6317x0.mo13217e();
        if (c6282l1Mo13217e != null) {
            Object objM13146k = c6282l1Mo13217e.m13146k();
            Objects.requireNonNull(objM13146k, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            for (LockFreeLinkedList3 lockFreeLinkedList3M13147m = (LockFreeLinkedList3) objM13146k; !Intrinsics2.m13085a(lockFreeLinkedList3M13147m, c6282l1Mo13217e); lockFreeLinkedList3M13147m = lockFreeLinkedList3M13147m.m13147m()) {
                if (lockFreeLinkedList3M13147m instanceof AbstractC6267g1) {
                    AbstractC6267g1 abstractC6267g1 = (AbstractC6267g1) lockFreeLinkedList3M13147m;
                    try {
                        abstractC6267g1.mo13120q(th);
                    } catch (Throwable th3) {
                        if (c6319y != null) {
                            Exceptions.m12964a(c6319y, th3);
                        } else {
                            c6319y = new C6319y("Exception in completion handler " + abstractC6267g1 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c6319y != null) {
                mo13117z(c6319y);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final Throwable m13237p(Object obj) {
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : new Exceptions6(mo13116m(), null, this);
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((Job6) obj).mo13235n0();
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.a.C8537a.m13062d(this, coroutineContext);
    }

    /* JADX INFO: renamed from: q */
    public final Object m13238q(c cVar, Object obj) throws Throwable {
        Throwable thM13239r;
        CompletionState2 completionState2 = (CompletionState2) (!(obj instanceof CompletionState2) ? null : obj);
        Throwable th = completionState2 != null ? completionState2.f29810b : null;
        synchronized (cVar) {
            cVar.m13249f();
            List<Throwable> listM13252i = cVar.m13252i(th);
            thM13239r = m13239r(cVar, listM13252i);
            if (thM13239r != null && listM13252i.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(listM13252i.size()));
                for (Throwable th2 : listM13252i) {
                    if (th2 != thM13239r && th2 != thM13239r && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        Exceptions.m12964a(thM13239r, th2);
                    }
                }
            }
        }
        if (thM13239r != null && thM13239r != th) {
            obj = new CompletionState2(thM13239r, false, 2, null);
        }
        if (thM13239r != null) {
            if (m13233l(thM13239r) || mo13243y(thM13239r)) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                CompletionState2.f29809a.compareAndSet((CompletionState2) obj, 0, 1);
            }
        }
        mo13109I(obj);
        f29745f.compareAndSet(this, cVar, obj instanceof InterfaceC6317x0 ? new C6320y0((InterfaceC6317x0) obj) : obj);
        m13236o(cVar, obj);
        return obj;
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m13239r(c cVar, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.m13249f()) {
                return new Exceptions6(mo13116m(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(!(((Throwable) next) instanceof CancellationException)));
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof Timeout) {
            for (Object obj2 : list) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof Timeout)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo13214s() {
        return true;
    }

    @Override // p500e1.p501a.Job
    public final boolean start() {
        int iM13225L;
        do {
            iM13225L = m13225L(m13242x());
            if (iM13225L == 0) {
                return false;
            }
        } while (iM13225L != 1);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo13215t() {
        return this instanceof CompletableDeferred2;
    }

    @Override // p500e1.p501a.Job
    /* JADX INFO: renamed from: t0 */
    public void mo13129t0(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new Exceptions6(mo13116m(), null, this);
        }
        m13232k(cancellationException);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo13108E() + '{' + m13226M(m13242x()) + '}');
        sb.append('@');
        sb.append(C5729a.m12463r(this));
        return sb.toString();
    }

    @Override // p500e1.p501a.Job
    /* JADX INFO: renamed from: u */
    public final Object mo13130u(Continuation<? super Unit> continuation) {
        boolean z;
        while (true) {
            Object objM13242x = m13242x();
            if (!(objM13242x instanceof InterfaceC6317x0)) {
                z = false;
                break;
            }
            if (m13225L(objM13242x) >= 0) {
                z = true;
                break;
            }
        }
        if (!z) {
            CoroutineContext coroutineContext = ((ContinuationImpl3) continuation).f29550h;
            Intrinsics2.m13087c(coroutineContext);
            C5729a.m12454i(coroutineContext);
            return Unit.f29502a;
        }
        CancellableContinuationImpl4 cancellableContinuationImpl4 = new CancellableContinuationImpl4(IntrinsicsJvm.m13064b(continuation), 1);
        cancellableContinuationImpl4.m13271x();
        C5729a.m12458m(cancellableContinuationImpl4, mo13125D(false, true, new C6297q1(cancellableContinuationImpl4)));
        Object objM13268s = cancellableContinuationImpl4.m13268s();
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        if (objM13268s == intrinsics) {
            Intrinsics2.m13089e(continuation, "frame");
        }
        return objM13268s == intrinsics ? objM13268s : Unit.f29502a;
    }

    /* JADX INFO: renamed from: v */
    public final C6282l1 m13240v(InterfaceC6317x0 interfaceC6317x0) {
        C6282l1 c6282l1Mo13217e = interfaceC6317x0.mo13217e();
        if (c6282l1Mo13217e != null) {
            return c6282l1Mo13217e;
        }
        if (interfaceC6317x0 instanceof C6287n0) {
            return new C6282l1();
        }
        if (interfaceC6317x0 instanceof AbstractC6267g1) {
            m13224K((AbstractC6267g1) interfaceC6317x0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC6317x0).toString());
    }

    /* JADX INFO: renamed from: w */
    public final Job3 m13241w() {
        return (Job3) this._parentHandle;
    }

    /* JADX INFO: renamed from: x */
    public final Object m13242x() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof Atomic3)) {
                return obj;
            }
            ((Atomic3) obj).mo13131a(this);
        }
    }

    /* JADX INFO: renamed from: y */
    public boolean mo13243y(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public void mo13117z(Throwable th) throws Throwable {
        throw th;
    }
}
