package p636z0.p641a0;

import android.content.Context;

/* JADX INFO: renamed from: z0.a0.p, reason: use source file name */
/* JADX INFO: compiled from: Room.java */
/* JADX INFO: loaded from: classes.dex */
public class Room {
    @Deprecated
    public Room() {
    }

    /* JADX INFO: renamed from: a */
    public static <T extends RoomDatabase> RoomDatabase.a<T> m14526a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new RoomDatabase.a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
