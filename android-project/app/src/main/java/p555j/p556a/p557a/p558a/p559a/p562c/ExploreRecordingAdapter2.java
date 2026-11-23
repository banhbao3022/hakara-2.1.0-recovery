package p555j.p556a.p557a.p558a.p559a.p562c;

import mtp.media.karaoke.data.model.Recording;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p616i.ItemRecordingTrendingBinding;

/* JADX INFO: renamed from: j.a.a.a.a.c.g, reason: use source file name */
/* JADX INFO: compiled from: ExploreRecordingAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreRecordingAdapter2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ItemRecordingTrendingBinding f31116g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ExploreRecordingAdapter f31117h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreRecordingAdapter2(ItemRecordingTrendingBinding itemRecordingTrendingBinding, ExploreRecordingAdapter exploreRecordingAdapter) {
        super(0);
        this.f31116g = itemRecordingTrendingBinding;
        this.f31117h = exploreRecordingAdapter;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        Recording recording = this.f31116g.f32917y;
        if (recording != null) {
            InterfaceC6164l<Recording, Unit> interfaceC6164l = this.f31117h.f31114h;
            Intrinsics2.m13088d(recording, "this");
            interfaceC6164l.mo3b(recording);
        }
        return Unit.f29502a;
    }
}
