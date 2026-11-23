package p007c.p190n.p194b.p334e.p346g;

import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* JADX INFO: renamed from: c.n.b.e.g.d, reason: use source file name */
/* JADX INFO: compiled from: BottomAppBar.java */
/* JADX INFO: loaded from: classes.dex */
public class BottomAppBar5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ActionMenuView f24992f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24993g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f24994h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ BottomAppBar f24995i;

    public BottomAppBar5(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.f24995i = bottomAppBar;
        this.f24992f = actionMenuView;
        this.f24993g = i;
        this.f24994h = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        ActionMenuView actionMenuView = this.f24992f;
        actionMenuView.setTranslationX(this.f24995i.m12722E(actionMenuView, this.f24993g, this.f24994h));
    }
}
