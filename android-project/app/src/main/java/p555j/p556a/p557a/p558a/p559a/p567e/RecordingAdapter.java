package p555j.p556a.p557a.p558a.p559a.p567e;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p000.C7401t0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemRecordingBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.e.a, reason: use source file name */
/* JADX INFO: compiled from: RecordingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingAdapter extends BaseListAdapter<Recording, ItemRecordingBinding> {

    /* JADX INFO: renamed from: f */
    public boolean f31179f;

    /* JADX INFO: renamed from: g */
    public boolean f31180g;

    /* JADX INFO: renamed from: h */
    public boolean f31181h;

    /* JADX INFO: renamed from: i */
    public Integer f31182i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC6164l<Recording, Unit> f31183j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC6164l<Recording, Unit> f31184k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC6164l<Recording, Unit> f31185l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC6164l<Recording, Unit> f31186m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC6164l<Recording, Unit> f31187n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC6164l<Recording, Unit> f31188o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC6164l<Recording, Unit> f31189p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC6164l<Recording, Unit> f31190q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6164l<Recording, Unit> f31191r;

    /* JADX INFO: renamed from: j.a.a.a.a.e.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements InterfaceC6164l<Recording, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31192g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31193h = new a(1);

        /* JADX INFO: renamed from: i */
        public static final a f31194i = new a(2);

        /* JADX INFO: renamed from: j */
        public static final a f31195j = new a(3);

        /* JADX INFO: renamed from: k */
        public static final a f31196k = new a(4);

        /* JADX INFO: renamed from: l */
        public static final a f31197l = new a(5);

        /* JADX INFO: renamed from: m */
        public static final a f31198m = new a(6);

        /* JADX INFO: renamed from: n */
        public static final a f31199n = new a(7);

        /* JADX INFO: renamed from: o */
        public static final a f31200o = new a(8);

        /* JADX INFO: renamed from: p */
        public final /* synthetic */ int f31201p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31201p = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(Recording recording) {
            switch (this.f31201p) {
                case 0:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 1:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 2:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 3:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 4:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 5:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 6:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 7:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                case 8:
                    Intrinsics2.m13089e(recording, "it");
                    return Unit.f29502a;
                default:
                    throw null;
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.a$b */
    /* JADX INFO: compiled from: RecordingAdapter.kt */
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

    public RecordingAdapter() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public /* synthetic */ RecordingAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, InterfaceC6164l interfaceC6164l3, InterfaceC6164l interfaceC6164l4, InterfaceC6164l interfaceC6164l5, InterfaceC6164l interfaceC6164l6, InterfaceC6164l interfaceC6164l7, InterfaceC6164l interfaceC6164l8, InterfaceC6164l interfaceC6164l9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31192g : interfaceC6164l, (i & 2) != 0 ? a.f31193h : interfaceC6164l2, (i & 4) != 0 ? a.f31194i : interfaceC6164l3, (i & 8) != 0 ? a.f31195j : interfaceC6164l4, (i & 16) != 0 ? a.f31196k : interfaceC6164l5, (i & 32) != 0 ? a.f31197l : interfaceC6164l6, (i & 64) != 0 ? a.f31198m : interfaceC6164l7, (i & 128) != 0 ? a.f31199n : interfaceC6164l8, (i & 256) != 0 ? a.f31200o : interfaceC6164l9);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_recording;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemRecordingBinding itemRecordingBinding = (ItemRecordingBinding) viewDataBinding;
        Intrinsics2.m13089e(itemRecordingBinding, "binding");
        View view = itemRecordingBinding.f726k;
        Intrinsics2.m13088d(view, "root");
        SkuDao.a.m14067S(view, new C7401t0(0, itemRecordingBinding, this));
        LinearLayout linearLayout = itemRecordingBinding.f32835w;
        Intrinsics2.m13088d(linearLayout, "btnLike");
        SkuDao.a.m14067S(linearLayout, new C7401t0(1, itemRecordingBinding, this));
        LinearLayout linearLayout2 = itemRecordingBinding.f32832t;
        Intrinsics2.m13088d(linearLayout2, "btnComment");
        SkuDao.a.m14067S(linearLayout2, new C7401t0(2, itemRecordingBinding, this));
        LinearLayout linearLayout3 = itemRecordingBinding.f32838z;
        Intrinsics2.m13088d(linearLayout3, "btnShare");
        SkuDao.a.m14067S(linearLayout3, new C7401t0(3, itemRecordingBinding, this));
        LinearLayout linearLayout4 = itemRecordingBinding.f32837y;
        Intrinsics2.m13088d(linearLayout4, "btnSendGift");
        SkuDao.a.m14067S(linearLayout4, new C7401t0(4, itemRecordingBinding, this));
        RelativeLayout relativeLayout = itemRecordingBinding.f32826O;
        Intrinsics2.m13088d(relativeLayout, "viewAccount");
        SkuDao.a.m14067S(relativeLayout, new C7401t0(5, itemRecordingBinding, this));
        TextView textView = itemRecordingBinding.f32833u;
        Intrinsics2.m13088d(textView, "btnFollow");
        SkuDao.a.m14067S(textView, new C7401t0(6, itemRecordingBinding, this));
        TextView textView2 = itemRecordingBinding.f32834v;
        Intrinsics2.m13088d(textView2, "btnJoinDuetOrInvite");
        SkuDao.a.m14067S(textView2, new C7401t0(7, itemRecordingBinding, this));
        ImageView imageView = itemRecordingBinding.f32836x;
        Intrinsics2.m13088d(imageView, "btnMore");
        SkuDao.a.m14067S(imageView, new C7401t0(8, itemRecordingBinding, this));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemRecordingBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        ((ItemRecordingBinding) baseListAdapter3.f32043u).mo14243t(this.f31179f);
        ((ItemRecordingBinding) baseListAdapter3.f32043u).mo14244u(this.f31180g);
        ((ItemRecordingBinding) baseListAdapter3.f32043u).mo14245v(this.f31181h);
        ((ItemRecordingBinding) baseListAdapter3.f32043u).mo14242s(this.f31182i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecordingAdapter(InterfaceC6164l<? super Recording, Unit> interfaceC6164l, InterfaceC6164l<? super Recording, Unit> interfaceC6164l2, InterfaceC6164l<? super Recording, Unit> interfaceC6164l3, InterfaceC6164l<? super Recording, Unit> interfaceC6164l4, InterfaceC6164l<? super Recording, Unit> interfaceC6164l5, InterfaceC6164l<? super Recording, Unit> interfaceC6164l6, InterfaceC6164l<? super Recording, Unit> interfaceC6164l7, InterfaceC6164l<? super Recording, Unit> interfaceC6164l8, InterfaceC6164l<? super Recording, Unit> interfaceC6164l9) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "likeClickListener");
        Intrinsics2.m13089e(interfaceC6164l3, "commentClickListener");
        Intrinsics2.m13089e(interfaceC6164l4, "shareClickListener");
        Intrinsics2.m13089e(interfaceC6164l5, "giftClickListener");
        Intrinsics2.m13089e(interfaceC6164l6, "accountClickListener");
        Intrinsics2.m13089e(interfaceC6164l7, "followClickListener");
        Intrinsics2.m13089e(interfaceC6164l8, "joinDuetOrInviteClickListener");
        Intrinsics2.m13089e(interfaceC6164l9, "moreClickListener");
        this.f31183j = interfaceC6164l;
        this.f31184k = interfaceC6164l2;
        this.f31185l = interfaceC6164l3;
        this.f31186m = interfaceC6164l4;
        this.f31187n = interfaceC6164l5;
        this.f31188o = interfaceC6164l6;
        this.f31189p = interfaceC6164l7;
        this.f31190q = interfaceC6164l8;
        this.f31191r = interfaceC6164l9;
        this.f31181h = true;
        this.f31182i = 0;
    }
}
