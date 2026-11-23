package mtp.media.karaoke.p628ui.screen.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import mtp.media.karaoke.R;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p644b.p645c.AppCompatActivity;

/* JADX INFO: compiled from: WebViewActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WebViewActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: u */
    public static final C7383a f34037u = new C7383a(null);

    /* JADX INFO: renamed from: v */
    public HashMap f34038v;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.webview.WebViewActivity$a */
    /* JADX INFO: compiled from: WebViewActivity.kt */
    public static final class C7383a {
        public C7383a() {
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14469a(Context context, String str, String str2) {
            Intrinsics2.m13089e(context, "context");
            Intrinsics2.m13089e(str, CainMediaMetadataRetriever.METADATA_KEY_TITLE);
            Intrinsics2.m13089e(str2, "url");
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.putExtra(CainMediaMetadataRetriever.METADATA_KEY_TITLE, str);
            intent.putExtra("url", str2);
            return intent;
        }

        public C7383a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.webview.WebViewActivity$b */
    /* JADX INFO: compiled from: WebViewActivity.kt */
    public static final class C7384b extends WebViewClient {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f34039a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ WebViewActivity f34040b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WebView f34041c;

        public C7384b(String str, WebViewActivity webViewActivity, WebView webView) {
            this.f34039a = str;
            this.f34040b = webViewActivity;
            this.f34041c = webView;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            ProgressBar progressBar = (ProgressBar) this.f34040b.m14468O(R.id.progressBar);
            Intrinsics2.m13088d(progressBar, "progressBar");
            SkuDao.a.m14061M(progressBar);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            ProgressBar progressBar = (ProgressBar) this.f34040b.m14468O(R.id.progressBar);
            Intrinsics2.m13088d(progressBar, "progressBar");
            SkuDao.a.m14068T(progressBar);
            ProgressBar progressBar2 = (ProgressBar) this.f34040b.m14468O(R.id.progressBar);
            Intrinsics2.m13088d(progressBar2, "progressBar");
            progressBar2.setProgress(0);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null) {
                return true;
            }
            webView.loadUrl(this.f34039a);
            return true;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            if (webView == null) {
                return true;
            }
            webView.loadUrl(String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null));
            return true;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.webview.WebViewActivity$c */
    /* JADX INFO: compiled from: WebViewActivity.kt */
    public static final class C7385c extends WebChromeClient {
        public C7385c() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            super.onProgressChanged(webView, i);
            ProgressBar progressBar = (ProgressBar) WebViewActivity.this.m14468O(R.id.progressBar);
            Intrinsics2.m13088d(progressBar, "progressBar");
            progressBar.setProgress(i);
        }
    }

    /* JADX INFO: renamed from: O */
    public View m14468O(int i) {
        if (this.f34038v == null) {
            this.f34038v = new HashMap();
        }
        View view = (View) this.f34038v.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f34038v.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.web_view_activity);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) m14468O(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        String stringExtra = getIntent().getStringExtra(CainMediaMetadataRetriever.METADATA_KEY_TITLE);
        String stringExtra2 = getIntent().getStringExtra("url");
        m14615N((Toolbar) m14468O(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14598r(stringExtra);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
        View viewFindViewById = findViewById(R.id.webView);
        Intrinsics2.m13088d(viewFindViewById, "findViewById(R.id.webView)");
        WebView webView = (WebView) viewFindViewById;
        WebSettings settings = webView.getSettings();
        Intrinsics2.m13088d(settings, "myWebView.settings");
        settings.setJavaScriptEnabled(true);
        webView.setWebChromeClient(new C7385c());
        if (stringExtra2 != null) {
            webView.setWebViewClient(new C7384b(stringExtra2, this, webView));
            HashMap<String, String> headers = new HashMap<>();
            if (p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs.f32358a != null) {
                String token = (String) p007c.p071d.p078c.p079a.outline.m1584f(
                    p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs.f32358a.getString("access_token", null),
                    String.class
                );
                if (token != null) {
                    headers.put("Authorization", "Bearer " + token);
                }
            }
            webView.loadUrl(stringExtra2, headers);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f143l.m133b();
        return true;
    }
}
