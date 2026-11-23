package p007c.p085g.p086a.p089m.p098v.p101f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p651g.ContextThemeWrapper;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p727d.p728c.ResourcesCompat;

/* JADX INFO: renamed from: c.g.a.m.v.f.a, reason: use source file name */
/* JADX INFO: compiled from: DrawableDecoderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class DrawableDecoderCompat {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f3605a = true;

    /* JADX INFO: renamed from: a */
    public static Drawable m1918a(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (f3605a) {
                return AppCompatResources.m14707b(theme != null ? new ContextThemeWrapper(context2, theme) : context2, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            Object obj = ContextCompat.f37815a;
            return ContextCompat.c.m16141b(context2, i);
        } catch (NoClassDefFoundError unused2) {
            f3605a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f37835a;
        return resources.getDrawable(i, theme);
    }
}
