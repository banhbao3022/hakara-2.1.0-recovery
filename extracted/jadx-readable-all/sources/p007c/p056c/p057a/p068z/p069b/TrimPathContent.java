package p007c.p056c.p057a.p068z.p069b;

import java.util.ArrayList;
import java.util.List;
import p007c.p056c.p057a.p059b0.p061k.ShapeTrimPath;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.s, reason: use source file name */
/* JADX INFO: compiled from: TrimPathContent.java */
/* JADX INFO: loaded from: classes.dex */
public class TrimPathContent implements Content, BaseKeyframeAnimation.b {

    /* JADX INFO: renamed from: a */
    public final boolean f2623a;

    /* JADX INFO: renamed from: b */
    public final List<BaseKeyframeAnimation.b> f2624b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ShapeTrimPath.a f2625c;

    /* JADX INFO: renamed from: d */
    public final BaseKeyframeAnimation<?, Float> f2626d;

    /* JADX INFO: renamed from: e */
    public final BaseKeyframeAnimation<?, Float> f2627e;

    /* JADX INFO: renamed from: f */
    public final BaseKeyframeAnimation<?, Float> f2628f;

    public TrimPathContent(BaseLayer2 baseLayer2, ShapeTrimPath shapeTrimPath) {
        String str = shapeTrimPath.f2126a;
        this.f2623a = shapeTrimPath.f2131f;
        this.f2625c = shapeTrimPath.f2127b;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a = shapeTrimPath.f2128c.mo1339a();
        this.f2626d = baseKeyframeAnimationMo1339a;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a2 = shapeTrimPath.f2129d.mo1339a();
        this.f2627e = baseKeyframeAnimationMo1339a2;
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimationMo1339a3 = shapeTrimPath.f2130e.mo1339a();
        this.f2628f = baseKeyframeAnimationMo1339a3;
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a2);
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a3);
        baseKeyframeAnimationMo1339a.f2629a.add(this);
        baseKeyframeAnimationMo1339a2.f2629a.add(this);
        baseKeyframeAnimationMo1339a3.f2629a.add(this);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        for (int i = 0; i < this.f2624b.size(); i++) {
            this.f2624b.get(i).mo1345a();
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
    }
}
