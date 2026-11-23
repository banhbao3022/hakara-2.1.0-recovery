package p555j.p556a.p557a.p558a.p559a.p589q;

import mtp.media.karaoke.R;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookException;
import p007c.p165l.p183m0.Sharer;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.q.d, reason: use source file name */
/* JADX INFO: compiled from: ShareFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShareFragment2 implements FacebookCallback<Sharer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ShareFragment f31800a;

    public ShareFragment2(ShareFragment shareFragment) {
        this.f31800a = shareFragment;
    }

    @Override // p007c.p165l.FacebookCallback
    /* JADX INFO: renamed from: a */
    public void mo2276a(Sharer sharer) {
        ShareViewModel3.m13948o(this.f31800a.mo13926g1(), this.f31800a.f31793x0, "r", 1, null, 8);
        SkuDao.a.m14092i0(this.f31800a.m16562f(), R.string.msg_share_success, 0, 2);
    }

    @Override // p007c.p165l.FacebookCallback
    /* JADX INFO: renamed from: b */
    public void mo2277b() {
        SkuDao.a.m14092i0(this.f31800a.m16562f(), R.string.msg_share_canceled, 0, 2);
    }

    @Override // p007c.p165l.FacebookCallback
    /* JADX INFO: renamed from: c */
    public void mo2278c(FacebookException facebookException) {
        Intrinsics2.m13089e(facebookException, "error");
        SkuDao.a.m14094j0(this.f31800a.m16562f(), String.valueOf(facebookException.getMessage()), 0, 2);
    }
}
