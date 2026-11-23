package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: renamed from: c.n.b.d.j.a.ms */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC3299ms implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ JsPromptResult f16837f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ EditText f16838g;

    public DialogInterfaceOnClickListenerC3299ms(JsPromptResult jsPromptResult, EditText editText) {
        this.f16837f = jsPromptResult;
        this.f16838g = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f16837f.confirm(this.f16838g.getText().toString());
    }
}
