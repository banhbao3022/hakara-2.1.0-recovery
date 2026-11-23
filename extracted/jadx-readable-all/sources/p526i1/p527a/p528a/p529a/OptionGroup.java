package p526i1.p527a.p528a.p529a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: i1.a.a.a.j, reason: use source file name */
/* JADX INFO: compiled from: OptionGroup.java */
/* JADX INFO: loaded from: classes2.dex */
public class OptionGroup implements Serializable {

    /* JADX INFO: renamed from: f */
    public Map f30784f = new HashMap();

    /* JADX INFO: renamed from: g */
    public String f30785g;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.f30784f.values().iterator();
        stringBuffer.append("[");
        while (it.hasNext()) {
            Option2 option2 = (Option2) it.next();
            if (option2.f30778f != null) {
                stringBuffer.append("-");
                stringBuffer.append(option2.f30778f);
            } else {
                stringBuffer.append("--");
                stringBuffer.append(option2.f30779g);
            }
            stringBuffer.append(" ");
            stringBuffer.append(option2.f30781i);
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
