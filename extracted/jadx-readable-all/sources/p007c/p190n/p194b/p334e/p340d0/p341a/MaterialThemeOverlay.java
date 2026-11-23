package p007c.p190n.p194b.p334e.p340d0.p341a;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p636z0.p644b.p651g.ContextThemeWrapper;

/* JADX INFO: renamed from: c.n.b.e.d0.a.a, reason: use source file name */
/* JADX INFO: compiled from: MaterialThemeOverlay.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialThemeOverlay {

    /* JADX INFO: renamed from: a */
    public static final int[] f24942a = {R.attr.theme, mtp.media.karaoke.R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f24943b = {mtp.media.karaoke.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m11090a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f24943b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).f34667a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f24942a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return contextThemeWrapper;
    }
}
