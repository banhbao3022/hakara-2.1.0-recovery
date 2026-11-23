package p007c.p114h.p147g.p149b;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p114h.p147g.p148a.DialogBuilder;
import p636z0.p752p.p753c.DialogFragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.h.g.b.e, reason: use source file name */
/* JADX INFO: compiled from: PermissionErrorDialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class PermissionErrorDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: s0 */
    public boolean f4404s0 = false;

    /* JADX INFO: renamed from: d1 */
    public static PermissionErrorDialogFragment m2218d1(String str, int i, boolean z) {
        PermissionErrorDialogFragment permissionErrorDialogFragment = new PermissionErrorDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("message", str);
        bundle.putInt("requestCode", i);
        bundle.putBoolean("forceClose", z);
        permissionErrorDialogFragment.m16540M0(bundle);
        return permissionErrorDialogFragment;
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Z0 */
    public Dialog mo2217Z0(Bundle bundle) {
        final FragmentActivity fragmentActivityM16562f = m16562f();
        this.f38438m.getInt("requestCode");
        this.f4404s0 = this.f38438m.getBoolean("forceClose");
        DialogBuilder dialogBuilder = new DialogBuilder(fragmentActivityM16562f, R.layout.dialog_two_button);
        dialogBuilder.m2215b(R.id.tv_dialog_title, this.f38438m.getString("message"));
        dialogBuilder.m2215b(R.id.btn_dialog_cancel, "取消");
        dialogBuilder.m2214a(R.id.btn_dialog_cancel).f4394b = true;
        dialogBuilder.m2215b(R.id.btn_dialog_ok, "确定");
        dialogBuilder.m2214a(R.id.btn_dialog_ok).f4395c = new View.OnClickListener() { // from class: c.h.g.b.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionErrorDialogFragment permissionErrorDialogFragment = this.f4400f;
                Activity activity = fragmentActivityM16562f;
                if (permissionErrorDialogFragment.f4404s0) {
                    activity.finish();
                }
            }
        };
        final Dialog dialog = new Dialog(dialogBuilder.f4389b, R.style.CommonDialogStyle);
        View viewInflate = LayoutInflater.from(dialogBuilder.f4389b).inflate(dialogBuilder.f4390c, (ViewGroup) null);
        for (Map.Entry<Integer, DialogBuilder.a> entry : dialogBuilder.f4388a.entrySet()) {
            View viewFindViewById = viewInflate.findViewById(entry.getKey().intValue());
            final DialogBuilder.a value = entry.getValue();
            viewFindViewById.setVisibility(0);
            Objects.requireNonNull(value);
            if ((viewFindViewById instanceof TextView) && !TextUtils.isEmpty(value.f4393a)) {
                ((TextView) viewFindViewById).setText(value.f4393a);
            }
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: c.h.g.a.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DialogBuilder.a aVar = value;
                    Dialog dialog2 = dialog;
                    if (aVar.f4394b) {
                        dialog2.dismiss();
                    }
                    View.OnClickListener onClickListener = aVar.f4395c;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                }
            });
        }
        dialog.setContentView(viewInflate);
        dialog.setCancelable(dialogBuilder.f4391d);
        dialog.setCanceledOnTouchOutside(dialogBuilder.f4392e);
        return dialog;
    }
}
