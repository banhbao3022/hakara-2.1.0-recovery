package p007c.p190n.p194b.p266d.p314j.p315a;

import android.database.sqlite.SQLiteDatabase;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 implements dv1<SQLiteDatabase> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dl1 f17773a;

    public ow0(dl1 dl1Var) {
        this.f17773a = dl1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        String strValueOf = String.valueOf(th.getMessage());
        C2622l.m5408n3(strValueOf.length() != 0 ? "Failed to get offline buffered ping database: ".concat(strValueOf) : new String("Failed to get offline buffered ping database: "));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4617b(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f17773a.mo5679a(sQLiteDatabase);
        } catch (Exception e) {
            String strValueOf = String.valueOf(e.getMessage());
            C2622l.m5408n3(strValueOf.length() != 0 ? "Error executing function on offline buffered ping database: ".concat(strValueOf) : new String("Error executing function on offline buffered ping database: "));
        }
    }
}
