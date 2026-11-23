package p636z0.p725k.p726c;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

/* JADX INFO: renamed from: z0.k.c.t, reason: use source file name */
/* JADX INFO: compiled from: NotificationManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class NotificationManagerCompat {

    /* JADX INFO: renamed from: a */
    public final Context f37787a;

    /* JADX INFO: renamed from: b */
    public final NotificationManager f37788b;

    static {
        new HashSet();
    }

    public NotificationManagerCompat(Context context) {
        this.f37787a = context;
        this.f37788b = (NotificationManager) context.getSystemService("notification");
    }

    /* JADX INFO: renamed from: a */
    public boolean m16128a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f37788b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f37787a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f37787a.getApplicationInfo();
        String packageName = this.f37787a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
