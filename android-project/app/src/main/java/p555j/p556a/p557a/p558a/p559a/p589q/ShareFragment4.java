package p555j.p556a.p557a.p558a.p559a.p589q;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Simple;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.q.f, reason: use source file name */
/* JADX INFO: compiled from: ShareFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShareFragment4<T> implements Observer<ArrayList<Simple>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ShareFragment f31802a;

    public ShareFragment4(ShareFragment shareFragment) {
        this.f31802a = shareFragment;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(ArrayList<Simple> arrayList) {
        this.f31802a.f31792w0.m13977p(arrayList);
        ShareFragment shareFragment = this.f31802a;
        ShareAdapter shareAdapter = shareFragment.f31792w0;
        FragmentActivity fragmentActivityM16526F0 = shareFragment.m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        shareAdapter.f31778f = SkuDao.a.m14104q(fragmentActivityM16526F0) / 4;
    }
}
