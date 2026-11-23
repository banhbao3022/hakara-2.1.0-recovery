package p555j.p556a.p557a.p558a.p559a.p584n;

import com.google.android.material.tabs.TabLayout;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.n.f, reason: use source file name */
/* JADX INFO: compiled from: PlayingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingActivity6 implements TabLayoutMediator.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String[] f31679a;

    public PlayingActivity6(String[] strArr) {
        this.f31679a = strArr;
    }

    @Override // p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator.b
    /* JADX INFO: renamed from: a */
    public final void mo11026a(TabLayout.C5969g c5969g, int i) {
        Intrinsics2.m13089e(c5969g, "tab");
        c5969g.m12838b(this.f31679a[i]);
    }
}
