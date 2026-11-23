package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.a.qu */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3449qu implements zc2<WeakReference<Context>> {

    /* JADX INFO: renamed from: a */
    public final C3338nu f18438a;

    public C3449qu(C3338nu c3338nu) {
        this.f18438a = c3338nu;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        WeakReference<Context> weakReference = this.f18438a.f17276c;
        Objects.requireNonNull(weakReference, "Cannot return null from a non-@Nullable @Provides method");
        return weakReference;
    }
}
