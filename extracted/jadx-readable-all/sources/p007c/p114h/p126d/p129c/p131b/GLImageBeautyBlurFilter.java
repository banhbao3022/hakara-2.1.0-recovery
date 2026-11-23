package p007c.p114h.p126d.p129c.p131b;

import android.content.Context;
import p007c.p114h.p126d.p129c.p130a.GLImageGaussianBlurFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;

/* JADX INFO: renamed from: c.h.d.c.b.b, reason: use source file name */
/* JADX INFO: compiled from: GLImageBeautyBlurFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageBeautyBlurFilter extends GLImageGaussianBlurFilter {
    public GLImageBeautyBlurFilter(Context context) {
        this(context, OpenGLUtils.m2186k(context, "shader/beauty/vertex_beauty_blur.glsl"), OpenGLUtils.m2186k(context, "shader/beauty/fragment_beauty_blur.glsl"));
    }

    public GLImageBeautyBlurFilter(Context context, String str, String str2) {
        super(context, str, str2);
    }
}
