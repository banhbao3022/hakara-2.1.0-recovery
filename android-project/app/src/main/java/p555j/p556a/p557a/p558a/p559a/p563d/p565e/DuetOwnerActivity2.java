package p555j.p556a.p557a.p558a.p559a.p563d.p565e;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Objects;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.p628ui.screen.duet.owner.DuetOwnerActivity;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.d.e.a, reason: use source file name */
/* JADX INFO: compiled from: DuetOwnerActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetOwnerActivity2 extends Lambda implements InterfaceC6164l<Recording, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DuetOwnerActivity.C7257c f31173g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuetOwnerActivity2(DuetOwnerActivity.C7257c c7257c) {
        super(1);
        this.f31173g = c7257c;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Recording recording) {
        Recording recording2 = recording;
        Intrinsics2.m13089e(recording2, "it");
        DuetOwnerActivity duetOwnerActivity = DuetOwnerActivity.this;
        DuetOwnerActivity.C7256b c7256b = DuetOwnerActivity.f33536y;
        Objects.requireNonNull(duetOwnerActivity);
        Intrinsics2.m13089e("recording.id " + recording2.getId(), "message");
        Intent intentM14397a = PlayingActivity.f33644w.m14397a(duetOwnerActivity, recording2.getId(), recording2.getThumbnail(), Integer.valueOf(recording2.getFormat()), Integer.valueOf(recording2.getVideoRatio()), SkuDao.a.m14052D(recording2, (ArrayList) duetOwnerActivity.mo13969R().f32034q.m421d()));
        intentM14397a.setFlags(67108864);
        duetOwnerActivity.m13971T(intentM14397a);
        return Unit.f29502a;
    }
}
