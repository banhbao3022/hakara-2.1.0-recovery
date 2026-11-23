package p526i1.p527a.p528a.p529a;

import java.util.ArrayList;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: i1.a.a.a.d, reason: use source file name */
/* JADX INFO: compiled from: GnuParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class GnuParser extends Parser {
    @Override // p526i1.p527a.p528a.p529a.Parser
    /* JADX INFO: renamed from: b */
    public String[] mo13796b(Options3 options3, String[] strArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (i < strArr.length) {
            String str = strArr[i];
            if ("--".equals(str)) {
                arrayList.add("--");
                z2 = true;
            } else if ("-".equals(str)) {
                arrayList.add("-");
            } else if (str.startsWith("-")) {
                String strM14078b0 = SkuDao.a.m14078b0(str);
                if (options3.m13807c(strM14078b0)) {
                    arrayList.add(str);
                } else if (strM14078b0.indexOf(61) != -1 && options3.m13807c(strM14078b0.substring(0, strM14078b0.indexOf(61)))) {
                    arrayList.add(str.substring(0, str.indexOf(61)));
                    arrayList.add(str.substring(str.indexOf(61) + 1));
                } else if (options3.m13807c(str.substring(0, 2))) {
                    arrayList.add(str.substring(0, 2));
                    arrayList.add(str.substring(2));
                } else {
                    arrayList.add(str);
                    z2 = z;
                }
            } else {
                arrayList.add(str);
            }
            if (z2) {
                while (true) {
                    i++;
                    if (i < strArr.length) {
                        arrayList.add(strArr[i]);
                    }
                }
            }
            i++;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
