package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: renamed from: c.n.b.d.j.a.ls */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC3262ls implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ JsPromptResult f16484f;

    public DialogInterfaceOnClickListenerC3262ls(JsPromptResult jsPromptResult) {
        this.f16484f = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16484f.cancel();
    }
}
