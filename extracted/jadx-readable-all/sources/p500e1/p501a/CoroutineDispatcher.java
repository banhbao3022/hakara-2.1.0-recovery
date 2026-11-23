package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl;
import p477d1.p485u.CoroutineContextImpl2;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.p503c2.DispatchedContinuation;

/* JADX INFO: renamed from: e1.a.a0, reason: use source file name */
/* JADX INFO: compiled from: CoroutineDispatcher.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineDispatcher extends CoroutineContextImpl implements ContinuationInterceptor {

    /* JADX INFO: renamed from: f */
    public static final a f29617f = new a(null);

    public CoroutineDispatcher() {
        super(ContinuationInterceptor.a.f29533f);
    }

    /* JADX INFO: renamed from: F0 */
    public abstract void mo13118F0(CoroutineContext coroutineContext, Runnable runnable);

    /* JADX INFO: renamed from: G0 */
    public boolean mo13119G0(CoroutineContext coroutineContext) {
        return !(this instanceof Unconfined2);
    }

    @Override // p477d1.p485u.ContinuationInterceptor
    /* JADX INFO: renamed from: c */
    public void mo13057c(Continuation<?> continuation) {
        CancellableContinuationImpl4<?> cancellableContinuationImpl4M13138l = ((DispatchedContinuation) continuation).m13138l();
        if (cancellableContinuationImpl4M13138l != null) {
            cancellableContinuationImpl4M13138l.m13265o();
        }
    }

    @Override // p477d1.p485u.ContinuationInterceptor
    /* JADX INFO: renamed from: f */
    public final <T> Continuation<T> mo13058f(Continuation<? super T> continuation) {
        return new DispatchedContinuation(this, continuation);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to e1.a.a0 for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p477d1.p485u.CoroutineContextImpl, p477d1.p485u.CoroutineContext.a, p477d1.p485u.CoroutineContext
    public <E extends p477d1.p485u.CoroutineContext.a> E get(p477d1.p485u.CoroutineContext.b<E> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            p477d1.p493x.p495c.Intrinsics2.m13089e(r4, r0)
            boolean r1 = r4 instanceof p477d1.p485u.CoroutineContextImpl2
            r2 = 0
            if (r1 == 0) goto L33
            d1.u.b r4 = (p477d1.p485u.CoroutineContextImpl2) r4
            d1.u.f$b r1 = r3.getKey()
            p477d1.p493x.p495c.Intrinsics2.m13089e(r1, r0)
            if (r1 == r4) goto L1c
            d1.u.f$b<?> r0 = r4.f29524f
            if (r0 != r1) goto L1a
            goto L1c
        L1a:
            r0 = 0
            goto L1d
        L1c:
            r0 = 1
        L1d:
            if (r0 == 0) goto L38
            java.lang.String r0 = "element"
            p477d1.p493x.p495c.Intrinsics2.m13089e(r3, r0)
            d1.x.b.l<d1.u.f$a, E extends B> r4 = r4.f29525g
            java.lang.Object r4 = r4.mo3b(r3)
            d1.u.f$a r4 = (p477d1.p485u.CoroutineContext.a) r4
            boolean r0 = r4 instanceof p477d1.p485u.CoroutineContext.a
            if (r0 != 0) goto L31
            goto L38
        L31:
            r2 = r4
            goto L38
        L33:
            d1.u.e$a r0 = p477d1.p485u.ContinuationInterceptor.a.f29533f
            if (r0 != r4) goto L38
            r2 = r3
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p500e1.p501a.CoroutineDispatcher.get(d1.u.f$b):d1.u.f$a");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to e1.a.a0 for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p477d1.p485u.CoroutineContextImpl, p477d1.p485u.CoroutineContext
    public p477d1.p485u.CoroutineContext minusKey(p477d1.p485u.CoroutineContext.b<?> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p477d1.p493x.p495c.Intrinsics2.m13089e(r3, r0)
            boolean r1 = r3 instanceof p477d1.p485u.CoroutineContextImpl2
            if (r1 == 0) goto L32
            d1.u.b r3 = (p477d1.p485u.CoroutineContextImpl2) r3
            d1.u.f$b r1 = r2.getKey()
            p477d1.p493x.p495c.Intrinsics2.m13089e(r1, r0)
            if (r1 == r3) goto L1b
            d1.u.f$b<?> r0 = r3.f29524f
            if (r0 != r1) goto L19
            goto L1b
        L19:
            r0 = 0
            goto L1c
        L1b:
            r0 = 1
        L1c:
            if (r0 == 0) goto L30
            java.lang.String r0 = "element"
            p477d1.p493x.p495c.Intrinsics2.m13089e(r2, r0)
            d1.x.b.l<d1.u.f$a, E extends B> r3 = r3.f29525g
            java.lang.Object r3 = r3.mo3b(r2)
            d1.u.f$a r3 = (p477d1.p485u.CoroutineContext.a) r3
            if (r3 == 0) goto L30
            d1.u.h r3 = p477d1.p485u.CoroutineContextImpl4.f29535f
            goto L38
        L30:
            r3 = r2
            goto L38
        L32:
            d1.u.e$a r0 = p477d1.p485u.ContinuationInterceptor.a.f29533f
            if (r0 != r3) goto L30
            d1.u.h r3 = p477d1.p485u.CoroutineContextImpl4.f29535f
        L38:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p500e1.p501a.CoroutineDispatcher.minusKey(d1.u.f$b):d1.u.f");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C5729a.m12463r(this);
    }

    /* JADX INFO: renamed from: e1.a.a0$a */
    /* JADX INFO: compiled from: CoroutineDispatcher.kt */
    public static final class a extends CoroutineContextImpl2<ContinuationInterceptor, CoroutineDispatcher> {

        /* JADX INFO: renamed from: e1.a.a0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoroutineDispatcher.kt */
        public static final class C8539a extends Lambda implements InterfaceC6164l<CoroutineContext.a, CoroutineDispatcher> {

            /* JADX INFO: renamed from: g */
            public static final C8539a f29618g = new C8539a();

            public C8539a() {
                super(1);
            }

            @Override // p477d1.p493x.p494b.InterfaceC6164l
            /* JADX INFO: renamed from: b */
            public CoroutineDispatcher mo3b(CoroutineContext.a aVar) {
                CoroutineContext.a aVar2 = aVar;
                if (!(aVar2 instanceof CoroutineDispatcher)) {
                    aVar2 = null;
                }
                return (CoroutineDispatcher) aVar2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(ContinuationInterceptor.a.f29533f, C8539a.f29618g);
            int i = ContinuationInterceptor.f29532c;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            super(ContinuationInterceptor.a.f29533f, C8539a.f29618g);
            int i = ContinuationInterceptor.f29532c;
        }
    }
}
