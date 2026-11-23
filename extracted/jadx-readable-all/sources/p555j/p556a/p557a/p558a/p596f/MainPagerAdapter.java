package p555j.p556a.p557a.p558a.p596f;

import java.util.List;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.f.d, reason: use source file name */
/* JADX INFO: compiled from: MainPagerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MainPagerAdapter extends CustomFragmentStateAdapter {

    /* JADX INFO: renamed from: m */
    public final List<TabData> f32068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPagerAdapter(List<TabData> list, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics2.m13089e(list, "tabs");
        Intrinsics2.m13089e(fragmentActivity, "activity");
        this.f32068m = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return this.f32068m.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: p */
    public Fragment mo915p(int i) {
        TabData tabData = this.f32068m.get(i);
        return tabData.f32074c.mo3b(tabData.f32075d);
    }
}
