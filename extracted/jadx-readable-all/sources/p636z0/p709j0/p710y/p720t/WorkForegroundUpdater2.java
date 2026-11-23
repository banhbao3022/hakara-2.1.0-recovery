package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import p636z0.p709j0.ForegroundUpdater;
import p636z0.p709j0.p710y.p718r.ForegroundProcessor;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.t.o, reason: use source file name */
/* JADX INFO: compiled from: WorkForegroundUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkForegroundUpdater2 implements ForegroundUpdater {

    /* JADX INFO: renamed from: a */
    public final TaskExecutor2 f37591a;

    /* JADX INFO: renamed from: b */
    public final ForegroundProcessor f37592b;

    /* JADX INFO: renamed from: c */
    public final WorkSpecDao f37593c;

    public WorkForegroundUpdater2(WorkDatabase workDatabase, ForegroundProcessor foregroundProcessor, TaskExecutor2 taskExecutor2) {
        this.f37592b = foregroundProcessor;
        this.f37591a = taskExecutor2;
        this.f37593c = workDatabase.mo946u();
    }
}
