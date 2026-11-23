package p477d1;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.l, reason: use source file name */
/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyJVM2<T> implements Lazy3<T>, Serializable {

    /* JADX INFO: renamed from: f */
    public static final AtomicReferenceFieldUpdater<LazyJVM2<?>, Object> f29495f;

    /* JADX INFO: renamed from: g */
    public volatile InterfaceC6153a<? extends T> f29496g;

    /* JADX INFO: renamed from: h */
    public volatile Object f29497h;

    /* JADX INFO: renamed from: d1.l$a */
    /* JADX INFO: compiled from: LazyJVM.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
        f29495f = AtomicReferenceFieldUpdater.newUpdater(LazyJVM2.class, Object.class, "h");
    }

    public LazyJVM2(InterfaceC6153a<? extends T> interfaceC6153a) {
        Intrinsics2.m13089e(interfaceC6153a, "initializer");
        this.f29496g = interfaceC6153a;
        this.f29497h = Lazy5.f29501a;
    }

    private final Object writeReplace() {
        return new Lazy2(getValue());
    }

    @Override // p477d1.Lazy3
    public T getValue() {
        T t = (T) this.f29497h;
        Lazy5 lazy5 = Lazy5.f29501a;
        if (t != lazy5) {
            return t;
        }
        InterfaceC6153a<? extends T> interfaceC6153a = this.f29496g;
        if (interfaceC6153a != null) {
            T tMo2c = interfaceC6153a.mo2c();
            if (f29495f.compareAndSet(this, lazy5, tMo2c)) {
                this.f29496g = null;
                return tMo2c;
            }
        }
        return (T) this.f29497h;
    }

    public String toString() {
        return this.f29497h != Lazy5.f29501a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
