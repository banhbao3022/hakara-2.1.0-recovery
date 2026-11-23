package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2277l {

    /* JADX INFO: renamed from: a */
    public final Context f10733a;

    /* JADX INFO: renamed from: b */
    public String f10734b;

    /* JADX INFO: renamed from: c */
    public String f10735c;

    /* JADX INFO: renamed from: d */
    public String f10736d;

    /* JADX INFO: renamed from: e */
    public String f10737e;

    /* JADX INFO: renamed from: f */
    public int f10738f;

    /* JADX INFO: renamed from: g */
    public int f10739g;

    /* JADX INFO: renamed from: h */
    public PointF f10740h;

    /* JADX INFO: renamed from: i */
    public PointF f10741i;

    /* JADX INFO: renamed from: j */
    public Handler f10742j;

    /* JADX INFO: renamed from: k */
    public Runnable f10743k;

    public C2277l(Context context) {
        this.f10738f = 0;
        this.f10743k = new Runnable(this) { // from class: c.n.b.d.a.z.b.f

            /* JADX INFO: renamed from: f */
            public final C2277l f10705f;

            {
                this.f10705f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2277l c2277l = this.f10705f;
                c2277l.f10738f = 4;
                c2277l.m4788b();
            }
        };
        this.f10733a = context;
        this.f10739g = ViewConfiguration.get(context).getScaledTouchSlop();
        C2330u c2330u = C2330u.f10884a;
        c2330u.f10903r.m4786a();
        this.f10742j = c2330u.f10903r.f10728b;
    }

    /* JADX INFO: renamed from: a */
    public final void m4787a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f10738f = 0;
            this.f10740h = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.f10738f;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            if (actionMasked == 5) {
                this.f10738f = 5;
                this.f10741i = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.f10742j.postDelayed(this.f10743k, ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14488z2)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !m4789c(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (m4789c(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.f10738f = -1;
            this.f10742j.removeCallbacks(this.f10743k);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4788b() {
        String str;
        try {
            if (!(this.f10733a instanceof Activity)) {
                C2622l.m5458x3("Can not create dialog without Activity Context");
                return;
            }
            C2330u c2330u = C2330u.f10884a;
            C2286o c2286o = c2330u.f10899n;
            synchronized (c2286o.f10755a) {
                str = c2286o.f10757c;
            }
            String str2 = "Creative Preview (Enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative Preview";
            }
            String str3 = true != c2330u.f10899n.m4794c() ? "Troubleshooting" : "Troubleshooting (Enabled)";
            ArrayList arrayList = new ArrayList();
            arrayList.add("Ad Information");
            final int size = arrayList.size() - 1;
            arrayList.add(str2);
            final int size2 = arrayList.size() - 1;
            arrayList.add(str3);
            final int size3 = arrayList.size() - 1;
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f10733a, c2330u.f10891f.mo4724m());
            builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener(this, size, size2, size3) { // from class: c.n.b.d.a.z.b.g

                /* JADX INFO: renamed from: f */
                public final C2277l f10706f;

                /* JADX INFO: renamed from: g */
                public final int f10707g;

                /* JADX INFO: renamed from: h */
                public final int f10708h;

                /* JADX INFO: renamed from: i */
                public final int f10709i;

                {
                    this.f10706f = this;
                    this.f10707g = size;
                    this.f10708h = size2;
                    this.f10709i = size3;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x007e  */
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    final String strTrim;
                    final C2277l c2277l = this.f10706f;
                    int i2 = this.f10707g;
                    int i3 = this.f10708h;
                    int i4 = this.f10709i;
                    Objects.requireNonNull(c2277l);
                    if (i != i2) {
                        if (i == i3) {
                            C2622l.m5318U2("Debug mode [Creative Preview] selected.");
                            C2962do.f13330a.execute(new Runnable(c2277l) { // from class: c.n.b.d.a.z.b.j

                                /* JADX INFO: renamed from: f */
                                public final C2277l f10726f;

                                {
                                    this.f10726f = c2277l;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    C2277l c2277l2 = this.f10726f;
                                    Objects.requireNonNull(c2277l2);
                                    C2286o c2286o2 = C2330u.f10884a.f10899n;
                                    Context context = c2277l2.f10733a;
                                    String str4 = c2277l2.f10735c;
                                    String str5 = c2277l2.f10736d;
                                    Objects.requireNonNull(c2286o2);
                                    String strM4791e = C2286o.m4791e(context, c2286o2.m4797g(context, (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14159B2), str4, str5).toString(), str5);
                                    if (TextUtils.isEmpty(strM4791e)) {
                                        C2622l.m5318U2("Not linked for in app preview.");
                                    } else {
                                        try {
                                            JSONObject jSONObject = new JSONObject(strM4791e.trim());
                                            String strOptString = jSONObject.optString("gct");
                                            c2286o2.f10759e = jSONObject.optString("status");
                                            synchronized (c2286o2.f10755a) {
                                                c2286o2.f10757c = strOptString;
                                            }
                                            if ("2".equals(c2286o2.f10759e)) {
                                                C2622l.m5318U2("Creative is not pushed for this device.");
                                                c2286o2.m4795d(context, "There was no creative pushed from DFP to the device.", false, false);
                                                return;
                                            } else if ("1".equals(c2286o2.f10759e)) {
                                                C2622l.m5318U2("The app is not linked for creative preview.");
                                                c2286o2.m4796f(context, str4, str5);
                                                return;
                                            } else {
                                                if ("0".equals(c2286o2.f10759e)) {
                                                    C2622l.m5318U2("Device is linked for in app preview.");
                                                    c2286o2.m4795d(context, "The device is successfully linked for creative preview.", false, true);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (JSONException e) {
                                            C2622l.m5241D3("Fail to get in app preview response json.", e);
                                        }
                                    }
                                    c2286o2.m4795d(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                }
                            });
                            return;
                        } else {
                            if (i == i4) {
                                C2622l.m5318U2("Debug mode [Troubleshooting] selected.");
                                C2962do.f13330a.execute(new Runnable(c2277l) { // from class: c.n.b.d.a.z.b.k

                                    /* JADX INFO: renamed from: f */
                                    public final C2277l f10731f;

                                    {
                                        this.f10731f = c2277l;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C2277l c2277l2 = this.f10731f;
                                        Objects.requireNonNull(c2277l2);
                                        C2286o c2286o2 = C2330u.f10884a.f10899n;
                                        Context context = c2277l2.f10733a;
                                        String str4 = c2277l2.f10735c;
                                        String str5 = c2277l2.f10736d;
                                        String str6 = c2277l2.f10737e;
                                        boolean zM4794c = c2286o2.m4794c();
                                        String strM4791e = C2286o.m4791e(context, c2286o2.m4797g(context, (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14166C2), str4, str5).toString(), str5);
                                        if (TextUtils.isEmpty(strM4791e)) {
                                            C2622l.m5318U2("Not linked for debug signals.");
                                        } else {
                                            try {
                                                boolean zEquals = "1".equals(new JSONObject(strM4791e.trim()).optString("debug_mode"));
                                                synchronized (c2286o2.f10755a) {
                                                    c2286o2.f10758d = zEquals;
                                                }
                                                if (zEquals) {
                                                    if (!zM4794c && !TextUtils.isEmpty(str6)) {
                                                        c2286o2.m4793b(context, str5, str6, str4);
                                                    }
                                                    C2622l.m5318U2("Device is linked for debug signals.");
                                                    c2286o2.m4795d(context, "The device is successfully linked for troubleshooting.", false, true);
                                                    return;
                                                }
                                            } catch (JSONException e) {
                                                C2622l.m5241D3("Fail to get debug mode response json.", e);
                                            }
                                        }
                                        c2286o2.m4796f(context, str4, str5);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                    }
                    if (!(c2277l.f10733a instanceof Activity)) {
                        C2622l.m5458x3("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c2277l.f10734b;
                    if (TextUtils.isEmpty(str4)) {
                        strTrim = "No debug information";
                    } else {
                        Uri uriBuild = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                        Map<String, String> mapM4754m = C2267h1.m4754m(uriBuild);
                        for (String str5 : mapM4754m.keySet()) {
                            sb.append(str5);
                            sb.append(" = ");
                            sb.append(mapM4754m.get(str5));
                            sb.append("\n\n");
                        }
                        strTrim = sb.toString().trim();
                        if (TextUtils.isEmpty(strTrim)) {
                            strTrim = "No debug information";
                        }
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(c2277l.f10733a);
                    builder2.setMessage(strTrim);
                    builder2.setTitle("Ad Information");
                    builder2.setPositiveButton("Share", new DialogInterface.OnClickListener(c2277l, strTrim) { // from class: c.n.b.d.a.z.b.h

                        /* JADX INFO: renamed from: f */
                        public final C2277l f10711f;

                        /* JADX INFO: renamed from: g */
                        public final String f10712g;

                        {
                            this.f10711f = c2277l;
                            this.f10712g = strTrim;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface2, int i5) {
                            C2277l c2277l2 = this.f10711f;
                            String str6 = this.f10712g;
                            Objects.requireNonNull(c2277l2);
                            C2267h1 c2267h2 = C2330u.f10884a.f10889d;
                            C2267h1.m4752k(c2277l2.f10733a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str6), "Share via"));
                        }
                    });
                    builder2.setNegativeButton("Close", DialogInterfaceOnClickListenerC2268i.f10723f);
                    builder2.create().show();
                }
            });
            builder.create().show();
        } catch (WindowManager.BadTokenException e) {
            C2096e.m4554C("", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4789c(float f, float f2, float f3, float f4) {
        return Math.abs(this.f10740h.x - f) < ((float) this.f10739g) && Math.abs(this.f10740h.y - f2) < ((float) this.f10739g) && Math.abs(this.f10741i.x - f3) < ((float) this.f10739g) && Math.abs(this.f10741i.y - f4) < ((float) this.f10739g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.f10734b);
        sb.append(",DebugSignal: ");
        sb.append(this.f10737e);
        sb.append(",AFMA Version: ");
        sb.append(this.f10736d);
        sb.append(",Ad Unit ID: ");
        return outline.m1550A(sb, this.f10735c, "}");
    }

    public C2277l(Context context, String str) {
        this(context);
        this.f10734b = str;
    }
}
