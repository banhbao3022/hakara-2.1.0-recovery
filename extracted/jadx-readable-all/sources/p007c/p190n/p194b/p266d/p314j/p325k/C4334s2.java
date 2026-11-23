package p007c.p190n.p194b.p266d.p314j.p325k;

import android.util.Log;

/* JADX INFO: renamed from: c.n.b.d.j.k.s2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4334s2 extends AbstractC4292p2<Double> {
    public C4334s2(C4362u2 c4362u2, String str, Double d) {
        super(c4362u2, str, d, true, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4292p2
    /* JADX INFO: renamed from: a */
    public final Double mo10134a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strM10136c = m10136c();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(strM10136c).length() + 27);
        sb.append("Invalid double value for ");
        sb.append(strM10136c);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
