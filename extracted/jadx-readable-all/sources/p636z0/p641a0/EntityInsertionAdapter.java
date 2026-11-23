package p636z0.p641a0;

import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.a0.k, reason: use source file name */
/* JADX INFO: compiled from: EntityInsertionAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    public EntityInsertionAdapter(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo14040e(SupportSQLiteStatement supportSQLiteStatement, T t);

    /* JADX INFO: renamed from: f */
    public final void m14513f(T t) {
        SupportSQLiteStatement supportSQLiteStatementM14559a = m14559a();
        try {
            mo14040e(supportSQLiteStatementM14559a, t);
            supportSQLiteStatementM14559a.mo15050A0();
            if (supportSQLiteStatementM14559a == this.f34367c) {
                this.f34365a.set(false);
            }
        } catch (Throwable th) {
            m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }
}
