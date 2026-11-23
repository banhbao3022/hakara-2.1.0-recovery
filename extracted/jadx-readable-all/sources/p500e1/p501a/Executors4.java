package p500e1.p501a;

import java.io.Closeable;
import java.util.concurrent.Executor;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl2;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Lambda;

/* JADX INFO: renamed from: e1.a.s0, reason: use source file name */
/* JADX INFO: compiled from: Executors.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Executors4 extends CoroutineDispatcher implements Closeable {
    static {
        new a(null);
    }

    /* JADX INFO: renamed from: H0 */
    public abstract Executor mo13291H0();

    /* JADX INFO: renamed from: e1.a.s0$a */
    /* JADX INFO: compiled from: Executors.kt */
    public static final class a extends CoroutineContextImpl2<CoroutineDispatcher, Executors4> {

        /* JADX INFO: renamed from: e1.a.s0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Executors.kt */
        public static final class C8540a extends Lambda implements InterfaceC6164l<CoroutineContext.a, Executors4> {

            /* JADX INFO: renamed from: g */
            public static final C8540a f29801g = new C8540a();

            public C8540a() {
                super(1);
            }

            @Override // p477d1.p493x.p494b.InterfaceC6164l
            /* JADX INFO: renamed from: b */
            public Executors4 mo3b(CoroutineContext.a aVar) {
                CoroutineContext.a aVar2 = aVar;
                if (!(aVar2 instanceof Executors4)) {
                    aVar2 = null;
                }
                return (Executors4) aVar2;
            }
        }

        public a() {
            super(CoroutineDispatcher.f29617f, C8540a.f29801g);
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
            super(CoroutineDispatcher.f29617f, C8540a.f29801g);
        }
    }
}
