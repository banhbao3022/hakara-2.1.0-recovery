package p555j.p556a.p557a.p558a.p559a.p573i;

import java.util.Arrays;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.i.d, reason: use source file name */
/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileFragment4 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ProfileFragment.C7317e f31426g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BottomSheetDialog f31427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileFragment4(ProfileFragment.C7317e c7317e, BottomSheetDialog bottomSheetDialog) {
        super(0);
        this.f31426g = c7317e;
        this.f31427h = bottomSheetDialog;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        FragmentActivity fragmentActivityM16562f = ProfileFragment.this.m16562f();
        if (fragmentActivityM16562f != null) {
            String strM16546Q = ProfileFragment.this.m16546Q(R.string.text_block_user);
            Intrinsics2.m13088d(strM16546Q, "getString(R.string.text_block_user)");
            Object[] objArr = new Object[1];
            User userM421d = ProfileFragment.this.mo13882Z0().f31515m.m421d();
            objArr[0] = userM421d != null ? userM421d.getFullName() : null;
            String str = String.format(strM16546Q, Arrays.copyOf(objArr, 1));
            Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
            String strM16546Q2 = ProfileFragment.this.m16546Q(R.string.text_message_block);
            Intrinsics2.m13088d(strM16546Q2, "getString(R.string.text_message_block)");
            Object[] objArr2 = new Object[2];
            User userM421d2 = ProfileFragment.this.mo13882Z0().f31515m.m421d();
            objArr2[0] = userM421d2 != null ? userM421d2.getFullName() : null;
            User userM421d3 = ProfileFragment.this.mo13882Z0().f31515m.m421d();
            objArr2[1] = userM421d3 != null ? userM421d3.getFullName() : null;
            String str2 = String.format(strM16546Q2, Arrays.copyOf(objArr2, 2));
            Intrinsics2.m13088d(str2, "java.lang.String.format(format, *args)");
            SkuDao.a.m14069U(fragmentActivityM16562f, str, str2, ProfileFragment.this.m16546Q(R.string.text_menu_block), new ProfileFragment3(this), ProfileFragment.this.m16546Q(R.string.text_skip), null, false, true, 96);
        }
        this.f31427h.dismiss();
        return Unit.f29502a;
    }
}
