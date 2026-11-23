package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: renamed from: c.n.b.d.k.b.o3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4617o3 extends AbstractC4475c5 {

    /* JADX INFO: renamed from: c */
    public final C4651r3 f24225c;

    /* JADX INFO: renamed from: d */
    public boolean f24226d;

    public C4617o3(C4707w4 c4707w4) {
        super(c4707w4);
        this.f24225c = new C4651r3(this, this.f24476a.f24528b, "google_app_measurement_local.db");
    }

    /* JADX INFO: renamed from: w */
    public static long m10706w(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = null;
        try {
            cursorQuery = sQLiteDatabase.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                return -1L;
            }
            long j2 = cursorQuery.getLong(0);
            cursorQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: A */
    public final SQLiteDatabase m10707A() throws SQLiteException {
        if (this.f24226d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f24225c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f24226d = true;
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4475c5
    /* JADX INFO: renamed from: v */
    public final boolean mo10481v() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0121  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: x */
    public final boolean m10708x(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseM10707A;
        ?? r2;
        mo10381b();
        ?? r3 = 0;
        if (this.f24226d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r7 = 0;
             = 0;
            r7 = 0;
            ?? r8 = 0;
            ?? r9 = 0;
            r7 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseM10707A = m10707A();
                try {
                    if (sQLiteDatabaseM10707A == null) {
                        this.f24226d = true;
                        if (sQLiteDatabaseM10707A != null) {
                            sQLiteDatabaseM10707A.close();
                        }
                        return r3;
                    }
                    sQLiteDatabaseM10707A.beginTransaction();
                    long j2 = 0;
                    ?? RawQuery = sQLiteDatabaseM10707A.rawQuery("select count(1) from messages", null);
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j2 = RawQuery.getLong(r3);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r9 = RawQuery;
                            SystemClock.sleep(i3);
                            i3 += 20;
                            if (r9 != 0) {
                                r9.close();
                            }
                            if (sQLiteDatabaseM10707A != null) {
                                sQLiteDatabaseM10707A.close();
                            }
                            i2++;
                            r3 = 0;
                        } catch (SQLiteFullException e) {
                            e = e;
                            r7 = RawQuery;
                            try {
                                mo10684l().f24418f.m10812b("Error writing entry; local database full", e);
                                this.f24226d = true;
                                if (r7 != 0) {
                                    r7.close();
                                }
                                if (sQLiteDatabaseM10707A != null) {
                                    sQLiteDatabaseM10707A.close();
                                }
                                i2++;
                                r3 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r7 != 0) {
                                    r7.close();
                                }
                                if (sQLiteDatabaseM10707A != null) {
                                    sQLiteDatabaseM10707A.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            r8 = RawQuery;
                            r2 = r8;
                            sQLiteDatabase = sQLiteDatabaseM10707A;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseM10707A = sQLiteDatabase;
                                    r7 = r2;
                                    if (r7 != 0) {
                                        r7.close();
                                    }
                                    if (sQLiteDatabaseM10707A != null) {
                                        sQLiteDatabaseM10707A.close();
                                    }
                                    throw th;
                                }
                            }
                            mo10684l().f24418f.m10812b("Error writing entry to local database", e);
                            this.f24226d = true;
                            if (r2 != 0) {
                                r2.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r3 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r7 = RawQuery;
                            if (r7 != 0) {
                                r7.close();
                            }
                            if (sQLiteDatabaseM10707A != null) {
                                sQLiteDatabaseM10707A.close();
                            }
                            throw th;
                        }
                    }
                    if (j2 >= 100000) {
                        mo10684l().f24418f.m10811a("Data loss, local db full");
                        long j3 = (100000 - j2) + 1;
                        String[] strArr = new String[1];
                        strArr[r3] = Long.toString(j3);
                        long jDelete = sQLiteDatabaseM10707A.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j3) {
                            mo10684l().f24418f.m10814d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j3), Long.valueOf(jDelete), Long.valueOf(j3 - jDelete));
                        }
                    }
                    sQLiteDatabaseM10707A.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseM10707A.setTransactionSuccessful();
                    sQLiteDatabaseM10707A.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseM10707A.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                } catch (SQLiteException e4) {
                    e = e4;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseM10707A = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                sQLiteDatabaseM10707A = null;
            } catch (SQLiteException e6) {
                e = e6;
                r2 = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseM10707A = null;
            }
        }
        mo10684l().f24426n.m10811a("Failed to write entry to local database");
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final void m10709y() {
        mo10381b();
        try {
            int iDelete = m10707A().delete("messages", null, null) + 0;
            if (iDelete > 0) {
                mo10684l().f24426n.m10812b("Reset local analytics data. records", Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e) {
            mo10684l().f24418f.m10812b("Error resetting local analytics data. error", e);
        }
    }

    /* JADX INFO: renamed from: z */
    public final boolean m10710z() {
        mo10381b();
        if (this.f24226d || !this.f24476a.f24528b.getDatabasePath("google_app_measurement_local.db").exists()) {
            return false;
        }
        int i = 5;
        for (int i2 = 0; i2 < 5; i2++) {
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase sQLiteDatabaseM10707A = m10707A();
                if (sQLiteDatabaseM10707A == null) {
                    this.f24226d = true;
                    if (sQLiteDatabaseM10707A != null) {
                        sQLiteDatabaseM10707A.close();
                    }
                    return false;
                }
                sQLiteDatabaseM10707A.beginTransaction();
                sQLiteDatabaseM10707A.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                sQLiteDatabaseM10707A.setTransactionSuccessful();
                sQLiteDatabaseM10707A.endTransaction();
                sQLiteDatabaseM10707A.close();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                SystemClock.sleep(i);
                i += 20;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteFullException e) {
                mo10684l().f24418f.m10812b("Error deleting app launch break from local database", e);
                this.f24226d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            } catch (SQLiteException e2) {
                if (0 != 0) {
                    try {
                        if (sQLiteDatabase.inTransaction()) {
                            sQLiteDatabase.endTransaction();
                        }
                    } catch (Throwable th) {
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                mo10684l().f24418f.m10812b("Error deleting app launch break from local database", e2);
                this.f24226d = true;
                if (0 != 0) {
                    sQLiteDatabase.close();
                }
            }
        }
        mo10684l().f24421i.m10811a("Error deleting app launch break from local database in reasonable time");
        return false;
    }
}
