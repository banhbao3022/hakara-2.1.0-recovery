package p555j.p556a.p557a.p558a.p559a.p560a;

import android.widget.RelativeLayout;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple5;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemPrivacyBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.a.j, reason: use source file name */
/* JADX INFO: compiled from: PrivacySettingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PrivacySettingAdapter extends BaseListAdapter<Simple5, ItemPrivacyBinding> {

    /* JADX INFO: renamed from: f */
    public int f31006f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Simple5, Unit> f31007g;

    /* JADX INFO: renamed from: j.a.a.a.a.a.j$a */
    /* JADX INFO: compiled from: PrivacySettingAdapter.kt */
    public static final class a extends Lambda implements InterfaceC6164l<Simple5, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31008g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple5 simple5) {
            Intrinsics2.m13089e(simple5, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.j$b */
    /* JADX INFO: compiled from: PrivacySettingAdapter.kt */
    public static final class b extends DiffUtil.e<Simple5> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Simple5 simple5, Simple5 simple6) {
            Simple5 simple7 = simple5;
            Simple5 simple8 = simple6;
            Intrinsics2.m13089e(simple7, "oldItem");
            Intrinsics2.m13089e(simple8, "newItem");
            return Intrinsics2.m13085a(simple7, simple8);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Simple5 simple5, Simple5 simple6) {
            Simple5 simple7 = simple5;
            Simple5 simple8 = simple6;
            Intrinsics2.m13089e(simple7, "oldItem");
            Intrinsics2.m13089e(simple8, "newItem");
            return Intrinsics2.m13085a(simple7.getTitle(), simple8.getTitle());
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.j$c */
    /* JADX INFO: compiled from: PrivacySettingAdapter.kt */
    public static final class c extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Simple5 f31010h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f31011i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ BaseListAdapter3 f31012j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Simple5 simple5, int i, BaseListAdapter3 baseListAdapter3) {
            super(0);
            this.f31010h = simple5;
            this.f31011i = i;
            this.f31012j = baseListAdapter3;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            Simple5 simple5 = this.f31010h;
            if (simple5 != null) {
                int i = this.f31011i;
                PrivacySettingAdapter privacySettingAdapter = PrivacySettingAdapter.this;
                int i2 = privacySettingAdapter.f31006f;
                if (i != i2) {
                    ((Simple5) privacySettingAdapter.f39339d.f39163g.get(i2)).setChecked(false);
                    PrivacySettingAdapter privacySettingAdapter2 = PrivacySettingAdapter.this;
                    privacySettingAdapter2.m664f(privacySettingAdapter2.f31006f);
                }
                simple5.setChecked(true);
                ((ItemPrivacyBinding) this.f31012j.f32043u).f32763u.setBackgroundResource(R.drawable.ic_privacy_option_checked);
                PrivacySettingAdapter privacySettingAdapter3 = PrivacySettingAdapter.this;
                privacySettingAdapter3.f31006f = this.f31011i;
                privacySettingAdapter3.f31007g.mo3b(simple5);
            }
            return Unit.f29502a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PrivacySettingAdapter() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ PrivacySettingAdapter(InterfaceC6164l interfaceC6164l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31008g : interfaceC6164l);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_privacy;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0152e
    /* JADX INFO: renamed from: o */
    public void mo666h(BaseListAdapter3<ItemPrivacyBinding> baseListAdapter3, int i) {
        Intrinsics2.m13089e(baseListAdapter3, "holder");
        super.mo666h(baseListAdapter3, i);
        Simple5 simple5 = (Simple5) this.f39339d.f39163g.get(i);
        if (simple5.isChecked()) {
            this.f31006f = i;
        }
        RelativeLayout relativeLayout = ((ItemPrivacyBinding) baseListAdapter3.f32043u).f32765w;
        Intrinsics2.m13088d(relativeLayout, "holder.binding.rootView");
        SkuDao.a.m14067S(relativeLayout, new c(simple5, i, baseListAdapter3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PrivacySettingAdapter(InterfaceC6164l<? super Simple5, Unit> interfaceC6164l) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        this.f31007g = interfaceC6164l;
    }
}
