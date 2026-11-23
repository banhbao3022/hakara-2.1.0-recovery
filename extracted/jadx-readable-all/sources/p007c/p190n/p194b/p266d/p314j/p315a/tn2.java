package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tn2 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public tn2(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String message = th.getMessage();
        super(outline.m1553D(new StringBuilder(simpleName.length() + 13 + String.valueOf(message).length()), "Unexpected ", simpleName, ": ", message), th);
    }
}
