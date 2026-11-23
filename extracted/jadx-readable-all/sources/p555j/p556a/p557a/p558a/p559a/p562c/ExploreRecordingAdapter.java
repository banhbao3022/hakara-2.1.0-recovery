package p555j.p556a.p557a.p558a.p559a.p562c;

import android.view.View;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemRecordingTrendingBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.c.f, reason: use source file name */
/* JADX INFO: compiled from: ExploreRecordingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreRecordingAdapter extends BaseListAdapter<Recording, ItemRecordingTrendingBinding> {

    /* JADX INFO: renamed from: f */
    public int f31112f;

    /* JADX INFO: renamed from: g */
    public int f31113g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6164l<Recording, Unit> f31114h;

    /* JADX INFO: renamed from: j.a.a.a.a.c.f$a */
    /* JADX INFO: compiled from: ExploreRecordingAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Recording, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31115g = new a();

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

    /* JADX INFO: renamed from: j.a.a.a.a.c.f$b */
    /* JADX INFO: compiled from: ExploreRecordingAdapter.kt */
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
    public ExploreRecordingAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ExploreRecordingAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31115g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_recording_trending;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemRecordingTrendingBinding itemRecordingTrendingBinding = (ItemRecordingTrendingBinding) viewDataBinding;
        Intrinsics2.m13089e(itemRecordingTrendingBinding, "binding");
        View view = itemRecordingTrendingBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new ExploreRecordingAdapter2(itemRecordingTrendingBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemRecordingTrendingBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        if (this.f31112f > 0) {
            View view = baseListAdapter3.f1003b;
            Intrinsics2.m13088d(view, "holder.itemView");
            view.getLayoutParams().width = this.f31112f;
        }
        if (this.f31113g > 0) {
            View view2 = baseListAdapter3.f1003b;
            Intrinsics2.m13088d(view2, "holder.itemView");
            view2.getLayoutParams().height = this.f31113g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExploreRecordingAdapter(InterfaceC6164l<? super Recording, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31114h = interfaceC6164l;
    }
}
