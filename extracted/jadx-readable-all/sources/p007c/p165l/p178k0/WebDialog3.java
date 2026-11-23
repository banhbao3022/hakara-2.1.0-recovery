package p007c.p165l.p178k0;

import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookGraphResponseException;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;

/* JADX INFO: renamed from: c.l.k0.j0, reason: use source file name */
/* JADX INFO: compiled from: WebDialog.java */
/* JADX INFO: loaded from: classes.dex */
public class WebDialog3 implements GraphRequest2.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String[] f4958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CountDownLatch f4960c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ WebDialog.g f4961d;

    public WebDialog3(WebDialog.g gVar, String[] strArr, int i, CountDownLatch countDownLatch) {
        this.f4961d = gVar;
        this.f4958a = strArr;
        this.f4959b = i;
        this.f4960c = countDownLatch;
    }

    @Override // p007c.p165l.GraphRequest2.c
    /* JADX INFO: renamed from: b */
    public void mo2263b(GraphResponse graphResponse) {
        try {
            FacebookRequestError facebookRequestError = graphResponse.f5409d;
            String str = "Error staging photo.";
            if (facebookRequestError != null) {
                String strM2602a = facebookRequestError.m2602a();
                if (strM2602a != null) {
                    str = strM2602a;
                }
                throw new FacebookGraphResponseException(graphResponse, str);
            }
            JSONObject jSONObject = graphResponse.f5408c;
            if (jSONObject == null) {
                throw new FacebookException("Error staging photo.");
            }
            String strOptString = jSONObject.optString("uri");
            if (strOptString == null) {
                throw new FacebookException("Error staging photo.");
            }
            this.f4958a[this.f4959b] = strOptString;
            this.f4960c.countDown();
        } catch (Exception e) {
            this.f4961d.f4946c[this.f4959b] = e;
        }
    }
}
