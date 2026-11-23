package p007c.p190n.p385d.p391l.p392e.p402q.p403c;

import java.io.File;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.q.c.b, reason: use source file name */
/* JADX INFO: compiled from: NativeSessionReport.java */
/* JADX INFO: loaded from: classes.dex */
public class NativeSessionReport implements Report {

    /* JADX INFO: renamed from: a */
    public final File f26938a;

    public NativeSessionReport(File file) {
        this.f26938a = file;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo12019a() {
        return null;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: b */
    public String mo12020b() {
        return this.f26938a.getName();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: c */
    public File mo12021c() {
        return null;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: d */
    public int mo12022d() {
        return 2;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: e */
    public File[] mo12023e() {
        return this.f26938a.listFiles();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: f */
    public String mo12024f() {
        return null;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    public void remove() {
        for (File file : mo12023e()) {
            Logger4 logger4 = Logger4.f26421a;
            StringBuilder sbM1556G = outline.m1556G("Removing native report file at ");
            sbM1556G.append(file.getPath());
            logger4.m11713b(sbM1556G.toString());
            file.delete();
        }
        Logger4 logger5 = Logger4.f26421a;
        StringBuilder sbM1556G2 = outline.m1556G("Removing native report directory at ");
        sbM1556G2.append(this.f26938a);
        logger5.m11713b(sbM1556G2.toString());
        this.f26938a.delete();
    }
}
