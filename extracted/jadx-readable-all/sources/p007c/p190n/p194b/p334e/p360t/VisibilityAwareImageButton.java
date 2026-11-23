package p007c.p190n.p194b.p334e.p360t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: c.n.b.e.t.p, reason: use source file name */
/* JADX INFO: compiled from: VisibilityAwareImageButton.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* JADX INFO: renamed from: f */
    public int f25516f;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m11348b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f25516f = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f25516f;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        this.f25516f = i;
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25516f = getVisibility();
    }
}
