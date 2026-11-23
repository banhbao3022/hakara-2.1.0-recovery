package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.p309v.C2793b;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p636z0.p725k.p738k.Pair;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 {

    /* JADX INFO: renamed from: a */
    public final Context f17236a;

    /* JADX INFO: renamed from: b */
    public final ApplicationInfo f17237b;

    /* JADX INFO: renamed from: c */
    public final int f17238c;

    /* JADX INFO: renamed from: d */
    public final int f17239d;

    /* JADX INFO: renamed from: e */
    public String f17240e = "";

    public nq0(Context context) {
        this.f17236a = context;
        this.f17237b = context.getApplicationInfo();
        AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14491z5;
        C2862b c2862b = C2862b.f12493a;
        this.f17238c = ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue();
        this.f17239d = ((Integer) c2862b.f12496d.m6596a(C3052g3.f14155A5)).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final JSONObject m7929a() throws JSONException {
        Drawable drawable;
        String strEncodeToString;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", C2794c.m5637a(this.f17236a).m5634b(this.f17237b.packageName));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.f17237b.packageName);
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        jSONObject.put("adMobAppId", C2267h1.m4738H(this.f17236a));
        if (this.f17240e.isEmpty()) {
            try {
                C2793b c2793bM5637a = C2794c.m5637a(this.f17236a);
                ApplicationInfo applicationInfo = c2793bM5637a.f11958a.getPackageManager().getApplicationInfo(this.f17237b.packageName, 0);
                drawable = (Drawable) new Pair(c2793bM5637a.f11958a.getPackageManager().getApplicationLabel(applicationInfo), c2793bM5637a.f11958a.getPackageManager().getApplicationIcon(applicationInfo)).f37972b;
            } catch (PackageManager.NameNotFoundException unused2) {
                drawable = null;
            }
            if (drawable == null) {
                strEncodeToString = "";
            } else {
                drawable.setBounds(0, 0, this.f17238c, this.f17239d);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f17238c, this.f17239d, Bitmap.Config.ARGB_8888);
                drawable.draw(new Canvas(bitmapCreateBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.f17240e = strEncodeToString;
        }
        if (!this.f17240e.isEmpty()) {
            jSONObject.put("icon", this.f17240e);
            jSONObject.put("iconWidthPx", this.f17238c);
            jSONObject.put("iconHeightPx", this.f17239d);
        }
        return jSONObject;
    }
}
