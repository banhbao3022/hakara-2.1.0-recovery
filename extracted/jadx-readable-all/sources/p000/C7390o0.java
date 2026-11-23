package p000;

import mtp.media.karaoke.data.model.Task;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p573i.p577f0.TaskAdapter;
import p555j.p556a.p557a.p616i.ItemTaskBinding;

/* JADX INFO: renamed from: o0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7390o0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34064g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34065h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34066i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7390o0(int i, Object obj, Object obj2) {
        super(0);
        this.f34064g = i;
        this.f34065h = obj;
        this.f34066i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34064g;
        if (i == 0) {
            Task task = ((ItemTaskBinding) this.f34065h).f32454x;
            if (task != null) {
                InterfaceC6164l<Task, Unit> interfaceC6164l = ((TaskAdapter) this.f34066i).f31451g;
                Intrinsics2.m13088d(task, "this");
                interfaceC6164l.mo3b(task);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Task task2 = ((ItemTaskBinding) this.f34065h).f32454x;
        if (task2 != null) {
            InterfaceC6164l<Task, Unit> interfaceC6164l2 = ((TaskAdapter) this.f34066i).f31451g;
            Intrinsics2.m13088d(task2, "this");
            interfaceC6164l2.mo3b(task2);
        }
        return Unit.f29502a;
    }
}
