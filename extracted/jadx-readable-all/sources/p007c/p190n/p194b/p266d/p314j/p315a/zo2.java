package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zo2 implements Executor {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Handler f22377f;

    public zo2(Handler handler) {
        this.f22377f = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f22377f.post(runnable);
    }
}
