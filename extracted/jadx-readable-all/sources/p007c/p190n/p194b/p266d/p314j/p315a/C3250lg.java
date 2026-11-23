package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.lg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3250lg extends C3287mg implements InterfaceC3464r8<InterfaceC3410ps> {

    /* JADX INFO: renamed from: c */
    public final InterfaceC3410ps f16334c;

    /* JADX INFO: renamed from: d */
    public final Context f16335d;

    /* JADX INFO: renamed from: e */
    public final WindowManager f16336e;

    /* JADX INFO: renamed from: f */
    public final C3458r2 f16337f;

    /* JADX INFO: renamed from: g */
    public DisplayMetrics f16338g;

    /* JADX INFO: renamed from: h */
    public float f16339h;

    /* JADX INFO: renamed from: i */
    public int f16340i;

    /* JADX INFO: renamed from: j */
    public int f16341j;

    /* JADX INFO: renamed from: k */
    public int f16342k;

    /* JADX INFO: renamed from: l */
    public int f16343l;

    /* JADX INFO: renamed from: m */
    public int f16344m;

    /* JADX INFO: renamed from: n */
    public int f16345n;

    /* JADX INFO: renamed from: o */
    public int f16346o;

    public C3250lg(InterfaceC3410ps interfaceC3410ps, Context context, C3458r2 c3458r2) {
        super(interfaceC3410ps, "");
        this.f16340i = -1;
        this.f16341j = -1;
        this.f16343l = -1;
        this.f16344m = -1;
        this.f16345n = -1;
        this.f16346o = -1;
        this.f16334c = interfaceC3410ps;
        this.f16335d = context;
        this.f16337f = c3458r2;
        this.f16336e = (WindowManager) context.getSystemService("window");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC3410ps interfaceC3410ps, Map map) {
        JSONObject jSONObjectPut;
        this.f16338g = new DisplayMetrics();
        Display defaultDisplay = this.f16336e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.f16338g);
        this.f16339h = this.f16338g.density;
        this.f16342k = defaultDisplay.getRotation();
        gx2 gx2Var = gx2.f14692a;
        C3331nn c3331nn = gx2Var.f14693b;
        DisplayMetrics displayMetrics = this.f16338g;
        this.f16340i = Math.round(displayMetrics.widthPixels / displayMetrics.density);
        C3331nn c3331nn2 = gx2Var.f14693b;
        DisplayMetrics displayMetrics2 = this.f16338g;
        this.f16341j = Math.round(displayMetrics2.heightPixels / displayMetrics2.density);
        Activity activityMo6482h = this.f16334c.mo6482h();
        if (activityMo6482h == null || activityMo6482h.getWindow() == null) {
            this.f16343l = this.f16340i;
            this.f16344m = this.f16341j;
        } else {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            int[] iArrM4756o = C2267h1.m4756o(activityMo6482h);
            C3331nn c3331nn3 = gx2Var.f14693b;
            this.f16343l = C3331nn.m7891i(this.f16338g, iArrM4756o[0]);
            C3331nn c3331nn4 = gx2Var.f14693b;
            this.f16344m = C3331nn.m7891i(this.f16338g, iArrM4756o[1]);
        }
        if (this.f16334c.mo6500r().m6689d()) {
            this.f16345n = this.f16340i;
            this.f16346o = this.f16341j;
        } else {
            this.f16334c.measure(0, 0);
        }
        m7696e(this.f16340i, this.f16341j, this.f16343l, this.f16344m, this.f16339h, this.f16342k);
        C3213kg c3213kg = new C3213kg();
        C3458r2 c3458r2 = this.f16337f;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        c3213kg.f15936b = c3458r2.m8244c(intent);
        C3458r2 c3458r3 = this.f16337f;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        c3213kg.f15935a = c3458r3.m8244c(intent2);
        c3213kg.f15937c = this.f16337f.m8243b();
        boolean zM8242a = this.f16337f.m8242a();
        c3213kg.f15938d = zM8242a;
        c3213kg.f15939e = true;
        boolean z = c3213kg.f15935a;
        boolean z2 = c3213kg.f15936b;
        boolean z3 = c3213kg.f15937c;
        InterfaceC3410ps interfaceC3410ps2 = this.f16334c;
        try {
            jSONObjectPut = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", zM8242a).put("inlineVideo", true);
        } catch (JSONException e) {
            C2622l.m5438t3("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObjectPut = null;
        }
        interfaceC3410ps2.mo6433B0("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        this.f16334c.getLocationOnScreen(iArr);
        gx2 gx2Var2 = gx2.f14692a;
        m7587f(gx2Var2.f14693b.m7896a(this.f16335d, iArr[0]), gx2Var2.f14693b.m7896a(this.f16335d, iArr[1]));
        if (C2622l.m5281L3(2)) {
            C2622l.m5458x3("Dispatching Ready Event.");
        }
        try {
            this.f16745a.mo6433B0("onReadyEventReceived", new JSONObject().put("js", this.f16334c.mo6495o().f21615f));
        } catch (JSONException e2) {
            C2622l.m5438t3("Error occurred while dispatching ready Event.", e2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006e A[PHI: r1
  0x006e: PHI (r1v5 int) = (r1v4 int), (r1v10 int) binds: [B:11:0x0045, B:17:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: f */
    public final void m7587f(int i, int i2) {
        int i3;
        Context context = this.f16335d;
        int i4 = 0;
        if (context instanceof Activity) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            i3 = C2267h1.m4757p((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.f16334c.mo6500r() == null || !this.f16334c.mo6500r().m6689d()) {
            int width = this.f16334c.getWidth();
            int height = this.f16334c.getHeight();
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14208J)).booleanValue()) {
                if (width == 0) {
                    width = this.f16334c.mo6500r() != null ? this.f16334c.mo6500r().f13693c : 0;
                }
                if (height != 0) {
                    i4 = height;
                } else if (this.f16334c.mo6500r() != null) {
                    i4 = this.f16334c.mo6500r().f13692b;
                }
            } else {
                i4 = height;
            }
            gx2 gx2Var = gx2.f14692a;
            this.f16345n = gx2Var.f14693b.m7896a(this.f16335d, width);
            this.f16346o = gx2Var.f14693b.m7896a(this.f16335d, i4);
        }
        int i5 = i2 - i3;
        try {
            this.f16745a.mo6433B0("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i5).put("width", this.f16345n).put("height", this.f16346o));
        } catch (JSONException e) {
            C2622l.m5438t3("Error occurred while dispatching default position.", e);
        }
        C3065gg c3065gg = ((C3670ws) this.f16334c.mo6459O0()).f21343y;
        if (c3065gg != null) {
            c3065gg.f14555e = i;
            c3065gg.f14556f = i2;
        }
    }
}
