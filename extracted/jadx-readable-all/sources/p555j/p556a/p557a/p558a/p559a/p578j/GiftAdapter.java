package p555j.p556a.p557a.p558a.p559a.p578j;

import android.view.View;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Gift;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p616i.ItemGiftBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.j.b, reason: use source file name */
/* JADX INFO: compiled from: GiftAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GiftAdapter extends BaseListAdapter<Gift, ItemGiftBinding> {

    /* JADX INFO: renamed from: f */
    public int f31556f;

    /* JADX INFO: renamed from: g */
    public int f31557g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6164l<Gift, Unit> f31558h;

    /* JADX INFO: renamed from: j.a.a.a.a.j.b$a */
    /* JADX INFO: compiled from: GiftAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Gift, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31559g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Gift gift) {
            Intrinsics2.m13089e(gift, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.b$b */
    /* JADX INFO: compiled from: GiftAdapter.kt */
    public static final class b extends DiffUtil.e<Gift> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Gift gift, Gift gift2) {
            Gift gift3 = gift;
            Gift gift4 = gift2;
            Intrinsics2.m13089e(gift3, "oldItem");
            Intrinsics2.m13089e(gift4, "newItem");
            return Intrinsics2.m13085a(gift3, gift4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Gift gift, Gift gift2) {
            Gift gift3 = gift;
            Gift gift4 = gift2;
            Intrinsics2.m13089e(gift3, "oldItem");
            Intrinsics2.m13089e(gift4, "newItem");
            return gift3.getId() == gift4.getId();
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.b$c */
    /* JADX INFO: compiled from: GiftAdapter.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f31561g;

        public c(int i) {
            this.f31561g = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            GiftAdapter giftAdapter = GiftAdapter.this;
            Gift gift = (Gift) giftAdapter.f39339d.f39163g.get(this.f31561g);
            if (gift != null) {
                int i = this.f31561g;
                GiftAdapter giftAdapter2 = GiftAdapter.this;
                int i2 = giftAdapter2.f31557g;
                if (i != i2) {
                    giftAdapter2.m664f(i2);
                    GiftAdapter.this.f31557g = this.f31561g;
                    Intrinsics2.m13088d(view, "view");
                    view.setSelected(true);
                    GiftAdapter.this.f31558h.mo3b(gift);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GiftAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ GiftAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31559g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_gift;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemGiftBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        View view = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view, "holder.itemView");
        view.getLayoutParams().width = this.f31556f;
        if (i == this.f31557g) {
            View view2 = baseListAdapter3.f1003b;
            Intrinsics2.m13088d(view2, "holder.itemView");
            view2.setSelected(true);
            InterfaceC6164l<Gift, Unit> interfaceC6164l = this.f31558h;
            Object obj = this.f39339d.f39163g.get(i);
            Intrinsics2.m13088d(obj, "getItem(position)");
            interfaceC6164l.mo3b((Gift) obj);
        } else {
            View view3 = baseListAdapter3.f1003b;
            Intrinsics2.m13088d(view3, "holder.itemView");
            view3.setSelected(false);
        }
        baseListAdapter3.f1003b.setOnClickListener(new c(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GiftAdapter(InterfaceC6164l<? super Gift, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31558h = interfaceC6164l;
    }
}
