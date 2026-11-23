package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.v */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2302v {

    /* JADX INFO: renamed from: a */
    public final List<String> f10789a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<Double> f10790b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List<Double> f10791c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final C2302v m4806a(String str, double d, double d2) {
        int i = 0;
        while (i < this.f10789a.size()) {
            double dDoubleValue = this.f10791c.get(i).doubleValue();
            double dDoubleValue2 = this.f10790b.get(i).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        this.f10789a.add(i, str);
        this.f10791c.add(i, Double.valueOf(d));
        this.f10790b.add(i, Double.valueOf(d2));
        return this;
    }
}
