package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public final class OverlayListView extends ListView {

    /* JADX INFO: renamed from: f */
    public final List<C0133a> f823f;

    /* JADX INFO: renamed from: androidx.mediarouter.app.OverlayListView$a */
    public static class C0133a {

        /* JADX INFO: renamed from: a */
        public BitmapDrawable f824a;

        /* JADX INFO: renamed from: c */
        public Rect f826c;

        /* JADX INFO: renamed from: d */
        public Rect f827d;

        /* JADX INFO: renamed from: b */
        public float f825b = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f828e = 1.0f;

        /* JADX INFO: renamed from: f */
        public float f829f = 1.0f;

        public C0133a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f824a = bitmapDrawable;
            this.f827d = rect;
            Rect rect2 = new Rect(rect);
            this.f826c = rect2;
            BitmapDrawable bitmapDrawable2 = this.f824a;
            if (bitmapDrawable2 == null || rect2 == null) {
                return;
            }
            bitmapDrawable2.setAlpha((int) (this.f825b * 255.0f));
            this.f824a.setBounds(this.f826c);
        }
    }

    public OverlayListView(Context context) {
        super(context);
        this.f823f = new ArrayList();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f823f.size() > 0) {
            for (C0133a c0133a : this.f823f) {
                BitmapDrawable bitmapDrawable = c0133a.f824a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                Math.max(0.0f, Math.min(1.0f, (getDrawingTime() - 0) / 0));
                int i = (int) (0 * 0.0f);
                Rect rect = c0133a.f826c;
                Rect rect2 = c0133a.f827d;
                rect.top = rect2.top + i;
                rect.bottom = rect2.bottom + i;
                float f = c0133a.f828e;
                float fM1576a = outline.m1576a(c0133a.f829f, f, 0.0f, f);
                c0133a.f825b = fM1576a;
                BitmapDrawable bitmapDrawable2 = c0133a.f824a;
                if (bitmapDrawable2 != null) {
                    bitmapDrawable2.setAlpha((int) (fM1576a * 255.0f));
                    c0133a.f824a.setBounds(c0133a.f826c);
                }
            }
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f823f = new ArrayList();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f823f = new ArrayList();
    }
}
