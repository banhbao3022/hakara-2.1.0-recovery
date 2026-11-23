package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class es1 {

    /* JADX INFO: renamed from: a */
    public static boolean f13682a;

    /* JADX INFO: renamed from: b */
    public final String f13683b;

    /* JADX INFO: renamed from: c */
    public final ds1 f13684c;

    /* JADX INFO: renamed from: d */
    public ds1 f13685d;

    public /* synthetic */ es1(String str) {
        ds1 ds1Var = new ds1();
        this.f13684c = ds1Var;
        this.f13685d = ds1Var;
        if (!f13682a) {
            synchronized (es1.class) {
                if (!f13682a) {
                    f13682a = true;
                }
            }
        }
        this.f13683b = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f13683b);
        sb.append('{');
        ds1 ds1Var = this.f13684c.f13375b;
        String str = "";
        while (ds1Var != null) {
            Object obj = ds1Var.f13374a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            ds1Var = ds1Var.f13375b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
