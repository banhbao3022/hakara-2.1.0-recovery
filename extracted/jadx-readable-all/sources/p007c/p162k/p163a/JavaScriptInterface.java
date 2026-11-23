package p007c.p162k.p163a;

import android.webkit.JavascriptInterface;
import p007c.p162k.p163a.p164f.CallJavaResultInterface;
import p007c.p162k.p163a.p164f.JsCallback;

/* JADX INFO: renamed from: c.k.a.b, reason: use source file name */
/* JADX INFO: compiled from: JavaScriptInterface.java */
/* JADX INFO: loaded from: classes.dex */
public class JavaScriptInterface {

    /* JADX INFO: renamed from: a */
    public final CallJavaResultInterface f4483a;

    public JavaScriptInterface(CallJavaResultInterface callJavaResultInterface) {
        this.f4483a = callJavaResultInterface;
    }

    @JavascriptInterface
    public void returnResultToJava(String str) {
        JsEvaluator2 jsEvaluator2 = (JsEvaluator2) this.f4483a;
        JsCallback andSet = jsEvaluator2.f4488c.getAndSet(null);
        if (andSet == null) {
            return;
        }
        HandlerWrapper handlerWrapper = jsEvaluator2.f4489d;
        handlerWrapper.f4482a.post(new JsEvaluator(jsEvaluator2, str, andSet));
    }
}
