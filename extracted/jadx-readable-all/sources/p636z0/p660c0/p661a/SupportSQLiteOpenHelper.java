package p636z0.p660c0.p661a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.c0.a.c, reason: use source file name */
/* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends Closeable {

    /* JADX INFO: renamed from: z0.c0.a.c$a */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public final int f35326a;

        public a(int i) {
            this.f35326a = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m15048a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            outline.m1567R("deleting the database file: ", str, "SupportSQLite");
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        /* JADX INFO: renamed from: b */
        public void mo14542b(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo14543c(SupportSQLiteDatabase supportSQLiteDatabase);

        /* JADX INFO: renamed from: d */
        public void mo14544d(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2) {
            throw new SQLiteException("Can't downgrade database from version " + i + " to " + i2);
        }

        /* JADX INFO: renamed from: e */
        public void mo14545e(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        /* JADX INFO: renamed from: f */
        public abstract void mo14546f(SupportSQLiteDatabase supportSQLiteDatabase, int i, int i2);
    }

    /* JADX INFO: renamed from: z0.c0.a.c$b */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Context f35327a;

        /* JADX INFO: renamed from: b */
        public final String f35328b;

        /* JADX INFO: renamed from: c */
        public final a f35329c;

        /* JADX INFO: renamed from: d */
        public final boolean f35330d;

        public b(Context context, String str, a aVar, boolean z) {
            this.f35327a = context;
            this.f35328b = str;
            this.f35329c = aVar;
            this.f35330d = z;
        }
    }

    /* JADX INFO: renamed from: z0.c0.a.c$c */
    /* JADX INFO: compiled from: SupportSQLiteOpenHelper.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        SupportSQLiteOpenHelper mo15049a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    /* JADX INFO: renamed from: e */
    SupportSQLiteDatabase mo14509e();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
