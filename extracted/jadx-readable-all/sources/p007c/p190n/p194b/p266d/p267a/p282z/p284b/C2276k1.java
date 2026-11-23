package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.webkit.WebSettings;
import java.util.concurrent.Callable;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2618j;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.k1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(17)
public class C2276k1 extends C2253d {
    public C2276k1() {
        super(null);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: a */
    public final boolean mo4712a(final Context context, final WebSettings webSettings) {
        C2096e.m4588x(context, new Callable(context, webSettings) { // from class: c.n.b.d.a.z.b.i1

            /* JADX INFO: renamed from: a */
            public final Context f10724a;

            /* JADX INFO: renamed from: b */
            public final WebSettings f10725b;

            {
                this.f10724a = context;
                this.f10725b = webSettings;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                Context context2 = this.f10724a;
                WebSettings webSettings2 = this.f10725b;
                if (context2.getCacheDir() != null) {
                    webSettings2.setAppCachePath(context2.getCacheDir().getAbsolutePath());
                    webSettings2.setAppCacheMaxSize(0L);
                    webSettings2.setAppCacheEnabled(true);
                }
                webSettings2.setDatabasePath(context2.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath());
                webSettings2.setDatabaseEnabled(true);
                webSettings2.setDomStorageEnabled(true);
                webSettings2.setDisplayZoomControls(false);
                webSettings2.setBuiltInZoomControls(true);
                webSettings2.setSupportZoom(true);
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14437s0)).booleanValue()) {
                    webSettings2.setTextZoom(100);
                }
                webSettings2.setAllowContentAccess(false);
                return Boolean.TRUE;
            }
        });
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
        webSettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: b */
    public final String mo4713b(Context context) {
        if (C2290p0.f10763a == null) {
            C2290p0.f10763a = new C2290p0();
        }
        C2290p0 c2290p0 = C2290p0.f10763a;
        if (TextUtils.isEmpty(c2290p0.f10764b)) {
            c2290p0.f10764b = (String) C2096e.m4588x(context, new CallableC2287o0(C2618j.m5215a(context), context));
        }
        return c2290p0.f10764b;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: c */
    public final void mo4714c(Context context) {
        if (C2290p0.f10763a == null) {
            C2290p0.f10763a = new C2290p0();
        }
        C2290p0 c2290p0 = C2290p0.f10763a;
        C2096e.m4590z("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
        if (!defaultUserAgent.equals(c2290p0.f10764b)) {
            if (C2618j.m5215a(context) == null) {
                context.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(context)).apply();
            }
            c2290p0.f10764b = defaultUserAgent;
        }
        C2096e.m4590z("User agent is updated.");
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: d */
    public final Drawable mo4715d(Context context, Bitmap bitmap, boolean z, float f) {
        if (!z || f <= 0.0f || f > 25.0f) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
            RenderScript renderScriptCreate = RenderScript.create(context);
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return new BitmapDrawable(context.getResources(), bitmapCreateBitmap);
        } catch (RuntimeException unused) {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: e */
    public final int mo4716e(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "wifi_on", 0);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: f */
    public final int mo4717f(ContentResolver contentResolver) {
        return Settings.Global.getInt(contentResolver, "airplane_mode_on", 0);
    }
}
