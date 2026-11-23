package p555j.p556a.p557a.p558a.p559a.p561b;

import android.view.View;
import java.util.ArrayList;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p616i.ItemUserInviteBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.b.c, reason: use source file name */
/* JADX INFO: compiled from: UserInviteAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserInviteAdapter extends BaseListAdapter<User, ItemUserInviteBinding> {

    /* JADX INFO: renamed from: f */
    public ArrayList<User> f31059f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<ArrayList<User>, Unit> f31060g;

    /* JADX INFO: renamed from: j.a.a.a.a.b.c$a */
    /* JADX INFO: compiled from: UserInviteAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<ArrayList<User>, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31061g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(ArrayList<User> arrayList) {
            Intrinsics2.m13089e(arrayList, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.c$b */
    /* JADX INFO: compiled from: UserInviteAdapter.kt */
    public static final class b extends DiffUtil.e<User> {
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

    /* JADX INFO: renamed from: j.a.a.a.a.b.c$c */
    /* JADX INFO: compiled from: UserInviteAdapter.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ User f31063g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ BaseListAdapter3 f31064h;

        public c(User user, BaseListAdapter3 baseListAdapter3) {
            this.f31063g = user;
            this.f31064h = baseListAdapter3;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (UserInviteAdapter.this.f31059f.contains(this.f31063g)) {
                ((ItemUserInviteBinding) this.f31064h.f32043u).f32635u.setBackgroundResource(R.drawable.ic_privacy_option);
                UserInviteAdapter.this.f31059f.remove(this.f31063g);
            } else {
                ((ItemUserInviteBinding) this.f31064h.f32043u).f32635u.setBackgroundResource(R.drawable.ic_privacy_option_checked);
                UserInviteAdapter.this.f31059f.add(this.f31063g);
            }
            UserInviteAdapter userInviteAdapter = UserInviteAdapter.this;
            userInviteAdapter.f31060g.mo3b(userInviteAdapter.f31059f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserInviteAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UserInviteAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31061g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_user_invite;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemUserInviteBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        User user = (User) this.f39339d.f39163g.get(i);
        if (this.f31059f.contains(user)) {
            ((ItemUserInviteBinding) baseListAdapter3.f32043u).f32635u.setBackgroundResource(R.drawable.ic_privacy_option_checked);
        } else {
            ((ItemUserInviteBinding) baseListAdapter3.f32043u).f32635u.setBackgroundResource(R.drawable.ic_privacy_option);
        }
        ((ItemUserInviteBinding) baseListAdapter3.f32043u).f32636v.setOnClickListener(new c(user, baseListAdapter3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserInviteAdapter(InterfaceC6164l<? super ArrayList<User>, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "usersSelected");
        this.f31060g = interfaceC6164l;
        this.f31059f = new ArrayList<>();
    }
}
