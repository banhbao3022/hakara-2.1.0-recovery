package p007c.p056c.p057a.p068z.p069b;

import android.graphics.Path;
import java.util.List;
import p007c.p056c.p057a.LottieDrawable;
import p007c.p056c.p057a.p059b0.p061k.ShapeData;
import p007c.p056c.p057a.p059b0.p061k.ShapePath;
import p007c.p056c.p057a.p059b0.p061k.ShapeTrimPath;
import p007c.p056c.p057a.p059b0.p062l.BaseLayer2;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.q, reason: use source file name */
/* JADX INFO: compiled from: ShapeContent.java */
/* JADX INFO: loaded from: classes.dex */
public class ShapeContent implements PathContent, BaseKeyframeAnimation.b {

    /* JADX INFO: renamed from: b */
    public final boolean f2613b;

    /* JADX INFO: renamed from: c */
    public final LottieDrawable f2614c;

    /* JADX INFO: renamed from: d */
    public final BaseKeyframeAnimation<?, Path> f2615d;

    /* JADX INFO: renamed from: e */
    public boolean f2616e;

    /* JADX INFO: renamed from: a */
    public final Path f2612a = new Path();

    /* JADX INFO: renamed from: f */
    public CompoundTrimPathContent f2617f = new CompoundTrimPathContent();

    public ShapeContent(LottieDrawable lottieDrawable, BaseLayer2 baseLayer2, ShapePath shapePath) {
        String str = shapePath.f2104a;
        this.f2613b = shapePath.f2107d;
        this.f2614c = lottieDrawable;
        BaseKeyframeAnimation<ShapeData, Path> baseKeyframeAnimationMo1339a = shapePath.f2106c.mo1339a();
        this.f2615d = baseKeyframeAnimationMo1339a;
        baseLayer2.m1348e(baseKeyframeAnimationMo1339a);
        baseKeyframeAnimationMo1339a.f2629a.add(this);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation.b
    /* JADX INFO: renamed from: a */
    public void mo1345a() {
        this.f2616e = false;
        this.f2614c.invalidateSelf();
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list.size(); i++) {
            Content content = list.get(i);
            if (content instanceof TrimPathContent) {
                TrimPathContent trimPathContent = (TrimPathContent) content;
                if (trimPathContent.f2625c == ShapeTrimPath.a.SIMULTANEOUSLY) {
                    this.f2617f.f2514a.add(trimPathContent);
                    trimPathContent.f2624b.add(this);
                }
            }
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.PathContent
    /* JADX INFO: renamed from: g */
    public Path mo1493g() {
        if (this.f2616e) {
            return this.f2612a;
        }
        this.f2612a.reset();
        if (this.f2613b) {
            this.f2616e = true;
            return this.f2612a;
        }
        this.f2612a.set(this.f2615d.mo1504e());
        this.f2612a.setFillType(Path.FillType.EVEN_ODD);
        this.f2617f.m1491a(this.f2612a);
        this.f2616e = true;
        return this.f2612a;
    }
}
