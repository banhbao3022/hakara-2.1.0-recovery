package p007c.p165l.p166h0.p168c0.p169p;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: c.l.h0.c0.p.d, reason: use source file name */
/* JADX INFO: compiled from: SensitiveUserDataUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class SensitiveUserDataUtils {
    /* JADX INFO: renamed from: a */
    public static boolean m2296a(View view) {
        boolean z;
        boolean zMatches;
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        if (!(textView.getInputType() == 128 ? true : textView.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            String strReplaceAll = ViewHierarchy.m2304h(textView).replaceAll("\\s", "");
            int length = strReplaceAll.length();
            if (length >= 12 && length <= 19) {
                int i = length - 1;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i < 0) {
                        if (i2 % 10 == 0) {
                            z = true;
                            break;
                        }
                    } else {
                        char cCharAt = strReplaceAll.charAt(i);
                        if (cCharAt >= '0' && cCharAt <= '9') {
                            int i3 = cCharAt - '0';
                            if (z2 && (i3 = i3 * 2) > 9) {
                                i3 = (i3 % 10) + 1;
                            }
                            i2 += i3;
                            z2 = !z2;
                            i--;
                        }
                    }
                    z = false;
                    break;
                }
            } else {
                z = false;
                break;
            }
            if (!z) {
                if (!(textView.getInputType() == 96)) {
                    if (!(textView.getInputType() == 112)) {
                        if (!(textView.getInputType() == 3)) {
                            if (textView.getInputType() == 32) {
                                zMatches = true;
                            } else {
                                String strM2304h = ViewHierarchy.m2304h(textView);
                                zMatches = (strM2304h == null || strM2304h.length() == 0) ? false : Patterns.EMAIL_ADDRESS.matcher(strM2304h).matches();
                            }
                            if (!zMatches) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
