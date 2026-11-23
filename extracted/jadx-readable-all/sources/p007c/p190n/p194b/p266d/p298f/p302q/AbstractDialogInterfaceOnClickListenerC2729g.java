package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.util.Log;

/* JADX INFO: renamed from: c.n.b.d.f.q.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogInterfaceOnClickListenerC2729g implements DialogInterface.OnClickListener {
    /* JADX INFO: renamed from: a */
    public abstract void mo5593a();

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo5593a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
