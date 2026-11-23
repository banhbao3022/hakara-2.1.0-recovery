package p007c.p114h.p126d.p129c.p133c;

import android.content.Context;
import android.text.TextUtils;
import p007c.p114h.p126d.p129c.p130a.GLImageGroupFilter;
import p007c.p114h.p126d.p129c.p133c.p134e.DynamicColor;

/* JADX INFO: renamed from: c.h.d.c.c.d, reason: use source file name */
/* JADX INFO: compiled from: GLImageDynamicColorFilter.java */
/* JADX INFO: loaded from: classes.dex */
public class GLImageDynamicColorFilter extends GLImageGroupFilter {
    public GLImageDynamicColorFilter(Context context, DynamicColor dynamicColor) {
        super(context);
        if (dynamicColor == null || dynamicColor.f4141b == null || TextUtils.isEmpty(dynamicColor.f4140a)) {
            return;
        }
        for (int i = 0; i < dynamicColor.f4141b.size(); i++) {
            this.f4064v.add(new DynamicColorFilter(context, dynamicColor.f4141b.get(i), dynamicColor.f4140a));
        }
    }
}
