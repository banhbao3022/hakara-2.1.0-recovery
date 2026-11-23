package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8;

/* JADX INFO: renamed from: c.n.b.d.k.b.s8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4667s8<T extends Context & InterfaceC4711w8> {

    /* JADX INFO: renamed from: a */
    public final T f24431a;

    public C4667s8(T t) {
        Objects.requireNonNull(t, "null reference");
        this.f24431a = t;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m10752a(Intent intent) {
        if (intent == null) {
            m10753b().f24418f.m10811a("onUnbind called with null intent");
            return true;
        }
        m10753b().f24426n.m10812b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C4662s3 m10753b() {
        return C4707w4.m10821b(this.f24431a, null, null).mo10684l();
    }

    /* JADX INFO: renamed from: c */
    public final void m10754c(Intent intent) {
        if (intent == null) {
            m10753b().f24418f.m10811a("onRebind called with null intent");
        } else {
            m10753b().f24426n.m10812b("onRebind called. action", intent.getAction());
        }
    }
}
