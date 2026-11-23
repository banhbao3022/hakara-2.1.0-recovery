package p007c.p056c.p057a.p059b0.p061k;

import android.graphics.PointF;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p060j.AnimatablePointValue;
import p007c.p056c.p057a.p059b0.p060j.AnimatableValue;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p069b.Content;
import p007c.p056c.p057a.p068z.p069b.EllipseContent;

/* JADX INFO: renamed from: c.c.a.b0.k.a, reason: use source file name */
/* JADX INFO: compiled from: CircleShape.java */
/* JADX INFO: loaded from: classes.dex */
public class CircleShape implements ContentModel {

    /* JADX INFO: renamed from: a */
    public final String f2019a;

    /* JADX INFO: renamed from: b */
    public final AnimatableValue<PointF, PointF> f2020b;

    /* JADX INFO: renamed from: c */
    public final AnimatablePointValue f2021c;

    /* JADX INFO: renamed from: d */
    public final boolean f2022d;

    /* JADX INFO: renamed from: e */
    public final boolean f2023e;

    public CircleShape(String str, AnimatableValue<PointF, PointF> animatableValue, AnimatablePointValue animatablePointValue, boolean z, boolean z2) {
        this.f2019a = str;
        this.f2020b = animatableValue;
        this.f2021c = animatablePointValue;
        this.f2022d = z;
        this.f2023e = z2;
    }

    @Override // p007c.p056c.p057a.p059b0.p061k.ContentModel
    /* JADX INFO: renamed from: a */
    public Content mo1342a(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2) {
        return new EllipseContent(lottieDrawable, baseLayer2, this);
    }
}
