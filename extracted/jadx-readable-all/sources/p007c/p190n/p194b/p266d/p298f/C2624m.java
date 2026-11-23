package p007c.p190n.p194b.p266d.p298f;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import p636z0.p752p.p753c.DialogFragment;
import p636z0.p752p.p753c.FragmentManager;

/* JADX INFO: renamed from: c.n.b.d.f.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2624m extends DialogFragment {

    /* JADX INFO: renamed from: s0 */
    public Dialog f11599s0 = null;

    /* JADX INFO: renamed from: t0 */
    public DialogInterface.OnCancelListener f11600t0 = null;

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        Dialog dialog = this.f11599s0;
        if (dialog == null) {
            this.f38387j0 = false;
        }
        return dialog;
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: c1 */
    public void mo5469c1(FragmentManager fragmentManager, String str) {
        super.mo5469c1(fragmentManager, str);
    }

    @Override // p636z0.p752p.p753c.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f11600t0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
