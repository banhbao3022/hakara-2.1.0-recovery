package p555j.p556a.p557a.p558a.p559a.p572h;

import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Notification;
import p000.C7393p0;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.ItemNotificationBinding;
import p636z0.p774z.p775b.DiffUtil;

/* JADX INFO: renamed from: j.a.a.a.a.h.a, reason: use source file name */
/* JADX INFO: compiled from: NotificationAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationAdapter extends BaseListAdapter<Notification, ItemNotificationBinding> {

    /* JADX INFO: renamed from: f */
    public int f31355f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6164l<Notification, Unit> f31356g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC6164l<Notification, Unit> f31357h;

    /* JADX INFO: renamed from: j.a.a.a.a.h.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements InterfaceC6164l<Notification, Unit> {

        /* JADX INFO: renamed from: g */
        public static final a f31358g = new a(0);

        /* JADX INFO: renamed from: h */
        public static final a f31359h = new a(1);

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f31360i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(1);
            this.f31360i = i;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(Notification notification) {
            int i = this.f31360i;
            if (i == 0) {
                Intrinsics2.m13089e(notification, "it");
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            Intrinsics2.m13089e(notification, "it");
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.h.a$b */
    /* JADX INFO: compiled from: NotificationAdapter.kt */
    public static final class b extends DiffUtil.e<Notification> {
        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: a */
        public boolean mo13878a(Notification notification, Notification notification2) {
            Notification notification3 = notification;
            Notification notification4 = notification2;
            Intrinsics2.m13089e(notification3, "oldItem");
            Intrinsics2.m13089e(notification4, "newItem");
            return Intrinsics2.m13085a(notification3, notification4);
        }

        @Override // p636z0.p774z.p775b.DiffUtil.e
        /* JADX INFO: renamed from: b */
        public boolean mo13879b(Notification notification, Notification notification2) {
            Notification notification3 = notification;
            Notification notification4 = notification2;
            Intrinsics2.m13089e(notification3, "oldItem");
            Intrinsics2.m13089e(notification4, "newItem");
            return notification3.getId() == notification4.getId();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NotificationAdapter(InterfaceC6164l interfaceC6164l, InterfaceC6164l interfaceC6164l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? a.f31358g : interfaceC6164l, (i & 2) != 0 ? a.f31359h : interfaceC6164l2);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter2
    /* JADX INFO: renamed from: c */
    public int mo13876c(int i) {
        return R.layout.item_notification;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseListAdapter
    /* JADX INFO: renamed from: n */
    public void mo13890n(ViewDataBinding viewDataBinding) {
        ItemNotificationBinding itemNotificationBinding = (ItemNotificationBinding) viewDataBinding;
        Intrinsics2.m13089e(itemNotificationBinding, "binding");
        LinearLayout linearLayout = itemNotificationBinding.f32675w;
        Intrinsics2.m13088d(linearLayout, "rootView");
        SkuDao.a.m14067S(linearLayout, new C7393p0(0, itemNotificationBinding, this));
        ImageView imageView = itemNotificationBinding.f32672t;
        Intrinsics2.m13088d(imageView, "btnMore");
        SkuDao.a.m14067S(imageView, new C7393p0(1, itemNotificationBinding, this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NotificationAdapter(InterfaceC6164l<? super Notification, Unit> interfaceC6164l, InterfaceC6164l<? super Notification, Unit> interfaceC6164l2) {
        super(new b());
        Intrinsics2.m13089e(interfaceC6164l, "itemClickListener");
        Intrinsics2.m13089e(interfaceC6164l2, "moreButtonClickListener");
        this.f31356g = interfaceC6164l;
        this.f31357h = interfaceC6164l2;
        this.f31355f = -1;
    }
}
