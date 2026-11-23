package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.StringTokenizer;
import p007c.p190n.p194b.p266d.p267a.C2191r;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class iw2 {

    /* JADX INFO: renamed from: a */
    public static final iw2 f15412a = new iw2();

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:53:0x0105  */
    /* JADX INFO: renamed from: a */
    public final ew2 m7314a(Context context, C3346o1 c3346o1) {
        boolean z;
        String str;
        String className;
        Date date = c3346o1.f17484a;
        long time = date != null ? date.getTime() : -1L;
        int i = c3346o1.f17486c;
        Set<String> set = c3346o1.f17487d;
        List listUnmodifiableList = !set.isEmpty() ? Collections.unmodifiableList(new ArrayList(set)) : null;
        C2191r c2191r = C3494s1.m8336a().f19440g;
        C3331nn c3331nn = gx2.f14692a.f14693b;
        String strM7894l = C3331nn.m7894l(context);
        int i2 = 0;
        if (c3346o1.f17492i.contains(strM7894l)) {
            z = true;
        } else {
            Objects.requireNonNull(c2191r);
            if (new ArrayList(c2191r.f10584d).contains(strM7894l)) {
                z = true;
            } else {
                z = false;
            }
        }
        Location location = c3346o1.f17488e;
        Bundle bundle = c3346o1.f17489f.getBundle(AdMobAdapter.class.getName());
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            while (true) {
                int i3 = i2 + 1;
                if (i3 >= stackTrace.length) {
                    className = null;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                String className2 = stackTraceElement.getClassName();
                if ("loadAd".equalsIgnoreCase(stackTraceElement.getMethodName()) && (C3331nn.f17167b.equalsIgnoreCase(className2) || C3331nn.f17168c.equalsIgnoreCase(className2) || C3331nn.f17169d.equalsIgnoreCase(className2) || C3331nn.f17170e.equalsIgnoreCase(className2) || C3331nn.f17171f.equalsIgnoreCase(className2) || C3331nn.f17172g.equalsIgnoreCase(className2))) {
                    className = stackTrace[i3].getClassName();
                    break;
                }
                i2 = i3;
            }
            if (packageName != null) {
                StringTokenizer stringTokenizer = new StringTokenizer(packageName, ".");
                StringBuilder sb = new StringBuilder();
                if (stringTokenizer.hasMoreElements()) {
                    sb.append(stringTokenizer.nextToken());
                    int i4 = 2;
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 <= 0 || !stringTokenizer.hasMoreElements()) {
                            break;
                        }
                        sb.append(".");
                        sb.append(stringTokenizer.nextToken());
                        i4 = i5;
                    }
                    packageName = sb.toString();
                }
                if (className == null || className.contains(packageName)) {
                    className = null;
                }
            } else {
                className = null;
            }
            str = className;
        } else {
            str = null;
        }
        boolean z2 = c3346o1.f17495l;
        C2191r c2191r2 = C3494s1.m8336a().f19440g;
        return new ew2(8, time, bundle, i, listUnmodifiableList, z, Math.max(c3346o1.f17491h, c2191r2.f10582b), false, null, null, location, null, c3346o1.f17489f, c3346o1.f17493j, Collections.unmodifiableList(new ArrayList(c3346o1.f17494k)), null, str, z2, null, Math.max(-1, c2191r2.f10583c), (String) Collections.max(Arrays.asList(null, ""), hw2.f15042f), new ArrayList(c3346o1.f17485b), c3346o1.f17496m);
    }
}
