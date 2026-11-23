package p007c.p056c.p057a.p068z.p070c;

import java.util.List;
import java.util.Objects;
import p007c.p056c.p057a.p059b0.p061k.GradientColor;
import p007c.p056c.p057a.p066e0.GammaEvaluator;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.z.c.d, reason: use source file name */
/* JADX INFO: compiled from: GradientColorKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class GradientColorKeyframeAnimation extends KeyframeAnimation<GradientColor> {

    /* JADX INFO: renamed from: i */
    public final GradientColor f2643i;

    public GradientColorKeyframeAnimation(List<Keyframe<GradientColor>> list) {
        super(list);
        GradientColor gradientColor = list.get(0).f2359b;
        int length = gradientColor != null ? gradientColor.f2025b.length : 0;
        this.f2643i = new GradientColor(new float[length], new int[length]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public Object mo1505f(Keyframe keyframe, float f) {
        GradientColor gradientColor = this.f2643i;
        GradientColor gradientColor2 = (GradientColor) keyframe.f2359b;
        GradientColor gradientColor3 = (GradientColor) keyframe.f2360c;
        Objects.requireNonNull(gradientColor);
        if (gradientColor2.f2025b.length != gradientColor3.f2025b.length) {
            StringBuilder sbM1556G = outline.m1556G("Cannot interpolate between gradients. Lengths vary (");
            sbM1556G.append(gradientColor2.f2025b.length);
            sbM1556G.append(" vs ");
            throw new IllegalArgumentException(outline.m1603y(sbM1556G, gradientColor3.f2025b.length, ")"));
        }
        for (int i = 0; i < gradientColor2.f2025b.length; i++) {
            gradientColor.f2024a[i] = MiscUtils.m1435e(gradientColor2.f2024a[i], gradientColor3.f2024a[i], f);
            gradientColor.f2025b[i] = GammaEvaluator.m1418c(f, gradientColor2.f2025b[i], gradientColor3.f2025b[i]);
        }
        return this.f2643i;
    }
}
