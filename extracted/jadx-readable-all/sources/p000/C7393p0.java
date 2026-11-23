package p000;

import mtp.media.karaoke.data.model.Notification;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p572h.NotificationAdapter;
import p555j.p556a.p557a.p616i.ItemNotificationBinding;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes2.dex */
public final class C7393p0 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f34080g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f34081h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f34082i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7393p0(int i, Object obj, Object obj2) {
        super(0);
        this.f34080g = i;
        this.f34081h = obj;
        this.f34082i = obj2;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public final Unit mo2c() {
        int i = this.f34080g;
        if (i == 0) {
            Notification notification = ((ItemNotificationBinding) this.f34081h).f32677y;
            if (notification != null) {
                InterfaceC6164l<Notification, Unit> interfaceC6164l = ((NotificationAdapter) this.f34082i).f31356g;
                Intrinsics2.m13088d(notification, "this");
                interfaceC6164l.mo3b(notification);
                ((ItemNotificationBinding) this.f34081h).f32675w.setBackgroundColor(((NotificationAdapter) this.f34082i).f31355f);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Notification notification2 = ((ItemNotificationBinding) this.f34081h).f32677y;
        if (notification2 != null) {
            InterfaceC6164l<Notification, Unit> interfaceC6164l2 = ((NotificationAdapter) this.f34082i).f31357h;
            Intrinsics2.m13088d(notification2, "this");
            interfaceC6164l2.mo3b(notification2);
            ((ItemNotificationBinding) this.f34081h).f32675w.setBackgroundColor(((NotificationAdapter) this.f34082i).f31355f);
        }
        return Unit.f29502a;
    }
}
