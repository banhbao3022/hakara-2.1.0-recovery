package p555j.p556a.p557a.p558a.p559a.p573i;

import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.i.c, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileFragment3 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProfileFragment4 f31421g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileFragment3(ProfileFragment4 profileFragment4) {
        super(0);
        this.f31421g = profileFragment4;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        User userM421d = ProfileFragment.this.mo13882Z0().f31515m.m421d();
        if (userM421d != null) {
            ProfileViewModel6 profileViewModel6Mo13882Z0 = ProfileFragment.this.mo13882Z0();
            int id = userM421d.getId();
            Objects.requireNonNull(profileViewModel6Mo13882Z0);
            C5729a.m12428A(C8310a.m16440e(profileViewModel6Mo13882Z0), null, 0, new ProfileViewModel5(profileViewModel6Mo13882Z0, id, 1, null), 3, null);
            FragmentActivity fragmentActivityM16562f = ProfileFragment.this.m16562f();
            if (fragmentActivityM16562f != null) {
                SkuDao.a.m14092i0(fragmentActivityM16562f, R.string.message_block_success, 0, 2);
            }
        }
        return Unit.f29502a;
    }
}
