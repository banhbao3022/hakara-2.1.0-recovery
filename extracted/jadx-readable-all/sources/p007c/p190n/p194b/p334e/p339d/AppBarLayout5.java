package p007c.p190n.p194b.p334e.p339d;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p636z0.p725k.p739l.p740b0.AccessibilityViewCommand;

/* JADX INFO: renamed from: c.n.b.e.d.d, reason: use source file name */
/* JADX INFO: compiled from: AppBarLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout5 implements AccessibilityViewCommand {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AppBarLayout f24915a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f24916b;

    public AppBarLayout5(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z) {
        this.f24915a = appBarLayout;
        this.f24916b = z;
    }

    @Override // p636z0.p725k.p739l.p740b0.AccessibilityViewCommand
    /* JADX INFO: renamed from: a */
    public boolean mo935a(View view, AccessibilityViewCommand.a aVar) {
        this.f24915a.setExpanded(this.f24916b);
        return true;
    }
}
