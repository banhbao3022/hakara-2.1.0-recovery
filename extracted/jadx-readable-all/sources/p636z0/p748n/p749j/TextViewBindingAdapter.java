package p636z0.p748n.p749j;

import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: z0.n.j.a, reason: use source file name */
/* JADX INFO: compiled from: TextViewBindingAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public class TextViewBindingAdapter {
    /* JADX WARN: Code duplicated, block: B:31:0x0044 A[EDGE_INSN: B:31:0x0044->B:33:0x0049 BREAK  A[LOOP:0: B:28:0x0038->B:32:0x0046]] */
    /* JADX INFO: renamed from: a */
    public static void m16406a(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                boolean z = false;
                if ((charSequence == null) != (text == null)) {
                    z = true;
                    break;
                }
                if (charSequence != null) {
                    int length = charSequence.length();
                    if (length != text.length()) {
                        z = true;
                        break;
                    }
                    for (int i = 0; i < length; i++) {
                        if (charSequence.charAt(i) != text.charAt(i)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (!z) {
                    return;
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }
}
