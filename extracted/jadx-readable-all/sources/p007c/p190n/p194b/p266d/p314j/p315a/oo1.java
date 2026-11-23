package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oo1 extends lo1 {

    /* JADX INFO: renamed from: d */
    public WebView f17702d;

    /* JADX INFO: renamed from: e */
    public Long f17703e = null;

    /* JADX INFO: renamed from: f */
    public final Map<String, tn1> f17704f;

    public oo1(Map<String, tn1> map, String str) {
        this.f17704f = map;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lo1
    /* JADX INFO: renamed from: a */
    public final void mo7594a() {
        WebView webView = new WebView(co1.f13066a.f13067b);
        this.f17702d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f16431a = new hp1(this.f17702d);
        WebView webView2 = this.f17702d;
        if (webView2 != null && !TextUtils.isEmpty(null)) {
            webView2.loadUrl("javascript: ".concat("null"));
        }
        Iterator<String> it = this.f17704f.keySet().iterator();
        if (!it.hasNext()) {
            this.f17703e = Long.valueOf(System.nanoTime());
        } else {
            this.f17704f.get(it.next());
            throw null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lo1
    /* JADX INFO: renamed from: b */
    public final void mo7595b() {
        this.f16431a.clear();
        new Handler().postDelayed(new no1(this), Math.max(4000 - (this.f17703e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f17703e.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f17702d = null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lo1
    /* JADX INFO: renamed from: d */
    public final void mo7597d(nn1 nn1Var, ln1 ln1Var) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(ln1Var.f16410d);
        for (String str : mapUnmodifiableMap.keySet()) {
            po1.m8133b(jSONObject, str, (tn1) mapUnmodifiableMap.get(str));
        }
        m7598e(nn1Var, ln1Var, jSONObject);
    }
}
