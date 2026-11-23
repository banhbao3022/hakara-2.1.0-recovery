package p636z0.p644b.p653h;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: renamed from: z0.b.h.v0, reason: use source file name */
/* JADX INFO: compiled from: TintContextWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class TintContextWrapper extends ContextWrapper {

    /* JADX INFO: renamed from: a */
    public static final Object f35238a = new Object();

    /* JADX INFO: renamed from: a */
    public static Context m14982a(Context context) {
        if (!(context instanceof TintContextWrapper) && !(context.getResources() instanceof TintResources) && !(context.getResources() instanceof VectorEnabledTintResources)) {
            int i = VectorEnabledTintResources.f35001a;
        }
        return context;
    }
}
