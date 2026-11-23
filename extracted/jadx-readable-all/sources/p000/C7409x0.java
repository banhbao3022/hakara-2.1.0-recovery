package p000;

import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p573i.p574a.DraftAdapter;
import p555j.p556a.p557a.p606h.p609c.p611b.RecordingEntity;
import p555j.p556a.p557a.p616i.ItemDraftBinding;

/* JADX INFO: renamed from: x0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7409x0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34142g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34143h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34144i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7409x0(int i, Object obj, Object obj2) {
        super(0);
        this.f34142g = i;
        this.f34143h = obj;
        this.f34144i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34142g;
        if (i == 0) {
            RecordingEntity recordingEntity = ((ItemDraftBinding) this.f34143h).f32811x;
            if (recordingEntity != null) {
                InterfaceC6164l<RecordingEntity, Unit> interfaceC6164l = ((DraftAdapter) this.f34144i).f31380f;
                Intrinsics2.m13088d(recordingEntity, "this");
                interfaceC6164l.mo3b(recordingEntity);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        RecordingEntity recordingEntity2 = ((ItemDraftBinding) this.f34143h).f32811x;
        if (recordingEntity2 != null) {
            InterfaceC6164l<RecordingEntity, Unit> interfaceC6164l2 = ((DraftAdapter) this.f34144i).f31381g;
            Intrinsics2.m13088d(recordingEntity2, "this");
            interfaceC6164l2.mo3b(recordingEntity2);
        }
        return Unit.f29502a;
    }
}
