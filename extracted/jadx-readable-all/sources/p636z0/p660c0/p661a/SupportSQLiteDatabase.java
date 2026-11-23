package p636z0.p660c0.p661a;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import java.io.Closeable;

/* JADX INFO: renamed from: z0.c0.a.b, reason: use source file name */
/* JADX INFO: compiled from: SupportSQLiteDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteDatabase extends Closeable {
    /* JADX INFO: renamed from: A */
    Cursor mo15036A(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal);

    /* JADX INFO: renamed from: K */
    void mo15037K();

    /* JADX INFO: renamed from: L */
    void mo15038L(String str, Object[] objArr) throws SQLException;

    /* JADX INFO: renamed from: M */
    void mo15039M();

    /* JADX INFO: renamed from: Q */
    Cursor mo15040Q(String str);

    /* JADX INFO: renamed from: T */
    void mo15041T();

    /* JADX INFO: renamed from: c0 */
    Cursor mo15042c0(SupportSQLiteQuery supportSQLiteQuery);

    /* JADX INFO: renamed from: i */
    void mo15043i();

    /* JADX INFO: renamed from: i0 */
    boolean mo15044i0();

    boolean isOpen();

    /* JADX INFO: renamed from: n */
    void mo15045n(String str) throws SQLException;

    /* JADX INFO: renamed from: q0 */
    boolean mo15046q0();

    /* JADX INFO: renamed from: r */
    SupportSQLiteStatement mo15047r(String str);
}
