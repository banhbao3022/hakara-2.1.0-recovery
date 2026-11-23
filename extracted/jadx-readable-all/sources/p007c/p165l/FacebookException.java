package p007c.p165l;

import java.util.Random;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.p179k0.InstrumentUtility2;
import p007c.p165l.p178k0.p179k0.p181g.ErrorReportData;

/* JADX INFO: renamed from: c.l.j, reason: use source file name */
/* JADX INFO: compiled from: FacebookException.java */
/* JADX INFO: loaded from: classes.dex */
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: c.l.j$a */
    /* JADX INFO: compiled from: FacebookException.java */
    public class a implements FeatureManager.b {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f4868a;

        public a(FacebookException facebookException, String str) {
            this.f4868a = str;
        }

        @Override // p007c.p165l.p178k0.FeatureManager.b
        /* JADX INFO: renamed from: a */
        public void mo2314a(boolean z) {
            if (z) {
                try {
                    ErrorReportData errorReportData = new ErrorReportData(this.f4868a);
                    if ((errorReportData.f4977b == null || errorReportData.f4978c == null) ? false : true) {
                        InstrumentUtility2.m2508e(errorReportData.f4976a, errorReportData.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public FacebookException() {
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getMessage();
    }

    public FacebookException(String str) {
        super(str);
        Random random = new Random();
        if (str == null || !FacebookSdk.m2664f() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager.m2514a(13, new a(this, str));
    }

    public FacebookException(String str, Object... objArr) {
        this(String.format(str, objArr));
    }

    public FacebookException(String str, Throwable th) {
        super(str, th);
    }

    public FacebookException(Throwable th) {
        super(th);
    }
}
