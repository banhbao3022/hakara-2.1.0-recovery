package p500e1.p501a.p503c2;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p485u.CoroutineContext;
import p500e1.p501a.CoroutineScope;

/* JADX INFO: renamed from: e1.a.c2.e, reason: use source file name */
/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Scopes implements CoroutineScope {

    /* JADX INFO: renamed from: f */
    public final CoroutineContext f29641f;

    public Scopes(CoroutineContext coroutineContext) {
        this.f29641f = coroutineContext;
    }

    @Override // p500e1.p501a.CoroutineScope
    /* JADX INFO: renamed from: h */
    public CoroutineContext mo417h() {
        return this.f29641f;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CoroutineScope(coroutineContext=");
        sbM1556G.append(this.f29641f);
        sbM1556G.append(')');
        return sbM1556G.toString();
    }
}
