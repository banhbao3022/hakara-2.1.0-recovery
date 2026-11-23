package p007c.p056c.p057a.p068z.p069b;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import p007c.p056c.p057a.p059b0.p061k.MergePaths;
import p007c.p056c.p057a.p068z.p070c.TransformKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.z.b.l, reason: use source file name */
/* JADX INFO: compiled from: MergePathsContent.java */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class MergePathsContent implements PathContent, GreedyContent {

    /* JADX INFO: renamed from: a */
    public final Path f2573a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f2574b = new Path();

    /* JADX INFO: renamed from: c */
    public final Path f2575c = new Path();

    /* JADX INFO: renamed from: d */
    public final List<PathContent> f2576d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final MergePaths f2577e;

    public MergePathsContent(MergePaths mergePaths) {
        String str = mergePaths.f2059a;
        this.f2577e = mergePaths;
    }

    @TargetApi(19)
    /* JADX INFO: renamed from: a */
    public final void m1499a(Path.Op op) {
        Matrix matrixM1524e;
        Matrix matrixM1524e2;
        this.f2574b.reset();
        this.f2573a.reset();
        for (int size = this.f2576d.size() - 1; size >= 1; size--) {
            PathContent pathContent = this.f2576d.get(size);
            if (pathContent instanceof ContentGroup) {
                ContentGroup contentGroup = (ContentGroup) pathContent;
                List<PathContent> listM1492e = contentGroup.m1492e();
                for (int size2 = listM1492e.size() - 1; size2 >= 0; size2--) {
                    Path pathMo1493g = listM1492e.get(size2).mo1493g();
                    TransformKeyframeAnimation transformKeyframeAnimation = contentGroup.f2525k;
                    if (transformKeyframeAnimation != null) {
                        matrixM1524e2 = transformKeyframeAnimation.m1524e();
                    } else {
                        contentGroup.f2517c.reset();
                        matrixM1524e2 = contentGroup.f2517c;
                    }
                    pathMo1493g.transform(matrixM1524e2);
                    this.f2574b.addPath(pathMo1493g);
                }
            } else {
                this.f2574b.addPath(pathContent.mo1493g());
            }
        }
        PathContent pathContent2 = this.f2576d.get(0);
        if (pathContent2 instanceof ContentGroup) {
            ContentGroup contentGroup2 = (ContentGroup) pathContent2;
            List<PathContent> listM1492e2 = contentGroup2.m1492e();
            for (int i = 0; i < listM1492e2.size(); i++) {
                Path pathMo1493g2 = listM1492e2.get(i).mo1493g();
                TransformKeyframeAnimation transformKeyframeAnimation2 = contentGroup2.f2525k;
                if (transformKeyframeAnimation2 != null) {
                    matrixM1524e = transformKeyframeAnimation2.m1524e();
                } else {
                    contentGroup2.f2517c.reset();
                    matrixM1524e = contentGroup2.f2517c;
                }
                pathMo1493g2.transform(matrixM1524e);
                this.f2573a.addPath(pathMo1493g2);
            }
        } else {
            this.f2573a.set(pathContent2.mo1493g());
        }
        this.f2575c.op(this.f2573a, this.f2574b, op);
    }

    @Override // p007c.p056c.p057a.p068z.p069b.Content
    /* JADX INFO: renamed from: b */
    public void mo1346b(List<Content> list, List<Content> list2) {
        for (int i = 0; i < this.f2576d.size(); i++) {
            this.f2576d.get(i).mo1346b(list, list2);
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.GreedyContent
    /* JADX INFO: renamed from: e */
    public void mo1498e(ListIterator<Content> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            Content contentPrevious = listIterator.previous();
            if (contentPrevious instanceof PathContent) {
                this.f2576d.add((PathContent) contentPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // p007c.p056c.p057a.p068z.p069b.PathContent
    /* JADX INFO: renamed from: g */
    public Path mo1493g() {
        this.f2575c.reset();
        MergePaths mergePaths = this.f2577e;
        if (mergePaths.f2061c) {
            return this.f2575c;
        }
        int iOrdinal = mergePaths.f2060b.ordinal();
        if (iOrdinal == 0) {
            for (int i = 0; i < this.f2576d.size(); i++) {
                this.f2575c.addPath(this.f2576d.get(i).mo1493g());
            }
        } else if (iOrdinal == 1) {
            m1499a(Path.Op.UNION);
        } else if (iOrdinal == 2) {
            m1499a(Path.Op.REVERSE_DIFFERENCE);
        } else if (iOrdinal == 3) {
            m1499a(Path.Op.INTERSECT);
        } else if (iOrdinal == 4) {
            m1499a(Path.Op.XOR);
        }
        return this.f2575c;
    }
}
