package p007c.p056c.p057a.p059b0.p062l;

import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.l.a, reason: use source file name */
/* JADX INFO: compiled from: BaseLayer.java */
/* JADX INFO: loaded from: classes.dex */
public class BaseLayer implements BaseKeyframeAnimation.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseLayer2 f2135a;

    public BaseLayer(BaseLayer2 baseLayer2) {
        this.f2135a = baseLayer2;
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        BaseLayer2 baseLayer2 = this.f2135a;
        boolean z = baseLayer2.f2152q.m1516j() == 1.0f;
        if (z != baseLayer2.f2158w) {
            baseLayer2.f2158w = z;
            baseLayer2.f2149n.invalidateSelf();
        }
    }
}
