package p007c.p190n.p385d.p391l.p392e.p395k;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p402q.ReportManager;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.NativeSessionReport;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report;
import p007c.p190n.p385d.p391l.p392e.p402q.p403c.SessionReport;

/* JADX INFO: renamed from: c.n.d.l.e.k.c0 */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class CallableC5300c0 implements Callable<AbstractC4781i<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean f26471a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5335t.e f26472b;

    public CallableC5300c0(C5335t.e eVar, Boolean bool) {
        this.f26472b = eVar;
        this.f26471a = bool;
    }

    @Override // java.util.concurrent.Callable
    public AbstractC4781i<Void> call() throws Exception {
        ReportManager reportManager = C5335t.this.f26604u;
        Objects.requireNonNull(reportManager);
        Logger4.f26421a.m11713b("Checking for crash reports...");
        File[] fileArrM11799q = C5335t.this.m11799q();
        File[] fileArrListFiles = C5335t.this.m11796m().listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        LinkedList linkedList = new LinkedList();
        if (fileArrM11799q != null) {
            for (File file : fileArrM11799q) {
                Logger4 logger4 = Logger4.f26421a;
                StringBuilder sbM1556G = outline.m1556G("Found crash report ");
                sbM1556G.append(file.getPath());
                logger4.m11713b(sbM1556G.toString());
                linkedList.add(new SessionReport(file));
            }
        }
        for (File file2 : fileArrListFiles) {
            linkedList.add(new NativeSessionReport(file2));
        }
        if (linkedList.isEmpty()) {
            Logger4.f26421a.m11713b("No reports found.");
        }
        if (this.f26471a.booleanValue()) {
            Logger4.f26421a.m11713b("Reports are being sent.");
            boolean zBooleanValue = this.f26471a.booleanValue();
            DataCollectionArbiter dataCollectionArbiter = C5335t.this.f26593j;
            Objects.requireNonNull(dataCollectionArbiter);
            if (!zBooleanValue) {
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            dataCollectionArbiter.f26546g.m10948b(null);
            C5335t.e eVar = this.f26472b;
            Executor executor = C5335t.this.f26596m.f26516a;
            return eVar.f26610a.mo10942o(executor, new C5297b0(this, linkedList, zBooleanValue, executor));
        }
        Logger4.f26421a.m11713b("Reports are being deleted.");
        for (File file3 : C5335t.this.m11800s(C5335t.f26580b)) {
            file3.delete();
        }
        Objects.requireNonNull(C5335t.this.f26604u);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((Report) it.next()).remove();
        }
        C5335t.this.f26587A.f26636b.m11979b();
        C5335t.this.f26591E.m10948b(null);
        return C4340s8.m10208e(null);
    }
}
