package p555j.p556a.p557a.p558a.p559a.p589q;

import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.data.model.Simple;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.q.i, reason: use source file name */
/* JADX INFO: compiled from: ShareViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ShareViewModel3 extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public final MutableLiveData<ArrayList<Simple>> f31813l;

    /* JADX INFO: renamed from: m */
    public final RecordingRepository f31814m;

    public ShareViewModel3(RecordingRepository recordingRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        this.f31814m = recordingRepository;
        this.f31813l = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: o */
    public static void m13948o(ShareViewModel3 shareViewModel3, int i, String str, int i2, String str2, int i3) {
        int i4 = i3 & 8;
        Objects.requireNonNull(shareViewModel3);
        Intrinsics2.m13089e(str, "contentType");
        C5729a.m12428A(C8310a.m16440e(shareViewModel3), null, 0, new ShareViewModel2(shareViewModel3, i, str, i2, null, null), 3, null);
    }
}
