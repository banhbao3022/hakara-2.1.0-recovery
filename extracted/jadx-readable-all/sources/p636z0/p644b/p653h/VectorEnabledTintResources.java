package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: z0.b.h.c1, reason: use source file name */
/* JADX INFO: compiled from: VectorEnabledTintResources.java */
/* JADX INFO: loaded from: classes.dex */
public class VectorEnabledTintResources extends Resources {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f35001a = 0;

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f35002b;

    public VectorEnabledTintResources(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f35002b = new WeakReference<>(context);
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m14850a(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawableM14942l;
        Context context = this.f35002b.get();
        if (context == null) {
            return super.getDrawable(i);
        }
        ResourceManagerInternal resourceManagerInternalM14931d = ResourceManagerInternal.m14931d();
        synchronized (resourceManagerInternalM14931d) {
            Drawable drawableM14941k = resourceManagerInternalM14931d.m14941k(context, i);
            if (drawableM14941k == null) {
                drawableM14941k = m14850a(i);
            }
            drawableM14942l = drawableM14941k != null ? resourceManagerInternalM14931d.m14942l(context, i, false, drawableM14941k) : null;
        }
        return drawableM14942l;
    }
}
