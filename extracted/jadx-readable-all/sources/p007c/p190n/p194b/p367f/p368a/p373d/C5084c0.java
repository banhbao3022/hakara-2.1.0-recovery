package p007c.p190n.p194b.p367f.p368a.p373d;

import java.io.PrintStream;

/* JADX INFO: renamed from: c.n.b.f.a.d.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5084c0 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC5120w f26038a;

    static {
        AbstractC5120w c5080a0;
        Integer num = null;
        try {
            try {
                num = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num == null || num.intValue() < 19) {
                c5080a0 = !Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic") ? new C5123z() : new C5080a0();
            } else {
                c5080a0 = new C5082b0();
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = C5080a0.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            c5080a0 = new C5080a0();
        }
        f26038a = c5080a0;
        if (num == null) {
            return;
        }
        num.intValue();
    }
}
