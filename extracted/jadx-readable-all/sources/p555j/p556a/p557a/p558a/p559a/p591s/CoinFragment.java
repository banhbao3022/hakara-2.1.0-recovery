package p555j.p556a.p557a.p558a.p559a.p591s;

import mtp.media.karaoke.R;
import p477d1.Lazy3;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p616i.CoinFragmentBinding;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.s.a, reason: use source file name */
/* JADX INFO: compiled from: CoinFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CoinFragment extends BaseFragment3<CoinFragmentBinding, WalletViewModel5> {

    /* JADX INFO: renamed from: d0 */
    public final int f31937d0 = R.layout.coin_fragment;

    /* JADX INFO: renamed from: e0 */
    public final Lazy3 f31938e0 = C8310a.m16436a(this, Reflection.m13097a(WalletViewModel5.class), new a(new b()), null);

    /* JADX INFO: renamed from: j.a.a.a.a.s.a$a */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    public static final class a extends Lambda implements InterfaceC6153a<ViewModelStore> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC6153a f31939g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31939g = interfaceC6153a;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStore mo2c() {
            ViewModelStore viewModelStoreMo128o = ((ViewModelStoreOwner) this.f31939g.mo2c()).mo128o();
            Intrinsics2.m13088d(viewModelStoreMo128o, "ownerProducer().viewModelStore");
            return viewModelStoreMo128o;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.a$b */
    /* JADX INFO: compiled from: CoinFragment.kt */
    public static final class b extends Lambda implements InterfaceC6153a<ViewModelStoreOwner> {
        public b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStoreOwner mo2c() {
            FragmentActivity fragmentActivityM16526F0 = CoinFragment.this.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            return fragmentActivityM16526F0;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31937d0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Z0 */
    public BaseViewModel mo13882Z0() {
        return (WalletViewModel5) this.f31938e0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
    }
}
