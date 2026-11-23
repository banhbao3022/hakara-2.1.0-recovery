package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.DialogInterface;
import android.net.Uri;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC2280m implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RunnableC2283n f10746f;

    public DialogInterfaceOnClickListenerC2280m(RunnableC2283n runnableC2283n) {
        this.f10746f = runnableC2283n;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        C2267h1.m4759r(this.f10746f.f10750f, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
