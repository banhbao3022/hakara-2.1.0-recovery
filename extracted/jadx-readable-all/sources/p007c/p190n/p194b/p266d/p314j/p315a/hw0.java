package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hw0 {

    /* JADX INFO: renamed from: a */
    public final as2 f15035a;

    /* JADX INFO: renamed from: b */
    public final Context f15036b;

    /* JADX INFO: renamed from: c */
    public final pv0 f15037c;

    /* JADX INFO: renamed from: d */
    public final C3702xn f15038d;

    /* JADX INFO: renamed from: e */
    public final String f15039e;

    /* JADX INFO: renamed from: f */
    public final im1 f15040f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2305w0 f15041g = C2330u.f10884a.f10893h.m6649f();

    public hw0(Context context, C3702xn c3702xn, as2 as2Var, pv0 pv0Var, String str, im1 im1Var) {
        this.f15036b = context;
        this.f15038d = c3702xn;
        this.f15035a = as2Var;
        this.f15037c = pv0Var;
        this.f15039e = str;
        this.f15040f = im1Var;
    }

    /* JADX INFO: renamed from: a */
    public static final void m7178a(SQLiteDatabase sQLiteDatabase, ArrayList<fu2> arrayList) {
        int size = arrayList.size();
        long jM6887y = 0;
        for (int i = 0; i < size; i++) {
            fu2 fu2Var = arrayList.get(i);
            if (fu2Var.m6888z() == lt2.ENUM_TRUE && fu2Var.m6887y() > jM6887y) {
                jM6887y = fu2Var.m6887y();
            }
        }
        if (jM6887y != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("value", Long.valueOf(jM6887y));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }
}
