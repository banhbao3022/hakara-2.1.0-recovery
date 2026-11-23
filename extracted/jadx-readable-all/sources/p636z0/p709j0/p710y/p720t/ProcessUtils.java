package p636z0.p709j0.p710y.p720t;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p711p.p712a.GreedyScheduler;

/* JADX INFO: renamed from: z0.j0.y.t.i, reason: use source file name */
/* JADX INFO: compiled from: ProcessUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class ProcessUtils {

    /* JADX INFO: renamed from: a */
    public static final String f37570a = Logger9.m15886e("ProcessUtils");

    /* JADX INFO: renamed from: a */
    public static boolean m16009a(Context context, Configuration configuration) {
        String processName;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            processName = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, GreedyScheduler.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(null, new Object[0]);
                if (!(objInvoke instanceof String)) {
                    int iMyPid = Process.myPid();
                    ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                    if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null && !runningAppProcesses.isEmpty()) {
                        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                            if (runningAppProcessInfo.pid == iMyPid) {
                                processName = runningAppProcessInfo.processName;
                                break;
                            }
                        }
                    }
                } else {
                    processName = (String) objInvoke;
                }
            } catch (Throwable th) {
                Logger9.m15885c().mo15887a(f37570a, "Unable to check ActivityThread for processName", th);
            }
        }
        return !TextUtils.isEmpty(configuration.f37226g) ? TextUtils.equals(processName, configuration.f37226g) : TextUtils.equals(processName, context.getApplicationInfo().processName);
    }
}
