package p636z0.p709j0.p710y.p715q.p716e;

import android.content.Context;
import p636z0.p709j0.NetworkType;
import p636z0.p709j0.p710y.p715q.NetworkState;
import p636z0.p709j0.p710y.p715q.p717f.Trackers;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.e.g, reason: use source file name */
/* JADX INFO: compiled from: NetworkUnmeteredController.java */
/* JADX INFO: loaded from: classes.dex */
public class NetworkUnmeteredController extends ConstraintController<NetworkState> {
    public NetworkUnmeteredController(Context context, TaskExecutor2 taskExecutor2) {
        super(Trackers.m15966a(context, taskExecutor2).f37480d);
    }

    @Override // p636z0.p709j0.p710y.p715q.p716e.ConstraintController
    /* JADX INFO: renamed from: b */
    public boolean mo15953b(WorkSpec workSpec) {
        return workSpec.f37533j.f37243b == NetworkType.UNMETERED;
    }

    @Override // p636z0.p709j0.p710y.p715q.p716e.ConstraintController
    /* JADX INFO: renamed from: c */
    public boolean mo15954c(NetworkState networkState) {
        NetworkState networkState2 = networkState;
        return !networkState2.f37443a || networkState2.f37445c;
    }
}
