package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import java.util.List;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2304w {

    /* JADX INFO: renamed from: a */
    public final String[] f10792a;

    /* JADX INFO: renamed from: b */
    public final double[] f10793b;

    /* JADX INFO: renamed from: c */
    public final double[] f10794c;

    /* JADX INFO: renamed from: d */
    public final int[] f10795d;

    /* JADX INFO: renamed from: e */
    public int f10796e;

    public /* synthetic */ C2304w(C2302v c2302v) {
        int size = c2302v.f10790b.size();
        this.f10792a = (String[]) c2302v.f10789a.toArray(new String[size]);
        this.f10793b = m4808a(c2302v.f10790b);
        this.f10794c = m4808a(c2302v.f10791c);
        this.f10795d = new int[size];
        this.f10796e = 0;
    }

    /* JADX INFO: renamed from: a */
    public static final double[] m4808a(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }
}
