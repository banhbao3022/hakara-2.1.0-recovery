package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Binder;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wr2 {

    /* JADX INFO: renamed from: a */
    public kr2 f21314a;

    /* JADX INFO: renamed from: b */
    public boolean f21315b;

    /* JADX INFO: renamed from: c */
    public final Context f21316c;

    /* JADX INFO: renamed from: d */
    public final Object f21317d = new Object();

    public wr2(Context context) {
        this.f21316c = context;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8670a(wr2 wr2Var) {
        synchronized (wr2Var.f21317d) {
            kr2 kr2Var = wr2Var.f21314a;
            if (kr2Var == null) {
                return;
            }
            kr2Var.mo5133J();
            wr2Var.f21314a = null;
            Binder.flushPendingCommands();
        }
    }
}
