package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.rp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class C3481rp {

    /* JADX INFO: renamed from: b */
    public long f19017b;

    /* JADX INFO: renamed from: a */
    public final long f19016a = TimeUnit.MILLISECONDS.toNanos(((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14464w)).longValue());

    /* JADX INFO: renamed from: c */
    public boolean f19018c = true;

    /* JADX INFO: renamed from: a */
    public final void m8317a(SurfaceTexture surfaceTexture, InterfaceC3000ep interfaceC3000ep) {
        if (interfaceC3000ep == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.f19018c || Math.abs(timestamp - this.f19017b) >= this.f19016a) {
            this.f19018c = false;
            this.f19017b = timestamp;
            C2267h1.f10713a.post(new RunnableC3444qp(interfaceC3000ep));
        }
    }
}
