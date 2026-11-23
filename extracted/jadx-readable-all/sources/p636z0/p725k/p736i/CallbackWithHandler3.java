package p636z0.p725k.p736i;

import android.os.Handler;

/* JADX INFO: renamed from: z0.k.i.c, reason: use source file name */
/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CallbackWithHandler3 {

    /* JADX INFO: renamed from: a */
    public final FontsContractCompat3 f37899a;

    /* JADX INFO: renamed from: b */
    public final Handler f37900b;

    public CallbackWithHandler3(FontsContractCompat3 fontsContractCompat3, Handler handler) {
        this.f37899a = fontsContractCompat3;
        this.f37900b = handler;
    }

    /* JADX INFO: renamed from: a */
    public void m16204a(FontRequestWorker5.a aVar) {
        int i = aVar.f37923b;
        if (!(i == 0)) {
            this.f37900b.post(new CallbackWithHandler2(this, this.f37899a, i));
        } else {
            this.f37900b.post(new CallbackWithHandler(this, this.f37899a, aVar.f37922a));
        }
    }
}
