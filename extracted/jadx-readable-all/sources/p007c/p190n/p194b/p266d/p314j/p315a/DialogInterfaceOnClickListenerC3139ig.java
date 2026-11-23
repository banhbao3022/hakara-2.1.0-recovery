package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.DialogInterface;

/* JADX INFO: renamed from: c.n.b.d.j.a.ig */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC3139ig implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C3176jg f15179f;

    public DialogInterfaceOnClickListenerC3139ig(C3176jg c3176jg) {
        this.f15179f = c3176jg;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f15179f.m7693b("User canceled the download.");
    }
}
