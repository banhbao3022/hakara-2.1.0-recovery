package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import p007c.p190n.p194b.p266d.p314j.p325k.C4340s8;

/* JADX INFO: renamed from: c.n.b.d.k.b.r3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4651r3 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4617o3 f24392f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4651r3(C4617o3 c4617o3, Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.f24392f = c4617o3;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f24392f.mo10684l().f24418f.m10811a("Opening the local database failed, dropping and recreating it");
            if (!this.f24392f.f24476a.f24528b.getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f24392f.mo10684l().f24418f.m10812b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f24392f.mo10684l().f24418f.m10812b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C4340s8.m10215l(this.f24392f.mo10684l(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C4340s8.m10216m(this.f24392f.mo10684l(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
