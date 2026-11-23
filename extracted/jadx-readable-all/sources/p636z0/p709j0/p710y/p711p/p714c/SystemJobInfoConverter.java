package p636z0.p709j0.p710y.p711p.p714c;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import p636z0.p709j0.Logger9;

/* JADX INFO: renamed from: z0.j0.y.p.c.a, reason: use source file name */
/* JADX INFO: compiled from: SystemJobInfoConverter.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobInfoConverter {

    /* JADX INFO: renamed from: a */
    public static final String f37436a = Logger9.m15886e("SystemJobInfoConverter");

    /* JADX INFO: renamed from: b */
    public final ComponentName f37437b;

    public SystemJobInfoConverter(Context context) {
        this.f37437b = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
