package p555j.p556a.p557a.p558a.p559a.p573i.p575d0;

import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemUserBlockBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.i.d0.c, reason: use source file name */
/* JADX INFO: compiled from: BlockAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BlockAdapter extends BaseListAdapter<User, ItemUserBlockBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<User, Unit> f31431f;

    /* JADX INFO: renamed from: j.a.a.a.a.i.d0.c$a */
    /* JADX INFO: compiled from: BlockAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<User, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31432g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(User user) {
            Intrinsics2.m13089e(user, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.d0.c$b */
    /* JADX INFO: compiled from: BlockAdapter.kt */
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

    /* JADX WARN: Multi-variable type inference failed */
    public BlockAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BlockAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31432g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_user_block;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemUserBlockBinding itemUserBlockBinding = (ItemUserBlockBinding) viewDataBinding;
        Intrinsics2.m13089e(itemUserBlockBinding, "binding");
        TextView textView = itemUserBlockBinding.f32593t;
        Intrinsics2.m13088d(textView, "btnUnblock");
        SkuDao.a.m14067S(textView, new BlockAdapter2(itemUserBlockBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BlockAdapter(InterfaceC6164l<? super User, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "unblockClickListener");
        this.f31431f = interfaceC6164l;
    }
}
