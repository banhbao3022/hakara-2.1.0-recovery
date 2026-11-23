package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p636z0.p709j0.p710y.WorkManagerImpl;

/* JADX INFO: renamed from: z0.j0.y.t.a, reason: use source file name */
/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class CancelWorkRunnable extends CancelWorkRunnable4 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ WorkManagerImpl f37556g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ UUID f37557h;

    public CancelWorkRunnable(WorkManagerImpl workManagerImpl, UUID uuid) {
        this.f37556g = workManagerImpl;
        this.f37557h = uuid;
    }

    @Override // p636z0.p709j0.p710y.p720t.CancelWorkRunnable4
    /* JADX INFO: renamed from: c */
    public void mo16001c() {
        WorkDatabase workDatabase = this.f37556g.f37342g;
        workDatabase.m14529c();
        try {
            m16002a(this.f37556g, this.f37557h.toString());
            workDatabase.m14537n();
            workDatabase.m14530f();
            m16003b(this.f37556g);
        } catch (Throwable th) {
            workDatabase.m14530f();
            throw th;
        }
    }
}
