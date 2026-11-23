package p007c.p190n.p194b.p367f.p368a.p370b;

import com.google.android.play.core.assetpacks.AssetPackState;

/* JADX INFO: renamed from: c.n.b.f.a.b.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5034o implements Runnable {

    /* JADX INFO: renamed from: f */
    public final C5046r f25892f;

    /* JADX INFO: renamed from: g */
    public final AssetPackState f25893g;

    public RunnableC5034o(C5046r c5046r, AssetPackState assetPackState) {
        this.f25892f = c5046r;
        this.f25893g = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25892f.m11560c(this.f25893g);
    }
}
