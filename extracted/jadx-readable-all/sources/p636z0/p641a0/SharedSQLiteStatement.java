package p636z0.p641a0;

import java.util.concurrent.atomic.AtomicBoolean;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.a0.x, reason: use source file name */
/* JADX INFO: compiled from: SharedSQLiteStatement.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SharedSQLiteStatement {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f34365a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final RoomDatabase f34366b;

    /* JADX INFO: renamed from: c */
    public volatile SupportSQLiteStatement f34367c;

    public SharedSQLiteStatement(RoomDatabase roomDatabase) {
        this.f34366b = roomDatabase;
    }

    /* JADX INFO: renamed from: a */
    public SupportSQLiteStatement m14559a() {
        this.f34366b.m14527a();
        if (!this.f34365a.compareAndSet(false, true)) {
            return m14560b();
        }
        if (this.f34367c == null) {
            this.f34367c = m14560b();
        }
        return this.f34367c;
    }

    /* JADX INFO: renamed from: b */
    public final SupportSQLiteStatement m14560b() {
        String strMo14039c = mo14039c();
        RoomDatabase roomDatabase = this.f34366b;
        roomDatabase.m14527a();
        roomDatabase.m14528b();
        return roomDatabase.f34306d.mo14509e().mo15047r(strMo14039c);
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo14039c();

    /* JADX INFO: renamed from: d */
    public void m14561d(SupportSQLiteStatement supportSQLiteStatement) {
        if (supportSQLiteStatement == this.f34367c) {
            this.f34365a.set(false);
        }
    }
}
