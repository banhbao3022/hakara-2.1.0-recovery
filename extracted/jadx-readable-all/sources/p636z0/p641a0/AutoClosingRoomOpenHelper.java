package p636z0.p641a0;

import java.io.IOException;
import java.util.Objects;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteOpenHelper;

/* JADX INFO: renamed from: z0.a0.c, reason: use source file name */
/* JADX INFO: compiled from: AutoClosingRoomOpenHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {

    /* JADX INFO: renamed from: f */
    public final SupportSQLiteOpenHelper f34229f;

    /* JADX INFO: renamed from: g */
    public final a f34230g;

    /* JADX INFO: renamed from: h */
    public final AutoCloser f34231h;

    /* JADX INFO: renamed from: z0.a0.c$a */
    /* JADX INFO: compiled from: AutoClosingRoomOpenHelper.java */
    public static final class a implements SupportSQLiteDatabase {

        /* JADX INFO: renamed from: f */
        public final AutoCloser f34232f;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw null;
        }
    }

    @Override // p636z0.p641a0.DelegatingOpenHelper
    /* JADX INFO: renamed from: a */
    public SupportSQLiteOpenHelper mo14508a() {
        return this.f34229f;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            this.f34230g.close();
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: e */
    public SupportSQLiteDatabase mo14509e() {
        Objects.requireNonNull(this.f34230g.f34232f);
        throw null;
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    public String getDatabaseName() {
        return this.f34229f.getDatabaseName();
    }

    @Override // p636z0.p660c0.p661a.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.f34229f.setWriteAheadLoggingEnabled(z);
    }
}
