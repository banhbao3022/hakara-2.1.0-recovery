package p636z0.p644b.p653h;

import android.view.View;

/* JADX INFO: renamed from: z0.b.h.q0, reason: use source file name */
/* JADX INFO: compiled from: ScrollingTabContainerView.java */
/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ View f35156f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ScrollingTabContainerView2 f35157g;

    public ScrollingTabContainerView(ScrollingTabContainerView2 scrollingTabContainerView2, View view) {
        this.f35157g = scrollingTabContainerView2;
        this.f35156f = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f35157g.smoothScrollTo(this.f35156f.getLeft() - ((this.f35157g.getWidth() - this.f35156f.getWidth()) / 2), 0);
        this.f35157g.f35159f = null;
    }
}
