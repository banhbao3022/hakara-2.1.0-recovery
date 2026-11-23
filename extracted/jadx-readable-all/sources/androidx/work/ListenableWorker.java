package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p709j0.Data;
import p636z0.p709j0.ForegroundInfo;
import p636z0.p709j0.ForegroundUpdater;
import p636z0.p709j0.ProgressUpdater;
import p636z0.p709j0.WorkerFactory2;
import p636z0.p709j0.p710y.p720t.WorkForegroundUpdater;
import p636z0.p709j0.p710y.p720t.WorkForegroundUpdater2;
import p636z0.p709j0.p710y.p720t.WorkProgressUpdater;
import p636z0.p709j0.p710y.p720t.WorkProgressUpdater2;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public abstract class ListenableWorker {

    /* JADX INFO: renamed from: f */
    public Context f1351f;

    /* JADX INFO: renamed from: g */
    public WorkerParameters f1352g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f1353h;

    /* JADX INFO: renamed from: i */
    public boolean f1354i;

    /* JADX INFO: renamed from: j */
    public boolean f1355j;

    /* JADX INFO: renamed from: androidx.work.ListenableWorker$a */
    public static abstract class AbstractC0224a {

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$a */
        public static final class a extends AbstractC0224a {

            /* JADX INFO: renamed from: a */
            public final Data f1356a;

            public a() {
                this(Data.f37259b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || a.class != obj.getClass()) {
                    return false;
                }
                return this.f1356a.equals(((a) obj).f1356a);
            }

            public int hashCode() {
                return this.f1356a.hashCode() + (a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder sbM1556G = outline.m1556G("Failure {mOutputData=");
                sbM1556G.append(this.f1356a);
                sbM1556G.append('}');
                return sbM1556G.toString();
            }

            public a(Data data) {
                this.f1356a = data;
            }
        }

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$b */
        public static final class b extends AbstractC0224a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* JADX INFO: renamed from: androidx.work.ListenableWorker$a$c */
        public static final class c extends AbstractC0224a {

            /* JADX INFO: renamed from: a */
            public final Data f1357a;

            public c() {
                this(Data.f37259b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f1357a.equals(((c) obj).f1357a);
            }

            public int hashCode() {
                return this.f1357a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder sbM1556G = outline.m1556G("Success {mOutputData=");
                sbM1556G.append(this.f1357a);
                sbM1556G.append('}');
                return sbM1556G.toString();
            }

            public c(Data data) {
                this.f1357a = data;
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1351f = context;
        this.f1352g = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f1351f;
    }

    public Executor getBackgroundExecutor() {
        return this.f1352g.f1365f;
    }

    public final UUID getId() {
        return this.f1352g.f1360a;
    }

    public final Data getInputData() {
        return this.f1352g.f1361b;
    }

    public final Network getNetwork() {
        return this.f1352g.f1363d.f1372c;
    }

    public final int getRunAttemptCount() {
        return this.f1352g.f1364e;
    }

    public final Set<String> getTags() {
        return this.f1352g.f1362c;
    }

    public TaskExecutor2 getTaskExecutor() {
        return this.f1352g.f1366g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f1352g.f1363d.f1370a;
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f1352g.f1363d.f1371b;
    }

    public WorkerFactory2 getWorkerFactory() {
        return this.f1352g.f1367h;
    }

    public boolean isRunInForeground() {
        return this.f1355j;
    }

    public final boolean isStopped() {
        return this.f1353h;
    }

    public final boolean isUsed() {
        return this.f1354i;
    }

    public void onStopped() {
    }

    public final ListenableFuture<Void> setForegroundAsync(ForegroundInfo foregroundInfo) {
        this.f1355j = true;
        ForegroundUpdater foregroundUpdater = this.f1352g.f1369j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        WorkForegroundUpdater2 workForegroundUpdater2 = (WorkForegroundUpdater2) foregroundUpdater;
        Objects.requireNonNull(workForegroundUpdater2);
        SettableFuture settableFuture = new SettableFuture();
        TaskExecutor2 taskExecutor2 = workForegroundUpdater2.f37591a;
        ((WorkManagerTaskExecutor) taskExecutor2).f37639a.execute(new WorkForegroundUpdater(workForegroundUpdater2, settableFuture, id, foregroundInfo, applicationContext));
        return settableFuture;
    }

    public final ListenableFuture<Void> setProgressAsync(Data data) {
        ProgressUpdater progressUpdater = this.f1352g.f1368i;
        getApplicationContext();
        UUID id = getId();
        WorkProgressUpdater2 workProgressUpdater2 = (WorkProgressUpdater2) progressUpdater;
        Objects.requireNonNull(workProgressUpdater2);
        SettableFuture settableFuture = new SettableFuture();
        TaskExecutor2 taskExecutor2 = workProgressUpdater2.f37600c;
        ((WorkManagerTaskExecutor) taskExecutor2).f37639a.execute(new WorkProgressUpdater(workProgressUpdater2, id, data, settableFuture));
        return settableFuture;
    }

    public final void setUsed() {
        this.f1354i = true;
    }

    public abstract ListenableFuture<AbstractC0224a> startWork();

    public final void stop() {
        this.f1353h = true;
        onStopped();
    }
}
