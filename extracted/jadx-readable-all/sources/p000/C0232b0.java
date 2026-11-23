package p000;

import mtp.media.karaoke.data.model.Recording;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p563d.p566f.DuetTrendingAdapter;
import p555j.p556a.p557a.p616i.ItemDuetTrendingBinding;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C0232b0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1422g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1423h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0232b0(int i, Object obj, Object obj2) {
        super(0);
        this.f1422g = i;
        this.f1423h = obj;
        this.f1424i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f1422g;
        if (i == 0) {
            Recording recording = ((ItemDuetTrendingBinding) this.f1423h).f32953x;
            if (recording != null) {
                InterfaceC6164l<Recording, Unit> interfaceC6164l = ((DuetTrendingAdapter) this.f1424i).f31177f;
                Intrinsics2.m13088d(recording, "this");
                interfaceC6164l.mo3b(recording);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Recording recording2 = ((ItemDuetTrendingBinding) this.f1423h).f32953x;
        if (recording2 != null) {
            InterfaceC6164l<Recording, Unit> interfaceC6164l2 = ((DuetTrendingAdapter) this.f1424i).f31177f;
            Intrinsics2.m13088d(recording2, "this");
            interfaceC6164l2.mo3b(recording2);
        }
        return Unit.f29502a;
    }
}
