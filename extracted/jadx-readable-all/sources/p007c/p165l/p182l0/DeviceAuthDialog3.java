package p007c.p165l.p182l0;

import android.content.DialogInterface;

/* JADX INFO: renamed from: c.l.l0.e, reason: use source file name */
/* JADX INFO: compiled from: DeviceAuthDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceAuthDialog3 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DeviceAuthDialog f5098f;

    public DeviceAuthDialog3(DeviceAuthDialog deviceAuthDialog) {
        this.f5098f = deviceAuthDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f5098f.f5078B0.setContentView(this.f5098f.m2563f1(false));
        DeviceAuthDialog deviceAuthDialog = this.f5098f;
        deviceAuthDialog.m2569l1(deviceAuthDialog.f5081E0);
    }
}
