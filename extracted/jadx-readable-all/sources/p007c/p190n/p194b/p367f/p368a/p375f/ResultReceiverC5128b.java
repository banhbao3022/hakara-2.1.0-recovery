package p007c.p190n.p194b.p367f.p368a.p375f;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.f.b */
/* JADX INFO: loaded from: classes.dex */
public final class ResultReceiverC5128b extends ResultReceiver {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C5151o f26084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC5128b(Handler handler, C5151o c5151o) {
        super(handler);
        this.f26084f = c5151o;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f26084f.m11573b(null);
    }
}
