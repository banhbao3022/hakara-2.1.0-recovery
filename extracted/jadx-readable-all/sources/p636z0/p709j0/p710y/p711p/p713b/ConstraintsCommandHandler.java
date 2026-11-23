package p636z0.p709j0.p710y.p711p.p713b;

import android.content.Context;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p715q.WorkConstraintsTracker;

/* JADX INFO: renamed from: z0.j0.y.p.b.c, reason: use source file name */
/* JADX INFO: compiled from: ConstraintsCommandHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintsCommandHandler {

    /* JADX INFO: renamed from: a */
    public static final String f37403a = Logger9.m15886e("ConstraintsCmdHandler");

    /* JADX INFO: renamed from: b */
    public final Context f37404b;

    /* JADX INFO: renamed from: c */
    public final int f37405c;

    /* JADX INFO: renamed from: d */
    public final SystemAlarmDispatcher f37406d;

    /* JADX INFO: renamed from: e */
    public final WorkConstraintsTracker f37407e;

    public ConstraintsCommandHandler(Context context, int i, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f37404b = context;
        this.f37405c = i;
        this.f37406d = systemAlarmDispatcher;
        this.f37407e = new WorkConstraintsTracker(context, systemAlarmDispatcher.f37420h, null);
    }
}
