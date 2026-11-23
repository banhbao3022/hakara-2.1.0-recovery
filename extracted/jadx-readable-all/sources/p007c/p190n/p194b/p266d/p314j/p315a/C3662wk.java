package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2257e0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.j.a.wk */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3662wk implements InterfaceC2884bl {

    /* JADX INFO: renamed from: a */
    public static final List<Future<Void>> f21234a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: b */
    public final ib2 f21235b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap<String, ec2> f21236c;

    /* JADX INFO: renamed from: f */
    public final Context f21239f;

    /* JADX INFO: renamed from: g */
    public boolean f21240g;

    /* JADX INFO: renamed from: h */
    public final C3773zk f21241h;

    /* JADX INFO: renamed from: d */
    public final List<String> f21237d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final List<String> f21238e = new ArrayList();

    /* JADX INFO: renamed from: i */
    public final Object f21242i = new Object();

    /* JADX INFO: renamed from: j */
    public HashSet<String> f21243j = new HashSet<>();

    /* JADX INFO: renamed from: k */
    public boolean f21244k = false;

    /* JADX INFO: renamed from: l */
    public boolean f21245l = false;

    public C3662wk(Context context, C3702xn c3702xn, C3773zk c3773zk, String str, C3736yk c3736yk, byte[] bArr) {
        C2622l.m5379i(c3773zk, "SafeBrowsing config is not present.");
        this.f21239f = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f21236c = new LinkedHashMap<>();
        this.f21241h = c3773zk;
        Iterator<String> it = c3773zk.f22314j.iterator();
        while (it.hasNext()) {
            this.f21243j.add(it.next().toLowerCase(Locale.ENGLISH));
        }
        this.f21243j.remove("cookie".toLowerCase(Locale.ENGLISH));
        ib2 ib2VarM7241z = ic2.m7241z();
        bc2 bc2Var = bc2.OCTAGON_AD;
        if (ib2VarM7241z.f13191h) {
            ib2VarM7241z.m6298m();
            ib2VarM7241z.f13191h = false;
        }
        ic2.m7230B((ic2) ib2VarM7241z.f13190g, bc2Var);
        if (ib2VarM7241z.f13191h) {
            ib2VarM7241z.m6298m();
            ib2VarM7241z.f13191h = false;
        }
        ic2.m7231C((ic2) ib2VarM7241z.f13190g, str);
        if (ib2VarM7241z.f13191h) {
            ib2VarM7241z.m6298m();
            ib2VarM7241z.f13191h = false;
        }
        ic2.m7232D((ic2) ib2VarM7241z.f13190g, str);
        jb2 jb2VarM7488v = kb2.m7488v();
        String str2 = this.f21241h.f22310f;
        if (str2 != null) {
            if (jb2VarM7488v.f13191h) {
                jb2VarM7488v.m6298m();
                jb2VarM7488v.f13191h = false;
            }
            kb2.m7490y((kb2) jb2VarM7488v.f13190g, str2);
        }
        kb2 kb2VarM6300o = jb2VarM7488v.m6300o();
        if (ib2VarM7241z.f13191h) {
            ib2VarM7241z.m6298m();
            ib2VarM7241z.f13191h = false;
        }
        ic2.m7233E((ic2) ib2VarM7241z.f13190g, kb2VarM6300o);
        gc2 gc2VarM7111v = hc2.m7111v();
        boolean zM5636d = C2794c.m5637a(this.f21239f).m5636d();
        if (gc2VarM7111v.f13191h) {
            gc2VarM7111v.m6298m();
            gc2VarM7111v.f13191h = false;
        }
        hc2.m7110A((hc2) gc2VarM7111v.f13190g, zM5636d);
        String str3 = c3702xn.f21615f;
        if (str3 != null) {
            if (gc2VarM7111v.f13191h) {
                gc2VarM7111v.m6298m();
                gc2VarM7111v.f13191h = false;
            }
            hc2.m7113y((hc2) gc2VarM7111v.f13190g, str3);
        }
        long jM5212a = C2610f.f11568b.m5212a(this.f21239f);
        if (jM5212a > 0) {
            if (gc2VarM7111v.f13191h) {
                gc2VarM7111v.m6298m();
                gc2VarM7111v.f13191h = false;
            }
            hc2.m7114z((hc2) gc2VarM7111v.f13190g, jM5212a);
        }
        hc2 hc2VarM6300o = gc2VarM7111v.m6300o();
        if (ib2VarM7241z.f13191h) {
            ib2VarM7241z.m6298m();
            ib2VarM7241z.f13191h = false;
        }
        ic2.m7238J((ic2) ib2VarM7241z.f13190g, hc2VarM6300o);
        this.f21235b = ib2VarM7241z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2884bl
    /* JADX INFO: renamed from: a */
    public final void mo6034a(View view) {
        Bitmap bitmapCreateBitmap;
        if (this.f21241h.f22312h && !this.f21244k) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            final Bitmap bitmap = null;
            if (view != null) {
                try {
                    boolean zIsDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmapCreateBitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                    try {
                        view.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
                    } catch (RuntimeException e) {
                        e = e;
                        C2622l.m5438t3("Fail to capture the web view", e);
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    bitmapCreateBitmap = null;
                }
                if (bitmapCreateBitmap == null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width == 0 || height == 0) {
                            C2622l.m5226A3("Width or height of view is zero");
                        } else {
                            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(bitmapCreateBitmap2);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap = bitmapCreateBitmap2;
                        }
                    } catch (RuntimeException e3) {
                        C2622l.m5438t3("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap = bitmapCreateBitmap;
                }
            }
            if (bitmap == null) {
                C2622l.m5346b1("Failed to capture the webview bitmap.");
                return;
            }
            this.f21244k = true;
            Runnable runnable = new Runnable(this, bitmap) { // from class: c.n.b.d.j.a.rk

                /* JADX INFO: renamed from: f */
                public final C3662wk f18910f;

                /* JADX INFO: renamed from: g */
                public final Bitmap f18911g;

                {
                    this.f18910f = this;
                    this.f18911g = bitmap;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C3662wk c3662wk = this.f18910f;
                    Bitmap bitmap2 = this.f18911g;
                    Objects.requireNonNull(c3662wk);
                    g72 g72Var = g72.f14513f;
                    f72 f72Var = new f72(128);
                    bitmap2.compress(Bitmap.CompressFormat.PNG, 0, f72Var);
                    synchronized (c3662wk.f21242i) {
                        ib2 ib2Var = c3662wk.f21235b;
                        wb2 wb2VarM8876v = zb2.m8876v();
                        g72 g72VarM6780a = f72Var.m6780a();
                        if (wb2VarM8876v.f13191h) {
                            wb2VarM8876v.m6298m();
                            wb2VarM8876v.f13191h = false;
                        }
                        zb2.m8875A((zb2) wb2VarM8876v.f13190g, g72VarM6780a);
                        if (wb2VarM8876v.f13191h) {
                            wb2VarM8876v.m6298m();
                            wb2VarM8876v.f13191h = false;
                        }
                        zb2.m8879z((zb2) wb2VarM8876v.f13190g);
                        yb2 yb2Var = yb2.TYPE_CREATIVE;
                        if (wb2VarM8876v.f13191h) {
                            wb2VarM8876v.m6298m();
                            wb2VarM8876v.f13191h = false;
                        }
                        zb2.m8878y((zb2) wb2VarM8876v.f13190g, yb2Var);
                        zb2 zb2VarM6300o = wb2VarM8876v.m6300o();
                        if (ib2Var.f13191h) {
                            ib2Var.m6298m();
                            ib2Var.f13191h = false;
                        }
                        ic2.m7237I((ic2) ib2Var.f13190g, zb2VarM6300o);
                    }
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                C2962do.f13330a.execute(runnable);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2884bl
    /* JADX INFO: renamed from: b */
    public final boolean mo6035b() {
        return this.f21241h.f22312h && !this.f21244k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2884bl
    /* JADX INFO: renamed from: c */
    public final void mo6036c(String str, Map<String, String> map, int i) {
        synchronized (this.f21242i) {
            if (i == 3) {
                this.f21245l = true;
            }
            if (this.f21236c.containsKey(str)) {
                if (i == 3) {
                    ec2 ec2Var = this.f21236c.get(str);
                    dc2 dc2VarM6353f = dc2.m6353f(3);
                    if (ec2Var.f13191h) {
                        ec2Var.m6298m();
                        ec2Var.f13191h = false;
                    }
                    fc2.m6791D((fc2) ec2Var.f13190g, dc2VarM6353f);
                }
                return;
            }
            ec2 ec2VarM6793y = fc2.m6793y();
            dc2 dc2VarM6353f2 = dc2.m6353f(i);
            if (dc2VarM6353f2 != null) {
                if (ec2VarM6793y.f13191h) {
                    ec2VarM6793y.m6298m();
                    ec2VarM6793y.f13191h = false;
                }
                fc2.m6791D((fc2) ec2VarM6793y.f13190g, dc2VarM6353f2);
            }
            int size = this.f21236c.size();
            if (ec2VarM6793y.f13191h) {
                ec2VarM6793y.m6298m();
                ec2VarM6793y.f13191h = false;
            }
            fc2.m6788A((fc2) ec2VarM6793y.f13190g, size);
            if (ec2VarM6793y.f13191h) {
                ec2VarM6793y.m6298m();
                ec2VarM6793y.f13191h = false;
            }
            fc2.m6789B((fc2) ec2VarM6793y.f13190g, str);
            nb2 nb2VarM8198v = qb2.m8198v();
            if (this.f21243j.size() > 0 && map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey() != null ? entry.getKey() : "";
                    String value = entry.getValue() != null ? entry.getValue() : "";
                    if (this.f21243j.contains(key.toLowerCase(Locale.ENGLISH))) {
                        lb2 lb2VarM7684v = mb2.m7684v();
                        g72 g72VarM6941K = g72.m6941K(key);
                        if (lb2VarM7684v.f13191h) {
                            lb2VarM7684v.m6298m();
                            lb2VarM7684v.f13191h = false;
                        }
                        mb2.m7686y((mb2) lb2VarM7684v.f13190g, g72VarM6941K);
                        g72 g72VarM6941K2 = g72.m6941K(value);
                        if (lb2VarM7684v.f13191h) {
                            lb2VarM7684v.m6298m();
                            lb2VarM7684v.f13191h = false;
                        }
                        mb2.m7687z((mb2) lb2VarM7684v.f13190g, g72VarM6941K2);
                        mb2 mb2VarM6300o = lb2VarM7684v.m6300o();
                        if (nb2VarM8198v.f13191h) {
                            nb2VarM8198v.m6298m();
                            nb2VarM8198v.f13191h = false;
                        }
                        qb2.m8200y((qb2) nb2VarM8198v.f13190g, mb2VarM6300o);
                    }
                }
            }
            qb2 qb2VarM6300o = nb2VarM8198v.m6300o();
            if (ec2VarM6793y.f13191h) {
                ec2VarM6793y.m6298m();
                ec2VarM6793y.f13191h = false;
            }
            fc2.m6790C((fc2) ec2VarM6793y.f13190g, qb2VarM6300o);
            this.f21236c.put(str, ec2VarM6793y);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2884bl
    /* JADX INFO: renamed from: d */
    public final void mo6037d() {
        synchronized (this.f21242i) {
            this.f21236c.keySet();
            kv1 kv1VarM6231a = cw0.m6231a(Collections.emptyMap());
            qu1 qu1Var = new qu1(this) { // from class: c.n.b.d.j.a.sk

                /* JADX INFO: renamed from: a */
                public final C3662wk f19595a;

                {
                    this.f19595a = this;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                /* JADX INFO: renamed from: a */
                public final kv1 mo4612a(Object obj) {
                    ec2 ec2Var;
                    kv1 kv1VarM6250t;
                    C3662wk c3662wk = this.f19595a;
                    Map map = (Map) obj;
                    Objects.requireNonNull(c3662wk);
                    if (map != null) {
                        try {
                            for (String str : map.keySet()) {
                                JSONArray jSONArrayOptJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                                if (jSONArrayOptJSONArray != null) {
                                    synchronized (c3662wk.f21242i) {
                                        int length = jSONArrayOptJSONArray.length();
                                        synchronized (c3662wk.f21242i) {
                                            try {
                                                ec2Var = c3662wk.f21236c.get(str);
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        if (ec2Var == null) {
                                            String strValueOf = String.valueOf(str);
                                            C2622l.m5346b1(strValueOf.length() != 0 ? "Cannot find the corresponding resource object for ".concat(strValueOf) : new String("Cannot find the corresponding resource object for "));
                                        } else {
                                            for (int i = 0; i < length; i++) {
                                                String string = jSONArrayOptJSONArray.getJSONObject(i).getString("threat_type");
                                                if (ec2Var.f13191h) {
                                                    ec2Var.m6298m();
                                                    ec2Var.f13191h = false;
                                                }
                                                fc2.m6792E((fc2) ec2Var.f13190g, string);
                                            }
                                            c3662wk.f21240g |= length > 0;
                                        }
                                    }
                                }
                            }
                        } catch (JSONException e) {
                            if (C3609v4.f20694a.m6603d().booleanValue()) {
                                C2622l.m5358d3("Failed to get SafeBrowsing metadata", e);
                            }
                            return new gv1(new Exception("Safebrowsing report transmission failed."));
                        }
                    }
                    if (c3662wk.f21240g) {
                        synchronized (c3662wk.f21242i) {
                            ib2 ib2Var = c3662wk.f21235b;
                            bc2 bc2Var = bc2.OCTAGON_AD_SB_MATCH;
                            if (ib2Var.f13191h) {
                                ib2Var.m6298m();
                                ib2Var.f13191h = false;
                            }
                            ic2.m7230B((ic2) ib2Var.f13190g, bc2Var);
                        }
                    }
                    boolean z = c3662wk.f21240g;
                    if (!(z && c3662wk.f21241h.f22316l) && (!(c3662wk.f21245l && c3662wk.f21241h.f22315k) && (z || !c3662wk.f21241h.f22313i))) {
                        return cw0.m6231a(null);
                    }
                    synchronized (c3662wk.f21242i) {
                        for (ec2 ec2Var2 : c3662wk.f21236c.values()) {
                            ib2 ib2Var2 = c3662wk.f21235b;
                            fc2 fc2VarM6300o = ec2Var2.m6300o();
                            if (ib2Var2.f13191h) {
                                ib2Var2.m6298m();
                                ib2Var2.f13191h = false;
                            }
                            ic2.m7234F((ic2) ib2Var2.f13190g, fc2VarM6300o);
                        }
                        ib2 ib2Var3 = c3662wk.f21235b;
                        List<String> list = c3662wk.f21237d;
                        if (ib2Var3.f13191h) {
                            ib2Var3.m6298m();
                            ib2Var3.f13191h = false;
                        }
                        ic2.m7239K((ic2) ib2Var3.f13190g, list);
                        ib2 ib2Var4 = c3662wk.f21235b;
                        List<String> list2 = c3662wk.f21238e;
                        if (ib2Var4.f13191h) {
                            ib2Var4.m6298m();
                            ib2Var4.f13191h = false;
                        }
                        ic2.m7240L((ic2) ib2Var4.f13190g, list2);
                        if (C3609v4.f20694a.m6603d().booleanValue()) {
                            String strM7242v = ((ic2) c3662wk.f21235b.f13190g).m7242v();
                            String strM7244y = ((ic2) c3662wk.f21235b.f13190g).m7244y();
                            StringBuilder sb = new StringBuilder(String.valueOf(strM7242v).length() + 53 + String.valueOf(strM7244y).length());
                            sb.append("Sending SB report\n  url: ");
                            sb.append(strM7242v);
                            sb.append("\n  clickUrl: ");
                            sb.append(strM7244y);
                            sb.append("\n  resources: \n");
                            StringBuilder sb2 = new StringBuilder(sb.toString());
                            for (fc2 fc2Var : Collections.unmodifiableList(((ic2) c3662wk.f21235b.f13190g).m7243x())) {
                                sb2.append("    [");
                                sb2.append(fc2Var.m6796x());
                                sb2.append("] ");
                                sb2.append(fc2Var.m6795v());
                            }
                            C2622l.m5346b1(sb2.toString());
                        }
                        kv1<String> kv1VarM4734a = new C2257e0(c3662wk.f21239f).m4734a(1, c3662wk.f21241h.f22311g, null, c3662wk.f21235b.m6300o().mo7574w());
                        if (C3609v4.f20694a.m6603d().booleanValue()) {
                            ((C3147io) kv1VarM4734a).f15328f.mo6230f(RunnableC3550tk.f19859f, C2962do.f13330a);
                        }
                        kv1VarM6250t = cw0.m6250t(kv1VarM4734a, C3587uk.f20364a, C2962do.f13335f);
                    }
                    return kv1VarM6250t;
                }
            };
            lv1 lv1Var = C2962do.f13335f;
            kv1 kv1VarM6249s = cw0.m6249s(kv1VarM6231a, qu1Var, lv1Var);
            kv1 kv1VarM6248r = cw0.m6248r(kv1VarM6249s, 10L, TimeUnit.SECONDS, C2962do.f13333d);
            ((du1) kv1VarM6249s).mo6230f(new ev1(kv1VarM6249s, new C3625vk(kv1VarM6248r)), lv1Var);
            f21234a.add(kv1VarM6248r);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2884bl
    /* JADX INFO: renamed from: t */
    public final void mo6038t(String str) {
        synchronized (this.f21242i) {
            try {
                if (str == null) {
                    ib2 ib2Var = this.f21235b;
                    if (ib2Var.f13191h) {
                        ib2Var.m6298m();
                        ib2Var.f13191h = false;
                    }
                    ic2.m7236H((ic2) ib2Var.f13190g);
                } else {
                    ib2 ib2Var2 = this.f21235b;
                    if (ib2Var2.f13191h) {
                        ib2Var2.m6298m();
                        ib2Var2.f13191h = false;
                    }
                    ic2.m7235G((ic2) ib2Var2.f13190g, str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2884bl
    public final C3773zk zza() {
        return this.f21241h;
    }
}
