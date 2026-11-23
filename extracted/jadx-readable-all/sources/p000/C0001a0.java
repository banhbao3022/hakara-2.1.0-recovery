package p000;

import mtp.media.karaoke.data.model.Recording;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p563d.p564a.DuetInviteAdapter;
import p555j.p556a.p557a.p616i.ItemDuetInviteBinding;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C0001a0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f0g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f1h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0001a0(int i, Object obj, Object obj2) {
        super(0);
        this.f0g = i;
        this.f1h = obj;
        this.f2i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f0g;
        if (i == 0) {
            Recording recording = ((ItemDuetInviteBinding) this.f1h).f32871D;
            if (recording != null) {
                InterfaceC6164l<Recording, Unit> interfaceC6164l = ((DuetInviteAdapter) this.f2i).f31143f;
                Intrinsics2.m13088d(recording, "this");
                interfaceC6164l.mo3b(recording);
            }
            return Unit.f29502a;
        }
        if (i == 1) {
            Recording recording2 = ((ItemDuetInviteBinding) this.f1h).f32871D;
            if (recording2 != null) {
                InterfaceC6164l<Recording, Unit> interfaceC6164l2 = ((DuetInviteAdapter) this.f2i).f31144g;
                Intrinsics2.m13088d(recording2, "this");
                interfaceC6164l2.mo3b(recording2);
            }
            return Unit.f29502a;
        }
        if (i != 2) {
            throw null;
        }
        Recording recording3 = ((ItemDuetInviteBinding) this.f1h).f32871D;
        if (recording3 != null) {
            InterfaceC6164l<Recording, Unit> interfaceC6164l3 = ((DuetInviteAdapter) this.f2i).f31145h;
            Intrinsics2.m13088d(recording3, "this");
            interfaceC6164l3.mo3b(recording3);
        }
        return Unit.f29502a;
    }
}
