package p636z0.p641a0.p643b0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p636z0.p641a0.RoomDatabase;
import p636z0.p660c0.p661a.SupportSQLiteDatabase;
import p636z0.p660c0.p661a.SupportSQLiteQuery;

/* JADX INFO: renamed from: z0.a0.b0.b, reason: use source file name */
/* JADX INFO: compiled from: DBUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class DBUtil {
    /* JADX INFO: renamed from: a */
    public static void m14502a(SupportSQLiteDatabase supportSQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor cursorMo15040Q = supportSQLiteDatabase.mo15040Q("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (cursorMo15040Q.moveToNext()) {
            try {
                arrayList.add(cursorMo15040Q.getString(0));
            } catch (Throwable th) {
                cursorMo15040Q.close();
                throw th;
            }
        }
        cursorMo15040Q.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                supportSQLiteDatabase.mo15045n("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static Cursor m14503b(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, boolean z, CancellationSignal cancellationSignal) {
        Cursor cursorM14536m = roomDatabase.m14536m(supportSQLiteQuery, null);
        if (z && (cursorM14536m instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) cursorM14536m;
            int count = abstractWindowedCursor.getCount();
            int numRows = abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count;
            if (Build.VERSION.SDK_INT < 23 || numRows < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i = 0; i < abstractWindowedCursor.getColumnCount(); i++) {
                            int type = abstractWindowedCursor.getType(i);
                            if (type == 0) {
                                objArr[i] = null;
                            } else if (type == 1) {
                                objArr[i] = Long.valueOf(abstractWindowedCursor.getLong(i));
                            } else if (type == 2) {
                                objArr[i] = Double.valueOf(abstractWindowedCursor.getDouble(i));
                            } else if (type == 3) {
                                objArr[i] = abstractWindowedCursor.getString(i);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i] = abstractWindowedCursor.getBlob(i);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    abstractWindowedCursor.close();
                    return matrixCursor;
                } catch (Throwable th) {
                    abstractWindowedCursor.close();
                    throw th;
                }
            }
        }
        return cursorM14536m;
    }

    /* JADX INFO: renamed from: c */
    public static int m14504c(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(byteBufferAllocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            byteBufferAllocate.rewind();
            int i = byteBufferAllocate.getInt();
            channel.close();
            return i;
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
