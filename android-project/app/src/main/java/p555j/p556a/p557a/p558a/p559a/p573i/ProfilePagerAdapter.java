package p555j.p556a.p557a.p558a.p559a.p573i;

import android.os.Bundle;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p559a.p573i.p574a.DraftFragment;
import p555j.p556a.p557a.p558a.p559a.p582l.ImageFragment;
import p555j.p556a.p557a.p558a.p593c.RefreshableFragment;
import p555j.p556a.p557a.p558a.p596f.CustomFragmentStateAdapter;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: renamed from: j.a.a.a.a.i.j, reason: use source file name */
/* JADX INFO: compiled from: ProfilePagerAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfilePagerAdapter extends CustomFragmentStateAdapter {

    /* JADX INFO: renamed from: m */
    public final int f31458m;

    /* JADX INFO: renamed from: n */
    public final int f31459n;

    public /* synthetic */ ProfilePagerAdapter(FragmentActivity fragmentActivity, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragmentActivity, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 3 : i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: d */
    public int mo662d() {
        return this.f31459n;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: p */
    public Fragment mo915p(int i) {
        if (i == 0) {
            C6693k.b bVar = C6693k.f31460f0;
            int i2 = this.f31458m;
            Objects.requireNonNull(bVar);
            C6693k c6693k = new C6693k();
            Bundle bundle = new Bundle();
            bundle.putInt("kind", 3);
            bundle.putInt("user_id", i2);
            c6693k.m16540M0(bundle);
            return c6693k;
        }
        if (i == 1) {
            C6693k.b bVar2 = C6693k.f31460f0;
            int i3 = this.f31458m;
            Objects.requireNonNull(bVar2);
            C6693k c6693k2 = new C6693k();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("kind", 6);
            bundle2.putInt("user_id", i3);
            c6693k2.m16540M0(bundle2);
            return c6693k2;
        }
        if (i == 2) {
            int i4 = this.f31458m;
            if (i4 <= 0) {
                return new DraftFragment();
            }
            Objects.requireNonNull(ImageFragment.f31617f0);
            ImageFragment imageFragment = new ImageFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("user_id", i4);
            imageFragment.m16540M0(bundle3);
            return imageFragment;
        }
        if (i != 3) {
            throw new AssertionError(outline.m1592n("Page ", i, " is out of CommentPagerAdapter bounds"));
        }
        ImageFragment.b bVar3 = ImageFragment.f31617f0;
        int i5 = this.f31458m;
        Objects.requireNonNull(bVar3);
        ImageFragment imageFragment2 = new ImageFragment();
        Bundle bundle4 = new Bundle();
        bundle4.putInt("user_id", i5);
        imageFragment2.m16540M0(bundle4);
        return imageFragment2;
    }

    /* JADX INFO: renamed from: x */
    public final void m13917x() {
        int i = this.f31459n;
        for (int i2 = 0; i2 < i; i2++) {
            LifecycleOwner lifecycleOwnerM13990w = m13990w(i2);
            if (lifecycleOwnerM13990w != null && (lifecycleOwnerM13990w instanceof RefreshableFragment)) {
                ((RefreshableFragment) lifecycleOwnerM13990w).mo13910c();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePagerAdapter(FragmentActivity fragmentActivity, int i, int i2) {
        super(fragmentActivity);
        Intrinsics2.m13089e(fragmentActivity, "activity");
        this.f31458m = i;
        this.f31459n = i2;
    }
}
