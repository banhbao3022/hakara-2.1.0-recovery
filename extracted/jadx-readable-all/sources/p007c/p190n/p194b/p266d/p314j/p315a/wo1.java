package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wo1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = zo1.f22368c;
        if (handler != null) {
            handler.post(zo1.f22369d);
            zo1.f22368c.postDelayed(zo1.f22370e, 200L);
        }
    }
}
