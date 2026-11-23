package p007c.p114h.p126d.p129c.p133c.p134e;

import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.h.d.c.c.e.a, reason: use source file name */
/* JADX INFO: compiled from: DynamicColor.java */
/* JADX INFO: loaded from: classes.dex */
public class DynamicColor {

    /* JADX INFO: renamed from: a */
    public String f4140a;

    /* JADX INFO: renamed from: b */
    public List<DynamicColorData> f4141b = new ArrayList();

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("unzipPath: ");
        sbM1556G.append(this.f4140a);
        sbM1556G.append("\n");
        sbM1556G.append("data: [");
        for (int i = 0; i < this.f4141b.size(); i++) {
            sbM1556G.append(this.f4141b.get(i).toString());
            if (i < this.f4141b.size() - 1) {
                sbM1556G.append(",");
            }
        }
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
