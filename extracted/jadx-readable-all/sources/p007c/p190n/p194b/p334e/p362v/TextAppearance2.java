package p007c.p190n.p194b.p334e.p362v;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: c.n.b.e.v.d, reason: use source file name */
/* JADX INFO: compiled from: TextAppearance.java */
/* JADX INFO: loaded from: classes.dex */
public class TextAppearance2 extends TextAppearanceFontCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TextPaint f25539a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TextAppearanceFontCallback f25540b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextAppearance f25541c;

    public TextAppearance2(TextAppearance textAppearance, TextPaint textPaint, TextAppearanceFontCallback textAppearanceFontCallback) {
        this.f25541c = textAppearance;
        this.f25539a = textPaint;
        this.f25540b = textAppearanceFontCallback;
    }

    @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
    /* JADX INFO: renamed from: a */
    public void mo11338a(int i) {
        this.f25540b.mo11338a(i);
    }

    @Override // p007c.p190n.p194b.p334e.p362v.TextAppearanceFontCallback
    /* JADX INFO: renamed from: b */
    public void mo11339b(Typeface typeface, boolean z) {
        this.f25541c.m11355d(this.f25539a, typeface);
        this.f25540b.mo11339b(typeface, z);
    }
}
