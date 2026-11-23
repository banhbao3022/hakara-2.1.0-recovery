package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(28)
public final class C2250c extends C2291p1 {
    /* JADX INFO: renamed from: s */
    public static final void m4708s(boolean z, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = true != z ? 2 : 1;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2253d
    /* JADX INFO: renamed from: q */
    public final void mo4709q(final Activity activity) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14197H0)).booleanValue() && ((C2311z0) C2330u.f10884a.f10893h.m6649f()).m4840k() == null && !activity.isInMultiWindowMode()) {
            m4708s(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this, activity) { // from class: c.n.b.d.a.z.b.b

                /* JADX INFO: renamed from: a */
                public final Activity f10690a;

                {
                    this.f10690a = activity;
                }

                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    Activity activity2 = this.f10690a;
                    C2330u c2330u = C2330u.f10884a;
                    if (((C2311z0) c2330u.f10893h.m6649f()).m4840k() == null) {
                        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                        String strConcat = "";
                        if (displayCutout != null) {
                            InterfaceC2305w0 interfaceC2305w0M6649f = c2330u.f10893h.m6649f();
                            for (Rect rect : displayCutout.getBoundingRects()) {
                                String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = String.valueOf(strConcat).concat("|");
                                }
                                String strValueOf = String.valueOf(strConcat);
                                String strValueOf2 = String.valueOf(str);
                                strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                            }
                            ((C2311z0) interfaceC2305w0M6649f).m4841m(strConcat);
                        } else {
                            ((C2311z0) c2330u.f10893h.m6649f()).m4841m("");
                        }
                    }
                    C2250c.m4708s(false, activity2);
                    return view.onApplyWindowInsets(windowInsets);
                }
            });
        }
    }
}
