package p007c.p190n.p194b.p266d.p298f.p304r;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.p302q.C2741k;

/* JADX INFO: renamed from: c.n.b.d.f.r.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2775a {

    /* JADX INFO: renamed from: a */
    public final String f11937a;

    /* JADX INFO: renamed from: b */
    public final String f11938b;

    /* JADX INFO: renamed from: c */
    public final int f11939c;

    public C2775a(@RecentlyNonNull String str, @RecentlyNonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sbM1555F = outline.m1555F('[');
            for (String str2 : strArr) {
                if (sbM1555F.length() > 1) {
                    sbM1555F.append(",");
                }
                sbM1555F.append(str2);
            }
            sbM1555F.append("] ");
            string = sbM1555F.toString();
        }
        this.f11938b = string;
        this.f11937a = str;
        new C2741k(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f11937a, i)) {
            i++;
        }
        this.f11939c = i;
    }

    /* JADX INFO: renamed from: a */
    public void m5613a(@RecentlyNonNull String str, Object... objArr) {
        if (this.f11939c <= 3) {
            String str2 = this.f11937a;
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            Log.d(str2, this.f11938b.concat(str));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5614b(@RecentlyNonNull String str, Object... objArr) {
        String str2 = this.f11937a;
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.e(str2, this.f11938b.concat(str));
    }
}
