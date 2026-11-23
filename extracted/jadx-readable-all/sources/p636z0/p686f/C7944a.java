package p636z0.p686f;

import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p693h.p694a.CallbackToFutureAdapter4;

/* JADX INFO: renamed from: z0.f.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7944a {
    /* JADX INFO: renamed from: a */
    public static <T> ListenableFuture<T> m15540a(CallbackToFutureAdapter3<T> callbackToFutureAdapter3) {
        CallbackToFutureAdapter<T> callbackToFutureAdapter = new CallbackToFutureAdapter<>();
        CallbackToFutureAdapter4<T> callbackToFutureAdapter4 = new CallbackToFutureAdapter4<>(callbackToFutureAdapter);
        callbackToFutureAdapter.f36709b = callbackToFutureAdapter4;
        callbackToFutureAdapter.f36708a = callbackToFutureAdapter3.getClass();
        try {
            Object objMo15078a = callbackToFutureAdapter3.mo15078a(callbackToFutureAdapter);
            if (objMo15078a != null) {
                callbackToFutureAdapter.f36708a = objMo15078a;
            }
        } catch (Exception e) {
            callbackToFutureAdapter4.f36713g.mo15653k(e);
        }
        return callbackToFutureAdapter4;
    }
}
