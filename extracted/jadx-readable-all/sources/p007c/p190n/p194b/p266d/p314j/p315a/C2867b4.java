package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c.n.b.d.j.a.b4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2867b4 {

    /* JADX INFO: renamed from: a */
    public MotionEvent f12512a = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: b */
    public MotionEvent f12513b = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f12514c;

    public C2867b4(Context context, ScheduledExecutorService scheduledExecutorService, C2942d4 c2942d4, byte[] bArr) {
        this.f12514c = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: a */
    public final kv1<String> m5925a() {
        return (zu1) cw0.m6248r(zu1.m8908s(cw0.m6231a(null)), C3386p4.f17824c.m6603d().longValue(), TimeUnit.MILLISECONDS, this.f12514c);
    }
}
