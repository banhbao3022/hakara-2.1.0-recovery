package p007c.p165l;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.l.k, reason: use source file name */
/* JADX INFO: compiled from: FacebookGraphResponseException.java */
/* JADX INFO: loaded from: classes.dex */
public class FacebookGraphResponseException extends FacebookException {

    /* JADX INFO: renamed from: f */
    public final GraphResponse f4872f;

    public FacebookGraphResponseException(GraphResponse graphResponse, String str) {
        super(str);
        this.f4872f = graphResponse;
    }

    @Override // p007c.p165l.FacebookException, java.lang.Throwable
    public final String toString() {
        GraphResponse graphResponse = this.f4872f;
        FacebookRequestError facebookRequestError = graphResponse != null ? graphResponse.f5409d : null;
        StringBuilder sbM1556G = outline.m1556G("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sbM1556G.append(message);
            sbM1556G.append(" ");
        }
        if (facebookRequestError != null) {
            sbM1556G.append("httpResponseCode: ");
            sbM1556G.append(facebookRequestError.f5176h);
            sbM1556G.append(", facebookErrorCode: ");
            sbM1556G.append(facebookRequestError.f5177i);
            sbM1556G.append(", facebookErrorType: ");
            sbM1556G.append(facebookRequestError.f5179k);
            sbM1556G.append(", message: ");
            sbM1556G.append(facebookRequestError.m2602a());
            sbM1556G.append("}");
        }
        return sbM1556G.toString();
    }
}
