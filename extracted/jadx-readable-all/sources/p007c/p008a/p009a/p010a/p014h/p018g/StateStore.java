package p007c.p008a.p009a.p010a.p014h.p018g;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.a.h.g.b, reason: use source file name */
/* JADX INFO: compiled from: StateStore.kt */
/* JADX INFO: loaded from: classes.dex */
public final class StateStore {

    /* JADX INFO: renamed from: a */
    public final int[] f1555a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: c.a.a.a.h.g.b$a */
    /* JADX INFO: compiled from: StateStore.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1157a() {
        return (this.f1555a[3] & (-268435456)) != 0;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1158b(int[] iArr, boolean z) {
        Intrinsics2.m13089e(iArr, "states");
        int i = z ? 268435455 : -1;
        int[] iArr2 = this.f1555a;
        int length = iArr2.length - iArr.length;
        int length2 = iArr2.length;
        boolean z2 = true;
        for (int i2 = length; i2 < length2; i2++) {
            z2 &= (this.f1555a[i2] & i) == (iArr[i2 - length] & i);
        }
        return z2;
    }

    /* JADX INFO: renamed from: c */
    public final void m1159c(boolean z, int i) {
        int i2 = (z ? -268435456 : 0) | i;
        int[] iArr = this.f1555a;
        if (iArr[3] == i2) {
            return;
        }
        iArr[0] = iArr[1];
        iArr[1] = iArr[2];
        iArr[2] = iArr[3];
        iArr[3] = i;
    }
}
