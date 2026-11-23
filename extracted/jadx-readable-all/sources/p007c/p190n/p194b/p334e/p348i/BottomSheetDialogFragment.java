package p007c.p190n.p194b.p334e.p348i;

import android.app.Dialog;
import android.os.Bundle;
import p636z0.p644b.p645c.AppCompatDialogFragment;

/* JADX INFO: renamed from: c.n.b.e.i.e, reason: use source file name */
/* JADX INFO: compiled from: BottomSheetDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: W0 */
    public void mo11126W0() {
        Dialog dialog = this.f38391n0;
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            if (bottomSheetDialog.f25059f == null) {
                bottomSheetDialog.m11122a();
            }
            boolean z = bottomSheetDialog.f25059f.f28858v;
        }
        m16508X0(false, false);
    }

    @Override // p636z0.p644b.p645c.AppCompatDialogFragment, p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        return new BottomSheetDialog(m16571x(), mo13868Y0());
    }
}
