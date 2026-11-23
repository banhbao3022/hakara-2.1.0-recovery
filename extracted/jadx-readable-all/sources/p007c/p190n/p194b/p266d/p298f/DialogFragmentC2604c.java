package p007c.p190n.p194b.p266d.p298f;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: c.n.b.d.f.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC2604c extends DialogFragment {

    /* JADX INFO: renamed from: f */
    public Dialog f11556f = null;

    /* JADX INFO: renamed from: g */
    public DialogInterface.OnCancelListener f11557g = null;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11557g;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f11556f == null) {
            setShowsDialog(false);
        }
        return this.f11556f;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
