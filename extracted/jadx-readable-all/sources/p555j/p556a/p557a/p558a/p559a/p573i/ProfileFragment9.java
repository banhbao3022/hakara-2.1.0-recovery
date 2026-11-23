package p555j.p556a.p557a.p558a.p559a.p573i;

import com.google.android.material.tabs.TabLayout;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.i.i, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileFragment9 implements TabLayoutMediator.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProfileFragment f31457a;

    public ProfileFragment9(ProfileFragment profileFragment) {
        this.f31457a = profileFragment;
    }

    @Override // p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator.b
    /* JADX INFO: renamed from: a */
    public final void mo11026a(TabLayout.C5969g c5969g, int i) {
        String strM16546Q;
        Intrinsics2.m13089e(c5969g, "tab");
        ProfileFragment profileFragment = this.f31457a;
        ProfileFragment.C7315c c7315c = ProfileFragment.f33788d0;
        Objects.requireNonNull(profileFragment);
        if (i == 0) {
            strM16546Q = profileFragment.m16546Q(R.string.title_recording);
            Intrinsics2.m13088d(strM16546Q, "getString(R.string.title_recording)");
        } else if (i == 1) {
            strM16546Q = profileFragment.m16546Q(R.string.title_waiting_duet);
            Intrinsics2.m13088d(strM16546Q, "getString(R.string.title_waiting_duet)");
        } else if (i == 2) {
            strM16546Q = profileFragment.f33795k0 > 0 ? profileFragment.m16546Q(R.string.txt_image) : profileFragment.m16546Q(R.string.txt_draft_tab);
            Intrinsics2.m13088d(strM16546Q, "if (userViewId > 0) {\n  …ft_tab)\n                }");
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(outline.m1590l("Unknown page index: ", i));
            }
            strM16546Q = profileFragment.m16546Q(R.string.txt_image);
            Intrinsics2.m13088d(strM16546Q, "getString(R.string.txt_image)");
        }
        c5969g.m12838b(strM16546Q);
    }
}
