package p555j.p556a.p557a.p558a.p559a.p561b;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p000.C7404v;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemUserSuggestionBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.b.a, reason: use source file name */
/* JADX INFO: compiled from: UserSuggestionAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserSuggestionAdapter extends BaseListAdapter<User, ItemUserSuggestionBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<User, Unit> f31049f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<User, Unit> f31050g;

    /* JADX INFO: renamed from: j.a.a.a.a.b.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a extends Lambda implements InterfaceC6164l<User, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31051g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31052h = new a(1);

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f31053i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31053i = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(User user) {
            int i = this.f31053i;
            if (i == 0) {
                Intrinsics2.m13089e(user, "it");
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            Intrinsics2.m13089e(user, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.b.a$b */
    /* JADX INFO: compiled from: UserSuggestionAdapter.kt */
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
    public UserSuggestionAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UserSuggestionAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31051g : interfaceC6164l, (i & 2) != 0 ? a.f31052h : interfaceC6164l2);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_user_suggestion;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemUserSuggestionBinding itemUserSuggestionBinding = (ItemUserSuggestionBinding) viewDataBinding;
        Intrinsics2.m13089e(itemUserSuggestionBinding, "binding");
        View view = itemUserSuggestionBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new C7404v(0, itemUserSuggestionBinding, this));
        TextView textView = itemUserSuggestionBinding.f32726u;
        Intrinsics2.m13088d(textView, "btnFollow");
        SkuDao.a.m14067S(textView, new C7404v(1, itemUserSuggestionBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UserSuggestionAdapter(InterfaceC6164l<? super User, Unit> interfaceC6164l, InterfaceC6164l<? super User, Unit> interfaceC6164l2) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "followClickListener");
        this.f31049f = interfaceC6164l;
        this.f31050g = interfaceC6164l2;
    }
}
