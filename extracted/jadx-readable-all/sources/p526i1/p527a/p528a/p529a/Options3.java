package p526i1.p527a.p528a.p529a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: i1.a.a.a.k, reason: use source file name */
/* JADX INFO: compiled from: Options.java */
/* JADX INFO: loaded from: classes2.dex */
public class Options3 implements Serializable {

    /* JADX INFO: renamed from: f */
    public Map f30786f = new HashMap();

    /* JADX INFO: renamed from: g */
    public Map f30787g = new HashMap();

    /* JADX INFO: renamed from: h */
    public List f30788h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public Map f30789i = new HashMap();

    /* JADX INFO: renamed from: a */
    public Options3 m13805a(Option2 option2) {
        String strM13802b = option2.m13802b();
        String str = option2.f30779g;
        if (str != null) {
            this.f30787g.put(str, option2);
        }
        this.f30786f.put(strM13802b, option2);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public Option2 m13806b(String str) {
        String strM14078b0 = SkuDao.a.m14078b0(str);
        return this.f30786f.containsKey(strM14078b0) ? (Option2) this.f30786f.get(strM14078b0) : (Option2) this.f30787g.get(strM14078b0);
    }

    /* JADX INFO: renamed from: c */
    public boolean m13807c(String str) {
        String strM14078b0 = SkuDao.a.m14078b0(str);
        return this.f30786f.containsKey(strM14078b0) || this.f30787g.containsKey(strM14078b0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[ Options: [ short ");
        stringBuffer.append(this.f30786f.toString());
        stringBuffer.append(" ] [ long ");
        stringBuffer.append(this.f30787g);
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
