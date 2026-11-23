package p555j.p556a.p557a.p558a.p559a.p567e.p568b;

import android.os.Bundle;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p563d.p564a.DuetInviteFragment;
import p555j.p556a.p557a.p558a.p596f.CustomFragmentStateAdapter;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.e.b.c, reason: use source file name */
/* JADX INFO: compiled from: RecordingRankingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingRankingAdapter2 extends CustomFragmentStateAdapter {

    /* JADX INFO: renamed from: m */
    public final int f31216m;

    /* JADX INFO: renamed from: j.a.a.a.a.e.b.c$a */
    /* JADX INFO: compiled from: RecordingRankingAdapter.kt */
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
    public RecordingRankingAdapter2(FragmentActivity fragmentActivity, int i) {
        super(fragmentActivity);
        Intrinsics2.m13089e(fragmentActivity, "activity");
        this.f31216m = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return 3;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: p */
    public Fragment mo915p(int i) {
        if (i == 0) {
            RecordingRankingFragment.b bVar = RecordingRankingFragment.f31207f0;
            int i2 = this.f31216m;
            Objects.requireNonNull(bVar);
            RecordingRankingFragment recordingRankingFragment = new RecordingRankingFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("song_id", i2);
            bundle.putInt("kind", 1);
            recordingRankingFragment.m16540M0(bundle);
            return recordingRankingFragment;
        }
        if (i != 1) {
            if (i == 2) {
                return DuetInviteFragment.b.m13899a(DuetInviteFragment.f31150f0, this.f31216m, 0, 0, false, 14);
            }
            throw new IllegalArgumentException(outline.m1590l("Unknown page index: ", i));
        }
        RecordingRankingFragment.b bVar2 = RecordingRankingFragment.f31207f0;
        int i3 = this.f31216m;
        Objects.requireNonNull(bVar2);
        RecordingRankingFragment recordingRankingFragment2 = new RecordingRankingFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putInt("song_id", i3);
        bundle2.putInt("kind", 2);
        recordingRankingFragment2.m16540M0(bundle2);
        return recordingRankingFragment2;
    }
}
