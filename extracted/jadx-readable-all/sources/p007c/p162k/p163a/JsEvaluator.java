package p007c.p162k.p163a;

import p007c.p162k.p163a.p164f.JsCallback;

/* JADX INFO: renamed from: c.k.a.c, reason: use source file name */
/* JADX INFO: compiled from: JsEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class JsEvaluator implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f4484f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ JsCallback f4485g;

    public JsEvaluator(JsEvaluator2 jsEvaluator2, String str, JsCallback jsCallback) {
        this.f4484f = str;
        this.f4485g = jsCallback;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.f4484f;
        if (str == null || !str.startsWith("evgeniiJsEvaluatorException")) {
            this.f4485g.mo2245a(this.f4484f);
        } else {
            this.f4485g.onError(this.f4484f.substring(27));
        }
    }
}
