package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Environment;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.j.a.q2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3421q2 implements Callable<Boolean> {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
