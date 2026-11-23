package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;
import mtp.media.karaoke.R;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p729e.ColorUtils;

/* JADX INFO: renamed from: z0.b.h.j, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDrawableManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppCompatDrawableManager {

    /* JADX INFO: renamed from: a */
    public static final PorterDuff.Mode f35069a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public static AppCompatDrawableManager f35070b;

    /* JADX INFO: renamed from: c */
    public ResourceManagerInternal f35071c;

    /* JADX INFO: renamed from: z0.b.h.j$a */
    /* JADX INFO: compiled from: AppCompatDrawableManager.java */
    public class a implements ResourceManagerInternal.f {

        /* JADX INFO: renamed from: a */
        public final int[] f35072a = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};

        /* JADX INFO: renamed from: b */
        public final int[] f35073b = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};

        /* JADX INFO: renamed from: c */
        public final int[] f35074c = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};

        /* JADX INFO: renamed from: d */
        public final int[] f35075d = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};

        /* JADX INFO: renamed from: e */
        public final int[] f35076e = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};

        /* JADX INFO: renamed from: f */
        public final int[] f35077f = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

        /* JADX INFO: renamed from: a */
        public final boolean m14910a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: b */
        public final ColorStateList m14911b(Context context, int i) {
            int iM14964c = ThemeUtils.m14964c(context, R.attr.colorControlHighlight);
            return new ColorStateList(new int[][]{ThemeUtils.f35198b, ThemeUtils.f35200d, ThemeUtils.f35199c, ThemeUtils.f35202f}, new int[]{ThemeUtils.m14963b(context, R.attr.colorButtonNormal), ColorUtils.m16163b(iM14964c, i), ColorUtils.m16163b(iM14964c, i), i});
        }

        /* JADX INFO: renamed from: c */
        public final LayerDrawable m14912c(ResourceManagerInternal resourceManagerInternal, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableM14938f = resourceManagerInternal.m14938f(context, R.drawable.abc_star_black_48dp);
            Drawable drawableM14938f2 = resourceManagerInternal.m14938f(context, R.drawable.abc_star_half_black_48dp);
            if ((drawableM14938f instanceof BitmapDrawable) && drawableM14938f.getIntrinsicWidth() == dimensionPixelSize && drawableM14938f.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableM14938f;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableM14938f.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM14938f.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableM14938f2 instanceof BitmapDrawable) && drawableM14938f2.getIntrinsicWidth() == dimensionPixelSize && drawableM14938f2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableM14938f2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableM14938f2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableM14938f2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, android.R.id.background);
            layerDrawable.setId(1, android.R.id.secondaryProgress);
            layerDrawable.setId(2, android.R.id.progress);
            return layerDrawable;
        }

        /* JADX INFO: renamed from: d */
        public ColorStateList m14913d(Context context, int i) {
            if (i == R.drawable.abc_edit_text_material) {
                return AppCompatResources.m14706a(context, R.color.abc_tint_edittext);
            }
            if (i == R.drawable.abc_switch_track_mtrl_alpha) {
                return AppCompatResources.m14706a(context, R.color.abc_tint_switch_track);
            }
            if (i == R.drawable.abc_switch_thumb_material) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList colorStateListM14965d = ThemeUtils.m14965d(context, R.attr.colorSwitchThumbNormal);
                if (colorStateListM14965d == null || !colorStateListM14965d.isStateful()) {
                    iArr[0] = ThemeUtils.f35198b;
                    iArr2[0] = ThemeUtils.m14963b(context, R.attr.colorSwitchThumbNormal);
                    iArr[1] = ThemeUtils.f35201e;
                    iArr2[1] = ThemeUtils.m14964c(context, R.attr.colorControlActivated);
                    iArr[2] = ThemeUtils.f35202f;
                    iArr2[2] = ThemeUtils.m14964c(context, R.attr.colorSwitchThumbNormal);
                } else {
                    iArr[0] = ThemeUtils.f35198b;
                    iArr2[0] = colorStateListM14965d.getColorForState(iArr[0], 0);
                    iArr[1] = ThemeUtils.f35201e;
                    iArr2[1] = ThemeUtils.m14964c(context, R.attr.colorControlActivated);
                    iArr[2] = ThemeUtils.f35202f;
                    iArr2[2] = colorStateListM14965d.getDefaultColor();
                }
                return new ColorStateList(iArr, iArr2);
            }
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return m14911b(context, ThemeUtils.m14964c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return m14911b(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return m14911b(context, ThemeUtils.m14964c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return AppCompatResources.m14706a(context, R.color.abc_tint_spinner);
            }
            if (m14910a(this.f35073b, i)) {
                return ThemeUtils.m14965d(context, R.attr.colorControlNormal);
            }
            if (m14910a(this.f35076e, i)) {
                return AppCompatResources.m14706a(context, R.color.abc_tint_default);
            }
            if (m14910a(this.f35077f, i)) {
                return AppCompatResources.m14706a(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return AppCompatResources.m14706a(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }

        /* JADX INFO: renamed from: e */
        public final void m14914e(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (DrawableUtils.m14885a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = AppCompatDrawableManager.f35069a;
            }
            drawable.setColorFilter(AppCompatDrawableManager.m14905c(i, mode));
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized AppCompatDrawableManager m14904a() {
        if (f35070b == null) {
            m14906e();
        }
        return f35070b;
    }

    /* JADX INFO: renamed from: c */
    public static synchronized PorterDuffColorFilter m14905c(int i, PorterDuff.Mode mode) {
        return ResourceManagerInternal.m14932h(i, mode);
    }

    /* JADX INFO: renamed from: e */
    public static synchronized void m14906e() {
        if (f35070b == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            f35070b = appCompatDrawableManager;
            appCompatDrawableManager.f35071c = ResourceManagerInternal.m14931d();
            ResourceManagerInternal resourceManagerInternal = f35070b.f35071c;
            a aVar = new a();
            synchronized (resourceManagerInternal) {
                resourceManagerInternal.f35140j = aVar;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m14907f(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        PorterDuff.Mode mode = ResourceManagerInternal.f35131a;
        if (DrawableUtils.m14885a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z = tintInfo.f35244d;
        if (z || tintInfo.f35243c) {
            PorterDuffColorFilter porterDuffColorFilterM14932h = null;
            ColorStateList colorStateList = z ? tintInfo.f35241a : null;
            PorterDuff.Mode mode2 = tintInfo.f35243c ? tintInfo.f35242b : ResourceManagerInternal.f35131a;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterM14932h = ResourceManagerInternal.m14932h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterM14932h);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized Drawable m14908b(Context context, int i) {
        return this.f35071c.m14938f(context, i);
    }

    /* JADX INFO: renamed from: d */
    public synchronized ColorStateList m14909d(Context context, int i) {
        return this.f35071c.m14940i(context, i);
    }
}
