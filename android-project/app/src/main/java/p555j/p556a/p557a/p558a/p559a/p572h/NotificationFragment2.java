package p555j.p556a.p557a.p558a.p559a.p572h;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.p628ui.screen.notification.NotificationFragment;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j.a.a.a.a.h.b, reason: use source file name */
/* JADX INFO: compiled from: NotificationFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationFragment2 extends Lambda implements InterfaceC6153a<Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NotificationFragment f31361g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BottomSheetDialog f31362h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Notification f31363i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationFragment2(NotificationFragment notificationFragment, BottomSheetDialog bottomSheetDialog, Notification notification) {
        super(0);
        this.f31361g = notificationFragment;
        this.f31362h = bottomSheetDialog;
        this.f31363i = notification;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6153a
    /* JADX INFO: renamed from: c */
    public Unit mo2c() {
        this.f31362h.dismiss();
        NotificationViewModel2 notificationViewModel2Mo13882Z0 = this.f31361g.mo13882Z0();
        int id = this.f31363i.getId();
        Objects.requireNonNull(notificationViewModel2Mo13882Z0);
        C5729a.m12428A(C8310a.m16440e(notificationViewModel2Mo13882Z0), null, 0, new NotificationViewModel(notificationViewModel2Mo13882Z0, id, null), 3, null);
        ArrayList arrayList = (ArrayList) this.f31361g.mo13882Z0().f32034q.m421d();
        if (arrayList != null) {
            arrayList.remove(this.f31363i);
        }
        this.f31361g.mo13892e1().m13977p((List) this.f31361g.mo13882Z0().f32034q.m421d());
        FragmentActivity fragmentActivityM16562f = this.f31361g.m16562f();
        if (fragmentActivityM16562f != null) {
            SkuDao.a.m14092i0(fragmentActivityM16562f, R.string.message_delete_success, 0, 2);
        }
        return Unit.f29502a;
    }
}
