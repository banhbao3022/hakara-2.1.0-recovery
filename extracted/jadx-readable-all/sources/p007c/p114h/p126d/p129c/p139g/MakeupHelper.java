package p007c.p114h.p126d.p129c.p139g;

import android.content.Context;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p126d.p129c.p139g.p140i.ResourceData;

/* JADX INFO: renamed from: c.h.d.c.g.b, reason: use source file name */
/* JADX INFO: compiled from: MakeupHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class MakeupHelper extends ResourceBaseHelper {

    /* JADX INFO: renamed from: a */
    public static final List<ResourceData> f4195a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static String m2162c(Context context) {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            return context.getExternalFilesDir("Makeup").getAbsolutePath();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getFilesDir());
        return outline.m1550A(sb, File.separator, "Makeup");
    }
}
