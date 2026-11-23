package p636z0.p644b.p653h;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: renamed from: z0.b.h.b, reason: use source file name */
/* JADX INFO: compiled from: ActionBarBackgroundDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarBackgroundDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public final ActionBarContainer f34965a;

    public ActionBarBackgroundDrawable(ActionBarContainer actionBarContainer) {
        this.f34965a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f34965a;
        if (actionBarContainer.f281m) {
            Drawable drawable = actionBarContainer.f280l;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f278j;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f34965a;
        Drawable drawable3 = actionBarContainer2.f279k;
        if (drawable3 == null || !actionBarContainer2.f282n) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f34965a;
        if (actionBarContainer.f281m) {
            Drawable drawable = actionBarContainer.f280l;
            if (drawable != null) {
                drawable.getOutline(outline);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f278j;
        if (drawable2 != null) {
            drawable2.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
