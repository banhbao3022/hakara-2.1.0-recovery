package p636z0.p667e.p676b.p677v1;

import android.util.Pair;
import android.util.Size;
import java.util.List;
import p636z0.p667e.p676b.AspectRatio;

/* JADX INFO: renamed from: z0.e.b.v1.s0, reason: use source file name */
/* JADX INFO: compiled from: ImageOutputConfig.java */
/* JADX INFO: loaded from: classes.dex */
public interface ImageOutputConfig2 extends ReadableConfig2 {

    /* JADX INFO: renamed from: b */
    public static final Config3.a<Integer> f36299b = new AutoValue_Config_Option("camerax.core.imageOutput.targetAspectRatio", AspectRatio.class, null);

    /* JADX INFO: renamed from: c */
    public static final Config3.a<Integer> f36300c = new AutoValue_Config_Option("camerax.core.imageOutput.targetRotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: d */
    public static final Config3.a<Size> f36301d = new AutoValue_Config_Option("camerax.core.imageOutput.targetResolution", Size.class, null);

    /* JADX INFO: renamed from: e */
    public static final Config3.a<Size> f36302e = new AutoValue_Config_Option("camerax.core.imageOutput.defaultResolution", Size.class, null);

    /* JADX INFO: renamed from: f */
    public static final Config3.a<Size> f36303f = new AutoValue_Config_Option("camerax.core.imageOutput.maxResolution", Size.class, null);

    /* JADX INFO: renamed from: g */
    public static final Config3.a<List<Pair<Integer, Size[]>>> f36304g = new AutoValue_Config_Option("camerax.core.imageOutput.supportedResolutions", List.class, null);

    /* JADX INFO: renamed from: f */
    Size mo15342f(Size size);

    /* JADX INFO: renamed from: g */
    List<Pair<Integer, Size[]>> mo15343g(List<Pair<Integer, Size[]>> list);

    /* JADX INFO: renamed from: m */
    Size mo15344m(Size size);

    /* JADX INFO: renamed from: n */
    Size mo15345n(Size size);

    /* JADX INFO: renamed from: q */
    boolean mo15346q();

    /* JADX INFO: renamed from: s */
    int mo15347s();

    /* JADX INFO: renamed from: w */
    int mo15348w(int i);
}
