package p636z0.p644b.p645c;

import android.view.View;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: z0.b.c.c, reason: use source file name */
/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public class AlertController3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f34414f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ View f34415g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AlertController f34416h;

    public AlertController3(AlertController alertController, View view, View view2) {
        this.f34416h = alertController;
        this.f34414f = view;
        this.f34415g = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.m135c(this.f34416h.f175A, this.f34414f, this.f34415g);
    }
}
