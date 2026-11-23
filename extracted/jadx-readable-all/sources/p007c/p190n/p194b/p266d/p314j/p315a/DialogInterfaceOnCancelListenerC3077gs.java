package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: c.n.b.d.j.a.gs */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC3077gs implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ JsResult f14657f;

    public DialogInterfaceOnCancelListenerC3077gs(JsResult jsResult) {
        this.f14657f = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f14657f.cancel();
    }
}
