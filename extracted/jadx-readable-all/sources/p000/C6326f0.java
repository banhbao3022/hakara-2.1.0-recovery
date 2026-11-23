package p000;

import mtp.media.karaoke.data.model.Recording;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p567e.p568b.RecordingRankingAdapter;
import p555j.p556a.p557a.p616i.ItemRecordingRankingBinding;

/* JADX INFO: renamed from: f0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6326f0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f29827g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f29828h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f29829i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6326f0(int i, Object obj, Object obj2) {
        super(0);
        this.f29827g = i;
        this.f29828h = obj;
        this.f29829i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f29827g;
        if (i == 0) {
            Recording recording = ((ItemRecordingRankingBinding) this.f29828h).f32884y;
            if (recording != null) {
                InterfaceC6164l<Recording, Unit> interfaceC6164l = ((RecordingRankingAdapter) this.f29829i).f31202f;
                Intrinsics2.m13088d(recording, "this");
                interfaceC6164l.mo3b(recording);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Recording recording2 = ((ItemRecordingRankingBinding) this.f29828h).f32884y;
        if (recording2 != null) {
            InterfaceC6164l<Recording, Unit> interfaceC6164l2 = ((RecordingRankingAdapter) this.f29829i).f31203g;
            Intrinsics2.m13088d(recording2, "this");
            interfaceC6164l2.mo3b(recording2);
        }
        return Unit.f29502a;
    }
}
