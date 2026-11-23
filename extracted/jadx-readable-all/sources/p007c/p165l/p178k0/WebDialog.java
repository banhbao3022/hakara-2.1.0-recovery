package p007c.p165l.p178k0;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.cgfay.media.IMediaPlayer;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import mtp.media.karaoke.R;
import org.json.JSONArray;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookDialogException;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookOperationCanceledException;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.FacebookSdk;
import p007c.p165l.FacebookServiceException;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p183m0.p184b.ShareInternalUtility4;

/* JADX INFO: renamed from: c.l.k0.h0, reason: use source file name */
/* JADX INFO: compiled from: WebDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class WebDialog extends Dialog {

    /* JADX INFO: renamed from: f */
    public static volatile int f4923f;

    /* JADX INFO: renamed from: g */
    public String f4924g;

    /* JADX INFO: renamed from: h */
    public String f4925h;

    /* JADX INFO: renamed from: i */
    public f f4926i;

    /* JADX INFO: renamed from: j */
    public WebView f4927j;

    /* JADX INFO: renamed from: k */
    public ProgressDialog f4928k;

    /* JADX INFO: renamed from: l */
    public ImageView f4929l;

    /* JADX INFO: renamed from: m */
    public FrameLayout f4930m;

    /* JADX INFO: renamed from: n */
    public g f4931n;

    /* JADX INFO: renamed from: o */
    public boolean f4932o;

    /* JADX INFO: renamed from: p */
    public boolean f4933p;

    /* JADX INFO: renamed from: q */
    public boolean f4934q;

    /* JADX INFO: renamed from: r */
    public WindowManager.LayoutParams f4935r;

    /* JADX INFO: renamed from: c.l.k0.h0$a */
    /* JADX INFO: compiled from: WebDialog.java */
    public class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            WebDialog.this.cancel();
        }
    }

    /* JADX INFO: renamed from: c.l.k0.h0$b */
    /* JADX INFO: compiled from: WebDialog.java */
    public class b extends WebView {
        public b(WebDialog webDialog, Context context) {
            super(context);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            try {
                super.onWindowFocusChanged(z);
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c.l.k0.h0$c */
    /* JADX INFO: compiled from: WebDialog.java */
    public class c implements View.OnTouchListener {
        public c(WebDialog webDialog) {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (view.hasFocus()) {
                return false;
            }
            view.requestFocus();
            return false;
        }
    }

    /* JADX INFO: renamed from: c.l.k0.h0$e */
    /* JADX INFO: compiled from: WebDialog.java */
    public class e extends WebViewClient {
        public e(a aVar) {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            WebDialog webDialog = WebDialog.this;
            if (!webDialog.f4933p) {
                webDialog.f4928k.dismiss();
            }
            WebDialog.this.f4930m.setBackgroundColor(0);
            WebDialog.this.f4927j.setVisibility(0);
            WebDialog.this.f4929l.setVisibility(0);
            WebDialog.this.f4934q = true;
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            super.onPageStarted(webView, str, bitmap);
            WebDialog webDialog = WebDialog.this;
            if (webDialog.f4933p) {
                return;
            }
            webDialog.f4928k.show();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            WebDialog.this.m2491e(new FacebookDialogException(str, i, str2));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            sslErrorHandler.cancel();
            WebDialog.this.m2491e(new FacebookDialogException(null, -11, null));
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            int i;
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            if (!str.startsWith(WebDialog.this.f4925h)) {
                if (str.startsWith("fbconnect://cancel")) {
                    WebDialog.this.cancel();
                    return true;
                }
                if (str.contains("touch")) {
                    return false;
                }
                try {
                    WebDialog.this.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
            Bundle bundleMo2489c = WebDialog.this.mo2489c(str);
            String string = bundleMo2489c.getString("error");
            if (string == null) {
                string = bundleMo2489c.getString("error_type");
            }
            String string2 = bundleMo2489c.getString("error_msg");
            if (string2 == null) {
                string2 = bundleMo2489c.getString("error_message");
            }
            if (string2 == null) {
                string2 = bundleMo2489c.getString("error_description");
            }
            String string3 = bundleMo2489c.getString("error_code");
            if (Utility.m2466y(string3)) {
                i = -1;
            } else {
                try {
                    i = Integer.parseInt(string3);
                } catch (NumberFormatException unused2) {
                    i = -1;
                }
            }
            if (Utility.m2466y(string) && Utility.m2466y(string2) && i == -1) {
                WebDialog webDialog = WebDialog.this;
                f fVar = webDialog.f4926i;
                if (fVar != null && !webDialog.f4932o) {
                    webDialog.f4932o = true;
                    fVar.mo2494a(bundleMo2489c, null);
                    webDialog.dismiss();
                }
            } else if ((string == null || !(string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) && i != 4201) {
                WebDialog.this.m2491e(new FacebookServiceException(new FacebookRequestError(i, string, string2), string2));
            } else {
                WebDialog.this.cancel();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: c.l.k0.h0$f */
    /* JADX INFO: compiled from: WebDialog.java */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo2494a(Bundle bundle, FacebookException facebookException);
    }

    /* JADX INFO: renamed from: c.l.k0.h0$g */
    /* JADX INFO: compiled from: WebDialog.java */
    public class g extends AsyncTask<Void, Void, String[]> {

        /* JADX INFO: renamed from: a */
        public String f4944a;

        /* JADX INFO: renamed from: b */
        public Bundle f4945b;

        /* JADX INFO: renamed from: c */
        public Exception[] f4946c;

        public g(String str, Bundle bundle) {
            this.f4944a = str;
            this.f4945b = bundle;
        }

        @Override // android.os.AsyncTask
        public String[] doInBackground(Void[] voidArr) {
            String[] stringArray = this.f4945b.getStringArray("media");
            String[] strArr = new String[stringArray.length];
            this.f4946c = new Exception[stringArray.length];
            CountDownLatch countDownLatch = new CountDownLatch(stringArray.length);
            ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
            AccessToken accessTokenM2247b = AccessToken.m2247b();
            for (int i = 0; i < stringArray.length; i++) {
                try {
                    if (isCancelled()) {
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ((AsyncTask) it.next()).cancel(true);
                        }
                        return null;
                    }
                    Uri uri = Uri.parse(stringArray[i]);
                    if (Utility.m2428A(uri)) {
                        strArr[i] = uri.toString();
                        countDownLatch.countDown();
                    } else {
                        concurrentLinkedQueue.add(ShareInternalUtility4.m2640h(accessTokenM2247b, uri, new WebDialog3(this, strArr, i, countDownLatch)).m2688e());
                    }
                } catch (Exception unused) {
                    Iterator it2 = concurrentLinkedQueue.iterator();
                    while (it2.hasNext()) {
                        ((AsyncTask) it2.next()).cancel(true);
                    }
                }
            }
            countDownLatch.await();
            return strArr;
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String[] strArr) {
            String[] strArr2 = strArr;
            WebDialog.this.f4928k.dismiss();
            for (Exception exc : this.f4946c) {
                if (exc != null) {
                    WebDialog.this.m2491e(exc);
                    return;
                }
            }
            if (strArr2 == null) {
                WebDialog.this.m2491e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            List listAsList = Arrays.asList(strArr2);
            if (listAsList.contains(null)) {
                WebDialog.this.m2491e(new FacebookException("Failed to stage photos for web dialog"));
                return;
            }
            Utility.m2433F(this.f4945b, "media", new JSONArray((Collection) listAsList));
            WebDialog.this.f4924g = Utility.m2444c(ServerProtocol.m2421a(), FacebookSdk.m2662d() + "/dialog/" + this.f4944a, this.f4945b).toString();
            WebDialog.this.m2492f((WebDialog.this.f4929l.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WebDialog(Context context, String str) {
        Validate.m2479h();
        int i = f4923f;
        if (i == 0) {
            Validate.m2479h();
            i = f4923f;
        }
        super(context, i);
        this.f4925h = "fbconnect://success";
        this.f4932o = false;
        this.f4933p = false;
        this.f4934q = false;
        this.f4924g = str;
    }

    /* JADX INFO: renamed from: b */
    public static void m2487b(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || applicationInfo.metaData == null || f4923f != 0) {
                return;
            }
            int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
            if (i == 0) {
                i = R.style.com_facebook_activity_theme;
            }
            f4923f = i;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m2488a(int i, float f2, int i2, int i3) {
        int i4 = (int) (i / f2);
        double d2 = 0.5d;
        if (i4 <= i2) {
            d2 = 1.0d;
        } else if (i4 < i3) {
            d2 = 0.5d + ((((double) (i3 - i4)) / ((double) (i3 - i2))) * 0.5d);
        }
        return (int) (((double) i) * d2);
    }

    /* JADX INFO: renamed from: c */
    public Bundle mo2489c(String str) {
        Uri uri = Uri.parse(str);
        Bundle bundleM2432E = Utility.m2432E(uri.getQuery());
        bundleM2432E.putAll(Utility.m2432E(uri.getFragment()));
        return bundleM2432E;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        if (this.f4926i == null || this.f4932o) {
            return;
        }
        m2491e(new FacebookOperationCanceledException());
    }

    /* JADX INFO: renamed from: d */
    public void m2490d() {
        Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = i < i2 ? i : i2;
        if (i < i2) {
            i = i2;
        }
        getWindow().setLayout(Math.min(m2488a(i3, displayMetrics.density, 480, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING), displayMetrics.widthPixels), Math.min(m2488a(i, displayMetrics.density, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, 1280), displayMetrics.heightPixels));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        ProgressDialog progressDialog;
        WebView webView = this.f4927j;
        if (webView != null) {
            webView.stopLoading();
        }
        if (!this.f4933p && (progressDialog = this.f4928k) != null && progressDialog.isShowing()) {
            this.f4928k.dismiss();
        }
        super.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public void m2491e(Throwable th) {
        if (this.f4926i == null || this.f4932o) {
            return;
        }
        this.f4932o = true;
        this.f4926i.mo2494a(null, th instanceof FacebookException ? (FacebookException) th : new FacebookException(th));
        dismiss();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: f */
    public final void m2492f(int i) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        b bVar = new b(this, getContext());
        this.f4927j = bVar;
        bVar.setVerticalScrollBarEnabled(false);
        this.f4927j.setHorizontalScrollBarEnabled(false);
        this.f4927j.setWebViewClient(new e(null));
        this.f4927j.getSettings().setJavaScriptEnabled(true);
        this.f4927j.loadUrl(this.f4924g);
        this.f4927j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f4927j.setVisibility(4);
        this.f4927j.getSettings().setSavePassword(false);
        this.f4927j.getSettings().setSaveFormData(false);
        this.f4927j.setFocusable(true);
        this.f4927j.setFocusableInTouchMode(true);
        this.f4927j.setOnTouchListener(new c(this));
        linearLayout.setPadding(i, i, i, i);
        linearLayout.addView(this.f4927j);
        linearLayout.setBackgroundColor(-872415232);
        this.f4930m.addView(linearLayout);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        WindowManager.LayoutParams layoutParams;
        AutofillManager autofillManager;
        boolean z = false;
        this.f4933p = false;
        Context context = getContext();
        if (Build.VERSION.SDK_INT >= 26 && (autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class)) != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        if (z && (layoutParams = this.f4935r) != null && layoutParams.token == null) {
            layoutParams.token = getOwnerActivity().getWindow().getAttributes().token;
            StringBuilder sbM1556G = outline.m1556G("Set token on onAttachedToWindow(): ");
            sbM1556G.append(this.f4935r.token);
            sbM1556G.toString();
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        }
        super.onAttachedToWindow();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressDialog progressDialog = new ProgressDialog(getContext());
        this.f4928k = progressDialog;
        progressDialog.requestWindowFeature(1);
        this.f4928k.setMessage(getContext().getString(R.string.com_facebook_loading));
        this.f4928k.setCanceledOnTouchOutside(false);
        this.f4928k.setOnCancelListener(new a());
        requestWindowFeature(1);
        this.f4930m = new FrameLayout(getContext());
        m2490d();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        ImageView imageView = new ImageView(getContext());
        this.f4929l = imageView;
        imageView.setOnClickListener(new WebDialog2(this));
        this.f4929l.setImageDrawable(getContext().getResources().getDrawable(R.drawable.com_facebook_close));
        this.f4929l.setVisibility(4);
        if (this.f4924g != null) {
            m2492f((this.f4929l.getDrawable().getIntrinsicWidth() / 2) + 1);
        }
        this.f4930m.addView(this.f4929l, new ViewGroup.LayoutParams(-2, -2));
        setContentView(this.f4930m);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f4933p = true;
        super.onDetachedFromWindow();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            cancel();
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        g gVar = this.f4931n;
        if (gVar == null || gVar.getStatus() != AsyncTask.Status.PENDING) {
            m2490d();
        } else {
            this.f4931n.execute(new Void[0]);
            this.f4928k.show();
        }
    }

    @Override // android.app.Dialog
    public void onStop() {
        g gVar = this.f4931n;
        if (gVar != null) {
            gVar.cancel(true);
            this.f4928k.dismiss();
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        if (layoutParams.token == null) {
            this.f4935r = layoutParams;
        }
        super.onWindowAttributesChanged(layoutParams);
    }

    /* JADX INFO: renamed from: c.l.k0.h0$d */
    /* JADX INFO: compiled from: WebDialog.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public Context f4937a;

        /* JADX INFO: renamed from: b */
        public String f4938b;

        /* JADX INFO: renamed from: c */
        public String f4939c;

        /* JADX INFO: renamed from: d */
        public f f4940d;

        /* JADX INFO: renamed from: e */
        public Bundle f4941e;

        /* JADX INFO: renamed from: f */
        public AccessToken f4942f;

        public d(Context context, String str, Bundle bundle) {
            this.f4942f = AccessToken.m2247b();
            if (!AccessToken.m2248c()) {
                String strM2454m = Utility.m2454m(context);
                if (strM2454m == null) {
                    throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
                }
                this.f4938b = strM2454m;
            }
            this.f4937a = context;
            this.f4939c = str;
            if (bundle != null) {
                this.f4941e = bundle;
            } else {
                this.f4941e = new Bundle();
            }
        }

        /* JADX INFO: renamed from: a */
        public WebDialog mo2493a() {
            AccessToken accessToken = this.f4942f;
            if (accessToken != null) {
                this.f4941e.putString("app_id", accessToken.f4502q);
                this.f4941e.putString("access_token", this.f4942f.f4499n);
            } else {
                this.f4941e.putString("app_id", this.f4938b);
            }
            Context context = this.f4937a;
            String str = this.f4939c;
            Bundle bundle = this.f4941e;
            f fVar = this.f4940d;
            WebDialog.m2487b(context);
            return new WebDialog(context, str, bundle, 0, fVar);
        }

        public d(Context context, String str, String str2, Bundle bundle) {
            str = str == null ? Utility.m2454m(context) : str;
            Validate.m2478g(str, "applicationId");
            this.f4938b = str;
            this.f4937a = context;
            this.f4939c = str2;
            if (bundle != null) {
                this.f4941e = bundle;
            } else {
                this.f4941e = new Bundle();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WebDialog(Context context, String str, Bundle bundle, int i, f fVar) {
        if (i == 0) {
            Validate.m2479h();
            i = f4923f;
        }
        super(context, i);
        this.f4925h = "fbconnect://success";
        this.f4932o = false;
        this.f4933p = false;
        this.f4934q = false;
        bundle = bundle == null ? new Bundle() : bundle;
        String str2 = Utility.m2463v(context) ? "fbconnect://chrome_os_success" : "fbconnect://success";
        this.f4925h = str2;
        bundle.putString("redirect_uri", str2);
        bundle.putString("display", "touch");
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        bundle.putString("client_id", FacebookSdk.f5354c);
        bundle.putString("sdk", String.format(Locale.ROOT, "android-%s", "5.15.3"));
        this.f4926i = fVar;
        if (str.equals("share") && bundle.containsKey("media")) {
            this.f4931n = new g(str, bundle);
            return;
        }
        this.f4924g = Utility.m2444c(ServerProtocol.m2421a(), FacebookSdk.m2662d() + "/dialog/" + str, bundle).toString();
    }
}
