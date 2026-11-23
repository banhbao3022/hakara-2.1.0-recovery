package p555j.p556a.p557a.p558a.p559a.p578j.p579i;

import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
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
import p555j.p556a.p557a.p616i.ItemFanGiftBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.j.i.b, reason: use source file name */
/* JADX INFO: compiled from: FanGiftAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FanGiftAdapter extends BaseListAdapter<Present, ItemFanGiftBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Present, Unit> f31578f;

    /* JADX INFO: renamed from: j.a.a.a.a.j.i.b$a */
    /* JADX INFO: compiled from: FanGiftAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Present, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31579g = new a();

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

    /* JADX INFO: renamed from: j.a.a.a.a.j.i.b$b */
    /* JADX INFO: compiled from: FanGiftAdapter.kt */
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
    public FanGiftAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FanGiftAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31579g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_fan_gift;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: h */
    public void mo666h(RecyclerView.AbstractC0149b0 abstractC0149b0, int i) {
        BaseListAdapter3 baseListAdapter3 = (BaseListAdapter3) abstractC0149b0;
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        ((ItemFanGiftBinding) baseListAdapter3.f32043u).mo14240s(i + 1);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemFanGiftBinding itemFanGiftBinding = (ItemFanGiftBinding) viewDataBinding;
        Intrinsics2.m13089e(itemFanGiftBinding, "binding");
        RelativeLayout relativeLayout = itemFanGiftBinding.f32446w;
        Intrinsics2.m13088d(relativeLayout, "rootView");
        SkuDao.a.m14067S(relativeLayout, new FanGiftAdapter2(itemFanGiftBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemFanGiftBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        ((ItemFanGiftBinding) baseListAdapter3.f32043u).mo14240s(i + 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FanGiftAdapter(InterfaceC6164l<? super Present, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31578f = interfaceC6164l;
    }
}
