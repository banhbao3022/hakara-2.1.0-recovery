package p555j.p556a.p557a.p558a.p559a.p589q;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemShareBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.q.a, reason: use source file name */
/* JADX INFO: compiled from: ShareAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShareAdapter extends BaseListAdapter<Simple, ItemShareBinding> {

    /* JADX INFO: renamed from: f */
    public int f31778f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Simple, Unit> f31779g;

    /* JADX INFO: renamed from: j.a.a.a.a.q.a$a */
    /* JADX INFO: compiled from: ShareAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Simple, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31780g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple simple) {
            Intrinsics2.m13089e(simple, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.q.a$b */
    /* JADX INFO: compiled from: ShareAdapter.kt */
    public static final class b extends DiffUtil.e<Simple> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Simple simple, Simple simple2) {
            Simple simple3 = simple;
            Simple simple4 = simple2;
            Intrinsics2.m13089e(simple3, "oldItem");
            Intrinsics2.m13089e(simple4, "newItem");
            return Intrinsics2.m13085a(simple3, simple4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Simple simple, Simple simple2) {
            Simple simple3 = simple;
            Simple simple4 = simple2;
            Intrinsics2.m13089e(simple3, "oldItem");
            Intrinsics2.m13089e(simple4, "newItem");
            return simple3.getId() == simple4.getId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShareAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ShareAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31780g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_share;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemShareBinding itemShareBinding = (ItemShareBinding) viewDataBinding;
        Intrinsics2.m13089e(itemShareBinding, "binding");
        View view = itemShareBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new ShareAdapter2(itemShareBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemShareBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        View view = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view, "holder.itemView");
        view.getLayoutParams().width = this.f31778f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShareAdapter(InterfaceC6164l<? super Simple, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31779g = interfaceC6164l;
    }
}
