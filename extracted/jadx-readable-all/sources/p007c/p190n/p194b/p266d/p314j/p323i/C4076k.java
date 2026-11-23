package p007c.p190n.p194b.p266d.p314j.p323i;

import java.io.PrintStream;

/* JADX INFO: renamed from: c.n.b.d.j.i.k */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4076k {

    /* JADX INFO: renamed from: a */
    public static final AbstractC4070e f23018a;

    static {
        AbstractC4070e c4074i;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                c4074i = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C4073h() : new C4074i();
            } else {
                c4074i = new C4075j();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = C4074i.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            c4074i = new C4074i();
        }
        f23018a = c4074i;
        if (num == null) {
            return;
        }
        num.intValue();
    }
}
