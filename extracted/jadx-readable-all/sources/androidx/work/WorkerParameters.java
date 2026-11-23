package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p636z0.p709j0.Data;
import p636z0.p709j0.ForegroundUpdater;
import p636z0.p709j0.ProgressUpdater;
import p636z0.p709j0.WorkerFactory2;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: loaded from: classes.dex */
public final class WorkerParameters {

    /* JADX INFO: renamed from: a */
    public UUID f1360a;

    /* JADX INFO: renamed from: b */
    public Data f1361b;

    /* JADX INFO: renamed from: c */
    public Set<String> f1362c;

    /* JADX INFO: renamed from: d */
    public C0226a f1363d;

    /* JADX INFO: renamed from: e */
    public int f1364e;

    /* JADX INFO: renamed from: f */
    public Executor f1365f;

    /* JADX INFO: renamed from: g */
    public TaskExecutor2 f1366g;

    /* JADX INFO: renamed from: h */
    public WorkerFactory2 f1367h;

    /* JADX INFO: renamed from: i */
    public ProgressUpdater f1368i;

    /* JADX INFO: renamed from: j */
    public ForegroundUpdater f1369j;

    /* JADX INFO: renamed from: androidx.work.WorkerParameters$a */
    public static class C0226a {

        /* JADX INFO: renamed from: a */
        public List<String> f1370a = Collections.emptyList();

        /* JADX INFO: renamed from: b */
        public List<Uri> f1371b = Collections.emptyList();

        /* JADX INFO: renamed from: c */
        public Network f1372c;
    }

    public WorkerParameters(UUID uuid, Data data, Collection<String> collection, C0226a c0226a, int i, Executor executor, TaskExecutor2 taskExecutor2, WorkerFactory2 workerFactory2, ProgressUpdater progressUpdater, ForegroundUpdater foregroundUpdater) {
        this.f1360a = uuid;
        this.f1361b = data;
        this.f1362c = new HashSet(collection);
        this.f1363d = c0226a;
        this.f1364e = i;
        this.f1365f = executor;
        this.f1366g = taskExecutor2;
        this.f1367h = workerFactory2;
        this.f1368i = progressUpdater;
        this.f1369j = foregroundUpdater;
    }
}
