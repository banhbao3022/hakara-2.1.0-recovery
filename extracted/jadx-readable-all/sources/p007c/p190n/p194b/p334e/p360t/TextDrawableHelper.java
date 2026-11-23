package p007c.p190n.p194b.p334e.p360t;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p007c.p190n.p194b.p334e.p362v.TextAppearance;
import p007c.p190n.p194b.p334e.p362v.TextAppearance2;
import p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback;

/* JADX INFO: renamed from: c.n.b.e.t.h, reason: use source file name */
/* JADX INFO: compiled from: TextDrawableHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class TextDrawableHelper {

    /* JADX INFO: renamed from: c */
    public float f25500c;

    /* JADX INFO: renamed from: e */
    public WeakReference<b> f25502e;

    /* JADX INFO: renamed from: f */
    public TextAppearance f25503f;

    /* JADX INFO: renamed from: a */
    public final TextPaint f25498a = new TextPaint(1);

    /* JADX INFO: renamed from: b */
    public final TextAppearanceFontCallback f25499b = new a();

    /* JADX INFO: renamed from: d */
    public boolean f25501d = true;

    /* JADX INFO: renamed from: c.n.b.e.t.h$a */
    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public class a extends TextAppearanceFontCallback {
        public a() {
        }

        @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
        /* JADX INFO: renamed from: a */
        public void mo11338a(int i) {
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f25501d = true;
            b bVar = textDrawableHelper.f25502e.get();
            if (bVar != null) {
                bVar.mo11091a();
            }
        }

        @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
        /* JADX INFO: renamed from: b */
        public void mo11339b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            TextDrawableHelper textDrawableHelper = TextDrawableHelper.this;
            textDrawableHelper.f25501d = true;
            b bVar = textDrawableHelper.f25502e.get();
            if (bVar != null) {
                bVar.mo11091a();
            }
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.t.h$b */
    /* JADX INFO: compiled from: TextDrawableHelper.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo11091a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public TextDrawableHelper(b bVar) {
        this.f25502e = new WeakReference<>(null);
        this.f25502e = new WeakReference<>(bVar);
    }

    /* JADX INFO: renamed from: a */
    public float m11336a(String str) {
        if (!this.f25501d) {
            return this.f25500c;
        }
        float fMeasureText = str == null ? 0.0f : this.f25498a.measureText((CharSequence) str, 0, str.length());
        this.f25500c = fMeasureText;
        this.f25501d = false;
        return fMeasureText;
    }

    /* JADX INFO: renamed from: b */
    public void m11337b(TextAppearance textAppearance, Context context) {
        if (this.f25503f != textAppearance) {
            this.f25503f = textAppearance;
            if (textAppearance != null) {
                TextPaint textPaint = this.f25498a;
                TextAppearanceFontCallback textAppearanceFontCallback = this.f25499b;
                textAppearance.m11352a();
                textAppearance.m11355d(textPaint, textAppearance.f25536n);
                textAppearance.m11353b(context, new TextAppearance2(textAppearance, textPaint, textAppearanceFontCallback));
                b bVar = this.f25502e.get();
                if (bVar != null) {
                    this.f25498a.drawableState = bVar.getState();
                }
                textAppearance.m11354c(context, this.f25498a, this.f25499b);
                this.f25501d = true;
            }
            b bVar2 = this.f25502e.get();
            if (bVar2 != null) {
                bVar2.mo11091a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }
}
