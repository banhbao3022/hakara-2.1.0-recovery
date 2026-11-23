package p636z0.p725k.p736i;

/* JADX INFO: renamed from: z0.k.i.b, reason: use source file name */
/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CallbackWithHandler2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FontsContractCompat3 f37897f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f37898g;

    public CallbackWithHandler2(CallbackWithHandler3 callbackWithHandler3, FontsContractCompat3 fontsContractCompat3, int i) {
        this.f37897f = fontsContractCompat3;
        this.f37898g = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37897f.mo16174a(this.f37898g);
    }
}
