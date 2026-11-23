package p007c.p451o.p452a.p461e.p463b;

import android.widget.ImageView;
import java.util.List;
import p007c.p451o.p452a.p460d.ImageLoader;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.o.a.e.b.a, reason: use source file name */
/* JADX INFO: compiled from: BuilderData.kt */
/* JADX INFO: loaded from: classes.dex */
public final class BuilderData<T> {

    /* JADX INFO: renamed from: a */
    public int f27869a;

    /* JADX INFO: renamed from: b */
    public int f27870b;

    /* JADX INFO: renamed from: c */
    public int[] f27871c;

    /* JADX INFO: renamed from: d */
    public boolean f27872d;

    /* JADX INFO: renamed from: e */
    public boolean f27873e;

    /* JADX INFO: renamed from: f */
    public boolean f27874f;

    /* JADX INFO: renamed from: g */
    public ImageView f27875g;

    /* JADX INFO: renamed from: h */
    public final List<T> f27876h;

    /* JADX INFO: renamed from: i */
    public final ImageLoader<T> f27877i;

    /* JADX WARN: Multi-variable type inference failed */
    public BuilderData(List<? extends T> list, ImageLoader<T> imageLoader) {
        Intrinsics2.m13090f(list, "images");
        Intrinsics2.m13090f(imageLoader, "imageLoader");
        this.f27876h = list;
        this.f27877i = imageLoader;
        this.f27869a = -16777216;
        this.f27871c = new int[4];
        this.f27872d = true;
        this.f27873e = true;
        this.f27874f = true;
    }
}
