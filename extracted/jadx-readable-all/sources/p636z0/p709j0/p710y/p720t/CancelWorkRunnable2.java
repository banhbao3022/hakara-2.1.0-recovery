package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.t.b, reason: use source file name */
/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class CancelWorkRunnable2 extends CancelWorkRunnable4 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ WorkManagerImpl f37558g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f37559h;

    public CancelWorkRunnable2(WorkManagerImpl workManagerImpl, String str) {
        this.f37558g = workManagerImpl;
        this.f37559h = str;
    }

    @Override // p636z0.p709j0.p710y.p720t.CancelWorkRunnable4
    /* JADX INFO: renamed from: c */
    public void mo16001c() {
        WorkDatabase workDatabase = this.f37558g.f37342g;
        workDatabase.m14529c();
        try {
            Iterator it = ((ArrayList) ((WorkSpecDao_Impl) workDatabase.mo946u()).m15991i(this.f37559h)).iterator();
            while (it.hasNext()) {
                m16002a(this.f37558g, (String) it.next());
            }
            workDatabase.m14537n();
            workDatabase.m14530f();
            m16003b(this.f37558g);
        } catch (Throwable th) {
            workDatabase.m14530f();
            throw th;
        }
    }
}
