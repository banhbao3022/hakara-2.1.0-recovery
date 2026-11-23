package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import mtp.media.karaoke.R;

/* JADX INFO: loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: f */
    public final int f497f;

    /* JADX INFO: renamed from: g */
    public final int f498g;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f497f = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);
        this.f498g = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f497f * 2), this.f498g), 1073741824), i2);
    }
}
