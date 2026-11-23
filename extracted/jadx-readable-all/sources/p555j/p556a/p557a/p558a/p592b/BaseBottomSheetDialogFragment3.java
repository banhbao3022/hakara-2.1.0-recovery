package p555j.p556a.p557a.p558a.p592b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import java.util.Objects;
import mtp.media.karaoke.R;
import p000.C7156k;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialogFragment;
import p477d1.Unit;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p619l.SingleLiveEvent;
import p636z0.p748n.DataBindingUtil;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: renamed from: j.a.a.a.b.g, reason: use source file name */
/* JADX INFO: compiled from: BaseBottomSheetDialogFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseBottomSheetDialogFragment3<ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> extends BottomSheetDialogFragment {

    /* JADX INFO: renamed from: s0 */
    public ViewBinding f32015s0;

    /* JADX INFO: renamed from: e1 */
    public static final void m13972e1(BaseBottomSheetDialogFragment3 baseBottomSheetDialogFragment3, String str) {
        Objects.requireNonNull(baseBottomSheetDialogFragment3);
        if (str == null || StringsJVM.m12990g(str)) {
            return;
        }
        SkuDao.a.m14099m();
        Context contextM16571x = baseBottomSheetDialogFragment3.m16571x();
        if (contextM16571x != null) {
            SkuDao.a.m14069U(contextM16571x, null, str, baseBottomSheetDialogFragment3.m16546Q(R.string.f33401ok), null, null, null, false, false, 249);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public void mo13924d1() {
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: f0 */
    public View mo466f0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics2.m13089e(layoutInflater, "inflater");
        ViewBinding viewbinding = (ViewBinding) DataBindingUtil.m16404c(layoutInflater, mo13925f1(), viewGroup, false);
        Intrinsics2.m13088d(viewbinding, "DataBindingUtil.inflate(…youtId, container, false)");
        this.f32015s0 = viewbinding;
        if (viewbinding == null) {
            Intrinsics2.m13096l("viewBinding");
            throw null;
        }
        viewbinding.mo403q(9, mo13926g1());
        ViewBinding viewbinding2 = this.f32015s0;
        if (viewbinding2 == null) {
            Intrinsics2.m13096l("viewBinding");
            throw null;
        }
        viewbinding2.m402p(m16548R());
        View view = viewbinding.f726k;
        Intrinsics2.m13088d(view, "root");
        view.setClickable(true);
        viewbinding.m396c();
        ViewBinding viewbinding3 = this.f32015s0;
        if (viewbinding3 != null) {
            return viewbinding3.f726k;
        }
        Intrinsics2.m13096l("viewBinding");
        throw null;
    }

    /* JADX INFO: renamed from: f1 */
    public abstract int mo13925f1();

    /* JADX INFO: renamed from: g1 */
    public abstract ViewModel mo13926g1();

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13924d1();
    }

    /* JADX INFO: renamed from: h1 */
    public void m13973h1(Intent intent) {
        m16555U0(intent);
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            fragmentActivityM16562f.overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        BaseViewModel baseViewModelMo13926g1 = mo13926g1();
        baseViewModelMo13926g1.f31989c.mo422e(m16548R(), new BaseBottomSheetDialogFragment(this));
        SingleLiveEvent<String> singleLiveEventM13959h = baseViewModelMo13926g1.m13959h();
        LifecycleOwner lifecycleOwnerM16548R = m16548R();
        Intrinsics2.m13088d(lifecycleOwnerM16548R, "viewLifecycleOwner");
        singleLiveEventM13959h.mo422e(lifecycleOwnerM16548R, new BaseBottomSheetDialogFragment2(this));
        SingleLiveEvent<Unit> singleLiveEventM13961j = baseViewModelMo13926g1.m13961j();
        LifecycleOwner lifecycleOwnerM16548R2 = m16548R();
        Intrinsics2.m13088d(lifecycleOwnerM16548R2, "viewLifecycleOwner");
        singleLiveEventM13961j.mo422e(lifecycleOwnerM16548R2, new C7156k(0, this));
        SingleLiveEvent<Unit> singleLiveEventM13958g = baseViewModelMo13926g1.m13958g();
        LifecycleOwner lifecycleOwnerM16548R3 = m16548R();
        Intrinsics2.m13088d(lifecycleOwnerM16548R3, "viewLifecycleOwner");
        singleLiveEventM13958g.mo422e(lifecycleOwnerM16548R3, new C7156k(1, this));
        SingleLiveEvent<Unit> singleLiveEventM13960i = baseViewModelMo13926g1.m13960i();
        LifecycleOwner lifecycleOwnerM16548R4 = m16548R();
        Intrinsics2.m13088d(lifecycleOwnerM16548R4, "viewLifecycleOwner");
        singleLiveEventM13960i.mo422e(lifecycleOwnerM16548R4, new C7156k(2, this));
        SingleLiveEvent<Unit> singleLiveEventM13962k = baseViewModelMo13926g1.m13962k();
        LifecycleOwner lifecycleOwnerM16548R5 = m16548R();
        Intrinsics2.m13088d(lifecycleOwnerM16548R5, "viewLifecycleOwner");
        singleLiveEventM13962k.mo422e(lifecycleOwnerM16548R5, new C7156k(3, this));
        SingleLiveEvent<Unit> singleLiveEventM13963l = baseViewModelMo13926g1.m13963l();
        LifecycleOwner lifecycleOwnerM16548R6 = m16548R();
        Intrinsics2.m13088d(lifecycleOwnerM16548R6, "viewLifecycleOwner");
        singleLiveEventM13963l.mo422e(lifecycleOwnerM16548R6, new C7156k(4, this));
    }
}
