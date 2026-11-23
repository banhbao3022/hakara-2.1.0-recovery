package p555j.p556a.p557a.p558a.p559a.p573i.p574a;

import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import p000.C7409x0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p616i.ItemDraftBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.i.a.a, reason: use source file name */
/* JADX INFO: compiled from: DraftAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DraftAdapter extends BaseListAdapter<RecordingEntity, ItemDraftBinding> {

    /* JADX INFO: renamed from: f */
    public final InterfaceC6164l<RecordingEntity, Unit> f31380f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<RecordingEntity, Unit> f31381g;

    /* JADX INFO: renamed from: j.a.a.a.a.i.a.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements InterfaceC6164l<RecordingEntity, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31382g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31383h = new a(1);

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f31384i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31384i = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(RecordingEntity recordingEntity) {
            int i = this.f31384i;
            if (i == 0) {
                Intrinsics2.m13089e(recordingEntity, "it");
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            Intrinsics2.m13089e(recordingEntity, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.a.a$b */
    /* JADX INFO: compiled from: DraftAdapter.kt */
    public static final class b extends DiffUtil.e<RecordingEntity> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(RecordingEntity recordingEntity, RecordingEntity recordingEntity2) {
            RecordingEntity recordingEntity3 = recordingEntity;
            RecordingEntity recordingEntity4 = recordingEntity2;
            Intrinsics2.m13089e(recordingEntity3, "oldItem");
            Intrinsics2.m13089e(recordingEntity4, "newItem");
            return Intrinsics2.m13085a(recordingEntity3, recordingEntity4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(RecordingEntity recordingEntity, RecordingEntity recordingEntity2) {
            RecordingEntity recordingEntity3 = recordingEntity;
            RecordingEntity recordingEntity4 = recordingEntity2;
            Intrinsics2.m13089e(recordingEntity3, "oldItem");
            Intrinsics2.m13089e(recordingEntity4, "newItem");
            return Intrinsics2.m13085a(recordingEntity3.f32330f, recordingEntity4.f32330f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraftAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ DraftAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31382g : interfaceC6164l, (i & 2) != 0 ? a.f31383h : interfaceC6164l2);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_draft;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemDraftBinding itemDraftBinding = (ItemDraftBinding) viewDataBinding;
        Intrinsics2.m13089e(itemDraftBinding, "binding");
        RelativeLayout relativeLayout = itemDraftBinding.f32808u;
        Intrinsics2.m13088d(relativeLayout, "rootView");
        SkuDao.a.m14067S(relativeLayout, new C7409x0(0, itemDraftBinding, this));
        ImageView imageView = itemDraftBinding.f32807t;
        Intrinsics2.m13088d(imageView, "btnMore");
        SkuDao.a.m14067S(imageView, new C7409x0(1, itemDraftBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DraftAdapter(InterfaceC6164l<? super RecordingEntity, Unit> interfaceC6164l, InterfaceC6164l<? super RecordingEntity, Unit> interfaceC6164l2) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "moreClickListener");
        this.f31380f = interfaceC6164l;
        this.f31381g = interfaceC6164l2;
    }
}
