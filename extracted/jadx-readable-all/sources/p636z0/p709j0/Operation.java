package p636z0.p709j0;

import android.annotation.SuppressLint;

/* JADX INFO: renamed from: z0.j0.p, reason: use source file name */
/* JADX INFO: compiled from: Operation.java */
/* JADX INFO: loaded from: classes.dex */
public interface Operation {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f37279a = new b.c(null);

    /* JADX INFO: renamed from: b */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C8570b f37280b = new b.C8570b(null);

    /* JADX INFO: renamed from: z0.j0.p$b */
    /* JADX INFO: compiled from: Operation.java */
    public static abstract class b {

        /* JADX INFO: renamed from: z0.j0.p$b$a */
        /* JADX INFO: compiled from: Operation.java */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public final Throwable f37281a;

            public a(Throwable th) {
                this.f37281a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f37281a.getMessage());
            }
        }

        /* JADX INFO: renamed from: z0.j0.p$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Operation.java */
        public static final class C8570b extends b {
            public C8570b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* JADX INFO: renamed from: z0.j0.p$b$c */
        /* JADX INFO: compiled from: Operation.java */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }

            public c(a aVar) {
            }
        }
    }
}
