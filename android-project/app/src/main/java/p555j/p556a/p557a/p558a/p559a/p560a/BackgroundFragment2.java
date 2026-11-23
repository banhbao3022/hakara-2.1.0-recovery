package p555j.p556a.p557a.p558a.p559a.p560a;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Simple2;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p590r.C6799h0;
import p555j.p556a.p557a.p558a.p559a.p590r.C6803j0;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentBackgroundBinding;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.a.c, reason: use source file name */
/* JADX INFO: compiled from: BackgroundFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundFragment2 extends BaseFragment3<FragmentBackgroundBinding, C6799h0> {

    /* JADX INFO: renamed from: d0 */
    public final int f30978d0 = R.layout.fragment_background;

    /* JADX INFO: renamed from: e0 */
    public final Lazy3 f30979e0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: f0 */
    public BackgroundFragment f30980f0 = new BackgroundFragment(new d());

    /* JADX INFO: renamed from: g0 */
    public c f30981g0;

    /* JADX INFO: renamed from: h0 */
    public HashMap f30982h0;

    /* JADX INFO: renamed from: j.a.a.a.a.a.c$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<C6799h0> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f30983g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f30984h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f30985i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f30983g = viewModelStoreOwner;
            this.f30984h = qualifier;
            this.f30985i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.r.h0] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public C6799h0 mo2c() {
            return SkuDao.a.m14107t(this.f30983g, Reflection.m13097a(C6799h0.class), this.f30984h, this.f30985i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.c$b */
    /* JADX INFO: compiled from: BackgroundFragment.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.c$c */
    /* JADX INFO: compiled from: BackgroundFragment.kt */
    public interface c {
        /* JADX INFO: renamed from: x */
        void mo13885x(Simple2 simple2);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.a.c$d */
    /* JADX INFO: compiled from: BackgroundFragment.kt */
    public static final class d extends Lambda implements InterfaceC6164l<Simple2, Unit> {
        public d() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple2 simple2) {
            Simple2 simple3 = simple2;
            Intrinsics2.m13089e(simple3, "it");
            c cVar = BackgroundFragment2.this.f30981g0;
            if (cVar != null) {
                cVar.mo13885x(simple3);
            }
            return Unit.f29502a;
        }
    }

    static {
        new b(null);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f30982h0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f30978d0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof c) {
            this.f30981g0 = (c) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
    }

    /* JADX INFO: renamed from: c1 */
    public View m13883c1(int i) {
        if (this.f30982h0 == null) {
            this.f30982h0 = new HashMap();
        }
        View view = (View) this.f30982h0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f30982h0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public C6799h0 mo13882Z0() {
        return (C6799h0) this.f30979e0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f30982h0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
        this.f30981g0 = null;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        C6799h0 c6799h0Mo13882Z0 = mo13882Z0();
        Objects.requireNonNull(c6799h0Mo13882Z0);
        C5729a.m12428A(C8310a.m16440e(c6799h0Mo13882Z0), null, 0, new C6803j0(c6799h0Mo13882Z0, null), 3, null);
        ((RecyclerView) m13883c1(R.id.recycler_view)).setHasFixedSize(true);
        RecyclerView recyclerView = (RecyclerView) m13883c1(R.id.recycler_view);
        Intrinsics2.m13088d(recyclerView, "recycler_view");
        recyclerView.setAdapter(this.f30980f0);
        RecyclerView recyclerView2 = (RecyclerView) m13883c1(R.id.recycler_view);
        Intrinsics2.m13088d(recyclerView2, "recycler_view");
        recyclerView2.setLayoutManager(new GridLayoutManager(m16528G0(), 4));
        mo13882Z0().f31865t.mo422e(m16548R(), new BackgroundFragment3(this));
        BackgroundFragment backgroundFragment = this.f30980f0;
        FragmentActivity fragmentActivityM16526F0 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        backgroundFragment.f30972g = (SkuDao.a.m14104q(fragmentActivityM16526F0) / 4) - 30;
    }
}
