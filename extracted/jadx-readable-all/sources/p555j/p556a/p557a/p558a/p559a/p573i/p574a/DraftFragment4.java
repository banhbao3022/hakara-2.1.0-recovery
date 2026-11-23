package p555j.p556a.p557a.p558a.p559a.p573i.p574a;

import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;

/* JADX INFO: renamed from: j.a.a.a.a.i.a.e, reason: use source file name */
/* JADX INFO: compiled from: DraftFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DraftFragment4 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DraftFragment f31398g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BottomSheetDialog f31399h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ RecordingEntity f31400i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftFragment4(DraftFragment draftFragment, BottomSheetDialog bottomSheetDialog, RecordingEntity recordingEntity) {
        super(0);
        this.f31398g = draftFragment;
        this.f31399h = bottomSheetDialog;
        this.f31400i = recordingEntity;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        this.f31399h.dismiss();
        SkuDao.a.m14069U(this.f31398g.m16526F0(), this.f31398g.m16546Q(R.string.text_delete_recording), this.f31398g.m16546Q(R.string.text_delete_recording_description), this.f31398g.m16546Q(R.string.text_yes), new DraftFragment3(this), this.f31398g.m16546Q(R.string.text_no), null, false, false, 96);
        return Unit.f29502a;
    }
}
