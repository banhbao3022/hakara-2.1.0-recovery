package p007c.p056c.p057a;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.c.a.i, reason: use source file name */
/* JADX INFO: compiled from: LottieCompositionFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieCompositionFactory3 implements Callable<LottieResult<LottieComposition>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f2385a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f2386b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f2387c;

    public LottieCompositionFactory3(Context context, String str, String str2) {
        this.f2385a = context;
        this.f2386b = str;
        this.f2387c = str2;
    }

    @Override // java.util.concurrent.Callable
    public LottieResult<LottieComposition> call() throws Exception {
        return LottieCompositionFactory.m1454b(this.f2385a, this.f2386b, this.f2387c);
    }
}
