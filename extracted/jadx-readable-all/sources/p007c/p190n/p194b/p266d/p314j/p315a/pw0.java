package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pw0 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: f */
    public final Context f18110f;

    /* JADX INFO: renamed from: g */
    public final lv1 f18111g;

    public pw0(Context context, lv1 lv1Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14291W4)).intValue());
        this.f18110f = context;
        this.f18111g = lv1Var;
    }

    /* JADX INFO: renamed from: f */
    public static final void m8167f(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    /* JADX INFO: renamed from: h */
    public static void m8168h(SQLiteDatabase sQLiteDatabase, C3665wn c3665wn) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i] = cursorQuery.getString(columnIndex);
                }
                i++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (int i2 = 0; i2 < count; i2++) {
                c3665wn.mo4730f(strArr[i2]);
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m8169a(dl1<SQLiteDatabase, Void> dl1Var) {
        kv1 kv1VarMo6691u0 = this.f18111g.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.iw0

            /* JADX INFO: renamed from: a */
            public final pw0 f15409a;

            {
                this.f15409a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f15409a.getWritableDatabase();
            }
        });
        ow0 ow0Var = new ow0(dl1Var);
        kv1VarMo6691u0.mo6230f(new ev1(kv1VarMo6691u0, ow0Var), this.f18111g);
    }

    /* JADX INFO: renamed from: c */
    public final void m8170c(String str) {
        m8169a(new mw0(this, str));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
