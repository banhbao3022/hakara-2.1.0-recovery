package mtp.media.karaoke.addon.seekbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import java.util.ArrayList;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p597g.p600c.ProgressItem;
import p636z0.p644b.p653h.AppCompatSeekBar;

/* JADX INFO: compiled from: CustomSeekBar.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CustomSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: g */
    public ArrayList<ProgressItem> f33449g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSeekBar(Context context) {
        super(context);
        Intrinsics2.m13089e(context, "context");
        this.f33449g = new ArrayList<>();
    }

    @Override // p636z0.p644b.p653h.AppCompatSeekBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics2.m13089e(canvas, "canvas");
        if (this.f33449g.size() > 0) {
            int width = getWidth();
            int height = getHeight();
            int thumbOffset = getThumbOffset();
            int size = this.f33449g.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                ProgressItem progressItem = this.f33449g.get(i);
                Intrinsics2.m13088d(progressItem, "mProgressItemsList[i]");
                ProgressItem progressItem2 = progressItem;
                Paint paint = new Paint();
                paint.setColor(getResources().getColor(progressItem2.f32171a));
                int i3 = ((int) ((progressItem2.f32172b * width) / 100)) + i2;
                if (i == this.f33449g.size() - 1 && i3 != width) {
                    i3 = width;
                }
                Rect rect = new Rect();
                int i4 = thumbOffset / 2;
                rect.set(i2, i4, i3, height - i4);
                canvas.drawRect(rect, paint);
                i++;
                i2 = i3;
            }
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics2.m13089e(context, "context");
        Intrinsics2.m13089e(attributeSet, "attrs");
        this.f33449g = new ArrayList<>();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics2.m13089e(context, "context");
        this.f33449g = new ArrayList<>();
    }
}
