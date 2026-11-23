package p555j.p556a.p557a.p558a.p559a.p584n;

import android.os.Bundle;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p571g.CommentFragment;
import p555j.p556a.p557a.p558a.p596f.CustomFragmentStateAdapter;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.n.i, reason: use source file name */
/* JADX INFO: compiled from: PlayingPagerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingPagerAdapter extends CustomFragmentStateAdapter {

    /* JADX INFO: renamed from: m */
    public final int f31685m;

    /* JADX INFO: renamed from: n */
    public final String f31686n;

    /* JADX INFO: renamed from: j.a.a.a.a.n.i$a */
    /* JADX INFO: compiled from: PlayingPagerAdapter.kt */
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
    public PlayingPagerAdapter(FragmentActivity fragmentActivity, int i, String str) {
        super(fragmentActivity);
        Intrinsics2.m13089e(fragmentActivity, "activity");
        Intrinsics2.m13089e(str, "contentType");
        this.f31685m = i;
        this.f31686n = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return 1;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: p */
    public Fragment mo915p(int i) {
        if (i != 0) {
            throw new AssertionError(outline.m1592n("Page ", i, " is out of CommentPagerAdapter bounds"));
        }
        CommentFragment.b bVar = CommentFragment.f31323f0;
        int i2 = this.f31685m;
        String str = this.f31686n;
        Objects.requireNonNull(bVar);
        Intrinsics2.m13089e(str, "contentType");
        CommentFragment commentFragment = new CommentFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("contentId", i2);
        bundle.putString("contentType", str);
        commentFragment.m16540M0(bundle);
        return commentFragment;
    }
}
