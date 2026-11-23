package p007c.p190n.p194b.p334e.p339d;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p636z0.p725k.p739l.p740b0.AccessibilityViewCommand;

/* JADX INFO: renamed from: c.n.b.e.d.c, reason: use source file name */
/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout4 implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CoordinatorLayout f24910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppBarLayout f24911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ View f24912c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f24913d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AppBarLayout.BaseBehavior f24914e;

    public AppBarLayout4(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f24914e = baseBehavior;
        this.f24910a = coordinatorLayout;
        this.f24911b = appBarLayout;
        this.f24912c = view;
        this.f24913d = i;
    }

    @Override // p636z0.p725k.p739l.p740b0.AccessibilityViewCommand
    /* JADX INFO: renamed from: a */
    public boolean mo935a(View view, AccessibilityViewCommand.a aVar) {
        this.f24914e.m12689P(this.f24910a, this.f24911b, this.f24912c, this.f24913d, new int[]{0, 0});
        return true;
    }
}
