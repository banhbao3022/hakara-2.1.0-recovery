package p636z0.p660c0.p661a.p662g;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.IOException;
import java.util.List;
import p636z0.p660c0.p661a.SimpleSQLiteQuery;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteQuery;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.c0.a.g.a, reason: use source file name */
/* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
/* JADX INFO: loaded from: classes.dex */
public class FrameworkSQLiteDatabase implements SupportSQLiteDatabase {

    /* JADX INFO: renamed from: f */
    public static final String[] f35331f = new String[0];

    /* JADX INFO: renamed from: g */
    public final SQLiteDatabase f35332g;

    /* JADX INFO: renamed from: z0.c0.a.g.a$a */
    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    public class a implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SupportSQLiteQuery f35333a;

        public a(FrameworkSQLiteDatabase frameworkSQLiteDatabase, SupportSQLiteQuery supportSQLiteQuery) {
            this.f35333a = supportSQLiteQuery;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f35333a.mo14552c(new FrameworkSQLiteProgram(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    /* JADX INFO: renamed from: z0.c0.a.g.a$b */
    /* JADX INFO: compiled from: FrameworkSQLiteDatabase.java */
    public class b implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SupportSQLiteQuery f35334a;

        public b(FrameworkSQLiteDatabase frameworkSQLiteDatabase, SupportSQLiteQuery supportSQLiteQuery) {
            this.f35334a = supportSQLiteQuery;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f35334a.mo14552c(new FrameworkSQLiteProgram(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public FrameworkSQLiteDatabase(SQLiteDatabase sQLiteDatabase) {
        this.f35332g = sQLiteDatabase;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: A */
    public Cursor mo15036A(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        return this.f35332g.rawQueryWithFactory(new b(this, supportSQLiteQuery), supportSQLiteQuery.mo14551a(), f35331f, null, cancellationSignal);
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: K */
    public void mo15037K() {
        this.f35332g.setTransactionSuccessful();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: L */
    public void mo15038L(String str, Object[] objArr) throws SQLException {
        this.f35332g.execSQL(str, objArr);
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: M */
    public void mo15039M() {
        this.f35332g.beginTransactionNonExclusive();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: Q */
    public Cursor mo15040Q(String str) {
        return mo15042c0(new SimpleSQLiteQuery(str));
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: T */
    public void mo15041T() {
        this.f35332g.endTransaction();
    }

    /* JADX INFO: renamed from: a */
    public List<Pair<String, String>> m15052a() {
        return this.f35332g.getAttachedDbs();
    }

    /* JADX INFO: renamed from: c */
    public String m15053c() {
        return this.f35332g.getPath();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: c0 */
    public Cursor mo15042c0(SupportSQLiteQuery supportSQLiteQuery) {
        return this.f35332g.rawQueryWithFactory(new a(this, supportSQLiteQuery), supportSQLiteQuery.mo14551a(), f35331f, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f35332g.close();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: i */
    public void mo15043i() {
        this.f35332g.beginTransaction();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: i0 */
    public boolean mo15044i0() {
        return this.f35332g.inTransaction();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    public boolean isOpen() {
        return this.f35332g.isOpen();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: n */
    public void mo15045n(String str) throws SQLException {
        this.f35332g.execSQL(str);
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: q0 */
    public boolean mo15046q0() {
        return this.f35332g.isWriteAheadLoggingEnabled();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteDatabase
    /* JADX INFO: renamed from: r */
    public SupportSQLiteStatement mo15047r(String str) {
        return new FrameworkSQLiteStatement(this.f35332g.compileStatement(str));
    }
}
