package p636z0.p709j0.p710y.p715q.p716e;

import android.content.Context;
import android.os.Build;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.NetworkType;
import p636z0.p709j0.p710y.p715q.NetworkState;
import p636z0.p709j0.p710y.p715q.p717f.Trackers;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.e.f, reason: use source file name */
/* JADX INFO: compiled from: NetworkNotRoamingController.java */
/* JADX INFO: loaded from: classes.dex */
public class NetworkNotRoamingController extends ConstraintController<NetworkState> {

    /* JADX INFO: renamed from: e */
    public static final String f37456e = Logger9.m15886e("NetworkNotRoamingCtrlr");

    public NetworkNotRoamingController(Context context, TaskExecutor2 taskExecutor2) {
        super(Trackers.m15966a(context, taskExecutor2).f37480d);
    }

    @Override // p636z0.p709j0.p710y.p715q.p716e.ConstraintController
    /* JADX INFO: renamed from: b */
    public boolean mo15953b(WorkSpec workSpec) {
        return workSpec.f37533j.f37243b == NetworkType.NOT_ROAMING;
    }

    @Override // p636z0.p709j0.p710y.p715q.p716e.ConstraintController
    /* JADX INFO: renamed from: c */
    public boolean mo15954c(NetworkState networkState) {
        NetworkState networkState2 = networkState;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 24) {
            Logger9.m15885c().mo15887a(f37456e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !networkState2.f37443a;
        }
        if (networkState2.f37443a && networkState2.f37446d) {
            z = false;
        }
        return z;
    }
}
