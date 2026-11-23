package p477d1;

import java.io.Serializable;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.m, reason: use source file name */
/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LazyJVM3<T> implements Lazy3<T>, Serializable {

    /* JADX INFO: renamed from: f */
    public InterfaceC6153a<? extends T> f29498f;

    /* JADX INFO: renamed from: g */
    public volatile Object f29499g;

    /* JADX INFO: renamed from: h */
    public final Object f29500h;

    public LazyJVM3(InterfaceC6153a<? extends T> interfaceC6153a, Object obj) {
        Intrinsics2.m13089e(interfaceC6153a, "initializer");
        this.f29498f = interfaceC6153a;
        this.f29499g = Lazy5.f29501a;
        this.f29500h = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new Lazy2(getValue());
    }

    @Override // p477d1.Lazy3
    public T getValue() {
        T tMo2c;
        T t = (T) this.f29499g;
        Lazy5 lazy5 = Lazy5.f29501a;
        if (t != lazy5) {
            return t;
        }
        synchronized (this.f29500h) {
            tMo2c = (T) this.f29499g;
            if (tMo2c == lazy5) {
                InterfaceC6153a<? extends T> interfaceC6153a = this.f29498f;
                Intrinsics2.m13087c(interfaceC6153a);
                tMo2c = interfaceC6153a.mo2c();
                this.f29499g = tMo2c;
                this.f29498f = null;
            }
        }
        return tMo2c;
    }

    public String toString() {
        return this.f29499g != Lazy5.f29501a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ LazyJVM3(InterfaceC6153a interfaceC6153a, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6153a, (i & 2) != 0 ? null : obj);
    }
}
