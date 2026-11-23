package p555j.p556a.p557a.p558a.p559a.p573i.p574a;

import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;

/* JADX INFO: renamed from: j.a.a.a.a.i.a.c, reason: use source file name */
/* JADX INFO: compiled from: DraftFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DraftFragment2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DraftFragment f31394g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ RecordingEntity f31395h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ BottomSheetDialog f31396i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftFragment2(DraftFragment draftFragment, RecordingEntity recordingEntity, BottomSheetDialog bottomSheetDialog) {
        super(0);
        this.f31394g = draftFragment;
        this.f31395h = recordingEntity;
        this.f31396i = bottomSheetDialog;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        DraftFragment.m13915g1(this.f31394g, this.f31395h);
        this.f31396i.dismiss();
        return Unit.f29502a;
    }
}
