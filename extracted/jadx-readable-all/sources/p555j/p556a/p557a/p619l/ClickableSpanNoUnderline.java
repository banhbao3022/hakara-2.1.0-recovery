package p555j.p556a.p557a.p619l;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.l.a, reason: use source file name */
/* JADX INFO: compiled from: ClickableSpanNoUnderline.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ClickableSpanNoUnderline extends ClickableSpan {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        Intrinsics2.m13089e(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
