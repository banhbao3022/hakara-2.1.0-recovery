package p477d1;

import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.k, reason: use source file name */
/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Result<T> implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final a f29493f = new a(null);

    /* JADX INFO: renamed from: d1.k$a */
    /* JADX INFO: compiled from: Result.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: d1.k$b */
    /* JADX INFO: compiled from: Result.kt */
    public static final class b implements Serializable {

        /* JADX INFO: renamed from: f */
        public final Throwable f29494f;

        public b(Throwable th) {
            Intrinsics2.m13089e(th, "exception");
            this.f29494f = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics2.m13085a(this.f29494f, ((b) obj).f29494f);
        }

        public int hashCode() {
            return this.f29494f.hashCode();
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("Failure(");
            sbM1556G.append(this.f29494f);
            sbM1556G.append(')');
            return sbM1556G.toString();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Throwable m13022a(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f29494f;
        }
        return null;
    }
}
