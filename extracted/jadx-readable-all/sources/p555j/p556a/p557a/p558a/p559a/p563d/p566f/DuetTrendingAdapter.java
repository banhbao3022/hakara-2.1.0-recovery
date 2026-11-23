package p555j.p556a.p557a.p558a.p559a.p563d.p566f;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p000.C0232b0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemDuetTrendingBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.d.f.a, reason: use source file name */
/* JADX INFO: compiled from: DuetTrendingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetTrendingAdapter extends BaseListAdapter<Recording, ItemDuetTrendingBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Recording, Unit> f31177f;

    /* JADX INFO: renamed from: j.a.a.a.a.d.f.a$a */
    /* JADX INFO: compiled from: DuetTrendingAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Recording, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31178g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Recording recording) {
            Intrinsics2.m13089e(recording, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.d.f.a$b */
    /* JADX INFO: compiled from: DuetTrendingAdapter.kt */
    public static final class b extends DiffUtil.e<Recording> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Recording recording, Recording recording2) {
            Recording recording3 = recording;
            Recording recording4 = recording2;
            Intrinsics2.m13089e(recording3, "oldItem");
            Intrinsics2.m13089e(recording4, "newItem");
            return Intrinsics2.m13085a(recording3, recording4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Recording recording, Recording recording2) {
            Recording recording3 = recording;
            Recording recording4 = recording2;
            Intrinsics2.m13089e(recording3, "oldItem");
            Intrinsics2.m13089e(recording4, "newItem");
            return recording3.getId() == recording4.getId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DuetTrendingAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DuetTrendingAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31178g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_duet_trending;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemDuetTrendingBinding itemDuetTrendingBinding = (ItemDuetTrendingBinding) viewDataBinding;
        Intrinsics2.m13089e(itemDuetTrendingBinding, "binding");
        View view = itemDuetTrendingBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new C0232b0(0, itemDuetTrendingBinding, this));
        LinearLayout linearLayout = itemDuetTrendingBinding.f32951v;
        Intrinsics2.m13088d(linearLayout, "rootView");
        SkuDao.a.m14067S(linearLayout, new C0232b0(1, itemDuetTrendingBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DuetTrendingAdapter(InterfaceC6164l<? super Recording, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31177f = interfaceC6164l;
    }
}
