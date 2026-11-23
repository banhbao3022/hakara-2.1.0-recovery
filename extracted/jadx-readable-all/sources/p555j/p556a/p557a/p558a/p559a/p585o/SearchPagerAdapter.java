package p555j.p556a.p557a.p558a.p559a.p585o;

import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p585o.p586o.SearchSongFragment;
import p555j.p556a.p557a.p558a.p559a.p585o.p587p.SearchUserFragment;
import p555j.p556a.p557a.p558a.p596f.CustomFragmentStateAdapter;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.o.g, reason: use source file name */
/* JADX INFO: compiled from: SearchPagerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchPagerAdapter extends CustomFragmentStateAdapter {

    /* JADX INFO: renamed from: j.a.a.a.a.o.g$a */
    /* JADX INFO: compiled from: SearchPagerAdapter.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchPagerAdapter(FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics2.m13089e(fragmentActivity, "activity");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return 2;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: p */
    public Fragment mo915p(int i) {
        if (i == 0) {
            Objects.requireNonNull(SearchSongFragment.f31736f0);
            return new SearchSongFragment();
        }
        if (i != 1) {
            throw new IllegalArgumentException(outline.m1590l("Unknown page index: ", i));
        }
        Objects.requireNonNull(SearchUserFragment.f31756f0);
        return new SearchUserFragment();
    }
}
