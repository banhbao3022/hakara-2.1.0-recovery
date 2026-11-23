package p636z0.p644b.p645c;

import android.view.View;
import android.widget.AbsListView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: renamed from: z0.b.c.d, reason: use source file name */
/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public class AlertController4 implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f34417a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f34418b;

    public AlertController4(AlertController alertController, View view, View view2) {
        this.f34417a = view;
        this.f34418b = view2;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m135c(absListView, this.f34417a, this.f34418b);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
