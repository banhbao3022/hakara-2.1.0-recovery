package p636z0.p660c0.p661a.p662g;

import android.database.sqlite.SQLiteProgram;
import p636z0.p660c0.p661a.SupportSQLiteProgram;

/* JADX INFO: renamed from: z0.c0.a.g.d, reason: use source file name */
/* JADX INFO: compiled from: FrameworkSQLiteProgram.java */
/* JADX INFO: loaded from: classes.dex */
public class FrameworkSQLiteProgram implements SupportSQLiteProgram {

    /* JADX INFO: renamed from: f */
    public final SQLiteProgram f35347f;

    public FrameworkSQLiteProgram(SQLiteProgram sQLiteProgram) {
        this.f35347f = sQLiteProgram;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: J */
    public void mo14549J(int i, long j2) {
        this.f35347f.bindLong(i, j2);
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: N */
    public void mo14550N(int i, byte[] bArr) {
        this.f35347f.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f35347f.close();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: d0 */
    public void mo14553d0(int i) {
        this.f35347f.bindNull(i);
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: o */
    public void mo14555o(int i, String str) {
        this.f35347f.bindString(i, str);
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteProgram
    /* JADX INFO: renamed from: v */
    public void mo14556v(int i, double d) {
        this.f35347f.bindDouble(i, d);
    }
}
