package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kw0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final SQLiteDatabase f16224f;

    /* JADX INFO: renamed from: g */
    public final String f16225g;

    /* JADX INFO: renamed from: h */
    public final C3665wn f16226h;

    public kw0(SQLiteDatabase sQLiteDatabase, String str, C3665wn c3665wn) {
        this.f16224f = sQLiteDatabase;
        this.f16225g = str;
        this.f16226h = c3665wn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SQLiteDatabase sQLiteDatabase = this.f16224f;
        String str = this.f16225g;
        C3665wn c3665wn = this.f16226h;
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        pw0.m8168h(sQLiteDatabase, c3665wn);
    }
}
