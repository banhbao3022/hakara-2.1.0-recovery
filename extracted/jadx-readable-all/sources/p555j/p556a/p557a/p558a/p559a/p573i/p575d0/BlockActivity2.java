package p555j.p556a.p557a.p558a.p559a.p573i.p575d0;

import java.util.Arrays;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.block.BlockActivity;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.i.d0.a, reason: use source file name */
/* JADX INFO: compiled from: BlockActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BlockActivity2 extends Lambda implements InterfaceC6164l<User, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BlockActivity.C7323d f31428g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockActivity2(BlockActivity.C7323d c7323d) {
        super(1);
        this.f31428g = c7323d;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(User user) {
        User user2 = user;
        Intrinsics2.m13089e(user2, "it");
        BlockActivity blockActivity = BlockActivity.this;
        BlockActivity.C7322c c7322c = BlockActivity.f33812y;
        String string = blockActivity.getString(R.string.text_unblock_user);
        Intrinsics2.m13088d(string, "getString(R.string.text_unblock_user)");
        String str = String.format(string, Arrays.copyOf(new Object[]{user2.getFullName()}, 1));
        Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
        String string2 = blockActivity.getString(R.string.text_message_unblock);
        Intrinsics2.m13088d(string2, "getString(R.string.text_message_unblock)");
        String str2 = String.format(string2, Arrays.copyOf(new Object[]{user2.getFullName()}, 1));
        Intrinsics2.m13088d(str2, "java.lang.String.format(format, *args)");
        SkuDao.a.m14069U(blockActivity, str, str2, blockActivity.getString(R.string.text_unblock), new BlockActivity3(blockActivity, user2), blockActivity.getString(R.string.text_skip), null, false, true, 96);
        return Unit.f29502a;
    }
}
