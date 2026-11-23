package p555j.p556a.p557a.p558a.p559a.p561b;

import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p616i.ItemUserInvitedBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.b.f, reason: use source file name */
/* JADX INFO: compiled from: UserInvitedAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserInvitedAdapter extends BaseListAdapter<User, ItemUserInvitedBinding> {

    /* JADX INFO: renamed from: j.a.a.a.a.b.f$a */
    /* JADX INFO: compiled from: UserInvitedAdapter.kt */
    public static final class a extends DiffUtil.e<User> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(User user, User user2) {
            User user3 = user;
            User user4 = user2;
            Intrinsics2.m13089e(user3, "oldItem");
            Intrinsics2.m13089e(user4, "newItem");
            return Intrinsics2.m13085a(user3, user4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(User user, User user2) {
            User user3 = user;
            User user4 = user2;
            Intrinsics2.m13089e(user3, "oldItem");
            Intrinsics2.m13089e(user4, "newItem");
            return user3.getId() == user4.getId();
        }
    }

    public UserInvitedAdapter() {
        super(new a());
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_user_invited;
    }
}
