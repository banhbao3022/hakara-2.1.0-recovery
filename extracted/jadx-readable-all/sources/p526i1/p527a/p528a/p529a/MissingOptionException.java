package p526i1.p527a.p528a.p529a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: i1.a.a.a.h, reason: use source file name */
/* JADX INFO: compiled from: MissingOptionException.java */
/* JADX INFO: loaded from: classes2.dex */
public class MissingOptionException extends ParseException {

    /* JADX INFO: renamed from: f */
    public List f30777f;

    public MissingOptionException(String str) {
        super(str);
    }

    public MissingOptionException(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : "s");
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        this(stringBuffer.toString());
        this.f30777f = list;
    }
}
