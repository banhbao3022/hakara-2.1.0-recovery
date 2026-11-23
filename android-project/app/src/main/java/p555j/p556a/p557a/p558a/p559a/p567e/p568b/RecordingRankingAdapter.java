package p555j.p556a.p557a.p558a.p559a.p567e.p568b;

import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p000.C6326f0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemRecordingRankingBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.e.b.a, reason: use source file name */
/* JADX INFO: compiled from: RecordingRankingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingRankingAdapter extends BaseListAdapter<Recording, ItemRecordingRankingBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<Recording, Unit> f31202f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Recording, Unit> f31203g;

    /* JADX INFO: renamed from: j.a.a.a.a.e.b.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements InterfaceC6164l<Recording, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31204g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31205h = new a(1);

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f31206i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31206i = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(Recording recording) {
            int i = this.f31206i;
            if (i == 0) {
                Intrinsics2.m13089e(recording, "it");
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            Intrinsics2.m13089e(recording, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.b.a$b */
    /* JADX INFO: compiled from: RecordingRankingAdapter.kt */
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
    public RecordingRankingAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ RecordingRankingAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31204g : interfaceC6164l, (i & 2) != 0 ? a.f31205h : interfaceC6164l2);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_recording_ranking;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: h */
    public void mo666h(RecyclerView.AbstractC0149b0 abstractC0149b0, int i) {
        BaseListAdapter3 baseListAdapter3 = (BaseListAdapter3) abstractC0149b0;
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        ((ItemRecordingRankingBinding) baseListAdapter3.f32043u).mo14246s(i + 1);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemRecordingRankingBinding itemRecordingRankingBinding = (ItemRecordingRankingBinding) viewDataBinding;
        Intrinsics2.m13089e(itemRecordingRankingBinding, "binding");
        RelativeLayout relativeLayout = itemRecordingRankingBinding.f32881v;
        Intrinsics2.m13088d(relativeLayout, "rootView");
        SkuDao.a.m14067S(relativeLayout, new C6326f0(0, itemRecordingRankingBinding, this));
        AppCompatImageView appCompatImageView = itemRecordingRankingBinding.f32882w;
        Intrinsics2.m13088d(appCompatImageView, "thumbnail");
        SkuDao.a.m14067S(appCompatImageView, new C6326f0(1, itemRecordingRankingBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemRecordingRankingBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        ((ItemRecordingRankingBinding) baseListAdapter3.f32043u).mo14246s(i + 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecordingRankingAdapter(InterfaceC6164l<? super Recording, Unit> interfaceC6164l, InterfaceC6164l<? super Recording, Unit> interfaceC6164l2) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "accountClickListener");
        this.f31202f = interfaceC6164l;
        this.f31203g = interfaceC6164l2;
    }
}
