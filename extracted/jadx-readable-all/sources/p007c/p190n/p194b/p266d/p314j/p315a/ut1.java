package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ut1 {

    /* JADX INFO: renamed from: a */
    public static final ut1 f20428a = new ut1(new C3597a());

    /* JADX INFO: renamed from: b */
    public final Throwable f20429b;

    /* JADX INFO: renamed from: c.n.b.d.j.a.ut1$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
    public class C3597a extends Throwable {
        public C3597a() {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    public ut1(Throwable th) {
        Objects.requireNonNull(th);
        this.f20429b = th;
    }
}
