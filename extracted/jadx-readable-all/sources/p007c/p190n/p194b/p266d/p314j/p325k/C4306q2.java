package p007c.p190n.p194b.p266d.p314j.p325k;

import android.util.Log;

/* JADX INFO: renamed from: c.n.b.d.j.k.q2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4306q2 extends AbstractC4292p2<Long> {
    public C4306q2(C4362u2 c4362u2, String str, Long l) {
        super(c4362u2, str, l, true, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4292p2
    /* JADX INFO: renamed from: a */
    public final Long mo10134a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String strM10136c = m10136c();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(strM10136c).length() + 25);
        sb.append("Invalid long value for ");
        sb.append(strM10136c);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
