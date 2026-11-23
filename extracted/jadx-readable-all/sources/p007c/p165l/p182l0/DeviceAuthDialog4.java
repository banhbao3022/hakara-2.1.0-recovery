package p007c.p165l.p182l0;

import android.content.DialogInterface;
import java.util.Date;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.l0.f, reason: use source file name */
/* JADX INFO: compiled from: DeviceAuthDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class DeviceAuthDialog4 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f5099f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Utility.d f5100g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f5101h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Date f5102i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Date f5103j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ DeviceAuthDialog f5104k;

    public DeviceAuthDialog4(DeviceAuthDialog deviceAuthDialog, String str, Utility.d dVar, String str2, Date date, Date date2) {
        this.f5104k = deviceAuthDialog;
        this.f5099f = str;
        this.f5100g = dVar;
        this.f5101h = str2;
        this.f5102i = date;
        this.f5103j = date2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        DeviceAuthDialog.m2562e1(this.f5104k, this.f5099f, this.f5100g, this.f5101h, this.f5102i, this.f5103j);
    }
}
