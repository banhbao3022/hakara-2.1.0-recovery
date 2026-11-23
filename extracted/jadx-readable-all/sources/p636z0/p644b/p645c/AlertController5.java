package p636z0.p644b.p645c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: z0.b.c.e, reason: use source file name */
/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public class AlertController5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f34419f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f34420g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AlertController f34421h;

    public AlertController5(AlertController alertController, View view, View view2) {
        this.f34421h = alertController;
        this.f34419f = view;
        this.f34420g = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m135c(this.f34421h.f200g, this.f34419f, this.f34420g);
    }
}
