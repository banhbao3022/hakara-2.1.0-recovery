package p636z0.p725k.p736i;

import android.graphics.Typeface;

/* JADX INFO: renamed from: z0.k.i.a, reason: use source file name */
/* JADX INFO: compiled from: CallbackWithHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CallbackWithHandler implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ FontsContractCompat3 f37895f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Typeface f37896g;

    public CallbackWithHandler(CallbackWithHandler3 callbackWithHandler3, FontsContractCompat3 fontsContractCompat3, Typeface typeface) {
        this.f37895f = fontsContractCompat3;
        this.f37896g = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f37895f.mo16175b(this.f37896g);
    }
}
