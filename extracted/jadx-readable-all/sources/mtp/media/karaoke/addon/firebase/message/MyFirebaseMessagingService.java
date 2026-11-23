package mtp.media.karaoke.addon.firebase.message;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Map;
import java.util.Objects;
import mtp.media.karaoke.MainActivity;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Notification;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p428w.C5555t;
import p007c.p190n.p385d.p428w.C5556u;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p725k.p726c.C8176m;

/* JADX INFO: compiled from: MyFirebaseMessagingService.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: g */
    public void mo12933g(C5556u c5556u) {
        Intrinsics2.m13089e(c5556u, "remoteMessage");
        Intrinsics2.m13089e("From: " + c5556u.f27290f.getString("from"), "message");
        Map<String, String> mapM12204H = c5556u.m12204H();
        Intrinsics2.m13088d(mapM12204H, "remoteMessage.data");
        if (!mapM12204H.isEmpty()) {
            StringBuilder sbM1556G = outline.m1556G("Message data payload: ");
            sbM1556G.append(c5556u.m12204H());
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
        }
        Notification notification = null;
        if (c5556u.f27292h == null && C5555t.m12190l(c5556u.f27290f)) {
            c5556u.f27292h = new C5556u.b(new C5555t(c5556u.f27290f), null);
        }
        C5556u.b bVar = c5556u.f27292h;
        if (bVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Message Notification Body: ");
            Intrinsics2.m13088d(bVar, "it");
            sb.append(bVar.f27293a);
            Intrinsics2.m13089e(sb.toString(), "message");
            String strValueOf = String.valueOf(bVar.f27293a);
            Map<String, String> mapM12204H2 = c5556u.m12204H();
            Intrinsics2.m13089e("sendNotification", "message");
            String string = getString(R.string.message_notification_channel);
            Intrinsics2.m13088d(string, "getString(R.string.message_notification_channel)");
            if (mapM12204H2 != null) {
                String strValueOf2 = String.valueOf(mapM12204H2.get("type"));
                String str = mapM12204H2.get("content_id");
                int i = str != null ? Integer.parseInt(str) : 0;
                String str2 = mapM12204H2.get("sub_content_id");
                Notification notification2 = new Notification(0, 0, null, strValueOf2, null, i, str2 != null ? Integer.valueOf(Integer.parseInt(str2)) : null, null, "", null, 0, null, null, null, 14996, null);
                String str3 = mapM12204H2.get(CainMediaMetadataRetriever.METADATA_KEY_TITLE);
                if (str3 != null) {
                    string = str3;
                }
                Intrinsics2.m13089e(mapM12204H2.toString(), "message");
                notification = notification2;
            }
            Intent intentM14330a = MainActivity.f33373w.m14330a(this, notification);
            intentM14330a.addFlags(67108864);
            PendingIntent activity = PendingIntent.getActivity(this, 0, intentM14330a, 1073741824);
            String string2 = getString(R.string.message_notification_channel);
            Intrinsics2.m13088d(string2, "getString(R.string.message_notification_channel)");
            Uri defaultUri = RingtoneManager.getDefaultUri(2);
            C8176m c8176m = new C8176m(this, string2);
            c8176m.f37736N.icon = R.drawable.ic_app_notification;
            c8176m.m16109f(string);
            c8176m.m16108e(strValueOf);
            c8176m.m16110g(16, false);
            c8176m.m16113j(defaultUri);
            c8176m.f37726D = getResources().getColor(R.color.header_color);
            c8176m.f37745g = activity;
            Intrinsics2.m13088d(c8176m, "NotificationCompat.Build…tentIntent(pendingIntent)");
            Object systemService = getSystemService("notification");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                notificationManager.createNotificationChannel(new NotificationChannel(string2, getString(R.string.message_notification_channel), 3));
            }
            notificationManager.notify(0, c8176m.m16106b());
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /* JADX INFO: renamed from: i */
    public void mo12935i(String str) {
        Intrinsics2.m13089e(str, "token");
        Intrinsics2.m13089e("Refreshed token: " + str, "message");
        Intrinsics2.m13089e("sendRegistrationTokenToServer(" + str + ')', "message");
    }
}
