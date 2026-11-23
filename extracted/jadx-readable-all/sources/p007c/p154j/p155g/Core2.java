package p007c.p154j.p155g;

/* JADX INFO: renamed from: c.j.g.a, reason: use source file name */
/* JADX INFO: compiled from: Core.java */
/* JADX INFO: loaded from: classes.dex */
public class Core2 {

    /* JADX INFO: renamed from: a */
    public static Core2 f4415a;

    /* JADX INFO: renamed from: b */
    public final ExecutorSupplier f4416b = new DefaultExecutorSupplier();

    /* JADX INFO: renamed from: a */
    public static Core2 m2225a() {
        if (f4415a == null) {
            synchronized (Core2.class) {
                if (f4415a == null) {
                    f4415a = new Core2();
                }
            }
        }
        return f4415a;
    }
}
