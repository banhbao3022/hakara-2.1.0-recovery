package p555j.p556a.p557a.p558a.p559a.p562c;

import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.p628ui.screen.explore.ExploreRecordingActivity;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.c.e, reason: use source file name */
/* JADX INFO: compiled from: ExploreRecordingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreRecordingActivity2 extends Lambda implements InterfaceC6164l<Recording, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ExploreRecordingActivity.C7269c f31111g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreRecordingActivity2(ExploreRecordingActivity.C7269c c7269c) {
        super(1);
        this.f31111g = c7269c;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Recording recording) {
        Recording recording2 = recording;
        Intrinsics2.m13089e(recording2, "it");
        ExploreRecordingActivity exploreRecordingActivity = ExploreRecordingActivity.this;
        ExploreRecordingActivity.C7268b c7268b = ExploreRecordingActivity.f33570y;
        Objects.requireNonNull(exploreRecordingActivity);
        exploreRecordingActivity.m13971T(PlayingActivity.f33644w.m14397a(exploreRecordingActivity, recording2.getId(), recording2.getThumbnail(), Integer.valueOf(recording2.getFormat()), Integer.valueOf(recording2.getVideoRatio()), SkuDao.a.m14052D(recording2, (ArrayList) exploreRecordingActivity.mo13969R().f32034q.m421d())));
        return Unit.f29502a;
    }
}
