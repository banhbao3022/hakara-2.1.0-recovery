package p555j.p556a.p557a.p558a.p559a.p560a;

import android.view.View;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple2;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p616i.ItemBackgroundBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: BackgroundFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundFragment extends BaseListAdapter<Simple2, ItemBackgroundBinding> {

    /* JADX INFO: renamed from: f */
    public int f30971f;

    /* JADX INFO: renamed from: g */
    public int f30972g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6164l<Simple2, Unit> f30973h;

    /* JADX INFO: renamed from: j.a.a.a.a.a.b$a */
    /* JADX INFO: compiled from: BackgroundFragment.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Simple2, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f30974g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple2 simple2) {
            Intrinsics2.m13089e(simple2, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.b$b */
    /* JADX INFO: compiled from: BackgroundFragment.kt */
    public static final class b extends DiffUtil.e<Simple2> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Simple2 simple2, Simple2 simple3) {
            Simple2 simple4 = simple2;
            Simple2 simple5 = simple3;
            Intrinsics2.m13089e(simple4, "oldItem");
            Intrinsics2.m13089e(simple5, "newItem");
            return Intrinsics2.m13085a(simple4, simple5);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Simple2 simple2, Simple2 simple3) {
            Simple2 simple4 = simple2;
            Simple2 simple5 = simple3;
            Intrinsics2.m13089e(simple4, "oldItem");
            Intrinsics2.m13089e(simple5, "newItem");
            return Intrinsics2.m13085a(simple4.getKey(), simple5.getKey());
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.b$c */
    /* JADX INFO: compiled from: BackgroundFragment.kt */
    public static final class c implements View.OnClickListener {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f30976g;

        public c(int i) {
            this.f30976g = i;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BackgroundFragment backgroundFragment = BackgroundFragment.this;
            Simple2 simple2 = (Simple2) backgroundFragment.f39339d.f39163g.get(this.f30976g);
            if (simple2 != null) {
                int i = this.f30976g;
                BackgroundFragment backgroundFragment2 = BackgroundFragment.this;
                int i2 = backgroundFragment2.f30971f;
                if (i != i2) {
                    backgroundFragment2.m664f(i2);
                    BackgroundFragment.this.f30971f = this.f30976g;
                    Intrinsics2.m13088d(view, "view");
                    view.setSelected(true);
                    BackgroundFragment.this.f30973h.mo3b(simple2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundFragment() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ BackgroundFragment(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f30974g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_background;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemBackgroundBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        View view = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view, "holder.itemView");
        view.getLayoutParams().width = this.f30972g;
        View view2 = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view2, "holder.itemView");
        view2.getLayoutParams().height = this.f30972g;
        View view3 = baseListAdapter3.f1003b;
        Intrinsics2.m13088d(view3, "holder.itemView");
        view3.setSelected(i == this.f30971f);
        baseListAdapter3.f1003b.setOnClickListener(new c(i));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BackgroundFragment(InterfaceC6164l<? super Simple2, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f30973h = interfaceC6164l;
    }
}
