package p555j.p556a.p557a.p558a.p559a.p567e.p568b;

import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C6329g0;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.e.b.b, reason: use source file name */
/* JADX INFO: compiled from: RecordingRankingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingRankingFragment extends BaseLoadMoreRefreshFragment<FragmentLoadmoreRefreshBinding, RecordingRankingViewModel, Recording> {

    /* JADX INFO: renamed from: f0 */
    public static final b f31207f0 = new b(null);

    /* JADX INFO: renamed from: g0 */
    public final int f31208g0 = R.layout.recording_ranking_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31209h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public final Lazy3 f31210i0 = LazyJVM.m13021b(new c());

    /* JADX INFO: renamed from: j0 */
    public HashMap f31211j0;

    /* JADX INFO: renamed from: j.a.a.a.a.e.b.b$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<RecordingRankingViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31212g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31213h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31214i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31212g = viewModelStoreOwner;
            this.f31213h = qualifier;
            this.f31214i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.e.b.d] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingRankingViewModel mo2c() {
            return SkuDao.a.m14107t(this.f31212g, Reflection.m13097a(RecordingRankingViewModel.class), this.f31213h, this.f31214i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.b.b$b */
    /* JADX INFO: compiled from: RecordingRankingFragment.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.b.b$c */
    /* JADX INFO: compiled from: RecordingRankingFragment.kt */
    public static final class c extends Lambda implements InterfaceC6153a<RecordingRankingAdapter> {
        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingRankingAdapter mo2c() {
            return new RecordingRankingAdapter(new C6329g0(0, this), new C6329g0(1, this));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31211j0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31208g0;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            RecordingRankingViewModel recordingRankingViewModelMo13882Z0 = mo13882Z0();
            recordingRankingViewModelMo13882Z0.f31218t.mo427j(Integer.valueOf(bundle2.getInt("kind")));
            recordingRankingViewModelMo13882Z0.f31217s.mo427j(Integer.valueOf(bundle2.getInt("song_id")));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31211j0 == null) {
            this.f31211j0 = new HashMap();
        }
        View view = (View) this.f31211j0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31211j0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Recording, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31210i0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: f1 */
    public void mo13897f1() {
        BackgroundMessageView backgroundMessageView = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView != null) {
            SkuDao.a.m14068T(backgroundMessageView);
        }
        BackgroundMessageView backgroundMessageView2 = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView2 != null) {
            backgroundMessageView2.m14471b(R.drawable.ic_no_song, R.string.message_recording_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public RecordingRankingViewModel mo13882Z0() {
        return (RecordingRankingViewModel) this.f31209h0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }
}
