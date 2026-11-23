package p636z0.p709j0.p710y.p718r;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p636z0.p709j0.ForegroundInfo;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.ExecutionListener;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p715q.WorkConstraintsCallback;
import p636z0.p709j0.p710y.p715q.WorkConstraintsTracker;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p720t.StopWorkRunnable;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: renamed from: z0.j0.y.r.c, reason: use source file name */
/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundDispatcher2 implements WorkConstraintsCallback, ExecutionListener {

    /* JADX INFO: renamed from: f */
    public static final String f37485f = Logger9.m15886e("SystemFgDispatcher");

    /* JADX INFO: renamed from: g */
    public Context f37486g;

    /* JADX INFO: renamed from: h */
    public WorkManagerImpl f37487h;

    /* JADX INFO: renamed from: i */
    public final TaskExecutor2 f37488i;

    /* JADX INFO: renamed from: j */
    public final Object f37489j = new Object();

    /* JADX INFO: renamed from: k */
    public String f37490k;

    /* JADX INFO: renamed from: l */
    public final Map<String, ForegroundInfo> f37491l;

    /* JADX INFO: renamed from: m */
    public final Map<String, WorkSpec> f37492m;

    /* JADX INFO: renamed from: n */
    public final Set<WorkSpec> f37493n;

    /* JADX INFO: renamed from: o */
    public final WorkConstraintsTracker f37494o;

    /* JADX INFO: renamed from: p */
    public a f37495p;

    /* JADX INFO: renamed from: z0.j0.y.r.c$a */
    /* JADX INFO: compiled from: SystemForegroundDispatcher.java */
    public interface a {
    }

    public SystemForegroundDispatcher2(Context context) {
        this.f37486g = context;
        WorkManagerImpl workManagerImplM15914b = WorkManagerImpl.m15914b(this.f37486g);
        this.f37487h = workManagerImplM15914b;
        TaskExecutor2 taskExecutor2 = workManagerImplM15914b.f37343h;
        this.f37488i = taskExecutor2;
        this.f37490k = null;
        this.f37491l = new LinkedHashMap();
        this.f37493n = new HashSet();
        this.f37492m = new HashMap();
        this.f37494o = new WorkConstraintsTracker(this.f37486g, taskExecutor2, this);
        this.f37487h.f37345j.m15900a(this);
    }

    /* JADX INFO: renamed from: a */
    public static Intent m15967a(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.f37267a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.f37268b);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.f37269c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m15968c(Context context, String str, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.f37267a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.f37268b);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.f37269c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: b */
    public void mo967b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            Logger9.m15885c().mo15887a(f37485f, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            WorkManagerImpl workManagerImpl = this.f37487h;
            ((WorkManagerTaskExecutor) workManagerImpl.f37343h).f37639a.execute(new StopWorkRunnable(workManagerImpl, str, true));
        }
    }

    @Override // p636z0.p709j0.p710y.ExecutionListener
    /* JADX INFO: renamed from: d */
    public void mo960d(String str, boolean z) {
        Map.Entry<String, ForegroundInfo> entry;
        synchronized (this.f37489j) {
            WorkSpec workSpecRemove = this.f37492m.remove(str);
            if (workSpecRemove != null ? this.f37493n.remove(workSpecRemove) : false) {
                this.f37494o.m15951b(this.f37493n);
            }
        }
        ForegroundInfo foregroundInfoRemove = this.f37491l.remove(str);
        if (str.equals(this.f37490k) && this.f37491l.size() > 0) {
            Iterator<Map.Entry<String, ForegroundInfo>> it = this.f37491l.entrySet().iterator();
            Map.Entry<String, ForegroundInfo> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f37490k = entry.getKey();
            if (this.f37495p != null) {
                ForegroundInfo value = entry.getValue();
                ((SystemForegroundService) this.f37495p).m962c(value.f37267a, value.f37268b, value.f37269c);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f37495p;
                systemForegroundService.f1398h.post(new SystemForegroundService3(systemForegroundService, value.f37267a));
            }
        }
        a aVar = this.f37495p;
        if (foregroundInfoRemove == null || aVar == null) {
            return;
        }
        Logger9.m15885c().mo15887a(f37485f, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(foregroundInfoRemove.f37267a), str, Integer.valueOf(foregroundInfoRemove.f37268b)), new Throwable[0]);
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) aVar;
        systemForegroundService2.f1398h.post(new SystemForegroundService3(systemForegroundService2, foregroundInfoRemove.f37267a));
    }

    /* JADX INFO: renamed from: e */
    public final void m15969e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger9.m15885c().mo15887a(f37485f, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f37495p == null) {
            return;
        }
        this.f37491l.put(stringExtra, new ForegroundInfo(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f37490k)) {
            this.f37490k = stringExtra;
            ((SystemForegroundService) this.f37495p).m962c(intExtra, intExtra2, notification);
            return;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) this.f37495p;
        systemForegroundService.f1398h.post(new SystemForegroundService2(systemForegroundService, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator<Map.Entry<String, ForegroundInfo>> it = this.f37491l.entrySet().iterator();
        while (it.hasNext()) {
            i |= it.next().getValue().f37268b;
        }
        ForegroundInfo foregroundInfo = this.f37491l.get(this.f37490k);
        if (foregroundInfo != null) {
            ((SystemForegroundService) this.f37495p).m962c(foregroundInfo.f37267a, i, foregroundInfo.f37269c);
        }
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: f */
    public void mo969f(List<String> list) {
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:117)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX INFO: renamed from: g */
    public void m15970g() {
        this.f37495p = null;
        synchronized (this.f37489j) {
            this.f37494o.m15952c();
        }
        this.f37487h.f37345j.m15902e(this);
    }
}
