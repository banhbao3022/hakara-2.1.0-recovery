package p555j.p556a.p557a.p558a.p559a.p591s;

import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p555j.p556a.p557a.p616i.ItemDiamondSkuBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.s.b, reason: use source file name */
/* JADX INFO: compiled from: DiamondAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DiamondAdapter extends BaseListAdapter<SkuEntity, ItemDiamondSkuBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<SkuEntity, Unit> f31941f;

    /* JADX INFO: renamed from: j.a.a.a.a.s.b$a */
    /* JADX INFO: compiled from: DiamondAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<SkuEntity, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31942g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(SkuEntity skuEntity) {
            Intrinsics2.m13089e(skuEntity, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.b$b */
    /* JADX INFO: compiled from: DiamondAdapter.kt */
    public static final class b extends DiffUtil.e<SkuEntity> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(SkuEntity skuEntity, SkuEntity skuEntity2) {
            SkuEntity skuEntity3 = skuEntity;
            SkuEntity skuEntity4 = skuEntity2;
            Intrinsics2.m13089e(skuEntity3, "oldItem");
            Intrinsics2.m13089e(skuEntity4, "newItem");
            return Intrinsics2.m13085a(skuEntity3, skuEntity4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(SkuEntity skuEntity, SkuEntity skuEntity2) {
            SkuEntity skuEntity3 = skuEntity;
            SkuEntity skuEntity4 = skuEntity2;
            Intrinsics2.m13089e(skuEntity3, "oldItem");
            Intrinsics2.m13089e(skuEntity4, "newItem");
            return Intrinsics2.m13085a(skuEntity3.f32351f, skuEntity4.f32351f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiamondAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DiamondAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31942g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_diamond_sku;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemDiamondSkuBinding itemDiamondSkuBinding = (ItemDiamondSkuBinding) viewDataBinding;
        Intrinsics2.m13089e(itemDiamondSkuBinding, "binding");
        RelativeLayout relativeLayout = itemDiamondSkuBinding.f32759u;
        Intrinsics2.m13088d(relativeLayout, "rootView");
        SkuDao.a.m14067S(relativeLayout, new DiamondAdapter2(itemDiamondSkuBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DiamondAdapter(InterfaceC6164l<? super SkuEntity, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31941f = interfaceC6164l;
    }
}
