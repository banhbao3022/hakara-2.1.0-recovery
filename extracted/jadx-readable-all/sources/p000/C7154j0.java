package p000;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.notification.NotificationFragment;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p572h.NotificationFragment2;
import p555j.p556a.p557a.p558a.p559a.p572h.NotificationViewModel2;
import p555j.p556a.p557a.p558a.p559a.p572h.NotificationViewModel3;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: j0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C7154j0 extends Lambda implements InterfaceC6164l<Notification, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f33096g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f33097h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7154j0(int i, Object obj) {
        super(1);
        this.f33096g = i;
        this.f33097h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(Notification notification) {
        int i = this.f33096g;
        if (i == 0) {
            Notification notification2 = notification;
            Intrinsics2.m13089e(notification2, "it");
            NotificationFragment notificationFragment = NotificationFragment.this;
            int i2 = NotificationFragment.f33631f0;
            Objects.requireNonNull(notificationFragment);
            if (notification2.isRead() == 0) {
                notification2.setRead(1);
                NotificationViewModel2 notificationViewModel2Mo13882Z0 = notificationFragment.mo13882Z0();
                int id = notification2.getId();
                Objects.requireNonNull(notificationViewModel2Mo13882Z0);
                C5729a.m12428A(C8310a.m16440e(notificationViewModel2Mo13882Z0), null, 0, new NotificationViewModel3(notificationViewModel2Mo13882Z0, 1, 2, id, null), 3, null);
            }
            FragmentActivity fragmentActivityM16526F0 = notificationFragment.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            Intent intentM14108u = SkuDao.a.m14108u(fragmentActivityM16526F0, notification2.getType(), notification2.getContentId(), notification2.getSubContentId());
            if (intentM14108u != null) {
                notificationFragment.m13976b1(intentM14108u);
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        Notification notification3 = notification;
        Intrinsics2.m13089e(notification3, "it");
        NotificationFragment notificationFragment2 = NotificationFragment.this;
        int i3 = NotificationFragment.f33631f0;
        View viewInflate = notificationFragment2.m16524E().inflate(R.layout.bottom_sheet_notification, (ViewGroup) null);
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(notificationFragment2.m16528G0(), R.style.AppBottomSheetDialogTheme);
        bottomSheetDialog.setContentView(viewInflate);
        bottomSheetDialog.show();
        Intrinsics2.m13088d(viewInflate, "view");
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.avatar);
        Intrinsics2.m13088d(imageView, "view.avatar");
        User sender = notification3.getSender();
        SkuDao.a.m14054F(imageView, sender != null ? sender.getAvatar() : null, null, null, null, null, false, false, true, 0, false, null, null, null, 8062);
        TextView textView = (TextView) viewInflate.findViewById(R.id.message);
        Intrinsics2.m13088d(textView, "view.message");
        textView.setText(notification3.getMessage());
        User sender2 = notification3.getSender();
        if (sender2 != null) {
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.message);
            Intrinsics2.m13088d(textView2, "view.message");
            textView2.setText(sender2.getFullName() + ' ' + notification3.getMessage());
        }
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.menuDelete);
        Intrinsics2.m13088d(linearLayout, "view.menuDelete");
        SkuDao.a.m14067S(linearLayout, new NotificationFragment2(notificationFragment2, bottomSheetDialog, notification3));
        return Unit.f29502a;
    }
}
