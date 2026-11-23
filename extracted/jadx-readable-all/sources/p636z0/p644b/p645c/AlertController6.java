package p636z0.p644b.p645c;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: z0.b.c.f, reason: use source file name */
/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public class AlertController6 implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AlertController f34422f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AlertController.C0050b f34423g;

    public AlertController6(AlertController.C0050b c0050b, AlertController alertController) {
        this.f34423g = c0050b;
        this.f34422f = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j2) {
        this.f34423g.f237o.onClick(this.f34422f.f195b, i);
        if (this.f34423g.f240r) {
            return;
        }
        this.f34422f.f195b.dismiss();
    }
}
