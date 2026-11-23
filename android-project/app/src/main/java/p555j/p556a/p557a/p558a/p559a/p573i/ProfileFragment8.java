package p555j.p556a.p557a.p558a.p559a.p573i;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.i.h, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileFragment8<T> implements Observer<Boolean> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProfileFragment f31456a;

    public ProfileFragment8(ProfileFragment profileFragment) {
        this.f31456a = profileFragment;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Boolean bool) {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.f31456a.m14416c1(R.id.swipeToRefreshLayout);
        Intrinsics2.m13088d(swipeRefreshLayout, "swipeToRefreshLayout");
        swipeRefreshLayout.setRefreshing(Intrinsics2.m13085a(bool, Boolean.TRUE));
    }
}
