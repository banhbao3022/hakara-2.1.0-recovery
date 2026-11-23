package p007c.p190n.p194b.p209b.p216o1;

import android.database.SQLException;
import java.io.IOException;

/* JADX INFO: renamed from: c.n.b.b.o1.a, reason: use source file name */
/* JADX INFO: compiled from: DatabaseIOException.java */
/* JADX INFO: loaded from: classes.dex */
public final class DatabaseIOException extends IOException {
    public DatabaseIOException(SQLException sQLException) {
        super(sQLException);
    }

    public DatabaseIOException(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
