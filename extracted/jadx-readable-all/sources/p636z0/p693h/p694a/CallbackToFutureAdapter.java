package p636z0.p693h.p694a;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.h.a.b, reason: use source file name */
/* JADX INFO: compiled from: CallbackToFutureAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter<T> {

    /* JADX INFO: renamed from: a */
    public Object f36708a;

    /* JADX INFO: renamed from: b */
    public CallbackToFutureAdapter4<T> f36709b;

    /* JADX INFO: renamed from: c */
    public ResolvableFuture<Void> f36710c = new ResolvableFuture<>();

    /* JADX INFO: renamed from: d */
    public boolean f36711d;

    /* JADX INFO: renamed from: a */
    public boolean m15659a(T t) {
        this.f36711d = true;
        CallbackToFutureAdapter4<T> callbackToFutureAdapter4 = this.f36709b;
        boolean z = callbackToFutureAdapter4 != null && callbackToFutureAdapter4.f36713g.mo15652j(t);
        if (z) {
            m15660b();
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m15660b() {
        this.f36708a = null;
        this.f36709b = null;
        this.f36710c = null;
    }

    /* JADX INFO: renamed from: c */
    public boolean m15661c(Throwable th) {
        this.f36711d = true;
        CallbackToFutureAdapter4<T> callbackToFutureAdapter4 = this.f36709b;
        boolean z = callbackToFutureAdapter4 != null && callbackToFutureAdapter4.f36713g.mo15653k(th);
        if (z) {
            m15660b();
        }
        return z;
    }

    public void finalize() {
        ResolvableFuture<Void> resolvableFuture;
        CallbackToFutureAdapter4<T> callbackToFutureAdapter4 = this.f36709b;
        if (callbackToFutureAdapter4 != null && !callbackToFutureAdapter4.isDone()) {
            StringBuilder sbM1556G = outline.m1556G("The completer object was garbage collected - this future would otherwise never complete. The tag was: ");
            sbM1556G.append(this.f36708a);
            callbackToFutureAdapter4.f36713g.mo15653k(new CallbackToFutureAdapter2(sbM1556G.toString()));
        }
        if (this.f36711d || (resolvableFuture = this.f36710c) == null) {
            return;
        }
        resolvableFuture.mo15652j(null);
    }
}
