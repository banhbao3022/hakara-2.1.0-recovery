package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: c.n.b.d.j.a.ks */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC3225ks implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ JsPromptResult f16028f;

    public DialogInterfaceOnCancelListenerC3225ks(JsPromptResult jsPromptResult) {
        this.f16028f = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f16028f.cancel();
    }
}
