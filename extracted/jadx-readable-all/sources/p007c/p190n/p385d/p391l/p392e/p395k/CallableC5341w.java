package p007c.p190n.p385d.p391l.p392e.p395k;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.d.l.e.k.w */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class CallableC5341w implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f26631a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5335t f26632b;

    public CallableC5341w(C5335t c5335t, long j2) {
        this.f26632b = c5335t;
        this.f26631a = j2;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f26631a);
        this.f26632b.f26609z.mo11721a("_ae", bundle);
        return null;
    }
}
