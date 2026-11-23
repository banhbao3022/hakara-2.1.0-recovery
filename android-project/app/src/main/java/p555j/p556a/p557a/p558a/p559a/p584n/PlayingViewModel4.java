package p555j.p556a.p557a.p558a.p559a.p584n;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.Recording;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.n.m, reason: use source file name */
/* JADX INFO: compiled from: PlayingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlayingViewModel4 extends BaseViewModel {

    /* JADX INFO: renamed from: l */
    public MutableLiveData<Recording> f31696l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<ArrayList<Present>> f31697m;

    /* JADX INFO: renamed from: n */
    public final RecordingRepository f31698n;

    public PlayingViewModel4(RecordingRepository recordingRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        this.f31698n = recordingRepository;
        this.f31696l = new MutableLiveData<>();
        this.f31697m = new MutableLiveData<>();
    }
}
