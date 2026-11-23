package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.PrintStream;

/* JADX INFO: renamed from: c.n.b.d.j.k.k3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4223k3 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4209j3 f23269a;

    /* JADX INFO: renamed from: c.n.b.d.j.k.k3$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static final class a extends AbstractC4209j3 {
        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4209j3
        /* JADX INFO: renamed from: a */
        public final void mo9860a(Throwable th, Throwable th2) {
        }
    }

    static {
        AbstractC4209j3 aVar;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                aVar = Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ^ true ? new C4265n3() : new a();
            } else {
                aVar = new C4279o3();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = a.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            aVar = new a();
        }
        f23269a = aVar;
        if (num == null) {
            return;
        }
        num.intValue();
    }
}
