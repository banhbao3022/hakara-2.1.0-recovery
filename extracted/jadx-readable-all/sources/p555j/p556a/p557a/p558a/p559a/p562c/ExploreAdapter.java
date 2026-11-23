package p555j.p556a.p557a.p558a.p559a.p562c;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Simple3;
import mtp.media.karaoke.data.model.User;
import p000.C6022d0;
import p000.C7221m0;
import p000.C7387n;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p561b.UserSuggestionAdapter;
import p555j.p556a.p557a.p558a.p559a.p563d.p566f.DuetTrendingAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemExploreBinding;
import p636z0.p752p.C8310a;
import p636z0.p759s.LifecycleOwner;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.c.a, reason: use source file name */
/* JADX INFO: compiled from: ExploreAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreAdapter extends BaseListAdapter<Simple3, ItemExploreBinding> {

    /* JADX INFO: renamed from: f */
    public final int f31091f;

    /* JADX INFO: renamed from: g */
    public float f31092g;

    /* JADX INFO: renamed from: h */
    public float f31093h;

    /* JADX INFO: renamed from: i */
    public final ExploreViewModel f31094i;

    /* JADX INFO: renamed from: j */
    public final LifecycleOwner f31095j;

    /* JADX INFO: renamed from: k */
    public final int f31096k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC6164l<User, Unit> f31097l;

    /* JADX INFO: renamed from: m */
    public final InterfaceC6164l<Recording, Unit> f31098m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC6164l<Simple3, Unit> f31099n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC6164l<User, Unit> f31100o;

    /* JADX INFO: renamed from: j.a.a.a.a.c.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class a extends Lambda implements InterfaceC6164l<User, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31101g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31102h = new a(1);

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f31103i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31103i = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(User user) {
            int i = this.f31103i;
            if (i == 0) {
                Intrinsics2.m13089e(user, "it");
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            Intrinsics2.m13089e(user, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.c.a$b */
    /* JADX INFO: compiled from: ExploreAdapter.kt */
    public static final class b extends Lambda implements InterfaceC6164l<Recording, Unit> {

        /* JADX INFO: renamed from: g */
        public static final b f31104g = new b();

        public b() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Recording recording) {
            Intrinsics2.m13089e(recording, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.c.a$c */
    /* JADX INFO: compiled from: ExploreAdapter.kt */
    public static final class c extends Lambda implements InterfaceC6164l<Simple3, Unit> {

        /* JADX INFO: renamed from: g */
        public static final c f31105g = new c();

        public c() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple3 simple3) {
            Intrinsics2.m13089e(simple3, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.c.a$d */
    /* JADX INFO: compiled from: ExploreAdapter.kt */
    public static final class d extends DiffUtil.e<Simple3> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Simple3 simple3, Simple3 simple4) {
            Simple3 simple5 = simple3;
            Simple3 simple6 = simple4;
            Intrinsics2.m13089e(simple5, "oldItem");
            Intrinsics2.m13089e(simple6, "newItem");
            return Intrinsics2.m13085a(simple5, simple6);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Simple3 simple3, Simple3 simple4) {
            Simple3 simple5 = simple3;
            Simple3 simple6 = simple4;
            Intrinsics2.m13089e(simple5, "oldItem");
            Intrinsics2.m13089e(simple6, "newItem");
            return simple5.getId() == simple6.getId();
        }
    }

    public /* synthetic */ ExploreAdapter(ExploreViewModel exploreViewModel, LifecycleOwner lifecycleOwner, int i, InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, InterfaceC6164l interfaceC6164l3, InterfaceC6164l interfaceC6164l4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(exploreViewModel, lifecycleOwner, i, (i2 & 8) != 0 ? a.f31101g : interfaceC6164l, (i2 & 16) != 0 ? b.f31104g : interfaceC6164l2, (i2 & 32) != 0 ? c.f31105g : interfaceC6164l3, (i2 & 64) != 0 ? a.f31102h : interfaceC6164l4);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_explore;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemExploreBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        Simple3 simple3 = (Simple3) this.f39339d.f39163g.get(i);
        Intrinsics2.m13088d(simple3, "item");
        ItemExploreBinding itemExploreBinding = (ItemExploreBinding) baseListAdapter3.f32043u;
        int layout_type = simple3.getLayout_type();
        if (layout_type == 1) {
            this.f31094i.m13896o(simple3.getType(), 0);
            ExploreRecordingAdapter exploreRecordingAdapter = new ExploreRecordingAdapter(new C7221m0(0, this, simple3));
            RecyclerView recyclerView = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView, "recyclerRecording");
            recyclerView.setAdapter(exploreRecordingAdapter);
            RecyclerView recyclerView2 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView2, "recyclerRecording");
            RecyclerView recyclerView3 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView3, "recyclerRecording");
            recyclerView2.setLayoutManager(new GridLayoutManager(recyclerView3.getContext(), 1, 0, false));
            int type = simple3.getType();
            if (type == 1) {
                this.f31094i.f31120n.mo422e(this.f31095j, new C7387n(9, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 2) {
                this.f31094i.f31121o.mo422e(this.f31095j, new C7387n(20, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 3) {
                this.f31094i.f31122p.mo422e(this.f31095j, new C7387n(23, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 4) {
                this.f31094i.f31123q.mo422e(this.f31095j, new C7387n(24, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 5) {
                this.f31094i.f31124r.mo422e(this.f31095j, new C7387n(25, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 6) {
                this.f31094i.f31125s.mo422e(this.f31095j, new C7387n(26, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 7) {
                this.f31094i.f31126t.mo422e(this.f31095j, new C7387n(27, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 8) {
                this.f31094i.f31127u.mo422e(this.f31095j, new C7387n(28, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 9) {
                this.f31094i.f31128v.mo422e(this.f31095j, new C7387n(29, itemExploreBinding, exploreRecordingAdapter));
            } else if (type == 10) {
                this.f31094i.f31129w.mo422e(this.f31095j, new C7387n(0, itemExploreBinding, exploreRecordingAdapter));
            }
        } else if (layout_type == 2) {
            ExploreViewModel exploreViewModel = this.f31094i;
            Objects.requireNonNull(exploreViewModel);
            C5729a.m12428A(C8310a.m16440e(exploreViewModel), null, 0, new ExploreViewModel3(exploreViewModel, null), 3, null);
            UserSuggestionAdapter userSuggestionAdapter = new UserSuggestionAdapter(new C6022d0(0, this, simple3), new C6022d0(1, this, simple3));
            RecyclerView recyclerView4 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView4, "recyclerRecording");
            recyclerView4.setAdapter(userSuggestionAdapter);
            RecyclerView recyclerView5 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView5, "recyclerRecording");
            RecyclerView recyclerView6 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView6, "recyclerRecording");
            recyclerView5.setLayoutManager(new GridLayoutManager(recyclerView6.getContext(), 1, 0, false));
            this.f31094i.f31119m.mo422e(this.f31095j, new ExploreAdapter4(itemExploreBinding, userSuggestionAdapter));
        } else if (layout_type == 3) {
            this.f31094i.m13896o(simple3.getType(), 6);
            ExploreRecordingAdapter exploreRecordingAdapter2 = new ExploreRecordingAdapter(new C7221m0(1, this, simple3));
            RecyclerView recyclerView7 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView7, "recyclerRecording");
            recyclerView7.setAdapter(exploreRecordingAdapter2);
            RecyclerView recyclerView8 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView8, "recyclerRecording");
            RecyclerView recyclerView9 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView9, "recyclerRecording");
            recyclerView8.setLayoutManager(new GridLayoutManager(recyclerView9.getContext(), 2));
            int i2 = (this.f31096k / 2) - 32;
            exploreRecordingAdapter2.f31112f = i2;
            exploreRecordingAdapter2.f31113g = (int) (((double) i2) / 0.76d);
            int type2 = simple3.getType();
            if (type2 == 1) {
                this.f31094i.f31120n.mo422e(this.f31095j, new C7387n(1, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 2) {
                this.f31094i.f31121o.mo422e(this.f31095j, new C7387n(2, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 3) {
                this.f31094i.f31122p.mo422e(this.f31095j, new C7387n(3, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 4) {
                this.f31094i.f31123q.mo422e(this.f31095j, new C7387n(4, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 5) {
                this.f31094i.f31124r.mo422e(this.f31095j, new C7387n(5, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 6) {
                this.f31094i.f31125s.mo422e(this.f31095j, new C7387n(6, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 7) {
                this.f31094i.f31126t.mo422e(this.f31095j, new C7387n(7, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 8) {
                this.f31094i.f31127u.mo422e(this.f31095j, new C7387n(8, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 9) {
                this.f31094i.f31128v.mo422e(this.f31095j, new C7387n(10, itemExploreBinding, exploreRecordingAdapter2));
            } else if (type2 == 10) {
                this.f31094i.f31129w.mo422e(this.f31095j, new C7387n(11, itemExploreBinding, exploreRecordingAdapter2));
            }
        } else if (layout_type == 4) {
            this.f31094i.m13896o(simple3.getType(), 5);
            DuetTrendingAdapter duetTrendingAdapter = new DuetTrendingAdapter(new C7221m0(2, this, simple3));
            RecyclerView recyclerView10 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView10, "recyclerRecording");
            recyclerView10.setAdapter(duetTrendingAdapter);
            RecyclerView recyclerView11 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView11, "recyclerRecording");
            RecyclerView recyclerView12 = itemExploreBinding.f32388w;
            Intrinsics2.m13088d(recyclerView12, "recyclerRecording");
            recyclerView11.setLayoutManager(new LinearLayoutManager(recyclerView12.getContext(), 1, false));
            int type3 = simple3.getType();
            if (type3 == 1) {
                this.f31094i.f31120n.mo422e(this.f31095j, new C7387n(12, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 2) {
                this.f31094i.f31121o.mo422e(this.f31095j, new C7387n(13, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 3) {
                this.f31094i.f31122p.mo422e(this.f31095j, new C7387n(14, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 4) {
                this.f31094i.f31123q.mo422e(this.f31095j, new C7387n(15, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 5) {
                this.f31094i.f31124r.mo422e(this.f31095j, new C7387n(16, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 6) {
                this.f31094i.f31125s.mo422e(this.f31095j, new C7387n(17, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 7) {
                this.f31094i.f31126t.mo422e(this.f31095j, new C7387n(18, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 8) {
                this.f31094i.f31127u.mo422e(this.f31095j, new C7387n(19, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 9) {
                this.f31094i.f31128v.mo422e(this.f31095j, new C7387n(21, itemExploreBinding, duetTrendingAdapter));
            } else if (type3 == 10) {
                this.f31094i.f31129w.mo422e(this.f31095j, new C7387n(22, itemExploreBinding, duetTrendingAdapter));
            }
        }
        LinearLayout linearLayout = itemExploreBinding.f32385t;
        Intrinsics2.m13088d(linearLayout, "btnViewAll");
        SkuDao.a.m14067S(linearLayout, new ExploreAdapter3(this, simple3));
        itemExploreBinding.f32388w.f918B.add(new ExploreAdapter2(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExploreAdapter(ExploreViewModel exploreViewModel, LifecycleOwner lifecycleOwner, int i, InterfaceC6164l<? super User, Unit> interfaceC6164l, InterfaceC6164l<? super Recording, Unit> interfaceC6164l2, InterfaceC6164l<? super Simple3, Unit> interfaceC6164l3, InterfaceC6164l<? super User, Unit> interfaceC6164l4) {
        super(new d());
        Intrinsics2.m13089e(exploreViewModel, "viewModel");
        Intrinsics2.m13089e(lifecycleOwner, "viewLifecycleOwner");
        Intrinsics2.m13089e(interfaceC6164l, "userClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "recordingClickListener");
        Intrinsics2.m13089e(interfaceC6164l3, "viewAllClickListener");
        Intrinsics2.m13089e(interfaceC6164l4, "followClickListener");
        this.f31094i = exploreViewModel;
        this.f31095j = lifecycleOwner;
        this.f31096k = i;
        this.f31097l = interfaceC6164l;
        this.f31098m = interfaceC6164l2;
        this.f31099n = interfaceC6164l3;
        this.f31100o = interfaceC6164l4;
        this.f31091f = 10;
    }
}
