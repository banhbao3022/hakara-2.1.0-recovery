package p636z0.p709j0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.j0.x, reason: use source file name */
/* JADX INFO: compiled from: WorkerFactory.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class WorkerFactory2 {

    /* JADX INFO: renamed from: a */
    public static final String f37295a = Logger9.m15886e("WorkerFactory");

    /* JADX INFO: renamed from: a */
    public abstract ListenableWorker mo15896a(Context context, String str, WorkerParameters workerParameters);

    /* JADX INFO: renamed from: b */
    public final ListenableWorker m15897b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker listenableWorkerMo15896a = mo15896a(context, str, workerParameters);
        if (listenableWorkerMo15896a == null) {
            Class clsAsSubclass = null;
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                Logger9.m15885c().mo15888b(f37295a, outline.m1599u("Invalid class: ", str), th);
            }
            if (clsAsSubclass != null) {
                try {
                    listenableWorkerMo15896a = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    Logger9.m15885c().mo15888b(f37295a, outline.m1599u("Could not instantiate ", str), th2);
                }
            }
        }
        if (listenableWorkerMo15896a == null || !listenableWorkerMo15896a.isUsed()) {
            return listenableWorkerMo15896a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
