package p007c.p190n.p385d.p391l.p392e.p395k;

import java.io.File;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p400o.FileStore;
import p007c.p190n.p385d.p391l.p392e.p400o.FileStoreImpl;

/* JADX INFO: renamed from: c.n.d.l.e.k.i0, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsFileMarker.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsFileMarker {

    /* JADX INFO: renamed from: a */
    public final String f26523a;

    /* JADX INFO: renamed from: b */
    public final FileStore f26524b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.f26523a = str;
        this.f26524b = fileStore;
    }

    /* JADX INFO: renamed from: a */
    public boolean m11765a() {
        try {
            return m11766b().createNewFile();
        } catch (IOException e) {
            Logger4 logger4 = Logger4.f26421a;
            StringBuilder sbM1556G = outline.m1556G("Error creating marker: ");
            sbM1556G.append(this.f26523a);
            logger4.m11716e(sbM1556G.toString(), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public final File m11766b() {
        return new File(((FileStoreImpl) this.f26524b).m11983a(), this.f26523a);
    }
}
