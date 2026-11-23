package p555j.p556a.p557a.p558a.p559a.p560a;

import mtp.media.karaoke.data.model.Duet;
import mtp.media.karaoke.p628ui.screen.process.PostActivity;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.a.g, reason: use source file name */
/* JADX INFO: compiled from: PostActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PostActivity2<T> implements Observer<Duet> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PostActivity f30996a;

    public PostActivity2(PostActivity postActivity) {
        this.f30996a = postActivity;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(Duet duet) {
        Duet duet2 = duet;
        RecordingEntity recordingEntityM421d = this.f30996a.mo13969R().f31869x.m421d();
        if (recordingEntityM421d != null) {
            recordingEntityM421d.f32334j = duet2.getId();
        }
        Intrinsics2.m13089e("postRecording duet", "message");
        this.f30996a.m14401X();
    }
}
