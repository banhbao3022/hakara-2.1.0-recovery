package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import java.util.ArrayList;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p290d.p291r.C2422a;
import p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2512x;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.d0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2451d0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MediaNotificationService f11227a;

    public C2451d0(MediaNotificationService mediaNotificationService) {
        this.f11227a = mediaNotificationService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean zMo5108G;
        PendingIntent activities;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        C2422a c2422a = this.f11227a.f28616u;
        Objects.requireNonNull(c2422a);
        C2622l.m5354d("Must be called from the main thread.");
        try {
            zMo5108G = c2422a.f11144d.mo5108G();
        } catch (RemoteException e) {
            C2422a.f11141a.m5120b(e, "Unable to call %s on %s.", "hasActivityInRecents", InterfaceC2512x.class.getSimpleName());
            zMo5108G = false;
        }
        if (zMo5108G) {
            intent2.setFlags(603979776);
            activities = PendingIntent.getActivity(context, 1, intent2, 134217728);
        } else {
            MediaNotificationService mediaNotificationService = this.f11227a;
            ArrayList arrayList = new ArrayList();
            int size = arrayList.size();
            try {
                for (Intent intentM16081z = C8162a.m16081z(mediaNotificationService, componentName); intentM16081z != null; intentM16081z = C8162a.m16081z(mediaNotificationService, intentM16081z.getComponent())) {
                    arrayList.add(size, intentM16081z);
                }
                arrayList.add(intent2);
                if (arrayList.isEmpty()) {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(mediaNotificationService, 1, intentArr, 134217728, null);
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                throw new IllegalArgumentException(e2);
            }
        }
        try {
            activities.send(context, 1, new Intent().setFlags(268435456));
        } catch (PendingIntent.CanceledException e3) {
            MediaNotificationService.f28601f.m5120b(e3, "Sending PendingIntent failed", new Object[0]);
        }
    }
}
