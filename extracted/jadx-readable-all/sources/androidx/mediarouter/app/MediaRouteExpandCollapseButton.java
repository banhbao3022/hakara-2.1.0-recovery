package androidx.mediarouter.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import mtp.media.karaoke.R;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p729e.ColorUtils;

/* JADX INFO: loaded from: classes.dex */
public class MediaRouteExpandCollapseButton extends ImageButton {

    /* JADX INFO: renamed from: f */
    public final AnimationDrawable f814f;

    /* JADX INFO: renamed from: g */
    public final AnimationDrawable f815g;

    /* JADX INFO: renamed from: h */
    public final String f816h;

    /* JADX INFO: renamed from: i */
    public final String f817i;

    /* JADX INFO: renamed from: j */
    public boolean f818j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f819k;

    /* JADX INFO: renamed from: androidx.mediarouter.app.MediaRouteExpandCollapseButton$a */
    public class ViewOnClickListenerC0132a implements View.OnClickListener {
        public ViewOnClickListenerC0132a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
            boolean z = !mediaRouteExpandCollapseButton.f818j;
            mediaRouteExpandCollapseButton.f818j = z;
            if (z) {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f814f);
                MediaRouteExpandCollapseButton.this.f814f.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.f817i);
            } else {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f815g);
                MediaRouteExpandCollapseButton.this.f815g.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.f816h);
            }
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.f819k;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f819k = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0051  */
    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    /* JADX WARN: Code duplicated, block: B:9:0x0046  */
    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        TypedValue typedValue;
        int color;
        super(context, attributeSet, i);
        Object obj = ContextCompat.f37815a;
        AnimationDrawable animationDrawable = (AnimationDrawable) ContextCompat.c.m16141b(context, R.drawable.mr_group_expand);
        this.f814f = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) ContextCompat.c.m16141b(context, R.drawable.mr_group_collapse);
        this.f815g = animationDrawable2;
        if (i != 0) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{R.attr.colorPrimary});
            color = typedArrayObtainStyledAttributes.getColor(0, 0);
            typedArrayObtainStyledAttributes.recycle();
            if (color == 0) {
                typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
                if (typedValue.resourceId != 0) {
                    color = context.getResources().getColor(typedValue.resourceId);
                } else {
                    color = typedValue.data;
                }
            }
        } else {
            typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            if (typedValue.resourceId != 0) {
                color = context.getResources().getColor(typedValue.resourceId);
            } else {
                color = typedValue.data;
            }
        }
        ThreadLocal<double[]> threadLocal = ColorUtils.f37849a;
        if (Color.alpha(color) == 255) {
            double dM16162a = ColorUtils.m16162a(Color.alpha(-1) < 255 ? ColorUtils.m16163b(-1, color) : -1) + 0.05d;
            double dM16162a2 = ColorUtils.m16162a(color) + 0.05d;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Math.max(dM16162a, dM16162a2) / Math.min(dM16162a, dM16162a2) < 3.0d ? -570425344 : -1, PorterDuff.Mode.SRC_IN);
            animationDrawable.setColorFilter(porterDuffColorFilter);
            animationDrawable2.setColorFilter(porterDuffColorFilter);
            String string = context.getString(R.string.mr_controller_expand_group);
            this.f816h = string;
            this.f817i = context.getString(R.string.mr_controller_collapse_group);
            setImageDrawable(animationDrawable.getFrame(0));
            setContentDescription(string);
            super.setOnClickListener(new ViewOnClickListenerC0132a());
            return;
        }
        StringBuilder sbM1556G = outline.m1556G("background can not be translucent: #");
        sbM1556G.append(Integer.toHexString(color));
        throw new IllegalArgumentException(sbM1556G.toString());
    }
}
