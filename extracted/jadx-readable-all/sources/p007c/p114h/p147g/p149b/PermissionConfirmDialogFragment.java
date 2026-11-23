package p007c.p114h.p147g.p149b;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import java.util.Objects;
import p636z0.p752p.p753c.DialogFragment;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.h.g.b.d, reason: use source file name */
/* JADX INFO: compiled from: PermissionConfirmDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class PermissionConfirmDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s0 */
    public boolean f4402s0 = false;

    /* JADX INFO: renamed from: t0 */
    public int f4403t0;

    /* JADX INFO: renamed from: d1 */
    public static PermissionConfirmDialogFragment m2216d1(String str, int i, boolean z) {
        PermissionConfirmDialogFragment permissionConfirmDialogFragment = new PermissionConfirmDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putInt("requestCode", i);
        bundle.putBoolean("forceClose", z);
        permissionConfirmDialogFragment.m16540M0(bundle);
        return permissionConfirmDialogFragment;
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        final Fragment fragment = this.f38405B;
        this.f4403t0 = this.f38438m.getInt("requestCode");
        this.f4402s0 = this.f38438m.getBoolean("forceClose");
        return new AlertDialog.Builder(m16562f()).setMessage(this.f38438m.getString("message")).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: c.h.g.b.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                PermissionConfirmDialogFragment permissionConfirmDialogFragment = this.f4396f;
                Fragment fragment2 = fragment;
                Objects.requireNonNull(permissionConfirmDialogFragment);
                dialogInterface.dismiss();
                int i2 = permissionConfirmDialogFragment.f4403t0;
                if (i2 == 1) {
                    fragment2.m16523D0(new String[]{"android.permission.CAMERA"}, 1);
                } else if (i2 == 2) {
                    fragment2.m16523D0(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 2);
                } else if (i2 == 3) {
                    fragment2.m16523D0(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                }
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: c.h.g.b.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                FragmentActivity fragmentActivityM16562f;
                PermissionConfirmDialogFragment permissionConfirmDialogFragment = this.f4398f;
                Fragment fragment2 = fragment;
                Objects.requireNonNull(permissionConfirmDialogFragment);
                dialogInterface.dismiss();
                if (!permissionConfirmDialogFragment.f4402s0 || (fragmentActivityM16562f = fragment2.m16562f()) == null) {
                    return;
                }
                fragmentActivityM16562f.finish();
            }
        }).create();
    }
}
