package p636z0.p709j0.p710y.p711p.p713b;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.SystemIdInfo;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao_Impl;
import p636z0.p709j0.p710y.p720t.IdGenerator;

/* JADX INFO: renamed from: z0.j0.y.p.b.a, reason: use source file name */
/* JADX INFO: compiled from: Alarms.java */
/* JADX INFO: loaded from: classes.dex */
public class Alarms {

    /* JADX INFO: renamed from: a */
    public static final String f37398a = Logger9.m15886e("Alarms");

    /* JADX INFO: renamed from: a */
    public static void m15929a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, CommandHandler.m15933b(context, str), 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger9.m15885c().mo15887a(f37398a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* JADX INFO: renamed from: b */
    public static void m15930b(Context context, WorkManagerImpl workManagerImpl, String str, long j2) {
        int iM16006a;
        WorkDatabase workDatabase = workManagerImpl.f37342g;
        SystemIdInfoDao_Impl systemIdInfoDao_Impl = (SystemIdInfoDao_Impl) workDatabase.mo943r();
        SystemIdInfo systemIdInfoM15975a = systemIdInfoDao_Impl.m15975a(str);
        if (systemIdInfoM15975a != null) {
            m15929a(context, str, systemIdInfoM15975a.f37510b);
            m15931c(context, str, systemIdInfoM15975a.f37510b, j2);
            return;
        }
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        synchronized (IdGenerator.class) {
            iM16006a = idGenerator.m16006a("next_alarm_manager_id");
        }
        systemIdInfoDao_Impl.m15976b(new SystemIdInfo(str, iM16006a));
        m15931c(context, str, iM16006a, j2);
    }

    /* JADX INFO: renamed from: c */
    public static void m15931c(Context context, String str, int i, long j2) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, CommandHandler.m15933b(context, str), 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j2, service);
        }
    }
}
