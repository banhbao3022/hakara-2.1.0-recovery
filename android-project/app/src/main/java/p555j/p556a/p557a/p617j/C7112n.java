package p555j.p556a.p557a.p617j;

import android.content.Context;
import java.util.Objects;
import mtp.media.karaoke.data.local.p627db.AppDatabase;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p553p.Scope2;
import p636z0.p641a0.Room;
import p636z0.p641a0.RoomDatabase;

/* JADX INFO: renamed from: j.a.a.j.n */
/* JADX INFO: compiled from: RepositoryModule.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C7112n extends Lambda implements InterfaceC6168p<Scope2, DefinitionParameters, AppDatabase> {

    /* JADX INFO: renamed from: g */
    public static final C7112n f33042g = new C7112n();

    public C7112n() {
        super(2);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public AppDatabase mo5l(Scope2 scope2, DefinitionParameters definitionParameters) {
        Scope2 scope3 = scope2;
        Intrinsics2.m13089e(scope3, "$receiver");
        Intrinsics2.m13089e(definitionParameters, "it");
        Context context = (Context) scope3.m13863c(Reflection.m13097a(Context.class), null, null);
        Module module = C7130w.f33060a;
        Intrinsics2.m13089e(context, "context");
        RoomDatabase.a aVarM14526a = Room.m14526a(context, AppDatabase.class, "kara_vn_db");
        Objects.requireNonNull(AppDatabase.f33481q);
        aVarM14526a.m14539a(AppDatabase.f33478n, AppDatabase.f33479o, AppDatabase.f33480p);
        RoomDatabase roomDatabaseM14540b = aVarM14526a.m14540b();
        Intrinsics2.m13088d(roomDatabaseM14540b, "Room.databaseBuilder(con…ION_3_4)\n        .build()");
        return (AppDatabase) roomDatabaseM14540b;
    }
}
