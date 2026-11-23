package p555j.p556a.p557a.p558a.p559a.p573i;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import java.util.Objects;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.i.g, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileFragment7 implements SwipeRefreshLayout.InterfaceC0190h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProfileFragment f31455a;

    public ProfileFragment7(ProfileFragment profileFragment) {
        this.f31455a = profileFragment;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0190h
    /* JADX INFO: renamed from: a */
    public final void mo881a() {
        User userM421d = this.f31455a.mo13882Z0().f31515m.m421d();
        if (userM421d != null) {
            ProfileViewModel6 profileViewModel6M14417d1 = this.f31455a.mo13882Z0();
            int id = userM421d.getId();
            boolean z = this.f31455a.f33794j0;
            Objects.requireNonNull(profileViewModel6M14417d1);
            C5729a.m12428A(C8310a.m16440e(profileViewModel6M14417d1), null, 0, new ProfileViewModel2(profileViewModel6M14417d1, id, z, null), 3, null);
            ProfilePagerAdapter profilePagerAdapter = this.f31455a.f33798n0;
            if (profilePagerAdapter != null) {
                profilePagerAdapter.m13917x();
            } else {
                Intrinsics2.m13096l("adapterPager");
                throw null;
            }
        }
    }
}
