package p007c.p190n.p385d.p391l.p392e.p395k;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Set;

/* JADX INFO: renamed from: c.n.d.l.e.k.p */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5327p implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Set f26556a;

    public C5327p(C5335t c5335t, Set set) {
        this.f26556a = set;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        if (str.length() < 35) {
            return false;
        }
        return this.f26556a.contains(str.substring(0, 35));
    }
}
