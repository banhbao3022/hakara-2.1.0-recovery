package p555j.p556a.p557a.p558a.p559a.p573i.p574a;

import android.content.Context;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.process.ProcessActivity;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C7395q0;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p558a.p593c.RefreshableFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p616i.DraftFragmentBinding;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.i.a.b, reason: use source file name */
/* JADX INFO: compiled from: DraftFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DraftFragment extends BaseLoadMoreRefreshFragment<DraftFragmentBinding, DraftViewModel2, RecordingEntity> implements RefreshableFragment {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ int f31385f0 = 0;

    /* JADX INFO: renamed from: g0 */
    public final int f31386g0 = R.layout.draft_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31387h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public final Lazy3 f31388i0 = LazyJVM.m13021b(new b());

    /* JADX INFO: renamed from: j0 */
    public HashMap f31389j0;

    /* JADX INFO: renamed from: j.a.a.a.a.i.a.b$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<DraftViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31390g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31391h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31392i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31390g = viewModelStoreOwner;
            this.f31391h = qualifier;
            this.f31392i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.a.g] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public DraftViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f31390g, Reflection.m13097a(DraftViewModel2.class), this.f31391h, this.f31392i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.a.b$b */
    /* JADX INFO: compiled from: DraftFragment.kt */
    public static final class b extends Lambda implements InterfaceC6153a<DraftAdapter> {
        public b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public DraftAdapter mo2c() {
            return new DraftAdapter(new C7395q0(0, this), new C7395q0(1, this));
        }
    }

    /* JADX INFO: renamed from: g1 */
    public static final void m13915g1(DraftFragment draftFragment, RecordingEntity recordingEntity) {
        Objects.requireNonNull(draftFragment);
        ProcessActivity.C7304d c7304d = ProcessActivity.f33721w;
        Context contextM16528G0 = draftFragment.m16528G0();
        Intrinsics2.m13088d(contextM16528G0, "requireContext()");
        String strValueOf = String.valueOf(recordingEntity.f32347w);
        String strValueOf2 = String.valueOf(recordingEntity.f32348x);
        Long l = recordingEntity.f32330f;
        long jLongValue = l != null ? l.longValue() : 0L;
        Boolean bool = Boolean.TRUE;
        int i = recordingEntity.f32344t;
        int i2 = recordingEntity.f32343s;
        Integer num = recordingEntity.f32341q;
        draftFragment.m13976b1(c7304d.m14414a(contextM16528G0, strValueOf, strValueOf2, jLongValue, bool, i2, i, num != null ? num.intValue() : 0, recordingEntity.f32338n, recordingEntity.f32350z, recordingEntity.f32327A));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31389j0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31386g0;
    }

    @Override // p555j.p556a.p557a.p558a.p593c.RefreshableFragment
    /* JADX INFO: renamed from: c */
    public void mo13910c() {
        mo13882Z0().m13984q();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31389j0 == null) {
            this.f31389j0 = new HashMap();
        }
        View view = (View) this.f31389j0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31389j0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<RecordingEntity, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31388i0.getValue();
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
            backgroundMessageView2.m14471b(R.drawable.ic_no_song, R.string.message_draft_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public DraftViewModel2 mo13882Z0() {
        return (DraftViewModel2) this.f31387h0.getValue();
    }
}
