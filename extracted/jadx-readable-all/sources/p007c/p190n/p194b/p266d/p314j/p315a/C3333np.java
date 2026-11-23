package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.util.HashMap;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: renamed from: c.n.b.d.j.a.np */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3333np extends FrameLayout implements InterfaceC3000ep {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3704xp f17194f;

    /* JADX INFO: renamed from: g */
    public final FrameLayout f17195g;

    /* JADX INFO: renamed from: h */
    public final C3533t3 f17196h;

    /* JADX INFO: renamed from: i */
    public final RunnableC3778zp f17197i;

    /* JADX INFO: renamed from: j */
    public final long f17198j;

    /* JADX INFO: renamed from: k */
    public final AbstractC3037fp f17199k;

    /* JADX INFO: renamed from: l */
    public boolean f17200l;

    /* JADX INFO: renamed from: m */
    public boolean f17201m;

    /* JADX INFO: renamed from: n */
    public boolean f17202n;

    /* JADX INFO: renamed from: o */
    public boolean f17203o;

    /* JADX INFO: renamed from: p */
    public long f17204p;

    /* JADX INFO: renamed from: q */
    public long f17205q;

    /* JADX INFO: renamed from: r */
    public String f17206r;

    /* JADX INFO: renamed from: s */
    public String[] f17207s;

    /* JADX INFO: renamed from: t */
    public Bitmap f17208t;

    /* JADX INFO: renamed from: u */
    public final ImageView f17209u;

    /* JADX INFO: renamed from: v */
    public boolean f17210v;

    public C3333np(Context context, InterfaceC3704xp interfaceC3704xp, int i, boolean z, C3533t3 c3533t3, C3667wp c3667wp) {
        AbstractC3037fp textureViewSurfaceTextureListenerC3334nq;
        super(context);
        this.f17194f = interfaceC3704xp;
        this.f17196h = c3533t3;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f17195g = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Objects.requireNonNull(interfaceC3704xp.mo6487k(), "null reference");
        C3074gp c3074gp = interfaceC3704xp.mo6487k().f10830a;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || applicationInfo.targetSdkVersion >= 11) {
            textureViewSurfaceTextureListenerC3334nq = i == 2 ? new TextureViewSurfaceTextureListenerC3334nq(context, new C3741yp(context, interfaceC3704xp.mo6495o(), interfaceC3704xp.mo6491m(), c3533t3, interfaceC3704xp.mo6484i()), interfaceC3704xp, z, interfaceC3704xp.mo6500r().m6689d(), c3667wp) : new TextureViewSurfaceTextureListenerC2963dp(context, interfaceC3704xp, z, interfaceC3704xp.mo6500r().m6689d(), c3667wp, new C3741yp(context, interfaceC3704xp.mo6495o(), interfaceC3704xp.mo6491m(), c3533t3, interfaceC3704xp.mo6484i()));
        } else {
            textureViewSurfaceTextureListenerC3334nq = null;
        }
        this.f17199k = textureViewSurfaceTextureListenerC3334nq;
        if (textureViewSurfaceTextureListenerC3334nq != null) {
            frameLayout.addView(textureViewSurfaceTextureListenerC3334nq, new FrameLayout.LayoutParams(-1, -1, 17));
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14457v)).booleanValue()) {
                m7898a();
            }
        }
        this.f17209u = new ImageView(context);
        AbstractC3718y2<Long> abstractC3718y2 = C3052g3.f14485z;
        C2862b c2862b = C2862b.f12493a;
        this.f17198j = ((Long) c2862b.f12496d.m6596a(abstractC3718y2)).longValue();
        boolean zBooleanValue = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14471x)).booleanValue();
        this.f17203o = zBooleanValue;
        if (c3533t3 != null) {
            c3533t3.m8398c("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.f17197i = new RunnableC3778zp(this);
        if (textureViewSurfaceTextureListenerC3334nq != null) {
            textureViewSurfaceTextureListenerC3334nq.mo6406g(this);
        }
        if (textureViewSurfaceTextureListenerC3334nq == null) {
            m7905h("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    @TargetApi(14)
    /* JADX INFO: renamed from: a */
    public final void m7898a() {
        AbstractC3037fp abstractC3037fp = this.f17199k;
        if (abstractC3037fp == null) {
            return;
        }
        TextView textView = new TextView(abstractC3037fp.getContext());
        String strValueOf = String.valueOf(this.f17199k.mo6405e());
        textView.setText(strValueOf.length() != 0 ? "AdMob - ".concat(strValueOf) : new String("AdMob - "));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.f17195g.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f17195g.bringChildToFront(textView);
    }

    /* JADX INFO: renamed from: b */
    public final void m7899b() {
        AbstractC3037fp abstractC3037fp = this.f17199k;
        if (abstractC3037fp == null) {
            return;
        }
        long jMo6412n = abstractC3037fp.mo6412n();
        if (this.f17204p == jMo6412n || jMo6412n <= 0) {
            return;
        }
        float f = jMo6412n / 1000.0f;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14333d1)).booleanValue()) {
            m7900c("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.f17199k.mo6419u()), "qoeCachedBytes", String.valueOf(this.f17199k.mo6418t()), "qoeLoadedBytes", String.valueOf(this.f17199k.mo6417s()), "droppedFrames", String.valueOf(this.f17199k.mo6420v()), "reportTime", String.valueOf(C2330u.f10884a.f10896k.mo5623c()));
        } else {
            m7900c("timeupdate", "time", String.valueOf(f));
        }
        this.f17204p = jMo6412n;
    }

    /* JADX INFO: renamed from: c */
    public final void m7900c(String str, String... strArr) {
        HashMap map = new HashMap();
        map.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.f17194f.mo6501r0("onVideoEvent", map);
    }

    /* JADX INFO: renamed from: d */
    public final void m7901d() {
        if (this.f17194f.mo6482h() == null || !this.f17201m || this.f17202n) {
            return;
        }
        this.f17194f.mo6482h().getWindow().clearFlags(128);
        this.f17201m = false;
    }

    /* JADX INFO: renamed from: e */
    public final void m7902e() {
        AbstractC3037fp abstractC3037fp = this.f17199k;
        if (abstractC3037fp != null && this.f17205q == 0) {
            m7900c("canplaythrough", CainMediaMetadataRetriever.METADATA_KEY_DURATION, String.valueOf(abstractC3037fp.mo6411m() / 1000.0f), "videoWidth", String.valueOf(this.f17199k.mo6415q()), "videoHeight", String.valueOf(this.f17199k.mo6416r()));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7903f() {
        if (this.f17194f.mo6482h() != null && !this.f17201m) {
            boolean z = (this.f17194f.mo6482h().getWindow().getAttributes().flags & 128) != 0;
            this.f17202n = z;
            if (!z) {
                this.f17194f.mo6482h().getWindow().addFlags(128);
                this.f17201m = true;
            }
        }
        this.f17200l = true;
    }

    public final void finalize() throws Throwable {
        try {
            this.f17197i.m8897a();
            final AbstractC3037fp abstractC3037fp = this.f17199k;
            if (abstractC3037fp != null) {
                C2962do.f13334e.execute(new Runnable(abstractC3037fp) { // from class: c.n.b.d.j.a.ip

                    /* JADX INFO: renamed from: f */
                    public final AbstractC3037fp f15334f;

                    {
                        this.f15334f = abstractC3037fp;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15334f.mo6408i();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7904g() {
        m7900c("pause", new String[0]);
        m7901d();
        this.f17200l = false;
    }

    /* JADX INFO: renamed from: h */
    public final void m7905h(String str, String str2) {
        m7900c("error", "what", str, "extra", str2);
    }

    /* JADX INFO: renamed from: i */
    public final void m7906i() {
        if (this.f17210v && this.f17208t != null) {
            if (!(this.f17209u.getParent() != null)) {
                this.f17209u.setImageBitmap(this.f17208t);
                this.f17209u.invalidate();
                this.f17195g.addView(this.f17209u, new FrameLayout.LayoutParams(-1, -1));
                this.f17195g.bringChildToFront(this.f17209u);
            }
        }
        this.f17197i.m8897a();
        this.f17205q = this.f17204p;
        C2267h1.f10713a.post(new RunnableC3259lp(this));
    }

    /* JADX INFO: renamed from: j */
    public final void m7907j(int i, int i2) {
        if (this.f17203o) {
            AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14478y;
            C2862b c2862b = C2862b.f12493a;
            int iMax = Math.max(i / ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue(), 1);
            Bitmap bitmap = this.f17208t;
            if (bitmap != null && bitmap.getWidth() == iMax && this.f17208t.getHeight() == iMax2) {
                return;
            }
            this.f17208t = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.f17210v = false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m7908k(int i, int i2, int i3, int i4) {
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.f17195g.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.f17197i.m8898b();
        } else {
            this.f17197i.m8897a();
            this.f17205q = this.f17204p;
        }
        C2267h1.f10713a.post(new Runnable(this, z) { // from class: c.n.b.d.j.a.jp

            /* JADX INFO: renamed from: f */
            public final C3333np f15678f;

            /* JADX INFO: renamed from: g */
            public final boolean f15679g;

            {
                this.f15678f = this;
                this.f15679g = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C3333np c3333np = this.f15678f;
                boolean z2 = this.f15679g;
                Objects.requireNonNull(c3333np);
                c3333np.m7900c("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
            }
        });
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.f17197i.m8898b();
            z = true;
        } else {
            this.f17197i.m8897a();
            this.f17205q = this.f17204p;
            z = false;
        }
        C2267h1.f10713a.post(new RunnableC3296mp(this, z));
    }
}
