package p509g1.p510j0.p517j;

import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: g1.j0.j.s, reason: use source file name */
/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Settings2 {

    /* JADX INFO: renamed from: a */
    public int f30511a;

    /* JADX INFO: renamed from: b */
    public final int[] f30512b = new int[10];

    /* JADX INFO: renamed from: g1.j0.j.s$a */
    /* JADX INFO: compiled from: Settings.kt */
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
    public final int m13579a() {
        if ((this.f30511a & 128) != 0) {
            return this.f30512b[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: b */
    public final void m13580b(Settings2 settings2) {
        Intrinsics2.m13090f(settings2, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & settings2.f30511a) != 0) {
                m13581c(i, settings2.f30512b[i]);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Settings2 m13581c(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f30512b;
            if (i < iArr.length) {
                this.f30511a = (1 << i) | this.f30511a;
                iArr[i] = i2;
            }
        }
        return this;
    }
}
