package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: renamed from: c.n.b.d.j.a.hs */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC3114hs implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ JsResult f14953f;

    public DialogInterfaceOnClickListenerC3114hs(JsResult jsResult) {
        this.f14953f = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f14953f.cancel();
    }
}
