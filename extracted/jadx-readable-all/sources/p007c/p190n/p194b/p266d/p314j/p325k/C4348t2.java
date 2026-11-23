package p007c.p190n.p194b.p266d.p314j.p325k;

import android.util.Log;

/* JADX INFO: renamed from: c.n.b.d.j.k.t2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4348t2 extends AbstractC4292p2<Boolean> {
    public C4348t2(C4362u2 c4362u2, String str, Boolean bool) {
        super(c4362u2, str, bool, true, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4292p2
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean mo10134a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C4400x1.f23603c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (C4400x1.f23604d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String strM10136c = m10136c();
        String strValueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(strValueOf.length() + String.valueOf(strM10136c).length() + 28);
        sb.append("Invalid boolean value for ");
        sb.append(strM10136c);
        sb.append(": ");
        sb.append(strValueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
