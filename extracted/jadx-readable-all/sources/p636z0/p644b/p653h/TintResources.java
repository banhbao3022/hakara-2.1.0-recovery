package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: z0.b.h.x0, reason: use source file name */
/* JADX INFO: compiled from: TintResources.java */
/* JADX INFO: loaded from: classes.dex */
public class TintResources extends ResourcesWrapper {

    /* JADX INFO: renamed from: b */
    public final WeakReference<Context> f35262b;

    public TintResources(Context context, Resources resources) {
        super(resources);
        this.f35262b = new WeakReference<>(context);
    }

    @Override // p636z0.p644b.p653h.ResourcesWrapper, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = this.f35141a.getDrawable(i);
        Context context = this.f35262b.get();
        if (drawable != null && context != null) {
            ResourceManagerInternal.m14931d().m14943m(context, i, drawable);
        }
        return drawable;
    }
}
