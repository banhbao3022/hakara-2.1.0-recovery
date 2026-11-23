package mtp.media.karaoke.p628ui.screen.explore;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreRecordingActivity2;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreRecordingAdapter;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: ExploreRecordingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreRecordingActivity extends BaseLoadMoreRefreshActivity<FragmentLoadmoreRefreshBinding, RecordingViewModel2, Recording> {

    /* JADX INFO: renamed from: y */
    public static final C7268b f33570y = new C7268b(null);

    /* JADX INFO: renamed from: C */
    public HashMap f33573C;

    /* JADX INFO: renamed from: z */
    public final int f33574z = R.layout.explore_recording_activity;

    /* JADX INFO: renamed from: A */
    public final Lazy3 f33571A = LazyJVM.m13020a(Lazy4.NONE, new C7267a(this, null, null));

    /* JADX INFO: renamed from: B */
    public final Lazy3 f33572B = LazyJVM.m13021b(new C7269c());

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreRecordingActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7267a extends Lambda implements InterfaceC6153a<RecordingViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33575g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33576h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33577i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7267a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33575g = viewModelStoreOwner;
            this.f33576h = qualifier;
            this.f33577i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.e.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f33575g, Reflection.m13097a(RecordingViewModel2.class), this.f33576h, this.f33577i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreRecordingActivity$b */
    /* JADX INFO: compiled from: ExploreRecordingActivity.kt */
    public static final class C7268b {
        public C7268b() {
        }

        public C7268b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreRecordingActivity$c */
    /* JADX INFO: compiled from: ExploreRecordingActivity.kt */
    public static final class C7269c extends Lambda implements InterfaceC6153a<ExploreRecordingAdapter> {
        public C7269c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ExploreRecordingAdapter mo2c() {
            return new ExploreRecordingAdapter(new ExploreRecordingActivity2(this));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33574z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f33573C == null) {
            this.f33573C = new HashMap();
        }
        View view = (View) this.f33573C.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33573C.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: V */
    public RecyclerView.AbstractC0160m mo13979V() {
        return new GridLayoutManager(this, 2);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: W */
    public BaseListAdapter<Recording, ? extends ViewDataBinding> mo13980W() {
        return (BaseListAdapter) this.f33572B.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public RecordingViewModel2 mo13969R() {
        return (RecordingViewModel2) this.f33571A.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        mo13969R().f31254u.mo427j(4);
        mo13969R().f31258y.mo427j(Integer.valueOf(getIntent().getIntExtra("sub_mode", 1)));
        int iM14104q = (SkuDao.a.m14104q(this) / 2) - 32;
        BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13980W = mo13980W();
        Objects.requireNonNull(baseListAdapterMo13980W, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.explore.ExploreRecordingAdapter");
        ((ExploreRecordingAdapter) baseListAdapterMo13980W).f31112f = iM14104q;
        BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13980W2 = mo13980W();
        Objects.requireNonNull(baseListAdapterMo13980W2, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.explore.ExploreRecordingAdapter");
        ((ExploreRecordingAdapter) baseListAdapterMo13980W2).f31113g = (int) (((double) iM14104q) / 0.76d);
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) mo13978U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) mo13978U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14598r(getIntent().getStringExtra(CainMediaMetadataRetriever.METADATA_KEY_TITLE));
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f143l.m133b();
        return true;
    }
}
