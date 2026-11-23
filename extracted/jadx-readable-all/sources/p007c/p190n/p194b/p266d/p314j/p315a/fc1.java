package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fc1 implements ia1<gc1> {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f14013a;

    public fc1(C3029fh c3029fh, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.f14013a = scheduledExecutorService;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<gc1> zza() {
        return cw0.m6250t(cw0.m6248r(cw0.m6231a(new Bundle()), ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14327c2)).longValue(), TimeUnit.MILLISECONDS, this.f14013a), ec1.f13555a, C2962do.f13330a);
    }
}
