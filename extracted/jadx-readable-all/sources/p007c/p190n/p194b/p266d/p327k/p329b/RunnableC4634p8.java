package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ComponentName;

/* JADX INFO: renamed from: c.n.b.d.k.b.p8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4634p8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ComponentName f24273f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ServiceConnectionC4610n8 f24274g;

    public RunnableC4634p8(ServiceConnectionC4610n8 serviceConnectionC4610n8, ComponentName componentName) {
        this.f24274g = serviceConnectionC4610n8;
        this.f24273f = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7.m10766x(this.f24274g.f24189c, this.f24273f);
    }
}
