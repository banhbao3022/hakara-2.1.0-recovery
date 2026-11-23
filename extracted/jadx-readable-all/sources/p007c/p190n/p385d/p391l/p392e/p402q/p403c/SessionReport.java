package p007c.p190n.p385d.p391l.p392e.p402q.p403c;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.q.c.d, reason: use source file name */
/* JADX INFO: compiled from: SessionReport.java */
/* JADX INFO: loaded from: classes.dex */
public class SessionReport implements Report {

    /* JADX INFO: renamed from: a */
    public final File f26939a;

    /* JADX INFO: renamed from: b */
    public final File[] f26940b;

    /* JADX INFO: renamed from: c */
    public final Map<String, String> f26941c;

    public SessionReport(File file) {
        this(file, Collections.emptyMap());
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: a */
    public Map<String, String> mo12019a() {
        return Collections.unmodifiableMap(this.f26941c);
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: b */
    public String mo12020b() {
        String strMo12024f = mo12024f();
        return strMo12024f.substring(0, strMo12024f.lastIndexOf(46));
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: c */
    public File mo12021c() {
        return this.f26939a;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: d */
    public int mo12022d() {
        return 1;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: e */
    public File[] mo12023e() {
        return this.f26940b;
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    /* JADX INFO: renamed from: f */
    public String mo12024f() {
        return this.f26939a.getName();
    }

    @Override // p007c.p190n.p385d.p391l.p392e.p402q.p403c.Report
    public void remove() {
        Logger4 logger4 = Logger4.f26421a;
        StringBuilder sbM1556G = outline.m1556G("Removing report at ");
        sbM1556G.append(this.f26939a.getPath());
        logger4.m11713b(sbM1556G.toString());
        this.f26939a.delete();
    }

    public SessionReport(File file, Map<String, String> map) {
        this.f26939a = file;
        this.f26940b = new File[]{file};
        this.f26941c = new HashMap(map);
    }
}
