package p007c.p190n.p194b.p209b.p210a2.p211j0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p209b.p216o1.DatabaseIOException;
import p007c.p190n.p194b.p209b.p216o1.DatabaseProvider;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.h, reason: use source file name */
/* JADX INFO: compiled from: CacheFileMetadataIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class CacheFileMetadataIndex {

    /* JADX INFO: renamed from: a */
    public static final String[] f6070a = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: b */
    public final DatabaseProvider f6071b;

    /* JADX INFO: renamed from: c */
    public String f6072c;

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider) {
        this.f6071b = databaseProvider;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, CacheFileMetadata> m2957a() throws DatabaseIOException {
        try {
            Objects.requireNonNull(this.f6072c);
            Cursor cursorQuery = this.f6071b.m3622a().query(this.f6072c, f6070a, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    map.put(cursorQuery.getString(0), new CacheFileMetadata(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        try {
                            cursorQuery.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2958b(long j2) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j2);
            this.f6072c = "ExoPlayerCacheFileMetadata" + hexString;
            if (C1095a.m2401q(this.f6071b.m3622a(), 2, hexString) != 1) {
                SQLiteDatabase sQLiteDatabaseM3623e = this.f6071b.m3623e();
                sQLiteDatabaseM3623e.beginTransactionNonExclusive();
                try {
                    C1095a.m2380G(sQLiteDatabaseM3623e, 2, hexString, 1);
                    sQLiteDatabaseM3623e.execSQL("DROP TABLE IF EXISTS " + this.f6072c);
                    sQLiteDatabaseM3623e.execSQL("CREATE TABLE " + this.f6072c + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    sQLiteDatabaseM3623e.setTransactionSuccessful();
                } finally {
                    sQLiteDatabaseM3623e.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2959c(Set<String> set) throws DatabaseIOException {
        Objects.requireNonNull(this.f6072c);
        try {
            SQLiteDatabase sQLiteDatabaseM3623e = this.f6071b.m3623e();
            sQLiteDatabaseM3623e.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    sQLiteDatabaseM3623e.delete(this.f6072c, "name = ?", new String[]{it.next()});
                }
                sQLiteDatabaseM3623e.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseM3623e.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m2960d(String str, long j2, long j3) throws DatabaseIOException {
        Objects.requireNonNull(this.f6072c);
        try {
            SQLiteDatabase sQLiteDatabaseM3623e = this.f6071b.m3623e();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j2));
            contentValues.put("last_touch_timestamp", Long.valueOf(j3));
            sQLiteDatabaseM3623e.replaceOrThrow(this.f6072c, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
