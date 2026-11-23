package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2256e;

/* JADX INFO: renamed from: c.n.b.d.j.a.vy */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3639vy implements InterfaceC3209kc<C3750yy> {

    /* JADX INFO: renamed from: a */
    public final Context f20961a;

    /* JADX INFO: renamed from: b */
    public final ep2 f20962b;

    /* JADX INFO: renamed from: c */
    public final PowerManager f20963c;

    public C3639vy(Context context, ep2 ep2Var) {
        this.f20961a = context;
        this.f20962b = ep2Var;
        this.f20963c = (PowerManager) context.getSystemService("power");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3209kc
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject mo7491b(C3750yy c3750yy) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        hp2 hp2Var = c3750yy.f22137e;
        if (hp2Var == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.f20962b.f13637b == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = hp2Var.f14925a;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObjectPut = jSONObject3.put("afmaVersion", this.f20962b.f13639d).put("activeViewJSON", this.f20962b.f13637b).put("timestamp", c3750yy.f22135c).put("adFormat", this.f20962b.f13636a).put("hashCode", this.f20962b.f13638c).put("isMraid", false).put("isStopped", false).put("isPaused", c3750yy.f22134b).put("isNative", this.f20962b.f13640e).put("isScreenOn", this.f20963c.isInteractive());
            C2330u c2330u = C2330u.f10884a;
            jSONObjectPut.put("appMuted", c2330u.f10894i.m4733b()).put("appVolume", c2330u.f10894i.m4732a()).put("deviceVolume", C2256e.m4731c(this.f20961a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.f20961a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", hp2Var.f14926b).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", hp2Var.f14927c.top).put("bottom", hp2Var.f14927c.bottom).put("left", hp2Var.f14927c.left).put("right", hp2Var.f14927c.right)).put("adBox", new JSONObject().put("top", hp2Var.f14928d.top).put("bottom", hp2Var.f14928d.bottom).put("left", hp2Var.f14928d.left).put("right", hp2Var.f14928d.right)).put("globalVisibleBox", new JSONObject().put("top", hp2Var.f14929e.top).put("bottom", hp2Var.f14929e.bottom).put("left", hp2Var.f14929e.left).put("right", hp2Var.f14929e.right)).put("globalVisibleBoxVisible", hp2Var.f14930f).put("localVisibleBox", new JSONObject().put("top", hp2Var.f14931g.top).put("bottom", hp2Var.f14931g.bottom).put("left", hp2Var.f14931g.left).put("right", hp2Var.f14931g.right)).put("localVisibleBoxVisible", hp2Var.f14932h).put("hitBox", new JSONObject().put("top", hp2Var.f14933i.top).put("bottom", hp2Var.f14933i.bottom).put("left", hp2Var.f14933i.left).put("right", hp2Var.f14933i.right)).put("screenDensity", this.f20961a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", c3750yy.f22133a);
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14239O0)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = hp2Var.f14935k;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(c3750yy.f22136d)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
