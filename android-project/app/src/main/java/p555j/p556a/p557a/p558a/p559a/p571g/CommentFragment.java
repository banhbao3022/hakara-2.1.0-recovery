package p555j.p556a.p557a.p558a.p559a.p571g;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Comment;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C7406w;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p558a.p593c.LinkListener;
import p555j.p556a.p557a.p558a.p593c.RefreshableFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.g.b, reason: use source file name */
/* JADX INFO: compiled from: CommentFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CommentFragment extends BaseLoadMoreRefreshFragment<FragmentLoadmoreRefreshBinding, CommentViewModel3, Comment> implements RefreshableFragment, LinkListener {

    /* JADX INFO: renamed from: f0 */
    public static final b f31323f0 = new b(null);

    /* JADX INFO: renamed from: i0 */
    public c f31326i0;

    /* JADX INFO: renamed from: k0 */
    public HashMap f31328k0;

    /* JADX INFO: renamed from: g0 */
    public final int f31324g0 = R.layout.comment_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31325h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: j0 */
    public final Lazy3 f31327j0 = LazyJVM.m13021b(new d());

    /* JADX INFO: renamed from: j.a.a.a.a.g.b$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<CommentViewModel3> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31329g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31330h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31331i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31329g = viewModelStoreOwner;
            this.f31330h = qualifier;
            this.f31331i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.g.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public CommentViewModel3 mo2c() {
            return SkuDao.a.m14107t(this.f31329g, Reflection.m13097a(CommentViewModel3.class), this.f31330h, this.f31331i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.g.b$b */
    /* JADX INFO: compiled from: CommentFragment.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.g.b$c */
    /* JADX INFO: compiled from: CommentFragment.kt */
    public interface c {
        /* JADX INFO: renamed from: f */
        void mo13913f(Comment comment);

        /* JADX INFO: renamed from: m */
        void mo13914m(Comment comment);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.g.b$d */
    /* JADX INFO: compiled from: CommentFragment.kt */
    public static final class d extends Lambda implements InterfaceC6153a<CommentAdapter> {
        public d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public CommentAdapter mo2c() {
            return new CommentAdapter(new C7406w(0, this), new C7406w(1, this), new C7406w(2, this), new C7406w(3, this), CommentFragment.this);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31328k0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31324g0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof c) {
            this.f31326i0 = (c) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p555j.p556a.p557a.p558a.p593c.RefreshableFragment
    /* JADX INFO: renamed from: c */
    public void mo13910c() {
        Intrinsics2.m13089e("refreshContent", "message");
        mo13882Z0().m13984q();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            CommentViewModel3 commentViewModel3Mo13882Z0 = mo13882Z0();
            commentViewModel3Mo13882Z0.f31346s.mo427j(Integer.valueOf(bundle2.getInt("contentId")));
            commentViewModel3Mo13882Z0.f31347t.mo427j(bundle2.getString("contentType"));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31328k0 == null) {
            this.f31328k0 = new HashMap();
        }
        View view = (View) this.f31328k0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31328k0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Comment, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31327j0.getValue();
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
            backgroundMessageView2.m14471b(R.drawable.ic_no_comment, R.string.message_comment_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public CommentViewModel3 mo13882Z0() {
        return (CommentViewModel3) this.f31325h0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
        this.f31326i0 = null;
    }

    @Override // p555j.p556a.p557a.p558a.p593c.LinkListener
    /* JADX INFO: renamed from: l */
    public void mo13912l(int i) {
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        if (user == null || i != user.getId()) {
            ProfileActivity.C7312a c7312a = ProfileActivity.f33786u;
            Context contextM16528G0 = m16528G0();
            Intrinsics2.m13088d(contextM16528G0, "requireContext()");
            m13976b1(c7312a.m14415a(contextM16528G0, i));
        }
    }
}
