package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.ProgressUpdater;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.t.q, reason: use source file name */
/* JADX INFO: compiled from: WorkProgressUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkProgressUpdater2 implements ProgressUpdater {

    /* JADX INFO: renamed from: a */
    public static final String f37598a = Logger9.m15886e("WorkProgressUpdater");

    /* JADX INFO: renamed from: b */
    public final WorkDatabase f37599b;

    /* JADX INFO: renamed from: c */
    public final TaskExecutor2 f37600c;

    public WorkProgressUpdater2(WorkDatabase workDatabase, TaskExecutor2 taskExecutor2) {
        this.f37599b = workDatabase;
        this.f37600c = taskExecutor2;
    }
}
