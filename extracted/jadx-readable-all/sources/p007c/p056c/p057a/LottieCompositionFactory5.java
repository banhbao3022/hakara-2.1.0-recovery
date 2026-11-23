package p007c.p056c.p057a;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.c.a.k, reason: use source file name */
/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory5 implements Callable<LottieResult<LottieComposition>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InputStream f2392a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2393b;

    public LottieCompositionFactory5(InputStream inputStream, String str) {
        this.f2392a = inputStream;
        this.f2393b = str;
    }

    @Override // java.util.concurrent.Callable
    public LottieResult<LottieComposition> call() throws Exception {
        return LottieCompositionFactory.m1455c(this.f2392a, this.f2393b);
    }
}
