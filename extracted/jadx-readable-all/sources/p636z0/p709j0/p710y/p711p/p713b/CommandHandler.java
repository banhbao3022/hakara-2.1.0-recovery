package p636z0.p709j0.p710y.p711p.p713b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p636z0.p709j0.Constraints2;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.NetworkType;
import p636z0.p709j0.p710y.ExecutionListener;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.SystemIdInfo;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.p.b.b, reason: use source file name */
/* JADX INFO: compiled from: CommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CommandHandler implements ExecutionListener {

    /* JADX INFO: renamed from: f */
    public static final String f37399f = Logger9.m15886e("CommandHandler");

    /* JADX INFO: renamed from: g */
    public final Context f37400g;

    /* JADX INFO: renamed from: h */
    public final Map<String, ExecutionListener> f37401h = new HashMap();

    /* JADX INFO: renamed from: i */
    public final Object f37402i = new Object();

    public CommandHandler(Context context) {
        this.f37400g = context;
    }

    /* JADX INFO: renamed from: a */
    public static Intent m15932a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: renamed from: b */
    public static Intent m15933b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m15934c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // p636z0.p709j0.p710y.ExecutionListener
    /* JADX INFO: renamed from: d */
    public void mo960d(String str, boolean z) {
        synchronized (this.f37402i) {
            ExecutionListener executionListenerRemove = this.f37401h.remove(str);
            if (executionListenerRemove != null) {
                executionListenerRemove.mo960d(str, z);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15935e(Intent intent, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        boolean z;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger9.m15885c().mo15887a(f37399f, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            Context context = this.f37400g;
            ConstraintsCommandHandler constraintsCommandHandler = new ConstraintsCommandHandler(context, i, systemAlarmDispatcher);
            List<WorkSpec> listM15988f = ((WorkSpecDao_Impl) systemAlarmDispatcher.f37423k.f37342g.mo946u()).m15988f();
            String str = ConstraintProxy.f1384a;
            ArrayList<WorkSpec> arrayList = (ArrayList) listM15988f;
            Iterator it = arrayList.iterator();
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            while (it.hasNext()) {
                Constraints2 constraints2 = ((WorkSpec) it.next()).f37533j;
                z2 |= constraints2.f37246e;
                z3 |= constraints2.f37244c;
                z4 |= constraints2.f37247f;
                z5 |= constraints2.f37243b != NetworkType.NOT_REQUIRED;
                if (z2 && z3 && z4 && z5) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f1385a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z2).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z3).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z5);
            context.sendBroadcast(intent2);
            constraintsCommandHandler.f37407e.m15951b(listM15988f);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (WorkSpec workSpec : arrayList) {
                String str3 = workSpec.f37524a;
                if (jCurrentTimeMillis >= workSpec.m15980a() && (!workSpec.m15981b() || constraintsCommandHandler.f37407e.m15950a(str3))) {
                    arrayList2.add(workSpec);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str4 = ((WorkSpec) it2.next()).f37524a;
                Intent intentM15933b = m15933b(constraintsCommandHandler.f37404b, str4);
                Logger9.m15885c().mo15887a(ConstraintsCommandHandler.f37403a, String.format("Creating a delay_met command for workSpec with id (%s)", str4), new Throwable[0]);
                SystemAlarmDispatcher systemAlarmDispatcher2 = constraintsCommandHandler.f37406d;
                systemAlarmDispatcher2.f37425m.post(new SystemAlarmDispatcher.b(systemAlarmDispatcher2, intentM15933b, constraintsCommandHandler.f37405c));
            }
            constraintsCommandHandler.f37407e.m15952c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger9.m15885c().mo15887a(f37399f, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            systemAlarmDispatcher.f37423k.m15917e();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty()) {
            z = false;
            break;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 1) {
                z = true;
                break;
            } else {
                if (extras.get(strArr[i2]) == null) {
                    z = false;
                    break;
                }
                i2++;
            }
        }
        if (!z) {
            Logger9.m15885c().mo15888b(f37399f, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
            Logger9 logger9M15885c = Logger9.m15885c();
            String str5 = f37399f;
            logger9M15885c.mo15887a(str5, String.format("Handling schedule work for %s", string), new Throwable[0]);
            WorkDatabase workDatabase = systemAlarmDispatcher.f37423k.f37342g;
            workDatabase.m14529c();
            try {
                WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) workDatabase.mo946u()).m15992j(string);
                if (workSpecM15992j == null) {
                    Logger9.m15885c().mo15891g(str5, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                } else if (workSpecM15992j.f37525b.m15892f()) {
                    Logger9.m15885c().mo15891g(str5, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                } else {
                    long jM15980a = workSpecM15992j.m15980a();
                    if (workSpecM15992j.m15981b()) {
                        Logger9.m15885c().mo15887a(str5, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jM15980a)), new Throwable[0]);
                        Alarms.m15930b(this.f37400g, systemAlarmDispatcher.f37423k, string, jM15980a);
                        systemAlarmDispatcher.f37425m.post(new SystemAlarmDispatcher.b(systemAlarmDispatcher, m15932a(this.f37400g), i));
                    } else {
                        Logger9.m15885c().mo15887a(str5, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jM15980a)), new Throwable[0]);
                        Alarms.m15930b(this.f37400g, systemAlarmDispatcher.f37423k, string, jM15980a);
                    }
                    workDatabase.m14537n();
                }
                return;
            } finally {
                workDatabase.m14530f();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            Bundle extras2 = intent.getExtras();
            synchronized (this.f37402i) {
                String string2 = extras2.getString("KEY_WORKSPEC_ID");
                Logger9 logger9M15885c2 = Logger9.m15885c();
                String str6 = f37399f;
                logger9M15885c2.mo15887a(str6, String.format("Handing delay met for %s", string2), new Throwable[0]);
                if (this.f37401h.containsKey(string2)) {
                    Logger9.m15885c().mo15887a(str6, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string2), new Throwable[0]);
                } else {
                    DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.f37400g, i, string2, systemAlarmDispatcher);
                    this.f37401h.put(string2, delayMetCommandHandler);
                    delayMetCommandHandler.m15938e();
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                Logger9.m15885c().mo15891g(f37399f, String.format("Ignoring intent %s", intent), new Throwable[0]);
                return;
            }
            Bundle extras3 = intent.getExtras();
            String string3 = extras3.getString("KEY_WORKSPEC_ID");
            boolean z6 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
            Logger9.m15885c().mo15887a(f37399f, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            mo960d(string3, z6);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        Logger9.m15885c().mo15887a(f37399f, String.format("Handing stopWork work for %s", string4), new Throwable[0]);
        systemAlarmDispatcher.f37423k.m15918f(string4);
        Context context2 = this.f37400g;
        WorkManagerImpl workManagerImpl = systemAlarmDispatcher.f37423k;
        String str7 = Alarms.f37398a;
        SystemIdInfoDao_Impl systemIdInfoDao_Impl = (SystemIdInfoDao_Impl) workManagerImpl.f37342g.mo943r();
        SystemIdInfo systemIdInfoM15975a = systemIdInfoDao_Impl.m15975a(string4);
        if (systemIdInfoM15975a != null) {
            Alarms.m15929a(context2, string4, systemIdInfoM15975a.f37510b);
            Logger9.m15885c().mo15887a(Alarms.f37398a, String.format("Removing SystemIdInfo for workSpecId (%s)", string4), new Throwable[0]);
            systemIdInfoDao_Impl.m15977c(string4);
        }
        systemAlarmDispatcher.mo960d(string4, false);
    }
}
