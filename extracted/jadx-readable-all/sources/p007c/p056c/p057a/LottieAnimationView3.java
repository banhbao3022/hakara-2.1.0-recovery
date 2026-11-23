package p007c.p056c.p057a;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.c.a.e, reason: use source file name */
/* JADX INFO: compiled from: LottieAnimationView.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView3 implements Callable<LottieResult<LottieComposition>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2319a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LottieAnimationView f2320b;

    public LottieAnimationView3(LottieAnimationView lottieAnimationView, String str) {
        this.f2320b = lottieAnimationView;
        this.f2319a = str;
    }

    @Override // java.util.concurrent.Callable
    public LottieResult<LottieComposition> call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f2320b;
        if (!lottieAnimationView.f28112v) {
            return LottieCompositionFactory.m1454b(lottieAnimationView.getContext(), this.f2319a, null);
        }
        Context context = lottieAnimationView.getContext();
        String str = this.f2319a;
        Map<String, LottieTask2<LottieComposition>> map = LottieCompositionFactory.f2378a;
        return LottieCompositionFactory.m1454b(context, str, "asset_" + str);
    }
}
