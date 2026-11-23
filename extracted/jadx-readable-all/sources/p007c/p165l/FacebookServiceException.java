package p007c.p165l;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.l.q, reason: use source file name */
/* JADX INFO: compiled from: FacebookServiceException.java */
/* JADX INFO: loaded from: classes.dex */
public class FacebookServiceException extends FacebookException {

    /* JADX INFO: renamed from: f */
    public final FacebookRequestError f5370f;

    public FacebookServiceException(FacebookRequestError facebookRequestError, String str) {
        super(str);
        this.f5370f = facebookRequestError;
    }

    @Override // p007c.p165l.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sbM1561L = outline.m1561L("{FacebookServiceException: ", "httpResponseCode: ");
        sbM1561L.append(this.f5370f.f5176h);
        sbM1561L.append(", facebookErrorCode: ");
        sbM1561L.append(this.f5370f.f5177i);
        sbM1561L.append(", facebookErrorType: ");
        sbM1561L.append(this.f5370f.f5179k);
        sbM1561L.append(", message: ");
        sbM1561L.append(this.f5370f.m2602a());
        sbM1561L.append("}");
        return sbM1561L.toString();
    }
}
