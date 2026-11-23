package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.RemoteException;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nw0 implements dl1 {

    /* JADX INFO: renamed from: a */
    public final pw0 f17465a;

    /* JADX INFO: renamed from: b */
    public final rw0 f17466b;

    public nw0(pw0 pw0Var, rw0 rw0Var) {
        this.f17465a = pw0Var;
        this.f17466b = rw0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dl1
    /* JADX INFO: renamed from: a */
    public final Object mo5679a(Object obj) {
        pw0 pw0Var = this.f17465a;
        rw0 rw0Var = this.f17466b;
        Objects.requireNonNull(pw0Var);
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(rw0Var.f19404a));
        contentValues.put("gws_query_id", rw0Var.f19405b);
        contentValues.put("url", rw0Var.f19406c);
        contentValues.put("event_state", Integer.valueOf(rw0Var.f19407d - 1));
        ((SQLiteDatabase) obj).insert("offline_buffered_pings", null, contentValues);
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        InterfaceC2266h0 interfaceC2266h0M4743b = C2267h1.m4743b(pw0Var.f18110f);
        if (interfaceC2266h0M4743b != null) {
            try {
                interfaceC2266h0M4743b.zzf(new BinderC2800b(pw0Var.f18110f));
            } catch (RemoteException e) {
                C2096e.m4554C("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}
