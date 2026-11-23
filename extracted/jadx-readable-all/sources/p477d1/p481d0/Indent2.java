package p477d1.p481d0;

import java.util.ArrayList;
import java.util.List;
import p477d1.p480c0.Sequence;
import p477d1.p480c0.Sequences4;
import p477d1.p480c0._Sequences;
import p477d1.p483s.Collections2;
import p477d1.p483s._Collections;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.d0.j, reason: use source file name */
/* JADX INFO: compiled from: Indent.kt */
/* JADX INFO: loaded from: classes.dex */
public class Indent2 extends Appendable {
    /* JADX INFO: renamed from: b */
    public static String m12985b(String str, String str2, int i) {
        String strSubstring;
        String str3 = (i & 1) != 0 ? "|" : null;
        Intrinsics2.m13089e(str, "$this$trimMargin");
        Intrinsics2.m13089e(str3, "marginPrefix");
        Intrinsics2.m13089e(str, "$this$replaceIndentByMargin");
        Intrinsics2.m13089e("", "newIndent");
        Intrinsics2.m13089e(str3, "marginPrefix");
        if (!(!StringsJVM.m12990g(str3))) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
        }
        Intrinsics2.m13089e(str, "$this$lines");
        Intrinsics2.m13089e(str, "$this$lineSequence");
        String[] strArr = {"\r\n", "\n", "\r"};
        Intrinsics2.m13089e(str, "$this$splitToSequence");
        Intrinsics2.m13089e(strArr, "delimiters");
        Sequence sequenceM13016z = Strings5.m13016z(str, strArr, 0, false, 0, 2);
        Strings4 strings4 = new Strings4(str);
        Intrinsics2.m13089e(sequenceM13016z, "$this$map");
        Intrinsics2.m13089e(strings4, "transform");
        List listM12977b = _Sequences.m12977b(new Sequences4(sequenceM13016z, strings4));
        int size = (listM12977b.size() * 0) + str.length();
        Indent indent = Indent.f29472g;
        int iM13037b = Collections2.m13037b(listM12977b);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : listM12977b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                Collections2.m13041f();
                throw null;
            }
            String str4 = (String) obj;
            if ((i2 == 0 || i2 == iM13037b) && StringsJVM.m12990g(str4)) {
                str4 = null;
            } else {
                int length = str4.length();
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        i4 = -1;
                        break;
                    }
                    if (!CharJVM.m12979b(str4.charAt(i4))) {
                        break;
                    }
                    i4++;
                }
                if (i4 != -1 && StringsJVM.m12996m(str4, str3, i4, false, 4)) {
                    strSubstring = str4.substring(str3.length() + i4);
                    Intrinsics2.m13088d(strSubstring, "(this as java.lang.String).substring(startIndex)");
                } else {
                    strSubstring = null;
                }
                if (strSubstring != null) {
                    str4 = (String) indent.mo3b(strSubstring);
                }
            }
            if (str4 != null) {
                arrayList.add(str4);
            }
            i2 = i3;
        }
        StringBuilder sb = new StringBuilder(size);
        _Collections.m13045j(arrayList, sb, "\n", "", "", -1, "...", null);
        String string = sb.toString();
        Intrinsics2.m13088d(string, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
        return string;
    }
}
