package p555j.p556a.p557a.p558a.p559a.p578j.p580j;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Present;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemGiftPresentBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.j.j.a, reason: use source file name */
/* JADX INFO: compiled from: PresentAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PresentAdapter extends BaseListAdapter<Present, ItemGiftPresentBinding> {

    /* JADX INFO: renamed from: f */
    public int f31590f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Present, Unit> f31591g;

    /* JADX INFO: renamed from: j.a.a.a.a.j.j.a$a */
    /* JADX INFO: compiled from: PresentAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Present, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31592g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Present present) {
            Intrinsics2.m13089e(present, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.j.a$b */
    /* JADX INFO: compiled from: PresentAdapter.kt */
    public static final class b extends DiffUtil.e<Present> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Present present, Present present2) {
            Present present3 = present;
            Present present4 = present2;
            Intrinsics2.m13089e(present3, "oldItem");
            Intrinsics2.m13089e(present4, "newItem");
            return Intrinsics2.m13085a(present3, present4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Present present, Present present2) {
            Present present3 = present;
            Present present4 = present2;
            Intrinsics2.m13089e(present3, "oldItem");
            Intrinsics2.m13089e(present4, "newItem");
            return present3.getId() == present4.getId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PresentAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PresentAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31592g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_gift_present;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemGiftPresentBinding itemGiftPresentBinding = (ItemGiftPresentBinding) viewDataBinding;
        Intrinsics2.m13089e(itemGiftPresentBinding, "binding");
        View view = itemGiftPresentBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new PresentAdapter2(itemGiftPresentBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemGiftPresentBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        View view = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view, "holder.itemView");
        view.getLayoutParams().width = this.f31590f;
        View view2 = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view2, "holder.itemView");
        view2.getLayoutParams().height = this.f31590f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PresentAdapter(InterfaceC6164l<? super Present, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31591g = interfaceC6164l;
    }
}
