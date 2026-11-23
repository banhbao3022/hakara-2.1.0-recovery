package p477d1.p485u;

import java.io.Serializable;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Ref;

/* JADX INFO: renamed from: d1.u.c, reason: use source file name */
/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineContextImpl3 implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: f */
    public final CoroutineContext f29526f;

    /* JADX INFO: renamed from: g */
    public final CoroutineContext.a f29527g;

    /* JADX INFO: renamed from: d1.u.c$a */
    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    public static final class a implements Serializable {

        /* JADX INFO: renamed from: f */
        public final CoroutineContext[] f29528f;

        /* JADX INFO: renamed from: d1.u.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CoroutineContextImpl.kt */
        public static final class C8536a {
            public C8536a() {
            }

            public C8536a(DefaultConstructorMarker defaultConstructorMarker) {
            }
        }

        static {
            new C8536a(null);
        }

        public a(CoroutineContext[] coroutineContextArr) {
            Intrinsics2.m13089e(coroutineContextArr, "elements");
            this.f29528f = coroutineContextArr;
        }

        private final Object readResolve() {
            CoroutineContext[] coroutineContextArr = this.f29528f;
            CoroutineContext coroutineContextPlus = CoroutineContextImpl4.f29535f;
            for (CoroutineContext coroutineContext : coroutineContextArr) {
                coroutineContextPlus = coroutineContextPlus.plus(coroutineContext);
            }
            return coroutineContextPlus;
        }
    }

    /* JADX INFO: renamed from: d1.u.c$b */
    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    public static final class b extends Lambda implements InterfaceC6168p<String, CoroutineContext.a, String> {

        /* JADX INFO: renamed from: g */
        public static final b f29529g = new b();

        public b() {
            super(2);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public String mo5l(String str, CoroutineContext.a aVar) {
            String str2 = str;
            CoroutineContext.a aVar2 = aVar;
            Intrinsics2.m13089e(str2, "acc");
            Intrinsics2.m13089e(aVar2, "element");
            if (str2.length() == 0) {
                return aVar2.toString();
            }
            return str2 + ", " + aVar2;
        }
    }

    /* JADX INFO: renamed from: d1.u.c$c */
    /* JADX INFO: compiled from: CoroutineContextImpl.kt */
    public static final class c extends Lambda implements InterfaceC6168p<Unit, CoroutineContext.a, Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CoroutineContext[] f29530g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Ref f29531h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineContext[] coroutineContextArr, Ref ref) {
            super(2);
            this.f29530g = coroutineContextArr;
            this.f29531h = ref;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public Unit mo5l(Unit unit, CoroutineContext.a aVar) {
            CoroutineContext.a aVar2 = aVar;
            Intrinsics2.m13089e(unit, "<anonymous parameter 0>");
            Intrinsics2.m13089e(aVar2, "element");
            CoroutineContext[] coroutineContextArr = this.f29530g;
            Ref ref = this.f29531h;
            int i = ref.f29602f;
            ref.f29602f = i + 1;
            coroutineContextArr[i] = aVar2;
            return Unit.f29502a;
        }
    }

    public CoroutineContextImpl3(CoroutineContext coroutineContext, CoroutineContext.a aVar) {
        Intrinsics2.m13089e(coroutineContext, "left");
        Intrinsics2.m13089e(aVar, "element");
        this.f29526f = coroutineContext;
        this.f29527g = aVar;
    }

    private final Object writeReplace() {
        int iM13055b = m13055b();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[iM13055b];
        Ref ref = new Ref();
        ref.f29602f = 0;
        fold(Unit.f29502a, new c(coroutineContextArr, ref));
        if (ref.f29602f == iM13055b) {
            return new a(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX INFO: renamed from: b */
    public final int m13055b() {
        int i = 2;
        CoroutineContextImpl3 coroutineContextImpl3 = this;
        while (true) {
            CoroutineContext coroutineContext = coroutineContextImpl3.f29526f;
            if (!(coroutineContext instanceof CoroutineContextImpl3)) {
                coroutineContext = null;
            }
            coroutineContextImpl3 = (CoroutineContextImpl3) coroutineContext;
            if (coroutineContextImpl3 == null) {
                return i;
            }
            i++;
        }
    }

    public boolean equals(Object obj) {
        boolean zM13085a;
        if (this != obj) {
            if (!(obj instanceof CoroutineContextImpl3)) {
                return false;
            }
            CoroutineContextImpl3 coroutineContextImpl3 = (CoroutineContextImpl3) obj;
            if (coroutineContextImpl3.m13055b() != m13055b()) {
                return false;
            }
            Objects.requireNonNull(coroutineContextImpl3);
            CoroutineContextImpl3 coroutineContextImpl4 = this;
            while (true) {
                CoroutineContext.a aVar = coroutineContextImpl4.f29527g;
                if (!Intrinsics2.m13085a(coroutineContextImpl3.get(aVar.getKey()), aVar)) {
                    zM13085a = false;
                    break;
                }
                CoroutineContext coroutineContext = coroutineContextImpl4.f29526f;
                if (!(coroutineContext instanceof CoroutineContextImpl3)) {
                    Objects.requireNonNull(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                    CoroutineContext.a aVar2 = (CoroutineContext.a) coroutineContext;
                    zM13085a = Intrinsics2.m13085a(coroutineContextImpl3.get(aVar2.getKey()), aVar2);
                    break;
                }
                coroutineContextImpl4 = (CoroutineContextImpl3) coroutineContext;
            }
            if (!zM13085a) {
                return false;
            }
        }
        return true;
    }

    @Override // p477d1.p485u.CoroutineContext
    public <R> R fold(R r, InterfaceC6168p<? super R, ? super CoroutineContext.a, ? extends R> interfaceC6168p) {
        Intrinsics2.m13089e(interfaceC6168p, "operation");
        return interfaceC6168p.mo5l((Object) this.f29526f.fold(r, interfaceC6168p), this.f29527g);
    }

    @Override // p477d1.p485u.CoroutineContext
    public <E extends CoroutineContext.a> E get(CoroutineContext.b<E> bVar) {
        Intrinsics2.m13089e(bVar, "key");
        CoroutineContextImpl3 coroutineContextImpl3 = this;
        while (true) {
            E e = (E) coroutineContextImpl3.f29527g.get(bVar);
            if (e != null) {
                return e;
            }
            CoroutineContext coroutineContext = coroutineContextImpl3.f29526f;
            if (!(coroutineContext instanceof CoroutineContextImpl3)) {
                return (E) coroutineContext.get(bVar);
            }
            coroutineContextImpl3 = (CoroutineContextImpl3) coroutineContext;
        }
    }

    public int hashCode() {
        return this.f29527g.hashCode() + this.f29526f.hashCode();
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b<?> bVar) {
        Intrinsics2.m13089e(bVar, "key");
        if (this.f29527g.get(bVar) != null) {
            return this.f29526f;
        }
        CoroutineContext coroutineContextMinusKey = this.f29526f.minusKey(bVar);
        if (coroutineContextMinusKey == this.f29526f) {
            return this;
        }
        return coroutineContextMinusKey == CoroutineContextImpl4.f29535f ? this.f29527g : new CoroutineContextImpl3(coroutineContextMinusKey, this.f29527g);
    }

    @Override // p477d1.p485u.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        Intrinsics2.m13089e(coroutineContext, "context");
        Intrinsics2.m13089e(coroutineContext, "context");
        return coroutineContext == CoroutineContextImpl4.f29535f ? this : (CoroutineContext) coroutineContext.fold(this, CoroutineContext2.f29534g);
    }

    public String toString() {
        return outline.m1550A(outline.m1556G("["), (String) fold("", b.f29529g), "]");
    }
}
