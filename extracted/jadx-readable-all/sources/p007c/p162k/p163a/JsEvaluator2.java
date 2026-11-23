package p007c.p162k.p163a;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p162k.p163a.p164f.CallJavaResultInterface;
import p007c.p162k.p163a.p164f.JsCallback;
import p007c.p162k.p163a.p164f.WebViewWrapperInterface;

/* JADX INFO: renamed from: c.k.a.d, reason: use source file name */
/* JADX INFO: compiled from: JsEvaluator.java */
/* JADX INFO: loaded from: classes.dex */
public class JsEvaluator2 implements CallJavaResultInterface {

    /* JADX INFO: renamed from: a */
    public WebViewWrapperInterface f4486a;

    /* JADX INFO: renamed from: b */
    public final Context f4487b;

    /* JADX INFO: renamed from: c */
    public AtomicReference<JsCallback> f4488c = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d */
    public HandlerWrapper f4489d = new HandlerWrapper();

    public JsEvaluator2(Context context) {
        this.f4487b = context;
    }
}
