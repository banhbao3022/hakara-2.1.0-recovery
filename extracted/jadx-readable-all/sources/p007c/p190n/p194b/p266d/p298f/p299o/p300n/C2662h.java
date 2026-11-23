package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p266d.p298f.p302q.C2748n0;
import p007c.p190n.p194b.p266d.p298f.p302q.C2765w;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C2662h {

    /* JADX INFO: renamed from: a */
    public static final Object f11694a = new Object();

    /* JADX INFO: renamed from: b */
    public static C2662h f11695b;

    /* JADX INFO: renamed from: c */
    public final String f11696c;

    /* JADX INFO: renamed from: d */
    public final Status f11697d;

    /* JADX INFO: renamed from: e */
    public final boolean f11698e;

    public C2662h(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        if (identifier != 0) {
            this.f11698e = resources.getInteger(identifier) == 0;
        } else {
            this.f11698e = false;
        }
        C2748n0.m5606a(context);
        String strM5611a = C2748n0.f11891c;
        strM5611a = strM5611a == null ? new C2765w(context).m5611a("google_app_id") : strM5611a;
        if (TextUtils.isEmpty(strM5611a)) {
            this.f11697d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f11696c = null;
        } else {
            this.f11696c = strM5611a;
            this.f11697d = Status.f28648f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C2662h m5537a(String str) {
        C2662h c2662h;
        synchronized (f11694a) {
            c2662h = f11695b;
            if (c2662h == null) {
                StringBuilder sb = new StringBuilder(str.length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return c2662h;
    }
}
