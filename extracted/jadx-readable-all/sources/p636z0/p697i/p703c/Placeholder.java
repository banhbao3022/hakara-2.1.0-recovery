package p636z0.p697i.p703c;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: z0.i.c.g, reason: use source file name */
/* JADX INFO: compiled from: Placeholder.java */
/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: f */
    public int f37160f;

    /* JADX INFO: renamed from: g */
    public View f37161g;

    /* JADX INFO: renamed from: h */
    public int f37162h;

    public Placeholder(Context context) {
        super(context);
        this.f37160f = -1;
        this.f37161g = null;
        this.f37162h = 4;
        m15862a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m15862a(AttributeSet attributeSet) {
        setVisibility(this.f37162h);
        this.f37160f = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8022i.f37165c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f37160f = typedArrayObtainStyledAttributes.getResourceId(index, this.f37160f);
                } else if (index == 1) {
                    this.f37162h = typedArrayObtainStyledAttributes.getInt(index, this.f37162h);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f37161g;
    }

    public int getEmptyVisibility() {
        return this.f37162h;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((rect.height() / 2.0f) + (iHeight / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.f37160f == i) {
            return;
        }
        View view = this.f37161g;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0094a) this.f37161g.getLayoutParams()).f571b0 = false;
            this.f37161g = null;
        }
        this.f37160f = i;
        if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f37162h = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37160f = -1;
        this.f37161g = null;
        this.f37162h = 4;
        m15862a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37160f = -1;
        this.f37161g = null;
        this.f37162h = 4;
        m15862a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        this.f37160f = -1;
        this.f37161g = null;
        this.f37162h = 4;
        m15862a(attributeSet);
    }
}
