package p007c.p056c.p057a;

import android.content.Context;
import com.airbnb.lottie.LottieAnimationView;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.c.a.d, reason: use source file name */
/* JADX INFO: compiled from: LottieAnimationView.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView2 implements Callable<LottieResult<LottieComposition>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2240a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LottieAnimationView f2241b;

    public LottieAnimationView2(LottieAnimationView lottieAnimationView, int i) {
        this.f2241b = lottieAnimationView;
        this.f2240a = i;
    }

    @Override // java.util.concurrent.Callable
    public LottieResult<LottieComposition> call() throws Exception {
        LottieAnimationView lottieAnimationView = this.f2241b;
        if (!lottieAnimationView.f28112v) {
            return LottieCompositionFactory.m1457e(lottieAnimationView.getContext(), this.f2240a, null);
        }
        Context context = lottieAnimationView.getContext();
        int i = this.f2240a;
        return LottieCompositionFactory.m1457e(context, i, LottieCompositionFactory.m1460h(context, i));
    }
}
