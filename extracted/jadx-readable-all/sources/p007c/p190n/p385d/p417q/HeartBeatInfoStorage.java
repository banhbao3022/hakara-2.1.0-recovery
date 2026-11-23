package p007c.p190n.p385d.p417q;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: c.n.d.q.g, reason: use source file name */
/* JADX INFO: compiled from: HeartBeatInfoStorage.java */
/* JADX INFO: loaded from: classes.dex */
public class HeartBeatInfoStorage {

    /* JADX INFO: renamed from: a */
    public static HeartBeatInfoStorage f27040a;

    /* JADX INFO: renamed from: b */
    public static final SimpleDateFormat f27041b = new SimpleDateFormat("dd/MM/yyyy z");

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f27042c;

    public HeartBeatInfoStorage(Context context) {
        this.f27042c = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* JADX INFO: renamed from: a */
    public synchronized boolean m12060a(String str, long j2) {
        if (!this.f27042c.contains(str)) {
            this.f27042c.edit().putLong(str, j2).apply();
            return true;
        }
        Date date = new Date(this.f27042c.getLong(str, -1L));
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f27041b;
        if (!(!simpleDateFormat.format(date).equals(simpleDateFormat.format(date2)))) {
            return false;
        }
        this.f27042c.edit().putLong(str, j2).apply();
        return true;
    }
}
