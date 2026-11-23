package p526i1.p527a.p528a.p529a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: i1.a.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: CommandLine.java */
/* JADX INFO: loaded from: classes2.dex */
public class CommandLine implements Serializable {

    /* JADX INFO: renamed from: f */
    public List f30768f = new LinkedList();

    /* JADX INFO: renamed from: g */
    public List f30769g = new ArrayList();

    /* JADX INFO: renamed from: a */
    public boolean m13794a(String str) {
        List list = this.f30769g;
        String strM14078b0 = SkuDao.a.m14078b0(str);
        for (Option2 option2 : this.f30769g) {
            if (strM14078b0.equals(option2.f30778f) || strM14078b0.equals(option2.f30779g)) {
                return list.contains(option2);
            }
        }
        option2 = null;
        return list.contains(option2);
    }
}
