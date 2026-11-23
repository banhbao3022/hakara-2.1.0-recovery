package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2283n implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f10750f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f10751g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f10752h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f10753i;

    public RunnableC2283n(Context context, String str, boolean z, boolean z2) {
        this.f10750f = context;
        this.f10751g = str;
        this.f10752h = z;
        this.f10753i = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f10750f);
        builder.setMessage(this.f10751g);
        if (this.f10752h) {
            builder.setTitle("Error");
        } else {
            builder.setTitle("Info");
        }
        if (this.f10753i) {
            builder.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builder.setPositiveButton("Learn More", new DialogInterfaceOnClickListenerC2280m(this));
            builder.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builder.create().show();
    }
}
