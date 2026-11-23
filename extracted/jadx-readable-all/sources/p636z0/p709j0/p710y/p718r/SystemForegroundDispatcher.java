package p636z0.p709j0.p710y.p718r;

import androidx.work.impl.WorkDatabase;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.r.b, reason: use source file name */
/* JADX INFO: compiled from: SystemForegroundDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundDispatcher implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ WorkDatabase f37482f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f37483g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SystemForegroundDispatcher2 f37484h;

    public SystemForegroundDispatcher(SystemForegroundDispatcher2 systemForegroundDispatcher2, WorkDatabase workDatabase, String str) {
        this.f37484h = systemForegroundDispatcher2;
        this.f37482f = workDatabase;
        this.f37483g = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) this.f37482f.mo946u()).m15992j(this.f37483g);
        if (workSpecM15992j == null || !workSpecM15992j.m15981b()) {
            return;
        }
        synchronized (this.f37484h.f37489j) {
            this.f37484h.f37492m.put(this.f37483g, workSpecM15992j);
            this.f37484h.f37493n.add(workSpecM15992j);
            SystemForegroundDispatcher2 systemForegroundDispatcher2 = this.f37484h;
            systemForegroundDispatcher2.f37494o.m15951b(systemForegroundDispatcher2.f37493n);
        }
    }
}
