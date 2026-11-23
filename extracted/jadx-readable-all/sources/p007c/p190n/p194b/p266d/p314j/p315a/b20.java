package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class b20 extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: f */
    public final Context f12504f;

    /* JADX INFO: renamed from: g */
    public View f12505g;

    public b20(Context context) {
        super(context);
        this.f12504f = context;
    }

    /* JADX INFO: renamed from: a */
    public static b20 m5917a(Context context, View view, rh1 rh1Var) {
        Resources resources;
        DisplayMetrics displayMetrics;
        b20 b20Var = new b20(context);
        if (!rh1Var.f18829t.isEmpty() && (resources = b20Var.f12504f.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            sh1 sh1Var = rh1Var.f18829t.get(0);
            float f = sh1Var.f19563a;
            float f2 = displayMetrics.density;
            b20Var.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (sh1Var.f19564b * f2)));
        }
        b20Var.f12505g = view;
        b20Var.addView(view);
        C2330u c2330u = C2330u.f10884a;
        C3443qo c3443qo = c2330u.f10886B;
        C3443qo.m8221b(b20Var, b20Var);
        C3443qo c3443qo2 = c2330u.f10886B;
        C3443qo.m8220a(b20Var, b20Var);
        JSONObject jSONObject = rh1Var.f18808c0;
        RelativeLayout relativeLayout = new RelativeLayout(b20Var.f12504f);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("header");
        if (jSONObjectOptJSONObject != null) {
            b20Var.m5918b(jSONObjectOptJSONObject, relativeLayout, 10);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("footer");
        if (jSONObjectOptJSONObject2 != null) {
            b20Var.m5918b(jSONObjectOptJSONObject2, relativeLayout, 12);
        }
        b20Var.addView(relativeLayout);
        return b20Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m5918b(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.f12504f);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        double dOptDouble = jSONObject.optDouble("padding", 0.0d);
        C3331nn c3331nn = gx2.f14692a.f14693b;
        int iM7893k = C3331nn.m7893k(this.f12504f, (int) dOptDouble);
        textView.setPadding(0, iM7893k, 0, iM7893k);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C3331nn.m7893k(this.f12504f, (int) jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f12505g.setY(-iArr[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        this.f12505g.setY(-iArr[1]);
    }
}
