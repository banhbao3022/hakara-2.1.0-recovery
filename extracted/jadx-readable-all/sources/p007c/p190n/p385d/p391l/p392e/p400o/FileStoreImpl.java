package p007c.p190n.p385d.p391l.p392e.p400o;

import android.content.Context;
import java.io.File;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.o.i, reason: use source file name */
/* JADX INFO: compiled from: FileStoreImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class FileStoreImpl implements FileStore {

    /* JADX INFO: renamed from: a */
    public final Context f26909a;

    public FileStoreImpl(Context context) {
        this.f26909a = context;
    }

    /* JADX INFO: renamed from: a */
    public File m11983a() {
        File file = new File(this.f26909a.getFilesDir(), ".com.google.firebase.crashlytics");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        Logger4.f26421a.m11717f("Couldn't create file");
        return null;
    }
}
