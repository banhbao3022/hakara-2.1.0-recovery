package p007c.p165l.p178k0;

import android.view.View;

/* JADX INFO: renamed from: c.l.k0.i0, reason: use source file name */
/* JADX INFO: compiled from: WebDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class WebDialog2 implements View.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ WebDialog f4953f;

    public WebDialog2(WebDialog webDialog) {
        this.f4953f = webDialog;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f4953f.cancel();
    }
}
