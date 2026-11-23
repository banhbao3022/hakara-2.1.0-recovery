package p007c.p056c.p057a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.c.a.j, reason: use source file name */
/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory4 implements Callable<LottieResult<LottieComposition>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f2388a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2389b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f2390c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f2391d;

    public LottieCompositionFactory4(WeakReference weakReference, Context context, int i, String str) {
        this.f2388a = weakReference;
        this.f2389b = context;
        this.f2390c = i;
        this.f2391d = str;
    }

    @Override // java.util.concurrent.Callable
    public LottieResult<LottieComposition> call() throws Exception {
        Context context = (Context) this.f2388a.get();
        if (context == null) {
            context = this.f2389b;
        }
        return LottieCompositionFactory.m1457e(context, this.f2390c, this.f2391d);
    }
}
