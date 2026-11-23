package p636z0.p709j0.p710y.p711p.p713b;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.List;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.ExecutionListener;
import p636z0.p709j0.p710y.p715q.WorkConstraintsCallback;
import p636z0.p709j0.p710y.p715q.WorkConstraintsTracker;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p720t.WakeLocks;
import p636z0.p709j0.p710y.p720t.WorkTimer;

/* JADX INFO: renamed from: z0.j0.y.p.b.d, reason: use source file name */
/* JADX INFO: compiled from: DelayMetCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class DelayMetCommandHandler implements WorkConstraintsCallback, ExecutionListener, WorkTimer.b {

    /* JADX INFO: renamed from: f */
    public static final String f37408f = Logger9.m15886e("DelayMetCommandHandler");

    /* JADX INFO: renamed from: g */
    public final Context f37409g;

    /* JADX INFO: renamed from: h */
    public final int f37410h;

    /* JADX INFO: renamed from: i */
    public final String f37411i;

    /* JADX INFO: renamed from: j */
    public final SystemAlarmDispatcher f37412j;

    /* JADX INFO: renamed from: k */
    public final WorkConstraintsTracker f37413k;

    /* JADX INFO: renamed from: n */
    public PowerManager.WakeLock f37416n;

    /* JADX INFO: renamed from: o */
    public boolean f37417o = false;

    /* JADX INFO: renamed from: m */
    public int f37415m = 0;

    /* JADX INFO: renamed from: l */
    public final Object f37414l = new Object();

    public DelayMetCommandHandler(Context context, int i, String str, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f37409g = context;
        this.f37410h = i;
        this.f37412j = systemAlarmDispatcher;
        this.f37411i = str;
        this.f37413k = new WorkConstraintsTracker(context, systemAlarmDispatcher.f37420h, this);
    }

    @Override // p636z0.p709j0.p710y.p720t.WorkTimer.b
    /* JADX INFO: renamed from: a */
    public void mo15936a(String str) {
        Logger9.m15885c().mo15887a(f37408f, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        m15939g();
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: b */
    public void mo967b(List<String> list) {
        m15939g();
    }

    /* JADX INFO: renamed from: c */
    public final void m15937c() {
        synchronized (this.f37414l) {
            this.f37413k.m15952c();
            this.f37412j.f37421i.m16013b(this.f37411i);
            PowerManager.WakeLock wakeLock = this.f37416n;
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger9.m15885c().mo15887a(f37408f, String.format("Releasing wakelock %s for WorkSpec %s", this.f37416n, this.f37411i), new Throwable[0]);
                this.f37416n.release();
            }
        }
    }

    @Override // p636z0.p709j0.p710y.ExecutionListener
    /* JADX INFO: renamed from: d */
    public void mo960d(String str, boolean z) {
        Logger9.m15885c().mo15887a(f37408f, String.format("onExecuted %s, %s", str, Boolean.valueOf(z)), new Throwable[0]);
        m15937c();
        if (z) {
            Intent intentM15934c = CommandHandler.m15934c(this.f37409g, this.f37411i);
            SystemAlarmDispatcher systemAlarmDispatcher = this.f37412j;
            systemAlarmDispatcher.f37425m.post(new SystemAlarmDispatcher.b(systemAlarmDispatcher, intentM15934c, this.f37410h));
        }
        if (this.f37417o) {
            Intent intentM15932a = CommandHandler.m15932a(this.f37409g);
            SystemAlarmDispatcher systemAlarmDispatcher2 = this.f37412j;
            systemAlarmDispatcher2.f37425m.post(new SystemAlarmDispatcher.b(systemAlarmDispatcher2, intentM15932a, this.f37410h));
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15938e() {
        this.f37416n = WakeLocks.m16011a(this.f37409g, String.format("%s (%s)", this.f37411i, Integer.valueOf(this.f37410h)));
        Logger9 logger9M15885c = Logger9.m15885c();
        String str = f37408f;
        logger9M15885c.mo15887a(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f37416n, this.f37411i), new Throwable[0]);
        this.f37416n.acquire();
        WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) this.f37412j.f37423k.f37342g.mo946u()).m15992j(this.f37411i);
        if (workSpecM15992j == null) {
            m15939g();
            return;
        }
        boolean zM15981b = workSpecM15992j.m15981b();
        this.f37417o = zM15981b;
        if (zM15981b) {
            this.f37413k.m15951b(Collections.singletonList(workSpecM15992j));
        } else {
            Logger9.m15885c().mo15887a(str, String.format("No constraints for %s", this.f37411i), new Throwable[0]);
            mo969f(Collections.singletonList(this.f37411i));
        }
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: f */
    public void mo969f(List<String> list) {
        if (list.contains(this.f37411i)) {
            synchronized (this.f37414l) {
                if (this.f37415m == 0) {
                    this.f37415m = 1;
                    Logger9.m15885c().mo15887a(f37408f, String.format("onAllConstraintsMet for %s", this.f37411i), new Throwable[0]);
                    if (this.f37412j.f37422j.m15904g(this.f37411i, null)) {
                        this.f37412j.f37421i.m16012a(this.f37411i, 600000L, this);
                    } else {
                        m15937c();
                    }
                } else {
                    Logger9.m15885c().mo15887a(f37408f, String.format("Already started work for %s", this.f37411i), new Throwable[0]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m15939g() {
        synchronized (this.f37414l) {
            if (this.f37415m < 2) {
                this.f37415m = 2;
                Logger9 logger9M15885c = Logger9.m15885c();
                String str = f37408f;
                logger9M15885c.mo15887a(str, String.format("Stopping work for WorkSpec %s", this.f37411i), new Throwable[0]);
                Context context = this.f37409g;
                String str2 = this.f37411i;
                Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent.setAction("ACTION_STOP_WORK");
                intent.putExtra("KEY_WORKSPEC_ID", str2);
                SystemAlarmDispatcher systemAlarmDispatcher = this.f37412j;
                systemAlarmDispatcher.f37425m.post(new SystemAlarmDispatcher.b(systemAlarmDispatcher, intent, this.f37410h));
                if (this.f37412j.f37422j.m15901c(this.f37411i)) {
                    Logger9.m15885c().mo15887a(str, String.format("WorkSpec %s needs to be rescheduled", this.f37411i), new Throwable[0]);
                    Intent intentM15934c = CommandHandler.m15934c(this.f37409g, this.f37411i);
                    SystemAlarmDispatcher systemAlarmDispatcher2 = this.f37412j;
                    systemAlarmDispatcher2.f37425m.post(new SystemAlarmDispatcher.b(systemAlarmDispatcher2, intentM15934c, this.f37410h));
                } else {
                    Logger9.m15885c().mo15887a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f37411i), new Throwable[0]);
                }
            } else {
                Logger9.m15885c().mo15887a(f37408f, String.format("Already stopped work for %s", this.f37411i), new Throwable[0]);
            }
        }
    }
}
