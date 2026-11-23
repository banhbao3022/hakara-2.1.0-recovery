package p636z0.p660c0.p661a.p662g;

import android.database.sqlite.SQLiteStatement;
import p636z0.p660c0.p661a.SupportSQLiteStatement;

/* JADX INFO: renamed from: z0.c0.a.g.e, reason: use source file name */
/* JADX INFO: compiled from: FrameworkSQLiteStatement.java */
/* JADX INFO: loaded from: classes.dex */
public class FrameworkSQLiteStatement extends FrameworkSQLiteProgram implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: g */
    public final SQLiteStatement f35348g;

    public FrameworkSQLiteStatement(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f35348g = sQLiteStatement;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteStatement
    /* JADX INFO: renamed from: A0 */
    public long mo15050A0() {
        return this.f35348g.executeInsert();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteStatement
    /* JADX INFO: renamed from: q */
    public int mo15051q() {
        return this.f35348g.executeUpdateDelete();
    }
}
