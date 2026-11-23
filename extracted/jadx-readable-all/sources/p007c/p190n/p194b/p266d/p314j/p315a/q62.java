package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.PrintStream;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q62 {

    /* JADX INFO: renamed from: a */
    public static final k62 f18207a;

    static {
        k62 o62Var;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                o62Var = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new n62() : new o62();
            } else {
                o62Var = new p62();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = o62.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            o62Var = new o62();
        }
        f18207a = o62Var;
        if (num == null) {
            return;
        }
        num.intValue();
    }
}
