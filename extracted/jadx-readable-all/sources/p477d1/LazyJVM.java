package p477d1;

import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.g, reason: use source file name */
/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class LazyJVM {
    /* JADX INFO: renamed from: a */
    public static final <T> Lazy3<T> m13020a(Lazy4 lazy4, InterfaceC6153a<? extends T> interfaceC6153a) {
        Intrinsics2.m13089e(lazy4, "mode");
        Intrinsics2.m13089e(interfaceC6153a, "initializer");
        int iOrdinal = lazy4.ordinal();
        if (iOrdinal == 0) {
            return new LazyJVM3(interfaceC6153a, null, 2, null);
        }
        if (iOrdinal == 1) {
            return new LazyJVM2(interfaceC6153a);
        }
        if (iOrdinal == 2) {
            return new Lazy6(interfaceC6153a);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Lazy3<T> m13021b(InterfaceC6153a<? extends T> interfaceC6153a) {
        Intrinsics2.m13089e(interfaceC6153a, "initializer");
        return new LazyJVM3(interfaceC6153a, null, 2, null);
    }
}
