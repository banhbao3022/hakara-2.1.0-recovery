package p636z0.p709j0.p710y.p715q.p716e;

import android.content.Context;
import p636z0.p709j0.p710y.p715q.p717f.Trackers;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.e.h, reason: use source file name */
/* JADX INFO: compiled from: StorageNotLowController.java */
/* JADX INFO: loaded from: classes.dex */
public class StorageNotLowController extends ConstraintController<Boolean> {
    public StorageNotLowController(Context context, TaskExecutor2 taskExecutor2) {
        super(Trackers.m15966a(context, taskExecutor2).f37481e);
    }

    @Override // p636z0.p709j0.p710y.p715q.p716e.ConstraintController
    /* JADX INFO: renamed from: b */
    public boolean mo15953b(WorkSpec workSpec) {
        return workSpec.f37533j.f37247f;
    }

    @Override // p636z0.p709j0.p710y.p715q.p716e.ConstraintController
    /* JADX INFO: renamed from: c */
    public boolean mo15954c(Boolean bool) {
        return !bool.booleanValue();
    }
}
