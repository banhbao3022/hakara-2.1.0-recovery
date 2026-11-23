package p007c.p190n.p194b.p266d.p267a.p282z;

import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3053g4;
import p007c.p190n.p194b.p266d.p314j.p315a.rd2;
import p007c.p190n.p194b.p266d.p314j.p315a.sd2;

/* JADX INFO: renamed from: c.n.b.d.a.z.r */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AsyncTaskC2327r extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BinderC2329t f10869a;

    public /* synthetic */ AsyncTaskC2327r(BinderC2329t binderC2329t) {
        this.f10869a = binderC2329t;
    }

    @Override // android.os.AsyncTask
    public final String doInBackground(Void[] voidArr) {
        try {
            BinderC2329t binderC2329t = this.f10869a;
            binderC2329t.f10882m = binderC2329t.f10877h.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e = e;
            C2622l.m5241D3("", e);
        } catch (ExecutionException e2) {
            e = e2;
            C2622l.m5241D3("", e);
        } catch (TimeoutException e3) {
            C2622l.m5241D3("", e3);
        }
        BinderC2329t binderC2329t2 = this.f10869a;
        Objects.requireNonNull(binderC2329t2);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https://").appendEncodedPath(C3053g4.f14498d.m6603d());
        builder.appendQueryParameter("query", binderC2329t2.f10879j.f10873d);
        builder.appendQueryParameter("pubId", binderC2329t2.f10879j.f10871b);
        Map<String, String> map = binderC2329t2.f10879j.f10872c;
        for (String str : map.keySet()) {
            builder.appendQueryParameter(str, map.get(str));
        }
        Uri uriBuild = builder.build();
        rd2 rd2Var = binderC2329t2.f10882m;
        if (rd2Var != null) {
            try {
                uriBuild = rd2Var.m8273c(uriBuild, rd2Var.f18750d.mo4857f(binderC2329t2.f10878i));
            } catch (sd2 e4) {
                C2622l.m5241D3("Unable to process ad data", e4);
            }
        }
        String strM4871G6 = binderC2329t2.m4871G6();
        String encodedQuery = uriBuild.getEncodedQuery();
        return outline.m1552C(new StringBuilder(String.valueOf(strM4871G6).length() + 1 + String.valueOf(encodedQuery).length()), strM4871G6, "#", encodedQuery);
    }

    @Override // android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(String str) {
        String str2 = str;
        WebView webView = this.f10869a.f10880k;
        if (webView == null || str2 == null) {
            return;
        }
        webView.loadUrl(str2);
    }
}
