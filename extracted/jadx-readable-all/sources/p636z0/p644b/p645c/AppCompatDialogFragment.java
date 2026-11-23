package p636z0.p644b.p645c;

import android.app.Dialog;
import android.os.Bundle;
import p636z0.p752p.p753c.DialogFragment;

/* JADX INFO: renamed from: z0.b.c.q, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        return new AppCompatDialog(m16571x(), mo13868Y0());
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: b1 */
    public void mo14679b1(Dialog dialog, int i) {
        if (!(dialog instanceof AppCompatDialog)) {
            super.mo14679b1(dialog, i);
            return;
        }
        AppCompatDialog appCompatDialog = (AppCompatDialog) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        appCompatDialog.supportRequestWindowFeature(1);
    }
}
