package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.t.c, reason: use source file name */
/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class CancelWorkRunnable3 extends CancelWorkRunnable4 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ WorkManagerImpl f37560g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f37561h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f37562i;

    public CancelWorkRunnable3(WorkManagerImpl workManagerImpl, String str, boolean z) {
        this.f37560g = workManagerImpl;
        this.f37561h = str;
        this.f37562i = z;
    }

    @Override // p636z0.p709j0.p710y.p720t.CancelWorkRunnable4
    /* JADX INFO: renamed from: c */
    public void mo16001c() {
        WorkDatabase workDatabase = this.f37560g.f37342g;
        workDatabase.m14529c();
        try {
            Iterator it = ((ArrayList) ((WorkSpecDao_Impl) workDatabase.mo946u()).m15990h(this.f37561h)).iterator();
            while (it.hasNext()) {
                m16002a(this.f37560g, (String) it.next());
            }
            workDatabase.m14537n();
            workDatabase.m14530f();
            if (this.f37562i) {
                m16003b(this.f37560g);
            }
        } catch (Throwable th) {
            workDatabase.m14530f();
            throw th;
        }
    }
}
