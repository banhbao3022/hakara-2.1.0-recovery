package p636z0.p709j0.p710y.p711p.p713b;

import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.Scheduler2;
import p636z0.p709j0.p710y.p719s.WorkSpec;

/* JADX INFO: renamed from: z0.j0.y.p.b.f, reason: use source file name */
/* JADX INFO: compiled from: SystemAlarmScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmScheduler implements Scheduler2 {

    /* JADX INFO: renamed from: f */
    public static final String f37434f = Logger9.m15886e("SystemAlarmScheduler");

    /* JADX INFO: renamed from: g */
    public final Context f37435g;

    public SystemAlarmScheduler(Context context) {
        this.f37435g = context.getApplicationContext();
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: a */
    public void mo15908a(WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            Logger9.m15885c().mo15887a(f37434f, String.format("Scheduling work with workSpecId %s", workSpec.f37524a), new Throwable[0]);
            this.f37435g.startService(CommandHandler.m15934c(this.f37435g, workSpec.f37524a));
        }
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: c */
    public boolean mo15909c() {
        return true;
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: e */
    public void mo15910e(String str) {
        Context context = this.f37435g;
        String str2 = CommandHandler.f37399f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f37435g.startService(intent);
    }
}
