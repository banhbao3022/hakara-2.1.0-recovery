package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2254d0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2257e0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 {

    /* JADX INFO: renamed from: a */
    public final Context f21889a;

    /* JADX INFO: renamed from: b */
    public final ki0 f21890b;

    /* JADX INFO: renamed from: c */
    public final rd2 f21891c;

    /* JADX INFO: renamed from: d */
    public final C3702xn f21892d;

    /* JADX INFO: renamed from: e */
    public final C2312c f21893e;

    /* JADX INFO: renamed from: f */
    public final as2 f21894f;

    /* JADX INFO: renamed from: g */
    public final Executor f21895g;

    /* JADX INFO: renamed from: h */
    public final C3165j5 f21896h;

    /* JADX INFO: renamed from: i */
    public final rj0 f21897i;

    /* JADX INFO: renamed from: j */
    public final ScheduledExecutorService f21898j;

    public yi0(Context context, ki0 ki0Var, rd2 rd2Var, C3702xn c3702xn, C2312c c2312c, as2 as2Var, Executor executor, ii1 ii1Var, rj0 rj0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f21889a = context;
        this.f21890b = ki0Var;
        this.f21891c = rd2Var;
        this.f21892d = c3702xn;
        this.f21893e = c2312c;
        this.f21894f = as2Var;
        this.f21895g = executor;
        this.f21896h = ii1Var.f15196i;
        this.f21897i = rj0Var;
        this.f21898j = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: c */
    public static Integer m8796c(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static kv1 m8797d(boolean z, final kv1 kv1Var) {
        return z ? cw0.m6249s(kv1Var, new qu1(kv1Var) { // from class: c.n.b.d.j.a.wi0

            /* JADX INFO: renamed from: a */
            public final kv1 f21132a;

            {
                this.f21132a = kv1Var;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
            /* JADX INFO: renamed from: a */
            public final kv1 mo4612a(Object obj) {
                return obj != null ? this.f21132a : new gv1(new s01(1, "Retrieve required value in native ad response failed."));
            }
        }, C2962do.f13335f) : cw0.m6247q(kv1Var, Exception.class, new vi0(), C2962do.f13335f);
    }

    /* JADX INFO: renamed from: e */
    public static final BinderC3606v1 m8798e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("reason");
        String strOptString2 = jSONObject.optString("ping_url");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return null;
        }
        return new BinderC3606v1(strOptString, strOptString2);
    }

    /* JADX INFO: renamed from: a */
    public final kv1<List<BinderC3091h5>> m8799a(JSONArray jSONArray, boolean z, boolean z2) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return cw0.m6231a(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = z2 ? jSONArray.length() : 1;
        for (int i = 0; i < length; i++) {
            arrayList.add(m8800b(jSONArray.optJSONObject(i), z));
        }
        ns1<Object> ns1Var = ts1.f19979g;
        return cw0.m6250t(new ru1(ts1.m8449u(arrayList)), qi0.f18305a, this.f21895g);
    }

    /* JADX INFO: renamed from: b */
    public final kv1<BinderC3091h5> m8800b(JSONObject jSONObject, boolean z) {
        if (jSONObject == null) {
            return cw0.m6231a(null);
        }
        final String strOptString = jSONObject.optString("url");
        if (TextUtils.isEmpty(strOptString)) {
            return cw0.m6231a(null);
        }
        final double dOptDouble = jSONObject.optDouble("scale", 1.0d);
        boolean zOptBoolean = jSONObject.optBoolean("is_transparent", true);
        final int iOptInt = jSONObject.optInt("width", -1);
        final int iOptInt2 = jSONObject.optInt("height", -1);
        if (z) {
            return cw0.m6231a(new BinderC3091h5(null, Uri.parse(strOptString), dOptDouble, iOptInt, iOptInt2));
        }
        ki0 ki0Var = this.f21890b;
        Objects.requireNonNull(ki0Var.f15950a);
        C3147io c3147io = new C3147io();
        C2257e0.f10703a.m7771b(new C2254d0(strOptString, null, c3147io));
        return m8797d(jSONObject.optBoolean("require"), cw0.m6250t(cw0.m6250t(c3147io, new ji0(ki0Var, dOptDouble, zOptBoolean), ki0Var.f15952c), new cs1(strOptString, dOptDouble, iOptInt, iOptInt2) { // from class: c.n.b.d.j.a.ri0

            /* JADX INFO: renamed from: a */
            public final String f18837a;

            /* JADX INFO: renamed from: b */
            public final double f18838b;

            /* JADX INFO: renamed from: c */
            public final int f18839c;

            /* JADX INFO: renamed from: d */
            public final int f18840d;

            {
                this.f18837a = strOptString;
                this.f18838b = dOptDouble;
                this.f18839c = iOptInt;
                this.f18840d = iOptInt2;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.cs1
            public final Object apply(Object obj) {
                String str = this.f18837a;
                return new BinderC3091h5(new BitmapDrawable(Resources.getSystem(), (Bitmap) obj), Uri.parse(str), this.f18838b, this.f18839c, this.f18840d);
            }
        }, this.f21895g));
    }
}
