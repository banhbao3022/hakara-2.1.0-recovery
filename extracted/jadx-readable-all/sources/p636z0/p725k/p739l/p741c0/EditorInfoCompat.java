package p636z0.p725k.p739l.p741c0;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: renamed from: z0.k.l.c0.a, reason: use source file name */
/* JADX INFO: compiled from: EditorInfoCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class EditorInfoCompat {

    /* JADX INFO: renamed from: a */
    public static final String[] f38047a = new String[0];

    @Deprecated
    public EditorInfoCompat() {
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16282a(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* JADX INFO: renamed from: b */
    public static void m16283b(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
