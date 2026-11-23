package p477d1;

import java.io.Serializable;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.r, reason: use source file name */
/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Lazy6<T> implements Lazy3<T>, Serializable {

    /* JADX INFO: renamed from: f */
    public InterfaceC6153a<? extends T> f29503f;

    /* JADX INFO: renamed from: g */
    public Object f29504g;

    public Lazy6(InterfaceC6153a<? extends T> interfaceC6153a) {
        Intrinsics2.m13089e(interfaceC6153a, "initializer");
        this.f29503f = interfaceC6153a;
        this.f29504g = Lazy5.f29501a;
    }

    private final Object writeReplace() {
        return new Lazy2(getValue());
    }

    @Override // p477d1.Lazy3
    public T getValue() {
        if (this.f29504g == Lazy5.f29501a) {
            InterfaceC6153a<? extends T> interfaceC6153a = this.f29503f;
            Intrinsics2.m13087c(interfaceC6153a);
            this.f29504g = interfaceC6153a.mo2c();
            this.f29503f = null;
        }
        return (T) this.f29504g;
    }

    public String toString() {
        return this.f29504g != Lazy5.f29501a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
