package p555j.p556a.p557a.p558a.p559a.p578j;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.model.User;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p614e.GiftRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.j.h, reason: use source file name */
/* JADX INFO: compiled from: GiftViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GiftViewModel3 extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public MutableLiveData<User> f31573l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<ArrayList<Gift>> f31574m;

    /* JADX INFO: renamed from: n */
    public MutableLiveData<Boolean> f31575n;

    /* JADX INFO: renamed from: o */
    public final GiftRepository f31576o;

    public GiftViewModel3(GiftRepository giftRepository) {
        Intrinsics2.m13089e(giftRepository, "giftRepository");
        this.f31576o = giftRepository;
        this.f31573l = new MutableLiveData<>();
        this.f31574m = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(Boolean.FALSE);
        this.f31575n = mutableLiveData;
    }
}
